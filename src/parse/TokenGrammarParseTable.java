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
public int getEofSym() { return 172; }
public int getNttSym() { return 173; }
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
"\"+\"",
"\"-\"",
"\".\"",
"\"/\"",
"\":\"",
"\";\"",
"\"<\"",
"\">\"",
"intLit2",
"\"0\"",
"digit++",
"letter",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"{\"1\"..\"9\"}",
"ws",
"{9 \" \"}",
"eol",
"10",
"13",
"130",
"131",
"132",
"133",
"134",
"135",
"136",
"137",
"138",
"139",
"140",
"141",
"142",
"143",
"144",
"145",
"146",
"147",
"148",
"149",
"150",
"151",
"152",
"153",
"154",
"155",
"156",
"157",
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
public int numSymbols() { return 174;}
private static final int MIN_REDUCTION = 574;
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
0x80000000|174, // match move
0x80000000|22, // no-match move
// T-test match for "0":
130,
  }
,
{ // state 1
  }
,
{ // state 2
2,447, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
101,250, // "t"
  }
,
{ // state 4
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 5
2,150, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 6
93,298, // "a"
  }
,
{ // state 7
90,339, // "o"
  }
,
{ // state 8
0x80000000|210, // match move
0x80000000|278, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 9
173,MIN_REDUCTION+242, // $NT
  }
,
{ // state 10
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 11
108,471, // "h"
  }
,
{ // state 12
92,540, // "e"
  }
,
{ // state 13
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 14
103,234, // "f"
  }
,
{ // state 15
108,114, // "h"
  }
,
{ // state 16
104,295, // "i"
  }
,
{ // state 17
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|530, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 20
99,312, // "s"
  }
,
{ // state 21
121,384, // "+"
  }
,
{ // state 22
-1, // $$start
88, // start
33, // ws*
394, // $$0
97, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
336, // intLit2
456, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
456, // {"1".."9"}
432, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
348, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 23
104,532, // "i"
  }
,
{ // state 24
90,232, // "o"
  }
,
{ // state 25
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 26
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 27
2,91, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 28
107,520, // "p"
  }
,
{ // state 29
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 30
99,207, // "s"
  }
,
{ // state 31
0x80000000|141, // match move
0x80000000|324, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 32
92,314, // "e"
  }
,
{ // state 33
0x80000000|378, // match move
0x80000000|212, // no-match move
// T-test match for "0":
130,
  }
,
{ // state 34
130,252, // "0"
136,252, // {"1".."9"}
  }
,
{ // state 35
0x80000000|37, // match move
0x80000000|146, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 36
91,280, // "l"
  }
,
{ // state 37
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 38
94,404, // "n"
  }
,
{ // state 39
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 40
99,413, // "s"
101,408, // "t"
  }
,
{ // state 41
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 42
0x80000000|284, // match move
0x80000000|455, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 43
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 44
99,541, // "s"
  }
,
{ // state 45
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 46
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 47
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 48
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 49
108,332, // "h"
  }
,
{ // state 50
101,81, // "t"
  }
,
{ // state 51
104,293, // "i"
  }
,
{ // state 52
2,534, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 53
92,115, // "e"
  }
,
{ // state 54
2,199, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 56
94,507, // "n"
  }
,
{ // state 57
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 58
2,144, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 59
93,344, // "a"
  }
,
{ // state 60
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 61
112,436, // "g"
  }
,
{ // state 62
90,564, // "o"
  }
,
{ // state 63
0x80000000|1, // match move
0x80000000|112, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 64
109,273, // "v"
  }
,
{ // state 65
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 66
101,527, // "t"
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 68
2,546, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 69
101,281, // "t"
  }
,
{ // state 70
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 71
122,486, // "-"
  }
,
{ // state 72
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 73
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 74
2,283, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 75
94,40, // "n"
  }
,
{ // state 76
2,77, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 77
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 78
2,193, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 79
99,236, // "s"
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 82
101,338, // "t"
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 84
89,380, // "b"
  }
,
{ // state 85
99,552, // "s"
101,304, // "t"
  }
,
{ // state 86
91,59, // "l"
104,437, // "i"
  }
,
{ // state 87
2,26, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 88
172,MIN_REDUCTION+0, // $
  }
,
{ // state 89
93,126, // "a"
106,101, // "u"
110,300, // "y"
  }
