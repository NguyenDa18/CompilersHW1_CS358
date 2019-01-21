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
public int getEofSym() { return 169; }
public int getNttSym() { return 170; }
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
public int numSymbols() { return 171;}
private static final int MIN_REDUCTION = 554;
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
0x80000000|167, // match move
0x80000000|21, // no-match move
// T-test match for "0":
127,
  }
,
{ // state 1
  }
,
{ // state 2
2,431, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
101,242, // "t"
  }
,
{ // state 4
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 5
93,289, // "a"
  }
,
{ // state 6
90,325, // "o"
  }
,
{ // state 7
0x80000000|203, // match move
0x80000000|270, // no-match move
0x80000000|32, // NT-test-match state for digit
  }
,
{ // state 8
170,MIN_REDUCTION+228, // $NT
  }
,
{ // state 9
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 10
108,453, // "h"
  }
,
{ // state 11
92,521, // "e"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
103,226, // "f"
  }
,
{ // state 14
108,111, // "h"
  }
,
{ // state 15
104,286, // "i"
  }
,
{ // state 16
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 18
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 19
99,301, // "s"
  }
,
{ // state 20
121,369, // "+"
  }
,
{ // state 21
-1, // $$start
85, // start
31, // ws*
379, // $$0
94, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
323, // intLit2
440, // "0"
202, // digit++
-1, // letter
33, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
440, // {"1".."9"}
416, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
334, // token*
7, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 22
104,513, // "i"
  }
,
{ // state 23
90,224, // "o"
  }
,
{ // state 24
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 25
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 26
2,88, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 27
107,502, // "p"
  }
,
{ // state 28
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 29
99,200, // "s"
  }
,
{ // state 30
92,303, // "e"
  }
,
{ // state 31
0x80000000|363, // match move
0x80000000|205, // no-match move
// T-test match for "0":
127,
  }
,
{ // state 32
127,244, // "0"
133,244, // {"1".."9"}
  }
,
{ // state 33
0x80000000|35, // match move
0x80000000|141, // no-match move
0x80000000|32, // NT-test-match state for digit
  }
,
{ // state 34
91,272, // "l"
  }
,
{ // state 35
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 36
94,388, // "n"
  }
,
{ // state 37
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 38
99,397, // "s"
101,392, // "t"
  }
,
{ // state 39
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 40
0x80000000|276, // match move
0x80000000|439, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 41
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 42
99,522, // "s"
  }
,
{ // state 43
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 44
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 45
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 46
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 47
108,319, // "h"
  }
,
{ // state 48
101,78, // "t"
  }
,
{ // state 49
104,284, // "i"
  }
,
{ // state 50
2,515, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 51
92,112, // "e"
  }
,
{ // state 52
2,192, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 54
94,489, // "n"
  }
,
{ // state 55
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 56
93,330, // "a"
  }
,
{ // state 57
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 58
112,420, // "g"
  }
,
{ // state 59
90,544, // "o"
  }
,
{ // state 60
0x80000000|1, // match move
0x80000000|109, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 61
109,265, // "v"
  }
,
{ // state 62
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 63
101,508, // "t"
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|211, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 65
2,527, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 66
101,273, // "t"
  }
,
{ // state 67
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 68
122,468, // "-"
  }
,
{ // state 69
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 70
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 71
2,275, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 72
94,38, // "n"
  }
,
{ // state 73
2,74, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 74
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 75
2,186, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 76
99,228, // "s"
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 78
0x80000000|1, // match move
0x80000000|152, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 79
101,324, // "t"
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 81
89,365, // "b"
  }
,
{ // state 82
99,533, // "s"
101,294, // "t"
  }
,
{ // state 83
91,56, // "l"
104,421, // "i"
  }
,
{ // state 84
2,25, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 85
169,MIN_REDUCTION+0, // $
  }
,
{ // state 86
93,123, // "a"
106,98, // "u"
110,291, // "y"
  }
,
{ // state 87
102,427, // "d"
  }
,
{ // state 88
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 89
90,331, // "o"
  }
,
{ // state 90
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|530, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 93
91,142, // "l"
94,356, // "n"
96,13, // "r"
100,540, // "x"
  }
