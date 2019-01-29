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
public int getEofSym() { return 176; }
public int getNttSym() { return 177; }
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
"\"/\"",
"\"*\"",
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
"escapeSlash",
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
public int numSymbols() { return 178;}
private static final int MIN_REDUCTION = 1659;
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
0x80000000|969, // match move
0x80000000|1089, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1
  }
,
{ // state 2
-1, // $$start
-1, // start
157, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+144, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+144, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+144, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+144, // "u"
1487, // "p"
MIN_REDUCTION+144, // "h"
496, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
830, // "g"
MIN_REDUCTION+144, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+144, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+203, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|1172, // match move
0x80000000|1540, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 6
2,1038, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 7
0x80000000|560, // match move
0x80000000|1450, // no-match move
0x80000000|842, // NT-test-match state for digit
  }
,
{ // state 8
2,1206, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 9
177,MIN_REDUCTION+347, // $NT
  }
,
{ // state 10
89,1402, // "b"
90,1402, // "o"
91,1402, // "l"
92,1402, // "e"
93,1402, // "a"
94,1402, // "n"
97,1402, // "r"
98,1402, // "k"
99,1402, // "c"
100,1402, // "s"
101,1402, // "x"
102,1402, // "t"
103,1402, // "d"
104,1402, // "f"
105,1402, // "i"
106,1402, // "w"
107,1402, // "u"
108,1402, // "p"
109,1402, // "h"
110,1402, // "v"
111,1402, // "y"
112,1402, // "m"
113,1402, // "g"
114,1402, // "z"
115,1402, // "!"
116,1402, // "="
117,1402, // "%"
118,1402, // "&"
119,1402, // "("
120,1402, // ")"
121,1402, // "/"
122,1402, // "*"
123,1402, // "+"
124,1402, // ","
125,1402, // "-"
126,1402, // "."
127,1402, // ":"
128,1402, // ";"
129,1402, // "<"
130,1402, // ">"
131,1402, // "["
132,1402, // "]"
133,1402, // "{"
134,1402, // "}"
135,1402, // "|"
136,1402, // "0"
137,1402, // {"1".."9"}
138,1402, // "X"
143,1402, // "'"
144,1402, // "\"
145,173, // printable
146,1402, // '"'
151,1402, // "_"
152,1402, // {"A".."W" "Y".."Z" "j" "q"}
153,1402, // " "
154,1402, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 11
109,1571, // "h"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 14
0x80000000|1007, // match move
0x80000000|1390, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 15
-1, // $$start
-1, // start
1470, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+228, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+228, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+228, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+228, // "u"
1487, // "p"
MIN_REDUCTION+228, // "h"
496, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
830, // "g"
MIN_REDUCTION+228, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+228, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|804, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 17
177,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 18
100,1053, // "s"
  }
,
{ // state 19
177,MIN_REDUCTION+145, // $NT
  }
,
{ // state 20
2,1368, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 21
123,694, // "+"
  }
,
{ // state 22
2,352, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 23
105,1620, // "i"
  }
,
{ // state 24
90,991, // "o"
  }
,
{ // state 25
0x80000000|46, // match move
0x80000000|807, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 26
0x80000000|1291, // match move
0x80000000|1045, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 27
177,MIN_REDUCTION+136, // $NT
  }
,
{ // state 28
0x80000000|1552, // match move
0x80000000|1138, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 29
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 30
159,1264, // ws
161,1069, // eol
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+197, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|1365, // match move
0x80000000|1220, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 33
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 34
2,1408, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 35
0x80000000|114, // match move
0x80000000|1366, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 36
100,311, // "s"
102,716, // "t"
  }
,
{ // state 37
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 38
2,1652, // ws*
158,810, // $$2
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 39
109,1489, // "h"
  }
,
{ // state 40
105,1459, // "i"
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+116, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 44
2,1001, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 45
102,800, // "t"
  }
,
{ // state 46
2,1024, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 47
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 48
102,610, // "t"
  }
,
{ // state 49
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 51
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 53
0x80000000|333, // match move
0x80000000|681, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 54
0x80000000|171, // match move
0x80000000|347, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 55
0x80000000|1152, // match move
0x80000000|571, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 56
0x80000000|1381, // match move
0x80000000|151, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 57
177,MIN_REDUCTION+229, // $NT
  }
,
{ // state 58
0x80000000|1521, // match move
0x80000000|225, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 59
-1, // $$start
-1, // start
1135, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+201, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+201, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+201, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+201, // "u"
1487, // "p"
MIN_REDUCTION+201, // "h"
496, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
830, // "g"
MIN_REDUCTION+201, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+201, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+119, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|270, // match move
0x80000000|205, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 62
177,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 63
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 64
100,212, // "s"
  }
,
{ // state 65
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|133, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 67
102,1493, // "t"
  }
,
{ // state 68
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 69
177,MIN_REDUCTION+208, // $NT
  }
,
{ // state 70
0x80000000|6, // match move
0x80000000|1535, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 71
91,1276, // "l"
105,1551, // "i"
  }
,
{ // state 72
0x80000000|885, // match move
0x80000000|1601, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 73
0x80000000|1434, // match move
0x80000000|867, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 74
-1, // $$start
-1, // start
1149, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+251, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
0x80000000|1609, // match move
0x80000000|823, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 76
4,223, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
  }
,
{ // state 77
-1, // $$start
-1, // start
570, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+111, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+111, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+111, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+111, // "u"
1487, // "p"
MIN_REDUCTION+111, // "h"
496, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
830, // "g"
MIN_REDUCTION+111, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+111, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
2,803, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 79
0x80000000|1563, // match move
0x80000000|921, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 80
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 82
0x80000000|1227, // match move
0x80000000|1464, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 83
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+372, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+372, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+372, // $
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+221, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
146,400, // '"'
148,966, // $$1
  }
,
{ // state 86
177,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 87
0x80000000|372, // match move
0x80000000|1287, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 88
92,1140, // "e"
  }
,
{ // state 89
177,MIN_REDUCTION+205, // $NT
  }
,
{ // state 90
90,996, // "o"
105,457, // "i"
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
177,MIN_REDUCTION+223, // $NT
  }
,
{ // state 94
177,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 95
94,929, // "n"
  }
,
{ // state 96
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 97
2,1377, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 98
0x80000000|1411, // match move
0x80000000|1569, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 99
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 101
105,1153, // "i"
  }
,
{ // state 102
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 103
0x80000000|148, // match move
0x80000000|320, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 104
90,301, // "o"
  }
,
{ // state 105
94,1137, // "n"
  }
,
{ // state 106
0x80000000|906, // match move
0x80000000|976, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 107
2,636, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 108
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 109
0x80000000|1331, // match move
0x80000000|1014, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 110
-1, // $$start
-1, // start
58, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+135, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+135, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+135, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+135, // "u"
1487, // "p"
MIN_REDUCTION+135, // "h"
496, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
830, // "g"
MIN_REDUCTION+135, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+135, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 111
93,625, // "a"
  }
,
{ // state 112
177,MIN_REDUCTION+326, // $NT
  }
,
{ // state 113
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 114
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 115
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+158, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 116
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 118
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 119
99,901, // "c"
  }
,
{ // state 120
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+254, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 121
93,1028, // "a"
  }
,
{ // state 122
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 123
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+239, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 124
0x80000000|259, // match move
0x80000000|793, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 125
121,553, // "/"
164,1132, // commentContent
165,1634, // nestedCommentStart
  }
,
{ // state 126
100,1472, // "s"
  }
,
{ // state 127
0x80000000|738, // match move
0x80000000|177, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 128
108,909, // "p"
  }
,
{ // state 129
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 131
-1, // $$start
476, // start
32, // ws*
1110, // $$0
485, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
-1, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
666, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 132
0x80000000|554, // match move
0x80000000|882, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 133
0x80000000|931, // match move
0x80000000|940, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 134
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 136
177,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 140
0x80000000|413, // match move
0x80000000|673, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 141
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 142
2,1254, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 144
0x80000000|1197, // match move
0x80000000|479, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 145
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 146
0x80000000|790, // match move
0x80000000|1250, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 147
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 148
2,1418, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 150
0x80000000|1541, // match move
0x80000000|961, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 151
0x80000000|1279, // match move
0x80000000|197, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 152
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 153
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 154
98,1604, // "k"
  }
,
{ // state 155
2,864, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 156
2,995, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 157
0x80000000|817, // match move
0x80000000|35, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 158
0x80000000|998, // match move
0x80000000|1277, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 159
1,476, // start
2,32, // ws*
3,1110, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
89,1497, // "b"
91,1573, // "l"
92,1079, // "e"
93,1656, // "a"
94,1603, // "n"
97,1040, // "r"
99,539, // "c"
100,1561, // "s"
102,1582, // "t"
103,416, // "d"
104,230, // "f"
105,1509, // "i"
106,39, // "w"
108,1487, // "p"
110,496, // "v"
113,830, // "g"
170,666, // token*
176,MIN_REDUCTION+1, // $
  }
,
{ // state 160
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+95, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 161
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 162
0x80000000|1317, // match move
0x80000000|967, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 163
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 164
0x80000000|1242, // match move
0x80000000|1131, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 165
0x80000000|1103, // match move
0x80000000|975, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 166
0x80000000|345, // match move
0x80000000|545, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 167
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 168
177,MIN_REDUCTION+330, // $NT
  }
,
{ // state 169
-1, // $$start
-1, // start
1001, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+255, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 170
0x80000000|837, // match move
0x80000000|1484, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 171
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 173
143,271, // "'"
  }
,
{ // state 174
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 175
177,MIN_REDUCTION+322, // $NT
  }
,
{ // state 176
0x80000000|1088, // match move
0x80000000|802, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 177
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+222, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+222, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+222, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+222, // "u"
1487, // "p"
MIN_REDUCTION+222, // "h"
496, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
830, // "g"
MIN_REDUCTION+222, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+222, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 178
177,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 179
0x80000000|22, // match move
0x80000000|1644, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 180
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 181
2,1334, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 182
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 183
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+300, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 184
-1, // $$start
-1, // start
1334, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+301, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 185
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 186
94,859, // "n"
  }
,
{ // state 187
94,879, // "n"
  }
,
{ // state 188
-1, // $$start
-1, // start
708, // ws*
-1, // $$0
MIN_REDUCTION+373, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+373, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+373, // $
-1, // $NT
  }
,
{ // state 189
177,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 190
0x80000000|769, // match move
0x80000000|31, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 191
177,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 192
0x80000000|181, // match move
0x80000000|349, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 193
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 194
177,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 195
177,MIN_REDUCTION+181, // $NT
  }
,
{ // state 196
2,968, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 197
0x80000000|672, // match move
0x80000000|391, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 198
0x80000000|957, // match move
0x80000000|1281, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 199
0x80000000|194, // match move
0x80000000|1417, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 200
0x80000000|875, // match move
0x80000000|999, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 201
0x80000000|715, // match move
0x80000000|1300, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 202
0x80000000|1162, // match move
0x80000000|876, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 203
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 204
0x80000000|1400, // match move
0x80000000|1581, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 205
0x80000000|1307, // match move
0x80000000|1632, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 206
0x80000000|1205, // match move
0x80000000|530, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 207
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 208
0x80000000|1219, // match move
0x80000000|923, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 209
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 210
0x80000000|235, // match move
0x80000000|1428, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 211
0x80000000|1626, // match move
0x80000000|1622, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 213
0x80000000|866, // match move
0x80000000|1029, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 214
0x80000000|832, // match move
0x80000000|1059, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 215
0x80000000|520, // match move
0x80000000|919, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 216
177,MIN_REDUCTION+187, // $NT
  }
,
{ // state 217
177,MIN_REDUCTION+163, // $NT
  }
,
{ // state 218
177,MIN_REDUCTION+312, // $NT
  }
,
{ // state 219
0x80000000|1415, // match move
0x80000000|602, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 220
0x80000000|1310, // match move
0x80000000|1067, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 221
98,886, // "k"
  }
,
{ // state 222
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 224
-1, // $$start
-1, // start
1377, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+153, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+153, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+153, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+153, // "u"
1487, // "p"
MIN_REDUCTION+153, // "h"
496, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
830, // "g"
MIN_REDUCTION+153, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+153, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 225
0x80000000|152, // match move
0x80000000|316, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 226
110,821, // "v"
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 228
102,711, // "t"
  }
,
{ // state 229
0x80000000|1148, // match move
0x80000000|1305, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 230
90,1129, // "o"
91,256, // "l"
93,637, // "a"
105,1150, // "i"
  }
,
{ // state 231
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 232
0x80000000|1, // match move
0x80000000|266, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 233
102,840, // "t"
  }
,
{ // state 234
0x80000000|1501, // match move
0x80000000|851, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 235
3,750, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
89,1497, // "b"
91,1573, // "l"
92,1079, // "e"
93,1656, // "a"
94,1603, // "n"
97,1040, // "r"
99,539, // "c"
100,1561, // "s"
102,1582, // "t"
103,416, // "d"
104,230, // "f"
105,1509, // "i"
106,39, // "w"
108,1487, // "p"
110,496, // "v"
113,830, // "g"
170,666, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 236
0x80000000|606, // match move
0x80000000|896, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 237
2,989, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 238
0x80000000|599, // match move
0x80000000|871, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 239
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 240
177,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 241
92,1208, // "e"
  }
,
{ // state 242
0x80000000|1252, // match move
0x80000000|613, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 243
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 244
0x80000000|979, // match move
0x80000000|507, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 245
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 246
102,841, // "t"
  }
,
{ // state 247
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+98, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 248
0x80000000|819, // match move
0x80000000|525, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 249
-1, // $$start
-1, // start
633, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
-1, // `=
-1, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
MIN_REDUCTION+289, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+289, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 250
177,MIN_REDUCTION+199, // $NT
  }
