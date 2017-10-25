Two constructors for `java.util.Date` class:
* `Date()`: This constructor initializes the object with the current date and time.
* `Date(long millisec)`:
This constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970.

[Why are dates calculated from January 1st, 1970?](https://stackoverflow.com/questions/2533563/why-are-dates-calculated-from-january-1st-1970)

---

**Date Formatting Using SimpleDateFormat**

```
Date dNow = new Date( );
SimpleDateFormat ft = new SimpleDateFormat
                      ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

System.out.println("Current Date: " + ft.format(dNow));
```

Output: `Current Date: Sun 2004.07.18 at 04:14:09 PM PDT`.

[Read more](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)

---

**Date Formatting Using printf**

[Read more](https://www.tutorialspoint.com/java/java_date_time.htm)

---

`System.out.println(String)`: behaves like `cout`.

`System.out.printf(String format, Object args)`: behaves like `printf`.

---

**Parsing Strings into Dates**

```
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

String input = "1995-05-22";

Date d = sdf.parse(input);
```

---

`Thread.sleep(milliseconds)`

---

```
long start = System.currentTimeMillis();
long end = System.currentTimeMillis();
long diff = end - start;
```