,
{ // state 94
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 95
101,372, // "t"
  }
,
{ // state 96
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 98
92,408, // "e"
  }
,
{ // state 99
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 100
90,229, // "o"
104,61, // "i"
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 102
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 103
91,386, // "l"
  }
,
{ // state 104
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 105
91,344, // "l"
  }
,
{ // state 106
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 107
111,287, // "m"
  }
,
{ // state 108
94,157, // "n"
  }
,
{ // state 109
2,348, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 110
90,83, // "o"
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|73, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 113
2,430, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 115
104,355, // "i"
  }
,
{ // state 116
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 117
104,436, // "i"
  }
,
{ // state 118
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 120
2,164, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 121
2,218, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 122
90,380, // "o"
  }
,
{ // state 123
94,402, // "n"
  }
,
{ // state 124
2,235, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 125
108,371, // "h"
  }
,
{ // state 126
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 129
93,290, // "a"
  }
,
{ // state 130
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 132
93,105, // "a"
  }
,
{ // state 133
96,352, // "r"
  }
,
{ // state 134
92,383, // "e"
  }
,
{ // state 135
98,125, // "c"
  }
,
{ // state 136
-1, // $$start
-1, // start
483, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
93, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
416, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 137
93,271, // "a"
  }
,
{ // state 138
105,447, // "w"
  }
,
{ // state 139
92,381, // "e"
  }
,
{ // state 140
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 142
99,429, // "s"
  }
,
{ // state 143
99,304, // "s"
  }
,
{ // state 144
2,67, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 145
90,535, // "o"
  }
,
{ // state 146
107,134, // "p"
  }
,
{ // state 147
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 149
2,69, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 150
2,44, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 152
2,245, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 153
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
251, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
323, // intLit2
440, // "0"
202, // digit++
-1, // letter
33, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
440, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 154
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 157
106,479, // "u"
  }
,
{ // state 158
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 159
0x80000000|1, // match move
0x80000000|350, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 160
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 161
-1, // $$start
-1, // start
321, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
406, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
416, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 162
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 164
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 166
97,491, // "k"
  }
,
{ // state 167
-1, // $$start
85, // start
31, // ws*
379, // $$0
94, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
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
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
416, // ws
-1, // {9 " "}
327, // eol
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
334, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 168
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 169
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 170
0x80000000|1, // match move
0x80000000|120, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 171
2,175, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 172
103,477, // "f"
  }
,
{ // state 173
170,MIN_REDUCTION+226, // $NT
  }
,
{ // state 174
-1, // $$start
-1, // start
550, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
354, // "t"
542, // "d"
263, // "f"
351, // "i"
230, // "w"
146, // "u"
314, // "p"
145, // "h"
110, // "v"
378, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
416, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 175
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 176
2,46, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 177
92,481, // "e"
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|253, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 179
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 180
90,72, // "o"
91,137, // "l"
93,82, // "a"
108,414, // "h"
  }
,
{ // state 181
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 182
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 183
91,506, // "l"
  }
,
{ // state 184
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 186
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 189
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 190
2,461, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 191
98,446, // "c"
  }
,
{ // state 192
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 193
92,432, // "e"
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|393, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 195
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 196
94,58, // "n"
  }
,
{ // state 197
94,92, // "n"
  }
,
{ // state 198
92,512, // "e"
  }
,
{ // state 199
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 201
0x80000000|454, // match move
0x80000000|187, // no-match move
0x80000000|32, // NT-test-match state for digit
  }
,
{ // state 202
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 203
127,440, // "0"
130,201, // digit
133,440, // {"1".."9"}
  }
,
{ // state 204
92,536, // "e"
  }
,
{ // state 205
-1, // $$start
-1, // start
-1, // ws*
443, // $$0
94, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
456, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
323, // intLit2
440, // "0"
202, // digit++
-1, // letter
33, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
440, // {"1".."9"}
41, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
334, // token*
7, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 206
101,520, // "t"
  }
,
{ // state 207
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 208
89,487, // "b"
  }
,
{ // state 209
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 210
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 211
2,370, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 212
2,28, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 213
0x80000000|298, // match move
0x80000000|127, // no-match move
// T-test match for 10:
137,
  }
