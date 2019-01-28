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
public int getEofSym() { return 177; }
public int getNttSym() { return 178; }
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
"escapeChar",
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
public int numSymbols() { return 179;}
private static final int MIN_REDUCTION = 1712;
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
0x80000000|993, // match move
0x80000000|1122, // no-match move
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
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+144, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+144, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+144, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+144, // "u"
1532, // "p"
MIN_REDUCTION+144, // "h"
498, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
849, // "g"
MIN_REDUCTION+144, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+144, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+203, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|1209, // match move
0x80000000|1590, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 6
2,1065, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 7
0x80000000|567, // match move
0x80000000|1494, // no-match move
0x80000000|861, // NT-test-match state for digit
  }
,
{ // state 8
2,1245, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 9
178,MIN_REDUCTION+347, // $NT
  }
,
{ // state 10
109,1624, // "h"
  }
,
{ // state 11
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 12
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 13
0x80000000|1030, // match move
0x80000000|1434, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 14
-1, // $$start
-1, // start
1516, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+228, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+228, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+228, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+228, // "u"
1532, // "p"
MIN_REDUCTION+228, // "h"
498, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
849, // "g"
MIN_REDUCTION+228, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+228, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|819, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 16
178,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 17
100,1082, // "s"
  }
,
{ // state 18
178,MIN_REDUCTION+145, // $NT
  }
,
{ // state 19
2,1409, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 20
123,704, // "+"
  }
,
{ // state 21
2,353, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 22
105,1675, // "i"
  }
,
{ // state 23
90,1015, // "o"
  }
,
{ // state 24
0x80000000|46, // match move
0x80000000|822, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 25
0x80000000|1331, // match move
0x80000000|1073, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 26
178,MIN_REDUCTION+136, // $NT
  }
,
{ // state 27
0x80000000|1603, // match move
0x80000000|1173, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 28
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 29
160,1304, // ws
162,1101, // eol
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+197, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|1406, // match move
0x80000000|1259, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 32
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 33
2,1451, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 34
0x80000000|113, // match move
0x80000000|1407, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 35
100,313, // "s"
102,725, // "t"
  }
,
{ // state 36
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 37
2,1705, // ws*
159,826, // $$2
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 38
109,1534, // "h"
  }
,
{ // state 39
105,1504, // "i"
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+116, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|825, // match move
0x80000000|1677, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 44
2,1025, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 45
102,815, // "t"
  }
,
{ // state 46
2,1048, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 47
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 48
102,619, // "t"
  }
,
{ // state 49
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 50
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 51
0x80000000|335, // match move
0x80000000|693, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 52
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 53
0x80000000|169, // match move
0x80000000|347, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 54
0x80000000|1187, // match move
0x80000000|579, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 55
0x80000000|1424, // match move
0x80000000|151, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 56
178,MIN_REDUCTION+229, // $NT
  }
,
{ // state 57
0x80000000|1569, // match move
0x80000000|224, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 58
-1, // $$start
-1, // start
1169, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+201, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+201, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+201, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+201, // "u"
1532, // "p"
MIN_REDUCTION+201, // "h"
498, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
849, // "g"
MIN_REDUCTION+201, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+201, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+119, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|274, // match move
0x80000000|201, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 61
178,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 62
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 63
100,209, // "s"
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 65
102,1538, // "t"
  }
,
{ // state 66
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 67
178,MIN_REDUCTION+208, // $NT
  }
,
{ // state 68
0x80000000|6, // match move
0x80000000|1585, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 69
91,1316, // "l"
105,1602, // "i"
  }
,
{ // state 70
0x80000000|908, // match move
0x80000000|1656, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 71
0x80000000|1477, // match move
0x80000000|888, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 72
0x80000000|1365, // match move
0x80000000|1068, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 73
-1, // $$start
-1, // start
1184, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+251, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|1665, // match move
0x80000000|841, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 75
4,222, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
  }
,
{ // state 76
-1, // $$start
-1, // start
578, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+111, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+111, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+111, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+111, // "u"
1532, // "p"
MIN_REDUCTION+111, // "h"
498, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
849, // "g"
MIN_REDUCTION+111, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+111, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
2,818, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 78
0x80000000|1615, // match move
0x80000000|945, // no-match move
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
0x80000000|1265, // match move
0x80000000|1509, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 82
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+372, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 83
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+221, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 84
146,401, // '"'
148,991, // $$1
  }
,
{ // state 85
178,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 87
0x80000000|374, // match move
0x80000000|1327, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 88
92,1175, // "e"
  }
,
{ // state 89
178,MIN_REDUCTION+205, // $NT
  }
,
{ // state 90
90,1020, // "o"
105,456, // "i"
  }
,
{ // state 91
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|1580, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 93
178,MIN_REDUCTION+223, // $NT
  }
,
{ // state 94
178,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 95
94,952, // "n"
  }
,
{ // state 96
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 97
2,1419, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 98
0x80000000|1454, // match move
0x80000000|1622, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 99
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 101
105,1188, // "i"
  }
,
{ // state 102
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 103
0x80000000|147, // match move
0x80000000|322, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 104
90,303, // "o"
  }
,
{ // state 105
94,1171, // "n"
  }
,
{ // state 106
0x80000000|930, // match move
0x80000000|1000, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 107
2,645, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 108
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 109
0x80000000|1370, // match move
0x80000000|1037, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 110
-1, // $$start
-1, // start
57, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+135, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+135, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+135, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+135, // "u"
1532, // "p"
MIN_REDUCTION+135, // "h"
498, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
849, // "g"
MIN_REDUCTION+135, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+135, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
93,634, // "a"
  }
,
{ // state 112
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 113
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 114
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+158, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 115
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 117
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 118
99,924, // "c"
  }
,
{ // state 119
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+254, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 120
93,1052, // "a"
  }
,
{ // state 121
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 122
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+239, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 123
0x80000000|263, // match move
0x80000000|807, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 124
121,559, // "/"
165,1166, // commentContent
166,1688, // nestedCommentStart
  }
,
{ // state 125
100,1518, // "s"
  }
,
{ // state 126
0x80000000|752, // match move
0x80000000|174, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 127
108,933, // "p"
  }
,
{ // state 128
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 130
-1, // $$start
477, // start
31, // ws*
1144, // $$0
487, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
-1, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
678, // token*
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
0x80000000|560, // match move
0x80000000|903, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 132
0x80000000|954, // match move
0x80000000|963, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 133
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 135
178,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 138
0x80000000|1399, // match move
0x80000000|1387, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 139
0x80000000|414, // match move
0x80000000|685, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 140
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 141
2,1294, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 143
0x80000000|1235, // match move
0x80000000|480, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 144
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 145
0x80000000|804, // match move
0x80000000|1289, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 146
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 147
2,1462, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 149
0x80000000|1591, // match move
0x80000000|986, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 150
0x80000000|235, // match move
0x80000000|1633, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 151
0x80000000|1319, // match move
0x80000000|194, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 152
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 153
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 154
98,1660, // "k"
  }
,
{ // state 155
2,884, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 156
2,1019, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 157
0x80000000|835, // match move
0x80000000|34, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 158
0x80000000|1022, // match move
0x80000000|1317, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 159
1,477, // start
2,31, // ws*
3,1144, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
89,1544, // "b"
91,1626, // "l"
92,1112, // "e"
93,1709, // "a"
94,1658, // "n"
97,1067, // "r"
99,544, // "c"
100,1613, // "s"
102,1637, // "t"
103,417, // "d"
104,228, // "f"
105,1557, // "i"
106,38, // "w"
108,1532, // "p"
110,498, // "v"
113,849, // "g"
171,678, // token*
177,MIN_REDUCTION+1, // $
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+95, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 162
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 163
0x80000000|1281, // match move
0x80000000|1165, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 164
0x80000000|1136, // match move
0x80000000|999, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 165
0x80000000|345, // match move
0x80000000|550, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 166
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 167
-1, // $$start
-1, // start
1025, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+255, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 168
0x80000000|856, // match move
0x80000000|1529, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 169
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 171
143,275, // "'"
  }
,
{ // state 172
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 173
0x80000000|1121, // match move
0x80000000|817, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 174
-1, // $$start
-1, // start
51, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+222, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+222, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+222, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+222, // "u"
1532, // "p"
MIN_REDUCTION+222, // "h"
498, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
849, // "g"
MIN_REDUCTION+222, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+222, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 175
178,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 176
0x80000000|21, // match move
0x80000000|1698, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 177
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 178
2,1373, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 179
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 180
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+300, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 181
-1, // $$start
-1, // start
1373, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+301, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 182
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 183
94,879, // "n"
  }
,
{ // state 184
94,900, // "n"
  }
,
{ // state 185
-1, // $$start
-1, // start
718, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+373, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 186
178,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 187
0x80000000|784, // match move
0x80000000|30, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 188
178,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 189
0x80000000|178, // match move
0x80000000|349, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 190
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 191
178,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 192
178,MIN_REDUCTION+181, // $NT
  }
,
{ // state 193
2,992, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 194
0x80000000|684, // match move
0x80000000|392, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 195
0x80000000|980, // match move
0x80000000|1321, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 196
0x80000000|191, // match move
0x80000000|1461, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 197
0x80000000|896, // match move
0x80000000|1023, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 198
0x80000000|1197, // match move
0x80000000|897, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 199
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 200
0x80000000|1444, // match move
0x80000000|1636, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 201
0x80000000|1345, // match move
0x80000000|1686, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 202
0x80000000|1244, // match move
0x80000000|534, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 203
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 204
0x80000000|1258, // match move
0x80000000|946, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 205
89,1156, // "b"
90,1156, // "o"
91,1156, // "l"
92,1156, // "e"
93,1156, // "a"
94,1156, // "n"
95,1240, // idChar
97,1156, // "r"
98,1156, // "k"
99,1156, // "c"
100,1156, // "s"
101,1156, // "x"
102,1156, // "t"
103,1156, // "d"
104,1156, // "f"
105,1156, // "i"
106,1156, // "w"
107,1156, // "u"
108,1156, // "p"
109,1156, // "h"
110,1156, // "v"
111,1156, // "y"
112,1156, // "m"
113,1156, // "g"
114,1156, // "z"
136,217, // "0"
137,217, // {"1".."9"}
138,1156, // "X"
142,386, // digit
150,1416, // letter
151,1286, // "_"
152,1156, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 206
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 207
0x80000000|1514, // match move
0x80000000|1337, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 208
0x80000000|237, // match move
0x80000000|1471, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 210
0x80000000|886, // match move
0x80000000|1053, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 211
0x80000000|851, // match move
0x80000000|1089, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 212
0x80000000|524, // match move
0x80000000|943, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 213
0x80000000|923, // match move
0x80000000|808, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 214
178,MIN_REDUCTION+187, // $NT
  }
,
{ // state 215
0x80000000|248, // match move
0x80000000|351, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 216
178,MIN_REDUCTION+163, // $NT
  }
,
{ // state 217
178,MIN_REDUCTION+312, // $NT
  }
,
{ // state 218
0x80000000|1458, // match move
0x80000000|609, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 219
0x80000000|1348, // match move
0x80000000|1099, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 220
98,909, // "k"
  }
,
{ // state 221
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 223
-1, // $$start
-1, // start
1419, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+153, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+153, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+153, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+153, // "u"
1532, // "p"
MIN_REDUCTION+153, // "h"
498, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
849, // "g"
MIN_REDUCTION+153, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+153, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 224
0x80000000|152, // match move
0x80000000|318, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 225
110,839, // "v"
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|176, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 227
102,721, // "t"
  }
,
{ // state 228
90,1163, // "o"
91,260, // "l"
93,646, // "a"
105,1185, // "i"
  }
,
{ // state 229
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 231
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 232
102,859, // "t"
  }
,
{ // state 233
89,1459, // "b"
90,1459, // "o"
91,1459, // "l"
92,1459, // "e"
93,1459, // "a"
94,1459, // "n"
97,1459, // "r"
98,1459, // "k"
99,1459, // "c"
100,1459, // "s"
101,1459, // "x"
102,1459, // "t"
103,1459, // "d"
104,1459, // "f"
105,1459, // "i"
106,1459, // "w"
107,1459, // "u"
108,1459, // "p"
109,1459, // "h"
110,1459, // "v"
111,1459, // "y"
112,1459, // "m"
113,1459, // "g"
114,1459, // "z"
115,1459, // "!"
116,1459, // "="
117,1459, // "%"
118,1459, // "&"
119,1459, // "("
120,1459, // ")"
121,1459, // "/"
122,1459, // "*"
123,1459, // "+"
124,1459, // ","
125,1459, // "-"
126,1459, // "."
127,1459, // ":"
128,1459, // ";"
129,1459, // "<"
130,1459, // ">"
131,1459, // "["
132,1459, // "]"
133,1459, // "{"
134,1459, // "}"
135,1459, // "|"
136,1459, // "0"
137,1459, // {"1".."9"}
138,1459, // "X"
143,1459, // "'"
144,1459, // "\"
146,1459, // '"'
151,1459, // "_"
152,1459, // {"A".."W" "Y".."Z" "j" "q"}
154,1459, // " "
155,1459, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 234
0x80000000|1548, // match move
0x80000000|871, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 235
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 237
3,766, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
89,1544, // "b"
91,1626, // "l"
92,1112, // "e"
93,1709, // "a"
94,1658, // "n"
97,1067, // "r"
99,544, // "c"
100,1613, // "s"
102,1637, // "t"
103,417, // "d"
104,228, // "f"
105,1557, // "i"
106,38, // "w"
108,1532, // "p"
110,498, // "v"
113,849, // "g"
171,678, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 238
0x80000000|613, // match move
0x80000000|919, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 239
2,1013, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 240
0x80000000|606, // match move
0x80000000|892, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 241
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 242
178,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 243
92,1248, // "e"
  }
,
{ // state 244
0x80000000|1292, // match move
0x80000000|622, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 245
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 246
0x80000000|1003, // match move
0x80000000|510, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 247
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 248
89,42, // "b"
90,42, // "o"
91,42, // "l"
92,42, // "e"
93,42, // "a"
94,42, // "n"
97,42, // "r"
98,42, // "k"
99,42, // "c"
100,42, // "s"
101,42, // "x"
102,42, // "t"
103,42, // "d"
104,42, // "f"
105,42, // "i"
106,42, // "w"
107,42, // "u"
108,42, // "p"
109,42, // "h"
110,42, // "v"
111,42, // "y"
112,42, // "m"
113,42, // "g"
114,42, // "z"
115,42, // "!"
116,42, // "="
117,42, // "%"
118,42, // "&"
119,42, // "("
120,42, // ")"
121,42, // "/"
122,42, // "*"
123,42, // "+"
124,42, // ","
125,42, // "-"
126,42, // "."
127,42, // ":"
128,42, // ";"
129,42, // "<"
130,42, // ">"
131,42, // "["
132,42, // "]"
133,42, // "{"
134,42, // "}"
135,42, // "|"
136,42, // "0"
137,42, // {"1".."9"}
138,42, // "X"
143,42, // "'"
144,42, // "\"
145,877, // printable
146,42, // '"'
151,42, // "_"
152,42, // {"A".."W" "Y".."Z" "j" "q"}
154,42, // " "
155,42, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 249
102,860, // "t"
  }
