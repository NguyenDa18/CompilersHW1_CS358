package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 167; }
public int getNttSym() { return 168; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"`:",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"\"b\"",
"\"o\"",
"\"l\"",
"\"e\"",
"\"a\"",
"\"n\"",
"idChar",
"reserved",
"\"r\"",
"\"k\"",
"\"c\"",
"\"s\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"f\"",
"\"i\"",
"\"w\"",
"\"u\"",
"\"p\"",
"\"h\"",
"\"v\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"*\"",
"\"/\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\":\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"}\"",
"\"|\"",
"\"0\"",
"{\"1\"..\"9\"}",
"\"X\"",
"intLit2",
"`x",
"digit++",
"digit",
"\"\'\"",
"printable",
"\'\"\'",
"printable++",
"letter",
"\"_\"",
"{\"A\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"ws",
"9",
"eol",
"printable**",
"commentContent*",
"commentContent",
"10",
"13",
"idChar**",
"$$1",
"token*",
"printable*",
"printable+",
"digit+",
"idChar*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 169;}
private static final int MIN_REDUCTION = 1561;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|893, // match move
0x80000000|1013, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1
  }
,
{ // state 2
-1, // $$start
-1, // start
146, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+144, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+144, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+144, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+144, // "u"
1401, // "p"
MIN_REDUCTION+144, // "h"
452, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
772, // "g"
MIN_REDUCTION+144, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+144, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+144, // $
MIN_REDUCTION+144, // $NT
  }
,
{ // state 3
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+203, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 4
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 5
2,959, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 6
0x80000000|509, // match move
0x80000000|1367, // no-match move
0x80000000|784, // NT-test-match state for digit
  }
,
{ // state 7
2,1127, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 9
109,1483, // "h"
  }
,
{ // state 10
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 11
152,1183, // ws
154,990, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 12
0x80000000|930, // match move
0x80000000|1305, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 13
-1, // $$start
-1, // start
1385, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+228, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+228, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+228, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+228, // "u"
1401, // "p"
MIN_REDUCTION+228, // "h"
452, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
772, // "g"
MIN_REDUCTION+228, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+228, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 14
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 15
168,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 16
100,975, // "s"
  }
,
{ // state 17
168,MIN_REDUCTION+145, // $NT
  }
,
{ // state 18
2,1282, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 19
123,643, // "+"
  }
,
{ // state 20
2,319, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 21
105,1526, // "i"
  }
,
{ // state 22
90,917, // "o"
  }
,
{ // state 23
0x80000000|45, // match move
0x80000000|750, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 24
0x80000000|1210, // match move
0x80000000|967, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 25
168,MIN_REDUCTION+136, // $NT
  }
,
{ // state 26
0x80000000|1463, // match move
0x80000000|1061, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 27
168,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 28
152,1183, // ws
154,990, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 29
152,1183, // ws
154,990, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 30
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+197, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 31
0x80000000|1279, // match move
0x80000000|1141, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 32
152,1183, // ws
154,990, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 33
2,1322, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 34
0x80000000|103, // match move
0x80000000|1280, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 35
100,280, // "s"
102,660, // "t"
  }
,
{ // state 36
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 37
109,1403, // "h"
  }
,
{ // state 38
105,1375, // "i"
  }
,
{ // state 39
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+116, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 40
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|93, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 42
0x80000000|1164, // match move
0x80000000|113, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 43
2,926, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 44
102,743, // "t"
  }
,
{ // state 45
2,944, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 46
152,1183, // ws
154,990, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 47
102,561, // "t"
  }
,
{ // state 48
152,1183, // ws
154,990, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 49
152,1183, // ws
154,990, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 50
0x80000000|302, // match move
0x80000000|634, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 51
0x80000000|156, // match move
0x80000000|315, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 52
0x80000000|1073, // match move
0x80000000|520, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 53
0x80000000|1296, // match move
0x80000000|139, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 54
168,MIN_REDUCTION+229, // $NT
  }
,
{ // state 55
0x80000000|1436, // match move
0x80000000|204, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 56
-1, // $$start
-1, // start
1058, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+201, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+201, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+201, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+201, // "u"
1401, // "p"
MIN_REDUCTION+201, // "h"
452, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
772, // "g"
MIN_REDUCTION+201, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+201, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 57
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+119, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 58
0x80000000|247, // match move
0x80000000|186, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 59
168,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 60
152,1183, // ws
154,990, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 61
100,191, // "s"
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 63
102,1405, // "t"
  }
,
{ // state 64
152,1183, // ws
154,990, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 65
168,MIN_REDUCTION+208, // $NT
  }
,
{ // state 66
0x80000000|5, // match move
0x80000000|1447, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 67
91,1195, // "l"
105,1462, // "i"
  }
,
{ // state 68
0x80000000|231, // match move
0x80000000|1048, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 69
0x80000000|823, // match move
0x80000000|1510, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 70
0x80000000|1349, // match move
0x80000000|807, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 71
0x80000000|1004, // match move
0x80000000|349, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 72
-1, // $$start
-1, // start
1070, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+251, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 73
0x80000000|1518, // match move
0x80000000|765, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 74
4,202, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
  }
,
{ // state 75
-1, // $$start
-1, // start
519, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+111, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+111, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+111, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+111, // "u"
1401, // "p"
MIN_REDUCTION+111, // "h"
452, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
772, // "g"
MIN_REDUCTION+111, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+111, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 76
2,746, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 78
0x80000000|1474, // match move
0x80000000|851, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 79
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 80
0x80000000|1147, // match move
0x80000000|1380, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 81
2,929, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 82
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+221, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 83
0x80000000|338, // match move
0x80000000|1206, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 84
92,1063, // "e"
  }
,
{ // state 85
168,MIN_REDUCTION+205, // $NT
  }
,
{ // state 86
90,922, // "o"
105,413, // "i"
  }
,
{ // state 87
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 88
168,MIN_REDUCTION+223, // $NT
  }
,
{ // state 89
168,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 90
94,857, // "n"
  }
,
{ // state 91
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 92
2,1293, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 93
0x80000000|1325, // match move
0x80000000|1481, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 94
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 95
105,1074, // "i"
  }
,
{ // state 96
0x80000000|136, // match move
0x80000000|289, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 97
90,270, // "o"
  }
,
{ // state 98
94,1060, // "n"
  }
,
{ // state 99
0x80000000|837, // match move
0x80000000|902, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 100
0x80000000|1245, // match move
0x80000000|937, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 101
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+135, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+135, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+135, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+135, // "u"
1401, // "p"
MIN_REDUCTION+135, // "h"
452, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
772, // "g"
MIN_REDUCTION+135, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+135, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 102
93,575, // "a"
  }
,
{ // state 103
152,1183, // ws
154,990, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 104
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+158, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 105
152,1183, // ws
154,990, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 107
152,1183, // ws
154,990, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 108
99,834, // "c"
  }
,
{ // state 109
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+254, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 110
93,948, // "a"
  }
,
{ // state 111
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 112
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+239, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 113
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+357, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+357, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+357, // $
-1, // $NT
  }
,
{ // state 114
0x80000000|236, // match move
0x80000000|737, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 115
100,1387, // "s"
  }
,
{ // state 116
0x80000000|682, // match move
0x80000000|160, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 117
108,839, // "p"
  }
,
{ // state 118
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 119
-1, // $$start
431, // start
31, // ws*
1033, // $$0
441, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
-1, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
619, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 120
0x80000000|503, // match move
0x80000000|821, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 121
0x80000000|860, // match move
0x80000000|868, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 122
2,700, // ws*
152,1461, // ws
154,990, // eol
160,1166, // idChar**
161,1420, // $$1
166,1225, // idChar*
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 123
152,1183, // ws
154,990, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 125
168,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 128
0x80000000|375, // match move
0x80000000|626, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 129
152,1183, // ws
154,990, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 130
143,526, // "'"
  }
,
{ // state 131
2,1175, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 133
0x80000000|1119, // match move
0x80000000|434, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 134
152,1183, // ws
154,990, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 135
152,1183, // ws
154,990, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 136
2,1333, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 138
0x80000000|1452, // match move
0x80000000|887, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 139
0x80000000|1198, // match move
0x80000000|181, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 140
152,1183, // ws
154,990, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 141
121,1290, // "*"
154,8, // eol
156,1418, // commentContent*
157,907, // commentContent
  }
,
{ // state 142
152,1183, // ws
154,990, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 143
98,1513, // "k"
  }
,
{ // state 144
2,804, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 145
2,921, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 146
0x80000000|758, // match move
0x80000000|34, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 147
0x80000000|924, // match move
0x80000000|1196, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 148
1,431, // start
2,31, // ws*
3,1033, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
89,1409, // "b"
91,1484, // "l"
92,1001, // "e"
93,1558, // "a"
94,1512, // "n"
97,961, // "r"
99,489, // "c"
100,1472, // "s"
102,1492, // "t"
103,377, // "d"
104,208, // "f"
105,1423, // "i"
106,37, // "w"
108,1401, // "p"
110,452, // "v"
113,772, // "g"
162,619, // token*
167,MIN_REDUCTION+1, // $
  }
,
{ // state 149
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+95, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 150
152,1183, // ws
154,990, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 151
0x80000000|1161, // match move
0x80000000|1055, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 152
0x80000000|1026, // match move
0x80000000|901, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 153
0x80000000|312, // match move
0x80000000|493, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 154
-1, // $$start
-1, // start
926, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+255, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 155
0x80000000|779, // match move
0x80000000|1399, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 156
152,1183, // ws
154,990, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 158
152,1183, // ws
154,990, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 159
0x80000000|1012, // match move
0x80000000|745, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 160
-1, // $$start
-1, // start
50, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+222, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+222, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+222, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+222, // "u"
1401, // "p"
MIN_REDUCTION+222, // "h"
452, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
772, // "g"
MIN_REDUCTION+222, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+222, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 161
168,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 162
0x80000000|20, // match move
0x80000000|1547, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 163
152,1183, // ws
154,990, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 164
2,1248, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 165
152,1183, // ws
154,990, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 166
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+300, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+300, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 167
-1, // $$start
-1, // start
1248, // ws*
-1, // $$0
MIN_REDUCTION+301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+301, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 168
152,1183, // ws
154,990, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 169
94,799, // "n"
  }
,
{ // state 170
94,818, // "n"
  }
,
{ // state 171
168,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 172
3,695, // $$0
4,441, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
62,659, // `*
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
121,620, // "*"
139,986, // intLit2
141,1312, // digit++
142,787, // digit
147,495, // letter
152,1183, // ws
154,990, // eol
162,619, // token*
165,6, // digit+
  }
,
{ // state 173
0x80000000|714, // match move
0x80000000|30, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 174
2,700, // ws*
152,1461, // ws
154,990, // eol
161,1005, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 175
168,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 176
0x80000000|164, // match move
0x80000000|317, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 177
152,1183, // ws
154,990, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 178
168,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 179
168,MIN_REDUCTION+181, // $NT
  }
,
{ // state 180
2,891, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 181
0x80000000|625, // match move
0x80000000|355, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 182
0x80000000|178, // match move
0x80000000|1332, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 183
0x80000000|814, // match move
0x80000000|925, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 184
0x80000000|1084, // match move
0x80000000|815, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 185
152,1183, // ws
154,990, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 186
0x80000000|1223, // match move
0x80000000|1536, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 187
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 188
0x80000000|1140, // match move
0x80000000|852, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 189
152,1183, // ws
154,990, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 190
0x80000000|213, // match move
0x80000000|1343, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 192
0x80000000|806, // match move
0x80000000|949, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 193
0x80000000|774, // match move
0x80000000|981, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 194
0x80000000|475, // match move
0x80000000|849, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 195
168,MIN_REDUCTION+187, // $NT
  }
,
{ // state 196
168,MIN_REDUCTION+163, // $NT
  }
,
{ // state 197
168,MIN_REDUCTION+312, // $NT
  }
,
{ // state 198
0x80000000|1330, // match move
0x80000000|553, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 199
0x80000000|1226, // match move
0x80000000|988, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 200
98,824, // "k"
  }
,
{ // state 201
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 203
-1, // $$start
-1, // start
1293, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+153, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+153, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+153, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+153, // "u"
1401, // "p"
MIN_REDUCTION+153, // "h"
452, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
772, // "g"
MIN_REDUCTION+153, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+153, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 204
0x80000000|140, // match move
0x80000000|285, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 205
110,762, // "v"
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 207
102,656, // "t"
  }
,
{ // state 208
90,1052, // "o"
91,233, // "l"
93,586, // "a"
105,1071, // "i"
  }
,
{ // state 209
152,1183, // ws
154,990, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 211
102,782, // "t"
  }
,
{ // state 212
0x80000000|1413, // match move
0x80000000|792, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 213
3,695, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
89,1409, // "b"
91,1484, // "l"
92,1001, // "e"
93,1558, // "a"
94,1512, // "n"
97,961, // "r"
99,489, // "c"
100,1472, // "s"
102,1492, // "t"
103,377, // "d"
104,208, // "f"
105,1423, // "i"
106,37, // "w"
108,1401, // "p"
110,452, // "v"
113,772, // "g"
162,619, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 214
0x80000000|557, // match move
0x80000000|832, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 215
2,916, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 216
0x80000000|549, // match move
0x80000000|811, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 217
152,1183, // ws
154,990, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 218
168,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 219
92,1129, // "e"
  }
,
{ // state 220
0x80000000|1172, // match move
0x80000000|564, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 221
152,1183, // ws
154,990, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 222
0x80000000|905, // match move
0x80000000|464, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 223
152,1183, // ws
154,990, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 224
102,783, // "t"
  }
,
{ // state 225
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+98, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 226
0x80000000|760, // match move
0x80000000|479, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 227
-1, // $$start
-1, // start
583, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
MIN_REDUCTION+289, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+289, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 228
168,MIN_REDUCTION+199, // $NT
  }
,
{ // state 229
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 230
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+230, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 231
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 232
2,1058, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 233
90,385, // "o"
  }
,
{ // state 234
-1, // $$start
-1, // start
1539, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+162, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+162, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+162, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+162, // "u"
1401, // "p"
MIN_REDUCTION+162, // "h"
452, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
772, // "g"
MIN_REDUCTION+162, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+162, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
  }
,
{ // state 235
2,804, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 236
2,796, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 237
0x80000000|1541, // match move
0x80000000|997, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 238
152,1183, // ws
154,990, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 239
-1, // $$start
-1, // start
1358, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+132, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+132, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+132, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+132, // "u"
1401, // "p"
MIN_REDUCTION+132, // "h"
452, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
772, // "g"
MIN_REDUCTION+132, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+132, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 240
118,521, // "&"
  }
,
{ // state 241
2,1385, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 242
0x80000000|909, // match move
0x80000000|999, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 243
0x80000000|365, // match move
0x80000000|1271, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 244
-1, // $$start
-1, // start
398, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+141, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+141, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+141, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+141, // "u"
1401, // "p"
MIN_REDUCTION+141, // "h"
452, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
772, // "g"
MIN_REDUCTION+141, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+141, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 245
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 246
0x80000000|1411, // match move
0x80000000|153, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 247
2,496, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 248
0x80000000|473, // match move
0x80000000|1390, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 249
152,1183, // ws
154,990, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 250
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+200, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 251
0x80000000|298, // match move
0x80000000|718, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 252
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 253
168,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 254
152,1183, // ws
154,990, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 255
2,1248, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 256
107,448, // "u"
  }
