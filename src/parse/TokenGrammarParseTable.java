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
public int getEofSym() { return 166; }
public int getNttSym() { return 167; }
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
public int numSymbols() { return 168;}
private static final int MIN_REDUCTION = 547;
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
0x80000000|162, // match move
0x80000000|20, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 1
  }
,
{ // state 2
2,424, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
101,235, // "t"
  }
,
{ // state 4
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 5
93,283, // "a"
  }
,
{ // state 6
90,318, // "o"
  }
,
{ // state 7
0x80000000|197, // match move
0x80000000|263, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 8
167,MIN_REDUCTION+222, // $NT
  }
,
{ // state 9
108,446, // "h"
  }
,
{ // state 10
92,514, // "e"
  }
,
{ // state 11
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 12
103,219, // "f"
  }
,
{ // state 13
108,107, // "h"
  }
,
{ // state 14
104,280, // "i"
  }
,
{ // state 15
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 17
0x80000000|1, // match move
0x80000000|504, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 18
99,294, // "s"
  }
,
{ // state 19
121,362, // "+"
  }
,
{ // state 20
-1, // $$start
81, // start
29, // ws*
372, // $$0
90, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
316, // intLit2
433, // "0"
196, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
433, // {"1".."9"}
409, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
327, // token*
7, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 21
104,506, // "i"
  }
,
{ // state 22
90,217, // "o"
  }
,
{ // state 23
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 24
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 25
2,84, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 26
107,495, // "p"
  }
,
{ // state 27
99,194, // "s"
  }
,
{ // state 28
92,296, // "e"
  }
,
{ // state 29
0x80000000|357, // match move
0x80000000|199, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 30
124,237, // "0"
130,237, // {"1".."9"}
  }
,
{ // state 31
0x80000000|33, // match move
0x80000000|137, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 32
91,265, // "l"
  }
,
{ // state 33
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 34
94,382, // "n"
  }
,
{ // state 35
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 36
99,390, // "s"
101,385, // "t"
  }
,
{ // state 37
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 38
0x80000000|269, // match move
0x80000000|432, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 39
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 40
99,515, // "s"
  }
,
{ // state 41
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 42
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 43
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 44
108,312, // "h"
  }
,
{ // state 45
101,74, // "t"
  }
,
{ // state 46
104,278, // "i"
  }
,
{ // state 47
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 48
2,508, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 49
92,108, // "e"
  }
,
{ // state 50
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 51
94,482, // "n"
  }
,
{ // state 52
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 53
93,323, // "a"
  }
,
{ // state 54
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 55
112,413, // "g"
  }
,
{ // state 56
90,537, // "o"
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|105, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 58
109,258, // "v"
  }
,
{ // state 59
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 60
101,501, // "t"
  }
,
{ // state 61
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 62
2,520, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 63
101,266, // "t"
  }
,
{ // state 64
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 65
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 66
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 67
2,268, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 68
94,36, // "n"
  }
,
{ // state 69
2,70, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 70
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 71
2,181, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 72
99,221, // "s"
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|147, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 75
101,317, // "t"
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 77
89,359, // "b"
  }
,
{ // state 78
99,526, // "s"
101,288, // "t"
  }
,
{ // state 79
91,53, // "l"
104,414, // "i"
  }
,
{ // state 80
2,24, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 81
166,MIN_REDUCTION+0, // $
  }
,
{ // state 82
93,119, // "a"
106,94, // "u"
110,285, // "y"
  }
,
{ // state 83
102,420, // "d"
  }
,
{ // state 84
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 85
90,324, // "o"
  }
,
{ // state 86
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 89
91,138, // "l"
94,350, // "n"
96,12, // "r"
100,533, // "x"
  }
,
{ // state 90
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 91
101,365, // "t"
  }
,
{ // state 92
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 94
92,401, // "e"
  }
,
{ // state 95
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 96
90,222, // "o"
104,58, // "i"
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 98
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 99
91,380, // "l"
  }
,
{ // state 100
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 101
91,338, // "l"
  }
,
{ // state 102
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 103
111,281, // "m"
  }
,
{ // state 104
94,152, // "n"
  }
,
{ // state 105
2,342, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 106
90,79, // "o"
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|218, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 109
2,423, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 111
104,349, // "i"
  }
,
{ // state 112
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 113
104,429, // "i"
  }
,
{ // state 114
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 116
2,159, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 117
2,211, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 118
90,373, // "o"
  }
