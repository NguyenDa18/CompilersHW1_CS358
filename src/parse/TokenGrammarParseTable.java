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
public int getEofSym() { return 168; }
public int getNttSym() { return 169; }
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
"NESTEDCOMMENT",
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
"intLit2",
"\"0\"",
"digit++",
"digit",
"{\"1\"..\"9\"}",
"\"\'\"",
"printable",
"\'\"\'",
"idChar++",
"letter",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"ws",
"9",
"eol",
"printable**",
"10",
"13",
"$$1",
"idChar**",
"$$2",
"token*",
"printable*",
"digit+",
"idChar+",
"idChar*",
"$$3",
"$$4",
"$$5",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 170;}
private static final int MIN_REDUCTION = 1510;
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
0x80000000|290, // match move
0x80000000|488, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1166, // match move
0x80000000|851, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 3
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,412, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
158,347, // idChar**
164,868, // idChar*
  }
,
{ // state 4
0x80000000|909, // match move
0x80000000|1409, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 5
-1, // $$start
-1, // start
248, // ws*
-1, // $$0
MIN_REDUCTION+145, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+145, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+145, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+145, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+145, // "u"
1193, // "p"
MIN_REDUCTION+145, // "h"
899, // "v"
MIN_REDUCTION+145, // "y"
MIN_REDUCTION+145, // "m"
9, // "g"
MIN_REDUCTION+145, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+145, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+145, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+145, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+145, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 6
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+204, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 7
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 8
2,996, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 9
91,1209, // "o"
  }
,
{ // state 10
2,399, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 11
151,802, // ws
153,456, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 12
0x80000000|1024, // match move
0x80000000|1119, // no-match move
0x80000000|47, // NT-test-match state for digit
  }
,
{ // state 13
2,1316, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 14
2,706, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 15
110,1372, // "h"
  }
,
{ // state 16
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 17
110,154, // "h"
  }
,
{ // state 18
0x80000000|914, // match move
0x80000000|1113, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 19
151,802, // ws
153,456, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 20
0x80000000|351, // match move
0x80000000|1008, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 21
0x80000000|532, // match move
0x80000000|817, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 22
-1, // $$start
-1, // start
1160, // ws*
-1, // $$0
MIN_REDUCTION+229, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+229, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+229, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+229, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+229, // "u"
1193, // "p"
MIN_REDUCTION+229, // "h"
899, // "v"
MIN_REDUCTION+229, // "y"
MIN_REDUCTION+229, // "m"
9, // "g"
MIN_REDUCTION+229, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+229, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+229, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+229, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+229, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 23
0x80000000|1, // match move
0x80000000|1455, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 24
169,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 25
101,423, // "s"
  }
,
{ // state 26
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 27
169,MIN_REDUCTION+146, // $NT
  }
,
{ // state 28
2,966, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 29
124,1265, // "+"
  }
,
{ // state 30
2,635, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 31
106,1457, // "i"
  }
,
{ // state 32
151,802, // ws
153,456, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 33
91,329, // "o"
  }
,
{ // state 34
0x80000000|77, // match move
0x80000000|1461, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 35
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+251, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 36
0x80000000|840, // match move
0x80000000|413, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 37
169,MIN_REDUCTION+137, // $NT
  }
,
{ // state 38
0x80000000|950, // match move
0x80000000|728, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 39
0x80000000|1334, // match move
0x80000000|567, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 40
0x80000000|1167, // match move
0x80000000|93, // no-match move
0x80000000|705, // NT-test-match state for printable
  }
,
{ // state 41
151,802, // ws
153,456, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 42
101,293, // "s"
  }
,
{ // state 43
151,802, // ws
153,456, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 44
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+198, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 45
93,426, // "e"
  }
,
{ // state 46
0x80000000|959, // match move
0x80000000|727, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 47
138,353, // "0"
141,353, // {"1".."9"}
  }
,
{ // state 48
-1, // $$start
-1, // start
805, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
-1, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
-1, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+270, // "*"
540, // "/"
563, // "+"
1254, // ","
MIN_REDUCTION+270, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 49
0x80000000|420, // match move
0x80000000|585, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 50
151,802, // ws
153,456, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 51
0x80000000|53, // match move
0x80000000|190, // no-match move
0x80000000|47, // NT-test-match state for digit
  }
,
{ // state 52
2,1041, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 54
0x80000000|172, // match move
0x80000000|960, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 55
101,558, // "s"
103,1298, // "t"
  }
,
{ // state 56
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 57
0x80000000|1128, // match move
0x80000000|1349, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 58
2,1502, // ws*
151,1327, // ws
153,456, // eol
159,1466, // $$2
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 59
0x80000000|1421, // match move
0x80000000|160, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 60
0x80000000|206, // match move
0x80000000|1118, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 61
110,1199, // "h"
  }
,
{ // state 62
106,1141, // "i"
  }
,
{ // state 63
0x80000000|639, // match move
0x80000000|1234, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 64
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 65
95,672, // "n"
  }
,
{ // state 66
0x80000000|634, // match move
0x80000000|853, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 67
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+117, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 68
0x80000000|1471, // match move
0x80000000|476, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 69
0x80000000|209, // match move
0x80000000|1211, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 70
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 71
0x80000000|1140, // match move
0x80000000|156, // no-match move
0x80000000|705, // NT-test-match state for printable
  }
,
{ // state 72
123,1246, // "/"
149,197, // " "
151,802, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
165,26, // $$3
  }
,
{ // state 73
114,583, // "g"
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|153, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 75
2,344, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 76
103,1451, // "t"
  }
,
{ // state 77
2,380, // ws*
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 79
151,802, // ws
153,456, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 80
151,802, // ws
153,456, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|314, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 82
0x80000000|1325, // match move
0x80000000|913, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 83
103,1125, // "t"
  }
,
{ // state 84
151,802, // ws
153,456, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 85
151,802, // ws
153,456, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 86
0x80000000|600, // match move
0x80000000|1250, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 87
0x80000000|294, // match move
0x80000000|319, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 88
2,1090, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 89
0x80000000|269, // match move
0x80000000|627, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 90
0x80000000|601, // match move
0x80000000|1046, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 91
0x80000000|994, // match move
0x80000000|234, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 92
169,MIN_REDUCTION+230, // $NT
  }
,
{ // state 93
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 94
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+138, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 95
0x80000000|1152, // match move
0x80000000|169, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 96
-1, // $$start
-1, // start
548, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+272, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 97
0x80000000|1275, // match move
0x80000000|368, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 98
-1, // $$start
-1, // start
562, // ws*
-1, // $$0
MIN_REDUCTION+202, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+202, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+202, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+202, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+202, // "u"
1193, // "p"
MIN_REDUCTION+202, // "h"
899, // "v"
MIN_REDUCTION+202, // "y"
MIN_REDUCTION+202, // "m"
9, // "g"
MIN_REDUCTION+202, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+202, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+202, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+202, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+202, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 99
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+120, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 100
0x80000000|472, // match move
0x80000000|324, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 101
0x80000000|514, // match move
0x80000000|804, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 102
169,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 103
101,335, // "s"
  }
,
{ // state 104
0x80000000|157, // match move
0x80000000|397, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 105
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 106
103,1207, // "t"
  }
,
{ // state 107
151,802, // ws
153,456, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 108
169,MIN_REDUCTION+209, // $NT
  }
,
{ // state 109
0x80000000|589, // match move
0x80000000|210, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 110
90,1257, // "b"
  }
,
{ // state 111
0x80000000|10, // match move
0x80000000|1296, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 112
92,820, // "l"
106,1332, // "i"
  }
,
{ // state 113
0x80000000|141, // match move
0x80000000|1422, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 114
0x80000000|441, // match move
0x80000000|547, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 115
169,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 116
2,788, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 117
0x80000000|284, // match move
0x80000000|1335, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 118
104,1339, // "d"
  }
,
{ // state 119
0x80000000|1084, // match move
0x80000000|94, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 120
-1, // $$start
-1, // start
593, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+252, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 121
0x80000000|1440, // match move
0x80000000|1496, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 122
4,363, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
  }
,
{ // state 123
-1, // $$start
-1, // start
1045, // ws*
-1, // $$0
MIN_REDUCTION+112, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+112, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+112, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+112, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+112, // "u"
1193, // "p"
MIN_REDUCTION+112, // "h"
899, // "v"
MIN_REDUCTION+112, // "y"
MIN_REDUCTION+112, // "m"
9, // "g"
MIN_REDUCTION+112, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+112, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+112, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+112, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+112, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 124
151,802, // ws
153,456, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 125
2,1454, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 126
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+213, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 127
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 128
0x80000000|1356, // match move
0x80000000|208, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 129
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 130
0x80000000|738, // match move
0x80000000|1148, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 131
2,109, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 132
2,348, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 133
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+222, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|1480, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 135
92,191, // "l"
95,497, // "n"
98,774, // "r"
102,744, // "x"
  }
,
{ // state 136
151,802, // ws
153,456, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 137
0x80000000|670, // match move
0x80000000|835, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 138
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 139
93,572, // "e"
  }
,
{ // state 140
169,MIN_REDUCTION+206, // $NT
  }
,
{ // state 141
2,39, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 142
91,337, // "o"
106,823, // "i"
  }
,
{ // state 143
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|38, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 145
0x80000000|1064, // match move
0x80000000|253, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 146
169,MIN_REDUCTION+224, // $NT
  }
,
{ // state 147
169,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 148
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+93, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 149
95,218, // "n"
  }
,
{ // state 150
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 151
151,802, // ws
153,456, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 152
2,983, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 153
0x80000000|1044, // match move
0x80000000|1368, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 154
0x80000000|1, // match move
0x80000000|95, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 155
0x80000000|1, // match move
0x80000000|330, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 156
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 157
151,802, // ws
153,456, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 158
0x80000000|748, // match move
0x80000000|1289, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 159
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 160
0x80000000|1157, // match move
0x80000000|60, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 161
106,602, // "i"
  }
,
{ // state 162
0x80000000|226, // match move
0x80000000|577, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 163
91,526, // "o"
  }
,
{ // state 164
95,564, // "n"
  }
,
{ // state 165
0x80000000|176, // match move
0x80000000|305, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 166
110,1268, // "h"
  }
,
{ // state 167
0x80000000|58, // match move
0x80000000|499, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 168
0x80000000|900, // match move
0x80000000|366, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 169
-1, // $$start
-1, // start
97, // ws*
-1, // $$0
MIN_REDUCTION+136, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+136, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+136, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+136, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+136, // "u"
1193, // "p"
MIN_REDUCTION+136, // "h"
899, // "v"
MIN_REDUCTION+136, // "y"
MIN_REDUCTION+136, // "m"
9, // "g"
MIN_REDUCTION+136, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+136, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+136, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+136, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+136, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 170
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 171
94,1146, // "a"
  }
,
{ // state 172
151,802, // ws
153,456, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 173
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+159, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 174
151,802, // ws
153,456, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 175
-1, // $$start
-1, // start
322, // ws*
-1, // $$0
MIN_REDUCTION+217, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+217, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+217, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+217, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+217, // "u"
1193, // "p"
MIN_REDUCTION+217, // "h"
899, // "v"
MIN_REDUCTION+217, // "y"
MIN_REDUCTION+217, // "m"
9, // "g"
MIN_REDUCTION+217, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+217, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+217, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+217, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+217, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 176
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 178
151,802, // ws
153,456, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 179
94,891, // "a"
  }
,
{ // state 180
93,1288, // "e"
  }
,
{ // state 181
100,166, // "c"
  }
,
{ // state 182
169,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 183
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+255, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 184
94,385, // "a"
  }
,
{ // state 185
93,1285, // "e"
  }
,
{ // state 186
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 187
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+240, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 188
0x80000000|642, // match move
0x80000000|273, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 189
0x80000000|445, // match move
0x80000000|1437, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 190
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 191
101,591, // "s"
  }
,
{ // state 192
101,1164, // "s"
  }
,
{ // state 193
0x80000000|1331, // match move
0x80000000|275, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 194
0x80000000|530, // match move
0x80000000|884, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 195
109,180, // "p"
  }
,
{ // state 196
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 197
169,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 198
0x80000000|263, // match move
0x80000000|699, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 199
0x80000000|1221, // match move
0x80000000|857, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 200
-1, // $$start
862, // start
46, // ws*
524, // $$0
877, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
-1, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
1217, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 201
0x80000000|228, // match move
0x80000000|242, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 202
2,803, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 203
0x80000000|131, // match move
0x80000000|1048, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 204
151,802, // ws
153,456, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 206
169,MIN_REDUCTION+156, // $NT
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 208
0x80000000|645, // match move
0x80000000|243, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 209
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 210
0x80000000|124, // match move
0x80000000|751, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 211
0x80000000|320, // match move
0x80000000|885, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 212
0x80000000|948, // match move
0x80000000|1403, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 213
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,578, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
  }
,
{ // state 214
0x80000000|659, // match move
0x80000000|1260, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 215
0x80000000|147, // match move
0x80000000|810, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 216
151,802, // ws
153,456, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 217
151,802, // ws
153,456, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 218
108,656, // "u"
  }
,
{ // state 219
142,1062, // "'"
  }
,
{ // state 220
2,788, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 222
0x80000000|690, // match move
0x80000000|870, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 223
151,802, // ws
153,456, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 224
151,802, // ws
153,456, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 225
2,380, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 226
2,1057, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 227
0x80000000|708, // match move
0x80000000|203, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 228
2,1088, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 230
0x80000000|1154, // match move
0x80000000|1029, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 231
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 232
0x80000000|1304, // match move
0x80000000|279, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 233
151,802, // ws
153,456, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 234
0x80000000|825, // match move
0x80000000|308, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 235
151,802, // ws
153,456, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 236
151,802, // ws
153,456, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 238
2,1270, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 239
151,802, // ws
153,456, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 240
99,1429, // "k"
  }