,
{ // state 257
152,1183, // ws
154,990, // eol
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 258
2,1081, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 260
0x80000000|1371, // match move
0x80000000|1176, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 261
0x80000000|437, // match move
0x80000000|239, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 262
0x80000000|422, // match move
0x80000000|1544, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 263
152,1183, // ws
154,990, // eol
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 264
152,1183, // ws
154,990, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 265
-1, // $$start
-1, // start
1282, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+123, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+123, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+123, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+123, // "u"
1401, // "p"
MIN_REDUCTION+123, // "h"
452, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
772, // "g"
MIN_REDUCTION+123, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+123, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 266
-1, // $$start
-1, // start
891, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+126, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+126, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+126, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+126, // "u"
1401, // "p"
MIN_REDUCTION+126, // "h"
452, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
772, // "g"
MIN_REDUCTION+126, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+126, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 267
0x80000000|1115, // match move
0x80000000|805, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 268
168,MIN_REDUCTION+148, // $NT
  }
,
{ // state 269
152,1183, // ws
154,990, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 270
106,567, // "w"
  }
,
{ // state 271
0x80000000|1227, // match move
0x80000000|533, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 272
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+266, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 273
-1, // $$start
-1, // start
52, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+210, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+210, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+210, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+210, // "u"
1401, // "p"
MIN_REDUCTION+210, // "h"
452, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
772, // "g"
MIN_REDUCTION+210, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+210, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 274
92,41, // "e"
  }
,
{ // state 275
99,841, // "c"
  }
,
{ // state 276
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+122, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 277
0x80000000|606, // match move
0x80000000|1212, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 278
1,431, // start
2,31, // ws*
3,1033, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
162,619, // token*
  }
,
{ // state 279
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 280
102,1353, // "t"
  }
,
{ // state 281
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+256, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 282
0x80000000|259, // match move
0x80000000|272, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 283
152,1183, // ws
154,990, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 284
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+294, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 285
0x80000000|1049, // match move
0x80000000|328, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 286
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 287
93,934, // "a"
  }
,
{ // state 288
2,926, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 289
0x80000000|343, // match move
0x80000000|83, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 291
92,499, // "e"
  }
,
{ // state 292
0x80000000|401, // match move
0x80000000|1035, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 293
168,MIN_REDUCTION+214, // $NT
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 295
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+264, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 296
0x80000000|48, // match move
0x80000000|1383, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 297
92,1217, // "e"
  }
,
{ // state 298
152,1183, // ws
154,990, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 299
0x80000000|229, // match move
0x80000000|284, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 300
152,1183, // ws
154,990, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 301
168,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 302
152,1183, // ws
154,990, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 303
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+125, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 304
168,MIN_REDUCTION+241, // $NT
  }
,
{ // state 305
0x80000000|963, // match move
0x80000000|923, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 306
0x80000000|87, // match move
0x80000000|1053, // no-match move
0x80000000|784, // NT-test-match state for digit
  }
,
{ // state 307
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+286, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 308
0x80000000|597, // match move
0x80000000|387, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 309
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 310
168,MIN_REDUCTION+94, // $NT
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|1191, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 312
2,469, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 313
168,MIN_REDUCTION+217, // $NT
  }
,
{ // state 314
4,202, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
62,659, // `*
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
121,620, // "*"
139,986, // intLit2
141,1312, // digit++
142,787, // digit
147,495, // letter
165,6, // digit+
  }
,
{ // state 315
0x80000000|254, // match move
0x80000000|173, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 316
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 317
0x80000000|470, // match move
0x80000000|167, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 318
2,843, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 319
0x80000000|1396, // match move
0x80000000|1211, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 320
0x80000000|952, // match move
0x80000000|1362, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 321
0x80000000|734, // match move
0x80000000|698, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 322
-1, // $$start
-1, // start
921, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+189, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+189, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+189, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+189, // "u"
1401, // "p"
MIN_REDUCTION+189, // "h"
452, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
772, // "g"
MIN_REDUCTION+189, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+189, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 323
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 324
2,529, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 325
93,1015, // "a"
  }
,
{ // state 326
2,916, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 327
1,431, // start
2,31, // ws*
3,1033, // $$0
4,441, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
83,884, // `/
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
136,1441, // "0"
147,495, // letter
152,1461, // ws
154,990, // eol
162,619, // token*
  }
,
{ // state 328
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+134, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 329
92,935, // "e"
  }
,
{ // state 330
0x80000000|1221, // match move
0x80000000|372, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 331
2,843, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 332
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 333
168,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 334
122,450, // "/"
  }
,
{ // state 335
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+146, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 336
168,MIN_REDUCTION+151, // $NT
  }
,
{ // state 337
91,530, // "l"
  }
,
{ // state 338
2,1333, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 339
102,14, // "t"
  }
,
{ // state 340
92,1334, // "e"
  }
,
{ // state 341
0x80000000|719, // match move
0x80000000|1173, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 342
0x80000000|1068, // match move
0x80000000|691, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 343
2,1333, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 344
100,1335, // "s"
  }
,
{ // state 345
2,407, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 346
152,1183, // ws
154,990, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 347
152,1183, // ws
154,990, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 348
168,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 350
168,MIN_REDUCTION+318, // $NT
  }
,
{ // state 351
99,888, // "c"
  }
,
{ // state 352
2,647, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 353
2,959, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 354
168,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 355
-1, // $$start
-1, // start
212, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
-1, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
-1, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+263, // "*"
680, // "/"
MIN_REDUCTION+263, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|305, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 357
152,1183, // ws
154,990, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 358
0x80000000|540, // match move
0x80000000|1002, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 359
0x80000000|255, // match move
0x80000000|176, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 360
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 361
89,1315, // "b"
90,1315, // "o"
91,1315, // "l"
92,1315, // "e"
93,1315, // "a"
94,1315, // "n"
97,1315, // "r"
98,1315, // "k"
99,1315, // "c"
100,1315, // "s"
101,1315, // "x"
102,1315, // "t"
103,1315, // "d"
104,1315, // "f"
105,1315, // "i"
106,1315, // "w"
107,1315, // "u"
108,1315, // "p"
109,1315, // "h"
110,1315, // "v"
111,1315, // "y"
112,1315, // "m"
113,1315, // "g"
114,1315, // "z"
115,1315, // "!"
116,1315, // "="
117,1315, // "%"
118,1315, // "&"
119,1315, // "("
120,1315, // ")"
121,1315, // "*"
122,1315, // "/"
123,1315, // "+"
124,1315, // ","
125,1315, // "-"
126,1315, // "."
127,1315, // ":"
128,1315, // ";"
129,1315, // "<"
130,1315, // ">"
131,1315, // "["
132,1315, // "]"
133,1315, // "{"
134,1315, // "}"
135,1315, // "|"
136,1315, // "0"
137,1315, // {"1".."9"}
138,1315, // "X"
143,1315, // "'"
145,1315, // '"'
148,1315, // "_"
149,1315, // {"A".."W" "Y".."Z" "j" "q"}
150,1315, // " "
151,1315, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 362
0x80000000|603, // match move
0x80000000|410, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 363
103,1057, // "d"
  }
,
{ // state 364
152,1183, // ws
154,990, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 365
2,378, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 366
0x80000000|395, // match move
0x80000000|665, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 367
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 369
0x80000000|487, // match move
0x80000000|1307, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 370
152,1183, // ws
154,990, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 371
152,1183, // ws
154,990, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 372
0x80000000|468, // match move
0x80000000|946, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 373
-1, // $$start
-1, // start
1127, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+120, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+120, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+120, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+120, // "u"
1401, // "p"
MIN_REDUCTION+120, // "h"
452, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
772, // "g"
MIN_REDUCTION+120, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+120, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 374
97,927, // "r"
  }
,
{ // state 375
2,1244, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 376
0x80000000|866, // match move
0x80000000|498, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 377
90,789, // "o"
92,876, // "e"
  }
,
{ // state 378
0x80000000|1494, // match move
0x80000000|1208, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 379
152,1183, // ws
154,990, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 380
152,1183, // ws
154,990, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 381
2,1521, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 382
168,MIN_REDUCTION+100, // $NT
  }
,
{ // state 383
99,775, // "c"
  }
,
{ // state 384
0x80000000|185, // match move
0x80000000|705, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 385
93,1378, // "a"
  }
,
{ // state 386
0x80000000|326, // match move
0x80000000|439, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 387
0x80000000|1213, // match move
0x80000000|276, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 388
168,MIN_REDUCTION+202, // $NT
  }
,
{ // state 389
2,407, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 390
92,363, // "e"
  }
,
{ // state 391
105,1377, // "i"
  }
,
{ // state 392
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 393
2,216, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 395
152,1183, // ws
154,990, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 396
152,1183, // ws
154,990, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 398
0x80000000|300, // match move
0x80000000|678, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 399
0x80000000|263, // match move
0x80000000|42, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 400
108,1120, // "p"
  }
,
{ // state 401
168,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 402
0x80000000|723, // match move
0x80000000|1009, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 403
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 404
168,MIN_REDUCTION+91, // $NT
  }
,
{ // state 405
100,755, // "s"
  }
,
{ // state 406
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+270, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 407
0x80000000|1241, // match move
0x80000000|1357, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 408
1,431, // start
2,31, // ws*
3,1033, // $$0
4,441, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
62,659, // `*
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
121,620, // "*"
139,986, // intLit2
141,1312, // digit++
142,787, // digit
147,495, // letter
152,1461, // ws
154,990, // eol
162,619, // token*
165,6, // digit+
  }
,
{ // state 409
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+170, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 410
0x80000000|1482, // match move
0x80000000|292, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 411
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+242, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 412
2,929, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 413
110,943, // "v"
  }
,
{ // state 414
0x80000000|175, // match move
0x80000000|1301, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 415
152,1183, // ws
154,990, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 416
168,MIN_REDUCTION+226, // $NT
  }
,
{ // state 417
152,1183, // ws
154,990, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 418
125,1493, // "-"
  }
,
{ // state 419
0x80000000|161, // match move
0x80000000|1316, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 420
152,1183, // ws
154,990, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 421
94,35, // "n"
  }
,
{ // state 422
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 423
2,1322, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 424
-1, // $$start
-1, // start
497, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+259, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 425
-1, // $$start
-1, // start
1303, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+277, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 426
0x80000000|331, // match move
0x80000000|1430, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 427
2,1244, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 428
168,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 429
0x80000000|637, // match move
0x80000000|1495, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 430
0x80000000|1007, // match move
0x80000000|753, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 431
167,MIN_REDUCTION+0, // $
  }
,
{ // state 432
93,98, // "a"
107,84, // "u"
111,1381, // "y"
  }
,
{ // state 433
0x80000000|168, // match move
0x80000000|707, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 434
0x80000000|397, // match move
0x80000000|1470, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 435
0x80000000|189, // match move
0x80000000|100, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 436
0x80000000|494, // match move
0x80000000|711, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 437
2,1358, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 438
2,1112, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 439
-1, // $$start
-1, // start
916, // ws*
-1, // $$0
MIN_REDUCTION+303, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
-1, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+303, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
MIN_REDUCTION+303, // "0"
MIN_REDUCTION+303, // {"1".."9"}
99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 440
2,1079, // ws*
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 442
102,1023, // "t"
  }
,
{ // state 443
152,1183, // ws
154,990, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 444
0x80000000|985, // match move
0x80000000|82, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 445
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 446
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+191, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 447
91,274, // "l"
  }
,
{ // state 448
112,574, // "m"
  }
,
{ // state 449
168,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 450
168,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 451
0x80000000|1545, // match move
0x80000000|262, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 452
90,67, // "o"
  }
,
{ // state 453
168,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 454
152,1183, // ws
154,990, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 455
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 456
0x80000000|1556, // match move
0x80000000|73, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 457
-1, // $$start
-1, // start
1135, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+171, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+171, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+171, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+171, // "u"
1401, // "p"
MIN_REDUCTION+171, // "h"
452, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
772, // "g"
MIN_REDUCTION+171, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+171, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 458
152,1183, // ws
154,990, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 459
5,404, // `boolean
6,1389, // `class
7,1143, // `extends
8,17, // `void
9,1010, // `int
10,268, // `while
11,708, // `if
12,382, // `else
13,1427, // `for
14,310, // `break
15,1459, // `this
16,1224, // `false
17,1341, // `true
18,1490, // `super
19,1369, // `null
20,1043, // `return
21,931, // `instanceof
22,1153, // `new
23,336, // `abstract
24,1496, // `assert
25,661, // `byte
26,1131, // `case
27,196, // `catch
28,1123, // `char
29,508, // `const
30,550, // `continue
31,979, // `default
32,1455, // `do
33,179, // `double
34,1392, // `enum
35,195, // `final
36,1302, // `finally
37,1285, // `float
38,666, // `goto
39,228, // `implements
40,388, // `import
41,85, // `interface
42,65, // `long
43,1395, // `native
44,293, // `package
45,313, // `private
46,715, // `protected
47,1354, // `public
48,88, // `short
49,416, // `static
50,54, // `strictfp
51,25, // `switch
52,987, // `synchronized
53,890, // `throw
54,1491, // `throws
55,304, // `transient
56,699, // `try
57,1085, // `volatile
89,1409, // "b"
91,1484, // "l"
92,1001, // "e"
93,1558, // "a"
94,1512, // "n"
97,961, // "r"
99,489, // "c"
100,1472, // "s"
102,1492, // "t"
103,377, // "d"
104,208, // "f"
105,1423, // "i"
106,37, // "w"
108,1401, // "p"
110,452, // "v"
113,772, // "g"
  }
,
{ // state 460
0x80000000|18, // match move
0x80000000|265, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 461
0x80000000|1477, // match move
0x80000000|1299, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 462
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 463
-1, // $$start
-1, // start
700, // ws*
-1, // $$0
MIN_REDUCTION+335, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+335, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
1005, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 464
0x80000000|258, // match move
0x80000000|1361, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 465
2,1096, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 466
116,1444, // "="
  }
,
{ // state 467
106,311, // "w"
  }
,
{ // state 468
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 469
0x80000000|417, // match move
0x80000000|640, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 470
2,1248, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 471
2,1402, // ws*
150,847, // " "
152,1461, // ws
153,847, // {9}
154,990, // eol
158,1514, // {10}
159,1329, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 472
0x80000000|324, // match move
0x80000000|1466, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 473
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 474
2,435, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 475
152,1183, // ws
154,990, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 476
0x80000000|536, // match move
0x80000000|91, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 477
2,796, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 478
168,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 479
0x80000000|1297, // match move
0x80000000|941, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 480
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 481
168,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 482
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+274, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+274, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 483
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 484
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 485
2,1070, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 486
152,1183, // ws
154,990, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 487
152,1183, // ws
154,990, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 489
90,421, // "o"
91,110, // "l"
93,1220, // "a"
109,287, // "h"
  }