,
{ // state 119
94,395, // "n"
  }
,
{ // state 120
2,228, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 121
108,364, // "h"
  }
,
{ // state 122
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 125
93,284, // "a"
  }
,
{ // state 126
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 128
93,101, // "a"
  }
,
{ // state 129
96,346, // "r"
  }
,
{ // state 130
92,377, // "e"
  }
,
{ // state 131
98,121, // "c"
  }
,
{ // state 132
-1, // $$start
-1, // start
476, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
89, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
409, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 133
93,264, // "a"
  }
,
{ // state 134
105,440, // "w"
  }
,
{ // state 135
92,374, // "e"
  }
,
{ // state 136
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 138
99,422, // "s"
  }
,
{ // state 139
99,297, // "s"
  }
,
{ // state 140
2,64, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 141
90,528, // "o"
  }
,
{ // state 142
107,130, // "p"
  }
,
{ // state 143
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 145
2,65, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 147
2,238, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 148
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
244, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
316, // intLit2
433, // "0"
196, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
433, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 149
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 152
106,472, // "u"
  }
,
{ // state 153
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 154
0x80000000|1, // match move
0x80000000|344, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 155
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 156
-1, // $$start
-1, // start
314, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
399, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
409, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 157
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 159
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 161
97,484, // "k"
  }
,
{ // state 162
-1, // $$start
81, // start
29, // ws*
372, // $$0
90, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
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
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
409, // ws
-1, // {9 " "}
320, // eol
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
327, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 163
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 164
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 166
2,170, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 167
103,470, // "f"
  }
,
{ // state 168
167,MIN_REDUCTION+220, // $NT
  }
,
{ // state 169
-1, // $$start
-1, // start
543, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
348, // "t"
535, // "d"
256, // "f"
345, // "i"
223, // "w"
142, // "u"
307, // "p"
141, // "h"
106, // "v"
371, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
409, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 170
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 171
2,43, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 172
92,474, // "e"
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|246, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 174
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 175
90,68, // "o"
91,133, // "l"
93,78, // "a"
108,407, // "h"
  }
,
{ // state 176
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 177
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 178
91,499, // "l"
  }
,
{ // state 179
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 181
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 184
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 185
2,455, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 186
98,439, // "c"
  }
,
{ // state 187
92,425, // "e"
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|386, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 189
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 190
94,55, // "n"
  }
,
{ // state 191
94,88, // "n"
  }
,
{ // state 192
92,505, // "e"
  }
,
{ // state 193
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|145, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 195
0x80000000|447, // match move
0x80000000|182, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 196
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 197
124,433, // "0"
127,195, // digit
130,433, // {"1".."9"}
  }
,
{ // state 198
92,529, // "e"
  }
,
{ // state 199
-1, // $$start
-1, // start
-1, // ws*
436, // $$0
90, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
449, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
316, // intLit2
433, // "0"
196, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
433, // {"1".."9"}
39, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
327, // token*
7, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 200
101,513, // "t"
  }
,
{ // state 201
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 202
89,480, // "b"
  }
,
{ // state 203
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 204
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 205
2,363, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 206
0x80000000|291, // match move
0x80000000|123, // no-match move
// T-test match for 10:
134,
  }
,
{ // state 207
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 208
2,229, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 210
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 211
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 212
2,279, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 213
93,438, // "a"
  }
,
{ // state 214
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 215
92,412, // "e"
  }
,
{ // state 216
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 217
91,483, // "l"
  }
,
{ // state 218
2,274, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 219
93,493, // "a"
  }
,
{ // state 220
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 221
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 222
101,411, // "t"
  }
,
{ // state 223
104,236, // "i"
108,312, // "h"
  }
,
{ // state 224
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 226
104,271, // "i"
  }
,
{ // state 227
2,400, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 228
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 229
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 230
101,475, // "t"
  }
,
{ // state 231
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 232
92,539, // "e"
  }
,
{ // state 233
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 235
106,507, // "u"
  }
,
{ // state 236
101,542, // "t"
  }
,
{ // state 237
167,MIN_REDUCTION+224, // $NT
  }
,
{ // state 238
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 239
97,97, // "k"
  }
,
{ // state 240
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 241
96,462, // "r"
  }
,
{ // state 242
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 243
0x80000000|1, // match move
0x80000000|62, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 244
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 246
2,164, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 247
96,12, // "r"
  }
