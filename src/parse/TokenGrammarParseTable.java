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
private static final int MIN_REDUCTION = 1547;
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
0x80000000|881, // match move
0x80000000|1001, // no-match move
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
145, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+144, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+144, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+144, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+144, // "u"
1389, // "p"
MIN_REDUCTION+144, // "h"
449, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
763, // "g"
MIN_REDUCTION+144, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+144, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+144, // {"1".."9"}
MIN_REDUCTION+144, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+203, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
2,947, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 6
0x80000000|504, // match move
0x80000000|1355, // no-match move
0x80000000|774, // NT-test-match state for digit
  }
,
{ // state 7
2,1115, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 9
109,1470, // "h"
  }
,
{ // state 10
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 11
152,1171, // ws
154,978, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 12
0x80000000|918, // match move
0x80000000|1293, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 13
-1, // $$start
-1, // start
1373, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+228, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+228, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+228, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+228, // "u"
1389, // "p"
MIN_REDUCTION+228, // "h"
449, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
763, // "g"
MIN_REDUCTION+228, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+228, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+228, // {"1".."9"}
MIN_REDUCTION+228, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|738, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 15
168,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 16
100,963, // "s"
  }
,
{ // state 17
168,MIN_REDUCTION+145, // $NT
  }
,
{ // state 18
2,1270, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 19
123,636, // "+"
  }
,
{ // state 20
2,318, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 21
105,1513, // "i"
  }
,
{ // state 22
90,905, // "o"
  }
,
{ // state 23
0x80000000|45, // match move
0x80000000|741, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 24
0x80000000|1198, // match move
0x80000000|955, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 25
168,MIN_REDUCTION+136, // $NT
  }
,
{ // state 26
0x80000000|1450, // match move
0x80000000|1049, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 27
168,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 28
152,1171, // ws
154,978, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 29
152,1171, // ws
154,978, // eol
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+197, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|1267, // match move
0x80000000|1129, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 32
152,1171, // ws
154,978, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 33
2,1310, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 34
0x80000000|104, // match move
0x80000000|1268, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 35
100,279, // "s"
102,653, // "t"
  }
,
{ // state 36
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 37
109,1391, // "h"
  }
,
{ // state 38
105,1363, // "i"
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+116, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|94, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 42
0x80000000|1152, // match move
0x80000000|114, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 43
2,914, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 44
102,734, // "t"
  }
,
{ // state 45
2,932, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 46
152,1171, // ws
154,978, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 47
102,556, // "t"
  }
,
{ // state 48
152,1171, // ws
154,978, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 49
152,1171, // ws
154,978, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 50
0x80000000|301, // match move
0x80000000|627, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 51
0x80000000|155, // match move
0x80000000|314, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 52
0x80000000|1061, // match move
0x80000000|515, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 53
0x80000000|1284, // match move
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
0x80000000|1424, // match move
0x80000000|204, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 56
-1, // $$start
-1, // start
1046, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+201, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+201, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+201, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+201, // "u"
1389, // "p"
MIN_REDUCTION+201, // "h"
449, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
763, // "g"
MIN_REDUCTION+201, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+201, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+201, // {"1".."9"}
MIN_REDUCTION+201, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+119, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|246, // match move
0x80000000|185, // no-match move
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
152,1171, // ws
154,978, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 61
100,191, // "s"
  }
,
{ // state 62
0x80000000|189, // match move
0x80000000|547, // no-match move
// T-test match for {"0".."9" "X" "x"}:
101,
136,
137,
138,
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 64
102,1393, // "t"
  }
,
{ // state 65
152,1171, // ws
154,978, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 66
168,MIN_REDUCTION+208, // $NT
  }
,
{ // state 67
0x80000000|5, // match move
0x80000000|1434, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 68
91,1183, // "l"
105,1449, // "i"
  }
,
{ // state 69
0x80000000|231, // match move
0x80000000|1036, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 70
0x80000000|811, // match move
0x80000000|1497, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 71
0x80000000|1337, // match move
0x80000000|796, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 72
0x80000000|992, // match move
0x80000000|348, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 73
-1, // $$start
-1, // start
1058, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+251, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 74
0x80000000|1505, // match move
0x80000000|756, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 75
4,202, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
  }
,
{ // state 76
-1, // $$start
-1, // start
514, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+111, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+111, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+111, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+111, // "u"
1389, // "p"
MIN_REDUCTION+111, // "h"
449, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
763, // "g"
MIN_REDUCTION+111, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+111, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+111, // {"1".."9"}
MIN_REDUCTION+111, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 77
2,737, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 79
0x80000000|1461, // match move
0x80000000|839, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 80
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 81
0x80000000|1135, // match move
0x80000000|1368, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 82
2,917, // ws*
MIN_REDUCTION+312, // (default reduction)
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+221, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 84
0x80000000|337, // match move
0x80000000|1194, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 85
92,1051, // "e"
  }
,
{ // state 86
168,MIN_REDUCTION+205, // $NT
  }
,
{ // state 87
90,910, // "o"
105,411, // "i"
  }
,
{ // state 88
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 89
168,MIN_REDUCTION+223, // $NT
  }
,
{ // state 90
168,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 91
94,845, // "n"
  }
,
{ // state 92
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 93
2,1281, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 94
0x80000000|1313, // match move
0x80000000|1468, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 95
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 96
105,1062, // "i"
  }
,
{ // state 97
0x80000000|136, // match move
0x80000000|288, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 98
90,269, // "o"
  }
,
{ // state 99
94,1048, // "n"
  }
,
{ // state 100
0x80000000|825, // match move
0x80000000|890, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 101
0x80000000|1233, // match move
0x80000000|925, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 102
-1, // $$start
-1, // start
55, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+135, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+135, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+135, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+135, // "u"
1389, // "p"
MIN_REDUCTION+135, // "h"
449, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
763, // "g"
MIN_REDUCTION+135, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+135, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+135, // {"1".."9"}
MIN_REDUCTION+135, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 103
93,569, // "a"
  }
,
{ // state 104
152,1171, // ws
154,978, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 105
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+158, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 106
152,1171, // ws
154,978, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 108
152,1171, // ws
154,978, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 109
99,822, // "c"
  }
,
{ // state 110
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+254, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 111
93,936, // "a"
  }
,
{ // state 112
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 113
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+239, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 114
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+355, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+355, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+355, // $
-1, // $NT
  }
,
{ // state 115
0x80000000|235, // match move
0x80000000|728, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 116
100,1375, // "s"
  }
,
{ // state 117
0x80000000|675, // match move
0x80000000|159, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 118
108,827, // "p"
  }
,
{ // state 119
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 120
-1, // $$start
429, // start
31, // ws*
1021, // $$0
438, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
-1, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
-1, // $$1
612, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 121
0x80000000|848, // match move
0x80000000|856, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 122
2,692, // ws*
152,1448, // ws
154,978, // eol
160,1154, // idChar**
161,1408, // $$1
166,1213, // idChar*
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 123
152,1171, // ws
154,978, // eol
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
0x80000000|373, // match move
0x80000000|619, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 129
152,1171, // ws
154,978, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 130
143,521, // "'"
  }
,
{ // state 131
2,1163, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 133
0x80000000|1107, // match move
0x80000000|432, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 134
152,1171, // ws
154,978, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 135
152,1171, // ws
154,978, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 136
2,1321, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 138
0x80000000|1439, // match move
0x80000000|875, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 139
0x80000000|1186, // match move
0x80000000|180, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 140
152,1171, // ws
154,978, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 141
121,1278, // "*"
154,8, // eol
156,1406, // commentContent*
157,895, // commentContent
  }
,
{ // state 142
152,1171, // ws
154,978, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 143
98,1500, // "k"
  }
,
{ // state 144
2,909, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 145
0x80000000|749, // match move
0x80000000|34, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 146
0x80000000|912, // match move
0x80000000|1184, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 147
1,429, // start
2,31, // ws*
3,1021, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
89,1397, // "b"
91,1471, // "l"
92,989, // "e"
93,1544, // "a"
94,1499, // "n"
97,949, // "r"
99,486, // "c"
100,1459, // "s"
102,1479, // "t"
103,375, // "d"
104,208, // "f"
105,1411, // "i"
106,37, // "w"
108,1389, // "p"
110,449, // "v"
113,763, // "g"
162,612, // token*
167,MIN_REDUCTION+1, // $
  }
,
{ // state 148
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+95, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 149
152,1171, // ws
154,978, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 150
0x80000000|1149, // match move
0x80000000|1043, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 151
0x80000000|1014, // match move
0x80000000|889, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 152
0x80000000|311, // match move
0x80000000|490, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 153
-1, // $$start
-1, // start
914, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+255, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 154
0x80000000|769, // match move
0x80000000|1387, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 155
152,1171, // ws
154,978, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 157
152,1171, // ws
154,978, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 158
0x80000000|1000, // match move
0x80000000|736, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 159
-1, // $$start
-1, // start
50, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+222, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+222, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+222, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+222, // "u"
1389, // "p"
MIN_REDUCTION+222, // "h"
449, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
763, // "g"
MIN_REDUCTION+222, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+222, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+222, // {"1".."9"}
MIN_REDUCTION+222, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 160
168,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 161
0x80000000|20, // match move
0x80000000|1533, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 162
152,1171, // ws
154,978, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 163
2,1236, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 164
152,1171, // ws
154,978, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 165
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+300, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 166
-1, // $$start
-1, // start
1236, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+301, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 167
152,1171, // ws
154,978, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 168
94,789, // "n"
  }
,
{ // state 169
94,807, // "n"
  }
,
{ // state 170
168,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 171
3,687, // $$0
4,438, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
62,652, // `*
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
121,613, // "*"
139,974, // intLit2
141,1300, // digit++
142,777, // digit
147,491, // letter
152,1171, // ws
154,978, // eol
162,612, // token*
165,6, // digit+
  }
,
{ // state 172
0x80000000|705, // match move
0x80000000|30, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 173
2,692, // ws*
152,1448, // ws
154,978, // eol
161,993, // $$1
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 174
168,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 175
0x80000000|163, // match move
0x80000000|316, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 176
152,1171, // ws
154,978, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 177
168,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 178
168,MIN_REDUCTION+181, // $NT
  }
,
{ // state 179
2,879, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 180
0x80000000|618, // match move
0x80000000|354, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 181
0x80000000|177, // match move
0x80000000|1320, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 182
0x80000000|803, // match move
0x80000000|913, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 183
0x80000000|1072, // match move
0x80000000|804, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 184
152,1171, // ws
154,978, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 185
0x80000000|1211, // match move
0x80000000|1522, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 186
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 187
0x80000000|1128, // match move
0x80000000|840, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 188
152,1171, // ws
154,978, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 189
101,906, // "x"
138,906, // "X"
140,830, // `x
  }
,
{ // state 190
0x80000000|213, // match move
0x80000000|1331, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|150, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 192
0x80000000|795, // match move
0x80000000|937, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 193
0x80000000|765, // match move
0x80000000|969, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 194
0x80000000|472, // match move
0x80000000|837, // no-match move
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
168,MIN_REDUCTION+310, // $NT
  }
,
{ // state 198
0x80000000|1318, // match move
0x80000000|548, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 199
0x80000000|1214, // match move
0x80000000|976, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 200
98,812, // "k"
  }
,
{ // state 201
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 203
-1, // $$start
-1, // start
1281, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+153, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+153, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+153, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+153, // "u"
1389, // "p"
MIN_REDUCTION+153, // "h"
449, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
763, // "g"
MIN_REDUCTION+153, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+153, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+153, // {"1".."9"}
MIN_REDUCTION+153, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|284, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 205
110,753, // "v"
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 207
102,649, // "t"
  }
,
{ // state 208
90,1040, // "o"
91,233, // "l"
93,580, // "a"
105,1059, // "i"
  }
,
{ // state 209
152,1171, // ws
154,978, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|242, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 211
102,772, // "t"
  }
,
{ // state 212
0x80000000|1401, // match move
0x80000000|782, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 213
3,687, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
89,1397, // "b"
91,1471, // "l"
92,989, // "e"
93,1544, // "a"
94,1499, // "n"
97,949, // "r"
99,486, // "c"
100,1459, // "s"
102,1479, // "t"
103,375, // "d"
104,208, // "f"
105,1411, // "i"
106,37, // "w"
108,1389, // "p"
110,449, // "v"
113,763, // "g"
162,612, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 214
0x80000000|552, // match move
0x80000000|820, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 215
2,904, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 216
0x80000000|544, // match move
0x80000000|800, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 217
152,1171, // ws
154,978, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 218
168,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 219
92,1117, // "e"
  }
,
{ // state 220
0x80000000|1160, // match move
0x80000000|559, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 221
152,1171, // ws
154,978, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 222
0x80000000|893, // match move
0x80000000|461, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 223
152,1171, // ws
154,978, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 224
102,773, // "t"
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+98, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
0x80000000|751, // match move
0x80000000|476, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 227
-1, // $$start
-1, // start
577, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
MIN_REDUCTION+289, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+289, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+230, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
2,1046, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 233
90,383, // "o"
  }
,
{ // state 234
-1, // $$start
-1, // start
1525, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+162, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+162, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+162, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+162, // "u"
1389, // "p"
MIN_REDUCTION+162, // "h"
449, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
763, // "g"
MIN_REDUCTION+162, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+162, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+162, // {"1".."9"}
MIN_REDUCTION+162, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
2,786, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 236
0x80000000|1527, // match move
0x80000000|985, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 237
152,1171, // ws
154,978, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 238
-1, // $$start
-1, // start
1346, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+132, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+132, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+132, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+132, // "u"
1389, // "p"
MIN_REDUCTION+132, // "h"
449, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
763, // "g"
MIN_REDUCTION+132, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+132, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+132, // {"1".."9"}
MIN_REDUCTION+132, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 239
118,516, // "&"
  }