,
{ // state 214
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 215
2,236, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 217
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 218
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 219
2,285, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 220
93,445, // "a"
  }
,
{ // state 221
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 222
92,419, // "e"
  }
,
{ // state 223
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 224
91,490, // "l"
  }
,
{ // state 225
2,280, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 226
93,500, // "a"
  }
,
{ // state 227
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 228
0x80000000|1, // match move
0x80000000|176, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 229
101,418, // "t"
  }
,
{ // state 230
104,243, // "i"
108,319, // "h"
  }
,
{ // state 231
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 233
104,278, // "i"
  }
,
{ // state 234
2,407, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 235
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 236
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 237
101,482, // "t"
  }
,
{ // state 238
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 239
92,546, // "e"
  }
,
{ // state 240
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 242
106,514, // "u"
  }
,
{ // state 243
101,549, // "t"
  }
,
{ // state 244
170,MIN_REDUCTION+230, // $NT
  }
,
{ // state 245
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 246
97,101, // "k"
  }
,
{ // state 247
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 248
96,469, // "r"
  }
,
{ // state 249
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 250
0x80000000|1, // match move
0x80000000|65, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 251
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 252
0x80000000|1, // match move
0x80000000|329, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 253
2,169, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 254
96,13, // "r"
  }
,
{ // state 255
109,538, // "v"
  }
,
{ // state 256
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 257
2,195, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 258
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|190, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 260
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 262
101,385, // "t"
  }
,
{ // state 263
90,394, // "o"
91,316, // "l"
93,306, // "a"
104,434, // "i"
  }
,
{ // state 264
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 265
93,63, // "a"
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|337, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 267
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 269
101,29, // "t"
  }
,
{ // state 270
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 271
99,42, // "s"
  }
,
{ // state 272
101,357, // "t"
  }
,
{ // state 273
93,36, // "a"
  }
,
{ // state 274
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 275
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 276
106,81, // "u"
  }
,
{ // state 277
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 278
98,326, // "c"
  }
,
{ // state 279
0x80000000|470, // match move
0x80000000|161, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 280
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 281
2,299, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 282
0x80000000|476, // match move
0x80000000|313, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 283
92,3, // "e"
  }
,
{ // state 284
113,11, // "z"
  }
,
{ // state 285
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 286
92,54, // "e"
  }
,
{ // state 287
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 288
92,519, // "e"
  }
,
{ // state 289
101,64, // "t"
  }
,
{ // state 290
98,48, // "c"
  }
,
{ // state 291
0x80000000|1, // match move
0x80000000|234, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|488, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 293
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 294
98,10, // "c"
  }
,
{ // state 295
2,510, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 296
2,9, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 298
137,504, // {10}
  }
,
{ // state 299
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 301
92,360, // "e"
  }
,
{ // state 302
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|373, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 304
0x80000000|1, // match move
0x80000000|524, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 305
99,66, // "s"
101,358, // "t"
  }
,
{ // state 306
91,19, // "l"
  }
,
{ // state 307
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 308
101,30, // "t"
  }
,
{ // state 309
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 312
102,76, // "d"
  }
,
{ // state 313
2,374, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 314
93,425, // "a"
96,100, // "r"
106,208, // "u"
  }
,
{ // state 315
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 316
90,5, // "o"
  }
,
{ // state 317
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 318
90,196, // "o"
110,194, // "y"
  }
,
{ // state 319
104,103, // "i"
  }
,
{ // state 320
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 321
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 323
2,267, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 324
103,27, // "f"
  }
,
{ // state 325
101,59, // "t"
  }
,
{ // state 326
0x80000000|1, // match move
0x80000000|257, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 327
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 328
112,51, // "g"
  }
,
{ // state 329
2,531, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 330
101,22, // "t"
  }
,
{ // state 331
94,49, // "n"
  }
,
{ // state 332
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 333
117,215, // "&"
  }
,
{ // state 334
0x80000000|376, // match move
0x80000000|153, // no-match move
// T-test match for "0":
127,
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|415, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 336
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 337
2,543, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 338
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 340
91,142, // "l"
94,356, // "n"
100,540, // "x"
  }