,
{ // state 248
109,531, // "v"
  }
,
{ // state 249
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 250
2,189, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 251
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 252
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 253
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 255
101,379, // "t"
  }
,
{ // state 256
90,387, // "o"
91,309, // "l"
93,299, // "a"
104,427, // "i"
  }
,
{ // state 257
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 258
93,60, // "a"
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|331, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 260
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 262
101,27, // "t"
  }
,
{ // state 263
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 264
99,40, // "s"
  }
,
{ // state 265
101,351, // "t"
  }
,
{ // state 266
93,34, // "a"
  }
,
{ // state 267
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 268
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 269
106,77, // "u"
  }
,
{ // state 270
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 271
98,319, // "c"
  }
,
{ // state 272
0x80000000|463, // match move
0x80000000|156, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 273
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 274
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 275
2,292, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 276
0x80000000|469, // match move
0x80000000|306, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 277
92,3, // "e"
  }
,
{ // state 278
113,10, // "z"
  }
,
{ // state 279
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 280
92,51, // "e"
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|212, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 282
92,512, // "e"
  }
,
{ // state 283
101,61, // "t"
  }
,
{ // state 284
98,45, // "c"
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 287
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 288
98,9, // "c"
  }
,
{ // state 289
2,503, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 291
134,497, // {10}
  }
,
{ // state 292
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 294
92,354, // "e"
  }
,
{ // state 295
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 297
0x80000000|1, // match move
0x80000000|517, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 298
99,63, // "s"
101,352, // "t"
  }
,
{ // state 299
91,18, // "l"
  }
,
{ // state 300
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 301
101,28, // "t"
  }
,
{ // state 302
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 305
102,72, // "d"
  }
,
{ // state 306
2,367, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 307
93,418, // "a"
96,96, // "r"
106,202, // "u"
  }
,
{ // state 308
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 309
90,5, // "o"
  }
,
{ // state 310
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 311
90,190, // "o"
110,188, // "y"
  }
,
{ // state 312
104,99, // "i"
  }
,
{ // state 313
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 314
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 316
2,260, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 317
103,26, // "f"
  }
,
{ // state 318
101,56, // "t"
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|250, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 320
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 321
112,49, // "g"
  }
,
{ // state 322
2,524, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 323
101,21, // "t"
  }
,
{ // state 324
94,46, // "n"
  }
,
{ // state 325
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 326
117,208, // "&"
  }
,
{ // state 327
0x80000000|369, // match move
0x80000000|148, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 328
0x80000000|1, // match move
0x80000000|408, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 329
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 330
2,47, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 331
2,536, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 332
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 334
91,138, // "l"
94,350, // "n"
100,533, // "x"
  }
,
{ // state 335
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 336
90,22, // "o"
96,282, // "r"
110,301, // "y"
  }
,
{ // state 337
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 338
0x80000000|434, // match move
0x80000000|500, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 339
99,91, // "s"
  }
,
{ // state 340
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 342
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 343
106,32, // "u"
  }
,
{ // state 344
2,210, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 345
94,298, // "n"
103,490, // "f"
111,527, // "m"
  }
,
{ // state 346
101,473, // "t"
  }
,
{ // state 347
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 348
93,383, // "a"
96,496, // "r"
108,353, // "h"
  }
,
{ // state 349
98,75, // "c"
  }
,
{ // state 350
106,103, // "u"
  }
,
{ // state 351
0x80000000|1, // match move
0x80000000|521, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 352
0x80000000|444, // match move
0x80000000|132, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 353
96,118, // "r"
104,139, // "i"
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 355
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 357
-1, // $$start
-1, // start
-1, // ws*
436, // $$0
90, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
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
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
39, // ws
-1, // {9 " "}
320, // eol
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
327, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 358
2,251, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 359
91,450, // "l"
  }
,
{ // state 360
92,83, // "e"
  }
,
{ // state 361
2,486, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 362
2,224, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 363
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 364
96,85, // "r"
  }
,
{ // state 365
96,125, // "r"
  }
,
{ // state 366
2,42, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 367
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 368
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 369
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
244, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
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
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
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
-1, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 370
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 371
94,131, // "n"
  }
,
{ // state 372
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 373
105,272, // "w"
  }
,
{ // state 374
90,426, // "o"
  }
,
{ // state 375
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 376
2,273, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 377
96,410, // "r"
  }