,
{ // state 490
0x80000000|135, // match move
0x80000000|296, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 491
2,1303, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 492
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+280, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 493
-1, // $$start
-1, // start
469, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+279, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 494
2,804, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 495
0x80000000|551, // match move
0x80000000|1174, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 496
0x80000000|1027, // match move
0x80000000|906, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 497
0x80000000|546, // match move
0x80000000|1252, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 498
0x80000000|352, // match move
0x80000000|653, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 499
99,1475, // "c"
  }
,
{ // state 500
0x80000000|599, // match move
0x80000000|1326, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 501
0x80000000|899, // match move
0x80000000|1022, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 502
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+298, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 503
152,1183, // ws
154,990, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 504
92,1525, // "e"
  }
,
{ // state 505
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 506
0x80000000|1449, // match move
0x80000000|188, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 507
0x80000000|316, // match move
0x80000000|1298, // no-match move
0x80000000|784, // NT-test-match state for digit
  }
,
{ // state 508
168,MIN_REDUCTION+169, // $NT
  }
,
{ // state 509
136,306, // "0"
137,306, // {"1".."9"}
142,507, // digit
  }
,
{ // state 510
152,1183, // ws
154,990, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 511
152,1183, // ws
154,990, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 512
-1, // $$start
-1, // start
984, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+234, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+234, // "k"
489, // "c"
669, // "s"
MIN_REDUCTION+234, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+234, // "u"
1401, // "p"
MIN_REDUCTION+234, // "h"
452, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
772, // "g"
MIN_REDUCTION+234, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+234, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 513
0x80000000|364, // match move
0x80000000|70, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 514
0x80000000|1393, // match move
0x80000000|1114, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 515
92,1148, // "e"
  }
,
{ // state 516
0x80000000|751, // match move
0x80000000|953, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 517
102,1130, // "t"
  }
,
{ // state 518
4,202, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
  }
,
{ // state 519
0x80000000|864, // match move
0x80000000|877, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 520
0x80000000|264, // match move
0x80000000|414, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 521
0x80000000|43, // match move
0x80000000|220, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 522
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 523
0x80000000|209, // match move
0x80000000|631, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 524
0x80000000|393, // match move
0x80000000|572, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 525
0x80000000|827, // match move
0x80000000|976, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 526
0x80000000|412, // match move
0x80000000|605, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 527
-1, // $$start
-1, // start
542, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+297, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 528
93,351, // "a"
  }
,
{ // state 529
0x80000000|28, // match move
0x80000000|1374, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 530
105,1373, // "i"
  }
,
{ // state 531
1,431, // start
2,31, // ws*
3,1033, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
162,619, // token*
  }
,
{ // state 532
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+272, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 533
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 534
107,1530, // "u"
  }
,
{ // state 535
2,469, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 536
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 537
2,776, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 538
0x80000000|1294, // match move
0x80000000|667, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 539
2,497, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 540
2,1175, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 541
2,624, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 542
0x80000000|510, // match move
0x80000000|320, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 543
0x80000000|449, // match move
0x80000000|57, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 544
0x80000000|370, // match move
0x80000000|138, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 545
0x80000000|1497, // match move
0x80000000|764, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 546
152,1183, // ws
154,990, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 547
97,1169, // "r"
  }
,
{ // state 548
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 549
152,1183, // ws
154,990, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 550
168,MIN_REDUCTION+172, // $NT
  }
,
{ // state 551
89,99, // "b"
90,99, // "o"
91,99, // "l"
92,99, // "e"
93,99, // "a"
94,99, // "n"
95,1185, // idChar
97,99, // "r"
98,99, // "k"
99,99, // "c"
100,99, // "s"
101,99, // "x"
102,99, // "t"
103,99, // "d"
104,99, // "f"
105,99, // "i"
106,99, // "w"
107,99, // "u"
108,99, // "p"
109,99, // "h"
110,99, // "v"
111,99, // "y"
112,99, // "m"
113,99, // "g"
114,99, // "z"
136,1488, // "0"
137,1488, // {"1".."9"}
138,99, // "X"
142,198, // digit
147,657, // letter
148,1163, // "_"
149,99, // {"A".."W" "Y".."Z" "j" "q"}
160,1166, // idChar**
166,1225, // idChar*
  }
,
{ // state 552
0x80000000|215, // match move
0x80000000|386, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 553
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 554
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+296, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 555
0x80000000|1209, // match move
0x80000000|594, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 556
0x80000000|910, // match move
0x80000000|1187, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 557
152,1183, // ws
154,990, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 558
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+155, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 559
2,542, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 560
102,1019, // "t"
  }
,
{ // state 561
93,1182, // "a"
  }
,
{ // state 562
2,497, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 563
107,812, // "u"
  }
,
{ // state 564
0x80000000|288, // match move
0x80000000|154, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 565
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 566
0x80000000|144, // match move
0x80000000|693, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 567
0x80000000|1498, // match move
0x80000000|861, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 568
168,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 569
0x80000000|721, // match move
0x80000000|601, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 570
-1, // $$start
-1, // start
496, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+253, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 571
0x80000000|345, // match move
0x80000000|1456, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 572
-1, // $$start
-1, // start
216, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+183, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+183, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+183, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+183, // "u"
1401, // "p"
MIN_REDUCTION+183, // "h"
452, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
772, // "g"
MIN_REDUCTION+183, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+183, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 573
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 574
0x80000000|1, // match move
0x80000000|524, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 575
99,1190, // "c"
  }
,
{ // state 576
0x80000000|1, // match move
0x80000000|732, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 577
2,55, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 578
2,984, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 579
0x80000000|76, // match move
0x80000000|766, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 580
152,1183, // ws
154,990, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 582
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+236, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 583
0x80000000|1269, // match move
0x80000000|133, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 584
0x80000000|163, // match move
0x80000000|713, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 585
2,1303, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 586
91,16, // "l"
  }
,
{ // state 587
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 588
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+282, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 589
0x80000000|415, // match move
0x80000000|1021, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 590
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 591
2,1322, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 592
2,944, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 593
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+110, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 594
0x80000000|663, // match move
0x80000000|1222, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 595
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 596
0x80000000|701, // match move
0x80000000|1553, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 597
152,1183, // ws
154,990, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 599
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 600
103,61, // "d"
  }
,
{ // state 601
0x80000000|662, // match move
0x80000000|376, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 602
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 603
152,1183, // ws
154,990, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 604
90,169, // "o"
111,1304, // "y"
  }
,
{ // state 605
0x80000000|1283, // match move
0x80000000|1133, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 606
152,1183, // ws
154,990, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 609
116,795, // "="
  }
,
{ // state 610
2,146, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 611
102,1197, // "t"
  }
,
{ // state 612
0x80000000|1, // match move
0x80000000|940, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 613
113,1192, // "g"
  }
,
{ // state 614
0x80000000|1178, // match move
0x80000000|1077, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 615
152,1183, // ws
154,990, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 616
4,202, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
83,884, // `/
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
136,1441, // "0"
147,495, // letter
  }
,
{ // state 617
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 619
0x80000000|728, // match move
0x80000000|731, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 620
0x80000000|1, // match move
0x80000000|471, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 621
0x80000000|1, // match move
0x80000000|677, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 622
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+276, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+276, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 623
152,1183, // ws
154,990, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 624
0x80000000|673, // match move
0x80000000|1092, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 625
2,212, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 626
0x80000000|427, // match move
0x80000000|1122, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 627
0x80000000|562, // match move
0x80000000|424, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 628
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 629
0x80000000|1440, // match move
0x80000000|706, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 630
2,525, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 631
0x80000000|1511, // match move
0x80000000|722, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 632
102,1106, // "t"
  }
,
{ // state 633
0x80000000|703, // match move
0x80000000|1262, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 634
0x80000000|142, // match move
0x80000000|444, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 635
97,97, // "r"
105,115, // "i"
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|579, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 637
168,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 638
0x80000000|1546, // match move
0x80000000|1257, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 639
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 640
0x80000000|1258, // match move
0x80000000|538, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 641
91,1485, // "l"
  }
,
{ // state 642
92,816, // "e"
  }
,
{ // state 643
0x80000000|685, // match move
0x80000000|472, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 644
0x80000000|1528, // match move
0x80000000|883, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 645
97,1229, // "r"
  }
,
{ // state 646
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 647
0x80000000|1425, // match move
0x80000000|159, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 648
152,1183, // ws
154,990, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 649
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+302, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+302, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 650
168,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 651
0x80000000|74, // match move
0x80000000|616, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 652
152,1183, // ws
154,990, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 653
-1, // $$start
-1, // start
647, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
MIN_REDUCTION+249, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+249, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+249, // $
-1, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 654
97,290, // "r"
  }
,
{ // state 655
0x80000000|253, // match move
0x80000000|817, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|875, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 657
0x80000000|1507, // match move
0x80000000|1432, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 658
2,583, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 660
105,90, // "i"
  }
,
{ // state 661
168,MIN_REDUCTION+157, // $NT
  }
,
{ // state 662
2,647, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 663
168,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 664
0x80000000|936, // match move
0x80000000|998, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 665
0x80000000|1080, // match move
0x80000000|230, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 666
168,MIN_REDUCTION+196, // $NT
  }
,
{ // state 667
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+278, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 668
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+161, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 669
0x80000000|1128, // match move
0x80000000|1292, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 670
0x80000000|1356, // match move
0x80000000|1408, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 671
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 672
135,359, // "|"
  }
,
{ // state 673
152,1183, // ws
154,990, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 675
111,1304, // "y"
  }
,
{ // state 676
2,1135, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 677
0x80000000|739, // match move
0x80000000|273, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 678
0x80000000|1376, // match move
0x80000000|1170, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 679
97,207, // "r"
  }
,
{ // state 680
0x80000000|1088, // match move
0x80000000|1445, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 681
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+252, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+252, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 682
2,50, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 683
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 684
0x80000000|348, // match move
0x80000000|1124, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 685
2,529, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 686
0x80000000|1108, // match move
0x80000000|1256, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 687
0x80000000|105, // match move
0x80000000|1469, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 688
104,1216, // "f"
  }
,
{ // state 689
0x80000000|871, // match move
0x80000000|956, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 690
0x80000000|353, // match move
0x80000000|66, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 691
0x80000000|1384, // match move
0x80000000|532, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 692
91,675, // "l"
  }
,
{ // state 693
0x80000000|235, // match move
0x80000000|436, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 694
0x80000000|1118, // match move
0x80000000|252, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 695
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 696
154,453, // eol
155,1090, // printable**
158,1514, // {10}
159,1329, // {13}
163,321, // printable*
  }
,
{ // state 697
94,1116, // "n"
  }
,
{ // state 698
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 699
168,MIN_REDUCTION+244, // $NT
  }
,
{ // state 700
0x80000000|257, // match move
0x80000000|399, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 701
116,1277, // "="
  }
,
{ // state 702
2,1505, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 703
92,547, // "e"
  }
,
{ // state 704
152,1183, // ws
154,990, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 705
0x80000000|1265, // match move
0x80000000|3, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 706
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+262, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 707
0x80000000|333, // match move
0x80000000|335, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 708
168,MIN_REDUCTION+112, // $NT
  }
,
{ // state 709
0x80000000|874, // match move
0x80000000|1117, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 710
168,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 711
-1, // $$start
-1, // start
804, // ws*
-1, // $$0
MIN_REDUCTION+310, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+310, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+310, // $
-1, // $NT
  }
,
{ // state 712
0x80000000|1500, // match move
0x80000000|881, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 713
0x80000000|878, // match move
0x80000000|649, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 714
168,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 715
168,MIN_REDUCTION+220, // $NT
  }
,
{ // state 716
0x80000000|1, // match move
0x80000000|461, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|664, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 718
0x80000000|1065, // match move
0x80000000|873, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 719
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 720
-1, // $$start
-1, // start
929, // ws*
-1, // $$0
MIN_REDUCTION+314, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+314, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 721
116,1247, // "="
  }
,
{ // state 722
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+185, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 723
2,583, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 724
89,1315, // "b"
90,1315, // "o"
91,1315, // "l"
92,1315, // "e"
93,1315, // "a"
94,1315, // "n"
97,1315, // "r"
98,1315, // "k"
99,1315, // "c"
100,1315, // "s"
101,1315, // "x"
102,1315, // "t"
103,1315, // "d"
104,1315, // "f"
105,1315, // "i"
106,1315, // "w"
107,1315, // "u"
108,1315, // "p"
109,1315, // "h"
110,1315, // "v"
111,1315, // "y"
112,1315, // "m"
113,1315, // "g"
114,1315, // "z"
115,1315, // "!"
116,1315, // "="
117,1315, // "%"
118,1315, // "&"
119,1315, // "("
120,1315, // ")"
121,1315, // "*"
122,1315, // "/"
123,1315, // "+"
124,1315, // ","
125,1315, // "-"
126,1315, // "."
127,1315, // ":"
128,1315, // ";"
129,1315, // "<"
130,1315, // ">"
131,1315, // "["
132,1315, // "]"
133,1315, // "{"
134,1315, // "}"
135,1315, // "|"
136,1315, // "0"
137,1315, // {"1".."9"}
138,1315, // "X"
143,1315, // "'"
144,130, // printable
145,1315, // '"'
148,1315, // "_"
149,1315, // {"A".."W" "Y".."Z" "j" "q"}
150,1315, // " "
151,1315, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 725
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+313, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+313, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+313, // $
-1, // $NT
  }
,
{ // state 726
-1, // $$start
-1, // start
1521, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
MIN_REDUCTION+281, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+281, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 727
112,1345, // "m"
  }
,
{ // state 728
0x80000000|1, // match move
0x80000000|1254, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 729
152,1183, // ws
154,990, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 730
2,1539, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 731
0x80000000|651, // match move
0x80000000|430, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 732
0x80000000|1100, // match move
0x80000000|1232, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 733
0x80000000|1011, // match move
0x80000000|109, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 734
89,248, // "b"
90,248, // "o"
91,248, // "l"
92,248, // "e"
93,248, // "a"
94,248, // "n"
97,248, // "r"
98,248, // "k"
99,248, // "c"
100,248, // "s"
101,248, // "x"
102,248, // "t"
103,248, // "d"
104,248, // "f"
105,248, // "i"
106,248, // "w"
107,248, // "u"
108,248, // "p"
109,248, // "h"
110,248, // "v"
111,248, // "y"
112,248, // "m"
113,248, // "g"
114,248, // "z"
115,248, // "!"
116,248, // "="
117,248, // "%"
118,248, // "&"
119,248, // "("
120,248, // ")"
121,248, // "*"
122,248, // "/"
123,248, // "+"
124,248, // ","
125,248, // "-"
126,248, // "."
127,248, // ":"
128,248, // ";"
129,248, // "<"
130,248, // ">"
131,248, // "["
132,248, // "]"
133,248, // "{"
134,248, // "}"
135,248, // "|"
136,248, // "0"
137,248, // {"1".."9"}
138,248, // "X"
143,248, // "'"
144,798, // printable
145,248, // '"'
148,248, // "_"
149,248, // {"A".."W" "Y".."Z" "j" "q"}
150,248, // " "
151,248, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 735
0x80000000|615, // match move
0x80000000|384, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 736
90,1259, // "o"
91,880, // "l"
  }