,
{ // state 240
2,1373, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 241
0x80000000|897, // match move
0x80000000|987, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 242
0x80000000|364, // match move
0x80000000|1259, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 243
-1, // $$start
-1, // start
396, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+141, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+141, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+141, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+141, // "u"
1389, // "p"
MIN_REDUCTION+141, // "h"
449, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
763, // "g"
MIN_REDUCTION+141, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+141, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+141, // {"1".."9"}
MIN_REDUCTION+141, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 244
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 245
0x80000000|1399, // match move
0x80000000|152, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 246
2,492, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 247
0x80000000|470, // match move
0x80000000|1378, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 248
152,1171, // ws
154,978, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 249
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+200, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 250
0x80000000|297, // match move
0x80000000|709, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 251
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 252
168,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 253
152,1171, // ws
154,978, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 254
2,1236, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 255
107,445, // "u"
  }
,
{ // state 256
152,1171, // ws
154,978, // eol
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 257
2,1069, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 259
0x80000000|1359, // match move
0x80000000|1164, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 260
0x80000000|434, // match move
0x80000000|238, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 261
0x80000000|420, // match move
0x80000000|1530, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 262
152,1171, // ws
154,978, // eol
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 263
152,1171, // ws
154,978, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 264
-1, // $$start
-1, // start
1270, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+123, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+123, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+123, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+123, // "u"
1389, // "p"
MIN_REDUCTION+123, // "h"
449, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
763, // "g"
MIN_REDUCTION+123, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+123, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+123, // {"1".."9"}
MIN_REDUCTION+123, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 265
-1, // $$start
-1, // start
879, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+126, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+126, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+126, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+126, // "u"
1389, // "p"
MIN_REDUCTION+126, // "h"
449, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
763, // "g"
MIN_REDUCTION+126, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+126, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+126, // {"1".."9"}
MIN_REDUCTION+126, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 266
0x80000000|1103, // match move
0x80000000|794, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 267
168,MIN_REDUCTION+148, // $NT
  }
,
{ // state 268
152,1171, // ws
154,978, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 269
106,561, // "w"
  }
,
{ // state 270
0x80000000|1215, // match move
0x80000000|528, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 271
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+266, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 272
-1, // $$start
-1, // start
52, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+210, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+210, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+210, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+210, // "u"
1389, // "p"
MIN_REDUCTION+210, // "h"
449, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
763, // "g"
MIN_REDUCTION+210, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+210, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+210, // {"1".."9"}
MIN_REDUCTION+210, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 273
92,41, // "e"
  }
,
{ // state 274
99,829, // "c"
  }
,
{ // state 275
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+122, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 276
0x80000000|599, // match move
0x80000000|1200, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 277
1,429, // start
2,31, // ws*
3,1021, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
162,612, // token*
  }
,
{ // state 278
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 279
102,1341, // "t"
  }
,
{ // state 280
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+256, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 281
0x80000000|258, // match move
0x80000000|271, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 282
152,1171, // ws
154,978, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 283
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+294, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 284
0x80000000|1037, // match move
0x80000000|327, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 285
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 286
93,922, // "a"
  }
,
{ // state 287
2,914, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 288
0x80000000|342, // match move
0x80000000|84, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 289
0x80000000|1, // match move
0x80000000|260, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 290
92,495, // "e"
  }
,
{ // state 291
0x80000000|399, // match move
0x80000000|1023, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 292
168,MIN_REDUCTION+214, // $NT
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 294
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+264, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 295
0x80000000|48, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 296
92,1205, // "e"
  }
,
{ // state 297
152,1171, // ws
154,978, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 298
0x80000000|229, // match move
0x80000000|283, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 299
152,1171, // ws
154,978, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 300
168,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 301
152,1171, // ws
154,978, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 302
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+125, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 303
168,MIN_REDUCTION+241, // $NT
  }
,
{ // state 304
0x80000000|951, // match move
0x80000000|911, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 305
0x80000000|88, // match move
0x80000000|1041, // no-match move
0x80000000|774, // NT-test-match state for digit
  }
,
{ // state 306
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+286, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 307
0x80000000|590, // match move
0x80000000|385, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 308
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 309
168,MIN_REDUCTION+94, // $NT
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|1179, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 311
2,466, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 312
168,MIN_REDUCTION+217, // $NT
  }
,
{ // state 313
4,202, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
62,652, // `*
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
121,613, // "*"
139,974, // intLit2
141,1300, // digit++
142,777, // digit
147,491, // letter
165,6, // digit+
  }
,
{ // state 314
0x80000000|253, // match move
0x80000000|172, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 315
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 316
0x80000000|467, // match move
0x80000000|166, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 317
2,831, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 318
0x80000000|1384, // match move
0x80000000|1199, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 319
0x80000000|940, // match move
0x80000000|1350, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 320
0x80000000|725, // match move
0x80000000|690, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 321
-1, // $$start
-1, // start
909, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+189, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+189, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+189, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+189, // "u"
1389, // "p"
MIN_REDUCTION+189, // "h"
449, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
763, // "g"
MIN_REDUCTION+189, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+189, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+189, // {"1".."9"}
MIN_REDUCTION+189, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 322
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 323
2,524, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 324
93,1003, // "a"
  }
,
{ // state 325
2,904, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 326
1,429, // start
2,31, // ws*
3,1021, // $$0
4,438, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
83,872, // `/
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
136,62, // "0"
147,491, // letter
152,1448, // ws
154,978, // eol
162,612, // token*
  }
,
{ // state 327
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+134, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 328
92,923, // "e"
  }
,
{ // state 329
0x80000000|1209, // match move
0x80000000|370, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 330
2,831, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 331
0x80000000|1, // match move
0x80000000|117, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 332
168,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 333
122,447, // "/"
  }
,
{ // state 334
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+146, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 335
168,MIN_REDUCTION+151, // $NT
  }
,
{ // state 336
91,525, // "l"
  }
,
{ // state 337
2,1321, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 338
102,14, // "t"
  }
,
{ // state 339
92,1322, // "e"
  }
,
{ // state 340
0x80000000|710, // match move
0x80000000|1161, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 341
0x80000000|1056, // match move
0x80000000|684, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 342
2,1321, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 343
100,1323, // "s"
  }
,
{ // state 344
2,405, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 345
152,1171, // ws
154,978, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 346
152,1171, // ws
154,978, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 347
168,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 349
168,MIN_REDUCTION+316, // $NT
  }
,
{ // state 350
99,876, // "c"
  }
,
{ // state 351
2,640, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 352
2,947, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 353
168,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 354
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
-1, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
-1, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+263, // "*"
673, // "/"
MIN_REDUCTION+263, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 355
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 356
152,1171, // ws
154,978, // eol
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 357
0x80000000|535, // match move
0x80000000|990, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 358
0x80000000|254, // match move
0x80000000|175, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 359
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 360
89,1303, // "b"
90,1303, // "o"
91,1303, // "l"
92,1303, // "e"
93,1303, // "a"
94,1303, // "n"
97,1303, // "r"
98,1303, // "k"
99,1303, // "c"
100,1303, // "s"
101,1303, // "x"
102,1303, // "t"
103,1303, // "d"
104,1303, // "f"
105,1303, // "i"
106,1303, // "w"
107,1303, // "u"
108,1303, // "p"
109,1303, // "h"
110,1303, // "v"
111,1303, // "y"
112,1303, // "m"
113,1303, // "g"
114,1303, // "z"
115,1303, // "!"
116,1303, // "="
117,1303, // "%"
118,1303, // "&"
119,1303, // "("
120,1303, // ")"
121,1303, // "*"
122,1303, // "/"
123,1303, // "+"
124,1303, // ","
125,1303, // "-"
126,1303, // "."
127,1303, // ":"
128,1303, // ";"
129,1303, // "<"
130,1303, // ">"
131,1303, // "["
132,1303, // "]"
133,1303, // "{"
134,1303, // "}"
135,1303, // "|"
136,1303, // "0"
137,1303, // {"1".."9"}
138,1303, // "X"
143,1303, // "'"
145,1303, // '"'
148,1303, // "_"
149,1303, // {"A".."W" "Y".."Z" "j" "q"}
150,1303, // " "
151,1303, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 361
0x80000000|596, // match move
0x80000000|408, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 362
103,1045, // "d"
  }
,
{ // state 363
152,1171, // ws
154,978, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 364
2,376, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 365
0x80000000|393, // match move
0x80000000|658, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 366
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 368
0x80000000|484, // match move
0x80000000|1295, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 369
152,1171, // ws
154,978, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 370
0x80000000|465, // match move
0x80000000|934, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 371
-1, // $$start
-1, // start
1115, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+120, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+120, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+120, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+120, // "u"
1389, // "p"
MIN_REDUCTION+120, // "h"
449, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
763, // "g"
MIN_REDUCTION+120, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+120, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+120, // {"1".."9"}
MIN_REDUCTION+120, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 372
97,915, // "r"
  }
,
{ // state 373
2,1232, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 374
0x80000000|854, // match move
0x80000000|494, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 375
90,779, // "o"
92,864, // "e"
  }
,
{ // state 376
0x80000000|1481, // match move
0x80000000|1196, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 377
152,1171, // ws
154,978, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 378
152,1171, // ws
154,978, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 379
2,1508, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 380
168,MIN_REDUCTION+100, // $NT
  }
,
{ // state 381
99,766, // "c"
  }
,
{ // state 382
0x80000000|184, // match move
0x80000000|697, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 383
93,1366, // "a"
  }
,
{ // state 384
0x80000000|325, // match move
0x80000000|436, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 385
0x80000000|1201, // match move
0x80000000|275, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 386
168,MIN_REDUCTION+202, // $NT
  }
,
{ // state 387
2,405, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 388
92,362, // "e"
  }
,
{ // state 389
105,1365, // "i"
  }
,
{ // state 390
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 391
2,216, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 393
152,1171, // ws
154,978, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 394
152,1171, // ws
154,978, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 396
0x80000000|299, // match move
0x80000000|671, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 397
0x80000000|262, // match move
0x80000000|42, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 398
108,1108, // "p"
  }
,
{ // state 399
168,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 400
0x80000000|714, // match move
0x80000000|997, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 401
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 402
168,MIN_REDUCTION+91, // $NT
  }
,
{ // state 403
100,746, // "s"
  }
,
{ // state 404
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+270, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 405
0x80000000|1229, // match move
0x80000000|1345, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 406
1,429, // start
2,31, // ws*
3,1021, // $$0
4,438, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
62,652, // `*
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
121,613, // "*"
139,974, // intLit2
141,1300, // digit++
142,777, // digit
147,491, // letter
152,1448, // ws
154,978, // eol
162,612, // token*
165,6, // digit+
  }
,
{ // state 407
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+170, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 408
0x80000000|1469, // match move
0x80000000|291, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 409
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+242, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 410
2,917, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 411
110,931, // "v"
  }
,
{ // state 412
0x80000000|174, // match move
0x80000000|1289, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 413
152,1171, // ws
154,978, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 414
168,MIN_REDUCTION+226, // $NT
  }
,
{ // state 415
152,1171, // ws
154,978, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 416
125,1480, // "-"
  }
,
{ // state 417
0x80000000|160, // match move
0x80000000|1304, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 418
152,1171, // ws
154,978, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 419
94,35, // "n"
  }
,
{ // state 420
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 421
2,1310, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 422
-1, // $$start
-1, // start
493, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+259, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 423
-1, // $$start
-1, // start
1291, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+277, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 424
0x80000000|330, // match move
0x80000000|1418, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 425
2,1232, // ws*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 426
168,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 427
0x80000000|630, // match move
0x80000000|1482, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 428
0x80000000|995, // match move
0x80000000|744, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 429
167,MIN_REDUCTION+0, // $
  }
,
{ // state 430
93,99, // "a"
107,85, // "u"
111,1369, // "y"
  }
,
{ // state 431
0x80000000|167, // match move
0x80000000|699, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 432
0x80000000|395, // match move
0x80000000|1457, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 433
0x80000000|188, // match move
0x80000000|101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 434
2,1346, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 435
2,1100, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 436
-1, // $$start
-1, // start
904, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
-1, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+303, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
MIN_REDUCTION+303, // "0"
MIN_REDUCTION+303, // {"1".."9"}
100, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 437
2,1067, // ws*
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 439
102,1011, // "t"
  }
,
{ // state 440
152,1171, // ws
154,978, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 441
0x80000000|973, // match move
0x80000000|83, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 442
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 443
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+191, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 444
91,273, // "l"
  }
,
{ // state 445
112,568, // "m"
  }
,
{ // state 446
168,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 447
168,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 448
0x80000000|1531, // match move
0x80000000|261, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 449
90,68, // "o"
  }
