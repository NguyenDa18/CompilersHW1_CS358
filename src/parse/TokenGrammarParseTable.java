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
"stringChar",
"\'\"\'",
"stringWord",
"$$1",
"letter",
"\"_\"",
"{\"A\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"printable",
"\" \"",
"\"\\\"",
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
private static final int MIN_REDUCTION = 1660;
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
0x80000000|966, // match move
0x80000000|1088, // no-match move
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
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+144, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+144, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+144, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+144, // "u"
1488, // "p"
MIN_REDUCTION+144, // "h"
494, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
827, // "g"
MIN_REDUCTION+144, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+144, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+203, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|1171, // match move
0x80000000|1542, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 6
2,1036, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 7
0x80000000|559, // match move
0x80000000|1451, // no-match move
0x80000000|839, // NT-test-match state for digit
  }
,
{ // state 8
2,1205, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 9
177,MIN_REDUCTION+347, // $NT
  }
,
{ // state 10
109,1573, // "h"
  }
,
{ // state 11
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 12
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 13
0x80000000|1005, // match move
0x80000000|1391, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 14
-1, // $$start
-1, // start
1471, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+228, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+228, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+228, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+228, // "u"
1488, // "p"
MIN_REDUCTION+228, // "h"
494, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
827, // "g"
MIN_REDUCTION+228, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+228, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 15
0x80000000|1, // match move
0x80000000|801, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 16
177,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 17
100,1051, // "s"
  }
,
{ // state 18
177,MIN_REDUCTION+145, // $NT
  }
,
{ // state 19
2,1369, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 20
123,691, // "+"
  }
,
{ // state 21
2,351, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 22
105,1622, // "i"
  }
,
{ // state 23
90,989, // "o"
  }
,
{ // state 24
0x80000000|45, // match move
0x80000000|804, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 25
0x80000000|1291, // match move
0x80000000|1043, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 26
177,MIN_REDUCTION+136, // $NT
  }
,
{ // state 27
0x80000000|1554, // match move
0x80000000|1137, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 28
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 29
159,1264, // ws
161,1067, // eol
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+197, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 31
0x80000000|1366, // match move
0x80000000|1220, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 32
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 33
2,1409, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 34
0x80000000|112, // match move
0x80000000|1367, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 35
100,309, // "s"
102,713, // "t"
  }
,
{ // state 36
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 37
2,1653, // ws*
158,807, // $$2
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 38
109,1490, // "h"
  }
,
{ // state 39
105,1460, // "i"
  }
,
{ // state 40
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+116, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 41
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|97, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 43
2,999, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 44
102,797, // "t"
  }
,
{ // state 45
2,1021, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 46
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 47
102,608, // "t"
  }
,
{ // state 48
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 50
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 52
0x80000000|332, // match move
0x80000000|678, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 53
0x80000000|171, // match move
0x80000000|346, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 54
0x80000000|1151, // match move
0x80000000|570, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 55
0x80000000|1382, // match move
0x80000000|151, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 56
177,MIN_REDUCTION+229, // $NT
  }
,
{ // state 57
0x80000000|1522, // match move
0x80000000|225, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 58
-1, // $$start
-1, // start
1134, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+201, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+201, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+201, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+201, // "u"
1488, // "p"
MIN_REDUCTION+201, // "h"
494, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
827, // "g"
MIN_REDUCTION+201, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+201, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 59
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+119, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 60
0x80000000|270, // match move
0x80000000|205, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 61
177,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 62
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 63
100,212, // "s"
  }
,
{ // state 64
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|133, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 66
102,1494, // "t"
  }
,
{ // state 67
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 68
177,MIN_REDUCTION+208, // $NT
  }
,
{ // state 69
0x80000000|6, // match move
0x80000000|1536, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 70
91,1276, // "l"
105,1553, // "i"
  }
,
{ // state 71
0x80000000|882, // match move
0x80000000|1603, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 72
0x80000000|1435, // match move
0x80000000|865, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 73
-1, // $$start
-1, // start
1148, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+251, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 74
0x80000000|1611, // match move
0x80000000|820, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 75
4,223, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
  }
,
{ // state 76
-1, // $$start
-1, // start
569, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+111, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+111, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+111, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+111, // "u"
1488, // "p"
MIN_REDUCTION+111, // "h"
494, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
827, // "g"
MIN_REDUCTION+111, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+111, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 77
2,800, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 78
0x80000000|1565, // match move
0x80000000|917, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 79
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 81
0x80000000|1227, // match move
0x80000000|1465, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 82
144,199, // stringChar
153,98, // "\"
155,1423, // escapeSlash
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+372, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+221, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
145,399, // '"'
147,963, // $$1
  }
,
{ // state 86
177,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 87
0x80000000|371, // match move
0x80000000|1287, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 88
92,1139, // "e"
  }
,
{ // state 89
177,MIN_REDUCTION+205, // $NT
  }
,
{ // state 90
90,994, // "o"
105,455, // "i"
  }
,
{ // state 91
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 92
177,MIN_REDUCTION+223, // $NT
  }
,
{ // state 93
177,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 94
94,925, // "n"
  }
,
{ // state 95
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 96
2,1378, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 97
0x80000000|1412, // match move
0x80000000|1571, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 98
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 100
105,1152, // "i"
  }
,
{ // state 101
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 102
0x80000000|148, // match move
0x80000000|318, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 103
90,299, // "o"
  }
,
{ // state 104
94,1136, // "n"
  }
,
{ // state 105
0x80000000|901, // match move
0x80000000|973, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 106
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 107
0x80000000|1331, // match move
0x80000000|1012, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 108
-1, // $$start
-1, // start
57, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+135, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+135, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+135, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+135, // "u"
1488, // "p"
MIN_REDUCTION+135, // "h"
494, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
827, // "g"
MIN_REDUCTION+135, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+135, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 109
177,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 110
93,623, // "a"
  }
,
{ // state 111
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 112
159,1264, // ws
161,1067, // eol
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+158, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 116
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 117
99,897, // "c"
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+254, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
93,1025, // "a"
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+239, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|259, // match move
0x80000000|790, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 123
121,552, // "/"
164,1131, // commentContent
165,1636, // nestedCommentStart
  }
,
{ // state 124
100,1473, // "s"
  }
,
{ // state 125
0x80000000|735, // match move
0x80000000|176, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 126
108,904, // "p"
  }
,
{ // state 127
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 129
2,861, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 130
-1, // $$start
474, // start
31, // ws*
1109, // $$0
483, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
-1, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
663, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 131
0x80000000|553, // match move
0x80000000|880, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 132
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 133
0x80000000|927, // match move
0x80000000|936, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 134
159,1264, // ws
161,1067, // eol
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
0x80000000|412, // match move
0x80000000|670, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 141
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 142
2,1254, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 144
0x80000000|1196, // match move
0x80000000|477, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 145
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 146
0x80000000|787, // match move
0x80000000|1250, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 147
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 148
2,1419, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 150
0x80000000|1543, // match move
0x80000000|958, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 151
0x80000000|1279, // match move
0x80000000|196, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 152
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 153
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 154
98,1606, // "k"
  }
,
{ // state 155
2,862, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 156
2,993, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 157
0x80000000|814, // match move
0x80000000|34, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 158
0x80000000|996, // match move
0x80000000|1277, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 159
1,474, // start
2,31, // ws*
3,1109, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
89,1498, // "b"
91,1575, // "l"
92,1077, // "e"
93,1657, // "a"
94,1605, // "n"
97,1038, // "r"
99,537, // "c"
100,1563, // "s"
102,1584, // "t"
103,415, // "d"
104,230, // "f"
105,1510, // "i"
106,38, // "w"
108,1488, // "p"
110,494, // "v"
113,827, // "g"
170,663, // token*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+95, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
161,1067, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 162
0x80000000|1317, // match move
0x80000000|964, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 163
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 164
0x80000000|1242, // match move
0x80000000|1130, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 165
0x80000000|1102, // match move
0x80000000|972, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 166
0x80000000|344, // match move
0x80000000|544, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 167
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 168
177,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 169
-1, // $$start
-1, // start
999, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+255, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|834, // match move
0x80000000|1485, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 171
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 173
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 174
177,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 175
0x80000000|1087, // match move
0x80000000|799, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 176
-1, // $$start
-1, // start
52, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+222, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+222, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+222, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+222, // "u"
1488, // "p"
MIN_REDUCTION+222, // "h"
494, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
827, // "g"
MIN_REDUCTION+222, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+222, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 177
177,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 178
0x80000000|21, // match move
0x80000000|1645, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 179
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 180
2,1334, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 181
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 182
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+300, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 183
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+301, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 184
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 185
94,856, // "n"
  }
,
{ // state 186
94,877, // "n"
  }
,
{ // state 187
-1, // $$start
-1, // start
705, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+373, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 188
177,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 189
0x80000000|766, // match move
0x80000000|30, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 190
177,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 191
0x80000000|180, // match move
0x80000000|348, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 192
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 193
177,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 194
177,MIN_REDUCTION+181, // $NT
  }
,
{ // state 195
2,965, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 196
0x80000000|669, // match move
0x80000000|390, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 197
0x80000000|954, // match move
0x80000000|1281, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 198
0x80000000|193, // match move
0x80000000|1418, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 199
143,540, // "'"
  }
,
{ // state 200
0x80000000|873, // match move
0x80000000|997, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 201
0x80000000|712, // match move
0x80000000|1300, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 202
0x80000000|1161, // match move
0x80000000|874, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 203
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 204
0x80000000|1401, // match move
0x80000000|1583, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 205
0x80000000|1307, // match move
0x80000000|1634, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 206
0x80000000|1204, // match move
0x80000000|527, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 207
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 208
0x80000000|1219, // match move
0x80000000|919, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 209
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 210
0x80000000|235, // match move
0x80000000|1429, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 211
0x80000000|1628, // match move
0x80000000|1624, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 213
0x80000000|864, // match move
0x80000000|1026, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 214
0x80000000|829, // match move
0x80000000|1057, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 215
0x80000000|517, // match move
0x80000000|915, // no-match move
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
0x80000000|1416, // match move
0x80000000|600, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 220
0x80000000|1310, // match move
0x80000000|1065, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 221
98,883, // "k"
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
1378, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+153, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+153, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+153, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+153, // "u"
1488, // "p"
MIN_REDUCTION+153, // "h"
494, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
827, // "g"
MIN_REDUCTION+153, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+153, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 225
0x80000000|152, // match move
0x80000000|314, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 226
110,818, // "v"
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 228
102,708, // "t"
  }