,
{ // state 737
-1, // $$start
-1, // start
796, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+293, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 738
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+101, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 739
2,52, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 740
93,98, // "a"
105,1018, // "i"
107,84, // "u"
111,1381, // "y"
  }
,
{ // state 741
0x80000000|33, // match move
0x80000000|1355, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 742
91,483, // "l"
  }
,
{ // state 743
92,1276, // "e"
  }
,
{ // state 744
105,1347, // "i"
  }
,
{ // state 745
0x80000000|1230, // match move
0x80000000|896, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 746
0x80000000|1261, // match move
0x80000000|966, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 747
0x80000000|438, // match move
0x80000000|1313, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 748
2,519, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 749
152,1183, // ws
154,990, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 750
-1, // $$start
-1, // start
944, // ws*
-1, // $$0
MIN_REDUCTION+305, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+305, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 751
152,1183, // ws
154,990, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 752
121,1548, // "*"
122,1231, // "/"
  }
,
{ // state 753
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
202, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
-1, // "*"
1478, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
-1, // {10}
-1, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+356, // $
-1, // $NT
  }
,
{ // state 754
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+104, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 755
0x80000000|1, // match move
0x80000000|712, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 756
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 757
-1, // $$start
-1, // start
843, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+283, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 758
152,1183, // ws
154,990, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 759
0x80000000|1207, // match move
0x80000000|104, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 760
152,1183, // ws
154,990, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 761
152,1183, // ws
154,990, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 762
92,621, // "e"
  }
,
{ // state 763
152,1183, // ws
154,990, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 764
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+292, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 765
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+149, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 766
-1, // $$start
-1, // start
746, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+105, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+105, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+105, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+105, // "u"
1401, // "p"
MIN_REDUCTION+105, // "h"
452, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
772, // "g"
MIN_REDUCTION+105, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+105, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 767
0x80000000|249, // match move
0x80000000|1323, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 768
152,1183, // ws
154,990, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 769
0x80000000|1388, // match move
0x80000000|1215, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 770
0x80000000|1250, // match move
0x80000000|725, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 771
2,496, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 772
90,611, // "o"
  }
,
{ // state 773
152,1183, // ws
154,990, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 774
2,670, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 775
109,828, // "h"
  }
,
{ // state 776
0x80000000|458, // match move
0x80000000|555, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 777
0x80000000|1039, // match move
0x80000000|411, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 778
101,918, // "x"
136,306, // "0"
137,306, // {"1".."9"}
138,918, // "X"
140,842, // `x
141,566, // digit++
142,787, // digit
165,6, // digit+
  }
,
{ // state 779
152,1183, // ws
154,990, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 780
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+250, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+250, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 781
0x80000000|474, // match move
0x80000000|1142, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 782
100,897, // "s"
  }
,
{ // state 783
92,977, // "e"
  }
,
{ // state 784
136,197, // "0"
137,197, // {"1".."9"}
  }
,
{ // state 785
-1, // $$start
-1, // start
407, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
-1, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
-1, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+269, // "*"
680, // "/"
1059, // "+"
638, // ","
MIN_REDUCTION+269, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 786
0x80000000|972, // match move
0x80000000|295, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 787
0x80000000|788, // match move
0x80000000|844, // no-match move
0x80000000|784, // NT-test-match state for digit
  }
,
{ // state 788
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 789
0x80000000|563, // match move
0x80000000|689, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 790
0x80000000|1509, // match move
0x80000000|833, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 791
0x80000000|125, // match move
0x80000000|558, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 792
0x80000000|1097, // match move
0x80000000|629, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 793
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 794
94,339, // "n"
  }
,
{ // state 795
0x80000000|318, // match move
0x80000000|426, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 796
0x80000000|1534, // match move
0x80000000|1003, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 797
0x80000000|127, // match move
0x80000000|1406, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 798
0x80000000|573, // match move
0x80000000|830, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 799
113,294, // "g"
  }
,
{ // state 800
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 801
152,1183, // ws
154,990, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 802
0x80000000|1, // match move
0x80000000|908, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 803
0x80000000|676, // match move
0x80000000|457, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 804
0x80000000|371, // match move
0x80000000|120, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 805
0x80000000|171, // match move
0x80000000|911, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 806
2,542, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 807
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+137, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 808
0x80000000|577, // match move
0x80000000|101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 809
-1, // $$start
-1, // start
277, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+271, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 810
0x80000000|1025, // match move
0x80000000|406, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 811
0x80000000|831, // match move
0x80000000|958, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 812
89,641, // "b"
  }
,
{ // state 813
168,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 814
2,1175, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 815
0x80000000|165, // match move
0x80000000|684, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 816
103,1465, // "d"
  }
,
{ // state 817
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+212, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 818
0x80000000|1, // match move
0x80000000|1543, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 819
91,845, // "l"
94,256, // "n"
97,1169, // "r"
101,1151, // "x"
  }
,
{ // state 820
152,1183, // ws
154,990, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 821
0x80000000|587, // match move
0x80000000|1531, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 822
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 823
2,26, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 824
0x80000000|1, // match move
0x80000000|781, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 825
0x80000000|1337, // match move
0x80000000|149, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 826
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+92, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 827
152,1183, // ws
154,990, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 828
0x80000000|1, // match move
0x80000000|808, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 829
0x80000000|1, // match move
0x80000000|919, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 830
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 831
152,1183, // ws
154,990, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 832
0x80000000|379, // match move
0x80000000|655, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 833
0x80000000|580, // match move
0x80000000|791, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 834
109,645, // "h"
  }
,
{ // state 835
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 836
-1, // $$start
-1, // start
913, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+216, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+216, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+216, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+216, // "u"
1401, // "p"
MIN_REDUCTION+216, // "h"
452, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
772, // "g"
MIN_REDUCTION+216, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+216, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 837
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 838
93,1239, // "a"
  }
,
{ // state 839
92,654, // "e"
  }
,
{ // state 840
168,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 841
92,1442, // "e"
  }
,
{ // state 842
136,306, // "0"
137,306, // {"1".."9"}
141,1219, // digit++
142,787, // digit
165,6, // digit+
  }
,
{ // state 843
0x80000000|1099, // match move
0x80000000|885, // no-match move
// T-test match for "*":
121,
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 844
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 845
100,297, // "s"
  }
,
{ // state 846
0x80000000|1038, // match move
0x80000000|446, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 847
168,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 848
0x80000000|882, // match move
0x80000000|1125, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 849
0x80000000|623, // match move
0x80000000|429, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 850
2,1184, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 851
0x80000000|1101, // match move
0x80000000|869, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 852
0x80000000|912, // match move
0x80000000|1234, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 853
0x80000000|1272, // match move
0x80000000|1501, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 854
0x80000000|1107, // match move
0x80000000|1428, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 855
0x80000000|89, // match move
0x80000000|1189, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 856
152,1183, // ws
154,990, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 857
107,329, // "u"
  }
,
{ // state 858
2,944, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 859
2,700, // ws*
161,1005, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 860
2,1350, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 861
0x80000000|578, // match move
0x80000000|512, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 862
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 863
152,1183, // ws
154,990, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 864
152,1183, // ws
154,990, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 865
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 866
2,647, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 867
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 868
-1, // $$start
-1, // start
1350, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+150, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+150, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+150, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+150, // "u"
1401, // "p"
MIN_REDUCTION+150, // "h"
452, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
772, // "g"
MIN_REDUCTION+150, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+150, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 869
0x80000000|1306, // match move
0x80000000|1082, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 870
0x80000000|650, // match move
0x80000000|1287, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 871
2,251, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 872
-1, // $$start
-1, // start
1139, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+168, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+168, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+168, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+168, // "u"
1401, // "p"
MIN_REDUCTION+168, // "h"
452, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
772, // "g"
MIN_REDUCTION+168, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+168, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 873
0x80000000|301, // match move
0x80000000|964, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 874
2,497, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 875
0x80000000|92, // match move
0x80000000|203, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 876
104,325, // "f"
  }
,
{ // state 877
0x80000000|820, // match move
0x80000000|1318, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 878
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 879
0x80000000|1, // match move
0x80000000|938, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 880
92,727, // "e"
  }
,
{ // state 881
-1, // $$start
-1, // start
369, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+96, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+96, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+96, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+96, // "u"
1401, // "p"
MIN_REDUCTION+96, // "h"
452, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
772, // "g"
MIN_REDUCTION+96, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+96, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 882
2,51, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 883
0x80000000|1138, // match move
0x80000000|846, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 884
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 885
0x80000000|511, // match move
0x80000000|1237, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 886
0x80000000|223, // match move
0x80000000|733, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 887
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+113, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 888
92,1467, // "e"
  }
,
{ // state 889
152,1183, // ws
154,990, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 890
168,MIN_REDUCTION+235, // $NT
  }
,
{ // state 891
0x80000000|177, // match move
0x80000000|260, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 892
89,1315, // "b"
90,1315, // "o"
91,1315, // "l"
92,1315, // "e"
93,1315, // "a"
94,1315, // "n"
97,1315, // "r"
98,1315, // "k"
99,1315, // "c"
100,1315, // "s"
101,1315, // "x"
102,1315, // "t"
103,1315, // "d"
104,1315, // "f"
105,1315, // "i"
106,1315, // "w"
107,1315, // "u"
108,1315, // "p"
109,1315, // "h"
110,1315, // "v"
111,1315, // "y"
112,1315, // "m"
113,1315, // "g"
114,1315, // "z"
115,1315, // "!"
116,1315, // "="
117,1315, // "%"
118,1315, // "&"
119,1315, // "("
120,1315, // ")"
121,1315, // "*"
122,1315, // "/"
123,1315, // "+"
124,1315, // ","
125,1315, // "-"
126,1315, // "."
127,1315, // ":"
128,1315, // ";"
129,1315, // "<"
130,1315, // ">"
131,1315, // "["
132,1315, // "]"
133,1315, // "{"
134,1315, // "}"
135,1315, // "|"
136,1315, // "0"
137,1315, // {"1".."9"}
138,1315, // "X"
143,1315, // "'"
144,895, // printable
145,1315, // '"'
148,1315, // "_"
149,1315, // {"A".."W" "Y".."Z" "j" "q"}
150,1315, // " "
151,1315, // {"#".."$" "?".."@" "\" "^" "`" "~"}
154,8, // eol
157,1366, // commentContent
158,1514, // {10}
159,1329, // {13}
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|1391, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 894
0x80000000|1317, // match move
0x80000000|237, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 895
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 896
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+248, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 897
0x80000000|1, // match move
0x80000000|848, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 898
-1, // $$start
-1, // start
1322, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+291, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 899
152,1183, // ws
154,990, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 900
2,735, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 901
0x80000000|1434, // match move
0x80000000|409, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 902
148,MIN_REDUCTION+320, // "_"
160,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 903
-1, // $$start
-1, // start
644, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+192, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+192, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+192, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+192, // "u"
1401, // "p"
MIN_REDUCTION+192, // "h"
452, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
772, // "g"
MIN_REDUCTION+192, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+192, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 904
89,337, // "b"
  }
,
{ // state 905
2,1081, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 906
0x80000000|971, // match move
0x80000000|1243, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 907
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 908
0x80000000|1034, // match move
0x80000000|903, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 909
152,1183, // ws
154,990, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 910
152,1183, // ws
154,990, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 911
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+164, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 912
168,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 913
0x80000000|801, // match move
0x80000000|970, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 914
2,790, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 915
0x80000000|148, // match move
0x80000000|119, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 916
0x80000000|60, // match move
0x80000000|584, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 917
91,340, // "l"
  }
,
{ // state 918
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 919
0x80000000|1040, // match move
0x80000000|1270, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 920
-1, // $$start
-1, // start
1096, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+231, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+231, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+231, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+231, // "u"
1401, // "p"
MIN_REDUCTION+231, // "h"
452, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
772, // "g"
MIN_REDUCTION+231, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+231, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 921
0x80000000|773, // match move
0x80000000|1372, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 922
102,291, // "t"
  }
,
{ // state 923
-1, // $$start
-1, // start
362, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+225, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+225, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+225, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+225, // "u"
1401, // "p"
MIN_REDUCTION+225, // "h"
452, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
772, // "g"
MIN_REDUCTION+225, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+225, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 924
168,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 925
0x80000000|131, // match move
0x80000000|358, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 926
0x80000000|1404, // match move
0x80000000|886, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 927
102,332, // "t"
  }
,
{ // state 928
89,1315, // "b"
90,1315, // "o"
91,1315, // "l"
92,1315, // "e"
93,1315, // "a"
94,1315, // "n"
97,1315, // "r"
98,1315, // "k"
99,1315, // "c"
100,1315, // "s"
101,1315, // "x"
102,1315, // "t"
103,1315, // "d"
104,1315, // "f"
105,1315, // "i"
106,1315, // "w"
107,1315, // "u"
108,1315, // "p"
109,1315, // "h"
110,1315, // "v"
111,1315, // "y"
112,1315, // "m"
113,1315, // "g"
114,1315, // "z"
115,1315, // "!"
116,1315, // "="
117,1315, // "%"
118,1315, // "&"
119,1315, // "("
120,1315, // ")"
121,1315, // "*"
122,1315, // "/"
123,1315, // "+"
124,1315, // ","
125,1315, // "-"
126,1315, // "."
127,1315, // ":"
128,1315, // ";"
129,1315, // "<"
130,1315, // ">"
131,1315, // "["
132,1315, // "]"
133,1315, // "{"
134,1315, // "}"
135,1315, // "|"
136,1315, // "0"
137,1315, // {"1".."9"}
138,1315, // "X"
143,1315, // "'"
144,895, // printable
145,1315, // '"'
148,1315, // "_"
149,1315, // {"A".."W" "Y".."Z" "j" "q"}
150,1315, // " "
151,1315, // {"#".."$" "?".."@" "\" "^" "`" "~"}
154,8, // eol
156,1418, // commentContent*
157,907, // commentContent
158,1514, // {10}
159,1329, // {13}
  }
,
{ // state 929
0x80000000|357, // match move
0x80000000|1407, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 930
168,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 931
168,MIN_REDUCTION+115, // $NT
  }
,
{ // state 932
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 933
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 934
97,717, // "r"
  }
,
{ // state 935
0x80000000|1, // match move
0x80000000|803, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 936
2,1094, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 937
0x80000000|481, // match move
0x80000000|826, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 938
0x80000000|610, // match move
0x80000000|2, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 939
0x80000000|32, // match move
0x80000000|544, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 940
0x80000000|180, // match move
0x80000000|266, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 941
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+227, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 942
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 943
93,44, // "a"
  }
,
{ // state 944
0x80000000|1359, // match move
0x80000000|451, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 945
2,700, // ws*
152,1461, // ws
154,990, // eol
161,1005, // $$1
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 946
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+284, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 947
0x80000000|129, // match move
0x80000000|282, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 948
100,405, // "s"
  }
