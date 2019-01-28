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
public int getEofSym() { return 175; }
public int getNttSym() { return 176; }
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
"\"\\\"",
"printable",
"\'\"\'",
"stringWord",
"$$1",
"stringChar",
"letter",
"\"_\"",
"{\"A\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"{\"#\"..\"$\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"stringChar**",
"idChar**",
"$$2",
"ws",
"9",
"eol",
"printable**",
"commentContent**",
"commentContent",
"nestedCommentStart",
"nestedCommentEnd",
"commentElement",
"10",
"13",
"token*",
"printable*",
"stringChar*",
"digit+",
"idChar*",
"commentContent*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 177;}
private static final int MIN_REDUCTION = 1622;
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
0x80000000|952, // match move
0x80000000|1072, // no-match move
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
154, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+144, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+144, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+144, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+144, // "u"
1451, // "p"
MIN_REDUCTION+144, // "h"
483, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
816, // "g"
MIN_REDUCTION+144, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+144, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+203, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 4
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 5
0x80000000|1152, // match move
0x80000000|1503, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 6
2,1022, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 7
0x80000000|547, // match move
0x80000000|1413, // no-match move
0x80000000|828, // NT-test-match state for digit
  }
,
{ // state 8
2,1186, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 9
176,MIN_REDUCTION+339, // $NT
  }
,
{ // state 10
89,1367, // "b"
90,1367, // "o"
91,1367, // "l"
92,1367, // "e"
93,1367, // "a"
94,1367, // "n"
97,1367, // "r"
98,1367, // "k"
99,1367, // "c"
100,1367, // "s"
101,1367, // "x"
102,1367, // "t"
103,1367, // "d"
104,1367, // "f"
105,1367, // "i"
106,1367, // "w"
107,1367, // "u"
108,1367, // "p"
109,1367, // "h"
110,1367, // "v"
111,1367, // "y"
112,1367, // "m"
113,1367, // "g"
114,1367, // "z"
115,1367, // "!"
116,1367, // "="
117,1367, // "%"
118,1367, // "&"
119,1367, // "("
120,1367, // ")"
121,1367, // "*"
122,1367, // "/"
123,1367, // "+"
124,1367, // ","
125,1367, // "-"
126,1367, // "."
127,1367, // ":"
128,1367, // ";"
129,1367, // "<"
130,1367, // ">"
131,1367, // "["
132,1367, // "]"
133,1367, // "{"
134,1367, // "}"
135,1367, // "|"
136,1367, // "0"
137,1367, // {"1".."9"}
138,1367, // "X"
143,1367, // "'"
144,1367, // "\"
145,168, // printable
146,1367, // '"'
151,1367, // "_"
152,1367, // {"A".."W" "Y".."Z" "j" "q"}
153,1367, // " "
154,1367, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 11
109,1534, // "h"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 14
0x80000000|990, // match move
0x80000000|1357, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 15
-1, // $$start
-1, // start
1433, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+228, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+228, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+228, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+228, // "u"
1451, // "p"
MIN_REDUCTION+228, // "h"
483, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
816, // "g"
MIN_REDUCTION+228, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+228, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|789, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 17
176,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 18
100,1037, // "s"
  }
,
{ // state 19
176,MIN_REDUCTION+145, // $NT
  }
,
{ // state 20
2,1337, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 21
123,681, // "+"
  }
,
{ // state 22
2,343, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 23
105,1582, // "i"
  }
,
{ // state 24
90,974, // "o"
  }
,
{ // state 25
0x80000000|46, // match move
0x80000000|792, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 26
0x80000000|1265, // match move
0x80000000|1029, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 27
176,MIN_REDUCTION+136, // $NT
  }
,
{ // state 28
0x80000000|1515, // match move
0x80000000|1120, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 29
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 30
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 31
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+197, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 32
0x80000000|1334, // match move
0x80000000|1198, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 33
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 34
2,1373, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 35
0x80000000|112, // match move
0x80000000|1335, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 36
100,301, // "s"
102,702, // "t"
  }
,
{ // state 37
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 38
2,1615, // ws*
157,795, // $$2
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 39
109,1453, // "h"
  }
,
{ // state 40
105,1422, // "i"
  }
,
{ // state 41
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+116, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 42
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 44
2,984, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 45
102,785, // "t"
  }
,
{ // state 46
2,1007, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 47
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 48
102,598, // "t"
  }
,
{ // state 49
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 51
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 53
0x80000000|323, // match move
0x80000000|670, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 54
0x80000000|166, // match move
0x80000000|338, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 55
0x80000000|1133, // match move
0x80000000|559, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 56
0x80000000|1348, // match move
0x80000000|148, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 57
176,MIN_REDUCTION+229, // $NT
  }
,
{ // state 58
0x80000000|1485, // match move
0x80000000|219, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 59
-1, // $$start
-1, // start
1117, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+201, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+201, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+201, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+201, // "u"
1451, // "p"
MIN_REDUCTION+201, // "h"
483, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
816, // "g"
MIN_REDUCTION+201, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+201, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 60
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+119, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 61
0x80000000|263, // match move
0x80000000|199, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 62
176,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 63
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 64
100,206, // "s"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 66
102,1456, // "t"
  }
,
{ // state 67
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 68
176,MIN_REDUCTION+208, // $NT
  }
,
{ // state 69
0x80000000|6, // match move
0x80000000|1498, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 70
91,1250, // "l"
105,1514, // "i"
  }
,
{ // state 71
0x80000000|247, // match move
0x80000000|1107, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 72
0x80000000|870, // match move
0x80000000|1563, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 73
0x80000000|1397, // match move
0x80000000|852, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 74
-1, // $$start
-1, // start
1130, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+251, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 75
0x80000000|1571, // match move
0x80000000|809, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 76
4,217, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
  }
,
{ // state 77
-1, // $$start
-1, // start
558, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+111, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+111, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+111, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+111, // "u"
1451, // "p"
MIN_REDUCTION+111, // "h"
483, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
816, // "g"
MIN_REDUCTION+111, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+111, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 78
2,788, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 80
0x80000000|1526, // match move
0x80000000|906, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 81
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 82
0x80000000|1204, // match move
0x80000000|1427, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 83
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+364, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+364, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 84
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+221, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 85
146,389, // '"'
148,950, // $$1
  }
,
{ // state 86
176,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 87
0x80000000|363, // match move
0x80000000|1261, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 88
92,1122, // "e"
  }
,
{ // state 89
176,MIN_REDUCTION+205, // $NT
  }
,
{ // state 90
90,979, // "o"
105,444, // "i"
  }
,
{ // state 91
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|10, // no-match move
// T-test match for {"'" "\"}:
143,
144,
  }
,
{ // state 93
176,MIN_REDUCTION+223, // $NT
  }
,
{ // state 94
176,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 95
94,913, // "n"
  }
,
{ // state 96
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 97
2,1345, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 98
0x80000000|1376, // match move
0x80000000|1532, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 99
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 100
105,1134, // "i"
  }
,
{ // state 101
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 102
0x80000000|145, // match move
0x80000000|310, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 103
90,291, // "o"
  }
,
{ // state 104
94,1119, // "n"
  }
,
{ // state 105
0x80000000|891, // match move
0x80000000|959, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 106
2,623, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 107
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 108
0x80000000|1299, // match move
0x80000000|997, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 109
-1, // $$start
-1, // start
58, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+135, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+135, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+135, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+135, // "u"
1451, // "p"
MIN_REDUCTION+135, // "h"
483, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
816, // "g"
MIN_REDUCTION+135, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+135, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 110
93,612, // "a"
  }
,
{ // state 111
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 112
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 113
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+158, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 114
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 116
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 117
99,886, // "c"
  }
,
{ // state 118
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+254, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 119
93,1011, // "a"
  }
,
{ // state 120
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 121
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+239, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 122
0x80000000|252, // match move
0x80000000|778, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 123
122,540, // "/"
163,1114, // commentContent
164,1596, // nestedCommentStart
  }
,
{ // state 124
100,1435, // "s"
  }
,
{ // state 125
0x80000000|723, // match move
0x80000000|172, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 126
108,894, // "p"
  }
,
{ // state 127
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 129
-1, // $$start
463, // start
32, // ws*
1092, // $$0
472, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
-1, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
654, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 130
0x80000000|541, // match move
0x80000000|867, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 131
0x80000000|915, // match move
0x80000000|924, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 132
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 134
176,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 137
0x80000000|402, // match move
0x80000000|661, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 138
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 139
2,1231, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 141
0x80000000|1177, // match move
0x80000000|466, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 142
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 143
0x80000000|775, // match move
0x80000000|1227, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 144
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 145
2,1383, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 147
0x80000000|1504, // match move
0x80000000|945, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 148
0x80000000|1253, // match move
0x80000000|193, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 149
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 150
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 151
98,1566, // "k"
  }
,
{ // state 152
2,849, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 153
2,978, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 154
0x80000000|802, // match move
0x80000000|35, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 155
0x80000000|981, // match move
0x80000000|1251, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 156
1,463, // start
2,32, // ws*
3,1092, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
89,1460, // "b"
91,1536, // "l"
92,1062, // "e"
93,1619, // "a"
94,1565, // "n"
97,1024, // "r"
99,527, // "c"
100,1524, // "s"
102,1544, // "t"
103,405, // "d"
104,223, // "f"
105,1472, // "i"
106,39, // "w"
108,1451, // "p"
110,483, // "v"
113,816, // "g"
169,654, // token*
175,MIN_REDUCTION+1, // $
  }
,
{ // state 157
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+95, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 158
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 159
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 160
0x80000000|1219, // match move
0x80000000|1113, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 161
0x80000000|1085, // match move
0x80000000|958, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 162
0x80000000|335, // match move
0x80000000|532, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 163
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 164
-1, // $$start
-1, // start
984, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+255, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 165
0x80000000|823, // match move
0x80000000|1448, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 166
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 168
143,264, // "'"
  }
,
{ // state 169
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 170
176,MIN_REDUCTION+322, // $NT
  }
,
{ // state 171
0x80000000|1071, // match move
0x80000000|787, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 172
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+222, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+222, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+222, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+222, // "u"
1451, // "p"
MIN_REDUCTION+222, // "h"
483, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
816, // "g"
MIN_REDUCTION+222, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+222, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 173
176,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 174
0x80000000|22, // match move
0x80000000|1606, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 175
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 176
2,1302, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 177
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 178
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+300, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 179
-1, // $$start
-1, // start
1302, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+301, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 180
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 181
94,844, // "n"
  }
,
{ // state 182
94,864, // "n"
  }
,
{ // state 183
-1, // $$start
-1, // start
695, // ws*
-1, // $$0
MIN_REDUCTION+365, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+365, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+365, // $
-1, // $NT
  }
,
{ // state 184
176,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 185
3,735, // $$0
4,472, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
62,701, // `*
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
121,655, // "*"
139,1048, // intLit2
141,1364, // digit++
142,831, // digit
150,689, // letter
158,1239, // ws
160,1052, // eol
169,654, // token*
172,7, // digit+
  }
,
{ // state 186
0x80000000|754, // match move
0x80000000|31, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 187
176,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 188
0x80000000|176, // match move
0x80000000|340, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 189
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 190
176,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 191
176,MIN_REDUCTION+181, // $NT
  }
,
{ // state 192
2,951, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 193
0x80000000|660, // match move
0x80000000|381, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 194
0x80000000|941, // match move
0x80000000|1255, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 195
0x80000000|190, // match move
0x80000000|1382, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 196
0x80000000|860, // match move
0x80000000|982, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 197
0x80000000|1142, // match move
0x80000000|861, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 198
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 199
0x80000000|1278, // match move
0x80000000|1594, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 200
0x80000000|1185, // match move
0x80000000|517, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 201
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 202
0x80000000|1197, // match move
0x80000000|908, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 203
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 204
0x80000000|228, // match move
0x80000000|1391, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 205
0x80000000|1588, // match move
0x80000000|1584, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|160, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 207
0x80000000|851, // match move
0x80000000|1012, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 208
0x80000000|818, // match move
0x80000000|1043, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 209
0x80000000|507, // match move
0x80000000|904, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 210
176,MIN_REDUCTION+187, // $NT
  }
,
{ // state 211
176,MIN_REDUCTION+163, // $NT
  }
,
{ // state 212
176,MIN_REDUCTION+312, // $NT
  }
,
{ // state 213
0x80000000|1380, // match move
0x80000000|590, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 214
0x80000000|1281, // match move
0x80000000|1050, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 215
98,871, // "k"
  }
