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
public int getEofSym() { return 156; }
public int getNttSym() { return 157; }
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
"letter",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"{\'\"\'..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"\" \"",
"ws",
"9",
"eol",
"10",
"13",
"169",
"132",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 158;}
private static final int MIN_REDUCTION = 585;
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
0x80000000|204, // match move
0x80000000|369, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
  }
,
{ // state 2
2,454, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 4
101,256, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
2,150, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 7
93,306, // "a"
  }
,
{ // state 8
90,345, // "o"
  }
,
{ // state 9
0x80000000|211, // match move
0x80000000|284, // no-match move
0x80000000|33, // NT-test-match state for digit
  }
,
{ // state 10
157,MIN_REDUCTION+257, // $NT
  }
,
{ // state 11
108,479, // "h"
  }
,
{ // state 12
92,549, // "e"
  }
,
{ // state 13
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 14
103,239, // "f"
  }
,
{ // state 15
108,115, // "h"
  }
,
{ // state 16
104,303, // "i"
  }
,
{ // state 17
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 20
99,319, // "s"
  }
,
{ // state 21
122,390, // "+"
  }
,
{ // state 22
104,541, // "i"
  }
,
{ // state 23
90,236, // "o"
  }
,
{ // state 24
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 25
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 26
2,92, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 27
107,529, // "p"
  }
,
{ // state 28
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 29
99,208, // "s"
  }
,
{ // state 30
0x80000000|142, // match move
0x80000000|330, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 31
92,321, // "e"
  }
,
{ // state 32
0x80000000|169, // match move
0x80000000|560, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 33
136,258, // "0"
139,258, // {"1".."9"}
  }
,
{ // state 34
0x80000000|36, // match move
0x80000000|146, // no-match move
0x80000000|33, // NT-test-match state for digit
  }
,
{ // state 35
91,287, // "l"
  }
,
{ // state 36
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 37
94,410, // "n"
  }
,
{ // state 38
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 39
99,421, // "s"
101,414, // "t"
  }
,
{ // state 40
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 41
0x80000000|292, // match move
0x80000000|462, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 42
99,550, // "s"
  }
,
{ // state 43
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 44
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 45
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 46
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 47
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 48
108,338, // "h"
  }
,
{ // state 49
101,81, // "t"
  }
,
{ // state 50
104,301, // "i"
  }
,
{ // state 51
2,544, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 52
92,116, // "e"
  }
,
{ // state 53
2,199, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 55
94,517, // "n"
  }
,
{ // state 56
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 57
2,145, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 58
93,350, // "a"
  }
,
{ // state 59
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 61
112,445, // "g"
  }
,
{ // state 62
90,575, // "o"
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|113, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 64
109,279, // "v"
  }
,
{ // state 65
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 66
101,536, // "t"
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 68
2,555, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 69
101,289, // "t"
  }
,
{ // state 70
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 71
124,494, // "-"
  }
,
{ // state 72
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 73
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 74
2,291, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 75
94,39, // "n"
  }
,
{ // state 76
2,77, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 77
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 78
2,193, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 79
99,242, // "s"
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|467, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 82
101,344, // "t"
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 84
89,386, // "b"
  }
,
{ // state 85
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
266, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
-1, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
342, // intLit2
463, // "0"
210, // digit++
34, // digit
463, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
415, // {169}
317, // {132}
-1, // token*
9, // digit+
MIN_REDUCTION+274, // $
-1, // $NT
  }
,
{ // state 86
99,563, // "s"
101,312, // "t"
  }
,
{ // state 87
91,58, // "l"
104,446, // "i"
  }
,
{ // state 88
2,25, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 89
156,MIN_REDUCTION+0, // $
  }
,
{ // state 90
93,129, // "a"
106,103, // "u"
110,308, // "y"
  }
,
{ // state 91
102,450, // "d"
  }
,
{ // state 92
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 93
90,351, // "o"
  }
,
{ // state 94
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 95
2,188, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 98
91,147, // "l"
94,377, // "n"
96,14, // "r"
100,570, // "x"
  }
,
{ // state 99
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 100
101,393, // "t"
  }
,
{ // state 101
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 103
92,433, // "e"
  }
,
{ // state 104
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 106
90,244, // "o"
104,64, // "i"
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 108
91,407, // "l"
  }
,
{ // state 109
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 110
91,364, // "l"
  }
,
{ // state 111
111,304, // "m"
  }
,
{ // state 112
94,162, // "n"
  }
,
{ // state 113
2,370, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 114
90,87, // "o"
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|76, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 116
0x80000000|1, // match move
0x80000000|237, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 117
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 118
2,453, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 120
104,376, // "i"
  }