,
{ // state 250
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+98, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 251
0x80000000|837, // match move
0x80000000|529, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 252
-1, // $$start
-1, // start
642, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
-1, // `=
-1, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
MIN_REDUCTION+289, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+289, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 253
178,MIN_REDUCTION+199, // $NT
  }
,
{ // state 254
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 255
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+230, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 256
0x80000000|1417, // match move
0x80000000|394, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 257
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 259
2,1169, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 260
90,426, // "o"
  }
,
{ // state 261
-1, // $$start
-1, // start
1690, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+162, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+162, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+162, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+162, // "u"
1532, // "p"
MIN_REDUCTION+162, // "h"
498, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
849, // "g"
MIN_REDUCTION+162, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+162, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 262
2,884, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 263
2,875, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 264
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 266
-1, // $$start
-1, // start
1485, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+132, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+132, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+132, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+132, // "u"
1532, // "p"
MIN_REDUCTION+132, // "h"
498, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
849, // "g"
MIN_REDUCTION+132, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+132, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 267
118,580, // "&"
  }
,
{ // state 268
2,1516, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 269
0x80000000|1006, // match move
0x80000000|1110, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 270
0x80000000|404, // match move
0x80000000|1397, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 271
-1, // $$start
-1, // start
441, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+141, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+141, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+141, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+141, // "u"
1532, // "p"
MIN_REDUCTION+141, // "h"
498, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
849, // "g"
MIN_REDUCTION+141, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+141, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 272
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 273
0x80000000|1546, // match move
0x80000000|165, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 274
2,552, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 275
0x80000000|107, // match move
0x80000000|370, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 276
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 277
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+200, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 278
0x80000000|331, // match move
0x80000000|788, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 279
178,MIN_REDUCTION+344, // $NT
  }
,
{ // state 280
178,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 281
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|522, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 283
2,1373, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 284
107,495, // "u"
  }
,
{ // state 285
0x80000000|1510, // match move
0x80000000|1014, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 286
2,1194, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 288
0x80000000|1499, // match move
0x80000000|1295, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 289
0x80000000|483, // match move
0x80000000|266, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 290
89,42, // "b"
90,42, // "o"
91,42, // "l"
92,42, // "e"
93,42, // "a"
94,42, // "n"
97,42, // "r"
98,42, // "k"
99,42, // "c"
100,42, // "s"
101,42, // "x"
102,42, // "t"
103,42, // "d"
104,42, // "f"
105,42, // "i"
106,42, // "w"
107,42, // "u"
108,42, // "p"
109,42, // "h"
110,42, // "v"
111,42, // "y"
112,42, // "m"
113,42, // "g"
114,42, // "z"
115,42, // "!"
116,42, // "="
117,42, // "%"
118,42, // "&"
119,42, // "("
120,42, // ")"
121,42, // "/"
122,42, // "*"
123,42, // "+"
124,42, // ","
125,42, // "-"
126,42, // "."
127,42, // ":"
128,42, // ";"
129,42, // "<"
130,42, // ">"
131,42, // "["
132,42, // "]"
133,42, // "{"
134,42, // "}"
135,42, // "|"
136,42, // "0"
137,42, // {"1".."9"}
138,42, // "X"
143,42, // "'"
144,42, // "\"
145,1180, // printable
146,42, // '"'
151,42, // "_"
152,42, // {"A".."W" "Y".."Z" "j" "q"}
154,42, // " "
155,42, // {"#".."$" "?".."@" "^" "`" "~"}
163,1205, // printable**
172,356, // printable*
  }
,
{ // state 291
0x80000000|468, // match move
0x80000000|1695, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 292
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 293
-1, // $$start
-1, // start
1409, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+123, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+123, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+123, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+123, // "u"
1532, // "p"
MIN_REDUCTION+123, // "h"
498, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
849, // "g"
MIN_REDUCTION+123, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+123, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 294
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 295
-1, // $$start
-1, // start
992, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+126, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+126, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+126, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+126, // "u"
1532, // "p"
MIN_REDUCTION+126, // "h"
498, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
849, // "g"
MIN_REDUCTION+126, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+126, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 296
2,645, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 298
0x80000000|1231, // match move
0x80000000|885, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 299
0x80000000|1, // match move
0x80000000|1108, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 300
121,1352, // "/"
122,813, // "*"
  }
,
{ // state 301
178,MIN_REDUCTION+148, // $NT
  }
,
{ // state 302
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 303
106,625, // "w"
  }
,
{ // state 304
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+266, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 305
-1, // $$start
-1, // start
54, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+210, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+210, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+210, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+210, // "u"
1532, // "p"
MIN_REDUCTION+210, // "h"
498, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
849, // "g"
MIN_REDUCTION+210, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+210, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 306
92,43, // "e"
  }
,
{ // state 307
99,935, // "c"
  }
,
{ // state 308
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+122, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 309
122,932, // "*"
  }
,
{ // state 310
0x80000000|664, // match move
0x80000000|1333, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 311
1,477, // start
2,31, // ws*
3,1144, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
171,678, // token*
  }
,
{ // state 312
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 313
102,1480, // "t"
  }
,
{ // state 314
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+256, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 315
0x80000000|287, // match move
0x80000000|304, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 316
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 317
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+294, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 318
0x80000000|1160, // match move
0x80000000|364, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 319
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 320
93,1034, // "a"
  }
,
{ // state 321
2,1025, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 322
0x80000000|379, // match move
0x80000000|87, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 324
92,556, // "e"
  }
,
{ // state 325
0x80000000|444, // match move
0x80000000|1147, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 326
178,MIN_REDUCTION+214, // $NT
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 328
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+264, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 329
0x80000000|49, // match move
0x80000000|1513, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 330
92,1339, // "e"
  }
,
{ // state 331
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 332
0x80000000|254, // match move
0x80000000|317, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 333
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 334
178,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 335
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 336
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+125, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 337
178,MIN_REDUCTION+241, // $NT
  }
,
{ // state 338
0x80000000|1070, // match move
0x80000000|1021, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 339
0x80000000|91, // match move
0x80000000|1164, // no-match move
0x80000000|861, // NT-test-match state for digit
  }
,
{ // state 340
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+286, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 341
0x80000000|657, // match move
0x80000000|428, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 342
178,MIN_REDUCTION+94, // $NT
  }
,
{ // state 343
121,531, // "/"
  }
,
{ // state 344
0x80000000|1, // match move
0x80000000|1312, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 345
2,515, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 346
178,MIN_REDUCTION+217, // $NT
  }
,
{ // state 347
0x80000000|281, // match move
0x80000000|187, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 348
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 349
0x80000000|516, // match move
0x80000000|181, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 350
2,937, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 352
2,718, // ws*
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 353
0x80000000|1526, // match move
0x80000000|1332, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 354
0x80000000|1055, // match move
0x80000000|1490, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 355
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 356
0x80000000|574, // match move
0x80000000|215, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 357
-1, // $$start
-1, // start
1019, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+189, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+189, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+189, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+189, // "u"
1532, // "p"
MIN_REDUCTION+189, // "h"
498, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
849, // "g"
MIN_REDUCTION+189, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+189, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 358
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 360
2,588, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 361
93,1124, // "a"
  }
,
{ // state 362
2,1013, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 363
1,477, // start
2,31, // ws*
3,1144, // $$0
4,487, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
83,982, // `/
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
136,1576, // "0"
150,712, // letter
160,1601, // ws
162,1101, // eol
171,678, // token*
  }
,
{ // state 364
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+134, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 365
92,1035, // "e"
  }
,
{ // state 366
0x80000000|1343, // match move
0x80000000|411, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 367
2,937, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 368
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 369
178,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 370
0x80000000|296, // match move
0x80000000|834, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 371
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+146, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 372
178,MIN_REDUCTION+151, // $NT
  }
,
{ // state 373
91,589, // "l"
  }
,
{ // state 374
2,1462, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 375
102,15, // "t"
  }
,
{ // state 376
92,1463, // "e"
  }
,
{ // state 377
0x80000000|789, // match move
0x80000000|1293, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 378
0x80000000|1182, // match move
0x80000000|763, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 379
2,1462, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 380
178,MIN_REDUCTION+348, // $NT
  }
,
{ // state 381
100,1464, // "s"
  }
,
{ // state 382
2,451, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 383
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 384
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 385
178,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 386
178,MIN_REDUCTION+318, // $NT
  }
,
{ // state 387
99,987, // "c"
  }
,
{ // state 388
2,708, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 389
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 390
2,1065, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 391
178,MIN_REDUCTION+350, // $NT
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 392
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
-1, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
-1, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+263, // "*"
MIN_REDUCTION+263, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 393
0x80000000|554, // match move
0x80000000|743, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 394
89,1459, // "b"
90,1459, // "o"
91,1459, // "l"
92,1459, // "e"
93,1459, // "a"
94,1459, // "n"
97,1459, // "r"
98,1459, // "k"
99,1459, // "c"
100,1459, // "s"
101,1459, // "x"
102,1459, // "t"
103,1459, // "d"
104,1459, // "f"
105,1459, // "i"
106,1459, // "w"
107,1459, // "u"
108,1459, // "p"
109,1459, // "h"
110,1459, // "v"
111,1459, // "y"
112,1459, // "m"
113,1459, // "g"
114,1459, // "z"
115,1459, // "!"
116,1459, // "="
117,1459, // "%"
118,1459, // "&"
119,1459, // "("
120,1459, // ")"
121,1459, // "/"
122,1459, // "*"
123,1459, // "+"
124,1459, // ","
125,1459, // "-"
126,1459, // "."
127,1459, // ":"
128,1459, // ";"
129,1459, // "<"
130,1459, // ">"
131,1459, // "["
132,1459, // "]"
133,1459, // "{"
134,1459, // "}"
135,1459, // "|"
136,1459, // "0"
137,1459, // {"1".."9"}
138,1459, // "X"
143,1459, // "'"
144,1459, // "\"
145,829, // printable
146,1459, // '"'
151,1459, // "_"
152,1459, // {"A".."W" "Y".."Z" "j" "q"}
154,1459, // " "
155,1459, // {"#".."$" "?".."@" "^" "`" "~"}
162,9, // eol
169,1661, // {10}
170,1457, // {13}
  }
,
{ // state 395
0x80000000|1, // match move
0x80000000|338, // no-match move
0x80000000|1604, // NT-test-match state for idChar
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
0x80000000|597, // match move
0x80000000|1113, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 397
0x80000000|283, // match move
0x80000000|189, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 398
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 399
0x80000000|1411, // match move
0x80000000|626, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 400
0x80000000|661, // match move
0x80000000|454, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 401
0x80000000|780, // match move
0x80000000|958, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 402
103,1168, // "d"
  }
,
{ // state 403
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 404
2,418, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 405
0x80000000|438, // match move
0x80000000|731, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 406
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 408
0x80000000|542, // match move
0x80000000|1436, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 409
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 410
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 411
0x80000000|514, // match move
0x80000000|1050, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 412
-1, // $$start
-1, // start
1245, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+120, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+120, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+120, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+120, // "u"
1532, // "p"
MIN_REDUCTION+120, // "h"
498, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
849, // "g"
MIN_REDUCTION+120, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+120, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 413
97,1026, // "r"
  }
,
{ // state 414
2,1369, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 415
0x80000000|1204, // match move
0x80000000|1599, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 416
0x80000000|961, // match move
0x80000000|555, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 417
90,866, // "o"
92,972, // "e"
  }
,
{ // state 418
0x80000000|1639, // match move
0x80000000|1329, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 419
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 420
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 421
121,1352, // "/"
122,813, // "*"
  }
,
{ // state 422
2,1669, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 423
178,MIN_REDUCTION+100, // $NT
  }
,
{ // state 424
99,852, // "c"
  }
,
{ // state 425
0x80000000|199, // match move
0x80000000|774, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 426
93,1507, // "a"
  }
,
{ // state 427
0x80000000|362, // match move
0x80000000|485, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 428
0x80000000|1334, // match move
0x80000000|308, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 429
178,MIN_REDUCTION+202, // $NT
  }
,
{ // state 430
2,451, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 432
92,402, // "e"
  }
,
{ // state 433
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 434
105,1506, // "i"
  }
,
{ // state 435
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 436
2,240, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 438
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 439
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 441
0x80000000|333, // match move
0x80000000|749, // no-match move
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+313, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
108,1236, // "p"
  }
,
{ // state 444
178,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 445
0x80000000|702, // match move
0x80000000|389, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 446
0x80000000|792, // match move
0x80000000|1118, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 447
178,MIN_REDUCTION+91, // $NT
  }
,
{ // state 448
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 449
100,828, // "s"
  }
,
{ // state 450
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+270, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 451
0x80000000|1366, // match move
0x80000000|1484, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 452
89,562, // "b"
90,562, // "o"
91,562, // "l"
92,562, // "e"
93,562, // "a"
94,562, // "n"
95,760, // idChar
97,562, // "r"
98,562, // "k"
99,562, // "c"
100,562, // "s"
101,562, // "x"
102,562, // "t"
103,562, // "d"
104,562, // "f"
105,562, // "i"
106,562, // "w"
107,562, // "u"
108,562, // "p"
109,562, // "h"
110,562, // "v"
111,562, // "y"
112,562, // "m"
113,562, // "g"
114,562, // "z"
136,150, // "0"
137,150, // {"1".."9"}
138,562, // "X"
142,1176, // digit
150,867, // letter
151,1267, // "_"
152,562, // {"A".."W" "Y".."Z" "j" "q"}
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+170, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
0x80000000|1623, // match move
0x80000000|325, // no-match move
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+242, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
110,1047, // "v"
  }
,
{ // state 457
0x80000000|188, // match move
0x80000000|1430, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 458
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 459
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 460
178,MIN_REDUCTION+226, // $NT
  }
,
{ // state 461
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 462
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 463
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 464
125,1638, // "-"
  }
,
{ // state 465
0x80000000|175, // match move
0x80000000|1446, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 466
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 467
94,35, // "n"
  }