,
{ // state 251
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 252
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+230, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 253
89,1402, // "b"
90,1402, // "o"
91,1402, // "l"
92,1402, // "e"
93,1402, // "a"
94,1402, // "n"
97,1402, // "r"
98,1402, // "k"
99,1402, // "c"
100,1402, // "s"
101,1402, // "x"
102,1402, // "t"
103,1402, // "d"
104,1402, // "f"
105,1402, // "i"
106,1402, // "w"
107,1402, // "u"
108,1402, // "p"
109,1402, // "h"
110,1402, // "v"
111,1402, // "y"
112,1402, // "m"
113,1402, // "g"
114,1402, // "z"
115,1402, // "!"
116,1402, // "="
117,1402, // "%"
118,1402, // "&"
119,1402, // "("
120,1402, // ")"
121,1402, // "/"
122,1402, // "*"
123,1402, // "+"
124,1402, // ","
125,1402, // "-"
126,1402, // "."
127,1402, // ":"
128,1402, // ";"
129,1402, // "<"
130,1402, // ">"
131,1402, // "["
132,1402, // "]"
133,1402, // "{"
134,1402, // "}"
135,1402, // "|"
136,1402, // "0"
137,1402, // {"1".."9"}
138,1402, // "X"
143,1402, // "'"
144,1402, // "\"
145,813, // printable
146,1402, // '"'
151,1402, // "_"
152,1402, // {"A".."W" "Y".."Z" "j" "q"}
153,1402, // " "
154,1402, // {"#".."$" "?".."@" "^" "`" "~"}
161,9, // eol
168,1605, // {10}
169,1414, // {13}
  }
,
{ // state 254
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 255
2,1135, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 256
90,427, // "o"
  }
,
{ // state 257
-1, // $$start
-1, // start
1636, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+162, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+162, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+162, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+162, // "u"
1487, // "p"
MIN_REDUCTION+162, // "h"
496, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
830, // "g"
MIN_REDUCTION+162, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+162, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 258
2,864, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 259
2,855, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 260
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 261
-1, // $$start
-1, // start
1442, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+132, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+132, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+132, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+132, // "u"
1487, // "p"
MIN_REDUCTION+132, // "h"
496, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
830, // "g"
MIN_REDUCTION+132, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+132, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 262
0x80000000|444, // match move
0x80000000|337, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 263
118,573, // "&"
  }
,
{ // state 264
2,1470, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 265
0x80000000|982, // match move
0x80000000|1077, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 266
0x80000000|403, // match move
0x80000000|1357, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 267
-1, // $$start
-1, // start
441, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+141, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+141, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+141, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+141, // "u"
1487, // "p"
MIN_REDUCTION+141, // "h"
496, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
830, // "g"
MIN_REDUCTION+141, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+141, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 268
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 269
0x80000000|1499, // match move
0x80000000|166, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 270
2,547, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 271
0x80000000|107, // match move
0x80000000|368, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 272
0x80000000|516, // match move
0x80000000|1476, // no-match move
0x80000000|396, // NT-test-match state for printable
  }
,
{ // state 273
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 274
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+200, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 275
0x80000000|329, // match move
0x80000000|773, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 276
177,MIN_REDUCTION+344, // $NT
  }
,
{ // state 277
177,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 278
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|518, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 280
2,1334, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 281
107,493, // "u"
  }
,
{ // state 282
144,99, // "\"
155,1422, // escapeSlash
  }
,
{ // state 283
0x80000000|1465, // match move
0x80000000|990, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 284
2,1159, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 287
0x80000000|1455, // match move
0x80000000|1256, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 288
0x80000000|482, // match move
0x80000000|261, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 289
0x80000000|467, // match move
0x80000000|1641, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 290
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 291
-1, // $$start
-1, // start
1368, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+123, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+123, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+123, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+123, // "u"
1487, // "p"
MIN_REDUCTION+123, // "h"
496, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
830, // "g"
MIN_REDUCTION+123, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+123, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 292
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 293
-1, // $$start
-1, // start
968, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+126, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+126, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+126, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+126, // "u"
1487, // "p"
MIN_REDUCTION+126, // "h"
496, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
830, // "g"
MIN_REDUCTION+126, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+126, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 294
2,636, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 296
0x80000000|1193, // match move
0x80000000|865, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 297
121,1314, // "/"
122,798, // "*"
  }
,
{ // state 298
177,MIN_REDUCTION+148, // $NT
  }
,
{ // state 299
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 300
0x80000000|1223, // match move
0x80000000|899, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 301
106,616, // "w"
  }
,
{ // state 302
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+266, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 303
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+210, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+210, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+210, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+210, // "u"
1487, // "p"
MIN_REDUCTION+210, // "h"
496, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
830, // "g"
MIN_REDUCTION+210, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+210, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 304
92,43, // "e"
  }
,
{ // state 305
99,911, // "c"
  }
,
{ // state 306
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+122, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 307
122,908, // "*"
  }
,
{ // state 308
0x80000000|654, // match move
0x80000000|1293, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 309
1,476, // start
2,32, // ws*
3,1110, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
170,666, // token*
  }
,
{ // state 310
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 311
102,1437, // "t"
  }
,
{ // state 312
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+256, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 313
0x80000000|286, // match move
0x80000000|302, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 314
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 315
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+294, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 316
0x80000000|1126, // match move
0x80000000|362, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 317
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 318
93,1011, // "a"
  }
,
{ // state 319
2,1001, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 320
0x80000000|377, // match move
0x80000000|87, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 321
0x80000000|1, // match move
0x80000000|288, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 322
92,550, // "e"
  }
,
{ // state 323
0x80000000|445, // match move
0x80000000|1113, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 324
177,MIN_REDUCTION+214, // $NT
  }
,
{ // state 325
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 326
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+264, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 327
0x80000000|49, // match move
0x80000000|1468, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 328
92,1299, // "e"
  }
,
{ // state 329
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 330
0x80000000|251, // match move
0x80000000|315, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 331
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 332
177,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 333
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 334
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+125, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 335
177,MIN_REDUCTION+241, // $NT
  }
,
{ // state 336
0x80000000|1042, // match move
0x80000000|997, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 337
89,211, // "b"
90,211, // "o"
91,211, // "l"
92,211, // "e"
93,211, // "a"
94,211, // "n"
97,211, // "r"
98,211, // "k"
99,211, // "c"
100,211, // "s"
101,211, // "x"
102,211, // "t"
103,211, // "d"
104,211, // "f"
105,211, // "i"
106,211, // "w"
107,211, // "u"
108,211, // "p"
109,211, // "h"
110,211, // "v"
111,211, // "y"
112,211, // "m"
113,211, // "g"
114,211, // "z"
115,211, // "!"
116,211, // "="
117,211, // "%"
118,211, // "&"
119,211, // "("
120,211, // ")"
121,211, // "/"
122,211, // "*"
123,211, // "+"
124,211, // ","
125,211, // "-"
126,211, // "."
127,211, // ":"
128,211, // ";"
129,211, // "<"
130,211, // ">"
131,211, // "["
132,211, // "]"
133,211, // "{"
134,211, // "}"
135,211, // "|"
136,211, // "0"
137,211, // {"1".."9"}
138,211, // "X"
143,211, // "'"
144,211, // "\"
145,420, // printable
146,211, // '"'
147,85, // stringWord
149,1653, // stringChar
151,211, // "_"
152,211, // {"A".."W" "Y".."Z" "j" "q"}
153,211, // " "
154,211, // {"#".."$" "?".."@" "^" "`" "~"}
156,1633, // stringChar**
172,897, // stringChar*
  }
,
{ // state 338
0x80000000|91, // match move
0x80000000|1130, // no-match move
0x80000000|842, // NT-test-match state for digit
  }
,
{ // state 339
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+286, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 340
0x80000000|648, // match move
0x80000000|429, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 341
177,MIN_REDUCTION+94, // $NT
  }
,
{ // state 342
121,527, // "/"
  }
,
{ // state 343
0x80000000|1, // match move
0x80000000|1272, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 344
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 345
2,512, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 346
177,MIN_REDUCTION+217, // $NT
  }
,
{ // state 347
0x80000000|278, // match move
0x80000000|190, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 348
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 349
0x80000000|513, // match move
0x80000000|184, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 350
2,913, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 351
2,708, // ws*
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 352
0x80000000|1481, // match move
0x80000000|1292, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 353
0x80000000|1031, // match move
0x80000000|1446, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 354
0x80000000|789, // match move
0x80000000|753, // no-match move
0x80000000|396, // NT-test-match state for printable
  }
,
{ // state 355
-1, // $$start
-1, // start
995, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+189, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+189, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+189, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+189, // "u"
1487, // "p"
MIN_REDUCTION+189, // "h"
496, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
830, // "g"
MIN_REDUCTION+189, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+189, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 356
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 358
2,581, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 359
93,1091, // "a"
  }
,
{ // state 360
2,989, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 361
1,476, // start
2,32, // ws*
3,1110, // $$0
4,485, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
83,958, // `/
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
136,1527, // "0"
150,702, // letter
159,1550, // ws
161,1069, // eol
170,666, // token*
  }
,
{ // state 362
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+134, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 363
92,1012, // "e"
  }
,
{ // state 364
0x80000000|1304, // match move
0x80000000|410, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 365
2,913, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 366
0x80000000|1, // match move
0x80000000|127, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 367
177,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 368
0x80000000|294, // match move
0x80000000|816, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 369
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+146, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 370
177,MIN_REDUCTION+151, // $NT
  }
,
{ // state 371
91,582, // "l"
  }
,
{ // state 372
2,1418, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 373
102,16, // "t"
  }
,
{ // state 374
92,1419, // "e"
  }
,
{ // state 375
0x80000000|774, // match move
0x80000000|1253, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 376
0x80000000|1146, // match move
0x80000000|747, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 377
2,1418, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 378
177,MIN_REDUCTION+348, // $NT
  }
,
{ // state 379
100,1421, // "s"
  }
,
{ // state 380
2,452, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 381
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 382
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 383
177,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 384
177,MIN_REDUCTION+318, // $NT
  }
,
{ // state 385
99,962, // "c"
  }
,
{ // state 386
2,698, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 388
2,1038, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 389
177,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 390
177,MIN_REDUCTION+324, // $NT
  }
,
{ // state 391
-1, // $$start
-1, // start
234, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
-1, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
-1, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+263, // "*"
MIN_REDUCTION+263, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 392
0x80000000|1, // match move
0x80000000|336, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 393
0x80000000|590, // match move
0x80000000|1080, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 394
0x80000000|280, // match move
0x80000000|192, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 395
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 396
89,1402, // "b"
90,1402, // "o"
91,1402, // "l"
92,1402, // "e"
93,1402, // "a"
94,1402, // "n"
97,1402, // "r"
98,1402, // "k"
99,1402, // "c"
100,1402, // "s"
101,1402, // "x"
102,1402, // "t"
103,1402, // "d"
104,1402, // "f"
105,1402, // "i"
106,1402, // "w"
107,1402, // "u"
108,1402, // "p"
109,1402, // "h"
110,1402, // "v"
111,1402, // "y"
112,1402, // "m"
113,1402, // "g"
114,1402, // "z"
115,1402, // "!"
116,1402, // "="
117,1402, // "%"
118,1402, // "&"
119,1402, // "("
120,1402, // ")"
121,1402, // "/"
122,1402, // "*"
123,1402, // "+"
124,1402, // ","
125,1402, // "-"
126,1402, // "."
127,1402, // ":"
128,1402, // ";"
129,1402, // "<"
130,1402, // ">"
131,1402, // "["
132,1402, // "]"
133,1402, // "{"
134,1402, // "}"
135,1402, // "|"
136,1402, // "0"
137,1402, // {"1".."9"}
138,1402, // "X"
143,1402, // "'"
144,1402, // "\"
146,1402, // '"'
151,1402, // "_"
152,1402, // {"A".."W" "Y".."Z" "j" "q"}
153,1402, // " "
154,1402, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 397
0x80000000|1370, // match move
0x80000000|617, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 398
0x80000000|652, // match move
0x80000000|454, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 399
146,400, // '"'
147,85, // stringWord
148,1003, // $$1
156,1633, // stringChar**
172,897, // stringChar*
  }
,
{ // state 400
0x80000000|765, // match move
0x80000000|935, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 401
103,1134, // "d"
  }
,
{ // state 402
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 403
2,417, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 404
0x80000000|438, // match move
0x80000000|721, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 405
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 407
0x80000000|537, // match move
0x80000000|1393, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 408
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 409
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 410
0x80000000|511, // match move
0x80000000|1026, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 411
-1, // $$start
-1, // start
1206, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+120, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+120, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+120, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+120, // "u"
1487, // "p"
MIN_REDUCTION+120, // "h"
496, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
830, // "g"
MIN_REDUCTION+120, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+120, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 412
97,1002, // "r"
  }
,
{ // state 413
2,1330, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 414
89,922, // "b"
90,922, // "o"
91,922, // "l"
92,922, // "e"
93,922, // "a"
94,922, // "n"
97,922, // "r"
98,922, // "k"
99,922, // "c"
100,922, // "s"
101,922, // "x"
102,922, // "t"
103,922, // "d"
104,922, // "f"
105,922, // "i"
106,922, // "w"
107,922, // "u"
108,922, // "p"
109,922, // "h"
110,922, // "v"
111,922, // "y"
112,922, // "m"
113,922, // "g"
114,922, // "z"
115,922, // "!"
116,922, // "="
117,922, // "%"
118,922, // "&"
119,922, // "("
120,922, // ")"
121,922, // "/"
122,922, // "*"
123,922, // "+"
124,922, // ","
125,922, // "-"
126,922, // "."
127,922, // ":"
128,922, // ";"
129,922, // "<"
130,922, // ">"
131,922, // "["
132,922, // "]"
133,922, // "{"
134,922, // "}"
135,922, // "|"
136,922, // "0"
137,922, // {"1".."9"}
138,922, // "X"
143,922, // "'"
144,922, // "\"
145,146, // printable
146,922, // '"'
151,922, // "_"
152,922, // {"A".."W" "Y".."Z" "j" "q"}
153,922, // " "
154,922, // {"#".."$" "?".."@" "^" "`" "~"}
161,898, // eol
164,1132, // commentContent
168,1451, // {10}
169,1016, // {13}
  }
,
{ // state 415
0x80000000|938, // match move
0x80000000|549, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 416
90,847, // "o"
92,949, // "e"
  }
,
{ // state 417
0x80000000|1584, // match move
0x80000000|1289, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 418
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 419
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 420
0x80000000|50, // match move
0x80000000|1005, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 421
121,1314, // "/"
122,798, // "*"
  }
,
{ // state 422
2,1614, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 423
177,MIN_REDUCTION+100, // $NT
  }
,
{ // state 424
99,833, // "c"
  }
,
{ // state 425
0x80000000|203, // match move
0x80000000|759, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 426
177,MIN_REDUCTION+328, // $NT
  }
,
{ // state 427
93,1462, // "a"
  }
,
{ // state 428
0x80000000|360, // match move
0x80000000|484, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 429
0x80000000|1294, // match move
0x80000000|306, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 430
177,MIN_REDUCTION+202, // $NT
  }
,
{ // state 431
2,452, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 432
92,401, // "e"
  }
