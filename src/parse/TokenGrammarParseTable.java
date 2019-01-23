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
public int getEofSym() { return 158; }
public int getNttSym() { return 159; }
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
"10",
"13",
"169",
"token*",
"digit+",
"idChar+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 160;}
private static final int MIN_REDUCTION = 612;
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
0x80000000|217, // match move
0x80000000|388, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
  }
,
{ // state 2
2,476, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 4
101,271, // "t"
  }
,
{ // state 5
0x80000000|137, // match move
0x80000000|296, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 6
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 7
2,156, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 8
93,325, // "a"
  }
,
{ // state 9
90,363, // "o"
  }
,
{ // state 10
0x80000000|224, // match move
0x80000000|303, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 11
159,MIN_REDUCTION+259, // $NT
  }
,
{ // state 12
108,501, // "h"
  }
,
{ // state 13
92,575, // "e"
  }
,
{ // state 14
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 15
103,253, // "f"
  }
,
{ // state 16
108,118, // "h"
  }
,
{ // state 17
104,322, // "i"
  }
,
{ // state 18
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|564, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 21
99,337, // "s"
  }
,
{ // state 22
122,409, // "+"
  }
,
{ // state 23
104,566, // "i"
  }
,
{ // state 24
90,250, // "o"
  }
,
{ // state 25
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 26
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 27
2,95, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 28
107,554, // "p"
  }
,
{ // state 29
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 30
99,221, // "s"
  }
,
{ // state 31
0x80000000|148, // match move
0x80000000|348, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 32
92,339, // "e"
  }
,
{ // state 33
0x80000000|177, // match move
0x80000000|586, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 34
136,274, // "0"
139,274, // {"1".."9"}
  }
,
{ // state 35
0x80000000|37, // match move
0x80000000|152, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 36
91,306, // "l"
  }
,
{ // state 37
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 38
94,431, // "n"
  }
,
{ // state 39
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 40
99,442, // "s"
101,435, // "t"
  }
,
{ // state 41
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 42
0x80000000|311, // match move
0x80000000|484, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 43
99,576, // "s"
  }
,
{ // state 44
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 45
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 46
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 48
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 49
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 50
108,356, // "h"
  }
,
{ // state 51
101,83, // "t"
  }
,
{ // state 52
104,320, // "i"
  }
,
{ // state 53
2,570, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 54
92,119, // "e"
  }
,
{ // state 55
2,211, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 57
94,541, // "n"
  }
,
{ // state 58
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 59
2,151, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 60
93,368, // "a"
  }
,
{ // state 61
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 63
112,467, // "g"
  }
,
{ // state 64
90,602, // "o"
  }
,
{ // state 65
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 66
109,297, // "v"
  }
,
{ // state 67
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 68
101,561, // "t"
  }
,
{ // state 69
0x80000000|1, // match move
0x80000000|235, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 70
2,581, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 71
101,308, // "t"
  }
,
{ // state 72
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 73
124,517, // "-"
  }
,
{ // state 74
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 75
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 76
2,310, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 77
94,40, // "n"
  }
,
{ // state 78
2,79, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 79
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 80
2,203, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 81
99,256, // "s"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|489, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|164, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 84
101,362, // "t"
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 86
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 87
89,405, // "b"
  }
,
{ // state 88
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
283, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
-1, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
360, // intLit2
485, // "0"
223, // digit++
35, // digit
485, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
436, // {169}
-1, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 89
99,589, // "s"
101,331, // "t"
  }
,
{ // state 90
91,60, // "l"
104,468, // "i"
  }
,
{ // state 91
2,26, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 92
158,MIN_REDUCTION+0, // $
  }
,
{ // state 93
93,132, // "a"
106,106, // "u"
110,327, // "y"
  }
,
{ // state 94
102,472, // "d"
  }
,
{ // state 95
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 96
90,369, // "o"
  }
,
{ // state 97
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 98
2,198, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 101
91,153, // "l"
94,396, // "n"
96,15, // "r"
100,596, // "x"
  }
