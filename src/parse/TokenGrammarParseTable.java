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
public int getEofSym() { return 164; }
public int getNttSym() { return 165; }
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
"commentContent",
"10",
"13",
"idChar**",
"$$1",
"token*",
"printable*",
"digit+",
"idChar+",
"idChar*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 166;}
private static final int MIN_REDUCTION = 1506;
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
0x80000000|289, // match move
0x80000000|487, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1166, // match move
0x80000000|853, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 3
0x80000000|910, // match move
0x80000000|1409, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 4
-1, // $$start
-1, // start
248, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+144, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+144, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+144, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+144, // "u"
1193, // "p"
MIN_REDUCTION+144, // "h"
901, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
8, // "g"
MIN_REDUCTION+144, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+144, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+144, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+144, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+144, // $
MIN_REDUCTION+144, // $NT
  }
,
{ // state 5
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+203, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 6
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 7
2,998, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 8
90,1208, // "o"
  }
,
{ // state 9
2,398, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 10
150,803, // ws
152,454, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 11
0x80000000|1026, // match move
0x80000000|1120, // no-match move
0x80000000|45, // NT-test-match state for digit
  }
,
{ // state 12
2,1314, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 13
2,703, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 14
109,1372, // "h"
  }
,
{ // state 15
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 16
109,152, // "h"
  }
,
{ // state 17
0x80000000|915, // match move
0x80000000|1114, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 18
150,803, // ws
152,454, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 19
0x80000000|350, // match move
0x80000000|1010, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 20
0x80000000|532, // match move
0x80000000|818, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 21
-1, // $$start
-1, // start
1160, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+228, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+228, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+228, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+228, // "u"
1193, // "p"
MIN_REDUCTION+228, // "h"
901, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
8, // "g"
MIN_REDUCTION+228, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+228, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+228, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+228, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+228, // $
MIN_REDUCTION+228, // $NT
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|1453, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 23
165,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 24
100,422, // "s"
  }
,
{ // state 25
165,MIN_REDUCTION+145, // $NT
  }
,
{ // state 26
2,969, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 27
123,1263, // "+"
  }
,
{ // state 28
2,631, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 29
105,1455, // "i"
  }
,
{ // state 30
150,803, // ws
152,454, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 31
90,328, // "o"
  }
,
{ // state 32
0x80000000|74, // match move
0x80000000|1459, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 33
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+250, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 34
0x80000000|842, // match move
0x80000000|412, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 35
165,MIN_REDUCTION+136, // $NT
  }
,
{ // state 36
0x80000000|952, // match move
0x80000000|725, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 37
0x80000000|1332, // match move
0x80000000|563, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 38
0x80000000|1167, // match move
0x80000000|91, // no-match move
0x80000000|702, // NT-test-match state for printable
  }
,
{ // state 39
150,803, // ws
152,454, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 40
100,292, // "s"
  }
,
{ // state 41
150,803, // ws
152,454, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 42
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+197, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 43
92,425, // "e"
  }
,
{ // state 44
0x80000000|962, // match move
0x80000000|724, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 45
137,352, // "0"
140,352, // {"1".."9"}
  }
,
{ // state 46
-1, // $$start
-1, // start
806, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
-1, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
-1, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+269, // "*"
741, // "/"
559, // "+"
1252, // ","
MIN_REDUCTION+269, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 47
0x80000000|419, // match move
0x80000000|581, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 48
150,803, // ws
152,454, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 49
0x80000000|51, // match move
0x80000000|188, // no-match move
0x80000000|45, // NT-test-match state for digit
  }
,
{ // state 50
2,1043, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 52
0x80000000|169, // match move
0x80000000|963, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 53
100,555, // "s"
102,1295, // "t"
  }
,
{ // state 54
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 55
0x80000000|1129, // match move
0x80000000|1347, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 56
0x80000000|1419, // match move
0x80000000|158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 57
0x80000000|205, // match move
0x80000000|1119, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 58
109,1199, // "h"
  }
,
{ // state 59
105,1142, // "i"
  }
,
{ // state 60
0x80000000|636, // match move
0x80000000|1233, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 61
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 62
94,669, // "n"
  }
,
{ // state 63
0x80000000|630, // match move
0x80000000|855, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 64
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+116, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 65
0x80000000|1468, // match move
0x80000000|474, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 66
0x80000000|208, // match move
0x80000000|1210, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 67
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 68
0x80000000|1141, // match move
0x80000000|154, // no-match move
0x80000000|702, // NT-test-match state for printable
  }
,
{ // state 69
113,579, // "g"
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 71
0x80000000|763, // match move
0x80000000|186, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 72
2,343, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 73
102,1449, // "t"
  }
,
{ // state 74
2,378, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 76
150,803, // ws
152,454, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 77
150,803, // ws
152,454, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 78
0x80000000|1, // match move
0x80000000|314, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 79
0x80000000|1323, // match move
0x80000000|914, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 80
102,1126, // "t"
  }
,
{ // state 81
150,803, // ws
152,454, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 82
150,803, // ws
152,454, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 83
0x80000000|596, // match move
0x80000000|1248, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 84
0x80000000|293, // match move
0x80000000|319, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 85
2,1090, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 86
0x80000000|268, // match move
0x80000000|623, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 87
0x80000000|597, // match move
0x80000000|1048, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 88
165,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 89
0x80000000|996, // match move
0x80000000|234, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 90
165,MIN_REDUCTION+229, // $NT
  }
,
{ // state 91
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 92
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+137, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 93
0x80000000|1152, // match move
0x80000000|166, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 94
-1, // $$start
-1, // start
546, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+271, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 95
0x80000000|1273, // match move
0x80000000|366, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 96
-1, // $$start
-1, // start
558, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+201, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+201, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+201, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+201, // "u"
1193, // "p"
MIN_REDUCTION+201, // "h"
901, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
8, // "g"
MIN_REDUCTION+201, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+201, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+201, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+201, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+201, // $
MIN_REDUCTION+201, // $NT
  }
,
{ // state 97
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+119, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 98
0x80000000|470, // match move
0x80000000|324, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 99
0x80000000|514, // match move
0x80000000|805, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 100
165,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 101
100,334, // "s"
  }
,
{ // state 102
0x80000000|155, // match move
0x80000000|396, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 103
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 104
102,1206, // "t"
  }
,
{ // state 105
150,803, // ws
152,454, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 106
165,MIN_REDUCTION+208, // $NT
  }
,
{ // state 107
0x80000000|585, // match move
0x80000000|209, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 108
89,1255, // "b"
  }
,
{ // state 109
0x80000000|9, // match move
0x80000000|1293, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 110
91,821, // "l"
105,1330, // "i"
  }
,
{ // state 111
0x80000000|139, // match move
0x80000000|1420, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 112
0x80000000|440, // match move
0x80000000|545, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 113
165,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 114
2,789, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 115
0x80000000|283, // match move
0x80000000|1333, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 116
103,1337, // "d"
  }
,
{ // state 117
0x80000000|1084, // match move
0x80000000|92, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 118
-1, // $$start
-1, // start
590, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+251, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 119
0x80000000|1438, // match move
0x80000000|1493, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 120
4,361, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
  }
,
{ // state 121
-1, // $$start
-1, // start
1047, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+111, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+111, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+111, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+111, // "u"
1193, // "p"
MIN_REDUCTION+111, // "h"
901, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
8, // "g"
MIN_REDUCTION+111, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+111, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+111, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+111, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+111, // $
MIN_REDUCTION+111, // $NT
  }
,
{ // state 122
150,803, // ws
152,454, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 123
2,1452, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 124
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+212, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 125
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 126
0x80000000|1354, // match move
0x80000000|207, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 127
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 128
0x80000000|735, // match move
0x80000000|1149, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 129
2,107, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 130
2,347, // ws*
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 131
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+221, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|1477, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 133
91,189, // "l"
94,496, // "n"
97,773, // "r"
101,740, // "x"
  }
,
{ // state 134
150,803, // ws
152,454, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 135
0x80000000|667, // match move
0x80000000|837, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 136
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 137
92,568, // "e"
  }
,
{ // state 138
165,MIN_REDUCTION+205, // $NT
  }
,
{ // state 139
2,37, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 140
90,336, // "o"
105,824, // "i"
  }
,
{ // state 141
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 143
0x80000000|1066, // match move
0x80000000|253, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 144
165,MIN_REDUCTION+223, // $NT
  }
,
{ // state 145
165,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 146
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+92, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 147
94,217, // "n"
  }
,
{ // state 148
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 149
150,803, // ws
152,454, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 150
2,985, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 151
0x80000000|1046, // match move
0x80000000|1368, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|93, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 154
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 155
150,803, // ws
152,454, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 156
0x80000000|745, // match move
0x80000000|1286, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 157
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 158
0x80000000|1157, // match move
0x80000000|57, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 159
105,598, // "i"
  }
,
{ // state 160
0x80000000|225, // match move
0x80000000|573, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 161
90,526, // "o"
  }
,
{ // state 162
94,560, // "n"
  }
,
{ // state 163
0x80000000|173, // match move
0x80000000|305, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 164
109,1266, // "h"
  }
,
{ // state 165
0x80000000|902, // match move
0x80000000|364, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 166
-1, // $$start
-1, // start
95, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+135, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+135, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+135, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+135, // "u"
1193, // "p"
MIN_REDUCTION+135, // "h"
901, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
8, // "g"
MIN_REDUCTION+135, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+135, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+135, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+135, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+135, // $
MIN_REDUCTION+135, // $NT
  }
,
{ // state 167
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 168
93,1147, // "a"
  }
,
{ // state 169
150,803, // ws
152,454, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 170
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+158, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 171
150,803, // ws
152,454, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 172
-1, // $$start
-1, // start
322, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+216, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+216, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+216, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+216, // "u"
1193, // "p"
MIN_REDUCTION+216, // "h"
901, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
8, // "g"
MIN_REDUCTION+216, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+216, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+216, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+216, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+216, // $
MIN_REDUCTION+216, // $NT
  }
,
{ // state 173
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 175
150,803, // ws
152,454, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 176
93,893, // "a"
  }
,
{ // state 177
92,1285, // "e"
  }
,
{ // state 178
99,164, // "c"
  }
,
{ // state 179
165,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 180
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+254, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 181
93,384, // "a"
  }
,
{ // state 182
92,1282, // "e"
  }
,
{ // state 183
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 184
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+239, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 185
0x80000000|639, // match move
0x80000000|272, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 186
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+345, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+345, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+345, // $
-1, // $NT
  }
,
{ // state 187
0x80000000|444, // match move
0x80000000|1435, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 188
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 189
100,588, // "s"
  }
,
{ // state 190
100,1164, // "s"
  }
,
{ // state 191
0x80000000|1329, // match move
0x80000000|274, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 192
0x80000000|530, // match move
0x80000000|886, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 193
108,177, // "p"
  }
,
{ // state 194
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 195
165,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 196
0x80000000|262, // match move
0x80000000|696, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 197
0x80000000|1220, // match move
0x80000000|859, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 198
-1, // $$start
864, // start
44, // ws*
524, // $$0
879, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
-1, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
1216, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 199
0x80000000|228, // match move
0x80000000|242, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 200
2,804, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 201
0x80000000|129, // match move
0x80000000|1050, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 202
150,803, // ws
152,454, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 203
121,392, // "*"
  }
,
{ // state 204
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 205
165,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 207
0x80000000|642, // match move
0x80000000|243, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 208
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 209
0x80000000|122, // match move
0x80000000|748, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 210
0x80000000|320, // match move
0x80000000|887, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 211
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,574, // idChar
97,163, // "r"
98,163, // "k"
99,163, // "c"
100,163, // "s"
101,163, // "x"
102,163, // "t"
103,163, // "d"
104,163, // "f"
105,163, // "i"
106,163, // "w"
107,163, // "u"
108,163, // "p"
109,163, // "h"
110,163, // "v"
111,163, // "y"
112,163, // "m"
113,163, // "g"
114,163, // "z"
137,1383, // "0"
139,353, // digit
140,1383, // {"1".."9"}
145,1288, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
  }
,
{ // state 212
0x80000000|949, // match move
0x80000000|1403, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 213
0x80000000|656, // match move
0x80000000|1258, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 214
0x80000000|145, // match move
0x80000000|811, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 215
150,803, // ws
152,454, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 216
150,803, // ws
152,454, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 217
107,653, // "u"
  }
,
{ // state 218
141,1064, // "'"
  }
,
{ // state 219
2,789, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 221
0x80000000|687, // match move
0x80000000|872, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 222
150,803, // ws
152,454, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 223
150,803, // ws
152,454, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 224
2,378, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 225
2,1059, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 226
2,1360, // ws*
158,477, // $$1
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 227
0x80000000|705, // match move
0x80000000|201, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 228
2,1088, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 230
0x80000000|1154, // match move
0x80000000|1031, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 231
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 232
0x80000000|1301, // match move
0x80000000|278, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 233
150,803, // ws
152,454, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 234
0x80000000|826, // match move
0x80000000|308, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 235
150,803, // ws
152,454, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 236
150,803, // ws
152,454, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 238
2,1268, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 239
150,803, // ws
152,454, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 240
98,1427, // "k"
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
MIN_REDUCTION+150, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+150, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+150, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+150, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+150, // "u"
1193, // "p"
MIN_REDUCTION+150, // "h"
901, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
8, // "g"
MIN_REDUCTION+150, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+150, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+150, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+150, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+150, // $
MIN_REDUCTION+150, // $NT
  }