,
{ // state 433
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 434
105,1461, // "i"
  }
,
{ // state 435
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 436
2,238, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 438
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 439
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 441
0x80000000|331, // match move
0x80000000|735, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 442
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+313, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 443
108,1198, // "p"
  }
,
{ // state 444
144,99, // "\"
147,85, // stringWord
149,1653, // stringChar
155,1210, // escapeSlash
156,1633, // stringChar**
172,897, // stringChar*
  }
,
{ // state 445
177,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 446
0x80000000|692, // match move
0x80000000|387, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 447
0x80000000|778, // match move
0x80000000|1085, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 448
177,MIN_REDUCTION+91, // $NT
  }
,
{ // state 449
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 450
100,812, // "s"
  }
,
{ // state 451
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+270, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 452
0x80000000|1327, // match move
0x80000000|1441, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 453
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+170, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 454
0x80000000|1570, // match move
0x80000000|323, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 455
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+242, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 456
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 457
110,1023, // "v"
  }
,
{ // state 458
0x80000000|191, // match move
0x80000000|1386, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 459
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 460
177,MIN_REDUCTION+226, // $NT
  }
,
{ // state 461
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 462
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 463
125,1583, // "-"
  }
,
{ // state 464
0x80000000|178, // match move
0x80000000|1403, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 465
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 466
94,36, // "n"
  }
,
{ // state 467
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 468
2,1408, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 469
-1, // $$start
-1, // start
548, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+259, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 470
-1, // $$start
-1, // start
1388, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+277, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 471
0x80000000|365, // match move
0x80000000|1516, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 472
2,1330, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 473
177,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 474
0x80000000|684, // match move
0x80000000|1585, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 475
0x80000000|1083, // match move
0x80000000|809, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 476
176,MIN_REDUCTION+0, // $
  }
,
{ // state 477
93,105, // "a"
107,88, // "u"
111,1466, // "y"
  }
,
{ // state 478
0x80000000|185, // match move
0x80000000|761, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 479
0x80000000|440, // match move
0x80000000|1559, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 480
0x80000000|209, // match move
0x80000000|109, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 481
0x80000000|546, // match move
0x80000000|766, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 482
2,1442, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 483
2,1191, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 484
2,989, // ws*
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
83,958, // `/
84,598, // `:
85,405, // ID
87,143, // STRINGLIT
88,1543, // CHARLIT
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
97,106, // "r"
98,106, // "k"
99,106, // "c"
100,106, // "s"
101,106, // "x"
102,106, // "t"
103,106, // "d"
104,106, // "f"
105,106, // "i"
106,106, // "w"
107,106, // "u"
108,106, // "p"
109,106, // "h"
110,106, // "v"
111,106, // "y"
112,106, // "m"
113,106, // "g"
114,106, // "z"
115,619, // "!"
116,1259, // "="
117,61, // "%"
118,263, // "&"
119,103, // "("
120,763, // ")"
121,1025, // "/"
123,1136, // "+"
124,685, // ","
125,1515, // "-"
126,200, // "."
127,1274, // ":"
128,1246, // ";"
129,1503, // "<"
130,646, // ">"
131,1539, // "["
132,1655, // "]"
133,213, // "{"
134,79, // "}"
135,727, // "|"
138,106, // "X"
143,92, // "'"
146,730, // '"'
150,702, // letter
152,106, // {"A".."W" "Y".."Z" "j" "q"}
153,917, // " "
159,1550, // ws
160,917, // {9}
161,1069, // eol
168,1605, // {10}
169,1414, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 486
102,1100, // "t"
  }
,
{ // state 487
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 488
0x80000000|1064, // match move
0x80000000|84, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 489
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 490
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+191, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 491
91,304, // "l"
  }
,
{ // state 492
89,922, // "b"
90,922, // "o"
91,922, // "l"
92,922, // "e"
93,922, // "a"
94,922, // "n"
97,922, // "r"
98,922, // "k"
99,922, // "c"
100,922, // "s"
101,922, // "x"
102,922, // "t"
103,922, // "d"
104,922, // "f"
105,922, // "i"
106,922, // "w"
107,922, // "u"
108,922, // "p"
109,922, // "h"
110,922, // "v"
111,922, // "y"
112,922, // "m"
113,922, // "g"
114,922, // "z"
115,922, // "!"
116,922, // "="
117,922, // "%"
118,922, // "&"
119,922, // "("
120,922, // ")"
121,922, // "/"
122,922, // "*"
123,922, // "+"
124,922, // ","
125,922, // "-"
126,922, // "."
127,922, // ":"
128,922, // ";"
129,922, // "<"
130,922, // ">"
131,922, // "["
132,922, // "]"
133,922, // "{"
134,922, // "}"
135,922, // "|"
136,922, // "0"
137,922, // {"1".."9"}
138,922, // "X"
143,922, // "'"
144,922, // "\"
145,146, // printable
146,922, // '"'
151,922, // "_"
152,922, // {"A".."W" "Y".."Z" "j" "q"}
153,922, // " "
154,922, // {"#".."$" "?".."@" "^" "`" "~"}
161,898, // eol
163,1485, // commentContent**
164,206, // commentContent
168,1451, // {10}
169,1016, // {13}
175,446, // commentContent*
  }
,
{ // state 493
112,624, // "m"
  }
,
{ // state 494
177,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 495
0x80000000|1642, // match move
0x80000000|289, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 496
90,71, // "o"
  }
,
{ // state 497
177,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 498
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 499
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 500
0x80000000|1654, // match move
0x80000000|75, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 501
-1, // $$start
-1, // start
1213, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+171, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+171, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+171, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+171, // "u"
1487, // "p"
MIN_REDUCTION+171, // "h"
496, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
830, // "g"
MIN_REDUCTION+171, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+171, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 502
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 503
5,448, // `boolean
6,1474, // `class
7,1222, // `extends
8,19, // `void
9,1086, // `int
10,298, // `while
11,762, // `if
12,423, // `else
13,1513, // `for
14,341, // `break
15,1548, // `this
16,1308, // `false
17,1426, // `true
18,1579, // `super
19,1453, // `null
20,1121, // `return
21,1008, // `instanceof
22,1234, // `new
23,370, // `abstract
24,1586, // `assert
25,717, // `byte
26,1211, // `case
27,217, // `catch
28,1201, // `char
29,559, // `const
30,600, // `continue
31,1057, // `default
32,1544, // `do
33,195, // `double
34,1477, // `enum
35,216, // `final
36,1387, // `finally
37,1371, // `float
38,722, // `goto
39,250, // `implements
40,430, // `import
41,89, // `interface
42,69, // `long
43,1480, // `native
44,324, // `package
45,346, // `private
46,770, // `protected
47,1438, // `public
48,93, // `short
49,460, // `static
50,57, // `strictfp
51,27, // `switch
52,1065, // `synchronized
53,964, // `throw
54,1580, // `throws
55,335, // `transient
56,754, // `try
57,1163, // `volatile
89,1497, // "b"
91,1573, // "l"
92,1079, // "e"
93,1656, // "a"
94,1603, // "n"
97,1040, // "r"
99,539, // "c"
100,1561, // "s"
102,1582, // "t"
103,416, // "d"
104,230, // "f"
105,1509, // "i"
106,39, // "w"
108,1487, // "p"
110,496, // "v"
113,830, // "g"
  }
,
{ // state 504
0x80000000|20, // match move
0x80000000|291, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 505
0x80000000|1565, // match move
0x80000000|1384, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 506
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 507
0x80000000|284, // match move
0x80000000|1445, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 508
2,1175, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 509
116,1530, // "="
  }
,
{ // state 510
106,343, // "w"
  }
,
{ // state 511
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 512
0x80000000|462, // match move
0x80000000|687, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 513
2,1334, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 514
0x80000000|1595, // match move
0x80000000|781, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 515
0x80000000|358, // match move
0x80000000|1555, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 516
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 517
2,480, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 518
2,204, // ws*
153,917, // " "
159,1550, // ws
160,917, // {9}
161,1069, // eol
168,1605, // {10}
169,1414, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 519
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 520
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 521
0x80000000|586, // match move
0x80000000|96, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 522
2,855, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 523
2,708, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 524
177,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 525
0x80000000|1382, // match move
0x80000000|1020, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 526
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 527
177,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 528
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 529
177,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 531
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+274, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 532
0x80000000|1, // match move
0x80000000|504, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 533
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 535
2,1149, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 536
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 537
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 539
90,466, // "o"
91,121, // "l"
93,1303, // "a"
109,318, // "h"
  }
,
{ // state 540
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 541
0x80000000|147, // match move
0x80000000|327, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 542
2,1388, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 543
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+280, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 544
177,MIN_REDUCTION+343, // $NT
  }
,
{ // state 545
-1, // $$start
-1, // start
512, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+279, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 546
2,864, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 547
0x80000000|1104, // match move
0x80000000|980, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 548
0x80000000|596, // match move
0x80000000|1337, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 549
0x80000000|386, // match move
0x80000000|707, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 550
99,1564, // "c"
  }
,
{ // state 551
0x80000000|973, // match move
0x80000000|1098, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 552
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+298, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 553
122,1495, // "*"
  }
,
{ // state 554
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 555
92,1618, // "e"
  }
,
{ // state 556
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 557
0x80000000|1537, // match move
0x80000000|208, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 558
0x80000000|348, // match move
0x80000000|1383, // no-match move
0x80000000|842, // NT-test-match state for digit
  }
,
{ // state 559
177,MIN_REDUCTION+169, // $NT
  }
,
{ // state 560
136,338, // "0"
137,338, // {"1".."9"}
142,558, // digit
  }
,
{ // state 561
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 562
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 563
-1, // $$start
-1, // start
1063, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+234, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+234, // "k"
539, // "c"
725, // "s"
MIN_REDUCTION+234, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+234, // "u"
1487, // "p"
MIN_REDUCTION+234, // "h"
496, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
830, // "g"
MIN_REDUCTION+234, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+234, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 564
0x80000000|402, // match move
0x80000000|73, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 565
0x80000000|1478, // match move
0x80000000|1192, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 566
92,1229, // "e"
  }
,
{ // state 567
0x80000000|808, // match move
0x80000000|1032, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 568
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 569
102,1209, // "t"
  }
,
{ // state 570
0x80000000|936, // match move
0x80000000|950, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 571
0x80000000|290, // match move
0x80000000|458, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 572
177,MIN_REDUCTION+325, // $NT
  }
,
{ // state 573
0x80000000|44, // match move
0x80000000|242, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 574
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 575
0x80000000|231, // match move
0x80000000|678, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 576
0x80000000|436, // match move
0x80000000|622, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 577
2,636, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 578
0x80000000|889, // match move
0x80000000|1054, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 579
-1, // $$start
-1, // start
592, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+297, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 580
93,385, // "a"
  }
,
{ // state 581
0x80000000|29, // match move
0x80000000|1458, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 582
105,1457, // "i"
  }
,
{ // state 583
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+272, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 584
107,1625, // "u"
  }
,
{ // state 585
2,512, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 587
2,834, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 588
0x80000000|1378, // match move
0x80000000|723, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 589
2,548, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 590
2,1254, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 591
2,671, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 592
0x80000000|561, // match move
0x80000000|353, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 593
0x80000000|494, // match move
0x80000000|60, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 594
0x80000000|408, // match move
0x80000000|150, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 595
0x80000000|1587, // match move
0x80000000|822, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 596
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 597
97,1249, // "r"
  }
,
{ // state 598
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 599
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 600
177,MIN_REDUCTION+172, // $NT
  }
,
{ // state 601
0x80000000|237, // match move
0x80000000|428, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 602
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 603
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+296, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 604
0x80000000|1290, // match move
0x80000000|645, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 605
0x80000000|983, // match move
0x80000000|1268, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 606
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 607
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+155, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 608
2,592, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 609
102,1095, // "t"
  }
,
{ // state 610
93,1262, // "a"
  }
,
{ // state 611
2,548, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 612
107,872, // "u"
  }
,
{ // state 613
0x80000000|319, // match move
0x80000000|169, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 614
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 615
0x80000000|155, // match move
0x80000000|749, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 616
0x80000000|1588, // match move
0x80000000|932, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 617
3,750, // $$0
4,485, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
62,714, // `*
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
122,279, // "*"
139,1066, // intLit2
141,1398, // digit++
142,845, // digit
150,702, // letter
159,1264, // ws
161,1069, // eol
170,666, // token*
173,7, // digit+
  }
,
{ // state 618
177,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 619
0x80000000|776, // match move
0x80000000|650, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 620
-1, // $$start
-1, // start
547, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+253, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 621
0x80000000|380, // match move
0x80000000|1545, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 622
-1, // $$start
-1, // start
238, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+183, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+183, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+183, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+183, // "u"
1487, // "p"
MIN_REDUCTION+183, // "h"
496, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
830, // "g"
MIN_REDUCTION+183, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+183, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 623
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 624
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 625
99,1271, // "c"
  }
,
{ // state 626
0x80000000|1, // match move
0x80000000|787, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 627
2,58, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 628
2,1063, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 629
0x80000000|78, // match move
0x80000000|824, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 630
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 632
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+236, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 633
0x80000000|1355, // match move
0x80000000|144, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 634
0x80000000|180, // match move
0x80000000|768, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 635
2,1388, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 636
0x80000000|1019, // match move
0x80000000|883, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 637
91,18, // "l"
  }