,
{ // state 450
168,MIN_REDUCTION+323, // $NT
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 451
152,1171, // ws
154,978, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 453
0x80000000|1542, // match move
0x80000000|74, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 454
-1, // $$start
-1, // start
1123, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+171, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+171, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+171, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+171, // "u"
1389, // "p"
MIN_REDUCTION+171, // "h"
449, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
763, // "g"
MIN_REDUCTION+171, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+171, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+171, // {"1".."9"}
MIN_REDUCTION+171, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 455
152,1171, // ws
154,978, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 456
5,402, // `boolean
6,1377, // `class
7,1131, // `extends
8,17, // `void
9,998, // `int
10,267, // `while
11,700, // `if
12,380, // `else
13,1415, // `for
14,309, // `break
15,1446, // `this
16,1212, // `false
17,1329, // `true
18,1477, // `super
19,1357, // `null
20,1031, // `return
21,919, // `instanceof
22,1141, // `new
23,335, // `abstract
24,1483, // `assert
25,654, // `byte
26,1119, // `case
27,196, // `catch
28,1111, // `char
29,503, // `const
30,545, // `continue
31,967, // `default
32,1442, // `do
33,178, // `double
34,1380, // `enum
35,195, // `final
36,1290, // `finally
37,1273, // `float
38,659, // `goto
39,228, // `implements
40,386, // `import
41,86, // `interface
42,66, // `long
43,1383, // `native
44,292, // `package
45,312, // `private
46,706, // `protected
47,1342, // `public
48,89, // `short
49,414, // `static
50,54, // `strictfp
51,25, // `switch
52,975, // `synchronized
53,878, // `throw
54,1478, // `throws
55,303, // `transient
56,691, // `try
57,1073, // `volatile
89,1397, // "b"
91,1471, // "l"
92,989, // "e"
93,1544, // "a"
94,1499, // "n"
97,949, // "r"
99,486, // "c"
100,1459, // "s"
102,1479, // "t"
103,375, // "d"
104,208, // "f"
105,1411, // "i"
106,37, // "w"
108,1389, // "p"
110,449, // "v"
113,763, // "g"
  }
,
{ // state 457
0x80000000|18, // match move
0x80000000|264, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 458
0x80000000|1464, // match move
0x80000000|1287, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 459
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 460
-1, // $$start
-1, // start
692, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+333, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
993, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+333, // $
-1, // $NT
  }
,
{ // state 461
0x80000000|257, // match move
0x80000000|1349, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 462
2,1084, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 463
116,1431, // "="
  }
,
{ // state 464
106,310, // "w"
  }
,
{ // state 465
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 466
0x80000000|415, // match move
0x80000000|633, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 467
2,1236, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 468
2,1390, // ws*
150,835, // " "
152,1448, // ws
153,835, // {9}
154,978, // eol
158,1501, // {10}
159,1317, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 469
0x80000000|323, // match move
0x80000000|1453, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 470
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 471
2,433, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 472
152,1171, // ws
154,978, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 473
0x80000000|531, // match move
0x80000000|92, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 474
2,786, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 475
168,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 476
0x80000000|1285, // match move
0x80000000|929, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 477
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 478
168,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 479
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+274, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 480
0x80000000|1, // match move
0x80000000|457, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 481
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 482
2,1058, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 483
152,1171, // ws
154,978, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 484
152,1171, // ws
154,978, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 486
90,419, // "o"
91,111, // "l"
93,1208, // "a"
109,286, // "h"
  }
,
{ // state 487
0x80000000|135, // match move
0x80000000|295, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 488
2,1291, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 489
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+280, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 490
-1, // $$start
-1, // start
466, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+279, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 491
0x80000000|546, // match move
0x80000000|1162, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 492
0x80000000|1015, // match move
0x80000000|894, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 493
0x80000000|541, // match move
0x80000000|1240, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 494
0x80000000|351, // match move
0x80000000|646, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 495
99,1462, // "c"
  }
,
{ // state 496
0x80000000|592, // match move
0x80000000|1314, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 497
0x80000000|887, // match move
0x80000000|1010, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 498
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+298, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 499
92,1512, // "e"
  }
,
{ // state 500
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 501
0x80000000|1436, // match move
0x80000000|187, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 502
0x80000000|315, // match move
0x80000000|1286, // no-match move
0x80000000|774, // NT-test-match state for digit
  }
,
{ // state 503
168,MIN_REDUCTION+169, // $NT
  }
,
{ // state 504
136,305, // "0"
137,305, // {"1".."9"}
142,502, // digit
  }
,
{ // state 505
152,1171, // ws
154,978, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 506
152,1171, // ws
154,978, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 507
-1, // $$start
-1, // start
972, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+234, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+234, // "k"
486, // "c"
662, // "s"
MIN_REDUCTION+234, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+234, // "u"
1389, // "p"
MIN_REDUCTION+234, // "h"
449, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
763, // "g"
MIN_REDUCTION+234, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+234, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+234, // {"1".."9"}
MIN_REDUCTION+234, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 508
0x80000000|363, // match move
0x80000000|71, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 509
0x80000000|1381, // match move
0x80000000|1102, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 510
92,1136, // "e"
  }
,
{ // state 511
0x80000000|742, // match move
0x80000000|941, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 512
102,1118, // "t"
  }
,
{ // state 513
4,202, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
  }
,
{ // state 514
0x80000000|852, // match move
0x80000000|865, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 515
0x80000000|263, // match move
0x80000000|412, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 516
0x80000000|43, // match move
0x80000000|220, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 517
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 518
0x80000000|209, // match move
0x80000000|624, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 519
0x80000000|391, // match move
0x80000000|566, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 520
0x80000000|815, // match move
0x80000000|964, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 521
0x80000000|410, // match move
0x80000000|598, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 522
-1, // $$start
-1, // start
537, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+297, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 523
93,350, // "a"
  }
,
{ // state 524
0x80000000|28, // match move
0x80000000|1362, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 525
105,1361, // "i"
  }
,
{ // state 526
1,429, // start
2,31, // ws*
3,1021, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
162,612, // token*
  }
,
{ // state 527
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+272, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 528
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 529
107,1517, // "u"
  }
,
{ // state 530
2,466, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 532
2,767, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 533
0x80000000|1282, // match move
0x80000000|660, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 534
2,493, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 535
2,1163, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 536
2,617, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 537
0x80000000|505, // match move
0x80000000|319, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 538
0x80000000|446, // match move
0x80000000|57, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 539
0x80000000|369, // match move
0x80000000|138, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 540
0x80000000|1484, // match move
0x80000000|755, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 541
152,1171, // ws
154,978, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 542
97,1157, // "r"
  }
,
{ // state 543
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 544
152,1171, // ws
154,978, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 545
168,MIN_REDUCTION+172, // $NT
  }
,
{ // state 546
89,100, // "b"
90,100, // "o"
91,100, // "l"
92,100, // "e"
93,100, // "a"
94,100, // "n"
95,1173, // idChar
97,100, // "r"
98,100, // "k"
99,100, // "c"
100,100, // "s"
101,100, // "x"
102,100, // "t"
103,100, // "d"
104,100, // "f"
105,100, // "i"
106,100, // "w"
107,100, // "u"
108,100, // "p"
109,100, // "h"
110,100, // "v"
111,100, // "y"
112,100, // "m"
113,100, // "g"
114,100, // "z"
136,1475, // "0"
137,1475, // {"1".."9"}
138,100, // "X"
142,198, // digit
147,650, // letter
148,1151, // "_"
149,100, // {"A".."W" "Y".."Z" "j" "q"}
160,1154, // idChar**
166,1213, // idChar*
  }
,
{ // state 547
0x80000000|215, // match move
0x80000000|384, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 548
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 549
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+296, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 550
0x80000000|1197, // match move
0x80000000|587, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 551
0x80000000|898, // match move
0x80000000|1175, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 552
152,1171, // ws
154,978, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 553
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+155, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 554
2,537, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 555
102,1007, // "t"
  }
,
{ // state 556
93,1170, // "a"
  }
,
{ // state 557
2,493, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 558
107,801, // "u"
  }
,
{ // state 559
0x80000000|287, // match move
0x80000000|153, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 560
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 561
0x80000000|1485, // match move
0x80000000|849, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 562
168,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 563
0x80000000|712, // match move
0x80000000|594, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 564
-1, // $$start
-1, // start
492, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+253, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 565
0x80000000|344, // match move
0x80000000|1443, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 566
-1, // $$start
-1, // start
216, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+183, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+183, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+183, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+183, // "u"
1389, // "p"
MIN_REDUCTION+183, // "h"
449, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
763, // "g"
MIN_REDUCTION+183, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+183, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+183, // {"1".."9"}
MIN_REDUCTION+183, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 567
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 568
0x80000000|1, // match move
0x80000000|519, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 569
99,1178, // "c"
  }
,
{ // state 570
0x80000000|1, // match move
0x80000000|723, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 571
2,55, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 572
2,972, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 573
0x80000000|77, // match move
0x80000000|757, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 574
152,1171, // ws
154,978, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 576
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+236, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 577
0x80000000|1257, // match move
0x80000000|133, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 578
0x80000000|162, // match move
0x80000000|704, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 579
2,1291, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 580
91,16, // "l"
  }
,
{ // state 581
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+282, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 582
0x80000000|413, // match move
0x80000000|1009, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 583
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 584
2,1310, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 585
2,932, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 586
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+110, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 587
0x80000000|656, // match move
0x80000000|1210, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 588
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 589
0x80000000|693, // match move
0x80000000|1539, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 590
152,1171, // ws
154,978, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 591
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 592
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 593
103,61, // "d"
  }
,
{ // state 594
0x80000000|655, // match move
0x80000000|374, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 595
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 596
152,1171, // ws
154,978, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 597
90,168, // "o"
111,1292, // "y"
  }
,
{ // state 598
0x80000000|1271, // match move
0x80000000|1121, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 599
152,1171, // ws
154,978, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 600
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 602
116,785, // "="
  }
,
{ // state 603
2,145, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 604
102,1185, // "t"
  }
,
{ // state 605
0x80000000|1, // match move
0x80000000|928, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 606
113,1180, // "g"
  }
,
{ // state 607
0x80000000|1166, // match move
0x80000000|1065, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 608
152,1171, // ws
154,978, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 609
4,202, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
83,872, // `/
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
136,62, // "0"
147,491, // letter
  }
,
{ // state 610
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 612
0x80000000|719, // match move
0x80000000|722, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|468, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 614
0x80000000|1, // match move
0x80000000|670, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 615
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+276, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 616
152,1171, // ws
154,978, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 617
0x80000000|666, // match move
0x80000000|1080, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 618
2,212, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 619
0x80000000|425, // match move
0x80000000|1110, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 620
0x80000000|557, // match move
0x80000000|422, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 621
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 622
0x80000000|1428, // match move
0x80000000|698, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 623
2,520, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 624
0x80000000|1498, // match move
0x80000000|713, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 625
102,1094, // "t"
  }
,
{ // state 626
0x80000000|695, // match move
0x80000000|1250, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 627
0x80000000|142, // match move
0x80000000|441, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 628
97,98, // "r"
105,116, // "i"
  }
,
{ // state 629
0x80000000|1, // match move
0x80000000|573, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 630
168,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 631
0x80000000|1532, // match move
0x80000000|1245, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 632
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 633
0x80000000|1246, // match move
0x80000000|533, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 634
91,1472, // "l"
  }
,
{ // state 635
92,805, // "e"
  }
,
{ // state 636
0x80000000|678, // match move
0x80000000|469, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 637
0x80000000|1515, // match move
0x80000000|871, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 638
97,1217, // "r"
  }
,
{ // state 639
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 640
0x80000000|1413, // match move
0x80000000|158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 641
152,1171, // ws
154,978, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 642
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+302, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 643
168,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 644
0x80000000|75, // match move
0x80000000|609, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 645
152,1171, // ws
154,978, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 646
-1, // $$start
-1, // start
640, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
MIN_REDUCTION+249, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+249, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 647
97,289, // "r"
  }
,
{ // state 648
0x80000000|252, // match move
0x80000000|806, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 649
0x80000000|1, // match move
0x80000000|863, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 650
0x80000000|1494, // match move
0x80000000|1420, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 651
2,577, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 652
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 653
105,91, // "i"
  }
,
{ // state 654
168,MIN_REDUCTION+157, // $NT
  }
,
{ // state 655
2,640, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 656
168,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 657
0x80000000|924, // match move
0x80000000|986, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 658
0x80000000|1068, // match move
0x80000000|230, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 659
168,MIN_REDUCTION+196, // $NT
  }
,
{ // state 660
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+278, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 661
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+161, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 662
0x80000000|1116, // match move
0x80000000|1280, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 663
0x80000000|1344, // match move
0x80000000|1396, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 664
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 665
135,358, // "|"
  }
,
{ // state 666
152,1171, // ws
154,978, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 668
111,1292, // "y"
  }
,
{ // state 669
2,1123, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 670
0x80000000|730, // match move
0x80000000|272, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 671
0x80000000|1364, // match move
0x80000000|1158, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 672
97,207, // "r"
  }
,
{ // state 673
0x80000000|1076, // match move
0x80000000|1432, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 674
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+252, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 675
2,50, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 677
0x80000000|347, // match move
0x80000000|1112, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 678
2,524, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 679
0x80000000|1096, // match move
0x80000000|1244, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 680
0x80000000|106, // match move
0x80000000|1456, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 681
104,1204, // "f"
  }
,
{ // state 682
0x80000000|859, // match move
0x80000000|944, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 683
0x80000000|352, // match move
0x80000000|67, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 684
0x80000000|1372, // match move
0x80000000|527, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 685
91,668, // "l"
  }
,
{ // state 686
0x80000000|1106, // match move
0x80000000|251, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 687
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 688
154,450, // eol
155,1078, // printable**
158,1501, // {10}
159,1317, // {13}
163,320, // printable*
  }
,
{ // state 689
94,1104, // "n"
  }
,
{ // state 690
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 691
168,MIN_REDUCTION+244, // $NT
  }
,
{ // state 692
0x80000000|256, // match move
0x80000000|397, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 693
116,1265, // "="
  }
,
{ // state 694
2,1492, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 695
92,542, // "e"
  }
,
{ // state 696
152,1171, // ws
154,978, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 697
0x80000000|1253, // match move
0x80000000|3, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 698
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+262, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 699
0x80000000|332, // match move
0x80000000|334, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 700
168,MIN_REDUCTION+112, // $NT
  }