,
{ // state 90
102,443, // "d"
  }
,
{ // state 91
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 92
90,345, // "o"
  }
,
{ // state 93
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|549, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 96
91,147, // "l"
94,371, // "n"
96,14, // "r"
100,559, // "x"
  }
,
{ // state 97
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 98
101,387, // "t"
  }
,
{ // state 99
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 101
92,424, // "e"
  }
,
{ // state 102
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 103
90,237, // "o"
104,64, // "i"
  }
,
{ // state 104
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 105
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 106
91,402, // "l"
  }
,
{ // state 107
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 108
91,358, // "l"
  }
,
{ // state 109
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 110
111,296, // "m"
  }
,
{ // state 111
94,163, // "n"
  }
,
{ // state 112
2,363, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 113
90,86, // "o"
  }
,
{ // state 114
0x80000000|1, // match move
0x80000000|76, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|233, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 116
2,446, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 118
104,370, // "i"
  }
,
{ // state 119
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 120
104,452, // "i"
  }
,
{ // state 121
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 123
2,171, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 124
2,226, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 125
90,395, // "o"
  }
,
{ // state 126
94,418, // "n"
  }
,
{ // state 127
2,243, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 128
108,386, // "h"
  }
,
{ // state 129
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 132
93,299, // "a"
  }
,
{ // state 133
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 135
93,108, // "a"
  }
,
{ // state 136
96,367, // "r"
  }
,
{ // state 137
92,399, // "e"
  }
,
{ // state 138
98,128, // "c"
  }
,
{ // state 139
-1, // $$start
-1, // start
501, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
96, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
432, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 140
93,279, // "a"
  }
,
{ // state 141
115,398, // "="
  }
,
{ // state 142
105,463, // "w"
  }
,
{ // state 143
92,396, // "e"
  }
,
{ // state 144
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 147
99,445, // "s"
  }
,
{ // state 148
99,315, // "s"
  }
,
{ // state 149
2,70, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 150
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 151
90,554, // "o"
  }
,
{ // state 152
107,137, // "p"
  }
,
{ // state 153
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 155
2,72, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 156
2,46, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 158
2,253, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 159
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
259, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
336, // intLit2
456, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
456, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
-1, // token*
8, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 160
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 163
106,497, // "u"
  }
,
{ // state 164
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|365, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 166
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 167
2,215, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 168
-1, // $$start
-1, // start
334, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
422, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
432, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 169
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 171
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 173
97,509, // "k"
  }
,
{ // state 174
-1, // $$start
88, // start
33, // ws*
394, // $$0
97, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
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
-1, // "+"
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
432, // ws
-1, // {9 " "}
341, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {133}
-1, // {134}
-1, // {135}
-1, // {136}
-1, // {137}
-1, // {138}
-1, // {139}
-1, // {140}
-1, // {141}
-1, // {142}
-1, // {143}
-1, // {144}
-1, // {145}
-1, // {146}
-1, // {147}
-1, // {148}
-1, // {149}
-1, // {150}
-1, // {151}
-1, // {152}
-1, // {153}
-1, // {154}
-1, // {155}
-1, // {156}
-1, // {157}
348, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 175
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 176
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 177
0x80000000|1, // match move
0x80000000|123, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 178
2,182, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 179
103,495, // "f"
  }
,
{ // state 180
173,MIN_REDUCTION+240, // $NT
  }
,
{ // state 181
-1, // $$start
-1, // start
570, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
369, // "t"
561, // "d"
271, // "f"
366, // "i"
238, // "w"
152, // "u"
327, // "p"
151, // "h"
113, // "v"
393, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
432, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 182
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 183
2,48, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 184
92,499, // "e"
  }
,
{ // state 185
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 186
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 187
90,75, // "o"
91,140, // "l"
93,85, // "a"
108,430, // "h"
  }
,
{ // state 188
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 189
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 190
91,525, // "l"
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
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 196
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 197
2,479, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 198
98,462, // "c"
  }
,
{ // state 199
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 200
92,448, // "e"
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|409, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 202
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 203
94,61, // "n"
  }
,
{ // state 204
94,95, // "n"
  }
,
{ // state 205
92,531, // "e"
  }