,
{ // state 102
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 103
101,413, // "t"
  }
,
{ // state 104
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 106
92,454, // "e"
  }
,
{ // state 107
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 109
90,258, // "o"
104,66, // "i"
  }
,
{ // state 110
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 111
91,428, // "l"
  }
,
{ // state 112
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 113
91,383, // "l"
  }
,
{ // state 114
111,323, // "m"
  }
,
{ // state 115
94,169, // "n"
  }
,
{ // state 116
2,389, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 117
90,90, // "o"
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|78, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|251, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 120
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 121
2,475, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 123
104,395, // "i"
  }
,
{ // state 124
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 125
-1, // $$start
92, // start
33, // ws*
418, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
-1, // {9}
365, // eol
-1, // {10}
-1, // {13}
-1, // {169}
371, // token*
-1, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 126
104,481, // "i"
  }
,
{ // state 127
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 128
2,181, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 129
2,243, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 130
90,420, // "o"
  }
,
{ // state 131
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
283, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
433, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
-1, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
372, // "*"
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
360, // intLit2
-1, // "0"
223, // digit++
35, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // token*
10, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 132
94,447, // "n"
  }
,
{ // state 133
0x80000000|140, // match move
0x80000000|208, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 134
2,264, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 135
108,412, // "h"
  }
,
{ // state 136
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 138
93,326, // "a"
  }
,
{ // state 139
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 142
93,113, // "a"
  }
,
{ // state 143
96,393, // "r"
  }
,
{ // state 144
92,424, // "e"
  }
,
{ // state 145
98,135, // "c"
  }
,
{ // state 146
0x80000000|497, // match move
0x80000000|307, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 147
93,304, // "a"
  }
,
{ // state 148
115,423, // "="
  }
,
{ // state 149
105,492, // "w"
  }
,
{ // state 150
92,421, // "e"
  }
,
{ // state 151
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 153
99,474, // "s"
  }
,
{ // state 154
99,340, // "s"
  }
,
{ // state 155
2,72, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 156
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 157
90,591, // "o"
  }
,
{ // state 158
107,144, // "p"
  }
,
{ // state 159
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 160
2,506, // ws*
149,463, // ws
151,365, // eol
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 162
2,74, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 163
2,46, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 164
2,276, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 166
2,353, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 168
89,133, // "b"
90,133, // "o"
91,133, // "l"
92,133, // "e"
93,133, // "a"
94,133, // "n"
95,461, // idChar
96,133, // "r"
97,133, // "k"
98,133, // "c"
99,133, // "s"
100,133, // "x"
101,133, // "t"
102,133, // "d"
103,133, // "f"
104,133, // "i"
105,133, // "w"
106,133, // "u"
107,133, // "p"
108,133, // "h"
109,133, // "v"
110,133, // "y"
111,133, // "m"
112,133, // "g"
113,133, // "z"
136,509, // "0"
138,275, // digit
139,509, // {"1".."9"}
144,427, // letter
145,5, // "_"
146,133, // {"A".."Z" "j" "q"}
  }
,
{ // state 169
106,528, // "u"
  }
,
{ // state 170
140,252, // "'"
  }
,
{ // state 171
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 172
0x80000000|1, // match move
0x80000000|391, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 173
2,86, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 175
2,231, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 176
0x80000000|330, // match move
0x80000000|226, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 177
0x80000000|1, // match move
0x80000000|305, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 178
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 181
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 183
97,543, // "k"
  }
,
{ // state 184
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 185
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|128, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 187
2,192, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 188
103,526, // "f"
  }
,
{ // state 189
159,MIN_REDUCTION+257, // $NT
  }
,
{ // state 190
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 191
0x80000000|519, // match move
0x80000000|588, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 192
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 193
2,49, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 194
92,530, // "e"
  }
,
{ // state 195
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 196
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 197
90,77, // "o"
91,147, // "l"
93,89, // "a"
108,460, // "h"
  }