,
{ // state 638
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 639
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+282, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+282, // $
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
{ // state 640
0x80000000|459, // match move
0x80000000|1097, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 641
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 642
2,1408, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 643
2,1024, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 644
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+110, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 645
0x80000000|719, // match move
0x80000000|1306, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 646
0x80000000|755, // match move
0x80000000|1648, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 647
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 648
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 649
103,64, // "d"
  }
,
{ // state 650
0x80000000|718, // match move
0x80000000|415, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 651
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 652
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 653
90,186, // "o"
111,1389, // "y"
  }
,
{ // state 654
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 655
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 656
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 657
116,854, // "="
  }
,
{ // state 658
2,157, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 659
102,1278, // "t"
  }
,
{ // state 660
0x80000000|1, // match move
0x80000000|1018, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 661
113,1273, // "g"
  }
,
{ // state 662
0x80000000|1258, // match move
0x80000000|1157, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 663
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 664
4,223, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
83,958, // `/
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
136,1527, // "0"
150,702, // letter
  }
,
{ // state 665
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 666
0x80000000|782, // match move
0x80000000|786, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 667
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 668
0x80000000|1, // match move
0x80000000|734, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 669
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+276, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 670
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 671
0x80000000|728, // match move
0x80000000|1170, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 672
2,234, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 673
0x80000000|472, // match move
0x80000000|1200, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 674
0x80000000|611, // match move
0x80000000|469, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 675
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 676
0x80000000|1526, // match move
0x80000000|760, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 677
2,578, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 678
0x80000000|1602, // match move
0x80000000|777, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 679
102,1185, // "t"
  }
,
{ // state 680
0x80000000|757, // match move
0x80000000|1346, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 681
0x80000000|153, // match move
0x80000000|488, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 682
97,104, // "r"
105,126, // "i"
  }
,
{ // state 683
0x80000000|1, // match move
0x80000000|629, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 684
177,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 685
0x80000000|1643, // match move
0x80000000|1341, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 686
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 687
0x80000000|1342, // match move
0x80000000|588, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 688
91,1574, // "l"
  }
,
{ // state 689
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 690
0x80000000|1311, // match move
0x80000000|285, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 691
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 692
0x80000000|125, // match move
0x80000000|414, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 693
92,877, // "e"
  }
,
{ // state 694
0x80000000|741, // match move
0x80000000|515, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 695
0x80000000|1623, // match move
0x80000000|956, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 696
97,1312, // "r"
  }
,
{ // state 697
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 698
0x80000000|1511, // match move
0x80000000|176, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 699
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 700
168,1000, // {10}
  }
,
{ // state 701
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+302, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 702
0x80000000|828, // match move
0x80000000|5, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 703
177,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 704
0x80000000|76, // match move
0x80000000|664, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 705
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 706
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 707
-1, // $$start
-1, // start
698, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
-1, // `=
-1, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
MIN_REDUCTION+249, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+249, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 708
0x80000000|108, // match move
0x80000000|1650, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 709
97,321, // "r"
  }
,
{ // state 710
0x80000000|277, // match move
0x80000000|878, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|948, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 712
0x80000000|1598, // match move
0x80000000|1518, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 713
2,633, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 714
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 715
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 716
105,95, // "i"
  }
,
{ // state 717
177,MIN_REDUCTION+157, // $NT
  }
,
{ // state 718
2,698, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 719
177,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 720
0x80000000|1013, // match move
0x80000000|1076, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 721
0x80000000|1158, // match move
0x80000000|252, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 722
177,MIN_REDUCTION+196, // $NT
  }
,
{ // state 723
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+278, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 724
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+161, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 725
0x80000000|1207, // match move
0x80000000|1376, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 726
0x80000000|1440, // match move
0x80000000|1496, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 727
135,394, // "|"
  }
,
{ // state 728
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 729
0x80000000|691, // match move
0x80000000|1392, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 730
0x80000000|262, // match move
0x80000000|399, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 731
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 732
111,1389, // "y"
  }
,
{ // state 733
2,1213, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 734
0x80000000|795, // match move
0x80000000|303, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 735
0x80000000|1460, // match move
0x80000000|1251, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 736
97,228, // "r"
  }
,
{ // state 737
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+252, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 738
2,53, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 739
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 740
0x80000000|383, // match move
0x80000000|1202, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 741
2,581, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 742
0x80000000|1188, // match move
0x80000000|1340, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 743
0x80000000|116, // match move
0x80000000|1558, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 744
104,1298, // "f"
  }
,
{ // state 745
0x80000000|944, // match move
0x80000000|1035, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 746
0x80000000|388, // match move
0x80000000|70, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 747
0x80000000|1469, // match move
0x80000000|583, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 748
91,732, // "l"
  }
,
{ // state 749
0x80000000|258, // match move
0x80000000|481, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 750
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 751
161,497, // eol
162,1168, // printable**
168,1605, // {10}
169,1414, // {13}
171,354, // printable*
  }
,
{ // state 752
94,1194, // "n"
  }
,
{ // state 753
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 754
177,MIN_REDUCTION+244, // $NT
  }
,
{ // state 755
116,1363, // "="
  }
,
{ // state 756
2,1596, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 757
92,597, // "e"
  }
,
{ // state 758
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 759
0x80000000|1350, // match move
0x80000000|3, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 760
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+262, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 761
0x80000000|367, // match move
0x80000000|369, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 762
177,MIN_REDUCTION+112, // $NT
  }
,
{ // state 763
0x80000000|947, // match move
0x80000000|1196, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 764
177,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 765
2,708, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 766
-1, // $$start
-1, // start
864, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+310, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 767
0x80000000|1590, // match move
0x80000000|954, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 768
0x80000000|951, // match move
0x80000000|701, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 769
177,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 770
177,MIN_REDUCTION+220, // $NT
  }
,
{ // state 771
0x80000000|1, // match move
0x80000000|505, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 772
0x80000000|1, // match move
0x80000000|720, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 773
0x80000000|1143, // match move
0x80000000|946, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 774
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 775
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 776
116,1333, // "="
  }
,
{ // state 777
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+185, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 778
2,633, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 779
-1, // $$start
-1, // start
1614, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
-1, // `=
-1, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
MIN_REDUCTION+281, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+281, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 780
112,1430, // "m"
  }
,
{ // state 781
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+374, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+374, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+374, // $
-1, // $NT
  }
,
{ // state 782
0x80000000|1, // match move
0x80000000|1325, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 783
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 784
2,1636, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 785
121,553, // "/"
163,1485, // commentContent**
164,206, // commentContent
165,1634, // nestedCommentStart
175,446, // commentContent*
  }
,
{ // state 786
0x80000000|704, // match move
0x80000000|475, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 787
0x80000000|1179, // match move
0x80000000|1315, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 788
0x80000000|1087, // match move
0x80000000|120, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 789
89,272, // "b"
90,272, // "o"
91,272, // "l"
92,272, // "e"
93,272, // "a"
94,272, // "n"
97,272, // "r"
98,272, // "k"
99,272, // "c"
100,272, // "s"
101,272, // "x"
102,272, // "t"
103,272, // "d"
104,272, // "f"
105,272, // "i"
106,272, // "w"
107,272, // "u"
108,272, // "p"
109,272, // "h"
110,272, // "v"
111,272, // "y"
112,272, // "m"
113,272, // "g"
114,272, // "z"
115,272, // "!"
116,272, // "="
117,272, // "%"
118,272, // "&"
119,272, // "("
120,272, // ")"
121,272, // "/"
122,272, // "*"
123,272, // "+"
124,272, // ","
125,272, // "-"
126,272, // "."
127,272, // ":"
128,272, // ";"
129,272, // "<"
130,272, // ">"
131,272, // "["
132,272, // "]"
133,272, // "{"
134,272, // "}"
135,272, // "|"
136,272, // "0"
137,272, // {"1".."9"}
138,272, // "X"
143,272, // "'"
144,272, // "\"
145,857, // printable
146,272, // '"'
151,272, // "_"
152,272, // {"A".."W" "Y".."Z" "j" "q"}
153,272, // " "
154,272, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 790
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 791
0x80000000|663, // match move
0x80000000|425, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 792
90,1343, // "o"
91,953, // "l"
  }
,
{ // state 793
-1, // $$start
-1, // start
855, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+293, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 794
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+101, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 795
2,55, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 796
93,105, // "a"
105,1094, // "i"
107,88, // "u"
111,1466, // "y"
  }
,
{ // state 797
0x80000000|34, // match move
0x80000000|1439, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 798
0x80000000|965, // match move
0x80000000|1491, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 799
91,532, // "l"
  }
,
{ // state 800
92,1362, // "e"
  }
,
{ // state 801
105,1432, // "i"
  }
,
{ // state 802
0x80000000|1313, // match move
0x80000000|970, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 803
0x80000000|1345, // match move
0x80000000|1044, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 804
0x80000000|483, // match move
0x80000000|1399, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 805
2,570, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 806
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 807
-1, // $$start
-1, // start
1024, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+305, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 808
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 809
4,223, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
83,958, // `/
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
97,106, // "r"
98,106, // "k"
99,106, // "c"
100,106, // "s"
101,106, // "x"
102,106, // "t"
103,106, // "d"
104,106, // "f"
105,106, // "i"
106,106, // "w"
107,106, // "u"
108,106, // "p"
109,106, // "h"
110,106, // "v"
111,106, // "y"
112,106, // "m"
113,106, // "g"
114,106, // "z"
115,619, // "!"
116,1259, // "="
117,61, // "%"
118,263, // "&"
119,103, // "("
120,763, // ")"
121,1566, // "/"
123,1136, // "+"
124,685, // ","
125,1515, // "-"
126,200, // "."
127,1274, // ":"
128,1246, // ";"
129,1503, // "<"
130,646, // ">"
131,1539, // "["
132,1655, // "]"
133,213, // "{"
134,79, // "}"
135,727, // "|"
136,338, // "0"
137,338, // {"1".."9"}
138,106, // "X"
139,1066, // intLit2
141,1398, // digit++
142,845, // digit
143,92, // "'"
146,730, // '"'
150,702, // letter
152,106, // {"A".."W" "Y".."Z" "j" "q"}
173,7, // digit+
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 810
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 811
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+104, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 812
0x80000000|1, // match move
0x80000000|767, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 813
177,MIN_REDUCTION+346, // $NT
  }
,
{ // state 814
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 815
-1, // $$start
-1, // start
913, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+283, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 816
0x80000000|577, // match move
0x80000000|903, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 817
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 818
0x80000000|1288, // match move
0x80000000|115, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 819
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 820
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 821
92,668, // "e"
  }
,
{ // state 822
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+292, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 823
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+149, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 824
-1, // $$start
-1, // start
803, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+105, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+105, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+105, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+105, // "u"
1487, // "p"
MIN_REDUCTION+105, // "h"
496, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
830, // "g"
MIN_REDUCTION+105, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+105, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 825
0x80000000|273, // match move
0x80000000|1409, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 826
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 827
0x80000000|1473, // match move
0x80000000|1296, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 828
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
95,941, // idChar
97,106, // "r"
98,106, // "k"
99,106, // "c"
100,106, // "s"
101,106, // "x"
102,106, // "t"
103,106, // "d"
104,106, // "f"
105,106, // "i"
106,106, // "w"
107,106, // "u"
108,106, // "p"
109,106, // "h"
110,106, // "v"
111,106, // "y"
112,106, // "m"
113,106, // "g"
114,106, // "z"
136,1577, // "0"
137,1577, // {"1".."9"}
138,106, // "X"
142,219, // digit
150,712, // letter
151,1245, // "_"
152,106, // {"A".."W" "Y".."Z" "j" "q"}
157,1004, // idChar**
174,1309, // idChar*
  }
,
{ // state 829
2,547, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 830
90,659, // "o"
  }
,
{ // state 831
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 832
2,726, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 833
109,891, // "h"
  }
,
{ // state 834
0x80000000|502, // match move
0x80000000|604, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 835
0x80000000|1117, // match move
0x80000000|455, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 836
101,992, // "x"
136,338, // "0"
137,338, // {"1".."9"}
138,992, // "X"
140,912, // `x
141,615, // digit++
142,845, // digit
173,7, // digit+
  }
,
{ // state 837
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 838
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+250, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 839
0x80000000|517, // match move
0x80000000|1221, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 840
100,971, // "s"
  }
,
{ // state 841
92,1055, // "e"
  }
,
{ // state 842
136,218, // "0"
137,218, // {"1".."9"}
  }
,
{ // state 843
-1, // $$start
-1, // start
452, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
-1, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
-1, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+269, // "*"
1136, // "+"
685, // ","
MIN_REDUCTION+269, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 844
0x80000000|1050, // match move
0x80000000|326, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 845
0x80000000|846, // match move
0x80000000|914, // no-match move
0x80000000|842, // NT-test-match state for digit
  }
,
{ // state 846
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 847
0x80000000|612, // match move
0x80000000|745, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 848
0x80000000|1187, // match move
0x80000000|139, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 849
0x80000000|1600, // match move
0x80000000|900, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 850
0x80000000|136, // match move
0x80000000|607, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 851
0x80000000|1176, // match move
0x80000000|676, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 852
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 853
94,373, // "n"
  }
,
{ // state 854
0x80000000|350, // match move
0x80000000|471, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 855
0x80000000|1630, // match move
0x80000000|1081, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 856
0x80000000|138, // match move
0x80000000|1494, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 857
0x80000000|623, // match move
0x80000000|893, // no-match move
0x80000000|396, // NT-test-match state for printable
  }
,
{ // state 858
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 859
113,325, // "g"
  }
,
{ // state 860
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 861
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 862
0x80000000|1, // match move
0x80000000|981, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 863
0x80000000|733, // match move
0x80000000|501, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 864
0x80000000|409, // match move
0x80000000|132, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 865
0x80000000|189, // match move
0x80000000|984, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 866
2,592, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 867
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+137, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
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
{ // state 868
0x80000000|627, // match move
0x80000000|110, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 869
-1, // $$start
-1, // start
308, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+271, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 870
0x80000000|1102, // match move
0x80000000|451, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 871
0x80000000|895, // match move
0x80000000|1037, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 872
89,688, // "b"
  }
,
{ // state 873
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 874
177,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 875
2,1254, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 876
0x80000000|182, // match move
0x80000000|740, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 877
103,1554, // "d"
  }
,
{ // state 878
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+212, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 879
0x80000000|1, // match move
0x80000000|1640, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 880
91,915, // "l"
94,281, // "n"
97,1249, // "r"
101,1232, // "x"
  }
,
{ // state 881
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 882
0x80000000|638, // match move
0x80000000|1627, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 883
0x80000000|519, // match move
0x80000000|890, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 884
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 885
2,28, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 886
0x80000000|1, // match move
0x80000000|839, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 887
0x80000000|1423, // match move
0x80000000|160, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 888
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+92, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 889
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 890
0x80000000|1639, // match move
0x80000000|442, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 891
0x80000000|1, // match move
0x80000000|868, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 892
0x80000000|1, // match move
0x80000000|993, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 893
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 894
0x80000000|873, // match move
0x80000000|356, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 895
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 896
0x80000000|418, // match move
0x80000000|710, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 897
0x80000000|300, // match move
0x80000000|775, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 898
0x80000000|1613, // match move
0x80000000|52, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 899
89,211, // "b"
90,211, // "o"
91,211, // "l"
92,211, // "e"
93,211, // "a"
94,211, // "n"
97,211, // "r"
98,211, // "k"
99,211, // "c"
100,211, // "s"
101,211, // "x"
102,211, // "t"
103,211, // "d"
104,211, // "f"
105,211, // "i"
106,211, // "w"
107,211, // "u"
108,211, // "p"
109,211, // "h"
110,211, // "v"
111,211, // "y"
112,211, // "m"
113,211, // "g"
114,211, // "z"
115,211, // "!"
116,211, // "="
117,211, // "%"
118,211, // "&"
119,211, // "("
120,211, // ")"
121,211, // "/"
122,211, // "*"
123,211, // "+"
124,211, // ","
125,211, // "-"
126,211, // "."
127,211, // ":"
128,211, // ";"
129,211, // "<"
130,211, // ">"
131,211, // "["
132,211, // "]"
133,211, // "{"
134,211, // "}"
135,211, // "|"
136,211, // "0"
137,211, // {"1".."9"}
138,211, // "X"
143,211, // "'"
144,211, // "\"
145,420, // printable
146,211, // '"'
149,894, // stringChar
151,211, // "_"
152,211, // {"A".."W" "Y".."Z" "j" "q"}
153,211, // " "
154,211, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 900
0x80000000|630, // match move
0x80000000|850, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 901
109,696, // "h"
  }
,
{ // state 902
0x80000000|38, // match move
0x80000000|283, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 903
-1, // $$start
-1, // start
636, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+314, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 904
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 905
-1, // $$start
-1, // start
986, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+216, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+216, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+216, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+216, // "u"
1487, // "p"
MIN_REDUCTION+216, // "h"
496, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
830, // "g"
MIN_REDUCTION+216, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+216, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 906
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 907
93,1324, // "a"
  }
,
{ // state 908
177,MIN_REDUCTION+342, // $NT
  }
,
{ // state 909
92,709, // "e"
  }
,
{ // state 910
177,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 911
92,1528, // "e"
  }
,
{ // state 912
136,338, // "0"
137,338, // {"1".."9"}
141,1302, // digit++
142,845, // digit
173,7, // digit+
  }
,
{ // state 913
0x80000000|1178, // match move
0x80000000|959, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 914
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 915
100,328, // "s"
  }
,
{ // state 916
0x80000000|1116, // match move
0x80000000|490, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 917
177,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 918
0x80000000|955, // match move
0x80000000|1203, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 919
0x80000000|670, // match move
0x80000000|474, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 920
2,1265, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 921
0x80000000|1180, // match move
0x80000000|942, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 922
0x80000000|1611, // match move
0x80000000|344, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 923
0x80000000|985, // match move
0x80000000|1318, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 924
0x80000000|1358, // match move
0x80000000|1591, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 925
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 926
0x80000000|1186, // match move
0x80000000|1514, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 927
0x80000000|94, // match move
0x80000000|1270, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 928
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 929
107,363, // "u"
  }
,
{ // state 930
2,1024, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 931
2,1435, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 932
0x80000000|628, // match move
0x80000000|563, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 933
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 934
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 935
0x80000000|523, // match move
0x80000000|1352, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 936
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 937
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 938
2,698, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 939
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 940
-1, // $$start
-1, // start
1435, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+150, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+150, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+150, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+150, // "u"
1487, // "p"
MIN_REDUCTION+150, // "h"
496, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
830, // "g"
MIN_REDUCTION+150, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+150, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 941
0x80000000|568, // match move
0x80000000|433, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 942
0x80000000|1391, // match move
0x80000000|1160, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 943
0x80000000|703, // match move
0x80000000|1373, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 944
2,275, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 945
-1, // $$start
-1, // start
1217, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+168, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+168, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+168, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+168, // "u"
1487, // "p"
MIN_REDUCTION+168, // "h"
496, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
830, // "g"
MIN_REDUCTION+168, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+168, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 946
0x80000000|332, // match move
0x80000000|1043, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 947
2,548, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 948
0x80000000|97, // match move
0x80000000|224, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 949
104,359, // "f"
  }
,
{ // state 950
0x80000000|881, // match move
0x80000000|1404, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 951
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 952
0x80000000|1, // match move
0x80000000|1015, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 953
92,780, // "e"
  }
,
{ // state 954
-1, // $$start
-1, // start
407, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+96, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+96, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+96, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+96, // "u"
1487, // "p"
MIN_REDUCTION+96, // "h"
496, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
830, // "g"
MIN_REDUCTION+96, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+96, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 955
2,54, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 956
0x80000000|1216, // match move
0x80000000|916, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 957
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 958
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 959
0x80000000|562, // match move
0x80000000|1322, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 960
0x80000000|245, // match move
0x80000000|788, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 961
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+113, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 962
92,1556, // "e"
  }
,
{ // state 963
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 964
177,MIN_REDUCTION+235, // $NT
  }
,
{ // state 965
0x80000000|785, // match move
0x80000000|492, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 966
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 967
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 968
0x80000000|193, // match move
0x80000000|287, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 969
0x80000000|1, // match move
0x80000000|1492, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 970
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+248, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 971
0x80000000|1, // match move
0x80000000|918, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 972
-1, // $$start
-1, // start
1408, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+291, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 973
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 974
2,791, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 975
0x80000000|1520, // match move
0x80000000|453, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 976
151,MIN_REDUCTION+320, // "_"
157,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 977
-1, // $$start
-1, // start
695, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+192, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+192, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+192, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+192, // "u"
1487, // "p"
MIN_REDUCTION+192, // "h"
496, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
830, // "g"
MIN_REDUCTION+192, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+192, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 978
89,371, // "b"
  }
,
{ // state 979
2,1159, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 980
0x80000000|1049, // match move
0x80000000|1329, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 981
0x80000000|1111, // match move
0x80000000|977, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 982
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 983
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 984
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+164, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 985
177,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 986
0x80000000|861, // match move
0x80000000|1048, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 987
2,849, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 988
0x80000000|159, // match move
0x80000000|131, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 989
0x80000000|63, // match move
0x80000000|634, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 990
-1, // $$start
-1, // start
1652, // ws*
-1, // $$0
MIN_REDUCTION+333, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+333, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
810, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+333, // $
-1, // $NT
  }
,
{ // state 991
91,374, // "l"
  }
,
{ // state 992
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 993
0x80000000|1118, // match move
0x80000000|1356, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 994
-1, // $$start
-1, // start
1175, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+231, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+231, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+231, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+231, // "u"
1487, // "p"
MIN_REDUCTION+231, // "h"
496, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
830, // "g"
MIN_REDUCTION+231, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+231, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 995
0x80000000|831, // match move
0x80000000|1456, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 996
102,322, // "t"
  }
,
{ // state 997
-1, // $$start
-1, // start
398, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+225, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+225, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+225, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+225, // "u"
1487, // "p"
MIN_REDUCTION+225, // "h"
496, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
830, // "g"
MIN_REDUCTION+225, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+225, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 998
177,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 999
0x80000000|142, // match move
0x80000000|393, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1000
0x80000000|858, // match move
0x80000000|129, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1001
0x80000000|1490, // match move
0x80000000|960, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1002
102,366, // "t"
  }
,
{ // state 1003
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1004
0x80000000|1433, // match move
0x80000000|902, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1005
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1007
177,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1008
177,MIN_REDUCTION+115, // $NT
  }
,
{ // state 1009
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1010
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1011
97,772, // "r"
  }
,
{ // state 1012
0x80000000|1, // match move
0x80000000|863, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1013
2,1173, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1014
0x80000000|529, // match move
0x80000000|888, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1015
0x80000000|658, // match move
0x80000000|2, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1016
0x80000000|700, // match move
0x80000000|198, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 1017
0x80000000|33, // match move
0x80000000|594, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1018
0x80000000|196, // match move
0x80000000|293, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1019
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1020
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+227, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1021
121,307, // "/"
165,378, // nestedCommentStart
  }
,
{ // state 1022
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1023
93,45, // "a"
  }
,
{ // state 1024
0x80000000|1443, // match move
0x80000000|495, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1025
0x80000000|421, // match move
0x80000000|1533, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1026
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+284, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1027
0x80000000|141, // match move
0x80000000|313, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1028
100,450, // "s"
  }
,
{ // state 1029
0x80000000|1332, // match move
0x80000000|1406, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1030
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1031
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1032
0x80000000|1508, // match move
0x80000000|794, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1033
3,750, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
170,666, // token*
  }
,
{ // state 1034
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
95,521, // idChar
97,106, // "r"
98,106, // "k"
99,106, // "c"
100,106, // "s"
101,106, // "x"
102,106, // "t"
103,106, // "d"
104,106, // "f"
105,106, // "i"
106,106, // "w"
107,106, // "u"
108,106, // "p"
109,106, // "h"
110,106, // "v"
111,106, // "y"
112,106, // "m"
113,106, // "g"
114,106, // "z"
136,1577, // "0"
137,1577, // {"1".."9"}
138,106, // "X"
142,219, // digit
150,712, // letter
151,1245, // "_"
152,106, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1035
-1, // $$start
-1, // start
275, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+177, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+177, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+177, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
872, // "u"
1487, // "p"
MIN_REDUCTION+177, // "h"
496, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
830, // "g"
MIN_REDUCTION+177, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+177, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1036
2,452, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1037
0x80000000|17, // match move
0x80000000|1367, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1038
0x80000000|439, // match move
0x80000000|1467, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1039
0x80000000|264, // match move
0x80000000|15, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1040
92,1244, // "e"
  }
,
{ // state 1041
0x80000000|1427, // match move
0x80000000|531, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1042
2,398, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1043
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+176, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1044
0x80000000|1463, // match move
0x80000000|1233, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1045
0x80000000|556, // match move
0x80000000|183, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1046
0x80000000|422, // match move
0x80000000|82, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1047
99,11, // "c"
  }
,
{ // state 1048
0x80000000|1364, // match move
0x80000000|943, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1049
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1050
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1051
168,389, // {10}
  }
,
{ // state 1052
2,202, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1053
92,683, // "e"
  }
,
{ // state 1054
0x80000000|1321, // match move
0x80000000|220, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1055
0x80000000|1, // match move
0x80000000|1101, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1056
100,48, // "s"
102,680, // "t"
  }
,
{ // state 1057
177,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1058
2,1017, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1059
-1, // $$start
-1, // start
726, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+243, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+243, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+243, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+243, // "u"
1487, // "p"
MIN_REDUCTION+243, // "h"
496, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
830, // "g"
MIN_REDUCTION+243, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+243, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1060
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1061
0x80000000|1532, // match move
0x80000000|1266, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1062
0x80000000|437, // match move
0x80000000|339, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1063
0x80000000|1500, // match move
0x80000000|1212, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1064
177,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1065
177,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1066
0x80000000|930, // match move
0x80000000|1238, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1067
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+173, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1068
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1069
177,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1070
0x80000000|1183, // match move
0x80000000|945, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1071
102,23, // "t"
  }
,
{ // state 1072
94,40, // "n"
  }
,
{ // state 1073
-1, // $$start
-1, // start
827, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+295, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 1074
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1075
2,827, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1076
-1, // $$start
-1, // start
1173, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+165, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+165, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+165, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+165, // "u"
1487, // "p"
MIN_REDUCTION+165, // "h"
496, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
830, // "g"
MIN_REDUCTION+165, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+165, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
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
{ // state 1077
0x80000000|1560, // match move
0x80000000|41, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1078
0x80000000|1649, // match move
0x80000000|1316, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1079
91,915, // "l"
94,281, // "n"
101,1232, // "x"
  }
,
{ // state 1080
-1, // $$start
-1, // start
1254, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+273, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1081
0x80000000|699, // match move
0x80000000|595, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1082
-1, // $$start
-1, // start
1320, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+267, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1083
4,223, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
89,1497, // "b"
91,1573, // "l"
92,1079, // "e"
93,1656, // "a"
94,1603, // "n"
97,1040, // "r"
99,539, // "c"
100,1561, // "s"
102,1582, // "t"
103,416, // "d"
104,230, // "f"
105,1509, // "i"
106,39, // "w"
108,1487, // "p"
110,496, // "v"
113,830, // "g"
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1084
0x80000000|748, // match move
0x80000000|1204, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1085
0x80000000|1413, // match move
0x80000000|249, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1086
177,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1087
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1088
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1089
0x80000000|1336, // match move
0x80000000|988, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1090
0x80000000|806, // match move
0x80000000|478, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1091
107,1261, // "u"
  }
,
{ // state 1092
2,855, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1093
0x80000000|1284, // match move
0x80000000|724, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1094
99,67, // "c"
  }
,
{ // state 1095
0x80000000|1, // match move
0x80000000|1215, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1096
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1097
0x80000000|473, // match move
0x80000000|1498, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1098
0x80000000|1645, // match move
0x80000000|669, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1099
1,476, // start
2,32, // ws*
3,1110, // $$0
4,485, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
62,714, // `*
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
122,279, // "*"
139,1066, // intLit2
141,1398, // digit++
142,845, // digit
150,702, // letter
159,1550, // ws
161,1069, // eol
170,666, // token*
173,7, // digit+
  }
,
{ // state 1100
97,111, // "r"
  }
,
{ // state 1101
0x80000000|987, // match move
0x80000000|1123, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1102
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1103
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1104
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1105
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1106
2,1038, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1107
2,557, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1108
-1, // $$start
-1, // start
671, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+246, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+246, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+246, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+246, // "u"
1487, // "p"
MIN_REDUCTION+246, // "h"
496, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
830, // "g"
MIN_REDUCTION+246, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+246, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1109
94,119, // "n"
  }
,
{ // state 1110
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1111
2,695, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1112
0x80000000|1, // match move
0x80000000|397, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1113
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+224, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1114
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+152, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1115
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1116
177,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1117
177,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1118
2,236, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1119
2,1320, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1120
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1121
177,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1122
177,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1123
-1, // $$start
-1, // start
849, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+156, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+156, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+156, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+156, // "u"
1487, // "p"
MIN_REDUCTION+156, // "h"
496, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
830, // "g"
MIN_REDUCTION+156, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+156, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1124
2,913, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1125
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1126
177,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1127
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+188, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1128
0x80000000|156, // match move
0x80000000|355, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1129
97,232, // "r"
  }
,
{ // state 1130
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1131
-1, // $$start
-1, // start
1269, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+102, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+102, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+102, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+102, // "u"
1487, // "p"
MIN_REDUCTION+102, // "h"
496, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
830, // "g"
MIN_REDUCTION+102, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+102, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1132
0x80000000|167, // match move
0x80000000|1319, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1133
0x80000000|1616, // match move
0x80000000|1301, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1134
0x80000000|1, // match move
0x80000000|1167, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1135
0x80000000|30, // match move
0x80000000|1483, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1136
0x80000000|21, // match move
0x80000000|56, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1137
100,434, // "s"
  }
,
{ // state 1138
0x80000000|243, // match move
0x80000000|14, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1139
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1140
0x80000000|1, // match move
0x80000000|1189, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1141
0x80000000|1401, // match move
0x80000000|1525, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1142
0x80000000|1394, // match move
0x80000000|1592, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1143
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1144
0x80000000|538, // match move
0x80000000|102, // no-match move
0x80000000|396, // NT-test-match state for printable
  }
,
{ // state 1145
99,154, // "c"
  }
,
{ // state 1146
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1147
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1148
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1149
0x80000000|1214, // match move
0x80000000|605, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1150
94,907, // "n"
  }
,
{ // state 1151
0x80000000|1486, // match move
0x80000000|1286, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1152
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1153
99,392, // "c"
  }
,
{ // state 1154
0x80000000|254, // match move
0x80000000|1218, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1155
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1156
-1, // $$start
-1, // start
834, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+219, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+219, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+219, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+219, // "u"
1487, // "p"
MIN_REDUCTION+219, // "h"
496, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
830, // "g"
MIN_REDUCTION+219, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+219, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1157
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+245, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1158
177,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1159
0x80000000|145, // match move
0x80000000|364, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1160
-1, // $$start
-1, // start
541, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+299, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1161
0x80000000|1052, // match move
0x80000000|1285, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1162
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1163
177,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1164
2,827, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1165
121,86, // "/"
  }
,
{ // state 1166
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1167
0x80000000|508, // match move
0x80000000|994, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1168
161,1416, // eol
168,1605, // {10}
169,1414, // {13}
  }
,
{ // state 1169
2,1614, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1170
0x80000000|382, // match move
0x80000000|662, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1171
0x80000000|1033, // match move
0x80000000|1637, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1172
2,1652, // ws*
157,1004, // idChar**
158,528, // $$2
159,1550, // ws
161,1069, // eol
174,1309, // idChar*
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1173
0x80000000|13, // match move
0x80000000|296, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1174
0x80000000|591, // match move
0x80000000|1108, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1175
0x80000000|1349, // match move
0x80000000|404, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1176
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1177
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1178
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1179
2,825, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1180
2,541, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1181
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1182
0x80000000|1105, // match move
0x80000000|593, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1183
2,1217, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1184
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1185
0x80000000|1, // match move
0x80000000|1231, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1186
2,1388, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1187
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1188
2,1149, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1189
0x80000000|1615, // match move
0x80000000|267, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1190
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1191
0x80000000|314, // match move
0x80000000|1405, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1192
0x80000000|1280, // match move
0x80000000|1041, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1193
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1194
0x80000000|1, // match move
0x80000000|1151, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1195
0x80000000|161, // match move
0x80000000|514, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1196
0x80000000|589, // match move
0x80000000|674, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1197
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1198
0x80000000|1, // match move
0x80000000|1039, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1199
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1200
-1, // $$start
-1, // start
1330, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+308, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1201
177,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1202
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+194, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1203
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+198, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+198, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+198, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+198, // "u"
1487, // "p"
MIN_REDUCTION+198, // "h"
496, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
830, // "g"
MIN_REDUCTION+198, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+198, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1204
0x80000000|1353, // match move
0x80000000|1546, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1205
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1206
0x80000000|1567, // match move
0x80000000|1182, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1207
102,1607, // "t"
106,801, // "w"
107,128, // "u"
109,1351, // "h"
111,1109, // "y"
  }
,
{ // state 1208
93,221, // "a"
  }
,
{ // state 1209
105,226, // "i"
  }
,
{ // state 1210
94,229, // "n"
97,848, // "r"
102,1297, // "t"
104,162, // "f"
143,729, // "'"
144,690, // "\"
146,201, // '"'
  }
,
{ // state 1211
177,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1212
0x80000000|1184, // match move
0x80000000|927, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1213
0x80000000|783, // match move
0x80000000|165, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1214
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1215
0x80000000|677, // match move
0x80000000|1239, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1216
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1217
0x80000000|51, // match move
0x80000000|640, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1218
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+260, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1219
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1220
0x80000000|1171, // match move
0x80000000|210, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1221
-1, // $$start
-1, // start
480, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+93, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+93, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+93, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+93, // "u"
1487, // "p"
MIN_REDUCTION+93, // "h"
496, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
830, // "g"
MIN_REDUCTION+93, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+93, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1222
177,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1223
144,99, // "\"
149,894, // stringChar
155,1210, // escapeSlash
  }
,
{ // state 1224
-1, // $$start
-1, // start
825, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+237, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+237, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+237, // "x"
1510, // "t"
416, // "d"
230, // "f"
1509, // "i"
1425, // "w"
128, // "u"
1487, // "p"
1351, // "h"
496, // "v"
1109, // "y"
MIN_REDUCTION+237, // "m"
830, // "g"
MIN_REDUCTION+237, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+237, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1225
92,227, // "e"
  }
,
{ // state 1226
108,792, // "p"
  }
,
{ // state 1227
2,1614, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1228
0x80000000|461, // match move
0x80000000|83, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|1174, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1230
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1231
0x80000000|255, // match move
0x80000000|59, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1232
102,555, // "t"
  }
,
{ // state 1233
0x80000000|1594, // match move
0x80000000|811, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1234
177,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1235
0x80000000|1, // match move
0x80000000|1161, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1236
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1237
94,233, // "n"
  }
,
{ // state 1238
0x80000000|643, // match move
0x80000000|25, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1239
-1, // $$start
-1, // start
578, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+174, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+174, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+174, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+174, // "u"
1487, // "p"
MIN_REDUCTION+174, // "h"
496, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
830, // "g"
MIN_REDUCTION+174, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+174, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1240
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1241
0x80000000|1651, // match move
0x80000000|1257, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1242
2,1269, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1243
121,307, // "/"
122,1572, // "*"
165,276, // nestedCommentStart
166,1475, // nestedCommentEnd
  }
,
{ // state 1244
102,584, // "t"
  }
,
{ // state 1245
0x80000000|904, // match move
0x80000000|1022, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1246
0x80000000|585, // match move
0x80000000|269, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1247
177,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1248
-1, // $$start
-1, // start
1017, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+114, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+114, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+114, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+114, // "u"
1487, // "p"
MIN_REDUCTION+114, // "h"
496, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
830, // "g"
MIN_REDUCTION+114, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+114, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1249
104,580, // "f"
  }
,
{ // state 1250
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1251
0x80000000|618, // match move
0x80000000|1536, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1252
2,1001, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1253
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+290, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1254
0x80000000|705, // match move
0x80000000|376, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1255
177,MIN_REDUCTION+327, // $NT
  }
,
{ // state 1256
0x80000000|240, // match move
0x80000000|334, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1257
-1, // $$start
-1, // start
743, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+99, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+99, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+99, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+99, // "u"
1487, // "p"
MIN_REDUCTION+99, // "h"
496, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
830, // "g"
MIN_REDUCTION+99, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+99, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1258
177,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1259
0x80000000|509, // match move
0x80000000|1482, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1260
0x80000000|963, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1261
91,609, // "l"
  }
,
{ // state 1262
94,305, // "n"
  }
,
{ // state 1263
1,476, // start
2,32, // ws*
3,1110, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
170,666, // token*
  }
,
{ // state 1264
177,MIN_REDUCTION+359, // $NT
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1265
0x80000000|498, // match move
0x80000000|564, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1266
4,223, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
62,714, // `*
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
122,279, // "*"
139,1066, // intLit2
141,1398, // digit++
142,845, // digit
150,702, // letter
173,7, // digit+
  }
,
{ // state 1267
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1268
0x80000000|406, // match move
0x80000000|838, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1269
0x80000000|1068, // match move
0x80000000|567, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1270
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+233, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1271
102,66, // "t"
  }
,
{ // state 1272
0x80000000|8, // match move
0x80000000|411, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1273
92,892, // "e"
  }
,
{ // state 1274
0x80000000|542, // match move
0x80000000|926, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1275
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1276
93,1071, // "a"
  }
,
{ // state 1277
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+89, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
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
{ // state 1278
90,1235, // "o"
  }
,
{ // state 1279
2,234, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1280
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1281
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1282
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1283
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1284
177,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1285
-1, // $$start
-1, // start
202, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+195, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+195, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+195, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+195, // "u"
1487, // "p"
MIN_REDUCTION+195, // "h"
496, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
830, // "g"
MIN_REDUCTION+195, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+195, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 1286
-1, // $$start
-1, // start
170, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+90, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+90, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+90, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+90, // "u"
1487, // "p"
MIN_REDUCTION+90, // "h"
496, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
830, // "g"
MIN_REDUCTION+90, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+90, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1287
-1, // $$start
-1, // start
1418, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+257, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1288
177,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1289
0x80000000|239, // match move
0x80000000|464, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1290
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1291
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1292
0x80000000|299, // match move
0x80000000|818, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1293
0x80000000|1199, // match move
0x80000000|870, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1294
177,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1295
2,1159, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1296
0x80000000|163, // match move
0x80000000|330, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1297
0x80000000|456, // match move
0x80000000|65, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 1298
0x80000000|1, // match move
0x80000000|1562, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1299
0x80000000|1, // match move
0x80000000|1241, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1300
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1301
0x80000000|524, // match move
0x80000000|1114, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1302
0x80000000|1624, // match move
0x80000000|140, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1303
100,1225, // "s"
102,1047, // "t"
  }
,
{ // state 1304
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1305
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1306
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+218, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1307
2,547, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1308
177,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1309
0x80000000|1034, // match move
0x80000000|860, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1310
177,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1311
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1312
90,1072, // "o"
  }
,
{ // state 1313
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1314
0x80000000|1646, // match move
0x80000000|751, // no-match move
0x80000000|396, // NT-test-match state for printable
  }
,
{ // state 1315
-1, // $$start
-1, // start
825, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+237, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+237, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+237, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+237, // "u"
1487, // "p"
MIN_REDUCTION+237, // "h"
496, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
830, // "g"
MIN_REDUCTION+237, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+237, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1316
0x80000000|1505, // match move
0x80000000|869, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1317
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1318
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+128, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1319
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1320
0x80000000|465, // match move
0x80000000|1027, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1321
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1322
0x80000000|1568, // match move
0x80000000|639, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1323
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1324
91,1084, // "l"
  }
,
{ // state 1325
0x80000000|1, // match move
0x80000000|1061, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1326
2,581, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1327
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1328
177,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1329
0x80000000|122, // match move
0x80000000|737, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1330
0x80000000|1360, // match move
0x80000000|1142, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1331
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1332
2,592, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1333
0x80000000|535, // match move
0x80000000|742, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1334
0x80000000|1512, // match move
0x80000000|26, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1335
105,1094, // "i"
  }
,
{ // state 1336
0x80000000|309, // match move
0x80000000|361, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1337
0x80000000|1447, // match move
0x80000000|856, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1338
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1339
177,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1340
0x80000000|1479, // match move
0x80000000|74, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1341
0x80000000|1119, // match move
0x80000000|1610, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1342
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1343
97,679, // "r"
  }
,
{ // state 1344
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1345
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1346
0x80000000|756, // match move
0x80000000|1454, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1347
0x80000000|1021, // match move
0x80000000|253, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 1348
-1, // $$start
-1, // start
791, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+204, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+204, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+204, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+204, // "u"
1487, // "p"
MIN_REDUCTION+204, // "h"
496, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
830, // "g"
MIN_REDUCTION+204, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+204, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1349
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1350
177,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1351
90,412, // "o"
  }
,
{ // state 1352
0x80000000|351, // match move
0x80000000|188, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1353
2,1575, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1354
0x80000000|431, // match move
0x80000000|621, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1355
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1356
-1, // $$start
-1, // start
236, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+213, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+213, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+213, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+213, // "u"
1487, // "p"
MIN_REDUCTION+213, // "h"
496, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
830, // "g"
MIN_REDUCTION+213, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+213, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1357
-1, // $$start
-1, // start
417, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+108, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+108, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+108, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+108, // "u"
1487, // "p"
MIN_REDUCTION+108, // "h"
496, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
830, // "g"
MIN_REDUCTION+108, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+108, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1358
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1359
177,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1360
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1361
0x80000000|1608, // match move
0x80000000|1073, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1362
0x80000000|1, // match move
0x80000000|1507, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1363
0x80000000|468, // match move
0x80000000|797, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1364
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1365
0x80000000|1, // match move
0x80000000|1112, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 1366
0x80000000|874, // match move
0x80000000|1599, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1367
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+182, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1368
0x80000000|1372, // match move
0x80000000|340, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1369
0x80000000|1328, // match move
0x80000000|247, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1370
3,750, // $$0
4,485, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
170,666, // token*
  }
,
{ // state 1371
177,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1372
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1373
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+215, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1374
-1, // $$start
-1, // start
1265, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+138, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+138, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+138, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+138, // "u"
1487, // "p"
MIN_REDUCTION+138, // "h"
496, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
830, // "g"
MIN_REDUCTION+138, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+138, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1375
177,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1376
0x80000000|1179, // match move
0x80000000|1224, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1377
0x80000000|928, // match move
0x80000000|1133, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1378
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1379
0x80000000|1263, // match move
0x80000000|1099, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1380
91,799, // "l"
  }
,
{ // state 1381
2,234, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1382
177,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1383
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1384
-1, // $$start
-1, // start
215, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+180, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+180, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+180, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+180, // "u"
1487, // "p"
MIN_REDUCTION+180, // "h"
496, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
830, // "g"
MIN_REDUCTION+180, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+180, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1385
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1386
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+209, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1387
177,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1388
0x80000000|134, // match move
0x80000000|551, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1389
0x80000000|1, // match move
0x80000000|1128, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1390
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+206, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1391
2,541, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1392
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1393
0x80000000|536, // match move
0x80000000|887, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1394
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1395
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1396
0x80000000|62, // match move
0x80000000|1127, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1397
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1398
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1399
-1, // $$start
-1, // start
1191, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+240, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+240, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+240, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+240, // "u"
1487, // "p"
MIN_REDUCTION+240, // "h"
496, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
830, // "g"
MIN_REDUCTION+240, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+240, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1400
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1401
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1402
177,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1403
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+107, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1404
0x80000000|1617, // match move
0x80000000|644, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1405
0x80000000|419, // match move
0x80000000|1538, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1406
0x80000000|608, // match move
0x80000000|579, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1407
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1408
0x80000000|381, // match move
0x80000000|1519, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1409
0x80000000|1120, // match move
0x80000000|1597, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1410
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1411
2,1090, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1412
-1, // $$start
-1, // start
557, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+129, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+129, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+129, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+129, // "u"
1487, // "p"
MIN_REDUCTION+129, // "h"
496, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
830, // "g"
MIN_REDUCTION+129, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+129, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1413
2,633, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1414
0x80000000|1051, // match move
0x80000000|1339, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 1415
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1416
177,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1417
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+131, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1418
0x80000000|934, // match move
0x80000000|924, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1419
93,752, // "a"
  }
,
{ // state 1420
0x80000000|282, // match move
0x80000000|1531, // no-match move
// T-test match for {'"' "\"}:
144,
146,
  }
,
{ // state 1421
92,736, // "e"
  }
,
{ // state 1422
94,1255, // "n"
97,168, // "r"
102,426, // "t"
104,1488, // "f"
143,112, // "'"
144,390, // "\"
146,572, // '"'
  }
,
{ // state 1423
177,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1424
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+307, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1425
105,1432, // "i"
109,1489, // "h"
  }
,
{ // state 1426
177,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1427
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1428
-1, // $$start
-1, // start
-1, // ws*
750, // $$0
485, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
-1, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
666, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1429
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1430
92,1237, // "e"
  }
,
{ // state 1431
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1432
102,424, // "t"
  }
,
{ // state 1433
2,1652, // ws*
158,810, // $$2
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1434
177,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1435
0x80000000|826, // match move
0x80000000|500, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1436
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1437
0x80000000|1, // match move
0x80000000|1070, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1438
177,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1439
0x80000000|642, // match move
0x80000000|972, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1440
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1441
0x80000000|1125, // match move
0x80000000|1638, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1442
0x80000000|1283, // match move
0x80000000|1452, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1443
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1444
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1445
-1, // $$start
-1, // start
1159, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
-1, // `=
-1, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
MIN_REDUCTION+285, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+285, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1446
0x80000000|1549, // match move
0x80000000|603, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1447
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1448
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1449
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1450
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1451
0x80000000|113, // match move
0x80000000|534, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1452
0x80000000|68, // match move
0x80000000|199, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1453
177,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1454
-1, // $$start
-1, // start
1596, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+117, // "o"
1573, // "l"
880, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+117, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+117, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+117, // "u"
1487, // "p"
MIN_REDUCTION+117, // "h"
496, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
830, // "g"
MIN_REDUCTION+117, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+117, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1455
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1456
0x80000000|260, // match move
0x80000000|1396, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1457
99,660, // "c"
  }
,
{ // state 1458
0x80000000|1436, // match move
0x80000000|844, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1459
114,432, // "z"
  }
,
{ // state 1460
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1461
92,853, // "e"
  }
,
{ // state 1462
102,862, // "t"
  }
,
{ // state 1463
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1464
0x80000000|1169, // match move
0x80000000|779, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1465
2,1652, // ws*
158,810, // $$2
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1466
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1467
0x80000000|1397, // match move
0x80000000|1062, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1468
0x80000000|1395, // match move
0x80000000|552, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1469
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1470
0x80000000|47, // match move
0x80000000|248, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1471
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1472
0x80000000|1, // match move
0x80000000|1635, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1473
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1474
177,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1475
177,MIN_REDUCTION+345, // $NT
  }
,
{ // state 1476
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1477
177,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1478
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1479
2,1149, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1480
177,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1481
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1482
0x80000000|1295, // match move
0x80000000|244, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1483
0x80000000|118, // match move
0x80000000|1557, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1484
0x80000000|174, // match move
0x80000000|158, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1485
122,1165, // "*"
  }
,
{ // state 1486
2,170, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1487
93,1145, // "a"
97,90, // "r"
107,978, // "u"
  }
,
{ // state 1488
177,MIN_REDUCTION+329, // $NT
  }
,
{ // state 1489
105,491, // "i"
  }
,
{ // state 1490
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1491
122,342, // "*"
163,1485, // commentContent**
175,446, // commentContent*
  }
,
{ // state 1492
0x80000000|1, // match move
0x80000000|1379, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1493
104,443, // "f"
  }
,
{ // state 1494
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+258, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+258, // $
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
{ // state 1495
0x80000000|1006, // match move
0x80000000|1619, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1496
0x80000000|1060, // match move
0x80000000|835, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1497
90,24, // "o"
97,241, // "r"
111,246, // "y"
  }
,
{ // state 1498
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+167, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1499
2,512, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1500
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1501
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1502
100,486, // "s"
  }
,
{ // state 1503
0x80000000|657, // match move
0x80000000|1046, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1504
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1505
2,308, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1506
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1507
0x80000000|1628, // match move
0x80000000|905, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1508
177,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1509
94,1056, // "n"
104,1606, // "f"
112,1226, // "m"
  }
,
{ // state 1510
93,1534, // "a"
97,796, // "r"
109,682, // "h"
  }
,
{ // state 1511
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1512
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1513
177,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1514
0x80000000|635, // match move
0x80000000|470, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1515
0x80000000|463, // match move
0x80000000|1354, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1516
0x80000000|1124, // match move
0x80000000|815, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1517
0x80000000|974, // match move
0x80000000|1348, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1518
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1519
0x80000000|487, // match move
0x80000000|375, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1520
177,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1521
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1522
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+268, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1523
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1524
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1525
0x80000000|1009, // match move
0x80000000|543, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1526
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1527
0x80000000|836, // match move
0x80000000|601, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1528
90,744, // "o"
  }
,
{ // state 1529
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1530
0x80000000|1106, // match move
0x80000000|746, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1531
89,1402, // "b"
90,1402, // "o"
91,1402, // "l"
92,1402, // "e"
93,1402, // "a"
94,1402, // "n"
97,1402, // "r"
98,1402, // "k"
99,1402, // "c"
100,1402, // "s"
101,1402, // "x"
102,1402, // "t"
103,1402, // "d"
104,1402, // "f"
105,1402, // "i"
106,1402, // "w"
107,1402, // "u"
108,1402, // "p"
109,1402, // "h"
110,1402, // "v"
111,1402, // "y"
112,1402, // "m"
113,1402, // "g"
114,1402, // "z"
115,1402, // "!"
116,1402, // "="
117,1402, // "%"
118,1402, // "&"
119,1402, // "("
120,1402, // ")"
121,1402, // "/"
122,1402, // "*"
123,1402, // "+"
124,1402, // ","
125,1402, // "-"
126,1402, // "."
127,1402, // ":"
128,1402, // ";"
129,1402, // "<"
130,1402, // ">"
131,1402, // "["
132,1402, // "]"
133,1402, // "{"
134,1402, // "}"
135,1402, // "|"
136,1402, // "0"
137,1402, // {"1".."9"}
138,1402, // "X"
143,1402, // "'"
144,1402, // "\"
145,175, // printable
146,1402, // '"'
151,1402, // "_"
152,1402, // {"A".."W" "Y".."Z" "j" "q"}
153,1402, // " "
154,1402, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 1532
4,223, // token
5,937, // `boolean
6,1230, // `class
7,939, // `extends
8,4, // `void
9,207, // `int
10,1030, // `while
11,1542, // `if
12,1338, // `else
13,1139, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1429, // `true
18,1407, // `super
19,37, // `null
20,81, // `return
21,655, // `instanceof
22,1593, // `new
23,631, // `abstract
24,1524, // `assert
25,1236, // `byte
26,317, // `case
27,1240, // `catch
28,1074, // `char
29,310, // `const
30,1177, // `continue
31,1166, // `default
32,1504, // `do
33,130, // `double
34,42, // `enum
35,499, // `final
36,1444, // `finally
37,489, // `float
38,149, // `goto
39,1589, // `implements
40,852, // `import
41,1010, // `interface
42,1115, // `long
43,1471, // `native
44,1529, // `package
45,1449, // `private
46,449, // `protected
47,614, // `public
48,1629, // `short
49,526, // `static
50,667, // `strictfp
51,80, // `switch
52,268, // `synchronized
53,1147, // `throw
54,1275, // `throws
55,222, // `transient
56,435, // `try
57,574, // `volatile
  }
,
{ // state 1533
2,565, // ws*
153,917, // " "
159,1550, // ws
160,917, // {9}
161,1069, // eol
168,1605, // {10}
169,1414, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1534
102,101, // "t"
  }
,
{ // state 1535
-1, // $$start
-1, // start
1038, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+287, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1536
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+140, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1537
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1538
0x80000000|764, // match move
0x80000000|123, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1539
0x80000000|1092, // match move
0x80000000|1631, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1540
-1, // $$start
-1, // start
1652, // ws*
-1, // $$0
MIN_REDUCTION+335, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+335, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+335, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+335, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+335, // "u"
1487, // "p"
MIN_REDUCTION+335, // "h"
496, // "v"
MIN_REDUCTION+335, // "y"
MIN_REDUCTION+335, // "m"
830, // "g"
MIN_REDUCTION+335, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+335, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+335, // {"1".."9"}
MIN_REDUCTION+335, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+335, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
1004, // idChar**
528, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
1309, // idChar*
-1, // commentContent*
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 1541
177,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1542
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1543
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1544
177,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1545
0x80000000|1036, // match move
0x80000000|843, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1546
-1, // $$start
-1, // start
1575, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+186, // "o"
653, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+186, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+186, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+186, // "u"
1487, // "p"
MIN_REDUCTION+186, // "h"
496, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
830, // "g"
MIN_REDUCTION+186, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+186, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1547
0x80000000|805, // match move
0x80000000|77, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1548
177,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1549
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1550
177,MIN_REDUCTION+360, // $NT
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1551
103,952, // "d"
  }
,
{ // state 1552
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1553
89,1122, // "b"
90,1122, // "o"
91,1122, // "l"
92,1122, // "e"
93,1122, // "a"
94,1122, // "n"
97,1122, // "r"
98,1122, // "k"
99,1122, // "c"
100,1122, // "s"
101,1122, // "x"
102,1122, // "t"
103,1122, // "d"
104,1122, // "f"
105,1122, // "i"
106,1122, // "w"
107,1122, // "u"
108,1122, // "p"
109,1122, // "h"
110,1122, // "v"
111,1122, // "y"
112,1122, // "m"
113,1122, // "g"
114,1122, // "z"
136,218, // "0"
137,218, // {"1".."9"}
138,1122, // "X"
142,384, // digit
150,1375, // letter
151,1247, // "_"
152,1122, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1554
0x80000000|1, // match move
0x80000000|1647, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1555
0x80000000|1326, // match move
0x80000000|1621, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1556
0x80000000|1, // match move
0x80000000|1517, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1557
0x80000000|910, // match move
0x80000000|274, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1558
0x80000000|1506, // match move
0x80000000|1369, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1559
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+288, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1560
177,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1561
102,1607, // "t"
106,801, // "w"
107,128, // "u"
109,1351, // "h"
111,1109, // "y"
  }
,
{ // state 1562
0x80000000|1058, // match move
0x80000000|1248, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1563
2,541, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1564
102,693, // "t"
  }
,
{ // state 1565
2,215, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1566
0x80000000|1, // match move
0x80000000|1533, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1567
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1568
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1569
-1, // $$start
-1, // start
1090, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+147, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+147, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+147, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+147, // "u"
1487, // "p"
MIN_REDUCTION+147, // "h"
496, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
830, // "g"
MIN_REDUCTION+147, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+147, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1570
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1571
0x80000000|1, // match move
0x80000000|1657, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1572
121,544, // "/"
  }
,
{ // state 1573
90,186, // "o"
  }
,
{ // state 1574
92,771, // "e"
  }
,
{ // state 1575
0x80000000|758, // match move
0x80000000|575, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1576
0x80000000|1164, // match move
0x80000000|1361, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1577
0x80000000|395, // match move
0x80000000|1267, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1578
2,308, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1579
177,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1580
177,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1581
0x80000000|925, // match move
0x80000000|1154, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1582
97,477, // "r"
109,682, // "h"
  }
,
{ // state 1583
0x80000000|1578, // match move
0x80000000|1078, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1584
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1585
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+179, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1586
177,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1587
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1588
100,626, // "s"
  }
,
{ // state 1589
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1590
2,407, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1591
0x80000000|533, // match move
0x80000000|312, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1592
0x80000000|665, // match move
0x80000000|1424, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1593
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1594
177,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1595
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1596
0x80000000|820, // match move
0x80000000|265, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1597
0x80000000|1359, // match move
0x80000000|632, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1598
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1599
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+143, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1600
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1601
-1, // $$start
-1, // start
28, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+207, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+207, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+207, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+207, // "u"
1487, // "p"
MIN_REDUCTION+207, // "h"
496, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
830, // "g"
MIN_REDUCTION+207, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+207, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1602
177,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1603
92,510, // "e"
93,569, // "a"
107,1380, // "u"
  }
,
{ // state 1604
93,661, // "a"
  }
,
{ // state 1605
177,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1606
0x80000000|1, // match move
0x80000000|1547, // no-match move
0x80000000|1553, // NT-test-match state for idChar
  }
,
{ // state 1607
93,1534, // "a"
97,1335, // "r"
  }
,
{ // state 1608
2,827, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1609
177,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1610
0x80000000|1612, // match move
0x80000000|1082, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1611
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1612
2,1320, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1613
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1614
0x80000000|1344, // match move
0x80000000|1141, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1615
2,441, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1616
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1617
177,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1618
94,649, // "n"
  }
,
{ // state 1619
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1620
91,566, // "l"
  }
,
{ // state 1621
-1, // $$start
-1, // start
581, // ws*
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+265, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1622
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1623
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1624
2,1330, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1625
97,187, // "r"
  }
,
{ // state 1626
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1627
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+309, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1628
2,986, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1629
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1630
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1631
0x80000000|522, // match move
0x80000000|124, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1632
0x80000000|829, // match move
0x80000000|620, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1633
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1634
0x80000000|292, // match move
0x80000000|1190, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1635
0x80000000|920, // match move
0x80000000|1374, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1636
0x80000000|1448, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1637
3,750, // $$0
4,485, // token
58,651, // `!
59,686, // `!=
60,1282, // `%
61,1155, // `&&
63,1181, // `(
64,1431, // `)
65,647, // `{
66,739, // `}
67,675, // `-
68,12, // `+
69,540, // `=
70,1385, // `==
71,135, // `[
72,641, // `]
73,656, // `||
74,506, // `<
75,100, // `<=
76,814, // `,
77,1323, // `>
78,884, // `>=
79,117, // `.
80,933, // `;
81,731, // `++
82,1410, // `--
83,958, // `/
84,598, // `:
85,405, // ID
86,1096, // INTLIT
87,143, // STRINGLIT
88,1543, // CHARLIT
136,1527, // "0"
150,702, // letter
159,1264, // ws
161,1069, // eol
170,666, // token*
  }
,
{ // state 1638
0x80000000|697, // match move
0x80000000|1522, // no-match move
0x80000000|503, // NT-test-match state for reserved
  }
,
{ // state 1639
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1640
0x80000000|1107, // match move
0x80000000|1412, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1641
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
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
405, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
106, // "b"
106, // "o"
106, // "l"
106, // "e"
106, // "a"
106, // "n"
-1, // idChar
-1, // reserved
106, // "r"
106, // "k"
106, // "c"
106, // "s"
106, // "x"
106, // "t"
106, // "d"
106, // "f"
106, // "i"
106, // "w"
106, // "u"
106, // "p"
106, // "h"
106, // "v"
106, // "y"
106, // "m"
106, // "g"
106, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+304, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
338, // "0"
338, // {"1".."9"}
106, // "X"
1066, // intLit2
-1, // `x
1398, // digit++
845, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
702, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1642
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1643
2,1320, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1644
-1, // $$start
-1, // start
352, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
937, // `boolean
1230, // `class
939, // `extends
4, // `void
207, // `int
1030, // `while
1542, // `if
1338, // `else
1139, // `for
357, // `break
172, // `this
137, // `false
1429, // `true
1407, // `super
37, // `null
81, // `return
655, // `instanceof
1593, // `new
631, // `abstract
1524, // `assert
1236, // `byte
317, // `case
1240, // `catch
1074, // `char
310, // `const
1177, // `continue
1166, // `default
1504, // `do
130, // `double
42, // `enum
499, // `final
1444, // `finally
489, // `float
149, // `goto
1589, // `implements
852, // `import
1010, // `interface
1115, // `long
1471, // `native
1529, // `package
1449, // `private
449, // `protected
614, // `public
1629, // `short
526, // `static
667, // `strictfp
80, // `switch
268, // `synchronized
1147, // `throw
1275, // `throws
222, // `transient
435, // `try
574, // `volatile
651, // `!
686, // `!=
1282, // `%
1155, // `&&
-1, // `*
1181, // `(
1431, // `)
647, // `{
739, // `}
675, // `-
12, // `+
540, // `=
1385, // `==
135, // `[
641, // `]
656, // `||
506, // `<
100, // `<=
814, // `,
1323, // `>
884, // `>=
117, // `.
933, // `;
731, // `++
1410, // `--
958, // `/
598, // `:
-1, // ID
1096, // INTLIT
143, // STRINGLIT
1543, // CHARLIT
1497, // "b"
MIN_REDUCTION+159, // "o"
1573, // "l"
1079, // "e"
1656, // "a"
1603, // "n"
-1, // idChar
-1, // reserved
1040, // "r"
MIN_REDUCTION+159, // "k"
539, // "c"
1561, // "s"
MIN_REDUCTION+159, // "x"
1582, // "t"
416, // "d"
230, // "f"
1509, // "i"
39, // "w"
MIN_REDUCTION+159, // "u"
1487, // "p"
MIN_REDUCTION+159, // "h"
496, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
830, // "g"
MIN_REDUCTION+159, // "z"
619, // "!"
1259, // "="
61, // "%"
263, // "&"
103, // "("
763, // ")"
1025, // "/"
MIN_REDUCTION+159, // "*"
1136, // "+"
685, // ","
1515, // "-"
200, // "."
1274, // ":"
1246, // ";"
1503, // "<"
646, // ">"
1539, // "["
1655, // "]"
213, // "{"
79, // "}"
727, // "|"
1527, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
730, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
917, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1550, // ws
917, // {9}
1069, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1605, // {10}
1414, // {13}
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
{ // state 1645
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1646
89,272, // "b"
90,272, // "o"
91,272, // "l"
92,272, // "e"
93,272, // "a"
94,272, // "n"
97,272, // "r"
98,272, // "k"
99,272, // "c"
100,272, // "s"
101,272, // "x"
102,272, // "t"
103,272, // "d"
104,272, // "f"
105,272, // "i"
106,272, // "w"
107,272, // "u"
108,272, // "p"
109,272, // "h"
110,272, // "v"
111,272, // "y"
112,272, // "m"
113,272, // "g"
114,272, // "z"
115,272, // "!"
116,272, // "="
117,272, // "%"
118,272, // "&"
119,272, // "("
120,272, // ")"
121,272, // "/"
122,272, // "*"
123,272, // "+"
124,272, // ","
125,272, // "-"
126,272, // "."
127,272, // ":"
128,272, // ";"
129,272, // "<"
130,272, // ">"
131,272, // "["
132,272, // "]"
133,272, // "{"
134,272, // "}"
135,272, // "|"
136,272, // "0"
137,272, // {"1".."9"}
138,272, // "X"
143,272, // "'"
144,272, // "\"
145,1144, // printable
146,272, // '"'
151,272, // "_"
152,272, // {"A".."W" "Y".."Z" "j" "q"}
153,272, // " "
154,272, // {"#".."$" "?".."@" "^" "`" "~"}
162,1168, // printable**
171,354, // printable*
  }
,
{ // state 1647
0x80000000|587, // match move
0x80000000|1156, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1648
0x80000000|713, // match move
0x80000000|447, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1649
2,308, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1650
0x80000000|1523, // match move
0x80000000|1228, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1651
2,743, // ws*
159,1550, // ws
161,1069, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1652
0x80000000|706, // match move
0x80000000|1195, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1653
0x80000000|689, // match move
0x80000000|295, // no-match move
0x80000000|1420, // NT-test-match state for stringChar
  }
,
{ // state 1654
159,1264, // ws
161,1069, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1655
0x80000000|1075, // match move
0x80000000|1576, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1656
89,1502, // "b"
100,379, // "s"
  }
,
{ // state 1657
0x80000000|784, // match move
0x80000000|257, // no-match move
// T-test match for "*":
122,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1658][];
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
// `* ::= !"/" "*" !"/" ws*
(62<<16)+2,
// `* ::= !"/" "*" !"/"
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
// escapeSlash ::= "\"
(155<<16)+1,
// stringChar ::= escapeSlash "\"
(149<<16)+2,
// stringChar ::= escapeSlash '"'
(149<<16)+2,
// stringChar ::= escapeSlash "'"
(149<<16)+2,
// stringChar ::= escapeSlash "n"
(149<<16)+2,
// stringChar ::= escapeSlash "t"
(149<<16)+2,
// stringChar ::= escapeSlash "f"
(149<<16)+2,
// stringChar ::= escapeSlash "r"
(149<<16)+2,
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
(159<<16)+1,
// ws ::= eol
(159<<16)+1,
// ws ::= "/" "/" printable** eol
(159<<16)+4,
// ws ::= "/" "/" !printable eol
(159<<16)+3,
// ws ::= "/" "*" commentContent** "*" "/"
(159<<16)+5,
// ws ::= "/" "*" !commentContent "*" "/"
(159<<16)+4,
// nestedCommentStart ::= "/" "*"
(165<<16)+2,
// nestedCommentEnd ::= "*" "/"
(166<<16)+2,
// commentElement ::= nestedCommentStart
(167<<16)+1,
// commentElement ::= nestedCommentEnd
(167<<16)+1,
// commentContent ::= !commentElement printable
(164<<16)+1,
// commentContent ::= eol
(164<<16)+1,
// commentContent ::= nestedCommentStart
(164<<16)+1,
// eol ::= {10}
(161<<16)+1,
// eol ::= {13} {10}
(161<<16)+2,
// eol ::= {13} !10
(161<<16)+1,
// token* ::= token* token
(170<<16)+2,
// token* ::= token
(170<<16)+1,
// printable** ::= printable* !printable
(162<<16)+1,
// stringChar** ::= stringChar* !stringChar
(156<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// idChar** ::= idChar* !idChar
(157<<16)+1,
// commentContent** ::= commentContent* !commentContent
(163<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(173<<16)+1,
// digit+ ::= digit+ digit
(173<<16)+2,
// commentContent* ::= commentContent* commentContent
(175<<16)+2,
// commentContent* ::= commentContent
(175<<16)+1,
// printable* ::= printable* printable
(171<<16)+2,
// printable* ::= printable
(171<<16)+1,
// stringChar* ::= stringChar* stringChar
(172<<16)+2,
// stringChar* ::= stringChar
(172<<16)+1,
// idChar* ::= idChar* idChar
(174<<16)+2,
// idChar* ::= idChar
(174<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= '"' ws*
(148<<16)+2,
// $$1 ::= '"'
(148<<16)+1,
// $$2 ::= ws*
(158<<16)+1,
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
160, // 9
168, // 10
-1, // 11
-1, // 12
169, // 13
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
122, // "*"
123, // "+"
124, // ","
125, // "-"
126, // "."
121, // "/"
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
"`* ::= !\"/\" \"*\" !\"/\" ws*", // 260
"`* ::= !\"/\" \"*\" !\"/\" ws*", // 261
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
"escapeSlash ::= \"\\\"", // 323
"stringChar ::= # escapeSlash \"\\\"", // 324
"stringChar ::= # escapeSlash \'\"\'", // 325
"stringChar ::= # escapeSlash \"\'\"", // 326
"stringChar ::= # escapeSlash \"n\"", // 327
"stringChar ::= # escapeSlash \"t\"", // 328
"stringChar ::= # escapeSlash \"f\"", // 329
"stringChar ::= # escapeSlash \"r\"", // 330
"stringWord ::= stringChar**", // 331
"ID ::= !reserved letter idChar** ws*", // 332
"ID ::= !reserved letter idChar** ws*", // 333
"ID ::= !reserved letter idChar** ws*", // 334
"ID ::= !reserved letter idChar** ws*", // 335
"ws ::= {9 \" \"}", // 336
"ws ::= eol", // 337
"ws ::= \"/\" \"/\" printable** eol", // 338
"ws ::= \"/\" \"/\" printable** eol", // 339
"ws ::= \"/\" \"*\" commentContent** \"*\" \"/\"", // 340
"ws ::= \"/\" \"*\" commentContent** \"*\" \"/\"", // 341
"nestedCommentStart ::= \"/\" \"*\"", // 342
"nestedCommentEnd ::= \"*\" \"/\"", // 343
"commentElement ::= nestedCommentStart", // 344
"commentElement ::= nestedCommentEnd", // 345
"commentContent ::= !commentElement printable", // 346
"commentContent ::= eol", // 347
"commentContent ::= # nestedCommentStart", // 348
"eol ::= {10} registerNewline", // 349
"eol ::= {13} {10} registerNewline", // 350
"eol ::= {13} !10 registerNewline", // 351
"token* ::= token* token", // 352
"token* ::= token* token", // 353
"printable** ::= printable* !printable", // 354
"stringChar** ::= stringChar* !stringChar", // 355
"digit++ ::= digit+ !digit", // 356
"idChar** ::= idChar* !idChar", // 357
"commentContent** ::= commentContent* !commentContent", // 358
"ws* ::= ws* ws", // 359
"ws* ::= ws* ws", // 360
"digit+ ::= digit", // 361
"digit+ ::= digit+ digit", // 362
"commentContent* ::= commentContent* commentContent", // 363
"commentContent* ::= commentContent* commentContent", // 364
"printable* ::= printable* printable", // 365
"printable* ::= printable* printable", // 366
"stringChar* ::= stringChar* stringChar", // 367
"stringChar* ::= stringChar* stringChar", // 368
"idChar* ::= idChar* idChar", // 369
"idChar* ::= idChar* idChar", // 370
"", // 371
"", // 372
"", // 373
"", // 374
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
    { // 260: `* ::= !"/" "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `* ::= !"/" "*" !"/" [ws*] @void
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
    { // 323: escapeSlash ::= "\" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: stringChar ::= [#] escapeSlash "\" @escapeBackslash(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 325: stringChar ::= [#] escapeSlash '"' @escapeDoubleQuote(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 326: stringChar ::= [#] escapeSlash "'" @escapeSingleQuote(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((92<<5)|0x5)/*methodCall:92*/,
    },
    { // 327: stringChar ::= [#] escapeSlash "n" @escapeN(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((93<<5)|0x5)/*methodCall:93*/,
    },
    { // 328: stringChar ::= [#] escapeSlash "t" @escapeT(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((94<<5)|0x5)/*methodCall:94*/,
    },
    { // 329: stringChar ::= [#] escapeSlash "f" @escapeF(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((95<<5)|0x5)/*methodCall:95*/,
    },
    { // 330: stringChar ::= [#] escapeSlash "r" @escapeR(int,char)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((96<<5)|0x5)/*methodCall:96*/,
    },
    { // 331: stringWord ::= stringChar** @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 332: ID ::= !reserved letter idChar** $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 333: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 334: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 335: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((97<<5)|0x5)/*methodCall:97*/,
    },
    { // 336: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 337: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 339: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 340: ws ::= "/" "*" commentContent** "*" "/" @void
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
    { // 341: ws ::= "/" "*" !commentContent [commentContent**] "*" "/" @void
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
    { // 342: nestedCommentStart ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 343: nestedCommentEnd ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 344: commentElement ::= nestedCommentStart @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: commentElement ::= nestedCommentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 346: commentContent ::= !commentElement printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 347: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: commentContent ::= [#] nestedCommentStart @reportNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((98<<5)|0x5)/*methodCall:98*/,
    },
    { // 349: eol ::= {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 350: eol ::= {13} {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 351: eol ::= {13} !10 [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 352: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 353: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 354: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 355: stringChar** ::= stringChar* !stringChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 356: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 357: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 358: commentContent** ::= commentContent* !commentContent @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 359: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 360: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 361: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 362: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 365: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 366: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 367: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 368: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 369: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 370: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 371: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 372: $$1 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 373: $$1 ::= '"' [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 374: $$2 ::= ws* @pass
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
      ((99<<5)|0x5)/*methodCall:99*/,
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
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeBackslash(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 91: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeDoubleQuote(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 92: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeSingleQuote(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 93: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeN(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 94: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeT(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 95: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeF(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 96: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      Character result = actionObject.escapeR(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 97: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 98: {
      int parm0 = (Integer)si.popPb();
      actionObject.reportNestedComment(parm0);
    }
    break;
    case 99: {
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
"Character escapeBackslash(int,char)",
"Character escapeDoubleQuote(int,char)",
"Character escapeSingleQuote(int,char)",
"Character escapeN(int,char)",
"Character escapeT(int,char)",
"Character escapeF(int,char)",
"Character escapeR(int,char)",
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
2,1,
2,1,
2,1,
2,1,
2,1,
2,1,
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
    0,
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