,
{ // state 468
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 469
2,1451, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 470
-1, // $$start
-1, // start
553, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+259, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 471
-1, // $$start
-1, // start
1432, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+277, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 472
0x80000000|367, // match move
0x80000000|1564, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 473
2,1369, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 474
178,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 475
0x80000000|696, // match move
0x80000000|1640, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 476
0x80000000|1116, // match move
0x80000000|824, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 477
177,MIN_REDUCTION+0, // $
  }
,
{ // state 478
93,105, // "a"
107,88, // "u"
111,1511, // "y"
  }
,
{ // state 479
0x80000000|182, // match move
0x80000000|776, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 480
0x80000000|440, // match move
0x80000000|1611, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 481
0x80000000|206, // match move
0x80000000|109, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 482
0x80000000|551, // match move
0x80000000|781, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 483
2,1485, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 484
2,1229, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 485
2,1013, // ws*
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
83,982, // `/
84,605, // `:
85,406, // ID
87,142, // STRINGLIT
88,1593, // CHARLIT
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
115,628, // "!"
116,1298, // "="
117,60, // "%"
118,267, // "&"
119,103, // "("
120,778, // ")"
121,1049, // "/"
123,1170, // "+"
124,697, // ","
125,1563, // "-"
126,197, // "."
127,1314, // ":"
128,1285, // ";"
129,1550, // "<"
130,655, // ">"
131,1589, // "["
132,1708, // "]"
133,210, // "{"
134,78, // "}"
135,740, // "|"
138,106, // "X"
143,92, // "'"
146,742, // '"'
150,712, // letter
152,106, // {"A".."W" "Y".."Z" "j" "q"}
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 486
178,MIN_REDUCTION+330, // $NT
  }
,
{ // state 487
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 488
102,1133, // "t"
  }
,
{ // state 489
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 490
0x80000000|1096, // match move
0x80000000|83, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 491
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 492
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+191, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 493
91,306, // "l"
  }
,
{ // state 494
0x80000000|1438, // match move
0x80000000|1350, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 495
112,633, // "m"
  }
,
{ // state 496
178,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 497
0x80000000|1696, // match move
0x80000000|291, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 498
90,69, // "o"
  }
,
{ // state 499
178,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 500
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 502
0x80000000|1707, // match move
0x80000000|74, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 503
89,1459, // "b"
90,1459, // "o"
91,1459, // "l"
92,1459, // "e"
93,1459, // "a"
94,1459, // "n"
97,1459, // "r"
98,1459, // "k"
99,1459, // "c"
100,1459, // "s"
101,1459, // "x"
102,1459, // "t"
103,1459, // "d"
104,1459, // "f"
105,1459, // "i"
106,1459, // "w"
107,1459, // "u"
108,1459, // "p"
109,1459, // "h"
110,1459, // "v"
111,1459, // "y"
112,1459, // "m"
113,1459, // "g"
114,1459, // "z"
115,1459, // "!"
116,1459, // "="
117,1459, // "%"
118,1459, // "&"
119,1459, // "("
120,1459, // ")"
121,1459, // "/"
122,1459, // "*"
123,1459, // "+"
124,1459, // ","
125,1459, // "-"
126,1459, // "."
127,1459, // ":"
128,1459, // ";"
129,1459, // "<"
130,1459, // ">"
131,1459, // "["
132,1459, // "]"
133,1459, // "{"
134,1459, // "}"
135,1459, // "|"
136,1459, // "0"
137,1459, // {"1".."9"}
138,1459, // "X"
143,1459, // "'"
144,1459, // "\"
145,486, // printable
146,1459, // '"'
151,1459, // "_"
152,1459, // {"A".."W" "Y".."Z" "j" "q"}
154,1459, // " "
155,1459, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 504
-1, // $$start
-1, // start
1252, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+171, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+171, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+171, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+171, // "u"
1532, // "p"
MIN_REDUCTION+171, // "h"
498, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
849, // "g"
MIN_REDUCTION+171, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+171, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 505
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 506
5,447, // `boolean
6,1520, // `class
7,1261, // `extends
8,18, // `void
9,1119, // `int
10,301, // `while
11,777, // `if
12,423, // `else
13,1561, // `for
14,342, // `break
15,1598, // `this
16,1346, // `false
17,1469, // `true
18,1632, // `super
19,1497, // `null
20,1155, // `return
21,1031, // `instanceof
22,1273, // `new
23,372, // `abstract
24,1641, // `assert
25,726, // `byte
26,1250, // `case
27,216, // `catch
28,1239, // `char
29,566, // `const
30,607, // `continue
31,1087, // `default
32,1594, // `do
33,192, // `double
34,1522, // `enum
35,214, // `final
36,1431, // `finally
37,1412, // `float
38,732, // `goto
39,253, // `implements
40,429, // `import
41,89, // `interface
42,67, // `long
43,1525, // `native
44,326, // `package
45,346, // `private
46,785, // `protected
47,1481, // `public
48,93, // `short
49,460, // `static
50,56, // `strictfp
51,26, // `switch
52,1097, // `synchronized
53,989, // `throw
54,1635, // `throws
55,337, // `transient
56,769, // `try
57,1198, // `volatile
89,1544, // "b"
91,1626, // "l"
92,1112, // "e"
93,1709, // "a"
94,1658, // "n"
97,1067, // "r"
99,544, // "c"
100,1613, // "s"
102,1637, // "t"
103,417, // "d"
104,228, // "f"
105,1557, // "i"
106,38, // "w"
108,1532, // "p"
110,498, // "v"
113,849, // "g"
  }
,
{ // state 507
0x80000000|19, // match move
0x80000000|293, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 508
0x80000000|1617, // match move
0x80000000|1427, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 509
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 510
0x80000000|286, // match move
0x80000000|1489, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 511
2,1213, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 512
116,1579, // "="
  }
,
{ // state 513
106,344, // "w"
  }
,
{ // state 514
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 515
0x80000000|462, // match move
0x80000000|699, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 516
2,1373, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 517
0x80000000|1650, // match move
0x80000000|795, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 518
0x80000000|360, // match move
0x80000000|1607, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 519
144,99, // "\"
156,205, // escapeSlash
  }
,
{ // state 520
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 521
2,481, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 522
2,200, // ws*
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 523
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 524
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 525
0x80000000|593, // match move
0x80000000|96, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 526
2,875, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 527
2,718, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 528
178,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 529
0x80000000|1425, // match move
0x80000000|1044, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 530
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 531
178,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 532
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 533
178,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 535
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+274, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 536
0x80000000|1, // match move
0x80000000|507, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 537
0x80000000|290, // match move
0x80000000|928, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 538
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 540
2,1184, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 541
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 542
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 543
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 544
90,467, // "o"
91,120, // "l"
93,1342, // "a"
109,320, // "h"
  }
,
{ // state 545
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 546
0x80000000|146, // match move
0x80000000|329, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 547
2,1432, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 548
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+280, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 549
178,MIN_REDUCTION+343, // $NT
  }
,
{ // state 550
-1, // $$start
-1, // start
515, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+279, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 551
2,884, // ws*
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 552
0x80000000|1137, // match move
0x80000000|1004, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 553
0x80000000|603, // match move
0x80000000|1376, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 554
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 555
0x80000000|388, // match move
0x80000000|717, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 556
99,1616, // "c"
  }
,
{ // state 557
0x80000000|997, // match move
0x80000000|1131, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 558
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+298, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 559
122,1542, // "*"
  }
,
{ // state 560
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 561
92,1673, // "e"
  }
,
{ // state 562
0x80000000|1533, // match move
0x80000000|520, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 563
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 564
0x80000000|1587, // match move
0x80000000|204, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 565
0x80000000|348, // match move
0x80000000|1426, // no-match move
0x80000000|861, // NT-test-match state for digit
  }
,
{ // state 566
178,MIN_REDUCTION+169, // $NT
  }
,
{ // state 567
136,339, // "0"
137,339, // {"1".."9"}
142,565, // digit
  }
,
{ // state 568
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 569
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 570
-1, // $$start
-1, // start
1095, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+234, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+234, // "k"
544, // "c"
737, // "s"
MIN_REDUCTION+234, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+234, // "u"
1532, // "p"
MIN_REDUCTION+234, // "h"
498, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
849, // "g"
MIN_REDUCTION+234, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+234, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 571
0x80000000|403, // match move
0x80000000|71, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 572
0x80000000|1523, // match move
0x80000000|1230, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 573
92,1268, // "e"
  }
,
{ // state 574
144,99, // "\"
145,877, // printable
156,748, // escapeSlash
  }
,
{ // state 575
0x80000000|823, // match move
0x80000000|1056, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 576
MIN_REDUCTION+370, // (default reduction)
  }
,
{ // state 577
102,1249, // "t"
  }
,
{ // state 578
0x80000000|959, // match move
0x80000000|973, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 579
0x80000000|292, // match move
0x80000000|457, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 580
0x80000000|44, // match move
0x80000000|244, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 581
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 582
0x80000000|229, // match move
0x80000000|690, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 583
0x80000000|436, // match move
0x80000000|631, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 584
2,645, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 585
0x80000000|912, // match move
0x80000000|1083, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 586
-1, // $$start
-1, // start
599, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+297, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 587
93,387, // "a"
  }
,
{ // state 588
0x80000000|28, // match move
0x80000000|1503, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 589
105,1502, // "i"
  }
,
{ // state 590
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+272, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 591
107,1680, // "u"
  }
,
{ // state 592
2,515, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+369, // (default reduction)
  }
,
{ // state 594
2,853, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 595
0x80000000|1420, // match move
0x80000000|733, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 596
2,553, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 597
2,1294, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 598
2,683, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 599
0x80000000|568, // match move
0x80000000|354, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 600
0x80000000|496, // match move
0x80000000|59, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 601
0x80000000|409, // match move
0x80000000|149, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 602
0x80000000|1642, // match move
0x80000000|840, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 603
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 604
97,1288, // "r"
  }
,
{ // state 605
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 606
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 607
178,MIN_REDUCTION+172, // $NT
  }
,
{ // state 608
0x80000000|239, // match move
0x80000000|427, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 609
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 610
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+296, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 611
0x80000000|1330, // match move
0x80000000|654, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 612
0x80000000|1007, // match move
0x80000000|1308, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 613
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 614
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+155, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 615
2,599, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 616
0x80000000|265, // match move
0x80000000|355, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 617
102,1128, // "t"
  }
,
{ // state 618
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 619
93,1302, // "a"
  }
,
{ // state 620
2,553, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 621
107,893, // "u"
  }
,
{ // state 622
0x80000000|321, // match move
0x80000000|167, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 623
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 624
0x80000000|155, // match move
0x80000000|765, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 625
0x80000000|1643, // match move
0x80000000|955, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 626
3,766, // $$0
4,487, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
62,724, // `*
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
122,282, // "*"
139,1098, // intLit2
141,1442, // digit++
142,864, // digit
150,712, // letter
160,1304, // ws
162,1101, // eol
171,678, // token*
174,7, // digit+
  }
,
{ // state 627
178,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 628
0x80000000|790, // match move
0x80000000|659, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 629
-1, // $$start
-1, // start
552, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+253, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 630
0x80000000|382, // match move
0x80000000|1595, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 631
-1, // $$start
-1, // start
240, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+183, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+183, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+183, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+183, // "u"
1532, // "p"
MIN_REDUCTION+183, // "h"
498, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
849, // "g"
MIN_REDUCTION+183, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+183, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 632
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 633
0x80000000|1, // match move
0x80000000|583, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 634
99,1311, // "c"
  }
,
{ // state 635
0x80000000|1, // match move
0x80000000|802, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 636
2,57, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 637
2,1095, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 638
0x80000000|77, // match move
0x80000000|843, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 639
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 640
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 641
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+236, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 642
0x80000000|1395, // match move
0x80000000|143, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 643
0x80000000|177, // match move
0x80000000|783, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 644
2,1432, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 645
0x80000000|1042, // match move
0x80000000|904, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 646
91,17, // "l"
  }
,
{ // state 647
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 648
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+282, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 649
0x80000000|459, // match move
0x80000000|1130, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 650
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 651
2,1451, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 652
2,1048, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 653
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+110, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 654
0x80000000|729, // match move
0x80000000|1344, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 655
0x80000000|770, // match move
0x80000000|1701, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 656
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 657
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 658
103,63, // "d"
  }
,
{ // state 659
0x80000000|727, // match move
0x80000000|416, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 660
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 661
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 662
90,183, // "o"
111,1433, // "y"
  }
,
{ // state 663
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 664
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 665
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 668
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 669
116,874, // "="
  }
,
{ // state 670
2,157, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 671
102,1318, // "t"
  }
,
{ // state 672
0x80000000|1, // match move
0x80000000|1041, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 673
113,1313, // "g"
  }
,
{ // state 674
0x80000000|1297, // match move
0x80000000|1192, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 675
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 676
4,222, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
83,982, // `/
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
136,1576, // "0"
150,712, // letter
  }
,
{ // state 677
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 678
0x80000000|796, // match move
0x80000000|801, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 679
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 680
0x80000000|1, // match move
0x80000000|747, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 681
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+276, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 682
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 683
0x80000000|741, // match move
0x80000000|1207, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 684
2,234, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 685
0x80000000|473, // match move
0x80000000|1238, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 686
0x80000000|620, // match move
0x80000000|470, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 687
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 688
0x80000000|1575, // match move
0x80000000|775, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 689
2,585, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 690
0x80000000|1657, // match move
0x80000000|791, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 691
102,1223, // "t"
  }
,
{ // state 692
0x80000000|772, // match move
0x80000000|1385, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 693
0x80000000|153, // match move
0x80000000|490, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 694
97,104, // "r"
105,125, // "i"
  }
,
{ // state 695
0x80000000|1, // match move
0x80000000|638, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 696
178,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 697
0x80000000|1697, // match move
0x80000000|1380, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 698
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 699
0x80000000|1381, // match move
0x80000000|595, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 700
91,1627, // "l"
  }
,
{ // state 701
MIN_REDUCTION+368, // (default reduction)
  }
,
{ // state 702
0x80000000|124, // match move
0x80000000|415, // no-match move
0x80000000|1282, // NT-test-match state for commentElement
  }
,
{ // state 703
92,898, // "e"
  }
,
{ // state 704
0x80000000|756, // match move
0x80000000|518, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 705
0x80000000|1678, // match move
0x80000000|979, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 706
97,1349, // "r"
  }
,
{ // state 707
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 708
0x80000000|1559, // match move
0x80000000|173, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 709
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 710
169,1024, // {10}
  }
,
{ // state 711
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+302, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 712
0x80000000|847, // match move
0x80000000|5, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 713
178,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 714
0x80000000|75, // match move
0x80000000|676, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 715
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 716
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 717
-1, // $$start
-1, // start
708, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
-1, // `=
-1, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
MIN_REDUCTION+249, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+249, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 718
0x80000000|108, // match move
0x80000000|1703, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 719
97,323, // "r"
  }