,
{ // state 121
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 122
-1, // $$start
89, // start
32, // ws*
398, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
441, // ws
-1, // {9}
347, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
353, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 123
104,459, // "i"
  }
,
{ // state 124
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 125
2,172, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 126
2,229, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 127
90,400, // "o"
  }
,
{ // state 128
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
266, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
412, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
-1, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
354, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
342, // intLit2
-1, // "0"
210, // digit++
34, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
-1, // token*
9, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 129
94,426, // "n"
  }
,
{ // state 130
2,249, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 131
108,392, // "h"
  }
,
{ // state 132
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 133
93,307, // "a"
  }
,
{ // state 134
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 136
93,110, // "a"
  }
,
{ // state 137
96,374, // "r"
  }
,
{ // state 138
92,404, // "e"
  }
,
{ // state 139
98,131, // "c"
  }
,
{ // state 140
0x80000000|475, // match move
0x80000000|288, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 141
93,285, // "a"
  }
,
{ // state 142
115,403, // "="
  }
,
{ // state 143
105,470, // "w"
  }
,
{ // state 144
92,401, // "e"
  }
,
{ // state 145
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 147
99,452, // "s"
  }
,
{ // state 148
99,322, // "s"
  }
,
{ // state 149
2,70, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 150
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 151
90,565, // "o"
  }
,
{ // state 152
107,138, // "p"
  }
,
{ // state 153
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 154
2,484, // ws*
147,441, // ws
149,347, // eol
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 156
2,72, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 157
2,45, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 158
2,259, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 160
2,335, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 162
106,505, // "u"
  }
,
{ // state 163
140,238, // "'"
  }
,
{ // state 164
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|372, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 166
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 167
2,218, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 168
0x80000000|311, // match move
0x80000000|213, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 169
0x80000000|1, // match move
0x80000000|286, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 170
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 172
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 174
97,519, // "k"
  }
,
{ // state 175
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 176
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 177
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 178
2,182, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 179
103,503, // "f"
  }
,
{ // state 180
157,MIN_REDUCTION+255, // $NT
  }
,
{ // state 181
0x80000000|496, // match move
0x80000000|562, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 182
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 183
2,47, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 184
92,507, // "e"
  }
,
{ // state 185
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 186
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 187
90,75, // "o"
91,141, // "l"
93,86, // "a"
108,439, // "h"
  }
,
{ // state 188
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 189
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 190
91,534, // "l"
  }
,
{ // state 191
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 193
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 196
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 197
2,487, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 198
98,469, // "c"
  }
,
{ // state 199
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 200
92,455, // "e"
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|417, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 202
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 203
94,61, // "n"
  }
,
{ // state 204
0x80000000|1, // match move
0x80000000|326, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 205
94,97, // "n"
  }
,
{ // state 206
92,540, // "e"
  }
,
{ // state 207
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 208
0x80000000|1, // match move
0x80000000|156, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 209
0x80000000|480, // match move
0x80000000|194, // no-match move
0x80000000|33, // NT-test-match state for digit
  }
,
{ // state 210
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 211
136,463, // "0"
138,209, // digit
139,463, // {"1".."9"}
  }
,
{ // state 212
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 213
-1, // $$start
-1, // start
340, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
430, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
MIN_REDUCTION+186, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+186, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
441, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 214
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 215
92,566, // "e"
  }
,
{ // state 216
101,548, // "t"
  }
,
{ // state 217
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 218
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 219
89,515, // "b"
  }
,
{ // state 220
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 221
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 222
2,391, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 223
2,28, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 224
0x80000000|315, // match move
0x80000000|132, // no-match move
// T-test match for 10:
150,
  }
,
{ // state 225
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 226
2,250, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 228
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 229
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 230
2,302, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 231
-1, // $$start
89, // start
32, // ws*
398, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
-1, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
342, // intLit2
463, // "0"
210, // digit++
34, // digit
463, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
441, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
353, // token*
9, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 232
93,468, // "a"
  }
,
{ // state 233
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 234
92,444, // "e"
  }
,
{ // state 235
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 236
91,518, // "l"
  }
,
{ // state 237
2,297, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 238
2,254, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 239
93,528, // "a"
  }
,
{ // state 240
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // start
-1, // ws*
466, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
-1, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
342, // intLit2
463, // "0"
210, // digit++
34, // digit
463, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
43, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
353, // token*
9, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 242
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 243
2,264, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 244
101,443, // "t"
  }
,
{ // state 245
104,257, // "i"
108,338, // "h"
  }
,
{ // state 246
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 247
104,294, // "i"
  }
