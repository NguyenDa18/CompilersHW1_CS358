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
public int getEofSym() { return 171; }
public int getNttSym() { return 172; }
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
"ws",
"9",
"eol",
"printable**",
"commentContent*",
"commentContent",
"10",
"13",
"idChar**",
"$$2",
"token*",
"printable*",
"stringChar*",
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
public int numSymbols() { return 173;}
private static final int MIN_REDUCTION = 1578;
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
0x80000000|919, // match move
0x80000000|1038, // no-match move
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
151, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+144, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+144, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+144, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+144, // "u"
1411, // "p"
MIN_REDUCTION+144, // "h"
465, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
789, // "g"
MIN_REDUCTION+144, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+144, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+203, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
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
0x80000000|1117, // match move
0x80000000|1462, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 6
2,987, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 7
0x80000000|524, // match move
0x80000000|1376, // no-match move
0x80000000|801, // NT-test-match state for digit
  }
,
{ // state 8
2,1149, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 10
89,1328, // "b"
90,1328, // "o"
91,1328, // "l"
92,1328, // "e"
93,1328, // "a"
94,1328, // "n"
97,1328, // "r"
98,1328, // "k"
99,1328, // "c"
100,1328, // "s"
101,1328, // "x"
102,1328, // "t"
103,1328, // "d"
104,1328, // "f"
105,1328, // "i"
106,1328, // "w"
107,1328, // "u"
108,1328, // "p"
109,1328, // "h"
110,1328, // "v"
111,1328, // "y"
112,1328, // "m"
113,1328, // "g"
114,1328, // "z"
115,1328, // "!"
116,1328, // "="
117,1328, // "%"
118,1328, // "&"
119,1328, // "("
120,1328, // ")"
121,1328, // "*"
122,1328, // "/"
123,1328, // "+"
124,1328, // ","
125,1328, // "-"
126,1328, // "."
127,1328, // ":"
128,1328, // ";"
129,1328, // "<"
130,1328, // ">"
131,1328, // "["
132,1328, // "]"
133,1328, // "{"
134,1328, // "}"
135,1328, // "|"
136,1328, // "0"
137,1328, // {"1".."9"}
138,1328, // "X"
143,1328, // "'"
144,1328, // "\"
145,164, // printable
146,1328, // '"'
151,1328, // "_"
152,1328, // {"A".."W" "Y".."Z" "j" "q"}
153,1328, // " "
154,1328, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 11
109,1493, // "h"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 14
0x80000000|958, // match move
0x80000000|1318, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 15
-1, // $$start
-1, // start
1395, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+228, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+228, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+228, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+228, // "u"
1411, // "p"
MIN_REDUCTION+228, // "h"
465, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
789, // "g"
MIN_REDUCTION+228, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+228, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 16
0x80000000|1, // match move
0x80000000|762, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 17
172,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 18
100,1002, // "s"
  }
,
{ // state 19
172,MIN_REDUCTION+145, // $NT
  }
,
{ // state 20
2,1297, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 21
123,657, // "+"
  }
,
{ // state 22
2,328, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 23
105,1537, // "i"
  }
,
{ // state 24
90,943, // "o"
  }
,
{ // state 25
0x80000000|47, // match move
0x80000000|765, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 26
0x80000000|1227, // match move
0x80000000|994, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 27
172,MIN_REDUCTION+136, // $NT
  }
,
{ // state 28
0x80000000|1474, // match move
0x80000000|1085, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 29
172,MIN_REDUCTION+328, // $NT
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 30
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 31
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 32
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+197, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 33
0x80000000|1294, // match move
0x80000000|1161, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 34
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 35
2,1334, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 36
0x80000000|111, // match move
0x80000000|1295, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 37
100,289, // "s"
102,677, // "t"
  }
,
{ // state 38
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 39
2,1571, // ws*
156,1472, // ws
158,1017, // eol
165,769, // $$2
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 40
109,1413, // "h"
  }
,
{ // state 41
105,1384, // "i"
  }
,
{ // state 42
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+116, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 43
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 44
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 45
2,953, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 46
102,758, // "t"
  }
,
{ // state 47
2,973, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 48
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 49
102,575, // "t"
  }
,
{ // state 50
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 51
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 52
0x80000000|311, // match move
0x80000000|647, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 53
172,MIN_REDUCTION+322, // $NT
  }
,
{ // state 54
0x80000000|162, // match move
0x80000000|323, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 55
0x80000000|1098, // match move
0x80000000|536, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 56
0x80000000|1309, // match move
0x80000000|144, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 57
172,MIN_REDUCTION+229, // $NT
  }
,
{ // state 58
0x80000000|1444, // match move
0x80000000|212, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 59
-1, // $$start
-1, // start
1082, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+201, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+201, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+201, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+201, // "u"
1411, // "p"
MIN_REDUCTION+201, // "h"
465, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
789, // "g"
MIN_REDUCTION+201, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+201, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+119, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 61
0x80000000|255, // match move
0x80000000|193, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 62
172,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 63
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 64
100,199, // "s"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|128, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 66
102,1415, // "t"
  }
,
{ // state 67
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 68
172,MIN_REDUCTION+208, // $NT
  }
,
{ // state 69
0x80000000|6, // match move
0x80000000|1457, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 70
91,1213, // "l"
105,1473, // "i"
  }
,
{ // state 71
0x80000000|239, // match move
0x80000000|1073, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 72
0x80000000|842, // match move
0x80000000|1521, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 73
0x80000000|1359, // match move
0x80000000|824, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 74
0x80000000|1030, // match move
0x80000000|360, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 75
-1, // $$start
-1, // start
1095, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+251, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 76
0x80000000|1529, // match move
0x80000000|782, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 77
4,210, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
  }
,
{ // state 78
-1, // $$start
-1, // start
535, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+111, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+111, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+111, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+111, // "u"
1411, // "p"
MIN_REDUCTION+111, // "h"
465, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
789, // "g"
MIN_REDUCTION+111, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+111, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 79
2,761, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 81
0x80000000|1485, // match move
0x80000000|875, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 82
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 83
0x80000000|1167, // match move
0x80000000|1389, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 84
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+359, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+359, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+359, // $
-1, // $NT
  }
,
{ // state 85
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+221, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 86
146,374, // '"'
148,916, // $$1
  }
,
{ // state 87
0x80000000|349, // match move
0x80000000|1223, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 88
92,1087, // "e"
  }
,
{ // state 89
172,MIN_REDUCTION+205, // $NT
  }
,
{ // state 90
90,948, // "o"
105,426, // "i"
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
172,MIN_REDUCTION+223, // $NT
  }
,
{ // state 94
172,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 95
94,881, // "n"
  }
,
{ // state 96
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 97
2,1306, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 98
0x80000000|1337, // match move
0x80000000|1491, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 99
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 100
105,1099, // "i"
  }
,
{ // state 101
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 102
0x80000000|141, // match move
0x80000000|298, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 103
90,280, // "o"
  }
,
{ // state 104
94,1084, // "n"
  }
,
{ // state 105
0x80000000|861, // match move
0x80000000|927, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 106
2,600, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 107
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 108
0x80000000|1260, // match move
0x80000000|965, // no-match move
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
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+135, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+135, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+135, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+135, // "u"
1411, // "p"
MIN_REDUCTION+135, // "h"
465, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
789, // "g"
MIN_REDUCTION+135, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+135, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 110
93,589, // "a"
  }
,
{ // state 111
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 112
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+158, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 113
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 115
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 116
99,856, // "c"
  }
,
{ // state 117
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+254, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 118
93,976, // "a"
  }
,
{ // state 119
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 120
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+239, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 121
0x80000000|244, // match move
0x80000000|752, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 122
100,1397, // "s"
  }
,
{ // state 123
0x80000000|699, // match move
0x80000000|167, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 124
108,863, // "p"
  }
,
{ // state 125
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 126
-1, // $$start
445, // start
33, // ws*
1058, // $$0
454, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
-1, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
632, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 127
0x80000000|518, // match move
0x80000000|839, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 128
0x80000000|883, // match move
0x80000000|892, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 129
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 131
172,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 134
0x80000000|387, // match move
0x80000000|639, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 135
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 136
2,1194, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 138
0x80000000|1141, // match move
0x80000000|448, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 139
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 140
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 141
2,1344, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 143
0x80000000|1463, // match move
0x80000000|912, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 144
0x80000000|1216, // match move
0x80000000|188, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 145
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 146
121,1303, // "*"
158,9, // eol
160,1427, // commentContent*
161,932, // commentContent
  }
,
{ // state 147
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 148
98,1524, // "k"
  }
,
{ // state 149
2,821, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 150
2,947, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 151
0x80000000|775, // match move
0x80000000|36, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 152
0x80000000|950, // match move
0x80000000|1214, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 153
1,445, // start
2,33, // ws*
3,1058, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
89,1418, // "b"
91,1494, // "l"
92,1027, // "e"
93,1575, // "a"
94,1523, // "n"
97,989, // "r"
99,506, // "c"
100,1483, // "s"
102,1502, // "t"
103,389, // "d"
104,216, // "f"
105,1431, // "i"
106,40, // "w"
108,1411, // "p"
110,465, // "v"
113,789, // "g"
166,632, // token*
171,MIN_REDUCTION+1, // $
  }
,
{ // state 154
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+95, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 155
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 156
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 157
0x80000000|1182, // match move
0x80000000|1079, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 158
0x80000000|1051, // match move
0x80000000|926, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 159
0x80000000|320, // match move
0x80000000|510, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 160
-1, // $$start
-1, // start
953, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+255, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 161
0x80000000|796, // match move
0x80000000|1409, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 162
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 164
143,256, // "'"
  }
,
{ // state 165
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 166
0x80000000|1037, // match move
0x80000000|760, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 167
-1, // $$start
-1, // start
52, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+222, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+222, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+222, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+222, // "u"
1411, // "p"
MIN_REDUCTION+222, // "h"
465, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
789, // "g"
MIN_REDUCTION+222, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+222, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 168
172,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 169
0x80000000|22, // match move
0x80000000|1561, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 170
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 171
2,1263, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 172
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 173
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+300, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 174
-1, // $$start
-1, // start
1263, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+301, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 175
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 176
94,816, // "n"
  }
,
{ // state 177
94,836, // "n"
  }
,
{ // state 178
-1, // $$start
-1, // start
670, // ws*
-1, // $$0
MIN_REDUCTION+360, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+360, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+360, // $
-1, // $NT
  }
,
{ // state 179
172,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 180
3,711, // $$0
4,454, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
62,676, // `*
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
121,633, // "*"
139,1013, // intLit2
141,1325, // digit++
142,804, // digit
150,664, // letter
156,1202, // ws
158,1017, // eol
166,632, // token*
169,7, // digit+
  }
,
{ // state 181
0x80000000|730, // match move
0x80000000|32, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 182
172,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 183
0x80000000|171, // match move
0x80000000|325, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 184
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 185
172,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 186
172,MIN_REDUCTION+181, // $NT
  }
,
{ // state 187
2,917, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 188
0x80000000|638, // match move
0x80000000|366, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 189
0x80000000|185, // match move
0x80000000|1343, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 190
0x80000000|832, // match move
0x80000000|952, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 191
0x80000000|1107, // match move
0x80000000|833, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 192
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 193
0x80000000|1240, // match move
0x80000000|1549, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 194
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 195
0x80000000|1160, // match move
0x80000000|876, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 196
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 197
0x80000000|221, // match move
0x80000000|1352, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 198
0x80000000|1543, // match move
0x80000000|1539, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|157, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 200
0x80000000|823, // match move
0x80000000|977, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 201
0x80000000|791, // match move
0x80000000|1008, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 202
0x80000000|489, // match move
0x80000000|873, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 203
172,MIN_REDUCTION+187, // $NT
  }
,
{ // state 204
172,MIN_REDUCTION+163, // $NT
  }
,
{ // state 205
172,MIN_REDUCTION+312, // $NT
  }
,
{ // state 206
0x80000000|1341, // match move
0x80000000|567, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 207
0x80000000|1243, // match move
0x80000000|1015, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 208
98,843, // "k"
  }