,
{ // state 241
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 242
-1, // $$start
-1, // start
1088, // ws*
-1, // $$0
MIN_REDUCTION+151, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+151, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+151, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+151, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+151, // "u"
1193, // "p"
MIN_REDUCTION+151, // "h"
899, // "v"
MIN_REDUCTION+151, // "y"
MIN_REDUCTION+151, // "m"
9, // "g"
MIN_REDUCTION+151, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+151, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+151, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+151, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+151, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 243
0x80000000|1009, // match move
0x80000000|617, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 244
0x80000000|1278, // match move
0x80000000|974, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 245
2,484, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 246
-1, // $$start
-1, // start
724, // ws*
-1, // $$0
MIN_REDUCTION+169, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+169, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+169, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+169, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+169, // "u"
1193, // "p"
MIN_REDUCTION+169, // "h"
899, // "v"
MIN_REDUCTION+169, // "y"
MIN_REDUCTION+169, // "m"
9, // "g"
MIN_REDUCTION+169, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+169, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+169, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+169, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+169, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
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
{ // state 247
2,333, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 248
0x80000000|1482, // match move
0x80000000|54, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 249
0x80000000|339, // match move
0x80000000|821, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 250
1,862, // start
2,46, // ws*
3,524, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
90,1227, // "b"
92,1378, // "l"
93,474, // "e"
94,1507, // "a"
95,1425, // "n"
98,402, // "r"
100,986, // "c"
101,1353, // "s"
103,1389, // "t"
104,746, // "d"
105,374, // "f"
106,1244, // "i"
107,61, // "w"
109,1193, // "p"
111,899, // "v"
114,9, // "g"
160,1217, // token*
168,MIN_REDUCTION+1, // $
  }
,
{ // state 251
0x80000000|597, // match move
0x80000000|406, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 252
2,1001, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 253
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+96, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 254
0x80000000|152, // match move
0x80000000|365, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 255
105,652, // "f"
  }
,
{ // state 256
151,802, // ws
153,456, // eol
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 257
0x80000000|136, // match move
0x80000000|1034, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 258
151,802, // ws
153,456, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 259
0x80000000|762, // match move
0x80000000|555, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|367, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 261
93,1412, // "e"
  }
,
{ // state 262
-1, // $$start
-1, // start
729, // ws*
-1, // $$0
MIN_REDUCTION+97, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+97, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+97, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+97, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+97, // "u"
1193, // "p"
MIN_REDUCTION+97, // "h"
899, // "v"
MIN_REDUCTION+97, // "y"
MIN_REDUCTION+97, // "m"
9, // "g"
MIN_REDUCTION+97, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+97, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+97, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+97, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+97, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 263
2,89, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 264
0x80000000|515, // match move
0x80000000|304, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 265
0x80000000|722, // match move
0x80000000|194, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 266
0x80000000|620, // match move
0x80000000|993, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 267
-1, // $$start
-1, // start
344, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+256, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 268
0x80000000|32, // match move
0x80000000|1189, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 269
151,802, // ws
153,456, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 272
151,802, // ws
153,456, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 273
0x80000000|1026, // match move
0x80000000|888, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 274
0x80000000|487, // match move
0x80000000|1453, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 275
-1, // $$start
-1, // start
86, // ws*
-1, // $$0
MIN_REDUCTION+223, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+223, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+223, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+223, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+223, // "u"
1193, // "p"
MIN_REDUCTION+223, // "h"
899, // "v"
MIN_REDUCTION+223, // "y"
MIN_REDUCTION+223, // "m"
9, // "g"
MIN_REDUCTION+223, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+223, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+223, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+223, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+223, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 276
0x80000000|429, // match move
0x80000000|1428, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 277
169,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 278
0x80000000|30, // match move
0x80000000|1487, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 279
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+114, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 280
2,904, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 281
93,1343, // "e"
  }
,
{ // state 282
151,802, // ws
153,456, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 283
169,MIN_REDUCTION+236, // $NT
  }
,
{ // state 284
151,802, // ws
153,456, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 285
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+301, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 286
-1, // $$start
-1, // start
904, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+302, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 287
151,802, // ws
153,456, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 288
0x80000000|301, // match move
0x80000000|503, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 289
95,73, // "n"
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|1171, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 291
95,134, // "n"
  }
,
{ // state 292
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+249, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 294
169,MIN_REDUCTION+165, // $NT
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 295
3,1354, // $$0
4,877, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
62,1295, // `*
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
122,1218, // "*"
137,449, // intLit2
139,1021, // digit++
140,51, // digit
146,534, // letter
151,802, // ws
153,456, // eol
160,1217, // token*
162,12, // digit+
  }
,
{ // state 296
0x80000000|1384, // match move
0x80000000|44, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 297
-1, // $$start
-1, // start
1041, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+292, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 298
169,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 299
0x80000000|280, // match move
0x80000000|629, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 300
151,802, // ws
153,456, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 301
151,802, // ws
153,456, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 302
169,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 303
2,1431, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 304
0x80000000|1272, // match move
0x80000000|814, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 305
147,MIN_REDUCTION+314, // "_"
158,MIN_REDUCTION+314, // idChar**
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 306
169,MIN_REDUCTION+182, // $NT
  }
,
{ // state 307
2,288, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 308
0x80000000|1225, // match move
0x80000000|695, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 309
-1, // $$start
-1, // start
1267, // ws*
-1, // $$0
MIN_REDUCTION+193, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+193, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+193, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+193, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+193, // "u"
1193, // "p"
MIN_REDUCTION+193, // "h"
899, // "v"
MIN_REDUCTION+193, // "y"
MIN_REDUCTION+193, // "m"
9, // "g"
MIN_REDUCTION+193, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+193, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+193, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+193, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+193, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 310
90,669, // "b"
  }
,
{ // state 311
2,616, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 312
0x80000000|419, // match move
0x80000000|898, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 313
0x80000000|302, // match move
0x80000000|1056, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 314
0x80000000|525, // match move
0x80000000|309, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 315
151,802, // ws
153,456, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 316
0x80000000|116, // match move
0x80000000|341, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 317
151,802, // ws
153,456, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 318
0x80000000|619, // match move
0x80000000|117, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 319
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+165, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 320
169,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 321
151,802, // ws
153,456, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 322
0x80000000|79, // match move
0x80000000|417, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 323
2,59, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 324
0x80000000|866, // match move
0x80000000|1473, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 325
0x80000000|250, // match move
0x80000000|200, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 326
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 327
-1, // $$start
-1, // start
1502, // ws*
-1, // $$0
MIN_REDUCTION+326, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+326, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
1466, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+326, // $
-1, // $NT
  }
,
{ // state 328
0x80000000|726, // match move
0x80000000|211, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 329
92,673, // "l"
  }
,
{ // state 330
0x80000000|533, // match move
0x80000000|944, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 331
-1, // $$start
-1, // start
638, // ws*
-1, // $$0
MIN_REDUCTION+232, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+232, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+232, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+232, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+232, // "u"
1193, // "p"
MIN_REDUCTION+232, // "h"
899, // "v"
MIN_REDUCTION+232, // "y"
MIN_REDUCTION+232, // "m"
9, // "g"
MIN_REDUCTION+232, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+232, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+232, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+232, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+232, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 332
151,802, // ws
153,456, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 333
0x80000000|11, // match move
0x80000000|1131, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 334
0x80000000|398, // match move
0x80000000|1073, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|259, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 336
0x80000000|88, // match move
0x80000000|386, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 337
103,580, // "t"
  }
,
{ // state 338
-1, // $$start
-1, // start
709, // ws*
-1, // $$0
MIN_REDUCTION+226, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+226, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+226, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+226, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+226, // "u"
1193, // "p"
MIN_REDUCTION+226, // "h"
899, // "v"
MIN_REDUCTION+226, // "y"
MIN_REDUCTION+226, // "m"
9, // "g"
MIN_REDUCTION+226, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+226, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+226, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+226, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+226, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 339
169,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 341
0x80000000|220, // match move
0x80000000|702, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 342
0x80000000|13, // match move
0x80000000|436, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 343
0x80000000|951, // match move
0x80000000|199, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 344
0x80000000|1201, // match move
0x80000000|276, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 345
103,662, // "t"
  }
,
{ // state 346
169,MIN_REDUCTION+188, // $NT
  }
,
{ // state 347
0x80000000|1081, // match move
0x80000000|167, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 348
0x80000000|701, // match move
0x80000000|1223, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 349
169,MIN_REDUCTION+164, // $NT
  }
,
{ // state 350
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 351
169,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 352
169,MIN_REDUCTION+116, // $NT
  }
,
{ // state 353
169,MIN_REDUCTION+306, // $NT
  }
,
{ // state 354
0x80000000|1052, // match move
0x80000000|1111, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 355
0x80000000|869, // match move
0x80000000|452, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 356
99,144, // "k"
  }
,
{ // state 357
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 359
98,1392, // "r"
  }
,
{ // state 360
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 362
0x80000000|1, // match move
0x80000000|82, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 363
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 364
2,636, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 365
-1, // $$start
-1, // start
983, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+154, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+154, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+154, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+154, // "u"
1193, // "p"
MIN_REDUCTION+154, // "h"
899, // "v"
MIN_REDUCTION+154, // "y"
MIN_REDUCTION+154, // "m"
9, // "g"
MIN_REDUCTION+154, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+154, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+154, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+154, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 366
0x80000000|969, // match move
0x80000000|148, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 367
0x80000000|1208, // match move
0x80000000|5, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 368
0x80000000|235, // match move
0x80000000|571, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 369
111,1492, // "v"
  }
,
{ // state 370
0x80000000|50, // match move
0x80000000|1097, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 371
0x80000000|307, // match move
0x80000000|509, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 373
103,1290, // "t"
  }
,
{ // state 374
91,553, // "o"
92,443, // "l"
94,1169, // "a"
106,596, // "i"
  }
,
{ // state 375
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+228, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 376
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 377
151,802, // ws
153,456, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 378
94,76, // "a"
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 380
0x80000000|1103, // match move
0x80000000|897, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 381
-1, // $$start
-1, // start
109, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+310, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+310, // $
-1, // $NT
  }
,
{ // state 382
103,42, // "t"
  }
,
{ // state 383
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+285, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 384
0x80000000|217, // match move
0x80000000|566, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 385
101,801, // "s"
  }
,
{ // state 386
0x80000000|901, // match move
0x80000000|1038, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 387
0x80000000|1490, // match move
0x80000000|295, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 388
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 389
0x80000000|1233, // match move
0x80000000|63, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 390
151,802, // ws
153,456, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 391
0x80000000|1243, // match move
0x80000000|1438, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 392
3,1354, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
160,1217, // token*
  }
,
{ // state 393
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 394
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,954, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
  }
,
{ // state 395
-1, // $$start
-1, // start
484, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+178, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+178, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+178, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
110, // "u"
1193, // "p"
MIN_REDUCTION+178, // "h"
899, // "v"
MIN_REDUCTION+178, // "y"
MIN_REDUCTION+178, // "m"
9, // "g"
MIN_REDUCTION+178, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+178, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+178, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+178, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+178, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 396
2,805, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 397
0x80000000|24, // match move
0x80000000|964, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 398
3,1354, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
90,1227, // "b"
92,1378, // "l"
93,474, // "e"
94,1507, // "a"
95,1425, // "n"
98,402, // "r"
100,986, // "c"
101,1353, // "s"
103,1389, // "t"
104,746, // "d"
105,374, // "f"
106,1244, // "i"
107,61, // "w"
109,1193, // "p"
111,899, // "v"
114,9, // "g"
160,1217, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 399
0x80000000|781, // match move
0x80000000|1153, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 400
0x80000000|1117, // match move
0x80000000|158, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 401
0x80000000|463, // match move
0x80000000|22, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 402
93,764, // "e"
  }
,
{ // state 403
0x80000000|1072, // match move
0x80000000|973, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 404
2,709, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 405
0x80000000|1106, // match move
0x80000000|104, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 406
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+177, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 407
151,802, // ws
153,456, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 408
151,802, // ws
153,456, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 409
169,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 410
0x80000000|1147, // match move
0x80000000|745, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 411
93,710, // "e"
  }
,
{ // state 412
0x80000000|665, // match move
0x80000000|414, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 413
0x80000000|1017, // match move
0x80000000|285, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 414
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 415
0x80000000|752, // match move
0x80000000|130, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 416
100,15, // "c"
  }
,
{ // state 417
0x80000000|958, // match move
0x80000000|244, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 418
0x80000000|782, // match move
0x80000000|1129, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 419
151,802, // ws
153,456, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 421
155,694, // {10}
  }
,
{ // state 422
2,318, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 423
93,1252, // "e"
  }
,
{ // state 424
151,802, // ws
153,456, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 425
0x80000000|887, // match move
0x80000000|355, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 427
0x80000000|311, // match move
0x80000000|923, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 428
101,83, // "s"
103,1248, // "t"
  }
,
{ // state 429
151,802, // ws
153,456, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 430
169,MIN_REDUCTION+176, // $NT
  }
,
{ // state 431
103,45, // "t"
  }
,
{ // state 432
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+99, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 433
0x80000000|1486, // match move
0x80000000|963, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 434
2,370, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 435
-1, // $$start
-1, // start
1162, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
-1, // `=
-1, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
MIN_REDUCTION+290, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+290, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 436
-1, // $$start
-1, // start
1316, // ws*
-1, // $$0
MIN_REDUCTION+244, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+244, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+244, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+244, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+244, // "u"
1193, // "p"
MIN_REDUCTION+244, // "h"
899, // "v"
MIN_REDUCTION+244, // "y"
MIN_REDUCTION+244, // "m"
9, // "g"
MIN_REDUCTION+244, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+244, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+244, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+244, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+244, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 437
151,802, // ws
153,456, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 438
169,MIN_REDUCTION+200, // $NT
  }
,
{ // state 439
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 440
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+231, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
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
{ // state 441
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 442
2,562, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 443
91,767, // "o"
  }
,
{ // state 444
-1, // $$start
-1, // start
1475, // ws*
-1, // $$0
MIN_REDUCTION+163, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+163, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+163, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+163, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+163, // "u"
1193, // "p"
MIN_REDUCTION+163, // "h"
899, // "v"
MIN_REDUCTION+163, // "y"
MIN_REDUCTION+163, // "m"
9, // "g"
MIN_REDUCTION+163, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+163, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+163, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+163, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+163, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 445
2,68, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 446
0x80000000|778, // match move
0x80000000|608, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 447
0x80000000|1232, // match move
0x80000000|717, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 448
169,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 449
0x80000000|225, // match move
0x80000000|756, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 450
169,MIN_REDUCTION+233, // $NT
  }
,
{ // state 451
151,802, // ws
153,456, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 452
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+174, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 453
-1, // $$start
-1, // start
1102, // ws*
-1, // $$0
MIN_REDUCTION+133, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+133, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+133, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+133, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+133, // "u"
1193, // "p"
MIN_REDUCTION+133, // "h"
899, // "v"
MIN_REDUCTION+133, // "y"
MIN_REDUCTION+133, // "m"
9, // "g"
MIN_REDUCTION+133, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+133, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+133, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+133, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+133, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 454
2,990, // ws*
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,998, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
123,1246, // "/"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
145,599, // idChar++
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
149,197, // " "
151,1327, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
157,393, // $$1
163,1222, // idChar+
  }
,
{ // state 455
151,802, // ws
153,456, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 456
169,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 457
0x80000000|649, // match move
0x80000000|246, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 458
103,31, // "t"
  }
,
{ // state 459
95,62, // "n"
  }
,
{ // state 460
119,1051, // "&"
  }
,
{ // state 461
-1, // $$start
-1, // start
2, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+296, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 462
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 463
2,1160, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 464
2,2, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 465
0x80000000|315, // match move
0x80000000|471, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 466
0x80000000|715, // match move
0x80000000|945, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 467
-1, // $$start
-1, // start
784, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+142, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+142, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+142, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+142, // "u"
1193, // "p"
MIN_REDUCTION+142, // "h"
899, // "v"
MIN_REDUCTION+142, // "y"
MIN_REDUCTION+142, // "m"
9, // "g"
MIN_REDUCTION+142, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+142, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+142, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+142, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+142, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 468
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 469
0x80000000|1230, // match move
0x80000000|266, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 470
-1, // $$start
-1, // start
636, // ws*
-1, // $$0
MIN_REDUCTION+166, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+166, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+166, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+166, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+166, // "u"
1193, // "p"
MIN_REDUCTION+166, // "h"
899, // "v"
MIN_REDUCTION+166, // "y"
MIN_REDUCTION+166, // "m"
9, // "g"
MIN_REDUCTION+166, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+166, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+166, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+166, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+166, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 471
0x80000000|1348, // match move
0x80000000|67, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 472
2,996, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 473
0x80000000|1499, // match move
0x80000000|882, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 474
92,191, // "l"
95,497, // "n"
102,744, // "x"
  }
,
{ // state 475
-1, // $$start
-1, // start
788, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+274, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 476
0x80000000|1274, // match move
0x80000000|1098, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 477
0x80000000|949, // match move
0x80000000|1170, // no-match move
0x80000000|705, // NT-test-match state for printable
  }
,
{ // state 478
151,802, // ws
153,456, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 479
-1, // $$start
-1, // start
886, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+268, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 480
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+201, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 481
4,363, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
90,1227, // "b"
92,1378, // "l"
93,474, // "e"
94,1507, // "a"
95,1425, // "n"
98,402, // "r"
100,986, // "c"
101,1353, // "s"
103,1389, // "t"
104,746, // "d"
105,374, // "f"
106,1244, // "i"
107,61, // "w"
109,1193, // "p"
111,899, // "v"
114,9, // "g"
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 482
0x80000000|1352, // match move
0x80000000|700, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 483
0x80000000|1049, // match move
0x80000000|435, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 484
0x80000000|592, // match move
0x80000000|1396, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 485
169,MIN_REDUCTION+119, // $NT
  }
,
{ // state 486
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 487
151,802, // ws
153,456, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 488
0x80000000|911, // match move
0x80000000|325, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 489
0x80000000|1460, // match move
0x80000000|865, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 490
169,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 491
151,802, // ws
153,456, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 492
2,904, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 493
108,795, // "u"
  }
,
{ // state 494
2,68, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 495
0x80000000|831, // match move
0x80000000|1314, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 496
100,106, // "c"
  }
,
{ // state 497
108,892, // "u"
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|721, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 499
0x80000000|1149, // match move
0x80000000|327, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 500
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 501
2,616, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 503
0x80000000|1126, // match move
0x80000000|789, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 504
0x80000000|874, // match move
0x80000000|453, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 505
0x80000000|856, // match move
0x80000000|1229, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 506
0x80000000|846, // match move
0x80000000|1481, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 507
151,802, // ws
153,456, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 508
-1, // $$start
-1, // start
966, // ws*
-1, // $$0
MIN_REDUCTION+124, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+124, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+124, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+124, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+124, // "u"
1193, // "p"
MIN_REDUCTION+124, // "h"
899, // "v"
MIN_REDUCTION+124, // "y"
MIN_REDUCTION+124, // "m"
9, // "g"
MIN_REDUCTION+124, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+124, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+124, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+124, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+124, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 509
-1, // $$start
-1, // start
288, // ws*
-1, // $$0
MIN_REDUCTION+127, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+127, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+127, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+127, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+127, // "u"
1193, // "p"
MIN_REDUCTION+127, // "h"
899, // "v"
MIN_REDUCTION+127, // "y"
MIN_REDUCTION+127, // "m"
9, // "g"
MIN_REDUCTION+127, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+127, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+127, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+127, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+127, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 510
0x80000000|1488, // match move
0x80000000|1220, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 511
0x80000000|676, // match move
0x80000000|87, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 512
98,171, // "r"
  }
,
{ // state 513
0x80000000|323, // match move
0x80000000|544, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 514
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 515
151,802, // ws
153,456, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 516
151,802, // ws
153,456, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 517
151,802, // ws
153,456, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 518
2,399, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 519
2,1019, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 520
-1, // $$start
-1, // start
1224, // ws*
-1, // $$0
MIN_REDUCTION+247, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+247, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+247, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+247, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+247, // "u"
1193, // "p"
MIN_REDUCTION+247, // "h"
899, // "v"
MIN_REDUCTION+247, // "y"
MIN_REDUCTION+247, // "m"
9, // "g"
MIN_REDUCTION+247, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+247, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+247, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+247, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+247, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+247, // $
MIN_REDUCTION+247, // $NT
  }
,
{ // state 521
169,MIN_REDUCTION+149, // $NT
  }
,
{ // state 522
95,181, // "n"
  }
,
{ // state 523
151,802, // ws
153,456, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 525
2,1267, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 526
107,1133, // "w"
  }
,
{ // state 527
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+225, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 528
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+153, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 529
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 530
169,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 531
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+267, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 532
169,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 533
2,400, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 534
0x80000000|3, // match move
0x80000000|786, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 535
-1, // $$start
-1, // start
90, // ws*
-1, // $$0
MIN_REDUCTION+211, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+211, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+211, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+211, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+211, // "u"
1193, // "p"
MIN_REDUCTION+211, // "h"
899, // "v"
MIN_REDUCTION+211, // "y"
MIN_REDUCTION+211, // "m"
9, // "g"
MIN_REDUCTION+211, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+211, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+211, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+211, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+211, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 536
2,886, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 537
93,74, // "e"
  }
,
{ // state 538
151,802, // ws
153,456, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 539
169,MIN_REDUCTION+131, // $NT
  }
,
{ // state 540
0x80000000|561, // match move
0x80000000|1292, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 541
169,MIN_REDUCTION+314, // $NT
  }
,
{ // state 542
100,185, // "c"
  }
,
{ // state 543
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+123, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 544
-1, // $$start
-1, // start
59, // ws*
-1, // $$0
MIN_REDUCTION+157, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+157, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+157, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+157, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+157, // "u"
1193, // "p"
MIN_REDUCTION+157, // "h"
899, // "v"
MIN_REDUCTION+157, // "y"
MIN_REDUCTION+157, // "m"
9, // "g"
MIN_REDUCTION+157, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+157, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+157, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+157, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+157, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 545
2,188, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 546
151,802, // ws
153,456, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 547
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+261, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 548
0x80000000|1202, // match move
0x80000000|842, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 549
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 550
169,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 551
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+189, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 552
0x80000000|247, // match move
0x80000000|646, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 553
98,379, // "r"
  }
,
{ // state 554
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 555
-1, // $$start
-1, // start
809, // ws*
-1, // $$0
MIN_REDUCTION+103, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+103, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+103, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+103, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+103, // "u"
1193, // "p"
MIN_REDUCTION+103, // "h"
899, // "v"
MIN_REDUCTION+103, // "y"
MIN_REDUCTION+103, // "m"
9, // "g"
MIN_REDUCTION+103, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+103, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+103, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+103, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+103, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 556
1,862, // start
2,46, // ws*
3,524, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
160,1217, // token*
  }
,
{ // state 557
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 558
103,1092, // "t"
  }
,
{ // state 559
0x80000000|1448, // match move
0x80000000|858, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 560
0x80000000|1, // match move
0x80000000|626, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 561
122,454, // "*"
123,876, // "/"
  }
,
{ // state 562
0x80000000|43, // match move
0x80000000|1188, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 563
0x80000000|29, // match move
0x80000000|91, // no-match move
// T-test match for "+":
124,
  }
,
{ // state 564
101,775, // "s"
  }
,
{ // state 565
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+257, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 566
0x80000000|502, // match move
0x80000000|531, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 567
0x80000000|424, // match move
0x80000000|20, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 568
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 569
151,802, // ws
153,456, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 570
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+295, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 571
0x80000000|550, // match move
0x80000000|655, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 572
0x80000000|1, // match move
0x80000000|666, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 573
0x80000000|1027, // match move
0x80000000|1279, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 574
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 575
94,359, // "a"
  }
,
{ // state 576
2,344, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 577
0x80000000|681, // match move
0x80000000|137, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 578
0x80000000|340, // match move
0x80000000|979, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 579
0x80000000|1, // match move
0x80000000|504, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 580
93,1005, // "e"
  }
,
{ // state 581
0x80000000|794, // match move
0x80000000|527, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 582
169,MIN_REDUCTION+215, // $NT
  }
,
{ // state 583
0x80000000|1, // match move
0x80000000|113, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 584
151,802, // ws
153,456, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 585
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+265, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 586
0x80000000|84, // match move
0x80000000|1155, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 587
100,240, // "c"
  }
,
{ // state 588
151,802, // ws
153,456, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 589
151,802, // ws
153,456, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 590
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 591
93,855, // "e"
  }
,
{ // state 592
151,802, // ws
153,456, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 593
0x80000000|720, // match move
0x80000000|1115, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 594
0x80000000|439, // match move
0x80000000|570, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 595
151,802, // ws
153,456, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 596
95,179, // "n"
  }
,
{ // state 597
169,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 598
0x80000000|1192, // match move
0x80000000|833, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 599
2,72, // ws*
123,1246, // "/"
149,197, // " "
151,1327, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
165,549, // $$3
  }
,
{ // state 600
151,802, // ws
153,456, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 601
151,802, // ws
153,456, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 602
100,697, // "c"
  }
,
{ // state 603
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+126, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
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
{ // state 604
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 605
169,MIN_REDUCTION+242, // $NT
  }
,
{ // state 606
0x80000000|404, // match move
0x80000000|338, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 607
0x80000000|143, // match move
0x80000000|554, // no-match move
0x80000000|47, // NT-test-match state for digit
  }
,
{ // state 608
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+287, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 609
-1, // $$start
-1, // start
18, // ws*
-1, // $$0
MIN_REDUCTION+220, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+220, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+220, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+220, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+220, // "u"
1193, // "p"
MIN_REDUCTION+220, // "h"
899, // "v"
MIN_REDUCTION+220, // "y"
MIN_REDUCTION+220, // "m"
9, // "g"
MIN_REDUCTION+220, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+220, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+220, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+220, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+220, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 610
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+246, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 611
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 612
0x80000000|1187, // match move
0x80000000|769, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 613
169,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 614
169,MIN_REDUCTION+95, // $NT
  }
,
{ // state 615
0x80000000|1, // match move
0x80000000|812, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 616
0x80000000|223, // match move
0x80000000|657, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 617
-1, // $$start
-1, // start
988, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+300, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 618
0x80000000|422, // match move
0x80000000|832, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 619
151,802, // ws
153,456, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 620
2,938, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 621
169,MIN_REDUCTION+248, // $NT
  }
,
{ // state 622
2,2, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 624
169,MIN_REDUCTION+218, // $NT
  }
,
{ // state 625
4,363, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
62,1295, // `*
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
122,1218, // "*"
137,449, // intLit2
139,1021, // digit++
140,51, // digit
146,534, // letter
162,12, // digit+
  }
,
{ // state 626
0x80000000|924, // match move
0x80000000|331, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 627
0x80000000|491, // match move
0x80000000|296, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 628
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 629
0x80000000|939, // match move
0x80000000|286, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 630
153,1053, // eol
155,1433, // {10}
156,1050, // {13}
  }
,
{ // state 631
2,1446, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 632
0x80000000|685, // match move
0x80000000|1213, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 633
0x80000000|392, // match move
0x80000000|1477, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 634
2,188, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 635
0x80000000|1181, // match move
0x80000000|841, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 636
0x80000000|19, // match move
0x80000000|511, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 637
0x80000000|1089, // match move
0x80000000|520, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 638
0x80000000|935, // match move
0x80000000|718, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 639
151,802, // ws
153,456, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 640
0x80000000|390, // match move
0x80000000|1109, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 641
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 642
151,802, // ws
153,456, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 643
0x80000000|1430, // match move
0x80000000|1360, // no-match move
0x80000000|705, // NT-test-match state for printable
  }
,
{ // state 644
2,1505, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 645
2,988, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 646
-1, // $$start
-1, // start
333, // ws*
-1, // $$0
MIN_REDUCTION+190, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+190, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+190, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+190, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+190, // "u"
1193, // "p"
MIN_REDUCTION+190, // "h"
899, // "v"
MIN_REDUCTION+190, // "y"
MIN_REDUCTION+190, // "m"
9, // "g"
MIN_REDUCTION+190, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+190, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+190, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+190, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+190, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 647
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 648
0x80000000|517, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 649
2,724, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 651
2,1068, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 652
94,493, // "a"
  }
,
{ // state 653
151,802, // ws
153,456, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 654
1,862, // start
2,46, // ws*
3,524, // $$0
4,877, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
83,271, // `/
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
146,534, // letter
151,1327, // ws
153,456, // eol
160,1217, // token*
  }
,
{ // state 655
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+135, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 656
93,362, // "e"
  }
,
{ // state 657
0x80000000|861, // match move
0x80000000|732, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 658
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 659
2,1006, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 660
2,593, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 661
2,188, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 662
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 663
169,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 664
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+147, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 665
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 666
0x80000000|1447, // match move
0x80000000|467, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 667
169,MIN_REDUCTION+152, // $NT
  }
,
{ // state 668
0x80000000|569, // match move
0x80000000|1036, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 669
92,1069, // "l"
  }
,
{ // state 670
2,1057, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 671
151,802, // ws
153,456, // eol
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 672
103,23, // "t"
  }
,
{ // state 673
93,1059, // "e"
  }
,
{ // state 674
0x80000000|826, // match move
0x80000000|403, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 675
0x80000000|1397, // match move
0x80000000|785, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 676
151,802, // ws
153,456, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 677
0x80000000|588, // match move
0x80000000|1351, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 678
0x80000000|1, // match move
0x80000000|598, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 679
0x80000000|256, // match move
0x80000000|942, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 680
0x80000000|1086, // match move
0x80000000|1228, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 681
2,1057, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 682
101,1060, // "s"
  }
,
{ // state 683
2,805, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 684
151,802, // ws
153,456, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 685
151,802, // ws
153,456, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 686
169,MIN_REDUCTION+195, // $NT
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 687
169,MIN_REDUCTION+312, // $NT
  }
,
{ // state 688
100,281, // "c"
  }
,
{ // state 689
2,1270, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 690
151,802, // ws
153,456, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 691
0x80000000|1, // match move
0x80000000|401, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 692
2,399, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 693
151,802, // ws
153,456, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 694
169,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 695
-1, // $$start
-1, // start
389, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
-1, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
-1, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+264, // "*"
540, // "/"
MIN_REDUCTION+264, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 696
169,MIN_REDUCTION+167, // $NT
  }
,
{ // state 697
0x80000000|1, // match move
0x80000000|606, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 698
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+195, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 699
-1, // $$start
-1, // start
89, // ws*
-1, // $$0
MIN_REDUCTION+199, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+199, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+199, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+199, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+199, // "u"
1193, // "p"
MIN_REDUCTION+199, // "h"
899, // "v"
MIN_REDUCTION+199, // "y"
MIN_REDUCTION+199, // "m"
9, // "g"
MIN_REDUCTION+199, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+199, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+199, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+199, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+199, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 700
0x80000000|940, // match move
0x80000000|1317, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 701
151,802, // ws
153,456, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 702
0x80000000|1087, // match move
0x80000000|475, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 703
0x80000000|492, // match move
0x80000000|299, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 704
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 705
90,1028, // "b"
91,1028, // "o"
92,1028, // "l"
93,1028, // "e"
94,1028, // "a"
95,1028, // "n"
98,1028, // "r"
99,1028, // "k"
100,1028, // "c"
101,1028, // "s"
102,1028, // "x"
103,1028, // "t"
104,1028, // "d"
105,1028, // "f"
106,1028, // "i"
107,1028, // "w"
108,1028, // "u"
109,1028, // "p"
110,1028, // "h"
111,1028, // "v"
112,1028, // "y"
113,1028, // "m"
114,1028, // "g"
115,1028, // "z"
116,1028, // "!"
117,1028, // "="
118,1028, // "%"
119,1028, // "&"
120,1028, // "("
121,1028, // ")"
122,1028, // "*"
123,1028, // "/"
124,1028, // "+"
125,1028, // ","
126,1028, // "-"
127,1028, // "."
128,1028, // ":"
129,1028, // ";"
130,1028, // "<"
131,1028, // ">"
132,1028, // "["
133,1028, // "]"
134,1028, // "{"
135,1028, // "}"
136,1028, // "|"
138,1028, // "0"
141,1028, // {"1".."9"}
142,1028, // "'"
144,1028, // '"'
147,1028, // "_"
148,1028, // {"A".."Z" "j" "q"}
149,1028, // " "
150,1028, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 706
0x80000000|1365, // match move
0x80000000|648, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 707
103,1436, // "t"
107,1452, // "w"
108,195, // "u"
110,937, // "h"
112,522, // "y"
  }
,
{ // state 708
2,109, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 709
0x80000000|1196, // match move
0x80000000|816, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 710
94,356, // "a"
  }
,
{ // state 711
106,369, // "i"
  }
,
{ // state 712
104,560, // "d"
  }
,
{ // state 713
169,MIN_REDUCTION+161, // $NT
  }
,
{ // state 714
151,802, // ws
153,456, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 715
2,747, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 716
0x80000000|132, // match move
0x80000000|1401, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 717
0x80000000|653, // match move
0x80000000|215, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 718
0x80000000|780, // match move
0x80000000|1308, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 719
0x80000000|1415, // match move
0x80000000|264, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 720
151,802, // ws
153,456, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 721
0x80000000|1236, // match move
0x80000000|757, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 722
151,802, // ws
153,456, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 724
0x80000000|85, // match move
0x80000000|1177, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 725
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 726
151,802, // ws
153,456, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 727
0x80000000|633, // match move
0x80000000|334, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 728
-1, // $$start
-1, // start
871, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+94, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+94, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+94, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+94, // "u"
1193, // "p"
MIN_REDUCTION+94, // "h"
899, // "v"
MIN_REDUCTION+94, // "y"
MIN_REDUCTION+94, // "m"
9, // "g"
MIN_REDUCTION+94, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+94, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+94, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+94, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+94, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
,
{ // state 729
0x80000000|984, // match move
0x80000000|1012, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 730
151,802, // ws
153,456, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 731
169,MIN_REDUCTION+104, // $NT
  }
,
{ // state 732
0x80000000|934, // match move
0x80000000|383, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 733
-1, // $$start
-1, // start
1505, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+238, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+238, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+238, // "x"
1247, // "t"
746, // "d"
374, // "f"
1244, // "i"
1067, // "w"
195, // "u"
1193, // "p"
937, // "h"
899, // "v"
522, // "y"
MIN_REDUCTION+238, // "m"
9, // "g"
MIN_REDUCTION+238, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+238, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+238, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+238, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+238, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 734
93,372, // "e"
  }
,
{ // state 735
-1, // $$start
-1, // start
706, // ws*
-1, // $$0
MIN_REDUCTION+121, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+121, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+121, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+121, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+121, // "u"
1193, // "p"
MIN_REDUCTION+121, // "h"
899, // "v"
MIN_REDUCTION+121, // "y"
MIN_REDUCTION+121, // "m"
9, // "g"
MIN_REDUCTION+121, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+121, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+121, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+121, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+121, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 736
109,1432, // "p"
  }
,
{ // state 737
98,345, // "r"
  }
,
{ // state 738
2,1446, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 739
0x80000000|1, // match move
0x80000000|637, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 740
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 741
0x80000000|1066, // match move
0x80000000|1292, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 742
0x80000000|238, // match move
0x80000000|1004, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 743
0x80000000|442, // match move
0x80000000|98, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 744
103,1015, // "t"
  }
,
{ // state 745
0x80000000|1411, // match move
0x80000000|1467, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 746
91,57, // "o"
93,255, // "e"
  }
,
{ // state 747
0x80000000|1393, // match move
0x80000000|838, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 748
151,802, // ws
153,456, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 749
151,802, // ws
153,456, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 750
169,MIN_REDUCTION+122, // $NT
  }
,
{ // state 751
0x80000000|1197, // match move
0x80000000|1338, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 752
2,1446, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 753
0x80000000|1, // match move
0x80000000|618, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 754
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 755
95,382, // "n"
  }
,
{ // state 756
0x80000000|1180, // match move
0x80000000|34, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 757
-1, // $$start
-1, // start
1061, // ws*
-1, // $$0
MIN_REDUCTION+175, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+175, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+175, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+175, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+175, // "u"
1193, // "p"
MIN_REDUCTION+175, // "h"
899, // "v"
MIN_REDUCTION+175, // "y"
MIN_REDUCTION+175, // "m"
9, // "g"
MIN_REDUCTION+175, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+175, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+175, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+175, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+175, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 758
169,MIN_REDUCTION+101, // $NT
  }
,
{ // state 759
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 760
100,17, // "c"
  }
,
{ // state 761
0x80000000|1501, // match move
0x80000000|790, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 762
2,809, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 763
0x80000000|321, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 764
103,1078, // "t"
  }
,
{ // state 765
0x80000000|170, // match move
0x80000000|376, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 766
0x80000000|1079, // match move
0x80000000|469, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 767
94,1145, // "a"
  }
,
{ // state 768
169,MIN_REDUCTION+313, // $NT
  }
,
{ // state 769
0x80000000|847, // match move
0x80000000|543, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 770
169,MIN_REDUCTION+203, // $NT
  }
,
{ // state 771
-1, // $$start
-1, // start
370, // ws*
-1, // $$0
MIN_REDUCTION+115, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+115, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+115, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+115, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+115, // "u"
1193, // "p"
MIN_REDUCTION+115, // "h"
899, // "v"
MIN_REDUCTION+115, // "y"
MIN_REDUCTION+115, // "m"
9, // "g"
MIN_REDUCTION+115, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+115, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+115, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+115, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+115, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 772
2,805, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 773
93,712, // "e"
  }
,
{ // state 774
105,1065, // "f"
  }
,
{ // state 775
106,1143, // "i"
  }
,
{ // state 776
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 777
2,405, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 778
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 779
0x80000000|1134, // match move
0x80000000|1297, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 780
151,802, // ws
153,456, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 781
151,802, // ws
153,456, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 782
2,344, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 783
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 784
0x80000000|595, // match move
0x80000000|1328, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 785
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+291, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 786
0x80000000|1203, // match move
0x80000000|971, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 787
109,691, // "p"
  }
,
{ // state 788
0x80000000|1282, // match move
0x80000000|677, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 789
0x80000000|409, // match move
0x80000000|603, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 790
-1, // $$start
-1, // start
1342, // ws*
-1, // $$0
MIN_REDUCTION+100, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+100, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+100, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+100, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+100, // "u"
1193, // "p"
MIN_REDUCTION+100, // "h"
899, // "v"
MIN_REDUCTION+100, // "y"
MIN_REDUCTION+100, // "m"
9, // "g"
MIN_REDUCTION+100, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+100, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+100, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+100, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+100, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 791
169,MIN_REDUCTION+246, // $NT
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 792
0x80000000|931, // match move
0x80000000|1186, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 793
0x80000000|282, // match move
0x80000000|495, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 794
169,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 795
92,1121, // "l"
  }
,
{ // state 796
0x80000000|1407, // match move
0x80000000|483, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 797
95,542, // "n"
  }
,
{ // state 798
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 799
169,MIN_REDUCTION+92, // $NT
  }
,
{ // state 800
2,109, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 801
101,1469, // "s"
  }
,
{ // state 802
169,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 803
0x80000000|906, // match move
0x80000000|1031, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 804
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+271, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 805
0x80000000|894, // match move
0x80000000|1101, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 806
1,862, // start
2,46, // ws*
3,524, // $$0
4,877, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
62,1295, // `*
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
122,1218, // "*"
137,449, // intLit2
139,1021, // digit++
140,51, // digit
146,534, // letter
151,1327, // ws
153,456, // eol
160,1217, // token*
162,12, // digit+
  }
,
{ // state 807
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 808
0x80000000|725, // match move
0x80000000|35, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 809
0x80000000|455, // match move
0x80000000|1035, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 810
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+234, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 811
103,105, // "t"
  }
,
{ // state 812
0x80000000|14, // match move
0x80000000|735, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 813
93,155, // "e"
  }
,
{ // state 814
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+171, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 815
0x80000000|989, // match move
0x80000000|214, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 816
0x80000000|1370, // match move
0x80000000|581, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 817
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+243, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 818
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 819
2,348, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 820
94,458, // "a"
  }
,
{ // state 821
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+90, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+90, // $
MIN_REDUCTION+90, // $NT
  }
,
{ // state 822
91,753, // "o"
  }
,
{ // state 823
111,378, // "v"
  }
,
{ // state 824
0x80000000|298, // match move
0x80000000|1002, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 825
2,389, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 826
151,802, // ws
153,456, // eol
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 827
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 828
151,802, // ws
153,456, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 829
169,MIN_REDUCTION+227, // $NT
  }
,
{ // state 830
151,802, // ws
153,456, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 831
169,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 832
-1, // $$start
-1, // start
318, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+196, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+196, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+196, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+196, // "u"
1193, // "p"
MIN_REDUCTION+196, // "h"
899, // "v"
MIN_REDUCTION+196, // "y"
MIN_REDUCTION+196, // "m"
9, // "g"
MIN_REDUCTION+196, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+196, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+196, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+196, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+196, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 833
-1, // $$start
-1, // start
268, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+91, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+91, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+91, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+91, // "u"
1193, // "p"
MIN_REDUCTION+91, // "h"
899, // "v"
MIN_REDUCTION+91, // "y"
MIN_REDUCTION+91, // "m"
9, // "g"
MIN_REDUCTION+91, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+91, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+91, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+91, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+91, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
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
{ // state 834
151,802, // ws
153,456, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 835
-1, // $$start
-1, // start
1057, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+258, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 836
169,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 837
126,1391, // "-"
  }
,
{ // state 838
0x80000000|408, // match move
0x80000000|843, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 839
151,802, // ws
153,456, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 840
151,802, // ws
153,456, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 841
0x80000000|523, // match move
0x80000000|1484, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 842
0x80000000|693, // match move
0x80000000|101, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 843
0x80000000|277, // match move
0x80000000|1030, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 844
151,802, // ws
153,456, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 845
95,55, // "n"
  }
,
{ // state 846
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 847
169,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 848
2,1041, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 849
2,616, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 850
-1, // $$start
-1, // start
1001, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+260, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 851
0x80000000|258, // match move
0x80000000|594, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 852
-1, // $$start
-1, // start
1006, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+278, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 853
0x80000000|661, // match move
0x80000000|1262, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 854
0x80000000|1, // match move
0x80000000|1355, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 855
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 856
169,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 857
0x80000000|1253, // match move
0x80000000|1394, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 858
0x80000000|961, // match move
0x80000000|528, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 859
0x80000000|481, // match move
0x80000000|1465, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 860
101,734, // "s"
103,416, // "t"
  }
,
{ // state 861
151,802, // ws
153,456, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 862
168,MIN_REDUCTION+0, // $
  }
,
{ // state 863
94,164, // "a"
108,139, // "u"
112,1150, // "y"
  }
,
{ // state 864
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+219, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 865
0x80000000|287, // match move
0x80000000|1374, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 866
2,996, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 867
169,MIN_REDUCTION+107, // $NT
  }
,
{ // state 868
0x80000000|394, // match move
0x80000000|78, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 869
169,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 870
0x80000000|783, // match move
0x80000000|1347, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 871
0x80000000|332, // match move
0x80000000|168, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 872
91,459, // "o"
  }
,
{ // state 873
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 874
2,1102, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 875
2,668, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 876
0x80000000|1489, // match move
0x80000000|1357, // no-match move
0x80000000|705, // NT-test-match state for printable
  }
,
{ // state 877
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 878
103,512, // "t"
  }
,
{ // state 879
151,802, // ws
153,456, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 880
-1, // $$start
-1, // start
1505, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+238, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+238, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+238, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+238, // "u"
1193, // "p"
MIN_REDUCTION+238, // "h"
899, // "v"
MIN_REDUCTION+238, // "y"
MIN_REDUCTION+238, // "m"
9, // "g"
MIN_REDUCTION+238, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+238, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+238, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+238, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+238, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 881
0x80000000|448, // match move
0x80000000|133, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 882
0x80000000|1240, // match move
0x80000000|96, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 883
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 884
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+192, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 885
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+129, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 886
0x80000000|844, // match move
0x80000000|384, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 887
151,802, // ws
153,456, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 888
0x80000000|1366, // match move
0x80000000|1175, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 889
92,537, // "l"
  }
,
{ // state 890
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 891
92,482, // "l"
  }
,
{ // state 892
113,1144, // "m"
  }
,
{ // state 893
2,1068, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 894
151,802, // ws
153,456, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 895
169,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 896
169,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 897
0x80000000|1483, // match move
0x80000000|506, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 898
0x80000000|186, // match move
0x80000000|1330, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 899
91,112, // "o"
  }
,
{ // state 900
151,802, // ws
153,456, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 901
2,1090, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 902
169,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 903
0x80000000|981, // match move
0x80000000|1340, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 904
0x80000000|1258, // match move
0x80000000|36, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 905
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 906
151,802, // ws
153,456, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 907
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 908
106,496, // "i"
  }
,
{ // state 909
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 910
0x80000000|1503, // match move
0x80000000|121, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 911
0x80000000|556, // match move
0x80000000|654, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 912
0x80000000|1110, // match move
0x80000000|69, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 913
-1, // $$start
-1, // start
719, // ws*
-1, // $$0
MIN_REDUCTION+172, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+172, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+172, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+172, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+172, // "u"
1193, // "p"
MIN_REDUCTION+172, // "h"
899, // "v"
MIN_REDUCTION+172, // "y"
MIN_REDUCTION+172, // "m"
9, // "g"
MIN_REDUCTION+172, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+172, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+172, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+172, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+172, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 914
151,802, // ws
153,456, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 915
5,799, // `boolean
6,1168, // `class
7,731, // `extends
8,27, // `void
9,485, // `int
10,521, // `while
11,1375, // `if
12,758, // `else
13,1259, // `for
14,614, // `break
15,1321, // `this
16,867, // `false
17,1070, // `true
18,1387, // `super
19,1123, // `null
20,539, // `return
21,352, // `instanceof
22,750, // `new
23,667, // `abstract
24,1395, // `assert
25,1301, // `byte
26,713, // `case
27,349, // `catch
28,696, // `char
29,1022, // `const
30,1107, // `continue
31,430, // `default
32,1312, // `do
33,306, // `double
34,1172, // `enum
35,346, // `final
36,1003, // `finally
37,970, // `float
38,1310, // `goto
39,438, // `implements
40,770, // `import
41,140, // `interface
42,108, // `long
43,1176, // `native
44,582, // `package
45,624, // `private
46,1386, // `protected
47,1094, // `public
48,146, // `short
49,829, // `static
50,92, // `strictfp
51,37, // `switch
52,450, // `synchronized
53,283, // `throw
54,1388, // `throws
55,605, // `transient
56,1361, // `try
57,621, // `volatile
90,1227, // "b"
92,1378, // "l"
93,474, // "e"
94,1507, // "a"
95,1425, // "n"
98,402, // "r"
100,986, // "c"
101,1353, // "s"
103,1389, // "t"
104,746, // "d"
105,374, // "f"
106,1244, // "i"
107,61, // "w"
109,1193, // "p"
111,899, // "v"
114,9, // "g"
  }
,
{ // state 916
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 917
0x80000000|28, // match move
0x80000000|508, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 918
0x80000000|1039, // match move
0x80000000|625, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 919
0x80000000|1363, // match move
0x80000000|999, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 920
169,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 921
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 922
0x80000000|1174, // match move
0x80000000|120, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 923
0x80000000|501, // match move
0x80000000|1108, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 924
2,638, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 925
0x80000000|536, // match move
0x80000000|1441, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 926
151,802, // ws
153,456, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 927
98,1245, // "r"
  }
,
{ // state 928
151,802, // ws
153,456, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 929
151,802, // ws
153,456, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 930
0x80000000|1364, // match move
0x80000000|1124, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 931
117,1287, // "="
  }
,
{ // state 932
107,615, // "w"
  }
,
{ // state 933
-1, // $$start
-1, // start
1431, // ws*
-1, // $$0
MIN_REDUCTION+205, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+205, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+205, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+205, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+205, // "u"
1193, // "p"
MIN_REDUCTION+205, // "h"
899, // "v"
MIN_REDUCTION+205, // "y"
MIN_REDUCTION+205, // "m"
9, // "g"
MIN_REDUCTION+205, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+205, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+205, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+205, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+205, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 934
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 935
151,802, // ws
153,456, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 936
169,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 937
91,737, // "o"
  }
,
{ // state 938
0x80000000|834, // match move
0x80000000|1256, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 939
2,904, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 940
2,1380, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 941
0x80000000|772, // match move
0x80000000|1137, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 942
0x80000000|1416, // match move
0x80000000|1413, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 943
151,802, // ws
153,456, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 944
-1, // $$start
-1, // start
400, // ws*
-1, // $$0
MIN_REDUCTION+214, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+214, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+214, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+214, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+214, // "u"
1193, // "p"
MIN_REDUCTION+214, // "h"
899, // "v"
MIN_REDUCTION+214, // "y"
MIN_REDUCTION+214, // "m"
9, // "g"
MIN_REDUCTION+214, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+214, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+214, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+214, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+214, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 945
-1, // $$start
-1, // start
747, // ws*
-1, // $$0
MIN_REDUCTION+109, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+109, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+109, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+109, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+109, // "u"
1193, // "p"
MIN_REDUCTION+109, // "h"
899, // "v"
MIN_REDUCTION+109, // "y"
MIN_REDUCTION+109, // "m"
9, // "g"
MIN_REDUCTION+109, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+109, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+109, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+109, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+109, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 946
2,1195, // ws*
149,197, // " "
151,1327, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 947
0x80000000|651, // match move
0x80000000|1341, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 948
151,802, // ws
153,456, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 949
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 950
2,871, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 951
151,802, // ws
153,456, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 952
169,MIN_REDUCTION+237, // $NT
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 953
0x80000000|1439, // match move
0x80000000|461, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 954
0x80000000|1082, // match move
0x80000000|150, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 955
0x80000000|1, // match move
0x80000000|1242, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 956
2,68, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 957
0x80000000|848, // match move
0x80000000|1445, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 958
151,802, // ws
153,456, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 959
0x80000000|1, // match move
0x80000000|387, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 960
0x80000000|115, // match move
0x80000000|1420, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 961
169,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 962
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 963
0x80000000|995, // match move
0x80000000|375, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 964
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+183, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 965
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 966
0x80000000|972, // match move
0x80000000|612, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 967
2,348, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 968
0x80000000|896, // match move
0x80000000|432, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 969
169,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 970
169,MIN_REDUCTION+194, // $NT
  }
,
{ // state 971
-1, // $$start
-1, // start
1502, // ws*
-1, // $$0
MIN_REDUCTION+328, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+328, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+328, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+328, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+328, // "u"
1193, // "p"
MIN_REDUCTION+328, // "h"
899, // "v"
MIN_REDUCTION+328, // "y"
MIN_REDUCTION+328, // "m"
9, // "g"
MIN_REDUCTION+328, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+328, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+328, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+328, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+328, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
347, // idChar**
361, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
868, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+328, // $
-1, // $NT
  }
,
{ // state 972
151,802, // ws
153,456, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 973
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+275, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 974
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+216, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 975
0x80000000|1, // match move
0x80000000|917, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 976
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 977
-1, // $$start
-1, // start
803, // ws*
-1, // $$0
MIN_REDUCTION+139, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+139, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+139, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+139, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+139, // "u"
1193, // "p"
MIN_REDUCTION+139, // "h"
899, // "v"
MIN_REDUCTION+139, // "y"
MIN_REDUCTION+139, // "m"
9, // "g"
MIN_REDUCTION+139, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+139, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+139, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+139, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+139, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 978
169,MIN_REDUCTION+311, // $NT
  }
,
{ // state 979
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 980
0x80000000|644, // match move
0x80000000|733, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 981
2,593, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 982
151,802, // ws
153,456, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 983
0x80000000|216, // match move
0x80000000|559, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 984
151,802, // ws
153,456, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 985
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 986
91,845, // "o"
92,184, // "l"
94,860, // "a"
110,575, // "h"
  }
,
{ // state 987
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 988
0x80000000|224, // match move
0x80000000|586, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 989
2,1006, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 990
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,998, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
123,1246, // "/"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
145,599, // idChar++
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
149,197, // " "
151,802, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
157,905, // $$1
163,1222, // idChar+
  }
,
{ // state 991
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+281, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 992
92,1449, // "l"
  }
,
{ // state 993
-1, // $$start
-1, // start
938, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+280, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 994
2,389, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 995
169,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 996
0x80000000|516, // match move
0x80000000|312, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 997
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 998
0x80000000|1498, // match move
0x80000000|350, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 999
-1, // $$start
-1, // start
343, // ws*
-1, // $$0
MIN_REDUCTION+181, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+181, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+181, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+181, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+181, // "u"
1193, // "p"
MIN_REDUCTION+181, // "h"
899, // "v"
MIN_REDUCTION+181, // "y"
MIN_REDUCTION+181, // "m"
9, // "g"
MIN_REDUCTION+181, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+181, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+181, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+181, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+181, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 1000
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1001
0x80000000|1099, // match move
0x80000000|912, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1002
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+210, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 1003
169,MIN_REDUCTION+191, // $NT
  }
,
{ // state 1004
0x80000000|689, // match move
0x80000000|1284, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1005
100,1358, // "c"
  }
,
{ // state 1006
0x80000000|204, // match move
0x80000000|1011, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1007
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1008
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+207, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 1009
2,988, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1010
144,227, // '"'
  }
,
{ // state 1011
0x80000000|300, // match move
0x80000000|510, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1012
0x80000000|982, // match move
0x80000000|145, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1013
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+299, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1014
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1015
93,1456, // "e"
  }
,
{ // state 1016
0x80000000|102, // match move
0x80000000|551, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1017
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1018
151,802, // ws
153,456, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1019
0x80000000|1299, // match move
0x80000000|328, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1020
0x80000000|628, // match move
0x80000000|997, // no-match move
0x80000000|47, // NT-test-match state for digit
  }
,
{ // state 1021
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1022
169,MIN_REDUCTION+170, // $NT
  }
,
{ // state 1023
-1, // $$start
-1, // start
668, // ws*
-1, // $$0
MIN_REDUCTION+241, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+241, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+241, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+241, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+241, // "u"
1193, // "p"
MIN_REDUCTION+241, // "h"
899, // "v"
MIN_REDUCTION+241, // "y"
MIN_REDUCTION+241, // "m"
9, // "g"
MIN_REDUCTION+241, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+241, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+241, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+241, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+241, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 1024
138,607, // "0"
140,1020, // digit
141,607, // {"1".."9"}
  }
,
{ // state 1025
151,802, // ws
153,456, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1026
151,802, // ws
153,456, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1027
151,802, // ws
153,456, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1028
169,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1029
-1, // $$start
-1, // start
447, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+235, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+235, // "k"
986, // "c"
1315, // "s"
MIN_REDUCTION+235, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+235, // "u"
1193, // "p"
MIN_REDUCTION+235, // "h"
899, // "v"
MIN_REDUCTION+235, // "y"
MIN_REDUCTION+235, // "m"
9, // "g"
MIN_REDUCTION+235, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+235, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+235, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+235, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+235, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 1030
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+108, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
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
{ // state 1031
0x80000000|714, // match move
0x80000000|119, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1032
0x80000000|1173, // match move
0x80000000|674, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1033
93,739, // "e"
  }
,
{ // state 1034
0x80000000|1450, // match move
0x80000000|1182, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1035
0x80000000|1463, // match move
0x80000000|391, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1036
0x80000000|749, // match move
0x80000000|1300, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1037
103,711, // "t"
  }
,
{ // state 1038
0x80000000|1120, // match move
0x80000000|1063, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1039
4,363, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
  }
,
{ // state 1040
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1041
0x80000000|684, // match move
0x80000000|1271, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1042
0x80000000|538, // match move
0x80000000|1418, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1043
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1044
2,489, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1045
0x80000000|236, // match move
0x80000000|257, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1046
0x80000000|507, // match move
0x80000000|824, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1047
-1, // $$start
-1, // start
1019, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+130, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+130, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+130, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+130, // "u"
1193, // "p"
MIN_REDUCTION+130, // "h"
899, // "v"
MIN_REDUCTION+130, // "y"
MIN_REDUCTION+130, // "m"
9, // "g"
MIN_REDUCTION+130, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+130, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+130, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+130, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+130, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 1048
0x80000000|800, // match move
0x80000000|381, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1049
2,1162, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1050
0x80000000|421, // match move
0x80000000|920, // no-match move
// T-test match for 10:
155,
  }
,
{ // state 1051
0x80000000|75, // match move
0x80000000|418, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1052
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1053
169,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1054
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1055
0x80000000|377, // match move
0x80000000|1237, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1056
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+132, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 1057
0x80000000|233, // match move
0x80000000|212, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1058
0x80000000|777, // match move
0x80000000|1138, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1059
94,1359, // "a"
  }
,
{ // state 1060
93,1329, // "e"
  }
,
{ // state 1061
0x80000000|151, // match move
0x80000000|425, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1062
0x80000000|819, // match move
0x80000000|1200, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1063
-1, // $$start
-1, // start
1090, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+298, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 1064
169,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1065
94,688, // "a"
  }
,
{ // state 1066
122,454, // "*"
  }
,
{ // state 1067
106,1080, // "i"
110,1199, // "h"
  }
,
{ // state 1068
0x80000000|41, // match move
0x80000000|1139, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1069
106,1132, // "i"
  }
,
{ // state 1070
169,MIN_REDUCTION+143, // $NT
  }
,
{ // state 1071
1,862, // start
2,46, // ws*
3,524, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
160,1217, // token*
  }
,
{ // state 1072
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1073
-1, // $$start
-1, // start
-1, // ws*
1354, // $$0
877, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
-1, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
1217, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1074
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+273, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1075
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1076
93,755, // "e"
  }
,
{ // state 1077
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1078
108,1464, // "u"
  }
,
{ // state 1079
2,938, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1080
103,760, // "t"
  }
,
{ // state 1081
2,1502, // ws*
151,1327, // ws
153,456, // eol
159,1466, // $$2
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1082
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1083
2,18, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1084
169,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1085
0x80000000|987, // match move
0x80000000|1311, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1086
2,1001, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1087
2,788, // ws*
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1088
0x80000000|1506, // match move
0x80000000|910, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1089
2,1224, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1090
0x80000000|1025, // match move
0x80000000|640, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1091
151,802, // ws
153,456, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|457, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1093
0x80000000|895, // match move
0x80000000|99, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1094
169,MIN_REDUCTION+128, // $NT
  }
,
{ // state 1095
0x80000000|1179, // match move
0x80000000|297, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1096
151,802, // ws
153,456, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 1097
0x80000000|730, // match move
0x80000000|232, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1098
0x80000000|1398, // match move
0x80000000|1495, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1099
151,802, // ws
153,456, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1100
98,774, // "r"
  }
,
{ // state 1101
0x80000000|546, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1102
0x80000000|830, // match move
0x80000000|1122, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1103
151,802, // ws
153,456, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1104
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1105
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1106
151,802, // ws
153,456, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1107
169,MIN_REDUCTION+173, // $NT
  }
,
{ // state 1108
-1, // $$start
-1, // start
616, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
-1, // `=
-1, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
MIN_REDUCTION+286, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+286, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 1109
0x80000000|1323, // match move
0x80000000|1112, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1110
151,802, // ws
153,456, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1111
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1112
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+297, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 1113
0x80000000|839, // match move
0x80000000|1183, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1114
151,802, // ws
153,456, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1115
0x80000000|317, // match move
0x80000000|808, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1116
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1117
151,802, // ws
153,456, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1118
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+156, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 1119
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1120
2,1090, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1121
103,498, // "t"
  }
,
{ // state 1122
0x80000000|107, // match move
0x80000000|313, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1123
169,MIN_REDUCTION+125, // $NT
  }
,
{ // state 1124
-1, // $$start
-1, // start
1417, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+118, // "o"
1378, // "l"
135, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+118, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+118, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+118, // "u"
1193, // "p"
MIN_REDUCTION+118, // "h"
899, // "v"
MIN_REDUCTION+118, // "y"
MIN_REDUCTION+118, // "m"
9, // "g"
MIN_REDUCTION+118, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+118, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+118, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+118, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+118, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 1125
94,797, // "a"
  }
,
{ // state 1126
151,802, // ws
153,456, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1127
2,1001, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1128
108,110, // "u"
  }
,
{ // state 1129
0x80000000|576, // match move
0x80000000|267, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1130
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1131
0x80000000|451, // match move
0x80000000|1016, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1132
100,1210, // "c"
  }
,
{ // state 1133
0x80000000|1399, // match move
0x80000000|230, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1134
169,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1135
0x80000000|1405, // match move
0x80000000|1191, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 1136
-1, // $$start
-1, // start
996, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+254, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 1137
0x80000000|683, // match move
0x80000000|1313, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1138
-1, // $$start
-1, // start
405, // ws*
-1, // $$0
MIN_REDUCTION+184, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+184, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+184, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+184, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+184, // "u"
1193, // "p"
MIN_REDUCTION+184, // "h"
899, // "v"
MIN_REDUCTION+184, // "y"
MIN_REDUCTION+184, // "m"
9, // "g"
MIN_REDUCTION+184, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+184, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+184, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+184, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+184, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 1139
0x80000000|1091, // match move
0x80000000|49, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1140
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1141
115,773, // "z"
  }
,
{ // state 1142
151,802, // ws
153,456, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1143
93,65, // "e"
  }
,
{ // state 1144
0x80000000|1, // match move
0x80000000|1058, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1145
103,81, // "t"
  }
,
{ // state 1146
100,811, // "c"
  }
,
{ // state 1147
151,802, // ws
153,456, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1148
0x80000000|631, // match move
0x80000000|1410, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1149
2,1502, // ws*
159,1466, // $$2
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1150
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1151
0x80000000|1, // match move
0x80000000|1427, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1152
2,97, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1153
0x80000000|1018, // match move
0x80000000|446, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1154
2,447, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1155
0x80000000|1014, // match move
0x80000000|1013, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1156
0x80000000|125, // match move
0x80000000|1500, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1157
151,802, // ws
153,456, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1158
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1159
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1160
0x80000000|80, // match move
0x80000000|433, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1161
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+237, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1162
0x80000000|943, // match move
0x80000000|222, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1163
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1164
0x80000000|1, // match move
0x80000000|1474, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1165
2,1006, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1166
151,802, // ws
153,456, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1167
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1168
169,MIN_REDUCTION+98, // $NT
  }
,
{ // state 1169
92,25, // "l"
  }
,
{ // state 1170
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1171
0x80000000|1071, // match move
0x80000000|806, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1172
169,MIN_REDUCTION+185, // $NT
  }
,
{ // state 1173
151,802, // ws
153,456, // eol
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1174
2,593, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1175
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+283, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 1176
169,MIN_REDUCTION+212, // $NT
  }
,
{ // state 1177
0x80000000|828, // match move
0x80000000|505, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1178
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1179
2,1041, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1180
2,380, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1181
151,802, // ws
153,456, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1182
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+111, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 1183
0x80000000|1305, // match move
0x80000000|864, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1184
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1185
0x80000000|1362, // match move
0x80000000|1497, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 1186
0x80000000|849, // match move
0x80000000|427, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1187
151,802, // ws
153,456, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1188
0x80000000|178, // match move
0x80000000|1344, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1189
0x80000000|272, // match move
0x80000000|249, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1190
104,103, // "d"
  }
,
{ // state 1191
0x80000000|1303, // match move
0x80000000|742, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1192
2,268, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1193
94,587, // "a"
98,142, // "r"
108,310, // "u"
  }
,
{ // state 1194
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1195
0x80000000|671, // match move
0x80000000|1273, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1196
151,802, // ws
153,456, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1197
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 1198
91,289, // "o"
112,1007, // "y"
  }
,
{ // state 1199
106,889, // "i"
  }
,
{ // state 1200
0x80000000|967, // match move
0x80000000|716, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1201
151,802, // ws
153,456, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1202
151,802, // ws
153,456, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1203
2,1502, // ws*
151,1327, // ws
153,456, // eol
158,347, // idChar**
159,361, // $$2
164,868, // idChar*
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1204
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1205
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1206
117,66, // "="
  }
,
{ // state 1207
105,787, // "f"
  }
,
{ // state 1208
2,248, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1209
103,822, // "t"
  }
,
{ // state 1210
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1211
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+259, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 1212
114,813, // "g"
  }
,
{ // state 1213
0x80000000|791, // match move
0x80000000|610, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1214
151,802, // ws
153,456, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 1215
4,363, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
83,271, // `/
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
146,534, // letter
  }
,
{ // state 1216
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1217
0x80000000|1414, // match move
0x80000000|1426, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1218
0x80000000|1, // match move
0x80000000|946, // no-match move
// T-test match for "/":
123,
  }
,
{ // state 1219
0x80000000|1, // match move
0x80000000|1326, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1220
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+277, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 1221
151,802, // ws
153,456, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1222
0x80000000|213, // match move
0x80000000|962, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1223
0x80000000|407, // match move
0x80000000|4, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1224
0x80000000|1320, // match move
0x80000000|632, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1225
2,389, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1226
0x80000000|437, // match move
0x80000000|21, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1227
91,33, // "o"
98,411, // "r"
112,431, // "y"
  }
,
{ // state 1228
0x80000000|1127, // match move
0x80000000|850, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1229
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+168, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 1230
2,938, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1231
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1232
151,802, // ws
153,456, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 1233
151,802, // ws
153,456, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1234
0x80000000|1281, // match move
0x80000000|1373, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1235
101,878, // "s"
  }
,
{ // state 1236
2,1061, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1237
0x80000000|1424, // match move
0x80000000|1406, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1238
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1239
0x80000000|1206, // match move
0x80000000|415, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 1240
2,548, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1241
151,802, // ws
153,456, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1242
0x80000000|1468, // match move
0x80000000|175, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1243
169,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1244
95,428, // "n"
105,1434, // "f"
113,736, // "m"
  }
,
{ // state 1245
103,658, // "t"
  }
,
{ // state 1246
123,876, // "/"
  }
,
{ // state 1247
94,1294, // "a"
98,1443, // "r"
110,1251, // "h"
  }
,
{ // state 1248
0x80000000|1367, // match move
0x80000000|930, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1249
151,802, // ws
153,456, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1250
0x80000000|239, // match move
0x80000000|881, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1251
98,163, // "r"
106,192, // "i"
  }
,
{ // state 1252
0x80000000|1, // match move
0x80000000|1156, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1253
169,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1254
0x80000000|1485, // match move
0x80000000|925, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1255
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1256
0x80000000|926, // match move
0x80000000|1085, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1257
92,1379, // "l"
  }
,
{ // state 1258
151,802, // ws
153,456, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1259
169,MIN_REDUCTION+110, // $NT
  }
,
{ // state 1260
0x80000000|1165, // match move
0x80000000|852, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1261
0x80000000|837, // match move
0x80000000|941, // no-match move
// T-test match for "-":
126,
  }
,
{ // state 1262
0x80000000|545, // match move
0x80000000|1478, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1263
93,118, // "e"
  }
,
{ // state 1264
0x80000000|303, // match move
0x80000000|933, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1265
0x80000000|1336, // match move
0x80000000|947, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1266
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1267
0x80000000|1462, // match move
0x80000000|265, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1268
98,872, // "r"
  }
,
{ // state 1269
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1270
0x80000000|1249, // match move
0x80000000|274, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1271
0x80000000|879, // match move
0x80000000|675, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1272
169,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1273
0x80000000|1494, // match move
0x80000000|114, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1274
151,802, // ws
153,456, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1275
151,802, // ws
153,456, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1276
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+269, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1277
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1278
169,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1279
0x80000000|357, // match move
0x80000000|991, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1280
0x80000000|122, // match move
0x80000000|1215, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1281
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1282
151,802, // ws
153,456, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1283
151,802, // ws
153,456, // eol
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1284
-1, // $$start
-1, // start
1270, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
-1, // `=
-1, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
MIN_REDUCTION+250, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+250, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 1285
91,1345, // "o"
  }
,
{ // state 1286
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1287
0x80000000|518, // match move
0x80000000|1350, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1288
98,579, // "r"
  }
,
{ // state 1289
0x80000000|490, // match move
0x80000000|126, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1290
0x80000000|1, // match move
0x80000000|254, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1291
0x80000000|1419, // match move
0x80000000|1266, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1292
2,1032, // ws*
149,197, // " "
151,1327, // ws
152,197, // {9}
153,456, // eol
155,1433, // {10}
156,1050, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1293
2,1162, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1294
103,161, // "t"
  }
,
{ // state 1295
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1296
-1, // $$start
-1, // start
399, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+288, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1297
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+141, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 1298
106,149, // "i"
  }
,
{ // state 1299
151,802, // ws
153,456, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1300
0x80000000|1377, // match move
0x80000000|187, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1301
169,MIN_REDUCTION+158, // $NT
  }
,
{ // state 1302
0x80000000|494, // match move
0x80000000|1472, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1303
2,1270, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1304
169,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1305
169,MIN_REDUCTION+219, // $NT
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 1306
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1307
0x80000000|364, // match move
0x80000000|470, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1308
0x80000000|613, // match move
0x80000000|440, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1309
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1310
169,MIN_REDUCTION+197, // $NT
  }
,
{ // state 1311
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+279, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1312
169,MIN_REDUCTION+179, // $NT
  }
,
{ // state 1313
0x80000000|396, // match move
0x80000000|48, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1314
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+162, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
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
{ // state 1315
0x80000000|707, // match move
0x80000000|980, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1316
0x80000000|1096, // match move
0x80000000|1226, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1317
-1, // $$start
-1, // start
1380, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+187, // "o"
1198, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+187, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+187, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+187, // "u"
1193, // "p"
MIN_REDUCTION+187, // "h"
899, // "v"
MIN_REDUCTION+187, // "y"
MIN_REDUCTION+187, // "m"
9, // "g"
MIN_REDUCTION+187, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+187, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+187, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+187, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+187, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 1318
0x80000000|1459, // match move
0x80000000|123, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1319
136,703, // "|"
  }
,
{ // state 1320
151,802, // ws
153,456, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 1321
169,MIN_REDUCTION+140, // $NT
  }
,
{ // state 1322
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1323
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1324
112,1007, // "y"
  }
,
{ // state 1325
2,719, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1326
0x80000000|1442, // match move
0x80000000|535, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1327
169,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1328
0x80000000|1142, // match move
0x80000000|779, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1329
98,373, // "r"
  }
,
{ // state 1330
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+253, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 1331
2,86, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 1332
104,260, // "d"
  }
,
{ // state 1333
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1334
151,802, // ws
153,456, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1335
0x80000000|686, // match move
0x80000000|698, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1336
2,1068, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1337
90,541, // "b"
91,541, // "o"
92,541, // "l"
93,541, // "e"
94,541, // "a"
95,541, // "n"
98,541, // "r"
99,541, // "k"
100,541, // "c"
101,541, // "s"
102,541, // "x"
103,541, // "t"
104,541, // "d"
105,541, // "f"
106,541, // "i"
107,541, // "w"
108,541, // "u"
109,541, // "p"
110,541, // "h"
111,541, // "v"
112,541, // "y"
113,541, // "m"
114,541, // "g"
115,541, // "z"
138,353, // "0"
140,687, // digit
141,353, // {"1".."9"}
146,978, // letter
147,768, // "_"
148,541, // {"A".."Z" "j" "q"}
  }
,
{ // state 1338
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+309, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 1339
0x80000000|1, // match move
0x80000000|1493, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1340
0x80000000|660, // match move
0x80000000|922, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1341
0x80000000|893, // match move
0x80000000|1458, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1342
0x80000000|174, // match move
0x80000000|1346, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1343
0x80000000|1, // match move
0x80000000|1264, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1344
0x80000000|182, // match move
0x80000000|480, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1345
105,854, // "f"
  }
,
{ // state 1346
0x80000000|1241, // match move
0x80000000|968, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1347
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+289, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 1348
169,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1349
0x80000000|245, // match move
0x80000000|395, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1350
0x80000000|692, // match move
0x80000000|111, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1351
0x80000000|1159, // match move
0x80000000|1074, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1352
92,1324, // "l"
  }
,
{ // state 1353
103,1436, // "t"
107,1452, // "w"
108,195, // "u"
110,937, // "h"
112,522, // "y"
  }
,
{ // state 1354
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1355
0x80000000|434, // match move
0x80000000|771, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1356
2,988, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1357
153,902, // eol
154,630, // printable**
155,1433, // {10}
156,1050, // {13}
161,643, // printable*
  }
,
{ // state 1358
103,1263, // "t"
  }
,
{ // state 1359
95,678, // "n"
  }
,
{ // state 1360
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1361
169,MIN_REDUCTION+245, // $NT
  }
,
{ // state 1362
117,957, // "="
  }
,
{ // state 1363
2,343, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1364
2,1417, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 1365
151,802, // ws
153,456, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 1366
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1367
93,1100, // "e"
  }
,
{ // state 1368
-1, // $$start
-1, // start
489, // ws*
-1, // $$0
MIN_REDUCTION+148, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+148, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+148, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+148, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+148, // "u"
1193, // "p"
MIN_REDUCTION+148, // "h"
899, // "v"
MIN_REDUCTION+148, // "y"
MIN_REDUCTION+148, // "m"
9, // "g"
MIN_REDUCTION+148, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+148, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+148, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+148, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+148, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 1369
151,802, // ws
153,456, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1370
151,802, // ws
153,456, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1371
0x80000000|936, // match move
0x80000000|6, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1372
0x80000000|1, // match move
0x80000000|1508, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1373
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+263, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1374
0x80000000|663, // match move
0x80000000|664, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1375
169,MIN_REDUCTION+113, // $NT
  }
,
{ // state 1376
0x80000000|252, // match move
0x80000000|680, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1377
169,MIN_REDUCTION+240, // $NT
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 1378
91,289, // "o"
  }
,
{ // state 1379
93,1390, // "e"
  }
,
{ // state 1380
0x80000000|1369, // match move
0x80000000|1055, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1381
0x80000000|1402, // match move
0x80000000|262, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1382
0x80000000|622, // match move
0x80000000|953, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1383
0x80000000|704, // match move
0x80000000|807, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1384
169,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 1385
2,548, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1386
169,MIN_REDUCTION+221, // $NT
  }
,
{ // state 1387
169,MIN_REDUCTION+134, // $NT
  }
,
{ // state 1388
169,MIN_REDUCTION+239, // $NT
  }
,
{ // state 1389
98,863, // "r"
110,1251, // "h"
  }
,
{ // state 1390
0x80000000|1, // match move
0x80000000|919, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1391
0x80000000|1385, // match move
0x80000000|473, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1392
0x80000000|1, // match move
0x80000000|1307, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1393
151,802, // ws
153,456, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1394
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+180, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 1395
169,MIN_REDUCTION+155, // $NT
  }
,
{ // state 1396
0x80000000|584, // match move
0x80000000|251, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1397
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1398
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1399
101,1151, // "s"
  }
,
{ // state 1400
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1401
-1, // $$start
-1, // start
348, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+308, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 1402
2,729, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1403
0x80000000|976, // match move
0x80000000|565, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1404
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1405
117,903, // "="
  }
,
{ // state 1406
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+186, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 1407
2,1162, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1408
90,1028, // "b"
91,1028, // "o"
92,1028, // "l"
93,1028, // "e"
94,1028, // "a"
95,1028, // "n"
98,1028, // "r"
99,1028, // "k"
100,1028, // "c"
101,1028, // "s"
102,1028, // "x"
103,1028, // "t"
104,1028, // "d"
105,1028, // "f"
106,1028, // "i"
107,1028, // "w"
108,1028, // "u"
109,1028, // "p"
110,1028, // "h"
111,1028, // "v"
112,1028, // "y"
113,1028, // "m"
114,1028, // "g"
115,1028, // "z"
116,1028, // "!"
117,1028, // "="
118,1028, // "%"
119,1028, // "&"
120,1028, // "("
121,1028, // ")"
122,1028, // "*"
123,1028, // "/"
124,1028, // "+"
125,1028, // ","
126,1028, // "-"
127,1028, // "."
128,1028, // ":"
129,1028, // ";"
130,1028, // "<"
131,1028, // ">"
132,1028, // "["
133,1028, // "]"
134,1028, // "{"
135,1028, // "}"
136,1028, // "|"
138,1028, // "0"
141,1028, // {"1".."9"}
142,1028, // "'"
143,219, // printable
144,1028, // '"'
147,1028, // "_"
148,1028, // {"A".."Z" "j" "q"}
149,1028, // " "
150,1028, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1409
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+307, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1410
-1, // $$start
-1, // start
1446, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
-1, // `=
-1, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
MIN_REDUCTION+282, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+282, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 1411
169,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1412
113,1076, // "m"
  }
,
{ // state 1413
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+348, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+348, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+348, // $
-1, // $NT
  }
,
{ // state 1414
0x80000000|1, // match move
0x80000000|918, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1415
151,802, // ws
153,456, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1416
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1417
0x80000000|1491, // match move
0x80000000|465, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1418
0x80000000|952, // match move
0x80000000|1161, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1419
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1420
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+144, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+144, // $
MIN_REDUCTION+144, // $NT
  }
,
{ // state 1421
151,802, // ws
153,456, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1422
-1, // $$start
-1, // start
39, // ws*
-1, // $$0
MIN_REDUCTION+208, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+208, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+208, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+208, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+208, // "u"
1193, // "p"
MIN_REDUCTION+208, // "h"
899, // "v"
MIN_REDUCTION+208, // "y"
MIN_REDUCTION+208, // "m"
9, // "g"
MIN_REDUCTION+208, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+208, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+208, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+208, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+208, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 1423
2,1475, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1424
169,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1425
93,932, // "e"
94,1037, // "a"
108,992, // "u"
  }
,
{ // state 1426
0x80000000|1280, // match move
0x80000000|859, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1427
0x80000000|644, // match move
0x80000000|880, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1428
0x80000000|486, // match move
0x80000000|183, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1429
94,1212, // "a"
  }
,
{ // state 1430
90,477, // "b"
91,477, // "o"
92,477, // "l"
93,477, // "e"
94,477, // "a"
95,477, // "n"
98,477, // "r"
99,477, // "k"
100,477, // "c"
101,477, // "s"
102,477, // "x"
103,477, // "t"
104,477, // "d"
105,477, // "f"
106,477, // "i"
107,477, // "w"
108,477, // "u"
109,477, // "p"
110,477, // "h"
111,477, // "v"
112,477, // "y"
113,477, // "m"
114,477, // "g"
115,477, // "z"
116,477, // "!"
117,477, // "="
118,477, // "%"
119,477, // "&"
120,477, // "("
121,477, // ")"
122,477, // "*"
123,477, // "/"
124,477, // "+"
125,477, // ","
126,477, // "-"
127,477, // "."
128,477, // ":"
129,477, // ";"
130,477, // "<"
131,477, // ">"
132,477, // "["
133,477, // "]"
134,477, // "{"
135,477, // "}"
136,477, // "|"
138,477, // "0"
141,477, // {"1".."9"}
142,477, // "'"
143,71, // printable
144,477, // '"'
147,477, // "_"
148,477, // {"A".."Z" "j" "q"}
149,477, // " "
150,477, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1431
0x80000000|1214, // match move
0x80000000|763, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1432
91,927, // "o"
92,261, // "l"
  }
,
{ // state 1433
169,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1434
0x80000000|1, // match move
0x80000000|1318, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1435
90,165, // "b"
91,165, // "o"
92,165, // "l"
93,165, // "e"
94,165, // "a"
95,165, // "n"
96,998, // idChar
98,165, // "r"
99,165, // "k"
100,165, // "c"
101,165, // "s"
102,165, // "x"
103,165, // "t"
104,165, // "d"
105,165, // "f"
106,165, // "i"
107,165, // "w"
108,165, // "u"
109,165, // "p"
110,165, // "h"
111,165, // "v"
112,165, // "y"
113,165, // "m"
114,165, // "g"
115,165, // "z"
138,1383, // "0"
140,354, // digit
141,1383, // {"1".."9"}
145,1010, // idChar++
146,1291, // letter
147,765, // "_"
148,165, // {"A".."Z" "j" "q"}
163,1222, // idChar+
  }
,
{ // state 1436
94,1294, // "a"
98,908, // "r"
  }
,
{ // state 1437
-1, // $$start
-1, // start
68, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+294, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 1438
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+102, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 1439
2,2, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1440
169,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1441
0x80000000|1444, // match move
0x80000000|479, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1442
2,90, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1443
94,164, // "a"
106,496, // "i"
108,139, // "u"
112,1150, // "y"
  }
,
{ // state 1444
2,886, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1445
0x80000000|52, // match move
0x80000000|1095, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1446
0x80000000|928, // match move
0x80000000|573, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1447
2,784, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1448
151,802, // ws
153,456, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 1449
92,975, // "l"
  }
,
{ // state 1450
169,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1451
93,955, // "e"
  }
,
{ // state 1452
106,1080, // "i"
  }
,
{ // state 1453
0x80000000|873, // match move
0x80000000|292, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1454
0x80000000|929, // match move
0x80000000|410, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1455
0x80000000|875, // match move
0x80000000|1023, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1456
95,1190, // "n"
  }
,
{ // state 1457
92,1033, // "l"
  }
,
{ // state 1458
-1, // $$start
-1, // start
1068, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+266, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 1459
2,1045, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1460
151,802, // ws
153,456, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1461
-1, // $$start
-1, // start
380, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+304, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 1462
151,802, // ws
153,456, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1463
151,802, // ws
153,456, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1464
98,291, // "r"
  }
,
{ // state 1465
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
363, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
-1, // "*"
741, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // printable**
-1, // {10}
-1, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+345, // $
-1, // $NT
  }
,
{ // state 1466
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1467
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+105, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 1468
2,322, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1469
0x80000000|1, // match move
0x80000000|1381, // no-match move
0x80000000|1337, // NT-test-match state for idChar
  }
,
{ // state 1470
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1471
151,802, // ws
153,456, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1472
0x80000000|956, // match move
0x80000000|189, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 1473
0x80000000|8, // match move
0x80000000|1136, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1474
0x80000000|202, // match move
0x80000000|977, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1475
0x80000000|1114, // match move
0x80000000|793, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1476
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1477
3,1354, // $$0
4,877, // token
58,1194, // `!
59,1255, // `!=
60,827, // `%
61,604, // `&&
63,647, // `(
64,1077, // `)
65,1184, // `{
66,1333, // `}
67,1231, // `-
68,16, // `+
69,985, // `=
70,1000, // `==
71,205, // `[
72,1178, // `]
73,1205, // `||
74,921, // `<
75,159, // `<=
76,1476, // `,
77,890, // `>
78,138, // `>=
79,177, // `.
80,231, // `;
81,1322, // `++
82,1043, // `--
83,271, // `/
84,1104, // `:
85,723, // ID
86,500, // INTLIT
87,221, // STRINGLIT
88,1309, // CHARLIT
89,611, // NESTEDCOMMENT
146,534, // letter
151,802, // ws
153,456, // eol
160,1217, // token*
  }
,
{ // state 1478
-1, // $$start
-1, // start
188, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+284, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 1479
0x80000000|1269, // match move
0x80000000|1276, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1480
0x80000000|519, // match move
0x80000000|1047, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1481
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+303, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 1482
151,802, // ws
153,456, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1483
151,802, // ws
153,456, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1484
0x80000000|836, // match move
0x80000000|173, // no-match move
0x80000000|915, // NT-test-match state for reserved
  }
,
{ // state 1485
2,886, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1486
151,802, // ws
153,456, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 1487
-1, // $$start
-1, // start
635, // ws*
-1, // $$0
MIN_REDUCTION+160, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+160, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+160, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+160, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+160, // "u"
1193, // "p"
MIN_REDUCTION+160, // "h"
899, // "v"
MIN_REDUCTION+160, // "y"
MIN_REDUCTION+160, // "m"
9, // "g"
MIN_REDUCTION+160, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+160, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+160, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+160, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+160, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 1488
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1489
90,477, // "b"
91,477, // "o"
92,477, // "l"
93,477, // "e"
94,477, // "a"
95,477, // "n"
98,477, // "r"
99,477, // "k"
100,477, // "c"
101,477, // "s"
102,477, // "x"
103,477, // "t"
104,477, // "d"
105,477, // "f"
106,477, // "i"
107,477, // "w"
108,477, // "u"
109,477, // "p"
110,477, // "h"
111,477, // "v"
112,477, // "y"
113,477, // "m"
114,477, // "g"
115,477, // "z"
116,477, // "!"
117,477, // "="
118,477, // "%"
119,477, // "&"
120,477, // "("
121,477, // ")"
122,477, // "*"
123,477, // "/"
124,477, // "+"
125,477, // ","
126,477, // "-"
127,477, // "."
128,477, // ":"
129,477, // ";"
130,477, // "<"
131,477, // ">"
132,477, // "["
133,477, // "]"
134,477, // "{"
135,477, // "}"
136,477, // "|"
138,477, // "0"
141,477, // {"1".."9"}
142,477, // "'"
143,40, // printable
144,477, // '"'
147,477, // "_"
148,477, // {"A".."Z" "j" "q"}
149,477, // " "
150,477, // {"#".."$" "?".."@" "\" "^" "`" "~"}
154,630, // printable**
161,643, // printable*
  }
,
{ // state 1490
3,1354, // $$0
4,877, // token
5,237, // `boolean
6,740, // `class
7,241, // `extends
8,7, // `void
9,326, // `int
10,388, // `while
11,1306, // `if
12,916, // `else
13,568, // `for
14,650, // `break
15,270, // `this
16,207, // `false
17,1075, // `true
18,1040, // `super
19,56, // `null
20,129, // `return
21,1204, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1277, // `assert
25,754, // `byte
26,574, // `case
27,759, // `catch
28,462, // `char
29,557, // `const
30,641, // `continue
31,623, // `default
32,1238, // `do
33,196, // `double
34,70, // `enum
35,907, // `final
36,1105, // `finally
37,883, // `float
38,229, // `goto
39,1400, // `implements
40,64, // `import
41,358, // `interface
42,529, // `long
43,1163, // `native
44,1286, // `package
45,1116, // `private
46,798, // `protected
47,1130, // `public
48,1470, // `short
49,965, // `static
50,1216, // `strictfp
51,127, // `switch
52,468, // `synchronized
53,590, // `throw
54,818, // `throws
55,360, // `transient
56,776, // `try
57,1054, // `volatile
160,1217, // token*
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
{ // state 1491
151,802, // ws
153,456, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1492
93,1219, // "e"
  }
,
{ // state 1493
0x80000000|1083, // match move
0x80000000|609, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1494
151,802, // ws
153,456, // eol
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1495
-1, // $$start
-1, // start
-1, // ws*
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+293, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1496
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
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
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
723, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
165, // "b"
165, // "o"
165, // "l"
165, // "e"
165, // "a"
165, // "n"
-1, // idChar
-1, // reserved
165, // "r"
165, // "k"
165, // "c"
165, // "s"
165, // "x"
165, // "t"
165, // "d"
165, // "f"
165, // "i"
165, // "w"
165, // "u"
165, // "p"
165, // "h"
165, // "v"
165, // "y"
165, // "m"
165, // "g"
165, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+150, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
449, // intLit2
607, // "0"
1021, // digit++
51, // digit
607, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
534, // letter
-1, // "_"
165, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
802, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
12, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 1497
0x80000000|1293, // match move
0x80000000|796, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1498
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1499
2,548, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1500
-1, // $$start
-1, // start
1454, // ws*
-1, // $$0
MIN_REDUCTION+106, // token
237, // `boolean
740, // `class
241, // `extends
7, // `void
326, // `int
388, // `while
1306, // `if
916, // `else
568, // `for
650, // `break
270, // `this
207, // `false
1075, // `true
1040, // `super
56, // `null
129, // `return
1204, // `instanceof
1404, // `new
1158, // `abstract
1277, // `assert
754, // `byte
574, // `case
759, // `catch
462, // `char
557, // `const
641, // `continue
623, // `default
1238, // `do
196, // `double
70, // `enum
907, // `final
1105, // `finally
883, // `float
229, // `goto
1400, // `implements
64, // `import
358, // `interface
529, // `long
1163, // `native
1286, // `package
1116, // `private
798, // `protected
1130, // `public
1470, // `short
965, // `static
1216, // `strictfp
127, // `switch
468, // `synchronized
590, // `throw
818, // `throws
360, // `transient
776, // `try
1054, // `volatile
1194, // `!
1255, // `!=
827, // `%
604, // `&&
-1, // `*
647, // `(
1077, // `)
1184, // `{
1333, // `}
1231, // `-
16, // `+
985, // `=
1000, // `==
205, // `[
1178, // `]
1205, // `||
921, // `<
159, // `<=
1476, // `,
890, // `>
138, // `>=
177, // `.
231, // `;
1322, // `++
1043, // `--
271, // `/
1104, // `:
-1, // ID
500, // INTLIT
221, // STRINGLIT
1309, // CHARLIT
611, // NESTEDCOMMENT
1227, // "b"
MIN_REDUCTION+106, // "o"
1378, // "l"
474, // "e"
1507, // "a"
1425, // "n"
-1, // idChar
-1, // reserved
402, // "r"
MIN_REDUCTION+106, // "k"
986, // "c"
1353, // "s"
MIN_REDUCTION+106, // "x"
1389, // "t"
746, // "d"
374, // "f"
1244, // "i"
61, // "w"
MIN_REDUCTION+106, // "u"
1193, // "p"
MIN_REDUCTION+106, // "h"
899, // "v"
MIN_REDUCTION+106, // "y"
MIN_REDUCTION+106, // "m"
9, // "g"
MIN_REDUCTION+106, // "z"
1135, // "!"
792, // "="
100, // "%"
460, // "&"
162, // "("
1376, // ")"
MIN_REDUCTION+106, // "*"
540, // "/"
563, // "+"
1254, // ","
1261, // "-"
316, // "."
815, // ":"
766, // ";"
1239, // "<"
1185, // ">"
1302, // "["
1504, // "]"
336, // "{"
128, // "}"
1319, // "|"
-1, // intLit2
MIN_REDUCTION+106, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+106, // {"1".."9"}
1408, // "'"
-1, // printable
1435, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+106, // {"A".."Z" "j" "q"}
197, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1327, // ws
197, // {9}
456, // eol
-1, // printable**
1433, // {10}
1050, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 1501
2,1342, // ws*
151,1327, // ws
153,456, // eol
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1502
0x80000000|1283, // match move
0x80000000|679, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1503
151,802, // ws
153,456, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1504
0x80000000|464, // match move
0x80000000|1382, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1505
0x80000000|478, // match move
0x80000000|1042, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1506
151,802, // ws
153,456, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1507
90,1235, // "b"
101,682, // "s"
  }
,
{ // state 1508
0x80000000|1423, // match move
0x80000000|444, // no-match move
// T-test match for "*":
122,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1509][];
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
// token ::= NESTEDCOMMENT
(4<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(97<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(97<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(97<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(97<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(97<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(97<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(97<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(97<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(97<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(97<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(97<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(97<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(97<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(97<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(97<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(97<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(97<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(97<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(97<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(97<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(97<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(97<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(97<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(97<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(97<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(97<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(97<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(97<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(97<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(97<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(97<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(97<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(97<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(97<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(97<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(97<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(97<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(97<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(97<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(97<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(97<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(97<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(97<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(97<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(97<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(97<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(97<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(97<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(97<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(97<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(97<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(97<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(97<<16)+1,
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
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(137<<16)+1,
// digit ::= {"0".."9"}
(140<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' idChar++ '"' ws*
(87<<16)+4,
// STRINGLIT ::= '"' idChar++ '"'
(87<<16)+3,
// idChar ::= letter
(96<<16)+1,
// idChar ::= digit
(96<<16)+1,
// idChar ::= "_"
(96<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(146<<16)+1,
// printable ::= {" ".."~"}
(143<<16)+1,
// ws ::= {9 " "}
(151<<16)+1,
// ws ::= eol
(151<<16)+1,
// ws ::= "/" "/" printable** eol
(151<<16)+4,
// ws ::= "/" "/" !printable eol
(151<<16)+3,
// eol ::= {10}
(153<<16)+1,
// eol ::= {13} {10}
(153<<16)+2,
// eol ::= {13} !10
(153<<16)+1,
// NESTEDCOMMENT ::= "/" "*" ws* $$1
(89<<16)+4,
// NESTEDCOMMENT ::= "/" "*" $$1
(89<<16)+3,
// ID ::= !reserved letter idChar** $$2
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$2
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// token* ::= token* token
(160<<16)+2,
// token* ::= token
(160<<16)+1,
// printable** ::= printable* !printable
(154<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// idChar++ ::= idChar+ !idChar
(145<<16)+1,
// idChar** ::= idChar* !idChar
(158<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(162<<16)+1,
// digit+ ::= digit+ digit
(162<<16)+2,
// printable* ::= printable* printable
(161<<16)+2,
// printable* ::= printable
(161<<16)+1,
// idChar+ ::= idChar
(163<<16)+1,
// idChar+ ::= idChar+ idChar
(163<<16)+2,
// idChar* ::= idChar* idChar
(164<<16)+2,
// idChar* ::= idChar
(164<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= idChar++ ws* $$3
(157<<16)+3,
// $$1 ::= idChar++ $$3
(157<<16)+2,
// $$2 ::= ws*
(159<<16)+1,
// $$3 ::= !{"*" "/"} !!{"*" "/"} ws* $$4
(165<<16)+2,
// $$3 ::= !{"*" "/"} !!{"*" "/"} $$4
(165<<16)+1,
// $$4 ::= idChar++ !!{"*" "/"} ws* $$5
(166<<16)+3,
// $$4 ::= idChar++ !!{"*" "/"} $$5
(166<<16)+2,
// $$5 ::= idChar++ ws* !!{"*" "/"}
(167<<16)+2,
// $$5 ::= idChar++ !!{"*" "/"}
(167<<16)+1,
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
152, // 9
155, // 10
-1, // 11
-1, // 12
156, // 13
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
149, // " "
116, // "!"
144, // '"'
150, // "#"
150, // "$"
118, // "%"
119, // "&"
142, // "'"
120, // "("
121, // ")"
122, // "*"
124, // "+"
125, // ","
126, // "-"
127, // "."
123, // "/"
138, // "0"
141, // "1"
141, // "2"
141, // "3"
141, // "4"
141, // "5"
141, // "6"
141, // "7"
141, // "8"
141, // "9"
128, // ":"
129, // ";"
130, // "<"
117, // "="
131, // ">"
150, // "?"
150, // "@"
148, // "A"
148, // "B"
148, // "C"
148, // "D"
148, // "E"
148, // "F"
148, // "G"
148, // "H"
148, // "I"
148, // "J"
148, // "K"
148, // "L"
148, // "M"
148, // "N"
148, // "O"
148, // "P"
148, // "Q"
148, // "R"
148, // "S"
148, // "T"
148, // "U"
148, // "V"
148, // "W"
148, // "X"
148, // "Y"
148, // "Z"
132, // "["
150, // "\"
133, // "]"
150, // "^"
147, // "_"
150, // "`"
94, // "a"
90, // "b"
100, // "c"
104, // "d"
93, // "e"
105, // "f"
114, // "g"
110, // "h"
106, // "i"
148, // "j"
99, // "k"
92, // "l"
113, // "m"
95, // "n"
91, // "o"
109, // "p"
148, // "q"
98, // "r"
101, // "s"
103, // "t"
108, // "u"
111, // "v"
107, // "w"
102, // "x"
112, // "y"
115, // "z"
134, // "{"
136, // "|"
135, // "}"
150, // "~"
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
"token ::= # NESTEDCOMMENT", // 89
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 90
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 91
"reserved ::= `boolean", // 92
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 93
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 94
"reserved ::= `break", // 95
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 96
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 97
"reserved ::= `class", // 98
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 99
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 100
"reserved ::= `else", // 101
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 102
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 103
"reserved ::= `extends", // 104
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 105
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 106
"reserved ::= `false", // 107
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 108
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 109
"reserved ::= `for", // 110
"`if ::= \"i\" \"f\" !idChar ws*", // 111
"`if ::= \"i\" \"f\" !idChar ws*", // 112
"reserved ::= `if", // 113
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 114
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 115
"reserved ::= `instanceof", // 116
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 117
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 118
"reserved ::= `int", // 119
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 120
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 121
"reserved ::= `new", // 122
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 123
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 124
"reserved ::= `null", // 125
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 126
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 127
"reserved ::= `public", // 128
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 129
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 130
"reserved ::= `return", // 131
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 132
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 133
"reserved ::= `super", // 134
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 135
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 136
"reserved ::= `switch", // 137
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 138
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 139
"reserved ::= `this", // 140
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 141
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 142
"reserved ::= `true", // 143
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 144
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 145
"reserved ::= `void", // 146
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 147
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 148
"reserved ::= `while", // 149
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 150
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 151
"reserved ::= `abstract", // 152
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 153
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 154
"reserved ::= `assert", // 155
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 156
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 157
"reserved ::= `byte", // 158
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 159
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 160
"reserved ::= `case", // 161
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 162
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 163
"reserved ::= `catch", // 164
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 165
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 166
"reserved ::= `char", // 167
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 168
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 169
"reserved ::= `const", // 170
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 171
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 172
"reserved ::= `continue", // 173
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 174
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 175
"reserved ::= `default", // 176
"`do ::= \"d\" \"o\" !idChar ws*", // 177
"`do ::= \"d\" \"o\" !idChar ws*", // 178
"reserved ::= `do", // 179
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 180
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 181
"reserved ::= `double", // 182
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 183
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 184
"reserved ::= `enum", // 185
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 186
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 187
"reserved ::= `final", // 188
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 189
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 190
"reserved ::= `finally", // 191
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 192
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 193
"reserved ::= `float", // 194
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 195
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 196
"reserved ::= `goto", // 197
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 198
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 199
"reserved ::= `implements", // 200
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 201
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 202
"reserved ::= `import", // 203
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 204
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 205
"reserved ::= `interface", // 206
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 207
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 208
"reserved ::= `long", // 209
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 210
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 211
"reserved ::= `native", // 212
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 213
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 214
"reserved ::= `package", // 215
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 216
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 217
"reserved ::= `private", // 218
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 219
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 220
"reserved ::= `protected", // 221
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 222
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 223
"reserved ::= `short", // 224
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 225
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 226
"reserved ::= `static", // 227
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 228
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 229
"reserved ::= `strictfp", // 230
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 231
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 232
"reserved ::= `synchronized", // 233
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 234
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 235
"reserved ::= `throw", // 236
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 237
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 238
"reserved ::= `throws", // 239
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 240
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 241
"reserved ::= `transient", // 242
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 243
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 244
"reserved ::= `try", // 245
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 246
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 247
"reserved ::= `volatile", // 248
"`! ::= \"!\" !\"=\" ws*", // 249
"`! ::= \"!\" !\"=\" ws*", // 250
"`!= ::= \"!\" \"=\" ws*", // 251
"`!= ::= \"!\" \"=\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`% ::= \"%\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`&& ::= \"&\" \"&\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`( ::= \"(\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`) ::= \")\" ws*", // 260
"`* ::= \"*\" !\"/\" ws*", // 261
"`* ::= \"*\" !\"/\" ws*", // 262
"`+ ::= \"+\" !\"+\" ws*", // 263
"`+ ::= \"+\" !\"+\" ws*", // 264
"`++ ::= \"+\" \"+\" ws*", // 265
"`++ ::= \"+\" \"+\" ws*", // 266
"`, ::= \",\" ws*", // 267
"`, ::= \",\" ws*", // 268
"`- ::= \"-\" !\"-\" ws*", // 269
"`- ::= \"-\" !\"-\" ws*", // 270
"`-- ::= \"-\" \"-\" ws*", // 271
"`-- ::= \"-\" \"-\" ws*", // 272
"`. ::= \".\" ws*", // 273
"`. ::= \".\" ws*", // 274
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 275
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 276
"`: ::= \":\" ws*", // 277
"`: ::= \":\" ws*", // 278
"`; ::= \";\" ws*", // 279
"`; ::= \";\" ws*", // 280
"`< ::= \"<\" !\"=\" ws*", // 281
"`< ::= \"<\" !\"=\" ws*", // 282
"`<= ::= \"<\" \"=\" ws*", // 283
"`<= ::= \"<\" \"=\" ws*", // 284
"`= ::= \"=\" !\"=\" ws*", // 285
"`= ::= \"=\" !\"=\" ws*", // 286
"`== ::= \"=\" \"=\" ws*", // 287
"`== ::= \"=\" \"=\" ws*", // 288
"`> ::= \">\" !\"=\" ws*", // 289
"`> ::= \">\" !\"=\" ws*", // 290
"`>= ::= \">\" \"=\" ws*", // 291
"`>= ::= \">\" \"=\" ws*", // 292
"`[ ::= \"[\" ws*", // 293
"`[ ::= \"[\" ws*", // 294
"`] ::= \"]\" ws*", // 295
"`] ::= \"]\" ws*", // 296
"`{ ::= \"{\" ws*", // 297
"`{ ::= \"{\" ws*", // 298
"`} ::= \"}\" ws*", // 299
"`} ::= \"}\" ws*", // 300
"`|| ::= \"|\" \"|\" ws*", // 301
"`|| ::= \"|\" \"|\" ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"INTLIT ::= # intLit2 ws*", // 304
"intLit2 ::= !\"0\" digit++", // 305
"digit ::= {\"0\"..\"9\"}", // 306
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 307
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 308
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 309
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 310
"idChar ::= letter", // 311
"idChar ::= digit", // 312
"idChar ::= \"_\"", // 313
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 314
"printable ::= {\" \"..\"~\"}", // 315
"ws ::= {9 \" \"}", // 316
"ws ::= eol", // 317
"ws ::= \"/\" \"/\" printable** eol", // 318
"ws ::= \"/\" \"/\" printable** eol", // 319
"eol ::= {10} registerNewline", // 320
"eol ::= {13} {10} registerNewline", // 321
"eol ::= {13} !10 registerNewline", // 322
"NESTEDCOMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !{\"*\" \"/\"} !!{\"*\" \"/\"} ws* idChar++ !!{\"*\" \"/\"} ws* idChar++ ws* !!{\"*\" \"/\"}", // 323
"NESTEDCOMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !{\"*\" \"/\"} !!{\"*\" \"/\"} ws* idChar++ !!{\"*\" \"/\"} ws* idChar++ ws* !!{\"*\" \"/\"}", // 324
"ID ::= !reserved letter idChar** ws*", // 325
"ID ::= !reserved letter idChar** ws*", // 326
"ID ::= !reserved letter idChar** ws*", // 327
"ID ::= !reserved letter idChar** ws*", // 328
"token* ::= token* token", // 329
"token* ::= token* token", // 330
"printable** ::= printable* !printable", // 331
"digit++ ::= digit+ !digit", // 332
"idChar++ ::= idChar+ !idChar", // 333
"idChar** ::= idChar* !idChar", // 334
"ws* ::= ws* ws", // 335
"ws* ::= ws* ws", // 336
"digit+ ::= digit", // 337
"digit+ ::= digit+ digit", // 338
"printable* ::= printable* printable", // 339
"printable* ::= printable* printable", // 340
"idChar+ ::= idChar", // 341
"idChar+ ::= idChar+ idChar", // 342
"idChar* ::= idChar* idChar", // 343
"idChar* ::= idChar* idChar", // 344
"", // 345
"", // 346
"", // 347
"", // 348
"", // 349
"", // 350
"", // 351
"", // 352
"", // 353
"", // 354
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: token ::= [#] NESTEDCOMMENT @sawNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 90: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
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
    { // 91: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 92: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 93: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
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
    { // 94: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 95: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 96: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
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
    { // 97: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 98: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 99: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 100: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 101: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 102: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
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
    { // 103: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 104: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 105: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
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
    { // 106: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 107: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 108: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 111: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: `if ::= "i" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 113: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 114: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
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
    { // 115: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 116: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 117: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 120: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 123: `null ::= "n" "u" "l" "l" !idChar ws* @void
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
    { // 124: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 125: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 126: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
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
    { // 127: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 128: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 129: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
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
    { // 130: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 131: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 132: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
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
    { // 133: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 134: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 135: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
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
    { // 136: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 137: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 138: `this ::= "t" "h" "i" "s" !idChar ws* @void
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
    { // 139: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 140: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 141: `true ::= "t" "r" "u" "e" !idChar ws* @void
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
    { // 142: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 143: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 144: `void ::= "v" "o" "i" "d" !idChar ws* @void
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
    { // 145: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 146: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 147: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
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
    { // 148: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 149: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 150: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
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
    { // 151: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 152: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 153: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
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
    { // 154: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 155: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 156: `byte ::= "b" "y" "t" "e" !idChar ws* @void
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
    { // 157: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 158: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 159: `case ::= "c" "a" "s" "e" !idChar ws* @void
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
    { // 160: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 161: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 162: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
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
    { // 163: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 164: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 165: `char ::= "c" "h" "a" "r" !idChar ws* @void
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
    { // 166: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 167: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 168: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
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
    { // 169: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 170: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 171: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
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
    { // 172: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 173: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 174: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
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
    { // 175: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 176: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 177: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `do ::= "d" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 180: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
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
    { // 181: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 182: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 183: `enum ::= "e" "n" "u" "m" !idChar ws* @void
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
    { // 184: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 185: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 186: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
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
    { // 187: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 188: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 189: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
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
    { // 190: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 191: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 192: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
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
    { // 193: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 194: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 195: `goto ::= "g" "o" "t" "o" !idChar ws* @void
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
    { // 196: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 197: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 198: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
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
    { // 199: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 200: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 201: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
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
    { // 202: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 203: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 204: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
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
    { // 205: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 206: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 207: `long ::= "l" "o" "n" "g" !idChar ws* @void
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
    { // 208: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 209: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 210: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
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
    { // 211: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 212: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 213: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
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
    { // 214: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 215: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 216: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
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
    { // 217: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 218: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 219: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
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
    { // 220: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 221: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 222: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
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
    { // 223: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 224: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 225: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
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
    { // 226: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 227: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 228: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
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
    { // 229: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 230: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 231: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
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
    { // 232: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 233: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 234: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
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
    { // 235: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 236: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 237: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
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
    { // 238: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 239: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 240: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
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
    { // 241: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 242: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 243: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 244: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 245: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 246: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
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
    { // 247: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
    { // 248: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 249: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `! ::= "!" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 252: `!= ::= "!" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 253: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `% ::= "%" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `&& ::= "&" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 257: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `* ::= "*" !"/" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `+ ::= "+" !"+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 266: `++ ::= "+" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 267: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `, ::= "," [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `- ::= "-" !"-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `-- ::= "-" "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 273: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `. ::= "." [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `: ::= ":" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `< ::= "<" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `<= ::= "<" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `= ::= "=" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `== ::= "=" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `> ::= ">" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 292: `>= ::= ">" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 293: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 302: `|| ::= "|" "|" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 303: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 304: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 306: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: STRINGLIT ::= [#] '"' idChar++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 311: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 317: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 318: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 319: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 320: eol ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: eol ::= {13} {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 322: eol ::= {13} !10 [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 323: NESTEDCOMMENT ::= [#] "/" "*" ws* $$1 @reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 324: NESTEDCOMMENT ::= [#] "/" "*" [ws*] $$1 @reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 325: ID ::= !reserved letter idChar** $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 326: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 327: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 328: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 329: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 331: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 335: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 336: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 337: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 338: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 339: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 341: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 342: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 343: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 345: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: $$1 ::= idChar++ ws* $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: $$1 ::= idChar++ [ws*] $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: $$2 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: $$3 ::= !{"*" "/"} !!{"*" "/"} ws* $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: $$3 ::= !{"*" "/"} !!{"*" "/"} [ws*] $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 351: $$4 ::= idChar++ !!{"*" "/"} ws* $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 352: $$4 ::= idChar++ !!{"*" "/"} [ws*] $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 353: $$5 ::= idChar++ ws* !!{"*" "/"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 354: $$5 ::= idChar++ !!{"*" "/"} [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
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
    { // start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // ws*
    },
    { // idChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((90<<5)|0x5)/*methodCall:90*/,
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
      actionObject.sawNestedComment(parm0);
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
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      List<Character> parm3 = (List<Character>)si.popPb();
      List<Character> parm4 = (List<Character>)si.popPb();
      List<Character> parm5 = (List<Character>)si.popPb();
      actionObject.reportNestedComment(parm0,parm1,parm2,parm3,parm4,parm5);
    }
    break;
    case 89: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 90: {
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
"void sawNestedComment(int)",
"int convertToInt(int,String)",
"int printableToAscii(int,char,char,char)",
"String charsToStringLiteral(int,char,List<Character>,char)",
"void reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)",
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
1,0,
2,1,
4,1,
4,1,
6,0,
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
    0,
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
    1,
    -1,
    1,
    1,
    -1,
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
    -1,
    -1,
    3,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    2,
    2,
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