,
{ // state 341
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 342
90,23, // "o"
96,288, // "r"
110,308, // "y"
  }
,
{ // state 343
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 344
0x80000000|441, // match move
0x80000000|507, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 345
99,95, // "s"
  }
,
{ // state 346
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 348
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 349
106,34, // "u"
  }
,
{ // state 350
2,217, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 351
94,305, // "n"
103,497, // "f"
111,534, // "m"
  }
,
{ // state 352
101,480, // "t"
  }
,
{ // state 353
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 354
93,389, // "a"
96,503, // "r"
108,359, // "h"
  }
,
{ // state 355
98,79, // "c"
  }
,
{ // state 356
106,107, // "u"
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|528, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 358
0x80000000|451, // match move
0x80000000|136, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 359
96,122, // "r"
104,143, // "i"
  }
,
{ // state 360
0x80000000|1, // match move
0x80000000|295, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 361
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 363
-1, // $$start
-1, // start
-1, // ws*
443, // $$0
94, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
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
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
41, // ws
-1, // {9 " "}
327, // eol
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
334, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 364
2,258, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 365
91,457, // "l"
  }
,
{ // state 366
0x80000000|68, // match move
0x80000000|150, // no-match move
// T-test match for "-":
122,
  }
,
{ // state 367
92,87, // "e"
  }
,
{ // state 368
2,493, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 369
2,231, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 370
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 371
96,89, // "r"
  }
,
{ // state 372
96,129, // "r"
  }
,
{ // state 373
2,45, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 374
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 376
4,251, // token
5,165, // `boolean
6,537, // `class
7,168, // `extends
8,4, // `void
9,221, // `int
10,274, // `while
11,399, // `if
12,119, // `else
13,405, // `for
14,474, // `break
15,184, // `this
16,155, // `false
17,238, // `true
18,207, // `super
19,39, // `null
20,91, // `return
21,320, // `instanceof
22,475, // `new
23,297, // `abstract
24,377, // `assert
25,545, // `byte
26,411, // `case
27,547, // `catch
28,336, // `char
29,396, // `const
30,467, // `continue
31,450, // `default
32,347, // `do
33,147, // `double
34,57, // `enum
35,114, // `final
36,261, // `finally
37,96, // `float
38,160, // `goto
39,472, // `implements
40,53, // `import
41,247, // `interface
42,384, // `long
43,302, // `native
44,382, // `package
45,268, // `private
46,37, // `protected
47,277, // `public
48,523, // `short
49,163, // `static
50,332, // `strictfp
51,90, // `switch
52,339, // `synchronized
53,428, // `throw
54,55, // `throws
55,249, // `transient
56,17, // `try
57,216, // `volatile
58,315, // `!
59,362, // `!=
60,62, // `%
61,437, // `&&
62,390, // `*
63,471, // `(
64,241, // `)
65,311, // `{
66,423, // `}
67,343, // `-
68,12, // `+
69,179, // `=
70,188, // `==
71,154, // `[
72,310, // `]
73,322, // `||
74,130, // `<
75,116, // `<=
76,526, // `,
77,104, // `>
78,97, // `>=
79,131, // `.
80,162, // `;
81,412, // `++
82,209, // `--
83,185, // `/
84,260, // `:
85,529, // ID
86,361, // INTLIT
87,158, // STRINGLIT
88,404, // CHARLIT
  }
,
{ // state 377
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 378
94,135, // "n"
  }
,
{ // state 379
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 380
105,279, // "w"
  }
,
{ // state 381
90,433, // "o"
  }
,
{ // state 382
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 383
96,417, // "r"
  }
,
{ // state 384
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 385
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 386
92,60, // "e"
  }
,
{ // state 387
170,MIN_REDUCTION+229, // $NT
  }
,
{ // state 388
98,139, // "c"
  }
,
{ // state 389
101,117, // "t"
  }
,
{ // state 390
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 391
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 392
104,108, // "i"
  }
,
{ // state 393
2,227, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 394
96,266, // "r"
  }
,
{ // state 395
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 397
101,252, // "t"
  }