,
{ // state 949
0x80000000|1246, // match move
0x80000000|1320, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 950
0x80000000|1551, // match move
0x80000000|172, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 951
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 952
152,1183, // ws
154,990, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 953
0x80000000|1422, // match move
0x80000000|738, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 954
3,695, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
162,619, // token*
  }
,
{ // state 955
89,99, // "b"
90,99, // "o"
91,99, // "l"
92,99, // "e"
93,99, // "a"
94,99, // "n"
95,476, // idChar
97,99, // "r"
98,99, // "k"
99,99, // "c"
100,99, // "s"
101,99, // "x"
102,99, // "t"
103,99, // "d"
104,99, // "f"
105,99, // "i"
106,99, // "w"
107,99, // "u"
108,99, // "p"
109,99, // "h"
110,99, // "v"
111,99, // "y"
112,99, // "m"
113,99, // "g"
114,99, // "z"
136,1488, // "0"
137,1488, // {"1".."9"}
138,99, // "X"
142,198, // digit
147,657, // letter
148,1163, // "_"
149,99, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 956
-1, // $$start
-1, // start
251, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+177, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+177, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+177, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
812, // "u"
1401, // "p"
MIN_REDUCTION+177, // "h"
452, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
772, // "g"
MIN_REDUCTION+177, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+177, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 957
2,407, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 958
0x80000000|15, // match move
0x80000000|1281, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 959
0x80000000|396, // match move
0x80000000|1382, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 960
0x80000000|241, // match move
0x80000000|13, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 961
92,1162, // "e"
  }
,
{ // state 962
0x80000000|1342, // match move
0x80000000|482, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 963
2,362, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 964
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+176, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 965
152,1183, // ws
154,990, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 966
0x80000000|1379, // match move
0x80000000|1152, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 967
0x80000000|505, // match move
0x80000000|166, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 968
0x80000000|381, // match move
0x80000000|80, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 969
99,9, // "c"
  }
,
{ // state 970
0x80000000|1278, // match move
0x80000000|870, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 971
152,1183, // ws
154,990, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 972
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 973
2,184, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 974
158,354, // {10}
  }
,
{ // state 975
92,636, // "e"
  }
,
{ // state 976
0x80000000|1236, // match move
0x80000000|199, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 977
0x80000000|1, // match move
0x80000000|1024, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 978
100,47, // "s"
102,633, // "t"
  }
,
{ // state 979
168,MIN_REDUCTION+175, // $NT
  }
,
{ // state 980
2,939, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 981
-1, // $$start
-1, // start
670, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+243, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+243, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+243, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+243, // "u"
1401, // "p"
MIN_REDUCTION+243, // "h"
452, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
772, // "g"
MIN_REDUCTION+243, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+243, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 982
152,1183, // ws
154,990, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 983
0x80000000|394, // match move
0x80000000|307, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 984
0x80000000|1412, // match move
0x80000000|1134, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 985
168,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 986
0x80000000|858, // match move
0x80000000|1157, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 987
168,MIN_REDUCTION+232, // $NT
  }
,
{ // state 988
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+173, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 989
152,1183, // ws
154,990, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 990
168,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 991
0x80000000|1104, // match move
0x80000000|872, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 992
102,21, // "t"
  }
,
{ // state 993
94,38, // "n"
  }
,
{ // state 994
-1, // $$start
-1, // start
769, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+295, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 995
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 996
2,769, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 997
0x80000000|440, // match move
0x80000000|1111, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 998
-1, // $$start
-1, // start
1094, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+165, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+165, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+165, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+165, // "u"
1401, // "p"
MIN_REDUCTION+165, // "h"
452, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
772, // "g"
MIN_REDUCTION+165, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+165, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 999
0x80000000|1471, // match move
0x80000000|39, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1000
0x80000000|1554, // match move
0x80000000|1233, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1001
91,845, // "l"
94,256, // "n"
101,1151, // "x"
  }
,
{ // state 1002
-1, // $$start
-1, // start
1175, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+273, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1003
0x80000000|648, // match move
0x80000000|545, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1004
122,27, // "/"
  }
,
{ // state 1005
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1006
-1, // $$start
-1, // start
1235, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+267, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 1007
4,202, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
89,1409, // "b"
91,1484, // "l"
92,1001, // "e"
93,1558, // "a"
94,1512, // "n"
97,961, // "r"
99,489, // "c"
100,1472, // "s"
102,1492, // "t"
103,377, // "d"
104,208, // "f"
105,1423, // "i"
106,37, // "w"
108,1401, // "p"
110,452, // "v"
113,772, // "g"
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1008
0x80000000|692, // match move
0x80000000|1126, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1009
0x80000000|1328, // match move
0x80000000|227, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1010
168,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1011
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1012
152,1183, // ws
154,990, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1013
0x80000000|1251, // match move
0x80000000|915, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1014
0x80000000|749, // match move
0x80000000|433, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1015
107,1181, // "u"
  }
,
{ // state 1016
2,796, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1017
0x80000000|1202, // match move
0x80000000|668, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1018
99,63, // "c"
  }
,
{ // state 1019
0x80000000|1, // match move
0x80000000|1137, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1020
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1021
0x80000000|428, // match move
0x80000000|1410, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1022
0x80000000|1549, // match move
0x80000000|622, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1023
97,102, // "r"
  }
,
{ // state 1024
0x80000000|914, // match move
0x80000000|1045, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1025
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1026
152,1183, // ws
154,990, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1027
152,1183, // ws
154,990, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1028
152,1183, // ws
154,990, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1029
2,959, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1030
2,506, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1031
-1, // $$start
-1, // start
624, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+246, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+246, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+246, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+246, // "u"
1401, // "p"
MIN_REDUCTION+246, // "h"
452, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
772, // "g"
MIN_REDUCTION+246, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+246, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 1032
94,108, // "n"
  }
,
{ // state 1033
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1034
2,644, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1035
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+224, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 1036
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+152, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 1037
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1038
168,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1039
168,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1040
2,214, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+213, // (default reduction)
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1041
2,1235, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1042
152,1183, // ws
154,990, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1043
168,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1044
168,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1045
-1, // $$start
-1, // start
790, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+156, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+156, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+156, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+156, // "u"
1401, // "p"
MIN_REDUCTION+156, // "h"
452, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
772, // "g"
MIN_REDUCTION+156, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+156, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 1046
2,843, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1047
152,1183, // ws
154,990, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1048
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+260, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1049
168,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1050
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+188, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1051
0x80000000|145, // match move
0x80000000|322, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1052
97,210, // "r"
  }
,
{ // state 1053
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1054
0x80000000|1109, // match move
0x80000000|500, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1055
-1, // $$start
-1, // start
1188, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+102, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+102, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+102, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+102, // "u"
1401, // "p"
MIN_REDUCTION+102, // "h"
452, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
772, // "g"
MIN_REDUCTION+102, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+102, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 1056
0x80000000|1523, // match move
0x80000000|1218, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1057
0x80000000|1, // match move
0x80000000|1089, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1058
0x80000000|29, // match move
0x80000000|1398, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1059
0x80000000|19, // match move
0x80000000|53, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1060
100,391, // "s"
  }
,
{ // state 1061
0x80000000|221, // match move
0x80000000|12, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1062
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1063
0x80000000|1, // match move
0x80000000|1110, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1064
0x80000000|1314, // match move
0x80000000|1439, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1065
152,1183, // ws
154,990, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1066
0x80000000|1308, // match move
0x80000000|1502, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1067
99,143, // "c"
  }
,
{ // state 1068
152,1183, // ws
154,990, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1069
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1070
0x80000000|1136, // match move
0x80000000|556, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1071
94,838, // "n"
  }
,
{ // state 1072
0x80000000|1400, // match move
0x80000000|1205, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1073
152,1183, // ws
154,990, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1074
99,356, // "c"
  }
,
{ // state 1075
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1076
-1, // $$start
-1, // start
776, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+219, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+219, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+219, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+219, // "u"
1401, // "p"
MIN_REDUCTION+219, // "h"
452, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
772, // "g"
MIN_REDUCTION+219, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+219, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 1077
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+245, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 1078
89,248, // "b"
90,248, // "o"
91,248, // "l"
92,248, // "e"
93,248, // "a"
94,248, // "n"
97,248, // "r"
98,248, // "k"
99,248, // "c"
100,248, // "s"
101,248, // "x"
102,248, // "t"
103,248, // "d"
104,248, // "f"
105,248, // "i"
106,248, // "w"
107,248, // "u"
108,248, // "p"
109,248, // "h"
110,248, // "v"
111,248, // "y"
112,248, // "m"
113,248, // "g"
114,248, // "z"
115,248, // "!"
116,248, // "="
117,248, // "%"
118,248, // "&"
119,248, // "("
120,248, // ")"
121,248, // "*"
122,248, // "/"
123,248, // "+"
124,248, // ","
125,248, // "-"
126,248, // "."
127,248, // ":"
128,248, // ";"
129,248, // "<"
130,248, // ">"
131,248, // "["
132,248, // "]"
133,248, // "{"
134,248, // "}"
135,248, // "|"
136,248, // "0"
137,248, // {"1".."9"}
138,248, // "X"
143,248, // "'"
144,694, // printable
145,248, // '"'
146,1348, // printable++
148,248, // "_"
149,248, // {"A".."W" "Y".."Z" "j" "q"}
150,248, // " "
151,248, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,271, // printable+
  }
,
{ // state 1079
0x80000000|1336, // match move
0x80000000|1054, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1080
168,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1081
0x80000000|134, // match move
0x80000000|330, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1082
-1, // $$start
-1, // start
490, // ws*
-1, // $$0
MIN_REDUCTION+299, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+299, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1083
0x80000000|973, // match move
0x80000000|1204, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1084
152,1183, // ws
154,990, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1085
168,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1086
2,769, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1087
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1088
121,1548, // "*"
122,1231, // "/"
  }
,
{ // state 1089
0x80000000|465, // match move
0x80000000|920, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1090
154,1331, // eol
158,1514, // {10}
159,1329, // {13}
  }
,
{ // state 1091
2,1521, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1092
0x80000000|347, // match move
0x80000000|614, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1093
0x80000000|954, // match move
0x80000000|1540, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1094
0x80000000|11, // match move
0x80000000|267, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1095
0x80000000|541, // match move
0x80000000|1031, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1096
0x80000000|1264, // match move
0x80000000|366, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1097
152,1183, // ws
154,990, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1098
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1099
152,1183, // ws
154,990, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1100
2,767, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1101
2,490, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1102
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1103
0x80000000|1028, // match move
0x80000000|543, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1104
2,1139, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1105
152,1183, // ws
154,990, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1106
0x80000000|1, // match move
0x80000000|1150, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1107
2,1303, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1108
2,1070, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1109
152,1183, // ws
154,990, // eol
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1110
0x80000000|1522, // match move
0x80000000|244, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1111
-1, // $$start
-1, // start
1079, // ws*
-1, // $$0
MIN_REDUCTION+316, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+316, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 1112
0x80000000|283, // match move
0x80000000|1319, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1113
152,1183, // ws
154,990, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1114
0x80000000|1199, // match move
0x80000000|962, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1115
152,1183, // ws
154,990, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1116
0x80000000|1, // match move
0x80000000|1072, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1117
0x80000000|539, // match move
0x80000000|627, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1118
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1119
152,1183, // ws
154,990, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1120
0x80000000|1, // match move
0x80000000|960, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1121
152,1183, // ws
154,990, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1122
-1, // $$start
-1, // start
1244, // ws*
-1, // $$0
MIN_REDUCTION+308, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+308, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 1123
168,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1124
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+194, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1125
-1, // $$start
-1, // start
51, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+198, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+198, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+198, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+198, // "u"
1401, // "p"
MIN_REDUCTION+198, // "h"
452, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
772, // "g"
MIN_REDUCTION+198, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+198, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 1126
0x80000000|1267, // match move
0x80000000|1457, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1127
0x80000000|1479, // match move
0x80000000|1103, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1128
102,1516, // "t"
106,744, // "w"
107,117, // "u"
109,1266, // "h"
111,1032, // "y"
  }
,
{ // state 1129
93,200, // "a"
  }
,
{ // state 1130
105,205, // "i"
  }
,
{ // state 1131
168,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1132
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1133
0x80000000|81, // match move
0x80000000|720, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1134
0x80000000|1105, // match move
0x80000000|855, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1135
0x80000000|729, // match move
0x80000000|152, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1136
152,1183, // ws
154,990, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1137
0x80000000|630, // match move
0x80000000|1158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1138
152,1183, // ws
154,990, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1139
0x80000000|49, // match move
0x80000000|589, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1140
152,1183, // ws
154,990, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1141
0x80000000|1093, // match move
0x80000000|190, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1142
-1, // $$start
-1, // start
435, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+93, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+93, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+93, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+93, // "u"
1401, // "p"
MIN_REDUCTION+93, // "h"
452, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
772, // "g"
MIN_REDUCTION+93, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+93, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 1143
168,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1144
-1, // $$start
-1, // start
767, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+237, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+237, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+237, // "x"
1424, // "t"
377, // "d"
208, // "f"
1423, // "i"
1339, // "w"
117, // "u"
1401, // "p"
1266, // "h"
452, // "v"
1032, // "y"
MIN_REDUCTION+237, // "m"
772, // "g"
MIN_REDUCTION+237, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+237, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1145
92,206, // "e"
  }
,
{ // state 1146
108,736, // "p"
  }
,
{ // state 1147
2,1521, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1148
0x80000000|1, // match move
0x80000000|1095, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1149
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1150
0x80000000|232, // match move
0x80000000|56, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1151
102,504, // "t"
  }
,
{ // state 1152
0x80000000|1504, // match move
0x80000000|754, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1153
168,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1154
0x80000000|1, // match move
0x80000000|1083, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1155
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1156
94,211, // "n"
  }
,
{ // state 1157
0x80000000|592, // match move
0x80000000|23, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1158
-1, // $$start
-1, // start
525, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+174, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+174, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+174, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+174, // "u"
1401, // "p"
MIN_REDUCTION+174, // "h"
452, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
772, // "g"
MIN_REDUCTION+174, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+174, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 1159
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1160
0x80000000|1555, // match move
0x80000000|1177, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1161
2,1188, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1162
102,534, // "t"
  }
,
{ // state 1163
0x80000000|835, // match move
0x80000000|942, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1164
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 1165
0x80000000|535, // match move
0x80000000|246, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1166
0x80000000|945, // match move
0x80000000|1171, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1167
168,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1168
-1, // $$start
-1, // start
939, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+114, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+114, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+114, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+114, // "u"
1401, // "p"
MIN_REDUCTION+114, // "h"
452, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
772, // "g"
MIN_REDUCTION+114, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+114, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 1169
104,528, // "f"
  }