,
{ // state 701
0x80000000|862, // match move
0x80000000|1105, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 702
168,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 703
0x80000000|1487, // match move
0x80000000|869, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 704
0x80000000|866, // match move
0x80000000|642, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 705
168,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 706
168,MIN_REDUCTION+220, // $NT
  }
,
{ // state 707
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 708
0x80000000|1, // match move
0x80000000|657, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 709
0x80000000|1053, // match move
0x80000000|861, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 710
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 711
-1, // $$start
-1, // start
917, // ws*
-1, // $$0
MIN_REDUCTION+312, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+312, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+312, // $
-1, // $NT
  }
,
{ // state 712
116,1235, // "="
  }
,
{ // state 713
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+185, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 714
2,577, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 715
89,1303, // "b"
90,1303, // "o"
91,1303, // "l"
92,1303, // "e"
93,1303, // "a"
94,1303, // "n"
97,1303, // "r"
98,1303, // "k"
99,1303, // "c"
100,1303, // "s"
101,1303, // "x"
102,1303, // "t"
103,1303, // "d"
104,1303, // "f"
105,1303, // "i"
106,1303, // "w"
107,1303, // "u"
108,1303, // "p"
109,1303, // "h"
110,1303, // "v"
111,1303, // "y"
112,1303, // "m"
113,1303, // "g"
114,1303, // "z"
115,1303, // "!"
116,1303, // "="
117,1303, // "%"
118,1303, // "&"
119,1303, // "("
120,1303, // ")"
121,1303, // "*"
122,1303, // "/"
123,1303, // "+"
124,1303, // ","
125,1303, // "-"
126,1303, // "."
127,1303, // ":"
128,1303, // ";"
129,1303, // "<"
130,1303, // ">"
131,1303, // "["
132,1303, // "]"
133,1303, // "{"
134,1303, // "}"
135,1303, // "|"
136,1303, // "0"
137,1303, // {"1".."9"}
138,1303, // "X"
143,1303, // "'"
144,130, // printable
145,1303, // '"'
148,1303, // "_"
149,1303, // {"A".."W" "Y".."Z" "j" "q"}
150,1303, // " "
151,1303, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 716
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+311, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+311, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+311, // $
-1, // $NT
  }
,
{ // state 717
-1, // $$start
-1, // start
1508, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
MIN_REDUCTION+281, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+281, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 718
112,1333, // "m"
  }
,
{ // state 719
0x80000000|1, // match move
0x80000000|1242, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 720
152,1171, // ws
154,978, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 721
2,1525, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 722
0x80000000|644, // match move
0x80000000|428, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 723
0x80000000|1088, // match move
0x80000000|1220, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 724
0x80000000|999, // match move
0x80000000|110, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 725
89,247, // "b"
90,247, // "o"
91,247, // "l"
92,247, // "e"
93,247, // "a"
94,247, // "n"
97,247, // "r"
98,247, // "k"
99,247, // "c"
100,247, // "s"
101,247, // "x"
102,247, // "t"
103,247, // "d"
104,247, // "f"
105,247, // "i"
106,247, // "w"
107,247, // "u"
108,247, // "p"
109,247, // "h"
110,247, // "v"
111,247, // "y"
112,247, // "m"
113,247, // "g"
114,247, // "z"
115,247, // "!"
116,247, // "="
117,247, // "%"
118,247, // "&"
119,247, // "("
120,247, // ")"
121,247, // "*"
122,247, // "/"
123,247, // "+"
124,247, // ","
125,247, // "-"
126,247, // "."
127,247, // ":"
128,247, // ";"
129,247, // "<"
130,247, // ">"
131,247, // "["
132,247, // "]"
133,247, // "{"
134,247, // "}"
135,247, // "|"
136,247, // "0"
137,247, // {"1".."9"}
138,247, // "X"
143,247, // "'"
144,788, // printable
145,247, // '"'
148,247, // "_"
149,247, // {"A".."W" "Y".."Z" "j" "q"}
150,247, // " "
151,247, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 726
0x80000000|608, // match move
0x80000000|382, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 727
90,1247, // "o"
91,868, // "l"
  }
,
{ // state 728
-1, // $$start
-1, // start
786, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+293, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 729
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+101, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 730
2,52, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 731
93,99, // "a"
105,1006, // "i"
107,85, // "u"
111,1369, // "y"
  }
,
{ // state 732
0x80000000|33, // match move
0x80000000|1343, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 733
91,480, // "l"
  }
,
{ // state 734
92,1264, // "e"
  }
,
{ // state 735
105,1335, // "i"
  }
,
{ // state 736
0x80000000|1218, // match move
0x80000000|884, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 737
0x80000000|1249, // match move
0x80000000|954, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 738
0x80000000|435, // match move
0x80000000|1301, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 739
2,514, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 740
152,1171, // ws
154,978, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 741
-1, // $$start
-1, // start
932, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+305, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 742
152,1171, // ws
154,978, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 743
121,1534, // "*"
122,1219, // "/"
  }
,
{ // state 744
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
-1, // "*"
1465, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
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
MIN_REDUCTION+354, // $
-1, // $NT
  }
,
{ // state 745
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+104, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 746
0x80000000|1, // match move
0x80000000|703, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 747
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 748
-1, // $$start
-1, // start
831, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+283, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 749
152,1171, // ws
154,978, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 750
0x80000000|1195, // match move
0x80000000|105, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 751
152,1171, // ws
154,978, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 752
152,1171, // ws
154,978, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 753
92,614, // "e"
  }
,
{ // state 754
152,1171, // ws
154,978, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 755
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+292, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 756
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+149, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 757
-1, // $$start
-1, // start
737, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+105, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+105, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+105, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+105, // "u"
1389, // "p"
MIN_REDUCTION+105, // "h"
449, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
763, // "g"
MIN_REDUCTION+105, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+105, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+105, // {"1".."9"}
MIN_REDUCTION+105, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 758
0x80000000|248, // match move
0x80000000|1311, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 759
152,1171, // ws
154,978, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 760
0x80000000|1376, // match move
0x80000000|1203, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 761
0x80000000|1238, // match move
0x80000000|716, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 762
2,492, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 763
90,604, // "o"
  }
,
{ // state 764
152,1171, // ws
154,978, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 765
2,663, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 766
109,816, // "h"
  }
,
{ // state 767
0x80000000|455, // match move
0x80000000|550, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 768
0x80000000|1027, // match move
0x80000000|409, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 769
152,1171, // ws
154,978, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 770
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+250, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 771
0x80000000|471, // match move
0x80000000|1130, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 772
100,885, // "s"
  }
,
{ // state 773
92,965, // "e"
  }
,
{ // state 774
136,197, // "0"
137,197, // {"1".."9"}
  }
,
{ // state 775
-1, // $$start
-1, // start
405, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
-1, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
-1, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+269, // "*"
673, // "/"
1047, // "+"
631, // ","
MIN_REDUCTION+269, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 776
0x80000000|960, // match move
0x80000000|294, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 777
0x80000000|778, // match move
0x80000000|832, // no-match move
0x80000000|774, // NT-test-match state for digit
  }
,
{ // state 778
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 779
0x80000000|558, // match move
0x80000000|682, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 780
0x80000000|1496, // match move
0x80000000|821, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 781
0x80000000|125, // match move
0x80000000|553, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 782
0x80000000|1085, // match move
0x80000000|622, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 783
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 784
94,338, // "n"
  }
,
{ // state 785
0x80000000|317, // match move
0x80000000|424, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 786
0x80000000|1520, // match move
0x80000000|991, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 787
0x80000000|127, // match move
0x80000000|1394, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 788
0x80000000|567, // match move
0x80000000|818, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 789
113,293, // "g"
  }
,
{ // state 790
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 791
152,1171, // ws
154,978, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 792
0x80000000|1, // match move
0x80000000|896, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 793
0x80000000|669, // match move
0x80000000|454, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 794
0x80000000|170, // match move
0x80000000|899, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 795
2,537, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 796
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+137, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 797
0x80000000|571, // match move
0x80000000|102, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 798
-1, // $$start
-1, // start
276, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+271, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 799
0x80000000|1013, // match move
0x80000000|404, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 800
0x80000000|819, // match move
0x80000000|946, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 801
89,634, // "b"
  }
,
{ // state 802
168,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 803
2,1163, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 804
0x80000000|164, // match move
0x80000000|677, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 805
103,1452, // "d"
  }
,
{ // state 806
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+212, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 807
0x80000000|1, // match move
0x80000000|1529, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 808
91,833, // "l"
94,255, // "n"
97,1157, // "r"
101,1139, // "x"
  }
,
{ // state 809
152,1171, // ws
154,978, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 810
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 811
2,26, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 812
0x80000000|1, // match move
0x80000000|771, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 813
0x80000000|1325, // match move
0x80000000|148, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 814
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+92, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 815
152,1171, // ws
154,978, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 816
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 817
0x80000000|1, // match move
0x80000000|907, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 818
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 819
152,1171, // ws
154,978, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 820
0x80000000|377, // match move
0x80000000|648, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 821
0x80000000|574, // match move
0x80000000|781, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 822
109,638, // "h"
  }
,
{ // state 823
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 824
-1, // $$start
-1, // start
901, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+216, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+216, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+216, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+216, // "u"
1389, // "p"
MIN_REDUCTION+216, // "h"
449, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
763, // "g"
MIN_REDUCTION+216, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+216, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+216, // {"1".."9"}
MIN_REDUCTION+216, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 825
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 826
93,1227, // "a"
  }
,
{ // state 827
92,647, // "e"
  }
,
{ // state 828
168,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 829
92,1429, // "e"
  }
,
{ // state 830
136,305, // "0"
137,305, // {"1".."9"}
141,1207, // digit++
142,777, // digit
165,6, // digit+
  }
,
{ // state 831
0x80000000|1087, // match move
0x80000000|873, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 832
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 833
100,296, // "s"
  }
,
{ // state 834
0x80000000|1026, // match move
0x80000000|443, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 835
168,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 836
0x80000000|870, // match move
0x80000000|1113, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 837
0x80000000|616, // match move
0x80000000|427, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 838
2,1172, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 839
0x80000000|1089, // match move
0x80000000|857, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 840
0x80000000|900, // match move
0x80000000|1222, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 841
0x80000000|1260, // match move
0x80000000|1488, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 842
0x80000000|1095, // match move
0x80000000|1416, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 843
0x80000000|90, // match move
0x80000000|1177, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 844
152,1171, // ws
154,978, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 845
107,328, // "u"
  }
,
{ // state 846
2,932, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 847
2,692, // ws*
161,993, // $$1
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 848
2,1338, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 849
0x80000000|572, // match move
0x80000000|507, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 850
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 851
152,1171, // ws
154,978, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 852
152,1171, // ws
154,978, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 853
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 854
2,640, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 855
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 856
-1, // $$start
-1, // start
1338, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+150, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+150, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+150, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+150, // "u"
1389, // "p"
MIN_REDUCTION+150, // "h"
449, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
763, // "g"
MIN_REDUCTION+150, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+150, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+150, // {"1".."9"}
MIN_REDUCTION+150, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 857
0x80000000|1294, // match move
0x80000000|1070, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 858
0x80000000|643, // match move
0x80000000|1275, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 859
2,250, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 860
-1, // $$start
-1, // start
1127, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+168, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+168, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+168, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+168, // "u"
1389, // "p"
MIN_REDUCTION+168, // "h"
449, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
763, // "g"
MIN_REDUCTION+168, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+168, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+168, // {"1".."9"}
MIN_REDUCTION+168, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 861
0x80000000|300, // match move
0x80000000|952, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 862
2,493, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 863
0x80000000|93, // match move
0x80000000|203, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 864
104,324, // "f"
  }
,
{ // state 865
0x80000000|809, // match move
0x80000000|1306, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 866
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 867
0x80000000|1, // match move
0x80000000|926, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 868
92,718, // "e"
  }
,
{ // state 869
-1, // $$start
-1, // start
368, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+96, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+96, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+96, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+96, // "u"
1389, // "p"
MIN_REDUCTION+96, // "h"
449, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
763, // "g"
MIN_REDUCTION+96, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+96, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+96, // {"1".."9"}
MIN_REDUCTION+96, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 870
2,51, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 871
0x80000000|1126, // match move
0x80000000|834, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 872
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 873
0x80000000|506, // match move
0x80000000|1225, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 874
0x80000000|223, // match move
0x80000000|724, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 875
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+113, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 876
92,1454, // "e"
  }
,
{ // state 877
152,1171, // ws
154,978, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 878
168,MIN_REDUCTION+235, // $NT
  }
,
{ // state 879
0x80000000|176, // match move
0x80000000|259, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 880
89,1303, // "b"
90,1303, // "o"
91,1303, // "l"
92,1303, // "e"
93,1303, // "a"
94,1303, // "n"
97,1303, // "r"
98,1303, // "k"
99,1303, // "c"
100,1303, // "s"
101,1303, // "x"
102,1303, // "t"
103,1303, // "d"
104,1303, // "f"
105,1303, // "i"
106,1303, // "w"
107,1303, // "u"
108,1303, // "p"
109,1303, // "h"
110,1303, // "v"
111,1303, // "y"
112,1303, // "m"
113,1303, // "g"
114,1303, // "z"
115,1303, // "!"
116,1303, // "="
117,1303, // "%"
118,1303, // "&"
119,1303, // "("
120,1303, // ")"
121,1303, // "*"
122,1303, // "/"
123,1303, // "+"
124,1303, // ","
125,1303, // "-"
126,1303, // "."
127,1303, // ":"
128,1303, // ";"
129,1303, // "<"
130,1303, // ">"
131,1303, // "["
132,1303, // "]"
133,1303, // "{"
134,1303, // "}"
135,1303, // "|"
136,1303, // "0"
137,1303, // {"1".."9"}
138,1303, // "X"
143,1303, // "'"
144,883, // printable
145,1303, // '"'
148,1303, // "_"
149,1303, // {"A".."W" "Y".."Z" "j" "q"}
150,1303, // " "
151,1303, // {"#".."$" "?".."@" "\" "^" "`" "~"}
154,8, // eol
157,1354, // commentContent
158,1501, // {10}
159,1317, // {13}
  }