,
{ // state 398
0x80000000|1, // match move
0x80000000|452, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 399
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 400
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 401
0x80000000|20, // match move
0x80000000|71, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 402
99,15, // "s"
  }
,
{ // state 403
2,462, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 404
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 406
0x80000000|516, // match move
0x80000000|174, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 407
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 408
0x80000000|1, // match move
0x80000000|484, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 409
2,210, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 413
110,194, // "y"
  }
,
{ // state 414
93,248, // "a"
  }
,
{ // state 415
2,70, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 418
92,191, // "e"
  }
,
{ // state 419
96,262, // "r"
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|84, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 421
102,178, // "d"
  }
,
{ // state 422
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 423
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 424
2,102, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 425
98,166, // "c"
  }
,
{ // state 426
89,387, // "b"
90,387, // "o"
91,387, // "l"
92,387, // "e"
93,387, // "a"
94,387, // "n"
96,387, // "r"
97,387, // "k"
98,387, // "c"
99,387, // "s"
100,387, // "x"
101,387, // "t"
102,387, // "d"
103,387, // "f"
104,387, // "i"
105,387, // "w"
106,387, // "u"
107,387, // "p"
108,387, // "h"
109,387, // "v"
110,387, // "y"
111,387, // "m"
112,387, // "g"
113,387, // "z"
127,244, // "0"
129,173, // letter
130,499, // digit
131,8, // "_"
132,387, // {"A".."Z" "j" "q"}
133,244, // {"1".."9"}
  }
,
{ // state 427
0x80000000|1, // match move
0x80000000|541, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 428
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 429
92,80, // "e"
  }
,
{ // state 430
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 431
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 432
0x80000000|1, // match move
0x80000000|368, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 433
103,77, // "f"
  }
,
{ // state 434
94,132, // "n"
  }
,
{ // state 435
2,182, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 436
98,505, // "c"
  }
,
{ // state 437
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 438
2,517, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 439
2,346, // ws*
106,81, // "u"
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 440
0x80000000|99, // match move
0x80000000|395, // no-match move
0x80000000|32, // NT-test-match state for digit
  }
,
{ // state 441
91,413, // "l"
  }
,
{ // state 442
101,498, // "t"
105,509, // "w"
106,146, // "u"
108,145, // "h"
110,378, // "y"
  }
,
{ // state 443
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 444
2,256, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 445
94,492, // "n"
  }
,
{ // state 446
101,367, // "t"
  }
,
{ // state 447
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 448
2,214, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 449
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 450
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 451
92,254, // "e"
  }
,
{ // state 452
2,464, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 453
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 454
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 455
2,189, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 456
90,196, // "o"
  }
,
{ // state 457
92,466, // "e"
  }
,
{ // state 458
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 459
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 460
2,532, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 461
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 462
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 463
2,338, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 464
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 465
96,86, // "r"
108,359, // "h"
  }
,
{ // state 466
0x80000000|1, // match move
0x80000000|124, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 467
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 468
2,391, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 469
0x80000000|1, // match move
0x80000000|403, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 470
99,292, // "s"
  }
,
{ // state 471
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 473
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 474
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 475
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 476
115,113, // "="
  }
,
{ // state 477
93,349, // "a"
  }
,
{ // state 478
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 479
92,250, // "e"
  }
,
{ // state 480
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 481
111,239, // "m"
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|144, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 483
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 484
2,24, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 485
92,138, // "e"
93,206, // "a"
106,183, // "u"
  }
,
{ // state 486
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 487
91,233, // "l"
  }
,
{ // state 488
2,550, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 489
101,18, // "t"
  }
,
{ // state 490
92,220, // "e"
  }
,
{ // state 491
93,328, // "a"
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 493
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 494
99,222, // "s"
  }
,
{ // state 495
90,133, // "o"
91,177, // "l"
  }
,
{ // state 496
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|409, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 498
93,389, // "a"
96,115, // "r"
  }
,
{ // state 499
170,MIN_REDUCTION+227, // $NT
  }
,
{ // state 500
98,193, // "c"
  }
,
{ // state 501
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|281, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 503
93,123, // "a"
104,355, // "i"
106,98, // "u"
110,291, // "y"
  }