,
{ // state 378
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|166, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 380
92,57, // "e"
  }
,
{ // state 381
167,MIN_REDUCTION+223, // $NT
  }
,
{ // state 382
98,135, // "c"
  }
,
{ // state 383
101,113, // "t"
  }
,
{ // state 384
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 385
104,104, // "i"
  }
,
{ // state 386
2,220, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 387
96,259, // "r"
  }
,
{ // state 388
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 389
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 390
101,245, // "t"
  }
,
{ // state 391
0x80000000|1, // match move
0x80000000|445, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 392
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 393
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 394
0x80000000|19, // match move
0x80000000|67, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 395
99,14, // "s"
  }
,
{ // state 396
2,456, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 399
0x80000000|509, // match move
0x80000000|169, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 400
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 402
2,204, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 404
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 406
110,188, // "y"
  }
,
{ // state 407
93,241, // "a"
  }
,
{ // state 408
2,66, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 409
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 410
0x80000000|1, // match move
0x80000000|358, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 411
92,186, // "e"
  }
,
{ // state 412
96,255, // "r"
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|80, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 414
102,173, // "d"
  }
,
{ // state 415
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 417
2,98, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 418
98,161, // "c"
  }
,
{ // state 419
89,381, // "b"
90,381, // "o"
91,381, // "l"
92,381, // "e"
93,381, // "a"
94,381, // "n"
96,381, // "r"
97,381, // "k"
98,381, // "c"
99,381, // "s"
100,381, // "x"
101,381, // "t"
102,381, // "d"
103,381, // "f"
104,381, // "i"
105,381, // "w"
106,381, // "u"
107,381, // "p"
108,381, // "h"
109,381, // "v"
110,381, // "y"
111,381, // "m"
112,381, // "g"
113,381, // "z"
124,237, // "0"
126,168, // letter
127,492, // digit
128,8, // "_"
129,381, // {"A".."Z" "j" "q"}
130,237, // {"1".."9"}
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|534, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 421
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 422
92,76, // "e"
  }
,
{ // state 423
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 424
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 425
0x80000000|1, // match move
0x80000000|361, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 426
103,73, // "f"
  }
,
{ // state 427
94,128, // "n"
  }
,
{ // state 428
2,177, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 429
98,498, // "c"
  }
,
{ // state 430
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 431
2,510, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 432
2,340, // ws*
106,77, // "u"
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 433
0x80000000|95, // match move
0x80000000|388, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 434
91,406, // "l"
  }
,
{ // state 435
101,491, // "t"
105,502, // "w"
106,142, // "u"
108,141, // "h"
110,371, // "y"
  }
,
{ // state 436
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 437
2,249, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 438
94,485, // "n"
  }
,
{ // state 439
101,360, // "t"
  }
,
{ // state 440
0x80000000|1, // match move
0x80000000|48, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 441
2,207, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 444
92,247, // "e"
  }
,
{ // state 445
2,458, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 446
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 447
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 448
2,184, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 449
90,190, // "o"
  }
,
{ // state 450
92,460, // "e"
  }
,
{ // state 451
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 453
2,525, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 454
115,376, // "="
  }
,
{ // state 455
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 456
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 457
2,332, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 458
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 459
96,82, // "r"
108,353, // "h"
  }
,
{ // state 460
0x80000000|1, // match move
0x80000000|120, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 461
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 462
0x80000000|1, // match move
0x80000000|396, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 463
99,286, // "s"
  }
,
{ // state 464
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 469
115,109, // "="
  }
,
{ // state 470
93,343, // "a"
  }
,
{ // state 471
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 472
92,243, // "e"
  }
,
{ // state 473
0x80000000|1, // match move
0x80000000|532, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 474
111,232, // "m"
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|140, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 476
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 477
2,23, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 478
92,134, // "e"
93,200, // "a"
106,178, // "u"
  }
,
{ // state 479
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 480
91,226, // "l"
  }
,
{ // state 481
2,543, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 482
101,17, // "t"
  }
,
{ // state 483
92,213, // "e"
  }
,
{ // state 484
93,321, // "a"
  }
,
{ // state 485
0x80000000|1, // match move
0x80000000|428, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 486
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 487
99,215, // "s"
  }
,
{ // state 488
90,129, // "o"
91,172, // "l"
  }
,
{ // state 489
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|402, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 491
93,383, // "a"
96,111, // "r"
  }