,
{ // state 206
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|155, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 208
0x80000000|472, // match move
0x80000000|194, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 209
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 210
130,456, // "0"
133,208, // digit
136,456, // {"1".."9"}
  }
,
{ // state 211
92,555, // "e"
  }
,
{ // state 212
-1, // $$start
-1, // start
-1, // ws*
459, // $$0
97, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
474, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
336, // intLit2
456, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
456, // {"1".."9"}
43, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
348, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 213
101,539, // "t"
  }
,
{ // state 214
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 215
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 216
89,505, // "b"
  }
,
{ // state 217
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 218
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 219
2,385, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 220
2,29, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 221
0x80000000|308, // match move
0x80000000|130, // no-match move
// T-test match for 10:
140,
  }
,
{ // state 222
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 223
2,244, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 225
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 226
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 227
2,294, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 228
93,461, // "a"
  }
,
{ // state 229
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 230
92,435, // "e"
  }
,
{ // state 231
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 232
91,508, // "l"
  }
,
{ // state 233
2,289, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 234
93,518, // "a"
  }
,
{ // state 235
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 237
101,434, // "t"
  }
,
{ // state 238
104,251, // "i"
108,332, // "h"
  }
,
{ // state 239
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 241
104,286, // "i"
  }
,
{ // state 242
2,423, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 243
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 244
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 245
101,500, // "t"
  }
,
{ // state 246
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 247
92,566, // "e"
  }
,
{ // state 248
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 250
106,533, // "u"
  }
,
{ // state 251
101,569, // "t"
  }
,
{ // state 252
173,MIN_REDUCTION+244, // $NT
  }
,
{ // state 253
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 254
97,104, // "k"
  }
,
{ // state 255
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 256
96,487, // "r"
  }
,
{ // state 257
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 258
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 259
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 261
2,176, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 262
96,14, // "r"
  }
,
{ // state 263
109,557, // "v"
  }
,
{ // state 264
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 265
2,202, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 266
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 268
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 270
101,401, // "t"
  }
,
{ // state 271
90,410, // "o"
91,329, // "l"
93,317, // "a"
104,450, // "i"
  }
,
{ // state 272
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 273
93,66, // "a"
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|351, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 275
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 277
101,30, // "t"
  }
,
{ // state 278
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 279
99,44, // "s"
  }
,
{ // state 280
101,372, // "t"
  }
,
{ // state 281
93,38, // "a"
  }
,
{ // state 282
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 283
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 284
106,84, // "u"
  }
,
{ // state 285
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 286
98,340, // "c"
  }
,
{ // state 287
0x80000000|488, // match move
0x80000000|168, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 288
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 289
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 290
2,309, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 291
0x80000000|494, // match move
0x80000000|326, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 292
92,3, // "e"
  }
,
{ // state 293
113,12, // "z"
  }
,
{ // state 294
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 295
92,56, // "e"
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 297
92,538, // "e"
  }
,
{ // state 298
101,67, // "t"
  }
,
{ // state 299
98,50, // "c"
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|242, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 301
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 302
2,523, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 304
98,11, // "c"
  }
,
{ // state 305
2,529, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 306
2,10, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 308
140,522, // {10}
  }
,
{ // state 309
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 311
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 312
92,375, // "e"
  }
,
{ // state 313
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|388, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 315
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 316
99,69, // "s"
101,373, // "t"
  }
,
{ // state 317
91,20, // "l"
  }
,
{ // state 318
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 319
101,32, // "t"
  }
,
{ // state 320
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 322
0x80000000|465, // match move
0x80000000|562, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 323
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 324
2,464, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 325
102,79, // "d"
  }
,
{ // state 326
2,389, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 327
93,441, // "a"
96,103, // "r"
106,216, // "u"
  }
,
{ // state 328
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 329
90,6, // "o"
  }
,
{ // state 330
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 331
90,203, // "o"
110,201, // "y"
  }
,
{ // state 332
104,106, // "i"
  }
,
{ // state 333
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 334
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 336
2,275, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 337
115,58, // "="
  }
,
{ // state 338
103,28, // "f"
  }
,
{ // state 339
101,62, // "t"
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|265, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 341
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 342
112,53, // "g"
  }
,
{ // state 343
2,550, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 344
101,23, // "t"
  }
,
{ // state 345
94,51, // "n"
  }
,
{ // state 346
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 347
117,223, // "&"
  }