,
{ // state 720
0x80000000|280, // match move
0x80000000|899, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 721
0x80000000|1, // match move
0x80000000|971, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 722
0x80000000|1653, // match move
0x80000000|1566, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 723
2,642, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 725
105,95, // "i"
  }
,
{ // state 726
178,MIN_REDUCTION+157, // $NT
  }
,
{ // state 727
2,708, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 728
144,99, // "\"
145,1180, // printable
156,748, // escapeSlash
163,1205, // printable**
172,356, // printable*
  }
,
{ // state 729
178,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 730
0x80000000|1036, // match move
0x80000000|1109, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 731
0x80000000|1193, // match move
0x80000000|255, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 732
178,MIN_REDUCTION+196, // $NT
  }
,
{ // state 733
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+278, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 734
0x80000000|463, // match move
0x80000000|1058, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 735
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+161, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 736
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 737
0x80000000|1247, // match move
0x80000000|1418, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 738
0x80000000|1043, // match move
0x80000000|1064, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 739
0x80000000|1483, // match move
0x80000000|1543, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 740
135,397, // "|"
  }
,
{ // state 741
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 742
0x80000000|1429, // match move
0x80000000|72, // no-match move
// T-test match for '"':
146,
  }
,
{ // state 743
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 744
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 745
111,1433, // "y"
  }
,
{ // state 746
2,1252, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 747
0x80000000|810, // match move
0x80000000|305, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 748
89,1138, // "b"
90,1138, // "o"
91,1138, // "l"
92,1138, // "e"
93,1138, // "a"
94,1138, // "n"
95,887, // idChar
97,1138, // "r"
98,1138, // "k"
99,1138, // "c"
100,1138, // "s"
101,1138, // "x"
102,1138, // "t"
103,1138, // "d"
104,1138, // "f"
105,1138, // "i"
106,1138, // "w"
107,1138, // "u"
108,1138, // "p"
109,1138, // "h"
110,1138, // "v"
111,1138, // "y"
112,1138, // "m"
113,1138, // "g"
114,1138, // "z"
136,1541, // "0"
137,1541, // {"1".."9"}
138,1138, // "X"
142,1246, // digit
150,734, // letter
151,1353, // "_"
152,1138, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 749
0x80000000|1505, // match move
0x80000000|1290, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 750
97,227, // "r"
  }
,
{ // state 751
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+252, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 752
2,51, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 754
0x80000000|385, // match move
0x80000000|1241, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 755
0x80000000|1, // match move
0x80000000|1634, // no-match move
// T-test match for '"':
146,
  }
,
{ // state 756
2,588, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 757
0x80000000|1226, // match move
0x80000000|1379, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 758
0x80000000|115, // match move
0x80000000|1610, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 759
104,1338, // "f"
  }
,
{ // state 760
0x80000000|257, // match move
0x80000000|1086, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 761
0x80000000|967, // match move
0x80000000|1060, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 762
0x80000000|390, // match move
0x80000000|68, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 763
0x80000000|1515, // match move
0x80000000|590, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 764
91,745, // "l"
  }
,
{ // state 765
0x80000000|262, // match move
0x80000000|482, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 766
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 767
144,99, // "\"
145,486, // printable
156,205, // escapeSlash
  }
,
{ // state 768
94,1232, // "n"
  }
,
{ // state 769
178,MIN_REDUCTION+244, // $NT
  }
,
{ // state 770
116,1404, // "="
  }
,
{ // state 771
2,1651, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 772
92,604, // "e"
  }
,
{ // state 773
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 774
0x80000000|1390, // match move
0x80000000|3, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 775
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+262, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 776
0x80000000|369, // match move
0x80000000|371, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 777
178,MIN_REDUCTION+112, // $NT
  }
,
{ // state 778
0x80000000|970, // match move
0x80000000|1234, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 779
178,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 780
2,718, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+373, // (default reduction)
  }
,
{ // state 781
-1, // $$start
-1, // start
884, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+310, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 782
0x80000000|1645, // match move
0x80000000|977, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 783
0x80000000|974, // match move
0x80000000|711, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 784
178,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 785
178,MIN_REDUCTION+220, // $NT
  }
,
{ // state 786
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 787
0x80000000|1, // match move
0x80000000|730, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 788
0x80000000|1179, // match move
0x80000000|969, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 789
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 790
116,1372, // "="
  }
,
{ // state 791
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+185, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 792
2,642, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 793
-1, // $$start
-1, // start
1669, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
-1, // `=
-1, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
MIN_REDUCTION+281, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+281, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 794
112,1473, // "m"
  }
,
{ // state 795
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+374, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 796
0x80000000|1, // match move
0x80000000|1363, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 797
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 799
2,1690, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 800
121,559, // "/"
164,1530, // commentContent**
165,202, // commentContent
166,1688, // nestedCommentStart
176,445, // commentContent*
  }
,
{ // state 801
0x80000000|714, // match move
0x80000000|476, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 802
0x80000000|1217, // match move
0x80000000|1354, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 803
0x80000000|1120, // match move
0x80000000|119, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 804
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 805
0x80000000|675, // match move
0x80000000|425, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 806
90,1382, // "o"
91,976, // "l"
  }
,
{ // state 807
-1, // $$start
-1, // start
875, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+293, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 808
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 809
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+101, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 810
2,54, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 811
93,105, // "a"
105,1127, // "i"
107,88, // "u"
111,1511, // "y"
  }
,
{ // state 812
0x80000000|33, // match move
0x80000000|1482, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 813
0x80000000|990, // match move
0x80000000|1536, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 814
91,536, // "l"
  }
,
{ // state 815
92,1403, // "e"
  }
,
{ // state 816
105,1475, // "i"
  }
,
{ // state 817
0x80000000|1351, // match move
0x80000000|994, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 818
0x80000000|1384, // match move
0x80000000|1072, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 819
0x80000000|484, // match move
0x80000000|1443, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 820
2,578, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 821
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 822
-1, // $$start
-1, // start
1048, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+305, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 823
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 824
4,222, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
83,982, // `/
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
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
115,628, // "!"
116,1298, // "="
117,60, // "%"
118,267, // "&"
119,103, // "("
120,778, // ")"
121,1618, // "/"
123,1170, // "+"
124,697, // ","
125,1563, // "-"
126,197, // "."
127,1314, // ":"
128,1285, // ";"
129,1550, // "<"
130,655, // ">"
131,1589, // "["
132,1708, // "]"
133,210, // "{"
134,78, // "}"
135,740, // "|"
136,339, // "0"
137,339, // {"1".."9"}
138,106, // "X"
139,1098, // intLit2
141,1442, // digit++
142,864, // digit
143,92, // "'"
146,742, // '"'
150,712, // letter
152,106, // {"A".."W" "Y".."Z" "j" "q"}
174,7, // digit+
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 825
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 827
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+104, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 828
0x80000000|1, // match move
0x80000000|782, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 829
178,MIN_REDUCTION+346, // $NT
  }
,
{ // state 830
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 831
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 832
-1, // $$start
-1, // start
937, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+283, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 833
0x80000000|668, // match move
0x80000000|736, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 834
0x80000000|584, // match move
0x80000000|926, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 835
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 836
0x80000000|1328, // match move
0x80000000|114, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 837
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 838
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 839
92,680, // "e"
  }
,
{ // state 840
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+292, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 841
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+149, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 842
0x80000000|798, // match move
0x80000000|1172, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 843
-1, // $$start
-1, // start
818, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+105, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+105, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+105, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+105, // "u"
1532, // "p"
MIN_REDUCTION+105, // "h"
498, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
849, // "g"
MIN_REDUCTION+105, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+105, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 844
0x80000000|276, // match move
0x80000000|1452, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 845
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 846
0x80000000|1519, // match move
0x80000000|1336, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 847
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
95,964, // idChar
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
136,1630, // "0"
137,1630, // {"1".."9"}
138,106, // "X"
142,218, // digit
150,722, // letter
151,1284, // "_"
152,106, // {"A".."W" "Y".."Z" "j" "q"}
158,1028, // idChar**
175,1347, // idChar*
  }
,
{ // state 848
2,552, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 849
90,671, // "o"
  }
,
{ // state 850
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 851
2,739, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 852
109,914, // "h"
  }
,
{ // state 853
0x80000000|505, // match move
0x80000000|611, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 854
0x80000000|1151, // match move
0x80000000|455, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 855
101,1016, // "x"
136,339, // "0"
137,339, // {"1".."9"}
138,1016, // "X"
140,936, // `x
141,624, // digit++
142,864, // digit
174,7, // digit+
  }
,
{ // state 856
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 857
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+250, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 858
0x80000000|521, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 859
100,995, // "s"
  }
,
{ // state 860
92,1084, // "e"
  }
,
{ // state 861
136,217, // "0"
137,217, // {"1".."9"}
  }
,
{ // state 862
-1, // $$start
-1, // start
451, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
-1, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
-1, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+269, // "*"
1170, // "+"
697, // ","
MIN_REDUCTION+269, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 863
0x80000000|1078, // match move
0x80000000|328, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 864
0x80000000|865, // match move
0x80000000|938, // no-match move
0x80000000|861, // NT-test-match state for digit
  }
,
{ // state 865
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 866
0x80000000|621, // match move
0x80000000|761, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 867
0x80000000|1299, // match move
0x80000000|1212, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 868
0x80000000|1655, // match move
0x80000000|922, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 869
0x80000000|135, // match move
0x80000000|614, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 870
0x80000000|906, // match move
0x80000000|431, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 871
0x80000000|1214, // match move
0x80000000|688, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 872
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 873
94,375, // "n"
  }
,
{ // state 874
0x80000000|350, // match move
0x80000000|472, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 875
0x80000000|1684, // match move
0x80000000|1114, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 876
0x80000000|137, // match move
0x80000000|1540, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 877
0x80000000|632, // match move
0x80000000|916, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 878
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 879
113,327, // "g"
  }
,
{ // state 880
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 881
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 882
0x80000000|1, // match move
0x80000000|1005, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 883
0x80000000|746, // match move
0x80000000|504, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 884
0x80000000|410, // match move
0x80000000|131, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 885
0x80000000|186, // match move
0x80000000|1008, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 886
2,599, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 887
0x80000000|231, // match move
0x80000000|1225, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 888
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+137, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 889
0x80000000|636, // match move
0x80000000|110, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 890
-1, // $$start
-1, // start
310, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+271, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 891
0x80000000|1135, // match move
0x80000000|450, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 892
0x80000000|918, // match move
0x80000000|1063, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 893
89,700, // "b"
  }
,
{ // state 894
MIN_REDUCTION+367, // (default reduction)
  }
,
{ // state 895
178,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 896
2,1294, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 897
0x80000000|179, // match move
0x80000000|754, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 898
103,1605, // "d"
  }
,
{ // state 899
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+212, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 900
0x80000000|1, // match move
0x80000000|1694, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 901
91,939, // "l"
94,284, // "n"
97,1288, // "r"
101,1271, // "x"
  }
,
{ // state 902
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 903
0x80000000|647, // match move
0x80000000|1681, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 904
0x80000000|523, // match move
0x80000000|913, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 905
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 906
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 907
2,981, // ws*
121,300, // "/"
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+328, // $NT
  }
,
{ // state 908
2,27, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 909
0x80000000|1, // match move
0x80000000|858, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 910
0x80000000|1465, // match move
0x80000000|160, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 911
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+92, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 912
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 913
0x80000000|1693, // match move
0x80000000|442, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 914
0x80000000|1, // match move
0x80000000|889, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 915
0x80000000|1, // match move
0x80000000|1017, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 916
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 917
0x80000000|894, // match move
0x80000000|358, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 918
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 919
0x80000000|419, // match move
0x80000000|720, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 920
0x80000000|299, // match move
0x80000000|738, // no-match move
// T-test match for '"':
146,
  }
,
{ // state 921
0x80000000|1668, // match move
0x80000000|52, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 922
0x80000000|639, // match move
0x80000000|869, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 923
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 924
109,706, // "h"
  }
,
{ // state 925
0x80000000|37, // match move
0x80000000|285, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 926
-1, // $$start
-1, // start
645, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+314, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 927
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 928
162,499, // eol
163,1205, // printable**
169,1661, // {10}
170,1457, // {13}
172,356, // printable*
  }
,
{ // state 929
-1, // $$start
-1, // start
1010, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+216, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+216, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+216, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+216, // "u"
1532, // "p"
MIN_REDUCTION+216, // "h"
498, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
849, // "g"
MIN_REDUCTION+216, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+216, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 930
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 931
93,1362, // "a"
  }
,
{ // state 932
178,MIN_REDUCTION+342, // $NT
  }
,
{ // state 933
92,719, // "e"
  }
,
{ // state 934
178,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 935
92,1577, // "e"
  }
,
{ // state 936
136,339, // "0"
137,339, // {"1".."9"}
141,1341, // digit++
142,864, // digit
174,7, // digit+
  }
,
{ // state 937
0x80000000|1216, // match move
0x80000000|983, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 938
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 939
100,330, // "s"
  }
,
{ // state 940
0x80000000|1150, // match move
0x80000000|492, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 941
178,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 942
0x80000000|978, // match move
0x80000000|1242, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 943
0x80000000|682, // match move
0x80000000|475, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 944
2,1305, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 945
0x80000000|1218, // match move
0x80000000|965, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 946
0x80000000|1009, // match move
0x80000000|1356, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 947
0x80000000|1398, // match move
0x80000000|1646, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 948
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 949
0x80000000|1224, // match move
0x80000000|1562, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 950
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 951
0x80000000|94, // match move
0x80000000|1310, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 952
107,365, // "u"
  }
,
{ // state 953
2,1048, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 954
2,1478, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 955
0x80000000|637, // match move
0x80000000|570, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 956
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 957
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 958
0x80000000|527, // match move
0x80000000|1392, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 959
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 960
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 961
2,708, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 962
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 963
-1, // $$start
-1, // start
1478, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+150, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+150, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+150, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+150, // "u"
1532, // "p"
MIN_REDUCTION+150, // "h"
498, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
849, // "g"
MIN_REDUCTION+150, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+150, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 964
0x80000000|576, // match move
0x80000000|433, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 965
0x80000000|1435, // match move
0x80000000|1195, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 966
0x80000000|713, // match move
0x80000000|1414, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 967
2,278, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 968
-1, // $$start
-1, // start
1256, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+168, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+168, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+168, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+168, // "u"
1532, // "p"
MIN_REDUCTION+168, // "h"
498, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
849, // "g"
MIN_REDUCTION+168, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+168, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 969
0x80000000|334, // match move
0x80000000|1071, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 970
2,553, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 971
0x80000000|97, // match move
0x80000000|223, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 972
104,361, // "f"
  }