,
{ // state 1170
0x80000000|568, // match move
0x80000000|1448, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1171
0x80000000|174, // match move
0x80000000|1203, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1172
2,926, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1173
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+290, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1174
0x80000000|122, // match move
0x80000000|1476, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1175
0x80000000|652, // match move
0x80000000|342, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1176
0x80000000|218, // match move
0x80000000|303, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1177
-1, // $$start
-1, // start
687, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+99, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+99, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+99, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+99, // "u"
1401, // "p"
MIN_REDUCTION+99, // "h"
452, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
772, // "g"
MIN_REDUCTION+99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+99, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 1178
168,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1179
0x80000000|466, // match move
0x80000000|1397, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1180
0x80000000|889, // match move
0x80000000|1017, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1181
91,560, // "l"
  }
,
{ // state 1182
94,275, // "n"
  }
,
{ // state 1183
168,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1184
0x80000000|454, // match move
0x80000000|513, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1185
0x80000000|1289, // match move
0x80000000|309, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1186
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1187
0x80000000|368, // match move
0x80000000|780, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1188
0x80000000|989, // match move
0x80000000|516, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1189
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+233, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 1190
102,62, // "t"
  }
,
{ // state 1191
0x80000000|7, // match move
0x80000000|373, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1192
92,829, // "e"
  }
,
{ // state 1193
0x80000000|491, // match move
0x80000000|854, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1194
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1195
93,992, // "a"
  }
,
{ // state 1196
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+89, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 1197
90,1154, // "o"
  }
,
{ // state 1198
2,212, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1199
152,1183, // ws
154,990, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1200
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1201
152,1183, // ws
154,990, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1202
168,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1203
0x80000000|859, // match move
0x80000000|463, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1204
-1, // $$start
-1, // start
184, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+195, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+195, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+195, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+195, // "u"
1401, // "p"
MIN_REDUCTION+195, // "h"
452, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
772, // "g"
MIN_REDUCTION+195, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+195, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 1205
-1, // $$start
-1, // start
155, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+90, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+90, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+90, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+90, // "u"
1401, // "p"
MIN_REDUCTION+90, // "h"
452, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
772, // "g"
MIN_REDUCTION+90, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+90, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+90, // $
MIN_REDUCTION+90, // $NT
  }
,
{ // state 1206
-1, // $$start
-1, // start
1333, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+257, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1207
168,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1208
0x80000000|217, // match move
0x80000000|419, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1209
152,1183, // ws
154,990, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1210
152,1183, // ws
154,990, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1211
0x80000000|269, // match move
0x80000000|759, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1212
0x80000000|1121, // match move
0x80000000|810, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1213
168,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1214
2,1081, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1215
0x80000000|150, // match move
0x80000000|299, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1216
0x80000000|1, // match move
0x80000000|1473, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|1160, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1218
0x80000000|478, // match move
0x80000000|1036, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1219
0x80000000|1529, // match move
0x80000000|128, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1220
100,1145, // "s"
102,969, // "t"
  }
,
{ // state 1221
152,1183, // ws
154,990, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1222
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+218, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 1223
2,496, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1224
168,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1225
0x80000000|955, // match move
0x80000000|800, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1226
168,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1227
89,248, // "b"
90,248, // "o"
91,248, // "l"
92,248, // "e"
93,248, // "a"
94,248, // "n"
97,248, // "r"
98,248, // "k"
99,248, // "c"
100,248, // "s"
101,248, // "x"
102,248, // "t"
103,248, // "d"
104,248, // "f"
105,248, // "i"
106,248, // "w"
107,248, // "u"
108,248, // "p"
109,248, // "h"
110,248, // "v"
111,248, // "y"
112,248, // "m"
113,248, // "g"
114,248, // "z"
115,248, // "!"
116,248, // "="
117,248, // "%"
118,248, // "&"
119,248, // "("
120,248, // ")"
121,248, // "*"
122,248, // "/"
123,248, // "+"
124,248, // ","
125,248, // "-"
126,248, // "."
127,248, // ":"
128,248, // ";"
129,248, // "<"
130,248, // ">"
131,248, // "["
132,248, // "]"
133,248, // "{"
134,248, // "}"
135,248, // "|"
136,248, // "0"
137,248, // {"1".."9"}
138,248, // "X"
143,248, // "'"
144,1228, // printable
145,248, // '"'
148,248, // "_"
149,248, // {"A".."W" "Y".."Z" "j" "q"}
150,248, // " "
151,248, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1228
0x80000000|1132, // match move
0x80000000|598, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 1229
90,993, // "o"
  }
,
{ // state 1230
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1231
0x80000000|1550, // match move
0x80000000|696, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 1232
-1, // $$start
-1, // start
767, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+237, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+237, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+237, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+237, // "u"
1401, // "p"
MIN_REDUCTION+237, // "h"
452, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
772, // "g"
MIN_REDUCTION+237, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+237, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1233
0x80000000|1417, // match move
0x80000000|809, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1234
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+128, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1235
0x80000000|420, // match move
0x80000000|947, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1236
152,1183, // ws
154,990, // eol
MIN_REDUCTION+173, // (default reduction)
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1237
0x80000000|1480, // match move
0x80000000|588, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1238
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1239
91,1008, // "l"
  }
,
{ // state 1240
2,529, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1241
152,1183, // ws
154,990, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1242
168,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1243
0x80000000|111, // match move
0x80000000|681, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1244
0x80000000|1274, // match move
0x80000000|1066, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1245
152,1183, // ws
154,990, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1246
2,542, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1247
0x80000000|485, // match move
0x80000000|686, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1248
0x80000000|1426, // match move
0x80000000|24, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1249
105,1018, // "i"
  }
,
{ // state 1250
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1251
0x80000000|278, // match move
0x80000000|327, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1252
0x80000000|1363, // match move
0x80000000|797, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1253
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1254
0x80000000|518, // match move
0x80000000|314, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1255
168,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1256
0x80000000|1394, // match move
0x80000000|72, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1257
0x80000000|1041, // match move
0x80000000|1519, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1258
152,1183, // ws
154,990, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1259
97,632, // "r"
  }
,
{ // state 1260
152,1183, // ws
154,990, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1261
152,1183, // ws
154,990, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1262
0x80000000|702, // match move
0x80000000|1370, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1263
-1, // $$start
-1, // start
735, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+204, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+204, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+204, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+204, // "u"
1401, // "p"
MIN_REDUCTION+204, // "h"
452, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
772, // "g"
MIN_REDUCTION+204, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+204, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 1264
152,1183, // ws
154,990, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1265
168,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1266
90,374, // "o"
  }
,
{ // state 1267
2,1486, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1268
0x80000000|389, // match move
0x80000000|571, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1269
152,1183, // ws
154,990, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1270
-1, // $$start
-1, // start
214, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+213, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+213, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+213, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+213, // "u"
1401, // "p"
MIN_REDUCTION+213, // "h"
452, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
772, // "g"
MIN_REDUCTION+213, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+213, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 1271
-1, // $$start
-1, // start
378, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+108, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+108, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+108, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+108, // "u"
1401, // "p"
MIN_REDUCTION+108, // "h"
452, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
772, // "g"
MIN_REDUCTION+108, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+108, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 1272
152,1183, // ws
154,990, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1273
168,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1274
152,1183, // ws
154,990, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1275
0x80000000|1517, // match move
0x80000000|994, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1276
0x80000000|1, // match move
0x80000000|1421, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1277
0x80000000|423, // match move
0x80000000|741, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1278
152,1183, // ws
154,990, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1279
0x80000000|1, // match move
0x80000000|950, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1280
0x80000000|813, // match move
0x80000000|1508, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1281
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+182, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 1282
0x80000000|1286, // match move
0x80000000|308, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1283
2,929, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1284
0x80000000|1242, // match move
0x80000000|225, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1285
168,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1286
152,1183, // ws
154,990, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1287
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+215, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 1288
-1, // $$start
-1, // start
1184, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+138, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+138, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+138, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+138, // "u"
1401, // "p"
MIN_REDUCTION+138, // "h"
452, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
772, // "g"
MIN_REDUCTION+138, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+138, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 1289
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1290
0x80000000|334, // match move
0x80000000|349, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 1291
168,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1292
0x80000000|1100, // match move
0x80000000|1144, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1293
0x80000000|856, // match move
0x80000000|1056, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1294
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1295
91,742, // "l"
  }
,
{ // state 1296
2,212, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1297
168,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1298
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1299
-1, // $$start
-1, // start
194, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+180, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+180, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+180, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+180, // "u"
1401, // "p"
MIN_REDUCTION+180, // "h"
452, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
772, // "g"
MIN_REDUCTION+180, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+180, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 1300
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1301
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+209, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1302
168,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1303
0x80000000|123, // match move
0x80000000|501, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1304
0x80000000|1, // match move
0x80000000|1051, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1305
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+206, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 1306
2,490, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1307
0x80000000|486, // match move
0x80000000|825, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1308
152,1183, // ws
154,990, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1309
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1310
0x80000000|59, // match move
0x80000000|1050, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1311
152,1183, // ws
154,990, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1312
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1313
-1, // $$start
-1, // start
1112, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+240, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+240, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+240, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+240, // "u"
1401, // "p"
MIN_REDUCTION+240, // "h"
452, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
772, // "g"
MIN_REDUCTION+240, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+240, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 1314
152,1183, // ws
154,990, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1315
168,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1316
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+107, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1317
2,1079, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1318
0x80000000|1524, // match move
0x80000000|593, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1319
0x80000000|380, // match move
0x80000000|1450, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1320
0x80000000|559, // match move
0x80000000|527, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1321
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1322
0x80000000|346, // match move
0x80000000|1433, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1323
0x80000000|1042, // match move
0x80000000|1506, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1324
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1325
2,1014, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1326
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+315, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+315, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+315, // $
-1, // $NT
  }
,
{ // state 1327
-1, // $$start
-1, // start
506, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+129, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+129, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+129, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+129, // "u"
1401, // "p"
MIN_REDUCTION+129, // "h"
452, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
772, // "g"
MIN_REDUCTION+129, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+129, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 1328
2,583, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1329
0x80000000|974, // match move
0x80000000|1255, // no-match move
// T-test match for 10:
158,
  }
,
{ // state 1330
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1331
168,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1332
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+131, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1333
0x80000000|863, // match move
0x80000000|853, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1334
93,697, // "a"
  }
,
{ // state 1335
92,679, // "e"
  }
,
{ // state 1336
152,1183, // ws
154,990, // eol
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1337
168,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1338
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+307, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+307, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1339
105,1347, // "i"
109,1403, // "h"
  }
,
{ // state 1340
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1341
168,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1342
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1343
-1, // $$start
-1, // start
-1, // ws*
695, // $$0
441, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
-1, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
619, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1344
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1345
92,1156, // "e"
  }
,
{ // state 1346
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1347
102,383, // "t"
  }
,
{ // state 1348
145,894, // '"'
  }
,
{ // state 1349
168,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1350
0x80000000|768, // match move
0x80000000|456, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1351
152,1183, // ws
154,990, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1352
0x80000000|1340, // match move
0x80000000|671, // no-match move
0x80000000|361, // NT-test-match state for printable
  }
,
{ // state 1353
0x80000000|1, // match move
0x80000000|991, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1354
168,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1355
0x80000000|591, // match move
0x80000000|898, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1356
152,1183, // ws
154,990, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1357
0x80000000|1047, // match move
0x80000000|1542, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1358
0x80000000|1201, // match move
0x80000000|1368, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1359
152,1183, // ws
154,990, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1360
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1361
-1, // $$start
-1, // start
1081, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
MIN_REDUCTION+285, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+285, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 1362
0x80000000|1460, // match move
0x80000000|554, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1363
152,1183, // ws
154,990, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1364
152,1183, // ws
154,990, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1365
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1366
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1367
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1368
0x80000000|64, // match move
0x80000000|182, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1369
168,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1370
-1, // $$start
-1, // start
1505, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+117, // "o"
1484, // "l"
819, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+117, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+117, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+117, // "u"
1401, // "p"
MIN_REDUCTION+117, // "h"
452, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
772, // "g"
MIN_REDUCTION+117, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+117, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 1371
152,1183, // ws
154,990, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1372
0x80000000|238, // match move
0x80000000|1310, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1373
99,612, // "c"
  }
,
{ // state 1374
0x80000000|1351, // match move
0x80000000|786, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1375
114,390, // "z"
  }
,
{ // state 1376
152,1183, // ws
154,990, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1377
92,794, // "e"
  }
,
{ // state 1378
102,802, // "t"
  }
,
{ // state 1379
152,1183, // ws
154,990, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1380
0x80000000|1091, // match move
0x80000000|726, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1381
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1382
0x80000000|1311, // match move
0x80000000|983, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1383
0x80000000|1309, // match move
0x80000000|502, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1384
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1385
0x80000000|46, // match move
0x80000000|226, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1386
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1387
0x80000000|1, // match move
0x80000000|1537, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1388
152,1183, // ws
154,990, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1389
168,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1390
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1391
0x80000000|531, // match move
0x80000000|408, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1392
168,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1393
152,1183, // ws
154,990, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1394
2,1070, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1395
168,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1396
152,1183, // ws
154,990, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1397
0x80000000|1214, // match move
0x80000000|222, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1398
0x80000000|107, // match move
0x80000000|1468, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1399
0x80000000|158, // match move
0x80000000|147, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1400
2,155, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1401
93,1067, // "a"
97,86, // "r"
107,904, // "u"
  }
,
{ // state 1402
0x80000000|1113, // match move
0x80000000|1435, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1403
105,447, // "i"
  }
,
{ // state 1404
152,1183, // ws
154,990, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1405
104,400, // "f"
  }
,
{ // state 1406
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+258, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 1407
0x80000000|965, // match move
0x80000000|770, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1408
0x80000000|982, // match move
0x80000000|777, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1409
90,22, // "o"
97,219, // "r"
111,224, // "y"
  }
,
{ // state 1410
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+167, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1411
2,469, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1412
152,1183, // ws
154,990, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1413
152,1183, // ws
154,990, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1414
100,442, // "s"
  }
,
{ // state 1415
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1416
0x80000000|609, // match move
0x80000000|968, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1417
2,277, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1418
0x80000000|1538, // match move
0x80000000|892, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1419
152,1183, // ws
154,990, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1420
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1421
0x80000000|1532, // match move
0x80000000|836, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1422
168,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1423
94,978, // "n"
104,1515, // "f"
112,1146, // "m"
  }
,
{ // state 1424
93,1446, // "a"
97,740, // "r"
109,635, // "h"
  }
,
{ // state 1425
152,1183, // ws
154,990, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1426
152,1183, // ws
154,990, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1427
168,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1428
0x80000000|585, // match move
0x80000000|425, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1429
0x80000000|418, // match move
0x80000000|1268, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1430
0x80000000|1046, // match move
0x80000000|757, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1431
0x80000000|900, // match move
0x80000000|1263, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1432
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1433
0x80000000|443, // match move
0x80000000|341, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1434
168,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1435
0x80000000|763, // match move
0x80000000|68, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1436
152,1183, // ws
154,990, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1437
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+268, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1438
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1439
0x80000000|932, // match move
0x80000000|492, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1440
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1441
0x80000000|778, // match move
0x80000000|552, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1442
90,688, // "o"
  }