,
{ // state 492
167,MIN_REDUCTION+221, // $NT
  }
,
{ // state 493
98,187, // "c"
  }
,
{ // state 494
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|275, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 496
93,119, // "a"
104,349, // "i"
106,94, // "u"
110,285, // "y"
  }
,
{ // state 497
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|431, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 499
91,165, // "l"
  }
,
{ // state 500
-1, // $$start
-1, // start
451, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
160, // `boolean
530, // `class
163, // `extends
4, // `void
214, // `int
267, // `while
392, // `if
115, // `else
398, // `for
467, // `break
179, // `this
150, // `false
231, // `true
201, // `super
37, // `null
87, // `return
313, // `instanceof
468, // `new
290, // `abstract
370, // `assert
538, // `byte
404, // `case
540, // `catch
329, // `char
389, // `const
461, // `continue
443, // `default
341, // `do
143, // `double
54, // `enum
110, // `final
254, // `finally
92, // `float
155, // `goto
465, // `implements
50, // `import
240, // `interface
378, // `long
295, // `native
375, // `package
261, // `private
35, // `protected
270, // `public
516, // `short
158, // `static
325, // `strictfp
86, // `switch
333, // `synchronized
421, // `throw
52, // `throws
242, // `transient
16, // `try
209, // `volatile
308, // `!
356, // `!=
59, // `%
430, // `&&
384, // `*
464, // `(
234, // `)
304, // `{
416, // `}
337, // `-
11, // `+
174, // `=
183, // `==
149, // `[
303, // `]
315, // `||
126, // `<
112, // `<=
519, // `,
100, // `>
93, // `>=
127, // `.
157, // `;
405, // `++
203, // `--
180, // `/
253, // `:
522, // ID
355, // INTLIT
153, // STRINGLIT
397, // CHARLIT
336, // "b"
-1, // "o"
311, // "l"
334, // "e"
544, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
175, // "c"
435, // "s"
-1, // "x"
459, // "t"
535, // "d"
256, // "f"
345, // "i"
44, // "w"
-1, // "u"
307, // "p"
-1, // "h"
106, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
276, // "!"
454, // "="
71, // "%"
326, // "&"
117, // "("
448, // ")"
417, // "*"
394, // "+"
330, // "-"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
409, // ws
144, // {9 " "}
320, // eol
489, // {10}
206, // {13}
122, // {130}
310, // {131}
293, // {132}
146, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
541, // {139}
415, // {140}
102, // {141}
368, // {142}
471, // {143}
114, // {144}
403, // {145}
225, // {146}
302, // {147}
335, // {148}
257, // {149}
347, // {150}
442, // {151}
511, // {152}
136, // {153}
233, // {154}
466, // {155}
176, // {156}
151, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 501
92,154, // "e"
  }
,
{ // state 502
104,236, // "i"
  }
,
{ // state 503
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 504
2,479, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 505
94,305, // "n"
  }
,
{ // state 506
91,198, // "l"
  }
,
{ // state 507
96,191, // "r"
  }
,
{ // state 508
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 509
101,491, // "t"
105,502, // "w"
106,142, // "u"
108,141, // "h"
110,371, // "y"
  }
,
{ // state 510
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 512
93,239, // "a"
  }
,
{ // state 513
104,248, // "i"
  }
,
{ // state 514
102,391, // "d"
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 516
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 517
2,41, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 518
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 519
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 520
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 521
2,216, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 523
2,193, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 524
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 525
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 526
92,252, // "e"
  }
,
{ // state 527
107,488, // "p"
  }
,
{ // state 528
96,230, // "r"
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|457, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 530
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 531
92,328, // "e"
  }
,
{ // state 532
2,393, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 533
101,192, // "t"
  }
,
{ // state 534
2,15, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 535
90,38, // "o"
92,167, // "e"
  }
,
{ // state 536
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 537
0x80000000|1, // match move
0x80000000|441, // no-match move
0x80000000|419, // NT-test-match state for idChar
  }
,
{ // state 538
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 539
94,262, // "n"
  }
,
{ // state 540
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 541
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 542
98,13, // "c"
  }
,
{ // state 543
131,39, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 544
89,339, // "b"
99,487, // "s"
  }