,
{ // state 248
2,431, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 249
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 250
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 251
101,509, // "t"
  }
,
{ // state 252
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 253
92,577, // "e"
  }
,
{ // state 254
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 256
106,543, // "u"
  }
,
{ // state 257
101,580, // "t"
  }
,
{ // state 258
157,MIN_REDUCTION+252, // $NT
  }
,
{ // state 259
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 260
97,107, // "k"
  }
,
{ // state 261
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 262
96,495, // "r"
  }
,
{ // state 263
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 264
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 265
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 266
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|349, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 268
2,176, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 269
96,14, // "r"
  }
,
{ // state 270
109,568, // "v"
  }
,
{ // state 271
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 272
2,202, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 273
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 275
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 277
101,406, // "t"
  }
,
{ // state 278
90,418, // "o"
91,336, // "l"
93,324, // "a"
104,457, // "i"
  }
,
{ // state 279
93,66, // "a"
  }
,
{ // state 280
0x80000000|1, // match move
0x80000000|358, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 281
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 283
101,29, // "t"
  }
,
{ // state 284
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 285
99,42, // "s"
  }
,
{ // state 286
-1, // $$start
-1, // start
-1, // ws*
466, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
412, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
-1, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
354, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
342, // intLit2
-1, // "0"
210, // digit++
34, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
43, // ws
-1, // {9}
347, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
353, // token*
9, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 287
101,378, // "t"
  }
,
{ // state 288
-1, // $$start
-1, // start
510, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
98, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
MIN_REDUCTION+108, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+108, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
441, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 289
93,37, // "a"
  }
,
{ // state 290
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 291
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 292
106,84, // "u"
  }
,
{ // state 293
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 294
98,346, // "c"
  }
,
{ // state 295
0x80000000|497, // match move
0x80000000|168, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 296
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 297
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 298
2,316, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 299
0x80000000|502, // match move
0x80000000|332, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 300
92,4, // "e"
  }
,
{ // state 301
113,12, // "z"
  }
,
{ // state 302
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 303
92,55, // "e"
  }
,
{ // state 304
0x80000000|1, // match move
0x80000000|230, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 305
92,547, // "e"
  }
,
{ // state 306
101,67, // "t"
  }
,
{ // state 307
98,49, // "c"
  }
,
{ // state 308
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 309
0x80000000|1, // match move
0x80000000|516, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 310
2,532, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 311
2,340, // ws*
147,441, // ws
149,347, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 312
98,11, // "c"
  }
,
{ // state 313
2,538, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 315
150,531, // {10}
  }
,
{ // state 316
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 318
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 319
92,381, // "e"
  }
,
{ // state 320
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 321
0x80000000|1, // match move
0x80000000|394, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 322
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 323
99,69, // "s"
101,379, // "t"
  }
,
{ // state 324
91,20, // "l"
  }
,
{ // state 325
101,31, // "t"
  }
,
{ // state 326
-1, // $$start
89, // start
32, // ws*
398, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
412, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
-1, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
354, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
342, // intLit2
-1, // "0"
210, // digit++
34, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
441, // ws
-1, // {9}
347, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
353, // token*
9, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 327
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 329
0x80000000|472, // match move
0x80000000|573, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 330
2,471, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 331
102,79, // "d"
  }
,
{ // state 332
2,395, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 333
93,448, // "a"
96,106, // "r"
106,219, // "u"
  }
,
{ // state 334
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 335
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 336
90,7, // "o"
  }
,
{ // state 337
90,203, // "o"
110,201, // "y"
  }
,
{ // state 338
104,108, // "i"
  }
,
{ // state 339
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 340
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 342
2,281, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 343
115,57, // "="
  }
,
{ // state 344
103,27, // "f"
  }
,
{ // state 345
101,62, // "t"
  }
,
{ // state 346
0x80000000|1, // match move
0x80000000|272, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 347
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 348
112,52, // "g"
  }
,
{ // state 349
2,559, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 350
101,22, // "t"
  }
,
{ // state 351
94,50, // "n"
  }
,
{ // state 352
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 353
0x80000000|508, // match move
0x80000000|513, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|160, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 355
117,226, // "&"
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|440, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 357
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 358
2,574, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 359
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 361
91,147, // "l"
94,377, // "n"
100,570, // "x"
  }
,
{ // state 362
90,23, // "o"
96,305, // "r"
110,325, // "y"
  }
,
{ // state 363
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 364
0x80000000|464, // match move
0x80000000|535, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 365
99,100, // "s"
  }
,
{ // state 366
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 368
0x80000000|343, // match move
0x80000000|310, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 369
0x80000000|122, // match move
0x80000000|231, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 370
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 371
106,35, // "u"
  }