,
{ // state 209
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 211
-1, // $$start
-1, // start
1306, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+153, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+153, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+153, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+153, // "u"
1411, // "p"
MIN_REDUCTION+153, // "h"
465, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
789, // "g"
MIN_REDUCTION+153, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+153, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
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
{ // state 212
0x80000000|145, // match move
0x80000000|294, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 213
110,779, // "v"
  }
,
{ // state 214
0x80000000|1, // match move
0x80000000|169, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 215
102,673, // "t"
  }
,
{ // state 216
90,1077, // "o"
91,241, // "l"
93,601, // "a"
105,1096, // "i"
  }
,
{ // state 217
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|251, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 219
102,799, // "t"
  }
,
{ // state 220
0x80000000|1422, // match move
0x80000000|809, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 221
3,711, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
89,1418, // "b"
91,1494, // "l"
92,1027, // "e"
93,1575, // "a"
94,1523, // "n"
97,989, // "r"
99,506, // "c"
100,1483, // "s"
102,1502, // "t"
103,389, // "d"
104,216, // "f"
105,1431, // "i"
106,40, // "w"
108,1411, // "p"
110,465, // "v"
113,789, // "g"
166,632, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 222
0x80000000|571, // match move
0x80000000|853, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 223
2,941, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 224
0x80000000|564, // match move
0x80000000|828, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 225
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 226
172,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 227
92,1151, // "e"
  }
,
{ // state 228
0x80000000|1192, // match move
0x80000000|578, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 229
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 230
0x80000000|930, // match move
0x80000000|476, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 231
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 232
102,800, // "t"
  }
,
{ // state 233
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+98, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 234
0x80000000|777, // match move
0x80000000|494, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 235
-1, // $$start
-1, // start
597, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
-1, // `=
-1, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
MIN_REDUCTION+289, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+289, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 236
172,MIN_REDUCTION+199, // $NT
  }
,
{ // state 237
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 238
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+230, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 239
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 240
2,1082, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 241
90,397, // "o"
  }
,
{ // state 242
-1, // $$start
-1, // start
1553, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+162, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+162, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+162, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+162, // "u"
1411, // "p"
MIN_REDUCTION+162, // "h"
465, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
789, // "g"
MIN_REDUCTION+162, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+162, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
  }
,
{ // state 243
2,821, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 244
2,813, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 245
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 246
-1, // $$start
-1, // start
1367, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+132, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+132, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+132, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+132, // "u"
1411, // "p"
MIN_REDUCTION+132, // "h"
465, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
789, // "g"
MIN_REDUCTION+132, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+132, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 247
0x80000000|1, // match move
0x80000000|1453, // no-match move
// T-test match for {'"' "/"}:
122,
146,
  }
,
{ // state 248
118,537, // "&"
  }
,
{ // state 249
2,1395, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 250
0x80000000|934, // match move
0x80000000|1025, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 251
0x80000000|377, // match move
0x80000000|1286, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 252
-1, // $$start
-1, // start
412, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+141, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+141, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+141, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+141, // "u"
1411, // "p"
MIN_REDUCTION+141, // "h"
465, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
789, // "g"
MIN_REDUCTION+141, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+141, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 253
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 254
0x80000000|1420, // match move
0x80000000|159, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 255
2,512, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 256
0x80000000|106, // match move
0x80000000|345, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 257
0x80000000|486, // match move
0x80000000|1400, // no-match move
0x80000000|371, // NT-test-match state for printable
  }
,
{ // state 258
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 259
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+200, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 260
0x80000000|307, // match move
0x80000000|734, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 261
172,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 262
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 263
2,1263, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 264
107,461, // "u"
  }
,
{ // state 265
0x80000000|1390, // match move
0x80000000|942, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 266
2,1104, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 268
0x80000000|1380, // match move
0x80000000|1195, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 269
0x80000000|451, // match move
0x80000000|246, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 270
0x80000000|436, // match move
0x80000000|1558, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 271
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 272
-1, // $$start
-1, // start
1297, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+123, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+123, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+123, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+123, // "u"
1411, // "p"
MIN_REDUCTION+123, // "h"
465, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
789, // "g"
MIN_REDUCTION+123, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+123, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 273
-1, // $$start
-1, // start
917, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+126, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+126, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+126, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+126, // "u"
1411, // "p"
MIN_REDUCTION+126, // "h"
465, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
789, // "g"
MIN_REDUCTION+126, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+126, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 274
2,600, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 276
0x80000000|1137, // match move
0x80000000|822, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 277
172,MIN_REDUCTION+148, // $NT
  }
,
{ // state 278
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|406, // no-match move
// T-test match for {'"' "/"}:
122,
146,
  }
,
{ // state 280
106,581, // "w"
  }
,
{ // state 281
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+266, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 282
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+210, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+210, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+210, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+210, // "u"
1411, // "p"
MIN_REDUCTION+210, // "h"
465, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
789, // "g"
MIN_REDUCTION+210, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+210, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 283
92,44, // "e"
  }
,
{ // state 284
99,865, // "c"
  }
,
{ // state 285
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+122, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 286
0x80000000|618, // match move
0x80000000|1229, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 287
1,445, // start
2,33, // ws*
3,1058, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
166,632, // token*
  }
,
{ // state 288
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 289
102,1362, // "t"
  }
,
{ // state 290
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+256, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 291
0x80000000|267, // match move
0x80000000|281, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 292
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 293
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+294, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 294
0x80000000|1074, // match move
0x80000000|338, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 295
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 296
93,962, // "a"
  }
,
{ // state 297
2,953, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 298
0x80000000|354, // match move
0x80000000|87, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 299
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 300
92,515, // "e"
  }
,
{ // state 301
0x80000000|415, // match move
0x80000000|1060, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 302
172,MIN_REDUCTION+214, // $NT
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 304
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+264, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 305
0x80000000|50, // match move
0x80000000|1393, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 306
92,1234, // "e"
  }
,
{ // state 307
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 308
0x80000000|237, // match move
0x80000000|293, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 309
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 310
172,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 311
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 312
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+125, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 313
172,MIN_REDUCTION+241, // $NT
  }
,
{ // state 314
0x80000000|991, // match move
0x80000000|949, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 315
0x80000000|91, // match move
0x80000000|1078, // no-match move
0x80000000|801, // NT-test-match state for digit
  }
,
{ // state 316
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+286, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 317
0x80000000|612, // match move
0x80000000|399, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 318
172,MIN_REDUCTION+94, // $NT
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|1209, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 320
2,481, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 321
172,MIN_REDUCTION+217, // $NT
  }
,
{ // state 322
4,210, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
62,676, // `*
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
121,633, // "*"
139,1013, // intLit2
141,1325, // digit++
142,804, // digit
150,664, // letter
169,7, // digit+
  }
,
{ // state 323
0x80000000|262, // match move
0x80000000|181, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 324
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 325
0x80000000|482, // match move
0x80000000|174, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 326
2,867, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 327
2,670, // ws*
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 328
0x80000000|1406, // match move
0x80000000|1228, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 329
0x80000000|980, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 330
0x80000000|749, // match move
0x80000000|714, // no-match move
0x80000000|371, // NT-test-match state for printable
  }
,
{ // state 331
-1, // $$start
-1, // start
947, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+189, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+189, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+189, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+189, // "u"
1411, // "p"
MIN_REDUCTION+189, // "h"
465, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
789, // "g"
MIN_REDUCTION+189, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+189, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 332
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 334
2,545, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 335
93,1040, // "a"
  }
,
{ // state 336
2,941, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 337
1,445, // start
2,33, // ws*
3,1058, // $$0
4,454, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
83,909, // `/
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
136,1450, // "0"
150,664, // letter
156,1472, // ws
158,1017, // eol
166,632, // token*
  }
,
{ // state 338
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+134, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 339
92,963, // "e"
  }
,
{ // state 340
0x80000000|1238, // match move
0x80000000|384, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 341
2,867, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 342
0x80000000|1, // match move
0x80000000|123, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 343
172,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 344
122,463, // "/"
  }
,
{ // state 345
0x80000000|274, // match move
0x80000000|774, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 346
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+146, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 347
172,MIN_REDUCTION+151, // $NT
  }
,
{ // state 348
91,546, // "l"
  }
,
{ // state 349
2,1344, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 350
102,16, // "t"
  }
,
{ // state 351
92,1345, // "e"
  }
,
{ // state 352
0x80000000|735, // match move
0x80000000|1193, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 353
0x80000000|1093, // match move
0x80000000|708, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 354
2,1344, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 355
100,1346, // "s"
  }
,
{ // state 356
2,421, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 357
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 358
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 359
172,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 361
172,MIN_REDUCTION+318, // $NT
  }
,
{ // state 362
99,913, // "c"
  }
,
{ // state 363
2,661, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 364
2,987, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 365
172,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 366
-1, // $$start
-1, // start
220, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
-1, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
-1, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+263, // "*"
697, // "/"
MIN_REDUCTION+263, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 367
0x80000000|1, // match move
0x80000000|314, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 368
0x80000000|555, // match move
0x80000000|1028, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 369
0x80000000|263, // match move
0x80000000|183, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 370
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 371
89,1328, // "b"
90,1328, // "o"
91,1328, // "l"
92,1328, // "e"
93,1328, // "a"
94,1328, // "n"
97,1328, // "r"
98,1328, // "k"
99,1328, // "c"
100,1328, // "s"
101,1328, // "x"
102,1328, // "t"
103,1328, // "d"
104,1328, // "f"
105,1328, // "i"
106,1328, // "w"
107,1328, // "u"
108,1328, // "p"
109,1328, // "h"
110,1328, // "v"
111,1328, // "y"
112,1328, // "m"
113,1328, // "g"
114,1328, // "z"
115,1328, // "!"
116,1328, // "="
117,1328, // "%"
118,1328, // "&"
119,1328, // "("
120,1328, // ")"
121,1328, // "*"
122,1328, // "/"
123,1328, // "+"
124,1328, // ","
125,1328, // "-"
126,1328, // "."
127,1328, // ":"
128,1328, // ";"
129,1328, // "<"
130,1328, // ">"
131,1328, // "["
132,1328, // "]"
133,1328, // "{"
134,1328, // "}"
135,1328, // "|"
136,1328, // "0"
137,1328, // {"1".."9"}
138,1328, // "X"
143,1328, // "'"
144,1328, // "\"
146,1328, // '"'
151,1328, // "_"
152,1328, // {"A".."W" "Y".."Z" "j" "q"}
153,1328, // " "
154,1328, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 372
0x80000000|616, // match move
0x80000000|424, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 373
146,374, // '"'
147,86, // stringWord
148,955, // $$1
155,1550, // stringChar**
168,854, // stringChar*
  }
,
{ // state 374
0x80000000|726, // match move
0x80000000|887, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 375
103,1081, // "d"
  }
,
{ // state 376
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 377
2,390, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 378
0x80000000|409, // match move
0x80000000|682, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 379
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 381
0x80000000|503, // match move
0x80000000|1320, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 382
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 383
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 384
0x80000000|480, // match move
0x80000000|974, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 385
-1, // $$start
-1, // start
1149, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+120, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+120, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+120, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+120, // "u"
1411, // "p"
MIN_REDUCTION+120, // "h"
465, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
789, // "g"
MIN_REDUCTION+120, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+120, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 386
97,954, // "r"
  }
,
{ // state 387
2,1259, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 388
0x80000000|890, // match move
0x80000000|514, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 389
90,806, // "o"
92,901, // "e"
  }
,
{ // state 390
0x80000000|1504, // match move
0x80000000|1225, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 391
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 392
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 393
2,1532, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 394
172,MIN_REDUCTION+100, // $NT
  }
,
{ // state 395
99,792, // "c"
  }
,
{ // state 396
0x80000000|192, // match move
0x80000000|720, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 397
93,1387, // "a"
  }
,
{ // state 398
0x80000000|336, // match move
0x80000000|453, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 399
0x80000000|1230, // match move
0x80000000|285, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 400
172,MIN_REDUCTION+202, // $NT
  }
,
{ // state 401
2,421, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 402
92,375, // "e"
  }
,
{ // state 403
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 404
105,1386, // "i"
  }
,
{ // state 405
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 406
89,198, // "b"
90,198, // "o"
91,198, // "l"
92,198, // "e"
93,198, // "a"
94,198, // "n"
97,198, // "r"
98,198, // "k"
99,198, // "c"
100,198, // "s"
101,198, // "x"
102,198, // "t"
103,198, // "d"
104,198, // "f"
105,198, // "i"
106,198, // "w"
107,198, // "u"
108,198, // "p"
109,198, // "h"
110,198, // "v"
111,198, // "y"
112,198, // "m"
113,198, // "g"
114,198, // "z"
115,198, // "!"
116,198, // "="
117,198, // "%"
118,198, // "&"
119,198, // "("
120,198, // ")"
121,198, // "*"
122,198, // "/"
123,198, // "+"
124,198, // ","
125,198, // "-"
126,198, // "."
127,198, // ":"
128,198, // ";"
129,198, // "<"
130,198, // ">"
131,198, // "["
132,198, // "]"
133,198, // "{"
134,198, // "}"
135,198, // "|"
136,198, // "0"
137,198, // {"1".."9"}
138,198, // "X"
143,198, // "'"
144,198, // "\"
145,1191, // printable
146,198, // '"'
149,851, // stringChar
151,198, // "_"
152,198, // {"A".."W" "Y".."Z" "j" "q"}
153,198, // " "
154,198, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 407
2,224, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+183, // (default reduction)
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
{ // state 408
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 409
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 410
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 412
0x80000000|309, // match move
0x80000000|695, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 413
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+313, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+313, // $
-1, // $NT
  }
,
{ // state 414
108,1142, // "p"
  }
,
{ // state 415
172,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 416
0x80000000|739, // match move
0x80000000|1034, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 417
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 418
172,MIN_REDUCTION+91, // $NT
  }
,
{ // state 419
100,771, // "s"
  }
,
{ // state 420
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+270, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 421
0x80000000|1256, // match move
0x80000000|1366, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 422
1,445, // start
2,33, // ws*
3,1058, // $$0
4,454, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
62,676, // `*
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
121,633, // "*"
139,1013, // intLit2
141,1325, // digit++
142,804, // digit
150,664, // letter
156,1472, // ws
158,1017, // eol
166,632, // token*
169,7, // digit+
  }
,
{ // state 423
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+170, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 424
0x80000000|1492, // match move
0x80000000|301, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 425
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+242, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 426
110,972, // "v"
  }
,
{ // state 427
0x80000000|182, // match move
0x80000000|1314, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 428
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 429
172,MIN_REDUCTION+226, // $NT
  }
,
{ // state 430
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 431
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 432
125,1503, // "-"
  }
,
{ // state 433
0x80000000|168, // match move
0x80000000|1329, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 434
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 435
94,37, // "n"
  }
,
{ // state 436
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 437
2,1334, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 438
-1, // $$start
-1, // start
513, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+259, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 439
-1, // $$start
-1, // start
1316, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+277, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 440
0x80000000|341, // match move
0x80000000|1438, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 441
2,1259, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 442
172,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 443
0x80000000|650, // match move
0x80000000|1505, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 444
0x80000000|1032, // match move
0x80000000|768, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 445
171,MIN_REDUCTION+0, // $
  }
,
{ // state 446
93,104, // "a"
107,88, // "u"
111,1391, // "y"
  }
,
{ // state 447
0x80000000|175, // match move
0x80000000|722, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 448
0x80000000|411, // match move
0x80000000|1481, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 449
0x80000000|196, // match move
0x80000000|108, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 450
0x80000000|511, // match move
0x80000000|727, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 451
2,1367, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 452
2,1134, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 453
2,941, // ws*
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
83,909, // `/
84,563, // `:
85,379, // ID
87,137, // STRINGLIT
88,1465, // CHARLIT
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
115,583, // "!"
116,1198, // "="
117,61, // "%"
118,248, // "&"
119,102, // "("
120,724, // ")"
122,697, // "/"
123,1083, // "+"
124,651, // ","
125,1437, // "-"
126,190, // "."
127,1211, // ":"
128,1186, // ";"
129,1425, // "<"
130,611, // ">"
131,1461, // "["
132,1574, // "]"
133,200, // "{"
134,81, // "}"
135,688, // "|"
138,105, // "X"
143,92, // "'"
146,690, // '"'
150,664, // letter
152,105, // {"A".."W" "Y".."Z" "j" "q"}
153,871, // " "
156,1472, // ws
157,871, // {9}
158,1017, // eol
162,1525, // {10}
163,1340, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 455
102,1048, // "t"
  }
,
{ // state 456
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 457
0x80000000|1012, // match move
0x80000000|85, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 458
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 459
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+191, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 460
91,283, // "l"
  }
,
{ // state 461
112,588, // "m"
  }
,
{ // state 462
172,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 463
172,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 464
0x80000000|1559, // match move
0x80000000|270, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 465
90,70, // "o"
  }
,
{ // state 466
172,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 467
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 469
0x80000000|1573, // match move
0x80000000|76, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 470
-1, // $$start
-1, // start
1155, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+171, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+171, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+171, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+171, // "u"
1411, // "p"
MIN_REDUCTION+171, // "h"
465, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
789, // "g"
MIN_REDUCTION+171, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+171, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 471
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 472
5,418, // `boolean
6,1399, // `class
7,1163, // `extends
8,19, // `void
9,1035, // `int
10,277, // `while
11,723, // `if
12,394, // `else
13,1435, // `for
14,318, // `break
15,1470, // `this
16,1241, // `false
17,1350, // `true
18,1500, // `super
19,1378, // `null
20,1068, // `return
21,959, // `instanceof
22,1174, // `new
23,347, // `abstract
24,1506, // `assert
25,678, // `byte
26,1153, // `case
27,204, // `catch
28,1145, // `char
29,523, // `const
30,565, // `continue
31,1006, // `default
32,1466, // `do
33,186, // `double
34,1402, // `enum
35,203, // `final
36,1315, // `finally
37,1299, // `float
38,683, // `goto
39,236, // `implements
40,400, // `import
41,89, // `interface
42,68, // `long
43,1405, // `native
44,302, // `package
45,321, // `private
46,731, // `protected
47,1363, // `public
48,93, // `short
49,429, // `static
50,57, // `strictfp
51,27, // `switch
52,1014, // `synchronized
53,915, // `throw
54,1501, // `throws
55,313, // `transient
56,715, // `try
57,1108, // `volatile
89,1418, // "b"
91,1494, // "l"
92,1027, // "e"
93,1575, // "a"
94,1523, // "n"
97,989, // "r"
99,506, // "c"
100,1483, // "s"
102,1502, // "t"
103,389, // "d"
104,216, // "f"
105,1431, // "i"
106,40, // "w"
108,1411, // "p"
110,465, // "v"
113,789, // "g"
  }
,
{ // state 473
0x80000000|20, // match move
0x80000000|272, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 474
0x80000000|1487, // match move
0x80000000|1312, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 475
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 476
0x80000000|266, // match move
0x80000000|1370, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 477
2,1120, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 478
116,1454, // "="
  }
,
{ // state 479
106,319, // "w"
  }
,
{ // state 480
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 481
0x80000000|431, // match move
0x80000000|653, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 482
2,1263, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 483
0x80000000|1515, // match move
0x80000000|742, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 484
2,1412, // ws*
153,871, // " "
156,1472, // ws
157,871, // {9}
158,1017, // eol
162,1525, // {10}
163,1340, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 485
0x80000000|334, // match move
0x80000000|1477, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 486
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 487
2,449, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 488
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 489
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 490
0x80000000|551, // match move
0x80000000|96, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 491
2,813, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 492
2,670, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 493
172,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 494
0x80000000|1310, // match move
0x80000000|970, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 495
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 496
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 497
172,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 498
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+274, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 499
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 500
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 501
2,1095, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 502
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 503
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 504
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 505
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 506
90,435, // "o"
91,118, // "l"
93,1237, // "a"
109,296, // "h"
  }
,
{ // state 507
0x80000000|140, // match move
0x80000000|305, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 508
2,1316, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 509
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+280, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 510
-1, // $$start
-1, // start
481, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+279, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 511
2,821, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 512
0x80000000|1052, // match move
0x80000000|931, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 513
0x80000000|561, // match move
0x80000000|1266, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 514
0x80000000|363, // match move
0x80000000|669, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 515
99,1486, // "c"
  }
,
{ // state 516
0x80000000|924, // match move
0x80000000|1047, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 517
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+298, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 518
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 519
92,1536, // "e"
  }
,
{ // state 520
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 521
0x80000000|1459, // match move
0x80000000|195, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 522
0x80000000|324, // match move
0x80000000|1311, // no-match move
0x80000000|801, // NT-test-match state for digit
  }
,
{ // state 523
172,MIN_REDUCTION+169, // $NT
  }
,
{ // state 524
136,315, // "0"
137,315, // {"1".."9"}
142,522, // digit
  }
,
{ // state 525
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 526
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 527
-1, // $$start
-1, // start
1011, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+234, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+234, // "k"
506, // "c"
686, // "s"
MIN_REDUCTION+234, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+234, // "u"
1411, // "p"
MIN_REDUCTION+234, // "h"
465, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
789, // "g"
MIN_REDUCTION+234, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+234, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 528
0x80000000|376, // match move
0x80000000|73, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 529
0x80000000|1403, // match move
0x80000000|1136, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 530
92,1169, // "e"
  }
,
{ // state 531
0x80000000|766, // match move
0x80000000|981, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 532
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 533
102,1152, // "t"
  }
,
{ // state 534
4,210, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
  }
,
{ // state 535
0x80000000|888, // match move
0x80000000|902, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 536
0x80000000|271, // match move
0x80000000|427, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 537
0x80000000|45, // match move
0x80000000|228, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 538
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 539
0x80000000|217, // match move
0x80000000|644, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 540
0x80000000|407, // match move
0x80000000|586, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 541
2,600, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 542
0x80000000|846, // match move
0x80000000|1003, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 543
-1, // $$start
-1, // start
557, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+297, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 544
93,362, // "a"
  }
,
{ // state 545
0x80000000|30, // match move
0x80000000|1383, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 546
105,1382, // "i"
  }
,
{ // state 547
1,445, // start
2,33, // ws*
3,1058, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
166,632, // token*
  }
,
{ // state 548
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+272, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 549
107,1542, // "u"
  }
,
{ // state 550
2,481, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 551
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 552
2,793, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 553
0x80000000|1307, // match move
0x80000000|684, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 554
2,513, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 555
2,1194, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 556
2,637, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 557
0x80000000|525, // match move
0x80000000|329, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 558
0x80000000|462, // match move
0x80000000|60, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 559
0x80000000|382, // match move
0x80000000|143, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 560
0x80000000|1507, // match move
0x80000000|781, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 561
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 562
97,1189, // "r"
  }
,
{ // state 563
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 564
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 565
172,MIN_REDUCTION+172, // $NT
  }
,
{ // state 566
0x80000000|223, // match move
0x80000000|398, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 567
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 568
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+296, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 569
0x80000000|1226, // match move
0x80000000|609, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 570
0x80000000|935, // match move
0x80000000|1205, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 571
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 572
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+155, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 573
2,557, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 574
102,1044, // "t"
  }
,
{ // state 575
93,1201, // "a"
  }
,
{ // state 576
2,513, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 577
107,829, // "u"
  }
,
{ // state 578
0x80000000|297, // match move
0x80000000|160, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 579
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 580
0x80000000|149, // match move
0x80000000|710, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 581
0x80000000|1508, // match move
0x80000000|884, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 582
172,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 583
0x80000000|737, // match move
0x80000000|614, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 584
-1, // $$start
-1, // start
512, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+253, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 585
0x80000000|356, // match move
0x80000000|1467, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 586
-1, // $$start
-1, // start
224, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+183, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+183, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+183, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+183, // "u"
1411, // "p"
MIN_REDUCTION+183, // "h"
465, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
789, // "g"
MIN_REDUCTION+183, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+183, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 587
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 588
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 589
99,1208, // "c"
  }
,
{ // state 590
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 591
2,58, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 592
2,1011, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 593
0x80000000|79, // match move
0x80000000|783, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 594
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 596
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+236, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 597
0x80000000|1284, // match move
0x80000000|138, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 598
0x80000000|170, // match move
0x80000000|729, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 599
2,1316, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 600
0x80000000|969, // match move
0x80000000|840, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 601
91,18, // "l"
  }
,
{ // state 602
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 603
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+282, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 604
0x80000000|428, // match move
0x80000000|1046, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 605
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 606
2,1334, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 607
2,973, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 608
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+110, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 609
0x80000000|680, // match move
0x80000000|1239, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 610
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 611
0x80000000|716, // match move
0x80000000|1567, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 612
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+122, // (default reduction)
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
{ // state 613
103,64, // "d"
  }
,
{ // state 614
0x80000000|679, // match move
0x80000000|388, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 615
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 616
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 617
90,176, // "o"
111,1317, // "y"
  }
,
{ // state 618
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 621
116,812, // "="
  }
,
{ // state 622
2,151, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 623
102,1215, // "t"
  }
,
{ // state 624
0x80000000|1, // match move
0x80000000|968, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 625
0x80000000|1, // match move
0x80000000|951, // no-match move
// T-test match for {'"' "/"}:
122,
146,
  }
,
{ // state 626
113,1210, // "g"
  }
,
{ // state 627
0x80000000|1197, // match move
0x80000000|1102, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 628
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 629
4,210, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
83,909, // `/
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
136,1450, // "0"
150,664, // letter
  }
,
{ // state 630
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 632
0x80000000|743, // match move
0x80000000|746, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 633
0x80000000|1, // match move
0x80000000|484, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 634
0x80000000|1, // match move
0x80000000|694, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 635
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+276, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 636
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 637
0x80000000|689, // match move
0x80000000|1115, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 638
2,220, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 639
0x80000000|441, // match move
0x80000000|1144, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 640
0x80000000|576, // match move
0x80000000|438, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 641
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 642
0x80000000|1449, // match move
0x80000000|721, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 643
2,542, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 644
0x80000000|1522, // match move
0x80000000|738, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 645
102,1130, // "t"
  }
,
{ // state 646
0x80000000|718, // match move
0x80000000|1276, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 647
0x80000000|147, // match move
0x80000000|457, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 648
97,103, // "r"
105,122, // "i"
  }
,
{ // state 649
0x80000000|1, // match move
0x80000000|593, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 650
172,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 651
0x80000000|1560, // match move
0x80000000|1271, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 652
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 653
0x80000000|1272, // match move
0x80000000|553, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 654
91,1495, // "l"
  }
,
{ // state 655
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 656
92,834, // "e"
  }
,
{ // state 657
0x80000000|702, // match move
0x80000000|485, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 658
0x80000000|1540, // match move
0x80000000|908, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 659
97,1244, // "r"
  }
,
{ // state 660
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 661
0x80000000|1433, // match move
0x80000000|166, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 662
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 663
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+302, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 664
0x80000000|787, // match move
0x80000000|5, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 665
172,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 666
0x80000000|77, // match move
0x80000000|629, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 667
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 668
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 669
-1, // $$start
-1, // start
661, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
-1, // `=
-1, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
MIN_REDUCTION+249, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+249, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 670
0x80000000|107, // match move
0x80000000|1569, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 671
97,299, // "r"
  }
,
{ // state 672
0x80000000|261, // match move
0x80000000|835, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 673
0x80000000|1, // match move
0x80000000|900, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 674
0x80000000|1518, // match move
0x80000000|1440, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 675
2,597, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 677
105,95, // "i"
  }
,
{ // state 678
172,MIN_REDUCTION+157, // $NT
  }
,
{ // state 679
2,661, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 680
172,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 681
0x80000000|964, // match move
0x80000000|1024, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 682
0x80000000|1103, // match move
0x80000000|238, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 683
172,MIN_REDUCTION+196, // $NT
  }
,
{ // state 684
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+278, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 685
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+161, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 686
0x80000000|1150, // match move
0x80000000|1305, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 687
0x80000000|1365, // match move
0x80000000|1417, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 688
135,369, // "|"
  }
,
{ // state 689
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 690
0x80000000|247, // match move
0x80000000|373, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 691
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 692
111,1317, // "y"
  }
,
{ // state 693
2,1155, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 694
0x80000000|754, // match move
0x80000000|282, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 695
0x80000000|1385, // match move
0x80000000|1190, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 696
97,215, // "r"
  }
,
{ // state 697
0x80000000|1111, // match move
0x80000000|1455, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 698
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+252, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 699
2,52, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 701
0x80000000|359, // match move
0x80000000|1146, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 702
2,545, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 703
0x80000000|1132, // match move
0x80000000|1270, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 704
0x80000000|113, // match move
0x80000000|1480, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 705
104,1233, // "f"
  }
,
{ // state 706
0x80000000|896, // match move
0x80000000|984, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 707
0x80000000|364, // match move
0x80000000|69, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 708
0x80000000|1394, // match move
0x80000000|548, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 709
91,692, // "l"
  }
,
{ // state 710
0x80000000|243, // match move
0x80000000|450, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 711
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 712
158,466, // eol
159,1113, // printable**
162,1525, // {10}
163,1340, // {13}
167,330, // printable*
  }
,
{ // state 713
94,1138, // "n"
  }
,
{ // state 714
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 715
172,MIN_REDUCTION+244, // $NT
  }
,
{ // state 716
116,1292, // "="
  }
,
{ // state 717
2,1516, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 718
92,562, // "e"
  }
,
{ // state 719
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 720
0x80000000|1279, // match move
0x80000000|3, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 721
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+262, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 722
0x80000000|343, // match move
0x80000000|346, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 723
172,MIN_REDUCTION+112, // $NT
  }
,
{ // state 724
0x80000000|899, // match move
0x80000000|1140, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 725
172,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 726
2,670, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 727
-1, // $$start
-1, // start
821, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+310, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+310, // $
-1, // $NT
  }
,
{ // state 728
0x80000000|1510, // match move
0x80000000|906, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 729
0x80000000|903, // match move
0x80000000|663, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 730
172,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 731
172,MIN_REDUCTION+220, // $NT
  }
,
{ // state 732
0x80000000|1, // match move
0x80000000|474, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 733
0x80000000|1, // match move
0x80000000|681, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 734
0x80000000|1089, // match move
0x80000000|898, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 735
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 737
116,1262, // "="
  }
,
{ // state 738
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+185, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 739
2,597, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 740
-1, // $$start
-1, // start
1532, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
-1, // `=
-1, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
MIN_REDUCTION+281, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+281, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 741
112,1354, // "m"
  }
,
{ // state 742
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+361, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+361, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+361, // $
-1, // $NT
  }
,
{ // state 743
0x80000000|1, // match move
0x80000000|1268, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 744
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 745
2,1553, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 746
0x80000000|666, // match move
0x80000000|444, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 747
0x80000000|1124, // match move
0x80000000|1247, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 748
0x80000000|1036, // match move
0x80000000|117, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 749
89,257, // "b"
90,257, // "o"
91,257, // "l"
92,257, // "e"
93,257, // "a"
94,257, // "n"
97,257, // "r"
98,257, // "k"
99,257, // "c"
100,257, // "s"
101,257, // "x"
102,257, // "t"
103,257, // "d"
104,257, // "f"
105,257, // "i"
106,257, // "w"
107,257, // "u"
108,257, // "p"
109,257, // "h"
110,257, // "v"
111,257, // "y"
112,257, // "m"
113,257, // "g"
114,257, // "z"
115,257, // "!"
116,257, // "="
117,257, // "%"
118,257, // "&"
119,257, // "("
120,257, // ")"
121,257, // "*"
122,257, // "/"
123,257, // "+"
124,257, // ","
125,257, // "-"
126,257, // "."
127,257, // ":"
128,257, // ";"
129,257, // "<"
130,257, // ">"
131,257, // "["
132,257, // "]"
133,257, // "{"
134,257, // "}"
135,257, // "|"
136,257, // "0"
137,257, // {"1".."9"}
138,257, // "X"
143,257, // "'"
144,257, // "\"
145,815, // printable
146,257, // '"'
151,257, // "_"
152,257, // {"A".."W" "Y".."Z" "j" "q"}
153,257, // " "
154,257, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 750
0x80000000|628, // match move
0x80000000|396, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 751
90,1273, // "o"
91,905, // "l"
  }
,
{ // state 752
-1, // $$start
-1, // start
813, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+293, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 753
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+101, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 754
2,55, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 755
93,104, // "a"
105,1043, // "i"
107,88, // "u"
111,1391, // "y"
  }
,
{ // state 756
0x80000000|35, // match move
0x80000000|1364, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 757
91,499, // "l"
  }
,
{ // state 758
92,1291, // "e"
  }
,
{ // state 759
105,1356, // "i"
  }
,
{ // state 760
0x80000000|1245, // match move
0x80000000|921, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 761
0x80000000|1275, // match move
0x80000000|993, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 762
0x80000000|452, // match move
0x80000000|1326, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 763
2,535, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 764
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 765
-1, // $$start
-1, // start
973, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+305, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 766
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 767
121,1562, // "*"
122,1246, // "/"
  }
,
{ // state 768
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
210, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
-1, // "*"
1488, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
-1, // ws
-1, // {9}
-1, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
-1, // {10}
-1, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+358, // $
-1, // $NT
  }
,
{ // state 769
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 770
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+104, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|728, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 772
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 773
-1, // $$start
-1, // start
867, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+283, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 774
0x80000000|541, // match move
0x80000000|858, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 775
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 776
0x80000000|1224, // match move
0x80000000|112, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 777
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 778
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 779
92,634, // "e"
  }
,
{ // state 780
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 781
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+292, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 782
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+149, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 783
-1, // $$start
-1, // start
761, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+105, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+105, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+105, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+105, // "u"
1411, // "p"
MIN_REDUCTION+105, // "h"
465, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
789, // "g"
MIN_REDUCTION+105, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+105, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 784
0x80000000|258, // match move
0x80000000|1335, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 785
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 786
0x80000000|1398, // match move
0x80000000|1232, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 787
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,893, // idChar
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
136,1498, // "0"
137,1498, // {"1".."9"}
138,105, // "X"
142,206, // digit
150,674, // letter
151,1185, // "_"
152,105, // {"A".."W" "Y".."Z" "j" "q"}
164,957, // idChar**
170,1242, // idChar*
  }
,
{ // state 788
2,512, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 789
90,623, // "o"
  }
,
{ // state 790
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 791
2,687, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 792
109,848, // "h"
  }
,
{ // state 793
0x80000000|471, // match move
0x80000000|569, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 794
0x80000000|1064, // match move
0x80000000|425, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 795
101,944, // "x"
136,315, // "0"
137,315, // {"1".."9"}
138,944, // "X"
140,866, // `x
141,580, // digit++
142,804, // digit
169,7, // digit+
  }
,
{ // state 796
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 797
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+250, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 798
0x80000000|487, // match move
0x80000000|1162, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 799
100,922, // "s"
  }
,
{ // state 800
92,1004, // "e"
  }
,
{ // state 801
136,205, // "0"
137,205, // {"1".."9"}
  }
,
{ // state 802
-1, // $$start
-1, // start
421, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
-1, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
-1, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+269, // "*"
697, // "/"
1083, // "+"
651, // ","
MIN_REDUCTION+269, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 803
0x80000000|999, // match move
0x80000000|304, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 804
0x80000000|805, // match move
0x80000000|868, // no-match move
0x80000000|801, // NT-test-match state for digit
  }
,
{ // state 805
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 806
0x80000000|577, // match move
0x80000000|706, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 807
0x80000000|1520, // match move
0x80000000|855, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 808
0x80000000|131, // match move
0x80000000|572, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 809
0x80000000|1121, // match move
0x80000000|642, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 810
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 811
94,350, // "n"
  }
,
{ // state 812
0x80000000|326, // match move
0x80000000|440, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 813
0x80000000|1547, // match move
0x80000000|1029, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 814
0x80000000|133, // match move
0x80000000|1416, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 815
0x80000000|587, // match move
0x80000000|850, // no-match move
0x80000000|371, // NT-test-match state for printable
  }
,
{ // state 816
113,303, // "g"
  }
,
{ // state 817
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 818
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 819
0x80000000|1, // match move
0x80000000|933, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 820
0x80000000|693, // match move
0x80000000|470, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 821
0x80000000|383, // match move
0x80000000|127, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 822
0x80000000|179, // match move
0x80000000|936, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 823
2,557, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 824
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+137, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 825
0x80000000|591, // match move
0x80000000|109, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 826
-1, // $$start
-1, // start
286, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+271, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+271, // $
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
{ // state 827
0x80000000|1050, // match move
0x80000000|420, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 828
0x80000000|852, // match move
0x80000000|986, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 829
89,654, // "b"
  }
,
{ // state 830
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 831
172,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 832
2,1194, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 833
0x80000000|172, // match move
0x80000000|701, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 834
103,1476, // "d"
  }
,
{ // state 835
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+212, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 836
0x80000000|1, // match move
0x80000000|1557, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 837
91,869, // "l"
94,264, // "n"
97,1189, // "r"
101,1172, // "x"
  }
,
{ // state 838
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 839
0x80000000|602, // match move
0x80000000|1544, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 840
0x80000000|488, // match move
0x80000000|847, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 841
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 842
2,28, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 843
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 844
0x80000000|1347, // match move
0x80000000|154, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 845
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+92, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 846
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 847
0x80000000|1556, // match move
0x80000000|413, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 848
0x80000000|1, // match move
0x80000000|825, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 849
0x80000000|1, // match move
0x80000000|945, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 850
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 851
0x80000000|830, // match move
0x80000000|332, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 852
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 853
0x80000000|391, // match move
0x80000000|672, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 854
0x80000000|279, // match move
0x80000000|736, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 855
0x80000000|594, // match move
0x80000000|808, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 856
109,659, // "h"
  }
,
{ // state 857
0x80000000|39, // match move
0x80000000|265, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 858
-1, // $$start
-1, // start
600, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+314, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 859
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 860
-1, // $$start
-1, // start
938, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+216, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+216, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+216, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+216, // "u"
1411, // "p"
MIN_REDUCTION+216, // "h"
465, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
789, // "g"
MIN_REDUCTION+216, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+216, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 861
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 862
93,1254, // "a"
  }
,
{ // state 863
92,671, // "e"
  }
,
{ // state 864
172,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 865
92,1451, // "e"
  }
,
{ // state 866
136,315, // "0"
137,315, // {"1".."9"}
141,1236, // digit++
142,804, // digit
169,7, // digit+
  }
,
{ // state 867
0x80000000|1123, // match move
0x80000000|910, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 868
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 869
100,306, // "s"
  }
,
{ // state 870
0x80000000|1063, // match move
0x80000000|459, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 871
172,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 872
0x80000000|907, // match move
0x80000000|1147, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 873
0x80000000|636, // match move
0x80000000|443, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 874
2,1203, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 875
0x80000000|1125, // match move
0x80000000|894, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 876
0x80000000|937, // match move
0x80000000|1249, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 877
0x80000000|1287, // match move
0x80000000|1511, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 878
0x80000000|1131, // match move
0x80000000|1436, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 879
0x80000000|94, // match move
0x80000000|1207, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 880
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 881
107,339, // "u"
  }
,
{ // state 882
2,973, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 883
2,1360, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 884
0x80000000|592, // match move
0x80000000|527, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 885
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 886
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 887
0x80000000|492, // match move
0x80000000|1281, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 888
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 889
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 890
2,661, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 891
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 892
-1, // $$start
-1, // start
1360, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+150, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+150, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+150, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+150, // "u"
1411, // "p"
MIN_REDUCTION+150, // "h"
465, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
789, // "g"
MIN_REDUCTION+150, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+150, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 893
0x80000000|532, // match move
0x80000000|403, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 894
0x80000000|1319, // match move
0x80000000|1105, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 895
0x80000000|665, // match move
0x80000000|1301, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 896
2,260, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 897
-1, // $$start
-1, // start
1159, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+168, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+168, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+168, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+168, // "u"
1411, // "p"
MIN_REDUCTION+168, // "h"
465, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
789, // "g"
MIN_REDUCTION+168, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+168, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
  }
,
{ // state 898
0x80000000|310, // match move
0x80000000|992, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 899
2,513, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 900
0x80000000|97, // match move
0x80000000|211, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 901
104,335, // "f"
  }
,
{ // state 902
0x80000000|838, // match move
0x80000000|1330, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 903
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 904
0x80000000|1, // match move
0x80000000|966, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 905
92,741, // "e"
  }
,
{ // state 906
-1, // $$start
-1, // start
381, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+96, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+96, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+96, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+96, // "u"
1411, // "p"
MIN_REDUCTION+96, // "h"
465, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
789, // "g"
MIN_REDUCTION+96, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+96, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 907
2,54, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 908
0x80000000|1158, // match move
0x80000000|870, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 909
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 910
0x80000000|526, // match move
0x80000000|1252, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 911
0x80000000|231, // match move
0x80000000|748, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 912
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+113, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 913
92,1478, // "e"
  }
,
{ // state 914
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 915
172,MIN_REDUCTION+235, // $NT
  }
,
{ // state 916
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 917
0x80000000|184, // match move
0x80000000|268, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 918
89,1328, // "b"
90,1328, // "o"
91,1328, // "l"
92,1328, // "e"
93,1328, // "a"
94,1328, // "n"
97,1328, // "r"
98,1328, // "k"
99,1328, // "c"
100,1328, // "s"
101,1328, // "x"
102,1328, // "t"
103,1328, // "d"
104,1328, // "f"
105,1328, // "i"
106,1328, // "w"
107,1328, // "u"
108,1328, // "p"
109,1328, // "h"
110,1328, // "v"
111,1328, // "y"
112,1328, // "m"
113,1328, // "g"
114,1328, // "z"
115,1328, // "!"
116,1328, // "="
117,1328, // "%"
118,1328, // "&"
119,1328, // "("
120,1328, // ")"
121,1328, // "*"
122,1328, // "/"
123,1328, // "+"
124,1328, // ","
125,1328, // "-"
126,1328, // "."
127,1328, // ":"
128,1328, // ";"
129,1328, // "<"
130,1328, // ">"
131,1328, // "["
132,1328, // "]"
133,1328, // "{"
134,1328, // "}"
135,1328, // "|"
136,1328, // "0"
137,1328, // {"1".."9"}
138,1328, // "X"
143,1328, // "'"
144,1328, // "\"
145,920, // printable
146,1328, // '"'
151,1328, // "_"
152,1328, // {"A".."W" "Y".."Z" "j" "q"}
153,1328, // " "
154,1328, // {"#".."$" "?".."@" "^" "`" "~"}
158,9, // eol
161,1375, // commentContent
162,1525, // {10}
163,1340, // {13}
  }
,
{ // state 919
0x80000000|1, // match move
0x80000000|1401, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 920
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 921
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+248, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 922
0x80000000|1, // match move
0x80000000|872, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 923
-1, // $$start
-1, // start
1334, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+291, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 924
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 925
2,750, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 926
0x80000000|1442, // match move
0x80000000|423, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 927
151,MIN_REDUCTION+320, // "_"
164,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 928
-1, // $$start
-1, // start
658, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+192, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+192, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+192, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+192, // "u"
1411, // "p"
MIN_REDUCTION+192, // "h"
465, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
789, // "g"
MIN_REDUCTION+192, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+192, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 929
89,348, // "b"
  }
,
{ // state 930
2,1104, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 931
0x80000000|998, // match move
0x80000000|1258, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 932
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 933
0x80000000|1059, // match move
0x80000000|928, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 934
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 935
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 936
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+164, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 937
172,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 938
0x80000000|818, // match move
0x80000000|997, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 939
2,807, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 940
0x80000000|153, // match move
0x80000000|126, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 941
0x80000000|63, // match move
0x80000000|598, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 942
-1, // $$start
-1, // start
1571, // ws*
-1, // $$0
MIN_REDUCTION+337, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+337, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
769, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+337, // $
-1, // $NT
  }
,
{ // state 943
91,351, // "l"
  }
,
{ // state 944
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 945
0x80000000|1065, // match move
0x80000000|1285, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 946
-1, // $$start
-1, // start
1120, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+231, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+231, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+231, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+231, // "u"
1411, // "p"
MIN_REDUCTION+231, // "h"
465, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
789, // "g"
MIN_REDUCTION+231, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+231, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 947
0x80000000|790, // match move
0x80000000|1381, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 948
102,300, // "t"
  }
,
{ // state 949
-1, // $$start
-1, // start
372, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+225, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+225, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+225, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+225, // "u"
1411, // "p"
MIN_REDUCTION+225, // "h"
465, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
789, // "g"
MIN_REDUCTION+225, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+225, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 950
172,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 951
89,1328, // "b"
90,1328, // "o"
91,1328, // "l"
92,1328, // "e"
93,1328, // "a"
94,1328, // "n"
97,1328, // "r"
98,1328, // "k"
99,1328, // "c"
100,1328, // "s"
101,1328, // "x"
102,1328, // "t"
103,1328, // "d"
104,1328, // "f"
105,1328, // "i"
106,1328, // "w"
107,1328, // "u"
108,1328, // "p"
109,1328, // "h"
110,1328, // "v"
111,1328, // "y"
112,1328, // "m"
113,1328, // "g"
114,1328, // "z"
115,1328, // "!"
116,1328, // "="
117,1328, // "%"
118,1328, // "&"
119,1328, // "("
120,1328, // ")"
121,1328, // "*"
122,1328, // "/"
123,1328, // "+"
124,1328, // ","
125,1328, // "-"
126,1328, // "."
127,1328, // ":"
128,1328, // ";"
129,1328, // "<"
130,1328, // ">"
131,1328, // "["
132,1328, // "]"
133,1328, // "{"
134,1328, // "}"
135,1328, // "|"
136,1328, // "0"
137,1328, // {"1".."9"}
138,1328, // "X"
143,1328, // "'"
144,1328, // "\"
145,53, // printable
146,1328, // '"'
151,1328, // "_"
152,1328, // {"A".."W" "Y".."Z" "j" "q"}
153,1328, // " "
154,1328, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 952
0x80000000|136, // match move
0x80000000|368, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 953
0x80000000|1414, // match move
0x80000000|911, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 954
102,342, // "t"
  }
,
{ // state 955
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 956
89,1328, // "b"
90,1328, // "o"
91,1328, // "l"
92,1328, // "e"
93,1328, // "a"
94,1328, // "n"
97,1328, // "r"
98,1328, // "k"
99,1328, // "c"
100,1328, // "s"
101,1328, // "x"
102,1328, // "t"
103,1328, // "d"
104,1328, // "f"
105,1328, // "i"
106,1328, // "w"
107,1328, // "u"
108,1328, // "p"
109,1328, // "h"
110,1328, // "v"
111,1328, // "y"
112,1328, // "m"
113,1328, // "g"
114,1328, // "z"
115,1328, // "!"
116,1328, // "="
117,1328, // "%"
118,1328, // "&"
119,1328, // "("
120,1328, // ")"
121,1328, // "*"
122,1328, // "/"
123,1328, // "+"
124,1328, // ","
125,1328, // "-"
126,1328, // "."
127,1328, // ":"
128,1328, // ";"
129,1328, // "<"
130,1328, // ">"
131,1328, // "["
132,1328, // "]"
133,1328, // "{"
134,1328, // "}"
135,1328, // "|"
136,1328, // "0"
137,1328, // {"1".."9"}
138,1328, // "X"
143,1328, // "'"
144,1328, // "\"
145,920, // printable
146,1328, // '"'
151,1328, // "_"
152,1328, // {"A".."W" "Y".."Z" "j" "q"}
153,1328, // " "
154,1328, // {"#".."$" "?".."@" "^" "`" "~"}
158,9, // eol
160,1427, // commentContent*
161,932, // commentContent
162,1525, // {10}
163,1340, // {13}
  }
,
{ // state 957
0x80000000|1357, // match move
0x80000000|857, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 958
172,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 959
172,MIN_REDUCTION+115, // $NT
  }
,
{ // state 960
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 961
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 962
97,733, // "r"
  }
,
{ // state 963
0x80000000|1, // match move
0x80000000|820, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 964
2,1118, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 965
0x80000000|497, // match move
0x80000000|845, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 966
0x80000000|622, // match move
0x80000000|2, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 967
0x80000000|34, // match move
0x80000000|559, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 968
0x80000000|187, // match move
0x80000000|273, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 969
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 970
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+227, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 971
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 972
93,46, // "a"
  }
,
{ // state 973
0x80000000|1368, // match move
0x80000000|464, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 974
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+284, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 975
0x80000000|135, // match move
0x80000000|291, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 976
100,419, // "s"
  }
,
{ // state 977
0x80000000|1261, // match move
0x80000000|1332, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 978
0x80000000|1565, // match move
0x80000000|180, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 979
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 980
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 981
0x80000000|1430, // match move
0x80000000|753, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 982
3,711, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
166,632, // token*
  }
,
{ // state 983
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,490, // idChar
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
136,1498, // "0"
137,1498, // {"1".."9"}
138,105, // "X"
142,206, // digit
150,674, // letter
151,1185, // "_"
152,105, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 984
-1, // $$start
-1, // start
260, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+177, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+177, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+177, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
829, // "u"
1411, // "p"
MIN_REDUCTION+177, // "h"
465, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
789, // "g"
MIN_REDUCTION+177, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+177, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 985
2,421, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 986
0x80000000|17, // match move
0x80000000|1296, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 987
0x80000000|410, // match move
0x80000000|1392, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 988
0x80000000|249, // match move
0x80000000|15, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 989
92,1184, // "e"
  }
,
{ // state 990
0x80000000|1351, // match move
0x80000000|498, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 991
2,372, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 992
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+176, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 993
0x80000000|1388, // match move
0x80000000|1173, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 994
0x80000000|520, // match move
0x80000000|173, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 995
0x80000000|393, // match move
0x80000000|83, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 996
99,11, // "c"
  }
,
{ // state 997
0x80000000|1293, // match move
0x80000000|895, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 998
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 999
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1000
2,191, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1001
162,365, // {10}
  }
,
{ // state 1002
92,649, // "e"
  }
,
{ // state 1003
0x80000000|1251, // match move
0x80000000|207, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1004
0x80000000|1, // match move
0x80000000|1049, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1005
100,49, // "s"
102,646, // "t"
  }
,
{ // state 1006
172,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1007
2,967, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1008
-1, // $$start
-1, // start
687, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+243, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+243, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+243, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+243, // "u"
1411, // "p"
MIN_REDUCTION+243, // "h"
465, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
789, // "g"
MIN_REDUCTION+243, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+243, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 1009
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1010
0x80000000|408, // match move
0x80000000|316, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1011
0x80000000|1421, // match move
0x80000000|1154, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1012
172,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1013
0x80000000|882, // match move
0x80000000|1178, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1014
172,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1015
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+173, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 1016
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1017
172,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1018
0x80000000|1128, // match move
0x80000000|897, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1019
102,23, // "t"
  }
,
{ // state 1020
94,41, // "n"
  }
,
{ // state 1021
-1, // $$start
-1, // start
786, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+295, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 1022
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1023
2,786, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1024
-1, // $$start
-1, // start
1118, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+165, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+165, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+165, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+165, // "u"
1411, // "p"
MIN_REDUCTION+165, // "h"
465, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
789, // "g"
MIN_REDUCTION+165, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+165, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
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
{ // state 1025
0x80000000|1482, // match move
0x80000000|42, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1026
0x80000000|1568, // match move
0x80000000|1248, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1027
91,869, // "l"
94,264, // "n"
101,1172, // "x"
  }
,
{ // state 1028
-1, // $$start
-1, // start
1194, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+273, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1029
0x80000000|662, // match move
0x80000000|560, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1030
122,29, // "/"
  }
,
{ // state 1031
-1, // $$start
-1, // start
1250, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+267, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 1032
4,210, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
89,1418, // "b"
91,1494, // "l"
92,1027, // "e"
93,1575, // "a"
94,1523, // "n"
97,989, // "r"
99,506, // "c"
100,1483, // "s"
102,1502, // "t"
103,389, // "d"
104,216, // "f"
105,1431, // "i"
106,40, // "w"
108,1411, // "p"
110,465, // "v"
113,789, // "g"
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1033
0x80000000|709, // match move
0x80000000|1148, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1034
0x80000000|1339, // match move
0x80000000|235, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1035
172,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1036
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1037
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1038
0x80000000|1265, // match move
0x80000000|940, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1039
0x80000000|764, // match move
0x80000000|447, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1040
107,1200, // "u"
  }
,
{ // state 1041
2,813, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1042
0x80000000|1220, // match move
0x80000000|685, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1043
99,66, // "c"
  }
,
{ // state 1044
0x80000000|1, // match move
0x80000000|1157, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1045
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1046
0x80000000|442, // match move
0x80000000|1419, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1047
0x80000000|1563, // match move
0x80000000|635, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1048
97,110, // "r"
  }
,
{ // state 1049
0x80000000|939, // match move
0x80000000|1070, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1050
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1051
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1052
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1053
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1054
2,987, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1055
2,521, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1056
-1, // $$start
-1, // start
637, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+246, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+246, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+246, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+246, // "u"
1411, // "p"
MIN_REDUCTION+246, // "h"
465, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
789, // "g"
MIN_REDUCTION+246, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+246, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 1057
94,116, // "n"
  }
,
{ // state 1058
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1059
2,658, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1060
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+224, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 1061
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+152, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 1062
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1063
172,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1064
172,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1065
2,222, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1066
2,1250, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1067
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1068
172,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1069
172,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1070
-1, // $$start
-1, // start
807, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+156, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+156, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+156, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+156, // "u"
1411, // "p"
MIN_REDUCTION+156, // "h"
465, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
789, // "g"
MIN_REDUCTION+156, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+156, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 1071
2,867, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1072
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1073
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+260, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1074
172,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1075
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+188, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 1076
0x80000000|150, // match move
0x80000000|331, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1077
97,218, // "r"
  }
,
{ // state 1078
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1079
-1, // $$start
-1, // start
1206, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+102, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+102, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+102, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+102, // "u"
1411, // "p"
MIN_REDUCTION+102, // "h"
465, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
789, // "g"
MIN_REDUCTION+102, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+102, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 1080
0x80000000|1534, // match move
0x80000000|1235, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1081
0x80000000|1, // match move
0x80000000|1112, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1082
0x80000000|31, // match move
0x80000000|1408, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1083
0x80000000|21, // match move
0x80000000|56, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1084
100,404, // "s"
  }
,
{ // state 1085
0x80000000|229, // match move
0x80000000|14, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1086
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1087
0x80000000|1, // match move
0x80000000|1133, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1088
0x80000000|1327, // match move
0x80000000|1448, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1089
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1090
0x80000000|1321, // match move
0x80000000|1512, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1091
0x80000000|504, // match move
0x80000000|101, // no-match move
0x80000000|371, // NT-test-match state for printable
  }
,
{ // state 1092
99,148, // "c"
  }
,
{ // state 1093
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1094
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1095
0x80000000|1156, // match move
0x80000000|570, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1096
94,862, // "n"
  }
,
{ // state 1097
0x80000000|1410, // match move
0x80000000|1222, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1098
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1099
99,367, // "c"
  }
,
{ // state 1100
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1101
-1, // $$start
-1, // start
793, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+219, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+219, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+219, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+219, // "u"
1411, // "p"
MIN_REDUCTION+219, // "h"
465, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
789, // "g"
MIN_REDUCTION+219, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+219, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
  }
,
{ // state 1102
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+245, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 1103
172,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1104
0x80000000|139, // match move
0x80000000|340, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1105
-1, // $$start
-1, // start
507, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+299, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1106
0x80000000|1000, // match move
0x80000000|1221, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1107
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1108
172,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1109
2,786, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1110
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1111
121,1562, // "*"
122,1246, // "/"
  }
,
{ // state 1112
0x80000000|477, // match move
0x80000000|946, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1113
158,1342, // eol
162,1525, // {10}
163,1340, // {13}
  }
,
{ // state 1114
2,1532, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1115
0x80000000|358, // match move
0x80000000|627, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1116
0x80000000|982, // match move
0x80000000|1554, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1117
2,1571, // ws*
156,1472, // ws
158,1017, // eol
164,957, // idChar**
165,496, // $$2
170,1242, // idChar*
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1118
0x80000000|13, // match move
0x80000000|276, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1119
0x80000000|556, // match move
0x80000000|1056, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1120
0x80000000|1278, // match move
0x80000000|378, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1121
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1122
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1123
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1124
2,784, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1125
2,507, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1126
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1127
0x80000000|1053, // match move
0x80000000|558, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1128
2,1159, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1129
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1130
0x80000000|1, // match move
0x80000000|1171, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1131
2,1316, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1132
2,1095, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1133
0x80000000|1533, // match move
0x80000000|252, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1134
0x80000000|292, // match move
0x80000000|1331, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1135
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1136
0x80000000|1217, // match move
0x80000000|990, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1137
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1138
0x80000000|1, // match move
0x80000000|1097, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1139
0x80000000|155, // match move
0x80000000|483, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1140
0x80000000|554, // match move
0x80000000|640, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1141
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1142
0x80000000|1, // match move
0x80000000|988, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1143
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1144
-1, // $$start
-1, // start
1259, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+308, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 1145
172,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1146
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+194, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1147
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+198, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+198, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+198, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+198, // "u"
1411, // "p"
MIN_REDUCTION+198, // "h"
465, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
789, // "g"
MIN_REDUCTION+198, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+198, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 1148
0x80000000|1282, // match move
0x80000000|1468, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1149
0x80000000|1489, // match move
0x80000000|1127, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1150
102,1527, // "t"
106,759, // "w"
107,124, // "u"
109,1280, // "h"
111,1057, // "y"
  }
,
{ // state 1151
93,208, // "a"
  }
,
{ // state 1152
105,213, // "i"
  }
,
{ // state 1153
172,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1154
0x80000000|1129, // match move
0x80000000|879, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1155
0x80000000|744, // match move
0x80000000|158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1156
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1157
0x80000000|643, // match move
0x80000000|1179, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1158
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1159
0x80000000|51, // match move
0x80000000|604, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1160
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1161
0x80000000|1116, // match move
0x80000000|197, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1162
-1, // $$start
-1, // start
449, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+93, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+93, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+93, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+93, // "u"
1411, // "p"
MIN_REDUCTION+93, // "h"
465, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
789, // "g"
MIN_REDUCTION+93, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+93, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 1163
172,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1164
-1, // $$start
-1, // start
784, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+237, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+237, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+237, // "x"
1432, // "t"
389, // "d"
216, // "f"
1431, // "i"
1349, // "w"
124, // "u"
1411, // "p"
1280, // "h"
465, // "v"
1057, // "y"
MIN_REDUCTION+237, // "m"
789, // "g"
MIN_REDUCTION+237, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+237, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1165
92,214, // "e"
  }
,
{ // state 1166
108,751, // "p"
  }
,
{ // state 1167
2,1532, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1168
0x80000000|430, // match move
0x80000000|84, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1169
0x80000000|1, // match move
0x80000000|1119, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1170
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1171
0x80000000|240, // match move
0x80000000|59, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1172
102,519, // "t"
  }
,
{ // state 1173
0x80000000|1514, // match move
0x80000000|770, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1174
172,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1175
0x80000000|1, // match move
0x80000000|1106, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1176
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1177
94,219, // "n"
  }
,
{ // state 1178
0x80000000|607, // match move
0x80000000|25, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1179
-1, // $$start
-1, // start
542, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+174, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+174, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+174, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+174, // "u"
1411, // "p"
MIN_REDUCTION+174, // "h"
465, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
789, // "g"
MIN_REDUCTION+174, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+174, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 1180
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1181
0x80000000|1570, // match move
0x80000000|1196, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1182
2,1206, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1183
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1184
102,549, // "t"
  }
,
{ // state 1185
0x80000000|859, // match move
0x80000000|971, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1186
0x80000000|550, // match move
0x80000000|254, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1187
172,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1188
-1, // $$start
-1, // start
967, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+114, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+114, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+114, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+114, // "u"
1411, // "p"
MIN_REDUCTION+114, // "h"
465, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
789, // "g"
MIN_REDUCTION+114, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+114, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 1189
104,544, // "f"
  }
,
{ // state 1190
0x80000000|582, // match move
0x80000000|1458, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1191
0x80000000|1358, // match move
0x80000000|1183, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 1192
2,953, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1193
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+290, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1194
0x80000000|667, // match move
0x80000000|353, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1195
0x80000000|226, // match move
0x80000000|312, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1196
-1, // $$start
-1, // start
704, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+99, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+99, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+99, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+99, // "u"
1411, // "p"
MIN_REDUCTION+99, // "h"
465, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
789, // "g"
MIN_REDUCTION+99, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+99, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 1197
172,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1198
0x80000000|478, // match move
0x80000000|1407, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1199
0x80000000|914, // match move
0x80000000|1042, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1200
91,574, // "l"
  }
,
{ // state 1201
94,284, // "n"
  }
,
{ // state 1202
172,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1203
0x80000000|467, // match move
0x80000000|528, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1204
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1205
0x80000000|380, // match move
0x80000000|797, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1206
0x80000000|1016, // match move
0x80000000|531, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1207
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+233, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 1208
102,65, // "t"
  }
,
{ // state 1209
0x80000000|8, // match move
0x80000000|385, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1210
92,849, // "e"
  }
,
{ // state 1211
0x80000000|508, // match move
0x80000000|878, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1212
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1213
93,1019, // "a"
  }
,
{ // state 1214
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+89, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 1215
90,1175, // "o"
  }
,
{ // state 1216
2,220, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1217
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1218
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1219
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1220
172,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1221
-1, // $$start
-1, // start
191, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+195, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+195, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+195, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+195, // "u"
1411, // "p"
MIN_REDUCTION+195, // "h"
465, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
789, // "g"
MIN_REDUCTION+195, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+195, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 1222
-1, // $$start
-1, // start
161, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+90, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+90, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+90, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+90, // "u"
1411, // "p"
MIN_REDUCTION+90, // "h"
465, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
789, // "g"
MIN_REDUCTION+90, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+90, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+90, // $
MIN_REDUCTION+90, // $NT
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
{ // state 1223
-1, // $$start
-1, // start
1344, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+257, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 1224
172,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1225
0x80000000|225, // match move
0x80000000|433, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1226
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1227
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1228
0x80000000|278, // match move
0x80000000|776, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1229
0x80000000|1143, // match move
0x80000000|827, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1230
172,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1231
2,1104, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1232
0x80000000|156, // match move
0x80000000|308, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1233
0x80000000|1, // match move
0x80000000|1484, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1234
0x80000000|1, // match move
0x80000000|1181, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1235
0x80000000|493, // match move
0x80000000|1061, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1236
0x80000000|1541, // match move
0x80000000|134, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1237
100,1165, // "s"
102,996, // "t"
  }
,
{ // state 1238
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1239
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+218, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 1240
2,512, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1241
172,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1242
0x80000000|983, // match move
0x80000000|817, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1243
172,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1244
90,1020, // "o"
  }
,
{ // state 1245
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1246
0x80000000|1564, // match move
0x80000000|712, // no-match move
0x80000000|371, // NT-test-match state for printable
  }
,
{ // state 1247
-1, // $$start
-1, // start
784, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+237, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+237, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+237, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+237, // "u"
1411, // "p"
MIN_REDUCTION+237, // "h"
465, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
789, // "g"
MIN_REDUCTION+237, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+237, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 1248
0x80000000|1426, // match move
0x80000000|826, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1249
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+128, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1250
0x80000000|434, // match move
0x80000000|975, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1251
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1252
0x80000000|1490, // match move
0x80000000|603, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1253
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1254
91,1033, // "l"
  }
,
{ // state 1255
2,545, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1256
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1257
172,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1258
0x80000000|119, // match move
0x80000000|698, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1259
0x80000000|1289, // match move
0x80000000|1090, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1260
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1261
2,557, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1262
0x80000000|501, // match move
0x80000000|703, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1263
0x80000000|1434, // match move
0x80000000|26, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1264
105,1043, // "i"
  }
,
{ // state 1265
0x80000000|287, // match move
0x80000000|337, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1266
0x80000000|1372, // match move
0x80000000|814, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1267
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1268
0x80000000|534, // match move
0x80000000|322, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1269
172,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1270
0x80000000|1404, // match move
0x80000000|75, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1271
0x80000000|1066, // match move
0x80000000|1530, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1272
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1273
97,645, // "r"
  }
,
{ // state 1274
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1275
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1276
0x80000000|717, // match move
0x80000000|1379, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1277
-1, // $$start
-1, // start
750, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+204, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+204, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+204, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+204, // "u"
1411, // "p"
MIN_REDUCTION+204, // "h"
465, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
789, // "g"
MIN_REDUCTION+204, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+204, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 1278
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1279
172,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1280
90,386, // "o"
  }
,
{ // state 1281
0x80000000|327, // match move
0x80000000|178, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1282
2,1496, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1283
0x80000000|401, // match move
0x80000000|585, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1284
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1285
-1, // $$start
-1, // start
222, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+213, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+213, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+213, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+213, // "u"
1411, // "p"
MIN_REDUCTION+213, // "h"
465, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
789, // "g"
MIN_REDUCTION+213, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+213, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 1286
-1, // $$start
-1, // start
390, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+108, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+108, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+108, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+108, // "u"
1411, // "p"
MIN_REDUCTION+108, // "h"
465, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
789, // "g"
MIN_REDUCTION+108, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+108, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 1287
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1288
172,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1289
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1290
0x80000000|1528, // match move
0x80000000|1021, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1291
0x80000000|1, // match move
0x80000000|1429, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1292
0x80000000|437, // match move
0x80000000|756, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1293
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1294
0x80000000|1, // match move
0x80000000|978, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1295
0x80000000|831, // match move
0x80000000|1519, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1296
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+182, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 1297
0x80000000|1300, // match move
0x80000000|317, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1298
0x80000000|1257, // match move
0x80000000|233, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1299
172,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1300
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1301
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+215, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 1302
-1, // $$start
-1, // start
1203, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+138, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+138, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+138, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+138, // "u"
1411, // "p"
MIN_REDUCTION+138, // "h"
465, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
789, // "g"
MIN_REDUCTION+138, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+138, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 1303
0x80000000|344, // match move
0x80000000|360, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 1304
172,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1305
0x80000000|1124, // match move
0x80000000|1164, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1306
0x80000000|880, // match move
0x80000000|1080, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1307
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1308
91,757, // "l"
  }
,
{ // state 1309
2,220, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1310
172,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1311
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1312
-1, // $$start
-1, // start
202, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+180, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+180, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+180, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+180, // "u"
1411, // "p"
MIN_REDUCTION+180, // "h"
465, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
789, // "g"
MIN_REDUCTION+180, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+180, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 1313
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1314
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+209, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1315
172,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1316
0x80000000|129, // match move
0x80000000|516, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1317
0x80000000|1, // match move
0x80000000|1076, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1318
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+206, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 1319
2,507, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1320
0x80000000|502, // match move
0x80000000|844, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1321
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1322
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1323
0x80000000|62, // match move
0x80000000|1075, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1324
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1325
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1326
-1, // $$start
-1, // start
1134, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+240, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+240, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+240, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+240, // "u"
1411, // "p"
MIN_REDUCTION+240, // "h"
465, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
789, // "g"
MIN_REDUCTION+240, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+240, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 1327
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1328
172,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1329
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+107, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1330
0x80000000|1535, // match move
0x80000000|608, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1331
0x80000000|392, // match move
0x80000000|1460, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1332
0x80000000|573, // match move
0x80000000|543, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1333
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1334
0x80000000|357, // match move
0x80000000|1441, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1335
0x80000000|1067, // match move
0x80000000|1517, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1336
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1337
2,1039, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1338
-1, // $$start
-1, // start
521, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+129, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+129, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+129, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+129, // "u"
1411, // "p"
MIN_REDUCTION+129, // "h"
465, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
789, // "g"
MIN_REDUCTION+129, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+129, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
  }
,
{ // state 1339
2,597, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1340
0x80000000|1001, // match move
0x80000000|1269, // no-match move
// T-test match for 10:
162,
  }
,
{ // state 1341
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1342
172,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1343
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+131, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1344
0x80000000|886, // match move
0x80000000|877, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1345
93,713, // "a"
  }
,
{ // state 1346
92,696, // "e"
  }
,
{ // state 1347
172,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1348
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+307, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1349
105,1356, // "i"
109,1413, // "h"
  }
,
{ // state 1350
172,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1351
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1352
-1, // $$start
-1, // start
-1, // ws*
711, // $$0
454, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
-1, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
632, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1353
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1354
92,1177, // "e"
  }
,
{ // state 1355
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1356
102,395, // "t"
  }
,
{ // state 1357
2,1571, // ws*
156,1472, // ws
158,1017, // eol
165,769, // $$2
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1358
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1359
172,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1360
0x80000000|785, // match move
0x80000000|469, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1361
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1362
0x80000000|1, // match move
0x80000000|1018, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1363
172,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1364
0x80000000|606, // match move
0x80000000|923, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1365
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1366
0x80000000|1072, // match move
0x80000000|1555, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1367
0x80000000|1219, // match move
0x80000000|1377, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1368
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1369
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1370
-1, // $$start
-1, // start
1104, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
-1, // `=
-1, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
MIN_REDUCTION+285, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+285, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 1371
0x80000000|1471, // match move
0x80000000|568, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1372
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1373
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1374
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1375
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1376
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1377
0x80000000|67, // match move
0x80000000|189, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1378
172,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1379
-1, // $$start
-1, // start
1516, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+117, // "o"
1494, // "l"
837, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+117, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+117, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+117, // "u"
1411, // "p"
MIN_REDUCTION+117, // "h"
465, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
789, // "g"
MIN_REDUCTION+117, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+117, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 1380
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1381
0x80000000|245, // match move
0x80000000|1323, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1382
99,624, // "c"
  }
,
{ // state 1383
0x80000000|1361, // match move
0x80000000|803, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1384
114,402, // "z"
  }
,
{ // state 1385
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1386
92,811, // "e"
  }
,
{ // state 1387
102,819, // "t"
  }
,
{ // state 1388
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1389
0x80000000|1114, // match move
0x80000000|740, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1390
2,1571, // ws*
165,769, // $$2
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1391
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1392
0x80000000|1324, // match move
0x80000000|1010, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1393
0x80000000|1322, // match move
0x80000000|517, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1394
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1395
0x80000000|48, // match move
0x80000000|234, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1396
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1397
0x80000000|1, // match move
0x80000000|1551, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1398
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1399
172,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1400
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1401
0x80000000|547, // match move
0x80000000|422, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1402
172,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1403
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1404
2,1095, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1405
172,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1406
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1407
0x80000000|1231, // match move
0x80000000|230, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1408
0x80000000|115, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1409
0x80000000|165, // match move
0x80000000|152, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1410
2,161, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1411
93,1092, // "a"
97,90, // "r"
107,929, // "u"
  }
,
{ // state 1412
0x80000000|1135, // match move
0x80000000|1443, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1413
105,460, // "i"
  }
,
{ // state 1414
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1415
104,414, // "f"
  }
,
{ // state 1416
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+258, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 1417
0x80000000|1009, // match move
0x80000000|794, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1418
90,24, // "o"
97,227, // "r"
111,232, // "y"
  }
,
{ // state 1419
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+167, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1420
2,481, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1421
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1422
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1423
100,455, // "s"
  }
,
{ // state 1424
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1425
0x80000000|621, // match move
0x80000000|995, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1426
2,286, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1427
0x80000000|1552, // match move
0x80000000|918, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1428
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1429
0x80000000|1545, // match move
0x80000000|860, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1430
172,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1431
94,1005, // "n"
104,1526, // "f"
112,1166, // "m"
  }
,
{ // state 1432
93,1456, // "a"
97,755, // "r"
109,648, // "h"
  }
,
{ // state 1433
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1434
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1435
172,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1436
0x80000000|599, // match move
0x80000000|439, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1437
0x80000000|432, // match move
0x80000000|1283, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1438
0x80000000|1071, // match move
0x80000000|773, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1439
0x80000000|925, // match move
0x80000000|1277, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1440
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1441
0x80000000|456, // match move
0x80000000|352, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1442
172,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1443
0x80000000|780, // match move
0x80000000|71, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1444
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1445
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+268, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1446
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1447
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1448
0x80000000|960, // match move
0x80000000|509, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1449
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1450
0x80000000|795, // match move
0x80000000|566, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1451
90,705, // "o"
  }
,
{ // state 1452
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1453
89,198, // "b"
90,198, // "o"
91,198, // "l"
92,198, // "e"
93,198, // "a"
94,198, // "n"
97,198, // "r"
98,198, // "k"
99,198, // "c"
100,198, // "s"
101,198, // "x"
102,198, // "t"
103,198, // "d"
104,198, // "f"
105,198, // "i"
106,198, // "w"
107,198, // "u"
108,198, // "p"
109,198, // "h"
110,198, // "v"
111,198, // "y"
112,198, // "m"
113,198, // "g"
114,198, // "z"
115,198, // "!"
116,198, // "="
117,198, // "%"
118,198, // "&"
119,198, // "("
120,198, // ")"
121,198, // "*"
122,198, // "/"
123,198, // "+"
124,198, // ","
125,198, // "-"
126,198, // "."
127,198, // ":"
128,198, // ";"
129,198, // "<"
130,198, // ">"
131,198, // "["
132,198, // "]"
133,198, // "{"
134,198, // "}"
135,198, // "|"
136,198, // "0"
137,198, // {"1".."9"}
138,198, // "X"
143,198, // "'"
144,198, // "\"
145,1191, // printable
146,198, // '"'
147,86, // stringWord
149,1572, // stringChar
151,198, // "_"
152,198, // {"A".."W" "Y".."Z" "j" "q"}
153,198, // " "
154,198, // {"#".."$" "?".."@" "^" "`" "~"}
155,1550, // stringChar**
168,854, // stringChar*
  }
,
{ // state 1454
0x80000000|1054, // match move
0x80000000|707, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1455
2,529, // ws*
153,871, // " "
156,1472, // ws
157,871, // {9}
158,1017, // eol
162,1525, // {10}
163,1340, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1456
102,100, // "t"
  }
,
{ // state 1457
-1, // $$start
-1, // start
987, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+287, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+287, // $
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
{ // state 1458
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+140, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 1459
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1460
0x80000000|725, // match move
0x80000000|120, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1461
0x80000000|1041, // match move
0x80000000|1548, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1462
-1, // $$start
-1, // start
1571, // ws*
-1, // $$0
MIN_REDUCTION+339, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+339, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+339, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+339, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+339, // "u"
1411, // "p"
MIN_REDUCTION+339, // "h"
465, // "v"
MIN_REDUCTION+339, // "y"
MIN_REDUCTION+339, // "m"
789, // "g"
MIN_REDUCTION+339, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+339, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+339, // {"1".."9"}
MIN_REDUCTION+339, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+339, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
957, // idChar**
496, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
1242, // idChar*
MIN_REDUCTION+339, // $
-1, // $NT
  }
,
{ // state 1463
172,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1464
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1465
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1466
172,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1467
0x80000000|985, // match move
0x80000000|802, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1468
-1, // $$start
-1, // start
1496, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+186, // "o"
617, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+186, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+186, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+186, // "u"
1411, // "p"
MIN_REDUCTION+186, // "h"
465, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
789, // "g"
MIN_REDUCTION+186, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+186, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 1469
0x80000000|763, // match move
0x80000000|78, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1470
172,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1471
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1472
172,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1473
103,904, // "d"
  }
,
{ // state 1474
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1475
89,1069, // "b"
90,1069, // "o"
91,1069, // "l"
92,1069, // "e"
93,1069, // "a"
94,1069, // "n"
97,1069, // "r"
98,1069, // "k"
99,1069, // "c"
100,1069, // "s"
101,1069, // "x"
102,1069, // "t"
103,1069, // "d"
104,1069, // "f"
105,1069, // "i"
106,1069, // "w"
107,1069, // "u"
108,1069, // "p"
109,1069, // "h"
110,1069, // "v"
111,1069, // "y"
112,1069, // "m"
113,1069, // "g"
114,1069, // "z"
136,205, // "0"
137,205, // {"1".."9"}
138,1069, // "X"
142,361, // digit
150,1304, // letter
151,1187, // "_"
152,1069, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1476
0x80000000|1, // match move
0x80000000|1566, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1477
0x80000000|1255, // match move
0x80000000|1538, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1478
0x80000000|1, // match move
0x80000000|1439, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1479
0x80000000|864, // match move
0x80000000|259, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1480
0x80000000|1428, // match move
0x80000000|1298, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1481
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+288, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1482
172,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1483
102,1527, // "t"
106,759, // "w"
107,124, // "u"
109,1280, // "h"
111,1057, // "y"
  }
,
{ // state 1484
0x80000000|1007, // match move
0x80000000|1188, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1485
2,507, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1486
102,656, // "t"
  }
,
{ // state 1487
2,202, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1488
0x80000000|1, // match move
0x80000000|1455, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1489
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1490
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1491
-1, // $$start
-1, // start
1039, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+147, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+147, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+147, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+147, // "u"
1411, // "p"
MIN_REDUCTION+147, // "h"
465, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
789, // "g"
MIN_REDUCTION+147, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+147, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 1492
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1493
0x80000000|1, // match move
0x80000000|1576, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1494
90,176, // "o"
  }
,
{ // state 1495
92,732, // "e"
  }
,
{ // state 1496
0x80000000|719, // match move
0x80000000|539, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1497
0x80000000|1109, // match move
0x80000000|1290, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1498
0x80000000|370, // match move
0x80000000|1204, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1499
2,286, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1500
172,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1501
172,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1502
97,446, // "r"
109,648, // "h"
  }
,
{ // state 1503
0x80000000|1499, // match move
0x80000000|1026, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1504
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1505
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+179, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 1506
172,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1507
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1508
100,590, // "s"
  }
,
{ // state 1509
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1510
2,381, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1511
0x80000000|500, // match move
0x80000000|290, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1512
0x80000000|630, // match move
0x80000000|1348, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1513
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1514
172,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1515
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1516
0x80000000|778, // match move
0x80000000|250, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1517
0x80000000|1288, // match move
0x80000000|596, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1518
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1519
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+143, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 1520
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1521
-1, // $$start
-1, // start
28, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+207, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+207, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+207, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+207, // "u"
1411, // "p"
MIN_REDUCTION+207, // "h"
465, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
789, // "g"
MIN_REDUCTION+207, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+207, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 1522
172,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1523
92,479, // "e"
93,533, // "a"
107,1308, // "u"
  }
,
{ // state 1524
93,626, // "a"
  }
,
{ // state 1525
172,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1526
0x80000000|1, // match move
0x80000000|1469, // no-match move
0x80000000|1475, // NT-test-match state for idChar
  }
,
{ // state 1527
93,1456, // "a"
97,1264, // "r"
  }
,
{ // state 1528
2,786, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1529
172,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1530
0x80000000|1531, // match move
0x80000000|1031, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1531
2,1250, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1532
0x80000000|1274, // match move
0x80000000|1088, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1533
2,412, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1534
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1535
172,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1536
94,613, // "n"
  }
,
{ // state 1537
91,530, // "l"
  }
,
{ // state 1538
-1, // $$start
-1, // start
545, // ws*
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+265, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1539
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1540
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1541
2,1259, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1542
97,177, // "r"
  }
,
{ // state 1543
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1544
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+309, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 1545
2,938, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1546
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1547
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1548
0x80000000|491, // match move
0x80000000|121, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1549
0x80000000|788, // match move
0x80000000|584, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1550
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1551
0x80000000|874, // match move
0x80000000|1302, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1552
121,74, // "*"
158,9, // eol
161,1375, // commentContent
  }
,
{ // state 1553
0x80000000|1373, // match move
0x80000000|1199, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1554
3,711, // $$0
4,454, // token
58,615, // `!
59,652, // `!=
60,1218, // `%
61,1100, // `&&
63,1126, // `(
64,1355, // `)
65,610, // `{
66,700, // `}
67,641, // `-
68,12, // `+
69,505, // `=
70,1313, // `==
71,130, // `[
72,605, // `]
73,620, // `||
74,475, // `<
75,99, // `<=
76,772, // `,
77,1253, // `>
78,841, // `>=
79,114, // `.
80,885, // `;
81,691, // `++
82,1336, // `--
83,909, // `/
84,563, // `:
85,379, // ID
86,1045, // INTLIT
87,137, // STRINGLIT
88,1465, // CHARLIT
136,1450, // "0"
150,664, // letter
156,1202, // ws
158,1017, // eol
166,632, // token*
  }
,
{ // state 1555
0x80000000|660, // match move
0x80000000|1445, // no-match move
0x80000000|472, // NT-test-match state for reserved
  }
,
{ // state 1556
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1557
0x80000000|1055, // match move
0x80000000|1338, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1558
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
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
379, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
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
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+304, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
315, // "0"
315, // {"1".."9"}
105, // "X"
1013, // intLit2
-1, // `x
1325, // digit++
804, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
664, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1202, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 1559
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1560
2,1250, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1561
-1, // $$start
-1, // start
328, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
889, // `boolean
1170, // `class
891, // `extends
4, // `void
194, // `int
979, // `while
1464, // `if
1267, // `else
1086, // `for
333, // `break
163, // `this
132, // `false
1353, // `true
1333, // `super
38, // `null
82, // `return
619, // `instanceof
1513, // `new
595, // `abstract
1447, // `assert
1176, // `byte
295, // `case
1180, // `catch
1022, // `char
288, // `const
1122, // `continue
1110, // `default
1424, // `do
125, // `double
43, // `enum
468, // `final
1369, // `finally
458, // `float
142, // `goto
1509, // `implements
810, // `import
961, // `interface
1062, // `long
1396, // `native
1452, // `package
1374, // `private
417, // `protected
579, // `public
1546, // `short
495, // `static
631, // `strictfp
80, // `switch
253, // `synchronized
1094, // `throw
1212, // `throws
209, // `transient
405, // `try
538, // `volatile
615, // `!
652, // `!=
1218, // `%
1100, // `&&
-1, // `*
1126, // `(
1355, // `)
610, // `{
700, // `}
641, // `-
12, // `+
505, // `=
1313, // `==
130, // `[
605, // `]
620, // `||
475, // `<
99, // `<=
772, // `,
1253, // `>
841, // `>=
114, // `.
885, // `;
691, // `++
1336, // `--
909, // `/
563, // `:
-1, // ID
1045, // INTLIT
137, // STRINGLIT
1465, // CHARLIT
1418, // "b"
MIN_REDUCTION+159, // "o"
1494, // "l"
1027, // "e"
1575, // "a"
1523, // "n"
-1, // idChar
-1, // reserved
989, // "r"
MIN_REDUCTION+159, // "k"
506, // "c"
1483, // "s"
MIN_REDUCTION+159, // "x"
1502, // "t"
389, // "d"
216, // "f"
1431, // "i"
40, // "w"
MIN_REDUCTION+159, // "u"
1411, // "p"
MIN_REDUCTION+159, // "h"
465, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
789, // "g"
MIN_REDUCTION+159, // "z"
583, // "!"
1198, // "="
61, // "%"
248, // "&"
102, // "("
724, // ")"
MIN_REDUCTION+159, // "*"
697, // "/"
1083, // "+"
651, // ","
1437, // "-"
190, // "."
1211, // ":"
1186, // ";"
1425, // "<"
611, // ">"
1461, // "["
1574, // "]"
200, // "{"
81, // "}"
688, // "|"
1450, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
690, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
871, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // stringChar**
1472, // ws
871, // {9}
1017, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1525, // {10}
1340, // {13}
-1, // idChar**
-1, // $$2
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 1562
0x80000000|146, // match move
0x80000000|956, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1563
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1564
89,257, // "b"
90,257, // "o"
91,257, // "l"
92,257, // "e"
93,257, // "a"
94,257, // "n"
97,257, // "r"
98,257, // "k"
99,257, // "c"
100,257, // "s"
101,257, // "x"
102,257, // "t"
103,257, // "d"
104,257, // "f"
105,257, // "i"
106,257, // "w"
107,257, // "u"
108,257, // "p"
109,257, // "h"
110,257, // "v"
111,257, // "y"
112,257, // "m"
113,257, // "g"
114,257, // "z"
115,257, // "!"
116,257, // "="
117,257, // "%"
118,257, // "&"
119,257, // "("
120,257, // ")"
121,257, // "*"
122,257, // "/"
123,257, // "+"
124,257, // ","
125,257, // "-"
126,257, // "."
127,257, // ":"
128,257, // ";"
129,257, // "<"
130,257, // ">"
131,257, // "["
132,257, // "]"
133,257, // "{"
134,257, // "}"
135,257, // "|"
136,257, // "0"
137,257, // {"1".."9"}
138,257, // "X"
143,257, // "'"
144,257, // "\"
145,1091, // printable
146,257, // '"'
151,257, // "_"
152,257, // {"A".."W" "Y".."Z" "j" "q"}
153,257, // " "
154,257, // {"#".."$" "?".."@" "^" "`" "~"}
159,1113, // printable**
167,330, // printable*
  }
,
{ // state 1565
3,711, // $$0
4,454, // token
5,889, // `boolean
6,1170, // `class
7,891, // `extends
8,4, // `void
9,194, // `int
10,979, // `while
11,1464, // `if
12,1267, // `else
13,1086, // `for
14,333, // `break
15,163, // `this
16,132, // `false
17,1353, // `true
18,1333, // `super
19,38, // `null
20,82, // `return
21,619, // `instanceof
22,1513, // `new
23,595, // `abstract
24,1447, // `assert
25,1176, // `byte
26,295, // `case
27,1180, // `catch
28,1022, // `char
29,288, // `const
30,1122, // `continue
31,1110, // `default
32,1424, // `do
33,125, // `double
34,43, // `enum
35,468, // `final
36,1369, // `finally
37,458, // `float
38,142, // `goto
39,1509, // `implements
40,810, // `import
41,961, // `interface
42,1062, // `long
43,1396, // `native
44,1452, // `package
45,1374, // `private
46,417, // `protected
47,579, // `public
48,1546, // `short
49,495, // `static
50,631, // `strictfp
51,80, // `switch
52,253, // `synchronized
53,1094, // `throw
54,1212, // `throws
55,209, // `transient
56,405, // `try
57,538, // `volatile
166,632, // token*
  }
,
{ // state 1566
0x80000000|552, // match move
0x80000000|1101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1567
0x80000000|675, // match move
0x80000000|416, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1568
2,286, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1569
0x80000000|1446, // match move
0x80000000|1168, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1570
2,704, // ws*
156,1472, // ws
158,1017, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1571
0x80000000|668, // match move
0x80000000|1139, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1572
0x80000000|655, // match move
0x80000000|275, // no-match move
0x80000000|625, // NT-test-match state for stringChar
  }
,
{ // state 1573
156,1202, // ws
158,1017, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1574
0x80000000|1023, // match move
0x80000000|1497, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1575
89,1423, // "b"
100,355, // "s"
  }
,
{ // state 1576
0x80000000|745, // match move
0x80000000|242, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1577][];
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
// stringChar ::= !{'"' "/"} printable
(149<<16)+1,
// stringWord ::= stringChar**
(147<<16)+1,
// ws ::= {9 " "}
(156<<16)+1,
// ws ::= eol
(156<<16)+1,
// ws ::= "/" "/" printable** eol
(156<<16)+4,
// ws ::= "/" "/" !printable eol
(156<<16)+3,
// ws ::= "/" "*" commentContent* "*" "/"
(156<<16)+5,
// ws ::= "/" "*" "*" "/"
(156<<16)+4,
// commentContent ::= "*" !"/"
(161<<16)+1,
// commentContent ::= !"*" printable
(161<<16)+1,
// commentContent ::= eol
(161<<16)+1,
// eol ::= {10}
(158<<16)+1,
// eol ::= {13} {10}
(158<<16)+2,
// eol ::= {13} !10
(158<<16)+1,
// ID ::= !reserved letter idChar** $$2
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$2
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// token* ::= token* token
(166<<16)+2,
// token* ::= token
(166<<16)+1,
// printable** ::= printable* !printable
(159<<16)+1,
// stringChar** ::= stringChar* !stringChar
(155<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// commentContent* ::= commentContent* commentContent
(160<<16)+2,
// commentContent* ::= commentContent
(160<<16)+1,
// idChar** ::= idChar* !idChar
(164<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(169<<16)+1,
// digit+ ::= digit+ digit
(169<<16)+2,
// printable* ::= printable* printable
(167<<16)+2,
// printable* ::= printable
(167<<16)+1,
// stringChar* ::= stringChar* stringChar
(168<<16)+2,
// stringChar* ::= stringChar
(168<<16)+1,
// idChar* ::= idChar* idChar
(170<<16)+2,
// idChar* ::= idChar
(170<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= '"' ws*
(148<<16)+2,
// $$1 ::= '"'
(148<<16)+1,
// $$2 ::= ws*
(165<<16)+1,
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
157, // 9
162, // 10
-1, // 11
-1, // 12
163, // 13
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
"stringChar ::= !{\'\"\' \"/\"} printable", // 322
"stringWord ::= stringChar**", // 323
"ws ::= {9 \" \"}", // 324
"ws ::= eol", // 325
"ws ::= \"/\" \"/\" printable** eol", // 326
"ws ::= \"/\" \"/\" printable** eol", // 327
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 328
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 329
"commentContent ::= \"*\" !\"/\"", // 330
"commentContent ::= !\"*\" printable", // 331
"commentContent ::= eol", // 332
"eol ::= {10} registerNewline", // 333
"eol ::= {13} {10} registerNewline", // 334
"eol ::= {13} !10 registerNewline", // 335
"ID ::= !reserved letter idChar** ws*", // 336
"ID ::= !reserved letter idChar** ws*", // 337
"ID ::= !reserved letter idChar** ws*", // 338
"ID ::= !reserved letter idChar** ws*", // 339
"token* ::= token* token", // 340
"token* ::= token* token", // 341
"printable** ::= printable* !printable", // 342
"stringChar** ::= stringChar* !stringChar", // 343
"digit++ ::= digit+ !digit", // 344
"commentContent* ::= commentContent* commentContent", // 345
"commentContent* ::= commentContent* commentContent", // 346
"idChar** ::= idChar* !idChar", // 347
"ws* ::= ws* ws", // 348
"ws* ::= ws* ws", // 349
"digit+ ::= digit", // 350
"digit+ ::= digit+ digit", // 351
"printable* ::= printable* printable", // 352
"printable* ::= printable* printable", // 353
"stringChar* ::= stringChar* stringChar", // 354
"stringChar* ::= stringChar* stringChar", // 355
"idChar* ::= idChar* idChar", // 356
"idChar* ::= idChar* idChar", // 357
"", // 358
"", // 359
"", // 360
"", // 361
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} [ws*] @zero(int,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: INTLIT ::= [#] "0" `x digit++ [ws*] @convertHexToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: INTLIT ::= [#] "0" digit++ ws* @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: INTLIT ::= [#] "0" digit++ [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 314: CHARLIT ::= [#] "'" !{"'" "\"} printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 315: STRINGLIT ::= [#] '"' stringWord $$1 @charsToStringLiteral(int,char,String,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 316: STRINGLIT ::= [#] '"' !stringChar [stringWord] $$1 @charsToStringLiteral(int,char,String,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
    { // 322: stringChar ::= !{'"' "/"} printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 323: stringWord ::= stringChar** @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 324: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 325: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 326: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 327: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 328: ws ::= "/" "*" commentContent* "*" "/" @void
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
    { // 329: ws ::= "/" "*" [commentContent*] "*" "/" @void
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
    { // 330: commentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 331: commentContent ::= !"*" printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 332: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 333: eol ::= {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 334: eol ::= {13} {10} [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 335: eol ::= {13} !10 [registerNewline] @void
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 336: ID ::= !reserved letter idChar** $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 337: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 338: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 339: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 340: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 341: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 342: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: stringChar** ::= stringChar* !stringChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 344: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 347: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 350: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 351: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 352: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 356: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 357: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 358: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 359: $$1 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 360: $$1 ::= '"' [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 361: $$2 ::= ws* @pass
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
    { // commentContent*
    },
    { // start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // ws*
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringWord
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // stringChar**
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // $$start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((12<<5)|0x6)/*nullProductionAction:12*/,
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