,
{ // state 198
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 199
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 200
91,559, // "l"
  }
,
{ // state 201
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 203
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 205
0x80000000|601, // match move
0x80000000|272, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 206
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 207
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 209
2,510, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 210
98,491, // "c"
  }
,
{ // state 211
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 212
92,477, // "e"
  }
,
{ // state 213
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 214
142,173, // '"'
  }
,
{ // state 215
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 216
94,63, // "n"
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|344, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 218
94,100, // "n"
  }
,
{ // state 219
92,565, // "e"
  }
,
{ // state 220
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 221
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 222
0x80000000|502, // match move
0x80000000|204, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 223
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 224
136,485, // "0"
138,222, // digit
139,485, // {"1".."9"}
  }
,
{ // state 225
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 226
-1, // $$start
-1, // start
358, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
451, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
MIN_REDUCTION+186, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+186, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 227
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 228
92,592, // "e"
  }
,
{ // state 229
101,574, // "t"
  }
,
{ // state 230
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 231
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 232
89,539, // "b"
  }
,
{ // state 233
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 234
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 235
2,411, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 236
2,29, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 237
0x80000000|334, // match move
0x80000000|136, // no-match move
// T-test match for 10:
152,
  }
,
{ // state 238
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 239
2,265, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 242
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 243
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 244
2,321, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 245
-1, // $$start
92, // start
33, // ws*
418, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
-1, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
360, // intLit2
485, // "0"
223, // digit++
35, // digit
485, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
371, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 246
93,490, // "a"
  }
,
{ // state 247
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 248
92,466, // "e"
  }
,
{ // state 249
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 250
91,542, // "l"
  }
,
{ // state 251
2,316, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 252
2,269, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 253
93,553, // "a"
  }
,
{ // state 254
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 255
-1, // $$start
-1, // start
-1, // ws*
488, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
-1, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
360, // intLit2
485, // "0"
223, // digit++
35, // digit
485, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
44, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
371, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 257
2,281, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 258
101,465, // "t"
  }
,
{ // state 259
104,273, // "i"
108,356, // "h"
  }
,
{ // state 260
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 261
104,313, // "i"
  }
,
{ // state 262
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 263
2,452, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 264
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 265
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 266
101,532, // "t"
  }
,
{ // state 267
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 268
92,604, // "e"
  }
,
{ // state 269
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 271
106,569, // "u"
  }
,
{ // state 272
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 273
101,607, // "t"
  }
,
{ // state 274
159,MIN_REDUCTION+252, // $NT
  }
,
{ // state 275
0x80000000|240, // match move
0x80000000|298, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 276
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 277
97,110, // "k"
  }
,
{ // state 278
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 279
96,518, // "r"
  }
,
{ // state 280
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 281
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 283
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|367, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 285
2,185, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 286
96,15, // "r"
  }
,
{ // state 287
109,594, // "v"
  }
,
{ // state 288
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 289
2,215, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 290
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 291
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 292
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 294
101,426, // "t"
  }
,
{ // state 295
90,439, // "o"
91,354, // "l"
93,342, // "a"
104,479, // "i"
  }
,
{ // state 296
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 297
93,68, // "a"
  }
,
{ // state 298
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 299
0x80000000|1, // match move
0x80000000|377, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 300
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 302
101,30, // "t"
  }
,
{ // state 303
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 304
99,43, // "s"
  }
,
{ // state 305
-1, // $$start
-1, // start
-1, // ws*
488, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
433, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
-1, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
372, // "*"
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
360, // intLit2
-1, // "0"
223, // digit++
35, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
44, // ws
-1, // {9}
365, // eol
-1, // {10}
-1, // {13}
-1, // {169}
371, // token*
10, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 306
101,397, // "t"
  }
,
{ // state 307
-1, // $$start
-1, // start
533, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
101, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
MIN_REDUCTION+108, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+108, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 308
93,38, // "a"
  }
