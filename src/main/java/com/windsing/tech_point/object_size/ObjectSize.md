# 对象大小
* ![img.png](img.png)
* 说明：其中ref表示引用类型，引用类型实际上是一个地址指针，32bit机器上，占用4字节，64bit机器上，在jdk1.6之后，如果开启了指针压缩(默认开启: -XX:UseCompressedOops，仅支持64位机器)，则占用4字节