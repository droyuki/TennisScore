

for filename in $*
do
  if [[ -f $filename ]]; then
    outname=${filename/.json.gz/.json}
    baseoutname=$(basename "$outname")
    datestr=${baseoutname:7:10} 

    echo "send topic $filename"
    zcat $filename | ./delayCat.py | ~/Projects/tools/kafka/bin/kafka-console-producer.sh --broker-list localhost:9092 --topic ad.raw

    #echo "sleep 5min"
    #sleep 5m
    echo "checking ad.profile.hour status"
    lastLine=$(tail -1 ~/Projects/Holmes/dev66/user/ashlie_lin/ADAuthKafka/profile.hour.log)
    while [ "$lastLine" != "no record" ]
    do
       echo $lastLine
       echo "wait for ad.profile.hour complete, sleep 1min"
       sleep 1m 
       lastLine=$(tail -1 ~/Projects/Holmes/dev66/user/ashlie_lin/ADAuthKafka/profile.hour.log)
    done
    echo "sleep 10min"
    sleep 10m
    echo "compute ad profile day $datestr"
    vagrant ssh spark -c "cd /opt/dev66/user/ashlie_lin/ADAuthKafka/;./genericRun.sh com.trend.spn.holmes.ADProfileConsumerOffset holmes-kafka.spn.tw.trendnet.org:9092 ./ ad.profile.hour $datestr 2> cc"
    echo "gzip daily hist $datestr"
    gzip /home/ashlie_lin/Projects/Holmes/dev66/user/ashlie_lin/ADAuthKafka/output/ADProfileHist_day_$datestr.json
    echo "check count $datestr"
    ./checkCount.py $datestr
  fi
done