,
{ // state 216
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 218
-1, // $$start
-1, // start
1345, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+153, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+153, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+153, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+153, // "u"
1451, // "p"
MIN_REDUCTION+153, // "h"
483, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
816, // "g"
MIN_REDUCTION+153, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+153, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
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
{ // state 219
0x80000000|149, // match move
0x80000000|306, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 220
110,806, // "v"
  }
,
{ // state 221
0x80000000|1, // match move
0x80000000|174, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 222
102,698, // "t"
  }
,
{ // state 223
90,1111, // "o"
91,249, // "l"
93,624, // "a"
105,1131, // "i"
  }
,
{ // state 224
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 225
0x80000000|1, // match move
0x80000000|259, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 226
102,826, // "t"
  }
,
{ // state 227
0x80000000|1464, // match move
0x80000000|836, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 228
3,735, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
89,1460, // "b"
91,1536, // "l"
92,1062, // "e"
93,1619, // "a"
94,1565, // "n"
97,1024, // "r"
99,527, // "c"
100,1524, // "s"
102,1544, // "t"
103,405, // "d"
104,223, // "f"
105,1472, // "i"
106,39, // "w"
108,1451, // "p"
110,483, // "v"
113,816, // "g"
169,654, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 229
0x80000000|594, // match move
0x80000000|881, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 230
2,972, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 231
0x80000000|587, // match move
0x80000000|856, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 232
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 233
176,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 234
92,1188, // "e"
  }
,
{ // state 235
0x80000000|1229, // match move
0x80000000|601, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 236
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 237
0x80000000|962, // match move
0x80000000|494, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 238
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 239
102,827, // "t"
  }
,
{ // state 240
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+98, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 241
0x80000000|804, // match move
0x80000000|512, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 242
-1, // $$start
-1, // start
620, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
-1, // `=
-1, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
MIN_REDUCTION+289, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+289, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 243
176,MIN_REDUCTION+199, // $NT
  }
,
{ // state 244
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 245
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+230, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 246
89,1367, // "b"
90,1367, // "o"
91,1367, // "l"
92,1367, // "e"
93,1367, // "a"
94,1367, // "n"
97,1367, // "r"
98,1367, // "k"
99,1367, // "c"
100,1367, // "s"
101,1367, // "x"
102,1367, // "t"
103,1367, // "d"
104,1367, // "f"
105,1367, // "i"
106,1367, // "w"
107,1367, // "u"
108,1367, // "p"
109,1367, // "h"
110,1367, // "v"
111,1367, // "y"
112,1367, // "m"
113,1367, // "g"
114,1367, // "z"
115,1367, // "!"
116,1367, // "="
117,1367, // "%"
118,1367, // "&"
119,1367, // "("
120,1367, // ")"
121,1367, // "*"
122,1367, // "/"
123,1367, // "+"
124,1367, // ","
125,1367, // "-"
126,1367, // "."
127,1367, // ":"
128,1367, // ";"
129,1367, // "<"
130,1367, // ">"
131,1367, // "["
132,1367, // "]"
133,1367, // "{"
134,1367, // "}"
135,1367, // "|"
136,1367, // "0"
137,1367, // {"1".."9"}
138,1367, // "X"
143,1367, // "'"
144,1367, // "\"
145,798, // printable
146,1367, // '"'
151,1367, // "_"
152,1367, // {"A".."W" "Y".."Z" "j" "q"}
153,1367, // " "
154,1367, // {"#".."$" "?".."@" "^" "`" "~"}
160,9, // eol
167,1567, // {10}
168,1379, // {13}
  }
,
{ // state 247
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 248
2,1117, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 249
90,415, // "o"
  }
,
{ // state 250
-1, // $$start
-1, // start
1598, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+162, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+162, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+162, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+162, // "u"
1451, // "p"
MIN_REDUCTION+162, // "h"
483, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
816, // "g"
MIN_REDUCTION+162, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+162, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
  }
,
{ // state 251
2,849, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 252
2,840, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 253
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 254
-1, // $$start
-1, // start
1405, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+132, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+132, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+132, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+132, // "u"
1451, // "p"
MIN_REDUCTION+132, // "h"
483, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
816, // "g"
MIN_REDUCTION+132, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+132, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|327, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 256
118,560, // "&"
  }
,
{ // state 257
2,1433, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 258
0x80000000|965, // match move
0x80000000|1060, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 259
0x80000000|392, // match move
0x80000000|1326, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 260
-1, // $$start
-1, // start
429, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+141, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+141, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+141, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+141, // "u"
1451, // "p"
MIN_REDUCTION+141, // "h"
483, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
816, // "g"
MIN_REDUCTION+141, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+141, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 261
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 262
0x80000000|1462, // match move
0x80000000|162, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 263
2,534, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 264
0x80000000|106, // match move
0x80000000|359, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 265
0x80000000|504, // match move
0x80000000|1439, // no-match move
0x80000000|386, // NT-test-match state for printable
  }
,
{ // state 266
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 267
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+200, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 268
0x80000000|319, // match move
0x80000000|758, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 269
176,MIN_REDUCTION+336, // $NT
  }
,
{ // state 270
176,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 271
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 272
2,1302, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 273
107,480, // "u"
  }
,
{ // state 274
0x80000000|1428, // match move
0x80000000|973, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 275
2,1139, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 277
0x80000000|1418, // match move
0x80000000|1232, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 278
0x80000000|469, // match move
0x80000000|254, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 279
0x80000000|454, // match move
0x80000000|1603, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 280
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 281
-1, // $$start
-1, // start
1337, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+123, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+123, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+123, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+123, // "u"
1451, // "p"
MIN_REDUCTION+123, // "h"
483, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
816, // "g"
MIN_REDUCTION+123, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+123, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 282
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 283
-1, // $$start
-1, // start
951, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+126, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+126, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+126, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+126, // "u"
1451, // "p"
MIN_REDUCTION+126, // "h"
483, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
816, // "g"
MIN_REDUCTION+126, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+126, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 284
2,623, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 286
0x80000000|1173, // match move
0x80000000|850, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 287
121,783, // "*"
122,1284, // "/"
  }
,
{ // state 288
176,MIN_REDUCTION+148, // $NT
  }
,
{ // state 289
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|884, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 291
106,604, // "w"
  }
,
{ // state 292
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+266, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 293
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+210, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+210, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+210, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+210, // "u"
1451, // "p"
MIN_REDUCTION+210, // "h"
483, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
816, // "g"
MIN_REDUCTION+210, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+210, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 294
92,43, // "e"
  }
,
{ // state 295
99,896, // "c"
  }
,
{ // state 296
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+122, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 297
121,893, // "*"
  }
,
{ // state 298
0x80000000|641, // match move
0x80000000|1267, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 299
1,463, // start
2,32, // ws*
3,1092, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
169,654, // token*
  }
,
{ // state 300
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 301
102,1400, // "t"
  }
,
{ // state 302
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+256, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 303
0x80000000|276, // match move
0x80000000|292, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 304
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 305
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+294, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 306
0x80000000|1108, // match move
0x80000000|353, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 307
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 308
93,994, // "a"
  }
,
{ // state 309
2,984, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 310
0x80000000|368, // match move
0x80000000|87, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 312
92,537, // "e"
  }
,
{ // state 313
0x80000000|432, // match move
0x80000000|1094, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 314
176,MIN_REDUCTION+214, // $NT
  }
,
{ // state 315
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 316
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+264, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 317
0x80000000|49, // match move
0x80000000|1431, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 318
92,1272, // "e"
  }
,
{ // state 319
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 320
0x80000000|244, // match move
0x80000000|305, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 321
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 322
176,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 323
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 324
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+125, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 325
176,MIN_REDUCTION+241, // $NT
  }
,
{ // state 326
0x80000000|1026, // match move
0x80000000|980, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 327
89,205, // "b"
90,205, // "o"
91,205, // "l"
92,205, // "e"
93,205, // "a"
94,205, // "n"
97,205, // "r"
98,205, // "k"
99,205, // "c"
100,205, // "s"
101,205, // "x"
102,205, // "t"
103,205, // "d"
104,205, // "f"
105,205, // "i"
106,205, // "w"
107,205, // "u"
108,205, // "p"
109,205, // "h"
110,205, // "v"
111,205, // "y"
112,205, // "m"
113,205, // "g"
114,205, // "z"
115,205, // "!"
116,205, // "="
117,205, // "%"
118,205, // "&"
119,205, // "("
120,205, // ")"
121,205, // "*"
122,205, // "/"
123,205, // "+"
124,205, // ","
125,205, // "-"
126,205, // "."
127,205, // ":"
128,205, // ";"
129,205, // "<"
130,205, // ">"
131,205, // "["
132,205, // "]"
133,205, // "{"
134,205, // "}"
135,205, // "|"
136,205, // "0"
137,205, // {"1".."9"}
138,205, // "X"
143,205, // "'"
144,205, // "\"
145,409, // printable
146,205, // '"'
147,85, // stringWord
149,1616, // stringChar
151,205, // "_"
152,205, // {"A".."W" "Y".."Z" "j" "q"}
153,205, // " "
154,205, // {"#".."$" "?".."@" "^" "`" "~"}
155,1595, // stringChar**
171,882, // stringChar*
  }
,
{ // state 328
0x80000000|91, // match move
0x80000000|1112, // no-match move
0x80000000|828, // NT-test-match state for digit
  }
,
{ // state 329
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+286, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 330
0x80000000|635, // match move
0x80000000|417, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 331
176,MIN_REDUCTION+94, // $NT
  }
,
{ // state 332
122,514, // "/"
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|1246, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 334
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 335
2,499, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 336
176,MIN_REDUCTION+217, // $NT
  }
,
{ // state 337
4,217, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
62,701, // `*
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
121,655, // "*"
139,1048, // intLit2
141,1364, // digit++
142,831, // digit
150,689, // letter
172,7, // digit+
  }
,
{ // state 338
0x80000000|271, // match move
0x80000000|186, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 339
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 340
0x80000000|500, // match move
0x80000000|179, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 341
2,898, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 342
2,695, // ws*
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 343
0x80000000|1445, // match move
0x80000000|1266, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 344
0x80000000|1015, // match move
0x80000000|1409, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 345
0x80000000|774, // match move
0x80000000|738, // no-match move
0x80000000|386, // NT-test-match state for printable
  }
,
{ // state 346
-1, // $$start
-1, // start
978, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+189, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+189, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+189, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+189, // "u"
1451, // "p"
MIN_REDUCTION+189, // "h"
483, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
816, // "g"
MIN_REDUCTION+189, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+189, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 347
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 349
2,568, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 350
93,1074, // "a"
  }
,
{ // state 351
2,972, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 352
1,463, // start
2,32, // ws*
3,1092, // $$0
4,472, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
83,942, // `/
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
136,1491, // "0"
150,689, // letter
158,1513, // ws
160,1052, // eol
169,654, // token*
  }
,
{ // state 353
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+134, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 354
92,995, // "e"
  }
,
{ // state 355
0x80000000|1276, // match move
0x80000000|399, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 356
2,898, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 358
176,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 359
0x80000000|284, // match move
0x80000000|801, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 360
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+146, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 361
176,MIN_REDUCTION+151, // $NT
  }
,
{ // state 362
91,569, // "l"
  }
,
{ // state 363
2,1383, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 364
102,16, // "t"
  }
,
{ // state 365
92,1384, // "e"
  }
,
{ // state 366
0x80000000|759, // match move
0x80000000|1230, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 367
0x80000000|1128, // match move
0x80000000|732, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 368
2,1383, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 369
176,MIN_REDUCTION+340, // $NT
  }
,
{ // state 370
100,1385, // "s"
  }
,
{ // state 371
2,439, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 372
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 373
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 374
176,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 375
176,MIN_REDUCTION+318, // $NT
  }
,
{ // state 376
99,946, // "c"
  }
,
{ // state 377
2,685, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 379
2,1022, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 380
176,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 381
-1, // $$start
-1, // start
227, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
-1, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
-1, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+263, // "*"
1008, // "/"
MIN_REDUCTION+263, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 382
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 383
0x80000000|578, // match move
0x80000000|1063, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 384
0x80000000|272, // match move
0x80000000|188, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 385
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 386
89,1367, // "b"
90,1367, // "o"
91,1367, // "l"
92,1367, // "e"
93,1367, // "a"
94,1367, // "n"
97,1367, // "r"
98,1367, // "k"
99,1367, // "c"
100,1367, // "s"
101,1367, // "x"
102,1367, // "t"
103,1367, // "d"
104,1367, // "f"
105,1367, // "i"
106,1367, // "w"
107,1367, // "u"
108,1367, // "p"
109,1367, // "h"
110,1367, // "v"
111,1367, // "y"
112,1367, // "m"
113,1367, // "g"
114,1367, // "z"
115,1367, // "!"
116,1367, // "="
117,1367, // "%"
118,1367, // "&"
119,1367, // "("
120,1367, // ")"
121,1367, // "*"
122,1367, // "/"
123,1367, // "+"
124,1367, // ","
125,1367, // "-"
126,1367, // "."
127,1367, // ":"
128,1367, // ";"
129,1367, // "<"
130,1367, // ">"
131,1367, // "["
132,1367, // "]"
133,1367, // "{"
134,1367, // "}"
135,1367, // "|"
136,1367, // "0"
137,1367, // {"1".."9"}
138,1367, // "X"
143,1367, // "'"
144,1367, // "\"
146,1367, // '"'
151,1367, // "_"
152,1367, // {"A".."W" "Y".."Z" "j" "q"}
153,1367, // " "
154,1367, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 387
0x80000000|639, // match move
0x80000000|442, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 388
146,389, // '"'
147,85, // stringWord
148,986, // $$1
155,1595, // stringChar**
171,882, // stringChar*
  }
,
{ // state 389
0x80000000|750, // match move
0x80000000|919, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 390
103,1116, // "d"
  }
,
{ // state 391
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 392
2,406, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 393
0x80000000|426, // match move
0x80000000|707, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 394
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 396
0x80000000|524, // match move
0x80000000|1359, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 397
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 398
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 399
0x80000000|498, // match move
0x80000000|1009, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 400
-1, // $$start
-1, // start
1186, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+120, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+120, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+120, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+120, // "u"
1451, // "p"
MIN_REDUCTION+120, // "h"
483, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
816, // "g"
MIN_REDUCTION+120, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+120, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
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
{ // state 401
97,985, // "r"
  }
,
{ // state 402
2,1298, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 403
89,907, // "b"
90,907, // "o"
91,907, // "l"
92,907, // "e"
93,907, // "a"
94,907, // "n"
97,907, // "r"
98,907, // "k"
99,907, // "c"
100,907, // "s"
101,907, // "x"
102,907, // "t"
103,907, // "d"
104,907, // "f"
105,907, // "i"
106,907, // "w"
107,907, // "u"
108,907, // "p"
109,907, // "h"
110,907, // "v"
111,907, // "y"
112,907, // "m"
113,907, // "g"
114,907, // "z"
115,907, // "!"
116,907, // "="
117,907, // "%"
118,907, // "&"
119,907, // "("
120,907, // ")"
121,907, // "*"
122,907, // "/"
123,907, // "+"
124,907, // ","
125,907, // "-"
126,907, // "."
127,907, // ":"
128,907, // ";"
129,907, // "<"
130,907, // ">"
131,907, // "["
132,907, // "]"
133,907, // "{"
134,907, // "}"
135,907, // "|"
136,907, // "0"
137,907, // {"1".."9"}
138,907, // "X"
143,907, // "'"
144,907, // "\"
145,143, // printable
146,907, // '"'
151,907, // "_"
152,907, // {"A".."W" "Y".."Z" "j" "q"}
153,907, // " "
154,907, // {"#".."$" "?".."@" "^" "`" "~"}
160,883, // eol
163,1114, // commentContent
167,1414, // {10}
168,999, // {13}
  }
,
{ // state 404
0x80000000|922, // match move
0x80000000|536, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 405
90,833, // "o"
92,933, // "e"
  }
,
{ // state 406
0x80000000|1546, // match move
0x80000000|1263, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 407
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 408
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 409
0x80000000|50, // match move
0x80000000|988, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 410
121,783, // "*"
122,1284, // "/"
  }
,
{ // state 411
2,1576, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 412
176,MIN_REDUCTION+100, // $NT
  }
,
{ // state 413
99,819, // "c"
  }
,
{ // state 414
0x80000000|198, // match move
0x80000000|744, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 415
93,1425, // "a"
  }
,
{ // state 416
0x80000000|351, // match move
0x80000000|471, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 417
0x80000000|1268, // match move
0x80000000|296, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 418
176,MIN_REDUCTION+202, // $NT
  }
,
{ // state 419
2,439, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 420
92,390, // "e"
  }
,
{ // state 421
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 422
105,1424, // "i"
  }
,
{ // state 423
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 424
2,231, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 426
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 427
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 429
0x80000000|321, // match move
0x80000000|720, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 430
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+313, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+313, // $
-1, // $NT
  }
,
{ // state 431
108,1178, // "p"
  }
,
{ // state 432
176,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 433
0x80000000|679, // match move
0x80000000|378, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 434
0x80000000|763, // match move
0x80000000|1068, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 435
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 436
176,MIN_REDUCTION+91, // $NT
  }
,
{ // state 437
100,797, // "s"
  }
,
{ // state 438
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+270, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 439
0x80000000|1295, // match move
0x80000000|1404, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 440
1,463, // start
2,32, // ws*
3,1092, // $$0
4,472, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
62,701, // `*
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
121,655, // "*"
139,1048, // intLit2
141,1364, // digit++
142,831, // digit
150,689, // letter
158,1513, // ws
160,1052, // eol
169,654, // token*
172,7, // digit+
  }
,
{ // state 441
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+170, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 442
0x80000000|1533, // match move
0x80000000|313, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 443
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+242, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 444
110,1006, // "v"
  }
,
{ // state 445
0x80000000|187, // match move
0x80000000|1353, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 446
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 447
176,MIN_REDUCTION+226, // $NT
  }
,
{ // state 448
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 449
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 450
125,1545, // "-"
  }
,
{ // state 451
0x80000000|173, // match move
0x80000000|1368, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 452
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 453
94,36, // "n"
  }
,
{ // state 454
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 455
2,1373, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 456
-1, // $$start
-1, // start
535, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+259, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 457
-1, // $$start
-1, // start
1355, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+277, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 458
0x80000000|356, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 459
2,1298, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 460
176,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 461
0x80000000|673, // match move
0x80000000|1547, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 462
0x80000000|1066, // match move
0x80000000|794, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 463
175,MIN_REDUCTION+0, // $
  }
,
{ // state 464
93,104, // "a"
107,88, // "u"
111,1429, // "y"
  }
,
{ // state 465
0x80000000|180, // match move
0x80000000|746, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 466
0x80000000|428, // match move
0x80000000|1522, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 467
0x80000000|203, // match move
0x80000000|108, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 468
0x80000000|533, // match move
0x80000000|751, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 469
2,1405, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 470
2,1170, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 471
2,972, // ws*
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
83,942, // `/
84,586, // `:
85,394, // ID
87,140, // STRINGLIT
88,1506, // CHARLIT
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
97,105, // "r"
98,105, // "k"
99,105, // "c"
100,105, // "s"
101,105, // "x"
102,105, // "t"
103,105, // "d"
104,105, // "f"
105,105, // "i"
106,105, // "w"
107,105, // "u"
108,105, // "p"
109,105, // "h"
110,105, // "v"
111,105, // "y"
112,105, // "m"
113,105, // "g"
114,105, // "z"
115,606, // "!"
116,1235, // "="
117,61, // "%"
118,256, // "&"
119,102, // "("
120,748, // ")"
122,1008, // "/"
123,1118, // "+"
124,674, // ","
125,1478, // "-"
126,196, // "."
127,1248, // ":"
128,1223, // ";"
129,1467, // "<"
130,634, // ">"
131,1502, // "["
132,1618, // "]"
133,207, // "{"
134,80, // "}"
135,713, // "|"
138,105, // "X"
143,92, // "'"
146,715, // '"'
150,689, // letter
152,105, // {"A".."W" "Y".."Z" "j" "q"}
153,902, // " "
158,1513, // ws
159,902, // {9}
160,1052, // eol
167,1567, // {10}
168,1379, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 473
102,1082, // "t"
  }
,
{ // state 474
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 475
0x80000000|1047, // match move
0x80000000|84, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 476
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 477
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+191, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 478
91,294, // "l"
  }
,
{ // state 479
89,907, // "b"
90,907, // "o"
91,907, // "l"
92,907, // "e"
93,907, // "a"
94,907, // "n"
97,907, // "r"
98,907, // "k"
99,907, // "c"
100,907, // "s"
101,907, // "x"
102,907, // "t"
103,907, // "d"
104,907, // "f"
105,907, // "i"
106,907, // "w"
107,907, // "u"
108,907, // "p"
109,907, // "h"
110,907, // "v"
111,907, // "y"
112,907, // "m"
113,907, // "g"
114,907, // "z"
115,907, // "!"
116,907, // "="
117,907, // "%"
118,907, // "&"
119,907, // "("
120,907, // ")"
121,907, // "*"
122,907, // "/"
123,907, // "+"
124,907, // ","
125,907, // "-"
126,907, // "."
127,907, // ":"
128,907, // ";"
129,907, // "<"
130,907, // ">"
131,907, // "["
132,907, // "]"
133,907, // "{"
134,907, // "}"
135,907, // "|"
136,907, // "0"
137,907, // {"1".."9"}
138,907, // "X"
143,907, // "'"
144,907, // "\"
145,143, // printable
146,907, // '"'
151,907, // "_"
152,907, // {"A".."W" "Y".."Z" "j" "q"}
153,907, // " "
154,907, // {"#".."$" "?".."@" "^" "`" "~"}
160,883, // eol
162,1449, // commentContent**
163,200, // commentContent
167,1414, // {10}
168,999, // {13}
174,433, // commentContent*
  }
,
{ // state 480
112,611, // "m"
  }
,
{ // state 481
176,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 482
0x80000000|1604, // match move
0x80000000|279, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 483
90,70, // "o"
  }
,
{ // state 484
176,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 485
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 486
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 487
0x80000000|1617, // match move
0x80000000|75, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 488
-1, // $$start
-1, // start
1192, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+171, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+171, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+171, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+171, // "u"
1451, // "p"
MIN_REDUCTION+171, // "h"
483, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
816, // "g"
MIN_REDUCTION+171, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+171, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 489
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 490
5,436, // `boolean
6,1437, // `class
7,1200, // `extends
8,19, // `void
9,1069, // `int
10,288, // `while
11,747, // `if
12,412, // `else
13,1476, // `for
14,331, // `break
15,1511, // `this
16,1279, // `false
17,1389, // `true
18,1542, // `super
19,1416, // `null
20,1102, // `return
21,991, // `instanceof
22,1211, // `new
23,361, // `abstract
24,1548, // `assert
25,703, // `byte
26,1190, // `case
27,211, // `catch
28,1181, // `char
29,546, // `const
30,588, // `continue
31,1041, // `default
32,1507, // `do
33,191, // `double
34,1441, // `enum
35,210, // `final
36,1354, // `finally
37,1339, // `float
38,708, // `goto
39,243, // `implements
40,418, // `import
41,89, // `interface
42,68, // `long
43,1444, // `native
44,314, // `package
45,336, // `private
46,755, // `protected
47,1401, // `public
48,93, // `short
49,447, // `static
50,57, // `strictfp
51,27, // `switch
52,1049, // `synchronized
53,948, // `throw
54,1543, // `throws
55,325, // `transient
56,739, // `try
57,1143, // `volatile
89,1460, // "b"
91,1536, // "l"
92,1062, // "e"
93,1619, // "a"
94,1565, // "n"
97,1024, // "r"
99,527, // "c"
100,1524, // "s"
102,1544, // "t"
103,405, // "d"
104,223, // "f"
105,1472, // "i"
106,39, // "w"
108,1451, // "p"
110,483, // "v"
113,816, // "g"
  }
,
{ // state 491
0x80000000|20, // match move
0x80000000|281, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 492
0x80000000|1528, // match move
0x80000000|1351, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 493
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 494
0x80000000|275, // match move
0x80000000|1408, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 495
2,1155, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 496
116,1494, // "="
  }
,
{ // state 497
106,333, // "w"
  }
,
{ // state 498
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 499
0x80000000|449, // match move
0x80000000|676, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 500
2,1302, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 501
0x80000000|1557, // match move
0x80000000|766, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 502
2,1452, // ws*
153,902, // " "
158,1513, // ws
159,902, // {9}
160,1052, // eol
167,1567, // {10}
168,1379, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 503
0x80000000|349, // match move
0x80000000|1518, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 504
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 505
2,467, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 506
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 507
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 508
0x80000000|574, // match move
0x80000000|96, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 509
2,840, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 510
2,695, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 511
176,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 512
0x80000000|1349, // match move
0x80000000|1003, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 513
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 514
176,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 515
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 516
176,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 517
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 518
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+274, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 519
0x80000000|1, // match move
0x80000000|491, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 520
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 521
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 522
2,1130, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 523
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 524
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 525
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 527
90,453, // "o"
91,119, // "l"
93,1275, // "a"
109,308, // "h"
  }
,
{ // state 528
0x80000000|144, // match move
0x80000000|317, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 529
2,1355, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 530
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+280, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 531
176,MIN_REDUCTION+335, // $NT
  }
,
{ // state 532
-1, // $$start
-1, // start
499, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+279, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 533
2,849, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 534
0x80000000|1086, // match move
0x80000000|963, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 535
0x80000000|584, // match move
0x80000000|1305, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 536
0x80000000|377, // match move
0x80000000|694, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 537
99,1527, // "c"
  }
,
{ // state 538
0x80000000|956, // match move
0x80000000|1081, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 539
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+298, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 540
121,1458, // "*"
  }
,
{ // state 541
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 542
92,1580, // "e"
  }
,
{ // state 543
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 544
0x80000000|1500, // match move
0x80000000|202, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 545
0x80000000|339, // match move
0x80000000|1350, // no-match move
0x80000000|828, // NT-test-match state for digit
  }
,
{ // state 546
176,MIN_REDUCTION+169, // $NT
  }
,
{ // state 547
136,328, // "0"
137,328, // {"1".."9"}
142,545, // digit
  }
,
{ // state 548
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 549
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 550
-1, // $$start
-1, // start
1046, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+234, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+234, // "k"
527, // "c"
711, // "s"
MIN_REDUCTION+234, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+234, // "u"
1451, // "p"
MIN_REDUCTION+234, // "h"
483, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
816, // "g"
MIN_REDUCTION+234, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+234, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 551
0x80000000|391, // match move
0x80000000|73, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 552
0x80000000|1442, // match move
0x80000000|1172, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 553
92,1206, // "e"
  }
,
{ // state 554
0x80000000|793, // match move
0x80000000|1016, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 555
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 556
102,1189, // "t"
  }
,
{ // state 557
4,217, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
  }
,
{ // state 558
0x80000000|920, // match move
0x80000000|934, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 559
0x80000000|280, // match move
0x80000000|445, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 560
0x80000000|44, // match move
0x80000000|235, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 561
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 562
0x80000000|224, // match move
0x80000000|666, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 563
0x80000000|424, // match move
0x80000000|609, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 564
2,623, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 565
0x80000000|874, // match move
0x80000000|1038, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 566
-1, // $$start
-1, // start
580, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+297, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 567
93,376, // "a"
  }
,
{ // state 568
0x80000000|29, // match move
0x80000000|1421, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 569
105,1420, // "i"
  }
,
{ // state 570
1,463, // start
2,32, // ws*
3,1092, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
169,654, // token*
  }
,
{ // state 571
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+272, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 572
107,1587, // "u"
  }
,
{ // state 573
2,499, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 574
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 575
2,820, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 576
0x80000000|1346, // match move
0x80000000|709, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 577
2,535, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 578
2,1231, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 579
2,659, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 580
0x80000000|548, // match move
0x80000000|344, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 581
0x80000000|481, // match move
0x80000000|60, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 582
0x80000000|397, // match move
0x80000000|147, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 583
0x80000000|1549, // match move
0x80000000|808, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 584
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 585
97,1226, // "r"
  }
,
{ // state 586
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 587
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 588
176,MIN_REDUCTION+172, // $NT
  }
,
{ // state 589
0x80000000|230, // match move
0x80000000|416, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 590
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 591
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+296, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 592
0x80000000|1264, // match move
0x80000000|632, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 593
0x80000000|966, // match move
0x80000000|1242, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 594
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 595
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+155, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 596
2,580, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 597
102,1078, // "t"
  }
,
{ // state 598
93,1238, // "a"
  }
,
{ // state 599
2,535, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 600
107,857, // "u"
  }
,
{ // state 601
0x80000000|309, // match move
0x80000000|164, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 602
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 603
0x80000000|152, // match move
0x80000000|734, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 604
0x80000000|1550, // match move
0x80000000|916, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 605
176,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 606
0x80000000|761, // match move
0x80000000|637, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 607
-1, // $$start
-1, // start
534, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+253, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 608
0x80000000|371, // match move
0x80000000|1508, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 609
-1, // $$start
-1, // start
231, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+183, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+183, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+183, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+183, // "u"
1451, // "p"
MIN_REDUCTION+183, // "h"
483, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
816, // "g"
MIN_REDUCTION+183, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+183, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 610
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 611
0x80000000|1, // match move
0x80000000|563, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 612
99,1245, // "c"
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|772, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 614
2,58, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 615
2,1046, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 616
0x80000000|78, // match move
0x80000000|810, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 617
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 619
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+236, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
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
{ // state 620
0x80000000|1324, // match move
0x80000000|141, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 621
0x80000000|175, // match move
0x80000000|753, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 622
2,1355, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 623
0x80000000|1002, // match move
0x80000000|868, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 624
91,18, // "l"
  }
,
{ // state 625
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 626
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+282, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 627
0x80000000|446, // match move
0x80000000|1080, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 628
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 629
2,1373, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 630
2,1007, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 631
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+110, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 632
0x80000000|705, // match move
0x80000000|1277, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 633
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 634
0x80000000|740, // match move
0x80000000|1611, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 635
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 636
103,64, // "d"
  }
,
{ // state 637
0x80000000|704, // match move
0x80000000|404, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 638
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 639
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 640
90,181, // "o"
111,1356, // "y"
  }
,
{ // state 641
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 643
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 644
116,839, // "="
  }
,
{ // state 645
2,154, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 646
102,1252, // "t"
  }
,
{ // state 647
0x80000000|1, // match move
0x80000000|1001, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 648
113,1247, // "g"
  }
,
{ // state 649
0x80000000|1234, // match move
0x80000000|1137, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 650
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 651
4,217, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
83,942, // `/
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
136,1491, // "0"
150,689, // letter
  }
,
{ // state 652
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 654
0x80000000|767, // match move
0x80000000|771, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 655
0x80000000|1, // match move
0x80000000|502, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|719, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 657
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+276, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 658
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 659
0x80000000|714, // match move
0x80000000|1150, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 660
2,227, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 661
0x80000000|459, // match move
0x80000000|1180, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 662
0x80000000|599, // match move
0x80000000|456, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 663
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 664
0x80000000|1490, // match move
0x80000000|745, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 665
2,565, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 666
0x80000000|1564, // match move
0x80000000|762, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 667
0x80000000|1, // match move
0x80000000|1495, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 668
102,1165, // "t"
  }
,
{ // state 669
0x80000000|742, // match move
0x80000000|1315, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 670
0x80000000|150, // match move
0x80000000|475, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 671
97,103, // "r"
105,124, // "i"
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|616, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 673
176,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 674
0x80000000|1605, // match move
0x80000000|1310, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 675
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 676
0x80000000|1311, // match move
0x80000000|576, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 677
91,1537, // "l"
  }
,
{ // state 678
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 679
0x80000000|123, // match move
0x80000000|403, // no-match move
0x80000000|1220, // NT-test-match state for commentElement
  }
,
{ // state 680
92,862, // "e"
  }
,
{ // state 681
0x80000000|726, // match move
0x80000000|503, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 682
0x80000000|1585, // match move
0x80000000|940, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 683
97,1282, // "r"
  }
,
{ // state 684
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 685
0x80000000|1474, // match move
0x80000000|171, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 686
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 687
167,983, // {10}
  }
,
{ // state 688
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+302, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 689
0x80000000|814, // match move
0x80000000|5, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 690
176,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 691
0x80000000|76, // match move
0x80000000|651, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 692
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 693
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 694
-1, // $$start
-1, // start
685, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
-1, // `=
-1, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
MIN_REDUCTION+249, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+249, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 695
0x80000000|107, // match move
0x80000000|1613, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 696
97,311, // "r"
  }
,
{ // state 697
0x80000000|270, // match move
0x80000000|863, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 698
0x80000000|1, // match move
0x80000000|932, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 699
0x80000000|1560, // match move
0x80000000|1481, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 700
2,620, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 701
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 702
105,95, // "i"
  }
,
{ // state 703
176,MIN_REDUCTION+157, // $NT
  }
,
{ // state 704
2,685, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 705
176,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 706
0x80000000|996, // match move
0x80000000|1059, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 707
0x80000000|1138, // match move
0x80000000|245, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 708
176,MIN_REDUCTION+196, // $NT
  }
,
{ // state 709
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+278, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 710
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+161, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 711
0x80000000|1187, // match move
0x80000000|1344, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 712
0x80000000|1403, // match move
0x80000000|1459, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 713
135,384, // "|"
  }
,
{ // state 714
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 715
0x80000000|255, // match move
0x80000000|388, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 716
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 717
111,1356, // "y"
  }
,
{ // state 718
2,1192, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 719
0x80000000|780, // match move
0x80000000|293, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 720
0x80000000|1423, // match move
0x80000000|1228, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 721
97,222, // "r"
  }
,
{ // state 722
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+252, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 723
2,53, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 725
0x80000000|374, // match move
0x80000000|1182, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 726
2,568, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 727
0x80000000|1167, // match move
0x80000000|1309, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 728
0x80000000|114, // match move
0x80000000|1521, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 729
104,1271, // "f"
  }
,
{ // state 730
0x80000000|928, // match move
0x80000000|1019, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 731
0x80000000|379, // match move
0x80000000|69, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 732
0x80000000|1432, // match move
0x80000000|571, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 733
91,717, // "l"
  }
,
{ // state 734
0x80000000|251, // match move
0x80000000|468, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 735
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 736
160,484, // eol
161,1148, // printable**
167,1567, // {10}
168,1379, // {13}
170,345, // printable*
  }
,
{ // state 737
94,1174, // "n"
  }
,
{ // state 738
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 739
176,MIN_REDUCTION+244, // $NT
  }
,
{ // state 740
116,1332, // "="
  }
,
{ // state 741
2,1558, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 742
92,585, // "e"
  }
,
{ // state 743
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 744
0x80000000|1319, // match move
0x80000000|3, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 745
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+262, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 746
0x80000000|358, // match move
0x80000000|360, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 747
176,MIN_REDUCTION+112, // $NT
  }
,
{ // state 748
0x80000000|931, // match move
0x80000000|1176, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 749
176,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 750
2,695, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 751
-1, // $$start
-1, // start
849, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+310, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+310, // $
-1, // $NT
  }
,
{ // state 752
0x80000000|1552, // match move
0x80000000|938, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 753
0x80000000|935, // match move
0x80000000|688, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 754
176,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 755
176,MIN_REDUCTION+220, // $NT
  }
,
{ // state 756
0x80000000|1, // match move
0x80000000|492, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 757
0x80000000|1, // match move
0x80000000|706, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 758
0x80000000|1124, // match move
0x80000000|930, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 759
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 760
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 761
116,1301, // "="
  }
,
{ // state 762
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+185, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 763
2,620, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 764
-1, // $$start
-1, // start
1576, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
-1, // `=
-1, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
MIN_REDUCTION+281, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+281, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 765
112,1393, // "m"
  }
,
{ // state 766
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+366, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+366, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+366, // $
-1, // $NT
  }
,
{ // state 767
0x80000000|1, // match move
0x80000000|1307, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 768
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 769
2,1598, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 770
122,540, // "/"
162,1449, // commentContent**
163,200, // commentContent
164,1596, // nestedCommentStart
174,433, // commentContent*
  }
,
{ // state 771
0x80000000|691, // match move
0x80000000|462, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 772
0x80000000|1159, // match move
0x80000000|1285, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 773
0x80000000|1070, // match move
0x80000000|118, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 774
89,265, // "b"
90,265, // "o"
91,265, // "l"
92,265, // "e"
93,265, // "a"
94,265, // "n"
97,265, // "r"
98,265, // "k"
99,265, // "c"
100,265, // "s"
101,265, // "x"
102,265, // "t"
103,265, // "d"
104,265, // "f"
105,265, // "i"
106,265, // "w"
107,265, // "u"
108,265, // "p"
109,265, // "h"
110,265, // "v"
111,265, // "y"
112,265, // "m"
113,265, // "g"
114,265, // "z"
115,265, // "!"
116,265, // "="
117,265, // "%"
118,265, // "&"
119,265, // "("
120,265, // ")"
121,265, // "*"
122,265, // "/"
123,265, // "+"
124,265, // ","
125,265, // "-"
126,265, // "."
127,265, // ":"
128,265, // ";"
129,265, // "<"
130,265, // ">"
131,265, // "["
132,265, // "]"
133,265, // "{"
134,265, // "}"
135,265, // "|"
136,265, // "0"
137,265, // {"1".."9"}
138,265, // "X"
143,265, // "'"
144,265, // "\"
145,842, // printable
146,265, // '"'
151,265, // "_"
152,265, // {"A".."W" "Y".."Z" "j" "q"}
153,265, // " "
154,265, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 775
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 776
0x80000000|650, // match move
0x80000000|414, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 777
90,1312, // "o"
91,937, // "l"
  }
,
{ // state 778
-1, // $$start
-1, // start
840, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+293, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 779
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+101, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 780
2,55, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 781
93,104, // "a"
105,1077, // "i"
107,88, // "u"
111,1429, // "y"
  }
,
{ // state 782
0x80000000|34, // match move
0x80000000|1402, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 783
0x80000000|949, // match move
0x80000000|1455, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 784
91,519, // "l"
  }
,
{ // state 785
92,1331, // "e"
  }
,
{ // state 786
105,1395, // "i"
  }
,
{ // state 787
0x80000000|1283, // match move
0x80000000|953, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 788
0x80000000|1314, // match move
0x80000000|1028, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 789
0x80000000|470, // match move
0x80000000|1365, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 790
2,558, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 791
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 792
-1, // $$start
-1, // start
1007, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+305, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 793
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 794
4,217, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
83,942, // `/
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
97,105, // "r"
98,105, // "k"
99,105, // "c"
100,105, // "s"
101,105, // "x"
102,105, // "t"
103,105, // "d"
104,105, // "f"
105,105, // "i"
106,105, // "w"
107,105, // "u"
108,105, // "p"
109,105, // "h"
110,105, // "v"
111,105, // "y"
112,105, // "m"
113,105, // "g"
114,105, // "z"
115,606, // "!"
116,1235, // "="
117,61, // "%"
118,256, // "&"
119,102, // "("
120,748, // ")"
122,1529, // "/"
123,1118, // "+"
124,674, // ","
125,1478, // "-"
126,196, // "."
127,1248, // ":"
128,1223, // ";"
129,1467, // "<"
130,634, // ">"
131,1502, // "["
132,1618, // "]"
133,207, // "{"
134,80, // "}"
135,713, // "|"
136,328, // "0"
137,328, // {"1".."9"}
138,105, // "X"
139,1048, // intLit2
141,1364, // digit++
142,831, // digit
143,92, // "'"
146,715, // '"'
150,689, // letter
152,105, // {"A".."W" "Y".."Z" "j" "q"}
172,7, // digit+
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 795
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 796
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+104, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 797
0x80000000|1, // match move
0x80000000|752, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 798
176,MIN_REDUCTION+338, // $NT
  }
,
{ // state 799
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 800
-1, // $$start
-1, // start
898, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+283, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 801
0x80000000|564, // match move
0x80000000|888, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 802
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 803
0x80000000|1262, // match move
0x80000000|113, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 804
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 805
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 806
92,656, // "e"
  }
,
{ // state 807
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 808
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+292, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 809
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+149, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 810
-1, // $$start
-1, // start
788, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+105, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+105, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+105, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+105, // "u"
1451, // "p"
MIN_REDUCTION+105, // "h"
483, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
816, // "g"
MIN_REDUCTION+105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+105, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 811
0x80000000|266, // match move
0x80000000|1374, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 812
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 813
0x80000000|1436, // match move
0x80000000|1270, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 814
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,925, // idChar
97,105, // "r"
98,105, // "k"
99,105, // "c"
100,105, // "s"
101,105, // "x"
102,105, // "t"
103,105, // "d"
104,105, // "f"
105,105, // "i"
106,105, // "w"
107,105, // "u"
108,105, // "p"
109,105, // "h"
110,105, // "v"
111,105, // "y"
112,105, // "m"
113,105, // "g"
114,105, // "z"
136,1540, // "0"
137,1540, // {"1".."9"}
138,105, // "X"
142,213, // digit
150,699, // letter
151,1222, // "_"
152,105, // {"A".."W" "Y".."Z" "j" "q"}
156,987, // idChar**
173,1280, // idChar*
  }
,
{ // state 815
2,534, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 816
90,646, // "o"
  }
,
{ // state 817
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 818
2,712, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 819
109,876, // "h"
  }
,
{ // state 820
0x80000000|489, // match move
0x80000000|592, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 821
0x80000000|1098, // match move
0x80000000|443, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 822
101,975, // "x"
136,328, // "0"
137,328, // {"1".."9"}
138,975, // "X"
140,897, // `x
141,603, // digit++
142,831, // digit
172,7, // digit+
  }
,
{ // state 823
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 824
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+250, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 825
0x80000000|505, // match move
0x80000000|1199, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 826
100,954, // "s"
  }
,
{ // state 827
92,1039, // "e"
  }
,
{ // state 828
136,212, // "0"
137,212, // {"1".."9"}
  }
,
{ // state 829
-1, // $$start
-1, // start
439, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
-1, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
-1, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+269, // "*"
1008, // "/"
1118, // "+"
674, // ","
MIN_REDUCTION+269, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+269, // $
-1, // $NT
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
{ // state 830
0x80000000|1034, // match move
0x80000000|316, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 831
0x80000000|832, // match move
0x80000000|899, // no-match move
0x80000000|828, // NT-test-match state for digit
  }
,
{ // state 832
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 833
0x80000000|600, // match move
0x80000000|730, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 834
0x80000000|1562, // match move
0x80000000|885, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 835
0x80000000|134, // match move
0x80000000|595, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 836
0x80000000|1156, // match move
0x80000000|664, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 837
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 838
94,364, // "n"
  }
,
{ // state 839
0x80000000|341, // match move
0x80000000|458, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 840
0x80000000|1592, // match move
0x80000000|1064, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 841
0x80000000|136, // match move
0x80000000|1457, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 842
0x80000000|610, // match move
0x80000000|878, // no-match move
0x80000000|386, // NT-test-match state for printable
  }
,
{ // state 843
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 844
113,315, // "g"
  }
,
{ // state 845
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 846
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 847
0x80000000|1, // match move
0x80000000|964, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 848
0x80000000|718, // match move
0x80000000|488, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 849
0x80000000|398, // match move
0x80000000|130, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 850
0x80000000|184, // match move
0x80000000|967, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 851
2,580, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 852
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+137, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 853
0x80000000|614, // match move
0x80000000|109, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 854
-1, // $$start
-1, // start
298, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+271, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 855
0x80000000|1084, // match move
0x80000000|438, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 856
0x80000000|880, // match move
0x80000000|1021, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 857
89,677, // "b"
  }
,
{ // state 858
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 859
176,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 860
2,1231, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 861
0x80000000|177, // match move
0x80000000|725, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 862
103,1517, // "d"
  }
,
{ // state 863
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+212, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 864
0x80000000|1, // match move
0x80000000|1602, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 865
91,900, // "l"
94,273, // "n"
97,1226, // "r"
101,1209, // "x"
  }
,
{ // state 866
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 867
0x80000000|625, // match move
0x80000000|1589, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 868
0x80000000|506, // match move
0x80000000|875, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 869
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 870
2,28, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 871
0x80000000|1, // match move
0x80000000|825, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 872
0x80000000|1386, // match move
0x80000000|157, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 873
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+92, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 874
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 875
0x80000000|1601, // match move
0x80000000|430, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 876
0x80000000|1, // match move
0x80000000|853, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 877
0x80000000|1, // match move
0x80000000|976, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 878
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 879
0x80000000|858, // match move
0x80000000|347, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 880
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 881
0x80000000|407, // match move
0x80000000|697, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 882
0x80000000|290, // match move
0x80000000|760, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 883
0x80000000|1575, // match move
0x80000000|52, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 884
89,205, // "b"
90,205, // "o"
91,205, // "l"
92,205, // "e"
93,205, // "a"
94,205, // "n"
97,205, // "r"
98,205, // "k"
99,205, // "c"
100,205, // "s"
101,205, // "x"
102,205, // "t"
103,205, // "d"
104,205, // "f"
105,205, // "i"
106,205, // "w"
107,205, // "u"
108,205, // "p"
109,205, // "h"
110,205, // "v"
111,205, // "y"
112,205, // "m"
113,205, // "g"
114,205, // "z"
115,205, // "!"
116,205, // "="
117,205, // "%"
118,205, // "&"
119,205, // "("
120,205, // ")"
121,205, // "*"
122,205, // "/"
123,205, // "+"
124,205, // ","
125,205, // "-"
126,205, // "."
127,205, // ":"
128,205, // ";"
129,205, // "<"
130,205, // ">"
131,205, // "["
132,205, // "]"
133,205, // "{"
134,205, // "}"
135,205, // "|"
136,205, // "0"
137,205, // {"1".."9"}
138,205, // "X"
143,205, // "'"
144,205, // "\"
145,409, // printable
146,205, // '"'
149,879, // stringChar
151,205, // "_"
152,205, // {"A".."W" "Y".."Z" "j" "q"}
153,205, // " "
154,205, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 885
0x80000000|617, // match move
0x80000000|835, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 886
109,683, // "h"
  }
,
{ // state 887
0x80000000|38, // match move
0x80000000|274, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 888
-1, // $$start
-1, // start
623, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+314, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 889
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 890
-1, // $$start
-1, // start
969, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+216, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+216, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+216, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+216, // "u"
1451, // "p"
MIN_REDUCTION+216, // "h"
483, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
816, // "g"
MIN_REDUCTION+216, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+216, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 891
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 892
93,1293, // "a"
  }
,
{ // state 893
176,MIN_REDUCTION+334, // $NT
  }
,
{ // state 894
92,696, // "e"
  }
,
{ // state 895
176,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 896
92,1492, // "e"
  }
,
{ // state 897
136,328, // "0"
137,328, // {"1".."9"}
141,1274, // digit++
142,831, // digit
172,7, // digit+
  }
,
{ // state 898
0x80000000|1158, // match move
0x80000000|943, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 899
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 900
100,318, // "s"
  }
,
{ // state 901
0x80000000|1097, // match move
0x80000000|477, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 902
176,MIN_REDUCTION+328, // $NT
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 903
0x80000000|939, // match move
0x80000000|1183, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 904
0x80000000|658, // match move
0x80000000|461, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 905
2,1240, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 906
0x80000000|1160, // match move
0x80000000|926, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 907
0x80000000|1573, // match move
0x80000000|334, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 908
0x80000000|968, // match move
0x80000000|1287, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 909
0x80000000|1327, // match move
0x80000000|1553, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 910
0x80000000|1166, // match move
0x80000000|1477, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 911
0x80000000|94, // match move
0x80000000|1244, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 912
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 913
107,354, // "u"
  }
,
{ // state 914
2,1007, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 915
2,1398, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 916
0x80000000|615, // match move
0x80000000|550, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 917
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 918
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 919
0x80000000|510, // match move
0x80000000|1321, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 920
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 921
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 922
2,685, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 923
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 924
-1, // $$start
-1, // start
1398, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+150, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+150, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+150, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+150, // "u"
1451, // "p"
MIN_REDUCTION+150, // "h"
483, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
816, // "g"
MIN_REDUCTION+150, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+150, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 925
0x80000000|555, // match move
0x80000000|421, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 926
0x80000000|1358, // match move
0x80000000|1140, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 927
0x80000000|690, // match move
0x80000000|1341, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 928
2,268, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 929
-1, // $$start
-1, // start
1196, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+168, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+168, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+168, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+168, // "u"
1451, // "p"
MIN_REDUCTION+168, // "h"
483, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
816, // "g"
MIN_REDUCTION+168, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+168, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 930
0x80000000|322, // match move
0x80000000|1027, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 931
2,535, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 932
0x80000000|97, // match move
0x80000000|218, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 933
104,350, // "f"
  }
,
{ // state 934
0x80000000|866, // match move
0x80000000|1369, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 935
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 936
0x80000000|1, // match move
0x80000000|998, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 937
92,765, // "e"
  }
,
{ // state 938
-1, // $$start
-1, // start
396, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+96, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+96, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+96, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+96, // "u"
1451, // "p"
MIN_REDUCTION+96, // "h"
483, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
816, // "g"
MIN_REDUCTION+96, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+96, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 939
2,54, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 940
0x80000000|1195, // match move
0x80000000|901, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 941
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 942
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 943
0x80000000|549, // match move
0x80000000|1291, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 944
0x80000000|238, // match move
0x80000000|773, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 945
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+113, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 946
92,1519, // "e"
  }
,
{ // state 947
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 948
176,MIN_REDUCTION+235, // $NT
  }
,
{ // state 949
0x80000000|770, // match move
0x80000000|479, // no-match move
0x80000000|1220, // NT-test-match state for commentElement
  }
,
{ // state 950
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 951
0x80000000|189, // match move
0x80000000|277, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 952
0x80000000|1, // match move
0x80000000|1440, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 953
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+248, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 954
0x80000000|1, // match move
0x80000000|903, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 955
-1, // $$start
-1, // start
1373, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+291, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 956
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 957
2,776, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 958
0x80000000|1483, // match move
0x80000000|441, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 959
151,MIN_REDUCTION+320, // "_"
156,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 960
-1, // $$start
-1, // start
682, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+192, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+192, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+192, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+192, // "u"
1451, // "p"
MIN_REDUCTION+192, // "h"
483, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
816, // "g"
MIN_REDUCTION+192, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+192, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 961
89,362, // "b"
  }
,
{ // state 962
2,1139, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 963
0x80000000|1033, // match move
0x80000000|1297, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 964
0x80000000|1093, // match move
0x80000000|960, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 965
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 966
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 967
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+164, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 968
176,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 969
0x80000000|846, // match move
0x80000000|1032, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 970
2,834, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 971
0x80000000|156, // match move
0x80000000|129, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 972
0x80000000|63, // match move
0x80000000|621, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 973
-1, // $$start
-1, // start
1615, // ws*
-1, // $$0
MIN_REDUCTION+325, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+325, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
795, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+325, // $
-1, // $NT
  }
,
{ // state 974
91,365, // "l"
  }
,
{ // state 975
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 976
0x80000000|1099, // match move
0x80000000|1325, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 977
-1, // $$start
-1, // start
1155, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+231, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+231, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+231, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+231, // "u"
1451, // "p"
MIN_REDUCTION+231, // "h"
483, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
816, // "g"
MIN_REDUCTION+231, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+231, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 978
0x80000000|817, // match move
0x80000000|1419, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 979
102,312, // "t"
  }
,
{ // state 980
-1, // $$start
-1, // start
387, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+225, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+225, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+225, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+225, // "u"
1451, // "p"
MIN_REDUCTION+225, // "h"
483, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
816, // "g"
MIN_REDUCTION+225, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+225, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 981
176,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 982
0x80000000|139, // match move
0x80000000|383, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 983
0x80000000|843, // match move
0x80000000|127, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 984
0x80000000|1454, // match move
0x80000000|944, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 985
102,357, // "t"
  }
,
{ // state 986
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 987
0x80000000|1396, // match move
0x80000000|887, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 988
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 990
176,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 991
176,MIN_REDUCTION+115, // $NT
  }
,
{ // state 992
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 993
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 994
97,757, // "r"
  }
,
{ // state 995
0x80000000|1, // match move
0x80000000|848, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 996
2,1153, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 997
0x80000000|516, // match move
0x80000000|873, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 998
0x80000000|645, // match move
0x80000000|2, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 999
0x80000000|687, // match move
0x80000000|194, // no-match move
// T-test match for 10:
167,
  }
,
{ // state 1000
0x80000000|33, // match move
0x80000000|582, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1001
0x80000000|192, // match move
0x80000000|283, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1002
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1003
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+227, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 1004
122,297, // "/"
164,369, // nestedCommentStart
  }
,
{ // state 1005
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1006
93,45, // "a"
  }
,
{ // state 1007
0x80000000|1406, // match move
0x80000000|482, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1008
0x80000000|410, // match move
0x80000000|1496, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1009
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+284, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 1010
0x80000000|138, // match move
0x80000000|303, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1011
100,437, // "s"
  }
,
{ // state 1012
0x80000000|1300, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1013
0x80000000|1609, // match move
0x80000000|185, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1014
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1015
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1016
0x80000000|1471, // match move
0x80000000|779, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1017
3,735, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
169,654, // token*
  }
,
{ // state 1018
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,508, // idChar
97,105, // "r"
98,105, // "k"
99,105, // "c"
100,105, // "s"
101,105, // "x"
102,105, // "t"
103,105, // "d"
104,105, // "f"
105,105, // "i"
106,105, // "w"
107,105, // "u"
108,105, // "p"
109,105, // "h"
110,105, // "v"
111,105, // "y"
112,105, // "m"
113,105, // "g"
114,105, // "z"
136,1540, // "0"
137,1540, // {"1".."9"}
138,105, // "X"
142,213, // digit
150,699, // letter
151,1222, // "_"
152,105, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1019
-1, // $$start
-1, // start
268, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+177, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+177, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+177, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
857, // "u"
1451, // "p"
MIN_REDUCTION+177, // "h"
483, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
816, // "g"
MIN_REDUCTION+177, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+177, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 1020
2,439, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1021
0x80000000|17, // match move
0x80000000|1336, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1022
0x80000000|427, // match move
0x80000000|1430, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1023
0x80000000|257, // match move
0x80000000|15, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1024
92,1221, // "e"
  }
,
{ // state 1025
0x80000000|1390, // match move
0x80000000|518, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1026
2,387, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1027
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+176, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 1028
0x80000000|1426, // match move
0x80000000|1210, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1029
0x80000000|543, // match move
0x80000000|178, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1030
0x80000000|411, // match move
0x80000000|82, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1031
99,11, // "c"
  }
,
{ // state 1032
0x80000000|1333, // match move
0x80000000|927, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1033
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1034
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1035
167,380, // {10}
  }
,
{ // state 1036
2,197, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1037
92,672, // "e"
  }
,
{ // state 1038
0x80000000|1290, // match move
0x80000000|214, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1039
0x80000000|1, // match move
0x80000000|1083, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1040
100,48, // "s"
102,669, // "t"
  }
,
{ // state 1041
176,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1042
2,1000, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1043
-1, // $$start
-1, // start
712, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+243, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+243, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+243, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+243, // "u"
1451, // "p"
MIN_REDUCTION+243, // "h"
483, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
816, // "g"
MIN_REDUCTION+243, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+243, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 1044
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1045
0x80000000|425, // match move
0x80000000|329, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1046
0x80000000|1463, // match move
0x80000000|1191, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1047
176,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1048
0x80000000|914, // match move
0x80000000|1215, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1049
176,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1050
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+173, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 1051
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1052
176,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1053
0x80000000|1163, // match move
0x80000000|929, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1054
102,23, // "t"
  }
,
{ // state 1055
94,40, // "n"
  }
,
{ // state 1056
-1, // $$start
-1, // start
813, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+295, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+295, // $
-1, // $NT
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
{ // state 1057
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1058
2,813, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1059
-1, // $$start
-1, // start
1153, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+165, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+165, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+165, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+165, // "u"
1451, // "p"
MIN_REDUCTION+165, // "h"
483, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
816, // "g"
MIN_REDUCTION+165, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+165, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 1060
0x80000000|1523, // match move
0x80000000|41, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1061
0x80000000|1612, // match move
0x80000000|1286, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1062
91,900, // "l"
94,273, // "n"
101,1209, // "x"
  }
,
{ // state 1063
-1, // $$start
-1, // start
1231, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+273, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1064
0x80000000|686, // match move
0x80000000|583, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1065
-1, // $$start
-1, // start
1289, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+267, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 1066
4,217, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
89,1460, // "b"
91,1536, // "l"
92,1062, // "e"
93,1619, // "a"
94,1565, // "n"
97,1024, // "r"
99,527, // "c"
100,1524, // "s"
102,1544, // "t"
103,405, // "d"
104,223, // "f"
105,1472, // "i"
106,39, // "w"
108,1451, // "p"
110,483, // "v"
113,816, // "g"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1067
0x80000000|733, // match move
0x80000000|1184, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1068
0x80000000|1378, // match move
0x80000000|242, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1069
176,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1070
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1071
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1072
0x80000000|1304, // match move
0x80000000|971, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1073
0x80000000|791, // match move
0x80000000|465, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1074
107,1237, // "u"
  }
,
{ // state 1075
2,840, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1076
0x80000000|1258, // match move
0x80000000|710, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1077
99,66, // "c"
  }
,
{ // state 1078
0x80000000|1, // match move
0x80000000|1194, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1079
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1080
0x80000000|460, // match move
0x80000000|1461, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1081
0x80000000|1607, // match move
0x80000000|657, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1082
97,110, // "r"
  }
,
{ // state 1083
0x80000000|970, // match move
0x80000000|1104, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1084
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1085
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1086
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1087
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1088
2,1022, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1089
2,544, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1090
-1, // $$start
-1, // start
659, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+246, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+246, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+246, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+246, // "u"
1451, // "p"
MIN_REDUCTION+246, // "h"
483, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
816, // "g"
MIN_REDUCTION+246, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+246, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 1091
94,117, // "n"
  }
,
{ // state 1092
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1093
2,682, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1094
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+224, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 1095
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+152, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 1096
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1097
176,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1098
176,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1099
2,229, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1100
2,1289, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1101
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1102
176,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1103
176,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1104
-1, // $$start
-1, // start
834, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+156, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+156, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+156, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+156, // "u"
1451, // "p"
MIN_REDUCTION+156, // "h"
483, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
816, // "g"
MIN_REDUCTION+156, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+156, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 1105
2,898, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1106
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1107
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+260, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1108
176,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1109
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+188, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1110
0x80000000|153, // match move
0x80000000|346, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1111
97,225, // "r"
  }
,
{ // state 1112
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1113
-1, // $$start
-1, // start
1243, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+102, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+102, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+102, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+102, // "u"
1451, // "p"
MIN_REDUCTION+102, // "h"
483, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
816, // "g"
MIN_REDUCTION+102, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+102, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 1114
0x80000000|163, // match move
0x80000000|1288, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 1115
0x80000000|1578, // match move
0x80000000|1273, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1116
0x80000000|1, // match move
0x80000000|1147, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1117
0x80000000|30, // match move
0x80000000|1447, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1118
0x80000000|21, // match move
0x80000000|56, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1119
100,422, // "s"
  }
,
{ // state 1120
0x80000000|236, // match move
0x80000000|14, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1121
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1122
0x80000000|1, // match move
0x80000000|1168, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1123
0x80000000|1366, // match move
0x80000000|1489, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1124
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1125
0x80000000|1360, // match move
0x80000000|1554, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1126
0x80000000|525, // match move
0x80000000|101, // no-match move
0x80000000|386, // NT-test-match state for printable
  }
,
{ // state 1127
99,151, // "c"
  }
,
{ // state 1128
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1129
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1130
0x80000000|1193, // match move
0x80000000|593, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1131
94,892, // "n"
  }
,
{ // state 1132
0x80000000|1450, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1133
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1134
99,382, // "c"
  }
,
{ // state 1135
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1136
-1, // $$start
-1, // start
820, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+219, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+219, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+219, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+219, // "u"
1451, // "p"
MIN_REDUCTION+219, // "h"
483, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
816, // "g"
MIN_REDUCTION+219, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+219, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 1137
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+245, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 1138
176,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1139
0x80000000|142, // match move
0x80000000|355, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1140
-1, // $$start
-1, // start
528, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+299, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1141
0x80000000|1036, // match move
0x80000000|1259, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1142
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1143
176,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1144
2,813, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1145
122,86, // "/"
  }
,
{ // state 1146
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1147
0x80000000|495, // match move
0x80000000|977, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1148
160,1381, // eol
167,1567, // {10}
168,1379, // {13}
  }
,
{ // state 1149
2,1576, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1150
0x80000000|373, // match move
0x80000000|649, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1151
0x80000000|1017, // match move
0x80000000|1599, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1152
2,1615, // ws*
156,987, // idChar**
157,515, // $$2
158,1513, // ws
160,1052, // eol
173,1280, // idChar*
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1153
0x80000000|13, // match move
0x80000000|286, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1154
0x80000000|579, // match move
0x80000000|1090, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1155
0x80000000|1318, // match move
0x80000000|393, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1156
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1157
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1158
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1159
2,811, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1160
2,528, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1161
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1162
0x80000000|1087, // match move
0x80000000|581, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1163
2,1196, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1164
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1165
0x80000000|1, // match move
0x80000000|1208, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1166
2,1355, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1167
2,1130, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1168
0x80000000|1577, // match move
0x80000000|260, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1169
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1170
0x80000000|304, // match move
0x80000000|1370, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1171
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1172
0x80000000|1254, // match move
0x80000000|1025, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1173
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1174
0x80000000|1, // match move
0x80000000|1132, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1175
0x80000000|158, // match move
0x80000000|501, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1176
0x80000000|577, // match move
0x80000000|662, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1177
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1178
0x80000000|1, // match move
0x80000000|1023, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1179
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1180
-1, // $$start
-1, // start
1298, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+308, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 1181
176,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1182
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+194, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1183
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+198, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+198, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+198, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+198, // "u"
1451, // "p"
MIN_REDUCTION+198, // "h"
483, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
816, // "g"
MIN_REDUCTION+198, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+198, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 1184
0x80000000|1322, // match move
0x80000000|1509, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1185
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1186
0x80000000|1530, // match move
0x80000000|1162, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1187
102,1569, // "t"
106,786, // "w"
107,126, // "u"
109,1320, // "h"
111,1091, // "y"
  }
,
{ // state 1188
93,215, // "a"
  }
,
{ // state 1189
105,220, // "i"
  }
,
{ // state 1190
176,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1191
0x80000000|1164, // match move
0x80000000|911, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1192
0x80000000|768, // match move
0x80000000|161, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1193
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1194
0x80000000|665, // match move
0x80000000|1216, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1195
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1196
0x80000000|51, // match move
0x80000000|627, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1197
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1198
0x80000000|1151, // match move
0x80000000|204, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1199
-1, // $$start
-1, // start
467, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+93, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+93, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+93, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+93, // "u"
1451, // "p"
MIN_REDUCTION+93, // "h"
483, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
816, // "g"
MIN_REDUCTION+93, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+93, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 1200
176,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1201
-1, // $$start
-1, // start
811, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+237, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+237, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+237, // "x"
1473, // "t"
405, // "d"
223, // "f"
1472, // "i"
1388, // "w"
126, // "u"
1451, // "p"
1320, // "h"
483, // "v"
1091, // "y"
MIN_REDUCTION+237, // "m"
816, // "g"
MIN_REDUCTION+237, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+237, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1202
92,221, // "e"
  }
,
{ // state 1203
108,777, // "p"
  }
,
{ // state 1204
2,1576, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1205
0x80000000|448, // match move
0x80000000|83, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1206
0x80000000|1, // match move
0x80000000|1154, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1207
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1208
0x80000000|248, // match move
0x80000000|59, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1209
102,542, // "t"
  }
,
{ // state 1210
0x80000000|1556, // match move
0x80000000|796, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1211
176,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1212
0x80000000|1, // match move
0x80000000|1141, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1213
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1214
94,226, // "n"
  }
,
{ // state 1215
0x80000000|630, // match move
0x80000000|25, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1216
-1, // $$start
-1, // start
565, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+174, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+174, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+174, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+174, // "u"
1451, // "p"
MIN_REDUCTION+174, // "h"
483, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
816, // "g"
MIN_REDUCTION+174, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+174, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 1217
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1218
0x80000000|1614, // match move
0x80000000|1233, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1219
2,1243, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1220
121,1535, // "*"
122,297, // "/"
164,269, // nestedCommentStart
165,1438, // nestedCommentEnd
  }
,
{ // state 1221
102,572, // "t"
  }
,
{ // state 1222
0x80000000|889, // match move
0x80000000|1005, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1223
0x80000000|573, // match move
0x80000000|262, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1224
176,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1225
-1, // $$start
-1, // start
1000, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+114, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+114, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+114, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+114, // "u"
1451, // "p"
MIN_REDUCTION+114, // "h"
483, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
816, // "g"
MIN_REDUCTION+114, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+114, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 1226
104,567, // "f"
  }
,
{ // state 1227
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1228
0x80000000|605, // match move
0x80000000|1499, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1229
2,984, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1230
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+290, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1231
0x80000000|692, // match move
0x80000000|367, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1232
0x80000000|233, // match move
0x80000000|324, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1233
-1, // $$start
-1, // start
728, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+99, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+99, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+99, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+99, // "u"
1451, // "p"
MIN_REDUCTION+99, // "h"
483, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
816, // "g"
MIN_REDUCTION+99, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+99, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 1234
176,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1235
0x80000000|496, // match move
0x80000000|1446, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1236
0x80000000|947, // match move
0x80000000|1076, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1237
91,597, // "l"
  }
,
{ // state 1238
94,295, // "n"
  }
,
{ // state 1239
176,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1240
0x80000000|485, // match move
0x80000000|551, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1241
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1242
0x80000000|395, // match move
0x80000000|824, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1243
0x80000000|1051, // match move
0x80000000|554, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1244
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+233, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 1245
102,65, // "t"
  }
,
{ // state 1246
0x80000000|8, // match move
0x80000000|400, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1247
92,877, // "e"
  }
,
{ // state 1248
0x80000000|529, // match move
0x80000000|910, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1249
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1250
93,1054, // "a"
  }
,
{ // state 1251
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+89, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 1252
90,1212, // "o"
  }
,
{ // state 1253
2,227, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1254
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1255
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1256
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1257
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1258
176,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1259
-1, // $$start
-1, // start
197, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+195, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+195, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+195, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+195, // "u"
1451, // "p"
MIN_REDUCTION+195, // "h"
483, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
816, // "g"
MIN_REDUCTION+195, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+195, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
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
{ // state 1260
-1, // $$start
-1, // start
165, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+90, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+90, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+90, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+90, // "u"
1451, // "p"
MIN_REDUCTION+90, // "h"
483, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
816, // "g"
MIN_REDUCTION+90, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+90, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+90, // $
MIN_REDUCTION+90, // $NT
  }
,
{ // state 1261
-1, // $$start
-1, // start
1383, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+257, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1262
176,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1263
0x80000000|232, // match move
0x80000000|451, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1264
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1265
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1266
0x80000000|289, // match move
0x80000000|803, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1267
0x80000000|1179, // match move
0x80000000|855, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1268
176,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1269
2,1139, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1270
0x80000000|159, // match move
0x80000000|320, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1271
0x80000000|1, // match move
0x80000000|1525, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1272
0x80000000|1, // match move
0x80000000|1218, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1273
0x80000000|511, // match move
0x80000000|1095, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1274
0x80000000|1586, // match move
0x80000000|137, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1275
100,1202, // "s"
102,1031, // "t"
  }
,
{ // state 1276
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1277
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+218, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 1278
2,534, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1279
176,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1280
0x80000000|1018, // match move
0x80000000|845, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1281
176,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1282
90,1055, // "o"
  }
,
{ // state 1283
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1284
0x80000000|1608, // match move
0x80000000|736, // no-match move
0x80000000|386, // NT-test-match state for printable
  }
,
{ // state 1285
-1, // $$start
-1, // start
811, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+237, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+237, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+237, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+237, // "u"
1451, // "p"
MIN_REDUCTION+237, // "h"
483, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
816, // "g"
MIN_REDUCTION+237, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+237, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1286
0x80000000|1468, // match move
0x80000000|854, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1287
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+128, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1288
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1289
0x80000000|452, // match move
0x80000000|1010, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1290
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1291
0x80000000|1531, // match move
0x80000000|626, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1292
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1293
91,1067, // "l"
  }
,
{ // state 1294
2,568, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1295
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1296
176,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1297
0x80000000|120, // match move
0x80000000|722, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1298
0x80000000|1329, // match move
0x80000000|1125, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1299
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1300
2,580, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1301
0x80000000|522, // match move
0x80000000|727, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1302
0x80000000|1475, // match move
0x80000000|26, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1303
105,1077, // "i"
  }
,
{ // state 1304
0x80000000|299, // match move
0x80000000|352, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1305
0x80000000|1410, // match move
0x80000000|841, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1306
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1307
0x80000000|557, // match move
0x80000000|337, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1308
176,MIN_REDUCTION+343, // $NT
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1309
0x80000000|1443, // match move
0x80000000|74, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1310
0x80000000|1100, // match move
0x80000000|1572, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1311
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1312
97,668, // "r"
  }
,
{ // state 1313
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1314
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1315
0x80000000|741, // match move
0x80000000|1417, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1316
0x80000000|1004, // match move
0x80000000|246, // no-match move
0x80000000|1220, // NT-test-match state for commentElement
  }
,
{ // state 1317
-1, // $$start
-1, // start
776, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+204, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+204, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+204, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+204, // "u"
1451, // "p"
MIN_REDUCTION+204, // "h"
483, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
816, // "g"
MIN_REDUCTION+204, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+204, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 1318
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1319
176,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1320
90,401, // "o"
  }
,
{ // state 1321
0x80000000|342, // match move
0x80000000|183, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1322
2,1538, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1323
0x80000000|419, // match move
0x80000000|608, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1324
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1325
-1, // $$start
-1, // start
229, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+213, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+213, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+213, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+213, // "u"
1451, // "p"
MIN_REDUCTION+213, // "h"
483, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
816, // "g"
MIN_REDUCTION+213, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+213, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 1326
-1, // $$start
-1, // start
406, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+108, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+108, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+108, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+108, // "u"
1451, // "p"
MIN_REDUCTION+108, // "h"
483, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
816, // "g"
MIN_REDUCTION+108, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+108, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 1327
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1328
176,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1329
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1330
0x80000000|1570, // match move
0x80000000|1056, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1331
0x80000000|1, // match move
0x80000000|1470, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1332
0x80000000|455, // match move
0x80000000|782, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1333
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1334
0x80000000|1, // match move
0x80000000|1013, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1335
0x80000000|859, // match move
0x80000000|1561, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1336
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+182, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 1337
0x80000000|1340, // match move
0x80000000|330, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1338
0x80000000|1296, // match move
0x80000000|240, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1339
176,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1340
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1341
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+215, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 1342
-1, // $$start
-1, // start
1240, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+138, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+138, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+138, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+138, // "u"
1451, // "p"
MIN_REDUCTION+138, // "h"
483, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
816, // "g"
MIN_REDUCTION+138, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+138, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 1343
176,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1344
0x80000000|1159, // match move
0x80000000|1201, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1345
0x80000000|912, // match move
0x80000000|1115, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1346
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1347
91,784, // "l"
  }
,
{ // state 1348
2,227, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1349
176,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1350
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1351
-1, // $$start
-1, // start
209, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+180, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+180, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+180, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+180, // "u"
1451, // "p"
MIN_REDUCTION+180, // "h"
483, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
816, // "g"
MIN_REDUCTION+180, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+180, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 1352
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1353
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+209, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1354
176,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1355
0x80000000|132, // match move
0x80000000|538, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1356
0x80000000|1, // match move
0x80000000|1110, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1357
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+206, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 1358
2,528, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1359
0x80000000|523, // match move
0x80000000|872, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1360
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1361
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1362
0x80000000|62, // match move
0x80000000|1109, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1363
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1364
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1365
-1, // $$start
-1, // start
1170, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+240, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+240, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+240, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+240, // "u"
1451, // "p"
MIN_REDUCTION+240, // "h"
483, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
816, // "g"
MIN_REDUCTION+240, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+240, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 1366
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1367
176,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1368
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+107, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1369
0x80000000|1579, // match move
0x80000000|631, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1370
0x80000000|408, // match move
0x80000000|1501, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1371
0x80000000|596, // match move
0x80000000|566, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1372
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1373
0x80000000|372, // match move
0x80000000|1482, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1374
0x80000000|1101, // match move
0x80000000|1559, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1375
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1376
2,1073, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1377
-1, // $$start
-1, // start
544, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+129, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+129, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+129, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+129, // "u"
1451, // "p"
MIN_REDUCTION+129, // "h"
483, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
816, // "g"
MIN_REDUCTION+129, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+129, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 1378
2,620, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1379
0x80000000|1035, // match move
0x80000000|1308, // no-match move
// T-test match for 10:
167,
  }
,
{ // state 1380
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1381
176,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1382
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+131, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1383
0x80000000|918, // match move
0x80000000|909, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1384
93,737, // "a"
  }
,
{ // state 1385
92,721, // "e"
  }
,
{ // state 1386
176,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1387
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+307, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1388
105,1395, // "i"
109,1453, // "h"
  }
,
{ // state 1389
176,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1390
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1391
-1, // $$start
-1, // start
-1, // ws*
735, // $$0
472, // token
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
-1, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
654, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1392
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1393
92,1214, // "e"
  }
,
{ // state 1394
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1395
102,413, // "t"
  }
,
{ // state 1396
2,1615, // ws*
157,795, // $$2
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1397
176,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1398
0x80000000|812, // match move
0x80000000|487, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1399
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1400
0x80000000|1, // match move
0x80000000|1053, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1401
176,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1402
0x80000000|629, // match move
0x80000000|955, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1403
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1404
0x80000000|1106, // match move
0x80000000|1600, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1405
0x80000000|1257, // match move
0x80000000|1415, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1406
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1407
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1408
-1, // $$start
-1, // start
1139, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
-1, // `=
-1, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
MIN_REDUCTION+285, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+285, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 1409
0x80000000|1512, // match move
0x80000000|591, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1410
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1411
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1412
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1413
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1414
0x80000000|111, // match move
0x80000000|521, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 1415
0x80000000|67, // match move
0x80000000|195, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1416
176,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1417
-1, // $$start
-1, // start
1558, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+117, // "o"
1536, // "l"
865, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+117, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+117, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+117, // "u"
1451, // "p"
MIN_REDUCTION+117, // "h"
483, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
816, // "g"
MIN_REDUCTION+117, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+117, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 1418
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1419
0x80000000|253, // match move
0x80000000|1362, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1420
99,647, // "c"
  }
,
{ // state 1421
0x80000000|1399, // match move
0x80000000|830, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1422
114,420, // "z"
  }
,
{ // state 1423
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1424
92,838, // "e"
  }
,
{ // state 1425
102,847, // "t"
  }
,
{ // state 1426
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1427
0x80000000|1149, // match move
0x80000000|764, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1428
2,1615, // ws*
157,795, // $$2
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1429
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1430
0x80000000|1363, // match move
0x80000000|1045, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1431
0x80000000|1361, // match move
0x80000000|539, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1432
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1433
0x80000000|47, // match move
0x80000000|241, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1434
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1435
0x80000000|1, // match move
0x80000000|1597, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1436
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1437
176,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1438
176,MIN_REDUCTION+337, // $NT
  }
,
{ // state 1439
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1440
0x80000000|570, // match move
0x80000000|440, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1441
176,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1442
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1443
2,1130, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1444
176,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1445
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1446
0x80000000|1269, // match move
0x80000000|237, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1447
0x80000000|116, // match move
0x80000000|1520, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1448
0x80000000|169, // match move
0x80000000|155, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1449
121,1145, // "*"
  }
,
{ // state 1450
2,165, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1451
93,1127, // "a"
97,90, // "r"
107,961, // "u"
  }
,
{ // state 1452
0x80000000|1171, // match move
0x80000000|1484, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1453
105,478, // "i"
  }
,
{ // state 1454
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1455
121,332, // "*"
162,1449, // commentContent**
174,433, // commentContent*
  }
,
{ // state 1456
104,431, // "f"
  }
,
{ // state 1457
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+258, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 1458
0x80000000|989, // match move
0x80000000|1581, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 1459
0x80000000|1044, // match move
0x80000000|821, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1460
90,24, // "o"
97,234, // "r"
111,239, // "y"
  }
,
{ // state 1461
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+167, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1462
2,499, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1463
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1464
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1465
100,473, // "s"
  }
,
{ // state 1466
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1467
0x80000000|644, // match move
0x80000000|1030, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1468
2,298, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1469
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1470
0x80000000|1590, // match move
0x80000000|890, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1471
176,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1472
94,1040, // "n"
104,1568, // "f"
112,1203, // "m"
  }
,
{ // state 1473
93,1497, // "a"
97,781, // "r"
109,671, // "h"
  }
,
{ // state 1474
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1475
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1476
176,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1477
0x80000000|622, // match move
0x80000000|457, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1478
0x80000000|450, // match move
0x80000000|1323, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1479
0x80000000|1105, // match move
0x80000000|800, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1480
0x80000000|957, // match move
0x80000000|1317, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1481
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1482
0x80000000|474, // match move
0x80000000|366, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1483
176,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1484
0x80000000|807, // match move
0x80000000|71, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1485
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1486
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+268, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+268, // $
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
{ // state 1487
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1488
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1489
0x80000000|992, // match move
0x80000000|530, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1490
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1491
0x80000000|822, // match move
0x80000000|589, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1492
90,729, // "o"
  }
,
{ // state 1493
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1494
0x80000000|1088, // match move
0x80000000|731, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1495
89,1367, // "b"
90,1367, // "o"
91,1367, // "l"
92,1367, // "e"
93,1367, // "a"
94,1367, // "n"
97,1367, // "r"
98,1367, // "k"
99,1367, // "c"
100,1367, // "s"
101,1367, // "x"
102,1367, // "t"
103,1367, // "d"
104,1367, // "f"
105,1367, // "i"
106,1367, // "w"
107,1367, // "u"
108,1367, // "p"
109,1367, // "h"
110,1367, // "v"
111,1367, // "y"
112,1367, // "m"
113,1367, // "g"
114,1367, // "z"
115,1367, // "!"
116,1367, // "="
117,1367, // "%"
118,1367, // "&"
119,1367, // "("
120,1367, // ")"
121,1367, // "*"
122,1367, // "/"
123,1367, // "+"
124,1367, // ","
125,1367, // "-"
126,1367, // "."
127,1367, // ":"
128,1367, // ";"
129,1367, // "<"
130,1367, // ">"
131,1367, // "["
132,1367, // "]"
133,1367, // "{"
134,1367, // "}"
135,1367, // "|"
136,1367, // "0"
137,1367, // {"1".."9"}
138,1367, // "X"
143,1367, // "'"
144,1367, // "\"
145,170, // printable
146,1367, // '"'
151,1367, // "_"
152,1367, // {"A".."W" "Y".."Z" "j" "q"}
153,1367, // " "
154,1367, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 1496
2,552, // ws*
153,902, // " "
158,1513, // ws
159,902, // {9}
160,1052, // eol
167,1567, // {10}
168,1379, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1497
102,100, // "t"
  }
,
{ // state 1498
-1, // $$start
-1, // start
1022, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+287, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1499
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+140, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 1500
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1501
0x80000000|749, // match move
0x80000000|121, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1502
0x80000000|1075, // match move
0x80000000|1593, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1503
-1, // $$start
-1, // start
1615, // ws*
-1, // $$0
MIN_REDUCTION+327, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+327, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+327, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+327, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+327, // "u"
1451, // "p"
MIN_REDUCTION+327, // "h"
483, // "v"
MIN_REDUCTION+327, // "y"
MIN_REDUCTION+327, // "m"
816, // "g"
MIN_REDUCTION+327, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+327, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+327, // {"1".."9"}
MIN_REDUCTION+327, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+327, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
987, // idChar**
515, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
1280, // idChar*
-1, // commentContent*
MIN_REDUCTION+327, // $
-1, // $NT
  }
,
{ // state 1504
176,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1505
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1506
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1507
176,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1508
0x80000000|1020, // match move
0x80000000|829, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1509
-1, // $$start
-1, // start
1538, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+186, // "o"
640, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+186, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+186, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+186, // "u"
1451, // "p"
MIN_REDUCTION+186, // "h"
483, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
816, // "g"
MIN_REDUCTION+186, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+186, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 1510
0x80000000|790, // match move
0x80000000|77, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1511
176,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1512
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1513
176,MIN_REDUCTION+352, // $NT
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1514
103,936, // "d"
  }
,
{ // state 1515
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1516
89,1103, // "b"
90,1103, // "o"
91,1103, // "l"
92,1103, // "e"
93,1103, // "a"
94,1103, // "n"
97,1103, // "r"
98,1103, // "k"
99,1103, // "c"
100,1103, // "s"
101,1103, // "x"
102,1103, // "t"
103,1103, // "d"
104,1103, // "f"
105,1103, // "i"
106,1103, // "w"
107,1103, // "u"
108,1103, // "p"
109,1103, // "h"
110,1103, // "v"
111,1103, // "y"
112,1103, // "m"
113,1103, // "g"
114,1103, // "z"
136,212, // "0"
137,212, // {"1".."9"}
138,1103, // "X"
142,375, // digit
150,1343, // letter
151,1224, // "_"
152,1103, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1517
0x80000000|1, // match move
0x80000000|1610, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1518
0x80000000|1294, // match move
0x80000000|1583, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1519
0x80000000|1, // match move
0x80000000|1480, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1520
0x80000000|895, // match move
0x80000000|267, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1521
0x80000000|1469, // match move
0x80000000|1338, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1522
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+288, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1523
176,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1524
102,1569, // "t"
106,786, // "w"
107,126, // "u"
109,1320, // "h"
111,1091, // "y"
  }
,
{ // state 1525
0x80000000|1042, // match move
0x80000000|1225, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1526
2,528, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1527
102,680, // "t"
  }
,
{ // state 1528
2,209, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1529
0x80000000|1, // match move
0x80000000|1496, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1530
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1531
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1532
-1, // $$start
-1, // start
1073, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+147, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+147, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+147, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+147, // "u"
1451, // "p"
MIN_REDUCTION+147, // "h"
483, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
816, // "g"
MIN_REDUCTION+147, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+147, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 1533
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1534
0x80000000|1, // match move
0x80000000|1620, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1535
122,531, // "/"
  }
,
{ // state 1536
90,181, // "o"
  }
,
{ // state 1537
92,756, // "e"
  }
,
{ // state 1538
0x80000000|743, // match move
0x80000000|562, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1539
0x80000000|1144, // match move
0x80000000|1330, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1540
0x80000000|385, // match move
0x80000000|1241, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1541
2,298, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1542
176,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1543
176,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1544
97,464, // "r"
109,671, // "h"
  }
,
{ // state 1545
0x80000000|1541, // match move
0x80000000|1061, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1546
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1547
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+179, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 1548
176,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1549
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1550
100,613, // "s"
  }
,
{ // state 1551
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1552
2,396, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1553
0x80000000|520, // match move
0x80000000|302, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1554
0x80000000|652, // match move
0x80000000|1387, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1555
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1556
176,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1557
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1558
0x80000000|805, // match move
0x80000000|258, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1559
0x80000000|1328, // match move
0x80000000|619, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1560
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1561
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+143, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 1562
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1563
-1, // $$start
-1, // start
28, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+207, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+207, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+207, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+207, // "u"
1451, // "p"
MIN_REDUCTION+207, // "h"
483, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
816, // "g"
MIN_REDUCTION+207, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+207, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 1564
176,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1565
92,497, // "e"
93,556, // "a"
107,1347, // "u"
  }
,
{ // state 1566
93,648, // "a"
  }
,
{ // state 1567
176,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1568
0x80000000|1, // match move
0x80000000|1510, // no-match move
0x80000000|1516, // NT-test-match state for idChar
  }
,
{ // state 1569
93,1497, // "a"
97,1303, // "r"
  }
,
{ // state 1570
2,813, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1571
176,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1572
0x80000000|1574, // match move
0x80000000|1065, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1573
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1574
2,1289, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1575
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1576
0x80000000|1313, // match move
0x80000000|1123, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1577
2,429, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1578
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1579
176,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1580
94,636, // "n"
  }
,
{ // state 1581
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1582
91,553, // "l"
  }
,
{ // state 1583
-1, // $$start
-1, // start
568, // ws*
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+265, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1584
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1585
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1586
2,1298, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1587
97,182, // "r"
  }
,
{ // state 1588
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1589
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+309, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 1590
2,969, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1591
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1592
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1593
0x80000000|509, // match move
0x80000000|122, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1594
0x80000000|815, // match move
0x80000000|607, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1595
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1596
0x80000000|282, // match move
0x80000000|1169, // no-match move
0x80000000|1316, // NT-test-match state for commentContent
  }
,
{ // state 1597
0x80000000|905, // match move
0x80000000|1342, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1598
0x80000000|1411, // match move
0x80000000|1236, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1599
3,735, // $$0
4,472, // token
58,638, // `!
59,675, // `!=
60,1256, // `%
61,1135, // `&&
63,1161, // `(
64,1394, // `)
65,633, // `{
66,724, // `}
67,663, // `-
68,12, // `+
69,526, // `=
70,1352, // `==
71,133, // `[
72,628, // `]
73,643, // `||
74,493, // `<
75,99, // `<=
76,799, // `,
77,1292, // `>
78,869, // `>=
79,115, // `.
80,917, // `;
81,716, // `++
82,1375, // `--
83,942, // `/
84,586, // `:
85,394, // ID
86,1079, // INTLIT
87,140, // STRINGLIT
88,1506, // CHARLIT
136,1491, // "0"
150,689, // letter
158,1239, // ws
160,1052, // eol
169,654, // token*
  }
,
{ // state 1600
0x80000000|684, // match move
0x80000000|1486, // no-match move
0x80000000|490, // NT-test-match state for reserved
  }
,
{ // state 1601
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1602
0x80000000|1089, // match move
0x80000000|1377, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1603
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
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
394, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
105, // "b"
105, // "o"
105, // "l"
105, // "e"
105, // "a"
105, // "n"
-1, // idChar
-1, // reserved
105, // "r"
105, // "k"
105, // "c"
105, // "s"
105, // "x"
105, // "t"
105, // "d"
105, // "f"
105, // "i"
105, // "w"
105, // "u"
105, // "p"
105, // "h"
105, // "v"
105, // "y"
105, // "m"
105, // "g"
105, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+304, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
328, // "0"
328, // {"1".."9"}
105, // "X"
1048, // intLit2
-1, // `x
1364, // digit++
831, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
689, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1239, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 1604
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1605
2,1289, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1606
-1, // $$start
-1, // start
343, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
921, // `boolean
1207, // `class
923, // `extends
4, // `void
201, // `int
1014, // `while
1505, // `if
1306, // `else
1121, // `for
348, // `break
167, // `this
135, // `false
1392, // `true
1372, // `super
37, // `null
81, // `return
642, // `instanceof
1555, // `new
618, // `abstract
1488, // `assert
1213, // `byte
307, // `case
1217, // `catch
1057, // `char
300, // `const
1157, // `continue
1146, // `default
1466, // `do
128, // `double
42, // `enum
486, // `final
1407, // `finally
476, // `float
146, // `goto
1551, // `implements
837, // `import
993, // `interface
1096, // `long
1434, // `native
1493, // `package
1412, // `private
435, // `protected
602, // `public
1591, // `short
513, // `static
653, // `strictfp
79, // `switch
261, // `synchronized
1129, // `throw
1249, // `throws
216, // `transient
423, // `try
561, // `volatile
638, // `!
675, // `!=
1256, // `%
1135, // `&&
-1, // `*
1161, // `(
1394, // `)
633, // `{
724, // `}
663, // `-
12, // `+
526, // `=
1352, // `==
133, // `[
628, // `]
643, // `||
493, // `<
99, // `<=
799, // `,
1292, // `>
869, // `>=
115, // `.
917, // `;
716, // `++
1375, // `--
942, // `/
586, // `:
-1, // ID
1079, // INTLIT
140, // STRINGLIT
1506, // CHARLIT
1460, // "b"
MIN_REDUCTION+159, // "o"
1536, // "l"
1062, // "e"
1619, // "a"
1565, // "n"
-1, // idChar
-1, // reserved
1024, // "r"
MIN_REDUCTION+159, // "k"
527, // "c"
1524, // "s"
MIN_REDUCTION+159, // "x"
1544, // "t"
405, // "d"
223, // "f"
1472, // "i"
39, // "w"
MIN_REDUCTION+159, // "u"
1451, // "p"
MIN_REDUCTION+159, // "h"
483, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
816, // "g"
MIN_REDUCTION+159, // "z"
606, // "!"
1235, // "="
61, // "%"
256, // "&"
102, // "("
748, // ")"
MIN_REDUCTION+159, // "*"
1008, // "/"
1118, // "+"
674, // ","
1478, // "-"
196, // "."
1248, // ":"
1223, // ";"
1467, // "<"
634, // ">"
1502, // "["
1618, // "]"
207, // "{"
80, // "}"
713, // "|"
1491, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
715, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
902, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // idChar**
-1, // $$2
1513, // ws
902, // {9}
1052, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1567, // {10}
1379, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 1607
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1608
89,265, // "b"
90,265, // "o"
91,265, // "l"
92,265, // "e"
93,265, // "a"
94,265, // "n"
97,265, // "r"
98,265, // "k"
99,265, // "c"
100,265, // "s"
101,265, // "x"
102,265, // "t"
103,265, // "d"
104,265, // "f"
105,265, // "i"
106,265, // "w"
107,265, // "u"
108,265, // "p"
109,265, // "h"
110,265, // "v"
111,265, // "y"
112,265, // "m"
113,265, // "g"
114,265, // "z"
115,265, // "!"
116,265, // "="
117,265, // "%"
118,265, // "&"
119,265, // "("
120,265, // ")"
121,265, // "*"
122,265, // "/"
123,265, // "+"
124,265, // ","
125,265, // "-"
126,265, // "."
127,265, // ":"
128,265, // ";"
129,265, // "<"
130,265, // ">"
131,265, // "["
132,265, // "]"
133,265, // "{"
134,265, // "}"
135,265, // "|"
136,265, // "0"
137,265, // {"1".."9"}
138,265, // "X"
143,265, // "'"
144,265, // "\"
145,1126, // printable
146,265, // '"'
151,265, // "_"
152,265, // {"A".."W" "Y".."Z" "j" "q"}
153,265, // " "
154,265, // {"#".."$" "?".."@" "^" "`" "~"}
161,1148, // printable**
170,345, // printable*
  }
,
{ // state 1609
3,735, // $$0
4,472, // token
5,921, // `boolean
6,1207, // `class
7,923, // `extends
8,4, // `void
9,201, // `int
10,1014, // `while
11,1505, // `if
12,1306, // `else
13,1121, // `for
14,348, // `break
15,167, // `this
16,135, // `false
17,1392, // `true
18,1372, // `super
19,37, // `null
20,81, // `return
21,642, // `instanceof
22,1555, // `new
23,618, // `abstract
24,1488, // `assert
25,1213, // `byte
26,307, // `case
27,1217, // `catch
28,1057, // `char
29,300, // `const
30,1157, // `continue
31,1146, // `default
32,1466, // `do
33,128, // `double
34,42, // `enum
35,486, // `final
36,1407, // `finally
37,476, // `float
38,146, // `goto
39,1551, // `implements
40,837, // `import
41,993, // `interface
42,1096, // `long
43,1434, // `native
44,1493, // `package
45,1412, // `private
46,435, // `protected
47,602, // `public
48,1591, // `short
49,513, // `static
50,653, // `strictfp
51,79, // `switch
52,261, // `synchronized
53,1129, // `throw
54,1249, // `throws
55,216, // `transient
56,423, // `try
57,561, // `volatile
169,654, // token*
  }
,
{ // state 1610
0x80000000|575, // match move
0x80000000|1136, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1611
0x80000000|700, // match move
0x80000000|434, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1612
2,298, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1613
0x80000000|1487, // match move
0x80000000|1205, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1614
2,728, // ws*
158,1513, // ws
160,1052, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1615
0x80000000|693, // match move
0x80000000|1175, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1616
0x80000000|678, // match move
0x80000000|285, // no-match move
0x80000000|667, // NT-test-match state for stringChar
  }
,
{ // state 1617
158,1239, // ws
160,1052, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1618
0x80000000|1058, // match move
0x80000000|1539, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1619
89,1465, // "b"
100,370, // "s"
  }
,
{ // state 1620
0x80000000|769, // match move
0x80000000|250, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1621][];
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
// CHARLIT ::= "'" !{"'" "\"} printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" !{"'" "\"} printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' stringWord $$1
(87<<16)+3,
// STRINGLIT ::= '"' !stringChar $$1
(87<<16)+2,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(150<<16)+1,
// printable ::= {" ".."~"}
(145<<16)+1,
// stringChar ::= !{'"' "\"} printable
(149<<16)+1,
// stringWord ::= stringChar**
(147<<16)+1,
// ID ::= !reserved letter idChar** $$2
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$2
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// ws ::= {9 " "}
(158<<16)+1,
// ws ::= eol
(158<<16)+1,
// ws ::= "/" "/" printable** eol
(158<<16)+4,
// ws ::= "/" "/" !printable eol
(158<<16)+3,
// ws ::= "/" "*" commentContent** "*" "/"
(158<<16)+5,
// ws ::= "/" "*" !commentContent "*" "/"
(158<<16)+4,
// nestedCommentStart ::= "/" "*"
(164<<16)+2,
// nestedCommentEnd ::= "*" "/"
(165<<16)+2,
// commentElement ::= nestedCommentStart
(166<<16)+1,
// commentElement ::= nestedCommentEnd
(166<<16)+1,
// commentContent ::= !commentElement printable
(163<<16)+1,
// commentContent ::= eol
(163<<16)+1,
// commentContent ::= nestedCommentStart
(163<<16)+1,
// eol ::= {10}
(160<<16)+1,
// eol ::= {13} {10}
(160<<16)+2,
// eol ::= {13} !10
(160<<16)+1,
// token* ::= token* token
(169<<16)+2,
// token* ::= token
(169<<16)+1,
// printable** ::= printable* !printable
(161<<16)+1,
// stringChar** ::= stringChar* !stringChar
(155<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// idChar** ::= idChar* !idChar
(156<<16)+1,
// commentContent** ::= commentContent* !commentContent
(162<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(172<<16)+1,
// digit+ ::= digit+ digit
(172<<16)+2,
// commentContent* ::= commentContent* commentContent
(174<<16)+2,
// commentContent* ::= commentContent
(174<<16)+1,
// printable* ::= printable* printable
(170<<16)+2,
// printable* ::= printable
(170<<16)+1,
// stringChar* ::= stringChar* stringChar
(171<<16)+2,
// stringChar* ::= stringChar
(171<<16)+1,
// idChar* ::= idChar* idChar
(173<<16)+2,
// idChar* ::= idChar
(173<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= '"' ws*
(148<<16)+2,
// $$1 ::= '"'
(148<<16)+1,
// $$2 ::= ws*
(157<<16)+1,
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
159, // 9
167, // 10
-1, // 11
-1, // 12
168, // 13
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
153, // " "
115, // "!"
146, // '"'
154, // "#"
154, // "$"
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
154, // "?"
154, // "@"
152, // "A"
152, // "B"
152, // "C"
152, // "D"
152, // "E"
152, // "F"
152, // "G"
152, // "H"
152, // "I"
152, // "J"
152, // "K"
152, // "L"
152, // "M"
152, // "N"
152, // "O"
152, // "P"
152, // "Q"
152, // "R"
152, // "S"
152, // "T"
152, // "U"
152, // "V"
152, // "W"
138, // "X"
152, // "Y"
152, // "Z"
131, // "["
144, // "\"
132, // "]"
154, // "^"
151, // "_"
154, // "`"
93, // "a"
89, // "b"
99, // "c"
103, // "d"
92, // "e"
104, // "f"
113, // "g"
109, // "h"
105, // "i"
152, // "j"
98, // "k"
91, // "l"
112, // "m"
94, // "n"
90, // "o"
108, // "p"
152, // "q"
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
154, // "~"
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
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printable \"\'\" ws*", // 313
"CHARLIT ::= # \"\'\" !{\"\'\" \"\\\"} printable \"\'\" ws*", // 314
"STRINGLIT ::= # \'\"\' stringWord \'\"\' ws*", // 315
"STRINGLIT ::= # \'\"\' stringWord \'\"\' ws*", // 316
"idChar ::= letter", // 317
"idChar ::= digit", // 318
"idChar ::= \"_\"", // 319
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 320
"printable ::= {\" \"..\"~\"}", // 321
"stringChar ::= !{\'\"\' \"\\\"} printable", // 322
"stringWord ::= stringChar**", // 323
"ID ::= !reserved letter idChar** ws*", // 324
"ID ::= !reserved letter idChar** ws*", // 325
"ID ::= !reserved letter idChar** ws*", // 326
"ID ::= !reserved letter idChar** ws*", // 327
"ws ::= {9 \" \"}", // 328
"ws ::= eol", // 329
"ws ::= \"/\" \"/\" printable** eol", // 330
"ws ::= \"/\" \"/\" printable** eol", // 331
"ws ::= \"/\" \"*\" commentContent** \"*\" \"/\"", // 332
"ws ::= \"/\" \"*\" commentContent** \"*\" \"/\"", // 333
"nestedCommentStart ::= \"/\" \"*\"", // 334
"nestedCommentEnd ::= \"*\" \"/\"", // 335
"commentElement ::= nestedCommentStart", // 336
"commentElement ::= nestedCommentEnd", // 337
"commentContent ::= !commentElement printable", // 338
"commentContent ::= eol", // 339
"commentContent ::= # nestedCommentStart", // 340
"eol ::= {10} registerNewline", // 341
"eol ::= {13} {10} registerNewline", // 342
"eol ::= {13} !10 registerNewline", // 343
"token* ::= token* token", // 344
"token* ::= token* token", // 345
"printable** ::= printable* !printable", // 346
"stringChar** ::= stringChar* !stringChar", // 347
"digit++ ::= digit+ !digit", // 348
"idChar** ::= idChar* !idChar", // 349
"commentContent** ::= commentContent* !commentContent", // 350
"ws* ::= ws* ws", // 351
"ws* ::= ws* ws", // 352
"digit+ ::= digit", // 353
"digit+ ::= digit+ digit", // 354
"commentContent* ::= commentContent* commentContent", // 355
"commentContent* ::= commentContent* commentContent", // 356
"printable* ::= printable* printable", // 357
"printable* ::= printable* printable", // 358
"stringChar* ::= stringChar* stringChar", // 359
"stringChar* ::= stringChar* stringChar", // 360
"idChar* ::= idChar* idChar", // 361
"idChar* ::= idChar* idChar", // 362
"", // 363
"", // 364
"", // 365
"", // 366
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} [ws*] @zero(int,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: INTLIT ::= [#] "0" `x digit++ [ws*] @convertHexToInt(int,Character,List<Character>)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: INTLIT ::= [#] "0" digit++ ws* @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: INTLIT ::= [#] "0" digit++ [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
    { // 313: CHARLIT ::= [#] "'" !{"'" "\"} printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 314: CHARLIT ::= [#] "'" !{"'" "\"} printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 315: STRINGLIT ::= [#] '"' stringWord $$1 @charsToStringLiteral(int,char,String,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 316: STRINGLIT ::= [#] '"' !stringChar [stringWord] $$1 @charsToStringLiteral(int,char,String,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
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
    { // 322: stringChar ::= !{'"' "\"} printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 323: stringWord ::= stringChar** @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 324: ID ::= !reserved letter idChar** $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 325: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 326: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 327: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 328: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 329: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 331: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 332: ws ::= "/" "*" commentContent** "*" "/" @void
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
    { // 333: ws ::= "/" "*" !commentContent [commentContent**] "*" "/" @void
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
    { // 334: nestedCommentStart ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 335: nestedCommentEnd ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 336: commentElement ::= nestedCommentStart @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: commentElement ::= nestedCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: commentContent ::= !commentElement printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 339: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: commentContent ::= [#] nestedCommentStart @reportNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 341: eol ::= {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 342: eol ::= {13} {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 343: eol ::= {13} !10 [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 344: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 346: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: stringChar** ::= stringChar* !stringChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 349: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 350: commentContent** ::= commentContent* !commentContent @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 352: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 353: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 354: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 356: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 357: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 358: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 359: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 360: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 361: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 362: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: $$1 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 365: $$1 ::= '"' [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 366: $$2 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "commentContent** ::= commentContent* !commentContent", // commentContent**
    "commentContent* ::=", // commentContent*
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "stringChar* ::=", // stringChar*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "stringWord ::= stringChar**", // stringWord
    "stringChar** ::= stringChar* !stringChar", // stringChar**
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
    { // commentContent**
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // commentContent*
    },
    { // start
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // ws*
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((9<<5)|0x6)/*nullProductionAction:9*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringWord
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // stringChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // $$start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((92<<5)|0x5)/*methodCall:92*/,
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
      String parm2 = (String)si.popPb();
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
      actionObject.reportNestedComment(parm0);
    }
    break;
    case 92: {
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
"String charsToStringLiteral(int,char,String,char)",
"String sequenceToIdentifier(Character,List<Character>)",
"void reportNestedComment(int)",
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
    -1,
    1,
    -1,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    0,
    0,
    -1,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    0,
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