,
{ // state 881
0x80000000|1, // match move
0x80000000|1379, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 882
0x80000000|1305, // match move
0x80000000|236, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 883
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 884
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+248, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 885
0x80000000|1, // match move
0x80000000|836, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 886
-1, // $$start
-1, // start
1310, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+291, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 887
152,1171, // ws
154,978, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 888
2,726, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 889
0x80000000|1422, // match move
0x80000000|407, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 890
148,MIN_REDUCTION+318, // "_"
160,MIN_REDUCTION+318, // idChar**
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 891
-1, // $$start
-1, // start
637, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+192, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+192, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+192, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+192, // "u"
1389, // "p"
MIN_REDUCTION+192, // "h"
449, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
763, // "g"
MIN_REDUCTION+192, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+192, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+192, // {"1".."9"}
MIN_REDUCTION+192, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 892
89,336, // "b"
  }
,
{ // state 893
2,1069, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 894
0x80000000|959, // match move
0x80000000|1231, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 895
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 896
0x80000000|1022, // match move
0x80000000|891, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 897
152,1171, // ws
154,978, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 898
152,1171, // ws
154,978, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 899
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+164, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 900
168,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 901
0x80000000|791, // match move
0x80000000|958, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 902
2,780, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 903
0x80000000|147, // match move
0x80000000|120, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 904
0x80000000|60, // match move
0x80000000|578, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 905
91,339, // "l"
  }
,
{ // state 906
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 907
0x80000000|1028, // match move
0x80000000|1258, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 908
-1, // $$start
-1, // start
1084, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+231, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+231, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+231, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+231, // "u"
1389, // "p"
MIN_REDUCTION+231, // "h"
449, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
763, // "g"
MIN_REDUCTION+231, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+231, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+231, // {"1".."9"}
MIN_REDUCTION+231, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 909
0x80000000|764, // match move
0x80000000|1360, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 910
102,290, // "t"
  }
,
{ // state 911
-1, // $$start
-1, // start
361, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+225, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+225, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+225, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+225, // "u"
1389, // "p"
MIN_REDUCTION+225, // "h"
449, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
763, // "g"
MIN_REDUCTION+225, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+225, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+225, // {"1".."9"}
MIN_REDUCTION+225, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 912
168,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 913
0x80000000|131, // match move
0x80000000|357, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 914
0x80000000|1392, // match move
0x80000000|874, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 915
102,331, // "t"
  }
,
{ // state 916
89,1303, // "b"
90,1303, // "o"
91,1303, // "l"
92,1303, // "e"
93,1303, // "a"
94,1303, // "n"
97,1303, // "r"
98,1303, // "k"
99,1303, // "c"
100,1303, // "s"
101,1303, // "x"
102,1303, // "t"
103,1303, // "d"
104,1303, // "f"
105,1303, // "i"
106,1303, // "w"
107,1303, // "u"
108,1303, // "p"
109,1303, // "h"
110,1303, // "v"
111,1303, // "y"
112,1303, // "m"
113,1303, // "g"
114,1303, // "z"
115,1303, // "!"
116,1303, // "="
117,1303, // "%"
118,1303, // "&"
119,1303, // "("
120,1303, // ")"
121,1303, // "*"
122,1303, // "/"
123,1303, // "+"
124,1303, // ","
125,1303, // "-"
126,1303, // "."
127,1303, // ":"
128,1303, // ";"
129,1303, // "<"
130,1303, // ">"
131,1303, // "["
132,1303, // "]"
133,1303, // "{"
134,1303, // "}"
135,1303, // "|"
136,1303, // "0"
137,1303, // {"1".."9"}
138,1303, // "X"
143,1303, // "'"
144,883, // printable
145,1303, // '"'
148,1303, // "_"
149,1303, // {"A".."W" "Y".."Z" "j" "q"}
150,1303, // " "
151,1303, // {"#".."$" "?".."@" "\" "^" "`" "~"}
154,8, // eol
156,1406, // commentContent*
157,895, // commentContent
158,1501, // {10}
159,1317, // {13}
  }
,
{ // state 917
0x80000000|356, // match move
0x80000000|1395, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 918
168,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 919
168,MIN_REDUCTION+115, // $NT
  }
,
{ // state 920
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 921
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 922
97,708, // "r"
  }
,
{ // state 923
0x80000000|1, // match move
0x80000000|793, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 924
2,1082, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 925
0x80000000|478, // match move
0x80000000|814, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 926
0x80000000|603, // match move
0x80000000|2, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 927
0x80000000|32, // match move
0x80000000|539, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 928
0x80000000|179, // match move
0x80000000|265, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 929
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+227, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 930
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 931
93,44, // "a"
  }
,
{ // state 932
0x80000000|1347, // match move
0x80000000|448, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 933
2,692, // ws*
152,1448, // ws
154,978, // eol
161,993, // $$1
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 934
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+284, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 935
0x80000000|129, // match move
0x80000000|281, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 936
100,403, // "s"
  }
,
{ // state 937
0x80000000|1234, // match move
0x80000000|1308, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 938
0x80000000|1537, // match move
0x80000000|171, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 939
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 940
152,1171, // ws
154,978, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 941
0x80000000|1410, // match move
0x80000000|729, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 942
3,687, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
162,612, // token*
  }
,
{ // state 943
89,100, // "b"
90,100, // "o"
91,100, // "l"
92,100, // "e"
93,100, // "a"
94,100, // "n"
95,473, // idChar
97,100, // "r"
98,100, // "k"
99,100, // "c"
100,100, // "s"
101,100, // "x"
102,100, // "t"
103,100, // "d"
104,100, // "f"
105,100, // "i"
106,100, // "w"
107,100, // "u"
108,100, // "p"
109,100, // "h"
110,100, // "v"
111,100, // "y"
112,100, // "m"
113,100, // "g"
114,100, // "z"
136,1475, // "0"
137,1475, // {"1".."9"}
138,100, // "X"
142,198, // digit
147,650, // letter
148,1151, // "_"
149,100, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 944
-1, // $$start
-1, // start
250, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+177, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+177, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+177, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
801, // "u"
1389, // "p"
MIN_REDUCTION+177, // "h"
449, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
763, // "g"
MIN_REDUCTION+177, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+177, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+177, // {"1".."9"}
MIN_REDUCTION+177, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 945
2,405, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 946
0x80000000|15, // match move
0x80000000|1269, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 947
0x80000000|394, // match move
0x80000000|1370, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 948
0x80000000|240, // match move
0x80000000|13, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 949
92,1150, // "e"
  }
,
{ // state 950
0x80000000|1330, // match move
0x80000000|479, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 951
2,361, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 952
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+176, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 953
152,1171, // ws
154,978, // eol
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 954
0x80000000|1367, // match move
0x80000000|1140, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 955
0x80000000|500, // match move
0x80000000|165, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 956
0x80000000|379, // match move
0x80000000|81, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 957
99,9, // "c"
  }
,
{ // state 958
0x80000000|1266, // match move
0x80000000|858, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 959
152,1171, // ws
154,978, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 960
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 961
2,183, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 962
158,353, // {10}
  }
,
{ // state 963
92,629, // "e"
  }
,
{ // state 964
0x80000000|1224, // match move
0x80000000|199, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 965
0x80000000|1, // match move
0x80000000|1012, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 966
100,47, // "s"
102,626, // "t"
  }
,
{ // state 967
168,MIN_REDUCTION+175, // $NT
  }
,
{ // state 968
2,927, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 969
-1, // $$start
-1, // start
663, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+243, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+243, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+243, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+243, // "u"
1389, // "p"
MIN_REDUCTION+243, // "h"
449, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
763, // "g"
MIN_REDUCTION+243, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+243, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+243, // {"1".."9"}
MIN_REDUCTION+243, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 970
152,1171, // ws
154,978, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 971
0x80000000|392, // match move
0x80000000|306, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 972
0x80000000|1400, // match move
0x80000000|1122, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 973
168,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 974
0x80000000|846, // match move
0x80000000|1145, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 975
168,MIN_REDUCTION+232, // $NT
  }
,
{ // state 976
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+173, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 977
152,1171, // ws
154,978, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 978
168,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 979
0x80000000|1092, // match move
0x80000000|860, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 980
102,21, // "t"
  }
,
{ // state 981
94,38, // "n"
  }
,
{ // state 982
-1, // $$start
-1, // start
760, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+295, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 983
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 984
2,760, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 985
0x80000000|437, // match move
0x80000000|1099, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 986
-1, // $$start
-1, // start
1082, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+165, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+165, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+165, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+165, // "u"
1389, // "p"
MIN_REDUCTION+165, // "h"
449, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
763, // "g"
MIN_REDUCTION+165, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+165, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+165, // {"1".."9"}
MIN_REDUCTION+165, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 987
0x80000000|1458, // match move
0x80000000|39, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 988
0x80000000|1540, // match move
0x80000000|1221, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 989
91,833, // "l"
94,255, // "n"
101,1139, // "x"
  }
,
{ // state 990
-1, // $$start
-1, // start
1163, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+273, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 991
0x80000000|641, // match move
0x80000000|540, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 992
122,27, // "/"
  }
,
{ // state 993
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 994
-1, // $$start
-1, // start
1223, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+267, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 995
4,202, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
89,1397, // "b"
91,1471, // "l"
92,989, // "e"
93,1544, // "a"
94,1499, // "n"
97,949, // "r"
99,486, // "c"
100,1459, // "s"
102,1479, // "t"
103,375, // "d"
104,208, // "f"
105,1411, // "i"
106,37, // "w"
108,1389, // "p"
110,449, // "v"
113,763, // "g"
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 996
0x80000000|685, // match move
0x80000000|1114, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 997
0x80000000|1316, // match move
0x80000000|227, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 998
168,MIN_REDUCTION+118, // $NT
  }
,
{ // state 999
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1000
152,1171, // ws
154,978, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1001
0x80000000|1239, // match move
0x80000000|903, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1002
0x80000000|740, // match move
0x80000000|431, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1003
107,1169, // "u"
  }
,
{ // state 1004
2,786, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1005
0x80000000|1190, // match move
0x80000000|661, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1006
99,64, // "c"
  }
,
{ // state 1007
0x80000000|1, // match move
0x80000000|1125, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1008
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1009
0x80000000|426, // match move
0x80000000|1398, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1010
0x80000000|1535, // match move
0x80000000|615, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1011
97,103, // "r"
  }
,
{ // state 1012
0x80000000|902, // match move
0x80000000|1033, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1013
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1014
152,1171, // ws
154,978, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1015
152,1171, // ws
154,978, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1016
152,1171, // ws
154,978, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1017
2,947, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1018
2,501, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1019
-1, // $$start
-1, // start
617, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+246, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+246, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+246, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+246, // "u"
1389, // "p"
MIN_REDUCTION+246, // "h"
449, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
763, // "g"
MIN_REDUCTION+246, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+246, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+246, // {"1".."9"}
MIN_REDUCTION+246, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1020
94,109, // "n"
  }
,
{ // state 1021
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1022
2,637, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1023
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+224, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1024
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+152, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1025
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1026
168,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1027
168,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1028
2,214, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 1029
2,1223, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1030
152,1171, // ws
154,978, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1031
168,MIN_REDUCTION+130, // $NT
  }
,
{ // state 1032
168,MIN_REDUCTION+318, // $NT
  }
,
{ // state 1033
-1, // $$start
-1, // start
780, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+156, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+156, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+156, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+156, // "u"
1389, // "p"
MIN_REDUCTION+156, // "h"
449, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
763, // "g"
MIN_REDUCTION+156, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+156, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+156, // {"1".."9"}
MIN_REDUCTION+156, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1034
2,831, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1035
152,1171, // ws
154,978, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1036
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+260, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1037
168,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1038
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+188, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1039
0x80000000|144, // match move
0x80000000|321, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1040
97,210, // "r"
  }
,
{ // state 1041
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1042
0x80000000|1097, // match move
0x80000000|496, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1043
-1, // $$start
-1, // start
1176, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+102, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+102, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+102, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+102, // "u"
1389, // "p"
MIN_REDUCTION+102, // "h"
449, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
763, // "g"
MIN_REDUCTION+102, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+102, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+102, // {"1".."9"}
MIN_REDUCTION+102, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1044
0x80000000|1510, // match move
0x80000000|1206, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1045
0x80000000|1, // match move
0x80000000|1077, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1046
0x80000000|29, // match move
0x80000000|1386, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1047
0x80000000|19, // match move
0x80000000|53, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 1048
100,389, // "s"
  }
,
{ // state 1049
0x80000000|221, // match move
0x80000000|12, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1050
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1051
0x80000000|1, // match move
0x80000000|1098, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1052
0x80000000|1302, // match move
0x80000000|1427, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1053
152,1171, // ws
154,978, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1054
0x80000000|1296, // match move
0x80000000|1489, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1055
99,143, // "c"
  }
,
{ // state 1056
152,1171, // ws
154,978, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1057
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1058
0x80000000|1124, // match move
0x80000000|551, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1059
94,826, // "n"
  }
,
{ // state 1060
0x80000000|1388, // match move
0x80000000|1193, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1061
152,1171, // ws
154,978, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1062
99,355, // "c"
  }