,
{ // state 545
2,518, // ws*
131,409, // ws
132,144, // {9 " "}
133,320, // eol
134,489, // {10}
135,206, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[546][];
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
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `- ::= "-" ws*
(67<<16)+2,
// `- ::= "-"
(67<<16)+1,
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(123<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(126<<16)+1,
// digit ::= {"0".."9"}
(127<<16)+1,
// ws ::= {9 " "}
(131<<16)+1,
// ws ::= eol
(131<<16)+1,
// eol ::= {10}
(133<<16)+1,
// eol ::= {13} {10}
(133<<16)+2,
// eol ::= {13} !10
(133<<16)+1,
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
(164<<16)+2,
// token* ::= token
(164<<16)+1,
// digit++ ::= digit+ !digit
(125<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(165<<16)+1,
// digit+ ::= digit+ digit
(165<<16)+2,
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
132, // 9
134, // 10
-1, // 11
-1, // 12
135, // 13
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
132, // " "
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
-1, // "."
-1, // "/"
124, // "0"
130, // "1"
130, // "2"
130, // "3"
130, // "4"
130, // "5"
130, // "6"
130, // "7"
130, // "8"
130, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
115, // "="
-1, // ">"
-1, // "?"
-1, // "@"
129, // "A"
129, // "B"
129, // "C"
129, // "D"
129, // "E"
129, // "F"
129, // "G"
129, // "H"
129, // "I"
129, // "J"
129, // "K"
129, // "L"
129, // "M"
129, // "N"
129, // "O"
129, // "P"
129, // "Q"
129, // "R"
129, // "S"
129, // "T"
129, // "U"
129, // "V"
129, // "W"
129, // "X"
129, // "Y"
129, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
128, // "_"
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
129, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
129, // "q"
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
136, // 130
137, // 131
138, // 132
139, // 133
140, // 134
141, // 135
142, // 136
143, // 137
144, // 138
145, // 139
146, // 140
147, // 141
148, // 142
149, // 143
150, // 144
151, // 145
152, // 146
153, // 147
154, // 148
155, // 149
156, // 150
157, // 151
158, // 152
159, // 153
160, // 154
161, // 155
162, // 156
163, // 157
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
"`== ::= \"=\" \"=\" ws*", // 213
"`== ::= \"=\" \"=\" ws*", // 214
"`- ::= \"-\" ws*", // 215
"`- ::= \"-\" ws*", // 216
"INTLIT ::= # intLit2 ws*", // 217
"INTLIT ::= # intLit2 ws*", // 218
"intLit2 ::= !\"0\" digit++", // 219
"idChar ::= letter", // 220
"idChar ::= digit", // 221
"idChar ::= \"_\"", // 222
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 223
"digit ::= {\"0\"..\"9\"}", // 224
"ws ::= {9 \" \"}", // 225
"ws ::= eol", // 226
"eol ::= {10} registerNewline", // 227
"eol ::= {13} {10} registerNewline", // 228
"eol ::= {13} !10 registerNewline", // 229
"CHARLIT ::= {130}", // 230
"ID ::= {131}", // 231
"STRINGLIT ::= {132}", // 232
"`! ::= {133}", // 233
"`% ::= {134}", // 234
"`&& ::= {135}", // 235
"`( ::= {136}", // 236
"`) ::= {137}", // 237
"`+ ::= {138}", // 238
"`++ ::= {139}", // 239
"`, ::= {140}", // 240
"`- ::= {141}", // 241
"`-- ::= {142}", // 242
"`. ::= {143}", // 243
"`/ ::= {144}", // 244
"`; ::= {145}", // 245
"`< ::= {146}", // 246
"`<= ::= {147}", // 247
"`= ::= {148}", // 248
"`== ::= {149}", // 249
"`> ::= {150}", // 250
"`>= ::= {151}", // 251
"`[ ::= {152}", // 252
"`] ::= {153}", // 253
"`{ ::= {154}", // 254
"`|| ::= {155}", // 255
"`} ::= {156}", // 256
"`: ::= {157}", // 257
"token* ::= token* token", // 258
"token* ::= token* token", // 259
"digit++ ::= digit+ !digit", // 260
"ws* ::= ws* ws", // 261
"ws* ::= ws* ws", // 262
"digit+ ::= digit", // 263
"digit+ ::= digit+ digit", // 264
"", // 265
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
    { // 213: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 214: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 215: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 218: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 219: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 220: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 222: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 223: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 224: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 225: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 229: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 231: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 232: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 233: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 259: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 260: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 261: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 262: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 263: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 264: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 265: $$0 ::= token* @pass
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
