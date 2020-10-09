# ReadWriteHDFSExample
To build:
```
$ mvn clean install
```

Create a sample file in dtap. For e.g.
```
$ echo "Hello Dtap" > read_write_hdfs_example.txt
```

Copy the file to TenantStorage:
```
$ hadoop fs -put read_write_hdfs_example.txt dtap://TenantStorage
```

In the sample program, above file is read from dtap.

To run, login to a notebook. Locate Dtap jar in /opt/bluedata/bluedata-dtap-3.0.1.jar. 
```
$java -cp /opt/bluedata/bluedata-dtap-3.0.1.jar:`hadoop classpath`:./ReadWriteHDFSExample.jar com.javadeveloperzone.ReadWriteHDFSExample
2020-10-08 17:30:31,854 WARN util.NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Hello Dtap
```