,
{ // state 1063
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1064
-1, // $$start
-1, // start
767, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+219, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+219, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+219, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+219, // "u"
1389, // "p"
MIN_REDUCTION+219, // "h"
449, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
763, // "g"
MIN_REDUCTION+219, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+219, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+219, // {"1".."9"}
MIN_REDUCTION+219, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1065
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+245, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1066
89,247, // "b"
90,247, // "o"
91,247, // "l"
92,247, // "e"
93,247, // "a"
94,247, // "n"
97,247, // "r"
98,247, // "k"
99,247, // "c"
100,247, // "s"
101,247, // "x"
102,247, // "t"
103,247, // "d"
104,247, // "f"
105,247, // "i"
106,247, // "w"
107,247, // "u"
108,247, // "p"
109,247, // "h"
110,247, // "v"
111,247, // "y"
112,247, // "m"
113,247, // "g"
114,247, // "z"
115,247, // "!"
116,247, // "="
117,247, // "%"
118,247, // "&"
119,247, // "("
120,247, // ")"
121,247, // "*"
122,247, // "/"
123,247, // "+"
124,247, // ","
125,247, // "-"
126,247, // "."
127,247, // ":"
128,247, // ";"
129,247, // "<"
130,247, // ">"
131,247, // "["
132,247, // "]"
133,247, // "{"
134,247, // "}"
135,247, // "|"
136,247, // "0"
137,247, // {"1".."9"}
138,247, // "X"
143,247, // "'"
144,686, // printable
145,247, // '"'
146,1336, // printable++
148,247, // "_"
149,247, // {"A".."W" "Y".."Z" "j" "q"}
150,247, // " "
151,247, // {"#".."$" "?".."@" "\" "^" "`" "~"}
164,270, // printable+
  }
,
{ // state 1067
0x80000000|1324, // match move
0x80000000|1042, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1068
168,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1069
0x80000000|134, // match move
0x80000000|329, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1070
-1, // $$start
-1, // start
487, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+299, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1071
0x80000000|961, // match move
0x80000000|1192, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1072
152,1171, // ws
154,978, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1073
168,MIN_REDUCTION+247, // $NT
  }
,
{ // state 1074
2,760, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1075
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1076
121,1534, // "*"
122,1219, // "/"
  }
,
{ // state 1077
0x80000000|462, // match move
0x80000000|908, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1078
154,1319, // eol
158,1501, // {10}
159,1317, // {13}
  }
,
{ // state 1079
2,1508, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1080
0x80000000|346, // match move
0x80000000|607, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1081
0x80000000|942, // match move
0x80000000|1526, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1082
0x80000000|11, // match move
0x80000000|266, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1083
0x80000000|536, // match move
0x80000000|1019, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1084
0x80000000|1252, // match move
0x80000000|365, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1085
152,1171, // ws
154,978, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1086
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1087
152,1171, // ws
154,978, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1088
2,758, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 1089
2,487, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1090
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1091
0x80000000|1016, // match move
0x80000000|538, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1092
2,1127, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1093
152,1171, // ws
154,978, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1094
0x80000000|1, // match move
0x80000000|1138, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1095
2,1291, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1096
2,1058, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1097
152,1171, // ws
154,978, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1098
0x80000000|1509, // match move
0x80000000|243, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1099
-1, // $$start
-1, // start
1067, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+314, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1100
0x80000000|282, // match move
0x80000000|1307, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1101
152,1171, // ws
154,978, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1102
0x80000000|1187, // match move
0x80000000|950, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1103
152,1171, // ws
154,978, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1104
0x80000000|1, // match move
0x80000000|1060, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1105
0x80000000|534, // match move
0x80000000|620, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1106
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 1107
152,1171, // ws
154,978, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1108
0x80000000|1, // match move
0x80000000|948, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1109
152,1171, // ws
154,978, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1110
-1, // $$start
-1, // start
1232, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+308, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1111
168,MIN_REDUCTION+166, // $NT
  }
,
{ // state 1112
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+194, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1113
-1, // $$start
-1, // start
51, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+198, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+198, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+198, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+198, // "u"
1389, // "p"
MIN_REDUCTION+198, // "h"
449, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
763, // "g"
MIN_REDUCTION+198, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+198, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+198, // {"1".."9"}
MIN_REDUCTION+198, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1114
0x80000000|1255, // match move
0x80000000|1444, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1115
0x80000000|1466, // match move
0x80000000|1091, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1116
102,1503, // "t"
106,735, // "w"
107,118, // "u"
109,1254, // "h"
111,1020, // "y"
  }
,
{ // state 1117
93,200, // "a"
  }
,
{ // state 1118
105,205, // "i"
  }
,
{ // state 1119
168,MIN_REDUCTION+160, // $NT
  }
,
{ // state 1120
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1121
0x80000000|82, // match move
0x80000000|711, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1122
0x80000000|1093, // match move
0x80000000|843, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1123
0x80000000|720, // match move
0x80000000|151, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1124
152,1171, // ws
154,978, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1125
0x80000000|623, // match move
0x80000000|1146, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1126
152,1171, // ws
154,978, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1127
0x80000000|49, // match move
0x80000000|582, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1128
152,1171, // ws
154,978, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1129
0x80000000|1081, // match move
0x80000000|190, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1130
-1, // $$start
-1, // start
433, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+93, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+93, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+93, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+93, // "u"
1389, // "p"
MIN_REDUCTION+93, // "h"
449, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
763, // "g"
MIN_REDUCTION+93, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+93, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+93, // {"1".."9"}
MIN_REDUCTION+93, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1131
168,MIN_REDUCTION+103, // $NT
  }
,
{ // state 1132
-1, // $$start
-1, // start
758, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+237, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+237, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+237, // "x"
1412, // "t"
375, // "d"
208, // "f"
1411, // "i"
1327, // "w"
118, // "u"
1389, // "p"
1254, // "h"
449, // "v"
1020, // "y"
MIN_REDUCTION+237, // "m"
763, // "g"
MIN_REDUCTION+237, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+237, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1133
92,206, // "e"
  }
,
{ // state 1134
108,727, // "p"
  }
,
{ // state 1135
2,1508, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1136
0x80000000|1, // match move
0x80000000|1083, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1137
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1138
0x80000000|232, // match move
0x80000000|56, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1139
102,499, // "t"
  }
,
{ // state 1140
0x80000000|1491, // match move
0x80000000|745, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1141
168,MIN_REDUCTION+121, // $NT
  }
,
{ // state 1142
0x80000000|1, // match move
0x80000000|1071, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1143
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1144
94,211, // "n"
  }
,
{ // state 1145
0x80000000|585, // match move
0x80000000|23, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1146
-1, // $$start
-1, // start
520, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+174, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+174, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+174, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+174, // "u"
1389, // "p"
MIN_REDUCTION+174, // "h"
449, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
763, // "g"
MIN_REDUCTION+174, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+174, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+174, // {"1".."9"}
MIN_REDUCTION+174, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1147
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1148
0x80000000|1541, // match move
0x80000000|1165, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1149
2,1176, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1150
102,529, // "t"
  }
,
{ // state 1151
0x80000000|823, // match move
0x80000000|930, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1152
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1153
0x80000000|530, // match move
0x80000000|245, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1154
0x80000000|933, // match move
0x80000000|1159, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1155
168,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1156
-1, // $$start
-1, // start
927, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+114, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+114, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+114, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+114, // "u"
1389, // "p"
MIN_REDUCTION+114, // "h"
449, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
763, // "g"
MIN_REDUCTION+114, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+114, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+114, // {"1".."9"}
MIN_REDUCTION+114, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1157
104,523, // "f"
  }
,
{ // state 1158
0x80000000|562, // match move
0x80000000|1435, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1159
0x80000000|173, // match move
0x80000000|1191, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1160
2,914, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1161
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+290, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1162
0x80000000|122, // match move
0x80000000|1463, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1163
0x80000000|645, // match move
0x80000000|341, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1164
0x80000000|218, // match move
0x80000000|302, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1165
-1, // $$start
-1, // start
680, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+99, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+99, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+99, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+99, // "u"
1389, // "p"
MIN_REDUCTION+99, // "h"
449, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
763, // "g"
MIN_REDUCTION+99, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+99, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+99, // {"1".."9"}
MIN_REDUCTION+99, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1166
168,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1167
0x80000000|463, // match move
0x80000000|1385, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1168
0x80000000|877, // match move
0x80000000|1005, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1169
91,555, // "l"
  }
,
{ // state 1170
94,274, // "n"
  }
,
{ // state 1171
168,MIN_REDUCTION+344, // $NT
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1172
0x80000000|451, // match move
0x80000000|508, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1173
0x80000000|1277, // match move
0x80000000|308, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1174
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1175
0x80000000|367, // match move
0x80000000|770, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1176
0x80000000|977, // match move
0x80000000|511, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1177
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+233, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1178
102,63, // "t"
  }
,
{ // state 1179
0x80000000|7, // match move
0x80000000|371, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1180
92,817, // "e"
  }
,
{ // state 1181
0x80000000|488, // match move
0x80000000|842, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1182
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1183
93,980, // "a"
  }
,
{ // state 1184
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+89, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1185
90,1142, // "o"
  }
,
{ // state 1186
2,212, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1187
152,1171, // ws
154,978, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1188
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1189
152,1171, // ws
154,978, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1190
168,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1191
0x80000000|847, // match move
0x80000000|460, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1192
-1, // $$start
-1, // start
183, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+195, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+195, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+195, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+195, // "u"
1389, // "p"
MIN_REDUCTION+195, // "h"
449, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
763, // "g"
MIN_REDUCTION+195, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+195, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+195, // {"1".."9"}
MIN_REDUCTION+195, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1193
-1, // $$start
-1, // start
154, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+90, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+90, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+90, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+90, // "u"
1389, // "p"
MIN_REDUCTION+90, // "h"
449, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
763, // "g"
MIN_REDUCTION+90, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+90, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+90, // {"1".."9"}
MIN_REDUCTION+90, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1194
-1, // $$start
-1, // start
1321, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+257, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1195
168,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1196
0x80000000|217, // match move
0x80000000|417, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1197
152,1171, // ws
154,978, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1198
152,1171, // ws
154,978, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1199
0x80000000|268, // match move
0x80000000|750, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1200
0x80000000|1109, // match move
0x80000000|799, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1201
168,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1202
2,1069, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1203
0x80000000|149, // match move
0x80000000|298, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1204
0x80000000|1, // match move
0x80000000|1460, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1205
0x80000000|1, // match move
0x80000000|1148, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1206
0x80000000|475, // match move
0x80000000|1024, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1207
0x80000000|1516, // match move
0x80000000|128, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1208
100,1133, // "s"
102,957, // "t"
  }
,
{ // state 1209
152,1171, // ws
154,978, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1210
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+218, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1211
2,492, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1212
168,MIN_REDUCTION+106, // $NT
  }
,
{ // state 1213
0x80000000|943, // match move
0x80000000|790, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1214
168,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1215
89,247, // "b"
90,247, // "o"
91,247, // "l"
92,247, // "e"
93,247, // "a"
94,247, // "n"
97,247, // "r"
98,247, // "k"
99,247, // "c"
100,247, // "s"
101,247, // "x"
102,247, // "t"
103,247, // "d"
104,247, // "f"
105,247, // "i"
106,247, // "w"
107,247, // "u"
108,247, // "p"
109,247, // "h"
110,247, // "v"
111,247, // "y"
112,247, // "m"
113,247, // "g"
114,247, // "z"
115,247, // "!"
116,247, // "="
117,247, // "%"
118,247, // "&"
119,247, // "("
120,247, // ")"
121,247, // "*"
122,247, // "/"
123,247, // "+"
124,247, // ","
125,247, // "-"
126,247, // "."
127,247, // ":"
128,247, // ";"
129,247, // "<"
130,247, // ">"
131,247, // "["
132,247, // "]"
133,247, // "{"
134,247, // "}"
135,247, // "|"
136,247, // "0"
137,247, // {"1".."9"}
138,247, // "X"
143,247, // "'"
144,1216, // printable
145,247, // '"'
148,247, // "_"
149,247, // {"A".."W" "Y".."Z" "j" "q"}
150,247, // " "
151,247, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1216
0x80000000|1120, // match move
0x80000000|591, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 1217
90,981, // "o"
  }
,
{ // state 1218
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1219
0x80000000|1536, // match move
0x80000000|688, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 1220
-1, // $$start
-1, // start
758, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+237, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+237, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+237, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+237, // "u"
1389, // "p"
MIN_REDUCTION+237, // "h"
449, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
763, // "g"
MIN_REDUCTION+237, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+237, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+237, // {"1".."9"}
MIN_REDUCTION+237, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1221
0x80000000|1405, // match move
0x80000000|798, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1222
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+128, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1223
0x80000000|418, // match move
0x80000000|935, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1224
152,1171, // ws
154,978, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1225
0x80000000|1467, // match move
0x80000000|581, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1226
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1227
91,996, // "l"
  }
,
{ // state 1228
2,524, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1229
152,1171, // ws
154,978, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1230
168,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1231
0x80000000|112, // match move
0x80000000|674, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1232
0x80000000|1262, // match move
0x80000000|1054, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1233
152,1171, // ws
154,978, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1234
2,537, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1235
0x80000000|482, // match move
0x80000000|679, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1236
0x80000000|1414, // match move
0x80000000|24, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1237
105,1006, // "i"
  }
,
{ // state 1238
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1239
0x80000000|277, // match move
0x80000000|326, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1240
0x80000000|1351, // match move
0x80000000|787, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1241
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1242
0x80000000|513, // match move
0x80000000|313, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1243
168,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1244
0x80000000|1382, // match move
0x80000000|73, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1245
0x80000000|1029, // match move
0x80000000|1506, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1246
152,1171, // ws
154,978, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1247
97,625, // "r"
  }