,
{ // state 372
2,228, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 373
94,323, // "n"
103,525, // "f"
111,564, // "m"
  }
,
{ // state 374
101,506, // "t"
  }
,
{ // state 375
93,411, // "a"
96,530, // "r"
108,380, // "h"
  }
,
{ // state 376
98,82, // "c"
  }
,
{ // state 377
106,111, // "u"
  }
,
{ // state 378
0x80000000|1, // match move
0x80000000|556, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 379
0x80000000|477, // match move
0x80000000|140, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 380
96,127, // "r"
104,148, // "i"
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|313, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 382
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 383
2,104, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 385
2,273, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 386
91,483, // "l"
  }
,
{ // state 387
0x80000000|71, // match move
0x80000000|157, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 388
92,91, // "e"
  }
,
{ // state 389
2,521, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 390
2,246, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 391
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 392
96,93, // "r"
  }
,
{ // state 393
96,133, // "r"
  }
,
{ // state 394
2,46, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 395
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 397
94,139, // "n"
  }
,
{ // state 398
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 399
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
266, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
-1, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 400
105,295, // "w"
  }
,
{ // state 401
90,456, // "o"
  }
,
{ // state 402
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 403
2,296, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 404
96,442, // "r"
  }
,
{ // state 405
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 406
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 407
92,63, // "e"
  }
,
{ // state 408
157,MIN_REDUCTION+258, // $NT
  }
,
{ // state 409
2,214, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 410
98,144, // "c"
  }
,
{ // state 411
101,123, // "t"
  }
,
{ // state 412
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 413
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 414
104,112, // "i"
  }
,
{ // state 415
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 416
2,59, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 417
2,240, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 418
96,280, // "r"
  }
,
{ // state 419
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 421
101,267, // "t"
  }
,
{ // state 422
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 423
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 424
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 425
0x80000000|21, // match move
0x80000000|74, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 426
99,16, // "s"
  }
,
{ // state 427
2,488, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 429
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 430
0x80000000|545, // match move
0x80000000|181, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 431
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 432
-1, // $$start
-1, // start
484, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
337, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
491, // "t"
572, // "d"
278, // "f"
373, // "i"
48, // "w"
-1, // "u"
333, // "p"
-1, // "h"
114, // "v"
-1, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
MIN_REDUCTION+154, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+154, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
441, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 434
2,221, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 435
134,542, // "|"
  }
,
{ // state 436
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 438
110,201, // "y"
  }
,
{ // state 439
93,262, // "a"
  }
,
{ // state 440
2,73, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 442
0x80000000|1, // match move
0x80000000|385, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 443
92,198, // "e"
  }
,
{ // state 444
96,277, // "r"
  }
,
{ // state 445
0x80000000|1, // match move
0x80000000|88, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 446
102,185, // "d"
  }
,
{ // state 447
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 448
98,174, // "c"
  }
,
{ // state 449
89,408, // "b"
90,408, // "o"
91,408, // "l"
92,408, // "e"
93,408, // "a"
94,408, // "n"
96,408, // "r"
97,408, // "k"
98,408, // "c"
99,408, // "s"
100,408, // "x"
101,408, // "t"
102,408, // "d"
103,408, // "f"
104,408, // "i"
105,408, // "w"
106,408, // "u"
107,408, // "p"
108,408, // "h"
109,408, // "v"
110,408, // "y"
111,408, // "m"
112,408, // "g"
113,408, // "z"
136,258, // "0"
138,527, // digit
139,258, // {"1".."9"}
142,180, // letter
143,10, // "_"
144,408, // {"A".."Z" "j" "q"}
  }
,
{ // state 450
0x80000000|1, // match move
0x80000000|571, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 451
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 452
92,83, // "e"
  }
,
{ // state 453
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 454
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 455
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 456
103,80, // "f"
  }
,
{ // state 457
94,136, // "n"
  }
,
{ // state 458
2,189, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 459
98,533, // "c"
  }
,
{ // state 460
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 461
2,546, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 462
2,366, // ws*
106,84, // "u"
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 463
0x80000000|105, // match move
0x80000000|419, // no-match move
0x80000000|33, // NT-test-match state for digit
  }
,
{ // state 464
91,438, // "l"
  }
,
{ // state 465
101,526, // "t"
105,537, // "w"
106,152, // "u"
108,151, // "h"
110,397, // "y"
  }
,
{ // state 466
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 467
2,271, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 468
94,520, // "n"
  }
,
{ // state 469
101,388, // "t"
  }