,
{ // state 1443
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1444
0x80000000|1029, // match move
0x80000000|690, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1445
2,514, // ws*
150,847, // " "
152,1461, // ws
153,847, // {9}
154,990, // eol
158,1514, // {10}
159,1329, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1446
102,95, // "t"
  }
,
{ // state 1447
-1, // $$start
-1, // start
959, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+287, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1448
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+140, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 1449
152,1183, // ws
154,990, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1450
0x80000000|710, // match move
0x80000000|112, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1451
0x80000000|1016, // match move
0x80000000|1535, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1452
168,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1453
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1454
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1455
168,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1456
0x80000000|957, // match move
0x80000000|785, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1457
-1, // $$start
-1, // start
1486, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+186, // "o"
604, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+186, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+186, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+186, // "u"
1401, // "p"
MIN_REDUCTION+186, // "h"
452, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
772, // "g"
MIN_REDUCTION+186, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+186, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 1458
0x80000000|748, // match move
0x80000000|75, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1459
168,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1460
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1461
168,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1462
103,879, // "d"
  }
,
{ // state 1463
152,1183, // ws
154,990, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1464
89,1044, // "b"
90,1044, // "o"
91,1044, // "l"
92,1044, // "e"
93,1044, // "a"
94,1044, // "n"
97,1044, // "r"
98,1044, // "k"
99,1044, // "c"
100,1044, // "s"
101,1044, // "x"
102,1044, // "t"
103,1044, // "d"
104,1044, // "f"
105,1044, // "i"
106,1044, // "w"
107,1044, // "u"
108,1044, // "p"
109,1044, // "h"
110,1044, // "v"
111,1044, // "y"
112,1044, // "m"
113,1044, // "g"
114,1044, // "z"
136,197, // "0"
137,197, // {"1".."9"}
138,1044, // "X"
142,350, // digit
147,1291, // letter
148,1167, // "_"
149,1044, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1465
0x80000000|1, // match move
0x80000000|1552, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1466
0x80000000|1240, // match move
0x80000000|1527, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1467
0x80000000|1, // match move
0x80000000|1431, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1468
0x80000000|840, // match move
0x80000000|250, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1469
0x80000000|1419, // match move
0x80000000|1284, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1470
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+288, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1471
168,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1472
102,1516, // "t"
106,744, // "w"
107,117, // "u"
109,1266, // "h"
111,1032, // "y"
  }
,
{ // state 1473
0x80000000|980, // match move
0x80000000|1168, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1474
2,490, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1475
102,642, // "t"
  }
,
{ // state 1476
-1, // $$start
-1, // start
700, // ws*
-1, // $$0
MIN_REDUCTION+337, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+337, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+337, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+337, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+337, // "u"
1401, // "p"
MIN_REDUCTION+337, // "h"
452, // "v"
MIN_REDUCTION+337, // "y"
MIN_REDUCTION+337, // "m"
772, // "g"
MIN_REDUCTION+337, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+337, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+337, // {"1".."9"}
MIN_REDUCTION+337, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+337, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
1166, // idChar**
1420, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
1225, // idChar*
MIN_REDUCTION+337, // $
-1, // $NT
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1477
2,194, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1478
0x80000000|1, // match move
0x80000000|1445, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1479
152,1183, // ws
154,990, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1480
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1481
-1, // $$start
-1, // start
1014, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+147, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+147, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+147, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+147, // "u"
1401, // "p"
MIN_REDUCTION+147, // "h"
452, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
772, // "g"
MIN_REDUCTION+147, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+147, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 1482
152,1183, // ws
154,990, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1483
0x80000000|1, // match move
0x80000000|1559, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1484
90,169, // "o"
  }
,
{ // state 1485
92,716, // "e"
  }
,
{ // state 1486
0x80000000|704, // match move
0x80000000|523, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1487
0x80000000|1086, // match move
0x80000000|1275, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1488
0x80000000|360, // match move
0x80000000|1186, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1489
2,277, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1490
168,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1491
168,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1492
97,432, // "r"
109,635, // "h"
  }
,
{ // state 1493
0x80000000|1489, // match move
0x80000000|1000, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1494
152,1183, // ws
154,990, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1495
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+179, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 1496
168,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1497
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1498
100,576, // "s"
  }
,
{ // state 1499
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1500
2,369, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1501
0x80000000|484, // match move
0x80000000|281, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1502
0x80000000|617, // match move
0x80000000|1338, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1503
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1504
168,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1505
0x80000000|761, // match move
0x80000000|242, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1506
0x80000000|1273, // match move
0x80000000|582, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1507
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1508
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+143, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 1509
152,1183, // ws
154,990, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1510
-1, // $$start
-1, // start
26, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+207, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+207, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+207, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+207, // "u"
1401, // "p"
MIN_REDUCTION+207, // "h"
452, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
772, // "g"
MIN_REDUCTION+207, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+207, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 1511
168,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1512
92,467, // "e"
93,517, // "a"
107,1295, // "u"
  }
,
{ // state 1513
93,613, // "a"
  }
,
{ // state 1514
168,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1515
0x80000000|1, // match move
0x80000000|1458, // no-match move
0x80000000|1464, // NT-test-match state for idChar
  }
,
{ // state 1516
93,1446, // "a"
97,1249, // "r"
  }
,
{ // state 1517
2,769, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1518
168,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1519
0x80000000|1520, // match move
0x80000000|1006, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1520
2,1235, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1521
0x80000000|1260, // match move
0x80000000|1064, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1522
2,398, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1523
152,1183, // ws
154,990, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1524
168,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1525
94,600, // "n"
  }
,
{ // state 1526
91,515, // "l"
  }
,
{ // state 1527
-1, // $$start
-1, // start
529, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+265, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1528
152,1183, // ws
154,990, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1529
2,1244, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1530
97,170, // "r"
  }
,
{ // state 1531
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+309, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+309, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 1532
2,913, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1533
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1534
152,1183, // ws
154,990, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1535
0x80000000|477, // match move
0x80000000|114, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1536
0x80000000|771, // match move
0x80000000|570, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1537
0x80000000|850, // match move
0x80000000|1288, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1538
121,71, // "*"
154,8, // eol
157,1366, // commentContent
  }
,
{ // state 1539
0x80000000|1364, // match move
0x80000000|1180, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1540
3,695, // $$0
4,441, // token
58,602, // `!
59,639, // `!=
60,1200, // `%
61,1075, // `&&
63,1102, // `(
64,1346, // `)
65,595, // `{
66,683, // `}
67,628, // `-
68,10, // `+
69,488, // `=
70,1300, // `==
71,124, // `[
72,590, // `]
73,608, // `||
74,462, // `<
75,94, // `<=
76,756, // `,
77,1238, // `>
78,822, // `>=
79,106, // `.
80,862, // `;
81,674, // `++
82,1324, // `--
83,884, // `/
84,548, // `:
85,367, // ID
86,1020, // INTLIT
87,132, // STRINGLIT
88,1454, // CHARLIT
136,1441, // "0"
147,495, // letter
152,1183, // ws
154,990, // eol
162,619, // token*
  }
,
{ // state 1541
2,1079, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1542
0x80000000|646, // match move
0x80000000|1437, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 1543
0x80000000|1030, // match move
0x80000000|1327, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1544
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+304, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
367, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
99, // "b"
99, // "o"
99, // "l"
99, // "e"
99, // "a"
99, // "n"
-1, // idChar
-1, // reserved
99, // "r"
99, // "k"
99, // "c"
99, // "s"
99, // "x"
99, // "t"
99, // "d"
99, // "f"
99, // "i"
99, // "w"
99, // "u"
99, // "p"
99, // "h"
99, // "v"
99, // "y"
99, // "m"
99, // "g"
99, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+304, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
306, // "0"
306, // {"1".."9"}
99, // "X"
986, // intLit2
-1, // `x
1312, // digit++
787, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
495, // letter
-1, // "_"
99, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1183, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 1545
152,1183, // ws
154,990, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1546
2,1235, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1547
-1, // $$start
-1, // start
319, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
865, // `boolean
1149, // `class
867, // `extends
4, // `void
187, // `int
951, // `while
1453, // `if
1253, // `else
1062, // `for
323, // `break
157, // `this
126, // `false
1344, // `true
1321, // `super
36, // `null
79, // `return
607, // `instanceof
1503, // `new
581, // `abstract
1438, // `assert
1155, // `byte
286, // `case
1159, // `catch
995, // `char
279, // `const
1098, // `continue
1087, // `default
1415, // `do
118, // `double
40, // `enum
455, // `final
1360, // `finally
445, // `float
137, // `goto
1499, // `implements
793, // `import
933, // `interface
1037, // `long
1386, // `native
1443, // `package
1365, // `private
403, // `protected
565, // `public
1533, // `short
480, // `static
618, // `strictfp
77, // `switch
245, // `synchronized
1069, // `throw
1194, // `throws
201, // `transient
392, // `try
522, // `volatile
602, // `!
639, // `!=
1200, // `%
1075, // `&&
-1, // `*
1102, // `(
1346, // `)
595, // `{
683, // `}
628, // `-
10, // `+
488, // `=
1300, // `==
124, // `[
590, // `]
608, // `||
462, // `<
94, // `<=
756, // `,
1238, // `>
822, // `>=
106, // `.
862, // `;
674, // `++
1324, // `--
884, // `/
548, // `:
-1, // ID
1020, // INTLIT
132, // STRINGLIT
1454, // CHARLIT
1409, // "b"
MIN_REDUCTION+159, // "o"
1484, // "l"
1001, // "e"
1558, // "a"
1512, // "n"
-1, // idChar
-1, // reserved
961, // "r"
MIN_REDUCTION+159, // "k"
489, // "c"
1472, // "s"
MIN_REDUCTION+159, // "x"
1492, // "t"
377, // "d"
208, // "f"
1423, // "i"
37, // "w"
MIN_REDUCTION+159, // "u"
1401, // "p"
MIN_REDUCTION+159, // "h"
452, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
772, // "g"
MIN_REDUCTION+159, // "z"
569, // "!"
1179, // "="
58, // "%"
240, // "&"
96, // "("
709, // ")"
MIN_REDUCTION+159, // "*"
680, // "/"
1059, // "+"
638, // ","
1429, // "-"
183, // "."
1193, // ":"
1165, // ";"
1416, // "<"
596, // ">"
1451, // "["
1557, // "]"
192, // "{"
78, // "}"
672, // "|"
1441, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
724, // "'"
-1, // printable
1078, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
847, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1461, // ws
847, // {9}
990, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1514, // {10}
1329, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
-1, // idChar*
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 1548
0x80000000|141, // match move
0x80000000|928, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1549
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1550
89,248, // "b"
90,248, // "o"
91,248, // "l"
92,248, // "e"
93,248, // "a"
94,248, // "n"
97,248, // "r"
98,248, // "k"
99,248, // "c"
100,248, // "s"
101,248, // "x"
102,248, // "t"
103,248, // "d"
104,248, // "f"
105,248, // "i"
106,248, // "w"
107,248, // "u"
108,248, // "p"
109,248, // "h"
110,248, // "v"
111,248, // "y"
112,248, // "m"
113,248, // "g"
114,248, // "z"
115,248, // "!"
116,248, // "="
117,248, // "%"
118,248, // "&"
119,248, // "("
120,248, // ")"
121,248, // "*"
122,248, // "/"
123,248, // "+"
124,248, // ","
125,248, // "-"
126,248, // "."
127,248, // ":"
128,248, // ";"
129,248, // "<"
130,248, // ">"
131,248, // "["
132,248, // "]"
133,248, // "{"
134,248, // "}"
135,248, // "|"
136,248, // "0"
137,248, // {"1".."9"}
138,248, // "X"
143,248, // "'"
144,1352, // printable
145,248, // '"'
148,248, // "_"
149,248, // {"A".."W" "Y".."Z" "j" "q"}
150,248, // " "
151,248, // {"#".."$" "?".."@" "\" "^" "`" "~"}
155,1090, // printable**
163,321, // printable*
  }
,
{ // state 1551
3,695, // $$0
4,441, // token
5,865, // `boolean
6,1149, // `class
7,867, // `extends
8,4, // `void
9,187, // `int
10,951, // `while
11,1453, // `if
12,1253, // `else
13,1062, // `for
14,323, // `break
15,157, // `this
16,126, // `false
17,1344, // `true
18,1321, // `super
19,36, // `null
20,79, // `return
21,607, // `instanceof
22,1503, // `new
23,581, // `abstract
24,1438, // `assert
25,1155, // `byte
26,286, // `case
27,1159, // `catch
28,995, // `char
29,279, // `const
30,1098, // `continue
31,1087, // `default
32,1415, // `do
33,118, // `double
34,40, // `enum
35,455, // `final
36,1360, // `finally
37,445, // `float
38,137, // `goto
39,1499, // `implements
40,793, // `import
41,933, // `interface
42,1037, // `long
43,1386, // `native
44,1443, // `package
45,1365, // `private
46,403, // `protected
47,565, // `public
48,1533, // `short
49,480, // `static
50,618, // `strictfp
51,77, // `switch
52,245, // `synchronized
53,1069, // `throw
54,1194, // `throws
55,201, // `transient
56,392, // `try
57,522, // `volatile
162,619, // token*
  }
,
{ // state 1552
0x80000000|537, // match move
0x80000000|1076, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1553
0x80000000|658, // match move
0x80000000|402, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1554
2,277, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1555
2,687, // ws*
152,1461, // ws
154,990, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1556
152,1183, // ws
154,990, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1557
0x80000000|996, // match move
0x80000000|1487, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1558
89,1414, // "b"
100,344, // "s"
  }