,
{ // state 1248
152,1171, // ws
154,978, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1249
152,1171, // ws
154,978, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1250
0x80000000|694, // match move
0x80000000|1358, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1251
-1, // $$start
-1, // start
726, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+204, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+204, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+204, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+204, // "u"
1389, // "p"
MIN_REDUCTION+204, // "h"
449, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
763, // "g"
MIN_REDUCTION+204, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+204, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+204, // {"1".."9"}
MIN_REDUCTION+204, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1252
152,1171, // ws
154,978, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 1253
168,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1254
90,372, // "o"
  }
,
{ // state 1255
2,1473, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1256
0x80000000|387, // match move
0x80000000|565, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1257
152,1171, // ws
154,978, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1258
-1, // $$start
-1, // start
214, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+213, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+213, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+213, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+213, // "u"
1389, // "p"
MIN_REDUCTION+213, // "h"
449, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
763, // "g"
MIN_REDUCTION+213, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+213, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+213, // {"1".."9"}
MIN_REDUCTION+213, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1259
-1, // $$start
-1, // start
376, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+108, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+108, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+108, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+108, // "u"
1389, // "p"
MIN_REDUCTION+108, // "h"
449, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
763, // "g"
MIN_REDUCTION+108, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+108, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+108, // {"1".."9"}
MIN_REDUCTION+108, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1260
152,1171, // ws
154,978, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1261
168,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 1262
152,1171, // ws
154,978, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1263
0x80000000|1504, // match move
0x80000000|982, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1264
0x80000000|1, // match move
0x80000000|1409, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1265
0x80000000|421, // match move
0x80000000|732, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1266
152,1171, // ws
154,978, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1267
0x80000000|1, // match move
0x80000000|938, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1268
0x80000000|802, // match move
0x80000000|1495, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1269
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+182, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1270
0x80000000|1274, // match move
0x80000000|307, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1271
2,917, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1272
0x80000000|1230, // match move
0x80000000|225, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1273
168,MIN_REDUCTION+193, // $NT
  }
,
{ // state 1274
152,1171, // ws
154,978, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1275
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+215, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1276
-1, // $$start
-1, // start
1172, // ws*
-1, // $$0
MIN_REDUCTION+138, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+138, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+138, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+138, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+138, // "u"
1389, // "p"
MIN_REDUCTION+138, // "h"
449, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
763, // "g"
MIN_REDUCTION+138, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+138, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+138, // {"1".."9"}
MIN_REDUCTION+138, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1277
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 1278
0x80000000|333, // match move
0x80000000|348, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 1279
168,MIN_REDUCTION+315, // $NT
  }
,
{ // state 1280
0x80000000|1088, // match move
0x80000000|1132, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1281
0x80000000|844, // match move
0x80000000|1044, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1282
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1283
91,733, // "l"
  }
,
{ // state 1284
2,212, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1285
168,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1286
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1287
-1, // $$start
-1, // start
194, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+180, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+180, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+180, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+180, // "u"
1389, // "p"
MIN_REDUCTION+180, // "h"
449, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
763, // "g"
MIN_REDUCTION+180, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+180, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+180, // {"1".."9"}
MIN_REDUCTION+180, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1288
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1289
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+209, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1290
168,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1291
0x80000000|123, // match move
0x80000000|497, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1292
0x80000000|1, // match move
0x80000000|1039, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1293
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+206, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1294
2,487, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1295
0x80000000|483, // match move
0x80000000|813, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1296
152,1171, // ws
154,978, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1297
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1298
0x80000000|59, // match move
0x80000000|1038, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1299
152,1171, // ws
154,978, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1300
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 1301
-1, // $$start
-1, // start
1100, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+240, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+240, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+240, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+240, // "u"
1389, // "p"
MIN_REDUCTION+240, // "h"
449, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
763, // "g"
MIN_REDUCTION+240, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+240, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+240, // {"1".."9"}
MIN_REDUCTION+240, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1302
152,1171, // ws
154,978, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1303
168,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1304
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+107, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1305
2,1067, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1306
0x80000000|1511, // match move
0x80000000|586, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1307
0x80000000|378, // match move
0x80000000|1437, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1308
0x80000000|554, // match move
0x80000000|522, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1309
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1310
0x80000000|345, // match move
0x80000000|1421, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1311
0x80000000|1030, // match move
0x80000000|1493, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1312
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1313
2,1002, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1314
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+313, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1315
-1, // $$start
-1, // start
501, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+129, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+129, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+129, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+129, // "u"
1389, // "p"
MIN_REDUCTION+129, // "h"
449, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
763, // "g"
MIN_REDUCTION+129, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+129, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+129, // {"1".."9"}
MIN_REDUCTION+129, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1316
2,577, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1317
0x80000000|962, // match move
0x80000000|1243, // no-match move
// T-test match for 10:
158,
  }
,
{ // state 1318
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 1319
168,MIN_REDUCTION+322, // $NT
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 1320
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+131, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1321
0x80000000|851, // match move
0x80000000|841, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1322
93,689, // "a"
  }
,
{ // state 1323
92,672, // "e"
  }
,
{ // state 1324
152,1171, // ws
154,978, // eol
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 1325
168,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1326
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+307, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1327
105,1335, // "i"
109,1391, // "h"
  }
,
{ // state 1328
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 1329
168,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1330
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1331
-1, // $$start
-1, // start
-1, // ws*
687, // $$0
438, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
-1, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
-1, // idChar**
-1, // $$1
612, // token*
-1, // printable*
-1, // printable+
6, // digit+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1332
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1333
92,1144, // "e"
  }
,
{ // state 1334
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1335
102,381, // "t"
  }
,
{ // state 1336
145,882, // '"'
  }
,
{ // state 1337
168,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1338
0x80000000|759, // match move
0x80000000|453, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1339
152,1171, // ws
154,978, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1340
0x80000000|1328, // match move
0x80000000|664, // no-match move
0x80000000|360, // NT-test-match state for printable
  }
,
{ // state 1341
0x80000000|1, // match move
0x80000000|979, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1342
168,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1343
0x80000000|584, // match move
0x80000000|886, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1344
152,1171, // ws
154,978, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1345
0x80000000|1035, // match move
0x80000000|1528, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1346
0x80000000|1189, // match move
0x80000000|1356, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1347
152,1171, // ws
154,978, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1348
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1349
-1, // $$start
-1, // start
1069, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
-1, // `=
-1, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
MIN_REDUCTION+285, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+285, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1350
0x80000000|1447, // match move
0x80000000|549, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1351
152,1171, // ws
154,978, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1352
152,1171, // ws
154,978, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1353
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1354
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1355
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1356
0x80000000|65, // match move
0x80000000|181, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1357
168,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1358
-1, // $$start
-1, // start
1492, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+117, // "o"
1471, // "l"
808, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+117, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+117, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+117, // "u"
1389, // "p"
MIN_REDUCTION+117, // "h"
449, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
763, // "g"
MIN_REDUCTION+117, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+117, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+117, // {"1".."9"}
MIN_REDUCTION+117, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1359
152,1171, // ws
154,978, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1360
0x80000000|237, // match move
0x80000000|1298, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1361
99,605, // "c"
  }
,
{ // state 1362
0x80000000|1339, // match move
0x80000000|776, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1363
114,388, // "z"
  }
,
{ // state 1364
152,1171, // ws
154,978, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1365
92,784, // "e"
  }
,
{ // state 1366
102,792, // "t"
  }
,
{ // state 1367
152,1171, // ws
154,978, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1368
0x80000000|1079, // match move
0x80000000|717, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1369
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1370
0x80000000|1299, // match move
0x80000000|971, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1371
0x80000000|1297, // match move
0x80000000|498, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1372
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1373
0x80000000|46, // match move
0x80000000|226, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1374
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1375
0x80000000|1, // match move
0x80000000|1523, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1376
152,1171, // ws
154,978, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1377
168,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1378
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 1379
0x80000000|526, // match move
0x80000000|406, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1380
168,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1381
152,1171, // ws
154,978, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1382
2,1058, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1383
168,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1384
152,1171, // ws
154,978, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1385
0x80000000|1202, // match move
0x80000000|222, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1386
0x80000000|108, // match move
0x80000000|1455, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1387
0x80000000|157, // match move
0x80000000|146, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1388
2,154, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1389
93,1055, // "a"
97,87, // "r"
107,892, // "u"
  }
,
{ // state 1390
0x80000000|1101, // match move
0x80000000|1423, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1391
105,444, // "i"
  }
,
{ // state 1392
152,1171, // ws
154,978, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1393
104,398, // "f"
  }
,
{ // state 1394
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+258, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1395
0x80000000|953, // match move
0x80000000|761, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1396
0x80000000|970, // match move
0x80000000|768, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1397
90,22, // "o"
97,219, // "r"
111,224, // "y"
  }
,
{ // state 1398
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+167, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1399
2,466, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1400
152,1171, // ws
154,978, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1401
152,1171, // ws
154,978, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1402
100,439, // "s"
  }
,
{ // state 1403
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1404
0x80000000|602, // match move
0x80000000|956, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1405
2,276, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1406
0x80000000|1524, // match move
0x80000000|880, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1407
152,1171, // ws
154,978, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1408
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1409
0x80000000|1518, // match move
0x80000000|824, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1410
168,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1411
94,966, // "n"
104,1502, // "f"
112,1134, // "m"
  }
,
{ // state 1412
93,1433, // "a"
97,731, // "r"
109,628, // "h"
  }
,
{ // state 1413
152,1171, // ws
154,978, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1414
152,1171, // ws
154,978, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1415
168,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1416
0x80000000|579, // match move
0x80000000|423, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1417
0x80000000|416, // match move
0x80000000|1256, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1418
0x80000000|1034, // match move
0x80000000|748, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1419
0x80000000|888, // match move
0x80000000|1251, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1420
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1421
0x80000000|440, // match move
0x80000000|340, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1422
168,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1423
0x80000000|754, // match move
0x80000000|69, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1424
152,1171, // ws
154,978, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1425
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+268, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1426
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1427
0x80000000|920, // match move
0x80000000|489, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1428
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1429
90,681, // "o"
  }
,
{ // state 1430
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1431
0x80000000|1017, // match move
0x80000000|683, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1432
2,509, // ws*
150,835, // " "
152,1448, // ws
153,835, // {9}
154,978, // eol
158,1501, // {10}
159,1317, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1433
102,96, // "t"
  }
,
{ // state 1434
-1, // $$start
-1, // start
947, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+287, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1435
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+140, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1436
152,1171, // ws
154,978, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1437
0x80000000|702, // match move
0x80000000|113, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1438
0x80000000|1004, // match move
0x80000000|1521, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1439
168,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1440
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1441
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1442
168,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1443
0x80000000|945, // match move
0x80000000|775, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1444
-1, // $$start
-1, // start
1473, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+186, // "o"
597, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+186, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+186, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+186, // "u"
1389, // "p"
MIN_REDUCTION+186, // "h"
449, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
763, // "g"
MIN_REDUCTION+186, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+186, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+186, // {"1".."9"}
MIN_REDUCTION+186, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1445
0x80000000|739, // match move
0x80000000|76, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1446
168,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1447
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1448
168,MIN_REDUCTION+345, // $NT
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1449
103,867, // "d"
  }
,
{ // state 1450
152,1171, // ws
154,978, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1451
89,1032, // "b"
90,1032, // "o"
91,1032, // "l"
92,1032, // "e"
93,1032, // "a"
94,1032, // "n"
97,1032, // "r"
98,1032, // "k"
99,1032, // "c"
100,1032, // "s"
101,1032, // "x"
102,1032, // "t"
103,1032, // "d"
104,1032, // "f"
105,1032, // "i"
106,1032, // "w"
107,1032, // "u"
108,1032, // "p"
109,1032, // "h"
110,1032, // "v"
111,1032, // "y"
112,1032, // "m"
113,1032, // "g"
114,1032, // "z"
136,197, // "0"
137,197, // {"1".."9"}
138,1032, // "X"
142,349, // digit
147,1279, // letter
148,1155, // "_"
149,1032, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 1452
0x80000000|1, // match move
0x80000000|1538, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1453
0x80000000|1228, // match move
0x80000000|1514, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1454
0x80000000|1, // match move
0x80000000|1419, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1455
0x80000000|828, // match move
0x80000000|249, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1456
0x80000000|1407, // match move
0x80000000|1272, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1457
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+288, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1458
168,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1459
102,1503, // "t"
106,735, // "w"
107,118, // "u"
109,1254, // "h"
111,1020, // "y"
  }
,
{ // state 1460
0x80000000|968, // match move
0x80000000|1156, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1461
2,487, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1462
102,635, // "t"
  }
,
{ // state 1463
-1, // $$start
-1, // start
692, // ws*
-1, // $$0
MIN_REDUCTION+335, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+335, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+335, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+335, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+335, // "u"
1389, // "p"
MIN_REDUCTION+335, // "h"
449, // "v"
MIN_REDUCTION+335, // "y"
MIN_REDUCTION+335, // "m"
763, // "g"
MIN_REDUCTION+335, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+335, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+335, // {"1".."9"}
MIN_REDUCTION+335, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+335, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
1154, // idChar**
1408, // $$1
-1, // token*
-1, // printable*
-1, // printable+
-1, // digit+
1213, // idChar*
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 1464
2,194, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1465
0x80000000|1, // match move
0x80000000|1432, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1466
152,1171, // ws
154,978, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1467
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1468
-1, // $$start
-1, // start
1002, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+147, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+147, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+147, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+147, // "u"
1389, // "p"
MIN_REDUCTION+147, // "h"
449, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
763, // "g"
MIN_REDUCTION+147, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+147, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+147, // {"1".."9"}
MIN_REDUCTION+147, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1469
152,1171, // ws
154,978, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1470
0x80000000|1, // match move
0x80000000|1545, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1471
90,168, // "o"
  }