,
{ // state 348
0x80000000|391, // match move
0x80000000|159, // no-match move
// T-test match for "0":
130,
  }
,
{ // state 349
0x80000000|1, // match move
0x80000000|431, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 350
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 351
2,563, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 352
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 354
91,147, // "l"
94,371, // "n"
100,559, // "x"
  }
,
{ // state 355
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 356
90,24, // "o"
96,297, // "r"
110,319, // "y"
  }
,
{ // state 357
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 358
0x80000000|457, // match move
0x80000000|526, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 359
99,98, // "s"
  }
,
{ // state 360
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 361
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 362
0x80000000|337, // match move
0x80000000|302, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 363
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 364
106,36, // "u"
  }
,
{ // state 365
2,225, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 366
94,316, // "n"
103,515, // "f"
111,553, // "m"
  }
,
{ // state 367
101,498, // "t"
  }
,
{ // state 368
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 369
93,405, // "a"
96,521, // "r"
108,374, // "h"
  }
,
{ // state 370
98,82, // "c"
  }
,
{ // state 371
106,110, // "u"
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 373
0x80000000|469, // match move
0x80000000|139, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 374
96,125, // "r"
104,148, // "i"
  }
,
{ // state 375
0x80000000|1, // match move
0x80000000|305, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 376
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 378
-1, // $$start
-1, // start
-1, // ws*
459, // $$0
97, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
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
-1, // "+"
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
43, // ws
-1, // {9 " "}
341, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {133}
-1, // {134}
-1, // {135}
-1, // {136}
-1, // {137}
-1, // {138}
-1, // {139}
-1, // {140}
-1, // {141}
-1, // {142}
-1, // {143}
-1, // {144}
-1, // {145}
-1, // {146}
-1, // {147}
-1, // {148}
-1, // {149}
-1, // {150}
-1, // {151}
-1, // {152}
-1, // {153}
-1, // {154}
-1, // {155}
-1, // {156}
-1, // {157}
348, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 379
2,266, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 380
91,475, // "l"
  }
,
{ // state 381
0x80000000|71, // match move
0x80000000|156, // no-match move
// T-test match for "-":
122,
  }
,
{ // state 382
92,90, // "e"
  }
,
{ // state 383
2,511, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 384
2,239, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 385
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 386
96,92, // "r"
  }
,
{ // state 387
96,132, // "r"
  }
,
{ // state 388
2,47, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 389
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 391
4,259, // token
5,172, // `boolean
6,556, // `class
7,175, // `extends
8,4, // `void
9,229, // `int
10,282, // `while
11,415, // `if
12,122, // `else
13,421, // `for
14,492, // `break
15,191, // `this
16,161, // `false
17,246, // `true
18,214, // `super
19,41, // `null
20,94, // `return
21,333, // `instanceof
22,493, // `new
23,307, // `abstract
24,392, // `assert
25,565, // `byte
26,427, // `case
27,567, // `catch
28,350, // `char
29,412, // `const
30,485, // `continue
31,468, // `default
32,361, // `do
33,153, // `double
34,60, // `enum
35,117, // `final
36,269, // `finally
37,99, // `float
38,166, // `goto
39,490, // `implements
40,55, // `import
41,255, // `interface
42,400, // `long
43,313, // `native
44,397, // `package
45,276, // `private
46,39, // `protected
47,285, // `public
48,542, // `short
49,170, // `static
50,346, // `strictfp
51,93, // `switch
52,353, // `synchronized
53,444, // `throw
54,57, // `throws
55,257, // `transient
56,18, // `try
57,224, // `volatile
58,328, // `!
59,377, // `!=
60,65, // `%
61,453, // `&&
62,406, // `*
63,489, // `(
64,249, // `)
65,323, // `{
66,439, // `}
67,357, // `-
68,13, // `+
69,186, // `=
70,195, // `==
71,160, // `[
72,321, // `]
73,335, // `||
74,133, // `<
75,119, // `<=
76,545, // `,
77,107, // `>
78,100, // `>=
79,134, // `.
80,169, // `;
81,428, // `++
82,217, // `--
83,192, // `/
84,268, // `:
85,548, // ID
86,376, // INTLIT
87,164, // STRINGLIT
88,420, // CHARLIT
  }
,
{ // state 392
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 393
94,138, // "n"
  }