,
{ // state 504
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 505
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 506
91,170, // "l"
  }
,
{ // state 507
-1, // $$start
-1, // start
458, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
165, // `boolean
537, // `class
168, // `extends
4, // `void
221, // `int
274, // `while
399, // `if
119, // `else
405, // `for
474, // `break
184, // `this
155, // `false
238, // `true
207, // `super
39, // `null
91, // `return
320, // `instanceof
475, // `new
297, // `abstract
377, // `assert
545, // `byte
411, // `case
547, // `catch
336, // `char
396, // `const
467, // `continue
450, // `default
347, // `do
147, // `double
57, // `enum
114, // `final
261, // `finally
96, // `float
160, // `goto
472, // `implements
53, // `import
247, // `interface
384, // `long
302, // `native
382, // `package
268, // `private
37, // `protected
277, // `public
523, // `short
163, // `static
332, // `strictfp
90, // `switch
339, // `synchronized
428, // `throw
55, // `throws
249, // `transient
17, // `try
216, // `volatile
315, // `!
362, // `!=
62, // `%
437, // `&&
390, // `*
471, // `(
241, // `)
311, // `{
423, // `}
343, // `-
12, // `+
179, // `=
188, // `==
154, // `[
310, // `]
322, // `||
130, // `<
116, // `<=
526, // `,
104, // `>
97, // `>=
131, // `.
162, // `;
412, // `++
209, // `--
185, // `/
260, // `:
529, // ID
361, // INTLIT
158, // STRINGLIT
404, // CHARLIT
342, // "b"
-1, // "o"
318, // "l"
340, // "e"
551, // "a"
485, // "n"
-1, // idChar
283, // "r"
-1, // "k"
180, // "c"
442, // "s"
-1, // "x"
465, // "t"
542, // "d"
263, // "f"
351, // "i"
47, // "w"
-1, // "u"
314, // "p"
-1, // "h"
110, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
282, // "!"
-1, // "="
75, // "%"
333, // "&"
121, // "("
455, // ")"
424, // "*"
401, // "+"
366, // "-"
212, // "."
296, // "/"
52, // ":"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
416, // ws
148, // {9 " "}
327, // eol
496, // {10}
213, // {13}
126, // {130}
317, // {131}
300, // {132}
151, // {133}
128, // {134}
501, // {135}
307, // {136}
293, // {137}
459, // {138}
548, // {139}
422, // {140}
106, // {141}
375, // {142}
478, // {143}
118, // {144}
410, // {145}
232, // {146}
309, // {147}
341, // {148}
264, // {149}
353, // {150}
449, // {151}
518, // {152}
140, // {153}
240, // {154}
473, // {155}
181, // {156}
156, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 508
92,159, // "e"
  }
,
{ // state 509
104,243, // "i"
  }
,
{ // state 510
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 511
2,486, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 512
94,312, // "n"
  }
,
{ // state 513
91,204, // "l"
  }
,
{ // state 514
96,197, // "r"
  }
,
{ // state 515
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 516
101,498, // "t"
105,509, // "w"
106,146, // "u"
108,145, // "h"
110,378, // "y"
  }
,
{ // state 517
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 519
93,246, // "a"
  }
,
{ // state 520
104,255, // "i"
  }
,
{ // state 521
102,398, // "d"
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|460, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 523
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 524
2,43, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 525
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 527
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 528
2,223, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 529
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 530
2,199, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 531
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 532
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 533
92,259, // "e"
  }
,
{ // state 534
107,495, // "p"
  }
,
{ // state 535
96,237, // "r"
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 537
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 538
92,335, // "e"
  }
,
{ // state 539
2,400, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 540
101,198, // "t"
  }
,
{ // state 541
2,16, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 542
90,40, // "o"
92,172, // "e"
  }
,
{ // state 543
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|426, // NT-test-match state for idChar
  }
,
{ // state 545
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 546
94,269, // "n"
  }
,
{ // state 547
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 549
98,14, // "c"
  }
,
{ // state 550
134,41, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 551
89,345, // "b"
99,494, // "s"
  }