,
{ // state 1472
92,707, // "e"
  }
,
{ // state 1473
0x80000000|696, // match move
0x80000000|518, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1474
0x80000000|1074, // match move
0x80000000|1263, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1475
0x80000000|359, // match move
0x80000000|1174, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1476
2,276, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1477
168,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1478
168,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1479
97,430, // "r"
109,628, // "h"
  }
,
{ // state 1480
0x80000000|1476, // match move
0x80000000|988, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1481
152,1171, // ws
154,978, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1482
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+179, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1483
168,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1484
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1485
100,570, // "s"
  }
,
{ // state 1486
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1487
2,368, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1488
0x80000000|481, // match move
0x80000000|280, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1489
0x80000000|610, // match move
0x80000000|1326, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1490
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1491
168,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1492
0x80000000|752, // match move
0x80000000|241, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1493
0x80000000|1261, // match move
0x80000000|576, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1494
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 1495
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+143, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1496
152,1171, // ws
154,978, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1497
-1, // $$start
-1, // start
26, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+207, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+207, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+207, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+207, // "u"
1389, // "p"
MIN_REDUCTION+207, // "h"
449, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
763, // "g"
MIN_REDUCTION+207, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+207, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+207, // {"1".."9"}
MIN_REDUCTION+207, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1498
168,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1499
92,464, // "e"
93,512, // "a"
107,1283, // "u"
  }
,
{ // state 1500
93,606, // "a"
  }
,
{ // state 1501
168,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1502
0x80000000|1, // match move
0x80000000|1445, // no-match move
0x80000000|1451, // NT-test-match state for idChar
  }
,
{ // state 1503
93,1433, // "a"
97,1237, // "r"
  }
,
{ // state 1504
2,760, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1505
168,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1506
0x80000000|1507, // match move
0x80000000|994, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1507
2,1223, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1508
0x80000000|1248, // match move
0x80000000|1052, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1509
2,396, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1510
152,1171, // ws
154,978, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1511
168,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1512
94,593, // "n"
  }
,
{ // state 1513
91,510, // "l"
  }
,
{ // state 1514
-1, // $$start
-1, // start
524, // ws*
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+265, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1515
152,1171, // ws
154,978, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1516
2,1232, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1517
97,169, // "r"
  }
,
{ // state 1518
2,901, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1519
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1520
152,1171, // ws
154,978, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1521
0x80000000|474, // match move
0x80000000|115, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 1522
0x80000000|762, // match move
0x80000000|564, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1523
0x80000000|838, // match move
0x80000000|1276, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1524
121,72, // "*"
154,8, // eol
157,1354, // commentContent
  }
,
{ // state 1525
0x80000000|1352, // match move
0x80000000|1168, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1526
3,687, // $$0
4,438, // token
58,595, // `!
59,632, // `!=
60,1188, // `%
61,1063, // `&&
63,1090, // `(
64,1334, // `)
65,588, // `{
66,676, // `}
67,621, // `-
68,10, // `+
69,485, // `=
70,1288, // `==
71,124, // `[
72,583, // `]
73,601, // `||
74,459, // `<
75,95, // `<=
76,747, // `,
77,1226, // `>
78,810, // `>=
79,107, // `.
80,850, // `;
81,667, // `++
82,1312, // `--
83,872, // `/
84,543, // `:
85,366, // ID
86,1008, // INTLIT
87,132, // STRINGLIT
88,1441, // CHARLIT
136,62, // "0"
147,491, // letter
152,1171, // ws
154,978, // eol
162,612, // token*
  }
,
{ // state 1527
2,1067, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1528
0x80000000|639, // match move
0x80000000|1425, // no-match move
0x80000000|456, // NT-test-match state for reserved
  }
,
{ // state 1529
0x80000000|1018, // match move
0x80000000|1315, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1530
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
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
366, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
100, // "b"
100, // "o"
100, // "l"
100, // "e"
100, // "a"
100, // "n"
-1, // idChar
-1, // reserved
100, // "r"
100, // "k"
100, // "c"
100, // "s"
100, // "x"
100, // "t"
100, // "d"
100, // "f"
100, // "i"
100, // "w"
100, // "u"
100, // "p"
100, // "h"
100, // "v"
100, // "y"
100, // "m"
100, // "g"
100, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+304, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
305, // "0"
305, // {"1".."9"}
100, // "X"
974, // intLit2
-1, // `x
1300, // digit++
777, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
491, // letter
-1, // "_"
100, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1171, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1531
152,1171, // ws
154,978, // eol
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1532
2,1223, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1533
-1, // $$start
-1, // start
318, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
853, // `boolean
1137, // `class
855, // `extends
4, // `void
186, // `int
939, // `while
1440, // `if
1241, // `else
1050, // `for
322, // `break
156, // `this
126, // `false
1332, // `true
1309, // `super
36, // `null
80, // `return
600, // `instanceof
1490, // `new
575, // `abstract
1426, // `assert
1143, // `byte
285, // `case
1147, // `catch
983, // `char
278, // `const
1086, // `continue
1075, // `default
1403, // `do
119, // `double
40, // `enum
452, // `final
1348, // `finally
442, // `float
137, // `goto
1486, // `implements
783, // `import
921, // `interface
1025, // `long
1374, // `native
1430, // `package
1353, // `private
401, // `protected
560, // `public
1519, // `short
477, // `static
611, // `strictfp
78, // `switch
244, // `synchronized
1057, // `throw
1182, // `throws
201, // `transient
390, // `try
517, // `volatile
595, // `!
632, // `!=
1188, // `%
1063, // `&&
-1, // `*
1090, // `(
1334, // `)
588, // `{
676, // `}
621, // `-
10, // `+
485, // `=
1288, // `==
124, // `[
583, // `]
601, // `||
459, // `<
95, // `<=
747, // `,
1226, // `>
810, // `>=
107, // `.
850, // `;
667, // `++
1312, // `--
872, // `/
543, // `:
-1, // ID
1008, // INTLIT
132, // STRINGLIT
1441, // CHARLIT
1397, // "b"
MIN_REDUCTION+159, // "o"
1471, // "l"
989, // "e"
1544, // "a"
1499, // "n"
-1, // idChar
-1, // reserved
949, // "r"
MIN_REDUCTION+159, // "k"
486, // "c"
1459, // "s"
MIN_REDUCTION+159, // "x"
1479, // "t"
375, // "d"
208, // "f"
1411, // "i"
37, // "w"
MIN_REDUCTION+159, // "u"
1389, // "p"
MIN_REDUCTION+159, // "h"
449, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
763, // "g"
MIN_REDUCTION+159, // "z"
563, // "!"
1167, // "="
58, // "%"
239, // "&"
97, // "("
701, // ")"
MIN_REDUCTION+159, // "*"
673, // "/"
1047, // "+"
631, // ","
1417, // "-"
182, // "."
1181, // ":"
1153, // ";"
1404, // "<"
589, // ">"
1438, // "["
1543, // "]"
192, // "{"
79, // "}"
665, // "|"
62, // "0"
MIN_REDUCTION+159, // {"1".."9"}
MIN_REDUCTION+159, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
-1, // digit
715, // "'"
-1, // printable
1066, // '"'
-1, // printable++
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."W" "Y".."Z" "j" "q"}
835, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1448, // ws
835, // {9}
978, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1501, // {10}
1317, // {13}
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
{ // state 1534
0x80000000|141, // match move
0x80000000|916, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1535
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1536
89,247, // "b"
90,247, // "o"
91,247, // "l"
92,247, // "e"
93,247, // "a"
94,247, // "n"
97,247, // "r"
98,247, // "k"
99,247, // "c"
100,247, // "s"
101,247, // "x"
102,247, // "t"
103,247, // "d"
104,247, // "f"
105,247, // "i"
106,247, // "w"
107,247, // "u"
108,247, // "p"
109,247, // "h"
110,247, // "v"
111,247, // "y"
112,247, // "m"
113,247, // "g"
114,247, // "z"
115,247, // "!"
116,247, // "="
117,247, // "%"
118,247, // "&"
119,247, // "("
120,247, // ")"
121,247, // "*"
122,247, // "/"
123,247, // "+"
124,247, // ","
125,247, // "-"
126,247, // "."
127,247, // ":"
128,247, // ";"
129,247, // "<"
130,247, // ">"
131,247, // "["
132,247, // "]"
133,247, // "{"
134,247, // "}"
135,247, // "|"
136,247, // "0"
137,247, // {"1".."9"}
138,247, // "X"
143,247, // "'"
144,1340, // printable
145,247, // '"'
148,247, // "_"
149,247, // {"A".."W" "Y".."Z" "j" "q"}
150,247, // " "
151,247, // {"#".."$" "?".."@" "\" "^" "`" "~"}
155,1078, // printable**
163,320, // printable*
  }
,
{ // state 1537
3,687, // $$0
4,438, // token
5,853, // `boolean
6,1137, // `class
7,855, // `extends
8,4, // `void
9,186, // `int
10,939, // `while
11,1440, // `if
12,1241, // `else
13,1050, // `for
14,322, // `break
15,156, // `this
16,126, // `false
17,1332, // `true
18,1309, // `super
19,36, // `null
20,80, // `return
21,600, // `instanceof
22,1490, // `new
23,575, // `abstract
24,1426, // `assert
25,1143, // `byte
26,285, // `case
27,1147, // `catch
28,983, // `char
29,278, // `const
30,1086, // `continue
31,1075, // `default
32,1403, // `do
33,119, // `double
34,40, // `enum
35,452, // `final
36,1348, // `finally
37,442, // `float
38,137, // `goto
39,1486, // `implements
40,783, // `import
41,921, // `interface
42,1025, // `long
43,1374, // `native
44,1430, // `package
45,1353, // `private
46,401, // `protected
47,560, // `public
48,1519, // `short
49,477, // `static
50,611, // `strictfp
51,78, // `switch
52,244, // `synchronized
53,1057, // `throw
54,1182, // `throws
55,201, // `transient
56,390, // `try
57,517, // `volatile
162,612, // token*
  }
,
{ // state 1538
0x80000000|532, // match move
0x80000000|1064, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1539
0x80000000|651, // match move
0x80000000|400, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1540
2,276, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1541
2,680, // ws*
152,1448, // ws
154,978, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1542
152,1171, // ws
154,978, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1543
0x80000000|984, // match move
0x80000000|1474, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1544
89,1402, // "b"
100,343, // "s"
  }
,
{ // state 1545
0x80000000|721, // match move
0x80000000|234, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1546][];
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
"intLit2 ::= !\"0\" digit++", // 309
"digit ::= {\"0\"..\"9\"}", // 310
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 311
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 312
"STRINGLIT ::= # \'\"\' printable++ \'\"\' ws*", // 313
"STRINGLIT ::= # \'\"\' printable++ \'\"\' ws*", // 314
"idChar ::= letter", // 315
"idChar ::= digit", // 316
"idChar ::= \"_\"", // 317
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 318
"printable ::= {\" \"..\"~\"}", // 319
"ws ::= {9 \" \"}", // 320
"ws ::= eol", // 321
"ws ::= \"/\" \"/\" printable** eol", // 322
"ws ::= \"/\" \"/\" printable** eol", // 323
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 324
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 325
"commentContent ::= \"*\" !\"/\"", // 326
"commentContent ::= !\"*\" printable", // 327
"commentContent ::= eol", // 328
"eol ::= {10} registerNewline", // 329
"eol ::= {13} {10} registerNewline", // 330
"eol ::= {13} !10 registerNewline", // 331
"ID ::= !reserved letter idChar** ws*", // 332
"ID ::= !reserved letter idChar** ws*", // 333
"ID ::= !reserved letter idChar** ws*", // 334
"ID ::= !reserved letter idChar** ws*", // 335
"token* ::= token* token", // 336
"token* ::= token* token", // 337
"printable** ::= printable* !printable", // 338
"printable++ ::= printable+ !printable", // 339
"digit++ ::= digit+ !digit", // 340
"commentContent* ::= commentContent* commentContent", // 341
"commentContent* ::= commentContent* commentContent", // 342
"idChar** ::= idChar* !idChar", // 343
"ws* ::= ws* ws", // 344
"ws* ::= ws* ws", // 345
"digit+ ::= digit", // 346
"digit+ ::= digit+ digit", // 347
"printable* ::= printable* printable", // 348
"printable* ::= printable* printable", // 349
"idChar* ::= idChar* idChar", // 350
"idChar* ::= idChar* idChar", // 351
"printable+ ::= printable", // 352
"printable+ ::= printable+ printable", // 353
"", // 354
"", // 355
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
    { // 309: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 310: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 312: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 313: STRINGLIT ::= [#] '"' printable++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
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
    { // 314: STRINGLIT ::= [#] '"' printable++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
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
    { // 315: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 317: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 318: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 319: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 322: ws ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 323: ws ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 324: ws ::= "/" "*" commentContent* "*" "/" @void
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
    { // 325: ws ::= "/" "*" [commentContent*] "*" "/" @void
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
    { // 326: commentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 327: commentContent ::= !"*" printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 328: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 329: eol ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 330: eol ::= {13} {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 331: eol ::= {13} !10 [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 332: ID ::= !reserved letter idChar** $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 333: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 334: ID ::= !reserved letter !idChar [idChar**] $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 335: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 336: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 337: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 338: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: printable++ ::= printable+ !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 340: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 342: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 343: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 344: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 346: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 347: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 348: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 349: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 350: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 352: printable+ ::= printable @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 353: printable+ ::= printable+ printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 355: $$1 ::= ws* @pass
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
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
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
"int zero(int,char)",
"int convertToInt(int,String)",
"int convertHexToInt(int,Character,List<Character>)",
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