,
{ // state 309
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 310
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 311
106,87, // "u"
  }
,
{ // state 312
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 313
98,364, // "c"
  }
,
{ // state 314
0x80000000|520, // match move
0x80000000|176, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 315
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 316
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 317
2,335, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 318
0x80000000|525, // match move
0x80000000|350, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 319
92,4, // "e"
  }
,
{ // state 320
113,13, // "z"
  }
,
{ // state 321
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 322
92,57, // "e"
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 324
92,573, // "e"
  }
,
{ // state 325
101,69, // "t"
  }
,
{ // state 326
98,51, // "c"
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 328
0x80000000|1, // match move
0x80000000|540, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 329
2,557, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 330
2,358, // ws*
149,463, // ws
151,365, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 331
98,12, // "c"
  }
,
{ // state 332
2,563, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 334
152,556, // {10}
  }
,
{ // state 335
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 336
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 337
92,400, // "e"
  }
,
{ // state 338
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 339
0x80000000|1, // match move
0x80000000|414, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|578, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 341
99,71, // "s"
101,398, // "t"
  }
,
{ // state 342
91,21, // "l"
  }
,
{ // state 343
101,32, // "t"
  }
,
{ // state 344
-1, // $$start
92, // start
33, // ws*
418, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
433, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
-1, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
372, // "*"
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
360, // intLit2
-1, // "0"
223, // digit++
35, // digit
-1, // {"1".."9"}
-1, // "'"
-1, // printable
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
-1, // {9}
365, // eol
-1, // {10}
-1, // {13}
-1, // {169}
371, // token*
10, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 345
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 347
0x80000000|494, // match move
0x80000000|599, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 348
2,493, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 349
102,81, // "d"
  }
,
{ // state 350
2,415, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 351
93,470, // "a"
96,109, // "r"
106,232, // "u"
  }
,
{ // state 352
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 353
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 354
90,8, // "o"
  }
,
{ // state 355
90,216, // "o"
110,213, // "y"
  }
,
{ // state 356
104,111, // "i"
  }
,
{ // state 357
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 358
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 360
2,300, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 361
115,59, // "="
  }
,
{ // state 362
103,28, // "f"
  }
,
{ // state 363
101,64, // "t"
  }
,
{ // state 364
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 365
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 366
112,54, // "g"
  }
,
{ // state 367
2,585, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 368
101,23, // "t"
  }
,
{ // state 369
94,52, // "n"
  }
,
{ // state 370
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 371
0x80000000|531, // match move
0x80000000|537, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|166, // no-match move
// T-test match for "/":
121,
  }
,
{ // state 373
117,239, // "&"
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|462, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 375
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 376
0x80000000|168, // match move
0x80000000|179, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 377
2,600, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 378
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 380
91,153, // "l"
94,396, // "n"
100,596, // "x"
  }
,
{ // state 381
90,24, // "o"
96,324, // "r"
110,343, // "y"
  }
,
{ // state 382
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 383
0x80000000|486, // match move
0x80000000|560, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 384
99,103, // "s"
  }
,
{ // state 385
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 387
0x80000000|361, // match move
0x80000000|329, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 388
0x80000000|125, // match move
0x80000000|245, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 389
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 390
106,36, // "u"
  }
,
{ // state 391
2,242, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 392
94,341, // "n"
103,549, // "f"
111,590, // "m"
  }
,
{ // state 393
101,529, // "t"
  }
,
{ // state 394
93,432, // "a"
96,555, // "r"
108,399, // "h"
  }
,
{ // state 395
98,84, // "c"
  }
,
{ // state 396
106,114, // "u"
  }
,
{ // state 397
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 398
0x80000000|499, // match move
0x80000000|146, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 399
96,130, // "r"
104,154, // "i"
  }
,
{ // state 400
0x80000000|1, // match move
0x80000000|332, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 401
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 402
2,107, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 404
2,290, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 405
91,505, // "l"
  }