,
{ // state 552
2,525, // ws*
134,416, // ws
135,148, // {9 " "}
136,327, // eol
137,496, // {10}
138,213, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[553][];
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
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(126<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(129<<16)+1,
// digit ::= {"0".."9"}
(130<<16)+1,
// ws ::= {9 " "}
(134<<16)+1,
// ws ::= eol
(134<<16)+1,
// eol ::= {10}
(136<<16)+1,
// eol ::= {13} {10}
(136<<16)+2,
// eol ::= {13} !10
(136<<16)+1,
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
(167<<16)+2,
// token* ::= token
(167<<16)+1,
// digit++ ::= digit+ !digit
(128<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(168<<16)+1,
// digit+ ::= digit+ digit
(168<<16)+2,
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
135, // 9
137, // 10
-1, // 11
-1, // 12
138, // 13
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
135, // " "
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
127, // "0"
133, // "1"
133, // "2"
133, // "3"
133, // "4"
133, // "5"
133, // "6"
133, // "7"
133, // "8"
133, // "9"
125, // ":"
-1, // ";"
-1, // "<"
115, // "="
-1, // ">"
-1, // "?"
-1, // "@"
132, // "A"
132, // "B"
132, // "C"
132, // "D"
132, // "E"
132, // "F"
132, // "G"
132, // "H"
132, // "I"
132, // "J"
132, // "K"
132, // "L"
132, // "M"
132, // "N"
132, // "O"
132, // "P"
132, // "Q"
132, // "R"
132, // "S"
132, // "T"
132, // "U"
132, // "V"
132, // "W"
132, // "X"
132, // "Y"
132, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
131, // "_"
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
132, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
132, // "q"
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
139, // 130
140, // 131
141, // 132
142, // 133
143, // 134
144, // 135
145, // 136
146, // 137
147, // 138
148, // 139
149, // 140
150, // 141
151, // 142
152, // 143
153, // 144
154, // 145
155, // 146
156, // 147
157, // 148
158, // 149
159, // 150
160, // 151
161, // 152
162, // 153
163, // 154
164, // 155
165, // 156
166, // 157
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
"INTLIT ::= # intLit2 ws*", // 223
"INTLIT ::= # intLit2 ws*", // 224
"intLit2 ::= !\"0\" digit++", // 225
"idChar ::= letter", // 226
"idChar ::= digit", // 227
"idChar ::= \"_\"", // 228
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 229
"digit ::= {\"0\"..\"9\"}", // 230
"ws ::= {9 \" \"}", // 231
"ws ::= eol", // 232
"eol ::= {10} registerNewline", // 233
"eol ::= {13} {10} registerNewline", // 234
"eol ::= {13} !10 registerNewline", // 235
"CHARLIT ::= {130}", // 236
"ID ::= {131}", // 237
"STRINGLIT ::= {132}", // 238
"`! ::= {133}", // 239
"`% ::= {134}", // 240
"`&& ::= {135}", // 241
"`( ::= {136}", // 242
"`) ::= {137}", // 243
"`+ ::= {138}", // 244
"`++ ::= {139}", // 245
"`, ::= {140}", // 246
"`- ::= {141}", // 247
"`-- ::= {142}", // 248
"`. ::= {143}", // 249
"`/ ::= {144}", // 250
"`; ::= {145}", // 251
"`< ::= {146}", // 252
"`<= ::= {147}", // 253
"`= ::= {148}", // 254
"`== ::= {149}", // 255
"`> ::= {150}", // 256
"`>= ::= {151}", // 257
"`[ ::= {152}", // 258
"`] ::= {153}", // 259
"`{ ::= {154}", // 260
"`|| ::= {155}", // 261
"`} ::= {156}", // 262
"`: ::= {157}", // 263
"token* ::= token* token", // 264
"token* ::= token* token", // 265
"digit++ ::= digit+ !digit", // 266
"ws* ::= ws* ws", // 267
"ws* ::= ws* ws", // 268
"digit+ ::= digit", // 269
"digit+ ::= digit+ digit", // 270
"", // 271
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
    { // 223: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 224: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 225: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 226: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 227: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 229: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 231: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 235: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 237: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 238: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 239: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 265: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 266: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 267: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 268: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 269: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 270: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 271: $$0 ::= token* @pass
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
