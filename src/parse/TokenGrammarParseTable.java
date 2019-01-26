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
public int getEofSym() { return 165; }
public int getNttSym() { return 166; }
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
"commentContent*",
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
public int numSymbols() { return 167;}
private static final int MIN_REDUCTION = 1517;
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
0x80000000|291, // match move
0x80000000|489, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1171, // match move
0x80000000|854, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 3
0x80000000|912, // match move
0x80000000|1417, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 4
-1, // $$start
-1, // start
249, // ws*
-1, // $$0
MIN_REDUCTION+144, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+144, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+144, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+144, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+144, // "u"
1197, // "p"
MIN_REDUCTION+144, // "h"
903, // "v"
MIN_REDUCTION+144, // "y"
MIN_REDUCTION+144, // "m"
8, // "g"
MIN_REDUCTION+144, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+144, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+144, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+144, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+144, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+203, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
2,1000, // ws*
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 8
90,1212, // "o"
  }
,
{ // state 9
2,401, // ws*
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 10
150,803, // ws
152,455, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 11
0x80000000|1028, // match move
0x80000000|1125, // no-match move
0x80000000|46, // NT-test-match state for digit
  }
,
{ // state 12
2,1319, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 13
2,704, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 15
109,1380, // "h"
  }
,
{ // state 16
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 17
109,152, // "h"
  }
,
{ // state 18
0x80000000|917, // match move
0x80000000|1118, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 19
150,803, // ws
152,455, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 20
0x80000000|354, // match move
0x80000000|1012, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 21
0x80000000|534, // match move
0x80000000|819, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 22
-1, // $$start
-1, // start
1165, // ws*
-1, // $$0
MIN_REDUCTION+228, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+228, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+228, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+228, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+228, // "u"
1197, // "p"
MIN_REDUCTION+228, // "h"
903, // "v"
MIN_REDUCTION+228, // "y"
MIN_REDUCTION+228, // "m"
8, // "g"
MIN_REDUCTION+228, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+228, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+228, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+228, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+228, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 23
0x80000000|1, // match move
0x80000000|1461, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 24
166,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 25
100,423, // "s"
  }
,
{ // state 26
166,MIN_REDUCTION+145, // $NT
  }
,
{ // state 27
2,969, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 28
123,1269, // "+"
  }
,
{ // state 29
2,633, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 30
105,1463, // "i"
  }
,
{ // state 31
150,803, // ws
152,455, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 32
90,332, // "o"
  }
,
{ // state 33
0x80000000|75, // match move
0x80000000|1467, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 34
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+250, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 35
0x80000000|843, // match move
0x80000000|414, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 36
166,MIN_REDUCTION+136, // $NT
  }
,
{ // state 37
0x80000000|953, // match move
0x80000000|726, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 38
0x80000000|1339, // match move
0x80000000|565, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 39
166,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 40
150,803, // ws
152,455, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 41
100,295, // "s"
  }
,
{ // state 42
150,803, // ws
152,455, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 43
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+197, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 44
92,426, // "e"
  }
,
{ // state 45
0x80000000|962, // match move
0x80000000|725, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 46
137,356, // "0"
140,356, // {"1".."9"}
  }
,
{ // state 47
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
-1, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
-1, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+269, // "*"
1334, // "/"
561, // "+"
1258, // ","
MIN_REDUCTION+269, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 48
0x80000000|420, // match move
0x80000000|583, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 49
150,803, // ws
152,455, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 50
0x80000000|52, // match move
0x80000000|188, // no-match move
0x80000000|46, // NT-test-match state for digit
  }
,
{ // state 51
2,1045, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 53
0x80000000|169, // match move
0x80000000|963, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 54
100,557, // "s"
102,1301, // "t"
  }
,
{ // state 55
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 56
0x80000000|1134, // match move
0x80000000|1354, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 57
0x80000000|1427, // match move
0x80000000|158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 58
0x80000000|205, // match move
0x80000000|1123, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 59
109,1203, // "h"
  }
,
{ // state 60
105,1147, // "i"
  }
,
{ // state 61
0x80000000|637, // match move
0x80000000|1237, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 62
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 63
94,670, // "n"
  }
,
{ // state 64
0x80000000|632, // match move
0x80000000|856, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 65
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+116, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 66
0x80000000|1477, // match move
0x80000000|475, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 67
0x80000000|208, // match move
0x80000000|1214, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 68
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 69
0x80000000|1146, // match move
0x80000000|154, // no-match move
0x80000000|703, // NT-test-match state for printable
  }
,
{ // state 70
113,581, // "g"
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 72
0x80000000|763, // match move
0x80000000|186, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 73
2,347, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 74
102,1457, // "t"
  }
,
{ // state 75
2,382, // ws*
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 77
150,803, // ws
152,455, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 78
150,803, // ws
152,455, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 79
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 80
0x80000000|1329, // match move
0x80000000|916, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 81
102,1131, // "t"
  }
,
{ // state 82
150,803, // ws
152,455, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 83
150,803, // ws
152,455, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 84
0x80000000|597, // match move
0x80000000|1254, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 85
0x80000000|296, // match move
0x80000000|323, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 86
2,1093, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 87
0x80000000|269, // match move
0x80000000|625, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 88
0x80000000|598, // match move
0x80000000|1050, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 89
0x80000000|997, // match move
0x80000000|234, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 90
166,MIN_REDUCTION+229, // $NT
  }
,
{ // state 91
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+137, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 92
0x80000000|1157, // match move
0x80000000|166, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 93
-1, // $$start
-1, // start
548, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+271, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 94
0x80000000|1279, // match move
0x80000000|370, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 95
-1, // $$start
-1, // start
560, // ws*
-1, // $$0
MIN_REDUCTION+201, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+201, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+201, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+201, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+201, // "u"
1197, // "p"
MIN_REDUCTION+201, // "h"
903, // "v"
MIN_REDUCTION+201, // "y"
MIN_REDUCTION+201, // "m"
8, // "g"
MIN_REDUCTION+201, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+201, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+201, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+201, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+201, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 96
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+119, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 97
0x80000000|471, // match move
0x80000000|328, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 98
0x80000000|516, // match move
0x80000000|805, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 99
166,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 100
100,338, // "s"
  }
,
{ // state 101
0x80000000|155, // match move
0x80000000|399, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 102
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 103
102,1210, // "t"
  }
,
{ // state 104
150,803, // ws
152,455, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 105
166,MIN_REDUCTION+208, // $NT
  }
,
{ // state 106
0x80000000|587, // match move
0x80000000|209, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 107
89,1261, // "b"
  }
,
{ // state 108
0x80000000|9, // match move
0x80000000|1299, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 109
91,822, // "l"
105,1337, // "i"
  }
,
{ // state 110
0x80000000|139, // match move
0x80000000|1428, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 111
0x80000000|441, // match move
0x80000000|547, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 112
166,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 113
2,789, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 114
0x80000000|284, // match move
0x80000000|1340, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 115
103,1344, // "d"
  }
,
{ // state 116
0x80000000|1087, // match move
0x80000000|91, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 117
0x80000000|477, // match move
0x80000000|684, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 118
-1, // $$start
-1, // start
591, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+251, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|1446, // match move
0x80000000|1504, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 120
4,365, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
  }
,
{ // state 121
-1, // $$start
-1, // start
1049, // ws*
-1, // $$0
MIN_REDUCTION+111, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+111, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+111, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+111, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+111, // "u"
1197, // "p"
MIN_REDUCTION+111, // "h"
903, // "v"
MIN_REDUCTION+111, // "y"
MIN_REDUCTION+111, // "m"
8, // "g"
MIN_REDUCTION+111, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+111, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+111, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+111, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+111, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
152,455, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 123
2,1460, // ws*
150,1331, // ws
152,455, // eol
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+212, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|1361, // match move
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
0x80000000|736, // match move
0x80000000|1154, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 129
2,106, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 130
2,351, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+221, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|1487, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 133
91,189, // "l"
94,498, // "n"
97,773, // "r"
101,741, // "x"
  }
,
{ // state 134
150,803, // ws
152,455, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 135
0x80000000|668, // match move
0x80000000|838, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 136
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 137
92,570, // "e"
  }
,
{ // state 138
166,MIN_REDUCTION+205, // $NT
  }
,
{ // state 139
2,38, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 140
90,340, // "o"
105,825, // "i"
  }
,
{ // state 141
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 143
0x80000000|1068, // match move
0x80000000|254, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 144
166,MIN_REDUCTION+223, // $NT
  }
,
{ // state 145
166,MIN_REDUCTION+233, // $NT
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+92, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 149
150,803, // ws
152,455, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 150
2,987, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 151
0x80000000|1048, // match move
0x80000000|1376, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|92, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 153
0x80000000|1, // match move
0x80000000|333, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 154
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 155
150,803, // ws
152,455, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 156
0x80000000|745, // match move
0x80000000|1292, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 157
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 158
0x80000000|1162, // match move
0x80000000|58, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 159
105,599, // "i"
  }
,
{ // state 160
0x80000000|225, // match move
0x80000000|575, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 161
90,528, // "o"
  }
,
{ // state 162
94,562, // "n"
  }
,
{ // state 163
0x80000000|173, // match move
0x80000000|308, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 164
109,1272, // "h"
  }
,
{ // state 165
0x80000000|904, // match move
0x80000000|368, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 166
-1, // $$start
-1, // start
94, // ws*
-1, // $$0
MIN_REDUCTION+135, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+135, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+135, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+135, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+135, // "u"
1197, // "p"
MIN_REDUCTION+135, // "h"
903, // "v"
MIN_REDUCTION+135, // "y"
MIN_REDUCTION+135, // "m"
8, // "g"
MIN_REDUCTION+135, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+135, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+135, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+135, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+135, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
93,1152, // "a"
  }
,
{ // state 169
150,803, // ws
152,455, // eol
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+158, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
152,455, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 172
-1, // $$start
-1, // start
326, // ws*
-1, // $$0
MIN_REDUCTION+216, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+216, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+216, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+216, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+216, // "u"
1197, // "p"
MIN_REDUCTION+216, // "h"
903, // "v"
MIN_REDUCTION+216, // "y"
MIN_REDUCTION+216, // "m"
8, // "g"
MIN_REDUCTION+216, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+216, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+216, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+216, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+216, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
152,455, // eol
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 176
93,894, // "a"
  }
,
{ // state 177
92,1291, // "e"
  }
,
{ // state 178
99,164, // "c"
  }
,
{ // state 179
166,MIN_REDUCTION+200, // $NT
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+254, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
93,388, // "a"
  }
,
{ // state 182
92,1288, // "e"
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+239, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|640, // match move
0x80000000|273, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 186
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+350, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+350, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
-1, // idChar**
-1, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+350, // $
-1, // $NT
  }
,
{ // state 187
0x80000000|445, // match move
0x80000000|1443, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 188
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 189
100,589, // "s"
  }
,
{ // state 190
100,1169, // "s"
  }
,
{ // state 191
0x80000000|1336, // match move
0x80000000|275, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 192
0x80000000|532, // match move
0x80000000|887, // no-match move
0x80000000|918, // NT-test-match state for reserved
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
166,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 196
0x80000000|263, // match move
0x80000000|697, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 197
0x80000000|1224, // match move
0x80000000|860, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 198
-1, // $$start
865, // start
45, // ws*
526, // $$0
880, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
-1, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
-1, // idChar**
-1, // $$1
1220, // token*
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
0x80000000|243, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 200
2,804, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 201
2,1368, // ws*
150,1331, // ws
152,455, // eol
158,766, // idChar**
159,1246, // $$1
164,871, // idChar*
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 202
0x80000000|129, // match move
0x80000000|1052, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 203
150,803, // ws
152,455, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 205
166,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 207
0x80000000|643, // match move
0x80000000|244, // no-match move
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
0x80000000|324, // match move
0x80000000|888, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 211
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,576, // idChar
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
137,1391, // "0"
139,357, // digit
140,1391, // {"1".."9"}
145,1294, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
  }
,
{ // state 212
0x80000000|951, // match move
0x80000000|1411, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 213
0x80000000|657, // match move
0x80000000|1264, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 214
0x80000000|145, // match move
0x80000000|812, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 215
150,803, // ws
152,455, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 216
150,803, // ws
152,455, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 217
107,654, // "u"
  }
,
{ // state 218
141,1066, // "'"
  }
,
{ // state 219
2,789, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 221
0x80000000|688, // match move
0x80000000|873, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 222
150,803, // ws
152,455, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 223
150,803, // ws
152,455, // eol
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 224
2,382, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 225
2,1061, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 226
2,1368, // ws*
159,479, // $$1
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 227
0x80000000|706, // match move
0x80000000|202, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 228
2,1091, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 230
0x80000000|1159, // match move
0x80000000|1033, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 231
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 232
0x80000000|1307, // match move
0x80000000|279, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 233
150,803, // ws
152,455, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 234
0x80000000|827, // match move
0x80000000|311, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 235
150,803, // ws
152,455, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 236
150,803, // ws
152,455, // eol
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 237
121,981, // "*"
152,14, // eol
154,1244, // commentContent*
155,316, // commentContent
  }
,
{ // state 238
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 239
2,1274, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 240
150,803, // ws
152,455, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 241
98,1435, // "k"
  }