,
{ // state 394
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 395
105,287, // "w"
  }
,
{ // state 396
90,449, // "o"
  }
,
{ // state 397
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 398
2,288, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 399
96,433, // "r"
  }
,
{ // state 400
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 402
92,63, // "e"
  }
,
{ // state 403
173,MIN_REDUCTION+243, // $NT
  }
,
{ // state 404
98,143, // "c"
  }
,
{ // state 405
101,120, // "t"
  }
,
{ // state 406
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 407
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 408
104,111, // "i"
  }
,
{ // state 409
2,235, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 410
96,274, // "r"
  }
,
{ // state 411
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 413
101,260, // "t"
  }
,
{ // state 414
0x80000000|1, // match move
0x80000000|470, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 415
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 416
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 417
0x80000000|21, // match move
0x80000000|74, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 418
99,16, // "s"
  }
,
{ // state 419
2,480, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 421
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 422
0x80000000|535, // match move
0x80000000|181, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 423
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 424
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 425
2,218, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 429
110,201, // "y"
  }
,
{ // state 430
93,256, // "a"
  }
,
{ // state 431
2,73, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|379, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 434
92,198, // "e"
  }
,
{ // state 435
96,270, // "r"
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|87, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 437
102,185, // "d"
  }
,
{ // state 438
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 440
2,105, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 441
98,173, // "c"
  }
,
{ // state 442
89,403, // "b"
90,403, // "o"
91,403, // "l"
92,403, // "e"
93,403, // "a"
94,403, // "n"
96,403, // "r"
97,403, // "k"
98,403, // "c"
99,403, // "s"
100,403, // "x"
101,403, // "t"
102,403, // "d"
103,403, // "f"
104,403, // "i"
105,403, // "w"
106,403, // "u"
107,403, // "p"
108,403, // "h"
109,403, // "v"
110,403, // "y"
111,403, // "m"
112,403, // "g"
113,403, // "z"
130,252, // "0"
132,180, // letter
133,517, // digit
134,9, // "_"
135,403, // {"A".."Z" "j" "q"}
136,252, // {"1".."9"}
  }
,
{ // state 443
0x80000000|1, // match move
0x80000000|560, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 444
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 445
92,83, // "e"
  }
,
{ // state 446
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 447
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 448
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 449
103,80, // "f"
  }
,
{ // state 450
94,135, // "n"
  }
,
{ // state 451
2,189, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 452
98,524, // "c"
  }
,
{ // state 453
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 454
2,536, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 455
2,360, // ws*
106,84, // "u"
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 456
0x80000000|102, // match move
0x80000000|411, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 457
91,429, // "l"
  }
,
{ // state 458
101,516, // "t"
105,528, // "w"
106,152, // "u"
108,151, // "h"
110,393, // "y"
  }
,
{ // state 459
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 460
2,264, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 461
94,510, // "n"
  }
,
{ // state 462
101,382, // "t"
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|52, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 464
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 465
115,167, // "="
  }
,
{ // state 466
2,222, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 469
92,262, // "e"
  }
,
{ // state 470
2,482, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 471
0x80000000|1, // match move
0x80000000|572, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 472
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 473
2,196, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 474
90,203, // "o"
  }
,
{ // state 475
92,484, // "e"
  }
,
{ // state 476
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 478
2,551, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 479
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 480
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 481
2,352, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 482
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 483
96,89, // "r"
108,374, // "h"
  }
,
{ // state 484
0x80000000|1, // match move
0x80000000|127, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 485
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 486
2,407, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|419, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 488
99,301, // "s"
  }
,
{ // state 489
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 492
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 493
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 494
115,116, // "="
  }
,
{ // state 495
93,364, // "a"
  }
,
{ // state 496
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 497
92,258, // "e"
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 499
111,247, // "m"
  }
,
{ // state 500
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 501
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 502
2,25, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 503
92,142, // "e"
93,213, // "a"
106,190, // "u"
  }
,
{ // state 504
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 505
91,241, // "l"
  }
,
{ // state 506
2,570, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 507
101,19, // "t"
  }
,
{ // state 508
92,228, // "e"
  }
,
{ // state 509
93,342, // "a"
  }
,
{ // state 510
0x80000000|1, // match move
0x80000000|451, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 511
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 512
99,230, // "s"
  }