,
{ // state 406
0x80000000|73, // match move
0x80000000|163, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 407
92,94, // "e"
  }
,
{ // state 408
2,545, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 409
2,260, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 411
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 412
96,96, // "r"
  }
,
{ // state 413
96,138, // "r"
  }
,
{ // state 414
2,48, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 415
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 417
94,145, // "n"
  }
,
{ // state 418
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 419
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
283, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {169}
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 420
105,314, // "w"
  }
,
{ // state 421
90,478, // "o"
  }
,
{ // state 422
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 423
2,315, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 424
96,464, // "r"
  }
,
{ // state 425
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 427
0x80000000|534, // match move
0x80000000|410, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 428
92,65, // "e"
  }
,
{ // state 429
159,MIN_REDUCTION+260, // $NT
  }
,
{ // state 430
2,227, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 431
98,150, // "c"
  }
,
{ // state 432
101,126, // "t"
  }
,
{ // state 433
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 434
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 435
104,115, // "i"
  }
,
{ // state 436
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 437
2,61, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 438
2,254, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 439
96,299, // "r"
  }
,
{ // state 440
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 442
101,284, // "t"
  }
,
{ // state 443
0x80000000|1, // match move
0x80000000|500, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 444
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 445
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 446
0x80000000|22, // match move
0x80000000|76, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 447
99,17, // "s"
  }
,
{ // state 448
2,511, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 449
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 450
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 451
0x80000000|571, // match move
0x80000000|191, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 452
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 453
-1, // $$start
-1, // start
506, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
355, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
514, // "t"
598, // "d"
295, // "f"
392, // "i"
50, // "w"
-1, // "u"
351, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
MIN_REDUCTION+154, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+154, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 454
0x80000000|1, // match move
0x80000000|535, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 455
2,234, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 456
134,567, // "|"
  }
,
{ // state 457
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 459
110,213, // "y"
  }
,
{ // state 460
93,279, // "a"
  }
,
{ // state 461
0x80000000|262, // match move
0x80000000|190, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 462
2,75, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 463
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|404, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 465
92,210, // "e"
  }
,
{ // state 466
96,294, // "r"
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|91, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 468
102,195, // "d"
  }
,
{ // state 469
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 470
98,183, // "c"
  }
,
{ // state 471
89,429, // "b"
90,429, // "o"
91,429, // "l"
92,429, // "e"
93,429, // "a"
94,429, // "n"
96,429, // "r"
97,429, // "k"
98,429, // "c"
99,429, // "s"
100,429, // "x"
101,429, // "t"
102,429, // "d"
103,429, // "f"
104,429, // "i"
105,429, // "w"
106,429, // "u"
107,429, // "p"
108,429, // "h"
109,429, // "v"
110,429, // "y"
111,429, // "m"
112,429, // "g"
113,429, // "z"
136,274, // "0"
138,552, // digit
139,274, // {"1".."9"}
144,189, // letter
145,11, // "_"
146,429, // {"A".."Z" "j" "q"}
  }
,
{ // state 472
0x80000000|1, // match move
0x80000000|597, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 473
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 474
92,85, // "e"
  }
,
{ // state 475
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 476
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 477
0x80000000|1, // match move
0x80000000|408, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 478
103,82, // "f"
  }
,
{ // state 479
94,142, // "n"
  }
,
{ // state 480
2,199, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 481
98,558, // "c"
  }
,
{ // state 482
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 483
2,572, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 484
2,385, // ws*
106,87, // "u"
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 485
0x80000000|108, // match move
0x80000000|440, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 486
91,459, // "l"
  }
,
{ // state 487
101,551, // "t"
105,562, // "w"
106,158, // "u"
108,157, // "h"
110,417, // "y"
  }
,
{ // state 488
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 489
2,288, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 490
94,544, // "n"
  }
,
{ // state 491
101,407, // "t"
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|53, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 493
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 494
115,175, // "="
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|430, // no-match move
// T-test match for {"*" "/"}:
120,
121,
  }