,
{ // state 242
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 243
-1, // $$start
-1, // start
1091, // ws*
-1, // $$0
MIN_REDUCTION+150, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+150, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+150, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+150, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+150, // "u"
1197, // "p"
MIN_REDUCTION+150, // "h"
903, // "v"
MIN_REDUCTION+150, // "y"
MIN_REDUCTION+150, // "m"
8, // "g"
MIN_REDUCTION+150, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+150, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+150, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+150, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+150, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 244
0x80000000|1013, // match move
0x80000000|614, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 245
0x80000000|1282, // match move
0x80000000|976, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 246
2,485, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 247
-1, // $$start
-1, // start
722, // ws*
-1, // $$0
MIN_REDUCTION+168, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+168, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+168, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+168, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+168, // "u"
1197, // "p"
MIN_REDUCTION+168, // "h"
903, // "v"
MIN_REDUCTION+168, // "y"
MIN_REDUCTION+168, // "m"
8, // "g"
MIN_REDUCTION+168, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+168, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+168, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+168, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+168, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 248
2,336, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 249
0x80000000|1489, // match move
0x80000000|53, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 250
0x80000000|342, // match move
0x80000000|823, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 251
1,865, // start
2,45, // ws*
3,526, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
89,1230, // "b"
91,1386, // "l"
92,473, // "e"
93,1514, // "a"
94,1431, // "n"
97,404, // "r"
99,990, // "c"
100,1358, // "s"
102,1397, // "t"
103,743, // "d"
104,376, // "f"
105,1249, // "i"
106,59, // "w"
108,1197, // "p"
110,903, // "v"
113,8, // "g"
160,1220, // token*
165,MIN_REDUCTION+1, // $
  }
,
{ // state 252
0x80000000|595, // match move
0x80000000|408, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 253
2,1005, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 254
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+95, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 255
0x80000000|150, // match move
0x80000000|367, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 256
104,650, // "f"
  }
,
{ // state 257
0x80000000|134, // match move
0x80000000|1038, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 258
150,803, // ws
152,455, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 259
0x80000000|759, // match move
0x80000000|554, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|369, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 261
92,1420, // "e"
  }
,
{ // state 262
-1, // $$start
-1, // start
727, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+96, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+96, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+96, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+96, // "u"
1197, // "p"
MIN_REDUCTION+96, // "h"
903, // "v"
MIN_REDUCTION+96, // "y"
MIN_REDUCTION+96, // "m"
8, // "g"
MIN_REDUCTION+96, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+96, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+96, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+96, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+96, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 263
2,87, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 264
0x80000000|517, // match move
0x80000000|307, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 265
0x80000000|720, // match move
0x80000000|192, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 266
0x80000000|617, // match move
0x80000000|996, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 267
-1, // $$start
-1, // start
347, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+255, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 268
0x80000000|31, // match move
0x80000000|1193, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 269
150,803, // ws
152,455, // eol
MIN_REDUCTION+197, // (default reduction)
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
150,803, // ws
152,455, // eol
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 273
0x80000000|1030, // match move
0x80000000|891, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 274
0x80000000|488, // match move
0x80000000|1459, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 275
-1, // $$start
-1, // start
84, // ws*
-1, // $$0
MIN_REDUCTION+222, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+222, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+222, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+222, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+222, // "u"
1197, // "p"
MIN_REDUCTION+222, // "h"
903, // "v"
MIN_REDUCTION+222, // "y"
MIN_REDUCTION+222, // "m"
8, // "g"
MIN_REDUCTION+222, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+222, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+222, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+222, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+222, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 276
0x80000000|429, // match move
0x80000000|1434, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 277
166,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 278
0x80000000|29, // match move
0x80000000|1494, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 279
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+113, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 280
2,908, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 281
92,1348, // "e"
  }
,
{ // state 282
150,803, // ws
152,455, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 283
166,MIN_REDUCTION+235, // $NT
  }
,
{ // state 284
150,803, // ws
152,455, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 285
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+300, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 286
-1, // $$start
-1, // start
908, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+301, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 287
150,803, // ws
152,455, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 288
0x80000000|304, // match move
0x80000000|504, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 289
94,70, // "n"
  }
,
{ // state 290
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
115,1032, // "!"
116,1032, // "="
117,1032, // "%"
118,1032, // "&"
119,1032, // "("
120,1032, // ")"
121,1032, // "*"
122,1032, // "/"
123,1032, // "+"
124,1032, // ","
125,1032, // "-"
126,1032, // "."
127,1032, // ":"
128,1032, // ";"
129,1032, // "<"
130,1032, // ">"
131,1032, // "["
132,1032, // "]"
133,1032, // "{"
134,1032, // "}"
135,1032, // "|"
137,1032, // "0"
140,1032, // {"1".."9"}
141,1032, // "'"
142,293, // printable
143,1032, // '"'
146,1032, // "_"
147,1032, // {"A".."Z" "j" "q"}
148,1032, // " "
149,1032, // {"#".."$" "?".."@" "\" "^" "`" "~"}
152,14, // eol
155,1124, // commentContent
156,1439, // {10}
157,1054, // {13}
  }
,
{ // state 291
0x80000000|1, // match move
0x80000000|1175, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 292
94,132, // "n"
  }
,
{ // state 293
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 294
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+248, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 295
0x80000000|1, // match move
0x80000000|196, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 296
166,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 297
3,1359, // $$0
4,880, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
62,1298, // `*
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
121,1221, // "*"
136,449, // intLit2
138,1025, // digit++
139,50, // digit
145,998, // letter
150,803, // ws
152,455, // eol
160,1220, // token*
162,11, // digit+
  }
,
{ // state 298
0x80000000|1392, // match move
0x80000000|43, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 299
-1, // $$start
-1, // start
1045, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+291, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 300
2,1368, // ws*
150,1331, // ws
152,455, // eol
159,479, // $$1
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 301
166,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 302
0x80000000|280, // match move
0x80000000|627, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 303
150,803, // ws
152,455, // eol
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 304
150,803, // ws
152,455, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 305
166,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 306
2,1437, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 307
0x80000000|1276, // match move
0x80000000|816, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 308
146,MIN_REDUCTION+313, // "_"
158,MIN_REDUCTION+313, // idChar**
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 309
166,MIN_REDUCTION+181, // $NT
  }
,
{ // state 310
2,288, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 311
0x80000000|1228, // match move
0x80000000|693, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 312
-1, // $$start
-1, // start
1271, // ws*
-1, // $$0
MIN_REDUCTION+192, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+192, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+192, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+192, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+192, // "u"
1197, // "p"
MIN_REDUCTION+192, // "h"
903, // "v"
MIN_REDUCTION+192, // "y"
MIN_REDUCTION+192, // "m"
8, // "g"
MIN_REDUCTION+192, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+192, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+192, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+192, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+192, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 313
89,667, // "b"
  }
,
{ // state 314
2,613, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 315
0x80000000|419, // match move
0x80000000|902, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 316
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 317
0x80000000|305, // match move
0x80000000|1060, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 318
0x80000000|527, // match move
0x80000000|312, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 319
150,803, // ws
152,455, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 320
0x80000000|113, // match move
0x80000000|344, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 321
150,803, // ws
152,455, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 322
0x80000000|616, // match move
0x80000000|114, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 323
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+164, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 324
166,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 325
150,803, // ws
152,455, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 326
0x80000000|77, // match move
0x80000000|417, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 327
2,57, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 328
0x80000000|869, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 329
0x80000000|251, // match move
0x80000000|198, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 330
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 331
0x80000000|724, // match move
0x80000000|210, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 332
91,671, // "l"
  }
,
{ // state 333
0x80000000|535, // match move
0x80000000|947, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 334
-1, // $$start
-1, // start
636, // ws*
-1, // $$0
MIN_REDUCTION+231, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+231, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+231, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+231, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+231, // "u"
1197, // "p"
MIN_REDUCTION+231, // "h"
903, // "v"
MIN_REDUCTION+231, // "y"
MIN_REDUCTION+231, // "m"
8, // "g"
MIN_REDUCTION+231, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+231, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+231, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+231, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+231, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 335
150,803, // ws
152,455, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 336
0x80000000|10, // match move
0x80000000|1137, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 337
0x80000000|400, // match move
0x80000000|1077, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 338
0x80000000|1, // match move
0x80000000|259, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 339
0x80000000|86, // match move
0x80000000|389, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 340
102,578, // "t"
  }
,
{ // state 341
-1, // $$start
-1, // start
707, // ws*
-1, // $$0
MIN_REDUCTION+225, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+225, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+225, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+225, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+225, // "u"
1197, // "p"
MIN_REDUCTION+225, // "h"
903, // "v"
MIN_REDUCTION+225, // "y"
MIN_REDUCTION+225, // "m"
8, // "g"
MIN_REDUCTION+225, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+225, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+225, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+225, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+225, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 342
166,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 344
0x80000000|219, // match move
0x80000000|700, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 345
0x80000000|12, // match move
0x80000000|436, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 346
0x80000000|954, // match move
0x80000000|197, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 347
0x80000000|1205, // match move
0x80000000|276, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 348
102,660, // "t"
  }
,
{ // state 349
166,MIN_REDUCTION+187, // $NT
  }
,
{ // state 350
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
115,1032, // "!"
116,1032, // "="
117,1032, // "%"
118,1032, // "&"
119,1032, // "("
120,1032, // ")"
121,1032, // "*"
122,1032, // "/"
123,1032, // "+"
124,1032, // ","
125,1032, // "-"
126,1032, // "."
127,1032, // ":"
128,1032, // ";"
129,1032, // "<"
130,1032, // ">"
131,1032, // "["
132,1032, // "]"
133,1032, // "{"
134,1032, // "}"
135,1032, // "|"
137,1032, // "0"
140,1032, // {"1".."9"}
141,1032, // "'"
142,293, // printable
143,1032, // '"'
146,1032, // "_"
147,1032, // {"A".."Z" "j" "q"}
148,1032, // " "
149,1032, // {"#".."$" "?".."@" "\" "^" "`" "~"}
152,14, // eol
154,1244, // commentContent*
155,316, // commentContent
156,1439, // {10}
157,1054, // {13}
  }
,
{ // state 351
0x80000000|699, // match move
0x80000000|1226, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 352
166,MIN_REDUCTION+163, // $NT
  }
,
{ // state 353
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 354
166,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 355
166,MIN_REDUCTION+115, // $NT
  }
,
{ // state 356
166,MIN_REDUCTION+305, // $NT
  }
,
{ // state 357
0x80000000|1056, // match move
0x80000000|1116, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 358
0x80000000|872, // match move
0x80000000|452, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 359
98,142, // "k"
  }
,
{ // state 360
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 362
97,1400, // "r"
  }
,
{ // state 363
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 364
0x80000000|1, // match move
0x80000000|80, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 365
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 366
2,634, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 367
-1, // $$start
-1, // start
987, // ws*
-1, // $$0
MIN_REDUCTION+153, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+153, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+153, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+153, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+153, // "u"
1197, // "p"
MIN_REDUCTION+153, // "h"
903, // "v"
MIN_REDUCTION+153, // "y"
MIN_REDUCTION+153, // "m"
8, // "g"
MIN_REDUCTION+153, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+153, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+153, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+153, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+153, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 368
0x80000000|972, // match move
0x80000000|146, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 369
0x80000000|1211, // match move
0x80000000|4, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 370
0x80000000|235, // match move
0x80000000|569, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 371
110,1500, // "v"
  }
,
{ // state 372
0x80000000|49, // match move
0x80000000|1101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 373
0x80000000|310, // match move
0x80000000|511, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 375
102,1293, // "t"
  }
,
{ // state 376
90,552, // "o"
91,443, // "l"
93,1173, // "a"
105,594, // "i"
  }
,
{ // state 377
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+227, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 378
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 379
150,803, // ws
152,455, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 380
93,74, // "a"
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 382
0x80000000|1107, // match move
0x80000000|901, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 383
-1, // $$start
-1, // start
106, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+309, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 384
2,1368, // ws*
150,1331, // ws
152,455, // eol
159,479, // $$1
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 385
102,41, // "t"
  }
,
{ // state 386
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+284, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 387
0x80000000|216, // match move
0x80000000|564, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 388
100,802, // "s"
  }
,
{ // state 389
0x80000000|905, // match move
0x80000000|1042, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 390
0x80000000|1498, // match move
0x80000000|297, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 391
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 392
0x80000000|1236, // match move
0x80000000|61, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 393
150,803, // ws
152,455, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 394
0x80000000|1248, // match move
0x80000000|1444, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 395
3,1359, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
160,1220, // token*
  }
,
{ // state 396
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,957, // idChar
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
137,1391, // "0"
139,357, // digit
140,1391, // {"1".."9"}
145,1294, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
  }
,
{ // state 397
-1, // $$start
-1, // start
485, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+177, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+177, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+177, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
107, // "u"
1197, // "p"
MIN_REDUCTION+177, // "h"
903, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
8, // "g"
MIN_REDUCTION+177, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+177, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+177, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+177, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 398
2,806, // ws*
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 399
0x80000000|24, // match move
0x80000000|967, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 400
3,1359, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
89,1230, // "b"
91,1386, // "l"
92,473, // "e"
93,1514, // "a"
94,1431, // "n"
97,404, // "r"
99,990, // "c"
100,1358, // "s"
102,1397, // "t"
103,743, // "d"
104,376, // "f"
105,1249, // "i"
106,59, // "w"
108,1197, // "p"
110,903, // "v"
113,8, // "g"
160,1220, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 401
0x80000000|780, // match move
0x80000000|1158, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 402
0x80000000|1122, // match move
0x80000000|156, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 403
0x80000000|462, // match move
0x80000000|22, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 404
92,761, // "e"
  }
,
{ // state 405
0x80000000|1076, // match move
0x80000000|975, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 406
2,707, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 407
0x80000000|1110, // match move
0x80000000|101, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 408
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+176, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 409
150,803, // ws
152,455, // eol
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 410
150,803, // ws
152,455, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 411
166,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 412
0x80000000|1153, // match move
0x80000000|742, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 413
92,708, // "e"
  }