,
{ // state 973
0x80000000|902, // match move
0x80000000|1447, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 974
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 975
0x80000000|1, // match move
0x80000000|1038, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 976
92,794, // "e"
  }
,
{ // state 977
-1, // $$start
-1, // start
408, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+96, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+96, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+96, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+96, // "u"
1532, // "p"
MIN_REDUCTION+96, // "h"
498, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
849, // "g"
MIN_REDUCTION+96, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+96, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 978
2,53, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 979
0x80000000|1255, // match move
0x80000000|940, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 980
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 981
121,300, // "/"
154,941, // " "
160,1304, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+327, // $NT
  }
,
{ // state 982
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 983
0x80000000|569, // match move
0x80000000|1360, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 984
0x80000000|247, // match move
0x80000000|803, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 985
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 986
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+113, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 987
92,1608, // "e"
  }
,
{ // state 988
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 989
178,MIN_REDUCTION+235, // $NT
  }
,
{ // state 990
0x80000000|800, // match move
0x80000000|494, // no-match move
0x80000000|1282, // NT-test-match state for commentElement
  }
,
{ // state 991
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 992
0x80000000|190, // match move
0x80000000|288, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 993
0x80000000|1, // match move
0x80000000|1537, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 994
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+248, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 995
0x80000000|1, // match move
0x80000000|942, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 996
-1, // $$start
-1, // start
1451, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+291, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 997
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 998
2,805, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 999
0x80000000|1568, // match move
0x80000000|453, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1000
151,MIN_REDUCTION+320, // "_"
158,MIN_REDUCTION+320, // idChar**
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1001
-1, // $$start
-1, // start
705, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+192, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+192, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+192, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+192, // "u"
1532, // "p"
MIN_REDUCTION+192, // "h"
498, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
849, // "g"
MIN_REDUCTION+192, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+192, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1002
89,373, // "b"
  }
,
{ // state 1003
2,1194, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1004
0x80000000|1077, // match move
0x80000000|1368, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1005
0x80000000|1145, // match move
0x80000000|1001, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1006
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1007
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1008
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+164, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1009
178,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1010
0x80000000|881, // match move
0x80000000|1076, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1011
2,868, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1012
0x80000000|159, // match move
0x80000000|130, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1013
0x80000000|62, // match move
0x80000000|643, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1014
-1, // $$start
-1, // start
1705, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+333, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
826, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1015
91,376, // "l"
  }
,
{ // state 1016
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1017
0x80000000|1152, // match move
0x80000000|1396, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1018
-1, // $$start
-1, // start
1213, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+231, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+231, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+231, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+231, // "u"
1532, // "p"
MIN_REDUCTION+231, // "h"
498, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
849, // "g"
MIN_REDUCTION+231, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+231, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1019
0x80000000|850, // match move
0x80000000|1501, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1020
102,324, // "t"
  }
,
{ // state 1021
-1, // $$start
-1, // start
400, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+225, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+225, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+225, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+225, // "u"
1532, // "p"
MIN_REDUCTION+225, // "h"
498, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
849, // "g"
MIN_REDUCTION+225, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+225, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1022
178,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1023
0x80000000|141, // match move
0x80000000|396, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1024
0x80000000|878, // match move
0x80000000|128, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1025
0x80000000|1535, // match move
0x80000000|984, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1026
102,368, // "t"
  }
,
{ // state 1027
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1028
0x80000000|1476, // match move
0x80000000|925, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1029
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1030
178,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1031
178,MIN_REDUCTION+115, // $NT
  }
,
{ // state 1032
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1033
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1034
97,787, // "r"
  }
,
{ // state 1035
0x80000000|1, // match move
0x80000000|883, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1036
2,1210, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1037
0x80000000|533, // match move
0x80000000|911, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1038
0x80000000|670, // match move
0x80000000|2, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1039
0x80000000|710, // match move
0x80000000|195, // no-match move
// T-test match for 10:
169,
  }
,
{ // state 1040
0x80000000|32, // match move
0x80000000|601, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1041
0x80000000|193, // match move
0x80000000|295, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1042
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1043
144,99, // "\"
145,833, // printable
149,917, // stringChar
156,452, // escapeSlash
  }
,
{ // state 1044
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+227, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1045
121,309, // "/"
166,380, // nestedCommentStart
  }
,
{ // state 1046
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1047
93,45, // "a"
  }
,
{ // state 1048
0x80000000|1486, // match move
0x80000000|497, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1049
0x80000000|421, // match move
0x80000000|1583, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1050
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+284, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1051
0x80000000|140, // match move
0x80000000|315, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1052
100,449, // "s"
  }
,
{ // state 1053
0x80000000|1371, // match move
0x80000000|1449, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1054
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1055
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1056
0x80000000|1556, // match move
0x80000000|809, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1057
3,766, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
171,678, // token*
  }
,
{ // state 1058
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1059
89,106, // "b"
90,106, // "o"
91,106, // "l"
92,106, // "e"
93,106, // "a"
94,106, // "n"
95,525, // idChar
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
136,1630, // "0"
137,1630, // {"1".."9"}
138,106, // "X"
142,218, // digit
150,722, // letter
151,1284, // "_"
152,106, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1060
-1, // $$start
-1, // start
278, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+177, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+177, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+177, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
893, // "u"
1532, // "p"
MIN_REDUCTION+177, // "h"
498, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
849, // "g"
MIN_REDUCTION+177, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+177, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1061
2,451, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1062
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1063
0x80000000|16, // match move
0x80000000|1408, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1064
89,138, // "b"
90,138, // "o"
91,138, // "l"
92,138, // "e"
93,138, // "a"
94,138, // "n"
97,138, // "r"
98,138, // "k"
99,138, // "c"
100,138, // "s"
101,138, // "x"
102,138, // "t"
103,138, // "d"
104,138, // "f"
105,138, // "i"
106,138, // "w"
107,138, // "u"
108,138, // "p"
109,138, // "h"
110,138, // "v"
111,138, // "y"
112,138, // "m"
113,138, // "g"
114,138, // "z"
115,138, // "!"
116,138, // "="
117,138, // "%"
118,138, // "&"
119,138, // "("
120,138, // ")"
121,138, // "/"
122,138, // "*"
123,138, // "+"
124,138, // ","
125,138, // "-"
126,138, // "."
127,138, // ":"
128,138, // ";"
129,138, // "<"
130,138, // ">"
131,138, // "["
132,138, // "]"
133,138, // "{"
134,138, // "}"
135,138, // "|"
136,138, // "0"
137,138, // {"1".."9"}
138,138, // "X"
143,138, // "'"
144,138, // "\"
145,833, // printable
146,138, // '"'
149,917, // stringChar
151,138, // "_"
152,138, // {"A".."W" "Y".."Z" "j" "q"}
154,138, // " "
155,138, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 1065
0x80000000|439, // match move
0x80000000|1512, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1066
0x80000000|268, // match move
0x80000000|14, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1067
92,1283, // "e"
  }
,
{ // state 1068
89,138, // "b"
90,138, // "o"
91,138, // "l"
92,138, // "e"
93,138, // "a"
94,138, // "n"
97,138, // "r"
98,138, // "k"
99,138, // "c"
100,138, // "s"
101,138, // "x"
102,138, // "t"
103,138, // "d"
104,138, // "f"
105,138, // "i"
106,138, // "w"
107,138, // "u"
108,138, // "p"
109,138, // "h"
110,138, // "v"
111,138, // "y"
112,138, // "m"
113,138, // "g"
114,138, // "z"
115,138, // "!"
116,138, // "="
117,138, // "%"
118,138, // "&"
119,138, // "("
120,138, // ")"
121,138, // "/"
122,138, // "*"
123,138, // "+"
124,138, // ","
125,138, // "-"
126,138, // "."
127,138, // ":"
128,138, // ";"
129,138, // "<"
130,138, // ">"
131,138, // "["
132,138, // "]"
133,138, // "{"
134,138, // "}"
135,138, // "|"
136,138, // "0"
137,138, // {"1".."9"}
138,138, // "X"
143,138, // "'"
144,138, // "\"
145,833, // printable
146,138, // '"'
147,84, // stringWord
149,1706, // stringChar
151,138, // "_"
152,138, // {"A".."W" "Y".."Z" "j" "q"}
154,138, // " "
155,138, // {"#".."$" "?".."@" "^" "`" "~"}
157,1687, // stringChar**
173,920, // stringChar*
  }
,
{ // state 1069
0x80000000|1470, // match move
0x80000000|535, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1070
2,400, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 1071
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+176, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1072
0x80000000|1508, // match move
0x80000000|1272, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1073
0x80000000|563, // match move
0x80000000|180, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1074
0x80000000|422, // match move
0x80000000|81, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1075
99,10, // "c"
  }
,
{ // state 1076
0x80000000|1405, // match move
0x80000000|966, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1077
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1078
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1079
144,1659, // "\"
  }
,
{ // state 1080
169,391, // {10}
  }
,
{ // state 1081
2,198, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1082
92,695, // "e"
  }
,
{ // state 1083
0x80000000|1359, // match move
0x80000000|219, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1084
0x80000000|1, // match move
0x80000000|1134, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1085
100,48, // "s"
102,692, // "t"
  }
,
{ // state 1086
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1087
178,MIN_REDUCTION+175, // $NT
  }