,
{ // state 496
2,238, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 497
2,533, // ws*
149,463, // ws
151,365, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 499
92,286, // "e"
  }
,
{ // state 500
2,513, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 502
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 503
2,207, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 504
90,216, // "o"
  }
,
{ // state 505
92,515, // "e"
  }
,
{ // state 506
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 507
-1, // $$start
-1, // start
-1, // ws*
488, // $$0
102, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
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
-1, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
44, // ws
-1, // {9}
365, // eol
-1, // {10}
-1, // {13}
-1, // {169}
371, // token*
-1, // digit+
-1, // idChar+
-1, // $
-1, // $NT
  }
,
{ // state 508
2,587, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 509
0x80000000|568, // match move
0x80000000|47, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 510
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 511
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 512
2,378, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 513
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 514
96,93, // "r"
108,399, // "h"
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|134, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 516
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 517
2,434, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 518
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 519
2,608, // ws*
149,463, // ws
151,365, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 520
99,328, // "s"
  }
,
{ // state 521
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 523
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 525
115,121, // "="
  }
,
{ // state 526
93,390, // "a"
  }
,
{ // state 527
89,225, // "b"
90,225, // "o"
91,225, // "l"
92,225, // "e"
93,225, // "a"
94,225, // "n"
96,225, // "r"
97,225, // "k"
98,225, // "c"
99,225, // "s"
100,225, // "x"
101,225, // "t"
102,225, // "d"
103,225, // "f"
104,225, // "i"
105,225, // "w"
106,225, // "u"
107,225, // "p"
108,225, // "h"
109,225, // "v"
110,225, // "y"
111,225, // "m"
112,225, // "g"
113,225, // "z"
114,225, // "!"
115,225, // "="
116,225, // "%"
117,225, // "&"
118,225, // "("
119,225, // ")"
120,225, // "*"
121,225, // "/"
122,225, // "+"
123,225, // ","
124,225, // "-"
125,225, // "."
126,225, // ":"
127,225, // ";"
128,225, // "<"
129,225, // ">"
130,225, // "["
131,225, // "]"
132,225, // "{"
133,225, // "}"
134,225, // "|"
136,225, // "0"
139,225, // {"1".."9"}
140,225, // "'"
141,170, // printable
142,225, // '"'
145,225, // "_"
146,225, // {"A".."Z" "j" "q"}
147,225, // " "
148,225, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 528
92,282, // "e"
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|595, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 530
111,268, // "m"
  }
,
{ // state 531
0x80000000|1, // match move
0x80000000|131, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 532
0x80000000|1, // match move
0x80000000|155, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 533
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 535
2,25, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 536
92,149, // "e"
93,229, // "a"
106,200, // "u"
  }
,
{ // state 537
0x80000000|419, // match move
0x80000000|88, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 538
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 539
91,261, // "l"
  }
,
{ // state 540
2,608, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 541
101,20, // "t"
  }
,
{ // state 542
92,246, // "e"
  }
,
{ // state 543
93,366, // "a"
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|480, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 545
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 546
99,248, // "s"
  }
