# log4j2-demo-app
Demo app for showing Log4J 2 features including the logstash GELF appender.

Note: To receive log messages in Graylog2 you have to add an input (System -> Inputs),          Settings: GELF UDP, port: 12201, bind address: 0.0.0.0

Change Graylog server settings in `log4j2.xml`. 

    <GELF name="gelfAppender" server="192.168.56.100" port="12201" hostName="myhost" protocol="UDP" additionalFields="{'environment': 'DEV', 'application': 'MyAPP'}" />

Change server and port to your needs. The hostname is the source in Graylog2.

To get a quick setup on using Graylog2 you can use the vagrant box [https://github.com/fred4jupiter/graylog2-in-a-box](https://github.com/fred4jupiter/graylog2-in-a-box "graylog2-in-a-box")