,
{ // state 414
0x80000000|1021, // match move
0x80000000|285, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 415
0x80000000|749, // match move
0x80000000|128, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 416
99,15, // "c"
  }
,
{ // state 417
0x80000000|961, // match move
0x80000000|245, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 418
0x80000000|782, // match move
0x80000000|1135, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 419
150,803, // ws
152,455, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 421
2,322, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 422
156,692, // {10}
  }
,
{ // state 423
92,1256, // "e"
  }
,
{ // state 424
150,803, // ws
152,455, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 425
0x80000000|890, // match move
0x80000000|358, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|515, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 427
0x80000000|314, // match move
0x80000000|927, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 428
100,81, // "s"
102,1252, // "t"
  }
,
{ // state 429
150,803, // ws
152,455, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 430
166,MIN_REDUCTION+175, // $NT
  }
,
{ // state 431
102,44, // "t"
  }
,
{ // state 432
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+98, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 433
0x80000000|1493, // match move
0x80000000|966, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 434
2,372, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 435
-1, // $$start
-1, // start
1167, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
-1, // `=
-1, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
MIN_REDUCTION+289, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+289, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 436
-1, // $$start
-1, // start
1319, // ws*
-1, // $$0
MIN_REDUCTION+243, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+243, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+243, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+243, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+243, // "u"
1197, // "p"
MIN_REDUCTION+243, // "h"
903, // "v"
MIN_REDUCTION+243, // "y"
MIN_REDUCTION+243, // "m"
8, // "g"
MIN_REDUCTION+243, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+243, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+243, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+243, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+243, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 437
150,803, // ws
152,455, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 438
166,MIN_REDUCTION+199, // $NT
  }
,
{ // state 439
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 440
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+230, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 442
2,560, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 443
90,765, // "o"
  }