,
{ // state 1559
0x80000000|730, // match move
0x80000000|234, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1560][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= `:
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(96<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(96<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(96<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(96<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(96<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(96<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(96<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(96<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(96<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(96<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(96<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(96<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(96<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(96<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(96<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(96<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(96<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(96<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(96<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(96<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(96<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(96<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(96<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(96<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(96<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(96<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(96<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(96<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(96<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(96<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(96<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(96<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(96<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(96<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(96<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(96<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(96<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(96<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(96<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(96<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(96<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(96<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(96<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(96<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(96<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(96<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(96<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(96<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(96<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(96<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(96<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(96<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(96<<16)+1,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `* ::= "*" !"/" ws*
(62<<16)+2,
// `* ::= "*" !"/"
(62<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `/ ::= !"*" "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= !"*" "/" !{"*" "/"}
(83<<16)+1,
// `: ::= ":" ws*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// INTLIT ::= "0" !{"0".."9" "X" "x"} ws*
(86<<16)+2,
// INTLIT ::= "0" !{"0".."9" "X" "x"}
(86<<16)+1,
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// `x ::= {"X" "x"}
(140<<16)+1,
// INTLIT ::= "0" `x digit++ ws*
(86<<16)+4,
// INTLIT ::= "0" `x digit++
(86<<16)+3,
// INTLIT ::= "0" digit++ ws*
(86<<16)+3,
// INTLIT ::= "0" digit++
(86<<16)+2,
// intLit2 ::= !"0" digit++
(139<<16)+1,
// digit ::= {"0".."9"}
(142<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' printable++ '"' ws*
(87<<16)+4,
// STRINGLIT ::= '"' printable++ '"'
(87<<16)+3,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(147<<16)+1,
// printable ::= {" ".."~"}
(144<<16)+1,
// ws ::= {9 " "}
(152<<16)+1,
// ws ::= eol
(152<<16)+1,
// ws ::= "/" "/" printable** eol
(152<<16)+4,
// ws ::= "/" "/" !printable eol
(152<<16)+3,
// ws ::= "/" "*" commentContent* "*" "/"
(152<<16)+5,
// ws ::= "/" "*" "*" "/"
(152<<16)+4,
// commentContent ::= "*" !"/"
(157<<16)+1,
// commentContent ::= !"*" printable
(157<<16)+1,
// commentContent ::= eol
(157<<16)+1,
// eol ::= {10}
(154<<16)+1,
// eol ::= {13} {10}
(154<<16)+2,
// eol ::= {13} !10
(154<<16)+1,
// ID ::= !reserved letter idChar** $$1
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$1
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// token* ::= token* token
(162<<16)+2,
// token* ::= token
(162<<16)+1,
// printable** ::= printable* !printable
(155<<16)+1,
// printable++ ::= printable+ !printable
(146<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// commentContent* ::= commentContent* commentContent
(156<<16)+2,
// commentContent* ::= commentContent
(156<<16)+1,
// idChar** ::= idChar* !idChar
(160<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(165<<16)+1,
// digit+ ::= digit+ digit
(165<<16)+2,
// printable* ::= printable* printable
(163<<16)+2,
// printable* ::= printable
(163<<16)+1,
// idChar* ::= idChar* idChar
(166<<16)+2,
// idChar* ::= idChar
(166<<16)+1,
// printable+ ::= printable
(164<<16)+1,
// printable+ ::= printable+ printable
(164<<16)+2,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
(161<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
153, // 9
158, // 10
-1, // 11
-1, // 12
159, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
150, // " "
115, // "!"
145, // '"'
151, // "#"
151, // "$"
117, // "%"
118, // "&"
143, // "'"
119, // "("
120, // ")"
121, // "*"
123, // "+"
124, // ","
125, // "-"
126, // "."
122, // "/"
136, // "0"
137, // "1"
137, // "2"
137, // "3"
137, // "4"
137, // "5"
137, // "6"
137, // "7"
137, // "8"
137, // "9"
127, // ":"
128, // ";"
129, // "<"
116, // "="
130, // ">"
151, // "?"
151, // "@"
149, // "A"
149, // "B"
149, // "C"
149, // "D"
149, // "E"
149, // "F"
149, // "G"
149, // "H"
149, // "I"
149, // "J"
149, // "K"
149, // "L"
149, // "M"
149, // "N"
149, // "O"
149, // "P"
149, // "Q"
149, // "R"
149, // "S"
149, // "T"
149, // "U"
149, // "V"
149, // "W"
138, // "X"
149, // "Y"
149, // "Z"
131, // "["
151, // "\"
132, // "]"
151, // "^"
148, // "_"
151, // "`"
93, // "a"
89, // "b"
99, // "c"
103, // "d"
92, // "e"
104, // "f"
113, // "g"
109, // "h"
105, // "i"
149, // "j"
98, // "k"
91, // "l"
112, // "m"
94, // "n"
90, // "o"
108, // "p"
149, // "q"
97, // "r"
100, // "s"
102, // "t"
107, // "u"
110, // "v"
106, // "w"
101, // "x"
111, // "y"
114, // "z"
133, // "{"
135, // "|"
134, // "}"
151, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # `:", // 84
"token ::= # ID", // 85
"token ::= # INTLIT", // 86
"token ::= # STRINGLIT", // 87
"token ::= # CHARLIT", // 88
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 89
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 90
"reserved ::= `boolean", // 91
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 92
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 93
"reserved ::= `break", // 94
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 95
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 96
"reserved ::= `class", // 97
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 98
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 99
"reserved ::= `else", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 102
"reserved ::= `extends", // 103
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 104
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 105
"reserved ::= `false", // 106
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 107
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 108
"reserved ::= `for", // 109
"`if ::= \"i\" \"f\" !idChar ws*", // 110
"`if ::= \"i\" \"f\" !idChar ws*", // 111
"reserved ::= `if", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 114
"reserved ::= `instanceof", // 115
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 116
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 117
"reserved ::= `int", // 118
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 119
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 120
"reserved ::= `new", // 121
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 122
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 123
"reserved ::= `null", // 124
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 125
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 126
"reserved ::= `public", // 127
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 128
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 129
"reserved ::= `return", // 130
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 131
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 132
"reserved ::= `super", // 133
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 134
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 135
"reserved ::= `switch", // 136
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 137
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 138
"reserved ::= `this", // 139
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 140
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 141
"reserved ::= `true", // 142
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 143
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 144
"reserved ::= `void", // 145
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 146
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 147
"reserved ::= `while", // 148
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 149
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 150
"reserved ::= `abstract", // 151
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 152
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 153
"reserved ::= `assert", // 154
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 155
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 156
"reserved ::= `byte", // 157
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 158
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 159
"reserved ::= `case", // 160
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 161
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 162
"reserved ::= `catch", // 163
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 164
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 165
"reserved ::= `char", // 166
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 167
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 168
"reserved ::= `const", // 169
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 170
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 171
"reserved ::= `continue", // 172
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 173
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 174
"reserved ::= `default", // 175
"`do ::= \"d\" \"o\" !idChar ws*", // 176
"`do ::= \"d\" \"o\" !idChar ws*", // 177
"reserved ::= `do", // 178
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 179
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 180
"reserved ::= `double", // 181
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 182
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 183
"reserved ::= `enum", // 184
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 185
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 186
"reserved ::= `final", // 187
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 188
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 189
"reserved ::= `finally", // 190
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 191
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 192
"reserved ::= `float", // 193
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 194
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 195
"reserved ::= `goto", // 196
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 197
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 198
"reserved ::= `implements", // 199
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 200
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 201
"reserved ::= `import", // 202
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 203
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 204
"reserved ::= `interface", // 205
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 206
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 207
"reserved ::= `long", // 208
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 209
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 210
"reserved ::= `native", // 211
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 212
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 213
"reserved ::= `package", // 214
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 215
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 216
"reserved ::= `private", // 217
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 218
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 219
"reserved ::= `protected", // 220
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 221
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 222
"reserved ::= `short", // 223
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 224
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 225
"reserved ::= `static", // 226
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 227
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 228
"reserved ::= `strictfp", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 231
"reserved ::= `synchronized", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 234
"reserved ::= `throw", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 237
"reserved ::= `throws", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 240
"reserved ::= `transient", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 243
"reserved ::= `try", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 246
"reserved ::= `volatile", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`! ::= \"!\" !\"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`!= ::= \"!\" \"=\" ws*", // 251
"`% ::= \"%\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`&& ::= \"&\" \"&\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`( ::= \"(\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`) ::= \")\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`* ::= \"*\" !\"/\" ws*", // 260
"`* ::= \"*\" !\"/\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`+ ::= \"+\" !\"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`++ ::= \"+\" \"+\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`, ::= \",\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`- ::= \"-\" !\"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`-- ::= \"-\" \"-\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`. ::= \".\" ws*", // 273
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 274
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 275
"`: ::= \":\" ws*", // 276
"`: ::= \":\" ws*", // 277
"`; ::= \";\" ws*", // 278
"`; ::= \";\" ws*", // 279
"`< ::= \"<\" !\"=\" ws*", // 280
"`< ::= \"<\" !\"=\" ws*", // 281
"`<= ::= \"<\" \"=\" ws*", // 282
"`<= ::= \"<\" \"=\" ws*", // 283
"`= ::= \"=\" !\"=\" ws*", // 284
"`= ::= \"=\" !\"=\" ws*", // 285
"`== ::= \"=\" \"=\" ws*", // 286
"`== ::= \"=\" \"=\" ws*", // 287
"`> ::= \">\" !\"=\" ws*", // 288
"`> ::= \">\" !\"=\" ws*", // 289
"`>= ::= \">\" \"=\" ws*", // 290
"`>= ::= \">\" \"=\" ws*", // 291
"`[ ::= \"[\" ws*", // 292
"`[ ::= \"[\" ws*", // 293
"`] ::= \"]\" ws*", // 294
"`] ::= \"]\" ws*", // 295
"`{ ::= \"{\" ws*", // 296
"`{ ::= \"{\" ws*", // 297
"`} ::= \"}\" ws*", // 298
"`} ::= \"}\" ws*", // 299
"`|| ::= \"|\" \"|\" ws*", // 300
"`|| ::= \"|\" \"|\" ws*", // 301
"INTLIT ::= # \"0\" !{\"0\"..\"9\" \"X\" \"x\"} ws*", // 302
"INTLIT ::= # \"0\" !{\"0\"..\"9\" \"X\" \"x\"} ws*", // 303
"INTLIT ::= # intLit2 ws*", // 304
"INTLIT ::= # intLit2 ws*", // 305
"`x ::= {\"X\" \"x\"}", // 306
"INTLIT ::= # \"0\" `x digit++ ws*", // 307
"INTLIT ::= # \"0\" `x digit++ ws*", // 308
"INTLIT ::= # \"0\" digit++ ws*", // 309
"INTLIT ::= # \"0\" digit++ ws*", // 310
"intLit2 ::= !\"0\" digit++", // 311
"digit ::= {\"0\"..\"9\"}", // 312
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 313
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 314
"STRINGLIT ::= # \'\"\' printable++ \'\"\' ws*", // 315
"STRINGLIT ::= # \'\"\' printable++ \'\"\' ws*", // 316
"idChar ::= letter", // 317
"idChar ::= digit", // 318
"idChar ::= \"_\"", // 319
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 320
"printable ::= {\" \"..\"~\"}", // 321
"ws ::= {9 \" \"}", // 322
"ws ::= eol", // 323
"ws ::= \"/\" \"/\" printable** eol", // 324
"ws ::= \"/\" \"/\" printable** eol", // 325
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 326
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 327
"commentContent ::= \"*\" !\"/\"", // 328
"commentContent ::= !\"*\" printable", // 329
"commentContent ::= eol", // 330
"eol ::= {10} registerNewline", // 331
"eol ::= {13} {10} registerNewline", // 332
"eol ::= {13} !10 registerNewline", // 333
"ID ::= !reserved letter idChar** ws*", // 334
"ID ::= !reserved letter idChar** ws*", // 335
"ID ::= !reserved letter idChar** ws*", // 336
"ID ::= !reserved letter idChar** ws*", // 337
"token* ::= token* token", // 338
"token* ::= token* token", // 339
"printable** ::= printable* !printable", // 340
"printable++ ::= printable+ !printable", // 341
"digit++ ::= digit+ !digit", // 342
"commentContent* ::= commentContent* commentContent", // 343
"commentContent* ::= commentContent* commentContent", // 344
"idChar** ::= idChar* !idChar", // 345
"ws* ::= ws* ws", // 346
"ws* ::= ws* ws", // 347
"digit+ ::= digit", // 348
"digit+ ::= digit+ digit", // 349
"printable* ::= printable* printable", // 350
"printable* ::= printable* printable", // 351
"idChar* ::= idChar* idChar", // 352
"idChar* ::= idChar* idChar", // 353
"printable+ ::= printable", // 354
"printable+ ::= printable+ printable", // 355
"", // 356
"", // 357
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 90: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 91: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 92: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 93: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 94: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 96: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 97: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 98: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 99: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 100: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 102: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 103: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 104: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 105: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 106: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 110: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: `if ::= "i" "f" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 114: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 115: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 116: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 119: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 122: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 123: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 124: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 125: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 126: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 127: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 128: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 129: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 130: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 131: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 132: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 133: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 134: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 135: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 136: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 137: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 138: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 139: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 140: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 141: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 142: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 143: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 144: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 145: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 146: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 147: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 148: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 149: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 150: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 151: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 152: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 153: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 154: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 155: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 156: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 157: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 158: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 159: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 160: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 161: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 162: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 163: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 164: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 165: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 166: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 167: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 168: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 169: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 170: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 171: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 172: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 173: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 174: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 175: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 176: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `do ::= "d" "o" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 179: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 180: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 181: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 182: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 183: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 184: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 185: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 186: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 187: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 189: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 190: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 191: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 192: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 193: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 194: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 195: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 196: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 197: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 198: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 199: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 201: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 202: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 204: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 205: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 207: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 208: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 210: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 211: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 213: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 214: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 215: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 216: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 217: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 218: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 219: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 220: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 222: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 223: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 225: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 226: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 228: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 229: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 231: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 232: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 234: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 235: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 237: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 238: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 240: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 241: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 244: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 247: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `! ::= "!" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `!= ::= "!" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 252: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `&& ::= "&" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `* ::= "*" !"/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `+ ::= "+" !"+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `++ ::= "+" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 266: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `-- ::= "-" "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `. ::= "." [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `: ::= ":" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `< ::= "<" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 283: `<= ::= "<" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `= ::= "=" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 287: `== ::= "=" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 291: `>= ::= ">" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 292: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 301: `|| ::= "|" "|" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 302: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} ws* @zero(int,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} [ws*] @zero(int,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 306: `x ::= {"X" "x"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 307: INTLIT ::= [#] "0" `x digit++ ws* @convertHexToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: INTLIT ::= [#] "0" `x digit++ [ws*] @convertHexToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: INTLIT ::= [#] "0" digit++ ws* @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: INTLIT ::= [#] "0" digit++ [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 311: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 312: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 314: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 315: STRINGLIT ::= [#] '"' printable++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 316: STRINGLIT ::= [#] '"' printable++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 317: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 318: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 319: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 321: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 322: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 323: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 324: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 325: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 326: ws ::= "/" "*" commentContent* "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 327: ws ::= "/" "*" [commentContent*] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 328: commentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 329: commentContent ::= !"*" printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 330: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: eol ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 332: eol ::= {13} {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 333: eol ::= {13} !10 [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 334: ID ::= !reserved letter idChar** $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 335: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 336: ID ::= !reserved letter !idChar [idChar**] $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 337: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 338: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 340: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: printable++ ::= printable+ !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 345: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 347: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 348: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 349: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 352: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: printable+ ::= printable @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 355: printable+ ::= printable+ printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 356: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 357: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "commentContent* ::=", // commentContent*
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // commentContent*
    },
    { // start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // ws*
    },
    { // idChar**
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawColon(parm0);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.zero(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertHexToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertOctalToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 89: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 90: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 91: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void sawColon(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int zero(int,char)",
"int convertToInt(int,String)",
"int convertHexToInt(int,Character,List<Character>)",
"int convertOctalToInt(int,Character,List<Character>)",
"int printableToAscii(int,char,char,char)",
"String charsToStringLiteral(int,char,List<Character>,char)",
"String sequenceToIdentifier(Character,List<Character>)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
2,1,
3,1,
3,1,
4,1,
4,1,
2,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    1,
    1,
    -1,
    1,
    -1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    0,
    1,
    0,
    0,
    -1,
    -1,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