,
{ // state 547
90,143, // "o"
91,194, // "l"
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
{ // state 548
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 549
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 550
89,133, // "b"
90,133, // "o"
91,133, // "l"
92,133, // "e"
93,133, // "a"
94,133, // "n"
95,205, // idChar
96,133, // "r"
97,133, // "k"
98,133, // "c"
99,133, // "s"
100,133, // "x"
101,133, // "t"
102,133, // "d"
103,133, // "f"
104,133, // "i"
105,133, // "w"
106,133, // "u"
107,133, // "p"
108,133, // "h"
109,133, // "v"
110,133, // "y"
111,133, // "m"
112,133, // "g"
113,133, // "z"
136,509, // "0"
138,275, // digit
139,509, // {"1".."9"}
143,214, // idChar++
144,427, // letter
145,5, // "_"
146,133, // {"A".."Z" "j" "q"}
157,376, // idChar+
  }
,
{ // state 551
93,432, // "a"
96,123, // "r"
  }
,
{ // state 552
159,MIN_REDUCTION+258, // $NT
  }
,
{ // state 553
98,212, // "c"
  }
,
{ // state 554
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 555
93,132, // "a"
104,395, // "i"
106,106, // "u"
110,327, // "y"
  }
,
{ // state 556
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 557
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 558
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 559
91,186, // "l"
  }
,
{ // state 560
0x80000000|160, // match move
0x80000000|453, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 561
92,172, // "e"
  }
,
{ // state 562
104,273, // "i"
  }
,
{ // state 563
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 564
2,538, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 565
94,349, // "n"
  }
,
{ // state 566
91,228, // "l"
  }
,
{ // state 567
2,120, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 569
96,218, // "r"
  }
,
{ // state 570
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 571
101,551, // "t"
105,562, // "w"
106,158, // "u"
108,157, // "h"
110,417, // "y"
  }
,
{ // state 572
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 573
93,277, // "a"
  }
,
{ // state 574
104,287, // "i"
  }
,
{ // state 575
102,443, // "d"
  }
,
{ // state 576
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 577
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 578
2,45, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 579
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 581
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 582
2,249, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 583
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 584
2,220, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 585
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 586
0x80000000|507, // match move
0x80000000|255, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 587
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 588
-1, // $$start
-1, // start
608, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
182, // `boolean
593, // `class
184, // `extends
6, // `void
247, // `int
309, // `while
444, // `if
127, // `else
450, // `for
523, // `break
201, // `this
167, // `false
267, // `true
230, // `super
41, // `null
99, // `return
357, // `instanceof
524, // `new
333, // `abstract
416, // `assert
603, // `byte
457, // `case
605, // `catch
375, // `char
441, // `const
516, // `continue
498, // `default
386, // `do
159, // `double
62, // `enum
122, // `final
293, // `finally
104, // `float
174, // `goto
522, // `implements
56, // `import
278, // `interface
425, // `long
338, // `native
422, // `package
301, // `private
39, // `protected
312, // `public
577, // `short
180, // `static
370, // `strictfp
97, // `switch
379, // `synchronized
473, // `throw
58, // `throws
280, // `transient
19, // `try
241, // `volatile
352, // `!
403, // `!=
67, // `%
482, // `&&
-1, // `*
521, // `(
270, // `)
346, // `{
469, // `}
382, // `-
14, // `+
196, // `=
206, // `==
165, // `[
345, // `]
359, // `||
139, // `<
124, // `<=
580, // `,
112, // `>
105, // `>=
141, // `.
178, // `;
458, // `++
233, // `--
202, // `/
292, // `:
583, // ID
401, // INTLIT
171, // STRINGLIT
449, // CHARLIT
381, // "b"
-1, // "o"
504, // "l"
380, // "e"
609, // "a"
536, // "n"
-1, // idChar
319, // "r"
-1, // "k"
197, // "c"
487, // "s"
-1, // "x"
394, // "t"
598, // "d"
295, // "f"
392, // "i"
259, // "w"
158, // "u"
351, // "p"
157, // "h"
117, // "v"
417, // "y"
-1, // "m"
9, // "g"
-1, // "z"
318, // "!"
31, // "="
80, // "%"
373, // "&"
129, // "("
503, // ")"
MIN_REDUCTION+188, // "*"
495, // "/"
446, // "+"
402, // ","
406, // "-"
236, // "."
55, // ":"
7, // ";"
387, // "<"
347, // ">"
437, // "["
606, // "]"
257, // "{"
98, // "}"
456, // "|"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+188, // {"1".."9"}
527, // "'"
-1, // printable
550, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
-1, // {"A".."Z" "j" "q"}
161, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
463, // ws
161, // {9}
365, // eol
548, // {10}
237, // {13}
436, // {169}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 589
92,291, // "e"
  }
,
{ // state 590
107,547, // "p"
  }
,
{ // state 591
96,266, // "r"
  }
,
{ // state 592
0x80000000|1, // match move
0x80000000|512, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 593
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 594
92,374, // "e"
  }
,
{ // state 595
2,445, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 596
101,219, // "t"
  }
,
{ // state 597
2,18, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 598
90,42, // "o"
92,188, // "e"
  }
,
{ // state 599
2,336, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 600
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 602
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|471, // NT-test-match state for idChar
  }
,
{ // state 603
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 604
94,302, // "n"
  }
,
{ // state 605
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 606
2,3, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 607
98,16, // "c"
  }
,
{ // state 608
147,161, // " "
149,44, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 609
89,384, // "b"
99,546, // "s"
  }
,
{ // state 610
2,579, // ws*
147,161, // " "
149,463, // ws
150,161, // {9}
151,365, // eol
152,548, // {10}
153,237, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[611][];
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
(144<<16)+1,
// printable ::= {" ".."~"}
(141<<16)+1,
// ws ::= {9 " "}
(149<<16)+1,
// ws ::= eol
(149<<16)+1,
// eol ::= {10}
(151<<16)+1,
// eol ::= {13} {10}
(151<<16)+2,
// eol ::= {13} !10
(151<<16)+1,
// ID ::= {169}
(85<<16)+1,
// token* ::= token* token
(155<<16)+2,
// token* ::= token
(155<<16)+1,
// digit++ ::= digit+ !digit
(137<<16)+1,
// idChar++ ::= idChar+ !idChar
(143<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(156<<16)+1,
// digit+ ::= digit+ digit
(156<<16)+2,
// idChar+ ::= idChar
(157<<16)+1,
// idChar+ ::= idChar+ idChar
(157<<16)+2,
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
150, // 9
152, // 10
-1, // 11
-1, // 12
153, // 13
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
147, // " "
114, // "!"
142, // '"'
148, // "#"
148, // "$"
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
148, // "?"
148, // "@"
146, // "A"
146, // "B"
146, // "C"
146, // "D"
146, // "E"
146, // "F"
146, // "G"
146, // "H"
146, // "I"
146, // "J"
146, // "K"
146, // "L"
146, // "M"
146, // "N"
146, // "O"
146, // "P"
146, // "Q"
146, // "R"
146, // "S"
146, // "T"
146, // "U"
146, // "V"
146, // "W"
146, // "X"
146, // "Y"
146, // "Z"
130, // "["
148, // "\"
131, // "]"
148, // "^"
145, // "_"
148, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
146, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
146, // "q"
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
148, // "~"
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
154, // 169
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
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 255
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 256
"idChar ::= letter", // 257
"idChar ::= digit", // 258
"idChar ::= \"_\"", // 259
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 260
"printable ::= {\" \"..\"~\"}", // 261
"ws ::= {9 \" \"}", // 262
"ws ::= eol", // 263
"eol ::= {10} registerNewline", // 264
"eol ::= {13} {10} registerNewline", // 265
"eol ::= {13} !10 registerNewline", // 266
"ID ::= {169}", // 267
"token* ::= token* token", // 268
"token* ::= token* token", // 269
"digit++ ::= digit+ !digit", // 270
"idChar++ ::= idChar+ !idChar", // 271
"ws* ::= ws* ws", // 272
"ws* ::= ws* ws", // 273
"digit+ ::= digit", // 274
"digit+ ::= digit+ digit", // 275
"idChar+ ::= idChar", // 276
"idChar+ ::= idChar+ idChar", // 277
"", // 278
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
    { // 255: STRINGLIT ::= [#] '"' idChar++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 256: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 257: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 258: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 259: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 260: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 261: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 262: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 264: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 266: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: ID ::= {169} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 268: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 269: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 270: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 271: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 272: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 273: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 274: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 275: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 276: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 277: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 278: $$0 ::= token* @pass
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
      ((87<<5)|0x5)/*methodCall:87*/,
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
    0,
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