,
{ // state 444
-1, // $$start
-1, // start
1482, // ws*
-1, // $$0
MIN_REDUCTION+162, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+162, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+162, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+162, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+162, // "u"
1197, // "p"
MIN_REDUCTION+162, // "h"
903, // "v"
MIN_REDUCTION+162, // "y"
MIN_REDUCTION+162, // "m"
8, // "g"
MIN_REDUCTION+162, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+162, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+162, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+162, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+162, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
,
{ // state 445
2,66, // ws*
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 446
0x80000000|777, // match move
0x80000000|605, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 447
0x80000000|1235, // match move
0x80000000|715, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 448
166,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 449
0x80000000|224, // match move
0x80000000|753, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 450
166,MIN_REDUCTION+232, // $NT
  }
,
{ // state 451
150,803, // ws
152,455, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 452
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+173, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 453
-1, // $$start
-1, // start
1106, // ws*
-1, // $$0
MIN_REDUCTION+132, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+132, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+132, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+132, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+132, // "u"
1197, // "p"
MIN_REDUCTION+132, // "h"
903, // "v"
MIN_REDUCTION+132, // "y"
MIN_REDUCTION+132, // "m"
8, // "g"
MIN_REDUCTION+132, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+132, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+132, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+132, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+132, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 454
150,803, // ws
152,455, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 455
166,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 456
0x80000000|647, // match move
0x80000000|247, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 457
102,30, // "t"
  }
,
{ // state 458
94,60, // "n"
  }
,
{ // state 459
118,1055, // "&"
  }
,
{ // state 460
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+295, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 461
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 462
2,1165, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 463
2,2, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 464
0x80000000|319, // match move
0x80000000|470, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 465
0x80000000|713, // match move
0x80000000|948, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 466
-1, // $$start
-1, // start
784, // ws*
-1, // $$0
MIN_REDUCTION+141, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+141, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+141, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+141, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+141, // "u"
1197, // "p"
MIN_REDUCTION+141, // "h"
903, // "v"
MIN_REDUCTION+141, // "y"
MIN_REDUCTION+141, // "m"
8, // "g"
MIN_REDUCTION+141, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+141, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+141, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+141, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+141, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 467
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 468
0x80000000|1233, // match move
0x80000000|266, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 469
-1, // $$start
-1, // start
634, // ws*
-1, // $$0
MIN_REDUCTION+165, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+165, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+165, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+165, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+165, // "u"
1197, // "p"
MIN_REDUCTION+165, // "h"
903, // "v"
MIN_REDUCTION+165, // "y"
MIN_REDUCTION+165, // "m"
8, // "g"
MIN_REDUCTION+165, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+165, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+165, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+165, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+165, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 470
0x80000000|1353, // match move
0x80000000|65, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 471
2,1000, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 472
0x80000000|1507, // match move
0x80000000|885, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 473
91,189, // "l"
94,498, // "n"
101,741, // "x"
  }
,
{ // state 474
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+273, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 475
0x80000000|1278, // match move
0x80000000|1102, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 476
0x80000000|952, // match move
0x80000000|1174, // no-match move
0x80000000|703, // NT-test-match state for printable
  }
,
{ // state 477
122,39, // "/"
  }
,
{ // state 478
150,803, // ws
152,455, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 479
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 480
-1, // $$start
-1, // start
889, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+267, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 481
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+200, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 482
4,365, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
89,1230, // "b"
91,1386, // "l"
92,473, // "e"
93,1514, // "a"
94,1431, // "n"
97,404, // "r"
99,990, // "c"
100,1358, // "s"
102,1397, // "t"
103,743, // "d"
104,376, // "f"
105,1249, // "i"
106,59, // "w"
108,1197, // "p"
110,903, // "v"
113,8, // "g"
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 483
0x80000000|1357, // match move
0x80000000|698, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 484
0x80000000|1053, // match move
0x80000000|435, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 485
0x80000000|590, // match move
0x80000000|1404, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 486
166,MIN_REDUCTION+118, // $NT
  }
,
{ // state 487
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 488
150,803, // ws
152,455, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 489
0x80000000|914, // match move
0x80000000|329, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 490
0x80000000|1466, // match move
0x80000000|868, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 491
166,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 492
150,803, // ws
152,455, // eol
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 493
2,908, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 494
107,796, // "u"
  }
,
{ // state 495
2,66, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 496
0x80000000|833, // match move
0x80000000|1317, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 497
99,103, // "c"
  }
,
{ // state 498
107,895, // "u"
  }
,
{ // state 499
0x80000000|1, // match move
0x80000000|719, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 500
150,803, // ws
152,455, // eol
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 502
2,613, // ws*
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 503
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 504
0x80000000|1132, // match move
0x80000000|790, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 505
0x80000000|877, // match move
0x80000000|453, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 506
0x80000000|859, // match move
0x80000000|1232, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 507
0x80000000|849, // match move
0x80000000|1488, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 508
150,803, // ws
152,455, // eol
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 509
150,803, // ws
152,455, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 510
-1, // $$start
-1, // start
969, // ws*
-1, // $$0
MIN_REDUCTION+123, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+123, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+123, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+123, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+123, // "u"
1197, // "p"
MIN_REDUCTION+123, // "h"
903, // "v"
MIN_REDUCTION+123, // "y"
MIN_REDUCTION+123, // "m"
8, // "g"
MIN_REDUCTION+123, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+123, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+123, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+123, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+123, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 511
-1, // $$start
-1, // start
288, // ws*
-1, // $$0
MIN_REDUCTION+126, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+126, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+126, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+126, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+126, // "u"
1197, // "p"
MIN_REDUCTION+126, // "h"
903, // "v"
MIN_REDUCTION+126, // "y"
MIN_REDUCTION+126, // "m"
8, // "g"
MIN_REDUCTION+126, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+126, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+126, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+126, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+126, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 512
0x80000000|1496, // match move
0x80000000|1223, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 513
0x80000000|674, // match move
0x80000000|85, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 514
97,168, // "r"
  }
,
{ // state 515
0x80000000|327, // match move
0x80000000|544, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 516
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 517
150,803, // ws
152,455, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 518
150,803, // ws
152,455, // eol
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 519
150,803, // ws
152,455, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 520
2,401, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 521
2,1023, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 522
-1, // $$start
-1, // start
1227, // ws*
-1, // $$0
MIN_REDUCTION+246, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+246, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+246, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+246, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+246, // "u"
1197, // "p"
MIN_REDUCTION+246, // "h"
903, // "v"
MIN_REDUCTION+246, // "y"
MIN_REDUCTION+246, // "m"
8, // "g"
MIN_REDUCTION+246, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+246, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+246, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+246, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+246, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 523
166,MIN_REDUCTION+148, // $NT
  }
,
{ // state 524
94,178, // "n"
  }
,
{ // state 525
150,803, // ws
152,455, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 527
2,1271, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 528
106,1139, // "w"
  }
,
{ // state 529
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+224, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 530
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+152, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 531
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 532
166,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 533
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+266, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 534
166,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 535
2,402, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 536
-1, // $$start
-1, // start
88, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+210, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+210, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+210, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+210, // "u"
1197, // "p"
MIN_REDUCTION+210, // "h"
903, // "v"
MIN_REDUCTION+210, // "y"
MIN_REDUCTION+210, // "m"
8, // "g"
MIN_REDUCTION+210, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+210, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+210, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+210, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+210, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 537
2,889, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 538
92,71, // "e"
  }
,
{ // state 539
150,803, // ws
152,455, // eol
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 540
166,MIN_REDUCTION+130, // $NT
  }
,
{ // state 541
166,MIN_REDUCTION+313, // $NT
  }
,
{ // state 542
99,182, // "c"
  }
,
{ // state 543
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+122, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 544
-1, // $$start
-1, // start
57, // ws*
-1, // $$0
MIN_REDUCTION+156, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+156, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+156, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+156, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+156, // "u"
1197, // "p"
MIN_REDUCTION+156, // "h"
903, // "v"
MIN_REDUCTION+156, // "y"
MIN_REDUCTION+156, // "m"
8, // "g"
MIN_REDUCTION+156, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+156, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+156, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+156, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+156, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 545
2,185, // ws*
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 546
150,803, // ws
152,455, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 547
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+260, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 548
0x80000000|1206, // match move
0x80000000|845, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 549
166,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 550
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+188, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 551
0x80000000|248, // match move
0x80000000|644, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 552
97,381, // "r"
  }
,
{ // state 553
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 554
-1, // $$start
-1, // start
811, // ws*
-1, // $$0
MIN_REDUCTION+102, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+102, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+102, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+102, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+102, // "u"
1197, // "p"
MIN_REDUCTION+102, // "h"
903, // "v"
MIN_REDUCTION+102, // "y"
MIN_REDUCTION+102, // "m"
8, // "g"
MIN_REDUCTION+102, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+102, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+102, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+102, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+102, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 555
1,865, // start
2,45, // ws*
3,526, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
160,1220, // token*
  }
,
{ // state 556
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 557
102,1096, // "t"
  }
,
{ // state 558
0x80000000|1454, // match move
0x80000000|861, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 559
0x80000000|1, // match move
0x80000000|624, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 560
0x80000000|42, // match move
0x80000000|1192, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 561
0x80000000|28, // match move
0x80000000|89, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 562
100,774, // "s"
  }
,
{ // state 563
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+256, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 564
0x80000000|503, // match move
0x80000000|533, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 565
0x80000000|424, // match move
0x80000000|20, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 566
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 567
150,803, // ws
152,455, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 568
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+294, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 569
0x80000000|549, // match move
0x80000000|653, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 570
0x80000000|1, // match move
0x80000000|664, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 571
0x80000000|1031, // match move
0x80000000|1283, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 572
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 573
93,362, // "a"
  }
,
{ // state 574
2,347, // ws*
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 575
0x80000000|678, // match move
0x80000000|135, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 576
0x80000000|343, // match move
0x80000000|983, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 577
0x80000000|1, // match move
0x80000000|505, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 578
92,1009, // "e"
  }
,
{ // state 579
0x80000000|795, // match move
0x80000000|529, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 580
166,MIN_REDUCTION+214, // $NT
  }
,
{ // state 581
0x80000000|1, // match move
0x80000000|110, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 582
150,803, // ws
152,455, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 583
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+264, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 584
0x80000000|82, // match move
0x80000000|1160, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 585
99,241, // "c"
  }
,
{ // state 586
150,803, // ws
152,455, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 587
150,803, // ws
152,455, // eol
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 589
92,858, // "e"
  }
,
{ // state 590
150,803, // ws
152,455, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 591
0x80000000|718, // match move
0x80000000|1120, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 592
0x80000000|439, // match move
0x80000000|568, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 593
150,803, // ws
152,455, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 594
94,176, // "n"
  }
,
{ // state 595
166,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 596
0x80000000|1196, // match move
0x80000000|836, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 597
150,803, // ws
152,455, // eol
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 598
150,803, // ws
152,455, // eol
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 599
99,695, // "c"
  }
,
{ // state 600
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+125, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 601
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 602
166,MIN_REDUCTION+241, // $NT
  }
,
{ // state 603
0x80000000|406, // match move
0x80000000|341, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 604
0x80000000|141, // match move
0x80000000|553, // no-match move
0x80000000|46, // NT-test-match state for digit
  }
,
{ // state 605
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+286, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
18, // ws*
-1, // $$0
MIN_REDUCTION+219, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+219, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+219, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+219, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+219, // "u"
1197, // "p"
MIN_REDUCTION+219, // "h"
903, // "v"
MIN_REDUCTION+219, // "y"
MIN_REDUCTION+219, // "m"
8, // "g"
MIN_REDUCTION+219, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+219, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+219, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+219, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+219, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
,
{ // state 607
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+245, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 608
0x80000000|1191, // match move
0x80000000|768, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 609
166,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 611
166,MIN_REDUCTION+94, // $NT
  }
,
{ // state 612
0x80000000|1, // match move
0x80000000|814, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 613
0x80000000|222, // match move
0x80000000|655, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 614
-1, // $$start
-1, // start
992, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+299, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 615
0x80000000|421, // match move
0x80000000|835, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 616
150,803, // ws
152,455, // eol
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 617
2,942, // ws*
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 618
166,MIN_REDUCTION+247, // $NT
  }
,
{ // state 619
2,2, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 621
166,MIN_REDUCTION+217, // $NT
  }
,
{ // state 622
4,365, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
62,1298, // `*
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
121,1221, // "*"
136,449, // intLit2
138,1025, // digit++
139,50, // digit
145,998, // letter
162,11, // digit+
  }
,
{ // state 623
121,1495, // "*"
122,879, // "/"
  }
,
{ // state 624
0x80000000|928, // match move
0x80000000|334, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 625
0x80000000|492, // match move
0x80000000|298, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 626
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 627
0x80000000|943, // match move
0x80000000|286, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 628
152,1057, // eol
156,1439, // {10}
157,1054, // {13}
  }
,
{ // state 629
2,1452, // ws*
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 630
0x80000000|682, // match move
0x80000000|1216, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 631
0x80000000|395, // match move
0x80000000|1484, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 632
2,185, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 633
0x80000000|1185, // match move
0x80000000|844, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 634
0x80000000|19, // match move
0x80000000|513, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 635
0x80000000|1092, // match move
0x80000000|522, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 636
0x80000000|939, // match move
0x80000000|716, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 637
150,803, // ws
152,455, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 638
0x80000000|393, // match move
0x80000000|1114, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 639
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 640
150,803, // ws
152,455, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 641
0x80000000|1436, // match move
0x80000000|1365, // no-match move
0x80000000|703, // NT-test-match state for printable
  }
,
{ // state 642
2,1512, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 643
2,992, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 644
-1, // $$start
-1, // start
336, // ws*
-1, // $$0
MIN_REDUCTION+189, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+189, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+189, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+189, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+189, // "u"
1197, // "p"
MIN_REDUCTION+189, // "h"
903, // "v"
MIN_REDUCTION+189, // "y"
MIN_REDUCTION+189, // "m"
8, // "g"
MIN_REDUCTION+189, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+189, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+189, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+189, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+189, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 645
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 646
0x80000000|519, // match move
0x80000000|1097, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 647
2,722, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 649
2,1071, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 650
93,494, // "a"
  }
,
{ // state 651
150,803, // ws
152,455, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 652
1,865, // start
2,45, // ws*
3,526, // $$0
4,880, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
83,271, // `/
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
145,998, // letter
150,1331, // ws
152,455, // eol
160,1220, // token*
  }
,
{ // state 653
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+134, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 654
92,364, // "e"
  }
,
{ // state 655
0x80000000|864, // match move
0x80000000|730, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|740, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 657
2,1010, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 658
2,591, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 659
2,185, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 660
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 661
166,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 662
122,899, // "/"
  }
,
{ // state 663
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+146, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 664
0x80000000|1453, // match move
0x80000000|466, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 665
166,MIN_REDUCTION+151, // $NT
  }
,
{ // state 666
0x80000000|567, // match move
0x80000000|1040, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 667
91,1073, // "l"
  }
,
{ // state 668
2,1061, // ws*
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 669
150,803, // ws
152,455, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 670
102,23, // "t"
  }
,
{ // state 671
92,1063, // "e"
  }
,
{ // state 672
0x80000000|828, // match move
0x80000000|405, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 673
0x80000000|1405, // match move
0x80000000|785, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 674
150,803, // ws
152,455, // eol
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 675
0x80000000|586, // match move
0x80000000|1356, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 676
0x80000000|1, // match move
0x80000000|596, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 677
0x80000000|1089, // match move
0x80000000|1231, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 678
2,1061, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 679
100,1064, // "s"
  }
,
{ // state 680
2,806, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 681
150,803, // ws
152,455, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 682
150,803, // ws
152,455, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 683
166,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 684
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 685
166,MIN_REDUCTION+311, // $NT
  }
,
{ // state 686
99,281, // "c"
  }
,
{ // state 687
2,1274, // ws*
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 688
150,803, // ws
152,455, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 689
0x80000000|1, // match move
0x80000000|403, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 690
2,401, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 691
150,803, // ws
152,455, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 692
166,MIN_REDUCTION+325, // $NT
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 693
-1, // $$start
-1, // start
392, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
-1, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
-1, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+263, // "*"
1334, // "/"
MIN_REDUCTION+263, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 694
166,MIN_REDUCTION+166, // $NT
  }
,
{ // state 695
0x80000000|1, // match move
0x80000000|603, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 696
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+194, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 697
-1, // $$start
-1, // start
87, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+198, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+198, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+198, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+198, // "u"
1197, // "p"
MIN_REDUCTION+198, // "h"
903, // "v"
MIN_REDUCTION+198, // "y"
MIN_REDUCTION+198, // "m"
8, // "g"
MIN_REDUCTION+198, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+198, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+198, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+198, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+198, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 698
0x80000000|944, // match move
0x80000000|1320, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 699
150,803, // ws
152,455, // eol
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 700
0x80000000|1090, // match move
0x80000000|474, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 701
0x80000000|493, // match move
0x80000000|302, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 702
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 703
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
115,1032, // "!"
116,1032, // "="
117,1032, // "%"
118,1032, // "&"
119,1032, // "("
120,1032, // ")"
121,1032, // "*"
122,1032, // "/"
123,1032, // "+"
124,1032, // ","
125,1032, // "-"
126,1032, // "."
127,1032, // ":"
128,1032, // ";"
129,1032, // "<"
130,1032, // ">"
131,1032, // "["
132,1032, // "]"
133,1032, // "{"
134,1032, // "}"
135,1032, // "|"
137,1032, // "0"
140,1032, // {"1".."9"}
141,1032, // "'"
143,1032, // '"'
146,1032, // "_"
147,1032, // {"A".."Z" "j" "q"}
148,1032, // " "
149,1032, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 704
0x80000000|1373, // match move
0x80000000|646, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 705
102,1442, // "t"
106,1458, // "w"
107,193, // "u"
109,941, // "h"
111,524, // "y"
  }
,
{ // state 706
2,106, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 707
0x80000000|1200, // match move
0x80000000|818, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 708
93,359, // "a"
  }
,
{ // state 709
105,371, // "i"
  }
,
{ // state 710
103,559, // "d"
  }
,
{ // state 711
166,MIN_REDUCTION+160, // $NT
  }
,
{ // state 712
150,803, // ws
152,455, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 713
2,744, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 714
0x80000000|130, // match move
0x80000000|1409, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 715
0x80000000|651, // match move
0x80000000|214, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 716
0x80000000|779, // match move
0x80000000|1311, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 717
0x80000000|1422, // match move
0x80000000|264, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 718
150,803, // ws
152,455, // eol
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 719
0x80000000|1239, // match move
0x80000000|754, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 720
150,803, // ws
152,455, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 722
0x80000000|83, // match move
0x80000000|1181, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 723
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 724
150,803, // ws
152,455, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 725
0x80000000|631, // match move
0x80000000|337, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 726
-1, // $$start
-1, // start
874, // ws*
-1, // $$0
MIN_REDUCTION+93, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+93, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+93, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+93, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+93, // "u"
1197, // "p"
MIN_REDUCTION+93, // "h"
903, // "v"
MIN_REDUCTION+93, // "y"
MIN_REDUCTION+93, // "m"
8, // "g"
MIN_REDUCTION+93, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+93, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+93, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+93, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+93, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 727
0x80000000|988, // match move
0x80000000|1016, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 728
150,803, // ws
152,455, // eol
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 729
166,MIN_REDUCTION+103, // $NT
  }
,
{ // state 730
0x80000000|938, // match move
0x80000000|386, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 731
-1, // $$start
-1, // start
1512, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+237, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+237, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+237, // "x"
1251, // "t"
743, // "d"
376, // "f"
1249, // "i"
1070, // "w"
193, // "u"
1197, // "p"
941, // "h"
903, // "v"
524, // "y"
MIN_REDUCTION+237, // "m"
8, // "g"
MIN_REDUCTION+237, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+237, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+237, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+237, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 732
92,374, // "e"
  }
,
{ // state 733
-1, // $$start
-1, // start
704, // ws*
-1, // $$0
MIN_REDUCTION+120, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+120, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+120, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+120, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+120, // "u"
1197, // "p"
MIN_REDUCTION+120, // "h"
903, // "v"
MIN_REDUCTION+120, // "y"
MIN_REDUCTION+120, // "m"
8, // "g"
MIN_REDUCTION+120, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+120, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+120, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+120, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+120, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 734
108,1438, // "p"
  }
,
{ // state 735
97,348, // "r"
  }
,
{ // state 736
2,1452, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 737
0x80000000|1, // match move
0x80000000|635, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 738
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 739
0x80000000|239, // match move
0x80000000|1008, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 740
0x80000000|442, // match move
0x80000000|95, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 741
102,1019, // "t"
  }
,
{ // state 742
0x80000000|1419, // match move
0x80000000|1473, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 743
90,56, // "o"
92,256, // "e"
  }
,
{ // state 744
0x80000000|1401, // match move
0x80000000|841, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 745
150,803, // ws
152,455, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 746
150,803, // ws
152,455, // eol
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 747
166,MIN_REDUCTION+121, // $NT
  }
,
{ // state 748
0x80000000|1201, // match move
0x80000000|1343, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 749
2,1452, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 750
0x80000000|1, // match move
0x80000000|615, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 751
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 752
94,385, // "n"
  }
,
{ // state 753
0x80000000|1184, // match move
0x80000000|33, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 754
-1, // $$start
-1, // start
1065, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+174, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+174, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+174, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+174, // "u"
1197, // "p"
MIN_REDUCTION+174, // "h"
903, // "v"
MIN_REDUCTION+174, // "y"
MIN_REDUCTION+174, // "m"
8, // "g"
MIN_REDUCTION+174, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+174, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+174, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+174, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+174, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
166,MIN_REDUCTION+100, // $NT
  }
,
{ // state 756
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 757
99,17, // "c"
  }
,
{ // state 758
0x80000000|1509, // match move
0x80000000|791, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 759
2,811, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 760
0x80000000|325, // match move
0x80000000|1379, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 761
102,1082, // "t"
  }
,
{ // state 762
0x80000000|167, // match move
0x80000000|378, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 763
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 764
0x80000000|1083, // match move
0x80000000|468, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 765
93,1151, // "a"
  }
,
{ // state 766
0x80000000|384, // match move
0x80000000|781, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 767
166,MIN_REDUCTION+312, // $NT
  }
,
{ // state 768
0x80000000|850, // match move
0x80000000|543, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 769
166,MIN_REDUCTION+202, // $NT
  }
,
{ // state 770
-1, // $$start
-1, // start
372, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+114, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+114, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+114, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+114, // "u"
1197, // "p"
MIN_REDUCTION+114, // "h"
903, // "v"
MIN_REDUCTION+114, // "y"
MIN_REDUCTION+114, // "m"
8, // "g"
MIN_REDUCTION+114, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+114, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+114, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+114, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+114, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
150,1331, // ws
152,455, // eol
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 772
92,710, // "e"
  }
,
{ // state 773
104,1069, // "f"
  }
,
{ // state 774
105,1149, // "i"
  }
,
{ // state 775
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 776
2,407, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 777
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 778
0x80000000|1140, // match move
0x80000000|1300, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 779
150,803, // ws
152,455, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 780
150,803, // ws
152,455, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 781
0x80000000|300, // match move
0x80000000|834, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 782
2,347, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 783
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 784
0x80000000|593, // match move
0x80000000|1332, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 785
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+290, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 786
0x80000000|508, // match move
0x80000000|72, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 787
0x80000000|201, // match move
0x80000000|1367, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 788
108,689, // "p"
  }
,
{ // state 789
0x80000000|1286, // match move
0x80000000|675, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 790
0x80000000|411, // match move
0x80000000|600, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 791
-1, // $$start
-1, // start
1347, // ws*
-1, // $$0
MIN_REDUCTION+99, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+99, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+99, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+99, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+99, // "u"
1197, // "p"
MIN_REDUCTION+99, // "h"
903, // "v"
MIN_REDUCTION+99, // "y"
MIN_REDUCTION+99, // "m"
8, // "g"
MIN_REDUCTION+99, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+99, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+99, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+99, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+99, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
166,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 793
0x80000000|935, // match move
0x80000000|1190, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 794
0x80000000|282, // match move
0x80000000|496, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 795
166,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 796
91,1127, // "l"
  }
,
{ // state 797
0x80000000|1415, // match move
0x80000000|484, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 798
94,542, // "n"
  }
,
{ // state 799
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 800
166,MIN_REDUCTION+91, // $NT
  }
,
{ // state 801
2,106, // ws*
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 802
100,1475, // "s"
  }
,
{ // state 803
166,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 804
0x80000000|909, // match move
0x80000000|1035, // no-match move
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+270, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|897, // match move
0x80000000|1105, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 807
0x80000000|980, // match move
0x80000000|610, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 808
1,865, // start
2,45, // ws*
3,526, // $$0
4,880, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
62,1298, // `*
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
121,1221, // "*"
136,449, // intLit2
138,1025, // digit++
139,50, // digit
145,998, // letter
150,1331, // ws
152,455, // eol
160,1220, // token*
162,11, // digit+
  }
,
{ // state 809
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 810
0x80000000|723, // match move
0x80000000|34, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 811
0x80000000|454, // match move
0x80000000|1039, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 812
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+233, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 813
102,102, // "t"
  }
,
{ // state 814
0x80000000|13, // match move
0x80000000|733, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 815
92,153, // "e"
  }
,
{ // state 816
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+170, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 817
0x80000000|993, // match move
0x80000000|213, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 818
0x80000000|1378, // match move
0x80000000|579, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 819
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+242, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 820
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 821
2,351, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 822
93,457, // "a"
  }
,
{ // state 823
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+89, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 824
90,750, // "o"
  }
,
{ // state 825
110,380, // "v"
  }
,
{ // state 826
0x80000000|301, // match move
0x80000000|1006, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 827
2,392, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 828
150,803, // ws
152,455, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 829
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 830
150,803, // ws
152,455, // eol
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 831
166,MIN_REDUCTION+226, // $NT
  }
,
{ // state 832
150,803, // ws
152,455, // eol
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 833
166,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 834
0x80000000|226, // match move
0x80000000|926, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 835
-1, // $$start
-1, // start
322, // ws*
-1, // $$0
MIN_REDUCTION+195, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+195, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+195, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+195, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+195, // "u"
1197, // "p"
MIN_REDUCTION+195, // "h"
903, // "v"
MIN_REDUCTION+195, // "y"
MIN_REDUCTION+195, // "m"
8, // "g"
MIN_REDUCTION+195, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+195, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+195, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+195, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+195, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 836
-1, // $$start
-1, // start
268, // ws*
-1, // $$0
MIN_REDUCTION+90, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+90, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+90, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+90, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+90, // "u"
1197, // "p"
MIN_REDUCTION+90, // "h"
903, // "v"
MIN_REDUCTION+90, // "y"
MIN_REDUCTION+90, // "m"
8, // "g"
MIN_REDUCTION+90, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+90, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+90, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+90, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+90, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 837
150,803, // ws
152,455, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 838
-1, // $$start
-1, // start
1061, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+257, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 839
166,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 840
125,1399, // "-"
  }
,
{ // state 841
0x80000000|410, // match move
0x80000000|846, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 842
150,803, // ws
152,455, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 843
150,803, // ws
152,455, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 844
0x80000000|525, // match move
0x80000000|1491, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 845
0x80000000|691, // match move
0x80000000|98, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 846
0x80000000|277, // match move
0x80000000|1034, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 847
150,803, // ws
152,455, // eol
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 848
94,54, // "n"
  }
,
{ // state 849
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 850
166,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 851
2,1045, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 852
2,613, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 853
-1, // $$start
-1, // start
1005, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+259, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 854
0x80000000|258, // match move
0x80000000|592, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 855
-1, // $$start
-1, // start
1010, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+277, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 856
0x80000000|659, // match move
0x80000000|1266, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 857
0x80000000|1, // match move
0x80000000|1360, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 858
0x80000000|1, // match move
0x80000000|758, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 859
166,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 860
0x80000000|1257, // match move
0x80000000|1402, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 861
0x80000000|964, // match move
0x80000000|530, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 862
0x80000000|482, // match move
0x80000000|1472, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 863
100,732, // "s"
102,416, // "t"
  }
,
{ // state 864
150,803, // ws
152,455, // eol
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 865
165,MIN_REDUCTION+0, // $
  }
,
{ // state 866
93,162, // "a"
107,137, // "u"
111,1155, // "y"
  }
,
{ // state 867
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+218, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 868
0x80000000|287, // match move
0x80000000|1382, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 869
2,1000, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 870
166,MIN_REDUCTION+106, // $NT
  }
,
{ // state 871
0x80000000|396, // match move
0x80000000|76, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 872
166,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 873
0x80000000|783, // match move
0x80000000|1352, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 874
0x80000000|335, // match move
0x80000000|165, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 875
90,458, // "o"
  }
,
{ // state 876
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 877
2,1106, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 878
2,666, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 879
0x80000000|1497, // match move
0x80000000|1362, // no-match move
0x80000000|703, // NT-test-match state for printable
  }
,
{ // state 880
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 881
102,514, // "t"
  }
,
{ // state 882
150,803, // ws
152,455, // eol
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 883
-1, // $$start
-1, // start
1512, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+237, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+237, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+237, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+237, // "u"
1197, // "p"
MIN_REDUCTION+237, // "h"
903, // "v"
MIN_REDUCTION+237, // "y"
MIN_REDUCTION+237, // "m"
8, // "g"
MIN_REDUCTION+237, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+237, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+237, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+237, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 884
0x80000000|448, // match move
0x80000000|131, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 885
0x80000000|1243, // match move
0x80000000|93, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 886
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 887
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+191, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 888
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+128, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 889
0x80000000|847, // match move
0x80000000|387, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 890
150,803, // ws
152,455, // eol
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 891
0x80000000|1374, // match move
0x80000000|1179, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 892
91,538, // "l"
  }
,
{ // state 893
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 894
91,483, // "l"
  }
,
{ // state 895
112,1150, // "m"
  }
,
{ // state 896
2,1071, // ws*
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 897
150,803, // ws
152,455, // eol
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 898
166,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 899
166,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 900
166,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 901
0x80000000|1490, // match move
0x80000000|507, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 902
0x80000000|183, // match move
0x80000000|1335, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 903
90,109, // "o"
  }
,
{ // state 904
150,803, // ws
152,455, // eol
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 905
2,1093, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 906
166,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 907
0x80000000|985, // match move
0x80000000|1345, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 908
0x80000000|1262, // match move
0x80000000|35, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 909
150,803, // ws
152,455, // eol
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 910
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 911
105,497, // "i"
  }
,
{ // state 912
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 913
0x80000000|1510, // match move
0x80000000|119, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 914
0x80000000|555, // match move
0x80000000|652, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 915
0x80000000|1115, // match move
0x80000000|67, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 916
-1, // $$start
-1, // start
717, // ws*
-1, // $$0
MIN_REDUCTION+171, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+171, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+171, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+171, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+171, // "u"
1197, // "p"
MIN_REDUCTION+171, // "h"
903, // "v"
MIN_REDUCTION+171, // "y"
MIN_REDUCTION+171, // "m"
8, // "g"
MIN_REDUCTION+171, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+171, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+171, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+171, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+171, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 917
150,803, // ws
152,455, // eol
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 918
5,800, // `boolean
6,1172, // `class
7,729, // `extends
8,26, // `void
9,486, // `int
10,523, // `while
11,1383, // `if
12,755, // `else
13,1263, // `for
14,611, // `break
15,1325, // `this
16,870, // `false
17,1074, // `true
18,1395, // `super
19,1129, // `null
20,540, // `return
21,355, // `instanceof
22,747, // `new
23,665, // `abstract
24,1403, // `assert
25,1304, // `byte
26,711, // `case
27,352, // `catch
28,694, // `char
29,1026, // `const
30,1111, // `continue
31,430, // `default
32,1315, // `do
33,309, // `double
34,1176, // `enum
35,349, // `final
36,1007, // `finally
37,973, // `float
38,1313, // `goto
39,438, // `implements
40,769, // `import
41,138, // `interface
42,105, // `long
43,1180, // `native
44,580, // `package
45,621, // `private
46,1394, // `protected
47,1098, // `public
48,144, // `short
49,831, // `static
50,90, // `strictfp
51,36, // `switch
52,450, // `synchronized
53,283, // `throw
54,1396, // `throws
55,602, // `transient
56,1366, // `try
57,618, // `volatile
89,1230, // "b"
91,1386, // "l"
92,473, // "e"
93,1514, // "a"
94,1431, // "n"
97,404, // "r"
99,990, // "c"
100,1358, // "s"
102,1397, // "t"
103,743, // "d"
104,376, // "f"
105,1249, // "i"
106,59, // "w"
108,1197, // "p"
110,903, // "v"
113,8, // "g"
  }
,
{ // state 919
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 920
0x80000000|27, // match move
0x80000000|510, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 921
0x80000000|1043, // match move
0x80000000|622, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 922
0x80000000|1370, // match move
0x80000000|1003, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 923
166,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 924
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 925
0x80000000|1178, // match move
0x80000000|118, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 926
-1, // $$start
-1, // start
1368, // ws*
-1, // $$0
MIN_REDUCTION+328, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+328, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
-1, // idChar**
479, // $$1
-1, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+328, // $
-1, // $NT
  }
,
{ // state 927
0x80000000|502, // match move
0x80000000|1113, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 928
2,636, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 929
0x80000000|537, // match move
0x80000000|1447, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 930
150,803, // ws
152,455, // eol
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 931
97,1250, // "r"
  }
,
{ // state 932
150,803, // ws
152,455, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 933
150,803, // ws
152,455, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 934
0x80000000|1372, // match move
0x80000000|1130, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 935
116,1290, // "="
  }
,
{ // state 936
106,612, // "w"
  }
,
{ // state 937
-1, // $$start
-1, // start
1437, // ws*
-1, // $$0
MIN_REDUCTION+204, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+204, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+204, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+204, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+204, // "u"
1197, // "p"
MIN_REDUCTION+204, // "h"
903, // "v"
MIN_REDUCTION+204, // "y"
MIN_REDUCTION+204, // "m"
8, // "g"
MIN_REDUCTION+204, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+204, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+204, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+204, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+204, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 938
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 939
150,803, // ws
152,455, // eol
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 940
166,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 941
90,735, // "o"
  }
,
{ // state 942
0x80000000|837, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 943
2,908, // ws*
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 944
2,1388, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 945
0x80000000|771, // match move
0x80000000|1143, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 946
150,803, // ws
152,455, // eol
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 947
-1, // $$start
-1, // start
402, // ws*
-1, // $$0
MIN_REDUCTION+213, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+213, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+213, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+213, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+213, // "u"
1197, // "p"
MIN_REDUCTION+213, // "h"
903, // "v"
MIN_REDUCTION+213, // "y"
MIN_REDUCTION+213, // "m"
8, // "g"
MIN_REDUCTION+213, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+213, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+213, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+213, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+213, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 948
-1, // $$start
-1, // start
744, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+108, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+108, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+108, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+108, // "u"
1197, // "p"
MIN_REDUCTION+108, // "h"
903, // "v"
MIN_REDUCTION+108, // "y"
MIN_REDUCTION+108, // "m"
8, // "g"
MIN_REDUCTION+108, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+108, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+108, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+108, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 949
2,1199, // ws*
148,195, // " "
150,1331, // ws
151,195, // {9}
152,455, // eol
156,1439, // {10}
157,1054, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 950
0x80000000|649, // match move
0x80000000|1346, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 951
150,803, // ws
152,455, // eol
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 952
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 953
2,874, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 954
150,803, // ws
152,455, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 955
166,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 956
0x80000000|1445, // match move
0x80000000|460, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 957
0x80000000|1085, // match move
0x80000000|148, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 958
0x80000000|1, // match move
0x80000000|1247, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 959
2,66, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 960
0x80000000|851, // match move
0x80000000|1451, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 961
150,803, // ws
152,455, // eol
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 962
0x80000000|1, // match move
0x80000000|390, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 963
0x80000000|112, // match move
0x80000000|1426, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 964
166,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 966
0x80000000|999, // match move
0x80000000|377, // no-match move
0x80000000|918, // NT-test-match state for reserved
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+182, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|608, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 970
2,351, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 971
0x80000000|900, // match move
0x80000000|432, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 972
166,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 973
166,MIN_REDUCTION+193, // $NT
  }
,
{ // state 974
150,803, // ws
152,455, // eol
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+274, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+215, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
0x80000000|920, // no-match move
0x80000000|1342, // NT-test-match state for idChar
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
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+138, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+138, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+138, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+138, // "u"
1197, // "p"
MIN_REDUCTION+138, // "h"
903, // "v"
MIN_REDUCTION+138, // "y"
MIN_REDUCTION+138, // "m"
8, // "g"
MIN_REDUCTION+138, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+138, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+138, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+138, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+138, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 981
0x80000000|662, // match move
0x80000000|684, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 982
166,MIN_REDUCTION+310, // $NT
  }
,
{ // state 983
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 984
0x80000000|642, // match move
0x80000000|731, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 985
2,591, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 986
150,803, // ws
152,455, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 987
0x80000000|215, // match move
0x80000000|558, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 988
150,803, // ws
152,455, // eol
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 990
90,848, // "o"
91,181, // "l"
93,863, // "a"
109,573, // "h"
  }
,
{ // state 991
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 992
0x80000000|223, // match move
0x80000000|584, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 993
2,1010, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 994
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+280, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 995
91,1455, // "l"
  }
,
{ // state 996
-1, // $$start
-1, // start
942, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+279, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 997
2,392, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 998
0x80000000|1112, // match move
0x80000000|787, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 999
166,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1000
0x80000000|518, // match move
0x80000000|315, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1001
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1002
0x80000000|1506, // match move
0x80000000|353, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1003
-1, // $$start
-1, // start
346, // ws*
-1, // $$0
MIN_REDUCTION+180, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+180, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+180, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+180, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+180, // "u"
1197, // "p"
MIN_REDUCTION+180, // "h"
903, // "v"
MIN_REDUCTION+180, // "y"
MIN_REDUCTION+180, // "m"
8, // "g"
MIN_REDUCTION+180, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+180, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+180, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+180, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+180, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1004
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1005
0x80000000|1103, // match move
0x80000000|915, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1006
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+209, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1007
166,MIN_REDUCTION+190, // $NT
  }
,
{ // state 1008
0x80000000|687, // match move
0x80000000|1287, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1009
99,1363, // "c"
  }
,
{ // state 1010
0x80000000|203, // match move
0x80000000|1015, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1011
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1012
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+206, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1013
2,992, // ws*
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1014
143,227, // '"'
  }
,
{ // state 1015
0x80000000|303, // match move
0x80000000|512, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1016
0x80000000|986, // match move
0x80000000|143, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1017
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+298, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1018
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1019
92,1462, // "e"
  }
,
{ // state 1020
0x80000000|99, // match move
0x80000000|550, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1021
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1022
150,803, // ws
152,455, // eol
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1023
0x80000000|1302, // match move
0x80000000|331, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1024
0x80000000|626, // match move
0x80000000|1001, // no-match move
0x80000000|46, // NT-test-match state for digit
  }
,
{ // state 1025
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1026
166,MIN_REDUCTION+169, // $NT
  }
,
{ // state 1027
-1, // $$start
-1, // start
666, // ws*
-1, // $$0
MIN_REDUCTION+240, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+240, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+240, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+240, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+240, // "u"
1197, // "p"
MIN_REDUCTION+240, // "h"
903, // "v"
MIN_REDUCTION+240, // "y"
MIN_REDUCTION+240, // "m"
8, // "g"
MIN_REDUCTION+240, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+240, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+240, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+240, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+240, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1028
137,604, // "0"
139,1024, // digit
140,604, // {"1".."9"}
  }
,
{ // state 1029
150,803, // ws
152,455, // eol
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1030
150,803, // ws
152,455, // eol
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1031
150,803, // ws
152,455, // eol
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1032
166,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1033
-1, // $$start
-1, // start
447, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+234, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+234, // "k"
990, // "c"
1318, // "s"
MIN_REDUCTION+234, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+234, // "u"
1197, // "p"
MIN_REDUCTION+234, // "h"
903, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
8, // "g"
MIN_REDUCTION+234, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+234, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+234, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+234, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1034
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+107, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1035
0x80000000|712, // match move
0x80000000|116, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1036
0x80000000|1177, // match move
0x80000000|672, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1037
92,737, // "e"
  }
,
{ // state 1038
0x80000000|1456, // match move
0x80000000|1186, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1039
0x80000000|1469, // match move
0x80000000|394, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1040
0x80000000|746, // match move
0x80000000|1303, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1041
102,709, // "t"
  }
,
{ // state 1042
0x80000000|1126, // match move
0x80000000|1067, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1043
4,365, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
  }
,
{ // state 1044
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1045
0x80000000|681, // match move
0x80000000|1275, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1046
0x80000000|539, // match move
0x80000000|1424, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1047
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1048
2,490, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1049
0x80000000|236, // match move
0x80000000|257, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1050
0x80000000|509, // match move
0x80000000|826, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1051
-1, // $$start
-1, // start
1023, // ws*
-1, // $$0
MIN_REDUCTION+129, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+129, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+129, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+129, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+129, // "u"
1197, // "p"
MIN_REDUCTION+129, // "h"
903, // "v"
MIN_REDUCTION+129, // "y"
MIN_REDUCTION+129, // "m"
8, // "g"
MIN_REDUCTION+129, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+129, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+129, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+129, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+129, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1052
0x80000000|801, // match move
0x80000000|383, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1053
2,1167, // ws*
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1054
0x80000000|422, // match move
0x80000000|923, // no-match move
// T-test match for 10:
156,
  }
,
{ // state 1055
0x80000000|73, // match move
0x80000000|418, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1056
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1057
166,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1058
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1059
0x80000000|379, // match move
0x80000000|1240, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1060
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+131, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1061
0x80000000|233, // match move
0x80000000|212, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1062
0x80000000|776, // match move
0x80000000|1144, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1063
93,1364, // "a"
  }
,
{ // state 1064
92,1333, // "e"
  }
,
{ // state 1065
0x80000000|149, // match move
0x80000000|425, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1066
0x80000000|821, // match move
0x80000000|1204, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1067
-1, // $$start
-1, // start
1093, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+297, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1068
166,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1069
93,686, // "a"
  }
,
{ // state 1070
105,1084, // "i"
109,1203, // "h"
  }
,
{ // state 1071
0x80000000|40, // match move
0x80000000|1145, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1072
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1073
105,1138, // "i"
  }
,
{ // state 1074
166,MIN_REDUCTION+142, // $NT
  }
,
{ // state 1075
1,865, // start
2,45, // ws*
3,526, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
160,1220, // token*
  }
,
{ // state 1076
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1077
-1, // $$start
-1, // start
-1, // ws*
1359, // $$0
880, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
-1, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
-1, // idChar**
-1, // $$1
1220, // token*
-1, // printable*
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1078
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+272, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1079
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1080
92,752, // "e"
  }
,
{ // state 1081
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1082
107,1470, // "u"
  }
,
{ // state 1083
2,942, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1084
102,757, // "t"
  }
,
{ // state 1085
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1086
2,18, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 1087
166,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1088
0x80000000|991, // match move
0x80000000|1314, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1089
2,1005, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1090
2,789, // ws*
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1091
0x80000000|1513, // match move
0x80000000|913, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1092
2,1227, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 1093
0x80000000|1029, // match move
0x80000000|638, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1094
150,803, // ws
152,455, // eol
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1095
0x80000000|1072, // match move
0x80000000|1321, // no-match move
0x80000000|703, // NT-test-match state for printable
  }
,
{ // state 1096
0x80000000|1, // match move
0x80000000|456, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1097
0x80000000|898, // match move
0x80000000|96, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1098
166,MIN_REDUCTION+127, // $NT
  }
,
{ // state 1099
0x80000000|1183, // match move
0x80000000|299, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1100
150,803, // ws
152,455, // eol
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1101
0x80000000|728, // match move
0x80000000|232, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1102
0x80000000|1406, // match move
0x80000000|1503, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1103
150,803, // ws
152,455, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1104
97,773, // "r"
  }
,
{ // state 1105
0x80000000|546, // match move
0x80000000|1486, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1106
0x80000000|832, // match move
0x80000000|1128, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1107
150,803, // ws
152,455, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1108
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1109
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1110
150,803, // ws
152,455, // eol
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1111
166,MIN_REDUCTION+172, // $NT
  }
,
{ // state 1112
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,807, // idChar
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
137,1391, // "0"
139,357, // digit
140,1391, // {"1".."9"}
145,1294, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
158,766, // idChar**
164,871, // idChar*
  }
,
{ // state 1113
-1, // $$start
-1, // start
613, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
-1, // `=
-1, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
MIN_REDUCTION+285, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+285, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1114
0x80000000|1327, // match move
0x80000000|1117, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1115
150,803, // ws
152,455, // eol
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1116
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1117
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+296, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1118
0x80000000|842, // match move
0x80000000|1187, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1119
150,803, // ws
152,455, // eol
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1120
0x80000000|321, // match move
0x80000000|810, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1121
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1122
150,803, // ws
152,455, // eol
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1123
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+155, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1124
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1125
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1126
2,1093, // ws*
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1127
102,499, // "t"
  }
,
{ // state 1128
0x80000000|104, // match move
0x80000000|317, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1129
166,MIN_REDUCTION+124, // $NT
  }
,
{ // state 1130
-1, // $$start
-1, // start
1423, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+117, // "o"
1386, // "l"
133, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+117, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+117, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+117, // "u"
1197, // "p"
MIN_REDUCTION+117, // "h"
903, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
8, // "g"
MIN_REDUCTION+117, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+117, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+117, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+117, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1131
93,798, // "a"
  }
,
{ // state 1132
150,803, // ws
152,455, // eol
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1133
2,1005, // ws*
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1134
107,107, // "u"
  }
,
{ // state 1135
0x80000000|574, // match move
0x80000000|267, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1136
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1137
0x80000000|451, // match move
0x80000000|1020, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1138
99,1213, // "c"
  }
,
{ // state 1139
0x80000000|1407, // match move
0x80000000|230, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1140
166,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1141
0x80000000|1413, // match move
0x80000000|1195, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1142
-1, // $$start
-1, // start
1000, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+253, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1143
0x80000000|680, // match move
0x80000000|1316, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1144
-1, // $$start
-1, // start
407, // ws*
-1, // $$0
MIN_REDUCTION+183, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+183, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+183, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+183, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+183, // "u"
1197, // "p"
MIN_REDUCTION+183, // "h"
903, // "v"
MIN_REDUCTION+183, // "y"
MIN_REDUCTION+183, // "m"
8, // "g"
MIN_REDUCTION+183, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+183, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+183, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+183, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+183, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1145
0x80000000|1094, // match move
0x80000000|48, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1146
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1147
114,772, // "z"
  }
,
{ // state 1148
150,803, // ws
152,455, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1149
92,63, // "e"
  }
,
{ // state 1150
0x80000000|1, // match move
0x80000000|1062, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1151
102,79, // "t"
  }
,
{ // state 1152
99,813, // "c"
  }
,
{ // state 1153
150,803, // ws
152,455, // eol
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1154
0x80000000|629, // match move
0x80000000|1418, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1155
0x80000000|1, // match move
0x80000000|345, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1156
0x80000000|1, // match move
0x80000000|1433, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1157
2,94, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1158
0x80000000|1022, // match move
0x80000000|446, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1159
2,447, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 1160
0x80000000|1018, // match move
0x80000000|1017, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1161
0x80000000|123, // match move
0x80000000|1508, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1162
150,803, // ws
152,455, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1163
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1165
0x80000000|78, // match move
0x80000000|433, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1166
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+236, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1167
0x80000000|946, // match move
0x80000000|221, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1168
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1169
0x80000000|1, // match move
0x80000000|1480, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1170
2,1010, // ws*
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1171
150,803, // ws
152,455, // eol
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1172
166,MIN_REDUCTION+97, // $NT
  }
,
{ // state 1173
91,25, // "l"
  }
,
{ // state 1174
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1175
0x80000000|1075, // match move
0x80000000|808, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1176
166,MIN_REDUCTION+184, // $NT
  }
,
{ // state 1177
150,803, // ws
152,455, // eol
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 1178
2,591, // ws*
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1179
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+282, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1180
166,MIN_REDUCTION+211, // $NT
  }
,
{ // state 1181
0x80000000|830, // match move
0x80000000|506, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1182
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1183
2,1045, // ws*
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1184
2,382, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 1185
150,803, // ws
152,455, // eol
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1186
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+110, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1187
0x80000000|1308, // match move
0x80000000|867, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1188
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1189
0x80000000|1369, // match move
0x80000000|1505, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1190
0x80000000|852, // match move
0x80000000|427, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1191
150,803, // ws
152,455, // eol
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1192
0x80000000|175, // match move
0x80000000|1349, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1193
0x80000000|272, // match move
0x80000000|250, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1194
103,100, // "d"
  }
,
{ // state 1195
0x80000000|1306, // match move
0x80000000|739, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1196
2,268, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1197
93,585, // "a"
97,140, // "r"
107,313, // "u"
  }
,
{ // state 1198
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 1199
0x80000000|669, // match move
0x80000000|1277, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1200
150,803, // ws
152,455, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1201
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1202
90,289, // "o"
111,1011, // "y"
  }
,
{ // state 1203
105,892, // "i"
  }
,
{ // state 1204
0x80000000|970, // match move
0x80000000|714, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1205
150,803, // ws
152,455, // eol
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1206
150,803, // ws
152,455, // eol
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1207
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1208
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1209
116,64, // "="
  }
,
{ // state 1210
104,788, // "f"
  }
,
{ // state 1211
2,249, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1212
102,824, // "t"
  }
,
{ // state 1213
0x80000000|1, // match move
0x80000000|373, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1214
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+258, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1215
113,815, // "g"
  }
,
{ // state 1216
0x80000000|792, // match move
0x80000000|607, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1217
150,803, // ws
152,455, // eol
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1218
4,365, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
83,271, // `/
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
145,998, // letter
  }
,
{ // state 1219
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1220
0x80000000|1421, // match move
0x80000000|1432, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1221
0x80000000|1, // match move
0x80000000|949, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 1222
0x80000000|1, // match move
0x80000000|1330, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1223
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+276, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1224
150,803, // ws
152,455, // eol
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1225
0x80000000|211, // match move
0x80000000|965, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1226
0x80000000|409, // match move
0x80000000|3, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1227
0x80000000|1324, // match move
0x80000000|630, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1228
2,392, // ws*
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1229
0x80000000|437, // match move
0x80000000|21, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1230
90,32, // "o"
97,413, // "r"
111,431, // "y"
  }
,
{ // state 1231
0x80000000|1133, // match move
0x80000000|853, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1232
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+167, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1233
2,942, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1234
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1235
150,803, // ws
152,455, // eol
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1236
150,803, // ws
152,455, // eol
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1237
0x80000000|1285, // match move
0x80000000|1381, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1238
100,881, // "s"
  }
,
{ // state 1239
2,1065, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1240
0x80000000|1430, // match move
0x80000000|1414, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1241
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1242
0x80000000|1209, // match move
0x80000000|415, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 1243
2,548, // ws*
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1244
0x80000000|1481, // match move
0x80000000|290, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1245
150,803, // ws
152,455, // eol
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1246
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1247
0x80000000|1474, // match move
0x80000000|172, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1248
166,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1249
94,428, // "n"
104,1440, // "f"
112,734, // "m"
  }
,
{ // state 1250
102,656, // "t"
  }
,
{ // state 1251
93,1297, // "a"
97,1449, // "r"
109,1255, // "h"
  }
,
{ // state 1252
0x80000000|1375, // match move
0x80000000|934, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1253
150,803, // ws
152,455, // eol
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1254
0x80000000|240, // match move
0x80000000|884, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1255
97,161, // "r"
105,190, // "i"
  }
,
{ // state 1256
0x80000000|1, // match move
0x80000000|1161, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1257
166,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1258
0x80000000|1492, // match move
0x80000000|929, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1259
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1260
0x80000000|930, // match move
0x80000000|1088, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1261
91,1387, // "l"
  }
,
{ // state 1262
150,803, // ws
152,455, // eol
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1263
166,MIN_REDUCTION+109, // $NT
  }
,
{ // state 1264
0x80000000|1170, // match move
0x80000000|855, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1265
0x80000000|840, // match move
0x80000000|945, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 1266
0x80000000|545, // match move
0x80000000|1485, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1267
92,115, // "e"
  }
,
{ // state 1268
0x80000000|306, // match move
0x80000000|937, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1269
0x80000000|1341, // match move
0x80000000|950, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1270
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1271
0x80000000|1468, // match move
0x80000000|265, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1272
97,875, // "r"
  }
,
{ // state 1273
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1274
0x80000000|1253, // match move
0x80000000|274, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1275
0x80000000|882, // match move
0x80000000|673, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1276
166,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1277
0x80000000|1502, // match move
0x80000000|111, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1278
150,803, // ws
152,455, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1279
150,803, // ws
152,455, // eol
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1280
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+268, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1281
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1282
166,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1283
0x80000000|360, // match move
0x80000000|994, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1284
0x80000000|120, // match move
0x80000000|1218, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1285
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1286
150,803, // ws
152,455, // eol
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1287
-1, // $$start
-1, // start
1274, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
-1, // `=
-1, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
MIN_REDUCTION+249, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+249, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1288
90,1350, // "o"
  }
,
{ // state 1289
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1290
0x80000000|520, // match move
0x80000000|1355, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1291
97,577, // "r"
  }
,
{ // state 1292
0x80000000|491, // match move
0x80000000|124, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1293
0x80000000|1, // match move
0x80000000|255, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1294
0x80000000|1425, // match move
0x80000000|1270, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1295
2,1036, // ws*
148,195, // " "
150,1331, // ws
151,195, // {9}
152,455, // eol
156,1439, // {10}
157,1054, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1296
2,1167, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1297
102,159, // "t"
  }
,
{ // state 1298
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1299
-1, // $$start
-1, // start
401, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+287, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1300
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+140, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1301
105,147, // "i"
  }
,
{ // state 1302
150,803, // ws
152,455, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1303
0x80000000|1385, // match move
0x80000000|184, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1304
166,MIN_REDUCTION+157, // $NT
  }
,
{ // state 1305
0x80000000|495, // match move
0x80000000|1478, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1306
2,1274, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1307
166,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1308
166,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1309
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1310
0x80000000|366, // match move
0x80000000|469, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1311
0x80000000|609, // match move
0x80000000|440, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1312
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1313
166,MIN_REDUCTION+196, // $NT
  }
,
{ // state 1314
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+278, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1315
166,MIN_REDUCTION+178, // $NT
  }
,
{ // state 1316
0x80000000|398, // match move
0x80000000|47, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1317
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+161, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1318
0x80000000|705, // match move
0x80000000|984, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1319
0x80000000|1100, // match move
0x80000000|1229, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1320
-1, // $$start
-1, // start
1388, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+186, // "o"
1202, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+186, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+186, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+186, // "u"
1197, // "p"
MIN_REDUCTION+186, // "h"
903, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
8, // "g"
MIN_REDUCTION+186, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+186, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+186, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1321
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 1322
0x80000000|1465, // match move
0x80000000|121, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1323
135,701, // "|"
  }
,
{ // state 1324
150,803, // ws
152,455, // eol
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1325
166,MIN_REDUCTION+139, // $NT
  }
,
{ // state 1326
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1327
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1328
111,1011, // "y"
  }
,
{ // state 1329
2,717, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1330
0x80000000|1448, // match move
0x80000000|536, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1331
166,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1332
0x80000000|1148, // match move
0x80000000|778, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1333
97,375, // "r"
  }
,
{ // state 1334
0x80000000|623, // match move
0x80000000|1295, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1335
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+252, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1336
2,84, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 1337
103,260, // "d"
  }
,
{ // state 1338
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1339
150,803, // ws
152,455, // eol
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1340
0x80000000|683, // match move
0x80000000|696, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1341
2,1071, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1342
89,541, // "b"
90,541, // "o"
91,541, // "l"
92,541, // "e"
93,541, // "a"
94,541, // "n"
97,541, // "r"
98,541, // "k"
99,541, // "c"
100,541, // "s"
101,541, // "x"
102,541, // "t"
103,541, // "d"
104,541, // "f"
105,541, // "i"
106,541, // "w"
107,541, // "u"
108,541, // "p"
109,541, // "h"
110,541, // "v"
111,541, // "y"
112,541, // "m"
113,541, // "g"
114,541, // "z"
137,356, // "0"
139,685, // digit
140,356, // {"1".."9"}
145,982, // letter
146,767, // "_"
147,541, // {"A".."Z" "j" "q"}
  }
,
{ // state 1343
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+308, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1344
0x80000000|1, // match move
0x80000000|1501, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1345
0x80000000|658, // match move
0x80000000|925, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1346
0x80000000|896, // match move
0x80000000|1464, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1347
0x80000000|171, // match move
0x80000000|1351, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1348
0x80000000|1, // match move
0x80000000|1268, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1349
0x80000000|179, // match move
0x80000000|481, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1350
104,857, // "f"
  }
,
{ // state 1351
0x80000000|1245, // match move
0x80000000|971, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1352
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+288, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1353
166,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1354
0x80000000|246, // match move
0x80000000|397, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1355
0x80000000|690, // match move
0x80000000|108, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1356
0x80000000|1164, // match move
0x80000000|1078, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1357
91,1328, // "l"
  }
,
{ // state 1358
102,1442, // "t"
106,1458, // "w"
107,193, // "u"
109,941, // "h"
111,524, // "y"
  }
,
{ // state 1359
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1360
0x80000000|434, // match move
0x80000000|770, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1361
2,992, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1362
152,906, // eol
153,628, // printable**
156,1439, // {10}
157,1054, // {13}
161,641, // printable*
  }
,
{ // state 1363
102,1267, // "t"
  }
,
{ // state 1364
94,676, // "n"
  }
,
{ // state 1365
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1366
166,MIN_REDUCTION+244, // $NT
  }
,
{ // state 1367
-1, // $$start
-1, // start
1368, // ws*
-1, // $$0
MIN_REDUCTION+330, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+330, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+330, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+330, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+330, // "u"
1197, // "p"
MIN_REDUCTION+330, // "h"
903, // "v"
MIN_REDUCTION+330, // "y"
MIN_REDUCTION+330, // "m"
8, // "g"
MIN_REDUCTION+330, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+330, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+330, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+330, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+330, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
766, // idChar**
1246, // $$1
-1, // token*
-1, // printable*
-1, // digit+
-1, // idChar+
871, // idChar*
MIN_REDUCTION+330, // $
-1, // $NT
  }
,
{ // state 1368
0x80000000|500, // match move
0x80000000|786, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1369
116,960, // "="
  }
,
{ // state 1370
2,346, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1371
0x80000000|1, // match move
0x80000000|1295, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 1372
2,1423, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1373
150,803, // ws
152,455, // eol
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1374
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1375
92,1104, // "e"
  }
,
{ // state 1376
-1, // $$start
-1, // start
490, // ws*
-1, // $$0
MIN_REDUCTION+147, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+147, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+147, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+147, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+147, // "u"
1197, // "p"
MIN_REDUCTION+147, // "h"
903, // "v"
MIN_REDUCTION+147, // "y"
MIN_REDUCTION+147, // "m"
8, // "g"
MIN_REDUCTION+147, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+147, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+147, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+147, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+147, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1377
150,803, // ws
152,455, // eol
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1378
150,803, // ws
152,455, // eol
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 1379
0x80000000|940, // match move
0x80000000|5, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1380
0x80000000|1, // match move
0x80000000|1515, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1381
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+262, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1382
0x80000000|661, // match move
0x80000000|663, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1383
166,MIN_REDUCTION+112, // $NT
  }
,
{ // state 1384
0x80000000|253, // match move
0x80000000|677, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1385
166,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 1386
90,289, // "o"
  }
,
{ // state 1387
92,1398, // "e"
  }
,
{ // state 1388
0x80000000|1377, // match move
0x80000000|1059, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1389
0x80000000|1410, // match move
0x80000000|262, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1390
0x80000000|619, // match move
0x80000000|956, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1391
0x80000000|702, // match move
0x80000000|809, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1392
166,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 1393
2,548, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1394
166,MIN_REDUCTION+220, // $NT
  }
,
{ // state 1395
166,MIN_REDUCTION+133, // $NT
  }
,
{ // state 1396
166,MIN_REDUCTION+238, // $NT
  }
,
{ // state 1397
97,866, // "r"
109,1255, // "h"
  }
,
{ // state 1398
0x80000000|1, // match move
0x80000000|922, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1399
0x80000000|1393, // match move
0x80000000|472, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1400
0x80000000|1, // match move
0x80000000|1310, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1401
150,803, // ws
152,455, // eol
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1402
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+179, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1403
166,MIN_REDUCTION+154, // $NT
  }
,
{ // state 1404
0x80000000|582, // match move
0x80000000|252, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1405
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 1406
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1407
100,1156, // "s"
  }
,
{ // state 1408
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1409
-1, // $$start
-1, // start
351, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+307, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1410
2,727, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1411
0x80000000|978, // match move
0x80000000|563, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1412
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1413
116,907, // "="
  }
,
{ // state 1414
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+185, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1415
2,1167, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1416
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
115,1032, // "!"
116,1032, // "="
117,1032, // "%"
118,1032, // "&"
119,1032, // "("
120,1032, // ")"
121,1032, // "*"
122,1032, // "/"
123,1032, // "+"
124,1032, // ","
125,1032, // "-"
126,1032, // "."
127,1032, // ":"
128,1032, // ";"
129,1032, // "<"
130,1032, // ">"
131,1032, // "["
132,1032, // "]"
133,1032, // "{"
134,1032, // "}"
135,1032, // "|"
137,1032, // "0"
140,1032, // {"1".."9"}
141,1032, // "'"
142,218, // printable
143,1032, // '"'
146,1032, // "_"
147,1032, // {"A".."Z" "j" "q"}
148,1032, // " "
149,1032, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1417
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+306, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1418
-1, // $$start
-1, // start
1452, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
-1, // `=
-1, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
MIN_REDUCTION+281, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+281, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1419
166,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1420
112,1080, // "m"
  }
,
{ // state 1421
0x80000000|1, // match move
0x80000000|921, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1422
150,803, // ws
152,455, // eol
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1423
0x80000000|1499, // match move
0x80000000|464, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1424
0x80000000|955, // match move
0x80000000|1166, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1425
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 1426
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+143, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1427
150,803, // ws
152,455, // eol
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1428
-1, // $$start
-1, // start
38, // ws*
-1, // $$0
MIN_REDUCTION+207, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+207, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+207, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+207, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+207, // "u"
1197, // "p"
MIN_REDUCTION+207, // "h"
903, // "v"
MIN_REDUCTION+207, // "y"
MIN_REDUCTION+207, // "m"
8, // "g"
MIN_REDUCTION+207, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+207, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+207, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+207, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+207, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1429
2,1482, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1430
166,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1431
92,936, // "e"
93,1041, // "a"
107,995, // "u"
  }
,
{ // state 1432
0x80000000|1284, // match move
0x80000000|862, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1433
0x80000000|642, // match move
0x80000000|883, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1434
0x80000000|487, // match move
0x80000000|180, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1435
93,1215, // "a"
  }
,
{ // state 1436
89,476, // "b"
90,476, // "o"
91,476, // "l"
92,476, // "e"
93,476, // "a"
94,476, // "n"
97,476, // "r"
98,476, // "k"
99,476, // "c"
100,476, // "s"
101,476, // "x"
102,476, // "t"
103,476, // "d"
104,476, // "f"
105,476, // "i"
106,476, // "w"
107,476, // "u"
108,476, // "p"
109,476, // "h"
110,476, // "v"
111,476, // "y"
112,476, // "m"
113,476, // "g"
114,476, // "z"
115,476, // "!"
116,476, // "="
117,476, // "%"
118,476, // "&"
119,476, // "("
120,476, // ")"
121,476, // "*"
122,476, // "/"
123,476, // "+"
124,476, // ","
125,476, // "-"
126,476, // "."
127,476, // ":"
128,476, // ";"
129,476, // "<"
130,476, // ">"
131,476, // "["
132,476, // "]"
133,476, // "{"
134,476, // "}"
135,476, // "|"
137,476, // "0"
140,476, // {"1".."9"}
141,476, // "'"
142,69, // printable
143,476, // '"'
146,476, // "_"
147,476, // {"A".."Z" "j" "q"}
148,476, // " "
149,476, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 1437
0x80000000|1217, // match move
0x80000000|760, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1438
90,931, // "o"
91,261, // "l"
  }
,
{ // state 1439
166,MIN_REDUCTION+324, // $NT
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1440
0x80000000|1, // match move
0x80000000|1322, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1441
89,163, // "b"
90,163, // "o"
91,163, // "l"
92,163, // "e"
93,163, // "a"
94,163, // "n"
95,1002, // idChar
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
137,1391, // "0"
139,357, // digit
140,1391, // {"1".."9"}
144,1014, // idChar++
145,1294, // letter
146,762, // "_"
147,163, // {"A".."Z" "j" "q"}
163,1225, // idChar+
  }
,
{ // state 1442
93,1297, // "a"
97,911, // "r"
  }
,
{ // state 1443
-1, // $$start
-1, // start
66, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+293, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1444
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+101, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1445
2,2, // ws*
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1446
166,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1447
0x80000000|1450, // match move
0x80000000|480, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1448
2,88, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1449
93,162, // "a"
105,497, // "i"
107,137, // "u"
111,1155, // "y"
  }
,
{ // state 1450
2,889, // ws*
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1451
0x80000000|51, // match move
0x80000000|1099, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1452
0x80000000|932, // match move
0x80000000|571, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1453
2,784, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1454
150,803, // ws
152,455, // eol
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1455
91,977, // "l"
  }
,
{ // state 1456
166,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 1457
92,958, // "e"
  }
,
{ // state 1458
105,1084, // "i"
  }
,
{ // state 1459
0x80000000|876, // match move
0x80000000|294, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1460
0x80000000|933, // match move
0x80000000|412, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1461
0x80000000|878, // match move
0x80000000|1027, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1462
94,1194, // "n"
  }
,
{ // state 1463
91,1037, // "l"
  }
,
{ // state 1464
-1, // $$start
-1, // start
1071, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+265, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1465
2,1049, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1466
150,803, // ws
152,455, // eol
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1467
-1, // $$start
-1, // start
382, // ws*
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+303, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1468
150,803, // ws
152,455, // eol
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1469
150,803, // ws
152,455, // eol
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1470
97,292, // "r"
  }
,
{ // state 1471
121,1495, // "*"
122,879, // "/"
  }
,
{ // state 1472
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
365, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
-1, // "*"
1371, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
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
11, // digit+
-1, // idChar+
-1, // idChar*
MIN_REDUCTION+349, // $
-1, // $NT
  }
,
{ // state 1473
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+104, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1474
2,326, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1475
0x80000000|1, // match move
0x80000000|1389, // no-match move
0x80000000|1342, // NT-test-match state for idChar
  }
,
{ // state 1476
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1477
150,803, // ws
152,455, // eol
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 1478
0x80000000|959, // match move
0x80000000|187, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 1479
0x80000000|7, // match move
0x80000000|1142, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1480
0x80000000|200, // match move
0x80000000|979, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1481
121,117, // "*"
152,14, // eol
155,1124, // commentContent
  }
,
{ // state 1482
0x80000000|1119, // match move
0x80000000|794, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1483
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1484
3,1359, // $$0
4,880, // token
58,1198, // `!
59,1259, // `!=
60,829, // `%
61,601, // `&&
63,645, // `(
64,1081, // `)
65,1188, // `{
66,1338, // `}
67,1234, // `-
68,16, // `+
69,989, // `=
70,1004, // `==
71,204, // `[
72,1182, // `]
73,1208, // `||
74,924, // `<
75,157, // `<=
76,1483, // `,
77,893, // `>
78,136, // `>=
79,174, // `.
80,231, // `;
81,1326, // `++
82,1047, // `--
83,271, // `/
84,1108, // `:
85,721, // ID
86,501, // INTLIT
87,220, // STRINGLIT
88,1312, // CHARLIT
145,998, // letter
150,803, // ws
152,455, // eol
160,1220, // token*
  }
,
{ // state 1485
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+283, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1486
0x80000000|1273, // match move
0x80000000|1280, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1487
0x80000000|521, // match move
0x80000000|1051, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1488
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+302, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1489
150,803, // ws
152,455, // eol
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1490
150,803, // ws
152,455, // eol
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1491
0x80000000|839, // match move
0x80000000|170, // no-match move
0x80000000|918, // NT-test-match state for reserved
  }
,
{ // state 1492
2,889, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1493
150,803, // ws
152,455, // eol
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1494
-1, // $$start
-1, // start
633, // ws*
-1, // $$0
MIN_REDUCTION+159, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+159, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+159, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+159, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+159, // "u"
1197, // "p"
MIN_REDUCTION+159, // "h"
903, // "v"
MIN_REDUCTION+159, // "y"
MIN_REDUCTION+159, // "m"
8, // "g"
MIN_REDUCTION+159, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+159, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+159, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+159, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+159, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1495
0x80000000|237, // match move
0x80000000|350, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1496
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1497
89,476, // "b"
90,476, // "o"
91,476, // "l"
92,476, // "e"
93,476, // "a"
94,476, // "n"
97,476, // "r"
98,476, // "k"
99,476, // "c"
100,476, // "s"
101,476, // "x"
102,476, // "t"
103,476, // "d"
104,476, // "f"
105,476, // "i"
106,476, // "w"
107,476, // "u"
108,476, // "p"
109,476, // "h"
110,476, // "v"
111,476, // "y"
112,476, // "m"
113,476, // "g"
114,476, // "z"
115,476, // "!"
116,476, // "="
117,476, // "%"
118,476, // "&"
119,476, // "("
120,476, // ")"
121,476, // "*"
122,476, // "/"
123,476, // "+"
124,476, // ","
125,476, // "-"
126,476, // "."
127,476, // ":"
128,476, // ";"
129,476, // "<"
130,476, // ">"
131,476, // "["
132,476, // "]"
133,476, // "{"
134,476, // "}"
135,476, // "|"
137,476, // "0"
140,476, // {"1".."9"}
141,476, // "'"
142,1095, // printable
143,476, // '"'
146,476, // "_"
147,476, // {"A".."Z" "j" "q"}
148,476, // " "
149,476, // {"#".."$" "?".."@" "\" "^" "`" "~"}
153,628, // printable**
161,641, // printable*
  }
,
{ // state 1498
3,1359, // $$0
4,880, // token
5,238, // `boolean
6,738, // `class
7,242, // `extends
8,6, // `void
9,330, // `int
10,391, // `while
11,1309, // `if
12,919, // `else
13,566, // `for
14,648, // `break
15,270, // `this
16,206, // `false
17,1079, // `true
18,1044, // `super
19,55, // `null
20,127, // `return
21,1207, // `instanceof
22,1412, // `new
23,1163, // `abstract
24,1281, // `assert
25,751, // `byte
26,572, // `case
27,756, // `catch
28,461, // `char
29,556, // `const
30,639, // `continue
31,620, // `default
32,1241, // `do
33,194, // `double
34,68, // `enum
35,910, // `final
36,1109, // `finally
37,886, // `float
38,229, // `goto
39,1408, // `implements
40,62, // `import
41,361, // `interface
42,531, // `long
43,1168, // `native
44,1289, // `package
45,1121, // `private
46,799, // `protected
47,1136, // `public
48,1476, // `short
49,968, // `static
50,1219, // `strictfp
51,125, // `switch
52,467, // `synchronized
53,588, // `throw
54,820, // `throws
55,363, // `transient
56,775, // `try
57,1058, // `volatile
160,1220, // token*
  }
,
{ // state 1499
150,803, // ws
152,455, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1500
92,1222, // "e"
  }
,
{ // state 1501
0x80000000|1086, // match move
0x80000000|606, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1502
150,803, // ws
152,455, // eol
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1503
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+292, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1504
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
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
721, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
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
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+149, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
449, // intLit2
604, // "0"
1025, // digit++
50, // digit
604, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
998, // letter
-1, // "_"
163, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
803, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1505
0x80000000|1296, // match move
0x80000000|797, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1506
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 1507
2,548, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1508
-1, // $$start
-1, // start
1460, // ws*
-1, // $$0
MIN_REDUCTION+105, // token
238, // `boolean
738, // `class
242, // `extends
6, // `void
330, // `int
391, // `while
1309, // `if
919, // `else
566, // `for
648, // `break
270, // `this
206, // `false
1079, // `true
1044, // `super
55, // `null
127, // `return
1207, // `instanceof
1412, // `new
1163, // `abstract
1281, // `assert
751, // `byte
572, // `case
756, // `catch
461, // `char
556, // `const
639, // `continue
620, // `default
1241, // `do
194, // `double
68, // `enum
910, // `final
1109, // `finally
886, // `float
229, // `goto
1408, // `implements
62, // `import
361, // `interface
531, // `long
1168, // `native
1289, // `package
1121, // `private
799, // `protected
1136, // `public
1476, // `short
968, // `static
1219, // `strictfp
125, // `switch
467, // `synchronized
588, // `throw
820, // `throws
363, // `transient
775, // `try
1058, // `volatile
1198, // `!
1259, // `!=
829, // `%
601, // `&&
-1, // `*
645, // `(
1081, // `)
1188, // `{
1338, // `}
1234, // `-
16, // `+
989, // `=
1004, // `==
204, // `[
1182, // `]
1208, // `||
924, // `<
157, // `<=
1483, // `,
893, // `>
136, // `>=
174, // `.
231, // `;
1326, // `++
1047, // `--
271, // `/
1108, // `:
-1, // ID
501, // INTLIT
220, // STRINGLIT
1312, // CHARLIT
1230, // "b"
MIN_REDUCTION+105, // "o"
1386, // "l"
473, // "e"
1514, // "a"
1431, // "n"
-1, // idChar
-1, // reserved
404, // "r"
MIN_REDUCTION+105, // "k"
990, // "c"
1358, // "s"
MIN_REDUCTION+105, // "x"
1397, // "t"
743, // "d"
376, // "f"
1249, // "i"
59, // "w"
MIN_REDUCTION+105, // "u"
1197, // "p"
MIN_REDUCTION+105, // "h"
903, // "v"
MIN_REDUCTION+105, // "y"
MIN_REDUCTION+105, // "m"
8, // "g"
MIN_REDUCTION+105, // "z"
1141, // "!"
793, // "="
97, // "%"
459, // "&"
160, // "("
1384, // ")"
MIN_REDUCTION+105, // "*"
1334, // "/"
561, // "+"
1258, // ","
1265, // "-"
320, // "."
817, // ":"
764, // ";"
1242, // "<"
1189, // ">"
1305, // "["
1511, // "]"
339, // "{"
126, // "}"
1323, // "|"
-1, // intLit2
MIN_REDUCTION+105, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+105, // {"1".."9"}
1416, // "'"
-1, // printable
1441, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+105, // {"A".."Z" "j" "q"}
195, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
1331, // ws
195, // {9}
455, // eol
-1, // printable**
-1, // commentContent*
-1, // commentContent
1439, // {10}
1054, // {13}
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
{ // state 1509
2,1347, // ws*
150,1331, // ws
152,455, // eol
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 1510
150,803, // ws
152,455, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1511
0x80000000|463, // match move
0x80000000|1390, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1512
0x80000000|478, // match move
0x80000000|1046, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1513
150,803, // ws
152,455, // eol
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1514
89,1238, // "b"
100,679, // "s"
  }
,
{ // state 1515
0x80000000|1429, // match move
0x80000000|444, // no-match move
// T-test match for "*":
121,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1516][];
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
// ws ::= "/" "*" commentContent* "*" "/"
(150<<16)+5,
// ws ::= "/" "*" "*" "/"
(150<<16)+4,
// commentContent ::= "*" !"/"
(155<<16)+1,
// commentContent ::= !"*" printable
(155<<16)+1,
// commentContent ::= eol
(155<<16)+1,
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
(160<<16)+2,
// token* ::= token
(160<<16)+1,
// printable** ::= printable* !printable
(153<<16)+1,
// digit++ ::= digit+ !digit
(138<<16)+1,
// commentContent* ::= commentContent* commentContent
(154<<16)+2,
// commentContent* ::= commentContent
(154<<16)+1,
// idChar++ ::= idChar+ !idChar
(144<<16)+1,
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
// $$1 ::= ws*
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
151, // 9
156, // 10
-1, // 11
-1, // 12
157, // 13
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
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 319
"ws ::= \"/\" \"*\" commentContent* \"*\" \"/\"", // 320
"commentContent ::= \"*\" !\"/\"", // 321
"commentContent ::= !\"*\" printable", // 322
"commentContent ::= eol", // 323
"eol ::= {10} registerNewline", // 324
"eol ::= {13} {10} registerNewline", // 325
"eol ::= {13} !10 registerNewline", // 326
"ID ::= !reserved letter idChar** ws*", // 327
"ID ::= !reserved letter idChar** ws*", // 328
"ID ::= !reserved letter idChar** ws*", // 329
"ID ::= !reserved letter idChar** ws*", // 330
"token* ::= token* token", // 331
"token* ::= token* token", // 332
"printable** ::= printable* !printable", // 333
"digit++ ::= digit+ !digit", // 334
"commentContent* ::= commentContent* commentContent", // 335
"commentContent* ::= commentContent* commentContent", // 336
"idChar++ ::= idChar+ !idChar", // 337
"idChar** ::= idChar* !idChar", // 338
"ws* ::= ws* ws", // 339
"ws* ::= ws* ws", // 340
"digit+ ::= digit", // 341
"digit+ ::= digit+ digit", // 342
"printable* ::= printable* printable", // 343
"printable* ::= printable* printable", // 344
"idChar+ ::= idChar", // 345
"idChar+ ::= idChar+ idChar", // 346
"idChar* ::= idChar* idChar", // 347
"idChar* ::= idChar* idChar", // 348
"", // 349
"", // 350
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
    { // 302: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
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
    { // 319: ws ::= "/" "*" commentContent* "*" "/" @void
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
    { // 320: ws ::= "/" "*" [commentContent*] "*" "/" @void
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
    { // 321: commentContent ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 322: commentContent ::= !"*" printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 323: commentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 324: eol ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 325: eol ::= {13} {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 326: eol ::= {13} !10 [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 327: ID ::= !reserved letter idChar** $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 328: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 329: ID ::= !reserved letter !idChar [idChar**] $$1 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 330: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 331: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 332: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 333: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 335: commentContent* ::= commentContent* commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 336: commentContent* ::= [commentContent*] commentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 337: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 341: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 342: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 343: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 344: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 345: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 346: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 347: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 348: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 349: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 350: $$1 ::= ws* @pass
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