,
{ // state 470
0x80000000|1, // match move
0x80000000|51, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 471
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 472
115,167, // "="
  }
,
{ // state 473
0x80000000|1, // match move
0x80000000|409, // no-match move
// T-test match for {"*" "/"}:
120,
121,
  }
,
{ // state 474
2,225, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 475
2,510, // ws*
147,441, // ws
149,347, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 476
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 477
92,269, // "e"
  }
,
{ // state 478
2,490, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 479
0x80000000|1, // match move
0x80000000|583, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 480
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 481
2,196, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 482
90,203, // "o"
  }
,
{ // state 483
92,492, // "e"
  }
,
{ // state 484
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 485
-1, // $$start
-1, // start
-1, // ws*
466, // $$0
99, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "/"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // " "
43, // ws
-1, // {9}
347, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // {132}
353, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 486
2,561, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 487
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 488
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 489
2,359, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 490
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 491
96,90, // "r"
108,380, // "h"
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|130, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 493
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 494
2,413, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|427, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 496
2,581, // ws*
147,441, // ws
149,347, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 497
99,309, // "s"
  }
,
{ // state 498
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 499
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 500
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 502
115,118, // "="
  }
,
{ // state 503
93,371, // "a"
  }
,
{ // state 504
89,212, // "b"
90,212, // "o"
91,212, // "l"
92,212, // "e"
93,212, // "a"
94,212, // "n"
96,212, // "r"
97,212, // "k"
98,212, // "c"
99,212, // "s"
100,212, // "x"
101,212, // "t"
102,212, // "d"
103,212, // "f"
104,212, // "i"
105,212, // "w"
106,212, // "u"
107,212, // "p"
108,212, // "h"
109,212, // "v"
110,212, // "y"
111,212, // "m"
112,212, // "g"
113,212, // "z"
114,212, // "!"
115,212, // "="
116,212, // "%"
117,212, // "&"
118,212, // "("
119,212, // ")"
120,212, // "*"
121,212, // "/"
122,212, // "+"
123,212, // ","
124,212, // "-"
125,212, // "."
126,212, // ":"
127,212, // ";"
128,212, // "<"
129,212, // ">"
130,212, // "["
131,212, // "]"
132,212, // "{"
133,212, // "}"
134,212, // "|"
136,212, // "0"
139,212, // {"1".."9"}
140,212, // "'"
141,163, // printable
143,212, // "_"
144,212, // {"A".."Z" "j" "q"}
145,212, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
146,212, // " "
  }
,
{ // state 505
92,265, // "e"
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|569, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 507
111,253, // "m"
  }
,
{ // state 508
0x80000000|1, // match move
0x80000000|128, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 509
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 510
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 511
2,24, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 512
92,143, // "e"
93,216, // "a"
106,190, // "u"
  }
,
{ // state 513
0x80000000|399, // match move
0x80000000|85, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 514
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 515
91,247, // "l"
  }
,
{ // state 516
2,581, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 517
101,19, // "t"
  }
,
{ // state 518
92,232, // "e"
  }
,
{ // state 519
93,348, // "a"
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 521
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 522
99,234, // "s"
  }
,
{ // state 523
90,137, // "o"
91,184, // "l"
  }
,
{ // state 524
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 525
0x80000000|1, // match move
0x80000000|434, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 526
93,411, // "a"
96,120, // "r"
  }
,
{ // state 527
157,MIN_REDUCTION+256, // $NT
  }
,
{ // state 528
98,200, // "c"
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 530
93,129, // "a"
104,376, // "i"
106,103, // "u"
110,308, // "y"
  }
,
{ // state 531
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 532
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 533
0x80000000|1, // match move
0x80000000|461, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 534
91,177, // "l"
  }
,
{ // state 535
0x80000000|154, // match move
0x80000000|432, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 536
92,165, // "e"
  }
,
{ // state 537
104,257, // "i"
  }
,
{ // state 538
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 539
2,514, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 540
94,331, // "n"
  }
,
{ // state 541
91,215, // "l"
  }
,
{ // state 542
2,117, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 543
96,205, // "r"
  }
,
{ // state 544
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 545
101,526, // "t"
105,537, // "w"
106,152, // "u"
108,151, // "h"
110,397, // "y"
  }
,
{ // state 546
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 547
93,260, // "a"
  }
,
{ // state 548
104,270, // "i"
  }
