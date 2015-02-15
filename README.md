# log4j2-demo-app
Demo app for showing Log4J 2 features including the logstash GELF appender.

Note: To receive log messages in Graylog2 you have to add an input (System -> Inputs),          Settings: GELF UDP, port: 12201, bind address: 0.0.0.0

Change Graylog server settings in `log4j2.xml`. 

    <GELF name="gelfAppender" server="192.168.2.37" port="12201" hostName="NLWGM1793" protocol="UDP" additionalFields="{'environment': 'DEV', 'application': 'MyAPP'}" />

Change server and port to your needs. The hostname is the source in Graylog2.