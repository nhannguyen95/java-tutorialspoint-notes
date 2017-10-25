A stream can be defined as a sequence of data. There are two kinds of Streams:

* **InPutStream** − The InputStream is used to read data from a source.

* **OutPutStream** − The OutputStream is used for writing data to a destination.

---

**Byte Streams**

Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, `FileInputStream` and `FileOutputStream`.

Code: ByteStream.java

---

**Character Streams**

Java Byte streams are used to perform input and output of 8-bit bytes, whereas Java Character streams are used to perform input and output for 16-bit unicode.

Though there are many classes related to character streams but the most frequently used classes are, `FileReader` and `FileWriter`.

Though internally `FileReader` uses `FileInputStream` and `FileWriter` uses `FileOutputStream` but here the major difference is that `FileReader` reads two bytes at a time and `FileWriter` writes two bytes at a time.

Code: CharacterStream.java

---

**Standard Streams**

If you are aware of C or C++ programming languages, then you must be aware of three standard devices STDIN, STDOUT and STDERR. Similarly, Java provides the following three standard streams:
* **Standard Input** − This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as `System.in`.

* **Standard Output** − This is used to output the data produced by the user's program and usually a computer screen is used for standard output stream and represented as `System.out`.

* **Standard Error** − This is used to output the error data produced by the user's program and usually a computer screen is used for standard error stream and represented as `System.err`.

Code: ReadConsole.java

---

**FileInputStream**

This stream is used for reading data from the files.

```
InputStream in = new FileInputStream("input.txt");
```

or

```
File f = new File("input.txt");
InputStream in = new FileInputStream(f);
```

**FileOutputStream**

FileOutputStream is used to create a file and write data into it. The stream would create a file, if it doesn't already exist, before opening it for output.

```
OutputStream out = new FileOutputStream("output.txt")
```

or

```
File f = new File("output.txt");
OutputStream out = new FileOutputStream(f);
```

Code: FileStream.java

---

**Creating Directories**

There are two useful `File` utility methods, which can be used to create directories −

* The `mkdir`( ) method creates a directory, returning true on success and false on failure. Failure indicates that the path specified in the File object already exists, or that the directory cannot be created because the entire path does not exist yet.

* The `mkdirs`() method creates both a directory and all the parents of the directory.

```
File f = new File("/tmp/user/java/bin");
f.mkdirs();
```

**Listing Directories**

You can use `list`( ) method provided by `File` object to list down all the files and directories available in a directory as follows:

```
String[] paths = f.list();
for(String path : paths) {
  // filename and directory name
  System.out.println(path);
}
```