,
{ // state 549
102,422, // "d"
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|486, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 551
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 552
2,44, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+122, // (default reduction)
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
{ // state 553
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 554
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 555
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 556
2,235, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 558
2,207, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 559
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 560
0x80000000|485, // match move
0x80000000|241, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 561
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 562
-1, // $$start
-1, // start
581, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
173, // `boolean
567, // `class
175, // `extends
5, // `void
233, // `int
290, // `while
423, // `if
124, // `else
429, // `for
500, // `break
191, // `this
161, // `false
252, // `true
217, // `super
40, // `null
96, // `return
339, // `instanceof
501, // `new
314, // `abstract
396, // `assert
576, // `byte
436, // `case
578, // `catch
357, // `char
420, // `const
493, // `continue
476, // `default
367, // `do
153, // `double
60, // `enum
119, // `final
276, // `finally
101, // `float
166, // `goto
499, // `implements
54, // `import
261, // `interface
405, // `long
320, // `native
402, // `package
282, // `private
38, // `protected
293, // `public
551, // `short
171, // `static
352, // `strictfp
94, // `switch
360, // `synchronized
451, // `throw
56, // `throws
263, // `transient
18, // `try
227, // `volatile
334, // `!
384, // `!=
65, // `%
460, // `&&
-1, // `*
498, // `(
255, // `)
328, // `{
447, // `}
363, // `-
13, // `+
186, // `=
195, // `==
159, // `[
327, // `]
341, // `||
134, // `<
121, // `<=
554, // `,
109, // `>
102, // `>=
135, // `.
170, // `;
437, // `++
220, // `--
192, // `/
275, // `:
557, // ID
382, // INTLIT
164, // STRINGLIT
428, // CHARLIT
362, // "b"
-1, // "o"
482, // "l"
361, // "e"
582, // "a"
512, // "n"
-1, // idChar
300, // "r"
-1, // "k"
187, // "c"
465, // "s"
-1, // "x"
375, // "t"
572, // "d"
278, // "f"
373, // "i"
245, // "w"
152, // "u"
333, // "p"
151, // "h"
114, // "v"
397, // "y"
-1, // "m"
8, // "g"
-1, // "z"
299, // "!"
30, // "="
78, // "%"
355, // "&"
126, // "("
481, // ")"
MIN_REDUCTION+188, // "*"
473, // "/"
425, // "+"
383, // ","
387, // "-"
223, // "."
53, // ":"
6, // ";"
368, // "<"
329, // ">"
416, // "["
579, // "]"
243, // "{"
95, // "}"
435, // "|"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+188, // {"1".."9"}
504, // "'"
-1, // printable
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
155, // " "
441, // ws
155, // {9}
347, // eol
524, // {10}
224, // {13}
415, // {169}
317, // {132}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 563
92,274, // "e"
  }
,
{ // state 564
107,523, // "p"
  }
,
{ // state 565
96,251, // "r"
  }
,
{ // state 566
0x80000000|1, // match move
0x80000000|489, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 567
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 568
92,356, // "e"
  }
,
{ // state 569
2,424, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 570
101,206, // "t"
  }
,
{ // state 571
2,17, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 572
90,41, // "o"
92,179, // "e"
  }
,
{ // state 573
2,318, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 574
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|474, // no-match move
0x80000000|449, // NT-test-match state for idChar
  }
,
{ // state 576
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 577
94,283, // "n"
  }
,
{ // state 578
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 579
2,3, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 580
98,15, // "c"
  }
,
{ // state 581
146,155, // " "
147,43, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 582
89,365, // "b"
99,522, // "s"
  }
,
{ // state 583
2,553, // ws*
146,155, // " "
147,441, // ws
148,155, // {9}
149,347, // eol
150,524, // {10}
151,224, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[584][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
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
(135<<16)+1,
// digit ::= {"0".."9"}
(138<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(142<<16)+1,
// printable ::= {" ".."~"}
(141<<16)+1,
// ws ::= {9 " "}
(147<<16)+1,
// ws ::= eol
(147<<16)+1,
// eol ::= {10}
(149<<16)+1,
// eol ::= {13} {10}
(149<<16)+2,
// eol ::= {13} !10
(149<<16)+1,
// ID ::= {169}
(85<<16)+1,
// STRINGLIT ::= {132}
(87<<16)+1,
// token* ::= token* token
(154<<16)+2,
// token* ::= token
(154<<16)+1,
// digit++ ::= digit+ !digit
(137<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(155<<16)+1,
// digit+ ::= digit+ digit
(155<<16)+2,
// $$0 ::= token*
(3<<16)+1,
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
148, // 9
150, // 10
-1, // 11
-1, // 12
151, // 13
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
146, // " "
114, // "!"
145, // '"'
145, // "#"
145, // "$"
116, // "%"
117, // "&"
140, // "'"
118, // "("
119, // ")"
120, // "*"
122, // "+"
123, // ","
124, // "-"
125, // "."
121, // "/"
136, // "0"
139, // "1"
139, // "2"
139, // "3"
139, // "4"
139, // "5"
139, // "6"
139, // "7"
139, // "8"
139, // "9"
126, // ":"
127, // ";"
128, // "<"
115, // "="
129, // ">"
145, // "?"
145, // "@"
144, // "A"
144, // "B"
144, // "C"
144, // "D"
144, // "E"
144, // "F"
144, // "G"
144, // "H"
144, // "I"
144, // "J"
144, // "K"
144, // "L"
144, // "M"
144, // "N"
144, // "O"
144, // "P"
144, // "Q"
144, // "R"
144, // "S"
144, // "T"
144, // "U"
144, // "V"
144, // "W"
144, // "X"
144, // "Y"
144, // "Z"
130, // "["
145, // "\"
131, // "]"
145, // "^"
143, // "_"
145, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
144, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
144, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
132, // "{"
134, // "|"
133, // "}"
145, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
153, // 132
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
152, // 169
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
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 91
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 92
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 93
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 94
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 95
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 96
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 97
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 98
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 99
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 100
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 101
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 102
"`if ::= \"i\" \"f\" !idChar ws*", // 103
"`if ::= \"i\" \"f\" !idChar ws*", // 104
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 105
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 106
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 107
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 108
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 109
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 110
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 111
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 112
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 113
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 114
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 115
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 116
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 117
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 118
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 119
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 120
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 121
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 122
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 123
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 124
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 125
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 126
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 127
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 128
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 129
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 130
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 131
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 132
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 133
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 134
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 135
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 136
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 137
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 138
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 139
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 140
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 141
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 142
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 143
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 144
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 145
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 146
"`do ::= \"d\" \"o\" !idChar ws*", // 147
"`do ::= \"d\" \"o\" !idChar ws*", // 148
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 149
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 150
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 151
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 152
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 153
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 154
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 155
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 156
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 157
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 158
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 159
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 160
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 161
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 162
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 163
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 164
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 165
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 166
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 167
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 168
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 169
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 170
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 171
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 172
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 173
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 174
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 175
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 176
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 177
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 178
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 179
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 180
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 181
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 182
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 183
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 184
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 185
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 186
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 187
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 188
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 189
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 190
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 191
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 192
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 193
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 194
"`! ::= \"!\" !\"=\" ws*", // 195
"`! ::= \"!\" !\"=\" ws*", // 196
"`!= ::= \"!\" \"=\" ws*", // 197
"`!= ::= \"!\" \"=\" ws*", // 198
"`% ::= \"%\" ws*", // 199
"`% ::= \"%\" ws*", // 200
"`&& ::= \"&\" \"&\" ws*", // 201
"`&& ::= \"&\" \"&\" ws*", // 202
"`( ::= \"(\" ws*", // 203
"`( ::= \"(\" ws*", // 204
"`) ::= \")\" ws*", // 205
"`) ::= \")\" ws*", // 206
"`* ::= \"*\" !\"/\" ws*", // 207
"`* ::= \"*\" !\"/\" ws*", // 208
"`+ ::= \"+\" !\"+\" ws*", // 209
"`+ ::= \"+\" !\"+\" ws*", // 210
"`++ ::= \"+\" \"+\" ws*", // 211
"`++ ::= \"+\" \"+\" ws*", // 212
"`, ::= \",\" ws*", // 213
"`, ::= \",\" ws*", // 214
"`- ::= \"-\" !\"-\" ws*", // 215
"`- ::= \"-\" !\"-\" ws*", // 216
"`-- ::= \"-\" \"-\" ws*", // 217
"`-- ::= \"-\" \"-\" ws*", // 218
"`. ::= \".\" ws*", // 219
"`. ::= \".\" ws*", // 220
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 221
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 222
"`: ::= \":\" ws*", // 223
"`: ::= \":\" ws*", // 224
"`; ::= \";\" ws*", // 225
"`; ::= \";\" ws*", // 226
"`< ::= \"<\" !\"=\" ws*", // 227
"`< ::= \"<\" !\"=\" ws*", // 228
"`<= ::= \"<\" \"=\" ws*", // 229
"`<= ::= \"<\" \"=\" ws*", // 230
"`= ::= \"=\" !\"=\" ws*", // 231
"`= ::= \"=\" !\"=\" ws*", // 232
"`== ::= \"=\" \"=\" ws*", // 233
"`== ::= \"=\" \"=\" ws*", // 234
"`> ::= \">\" !\"=\" ws*", // 235
"`> ::= \">\" !\"=\" ws*", // 236
"`>= ::= \">\" \"=\" ws*", // 237
"`>= ::= \">\" \"=\" ws*", // 238
"`[ ::= \"[\" ws*", // 239
"`[ ::= \"[\" ws*", // 240
"`] ::= \"]\" ws*", // 241
"`] ::= \"]\" ws*", // 242
"`{ ::= \"{\" ws*", // 243
"`{ ::= \"{\" ws*", // 244
"`} ::= \"}\" ws*", // 245
"`} ::= \"}\" ws*", // 246
"`|| ::= \"|\" \"|\" ws*", // 247
"`|| ::= \"|\" \"|\" ws*", // 248
"INTLIT ::= # intLit2 ws*", // 249
"INTLIT ::= # intLit2 ws*", // 250
"intLit2 ::= !\"0\" digit++", // 251
"digit ::= {\"0\"..\"9\"}", // 252
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 253
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 254
"idChar ::= letter", // 255
"idChar ::= digit", // 256
"idChar ::= \"_\"", // 257
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 258
"printable ::= {\" \"..\"~\"}", // 259
"ws ::= {9 \" \"}", // 260
"ws ::= eol", // 261
"eol ::= {10} registerNewline", // 262
"eol ::= {13} {10} registerNewline", // 263
"eol ::= {13} !10 registerNewline", // 264
"ID ::= {169}", // 265
"STRINGLIT ::= {132}", // 266
"token* ::= token* token", // 267
"token* ::= token* token", // 268
"digit++ ::= digit+ !digit", // 269
"ws* ::= ws* ws", // 270
"ws* ::= ws* ws", // 271
"digit+ ::= digit", // 272
"digit+ ::= digit+ digit", // 273
"", // 274
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 91: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 92: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 93: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 94: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 95: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 96: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 97: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 98: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 99: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 100: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 101: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 104: `if ::= "i" "f" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 105: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 106: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 107: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `null ::= "n" "u" "l" "l" !idChar ws* @void
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
    { // 112: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 113: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 114: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 115: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 116: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 117: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 118: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 119: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 120: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 121: `this ::= "t" "h" "i" "s" !idChar ws* @void
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
    { // 122: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 123: `true ::= "t" "r" "u" "e" !idChar ws* @void
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
    { // 124: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 125: `void ::= "v" "o" "i" "d" !idChar ws* @void
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
    { // 126: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 127: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 128: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 129: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 130: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 131: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 132: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 133: `byte ::= "b" "y" "t" "e" !idChar ws* @void
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
    { // 134: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 135: `case ::= "c" "a" "s" "e" !idChar ws* @void
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
    { // 136: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 137: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 138: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 139: `char ::= "c" "h" "a" "r" !idChar ws* @void
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
    { // 140: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 141: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 142: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 143: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 144: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 145: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 146: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 147: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 148: `do ::= "d" "o" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 149: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 150: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 151: `enum ::= "e" "n" "u" "m" !idChar ws* @void
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
    { // 152: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 153: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 154: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 155: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 156: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 157: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 158: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 159: `goto ::= "g" "o" "t" "o" !idChar ws* @void
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
    { // 160: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 161: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 162: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 163: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 164: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 165: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 166: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 167: `long ::= "l" "o" "n" "g" !idChar ws* @void
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
    { // 168: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
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
    { // 169: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 170: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 171: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 172: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 173: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 174: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 175: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 176: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 177: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 178: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 179: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 180: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 181: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 182: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 183: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 184: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 185: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 186: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 187: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 188: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 189: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 190: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 191: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 192: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 193: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 194: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 195: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `! ::= "!" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 198: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 199: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 202: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 203: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `* ::= "*" !"/" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `+ ::= "+" !"+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 212: `++ ::= "+" "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 213: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `, ::= "," [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `- ::= "-" !"-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 218: `-- ::= "-" "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 219: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `. ::= "." [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `: ::= ":" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `; ::= ";" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `< ::= "<" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 230: `<= ::= "<" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 231: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `= ::= "=" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 234: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 235: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `> ::= ">" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 238: `>= ::= ">" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 239: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `[ ::= "[" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `] ::= "]" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `{ ::= "{" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `} ::= "}" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 248: `|| ::= "|" "|" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 249: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 250: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 251: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 252: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 253: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 254: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 255: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 256: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 257: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 258: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 259: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 260: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 262: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: ID ::= {169} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 266: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 267: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 268: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 269: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 270: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 271: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 272: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 273: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 274: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "token* ::=", // token*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // ws*
    },
    { // token*
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
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
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
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
    1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    0,
    -1,
    -1,
    -1,
    -1,
    0,
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