,
{ // state 513
90,136, // "o"
91,184, // "l"
  }
,
{ // state 514
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|425, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 516
93,405, // "a"
96,118, // "r"
  }
,
{ // state 517
173,MIN_REDUCTION+241, // $NT
  }
,
{ // state 518
98,200, // "c"
  }
,
{ // state 519
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 521
93,126, // "a"
104,370, // "i"
106,101, // "u"
110,300, // "y"
  }
,
{ // state 522
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 523
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 524
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 525
91,177, // "l"
  }
,
{ // state 526
-1, // $$start
-1, // start
476, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
172, // `boolean
556, // `class
175, // `extends
4, // `void
229, // `int
282, // `while
415, // `if
122, // `else
421, // `for
492, // `break
191, // `this
161, // `false
246, // `true
214, // `super
41, // `null
94, // `return
333, // `instanceof
493, // `new
307, // `abstract
392, // `assert
565, // `byte
427, // `case
567, // `catch
350, // `char
412, // `const
485, // `continue
468, // `default
361, // `do
153, // `double
60, // `enum
117, // `final
269, // `finally
99, // `float
166, // `goto
490, // `implements
55, // `import
255, // `interface
400, // `long
313, // `native
397, // `package
276, // `private
39, // `protected
285, // `public
542, // `short
170, // `static
346, // `strictfp
93, // `switch
353, // `synchronized
444, // `throw
57, // `throws
257, // `transient
18, // `try
224, // `volatile
328, // `!
377, // `!=
65, // `%
453, // `&&
406, // `*
489, // `(
249, // `)
323, // `{
439, // `}
357, // `-
13, // `+
186, // `=
195, // `==
160, // `[
321, // `]
335, // `||
133, // `<
119, // `<=
545, // `,
107, // `>
100, // `>=
134, // `.
169, // `;
428, // `++
217, // `--
192, // `/
268, // `:
548, // ID
376, // INTLIT
164, // STRINGLIT
420, // CHARLIT
356, // "b"
-1, // "o"
331, // "l"
354, // "e"
571, // "a"
503, // "n"
-1, // idChar
292, // "r"
-1, // "k"
187, // "c"
458, // "s"
-1, // "x"
483, // "t"
561, // "d"
271, // "f"
366, // "i"
49, // "w"
-1, // "u"
327, // "p"
-1, // "h"
113, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
291, // "!"
31, // "="
78, // "%"
347, // "&"
124, // "("
473, // ")"
440, // "*"
417, // "+"
381, // "-"
220, // "."
306, // "/"
54, // ":"
5, // ";"
362, // "<"
322, // ">"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
432, // ws
154, // {9 " "}
341, // eol
514, // {10}
221, // {13}
129, // {130}
330, // {131}
310, // {132}
157, // {133}
131, // {134}
519, // {135}
318, // {136}
303, // {137}
477, // {138}
568, // {139}
438, // {140}
109, // {141}
390, // {142}
496, // {143}
121, // {144}
426, // {145}
240, // {146}
320, // {147}
355, // {148}
272, // {149}
368, // {150}
467, // {151}
537, // {152}
145, // {153}
248, // {154}
491, // {155}
188, // {156}
162, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 527
92,165, // "e"
  }
,
{ // state 528
104,251, // "i"
  }
,
{ // state 529
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 530
2,504, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 531
94,325, // "n"
  }
,
{ // state 532
91,211, // "l"
  }
,
{ // state 533
96,204, // "r"
  }
,
{ // state 534
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 535
101,516, // "t"
105,528, // "w"
106,152, // "u"
108,151, // "h"
110,393, // "y"
  }
,
{ // state 536
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 537
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 538
93,254, // "a"
  }
,
{ // state 539
104,263, // "i"
  }
,
{ // state 540
102,414, // "d"
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 542
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 543
2,45, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 544
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 546
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 547
2,231, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 549
2,206, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 550
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 551
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 552
92,267, // "e"
  }
,
{ // state 553
107,513, // "p"
  }
,
{ // state 554
96,245, // "r"
  }
,
{ // state 555
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 556
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 557
92,349, // "e"
  }
,
{ // state 558
2,416, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 559
101,205, // "t"
  }
,
{ // state 560
2,17, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 561
90,42, // "o"
92,179, // "e"
  }