,
{ // state 243
0x80000000|1011, // match move
0x80000000|612, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 244
0x80000000|1276, // match move
0x80000000|976, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 245
2,483, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 246
-1, // $$start
-1, // start
721, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+168, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+168, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+168, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+168, // "u"
1193, // "p"
MIN_REDUCTION+168, // "h"
901, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
8, // "g"
MIN_REDUCTION+168, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+168, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+168, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+168, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+168, // $
MIN_REDUCTION+168, // $NT
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
2,332, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 248
0x80000000|1479, // match move
0x80000000|52, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 249
0x80000000|338, // match move
0x80000000|822, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 250
1,864, // start
2,44, // ws*
3,524, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
89,1226, // "b"
91,1378, // "l"
92,472, // "e"
93,1503, // "a"
94,1423, // "n"
97,401, // "r"
99,988, // "c"
100,1351, // "s"
102,1389, // "t"
103,743, // "d"
104,372, // "f"
105,1243, // "i"
106,58, // "w"
108,1193, // "p"
110,901, // "v"
113,8, // "g"
159,1216, // token*
164,MIN_REDUCTION+1, // $
  }
,
{ // state 251
0x80000000|594, // match move
0x80000000|405, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 252
2,1003, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 253
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+95, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 254
0x80000000|150, // match move
0x80000000|363, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 255
104,649, // "f"
  }
,
{ // state 256
0x80000000|134, // match move
0x80000000|1036, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 257
150,803, // ws
152,454, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 258
0x80000000|759, // match move
0x80000000|552, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 260
92,1412, // "e"
  }
,
{ // state 261
-1, // $$start
-1, // start
726, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+96, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+96, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+96, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+96, // "u"
1193, // "p"
MIN_REDUCTION+96, // "h"
901, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
8, // "g"
MIN_REDUCTION+96, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+96, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+96, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+96, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+96, // $
MIN_REDUCTION+96, // $NT
  }
,
{ // state 262
2,86, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 263
0x80000000|515, // match move
0x80000000|304, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 264
0x80000000|719, // match move
0x80000000|192, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 265
0x80000000|615, // match move
0x80000000|995, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 266
-1, // $$start
-1, // start
343, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+255, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 267
0x80000000|30, // match move
0x80000000|1189, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 268
150,803, // ws
152,454, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 271
150,803, // ws
152,454, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 272
0x80000000|1028, // match move
0x80000000|890, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 273
0x80000000|486, // match move
0x80000000|1451, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 274
-1, // $$start
-1, // start
83, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+222, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+222, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+222, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+222, // "u"
1193, // "p"
MIN_REDUCTION+222, // "h"
901, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
8, // "g"
MIN_REDUCTION+222, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+222, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+222, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+222, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+222, // $
MIN_REDUCTION+222, // $NT
  }
,
{ // state 275
0x80000000|428, // match move
0x80000000|1426, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 276
165,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 277
0x80000000|28, // match move
0x80000000|1484, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 278
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+113, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 279
2,906, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 280
92,1341, // "e"
  }
,
{ // state 281
150,803, // ws
152,454, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 282
165,MIN_REDUCTION+235, // $NT
  }
,
{ // state 283
150,803, // ws
152,454, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 284
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+300, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 285
-1, // $$start
-1, // start
906, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+301, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 286
150,803, // ws
152,454, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 287
0x80000000|301, // match move
0x80000000|502, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 288
94,69, // "n"
  }
,
{ // state 289
0x80000000|1, // match move
0x80000000|1171, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 290
94,132, // "n"
  }
,
{ // state 291
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+248, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 293
165,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 294
3,1352, // $$0
4,879, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
62,1292, // `*
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
121,1217, // "*"
136,448, // intLit2
138,1023, // digit++
139,49, // digit
145,1304, // letter
150,803, // ws
152,454, // eol
159,1216, // token*
161,11, // digit+
  }
,
{ // state 295
0x80000000|1384, // match move
0x80000000|42, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 296
-1, // $$start
-1, // start
1043, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+291, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 297
2,1360, // ws*
150,1325, // ws
152,454, // eol
158,477, // $$1
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 298
165,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 299
0x80000000|279, // match move
0x80000000|625, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 300
150,803, // ws
152,454, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 301
150,803, // ws
152,454, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 302
165,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 303
2,1429, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 304
0x80000000|1270, // match move
0x80000000|815, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 305
146,MIN_REDUCTION+313, // "_"
157,MIN_REDUCTION+313, // idChar**
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 306
165,MIN_REDUCTION+181, // $NT
  }
,
{ // state 307
2,287, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 308
0x80000000|1224, // match move
0x80000000|692, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 309
-1, // $$start
-1, // start
1265, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+192, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+192, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+192, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+192, // "u"
1193, // "p"
MIN_REDUCTION+192, // "h"
901, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
8, // "g"
MIN_REDUCTION+192, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+192, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+192, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+192, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+192, // $
MIN_REDUCTION+192, // $NT
  }
,
{ // state 310
89,666, // "b"
  }
,
{ // state 311
2,611, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 312
0x80000000|418, // match move
0x80000000|900, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 313
0x80000000|302, // match move
0x80000000|1058, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 314
0x80000000|525, // match move
0x80000000|309, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 315
150,803, // ws
152,454, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 316
0x80000000|114, // match move
0x80000000|340, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 317
150,803, // ws
152,454, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 318
0x80000000|614, // match move
0x80000000|115, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 319
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+164, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 320
165,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 321
150,803, // ws
152,454, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 322
0x80000000|76, // match move
0x80000000|416, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 323
2,56, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 324
0x80000000|868, // match move
0x80000000|1470, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 325
0x80000000|250, // match move
0x80000000|198, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 326
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 327
0x80000000|723, // match move
0x80000000|210, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 328
91,670, // "l"
  }
,
{ // state 329
0x80000000|533, // match move
0x80000000|945, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 330
-1, // $$start
-1, // start
634, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+231, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+231, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+231, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+231, // "u"
1193, // "p"
MIN_REDUCTION+231, // "h"
901, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
8, // "g"
MIN_REDUCTION+231, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+231, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+231, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+231, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+231, // $
MIN_REDUCTION+231, // $NT
  }
,
{ // state 331
150,803, // ws
152,454, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 332
0x80000000|10, // match move
0x80000000|1132, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 333
0x80000000|397, // match move
0x80000000|1074, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 335
0x80000000|85, // match move
0x80000000|385, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 336
102,576, // "t"
  }
,
{ // state 337
-1, // $$start
-1, // start
706, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+225, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+225, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+225, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+225, // "u"
1193, // "p"
MIN_REDUCTION+225, // "h"
901, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
8, // "g"
MIN_REDUCTION+225, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+225, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+225, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+225, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+225, // $
MIN_REDUCTION+225, // $NT
  }
,
{ // state 338
165,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 340
0x80000000|219, // match move
0x80000000|699, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 341
0x80000000|12, // match move
0x80000000|435, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 342
0x80000000|953, // match move
0x80000000|197, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 343
0x80000000|1201, // match move
0x80000000|275, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 344
102,659, // "t"
  }
,
{ // state 345
165,MIN_REDUCTION+187, // $NT
  }
,
{ // state 346
2,1360, // ws*
150,1325, // ws
152,454, // eol
157,766, // idChar**
158,950, // $$1
163,870, // idChar*
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 347
0x80000000|698, // match move
0x80000000|1222, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 348
165,MIN_REDUCTION+163, // $NT
  }
,
{ // state 349
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 350
165,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 351
165,MIN_REDUCTION+115, // $NT
  }
,
{ // state 352
165,MIN_REDUCTION+305, // $NT
  }
,
{ // state 353
0x80000000|1054, // match move
0x80000000|1112, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 354
0x80000000|871, // match move
0x80000000|451, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 355
98,142, // "k"
  }
,
{ // state 356
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 358
97,1392, // "r"
  }
,
{ // state 359
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 360
0x80000000|1, // match move
0x80000000|79, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 361
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 362
2,632, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 363
-1, // $$start
-1, // start
985, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+153, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+153, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+153, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+153, // "u"
1193, // "p"
MIN_REDUCTION+153, // "h"
901, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
8, // "g"
MIN_REDUCTION+153, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+153, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+153, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+153, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+153, // $
MIN_REDUCTION+153, // $NT
  }
,
{ // state 364
0x80000000|972, // match move
0x80000000|146, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 365
0x80000000|1207, // match move
0x80000000|4, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 366
0x80000000|235, // match move
0x80000000|567, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 367
110,1489, // "v"
  }
,
{ // state 368
0x80000000|48, // match move
0x80000000|1097, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 369
0x80000000|307, // match move
0x80000000|509, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 370
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 371
102,1287, // "t"
  }
,
{ // state 372
90,550, // "o"
91,442, // "l"
93,1169, // "a"
105,593, // "i"
  }
,
{ // state 373
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+227, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 374
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 375
150,803, // ws
152,454, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 376
93,73, // "a"
  }
,
{ // state 377
0x80000000|1, // match move
0x80000000|464, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 378
0x80000000|1103, // match move
0x80000000|899, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 379
-1, // $$start
-1, // start
107, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+309, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+309, // $
-1, // $NT
  }
,
{ // state 380
2,1360, // ws*
150,1325, // ws
152,454, // eol
158,477, // $$1
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 381
102,40, // "t"
  }
,
{ // state 382
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+284, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 383
0x80000000|216, // match move
0x80000000|562, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 384
100,802, // "s"
  }
,
{ // state 385
0x80000000|903, // match move
0x80000000|1040, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 386
0x80000000|1487, // match move
0x80000000|294, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 387
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 388
0x80000000|1232, // match move
0x80000000|60, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 389
150,803, // ws
152,454, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 390
0x80000000|1242, // match move
0x80000000|1436, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 391
3,1352, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
159,1216, // token*
  }
,
{ // state 392
122,88, // "/"
  }
,
{ // state 393
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,956, // idChar
97,163, // "r"
98,163, // "k"
99,163, // "c"
100,163, // "s"
101,163, // "x"
102,163, // "t"
103,163, // "d"
104,163, // "f"
105,163, // "i"
106,163, // "w"
107,163, // "u"
108,163, // "p"
109,163, // "h"
110,163, // "v"
111,163, // "y"
112,163, // "m"
113,163, // "g"
114,163, // "z"
137,1383, // "0"
139,353, // digit
140,1383, // {"1".."9"}
145,1288, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
  }
,
{ // state 394
-1, // $$start
-1, // start
483, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+177, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+177, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+177, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
108, // "u"
1193, // "p"
MIN_REDUCTION+177, // "h"
901, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
8, // "g"
MIN_REDUCTION+177, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+177, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+177, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+177, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 395
2,806, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 396
0x80000000|23, // match move
0x80000000|967, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 397
3,1352, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
89,1226, // "b"
91,1378, // "l"
92,472, // "e"
93,1503, // "a"
94,1423, // "n"
97,401, // "r"
99,988, // "c"
100,1351, // "s"
102,1389, // "t"
103,743, // "d"
104,372, // "f"
105,1243, // "i"
106,58, // "w"
108,1193, // "p"
110,901, // "v"
113,8, // "g"
159,1216, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 398
0x80000000|780, // match move
0x80000000|1153, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 399
0x80000000|1118, // match move
0x80000000|156, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 400
0x80000000|461, // match move
0x80000000|21, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 401
92,761, // "e"
  }
,
{ // state 402
0x80000000|1073, // match move
0x80000000|975, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 403
2,706, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 404
0x80000000|1106, // match move
0x80000000|102, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 405
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+176, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 406
150,803, // ws
152,454, // eol
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 407
150,803, // ws
152,454, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 408
165,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 409
0x80000000|1148, // match move
0x80000000|742, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 410
92,707, // "e"
  }
,
{ // state 411
0x80000000|662, // match move
0x80000000|413, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 412
0x80000000|1019, // match move
0x80000000|284, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 413
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 414
0x80000000|749, // match move
0x80000000|128, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 415
99,14, // "c"
  }
,
{ // state 416
0x80000000|961, // match move
0x80000000|244, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 417
0x80000000|782, // match move
0x80000000|1130, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 418
150,803, // ws
152,454, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 419
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 420
155,691, // {10}
  }
,
{ // state 421
2,318, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 422
92,1250, // "e"
  }
,
{ // state 423
150,803, // ws
152,454, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 424
0x80000000|889, // match move
0x80000000|354, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 425
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 426
0x80000000|311, // match move
0x80000000|925, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 427
100,80, // "s"
102,1246, // "t"
  }
,
{ // state 428
150,803, // ws
152,454, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 429
165,MIN_REDUCTION+175, // $NT
  }
,
{ // state 430
102,43, // "t"
  }
,
{ // state 431
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+98, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 432
0x80000000|1483, // match move
0x80000000|966, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 433
2,368, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 434
-1, // $$start
-1, // start
1162, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
-1, // `=
-1, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
MIN_REDUCTION+289, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+289, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 435
-1, // $$start
-1, // start
1314, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+243, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+243, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+243, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+243, // "u"
1193, // "p"
MIN_REDUCTION+243, // "h"
901, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
8, // "g"
MIN_REDUCTION+243, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+243, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+243, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+243, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+243, // $
MIN_REDUCTION+243, // $NT
  }