,
{ // state 1088
2,1040, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1089
-1, // $$start
-1, // start
739, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+243, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+243, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+243, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+243, // "u"
1532, // "p"
MIN_REDUCTION+243, // "h"
498, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
849, // "g"
MIN_REDUCTION+243, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+243, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
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
{ // state 1090
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1091
2,1539, // ws*
121,300, // "/"
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+326, // $NT
  }
,
{ // state 1092
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1093
0x80000000|1581, // match move
0x80000000|1306, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1094
0x80000000|437, // match move
0x80000000|340, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1095
0x80000000|1547, // match move
0x80000000|1251, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1096
178,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 1097
178,MIN_REDUCTION+232, // $NT
  }
,
{ // state 1098
0x80000000|953, // match move
0x80000000|1277, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1099
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+173, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1100
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1101
178,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1102
0x80000000|1221, // match move
0x80000000|968, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1103
102,22, // "t"
  }
,
{ // state 1104
94,39, // "n"
  }
,
{ // state 1105
-1, // $$start
-1, // start
846, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+295, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1106
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1107
2,846, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1108
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1109
-1, // $$start
-1, // start
1210, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+165, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+165, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+165, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+165, // "u"
1532, // "p"
MIN_REDUCTION+165, // "h"
498, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
849, // "g"
MIN_REDUCTION+165, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+165, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1110
0x80000000|1612, // match move
0x80000000|40, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1111
0x80000000|1702, // match move
0x80000000|1355, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1112
91,939, // "l"
94,284, // "n"
101,1271, // "x"
  }
,
{ // state 1113
-1, // $$start
-1, // start
1294, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+273, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1114
0x80000000|709, // match move
0x80000000|602, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1115
-1, // $$start
-1, // start
1358, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+267, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1116
4,222, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
89,1544, // "b"
91,1626, // "l"
92,1112, // "e"
93,1709, // "a"
94,1658, // "n"
97,1067, // "r"
99,544, // "c"
100,1613, // "s"
102,1637, // "t"
103,417, // "d"
104,228, // "f"
105,1557, // "i"
106,38, // "w"
108,1532, // "p"
110,498, // "v"
113,849, // "g"
MIN_REDUCTION+371, // (default reduction)
  }
,
{ // state 1117
0x80000000|764, // match move
0x80000000|1243, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1118
0x80000000|1456, // match move
0x80000000|252, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1119
178,MIN_REDUCTION+118, // $NT
  }
,
{ // state 1120
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1121
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1122
0x80000000|1375, // match move
0x80000000|1012, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1123
0x80000000|821, // match move
0x80000000|479, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1124
107,1301, // "u"
  }
,
{ // state 1125
2,875, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1126
0x80000000|1324, // match move
0x80000000|735, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1127
99,65, // "c"
  }
,
{ // state 1128
0x80000000|1, // match move
0x80000000|1254, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1129
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1130
0x80000000|474, // match move
0x80000000|1545, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1131
0x80000000|1699, // match move
0x80000000|681, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1132
1,477, // start
2,31, // ws*
3,1144, // $$0
4,487, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
62,724, // `*
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
122,282, // "*"
139,1098, // intLit2
141,1442, // digit++
142,864, // digit
150,712, // letter
160,1601, // ws
162,1101, // eol
171,678, // token*
174,7, // digit+
  }
,
{ // state 1133
97,111, // "r"
  }
,
{ // state 1134
0x80000000|1011, // match move
0x80000000|1157, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1135
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1136
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1137
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1138
0x80000000|1092, // match move
0x80000000|458, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 1139
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1140
2,1065, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1141
2,564, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1142
-1, // $$start
-1, // start
683, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+246, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+246, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+246, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+246, // "u"
1532, // "p"
MIN_REDUCTION+246, // "h"
498, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
849, // "g"
MIN_REDUCTION+246, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+246, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1143
94,118, // "n"
  }
,
{ // state 1144
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1145
2,705, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1146
0x80000000|1, // match move
0x80000000|399, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1147
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+224, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1148
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+152, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1149
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1150
178,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1151
178,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1152
2,238, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1153
2,1358, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1154
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1155
178,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1156
178,MIN_REDUCTION+320, // $NT
  }
,
{ // state 1157
-1, // $$start
-1, // start
868, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+156, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+156, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+156, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+156, // "u"
1532, // "p"
MIN_REDUCTION+156, // "h"
498, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
849, // "g"
MIN_REDUCTION+156, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+156, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1158
2,937, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1159
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1160
178,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1161
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+188, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1162
0x80000000|156, // match move
0x80000000|357, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1163
97,230, // "r"
  }
,
{ // state 1164
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1165
-1, // $$start
-1, // start
1309, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+102, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+102, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+102, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+102, // "u"
1532, // "p"
MIN_REDUCTION+102, // "h"
498, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
849, // "g"
MIN_REDUCTION+102, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+102, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1166
0x80000000|166, // match move
0x80000000|1357, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1167
0x80000000|1671, // match move
0x80000000|1340, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1168
0x80000000|1, // match move
0x80000000|1202, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1169
0x80000000|29, // match move
0x80000000|1528, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1170
0x80000000|20, // match move
0x80000000|55, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1171
100,434, // "s"
  }
,
{ // state 1172
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1173
0x80000000|245, // match move
0x80000000|13, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1174
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1175
0x80000000|1, // match move
0x80000000|1227, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1176
0x80000000|1606, // match move
0x80000000|86, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 1177
0x80000000|1445, // match move
0x80000000|1574, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1178
0x80000000|1437, // match move
0x80000000|1647, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1179
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1180
0x80000000|543, // match move
0x80000000|102, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 1181
99,154, // "c"
  }
,
{ // state 1182
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1183
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1184
0x80000000|1253, // match move
0x80000000|612, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1185
94,931, // "n"
  }
,
{ // state 1186
0x80000000|1531, // match move
0x80000000|1326, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1187
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1188
99,395, // "c"
  }
,
{ // state 1189
0x80000000|258, // match move
0x80000000|1257, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1190
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1191
-1, // $$start
-1, // start
853, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+219, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+219, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+219, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+219, // "u"
1532, // "p"
MIN_REDUCTION+219, // "h"
498, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
849, // "g"
MIN_REDUCTION+219, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+219, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1192
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+245, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1193
178,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1194
0x80000000|144, // match move
0x80000000|366, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1195
-1, // $$start
-1, // start
546, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+299, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1196
0x80000000|1081, // match move
0x80000000|1325, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1197
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1198
178,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1199
2,846, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1200
121,85, // "/"
  }
,
{ // state 1201
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1202
0x80000000|511, // match move
0x80000000|1018, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1203
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1204
144,99, // "\"
145,145, // printable
156,1467, // escapeSlash
165,1166, // commentContent
  }
,
{ // state 1205
162,1460, // eol
169,1661, // {10}
170,1457, // {13}
  }
,
{ // state 1206
2,1669, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1207
0x80000000|384, // match move
0x80000000|674, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1208
0x80000000|1057, // match move
0x80000000|1691, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1209
2,1705, // ws*
158,1028, // idChar**
159,532, // $$2
160,1601, // ws
162,1101, // eol
175,1347, // idChar*
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1210
0x80000000|12, // match move
0x80000000|298, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1211
0x80000000|598, // match move
0x80000000|1142, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1212
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1213
0x80000000|1389, // match move
0x80000000|405, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1214
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1215
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1216
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1217
2,844, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1218
2,546, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1219
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1220
0x80000000|1139, // match move
0x80000000|600, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1221
2,1256, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1222
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1223
0x80000000|1, // match move
0x80000000|1270, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1224
2,1432, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1225
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1226
2,1184, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1227
0x80000000|1670, // match move
0x80000000|271, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1228
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 1229
0x80000000|316, // match move
0x80000000|1448, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1230
0x80000000|1320, // match move
0x80000000|1069, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1231
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1232
0x80000000|1, // match move
0x80000000|1186, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1233
0x80000000|161, // match move
0x80000000|517, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1234
0x80000000|596, // match move
0x80000000|686, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1235
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1236
0x80000000|1, // match move
0x80000000|1066, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1237
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1238
-1, // $$start
-1, // start
1369, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+308, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1239
178,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1240
178,MIN_REDUCTION+322, // $NT
  }
,
{ // state 1241
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+194, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1242
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+198, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+198, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+198, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+198, // "u"
1532, // "p"
MIN_REDUCTION+198, // "h"
498, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
849, // "g"
MIN_REDUCTION+198, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+198, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1243
0x80000000|1393, // match move
0x80000000|1596, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1244
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1245
0x80000000|1619, // match move
0x80000000|1220, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1246
0x80000000|1203, // match move
0x80000000|663, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 1247
102,1663, // "t"
106,816, // "w"
107,127, // "u"
109,1391, // "h"
111,1143, // "y"
  }
,
{ // state 1248
93,220, // "a"
  }
,
{ // state 1249
105,225, // "i"
  }
,
{ // state 1250
178,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1251
0x80000000|1222, // match move
0x80000000|951, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1252
0x80000000|797, // match move
0x80000000|164, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1253
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1254
0x80000000|689, // match move
0x80000000|1278, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1255
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1256
0x80000000|50, // match move
0x80000000|649, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1257
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+260, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1258
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1259
0x80000000|1208, // match move
0x80000000|208, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1260
-1, // $$start
-1, // start
481, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+93, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+93, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+93, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+93, // "u"
1532, // "p"
MIN_REDUCTION+93, // "h"
498, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
849, // "g"
MIN_REDUCTION+93, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+93, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1261
178,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1262
-1, // $$start
-1, // start
844, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+237, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+237, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+237, // "x"
1558, // "t"
417, // "d"
228, // "f"
1557, // "i"
1468, // "w"
127, // "u"
1532, // "p"
1391, // "h"
498, // "v"
1143, // "y"
MIN_REDUCTION+237, // "m"
849, // "g"
MIN_REDUCTION+237, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+237, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1263
92,226, // "e"
  }
,
{ // state 1264
108,806, // "p"
  }
,
{ // state 1265
2,1669, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1266
0x80000000|461, // match move
0x80000000|82, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1267
0x80000000|666, // match move
0x80000000|618, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 1268
0x80000000|1, // match move
0x80000000|1211, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1269
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1270
0x80000000|259, // match move
0x80000000|58, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1271
102,561, // "t"
  }
,
{ // state 1272
0x80000000|1649, // match move
0x80000000|827, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1273
178,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1274
0x80000000|1, // match move
0x80000000|1196, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1275
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1276
94,232, // "n"
  }
,
{ // state 1277
0x80000000|652, // match move
0x80000000|24, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1278
-1, // $$start
-1, // start
585, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+174, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+174, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+174, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+174, // "u"
1532, // "p"
MIN_REDUCTION+174, // "h"
498, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
849, // "g"
MIN_REDUCTION+174, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+174, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1279
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1280
0x80000000|1704, // match move
0x80000000|1296, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1281
2,1309, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1282
121,309, // "/"
122,1625, // "*"
166,279, // nestedCommentStart
167,1521, // nestedCommentEnd
  }
,
{ // state 1283
102,591, // "t"
  }
,
{ // state 1284
0x80000000|927, // match move
0x80000000|1046, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1285
0x80000000|592, // match move
0x80000000|273, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1286
178,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1287
-1, // $$start
-1, // start
1040, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+114, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+114, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+114, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+114, // "u"
1532, // "p"
MIN_REDUCTION+114, // "h"
498, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
849, // "g"
MIN_REDUCTION+114, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+114, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1288
104,587, // "f"
  }
,
{ // state 1289
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1290
0x80000000|627, // match move
0x80000000|1586, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1291
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1292
2,1025, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1293
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+290, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1294
0x80000000|715, // match move
0x80000000|378, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1295
0x80000000|242, // match move
0x80000000|336, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1296
-1, // $$start
-1, // start
758, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+99, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+99, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+99, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+99, // "u"
1532, // "p"
MIN_REDUCTION+99, // "h"
498, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
849, // "g"
MIN_REDUCTION+99, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+99, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
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
{ // state 1297
178,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1298
0x80000000|512, // match move
0x80000000|1527, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1299
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1300
0x80000000|988, // match move
0x80000000|1126, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1301
91,617, // "l"
  }
,
{ // state 1302
94,307, // "n"
  }
,
{ // state 1303
1,477, // start
2,31, // ws*
3,1144, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
171,678, // token*
  }
,
{ // state 1304
178,MIN_REDUCTION+359, // $NT
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1305
0x80000000|500, // match move
0x80000000|571, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1306
4,222, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
62,724, // `*
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
122,282, // "*"
139,1098, // intLit2
141,1442, // digit++
142,864, // digit
150,712, // letter
174,7, // digit+
  }
,
{ // state 1307
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1308
0x80000000|407, // match move
0x80000000|857, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1309
0x80000000|1100, // match move
0x80000000|575, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1310
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+233, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1311
102,64, // "t"
  }
,
{ // state 1312
0x80000000|8, // match move
0x80000000|412, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1313
92,915, // "e"
  }
,
{ // state 1314
0x80000000|547, // match move
0x80000000|949, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1315
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1316
93,1103, // "a"
  }
,
{ // state 1317
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+89, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1318
90,1274, // "o"
  }
,
{ // state 1319
2,234, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1320
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1321
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1322
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1323
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1324
178,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1325
-1, // $$start
-1, // start
198, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+195, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+195, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+195, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+195, // "u"
1532, // "p"
MIN_REDUCTION+195, // "h"
498, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
849, // "g"
MIN_REDUCTION+195, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+195, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1326
-1, // $$start
-1, // start
168, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+90, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+90, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+90, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+90, // "u"
1532, // "p"
MIN_REDUCTION+90, // "h"
498, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
849, // "g"
MIN_REDUCTION+90, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+90, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1327
-1, // $$start
-1, // start
1462, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+257, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1328
178,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1329
0x80000000|241, // match move
0x80000000|465, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1330
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1331
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1332
0x80000000|302, // match move
0x80000000|836, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1333
0x80000000|1237, // match move
0x80000000|891, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1334
178,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1335
2,1194, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1336
0x80000000|162, // match move
0x80000000|332, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1337
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1338
0x80000000|1, // match move
0x80000000|1614, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1339
0x80000000|1, // match move
0x80000000|1280, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1340
0x80000000|528, // match move
0x80000000|1148, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1341
0x80000000|1679, // match move
0x80000000|139, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1342
100,1263, // "s"
102,1075, // "t"
  }
,
{ // state 1343
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1344
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+218, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1345
2,552, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1346
178,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1347
0x80000000|1059, // match move
0x80000000|880, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1348
178,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1349
90,1104, // "o"
  }
,
{ // state 1350
89,870, // "b"
90,870, // "o"
91,870, // "l"
92,870, // "e"
93,870, // "a"
94,870, // "n"
97,870, // "r"
98,870, // "k"
99,870, // "c"
100,870, // "s"
101,870, // "x"
102,870, // "t"
103,870, // "d"
104,870, // "f"
105,870, // "i"
106,870, // "w"
107,870, // "u"
108,870, // "p"
109,870, // "h"
110,870, // "v"
111,870, // "y"
112,870, // "m"
113,870, // "g"
114,870, // "z"
115,870, // "!"
116,870, // "="
117,870, // "%"
118,870, // "&"
119,870, // "("
120,870, // ")"
121,870, // "/"
122,870, // "*"
123,870, // "+"
124,870, // ","
125,870, // "-"
126,870, // "."
127,870, // ":"
128,870, // ";"
129,870, // "<"
130,870, // ">"
131,870, // "["
132,870, // "]"
133,870, // "{"
134,870, // "}"
135,870, // "|"
136,870, // "0"
137,870, // {"1".."9"}
138,870, // "X"
143,870, // "'"
144,870, // "\"
145,145, // printable
146,870, // '"'
151,870, // "_"
152,870, // {"A".."W" "Y".."Z" "j" "q"}
154,870, // " "
155,870, // {"#".."$" "?".."@" "^" "`" "~"}
162,921, // eol
164,1530, // commentContent**
165,202, // commentContent
169,1495, // {10}
170,1039, // {13}
176,445, // commentContent*
  }
,
{ // state 1351
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1352
0x80000000|728, // match move
0x80000000|537, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 1353
0x80000000|1062, // match move
0x80000000|830, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 1354
-1, // $$start
-1, // start
844, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+237, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+237, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+237, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+237, // "u"
1532, // "p"
MIN_REDUCTION+237, // "h"
498, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
849, // "g"
MIN_REDUCTION+237, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+237, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1355
0x80000000|1552, // match move
0x80000000|890, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1356
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+128, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1357
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1358
0x80000000|466, // match move
0x80000000|1051, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1359
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1360
0x80000000|1620, // match move
0x80000000|648, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1361
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1362
91,1117, // "l"
  }
,
{ // state 1363
0x80000000|1, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1364
2,588, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1365
144,99, // "\"
145,833, // printable
147,84, // stringWord
149,1706, // stringChar
156,452, // escapeSlash
157,1687, // stringChar**
173,920, // stringChar*
  }
,
{ // state 1366
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1367
178,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1368
0x80000000|121, // match move
0x80000000|751, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1369
0x80000000|1401, // match move
0x80000000|1178, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1370
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1371
2,599, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1372
0x80000000|540, // match move
0x80000000|757, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1373
0x80000000|1560, // match move
0x80000000|25, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1374
105,1127, // "i"
  }
,
{ // state 1375
0x80000000|311, // match move
0x80000000|363, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1376
0x80000000|1491, // match move
0x80000000|876, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1377
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1378
178,MIN_REDUCTION+351, // $NT
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1379
0x80000000|1524, // match move
0x80000000|73, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1380
0x80000000|1153, // match move
0x80000000|1666, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1381
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1382
97,691, // "r"
  }
,
{ // state 1383
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1384
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1385
0x80000000|771, // match move
0x80000000|1498, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1386
0x80000000|1045, // match move
0x80000000|256, // no-match move
0x80000000|1282, // NT-test-match state for commentElement
  }
,
{ // state 1387
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1388
-1, // $$start
-1, // start
805, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+204, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+204, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+204, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+204, // "u"
1532, // "p"
MIN_REDUCTION+204, // "h"
498, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
849, // "g"
MIN_REDUCTION+204, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+204, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1389
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1390
178,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1391
90,413, // "o"
  }
,
{ // state 1392
0x80000000|352, // match move
0x80000000|185, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1393
2,1628, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1394
0x80000000|430, // match move
0x80000000|630, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1395
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1396
-1, // $$start
-1, // start
238, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+213, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+213, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+213, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+213, // "u"
1532, // "p"
MIN_REDUCTION+213, // "h"
498, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
849, // "g"
MIN_REDUCTION+213, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+213, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1397
-1, // $$start
-1, // start
418, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+108, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+108, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+108, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+108, // "u"
1532, // "p"
MIN_REDUCTION+108, // "h"
498, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
849, // "g"
MIN_REDUCTION+108, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+108, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1398
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1399
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1400
178,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1401
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1402
0x80000000|1664, // match move
0x80000000|1105, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1403
0x80000000|1, // match move
0x80000000|1555, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1404
0x80000000|469, // match move
0x80000000|812, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1405
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1406
0x80000000|1, // match move
0x80000000|1146, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 1407
0x80000000|895, // match move
0x80000000|1654, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1408
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+182, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1409
0x80000000|1413, // match move
0x80000000|341, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1410
0x80000000|1367, // match move
0x80000000|250, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1411
3,766, // $$0
4,487, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
171,678, // token*
  }
,
{ // state 1412
178,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1413
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1414
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+215, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1415
-1, // $$start
-1, // start
1305, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+138, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+138, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+138, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+138, // "u"
1532, // "p"
MIN_REDUCTION+138, // "h"
498, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
849, // "g"
MIN_REDUCTION+138, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+138, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1416
178,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1417
144,99, // "\"
145,829, // printable
156,205, // escapeSlash
  }
,
{ // state 1418
0x80000000|1217, // match move
0x80000000|1262, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1419
0x80000000|950, // match move
0x80000000|1167, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1420
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1421
2,1488, // ws*
121,300, // "/"
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+324, // $NT
  }
,
{ // state 1422
0x80000000|1303, // match move
0x80000000|1132, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1423
91,814, // "l"
  }
,
{ // state 1424
2,234, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1425
178,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1426
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1427
-1, // $$start
-1, // start
212, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+180, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+180, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+180, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+180, // "u"
1532, // "p"
MIN_REDUCTION+180, // "h"
498, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
849, // "g"
MIN_REDUCTION+180, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+180, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1428
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1429
0x80000000|1, // match move
0x80000000|1500, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 1430
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+209, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1431
178,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1432
0x80000000|133, // match move
0x80000000|557, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1433
0x80000000|1, // match move
0x80000000|1162, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1434
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+206, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1435
2,546, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1436
0x80000000|541, // match move
0x80000000|910, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1437
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1438
144,99, // "\"
145,145, // printable
156,1467, // escapeSlash
164,1530, // commentContent**
165,202, // commentContent
176,445, // commentContent*
  }
,
{ // state 1439
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1440
0x80000000|61, // match move
0x80000000|1161, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1441
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1442
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1443
-1, // $$start
-1, // start
1229, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+240, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+240, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+240, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+240, // "u"
1532, // "p"
MIN_REDUCTION+240, // "h"
498, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
849, // "g"
MIN_REDUCTION+240, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+240, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1444
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1445
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1446
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+107, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1447
0x80000000|1672, // match move
0x80000000|653, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1448
0x80000000|420, // match move
0x80000000|1588, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1449
0x80000000|615, // match move
0x80000000|586, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1450
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1451
0x80000000|383, // match move
0x80000000|1567, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1452
0x80000000|1154, // match move
0x80000000|1652, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1453
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1454
2,1123, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1455
-1, // $$start
-1, // start
564, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+129, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+129, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+129, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+129, // "u"
1532, // "p"
MIN_REDUCTION+129, // "h"
498, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
849, // "g"
MIN_REDUCTION+129, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+129, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1456
2,642, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1457
0x80000000|1080, // match move
0x80000000|1378, // no-match move
// T-test match for 10:
169,
  }
,
{ // state 1458
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1459
178,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1460
178,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1461
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+131, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1462
0x80000000|957, // match move
0x80000000|947, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1463
93,768, // "a"
  }
,
{ // state 1464
92,750, // "e"
  }
,
{ // state 1465
178,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1466
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+307, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1467
89,207, // "b"
90,207, // "o"
91,207, // "l"
92,207, // "e"
93,207, // "a"
94,207, // "n"
95,393, // idChar
97,207, // "r"
98,207, // "k"
99,207, // "c"
100,207, // "s"
101,207, // "x"
102,207, // "t"
103,207, // "d"
104,207, // "f"
105,207, // "i"
106,207, // "w"
107,207, // "u"
108,207, // "p"
109,207, // "h"
110,207, // "v"
111,207, // "y"
112,207, // "m"
113,207, // "g"
114,207, // "z"
136,616, // "0"
137,616, // {"1".."9"}
138,207, // "X"
142,1582, // digit
150,213, // letter
151,842, // "_"
152,207, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1468
105,1475, // "i"
109,1534, // "h"
  }
,
{ // state 1469
178,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1470
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1471
-1, // $$start
-1, // start
-1, // ws*
766, // $$0
487, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
-1, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
678, // token*
-1, // printable*
-1, // stringChar*
7, // digit+
-1, // idChar*
-1, // commentContent*
MIN_REDUCTION+3, // $
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
{ // state 1472
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1473
92,1276, // "e"
  }
,
{ // state 1474
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1475
102,424, // "t"
  }
,
{ // state 1476
2,1705, // ws*
159,826, // $$2
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1477
178,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1478
0x80000000|845, // match move
0x80000000|502, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1479
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1480
0x80000000|1, // match move
0x80000000|1102, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1481
178,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1482
0x80000000|651, // match move
0x80000000|996, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1483
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1484
0x80000000|1159, // match move
0x80000000|1692, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1485
0x80000000|1323, // match move
0x80000000|1496, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1486
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1487
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1488
121,300, // "/"
154,941, // " "
160,1304, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+323, // $NT
  }
,
{ // state 1489
-1, // $$start
-1, // start
1194, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
-1, // `=
-1, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
MIN_REDUCTION+285, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+285, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1490
0x80000000|1600, // match move
0x80000000|610, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1491
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1492
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1493
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1494
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1495
0x80000000|112, // match move
0x80000000|539, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1496
0x80000000|66, // match move
0x80000000|196, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1497
178,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1498
-1, // $$start
-1, // start
1651, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+117, // "o"
1626, // "l"
901, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+117, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+117, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+117, // "u"
1532, // "p"
MIN_REDUCTION+117, // "h"
498, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
849, // "g"
MIN_REDUCTION+117, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+117, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1499
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1500
146,401, // '"'
147,84, // stringWord
148,1027, // $$1
157,1687, // stringChar**
173,920, // stringChar*
  }
,
{ // state 1501
0x80000000|264, // match move
0x80000000|1440, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1502
99,672, // "c"
  }
,
{ // state 1503
0x80000000|1479, // match move
0x80000000|863, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1504
114,432, // "z"
  }
,
{ // state 1505
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1506
92,873, // "e"
  }
,
{ // state 1507
102,882, // "t"
  }
,
{ // state 1508
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1509
0x80000000|1206, // match move
0x80000000|793, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1510
2,1705, // ws*
159,826, // $$2
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1511
0x80000000|1, // match move
0x80000000|211, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1512
0x80000000|1441, // match move
0x80000000|1094, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1513
0x80000000|1439, // match move
0x80000000|558, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1514
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1515
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1516
0x80000000|47, // match move
0x80000000|251, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1517
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1518
0x80000000|1, // match move
0x80000000|1689, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1519
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1520
178,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1521
178,MIN_REDUCTION+345, // $NT
  }
,
{ // state 1522
178,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1523
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1524
2,1184, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1525
178,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1526
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1527
0x80000000|1335, // match move
0x80000000|246, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1528
0x80000000|117, // match move
0x80000000|1609, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1529
0x80000000|172, // match move
0x80000000|158, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1530
122,1200, // "*"
  }
,
{ // state 1531
2,168, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1532
93,1181, // "a"
97,90, // "r"
107,1002, // "u"
  }
,
{ // state 1533
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 1534
105,493, // "i"
  }
,
{ // state 1535
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1536
122,343, // "*"
164,1530, // commentContent**
176,445, // commentContent*
  }
,
{ // state 1537
0x80000000|1, // match move
0x80000000|1422, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1538
104,443, // "f"
  }
,
{ // state 1539
121,300, // "/"
154,941, // " "
160,1304, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
178,MIN_REDUCTION+325, // $NT
  }
,
{ // state 1540
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+258, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1541
0x80000000|236, // match move
0x80000000|1291, // no-match move
0x80000000|1554, // NT-test-match state for printable
  }
,
{ // state 1542
0x80000000|1029, // match move
0x80000000|1674, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1543
0x80000000|1090, // match move
0x80000000|854, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1544
90,23, // "o"
97,243, // "r"
111,249, // "y"
  }
,
{ // state 1545
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+167, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1546
2,515, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1547
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1548
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1549
100,488, // "s"
  }
,
{ // state 1550
0x80000000|669, // match move
0x80000000|1074, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1551
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1552
2,310, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1553
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1554
0x80000000|519, // match move
0x80000000|233, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 1555
0x80000000|1682, // match move
0x80000000|929, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1556
178,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1557
94,1085, // "n"
104,1662, // "f"
112,1264, // "m"
  }
,
{ // state 1558
93,1584, // "a"
97,811, // "r"
109,694, // "h"
  }
,
{ // state 1559
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1560
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1561
178,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1562
0x80000000|644, // match move
0x80000000|471, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1563
0x80000000|464, // match move
0x80000000|1394, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1564
0x80000000|1158, // match move
0x80000000|832, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1565
0x80000000|998, // match move
0x80000000|1388, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1566
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1567
0x80000000|489, // match move
0x80000000|377, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1568
178,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1569
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1570
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+268, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1571
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+372, // (default reduction)
  }
,
{ // state 1572
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1573
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1574
0x80000000|1032, // match move
0x80000000|548, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1575
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1576
0x80000000|855, // match move
0x80000000|608, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 1577
90,759, // "o"
  }
,
{ // state 1578
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1579
0x80000000|1140, // match move
0x80000000|762, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1580
0x80000000|1, // match move
0x80000000|1621, // no-match move
// T-test match for {"'" "\"}:
143,
144,
  }
,
{ // state 1581
4,222, // token
5,960, // `boolean
6,1269, // `class
7,962, // `extends
8,4, // `void
9,203, // `int
10,1054, // `while
11,1592, // `if
12,1377, // `else
13,1174, // `for
14,359, // `break
15,170, // `this
16,136, // `false
17,1472, // `true
18,1450, // `super
19,36, // `null
20,80, // `return
21,665, // `instanceof
22,1648, // `new
23,640, // `abstract
24,1572, // `assert
25,1275, // `byte
26,319, // `case
27,1279, // `catch
28,1106, // `char
29,312, // `const
30,1215, // `continue
31,1201, // `default
32,1551, // `do
33,129, // `double
34,41, // `enum
35,501, // `final
36,1487, // `finally
37,491, // `float
38,148, // `goto
39,1644, // `implements
40,872, // `import
41,1033, // `interface
42,1149, // `long
43,1517, // `native
44,1578, // `package
45,1493, // `private
46,448, // `protected
47,623, // `public
48,1683, // `short
49,530, // `static
50,679, // `strictfp
51,79, // `switch
52,272, // `synchronized
53,1183, // `throw
54,1315, // `throws
55,221, // `transient
56,435, // `try
57,581, // `volatile
  }
,
{ // state 1582
0x80000000|1573, // match move
0x80000000|985, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1583
2,572, // ws*
154,941, // " "
160,1601, // ws
161,941, // {9}
162,1101, // eol
169,1661, // {10}
170,1457, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1584
102,101, // "t"
  }
,
{ // state 1585
-1, // $$start
-1, // start
1065, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+287, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1586
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+140, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1587
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1588
0x80000000|779, // match move
0x80000000|122, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1589
0x80000000|1125, // match move
0x80000000|1685, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1590
-1, // $$start
-1, // start
1705, // ws*
-1, // $$0
MIN_REDUCTION+335, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+335, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+335, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+335, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+335, // "u"
1532, // "p"
MIN_REDUCTION+335, // "h"
498, // "v"
MIN_REDUCTION+335, // "y"
MIN_REDUCTION+335, // "m"
849, // "g"
MIN_REDUCTION+335, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+335, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+335, // {"1".."9"}
MIN_REDUCTION+335, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+335, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
1028, // idChar**
532, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
-1, // token*
-1, // printable*
-1, // stringChar*
-1, // digit+
1347, // idChar*
-1, // commentContent*
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 1591
178,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1592
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1593
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1594
178,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1595
0x80000000|1061, // match move
0x80000000|862, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1596
-1, // $$start
-1, // start
1628, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+186, // "o"
662, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+186, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+186, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+186, // "u"
1532, // "p"
MIN_REDUCTION+186, // "h"
498, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
849, // "g"
MIN_REDUCTION+186, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+186, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1597
0x80000000|820, // match move
0x80000000|76, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1598
178,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1599
89,870, // "b"
90,870, // "o"
91,870, // "l"
92,870, // "e"
93,870, // "a"
94,870, // "n"
97,870, // "r"
98,870, // "k"
99,870, // "c"
100,870, // "s"
101,870, // "x"
102,870, // "t"
103,870, // "d"
104,870, // "f"
105,870, // "i"
106,870, // "w"
107,870, // "u"
108,870, // "p"
109,870, // "h"
110,870, // "v"
111,870, // "y"
112,870, // "m"
113,870, // "g"
114,870, // "z"
115,870, // "!"
116,870, // "="
117,870, // "%"
118,870, // "&"
119,870, // "("
120,870, // ")"
121,870, // "/"
122,870, // "*"
123,870, // "+"
124,870, // ","
125,870, // "-"
126,870, // "."
127,870, // ":"
128,870, // ";"
129,870, // "<"
130,870, // ">"
131,870, // "["
132,870, // "]"
133,870, // "{"
134,870, // "}"
135,870, // "|"
136,870, // "0"
137,870, // {"1".."9"}
138,870, // "X"
143,870, // "'"
144,870, // "\"
145,145, // printable
146,870, // '"'
151,870, // "_"
152,870, // {"A".."W" "Y".."Z" "j" "q"}
154,870, // " "
155,870, // {"#".."$" "?".."@" "^" "`" "~"}
162,921, // eol
165,1166, // commentContent
169,1495, // {10}
170,1039, // {13}
  }
,
{ // state 1600
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1601
178,MIN_REDUCTION+360, // $NT
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 1602
103,975, // "d"
  }
,
{ // state 1603
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1604
89,1156, // "b"
90,1156, // "o"
91,1156, // "l"
92,1156, // "e"
93,1156, // "a"
94,1156, // "n"
97,1156, // "r"
98,1156, // "k"
99,1156, // "c"
100,1156, // "s"
101,1156, // "x"
102,1156, // "t"
103,1156, // "d"
104,1156, // "f"
105,1156, // "i"
106,1156, // "w"
107,1156, // "u"
108,1156, // "p"
109,1156, // "h"
110,1156, // "v"
111,1156, // "y"
112,1156, // "m"
113,1156, // "g"
114,1156, // "z"
136,217, // "0"
137,217, // {"1".."9"}
138,1156, // "X"
142,386, // digit
150,1416, // letter
151,1286, // "_"
152,1156, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1605
0x80000000|1, // match move
0x80000000|1700, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1606
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1607
0x80000000|1364, // match move
0x80000000|1676, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1608
0x80000000|1, // match move
0x80000000|1565, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1609
0x80000000|934, // match move
0x80000000|277, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1610
0x80000000|1553, // match move
0x80000000|1410, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1611
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+288, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1612
178,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1613
102,1663, // "t"
106,816, // "w"
107,127, // "u"
109,1391, // "h"
111,1143, // "y"
  }
,
{ // state 1614
0x80000000|1088, // match move
0x80000000|1287, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1615
2,546, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1616
102,703, // "t"
  }
,
{ // state 1617
2,212, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1618
0x80000000|1, // match move
0x80000000|1583, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1619
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1620
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1621
89,1459, // "b"
90,1459, // "o"
91,1459, // "l"
92,1459, // "e"
93,1459, // "a"
94,1459, // "n"
97,1459, // "r"
98,1459, // "k"
99,1459, // "c"
100,1459, // "s"
101,1459, // "x"
102,1459, // "t"
103,1459, // "d"
104,1459, // "f"
105,1459, // "i"
106,1459, // "w"
107,1459, // "u"
108,1459, // "p"
109,1459, // "h"
110,1459, // "v"
111,1459, // "y"
112,1459, // "m"
113,1459, // "g"
114,1459, // "z"
115,1459, // "!"
116,1459, // "="
117,1459, // "%"
118,1459, // "&"
119,1459, // "("
120,1459, // ")"
121,1459, // "/"
122,1459, // "*"
123,1459, // "+"
124,1459, // ","
125,1459, // "-"
126,1459, // "."
127,1459, // ":"
128,1459, // ";"
129,1459, // "<"
130,1459, // ">"
131,1459, // "["
132,1459, // "]"
133,1459, // "{"
134,1459, // "}"
135,1459, // "|"
136,1459, // "0"
137,1459, // {"1".."9"}
138,1459, // "X"
143,1459, // "'"
144,1459, // "\"
145,171, // printable
146,1459, // '"'
151,1459, // "_"
152,1459, // {"A".."W" "Y".."Z" "j" "q"}
154,1459, // " "
155,1459, // {"#".."$" "?".."@" "^" "`" "~"}
  }
,
{ // state 1622
-1, // $$start
-1, // start
1123, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+147, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+147, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+147, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+147, // "u"
1532, // "p"
MIN_REDUCTION+147, // "h"
498, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
849, // "g"
MIN_REDUCTION+147, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+147, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1623
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1624
0x80000000|1, // match move
0x80000000|1710, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1625
121,549, // "/"
  }
,
{ // state 1626
90,183, // "o"
  }
,
{ // state 1627
92,786, // "e"
  }
,
{ // state 1628
0x80000000|773, // match move
0x80000000|582, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1629
0x80000000|1199, // match move
0x80000000|1402, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1630
0x80000000|398, // match move
0x80000000|1307, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1631
2,310, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1632
178,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1633
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1634
0x80000000|767, // match move
0x80000000|503, // no-match move
0x80000000|1079, // NT-test-match state for escapeChar
  }
,
{ // state 1635
178,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1636
0x80000000|948, // match move
0x80000000|1189, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1637
97,478, // "r"
109,694, // "h"
  }
,
{ // state 1638
0x80000000|1631, // match move
0x80000000|1111, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1639
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1640
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+179, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1641
178,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1642
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1643
100,635, // "s"
  }
,
{ // state 1644
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1645
2,408, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1646
0x80000000|538, // match move
0x80000000|314, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1647
0x80000000|677, // match move
0x80000000|1466, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1648
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1649
178,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1650
MIN_REDUCTION+374, // (default reduction)
  }
,
{ // state 1651
0x80000000|838, // match move
0x80000000|269, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1652
0x80000000|1400, // match move
0x80000000|641, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1653
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1654
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+143, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1655
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1656
-1, // $$start
-1, // start
27, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+207, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+207, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+207, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+207, // "u"
1532, // "p"
MIN_REDUCTION+207, // "h"
498, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
849, // "g"
MIN_REDUCTION+207, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+207, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1657
178,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1658
92,513, // "e"
93,577, // "a"
107,1423, // "u"
  }
,
{ // state 1659
94,1421, // "n"
102,907, // "t"
104,1091, // "f"
  }
,
{ // state 1660
93,673, // "a"
  }
,
{ // state 1661
178,MIN_REDUCTION+349, // $NT
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1662
0x80000000|1, // match move
0x80000000|1597, // no-match move
0x80000000|1604, // NT-test-match state for idChar
  }
,
{ // state 1663
93,1584, // "a"
97,1374, // "r"
  }
,
{ // state 1664
2,846, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1665
178,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1666
0x80000000|1667, // match move
0x80000000|1115, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1667
2,1358, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1668
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1669
0x80000000|1383, // match move
0x80000000|1177, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1670
2,441, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1671
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1672
178,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1673
94,658, // "n"
  }
,
{ // state 1674
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1675
91,573, // "l"
  }
,
{ // state 1676
-1, // $$start
-1, // start
588, // ws*
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+265, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1677
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1678
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1679
2,1369, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1680
97,184, // "r"
  }
,
{ // state 1681
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+309, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1682
2,1010, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1683
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1684
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1685
0x80000000|526, // match move
0x80000000|123, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1686
0x80000000|848, // match move
0x80000000|629, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1687
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1688
0x80000000|294, // match move
0x80000000|1228, // no-match move
0x80000000|1386, // NT-test-match state for commentContent
  }
,
{ // state 1689
0x80000000|944, // match move
0x80000000|1415, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1690
0x80000000|1492, // match move
0x80000000|1300, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1691
3,766, // $$0
4,487, // token
58,660, // `!
59,698, // `!=
60,1322, // `%
61,1190, // `&&
63,1219, // `(
64,1474, // `)
65,656, // `{
66,753, // `}
67,687, // `-
68,11, // `+
69,545, // `=
70,1428, // `==
71,134, // `[
72,650, // `]
73,667, // `||
74,509, // `<
75,100, // `<=
76,831, // `,
77,1361, // `>
78,905, // `>=
79,116, // `.
80,956, // `;
81,744, // `++
82,1453, // `--
83,982, // `/
84,605, // `:
85,406, // ID
86,1129, // INTLIT
87,142, // STRINGLIT
88,1593, // CHARLIT
136,1576, // "0"
150,712, // letter
160,1304, // ws
162,1101, // eol
171,678, // token*
  }
,
{ // state 1692
0x80000000|707, // match move
0x80000000|1570, // no-match move
0x80000000|506, // NT-test-match state for reserved
  }
,
{ // state 1693
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1694
0x80000000|1141, // match move
0x80000000|1455, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1695
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
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
406, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
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
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+304, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
339, // "0"
339, // {"1".."9"}
106, // "X"
1098, // intLit2
-1, // `x
1442, // digit++
864, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
712, // letter
-1, // "_"
106, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1304, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1696
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1697
2,1358, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1698
-1, // $$start
-1, // start
353, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
960, // `boolean
1269, // `class
962, // `extends
4, // `void
203, // `int
1054, // `while
1592, // `if
1377, // `else
1174, // `for
359, // `break
170, // `this
136, // `false
1472, // `true
1450, // `super
36, // `null
80, // `return
665, // `instanceof
1648, // `new
640, // `abstract
1572, // `assert
1275, // `byte
319, // `case
1279, // `catch
1106, // `char
312, // `const
1215, // `continue
1201, // `default
1551, // `do
129, // `double
41, // `enum
501, // `final
1487, // `finally
491, // `float
148, // `goto
1644, // `implements
872, // `import
1033, // `interface
1149, // `long
1517, // `native
1578, // `package
1493, // `private
448, // `protected
623, // `public
1683, // `short
530, // `static
679, // `strictfp
79, // `switch
272, // `synchronized
1183, // `throw
1315, // `throws
221, // `transient
435, // `try
581, // `volatile
660, // `!
698, // `!=
1322, // `%
1190, // `&&
-1, // `*
1219, // `(
1474, // `)
656, // `{
753, // `}
687, // `-
11, // `+
545, // `=
1428, // `==
134, // `[
650, // `]
667, // `||
509, // `<
100, // `<=
831, // `,
1361, // `>
905, // `>=
116, // `.
956, // `;
744, // `++
1453, // `--
982, // `/
605, // `:
-1, // ID
1129, // INTLIT
142, // STRINGLIT
1593, // CHARLIT
1544, // "b"
MIN_REDUCTION+159, // "o"
1626, // "l"
1112, // "e"
1709, // "a"
1658, // "n"
-1, // idChar
-1, // reserved
1067, // "r"
MIN_REDUCTION+159, // "k"
544, // "c"
1613, // "s"
MIN_REDUCTION+159, // "x"
1637, // "t"
417, // "d"
228, // "f"
1557, // "i"
38, // "w"
MIN_REDUCTION+159, // "u"
1532, // "p"
MIN_REDUCTION+159, // "h"
498, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
849, // "g"
MIN_REDUCTION+159, // "z"
628, // "!"
1298, // "="
60, // "%"
267, // "&"
103, // "("
778, // ")"
1049, // "/"
MIN_REDUCTION+159, // "*"
1170, // "+"
697, // ","
1563, // "-"
197, // "."
1314, // ":"
1285, // ";"
1550, // "<"
655, // ">"
1589, // "["
1708, // "]"
210, // "{"
78, // "}"
740, // "|"
1576, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
92, // "'"
-1, // "\"
-1, // printable
742, // '"'
-1, // stringWord
-1, // $$1
-1, // stringChar
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
-1, // escapeChar
941, // " "
-1, // {"#".."$" "?".."@" "^" "`" "~"}
-1, // escapeSlash
-1, // stringChar**
-1, // idChar**
-1, // $$2
1601, // ws
941, // {9}
1101, // eol
-1, // printable**
-1, // commentContent**
-1, // commentContent
-1, // nestedCommentStart
-1, // nestedCommentEnd
-1, // commentElement
1661, // {10}
1457, // {13}
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
{ // state 1699
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1700
0x80000000|594, // match move
0x80000000|1191, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1701
0x80000000|723, // match move
0x80000000|446, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1702
2,310, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1703
0x80000000|1571, // match move
0x80000000|1266, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1704
2,758, // ws*
160,1601, // ws
162,1101, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1705
0x80000000|716, // match move
0x80000000|1233, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1706
0x80000000|701, // match move
0x80000000|297, // no-match move
0x80000000|755, // NT-test-match state for stringChar
  }
,
{ // state 1707
160,1304, // ws
162,1101, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1708
0x80000000|1107, // match move
0x80000000|1629, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1709
89,1549, // "b"
100,381, // "s"
  }
,
{ // state 1710
0x80000000|799, // match move
0x80000000|261, // no-match move
// T-test match for "*":
122,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1711][];
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
// printable ::= !escapeChar {" ".."~"}
(145<<16)+1,
// printable ::= escapeSlash idChar
(145<<16)+2,
// escapeChar ::= "\" "n" ws*
(153<<16)+3,
// escapeChar ::= "\" "n"
(153<<16)+2,
// escapeChar ::= "\" "f" ws*
(153<<16)+3,
// escapeChar ::= "\" "f"
(153<<16)+2,
// escapeChar ::= "\" "t" ws*
(153<<16)+3,
// escapeChar ::= "\" "t"
(153<<16)+2,
// escapeSlash ::= "\"
(156<<16)+1,
// stringChar ::= !'"' printable
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
(160<<16)+1,
// ws ::= eol
(160<<16)+1,
// ws ::= "/" "/" printable** eol
(160<<16)+4,
// ws ::= "/" "/" !printable eol
(160<<16)+3,
// ws ::= "/" "*" commentContent** "*" "/"
(160<<16)+5,
// ws ::= "/" "*" !commentContent "*" "/"
(160<<16)+4,
// nestedCommentStart ::= "/" "*"
(166<<16)+2,
// nestedCommentEnd ::= "*" "/"
(167<<16)+2,
// commentElement ::= nestedCommentStart
(168<<16)+1,
// commentElement ::= nestedCommentEnd
(168<<16)+1,
// commentContent ::= !commentElement printable
(165<<16)+1,
// commentContent ::= eol
(165<<16)+1,
// commentContent ::= nestedCommentStart
(165<<16)+1,
// eol ::= {10}
(162<<16)+1,
// eol ::= {13} {10}
(162<<16)+2,
// eol ::= {13} !10
(162<<16)+1,
// token* ::= token* token
(171<<16)+2,
// token* ::= token
(171<<16)+1,
// printable** ::= printable* !printable
(163<<16)+1,
// stringChar** ::= stringChar* !stringChar
(157<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// idChar** ::= idChar* !idChar
(158<<16)+1,
// commentContent** ::= commentContent* !commentContent
(164<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(174<<16)+1,
// digit+ ::= digit+ digit
(174<<16)+2,
// commentContent* ::= commentContent* commentContent
(176<<16)+2,
// commentContent* ::= commentContent
(176<<16)+1,
// printable* ::= printable* printable
(172<<16)+2,
// printable* ::= printable
(172<<16)+1,
// stringChar* ::= stringChar* stringChar
(173<<16)+2,
// stringChar* ::= stringChar
(173<<16)+1,
// idChar* ::= idChar* idChar
(175<<16)+2,
// idChar* ::= idChar
(175<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= '"' ws*
(148<<16)+2,
// $$1 ::= '"'
(148<<16)+1,
// $$2 ::= ws*
(159<<16)+1,
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
161, // 9
169, // 10
-1, // 11
-1, // 12
170, // 13
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
154, // " "
115, // "!"
146, // '"'
155, // "#"
155, // "$"
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
155, // "?"
155, // "@"
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
155, // "^"
151, // "_"
155, // "`"
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
155, // "~"
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
"printable ::= !escapeChar {\" \"..\"~\"}", // 321
"printable ::= # escapeSlash idChar", // 322
"escapeChar ::= \"\\\" \"n\" ws*", // 323
"escapeChar ::= \"\\\" \"n\" ws*", // 324
"escapeChar ::= \"\\\" \"f\" ws*", // 325
"escapeChar ::= \"\\\" \"f\" ws*", // 326
"escapeChar ::= \"\\\" \"t\" ws*", // 327
"escapeChar ::= \"\\\" \"t\" ws*", // 328
"escapeSlash ::= \"\\\"", // 329
"stringChar ::= !\'\"\' printable", // 330
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
    { // 321: printable ::= !escapeChar {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 322: printable ::= [#] escapeSlash idChar @escape(int,Character)=>Character
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 323: escapeChar ::= "\" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 324: escapeChar ::= "\" "n" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 325: escapeChar ::= "\" "f" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 326: escapeChar ::= "\" "f" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 327: escapeChar ::= "\" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 328: escapeChar ::= "\" "t" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 329: escapeSlash ::= "\" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 330: stringChar ::= !'"' printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
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
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 333: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 334: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
    { // 335: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((91<<5)|0x5)/*methodCall:91*/,
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
      ((92<<5)|0x5)/*methodCall:92*/,
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
      ((93<<5)|0x5)/*methodCall:93*/,
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
      Character parm1 = (Character)si.popPb();
      Character result = actionObject.escape(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 91: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 92: {
      int parm0 = (Integer)si.popPb();
      actionObject.reportNestedComment(parm0);
    }
    break;
    case 93: {
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
"Character escape(int,Character)",
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
    0,
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