,
{ // state 229
0x80000000|1147, // match move
0x80000000|1305, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 230
90,1128, // "o"
91,256, // "l"
93,634, // "a"
105,1149, // "i"
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
{ // state 231
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 232
0x80000000|1, // match move
0x80000000|266, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 233
102,837, // "t"
  }
,
{ // state 234
0x80000000|1502, // match move
0x80000000|848, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 235
3,747, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
89,1498, // "b"
91,1575, // "l"
92,1077, // "e"
93,1657, // "a"
94,1605, // "n"
97,1038, // "r"
99,537, // "c"
100,1563, // "s"
102,1584, // "t"
103,415, // "d"
104,230, // "f"
105,1510, // "i"
106,38, // "w"
108,1488, // "p"
110,494, // "v"
113,827, // "g"
170,663, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 236
0x80000000|604, // match move
0x80000000|892, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 237
2,987, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 238
0x80000000|597, // match move
0x80000000|869, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 239
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 240
177,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 241
92,1207, // "e"
  }
,
{ // state 242
0x80000000|1252, // match move
0x80000000|611, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 243
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 244
0x80000000|977, // match move
0x80000000|505, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 245
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 246
102,838, // "t"
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+98, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|816, // match move
0x80000000|522, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 249
-1, // $$start
-1, // start
631, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
-1, // `=
-1, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
MIN_REDUCTION+289, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+289, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+230, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
89,1403, // "b"
90,1403, // "o"
91,1403, // "l"
92,1403, // "e"
93,1403, // "a"
94,1403, // "n"
97,1403, // "r"
98,1403, // "k"
99,1403, // "c"
100,1403, // "s"
101,1403, // "x"
102,1403, // "t"
103,1403, // "d"
104,1403, // "f"
105,1403, // "i"
106,1403, // "w"
107,1403, // "u"
108,1403, // "p"
109,1403, // "h"
110,1403, // "v"
111,1403, // "y"
112,1403, // "m"
113,1403, // "g"
114,1403, // "z"
115,1403, // "!"
116,1403, // "="
117,1403, // "%"
118,1403, // "&"
119,1403, // "("
120,1403, // ")"
121,1403, // "/"
122,1403, // "*"
123,1403, // "+"
124,1403, // ","
125,1403, // "-"
126,1403, // "."
127,1403, // ":"
128,1403, // ";"
129,1403, // "<"
130,1403, // ">"
131,1403, // "["
132,1403, // "]"
133,1403, // "{"
134,1403, // "}"
135,1403, // "|"
136,1403, // "0"
137,1403, // {"1".."9"}
138,1403, // "X"
143,1403, // "'"
145,1403, // '"'
149,1403, // "_"
150,1403, // {"A".."W" "Y".."Z" "j" "q"}
151,810, // printable
152,1403, // " "
153,1403, // "\"
154,1403, // {"#".."$" "?".."@" "^" "`" "~"}
161,9, // eol
168,1607, // {10}
169,1415, // {13}
  }
,
{ // state 254
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 255
2,1134, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 256
90,426, // "o"
  }
,
{ // state 257
-1, // $$start
-1, // start
1638, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+162, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+162, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+162, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+162, // "u"
1488, // "p"
MIN_REDUCTION+162, // "h"
494, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
827, // "g"
MIN_REDUCTION+162, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+162, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
2,862, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 259
2,852, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 260
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 261
-1, // $$start
-1, // start
1443, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+132, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+132, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+132, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+132, // "u"
1488, // "p"
MIN_REDUCTION+132, // "h"
494, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
827, // "g"
MIN_REDUCTION+132, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+132, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|442, // match move
0x80000000|336, // no-match move
// T-test match for {'"' "\"}:
145,
153,
  }
,
{ // state 263
118,572, // "&"
  }
,
{ // state 264
2,1471, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 265
0x80000000|980, // match move
0x80000000|1075, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 266
0x80000000|402, // match move
0x80000000|1357, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 267
-1, // $$start
-1, // start
440, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+141, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+141, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+141, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+141, // "u"
1488, // "p"
MIN_REDUCTION+141, // "h"
494, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
827, // "g"
MIN_REDUCTION+141, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+141, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|1500, // match move
0x80000000|166, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 270
2,546, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 271
0x80000000|514, // match move
0x80000000|1477, // no-match move
0x80000000|395, // NT-test-match state for printable
  }
,
{ // state 272
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 273
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+200, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 274
0x80000000|327, // match move
0x80000000|770, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 275
177,MIN_REDUCTION+344, // $NT
  }
,
{ // state 276
177,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 277
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 278
0x80000000|1, // match move
0x80000000|516, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 279
2,1334, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 280
107,491, // "u"
  }
,
{ // state 281
153,98, // "\"
155,1423, // escapeSlash
  }
,
{ // state 282
0x80000000|1466, // match move
0x80000000|988, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 283
2,1158, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 286
0x80000000|1456, // match move
0x80000000|1256, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 287
0x80000000|480, // match move
0x80000000|261, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 288
0x80000000|465, // match move
0x80000000|1642, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 289
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 290
-1, // $$start
-1, // start
1369, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+123, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+123, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+123, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+123, // "u"
1488, // "p"
MIN_REDUCTION+123, // "h"
494, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
827, // "g"
MIN_REDUCTION+123, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+123, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 291
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 292
-1, // $$start
-1, // start
965, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+126, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+126, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+126, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+126, // "u"
1488, // "p"
MIN_REDUCTION+126, // "h"
494, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
827, // "g"
MIN_REDUCTION+126, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+126, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 293
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 294
0x80000000|1192, // match move
0x80000000|863, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 295
121,1314, // "/"
122,795, // "*"
  }
,
{ // state 296
177,MIN_REDUCTION+148, // $NT
  }
,
{ // state 297
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 298
0x80000000|1223, // match move
0x80000000|895, // no-match move
// T-test match for {'"' "\"}:
145,
153,
  }
,
{ // state 299
106,614, // "w"
  }
,
{ // state 300
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+266, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 301
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+210, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+210, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+210, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+210, // "u"
1488, // "p"
MIN_REDUCTION+210, // "h"
494, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
827, // "g"
MIN_REDUCTION+210, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+210, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 302
92,42, // "e"
  }
,
{ // state 303
99,907, // "c"
  }
,
{ // state 304
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+122, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 305
122,903, // "*"
  }
,
{ // state 306
0x80000000|651, // match move
0x80000000|1293, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 307
1,474, // start
2,31, // ws*
3,1109, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
170,663, // token*
  }
,
{ // state 308
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 309
102,1438, // "t"
  }
,
{ // state 310
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+256, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 311
0x80000000|285, // match move
0x80000000|300, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 312
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 313
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+294, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 314
0x80000000|1125, // match move
0x80000000|362, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 315
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 316
93,1009, // "a"
  }
,
{ // state 317
2,999, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 318
0x80000000|376, // match move
0x80000000|87, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|287, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 320
92,549, // "e"
  }
,
{ // state 321
0x80000000|443, // match move
0x80000000|1112, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 322
177,MIN_REDUCTION+214, // $NT
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 324
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+264, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 325
0x80000000|48, // match move
0x80000000|1469, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 326
92,1299, // "e"
  }
,
{ // state 327
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 328
0x80000000|251, // match move
0x80000000|313, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 329
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 330
177,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 331
0x80000000|1035, // match move
0x80000000|906, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 332
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 333
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+125, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 334
177,MIN_REDUCTION+241, // $NT
  }
,
{ // state 335
0x80000000|1040, // match move
0x80000000|995, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 336
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
144,1654, // stringChar
145,211, // '"'
146,85, // stringWord
149,211, // "_"
150,211, // {"A".."W" "Y".."Z" "j" "q"}
151,419, // printable
152,211, // " "
153,211, // "\"
154,211, // {"#".."$" "?".."@" "^" "`" "~"}
156,1635, // stringChar**
172,893, // stringChar*
  }
,
{ // state 337
0x80000000|91, // match move
0x80000000|1129, // no-match move
0x80000000|839, // NT-test-match state for digit
  }
,
{ // state 338
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+286, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 339
0x80000000|645, // match move
0x80000000|428, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 340
177,MIN_REDUCTION+94, // $NT
  }
,
{ // state 341
121,524, // "/"
  }
,
{ // state 342
0x80000000|1, // match move
0x80000000|1272, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 343
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 344
2,510, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 345
177,MIN_REDUCTION+217, // $NT
  }
,
{ // state 346
0x80000000|277, // match move
0x80000000|189, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 347
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 348
0x80000000|511, // match move
0x80000000|183, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 349
2,909, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 350
2,705, // ws*
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 351
0x80000000|1482, // match move
0x80000000|1292, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 352
0x80000000|1028, // match move
0x80000000|1447, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 353
0x80000000|786, // match move
0x80000000|750, // no-match move
0x80000000|395, // NT-test-match state for printable
  }
,
{ // state 354
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+313, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 355
-1, // $$start
-1, // start
993, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+189, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+189, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+189, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+189, // "u"
1488, // "p"
MIN_REDUCTION+189, // "h"
494, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
827, // "g"
MIN_REDUCTION+189, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+189, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
2,579, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 359
93,1090, // "a"
  }
,
{ // state 360
2,987, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 361
1,474, // start
2,31, // ws*
3,1109, // $$0
4,483, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
83,955, // `/
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
136,1528, // "0"
148,699, // letter
159,1552, // ws
161,1067, // eol
170,663, // token*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+134, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
92,1010, // "e"
  }
,
{ // state 364
0x80000000|1304, // match move
0x80000000|409, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 365
2,909, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 366
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 367
177,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 368
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+146, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 369
177,MIN_REDUCTION+151, // $NT
  }
,
{ // state 370
91,580, // "l"
  }
,
{ // state 371
2,1419, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 372
102,15, // "t"
  }
,
{ // state 373
92,1420, // "e"
  }
,
{ // state 374
0x80000000|771, // match move
0x80000000|1253, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 375
0x80000000|1145, // match move
0x80000000|744, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 376
2,1419, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 377
177,MIN_REDUCTION+348, // $NT
  }
,
{ // state 378
100,1422, // "s"
  }
,
{ // state 379
2,450, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 380
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 381
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 382
177,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 383
177,MIN_REDUCTION+318, // $NT
  }
,
{ // state 384
99,959, // "c"
  }
,
{ // state 385
2,695, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 387
2,1036, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 388
177,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 389
177,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 390
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
-1, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
-1, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+263, // "*"
MIN_REDUCTION+263, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 391
0x80000000|1, // match move
0x80000000|335, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 392
0x80000000|588, // match move
0x80000000|1078, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 393
0x80000000|279, // match move
0x80000000|191, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 394
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 395
89,1403, // "b"
90,1403, // "o"
91,1403, // "l"
92,1403, // "e"
93,1403, // "a"
94,1403, // "n"
97,1403, // "r"
98,1403, // "k"
99,1403, // "c"
100,1403, // "s"
101,1403, // "x"
102,1403, // "t"
103,1403, // "d"
104,1403, // "f"
105,1403, // "i"
106,1403, // "w"
107,1403, // "u"
108,1403, // "p"
109,1403, // "h"
110,1403, // "v"
111,1403, // "y"
112,1403, // "m"
113,1403, // "g"
114,1403, // "z"
115,1403, // "!"
116,1403, // "="
117,1403, // "%"
118,1403, // "&"
119,1403, // "("
120,1403, // ")"
121,1403, // "/"
122,1403, // "*"
123,1403, // "+"
124,1403, // ","
125,1403, // "-"
126,1403, // "."
127,1403, // ":"
128,1403, // ";"
129,1403, // "<"
130,1403, // ">"
131,1403, // "["
132,1403, // "]"
133,1403, // "{"
134,1403, // "}"
135,1403, // "|"
136,1403, // "0"
137,1403, // {"1".."9"}
138,1403, // "X"
143,1403, // "'"
145,1403, // '"'
149,1403, // "_"
150,1403, // {"A".."W" "Y".."Z" "j" "q"}
152,1403, // " "
153,1403, // "\"
154,1403, // {"#".."$" "?".."@" "^" "`" "~"}
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
{ // state 396
0x80000000|1371, // match move
0x80000000|615, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 397
0x80000000|649, // match move
0x80000000|452, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 398
145,399, // '"'
146,85, // stringWord
147,1001, // $$1
156,1635, // stringChar**
172,893, // stringChar*
  }
,
{ // state 399
0x80000000|762, // match move
0x80000000|931, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 400
103,1133, // "d"
  }
,
{ // state 401
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 402
2,416, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 403
0x80000000|437, // match move
0x80000000|718, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 404
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 406
0x80000000|535, // match move
0x80000000|1394, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 407
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 408
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 409
0x80000000|509, // match move
0x80000000|1023, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 410
-1, // $$start
-1, // start
1205, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+120, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+120, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+120, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+120, // "u"
1488, // "p"
MIN_REDUCTION+120, // "h"
494, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
827, // "g"
MIN_REDUCTION+120, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+120, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 411
97,1000, // "r"
  }
,
{ // state 412
2,1330, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 413
89,918, // "b"
90,918, // "o"
91,918, // "l"
92,918, // "e"
93,918, // "a"
94,918, // "n"
97,918, // "r"
98,918, // "k"
99,918, // "c"
100,918, // "s"
101,918, // "x"
102,918, // "t"
103,918, // "d"
104,918, // "f"
105,918, // "i"
106,918, // "w"
107,918, // "u"
108,918, // "p"
109,918, // "h"
110,918, // "v"
111,918, // "y"
112,918, // "m"
113,918, // "g"
114,918, // "z"
115,918, // "!"
116,918, // "="
117,918, // "%"
118,918, // "&"
119,918, // "("
120,918, // ")"
121,918, // "/"
122,918, // "*"
123,918, // "+"
124,918, // ","
125,918, // "-"
126,918, // "."
127,918, // ":"
128,918, // ";"
129,918, // "<"
130,918, // ">"
131,918, // "["
132,918, // "]"
133,918, // "{"
134,918, // "}"
135,918, // "|"
136,918, // "0"
137,918, // {"1".."9"}
138,918, // "X"
143,918, // "'"
145,918, // '"'
149,918, // "_"
150,918, // {"A".."W" "Y".."Z" "j" "q"}
151,146, // printable
152,918, // " "
153,918, // "\"
154,918, // {"#".."$" "?".."@" "^" "`" "~"}
161,894, // eol
164,1131, // commentContent
168,1452, // {10}
169,1014, // {13}
  }
,
{ // state 414
0x80000000|934, // match move
0x80000000|548, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 415
90,844, // "o"
92,946, // "e"
  }
,
{ // state 416
0x80000000|1586, // match move
0x80000000|1289, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 417
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 418
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 419
0x80000000|49, // match move
0x80000000|1003, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 420
121,1314, // "/"
122,795, // "*"
  }
,
{ // state 421
2,1616, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 422
177,MIN_REDUCTION+100, // $NT
  }
,
{ // state 423
99,830, // "c"
  }
,
{ // state 424
0x80000000|203, // match move
0x80000000|756, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 425
177,MIN_REDUCTION+328, // $NT
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 426
93,1463, // "a"
  }
,
{ // state 427
0x80000000|360, // match move
0x80000000|482, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 428
0x80000000|1294, // match move
0x80000000|304, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 429
177,MIN_REDUCTION+202, // $NT
  }
,
{ // state 430
2,450, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 431
92,400, // "e"
  }
,
{ // state 432
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 433
105,1462, // "i"
  }
,
{ // state 434
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 435
2,238, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 437
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 438
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 440
0x80000000|329, // match move
0x80000000|732, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 441
108,1197, // "p"
  }
,
{ // state 442
144,1654, // stringChar
146,85, // stringWord
153,98, // "\"
155,1209, // escapeSlash
156,1635, // stringChar**
172,893, // stringChar*
  }
,
{ // state 443
177,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 444
0x80000000|689, // match move
0x80000000|386, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 445
0x80000000|775, // match move
0x80000000|1083, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 446
177,MIN_REDUCTION+91, // $NT
  }
,
{ // state 447
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 448
100,809, // "s"
  }
,
{ // state 449
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+270, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 450
0x80000000|1327, // match move
0x80000000|1442, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 451
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+170, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 452
0x80000000|1572, // match move
0x80000000|321, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 453
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+242, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 454
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 455
110,1020, // "v"
  }
,
{ // state 456
0x80000000|190, // match move
0x80000000|1387, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 457
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 458
177,MIN_REDUCTION+226, // $NT
  }
,
{ // state 459
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 460
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 461
125,1585, // "-"
  }
,
{ // state 462
0x80000000|177, // match move
0x80000000|1404, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 463
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 464
94,35, // "n"
  }
,
{ // state 465
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 466
2,1409, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 467
-1, // $$start
-1, // start
547, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+259, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 468
-1, // $$start
-1, // start
1389, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+277, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 469
0x80000000|365, // match move
0x80000000|1517, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 470
2,1330, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 471
177,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 472
0x80000000|681, // match move
0x80000000|1587, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 473
0x80000000|1081, // match move
0x80000000|806, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 474
176,MIN_REDUCTION+0, // $
  }
,
{ // state 475
93,104, // "a"
107,88, // "u"
111,1467, // "y"
  }
,
{ // state 476
0x80000000|184, // match move
0x80000000|758, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 477
0x80000000|439, // match move
0x80000000|1561, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 478
0x80000000|209, // match move
0x80000000|107, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 479
0x80000000|545, // match move
0x80000000|763, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 480
2,1443, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 481
2,1190, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 482
2,987, // ws*
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
83,955, // `/
84,596, // `:
85,404, // ID
87,143, // STRINGLIT
88,1545, // CHARLIT
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
115,617, // "!"
116,1259, // "="
117,60, // "%"
118,263, // "&"
119,102, // "("
120,760, // ")"
121,1022, // "/"
123,1135, // "+"
124,682, // ","
125,1516, // "-"
126,200, // "."
127,1274, // ":"
128,1246, // ";"
129,1504, // "<"
130,643, // ">"
131,1540, // "["
132,1656, // "]"
133,213, // "{"
134,78, // "}"
135,724, // "|"
138,105, // "X"
143,813, // "'"
145,727, // '"'
148,699, // letter
150,105, // {"A".."W" "Y".."Z" "j" "q"}
152,913, // " "
159,1552, // ws
160,913, // {9}
161,1067, // eol
168,1607, // {10}
169,1415, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 484
102,1099, // "t"
  }
,
{ // state 485
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 486
0x80000000|1062, // match move
0x80000000|84, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 487
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 488
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+191, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 489
91,302, // "l"
  }
,
{ // state 490
89,918, // "b"
90,918, // "o"
91,918, // "l"
92,918, // "e"
93,918, // "a"
94,918, // "n"
97,918, // "r"
98,918, // "k"
99,918, // "c"
100,918, // "s"
101,918, // "x"
102,918, // "t"
103,918, // "d"
104,918, // "f"
105,918, // "i"
106,918, // "w"
107,918, // "u"
108,918, // "p"
109,918, // "h"
110,918, // "v"
111,918, // "y"
112,918, // "m"
113,918, // "g"
114,918, // "z"
115,918, // "!"
116,918, // "="
117,918, // "%"
118,918, // "&"
119,918, // "("
120,918, // ")"
121,918, // "/"
122,918, // "*"
123,918, // "+"
124,918, // ","
125,918, // "-"
126,918, // "."
127,918, // ":"
128,918, // ";"
129,918, // "<"
130,918, // ">"
131,918, // "["
132,918, // "]"
133,918, // "{"
134,918, // "}"
135,918, // "|"
136,918, // "0"
137,918, // {"1".."9"}
138,918, // "X"
143,918, // "'"
145,918, // '"'
149,918, // "_"
150,918, // {"A".."W" "Y".."Z" "j" "q"}
151,146, // printable
152,918, // " "
153,918, // "\"
154,918, // {"#".."$" "?".."@" "^" "`" "~"}
161,894, // eol
163,1486, // commentContent**
164,206, // commentContent
168,1452, // {10}
169,1014, // {13}
175,444, // commentContent*
  }
,
{ // state 491
112,622, // "m"
  }
,
{ // state 492
177,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 493
0x80000000|1643, // match move
0x80000000|288, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 494
90,70, // "o"
  }
,
{ // state 495
177,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 496
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 498
0x80000000|1655, // match move
0x80000000|74, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 499
-1, // $$start
-1, // start
1212, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+171, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+171, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+171, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+171, // "u"
1488, // "p"
MIN_REDUCTION+171, // "h"
494, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
827, // "g"
MIN_REDUCTION+171, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+171, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 500
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 501
5,446, // `boolean
6,1475, // `class
7,1222, // `extends
8,18, // `void
9,1084, // `int
10,296, // `while
11,759, // `if
12,422, // `else
13,1514, // `for
14,340, // `break
15,1550, // `this
16,1308, // `false
17,1427, // `true
18,1581, // `super
19,1454, // `null
20,1120, // `return
21,1006, // `instanceof
22,1234, // `new
23,369, // `abstract
24,1588, // `assert
25,714, // `byte
26,1210, // `case
27,217, // `catch
28,1200, // `char
29,558, // `const
30,598, // `continue
31,1055, // `default
32,1546, // `do
33,194, // `double
34,1478, // `enum
35,216, // `final
36,1388, // `finally
37,1372, // `float
38,719, // `goto
39,250, // `implements
40,429, // `import
41,89, // `interface
42,68, // `long
43,1481, // `native
44,322, // `package
45,345, // `private
46,767, // `protected
47,1439, // `public
48,92, // `short
49,458, // `static
50,56, // `strictfp
51,26, // `switch
52,1063, // `synchronized
53,961, // `throw
54,1582, // `throws
55,334, // `transient
56,751, // `try
57,1162, // `volatile
89,1498, // "b"
91,1575, // "l"
92,1077, // "e"
93,1657, // "a"
94,1605, // "n"
97,1038, // "r"
99,537, // "c"
100,1563, // "s"
102,1584, // "t"
103,415, // "d"
104,230, // "f"
105,1510, // "i"
106,38, // "w"
108,1488, // "p"
110,494, // "v"
113,827, // "g"
  }
,
{ // state 502
0x80000000|19, // match move
0x80000000|290, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 503
0x80000000|1567, // match move
0x80000000|1385, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 504
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 505
0x80000000|283, // match move
0x80000000|1446, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 506
2,1174, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 507
116,1531, // "="
  }
,
{ // state 508
106,342, // "w"
  }
,
{ // state 509
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 510
0x80000000|460, // match move
0x80000000|684, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 511
2,1334, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 512
0x80000000|1597, // match move
0x80000000|778, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 513
0x80000000|358, // match move
0x80000000|1557, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 514
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 515
2,478, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 516
2,204, // ws*
152,913, // " "
159,1552, // ws
160,913, // {9}
161,1067, // eol
168,1607, // {10}
169,1415, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 517
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 518
0x80000000|584, // match move
0x80000000|95, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 519
2,852, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 520
2,705, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 521
177,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 522
0x80000000|1383, // match move
0x80000000|1017, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 523
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 524
177,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 525
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 526
177,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 528
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+274, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 529
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 530
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 531
89,1403, // "b"
90,1403, // "o"
91,1403, // "l"
92,1403, // "e"
93,1403, // "a"
94,1403, // "n"
97,1403, // "r"
98,1403, // "k"
99,1403, // "c"
100,1403, // "s"
101,1403, // "x"
102,1403, // "t"
103,1403, // "d"
104,1403, // "f"
105,1403, // "i"
106,1403, // "w"
107,1403, // "u"
108,1403, // "p"
109,1403, // "h"
110,1403, // "v"
111,1403, // "y"
112,1403, // "m"
113,1403, // "g"
114,1403, // "z"
115,1403, // "!"
116,1403, // "="
117,1403, // "%"
118,1403, // "&"
119,1403, // "("
120,1403, // ")"
121,1403, // "/"
122,1403, // "*"
123,1403, // "+"
124,1403, // ","
125,1403, // "-"
126,1403, // "."
127,1403, // ":"
128,1403, // ";"
129,1403, // "<"
130,1403, // ">"
131,1403, // "["
132,1403, // "]"
133,1403, // "{"
134,1403, // "}"
135,1403, // "|"
136,1403, // "0"
137,1403, // {"1".."9"}
138,1403, // "X"
143,1403, // "'"
144,199, // stringChar
145,1403, // '"'
149,1403, // "_"
150,1403, // {"A".."W" "Y".."Z" "j" "q"}
151,174, // printable
152,1403, // " "
153,1403, // "\"
154,1403, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 532
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 533
2,1148, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 534
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 535
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 536
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 537
90,464, // "o"
91,119, // "l"
93,1303, // "a"
109,316, // "h"
  }
,
{ // state 538
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 539
0x80000000|147, // match move
0x80000000|325, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 540
0x80000000|129, // match move
0x80000000|331, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 541
2,1389, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 542
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+280, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 543
177,MIN_REDUCTION+343, // $NT
  }
,
{ // state 544
-1, // $$start
-1, // start
510, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+279, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 545
2,862, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 546
0x80000000|1103, // match move
0x80000000|978, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 547
0x80000000|594, // match move
0x80000000|1337, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 548
0x80000000|385, // match move
0x80000000|704, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 549
99,1566, // "c"
  }
,
{ // state 550
0x80000000|970, // match move
0x80000000|1097, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 551
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+298, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 552
122,1496, // "*"
  }
,
{ // state 553
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 554
92,1620, // "e"
  }
,
{ // state 555
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 556
0x80000000|1538, // match move
0x80000000|208, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 557
0x80000000|347, // match move
0x80000000|1384, // no-match move
0x80000000|839, // NT-test-match state for digit
  }
,
{ // state 558
177,MIN_REDUCTION+169, // $NT
  }
,
{ // state 559
136,337, // "0"
137,337, // {"1".."9"}
142,557, // digit
  }
,
{ // state 560
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 561
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 562
-1, // $$start
-1, // start
1061, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+234, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+234, // "k"
537, // "c"
722, // "s"
MIN_REDUCTION+234, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+234, // "u"
1488, // "p"
MIN_REDUCTION+234, // "h"
494, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
827, // "g"
MIN_REDUCTION+234, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+234, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 563
0x80000000|401, // match move
0x80000000|72, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 564
0x80000000|1479, // match move
0x80000000|1191, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 565
92,1229, // "e"
  }
,
{ // state 566
0x80000000|805, // match move
0x80000000|1029, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 567
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 568
102,1208, // "t"
  }
,
{ // state 569
0x80000000|932, // match move
0x80000000|947, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 570
0x80000000|289, // match move
0x80000000|456, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 571
177,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 572
0x80000000|43, // match move
0x80000000|242, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 573
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 574
0x80000000|231, // match move
0x80000000|675, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 575
0x80000000|435, // match move
0x80000000|620, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 576
0x80000000|886, // match move
0x80000000|1052, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 577
-1, // $$start
-1, // start
590, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+297, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 578
93,384, // "a"
  }
,
{ // state 579
0x80000000|28, // match move
0x80000000|1459, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 580
105,1458, // "i"
  }
,
{ // state 581
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+272, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 582
107,1627, // "u"
  }
,
{ // state 583
2,510, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 585
2,831, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 586
0x80000000|1379, // match move
0x80000000|720, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 587
2,547, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 588
2,1254, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 589
2,668, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 590
0x80000000|560, // match move
0x80000000|352, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 591
0x80000000|492, // match move
0x80000000|59, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 592
0x80000000|407, // match move
0x80000000|150, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 593
0x80000000|1589, // match move
0x80000000|819, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 594
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 595
97,1249, // "r"
  }
,
{ // state 596
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 597
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 598
177,MIN_REDUCTION+172, // $NT
  }
,
{ // state 599
0x80000000|237, // match move
0x80000000|427, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 600
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 601
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+296, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 602
0x80000000|1290, // match move
0x80000000|642, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 603
0x80000000|981, // match move
0x80000000|1268, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 604
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 605
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+155, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 606
2,590, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 607
102,1094, // "t"
  }
,
{ // state 608
93,1262, // "a"
  }
,
{ // state 609
2,547, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 610
107,870, // "u"
  }
,
{ // state 611
0x80000000|317, // match move
0x80000000|169, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 612
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 613
0x80000000|155, // match move
0x80000000|746, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 614
0x80000000|1590, // match move
0x80000000|928, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 615
3,747, // $$0
4,483, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
62,711, // `*
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
122,278, // "*"
139,1064, // intLit2
141,1399, // digit++
142,842, // digit
148,699, // letter
159,1264, // ws
161,1067, // eol
170,663, // token*
173,7, // digit+
  }
,
{ // state 616
177,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 617
0x80000000|773, // match move
0x80000000|647, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 618
-1, // $$start
-1, // start
546, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+253, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 619
0x80000000|379, // match move
0x80000000|1547, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 620
-1, // $$start
-1, // start
238, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+183, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+183, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+183, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+183, // "u"
1488, // "p"
MIN_REDUCTION+183, // "h"
494, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
827, // "g"
MIN_REDUCTION+183, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+183, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 621
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 622
0x80000000|1, // match move
0x80000000|575, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 623
99,1271, // "c"
  }
,
{ // state 624
0x80000000|1, // match move
0x80000000|784, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 625
2,57, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 626
2,1061, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 627
0x80000000|77, // match move
0x80000000|821, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 628
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 629
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 630
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+236, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 631
0x80000000|1355, // match move
0x80000000|144, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 632
0x80000000|179, // match move
0x80000000|765, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 633
2,1389, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 634
91,17, // "l"
  }
,
{ // state 635
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 636
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+282, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 637
0x80000000|457, // match move
0x80000000|1096, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 638
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 639
2,1409, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 640
2,1021, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 641
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+110, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 642
0x80000000|716, // match move
0x80000000|1306, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 643
0x80000000|752, // match move
0x80000000|1649, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 644
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 645
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 646
103,63, // "d"
  }
,
{ // state 647
0x80000000|715, // match move
0x80000000|414, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 648
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 649
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 650
90,185, // "o"
111,1390, // "y"
  }
,
{ // state 651
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 652
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 654
116,851, // "="
  }
,
{ // state 655
2,157, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 656
102,1278, // "t"
  }
,
{ // state 657
0x80000000|1, // match move
0x80000000|1016, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 658
113,1273, // "g"
  }
,
{ // state 659
0x80000000|1258, // match move
0x80000000|1156, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 660
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 661
4,223, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
83,955, // `/
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
136,1528, // "0"
148,699, // letter
  }
,
{ // state 662
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 663
0x80000000|779, // match move
0x80000000|783, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 664
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 665
0x80000000|1, // match move
0x80000000|731, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 666
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+276, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 667
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 668
0x80000000|725, // match move
0x80000000|1169, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 669
2,234, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 670
0x80000000|470, // match move
0x80000000|1199, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 671
0x80000000|609, // match move
0x80000000|467, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 672
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 673
0x80000000|1527, // match move
0x80000000|757, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 674
2,576, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 675
0x80000000|1604, // match move
0x80000000|774, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 676
102,1184, // "t"
  }
,
{ // state 677
0x80000000|754, // match move
0x80000000|1346, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 678
0x80000000|153, // match move
0x80000000|486, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 679
97,103, // "r"
105,124, // "i"
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|627, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 681
177,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 682
0x80000000|1644, // match move
0x80000000|1341, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 683
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 684
0x80000000|1342, // match move
0x80000000|586, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 685
91,1576, // "l"
  }
,
{ // state 686
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 687
0x80000000|1311, // match move
0x80000000|284, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 688
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 689
0x80000000|123, // match move
0x80000000|413, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 690
92,875, // "e"
  }
,
{ // state 691
0x80000000|738, // match move
0x80000000|513, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 692
0x80000000|1625, // match move
0x80000000|953, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 693
97,1312, // "r"
  }
,
{ // state 694
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 695
0x80000000|1512, // match move
0x80000000|175, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 696
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 697
168,998, // {10}
  }
,
{ // state 698
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+302, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 699
0x80000000|825, // match move
0x80000000|5, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 700
177,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 701
0x80000000|75, // match move
0x80000000|661, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 702
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 703
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 704
-1, // $$start
-1, // start
695, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
-1, // `=
-1, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
MIN_REDUCTION+249, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+249, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 705
0x80000000|106, // match move
0x80000000|1651, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 706
97,319, // "r"
  }
,
{ // state 707
0x80000000|276, // match move
0x80000000|876, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 708
0x80000000|1, // match move
0x80000000|945, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 709
0x80000000|1600, // match move
0x80000000|1519, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 710
2,631, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 711
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 713
105,94, // "i"
  }
,
{ // state 714
177,MIN_REDUCTION+157, // $NT
  }
,
{ // state 715
2,695, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 716
177,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 717
0x80000000|1011, // match move
0x80000000|1074, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 718
0x80000000|1157, // match move
0x80000000|252, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 719
177,MIN_REDUCTION+196, // $NT
  }
,
{ // state 720
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+278, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 721
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+161, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 722
0x80000000|1206, // match move
0x80000000|1377, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 723
0x80000000|1441, // match move
0x80000000|1497, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 724
135,393, // "|"
  }
,
{ // state 725
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 726
0x80000000|688, // match move
0x80000000|1393, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 727
0x80000000|262, // match move
0x80000000|398, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 728
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 729
111,1390, // "y"
  }
,
{ // state 730
2,1212, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 731
0x80000000|792, // match move
0x80000000|301, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 732
0x80000000|1461, // match move
0x80000000|1251, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 733
97,228, // "r"
  }
,
{ // state 734
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+252, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 735
2,52, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 736
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 737
0x80000000|382, // match move
0x80000000|1201, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 738
2,579, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 739
0x80000000|1187, // match move
0x80000000|1340, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 740
0x80000000|114, // match move
0x80000000|1560, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 741
104,1298, // "f"
  }
,
{ // state 742
0x80000000|941, // match move
0x80000000|1032, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 743
0x80000000|387, // match move
0x80000000|69, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 744
0x80000000|1470, // match move
0x80000000|581, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 745
91,729, // "l"
  }
,
{ // state 746
0x80000000|258, // match move
0x80000000|479, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 747
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 748
161,495, // eol
162,1167, // printable**
168,1607, // {10}
169,1415, // {13}
171,353, // printable*
  }
,
{ // state 749
94,1193, // "n"
  }
,
{ // state 750
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 751
177,MIN_REDUCTION+244, // $NT
  }
,
{ // state 752
116,1364, // "="
  }
,
{ // state 753
2,1598, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 754
92,595, // "e"
  }
,
{ // state 755
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 756
0x80000000|1350, // match move
0x80000000|3, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 757
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+262, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 758
0x80000000|367, // match move
0x80000000|368, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 759
177,MIN_REDUCTION+112, // $NT
  }
,
{ // state 760
0x80000000|944, // match move
0x80000000|1195, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 761
177,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 762
2,705, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 763
-1, // $$start
-1, // start
862, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+310, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 764
0x80000000|1592, // match move
0x80000000|951, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 765
0x80000000|948, // match move
0x80000000|698, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 766
177,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 767
177,MIN_REDUCTION+220, // $NT
  }
,
{ // state 768
0x80000000|1, // match move
0x80000000|503, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 769
0x80000000|1, // match move
0x80000000|717, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 770
0x80000000|1142, // match move
0x80000000|943, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 771
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 772
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 773
116,1333, // "="
  }
,
{ // state 774
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+185, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 775
2,631, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 776
-1, // $$start
-1, // start
1616, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
-1, // `=
-1, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
MIN_REDUCTION+281, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+281, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 777
112,1431, // "m"
  }
,
{ // state 778
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+374, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 779
0x80000000|1, // match move
0x80000000|1325, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 780
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 781
2,1638, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 782
121,552, // "/"
163,1486, // commentContent**
164,206, // commentContent
165,1636, // nestedCommentStart
175,444, // commentContent*
  }
,
{ // state 783
0x80000000|701, // match move
0x80000000|473, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 784
0x80000000|1178, // match move
0x80000000|1315, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 785
0x80000000|1085, // match move
0x80000000|118, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 786
89,271, // "b"
90,271, // "o"
91,271, // "l"
92,271, // "e"
93,271, // "a"
94,271, // "n"
97,271, // "r"
98,271, // "k"
99,271, // "c"
100,271, // "s"
101,271, // "x"
102,271, // "t"
103,271, // "d"
104,271, // "f"
105,271, // "i"
106,271, // "w"
107,271, // "u"
108,271, // "p"
109,271, // "h"
110,271, // "v"
111,271, // "y"
112,271, // "m"
113,271, // "g"
114,271, // "z"
115,271, // "!"
116,271, // "="
117,271, // "%"
118,271, // "&"
119,271, // "("
120,271, // ")"
121,271, // "/"
122,271, // "*"
123,271, // "+"
124,271, // ","
125,271, // "-"
126,271, // "."
127,271, // ":"
128,271, // ";"
129,271, // "<"
130,271, // ">"
131,271, // "["
132,271, // "]"
133,271, // "{"
134,271, // "}"
135,271, // "|"
136,271, // "0"
137,271, // {"1".."9"}
138,271, // "X"
143,271, // "'"
145,271, // '"'
149,271, // "_"
150,271, // {"A".."W" "Y".."Z" "j" "q"}
151,854, // printable
152,271, // " "
153,271, // "\"
154,271, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 787
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 788
0x80000000|660, // match move
0x80000000|424, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 789
90,1343, // "o"
91,950, // "l"
  }
,
{ // state 790
-1, // $$start
-1, // start
852, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+293, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 791
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+101, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 792
2,54, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 793
93,104, // "a"
105,1093, // "i"
107,88, // "u"
111,1467, // "y"
  }
,
{ // state 794
0x80000000|33, // match move
0x80000000|1440, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 795
0x80000000|962, // match move
0x80000000|1492, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 796
91,529, // "l"
  }
,
{ // state 797
92,1363, // "e"
  }
,
{ // state 798
105,1433, // "i"
  }
,
{ // state 799
0x80000000|1313, // match move
0x80000000|967, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 800
0x80000000|1345, // match move
0x80000000|1042, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 801
0x80000000|481, // match move
0x80000000|1400, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 802
2,569, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 803
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 804
-1, // $$start
-1, // start
1021, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+305, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 805
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 806
4,223, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
83,955, // `/
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
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
115,617, // "!"
116,1259, // "="
117,60, // "%"
118,263, // "&"
119,102, // "("
120,760, // ")"
121,1568, // "/"
123,1135, // "+"
124,682, // ","
125,1516, // "-"
126,200, // "."
127,1274, // ":"
128,1246, // ";"
129,1504, // "<"
130,643, // ">"
131,1540, // "["
132,1656, // "]"
133,213, // "{"
134,78, // "}"
135,724, // "|"
136,337, // "0"
137,337, // {"1".."9"}
138,105, // "X"
139,1064, // intLit2
141,1399, // digit++
142,842, // digit
143,813, // "'"
145,727, // '"'
148,699, // letter
150,105, // {"A".."W" "Y".."Z" "j" "q"}
173,7, // digit+
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 807
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 808
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+104, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 809
0x80000000|1, // match move
0x80000000|764, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 810
177,MIN_REDUCTION+346, // $NT
  }
,
{ // state 811
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 812
-1, // $$start
-1, // start
909, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+283, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 813
0x80000000|82, // match move
0x80000000|531, // no-match move
// T-test match for {'"' "\"}:
145,
153,
  }
,
{ // state 814
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 815
0x80000000|1288, // match move
0x80000000|113, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 816
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 817
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 818
92,665, // "e"
  }
,
{ // state 819
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+292, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 820
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+149, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 821
-1, // $$start
-1, // start
800, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+105, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+105, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+105, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+105, // "u"
1488, // "p"
MIN_REDUCTION+105, // "h"
494, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
827, // "g"
MIN_REDUCTION+105, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+105, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 822
0x80000000|272, // match move
0x80000000|1410, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 823
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 824
0x80000000|1474, // match move
0x80000000|1296, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 825
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,938, // idChar
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
136,1579, // "0"
137,1579, // {"1".."9"}
138,105, // "X"
142,219, // digit
148,709, // letter
149,1245, // "_"
150,105, // {"A".."W" "Y".."Z" "j" "q"}
157,1002, // idChar**
174,1309, // idChar*
  }
,
{ // state 826
2,546, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 827
90,656, // "o"
  }
,
{ // state 828
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 829
2,723, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 830
109,887, // "h"
  }
,
{ // state 831
0x80000000|500, // match move
0x80000000|602, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 832
0x80000000|1116, // match move
0x80000000|453, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 833
101,990, // "x"
136,337, // "0"
137,337, // {"1".."9"}
138,990, // "X"
140,908, // `x
141,613, // digit++
142,842, // digit
173,7, // digit+
  }
,
{ // state 834
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 835
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+250, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 836
0x80000000|515, // match move
0x80000000|1221, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 837
100,968, // "s"
  }
,
{ // state 838
92,1053, // "e"
  }
,
{ // state 839
136,218, // "0"
137,218, // {"1".."9"}
  }
,
{ // state 840
-1, // $$start
-1, // start
450, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
-1, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
-1, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+269, // "*"
1135, // "+"
682, // ","
MIN_REDUCTION+269, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 841
0x80000000|1048, // match move
0x80000000|324, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 842
0x80000000|843, // match move
0x80000000|910, // no-match move
0x80000000|839, // NT-test-match state for digit
  }
,
{ // state 843
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 844
0x80000000|610, // match move
0x80000000|742, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 845
0x80000000|1186, // match move
0x80000000|139, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 846
0x80000000|1602, // match move
0x80000000|896, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 847
0x80000000|136, // match move
0x80000000|605, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 848
0x80000000|1175, // match move
0x80000000|673, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 849
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 850
94,372, // "n"
  }
,
{ // state 851
0x80000000|349, // match move
0x80000000|469, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 852
0x80000000|1632, // match move
0x80000000|1079, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 853
0x80000000|138, // match move
0x80000000|1495, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 854
0x80000000|621, // match move
0x80000000|889, // no-match move
0x80000000|395, // NT-test-match state for printable
  }
,
{ // state 855
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 856
113,323, // "g"
  }
,
{ // state 857
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 858
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 859
0x80000000|1, // match move
0x80000000|979, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 860
0x80000000|730, // match move
0x80000000|499, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 861
0x80000000|132, // match move
0x80000000|1541, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 862
0x80000000|408, // match move
0x80000000|131, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 863
0x80000000|188, // match move
0x80000000|982, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 864
2,590, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 865
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+137, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 866
0x80000000|625, // match move
0x80000000|108, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 867
-1, // $$start
-1, // start
306, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+271, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 868
0x80000000|1101, // match move
0x80000000|449, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 869
0x80000000|891, // match move
0x80000000|1034, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 870
89,685, // "b"
  }
,
{ // state 871
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 872
177,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 873
2,1254, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 874
0x80000000|181, // match move
0x80000000|737, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 875
103,1556, // "d"
  }
,
{ // state 876
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+212, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 877
0x80000000|1, // match move
0x80000000|1641, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 878
91,911, // "l"
94,280, // "n"
97,1249, // "r"
101,1232, // "x"
  }
,
{ // state 879
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 880
0x80000000|635, // match move
0x80000000|1629, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 881
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 882
2,27, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 883
0x80000000|1, // match move
0x80000000|836, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 884
0x80000000|1424, // match move
0x80000000|160, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 885
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+92, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 886
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 887
0x80000000|1, // match move
0x80000000|866, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 888
0x80000000|1, // match move
0x80000000|991, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 889
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 890
0x80000000|871, // match move
0x80000000|356, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 891
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 892
0x80000000|417, // match move
0x80000000|707, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 893
0x80000000|298, // match move
0x80000000|772, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 894
0x80000000|1615, // match move
0x80000000|51, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 895
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
144,890, // stringChar
145,211, // '"'
149,211, // "_"
150,211, // {"A".."W" "Y".."Z" "j" "q"}
151,419, // printable
152,211, // " "
153,211, // "\"
154,211, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 896
0x80000000|628, // match move
0x80000000|847, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 897
109,693, // "h"
  }
,
{ // state 898
0x80000000|37, // match move
0x80000000|282, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 899
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 900
-1, // $$start
-1, // start
984, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+216, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+216, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+216, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+216, // "u"
1488, // "p"
MIN_REDUCTION+216, // "h"
494, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
827, // "g"
MIN_REDUCTION+216, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+216, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 901
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 902
93,1324, // "a"
  }
,
{ // state 903
177,MIN_REDUCTION+342, // $NT
  }
,
{ // state 904
92,706, // "e"
  }
,
{ // state 905
177,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 906
0x80000000|937, // match move
0x80000000|1359, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 907
92,1529, // "e"
  }
,
{ // state 908
136,337, // "0"
137,337, // {"1".."9"}
141,1302, // digit++
142,842, // digit
173,7, // digit+
  }
,
{ // state 909
0x80000000|1177, // match move
0x80000000|956, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 910
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 911
100,326, // "s"
  }
,
{ // state 912
0x80000000|1115, // match move
0x80000000|488, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 913
177,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 914
0x80000000|952, // match move
0x80000000|1202, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 915
0x80000000|667, // match move
0x80000000|472, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 916
2,1265, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 917
0x80000000|1179, // match move
0x80000000|939, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 918
0x80000000|1613, // match move
0x80000000|343, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 919
0x80000000|983, // match move
0x80000000|1318, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 920
0x80000000|1358, // match move
0x80000000|1593, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 921
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 922
0x80000000|1185, // match move
0x80000000|1515, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 923
0x80000000|93, // match move
0x80000000|1270, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 924
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 925
107,363, // "u"
  }
,
{ // state 926
2,1021, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 927
2,1436, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 928
0x80000000|626, // match move
0x80000000|562, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 929
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 930
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 931
0x80000000|520, // match move
0x80000000|1352, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 932
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 933
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 934
2,695, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 936
-1, // $$start
-1, // start
1436, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+150, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+150, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+150, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+150, // "u"
1488, // "p"
MIN_REDUCTION+150, // "h"
494, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
827, // "g"
MIN_REDUCTION+150, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+150, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 937
2,861, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 938
0x80000000|567, // match move
0x80000000|432, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 939
0x80000000|1392, // match move
0x80000000|1159, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 940
0x80000000|700, // match move
0x80000000|1374, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 941
2,274, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 942
-1, // $$start
-1, // start
1216, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+168, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+168, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+168, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+168, // "u"
1488, // "p"
MIN_REDUCTION+168, // "h"
494, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
827, // "g"
MIN_REDUCTION+168, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+168, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 943
0x80000000|330, // match move
0x80000000|1041, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 944
2,547, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 945
0x80000000|96, // match move
0x80000000|224, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 946
104,359, // "f"
  }
,
{ // state 947
0x80000000|879, // match move
0x80000000|1405, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 948
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 949
0x80000000|1, // match move
0x80000000|1013, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 950
92,777, // "e"
  }
,
{ // state 951
-1, // $$start
-1, // start
406, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+96, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+96, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+96, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+96, // "u"
1488, // "p"
MIN_REDUCTION+96, // "h"
494, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
827, // "g"
MIN_REDUCTION+96, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+96, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 952
2,53, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 953
0x80000000|1215, // match move
0x80000000|912, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 954
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 955
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 956
0x80000000|561, // match move
0x80000000|1322, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 957
0x80000000|245, // match move
0x80000000|785, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 958
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+113, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 959
92,1558, // "e"
  }
,
{ // state 960
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 961
177,MIN_REDUCTION+235, // $NT
  }
,
{ // state 962
0x80000000|782, // match move
0x80000000|490, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 963
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 964
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 965
0x80000000|192, // match move
0x80000000|286, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 966
0x80000000|1, // match move
0x80000000|1493, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 967
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+248, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 968
0x80000000|1, // match move
0x80000000|914, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 969
-1, // $$start
-1, // start
1409, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+291, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 970
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 971
2,788, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 972
0x80000000|1521, // match move
0x80000000|451, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 973
149,MIN_REDUCTION+320, // "_"
157,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 974
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 975
-1, // $$start
-1, // start
692, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+192, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+192, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+192, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+192, // "u"
1488, // "p"
MIN_REDUCTION+192, // "h"
494, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
827, // "g"
MIN_REDUCTION+192, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+192, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 976
89,370, // "b"
  }
,
{ // state 977
2,1158, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 978
0x80000000|1047, // match move
0x80000000|1329, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 979
0x80000000|1110, // match move
0x80000000|975, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 980
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 981
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 982
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+164, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 983
177,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 984
0x80000000|858, // match move
0x80000000|1046, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 985
2,846, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 986
0x80000000|159, // match move
0x80000000|130, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 987
0x80000000|62, // match move
0x80000000|632, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 988
-1, // $$start
-1, // start
1653, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+333, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
807, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 989
91,373, // "l"
  }
,
{ // state 990
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 991
0x80000000|1117, // match move
0x80000000|1356, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 992
-1, // $$start
-1, // start
1174, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+231, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+231, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+231, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+231, // "u"
1488, // "p"
MIN_REDUCTION+231, // "h"
494, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
827, // "g"
MIN_REDUCTION+231, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+231, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 993
0x80000000|828, // match move
0x80000000|1457, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 994
102,320, // "t"
  }
,
{ // state 995
-1, // $$start
-1, // start
397, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+225, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+225, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+225, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+225, // "u"
1488, // "p"
MIN_REDUCTION+225, // "h"
494, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
827, // "g"
MIN_REDUCTION+225, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+225, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 996
177,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 997
0x80000000|142, // match move
0x80000000|392, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 998
0x80000000|855, // match move
0x80000000|127, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 999
0x80000000|1491, // match move
0x80000000|957, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1000
102,366, // "t"
  }
,
{ // state 1001
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1002
0x80000000|1434, // match move
0x80000000|898, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1003
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 1004
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1005
177,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1006
177,MIN_REDUCTION+115, // $NT
  }
,
{ // state 1007
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1008
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1009
97,769, // "r"
  }
,
{ // state 1010
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1011
2,1172, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1012
0x80000000|526, // match move
0x80000000|885, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1013
0x80000000|655, // match move
0x80000000|2, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1014
0x80000000|697, // match move
0x80000000|197, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 1015
0x80000000|32, // match move
0x80000000|592, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1016
0x80000000|195, // match move
0x80000000|292, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1017
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+227, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1018
121,305, // "/"
165,377, // nestedCommentStart
  }
,
{ // state 1019
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1020
93,44, // "a"
  }
,
{ // state 1021
0x80000000|1444, // match move
0x80000000|493, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1022
0x80000000|420, // match move
0x80000000|1534, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1023
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+284, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1024
0x80000000|141, // match move
0x80000000|311, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1025
100,448, // "s"
  }
,
{ // state 1026
0x80000000|1332, // match move
0x80000000|1407, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1027
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1028
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1029
0x80000000|1509, // match move
0x80000000|791, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1030
3,747, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
170,663, // token*
  }
,
{ // state 1031
89,105, // "b"
90,105, // "o"
91,105, // "l"
92,105, // "e"
93,105, // "a"
94,105, // "n"
95,518, // idChar
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
136,1579, // "0"
137,1579, // {"1".."9"}
138,105, // "X"
142,219, // digit
148,709, // letter
149,1245, // "_"
150,105, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1032
-1, // $$start
-1, // start
274, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+177, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+177, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+177, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
870, // "u"
1488, // "p"
MIN_REDUCTION+177, // "h"
494, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
827, // "g"
MIN_REDUCTION+177, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+177, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1033
2,450, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1034
0x80000000|16, // match move
0x80000000|1368, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1035
2,861, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1036
0x80000000|438, // match move
0x80000000|1468, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1037
0x80000000|264, // match move
0x80000000|14, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1038
92,1244, // "e"
  }
,
{ // state 1039
0x80000000|1428, // match move
0x80000000|528, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1040
2,397, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1041
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+176, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1042
0x80000000|1464, // match move
0x80000000|1233, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1043
0x80000000|555, // match move
0x80000000|182, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1044
0x80000000|421, // match move
0x80000000|81, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1045
99,10, // "c"
  }
,
{ // state 1046
0x80000000|1365, // match move
0x80000000|940, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1047
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1048
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1049
168,388, // {10}
  }
,
{ // state 1050
2,202, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1051
92,680, // "e"
  }
,
{ // state 1052
0x80000000|1321, // match move
0x80000000|220, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1053
0x80000000|1, // match move
0x80000000|1100, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1054
100,47, // "s"
102,677, // "t"
  }
,
{ // state 1055
177,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1056
2,1015, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1057
-1, // $$start
-1, // start
723, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+243, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+243, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+243, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+243, // "u"
1488, // "p"
MIN_REDUCTION+243, // "h"
494, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
827, // "g"
MIN_REDUCTION+243, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+243, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1058
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1059
0x80000000|1533, // match move
0x80000000|1266, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1060
0x80000000|436, // match move
0x80000000|338, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1061
0x80000000|1501, // match move
0x80000000|1211, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1062
177,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1063
177,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1064
0x80000000|926, // match move
0x80000000|1238, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1065
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+173, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1066
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1067
177,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1068
0x80000000|1182, // match move
0x80000000|942, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1069
102,22, // "t"
  }
,
{ // state 1070
94,39, // "n"
  }
,
{ // state 1071
-1, // $$start
-1, // start
824, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+295, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1072
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1073
2,824, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1074
-1, // $$start
-1, // start
1172, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+165, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+165, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+165, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+165, // "u"
1488, // "p"
MIN_REDUCTION+165, // "h"
494, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
827, // "g"
MIN_REDUCTION+165, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+165, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1075
0x80000000|1562, // match move
0x80000000|40, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1076
0x80000000|1650, // match move
0x80000000|1316, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1077
91,911, // "l"
94,280, // "n"
101,1232, // "x"
  }
,
{ // state 1078
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+273, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1079
0x80000000|696, // match move
0x80000000|593, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1080
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+267, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1081
4,223, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
89,1498, // "b"
91,1575, // "l"
92,1077, // "e"
93,1657, // "a"
94,1605, // "n"
97,1038, // "r"
99,537, // "c"
100,1563, // "s"
102,1584, // "t"
103,415, // "d"
104,230, // "f"
105,1510, // "i"
106,38, // "w"
108,1488, // "p"
110,494, // "v"
113,827, // "g"
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1082
0x80000000|745, // match move
0x80000000|1203, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1083
0x80000000|1414, // match move
0x80000000|249, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1084
177,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1085
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1086
0x80000000|1218, // match move
0x80000000|354, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1087
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1088
0x80000000|1336, // match move
0x80000000|986, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1089
0x80000000|803, // match move
0x80000000|476, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1090
107,1261, // "u"
  }
,
{ // state 1091
2,852, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1092
0x80000000|1284, // match move
0x80000000|721, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1093
99,66, // "c"
  }
,
{ // state 1094
0x80000000|1, // match move
0x80000000|1214, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1095
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1096
0x80000000|471, // match move
0x80000000|1499, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1097
0x80000000|1646, // match move
0x80000000|666, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1098
1,474, // start
2,31, // ws*
3,1109, // $$0
4,483, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
62,711, // `*
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
122,278, // "*"
139,1064, // intLit2
141,1399, // digit++
142,842, // digit
148,699, // letter
159,1552, // ws
161,1067, // eol
170,663, // token*
173,7, // digit+
  }
,
{ // state 1099
97,110, // "r"
  }
,
{ // state 1100
0x80000000|985, // match move
0x80000000|1122, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1101
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1102
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1103
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1104
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1105
2,1036, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1106
2,556, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1107
-1, // $$start
-1, // start
668, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+246, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+246, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+246, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+246, // "u"
1488, // "p"
MIN_REDUCTION+246, // "h"
494, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
827, // "g"
MIN_REDUCTION+246, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+246, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1108
94,117, // "n"
  }
,
{ // state 1109
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1110
2,692, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1111
0x80000000|1, // match move
0x80000000|396, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1112
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+224, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1113
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+152, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1114
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1115
177,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1116
177,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1117
2,236, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1118
2,1320, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1119
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1120
177,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1121
177,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1122
-1, // $$start
-1, // start
846, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+156, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+156, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+156, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+156, // "u"
1488, // "p"
MIN_REDUCTION+156, // "h"
494, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
827, // "g"
MIN_REDUCTION+156, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+156, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1123
2,909, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1124
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1125
177,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1126
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+188, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1127
0x80000000|156, // match move
0x80000000|355, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1128
97,232, // "r"
  }
,
{ // state 1129
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1130
-1, // $$start
-1, // start
1269, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+102, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+102, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+102, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+102, // "u"
1488, // "p"
MIN_REDUCTION+102, // "h"
494, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
827, // "g"
MIN_REDUCTION+102, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+102, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1131
0x80000000|167, // match move
0x80000000|1319, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1132
0x80000000|1618, // match move
0x80000000|1301, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1133
0x80000000|1, // match move
0x80000000|1166, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1134
0x80000000|29, // match move
0x80000000|1484, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1135
0x80000000|20, // match move
0x80000000|55, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1136
100,433, // "s"
  }
,
{ // state 1137
0x80000000|243, // match move
0x80000000|13, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1138
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1139
0x80000000|1, // match move
0x80000000|1188, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1140
0x80000000|1402, // match move
0x80000000|1526, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1141
0x80000000|1395, // match move
0x80000000|1594, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1142
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1143
0x80000000|536, // match move
0x80000000|101, // no-match move
0x80000000|395, // NT-test-match state for printable
  }
,
{ // state 1144
99,154, // "c"
  }
,
{ // state 1145
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1146
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1147
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1148
0x80000000|1213, // match move
0x80000000|603, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1149
94,902, // "n"
  }
,
{ // state 1150
0x80000000|1487, // match move
0x80000000|1286, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1151
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1152
99,391, // "c"
  }
,
{ // state 1153
0x80000000|254, // match move
0x80000000|1217, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1154
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1155
-1, // $$start
-1, // start
831, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+219, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+219, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+219, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+219, // "u"
1488, // "p"
MIN_REDUCTION+219, // "h"
494, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
827, // "g"
MIN_REDUCTION+219, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+219, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1156
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+245, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1157
177,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1158
0x80000000|145, // match move
0x80000000|364, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1159
-1, // $$start
-1, // start
539, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+299, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1160
0x80000000|1050, // match move
0x80000000|1285, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1161
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1162
177,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1163
2,824, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1164
121,86, // "/"
  }
,
{ // state 1165
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1166
0x80000000|506, // match move
0x80000000|992, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1167
161,1417, // eol
168,1607, // {10}
169,1415, // {13}
  }
,
{ // state 1168
2,1616, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1169
0x80000000|381, // match move
0x80000000|659, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1170
0x80000000|1030, // match move
0x80000000|1639, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1171
2,1653, // ws*
157,1002, // idChar**
158,525, // $$2
159,1552, // ws
161,1067, // eol
174,1309, // idChar*
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1172
0x80000000|12, // match move
0x80000000|294, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1173
0x80000000|589, // match move
0x80000000|1107, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1174
0x80000000|1349, // match move
0x80000000|403, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1175
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1176
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1177
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1178
2,822, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1179
2,539, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1180
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1181
0x80000000|1104, // match move
0x80000000|591, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1182
2,1216, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1183
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1184
0x80000000|1, // match move
0x80000000|1231, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1185
2,1389, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1186
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1187
2,1148, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1188
0x80000000|1617, // match move
0x80000000|267, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1189
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1190
0x80000000|312, // match move
0x80000000|1406, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1191
0x80000000|1280, // match move
0x80000000|1039, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1192
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1193
0x80000000|1, // match move
0x80000000|1150, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1194
0x80000000|161, // match move
0x80000000|512, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1195
0x80000000|587, // match move
0x80000000|671, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1196
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1197
0x80000000|1, // match move
0x80000000|1037, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1198
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1199
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+308, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1200
177,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1201
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+194, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1202
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+198, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+198, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+198, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+198, // "u"
1488, // "p"
MIN_REDUCTION+198, // "h"
494, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
827, // "g"
MIN_REDUCTION+198, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+198, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1203
0x80000000|1353, // match move
0x80000000|1548, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1204
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1205
0x80000000|1569, // match move
0x80000000|1181, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1206
102,1609, // "t"
106,798, // "w"
107,126, // "u"
109,1351, // "h"
111,1108, // "y"
  }
,
{ // state 1207
93,221, // "a"
  }
,
{ // state 1208
105,226, // "i"
  }
,
{ // state 1209
94,229, // "n"
97,845, // "r"
102,1297, // "t"
104,162, // "f"
143,726, // "'"
145,201, // '"'
153,687, // "\"
  }
,
{ // state 1210
177,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1211
0x80000000|1183, // match move
0x80000000|923, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1212
0x80000000|780, // match move
0x80000000|165, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1213
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1214
0x80000000|674, // match move
0x80000000|1239, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1215
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1216
0x80000000|50, // match move
0x80000000|637, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1217
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+260, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1218
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1219
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1220
0x80000000|1170, // match move
0x80000000|210, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1221
-1, // $$start
-1, // start
478, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+93, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+93, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+93, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+93, // "u"
1488, // "p"
MIN_REDUCTION+93, // "h"
494, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
827, // "g"
MIN_REDUCTION+93, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+93, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
144,890, // stringChar
153,98, // "\"
155,1209, // escapeSlash
  }
,
{ // state 1224
-1, // $$start
-1, // start
822, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+237, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+237, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+237, // "x"
1511, // "t"
415, // "d"
230, // "f"
1510, // "i"
1426, // "w"
126, // "u"
1488, // "p"
1351, // "h"
494, // "v"
1108, // "y"
MIN_REDUCTION+237, // "m"
827, // "g"
MIN_REDUCTION+237, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+237, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
108,789, // "p"
  }
,
{ // state 1227
2,1616, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1228
0x80000000|459, // match move
0x80000000|83, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|1173, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1230
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1231
0x80000000|255, // match move
0x80000000|58, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1232
102,554, // "t"
  }
,
{ // state 1233
0x80000000|1596, // match move
0x80000000|808, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1234
177,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1235
0x80000000|1, // match move
0x80000000|1160, // no-match move
0x80000000|1555, // NT-test-match state for idChar
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
0x80000000|640, // match move
0x80000000|24, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1239
-1, // $$start
-1, // start
576, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+174, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+174, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+174, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+174, // "u"
1488, // "p"
MIN_REDUCTION+174, // "h"
494, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
827, // "g"
MIN_REDUCTION+174, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+174, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|1652, // match move
0x80000000|1257, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1242
2,1269, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1243
121,305, // "/"
122,1574, // "*"
165,275, // nestedCommentStart
166,1476, // nestedCommentEnd
  }
,
{ // state 1244
102,582, // "t"
  }
,
{ // state 1245
0x80000000|899, // match move
0x80000000|1019, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1246
0x80000000|583, // match move
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
1015, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+114, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+114, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+114, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+114, // "u"
1488, // "p"
MIN_REDUCTION+114, // "h"
494, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
827, // "g"
MIN_REDUCTION+114, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+114, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
104,578, // "f"
  }
,
{ // state 1250
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1251
0x80000000|616, // match move
0x80000000|1537, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1252
2,999, // ws*
159,1552, // ws
161,1067, // eol
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+290, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|702, // match move
0x80000000|375, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1255
177,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1256
0x80000000|240, // match move
0x80000000|333, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1257
-1, // $$start
-1, // start
740, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+99, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+99, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+99, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+99, // "u"
1488, // "p"
MIN_REDUCTION+99, // "h"
494, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
827, // "g"
MIN_REDUCTION+99, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+99, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|507, // match move
0x80000000|1483, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1260
0x80000000|960, // match move
0x80000000|1092, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1261
91,607, // "l"
  }
,
{ // state 1262
94,303, // "n"
  }
,
{ // state 1263
1,474, // start
2,31, // ws*
3,1109, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
170,663, // token*
  }
,
{ // state 1264
177,MIN_REDUCTION+359, // $NT
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1265
0x80000000|496, // match move
0x80000000|563, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1266
4,223, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
62,711, // `*
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
122,278, // "*"
139,1064, // intLit2
141,1399, // digit++
142,842, // digit
148,699, // letter
173,7, // digit+
  }
,
{ // state 1267
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1268
0x80000000|405, // match move
0x80000000|835, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1269
0x80000000|1066, // match move
0x80000000|566, // no-match move
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+233, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
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
{ // state 1271
102,65, // "t"
  }
,
{ // state 1272
0x80000000|8, // match move
0x80000000|410, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1273
92,888, // "e"
  }
,
{ // state 1274
0x80000000|541, // match move
0x80000000|922, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1275
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1276
93,1069, // "a"
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+89, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1278
90,1235, // "o"
  }
,
{ // state 1279
2,234, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1280
159,1264, // ws
161,1067, // eol
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
161,1067, // eol
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
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+195, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+195, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+195, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+195, // "u"
1488, // "p"
MIN_REDUCTION+195, // "h"
494, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
827, // "g"
MIN_REDUCTION+195, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+195, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+90, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+90, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+90, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+90, // "u"
1488, // "p"
MIN_REDUCTION+90, // "h"
494, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
827, // "g"
MIN_REDUCTION+90, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+90, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
1419, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+257, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|462, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1290
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1291
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1292
0x80000000|297, // match move
0x80000000|815, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1293
0x80000000|1198, // match move
0x80000000|868, // no-match move
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
2,1158, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1296
0x80000000|163, // match move
0x80000000|328, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1297
0x80000000|454, // match move
0x80000000|64, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 1298
0x80000000|1, // match move
0x80000000|1564, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1299
0x80000000|1, // match move
0x80000000|1241, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1300
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1301
0x80000000|521, // match move
0x80000000|1113, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1302
0x80000000|1626, // match move
0x80000000|140, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1303
100,1225, // "s"
102,1045, // "t"
  }
,
{ // state 1304
159,1264, // ws
161,1067, // eol
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+218, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
2,546, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1308
177,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1309
0x80000000|1031, // match move
0x80000000|857, // no-match move
0x80000000|1555, // NT-test-match state for idChar
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
90,1070, // "o"
  }
,
{ // state 1313
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1314
0x80000000|1647, // match move
0x80000000|748, // no-match move
0x80000000|395, // NT-test-match state for printable
  }
,
{ // state 1315
-1, // $$start
-1, // start
822, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+237, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+237, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+237, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+237, // "u"
1488, // "p"
MIN_REDUCTION+237, // "h"
494, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
827, // "g"
MIN_REDUCTION+237, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+237, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|1506, // match move
0x80000000|867, // no-match move
0x80000000|501, // NT-test-match state for reserved
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+128, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
0x80000000|463, // match move
0x80000000|1024, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1321
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1322
0x80000000|1570, // match move
0x80000000|636, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1323
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1324
91,1082, // "l"
  }
,
{ // state 1325
0x80000000|1, // match move
0x80000000|1059, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1326
2,579, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1327
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1328
177,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1329
0x80000000|120, // match move
0x80000000|734, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1330
0x80000000|1361, // match move
0x80000000|1141, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1331
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1332
2,590, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1333
0x80000000|533, // match move
0x80000000|739, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1334
0x80000000|1513, // match move
0x80000000|25, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1335
105,1093, // "i"
  }
,
{ // state 1336
0x80000000|307, // match move
0x80000000|361, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1337
0x80000000|1448, // match move
0x80000000|853, // no-match move
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
0x80000000|1480, // match move
0x80000000|73, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1341
0x80000000|1118, // match move
0x80000000|1612, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1342
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1343
97,676, // "r"
  }
,
{ // state 1344
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1345
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1346
0x80000000|753, // match move
0x80000000|1455, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1347
0x80000000|1018, // match move
0x80000000|253, // no-match move
0x80000000|1243, // NT-test-match state for commentElement
  }
,
{ // state 1348
-1, // $$start
-1, // start
788, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+204, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+204, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+204, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+204, // "u"
1488, // "p"
MIN_REDUCTION+204, // "h"
494, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
827, // "g"
MIN_REDUCTION+204, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+204, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
161,1067, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1350
177,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1351
90,411, // "o"
  }
,
{ // state 1352
0x80000000|350, // match move
0x80000000|187, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1353
2,1577, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1354
0x80000000|430, // match move
0x80000000|619, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1355
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1356
-1, // $$start
-1, // start
236, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+213, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+213, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+213, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+213, // "u"
1488, // "p"
MIN_REDUCTION+213, // "h"
494, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
827, // "g"
MIN_REDUCTION+213, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+213, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
416, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+108, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+108, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+108, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+108, // "u"
1488, // "p"
MIN_REDUCTION+108, // "h"
494, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
827, // "g"
MIN_REDUCTION+108, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+108, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
161,1067, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1359
-1, // $$start
-1, // start
861, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+314, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1360
177,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1361
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1362
0x80000000|1610, // match move
0x80000000|1071, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1363
0x80000000|1, // match move
0x80000000|1508, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1364
0x80000000|466, // match move
0x80000000|794, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1365
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1366
0x80000000|1, // match move
0x80000000|1111, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 1367
0x80000000|872, // match move
0x80000000|1601, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1368
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+182, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1369
0x80000000|1373, // match move
0x80000000|339, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1370
0x80000000|1328, // match move
0x80000000|247, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1371
3,747, // $$0
4,483, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
170,663, // token*
  }
,
{ // state 1372
177,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1373
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1374
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+215, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1375
-1, // $$start
-1, // start
1265, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+138, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+138, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+138, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+138, // "u"
1488, // "p"
MIN_REDUCTION+138, // "h"
494, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
827, // "g"
MIN_REDUCTION+138, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+138, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1376
177,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1377
0x80000000|1178, // match move
0x80000000|1224, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1378
0x80000000|924, // match move
0x80000000|1132, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1379
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1380
0x80000000|1263, // match move
0x80000000|1098, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1381
91,796, // "l"
  }
,
{ // state 1382
2,234, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1383
177,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1384
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1385
-1, // $$start
-1, // start
215, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+180, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+180, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+180, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+180, // "u"
1488, // "p"
MIN_REDUCTION+180, // "h"
494, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
827, // "g"
MIN_REDUCTION+180, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+180, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1386
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1387
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+209, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1388
177,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1389
0x80000000|134, // match move
0x80000000|550, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1390
0x80000000|1, // match move
0x80000000|1127, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1391
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+206, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1392
2,539, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1393
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1394
0x80000000|534, // match move
0x80000000|884, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1395
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1396
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1397
0x80000000|61, // match move
0x80000000|1126, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1398
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1399
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1400
-1, // $$start
-1, // start
1190, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+240, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+240, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+240, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+240, // "u"
1488, // "p"
MIN_REDUCTION+240, // "h"
494, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
827, // "g"
MIN_REDUCTION+240, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+240, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1401
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1402
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1403
177,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1404
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+107, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1405
0x80000000|1619, // match move
0x80000000|641, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1406
0x80000000|418, // match move
0x80000000|1539, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1407
0x80000000|606, // match move
0x80000000|577, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1408
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1409
0x80000000|380, // match move
0x80000000|1520, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1410
0x80000000|1119, // match move
0x80000000|1599, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1411
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1412
2,1089, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1413
-1, // $$start
-1, // start
556, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+129, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+129, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+129, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+129, // "u"
1488, // "p"
MIN_REDUCTION+129, // "h"
494, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
827, // "g"
MIN_REDUCTION+129, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+129, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1414
2,631, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1415
0x80000000|1049, // match move
0x80000000|1339, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 1416
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1417
177,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1418
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+131, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1419
0x80000000|930, // match move
0x80000000|920, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1420
93,749, // "a"
  }
,
{ // state 1421
0x80000000|281, // match move
0x80000000|1532, // no-match move
// T-test match for {'"' "\"}:
145,
153,
  }
,
{ // state 1422
92,733, // "e"
  }
,
{ // state 1423
94,1255, // "n"
97,168, // "r"
102,425, // "t"
104,1489, // "f"
143,109, // "'"
145,571, // '"'
153,389, // "\"
  }
,
{ // state 1424
177,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1425
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+307, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1426
105,1433, // "i"
109,1490, // "h"
  }
,
{ // state 1427
177,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1428
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1429
-1, // $$start
-1, // start
-1, // ws*
747, // $$0
483, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
-1, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
663, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1430
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1431
92,1237, // "e"
  }
,
{ // state 1432
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1433
102,423, // "t"
  }
,
{ // state 1434
2,1653, // ws*
158,807, // $$2
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1435
177,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1436
0x80000000|823, // match move
0x80000000|498, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1437
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1438
0x80000000|1, // match move
0x80000000|1068, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1439
177,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1440
0x80000000|639, // match move
0x80000000|969, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1441
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1442
0x80000000|1124, // match move
0x80000000|1640, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1443
0x80000000|1283, // match move
0x80000000|1453, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1444
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1445
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1446
-1, // $$start
-1, // start
1158, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
-1, // `=
-1, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
MIN_REDUCTION+285, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+285, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1447
0x80000000|1551, // match move
0x80000000|601, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1448
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1449
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1450
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1451
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1452
0x80000000|111, // match move
0x80000000|532, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1453
0x80000000|67, // match move
0x80000000|198, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1454
177,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1455
-1, // $$start
-1, // start
1598, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+117, // "o"
1575, // "l"
878, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+117, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+117, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+117, // "u"
1488, // "p"
MIN_REDUCTION+117, // "h"
494, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
827, // "g"
MIN_REDUCTION+117, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+117, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
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
{ // state 1456
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1457
0x80000000|260, // match move
0x80000000|1397, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1458
99,657, // "c"
  }
,
{ // state 1459
0x80000000|1437, // match move
0x80000000|841, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1460
114,431, // "z"
  }
,
{ // state 1461
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1462
92,850, // "e"
  }
,
{ // state 1463
102,859, // "t"
  }
,
{ // state 1464
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1465
0x80000000|1168, // match move
0x80000000|776, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1466
2,1653, // ws*
158,807, // $$2
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1467
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1468
0x80000000|1398, // match move
0x80000000|1060, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1469
0x80000000|1396, // match move
0x80000000|551, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1470
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1471
0x80000000|46, // match move
0x80000000|248, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1472
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1473
0x80000000|1, // match move
0x80000000|1637, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1474
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1475
177,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1476
177,MIN_REDUCTION+345, // $NT
  }
,
{ // state 1477
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1478
177,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1479
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1480
2,1148, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1481
177,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1482
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1483
0x80000000|1295, // match move
0x80000000|244, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1484
0x80000000|116, // match move
0x80000000|1559, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1485
0x80000000|173, // match move
0x80000000|158, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1486
122,1164, // "*"
  }
,
{ // state 1487
2,170, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1488
93,1144, // "a"
97,90, // "r"
107,976, // "u"
  }
,
{ // state 1489
177,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1490
105,489, // "i"
  }
,
{ // state 1491
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1492
122,341, // "*"
163,1486, // commentContent**
175,444, // commentContent*
  }
,
{ // state 1493
0x80000000|1, // match move
0x80000000|1380, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1494
104,441, // "f"
  }
,
{ // state 1495
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+258, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1496
0x80000000|1004, // match move
0x80000000|1621, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1497
0x80000000|1058, // match move
0x80000000|832, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1498
90,23, // "o"
97,241, // "r"
111,246, // "y"
  }
,
{ // state 1499
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+167, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1500
2,510, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1501
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1502
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1503
100,484, // "s"
  }
,
{ // state 1504
0x80000000|654, // match move
0x80000000|1044, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1505
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1506
2,306, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1507
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1508
0x80000000|1630, // match move
0x80000000|900, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1509
177,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1510
94,1054, // "n"
104,1608, // "f"
112,1226, // "m"
  }
,
{ // state 1511
93,1535, // "a"
97,793, // "r"
109,679, // "h"
  }
,
{ // state 1512
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1513
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1514
177,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1515
0x80000000|633, // match move
0x80000000|468, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1516
0x80000000|461, // match move
0x80000000|1354, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1517
0x80000000|1123, // match move
0x80000000|812, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1518
0x80000000|971, // match move
0x80000000|1348, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1519
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1520
0x80000000|485, // match move
0x80000000|374, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1521
177,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1522
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1523
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+268, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1524
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1525
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1526
0x80000000|1007, // match move
0x80000000|542, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1527
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1528
0x80000000|833, // match move
0x80000000|599, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1529
90,741, // "o"
  }
,
{ // state 1530
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1531
0x80000000|1105, // match move
0x80000000|743, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1532
89,1403, // "b"
90,1403, // "o"
91,1403, // "l"
92,1403, // "e"
93,1403, // "a"
94,1403, // "n"
97,1403, // "r"
98,1403, // "k"
99,1403, // "c"
100,1403, // "s"
101,1403, // "x"
102,1403, // "t"
103,1403, // "d"
104,1403, // "f"
105,1403, // "i"
106,1403, // "w"
107,1403, // "u"
108,1403, // "p"
109,1403, // "h"
110,1403, // "v"
111,1403, // "y"
112,1403, // "m"
113,1403, // "g"
114,1403, // "z"
115,1403, // "!"
116,1403, // "="
117,1403, // "%"
118,1403, // "&"
119,1403, // "("
120,1403, // ")"
121,1403, // "/"
122,1403, // "*"
123,1403, // "+"
124,1403, // ","
125,1403, // "-"
126,1403, // "."
127,1403, // ":"
128,1403, // ";"
129,1403, // "<"
130,1403, // ">"
131,1403, // "["
132,1403, // "]"
133,1403, // "{"
134,1403, // "}"
135,1403, // "|"
136,1403, // "0"
137,1403, // {"1".."9"}
138,1403, // "X"
143,1403, // "'"
145,1403, // '"'
149,1403, // "_"
150,1403, // {"A".."W" "Y".."Z" "j" "q"}
151,174, // printable
152,1403, // " "
153,1403, // "\"
154,1403, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 1533
4,223, // token
5,933, // `boolean
6,1230, // `class
7,935, // `extends
8,4, // `void
9,207, // `int
10,1027, // `while
11,1544, // `if
12,1338, // `else
13,1138, // `for
14,357, // `break
15,172, // `this
16,137, // `false
17,1430, // `true
18,1408, // `super
19,36, // `null
20,80, // `return
21,652, // `instanceof
22,1595, // `new
23,629, // `abstract
24,1525, // `assert
25,1236, // `byte
26,315, // `case
27,1240, // `catch
28,1072, // `char
29,308, // `const
30,1176, // `continue
31,1165, // `default
32,1505, // `do
33,128, // `double
34,41, // `enum
35,497, // `final
36,1445, // `finally
37,487, // `float
38,149, // `goto
39,1591, // `implements
40,849, // `import
41,1008, // `interface
42,1114, // `long
43,1472, // `native
44,1530, // `package
45,1450, // `private
46,447, // `protected
47,612, // `public
48,1631, // `short
49,523, // `static
50,664, // `strictfp
51,79, // `switch
52,268, // `synchronized
53,1146, // `throw
54,1275, // `throws
55,222, // `transient
56,434, // `try
57,573, // `volatile
  }
,
{ // state 1534
2,564, // ws*
152,913, // " "
159,1552, // ws
160,913, // {9}
161,1067, // eol
168,1607, // {10}
169,1415, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1535
102,100, // "t"
  }
,
{ // state 1536
-1, // $$start
-1, // start
1036, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+287, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1537
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+140, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1538
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1539
0x80000000|761, // match move
0x80000000|121, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1540
0x80000000|1091, // match move
0x80000000|1633, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1541
0x80000000|974, // match move
0x80000000|1086, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1542
-1, // $$start
-1, // start
1653, // ws*
-1, // $$0
MIN_REDUCTION+335, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+335, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+335, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+335, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+335, // "u"
1488, // "p"
MIN_REDUCTION+335, // "h"
494, // "v"
MIN_REDUCTION+335, // "y"
MIN_REDUCTION+335, // "m"
827, // "g"
MIN_REDUCTION+335, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+335, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+335, // {"1".."9"}
MIN_REDUCTION+335, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+335, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
1002, // idChar**
525, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1543
177,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1544
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1545
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1546
177,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1547
0x80000000|1033, // match move
0x80000000|840, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1548
-1, // $$start
-1, // start
1577, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+186, // "o"
650, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+186, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+186, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+186, // "u"
1488, // "p"
MIN_REDUCTION+186, // "h"
494, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
827, // "g"
MIN_REDUCTION+186, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+186, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1549
0x80000000|802, // match move
0x80000000|76, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1550
177,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1551
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1552
177,MIN_REDUCTION+360, // $NT
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1553
103,949, // "d"
  }
,
{ // state 1554
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1555
89,1121, // "b"
90,1121, // "o"
91,1121, // "l"
92,1121, // "e"
93,1121, // "a"
94,1121, // "n"
97,1121, // "r"
98,1121, // "k"
99,1121, // "c"
100,1121, // "s"
101,1121, // "x"
102,1121, // "t"
103,1121, // "d"
104,1121, // "f"
105,1121, // "i"
106,1121, // "w"
107,1121, // "u"
108,1121, // "p"
109,1121, // "h"
110,1121, // "v"
111,1121, // "y"
112,1121, // "m"
113,1121, // "g"
114,1121, // "z"
136,218, // "0"
137,218, // {"1".."9"}
138,1121, // "X"
142,383, // digit
148,1376, // letter
149,1247, // "_"
150,1121, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1556
0x80000000|1, // match move
0x80000000|1648, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1557
0x80000000|1326, // match move
0x80000000|1623, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1558
0x80000000|1, // match move
0x80000000|1518, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1559
0x80000000|905, // match move
0x80000000|273, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1560
0x80000000|1507, // match move
0x80000000|1370, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1561
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+288, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1562
177,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1563
102,1609, // "t"
106,798, // "w"
107,126, // "u"
109,1351, // "h"
111,1108, // "y"
  }
,
{ // state 1564
0x80000000|1056, // match move
0x80000000|1248, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1565
2,539, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1566
102,690, // "t"
  }
,
{ // state 1567
2,215, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1568
0x80000000|1, // match move
0x80000000|1534, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1569
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1570
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1571
-1, // $$start
-1, // start
1089, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+147, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+147, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+147, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+147, // "u"
1488, // "p"
MIN_REDUCTION+147, // "h"
494, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
827, // "g"
MIN_REDUCTION+147, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+147, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1572
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1573
0x80000000|1, // match move
0x80000000|1658, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1574
121,543, // "/"
  }
,
{ // state 1575
90,185, // "o"
  }
,
{ // state 1576
92,768, // "e"
  }
,
{ // state 1577
0x80000000|755, // match move
0x80000000|574, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1578
0x80000000|1163, // match move
0x80000000|1362, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1579
0x80000000|394, // match move
0x80000000|1267, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1580
2,306, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1581
177,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1582
177,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1583
0x80000000|921, // match move
0x80000000|1153, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1584
97,475, // "r"
109,679, // "h"
  }
,
{ // state 1585
0x80000000|1580, // match move
0x80000000|1076, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1586
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1587
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+179, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1588
177,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1589
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1590
100,624, // "s"
  }
,
{ // state 1591
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1592
2,406, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1593
0x80000000|530, // match move
0x80000000|310, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1594
0x80000000|662, // match move
0x80000000|1425, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1595
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1596
177,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1597
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1598
0x80000000|817, // match move
0x80000000|265, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1599
0x80000000|1360, // match move
0x80000000|630, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1600
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1601
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+143, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1602
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1603
-1, // $$start
-1, // start
27, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+207, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+207, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+207, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+207, // "u"
1488, // "p"
MIN_REDUCTION+207, // "h"
494, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
827, // "g"
MIN_REDUCTION+207, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+207, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1604
177,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1605
92,508, // "e"
93,568, // "a"
107,1381, // "u"
  }
,
{ // state 1606
93,658, // "a"
  }
,
{ // state 1607
177,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1608
0x80000000|1, // match move
0x80000000|1549, // no-match move
0x80000000|1555, // NT-test-match state for idChar
  }
,
{ // state 1609
93,1535, // "a"
97,1335, // "r"
  }
,
{ // state 1610
2,824, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1611
177,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1612
0x80000000|1614, // match move
0x80000000|1080, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1613
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1614
2,1320, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1615
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1616
0x80000000|1344, // match move
0x80000000|1140, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1617
2,440, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1618
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1619
177,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1620
94,646, // "n"
  }
,
{ // state 1621
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1622
91,565, // "l"
  }
,
{ // state 1623
-1, // $$start
-1, // start
579, // ws*
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+265, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1624
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1625
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1626
2,1330, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1627
97,186, // "r"
  }
,
{ // state 1628
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1629
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+309, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1630
2,984, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1631
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1632
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1633
0x80000000|519, // match move
0x80000000|122, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1634
0x80000000|826, // match move
0x80000000|618, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1635
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1636
0x80000000|291, // match move
0x80000000|1189, // no-match move
0x80000000|1347, // NT-test-match state for commentContent
  }
,
{ // state 1637
0x80000000|916, // match move
0x80000000|1375, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1638
0x80000000|1449, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1639
3,747, // $$0
4,483, // token
58,648, // `!
59,683, // `!=
60,1282, // `%
61,1154, // `&&
63,1180, // `(
64,1432, // `)
65,644, // `{
66,736, // `}
67,672, // `-
68,11, // `+
69,538, // `=
70,1386, // `==
71,135, // `[
72,638, // `]
73,653, // `||
74,504, // `<
75,99, // `<=
76,811, // `,
77,1323, // `>
78,881, // `>=
79,115, // `.
80,929, // `;
81,728, // `++
82,1411, // `--
83,955, // `/
84,596, // `:
85,404, // ID
86,1095, // INTLIT
87,143, // STRINGLIT
88,1545, // CHARLIT
136,1528, // "0"
148,699, // letter
159,1264, // ws
161,1067, // eol
170,663, // token*
  }
,
{ // state 1640
0x80000000|694, // match move
0x80000000|1523, // no-match move
0x80000000|501, // NT-test-match state for reserved
  }
,
{ // state 1641
0x80000000|1106, // match move
0x80000000|1413, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1642
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
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
404, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
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
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+304, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
337, // "0"
337, // {"1".."9"}
105, // "X"
1064, // intLit2
-1, // `x
1399, // digit++
842, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
699, // letter
-1, // "_"
105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1264, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1643
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1644
2,1320, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1645
-1, // $$start
-1, // start
351, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
933, // `boolean
1230, // `class
935, // `extends
4, // `void
207, // `int
1027, // `while
1544, // `if
1338, // `else
1138, // `for
357, // `break
172, // `this
137, // `false
1430, // `true
1408, // `super
36, // `null
80, // `return
652, // `instanceof
1595, // `new
629, // `abstract
1525, // `assert
1236, // `byte
315, // `case
1240, // `catch
1072, // `char
308, // `const
1176, // `continue
1165, // `default
1505, // `do
128, // `double
41, // `enum
497, // `final
1445, // `finally
487, // `float
149, // `goto
1591, // `implements
849, // `import
1008, // `interface
1114, // `long
1472, // `native
1530, // `package
1450, // `private
447, // `protected
612, // `public
1631, // `short
523, // `static
664, // `strictfp
79, // `switch
268, // `synchronized
1146, // `throw
1275, // `throws
222, // `transient
434, // `try
573, // `volatile
648, // `!
683, // `!=
1282, // `%
1154, // `&&
-1, // `*
1180, // `(
1432, // `)
644, // `{
736, // `}
672, // `-
11, // `+
538, // `=
1386, // `==
135, // `[
638, // `]
653, // `||
504, // `<
99, // `<=
811, // `,
1323, // `>
881, // `>=
115, // `.
929, // `;
728, // `++
1411, // `--
955, // `/
596, // `:
-1, // ID
1095, // INTLIT
143, // STRINGLIT
1545, // CHARLIT
1498, // "b"
MIN_REDUCTION+159, // "o"
1575, // "l"
1077, // "e"
1657, // "a"
1605, // "n"
-1, // idChar
-1, // reserved
1038, // "r"
MIN_REDUCTION+159, // "k"
537, // "c"
1563, // "s"
MIN_REDUCTION+159, // "x"
1584, // "t"
415, // "d"
230, // "f"
1510, // "i"
38, // "w"
MIN_REDUCTION+159, // "u"
1488, // "p"
MIN_REDUCTION+159, // "h"
494, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
827, // "g"
MIN_REDUCTION+159, // "z"
617, // "!"
1259, // "="
60, // "%"
263, // "&"
102, // "("
760, // ")"
1022, // "/"
MIN_REDUCTION+159, // "*"
1135, // "+"
682, // ","
1516, // "-"
200, // "."
1274, // ":"
1246, // ";"
1504, // "<"
643, // ">"
1540, // "["
1656, // "]"
213, // "{"
78, // "}"
724, // "|"
1528, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
813, // "'"
-1, // stringChar
727, // '"'
-1, // stringWord
-1, // $$1
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
-1, // printable
913, // " "
-1, // "\"
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1552, // ws
913, // {9}
1067, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1607, // {10}
1415, // {13}
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
{ // state 1646
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1647
89,271, // "b"
90,271, // "o"
91,271, // "l"
92,271, // "e"
93,271, // "a"
94,271, // "n"
97,271, // "r"
98,271, // "k"
99,271, // "c"
100,271, // "s"
101,271, // "x"
102,271, // "t"
103,271, // "d"
104,271, // "f"
105,271, // "i"
106,271, // "w"
107,271, // "u"
108,271, // "p"
109,271, // "h"
110,271, // "v"
111,271, // "y"
112,271, // "m"
113,271, // "g"
114,271, // "z"
115,271, // "!"
116,271, // "="
117,271, // "%"
118,271, // "&"
119,271, // "("
120,271, // ")"
121,271, // "/"
122,271, // "*"
123,271, // "+"
124,271, // ","
125,271, // "-"
126,271, // "."
127,271, // ":"
128,271, // ";"
129,271, // "<"
130,271, // ">"
131,271, // "["
132,271, // "]"
133,271, // "{"
134,271, // "}"
135,271, // "|"
136,271, // "0"
137,271, // {"1".."9"}
138,271, // "X"
143,271, // "'"
145,271, // '"'
149,271, // "_"
150,271, // {"A".."W" "Y".."Z" "j" "q"}
151,1143, // printable
152,271, // " "
153,271, // "\"
154,271, // {"#".."$" "?".."@" "^" "`" "~"}
162,1167, // printable**
171,353, // printable*
  }
,
{ // state 1648
0x80000000|585, // match move
0x80000000|1155, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1649
0x80000000|710, // match move
0x80000000|445, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1650
2,306, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1651
0x80000000|1524, // match move
0x80000000|1228, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1652
2,740, // ws*
159,1552, // ws
161,1067, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1653
0x80000000|703, // match move
0x80000000|1194, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1654
0x80000000|686, // match move
0x80000000|293, // no-match move
0x80000000|1421, // NT-test-match state for stringChar
  }
,
{ // state 1655
159,1264, // ws
161,1067, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1656
0x80000000|1073, // match move
0x80000000|1578, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1657
89,1503, // "b"
100,378, // "s"
  }
,
{ // state 1658
0x80000000|781, // match move
0x80000000|257, // no-match move
// T-test match for "*":
122,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1659][];
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
// CHARLIT ::= "'" stringChar "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" stringChar "'"
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
(148<<16)+1,
// printable ::= {" ".."~"}
(151<<16)+1,
// escapeSlash ::= "\"
(155<<16)+1,
// stringChar ::= !{'"' "\"} printable
(144<<16)+1,
// stringChar ::= escapeSlash "\"
(144<<16)+2,
// stringChar ::= escapeSlash '"'
(144<<16)+2,
// stringChar ::= escapeSlash "'"
(144<<16)+2,
// stringChar ::= escapeSlash "n"
(144<<16)+2,
// stringChar ::= escapeSlash "t"
(144<<16)+2,
// stringChar ::= escapeSlash "f"
(144<<16)+2,
// stringChar ::= escapeSlash "r"
(144<<16)+2,
// stringWord ::= stringChar**
(146<<16)+1,
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
(147<<16)+2,
// $$1 ::= '"'
(147<<16)+1,
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
152, // " "
115, // "!"
145, // '"'
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
150, // "A"
150, // "B"
150, // "C"
150, // "D"
150, // "E"
150, // "F"
150, // "G"
150, // "H"
150, // "I"
150, // "J"
150, // "K"
150, // "L"
150, // "M"
150, // "N"
150, // "O"
150, // "P"
150, // "Q"
150, // "R"
150, // "S"
150, // "T"
150, // "U"
150, // "V"
150, // "W"
138, // "X"
150, // "Y"
150, // "Z"
131, // "["
153, // "\"
132, // "]"
154, // "^"
149, // "_"
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
150, // "j"
98, // "k"
91, // "l"
112, // "m"
94, // "n"
90, // "o"
108, // "p"
150, // "q"
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
"CHARLIT ::= # \"\'\" stringChar \"\'\" ws*", // 313
"CHARLIT ::= # \"\'\" stringChar \"\'\" ws*", // 314
"STRINGLIT ::= # \'\"\' stringWord \'\"\' ws*", // 315
"STRINGLIT ::= # \'\"\' stringWord \'\"\' ws*", // 316
"idChar ::= letter", // 317
"idChar ::= digit", // 318
"idChar ::= \"_\"", // 319
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 320
"printable ::= {\" \"..\"~\"}", // 321
"escapeSlash ::= \"\\\"", // 322
"stringChar ::= !{\'\"\' \"\\\"} printable", // 323
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
    { // 313: CHARLIT ::= [#] "'" stringChar "'" ws* @printableToAscii(int,char,char,char)=>int
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
    { // 314: CHARLIT ::= [#] "'" stringChar "'" [ws*] @printableToAscii(int,char,char,char)=>int
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
    { // 322: escapeSlash ::= "\" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 323: stringChar ::= !{'"' "\"} printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
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
    1,
    -1,
    1,
    1,
    1,
    -1,
    -1,
    1,
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