,
{ // state 562
2,311, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 563
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 564
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|442, // NT-test-match state for idChar
  }
,
{ // state 565
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 566
94,277, // "n"
  }
,
{ // state 567
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 569
98,15, // "c"
  }
,
{ // state 570
137,43, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 571
89,359, // "b"
99,512, // "s"
  }
,
{ // state 572
2,544, // ws*
137,432, // ws
138,154, // {9 " "}
139,341, // eol
140,514, // {10}
141,221, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[573][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
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
// `/ ::= "/" ws*
(83<<16)+2,
// `/ ::= "/"
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
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(129<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(132<<16)+1,
// digit ::= {"0".."9"}
(133<<16)+1,
// ws ::= {9 " "}
(137<<16)+1,
// ws ::= eol
(137<<16)+1,
// eol ::= {10}
(139<<16)+1,
// eol ::= {13} {10}
(139<<16)+2,
// eol ::= {13} !10
(139<<16)+1,
// CHARLIT ::= {130}
(88<<16)+1,
// ID ::= {131}
(85<<16)+1,
// STRINGLIT ::= {132}
(87<<16)+1,
// `! ::= {133}
(58<<16)+1,
// `% ::= {134}
(60<<16)+1,
// `&& ::= {135}
(61<<16)+1,
// `( ::= {136}
(63<<16)+1,
// `) ::= {137}
(64<<16)+1,
// `+ ::= {138}
(68<<16)+1,
// `++ ::= {139}
(81<<16)+1,
// `, ::= {140}
(76<<16)+1,
// `- ::= {141}
(67<<16)+1,
// `-- ::= {142}
(82<<16)+1,
// `. ::= {143}
(79<<16)+1,
// `/ ::= {144}
(83<<16)+1,
// `; ::= {145}
(80<<16)+1,
// `< ::= {146}
(74<<16)+1,
// `<= ::= {147}
(75<<16)+1,
// `= ::= {148}
(69<<16)+1,
// `== ::= {149}
(70<<16)+1,
// `> ::= {150}
(77<<16)+1,
// `>= ::= {151}
(78<<16)+1,
// `[ ::= {152}
(71<<16)+1,
// `] ::= {153}
(72<<16)+1,
// `{ ::= {154}
(65<<16)+1,
// `|| ::= {155}
(73<<16)+1,
// `} ::= {156}
(66<<16)+1,
// `: ::= {157}
(84<<16)+1,
// token* ::= token* token
(170<<16)+2,
// token* ::= token
(170<<16)+1,
// digit++ ::= digit+ !digit
(131<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(171<<16)+1,
// digit+ ::= digit+ digit
(171<<16)+2,
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
138, // 9
140, // 10
-1, // 11
-1, // 12
141, // 13
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
138, // " "
114, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
116, // "%"
117, // "&"
-1, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
-1, // ","
122, // "-"
123, // "."
124, // "/"
130, // "0"
136, // "1"
136, // "2"
136, // "3"
136, // "4"
136, // "5"
136, // "6"
136, // "7"
136, // "8"
136, // "9"
125, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
-1, // "?"
-1, // "@"
135, // "A"
135, // "B"
135, // "C"
135, // "D"
135, // "E"
135, // "F"
135, // "G"
135, // "H"
135, // "I"
135, // "J"
135, // "K"
135, // "L"
135, // "M"
135, // "N"
135, // "O"
135, // "P"
135, // "Q"
135, // "R"
135, // "S"
135, // "T"
135, // "U"
135, // "V"
135, // "W"
135, // "X"
135, // "Y"
135, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
134, // "_"
-1, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
135, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
135, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
142, // 130
143, // 131
144, // 132
145, // 133
146, // 134
147, // 135
148, // 136
149, // 137
150, // 138
151, // 139
152, // 140
153, // 141
154, // 142
155, // 143
156, // 144
157, // 145
158, // 146
159, // 147
160, // 148
161, // 149
162, // 150
163, // 151
164, // 152
165, // 153
166, // 154
167, // 155
168, // 156
169, // 157
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
"`* ::= \"*\" ws*", // 207
"`* ::= \"*\" ws*", // 208
"`+ ::= \"+\" !\"+\" ws*", // 209
"`+ ::= \"+\" !\"+\" ws*", // 210
"`++ ::= \"+\" \"+\" ws*", // 211
"`++ ::= \"+\" \"+\" ws*", // 212
"`- ::= \"-\" !\"-\" ws*", // 213
"`- ::= \"-\" !\"-\" ws*", // 214
"`-- ::= \"-\" \"-\" ws*", // 215
"`-- ::= \"-\" \"-\" ws*", // 216
"`. ::= \".\" ws*", // 217
"`. ::= \".\" ws*", // 218
"`/ ::= \"/\" ws*", // 219
"`/ ::= \"/\" ws*", // 220
"`: ::= \":\" ws*", // 221
"`: ::= \":\" ws*", // 222
"`; ::= \";\" ws*", // 223
"`; ::= \";\" ws*", // 224
"`< ::= \"<\" !\"=\" ws*", // 225
"`< ::= \"<\" !\"=\" ws*", // 226
"`<= ::= \"<\" \"=\" ws*", // 227
"`<= ::= \"<\" \"=\" ws*", // 228
"`= ::= \"=\" !\"=\" ws*", // 229
"`= ::= \"=\" !\"=\" ws*", // 230
"`== ::= \"=\" \"=\" ws*", // 231
"`== ::= \"=\" \"=\" ws*", // 232
"`> ::= \">\" !\"=\" ws*", // 233
"`> ::= \">\" !\"=\" ws*", // 234
"`>= ::= \">\" \"=\" ws*", // 235
"`>= ::= \">\" \"=\" ws*", // 236
"INTLIT ::= # intLit2 ws*", // 237
"INTLIT ::= # intLit2 ws*", // 238
"intLit2 ::= !\"0\" digit++", // 239
"idChar ::= letter", // 240
"idChar ::= digit", // 241
"idChar ::= \"_\"", // 242
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 243
"digit ::= {\"0\"..\"9\"}", // 244
"ws ::= {9 \" \"}", // 245
"ws ::= eol", // 246
"eol ::= {10} registerNewline", // 247
"eol ::= {13} {10} registerNewline", // 248
"eol ::= {13} !10 registerNewline", // 249
"CHARLIT ::= {130}", // 250
"ID ::= {131}", // 251
"STRINGLIT ::= {132}", // 252
"`! ::= {133}", // 253
"`% ::= {134}", // 254
"`&& ::= {135}", // 255
"`( ::= {136}", // 256
"`) ::= {137}", // 257
"`+ ::= {138}", // 258
"`++ ::= {139}", // 259
"`, ::= {140}", // 260
"`- ::= {141}", // 261
"`-- ::= {142}", // 262
"`. ::= {143}", // 263
"`/ ::= {144}", // 264
"`; ::= {145}", // 265
"`< ::= {146}", // 266
"`<= ::= {147}", // 267
"`= ::= {148}", // 268
"`== ::= {149}", // 269
"`> ::= {150}", // 270
"`>= ::= {151}", // 271
"`[ ::= {152}", // 272
"`] ::= {153}", // 273
"`{ ::= {154}", // 274
"`|| ::= {155}", // 275
"`} ::= {156}", // 276
"`: ::= {157}", // 277
"token* ::= token* token", // 278
"token* ::= token* token", // 279
"digit++ ::= digit+ !digit", // 280
"ws* ::= ws* ws", // 281
"ws* ::= ws* ws", // 282
"digit+ ::= digit", // 283
"digit+ ::= digit+ digit", // 284
"", // 285
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
    { // 207: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `* ::= "*" [ws*] @void
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
    { // 213: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `- ::= "-" !"-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 216: `-- ::= "-" "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 217: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `. ::= "." [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `/ ::= "/" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `: ::= ":" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `; ::= ";" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `< ::= "<" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 228: `<= ::= "<" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 229: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: `= ::= "=" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 231: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 232: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 233: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `> ::= ">" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 236: `>= ::= ">" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 237: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 238: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 239: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 240: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 241: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 242: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 243: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 244: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 245: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 249: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 251: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 252: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 253: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 279: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 280: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 281: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 282: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 283: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 284: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 285: $$0 ::= token* @pass
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
      char parm0 = (Character)si.popPb();
      int result = actionObject.zero(parm0);
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
"int zero(char)",
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
1,1,
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
    1,
    -1,
    1,
    1,
    1,
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
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
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