,
{ // state 436
150,803, // ws
152,454, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 437
165,MIN_REDUCTION+199, // $NT
  }
,
{ // state 438
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 439
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+230, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 440
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 441
2,558, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 442
90,765, // "o"
  }
,
{ // state 443
-1, // $$start
-1, // start
1472, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+162, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+162, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+162, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+162, // "u"
1193, // "p"
MIN_REDUCTION+162, // "h"
901, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
8, // "g"
MIN_REDUCTION+162, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+162, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+162, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+162, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+162, // $
MIN_REDUCTION+162, // $NT
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
{ // state 444
2,65, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 445
0x80000000|777, // match move
0x80000000|604, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 446
0x80000000|1231, // match move
0x80000000|714, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 447
165,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 448
0x80000000|224, // match move
0x80000000|753, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 449
165,MIN_REDUCTION+232, // $NT
  }
,
{ // state 450
150,803, // ws
152,454, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 451
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+173, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 452
-1, // $$start
-1, // start
1102, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+132, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+132, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+132, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+132, // "u"
1193, // "p"
MIN_REDUCTION+132, // "h"
901, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
8, // "g"
MIN_REDUCTION+132, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+132, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+132, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+132, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+132, // $
MIN_REDUCTION+132, // $NT
  }
,
{ // state 453
150,803, // ws
152,454, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 454
165,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 455
0x80000000|646, // match move
0x80000000|246, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 456
102,29, // "t"
  }
,
{ // state 457
94,59, // "n"
  }
,
{ // state 458
118,1053, // "&"
  }
,
{ // state 459
-1, // $$start
-1, // start
2, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+295, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 460
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 461
2,1160, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 462
2,2, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 463
0x80000000|315, // match move
0x80000000|469, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 464
0x80000000|712, // match move
0x80000000|946, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 465
-1, // $$start
-1, // start
785, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+141, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+141, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+141, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+141, // "u"
1193, // "p"
MIN_REDUCTION+141, // "h"
901, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
8, // "g"
MIN_REDUCTION+141, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+141, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+141, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+141, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+141, // $
MIN_REDUCTION+141, // $NT
  }
,
{ // state 466
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 467
0x80000000|1229, // match move
0x80000000|265, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 468
-1, // $$start
-1, // start
632, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+165, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+165, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+165, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+165, // "u"
1193, // "p"
MIN_REDUCTION+165, // "h"
901, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
8, // "g"
MIN_REDUCTION+165, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+165, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+165, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+165, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+165, // $
MIN_REDUCTION+165, // $NT
  }
,
{ // state 469
0x80000000|1346, // match move
0x80000000|64, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 470
2,998, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 471
0x80000000|1496, // match move
0x80000000|884, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 472
91,189, // "l"
94,496, // "n"
101,740, // "x"
  }
,
{ // state 473
-1, // $$start
-1, // start
789, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+273, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 474
0x80000000|1272, // match move
0x80000000|1098, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 475
0x80000000|951, // match move
0x80000000|1170, // no-match move
0x80000000|702, // NT-test-match state for printable
  }
,
{ // state 476
150,803, // ws
152,454, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 478
-1, // $$start
-1, // start
888, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+267, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 479
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+200, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 480
4,361, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
89,1226, // "b"
91,1378, // "l"
92,472, // "e"
93,1503, // "a"
94,1423, // "n"
97,401, // "r"
99,988, // "c"
100,1351, // "s"
102,1389, // "t"
103,743, // "d"
104,372, // "f"
105,1243, // "i"
106,58, // "w"
108,1193, // "p"
110,901, // "v"
113,8, // "g"
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 481
0x80000000|1350, // match move
0x80000000|697, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 482
0x80000000|1051, // match move
0x80000000|434, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 483
0x80000000|589, // match move
0x80000000|1396, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 484
165,MIN_REDUCTION+118, // $NT
  }
,
{ // state 485
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 486
150,803, // ws
152,454, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 487
0x80000000|912, // match move
0x80000000|325, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 488
0x80000000|1458, // match move
0x80000000|867, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 489
165,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 490
150,803, // ws
152,454, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 491
2,906, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 492
107,796, // "u"
  }
,
{ // state 493
2,65, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 494
0x80000000|832, // match move
0x80000000|1312, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 495
99,104, // "c"
  }
,
{ // state 496
107,894, // "u"
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|718, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 498
150,803, // ws
152,454, // eol
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 499
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 500
2,611, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 502
0x80000000|1127, // match move
0x80000000|790, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 503
0x80000000|876, // match move
0x80000000|452, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 504
0x80000000|858, // match move
0x80000000|1228, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 505
0x80000000|848, // match move
0x80000000|1478, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 506
150,803, // ws
152,454, // eol
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 507
150,803, // ws
152,454, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 508
-1, // $$start
-1, // start
969, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+123, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+123, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+123, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+123, // "u"
1193, // "p"
MIN_REDUCTION+123, // "h"
901, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
8, // "g"
MIN_REDUCTION+123, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+123, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+123, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+123, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+123, // $
MIN_REDUCTION+123, // $NT
  }
,
{ // state 509
-1, // $$start
-1, // start
287, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+126, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+126, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+126, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+126, // "u"
1193, // "p"
MIN_REDUCTION+126, // "h"
901, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
8, // "g"
MIN_REDUCTION+126, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+126, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+126, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+126, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+126, // $
MIN_REDUCTION+126, // $NT
  }
,
{ // state 510
0x80000000|1485, // match move
0x80000000|1219, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 511
0x80000000|673, // match move
0x80000000|84, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 512
97,168, // "r"
  }
,
{ // state 513
0x80000000|323, // match move
0x80000000|542, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 514
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 515
150,803, // ws
152,454, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 516
150,803, // ws
152,454, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 517
150,803, // ws
152,454, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 518
2,398, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 519
2,1021, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 520
-1, // $$start
-1, // start
1223, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+246, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+246, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+246, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+246, // "u"
1193, // "p"
MIN_REDUCTION+246, // "h"
901, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
8, // "g"
MIN_REDUCTION+246, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+246, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+246, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+246, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+246, // $
MIN_REDUCTION+246, // $NT
  }
,
{ // state 521
165,MIN_REDUCTION+148, // $NT
  }
,
{ // state 522
94,178, // "n"
  }
,
{ // state 523
150,803, // ws
152,454, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 525
2,1265, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 526
106,1134, // "w"
  }
,
{ // state 527
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+224, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 528
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+152, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 529
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 530
165,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 531
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+266, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 532
165,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 533
2,399, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 534
-1, // $$start
-1, // start
87, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+210, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+210, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+210, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+210, // "u"
1193, // "p"
MIN_REDUCTION+210, // "h"
901, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
8, // "g"
MIN_REDUCTION+210, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+210, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+210, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+210, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+210, // $
MIN_REDUCTION+210, // $NT
  }
,
{ // state 535
2,888, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 536
92,70, // "e"
  }
,
{ // state 537
150,803, // ws
152,454, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 538
165,MIN_REDUCTION+130, // $NT
  }
,
{ // state 539
165,MIN_REDUCTION+313, // $NT
  }
,
{ // state 540
99,182, // "c"
  }
,
{ // state 541
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+122, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 542
-1, // $$start
-1, // start
56, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+156, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+156, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+156, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+156, // "u"
1193, // "p"
MIN_REDUCTION+156, // "h"
901, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
8, // "g"
MIN_REDUCTION+156, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+156, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+156, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+156, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+156, // $
MIN_REDUCTION+156, // $NT
  }
,
{ // state 543
2,185, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 544
150,803, // ws
152,454, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 545
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+260, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 546
0x80000000|1202, // match move
0x80000000|844, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 547
165,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 548
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+188, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 549
0x80000000|247, // match move
0x80000000|643, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 550
97,377, // "r"
  }
,
{ // state 551
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 552
-1, // $$start
-1, // start
810, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+102, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+102, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+102, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+102, // "u"
1193, // "p"
MIN_REDUCTION+102, // "h"
901, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
8, // "g"
MIN_REDUCTION+102, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+102, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+102, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+102, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+102, // $
MIN_REDUCTION+102, // $NT
  }
,
{ // state 553
1,864, // start
2,44, // ws*
3,524, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
159,1216, // token*
  }
,
{ // state 554
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 555
102,1092, // "t"
  }
,
{ // state 556
0x80000000|1446, // match move
0x80000000|860, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 557
0x80000000|1, // match move
0x80000000|622, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 558
0x80000000|41, // match move
0x80000000|1188, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 559
0x80000000|27, // match move
0x80000000|89, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 560
100,774, // "s"
  }
,
{ // state 561
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+256, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 562
0x80000000|501, // match move
0x80000000|531, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 563
0x80000000|423, // match move
0x80000000|19, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 564
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 565
150,803, // ws
152,454, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 566
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+294, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 567
0x80000000|547, // match move
0x80000000|652, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 568
0x80000000|1, // match move
0x80000000|663, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 569
0x80000000|1029, // match move
0x80000000|1277, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 570
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 571
93,358, // "a"
  }
,
{ // state 572
2,343, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 573
0x80000000|677, // match move
0x80000000|135, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 574
0x80000000|339, // match move
0x80000000|981, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|503, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 576
92,1007, // "e"
  }
,
{ // state 577
0x80000000|795, // match move
0x80000000|527, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 578
165,MIN_REDUCTION+214, // $NT
  }
,
{ // state 579
0x80000000|1, // match move
0x80000000|111, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 580
150,803, // ws
152,454, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 581
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+264, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 582
0x80000000|81, // match move
0x80000000|1155, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 583
99,240, // "c"
  }
,
{ // state 584
150,803, // ws
152,454, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 585
150,803, // ws
152,454, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 587
121,783, // "*"
122,878, // "/"
  }
,
{ // state 588
92,857, // "e"
  }
,
{ // state 589
150,803, // ws
152,454, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 590
0x80000000|717, // match move
0x80000000|1116, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 591
0x80000000|438, // match move
0x80000000|566, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 592
150,803, // ws
152,454, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 593
94,176, // "n"
  }
,
{ // state 594
165,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 595
0x80000000|1192, // match move
0x80000000|835, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 596
150,803, // ws
152,454, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 597
150,803, // ws
152,454, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 598
99,694, // "c"
  }
,
{ // state 599
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+125, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 600
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 601
165,MIN_REDUCTION+241, // $NT
  }
,
{ // state 602
0x80000000|403, // match move
0x80000000|337, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 603
0x80000000|141, // match move
0x80000000|551, // no-match move
0x80000000|45, // NT-test-match state for digit
  }
,
{ // state 604
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+286, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 605
-1, // $$start
-1, // start
17, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+219, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+219, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+219, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+219, // "u"
1193, // "p"
MIN_REDUCTION+219, // "h"
901, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
8, // "g"
MIN_REDUCTION+219, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+219, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+219, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+219, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+219, // $
MIN_REDUCTION+219, // $NT
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
{ // state 606
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+245, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 607
0x80000000|1187, // match move
0x80000000|768, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 608
165,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 609
165,MIN_REDUCTION+94, // $NT
  }
,
{ // state 610
0x80000000|1, // match move
0x80000000|813, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 611
0x80000000|222, // match move
0x80000000|654, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 612
-1, // $$start
-1, // start
990, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+299, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 613
0x80000000|421, // match move
0x80000000|834, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 614
150,803, // ws
152,454, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 615
2,940, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 616
165,MIN_REDUCTION+247, // $NT
  }
,
{ // state 617
2,2, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 619
165,MIN_REDUCTION+217, // $NT
  }
,
{ // state 620
4,361, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
62,1292, // `*
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
121,1217, // "*"
136,448, // intLit2
138,1023, // digit++
139,49, // digit
145,1304, // letter
161,11, // digit+
  }
,
{ // state 621
0x80000000|1, // match move
0x80000000|683, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 622
0x80000000|926, // match move
0x80000000|330, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 623
0x80000000|490, // match move
0x80000000|295, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 624
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 625
0x80000000|941, // match move
0x80000000|285, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 626
152,1055, // eol
155,1431, // {10}
156,1052, // {13}
  }
,
{ // state 627
2,1444, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 628
0x80000000|681, // match move
0x80000000|1212, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 629
0x80000000|391, // match move
0x80000000|1474, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 630
2,185, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 631
0x80000000|1181, // match move
0x80000000|843, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 632
0x80000000|18, // match move
0x80000000|511, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 633
0x80000000|1089, // match move
0x80000000|520, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 634
0x80000000|937, // match move
0x80000000|715, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 635
-1, // $$start
-1, // start
1360, // ws*
-1, // $$0
MIN_REDUCTION+327, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+327, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+327, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+327, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+327, // "u"
1193, // "p"
MIN_REDUCTION+327, // "h"
901, // "v"
MIN_REDUCTION+327, // "y"
MIN_REDUCTION+327, // "m"
8, // "g"
MIN_REDUCTION+327, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+327, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+327, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+327, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+327, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
766, // idChar**
950, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
870, // idChar*
MIN_REDUCTION+327, // $
-1, // $NT
  }
,
{ // state 636
150,803, // ws
152,454, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 637
0x80000000|389, // match move
0x80000000|1110, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 638
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 639
150,803, // ws
152,454, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 640
0x80000000|1428, // match move
0x80000000|1358, // no-match move
0x80000000|702, // NT-test-match state for printable
  }
,
{ // state 641
2,1501, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 642
2,990, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 643
-1, // $$start
-1, // start
332, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+189, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+189, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+189, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+189, // "u"
1193, // "p"
MIN_REDUCTION+189, // "h"
901, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
8, // "g"
MIN_REDUCTION+189, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+189, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+189, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+189, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+189, // $
MIN_REDUCTION+189, // $NT
  }
,
{ // state 644
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 645
0x80000000|517, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 646
2,721, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 647
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 648
2,1069, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 649
93,492, // "a"
  }
,
{ // state 650
150,803, // ws
152,454, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 651
1,864, // start
2,44, // ws*
3,524, // $$0
4,879, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
83,270, // `/
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
145,1304, // letter
150,1325, // ws
152,454, // eol
159,1216, // token*
  }
,
{ // state 652
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+134, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 653
92,360, // "e"
  }
,
{ // state 654
0x80000000|863, // match move
0x80000000|729, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 655
0x80000000|1, // match move
0x80000000|739, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 656
2,1008, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 657
2,590, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 658
2,185, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 659
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 660
165,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 661
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+146, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 662
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 663
0x80000000|1445, // match move
0x80000000|465, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 664
165,MIN_REDUCTION+151, // $NT
  }
,
{ // state 665
0x80000000|565, // match move
0x80000000|1038, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 666
91,1070, // "l"
  }
,
{ // state 667
2,1059, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 668
150,803, // ws
152,454, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 669
102,22, // "t"
  }
,
{ // state 670
92,1061, // "e"
  }
,
{ // state 671
0x80000000|827, // match move
0x80000000|402, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 672
0x80000000|1397, // match move
0x80000000|786, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 673
150,803, // ws
152,454, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 674
0x80000000|584, // match move
0x80000000|1349, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 675
0x80000000|1, // match move
0x80000000|595, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 676
0x80000000|1086, // match move
0x80000000|1227, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 677
2,1059, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 678
100,1062, // "s"
  }
,
{ // state 679
2,806, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 680
150,803, // ws
152,454, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 681
150,803, // ws
152,454, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 682
165,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 683
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 684
165,MIN_REDUCTION+311, // $NT
  }
,
{ // state 685
99,280, // "c"
  }
,
{ // state 686
2,1268, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 687
150,803, // ws
152,454, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|400, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 689
2,398, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 690
150,803, // ws
152,454, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 691
165,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 692
-1, // $$start
-1, // start
388, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
-1, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
-1, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+263, // "*"
741, // "/"
MIN_REDUCTION+263, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 693
165,MIN_REDUCTION+166, // $NT
  }
,
{ // state 694
0x80000000|1, // match move
0x80000000|602, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 695
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+194, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 696
-1, // $$start
-1, // start
86, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+198, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+198, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+198, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+198, // "u"
1193, // "p"
MIN_REDUCTION+198, // "h"
901, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
8, // "g"
MIN_REDUCTION+198, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+198, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+198, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+198, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+198, // $
MIN_REDUCTION+198, // $NT
  }
,
{ // state 697
0x80000000|942, // match move
0x80000000|1315, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 698
150,803, // ws
152,454, // eol
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 699
0x80000000|1087, // match move
0x80000000|473, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 700
0x80000000|491, // match move
0x80000000|299, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 701
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 702
89,1030, // "b"
90,1030, // "o"
91,1030, // "l"
92,1030, // "e"
93,1030, // "a"
94,1030, // "n"
97,1030, // "r"
98,1030, // "k"
99,1030, // "c"
100,1030, // "s"
101,1030, // "x"
102,1030, // "t"
103,1030, // "d"
104,1030, // "f"
105,1030, // "i"
106,1030, // "w"
107,1030, // "u"
108,1030, // "p"
109,1030, // "h"
110,1030, // "v"
111,1030, // "y"
112,1030, // "m"
113,1030, // "g"
114,1030, // "z"
115,1030, // "!"
116,1030, // "="
117,1030, // "%"
118,1030, // "&"
119,1030, // "("
120,1030, // ")"
121,1030, // "*"
122,1030, // "/"
123,1030, // "+"
124,1030, // ","
125,1030, // "-"
126,1030, // "."
127,1030, // ":"
128,1030, // ";"
129,1030, // "<"
130,1030, // ">"
131,1030, // "["
132,1030, // "]"
133,1030, // "{"
134,1030, // "}"
135,1030, // "|"
137,1030, // "0"
140,1030, // {"1".."9"}
141,1030, // "'"
143,1030, // '"'
146,1030, // "_"
147,1030, // {"A".."Z" "j" "q"}
148,1030, // " "
149,1030, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 703
0x80000000|1365, // match move
0x80000000|645, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 704
102,1434, // "t"
106,1450, // "w"
107,193, // "u"
109,939, // "h"
111,522, // "y"
  }
,
{ // state 705
2,107, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 706
0x80000000|1196, // match move
0x80000000|817, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 707
93,355, // "a"
  }
,
{ // state 708
105,367, // "i"
  }
,
{ // state 709
103,557, // "d"
  }
,
{ // state 710
165,MIN_REDUCTION+160, // $NT
  }
,
{ // state 711
150,803, // ws
152,454, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 712
2,744, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 713
0x80000000|130, // match move
0x80000000|1401, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 714
0x80000000|650, // match move
0x80000000|214, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 715
0x80000000|779, // match move
0x80000000|1306, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 716
0x80000000|1414, // match move
0x80000000|263, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 717
150,803, // ws
152,454, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 718
0x80000000|1235, // match move
0x80000000|754, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 719
150,803, // ws
152,454, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 721
0x80000000|82, // match move
0x80000000|1177, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 722
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 723
150,803, // ws
152,454, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 724
0x80000000|629, // match move
0x80000000|333, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 725
-1, // $$start
-1, // start
873, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+93, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+93, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+93, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+93, // "u"
1193, // "p"
MIN_REDUCTION+93, // "h"
901, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
8, // "g"
MIN_REDUCTION+93, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+93, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+93, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+93, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+93, // $
MIN_REDUCTION+93, // $NT
  }
,
{ // state 726
0x80000000|986, // match move
0x80000000|1014, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 727
150,803, // ws
152,454, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 728
165,MIN_REDUCTION+103, // $NT
  }
,
{ // state 729
0x80000000|936, // match move
0x80000000|382, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 730
-1, // $$start
-1, // start
1501, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+237, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+237, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+237, // "x"
1245, // "t"
743, // "d"
372, // "f"
1243, // "i"
1068, // "w"
193, // "u"
1193, // "p"
939, // "h"
901, // "v"
522, // "y"
MIN_REDUCTION+237, // "m"
8, // "g"
MIN_REDUCTION+237, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+237, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+237, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+237, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 731
92,370, // "e"
  }
,
{ // state 732
-1, // $$start
-1, // start
703, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+120, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+120, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+120, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+120, // "u"
1193, // "p"
MIN_REDUCTION+120, // "h"
901, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
8, // "g"
MIN_REDUCTION+120, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+120, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+120, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+120, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+120, // $
MIN_REDUCTION+120, // $NT
  }
,
{ // state 733
108,1430, // "p"
  }
,
{ // state 734
97,344, // "r"
  }
,
{ // state 735
2,1444, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 736
0x80000000|1, // match move
0x80000000|633, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 737
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 738
0x80000000|238, // match move
0x80000000|1006, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 739
0x80000000|441, // match move
0x80000000|96, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 740
102,1017, // "t"
  }
,
{ // state 741
0x80000000|958, // match move
0x80000000|1289, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 742
0x80000000|1411, // match move
0x80000000|1464, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 743
90,55, // "o"
92,255, // "e"
  }
,
{ // state 744
0x80000000|1393, // match move
0x80000000|840, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 745
150,803, // ws
152,454, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 746
150,803, // ws
152,454, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 747
165,MIN_REDUCTION+121, // $NT
  }
,
{ // state 748
0x80000000|1197, // match move
0x80000000|1336, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 749
2,1444, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 750
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 751
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 752
94,381, // "n"
  }
,
{ // state 753
0x80000000|1180, // match move
0x80000000|32, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 754
-1, // $$start
-1, // start
1063, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+174, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+174, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+174, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+174, // "u"
1193, // "p"
MIN_REDUCTION+174, // "h"
901, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
8, // "g"
MIN_REDUCTION+174, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+174, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+174, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+174, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+174, // $
MIN_REDUCTION+174, // $NT
  }
,
{ // state 755
165,MIN_REDUCTION+100, // $NT
  }
,
{ // state 756
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 757
99,16, // "c"
  }
,
{ // state 758
0x80000000|1498, // match move
0x80000000|791, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 759
2,810, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 760
0x80000000|321, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 761
102,1079, // "t"
  }
,
{ // state 762
0x80000000|167, // match move
0x80000000|374, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 763
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 764
0x80000000|1080, // match move
0x80000000|467, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 765
93,1146, // "a"
  }
,
{ // state 766
0x80000000|380, // match move
0x80000000|781, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 767
165,MIN_REDUCTION+312, // $NT
  }
,
{ // state 768
0x80000000|849, // match move
0x80000000|541, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 769
165,MIN_REDUCTION+202, // $NT
  }
,
{ // state 770
-1, // $$start
-1, // start
368, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+114, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+114, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+114, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+114, // "u"
1193, // "p"
MIN_REDUCTION+114, // "h"
901, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
8, // "g"
MIN_REDUCTION+114, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+114, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+114, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+114, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+114, // $
MIN_REDUCTION+114, // $NT
  }
,
{ // state 771
2,806, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 772
92,709, // "e"
  }
,
{ // state 773
104,1067, // "f"
  }
,
{ // state 774
105,1144, // "i"
  }
,
{ // state 775
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 776
2,404, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 777
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 778
0x80000000|1135, // match move
0x80000000|1294, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 779
150,803, // ws
152,454, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 780
150,803, // ws
152,454, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 781
0x80000000|297, // match move
0x80000000|833, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 782
2,343, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 783
121,621, // "*"
154,203, // commentContent
  }
,
{ // state 784
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 785
0x80000000|592, // match move
0x80000000|1326, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 786
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+290, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 787
0x80000000|506, // match move
0x80000000|71, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 788
108,688, // "p"
  }
,
{ // state 789
0x80000000|1280, // match move
0x80000000|674, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 790
0x80000000|408, // match move
0x80000000|599, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 791
-1, // $$start
-1, // start
1340, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+99, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+99, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+99, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+99, // "u"
1193, // "p"
MIN_REDUCTION+99, // "h"
901, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
8, // "g"
MIN_REDUCTION+99, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+99, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+99, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+99, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+99, // $
MIN_REDUCTION+99, // $NT
  }
,
{ // state 792
165,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 793
0x80000000|933, // match move
0x80000000|1186, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 794
0x80000000|281, // match move
0x80000000|494, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 795
165,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 796
91,1122, // "l"
  }
,
{ // state 797
0x80000000|1407, // match move
0x80000000|482, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 798
94,540, // "n"
  }
,
{ // state 799
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 800
165,MIN_REDUCTION+91, // $NT
  }
,
{ // state 801
2,107, // ws*
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 802
100,1466, // "s"
  }
,
{ // state 803
165,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 804
0x80000000|907, // match move
0x80000000|1033, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 805
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+270, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 806
0x80000000|896, // match move
0x80000000|1101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 807
1,864, // start
2,44, // ws*
3,524, // $$0
4,879, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
62,1292, // `*
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
121,1217, // "*"
136,448, // intLit2
138,1023, // digit++
139,49, // digit
145,1304, // letter
150,1325, // ws
152,454, // eol
159,1216, // token*
161,11, // digit+
  }
,
{ // state 808
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 809
0x80000000|722, // match move
0x80000000|33, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 810
0x80000000|453, // match move
0x80000000|1037, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 811
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+233, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 812
102,103, // "t"
  }
,
{ // state 813
0x80000000|13, // match move
0x80000000|732, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 814
92,153, // "e"
  }
,
{ // state 815
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+170, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 816
0x80000000|991, // match move
0x80000000|213, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 817
0x80000000|1370, // match move
0x80000000|577, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 818
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+242, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 819
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 820
2,347, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 821
93,456, // "a"
  }
,
{ // state 822
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+89, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 823
90,750, // "o"
  }
,
{ // state 824
110,376, // "v"
  }
,
{ // state 825
0x80000000|298, // match move
0x80000000|1004, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 826
2,388, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 827
150,803, // ws
152,454, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 828
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 829
150,803, // ws
152,454, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 830
165,MIN_REDUCTION+226, // $NT
  }
,
{ // state 831
150,803, // ws
152,454, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 832
165,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 833
0x80000000|226, // match move
0x80000000|924, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 834
-1, // $$start
-1, // start
318, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+195, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+195, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+195, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+195, // "u"
1193, // "p"
MIN_REDUCTION+195, // "h"
901, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
8, // "g"
MIN_REDUCTION+195, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+195, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+195, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+195, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+195, // $
MIN_REDUCTION+195, // $NT
  }
,
{ // state 835
-1, // $$start
-1, // start
267, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+90, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+90, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+90, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+90, // "u"
1193, // "p"
MIN_REDUCTION+90, // "h"
901, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
8, // "g"
MIN_REDUCTION+90, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+90, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+90, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+90, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+90, // $
MIN_REDUCTION+90, // $NT
  }
,
{ // state 836
150,803, // ws
152,454, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 837
-1, // $$start
-1, // start
1059, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+257, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+257, // $
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
{ // state 838
165,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 839
125,1391, // "-"
  }
,
{ // state 840
0x80000000|407, // match move
0x80000000|845, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 841
150,803, // ws
152,454, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 842
150,803, // ws
152,454, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 843
0x80000000|523, // match move
0x80000000|1481, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 844
0x80000000|690, // match move
0x80000000|99, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 845
0x80000000|276, // match move
0x80000000|1032, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 846
150,803, // ws
152,454, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 847
94,53, // "n"
  }
,
{ // state 848
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 849
165,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 850
2,1043, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 851
2,611, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 852
-1, // $$start
-1, // start
1003, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+259, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 853
0x80000000|257, // match move
0x80000000|591, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 854
-1, // $$start
-1, // start
1008, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+277, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 855
0x80000000|658, // match move
0x80000000|1260, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 856
0x80000000|1, // match move
0x80000000|1353, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 857
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 858
165,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 859
0x80000000|1251, // match move
0x80000000|1394, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 860
0x80000000|964, // match move
0x80000000|528, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 861
0x80000000|480, // match move
0x80000000|1463, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 862
100,731, // "s"
102,415, // "t"
  }
,
{ // state 863
150,803, // ws
152,454, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 864
164,MIN_REDUCTION+0, // $
  }
,
{ // state 865
93,162, // "a"
107,137, // "u"
111,1150, // "y"
  }
,
{ // state 866
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+218, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 867
0x80000000|286, // match move
0x80000000|1374, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 868
2,998, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 869
165,MIN_REDUCTION+106, // $NT
  }
,
{ // state 870
0x80000000|393, // match move
0x80000000|75, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 871
165,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 872
0x80000000|784, // match move
0x80000000|1345, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 873
0x80000000|331, // match move
0x80000000|165, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 874
90,457, // "o"
  }
,
{ // state 875
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 876
2,1102, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 877
2,665, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 878
0x80000000|1486, // match move
0x80000000|1355, // no-match move
0x80000000|702, // NT-test-match state for printable
  }
,
{ // state 879
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 880
102,512, // "t"
  }
,
{ // state 881
150,803, // ws
152,454, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 882
-1, // $$start
-1, // start
1501, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+237, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+237, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+237, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+237, // "u"
1193, // "p"
MIN_REDUCTION+237, // "h"
901, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
8, // "g"
MIN_REDUCTION+237, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+237, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+237, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+237, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 883
0x80000000|447, // match move
0x80000000|131, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 884
0x80000000|1239, // match move
0x80000000|94, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 885
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 886
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+191, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 887
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+128, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 888
0x80000000|846, // match move
0x80000000|383, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 889
150,803, // ws
152,454, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 890
0x80000000|1366, // match move
0x80000000|1175, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 891
91,536, // "l"
  }
,
{ // state 892
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 893
91,481, // "l"
  }
,
{ // state 894
112,1145, // "m"
  }
,
{ // state 895
2,1069, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 896
150,803, // ws
152,454, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 897
165,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 898
165,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 899
0x80000000|1480, // match move
0x80000000|505, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 900
0x80000000|183, // match move
0x80000000|1328, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 901
90,110, // "o"
  }
,
{ // state 902
150,803, // ws
152,454, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 903
2,1090, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 904
165,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 905
0x80000000|983, // match move
0x80000000|1338, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 906
0x80000000|1256, // match move
0x80000000|34, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 907
150,803, // ws
152,454, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 908
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 909
105,495, // "i"
  }
,
{ // state 910
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 911
0x80000000|1499, // match move
0x80000000|119, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 912
0x80000000|553, // match move
0x80000000|651, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 913
0x80000000|1111, // match move
0x80000000|66, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 914
-1, // $$start
-1, // start
716, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+171, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+171, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+171, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+171, // "u"
1193, // "p"
MIN_REDUCTION+171, // "h"
901, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
8, // "g"
MIN_REDUCTION+171, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+171, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+171, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+171, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+171, // $
MIN_REDUCTION+171, // $NT
  }
,
{ // state 915
150,803, // ws
152,454, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 916
5,800, // `boolean
6,1168, // `class
7,728, // `extends
8,25, // `void
9,484, // `int
10,521, // `while
11,1375, // `if
12,755, // `else
13,1257, // `for
14,609, // `break
15,1319, // `this
16,869, // `false
17,1071, // `true
18,1387, // `super
19,1124, // `null
20,538, // `return
21,351, // `instanceof
22,747, // `new
23,664, // `abstract
24,1395, // `assert
25,1298, // `byte
26,710, // `case
27,348, // `catch
28,693, // `char
29,1024, // `const
30,1107, // `continue
31,429, // `default
32,1310, // `do
33,306, // `double
34,1172, // `enum
35,345, // `final
36,1005, // `finally
37,973, // `float
38,1308, // `goto
39,437, // `implements
40,769, // `import
41,138, // `interface
42,106, // `long
43,1176, // `native
44,578, // `package
45,619, // `private
46,1386, // `protected
47,1094, // `public
48,144, // `short
49,830, // `static
50,90, // `strictfp
51,35, // `switch
52,449, // `synchronized
53,282, // `throw
54,1388, // `throws
55,601, // `transient
56,1359, // `try
57,616, // `volatile
89,1226, // "b"
91,1378, // "l"
92,472, // "e"
93,1503, // "a"
94,1423, // "n"
97,401, // "r"
99,988, // "c"
100,1351, // "s"
102,1389, // "t"
103,743, // "d"
104,372, // "f"
105,1243, // "i"
106,58, // "w"
108,1193, // "p"
110,901, // "v"
113,8, // "g"
  }
,
{ // state 917
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 918
0x80000000|26, // match move
0x80000000|508, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 919
0x80000000|1041, // match move
0x80000000|620, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 920
0x80000000|1362, // match move
0x80000000|1001, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 921
165,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 922
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 923
0x80000000|1174, // match move
0x80000000|118, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 924
-1, // $$start
-1, // start
1360, // ws*
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+325, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
477, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+325, // $
-1, // $NT
  }
,
{ // state 925
0x80000000|500, // match move
0x80000000|1109, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 926
2,634, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 927
0x80000000|535, // match move
0x80000000|1439, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 928
150,803, // ws
152,454, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 929
97,1244, // "r"
  }
,
{ // state 930
150,803, // ws
152,454, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 931
150,803, // ws
152,454, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 932
0x80000000|1364, // match move
0x80000000|1125, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 933
116,1284, // "="
  }
,
{ // state 934
106,610, // "w"
  }
,
{ // state 935
-1, // $$start
-1, // start
1429, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+204, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+204, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+204, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+204, // "u"
1193, // "p"
MIN_REDUCTION+204, // "h"
901, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
8, // "g"
MIN_REDUCTION+204, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+204, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+204, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+204, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+204, // $
MIN_REDUCTION+204, // $NT
  }
,
{ // state 936
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 937
150,803, // ws
152,454, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 938
165,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 939
90,734, // "o"
  }
,
{ // state 940
0x80000000|836, // match move
0x80000000|1254, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 941
2,906, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 942
2,1380, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 943
0x80000000|771, // match move
0x80000000|1138, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 944
150,803, // ws
152,454, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 945
-1, // $$start
-1, // start
399, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+213, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+213, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+213, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+213, // "u"
1193, // "p"
MIN_REDUCTION+213, // "h"
901, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
8, // "g"
MIN_REDUCTION+213, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+213, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+213, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+213, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+213, // $
MIN_REDUCTION+213, // $NT
  }
,
{ // state 946
-1, // $$start
-1, // start
744, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+108, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+108, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+108, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+108, // "u"
1193, // "p"
MIN_REDUCTION+108, // "h"
901, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
8, // "g"
MIN_REDUCTION+108, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+108, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+108, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+108, // $
MIN_REDUCTION+108, // $NT
  }
,
{ // state 947
2,1195, // ws*
148,195, // " "
150,1325, // ws
151,195, // {9}
152,454, // eol
155,1431, // {10}
156,1052, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 948
0x80000000|648, // match move
0x80000000|1339, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 949
150,803, // ws
152,454, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 950
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 951
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 952
2,873, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 953
150,803, // ws
152,454, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 954
165,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 955
0x80000000|1437, // match move
0x80000000|459, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 956
0x80000000|1082, // match move
0x80000000|148, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 957
0x80000000|1, // match move
0x80000000|1241, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 958
121,783, // "*"
122,878, // "/"
  }
,
{ // state 959
2,65, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 960
0x80000000|850, // match move
0x80000000|1443, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 961
150,803, // ws
152,454, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 962
0x80000000|1, // match move
0x80000000|386, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 963
0x80000000|113, // match move
0x80000000|1418, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 964
165,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 966
0x80000000|997, // match move
0x80000000|373, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 967
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+182, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 968
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 969
0x80000000|974, // match move
0x80000000|607, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 970
2,347, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 971
0x80000000|898, // match move
0x80000000|431, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 972
165,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 973
165,MIN_REDUCTION+193, // $NT
  }
,
{ // state 974
150,803, // ws
152,454, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 975
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+274, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 976
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+215, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 977
0x80000000|1, // match move
0x80000000|918, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 978
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 979
-1, // $$start
-1, // start
804, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+138, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+138, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+138, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+138, // "u"
1193, // "p"
MIN_REDUCTION+138, // "h"
901, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
8, // "g"
MIN_REDUCTION+138, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+138, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+138, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+138, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+138, // $
MIN_REDUCTION+138, // $NT
  }
,
{ // state 980
165,MIN_REDUCTION+310, // $NT
  }
,
{ // state 981
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 982
0x80000000|641, // match move
0x80000000|730, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 983
2,590, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 984
150,803, // ws
152,454, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 985
0x80000000|215, // match move
0x80000000|556, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 986
150,803, // ws
152,454, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 987
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 988
90,847, // "o"
91,181, // "l"
93,862, // "a"
109,571, // "h"
  }
,
{ // state 989
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 990
0x80000000|223, // match move
0x80000000|582, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 991
2,1008, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 992
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+280, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 993
0x80000000|346, // match move
0x80000000|635, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 994
91,1447, // "l"
  }
,
{ // state 995
-1, // $$start
-1, // start
940, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+279, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 996
2,388, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 997
165,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 998
0x80000000|516, // match move
0x80000000|312, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 999
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1000
0x80000000|1495, // match move
0x80000000|349, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1001
-1, // $$start
-1, // start
342, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+180, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+180, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+180, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+180, // "u"
1193, // "p"
MIN_REDUCTION+180, // "h"
901, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
8, // "g"
MIN_REDUCTION+180, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+180, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+180, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+180, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+180, // $
MIN_REDUCTION+180, // $NT
  }
,
{ // state 1002
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1003
0x80000000|1099, // match move
0x80000000|913, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1004
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+209, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 1005
165,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1006
0x80000000|686, // match move
0x80000000|1281, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1007
99,1356, // "c"
  }
,
{ // state 1008
0x80000000|202, // match move
0x80000000|1013, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1009
0x80000000|1, // match move
0x80000000|549, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1010
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+206, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 1011
2,990, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1012
143,227, // '"'
  }
,
{ // state 1013
0x80000000|300, // match move
0x80000000|510, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1014
0x80000000|984, // match move
0x80000000|143, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1015
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+298, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 1016
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1017
92,1454, // "e"
  }
,
{ // state 1018
0x80000000|100, // match move
0x80000000|548, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1019
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1020
150,803, // ws
152,454, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1021
0x80000000|1296, // match move
0x80000000|327, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1022
0x80000000|624, // match move
0x80000000|999, // no-match move
0x80000000|45, // NT-test-match state for digit
  }
,
{ // state 1023
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1024
165,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1025
-1, // $$start
-1, // start
665, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+240, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+240, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+240, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+240, // "u"
1193, // "p"
MIN_REDUCTION+240, // "h"
901, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
8, // "g"
MIN_REDUCTION+240, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+240, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+240, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+240, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+240, // $
MIN_REDUCTION+240, // $NT
  }
,
{ // state 1026
137,603, // "0"
139,1022, // digit
140,603, // {"1".."9"}
  }
,
{ // state 1027
150,803, // ws
152,454, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1028
150,803, // ws
152,454, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1029
150,803, // ws
152,454, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1030
165,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1031
-1, // $$start
-1, // start
446, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+234, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+234, // "k"
988, // "c"
1313, // "s"
MIN_REDUCTION+234, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+234, // "u"
1193, // "p"
MIN_REDUCTION+234, // "h"
901, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
8, // "g"
MIN_REDUCTION+234, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+234, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+234, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+234, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 1032
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+107, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 1033
0x80000000|711, // match move
0x80000000|117, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1034
0x80000000|1173, // match move
0x80000000|671, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1035
92,736, // "e"
  }
,
{ // state 1036
0x80000000|1448, // match move
0x80000000|1182, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1037
0x80000000|1461, // match move
0x80000000|390, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1038
0x80000000|746, // match move
0x80000000|1297, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1039
102,708, // "t"
  }
,
{ // state 1040
0x80000000|1121, // match move
0x80000000|1065, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1041
4,361, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
  }
,
{ // state 1042
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1043
0x80000000|680, // match move
0x80000000|1269, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1044
0x80000000|537, // match move
0x80000000|1416, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1045
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1046
2,488, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1047
0x80000000|236, // match move
0x80000000|256, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1048
0x80000000|507, // match move
0x80000000|825, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1049
-1, // $$start
-1, // start
1021, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+129, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+129, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+129, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+129, // "u"
1193, // "p"
MIN_REDUCTION+129, // "h"
901, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
8, // "g"
MIN_REDUCTION+129, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+129, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+129, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+129, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+129, // $
MIN_REDUCTION+129, // $NT
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
{ // state 1050
0x80000000|801, // match move
0x80000000|379, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1051
2,1162, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1052
0x80000000|420, // match move
0x80000000|921, // no-match move
// T-test match for 10:
155,
  }
,
{ // state 1053
0x80000000|72, // match move
0x80000000|417, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1054
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1055
165,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1056
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1057
0x80000000|375, // match move
0x80000000|1236, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1058
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+131, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1059
0x80000000|233, // match move
0x80000000|212, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1060
0x80000000|776, // match move
0x80000000|1139, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1061
93,1357, // "a"
  }
,
{ // state 1062
92,1327, // "e"
  }
,
{ // state 1063
0x80000000|149, // match move
0x80000000|424, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1064
0x80000000|820, // match move
0x80000000|1200, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1065
-1, // $$start
-1, // start
1090, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+297, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 1066
165,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1067
93,685, // "a"
  }
,
{ // state 1068
105,1081, // "i"
109,1199, // "h"
  }
,
{ // state 1069
0x80000000|39, // match move
0x80000000|1140, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1070
105,1133, // "i"
  }
,
{ // state 1071
165,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1072
1,864, // start
2,44, // ws*
3,524, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
159,1216, // token*
  }
,
{ // state 1073
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1074
-1, // $$start
-1, // start
-1, // ws*
1352, // $$0
879, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
-1, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
1216, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1075
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+272, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 1076
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1077
92,752, // "e"
  }
,
{ // state 1078
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1079
107,1462, // "u"
  }
,
{ // state 1080
2,940, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1081
102,757, // "t"
  }
,
{ // state 1082
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1083
2,17, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 1084
165,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1085
0x80000000|989, // match move
0x80000000|1309, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1086
2,1003, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1087
2,789, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1088
0x80000000|1502, // match move
0x80000000|911, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1089
2,1223, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 1090
0x80000000|1027, // match move
0x80000000|637, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1091
150,803, // ws
152,454, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1092
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1093
0x80000000|897, // match move
0x80000000|97, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1094
165,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1095
0x80000000|1179, // match move
0x80000000|296, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1096
150,803, // ws
152,454, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1097
0x80000000|727, // match move
0x80000000|232, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1098
0x80000000|1398, // match move
0x80000000|1492, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1099
150,803, // ws
152,454, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1100
97,773, // "r"
  }
,
{ // state 1101
0x80000000|544, // match move
0x80000000|1476, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1102
0x80000000|831, // match move
0x80000000|1123, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1103
150,803, // ws
152,454, // eol
MIN_REDUCTION+302, // (default reduction)
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
150,803, // ws
152,454, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1107
165,MIN_REDUCTION+172, // $NT
  }
,
{ // state 1108
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,411, // idChar
97,163, // "r"
98,163, // "k"
99,163, // "c"
100,163, // "s"
101,163, // "x"
102,163, // "t"
103,163, // "d"
104,163, // "f"
105,163, // "i"
106,163, // "w"
107,163, // "u"
108,163, // "p"
109,163, // "h"
110,163, // "v"
111,163, // "y"
112,163, // "m"
113,163, // "g"
114,163, // "z"
137,1383, // "0"
139,353, // digit
140,1383, // {"1".."9"}
145,1288, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
157,766, // idChar**
163,870, // idChar*
  }
,
{ // state 1109
-1, // $$start
-1, // start
611, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
-1, // `=
-1, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
MIN_REDUCTION+285, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+285, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 1110
0x80000000|1321, // match move
0x80000000|1113, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1111
150,803, // ws
152,454, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1112
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1113
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+296, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 1114
0x80000000|841, // match move
0x80000000|1183, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1115
150,803, // ws
152,454, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1116
0x80000000|317, // match move
0x80000000|809, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1117
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1118
150,803, // ws
152,454, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1119
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+155, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 1120
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1121
2,1090, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1122
102,497, // "t"
  }
,
{ // state 1123
0x80000000|105, // match move
0x80000000|313, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1124
165,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1125
-1, // $$start
-1, // start
1415, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+117, // "o"
1378, // "l"
133, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+117, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+117, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+117, // "u"
1193, // "p"
MIN_REDUCTION+117, // "h"
901, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
8, // "g"
MIN_REDUCTION+117, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+117, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+117, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+117, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 1126
93,798, // "a"
  }
,
{ // state 1127
150,803, // ws
152,454, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1128
2,1003, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1129
107,108, // "u"
  }
,
{ // state 1130
0x80000000|572, // match move
0x80000000|266, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1131
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1132
0x80000000|450, // match move
0x80000000|1018, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1133
99,1209, // "c"
  }
,
{ // state 1134
0x80000000|1399, // match move
0x80000000|230, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1135
165,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1136
0x80000000|1405, // match move
0x80000000|1191, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1137
-1, // $$start
-1, // start
998, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+253, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 1138
0x80000000|679, // match move
0x80000000|1311, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1139
-1, // $$start
-1, // start
404, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+183, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+183, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+183, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+183, // "u"
1193, // "p"
MIN_REDUCTION+183, // "h"
901, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
8, // "g"
MIN_REDUCTION+183, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+183, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+183, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+183, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+183, // $
MIN_REDUCTION+183, // $NT
  }
,
{ // state 1140
0x80000000|1091, // match move
0x80000000|47, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1141
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1142
114,772, // "z"
  }
,
{ // state 1143
150,803, // ws
152,454, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1144
92,62, // "e"
  }
,
{ // state 1145
0x80000000|1, // match move
0x80000000|1060, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1146
102,78, // "t"
  }
,
{ // state 1147
99,812, // "c"
  }
,
{ // state 1148
150,803, // ws
152,454, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1149
0x80000000|627, // match move
0x80000000|1410, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1150
0x80000000|1, // match move
0x80000000|341, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1151
0x80000000|1, // match move
0x80000000|1425, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1152
2,95, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1153
0x80000000|1020, // match move
0x80000000|445, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1154
2,446, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 1155
0x80000000|1016, // match move
0x80000000|1015, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1156
0x80000000|123, // match move
0x80000000|1497, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1157
150,803, // ws
152,454, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1158
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1159
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1160
0x80000000|77, // match move
0x80000000|432, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1161
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+236, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1162
0x80000000|944, // match move
0x80000000|221, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1163
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1164
0x80000000|1, // match move
0x80000000|1471, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1165
2,1008, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1166
150,803, // ws
152,454, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1167
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 1168
165,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1169
91,24, // "l"
  }
,
{ // state 1170
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1171
0x80000000|1072, // match move
0x80000000|807, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1172
165,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1173
150,803, // ws
152,454, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1174
2,590, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1175
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+282, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 1176
165,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1177
0x80000000|829, // match move
0x80000000|504, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1178
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1179
2,1043, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1180
2,378, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1181
150,803, // ws
152,454, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1182
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+110, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 1183
0x80000000|1302, // match move
0x80000000|866, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1184
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1185
0x80000000|1361, // match move
0x80000000|1494, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1186
0x80000000|851, // match move
0x80000000|426, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1187
150,803, // ws
152,454, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1188
0x80000000|175, // match move
0x80000000|1342, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1189
0x80000000|271, // match move
0x80000000|249, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1190
103,101, // "d"
  }
,
{ // state 1191
0x80000000|1300, // match move
0x80000000|738, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1192
2,267, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1193
93,583, // "a"
97,140, // "r"
107,310, // "u"
  }
,
{ // state 1194
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1195
0x80000000|668, // match move
0x80000000|1271, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1196
150,803, // ws
152,454, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1197
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1198
90,288, // "o"
111,1009, // "y"
  }
,
{ // state 1199
105,891, // "i"
  }
,
{ // state 1200
0x80000000|970, // match move
0x80000000|713, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1201
150,803, // ws
152,454, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1202
150,803, // ws
152,454, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1203
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1204
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1205
116,63, // "="
  }
,
{ // state 1206
104,788, // "f"
  }
,
{ // state 1207
2,248, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1208
102,823, // "t"
  }
,
{ // state 1209
0x80000000|1, // match move
0x80000000|369, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1210
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+258, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 1211
113,814, // "g"
  }
,
{ // state 1212
0x80000000|792, // match move
0x80000000|606, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1213
150,803, // ws
152,454, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1214
4,361, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
83,270, // `/
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
145,1304, // letter
  }
,
{ // state 1215
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1216
0x80000000|1413, // match move
0x80000000|1424, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1217
0x80000000|1, // match move
0x80000000|947, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 1218
0x80000000|1, // match move
0x80000000|1324, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1219
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+276, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 1220
150,803, // ws
152,454, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1221
0x80000000|211, // match move
0x80000000|965, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1222
0x80000000|406, // match move
0x80000000|3, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1223
0x80000000|1318, // match move
0x80000000|628, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1224
2,388, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1225
0x80000000|436, // match move
0x80000000|20, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1226
90,31, // "o"
97,410, // "r"
111,430, // "y"
  }
,
{ // state 1227
0x80000000|1128, // match move
0x80000000|852, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1228
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+167, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 1229
2,940, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1230
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1231
150,803, // ws
152,454, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1232
150,803, // ws
152,454, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1233
0x80000000|1279, // match move
0x80000000|1373, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1234
100,880, // "s"
  }
,
{ // state 1235
2,1063, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1236
0x80000000|1422, // match move
0x80000000|1406, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1237
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1238
0x80000000|1205, // match move
0x80000000|414, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1239
2,546, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1240
150,803, // ws
152,454, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1241
0x80000000|1465, // match move
0x80000000|172, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1242
165,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1243
94,427, // "n"
104,1432, // "f"
112,733, // "m"
  }
,
{ // state 1244
102,655, // "t"
  }
,
{ // state 1245
93,1291, // "a"
97,1441, // "r"
109,1249, // "h"
  }
,
{ // state 1246
0x80000000|1367, // match move
0x80000000|932, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1247
150,803, // ws
152,454, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1248
0x80000000|239, // match move
0x80000000|883, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1249
97,161, // "r"
105,190, // "i"
  }
,
{ // state 1250
0x80000000|1, // match move
0x80000000|1156, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1251
165,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1252
0x80000000|1482, // match move
0x80000000|927, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1253
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1254
0x80000000|928, // match move
0x80000000|1085, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1255
91,1379, // "l"
  }
,
{ // state 1256
150,803, // ws
152,454, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1257
165,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1258
0x80000000|1165, // match move
0x80000000|854, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1259
0x80000000|839, // match move
0x80000000|943, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1260
0x80000000|543, // match move
0x80000000|1475, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1261
92,116, // "e"
  }
,
{ // state 1262
0x80000000|303, // match move
0x80000000|935, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1263
0x80000000|1334, // match move
0x80000000|948, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1264
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1265
0x80000000|1460, // match move
0x80000000|264, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1266
97,874, // "r"
  }
,
{ // state 1267
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1268
0x80000000|1247, // match move
0x80000000|273, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1269
0x80000000|881, // match move
0x80000000|672, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1270
165,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1271
0x80000000|1491, // match move
0x80000000|112, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1272
150,803, // ws
152,454, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1273
150,803, // ws
152,454, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1274
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+268, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 1275
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1276
165,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1277
0x80000000|356, // match move
0x80000000|992, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1278
0x80000000|120, // match move
0x80000000|1214, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1279
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1280
150,803, // ws
152,454, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1281
-1, // $$start
-1, // start
1268, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
-1, // `=
-1, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
MIN_REDUCTION+249, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+249, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 1282
90,1343, // "o"
  }
,
{ // state 1283
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1284
0x80000000|518, // match move
0x80000000|1348, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1285
97,575, // "r"
  }
,
{ // state 1286
0x80000000|489, // match move
0x80000000|124, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1287
0x80000000|1, // match move
0x80000000|254, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1288
0x80000000|1417, // match move
0x80000000|1264, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1289
2,1034, // ws*
148,195, // " "
150,1325, // ws
151,195, // {9}
152,454, // eol
155,1431, // {10}
156,1052, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1290
2,1162, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1291
102,159, // "t"
  }
,
{ // state 1292
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1293
-1, // $$start
-1, // start
398, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+287, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1294
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+140, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 1295
105,147, // "i"
  }
,
{ // state 1296
150,803, // ws
152,454, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1297
0x80000000|1377, // match move
0x80000000|184, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1298
165,MIN_REDUCTION+157, // $NT
  }
,
{ // state 1299
0x80000000|493, // match move
0x80000000|1469, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1300
2,1268, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1301
165,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1302
165,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1303
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1304
0x80000000|1108, // match move
0x80000000|993, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1305
0x80000000|362, // match move
0x80000000|468, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1306
0x80000000|608, // match move
0x80000000|439, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1307
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1308
165,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1309
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+278, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 1310
165,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1311
0x80000000|395, // match move
0x80000000|46, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1312
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+161, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 1313
0x80000000|704, // match move
0x80000000|982, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1314
0x80000000|1096, // match move
0x80000000|1225, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1315
-1, // $$start
-1, // start
1380, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+186, // "o"
1198, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+186, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+186, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+186, // "u"
1193, // "p"
MIN_REDUCTION+186, // "h"
901, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
8, // "g"
MIN_REDUCTION+186, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+186, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+186, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
  }
,
{ // state 1316
0x80000000|1457, // match move
0x80000000|121, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1317
135,700, // "|"
  }
,
{ // state 1318
150,803, // ws
152,454, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1319
165,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1320
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1321
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1322
111,1009, // "y"
  }
,
{ // state 1323
2,716, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1324
0x80000000|1440, // match move
0x80000000|534, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1325
165,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1326
0x80000000|1143, // match move
0x80000000|778, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1327
97,371, // "r"
  }
,
{ // state 1328
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+252, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+252, // $
-1, // $NT
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
{ // state 1329
2,83, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 1330
103,259, // "d"
  }
,
{ // state 1331
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1332
150,803, // ws
152,454, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1333
0x80000000|682, // match move
0x80000000|695, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1334
2,1069, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1335
89,539, // "b"
90,539, // "o"
91,539, // "l"
92,539, // "e"
93,539, // "a"
94,539, // "n"
97,539, // "r"
98,539, // "k"
99,539, // "c"
100,539, // "s"
101,539, // "x"
102,539, // "t"
103,539, // "d"
104,539, // "f"
105,539, // "i"
106,539, // "w"
107,539, // "u"
108,539, // "p"
109,539, // "h"
110,539, // "v"
111,539, // "y"
112,539, // "m"
113,539, // "g"
114,539, // "z"
137,352, // "0"
139,684, // digit
140,352, // {"1".."9"}
145,980, // letter
146,767, // "_"
147,539, // {"A".."Z" "j" "q"}
  }
,
{ // state 1336
-1, // $$start
-1, // start
-1, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+308, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+308, // $
-1, // $NT
  }
,
{ // state 1337
0x80000000|1, // match move
0x80000000|1490, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1338
0x80000000|657, // match move
0x80000000|923, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1339
0x80000000|895, // match move
0x80000000|1456, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1340
0x80000000|171, // match move
0x80000000|1344, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1341
0x80000000|1, // match move
0x80000000|1262, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1342
0x80000000|179, // match move
0x80000000|479, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1343
104,856, // "f"
  }
,
{ // state 1344
0x80000000|1240, // match move
0x80000000|971, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1345
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+288, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 1346
165,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1347
0x80000000|245, // match move
0x80000000|394, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1348
0x80000000|689, // match move
0x80000000|109, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1349
0x80000000|1159, // match move
0x80000000|1075, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1350
91,1322, // "l"
  }
,
{ // state 1351
102,1434, // "t"
106,1450, // "w"
107,193, // "u"
109,939, // "h"
111,522, // "y"
  }
,
{ // state 1352
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1353
0x80000000|433, // match move
0x80000000|770, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1354
2,990, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1355
152,904, // eol
153,626, // printable**
155,1431, // {10}
156,1052, // {13}
160,640, // printable*
  }
,
{ // state 1356
102,1261, // "t"
  }
,
{ // state 1357
94,675, // "n"
  }
,
{ // state 1358
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1359
165,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1360
0x80000000|498, // match move
0x80000000|787, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1361
116,960, // "="
  }
,
{ // state 1362
2,342, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1363
0x80000000|1, // match move
0x80000000|1289, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1364
2,1415, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1365
150,803, // ws
152,454, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1366
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1367
92,1100, // "e"
  }
,
{ // state 1368
-1, // $$start
-1, // start
488, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+147, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+147, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+147, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+147, // "u"
1193, // "p"
MIN_REDUCTION+147, // "h"
901, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
8, // "g"
MIN_REDUCTION+147, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+147, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+147, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+147, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+147, // $
MIN_REDUCTION+147, // $NT
  }
,
{ // state 1369
150,803, // ws
152,454, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1370
150,803, // ws
152,454, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1371
0x80000000|938, // match move
0x80000000|5, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1372
0x80000000|1, // match move
0x80000000|1504, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1373
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+262, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 1374
0x80000000|660, // match move
0x80000000|661, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1375
165,MIN_REDUCTION+112, // $NT
  }
,
{ // state 1376
0x80000000|252, // match move
0x80000000|676, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1377
165,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1378
90,288, // "o"
  }
,
{ // state 1379
92,1390, // "e"
  }
,
{ // state 1380
0x80000000|1369, // match move
0x80000000|1057, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1381
0x80000000|1402, // match move
0x80000000|261, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1382
0x80000000|617, // match move
0x80000000|955, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1383
0x80000000|701, // match move
0x80000000|808, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1384
165,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 1385
2,546, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1386
165,MIN_REDUCTION+220, // $NT
  }
,
{ // state 1387
165,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1388
165,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1389
97,865, // "r"
109,1249, // "h"
  }
,
{ // state 1390
0x80000000|1, // match move
0x80000000|920, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1391
0x80000000|1385, // match move
0x80000000|471, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1392
0x80000000|1, // match move
0x80000000|1305, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1393
150,803, // ws
152,454, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1394
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+179, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 1395
165,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1396
0x80000000|580, // match move
0x80000000|251, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1397
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1398
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1399
100,1151, // "s"
  }
,
{ // state 1400
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1401
-1, // $$start
-1, // start
347, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+307, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1402
2,726, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1403
0x80000000|978, // match move
0x80000000|561, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1404
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1405
116,905, // "="
  }
,
{ // state 1406
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+185, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 1407
2,1162, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1408
89,1030, // "b"
90,1030, // "o"
91,1030, // "l"
92,1030, // "e"
93,1030, // "a"
94,1030, // "n"
97,1030, // "r"
98,1030, // "k"
99,1030, // "c"
100,1030, // "s"
101,1030, // "x"
102,1030, // "t"
103,1030, // "d"
104,1030, // "f"
105,1030, // "i"
106,1030, // "w"
107,1030, // "u"
108,1030, // "p"
109,1030, // "h"
110,1030, // "v"
111,1030, // "y"
112,1030, // "m"
113,1030, // "g"
114,1030, // "z"
115,1030, // "!"
116,1030, // "="
117,1030, // "%"
118,1030, // "&"
119,1030, // "("
120,1030, // ")"
121,1030, // "*"
122,1030, // "/"
123,1030, // "+"
124,1030, // ","
125,1030, // "-"
126,1030, // "."
127,1030, // ":"
128,1030, // ";"
129,1030, // "<"
130,1030, // ">"
131,1030, // "["
132,1030, // "]"
133,1030, // "{"
134,1030, // "}"
135,1030, // "|"
137,1030, // "0"
140,1030, // {"1".."9"}
141,1030, // "'"
142,218, // printable
143,1030, // '"'
146,1030, // "_"
147,1030, // {"A".."Z" "j" "q"}
148,1030, // " "
149,1030, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1409
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+306, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+306, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 1410
-1, // $$start
-1, // start
1444, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
-1, // `=
-1, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
MIN_REDUCTION+281, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+281, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 1411
165,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1412
112,1077, // "m"
  }
,
{ // state 1413
0x80000000|1, // match move
0x80000000|919, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1414
150,803, // ws
152,454, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1415
0x80000000|1488, // match move
0x80000000|463, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1416
0x80000000|954, // match move
0x80000000|1161, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1417
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1418
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+143, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 1419
150,803, // ws
152,454, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1420
-1, // $$start
-1, // start
37, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+207, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+207, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+207, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+207, // "u"
1193, // "p"
MIN_REDUCTION+207, // "h"
901, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
8, // "g"
MIN_REDUCTION+207, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+207, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+207, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+207, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+207, // $
MIN_REDUCTION+207, // $NT
  }
,
{ // state 1421
2,1472, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1422
165,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1423
92,934, // "e"
93,1039, // "a"
107,994, // "u"
  }
,
{ // state 1424
0x80000000|1278, // match move
0x80000000|861, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1425
0x80000000|641, // match move
0x80000000|882, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1426
0x80000000|485, // match move
0x80000000|180, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1427
93,1211, // "a"
  }
,
{ // state 1428
89,475, // "b"
90,475, // "o"
91,475, // "l"
92,475, // "e"
93,475, // "a"
94,475, // "n"
97,475, // "r"
98,475, // "k"
99,475, // "c"
100,475, // "s"
101,475, // "x"
102,475, // "t"
103,475, // "d"
104,475, // "f"
105,475, // "i"
106,475, // "w"
107,475, // "u"
108,475, // "p"
109,475, // "h"
110,475, // "v"
111,475, // "y"
112,475, // "m"
113,475, // "g"
114,475, // "z"
115,475, // "!"
116,475, // "="
117,475, // "%"
118,475, // "&"
119,475, // "("
120,475, // ")"
121,475, // "*"
122,475, // "/"
123,475, // "+"
124,475, // ","
125,475, // "-"
126,475, // "."
127,475, // ":"
128,475, // ";"
129,475, // "<"
130,475, // ">"
131,475, // "["
132,475, // "]"
133,475, // "{"
134,475, // "}"
135,475, // "|"
137,475, // "0"
140,475, // {"1".."9"}
141,475, // "'"
142,68, // printable
143,475, // '"'
146,475, // "_"
147,475, // {"A".."Z" "j" "q"}
148,475, // " "
149,475, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1429
0x80000000|1213, // match move
0x80000000|760, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1430
90,929, // "o"
91,260, // "l"
  }
,
{ // state 1431
165,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1432
0x80000000|1, // match move
0x80000000|1316, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1433
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,1000, // idChar
97,163, // "r"
98,163, // "k"
99,163, // "c"
100,163, // "s"
101,163, // "x"
102,163, // "t"
103,163, // "d"
104,163, // "f"
105,163, // "i"
106,163, // "w"
107,163, // "u"
108,163, // "p"
109,163, // "h"
110,163, // "v"
111,163, // "y"
112,163, // "m"
113,163, // "g"
114,163, // "z"
137,1383, // "0"
139,353, // digit
140,1383, // {"1".."9"}
144,1012, // idChar++
145,1288, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
162,1221, // idChar+
  }
,
{ // state 1434
93,1291, // "a"
97,909, // "r"
  }
,
{ // state 1435
-1, // $$start
-1, // start
65, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+293, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1436
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+101, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 1437
2,2, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1438
165,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1439
0x80000000|1442, // match move
0x80000000|478, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1440
2,87, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1441
93,162, // "a"
105,495, // "i"
107,137, // "u"
111,1150, // "y"
  }
,
{ // state 1442
2,888, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1443
0x80000000|50, // match move
0x80000000|1095, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1444
0x80000000|930, // match move
0x80000000|569, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1445
2,785, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1446
150,803, // ws
152,454, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1447
91,977, // "l"
  }
,
{ // state 1448
165,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1449
92,957, // "e"
  }
,
{ // state 1450
105,1081, // "i"
  }
,
{ // state 1451
0x80000000|875, // match move
0x80000000|291, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1452
0x80000000|931, // match move
0x80000000|409, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1453
0x80000000|877, // match move
0x80000000|1025, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1454
94,1190, // "n"
  }
,
{ // state 1455
91,1035, // "l"
  }
,
{ // state 1456
-1, // $$start
-1, // start
1069, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+265, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1457
2,1047, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1458
150,803, // ws
152,454, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1459
-1, // $$start
-1, // start
378, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+303, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 1460
150,803, // ws
152,454, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1461
150,803, // ws
152,454, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1462
97,290, // "r"
  }
,
{ // state 1463
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
361, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
-1, // "*"
1363, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // printable**
-1, // commentContent
-1, // {10}
-1, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+344, // $
-1, // $NT
  }
,
{ // state 1464
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+104, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 1465
2,322, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1466
0x80000000|1, // match move
0x80000000|1381, // no-match move
0x80000000|1335, // NT-test-match state for idChar
  }
,
{ // state 1467
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1468
150,803, // ws
152,454, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1469
0x80000000|959, // match move
0x80000000|187, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1470
0x80000000|7, // match move
0x80000000|1137, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1471
0x80000000|200, // match move
0x80000000|979, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1472
0x80000000|1115, // match move
0x80000000|794, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1473
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1474
3,1352, // $$0
4,879, // token
58,1194, // `!
59,1253, // `!=
60,828, // `%
61,600, // `&&
63,644, // `(
64,1078, // `)
65,1184, // `{
66,1331, // `}
67,1230, // `-
68,15, // `+
69,987, // `=
70,1002, // `==
71,204, // `[
72,1178, // `]
73,1204, // `||
74,922, // `<
75,157, // `<=
76,1473, // `,
77,892, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1320, // `++
82,1045, // `--
83,270, // `/
84,1104, // `:
85,720, // ID
86,499, // INTLIT
87,220, // STRINGLIT
88,1307, // CHARLIT
145,1304, // letter
150,803, // ws
152,454, // eol
159,1216, // token*
  }
,
{ // state 1475
-1, // $$start
-1, // start
185, // ws*
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
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+283, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 1476
0x80000000|1267, // match move
0x80000000|1274, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1477
0x80000000|519, // match move
0x80000000|1049, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1478
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+302, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 1479
150,803, // ws
152,454, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1480
150,803, // ws
152,454, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1481
0x80000000|838, // match move
0x80000000|170, // no-match move
0x80000000|916, // NT-test-match state for reserved
  }
,
{ // state 1482
2,888, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1483
150,803, // ws
152,454, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1484
-1, // $$start
-1, // start
631, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+159, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+159, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+159, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+159, // "u"
1193, // "p"
MIN_REDUCTION+159, // "h"
901, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
8, // "g"
MIN_REDUCTION+159, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+159, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+159, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+159, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+159, // $
MIN_REDUCTION+159, // $NT
  }
,
{ // state 1485
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1486
89,475, // "b"
90,475, // "o"
91,475, // "l"
92,475, // "e"
93,475, // "a"
94,475, // "n"
97,475, // "r"
98,475, // "k"
99,475, // "c"
100,475, // "s"
101,475, // "x"
102,475, // "t"
103,475, // "d"
104,475, // "f"
105,475, // "i"
106,475, // "w"
107,475, // "u"
108,475, // "p"
109,475, // "h"
110,475, // "v"
111,475, // "y"
112,475, // "m"
113,475, // "g"
114,475, // "z"
115,475, // "!"
116,475, // "="
117,475, // "%"
118,475, // "&"
119,475, // "("
120,475, // ")"
121,475, // "*"
122,475, // "/"
123,475, // "+"
124,475, // ","
125,475, // "-"
126,475, // "."
127,475, // ":"
128,475, // ";"
129,475, // "<"
130,475, // ">"
131,475, // "["
132,475, // "]"
133,475, // "{"
134,475, // "}"
135,475, // "|"
137,475, // "0"
140,475, // {"1".."9"}
141,475, // "'"
142,38, // printable
143,475, // '"'
146,475, // "_"
147,475, // {"A".."Z" "j" "q"}
148,475, // " "
149,475, // {"#".."$" "?".."@" "\" "^" "`" "~"}
153,626, // printable**
160,640, // printable*
  }
,
{ // state 1487
3,1352, // $$0
4,879, // token
5,237, // `boolean
6,737, // `class
7,241, // `extends
8,6, // `void
9,326, // `int
10,387, // `while
11,1303, // `if
12,917, // `else
13,564, // `for
14,647, // `break
15,269, // `this
16,206, // `false
17,1076, // `true
18,1042, // `super
19,54, // `null
20,127, // `return
21,1203, // `instanceof
22,1404, // `new
23,1158, // `abstract
24,1275, // `assert
25,751, // `byte
26,570, // `case
27,756, // `catch
28,460, // `char
29,554, // `const
30,638, // `continue
31,618, // `default
32,1237, // `do
33,194, // `double
34,67, // `enum
35,908, // `final
36,1105, // `finally
37,885, // `float
38,229, // `goto
39,1400, // `implements
40,61, // `import
41,357, // `interface
42,529, // `long
43,1163, // `native
44,1283, // `package
45,1117, // `private
46,799, // `protected
47,1131, // `public
48,1467, // `short
49,968, // `static
50,1215, // `strictfp
51,125, // `switch
52,466, // `synchronized
53,586, // `throw
54,819, // `throws
55,359, // `transient
56,775, // `try
57,1056, // `volatile
159,1216, // token*
  }
,
{ // state 1488
150,803, // ws
152,454, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1489
92,1218, // "e"
  }
,
{ // state 1490
0x80000000|1083, // match move
0x80000000|605, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1491
150,803, // ws
152,454, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1492
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+292, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 1493
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
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
720, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
163, // "b"
163, // "o"
163, // "l"
163, // "e"
163, // "a"
163, // "n"
-1, // idChar
-1, // reserved
163, // "r"
163, // "k"
163, // "c"
163, // "s"
163, // "x"
163, // "t"
163, // "d"
163, // "f"
163, // "i"
163, // "w"
163, // "u"
163, // "p"
163, // "h"
163, // "v"
163, // "y"
163, // "m"
163, // "g"
163, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+149, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
448, // intLit2
603, // "0"
1023, // digit++
49, // digit
603, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
1304, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 1494
0x80000000|1290, // match move
0x80000000|797, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1495
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1496
2,546, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1497
-1, // $$start
-1, // start
1452, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
237, // `boolean
737, // `class
241, // `extends
6, // `void
326, // `int
387, // `while
1303, // `if
917, // `else
564, // `for
647, // `break
269, // `this
206, // `false
1076, // `true
1042, // `super
54, // `null
127, // `return
1203, // `instanceof
1404, // `new
1158, // `abstract
1275, // `assert
751, // `byte
570, // `case
756, // `catch
460, // `char
554, // `const
638, // `continue
618, // `default
1237, // `do
194, // `double
67, // `enum
908, // `final
1105, // `finally
885, // `float
229, // `goto
1400, // `implements
61, // `import
357, // `interface
529, // `long
1163, // `native
1283, // `package
1117, // `private
799, // `protected
1131, // `public
1467, // `short
968, // `static
1215, // `strictfp
125, // `switch
466, // `synchronized
586, // `throw
819, // `throws
359, // `transient
775, // `try
1056, // `volatile
1194, // `!
1253, // `!=
828, // `%
600, // `&&
-1, // `*
644, // `(
1078, // `)
1184, // `{
1331, // `}
1230, // `-
15, // `+
987, // `=
1002, // `==
204, // `[
1178, // `]
1204, // `||
922, // `<
157, // `<=
1473, // `,
892, // `>
136, // `>=
174, // `.
231, // `;
1320, // `++
1045, // `--
270, // `/
1104, // `:
-1, // ID
499, // INTLIT
220, // STRINGLIT
1307, // CHARLIT
1226, // "b"
MIN_REDUCTION+105, // "o"
1378, // "l"
472, // "e"
1503, // "a"
1423, // "n"
-1, // idChar
-1, // reserved
401, // "r"
MIN_REDUCTION+105, // "k"
988, // "c"
1351, // "s"
MIN_REDUCTION+105, // "x"
1389, // "t"
743, // "d"
372, // "f"
1243, // "i"
58, // "w"
MIN_REDUCTION+105, // "u"
1193, // "p"
MIN_REDUCTION+105, // "h"
901, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
8, // "g"
MIN_REDUCTION+105, // "z"
1136, // "!"
793, // "="
98, // "%"
458, // "&"
160, // "("
1376, // ")"
MIN_REDUCTION+105, // "*"
741, // "/"
559, // "+"
1252, // ","
1259, // "-"
316, // "."
816, // ":"
764, // ";"
1238, // "<"
1185, // ">"
1299, // "["
1500, // "]"
335, // "{"
126, // "}"
1317, // "|"
-1, // intLit2
MIN_REDUCTION+105, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+105, // {"1".."9"}
1408, // "'"
-1, // printable
1433, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1325, // ws
195, // {9}
454, // eol
-1, // printable**
-1, // commentContent
1431, // {10}
1052, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+105, // $
MIN_REDUCTION+105, // $NT
  }
,
{ // state 1498
2,1340, // ws*
150,1325, // ws
152,454, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1499
150,803, // ws
152,454, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1500
0x80000000|462, // match move
0x80000000|1382, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1501
0x80000000|476, // match move
0x80000000|1044, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1502
150,803, // ws
152,454, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1503
89,1234, // "b"
100,678, // "s"
  }
,
{ // state 1504
0x80000000|1421, // match move
0x80000000|443, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1505][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
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
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(136<<16)+1,
// digit ::= {"0".."9"}
(139<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' idChar++ '"' ws*
(87<<16)+4,
// STRINGLIT ::= '"' idChar++ '"'
(87<<16)+3,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(145<<16)+1,
// printable ::= {" ".."~"}
(142<<16)+1,
// ws ::= {9 " "}
(150<<16)+1,
// ws ::= eol
(150<<16)+1,
// ws ::= "/" "/" printable** eol
(150<<16)+4,
// ws ::= "/" "/" !printable eol
(150<<16)+3,
// ws ::= "/" "*" commentContent "*" "/"
(150<<16)+5,
// commentContent ::= "*" !"/"
(154<<16)+1,
// eol ::= {10}
(152<<16)+1,
// eol ::= {13} {10}
(152<<16)+2,
// eol ::= {13} !10
(152<<16)+1,
// ID ::= !reserved letter idChar** $$1
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$1
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// token* ::= token* token
(159<<16)+2,
// token* ::= token
(159<<16)+1,
// printable** ::= printable* !printable
(153<<16)+1,
// digit++ ::= digit+ !digit
(138<<16)+1,
// idChar++ ::= idChar+ !idChar
(144<<16)+1,
// idChar** ::= idChar* !idChar
(157<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(161<<16)+1,
// digit+ ::= digit+ digit
(161<<16)+2,
// printable* ::= printable* printable
(160<<16)+2,
// printable* ::= printable
(160<<16)+1,
// idChar+ ::= idChar
(162<<16)+1,
// idChar+ ::= idChar+ idChar
(162<<16)+2,
// idChar* ::= idChar* idChar
(163<<16)+2,
// idChar* ::= idChar
(163<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= ws*
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
151, // 9
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
148, // " "
115, // "!"
143, // '"'
149, // "#"
149, // "$"
117, // "%"
118, // "&"
141, // "'"
119, // "("
120, // ")"
121, // "*"
123, // "+"
124, // ","
125, // "-"
126, // "."
122, // "/"
137, // "0"
140, // "1"
140, // "2"
140, // "3"
140, // "4"
140, // "5"
140, // "6"
140, // "7"
140, // "8"
140, // "9"
127, // ":"
128, // ";"
129, // "<"
116, // "="
130, // ">"
149, // "?"
149, // "@"
147, // "A"
147, // "B"
147, // "C"
147, // "D"
147, // "E"
147, // "F"
147, // "G"
147, // "H"
147, // "I"
147, // "J"
147, // "K"
147, // "L"
147, // "M"
147, // "N"
147, // "O"
147, // "P"
147, // "Q"
147, // "R"
147, // "S"
147, // "T"
147, // "U"
147, // "V"
147, // "W"
147, // "X"
147, // "Y"
147, // "Z"
131, // "["
149, // "\"
132, // "]"
149, // "^"
146, // "_"
149, // "`"
93, // "a"
89, // "b"
99, // "c"
103, // "d"
92, // "e"
104, // "f"
113, // "g"
109, // "h"
105, // "i"
147, // "j"
98, // "k"
91, // "l"
112, // "m"
94, // "n"
90, // "o"
108, // "p"
147, // "q"
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
149, // "~"
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
"INTLIT ::= # intLit2 ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"intLit2 ::= !\"0\" digit++", // 304
"digit ::= {\"0\"..\"9\"}", // 305
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 306
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 307
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 308
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 309
"idChar ::= letter", // 310
"idChar ::= digit", // 311
"idChar ::= \"_\"", // 312
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 313
"printable ::= {\" \"..\"~\"}", // 314
"ws ::= {9 \" \"}", // 315
"ws ::= eol", // 316
"ws ::= \"/\" \"/\" printable** eol", // 317
"ws ::= \"/\" \"/\" printable** eol", // 318
"ws ::= \"/\" \"*\" commentContent \"*\" \"/\"", // 319
"commentContent ::= \"*\" !\"/\"", // 320
"eol ::= {10} registerNewline", // 321
"eol ::= {13} {10} registerNewline", // 322
"eol ::= {13} !10 registerNewline", // 323
"ID ::= !reserved letter idChar** ws*", // 324
"ID ::= !reserved letter idChar** ws*", // 325
"ID ::= !reserved letter idChar** ws*", // 326
"ID ::= !reserved letter idChar** ws*", // 327
"token* ::= token* token", // 328
"token* ::= token* token", // 329
"printable** ::= printable* !printable", // 330
"digit++ ::= digit+ !digit", // 331
"idChar++ ::= idChar+ !idChar", // 332
"idChar** ::= idChar* !idChar", // 333
"ws* ::= ws* ws", // 334
"ws* ::= ws* ws", // 335
"digit+ ::= digit", // 336
"digit+ ::= digit+ digit", // 337
"printable* ::= printable* printable", // 338
"printable* ::= printable* printable", // 339
"idChar+ ::= idChar", // 340
"idChar+ ::= idChar+ idChar", // 341
"idChar* ::= idChar* idChar", // 342
"idChar* ::= idChar* idChar", // 343
"", // 344
"", // 345
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 302: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 305: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 308: STRINGLIT ::= [#] '"' idChar++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
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
    { // 309: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
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
    { // 310: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 317: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 318: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 319: ws ::= "/" "*" commentContent "*" "/" @void
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
    { // 320: commentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: eol ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 322: eol ::= {13} {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 323: eol ::= {13} !10 [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: ID ::= !reserved letter idChar** $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 325: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 326: ID ::= !reserved letter !idChar [idChar**] $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 327: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 328: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 329: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 330: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 335: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 336: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 337: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 338: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 339: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 341: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 342: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 343: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: $$1 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((88<<5)|0x5)/*methodCall:88*/,
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
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 88: {
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
"int convertToInt(int,String)",
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
