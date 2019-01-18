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
"\"*\"",
"\"(\"",
"\")\"",
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
private static final int MIN_REDUCTION = 548;
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
0x80000000|164, // match move
0x80000000|20, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 1
  }
,
{ // state 2
2,422, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
101,237, // "t"
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
90,317, // "o"
  }
,
{ // state 7
0x80000000|200, // match move
0x80000000|265, // no-match move
0x80000000|31, // NT-test-match state for digit
  }
,
{ // state 8
167,MIN_REDUCTION+220, // $NT
  }
,
{ // state 9
-1, // $$start
-1, // start
421, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
144, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+198, // $
-1, // $NT
  }
,
{ // state 10
108,445, // "h"
  }
,
{ // state 11
92,514, // "e"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
103,222, // "f"
  }
,
{ // state 14
108,108, // "h"
  }
,
{ // state 15
104,280, // "i"
  }
,
{ // state 16
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 18
0x80000000|1, // match move
0x80000000|504, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 19
99,294, // "s"
  }
,
{ // state 20
-1, // $$start
81, // start
30, // ws*
369, // $$0
90, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
326, // token*
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
90,220, // "o"
  }
,
{ // state 23
-1, // $$start
-1, // start
274, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
144, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+210, // $
-1, // $NT
  }
,
{ // state 24
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 25
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 26
2,84, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 27
107,495, // "p"
  }
,
{ // state 28
99,196, // "s"
  }
,
{ // state 29
92,296, // "e"
  }
,
{ // state 30
0x80000000|356, // match move
0x80000000|202, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 31
124,239, // "0"
130,239, // {"1".."9"}
  }
,
{ // state 32
0x80000000|34, // match move
0x80000000|138, // no-match move
0x80000000|31, // NT-test-match state for digit
  }
,
{ // state 33
91,267, // "l"
  }
,
{ // state 34
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 35
94,379, // "n"
  }
,
{ // state 36
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 37
99,387, // "s"
101,382, // "t"
  }
,
{ // state 38
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 39
0x80000000|270, // match move
0x80000000|430, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 40
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 41
99,515, // "s"
  }
,
{ // state 42
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 43
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 44
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 45
108,311, // "h"
  }
,
{ // state 46
101,74, // "t"
  }
,
{ // state 47
104,278, // "i"
  }
,
{ // state 48
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 49
2,508, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 50
92,109, // "e"
  }
,
{ // state 51
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 52
94,482, // "n"
  }
,
{ // state 53
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 54
93,322, // "a"
  }
,
{ // state 55
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 56
112,411, // "g"
  }
,
{ // state 57
90,538, // "o"
  }
,
{ // state 58
0x80000000|1, // match move
0x80000000|106, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 59
109,260, // "v"
  }
,
{ // state 60
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 61
101,501, // "t"
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 63
2,521, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 64
101,268, // "t"
  }
,
{ // state 65
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 66
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 67
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 68
94,37, // "n"
  }
,
{ // state 69
2,70, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 70
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 71
2,183, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 72
99,224, // "s"
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 74
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 75
101,316, // "t"
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 77
89,358, // "b"
  }
,
{ // state 78
99,527, // "s"
101,288, // "t"
  }
,
{ // state 79
91,54, // "l"
104,412, // "i"
  }
,
{ // state 80
2,25, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
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
102,418, // "d"
  }
,
{ // state 84
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 85
90,323, // "o"
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
0x80000000|524, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 89
91,139, // "l"
94,349, // "n"
96,13, // "r"
100,534, // "x"
  }
,
{ // state 90
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 91
101,363, // "t"
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
92,398, // "e"
  }
,
{ // state 95
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 96
90,225, // "o"
104,59, // "i"
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 98
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 99
91,377, // "l"
  }
,
{ // state 100
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 101
91,337, // "l"
  }
,
{ // state 102
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 103
111,281, // "m"
  }
,
{ // state 104
94,154, // "n"
  }
,
{ // state 105
0x80000000|394, // match move
0x80000000|405, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 106
2,341, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 107
90,79, // "o"
  }
,
{ // state 108
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 109
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 110
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 111
104,348, // "i"
  }
,
{ // state 112
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 113
104,427, // "i"
  }
,
{ // state 114
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 116
2,161, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 117
2,214, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 118
90,370, // "o"
  }
,
{ // state 119
94,391, // "n"
  }
,
{ // state 120
2,230, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 121
108,362, // "h"
  }
,
{ // state 122
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+232, // (default reduction)
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
96,345, // "r"
  }
,
{ // state 130
92,374, // "e"
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
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
89, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 133
93,266, // "a"
  }
,
{ // state 134
105,439, // "w"
  }
,
{ // state 135
92,371, // "e"
  }
,
{ // state 136
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 139
99,420, // "s"
  }
,
{ // state 140
99,297, // "s"
  }
,
{ // state 141
2,65, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 142
90,529, // "o"
  }
,
{ // state 143
107,130, // "p"
  }
,
{ // state 144
0x80000000|438, // match move
0x80000000|23, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 145
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 147
2,66, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 149
2,240, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 150
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
246, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 151
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 154
106,472, // "u"
  }
,
{ // state 155
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 156
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 157
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 158
-1, // $$start
-1, // start
313, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
396, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 159
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 161
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 163
97,484, // "k"
  }
,
{ // state 164
-1, // $$start
81, // start
30, // ws*
369, // $$0
90, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
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
-1, // "*"
-1, // "("
-1, // ")"
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
407, // ws
-1, // {9 " "}
319, // eol
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
326, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 165
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 166
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 167
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 168
2,172, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 169
103,470, // "f"
  }
,
{ // state 170
167,MIN_REDUCTION+218, // $NT
  }
,
{ // state 171
-1, // $$start
-1, // start
544, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
347, // "t"
536, // "d"
258, // "f"
344, // "i"
226, // "w"
143, // "u"
306, // "p"
142, // "h"
107, // "v"
368, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 172
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 173
2,44, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 174
92,474, // "e"
  }
,
{ // state 175
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 176
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 177
90,68, // "o"
91,133, // "l"
93,78, // "a"
108,404, // "h"
  }
,
{ // state 178
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 179
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 180
91,499, // "l"
  }
,
{ // state 181
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 183
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 186
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 187
2,456, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 188
98,437, // "c"
  }
,
{ // state 189
92,423, // "e"
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 191
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 192
94,56, // "n"
  }
,
{ // state 193
94,88, // "n"
  }
,
{ // state 194
92,505, // "e"
  }
,
{ // state 195
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 196
0x80000000|1, // match move
0x80000000|147, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 197
0x80000000|446, // match move
0x80000000|184, // no-match move
0x80000000|31, // NT-test-match state for digit
  }
,
{ // state 198
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 199
0x80000000|518, // match move
0x80000000|9, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 200
124,431, // "0"
127,197, // digit
130,431, // {"1".."9"}
  }
,
{ // state 201
92,530, // "e"
  }
,
{ // state 202
-1, // $$start
-1, // start
-1, // ws*
434, // $$0
90, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
40, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
326, // token*
7, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 203
101,513, // "t"
  }
,
{ // state 204
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 205
89,480, // "b"
  }
,
{ // state 206
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 207
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 208
2,361, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 209
0x80000000|291, // match move
0x80000000|123, // no-match move
// T-test match for 10:
134,
  }
,
{ // state 210
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 211
2,231, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 213
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 214
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 215
2,279, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 216
93,436, // "a"
  }
,
{ // state 217
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 218
92,410, // "e"
  }
,
{ // state 219
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 220
91,483, // "l"
  }
,
{ // state 221
2,275, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 222
93,493, // "a"
  }
,
{ // state 223
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 224
0x80000000|1, // match move
0x80000000|173, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 225
101,409, // "t"
  }
,
{ // state 226
104,238, // "i"
108,311, // "h"
  }
,
{ // state 227
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 228
104,272, // "i"
  }
,
{ // state 229
2,397, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 230
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 231
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 232
101,475, // "t"
  }
,
{ // state 233
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 234
92,540, // "e"
  }
,
{ // state 235
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 237
106,507, // "u"
  }
,
{ // state 238
101,543, // "t"
  }
,
{ // state 239
167,MIN_REDUCTION+222, // $NT
  }
,
{ // state 240
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 241
97,97, // "k"
  }
,
{ // state 242
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 243
96,463, // "r"
  }
,
{ // state 244
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 246
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 247
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 248
2,166, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 249
96,13, // "r"
  }
,
{ // state 250
109,532, // "v"
  }
,
{ // state 251
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 252
2,191, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 253
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 254
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 255
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 257
101,376, // "t"
  }
,
{ // state 258
90,384, // "o"
91,308, // "l"
93,299, // "a"
104,425, // "i"
  }
,
{ // state 259
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 260
93,61, // "a"
  }
,
{ // state 261
0x80000000|1, // match move
0x80000000|330, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 262
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 264
101,28, // "t"
  }
,
{ // state 265
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 266
99,41, // "s"
  }
,
{ // state 267
101,350, // "t"
  }
,
{ // state 268
93,35, // "a"
  }
,
{ // state 269
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 270
106,77, // "u"
  }
,
{ // state 271
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 272
98,318, // "c"
  }
,
{ // state 273
0x80000000|464, // match move
0x80000000|158, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 274
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 275
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 276
2,292, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 277
92,3, // "e"
  }
,
{ // state 278
113,11, // "z"
  }
,
{ // state 279
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 280
92,52, // "e"
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 282
92,512, // "e"
  }
,
{ // state 283
101,62, // "t"
  }
,
{ // state 284
98,46, // "c"
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 287
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 288
98,10, // "c"
  }
,
{ // state 289
2,503, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
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
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 294
92,353, // "e"
  }
,
{ // state 295
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|364, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 297
0x80000000|1, // match move
0x80000000|517, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 298
99,64, // "s"
101,351, // "t"
  }
,
{ // state 299
91,19, // "l"
  }
,
{ // state 300
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 301
101,29, // "t"
  }
,
{ // state 302
MIN_REDUCTION+245, // (default reduction)
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
93,416, // "a"
96,96, // "r"
106,205, // "u"
  }
,
{ // state 307
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 308
90,5, // "o"
  }
,
{ // state 309
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 310
90,192, // "o"
110,190, // "y"
  }
,
{ // state 311
104,99, // "i"
  }
,
{ // state 312
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 313
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 315
2,262, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 316
103,27, // "f"
  }
,
{ // state 317
101,57, // "t"
  }
,
{ // state 318
0x80000000|1, // match move
0x80000000|252, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 319
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 320
112,50, // "g"
  }
,
{ // state 321
2,525, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 322
101,21, // "t"
  }
,
{ // state 323
94,47, // "n"
  }
,
{ // state 324
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 325
117,211, // "&"
  }
,
{ // state 326
0x80000000|366, // match move
0x80000000|150, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|406, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 328
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 329
2,48, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 330
2,537, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 331
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 333
91,139, // "l"
94,349, // "n"
100,534, // "x"
  }
,
{ // state 334
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 335
90,22, // "o"
96,282, // "r"
110,301, // "y"
  }
,
{ // state 336
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 337
0x80000000|432, // match move
0x80000000|500, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 338
99,91, // "s"
  }
,
{ // state 339
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 341
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 342
106,33, // "u"
  }
,
{ // state 343
2,213, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 344
94,298, // "n"
103,490, // "f"
111,528, // "m"
  }
,
{ // state 345
101,473, // "t"
  }
,
{ // state 346
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 347
93,380, // "a"
96,496, // "r"
108,352, // "h"
  }
,
{ // state 348
98,75, // "c"
  }
,
{ // state 349
106,103, // "u"
  }
,
{ // state 350
0x80000000|1, // match move
0x80000000|522, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 351
0x80000000|443, // match move
0x80000000|132, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 352
96,118, // "r"
104,140, // "i"
  }
,
{ // state 353
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 354
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 356
-1, // $$start
-1, // start
-1, // ws*
434, // $$0
90, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
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
-1, // "*"
-1, // "("
-1, // ")"
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
40, // ws
-1, // {9 " "}
319, // eol
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
326, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 357
2,253, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 358
91,450, // "l"
  }
,
{ // state 359
92,83, // "e"
  }
,
{ // state 360
2,486, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 361
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 362
96,85, // "r"
  }
,
{ // state 363
96,125, // "r"
  }
,
{ // state 364
2,43, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 366
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
246, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
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
-1, // "*"
-1, // "("
-1, // ")"
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
{ // state 367
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 368
94,131, // "n"
  }
,
{ // state 369
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 370
105,273, // "w"
  }
,
{ // state 371
90,424, // "o"
  }
,
{ // state 372
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 373
2,274, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 374
96,408, // "r"
  }
,
{ // state 375
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 376
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 377
92,58, // "e"
  }
,
{ // state 378
167,MIN_REDUCTION+221, // $NT
  }
,
{ // state 379
98,135, // "c"
  }
,
{ // state 380
101,113, // "t"
  }
,
{ // state 381
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 382
104,104, // "i"
  }
,
{ // state 383
2,223, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 384
96,261, // "r"
  }
,
{ // state 385
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 387
101,247, // "t"
  }
,
{ // state 388
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 389
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 390
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 391
99,15, // "s"
  }
,
{ // state 392
2,457, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 394
2,455, // ws*
131,407, // ws
133,319, // eol
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 396
0x80000000|509, // match move
0x80000000|171, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 397
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 398
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 399
2,207, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 400
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 403
110,190, // "y"
  }
,
{ // state 404
93,243, // "a"
  }
,
{ // state 405
-1, // $$start
-1, // start
455, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
448, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
199, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
315, // intLit2
431, // "0"
198, // digit++
-1, // letter
32, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
431, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
7, // digit+
MIN_REDUCTION+196, // $
-1, // $NT
  }
,
{ // state 406
2,67, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 408
0x80000000|1, // match move
0x80000000|357, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 409
92,188, // "e"
  }
,
{ // state 410
96,257, // "r"
  }
,
{ // state 411
0x80000000|1, // match move
0x80000000|80, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 412
102,175, // "d"
  }
,
{ // state 413
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 414
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 415
2,98, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 416
98,163, // "c"
  }
,
{ // state 417
89,378, // "b"
90,378, // "o"
91,378, // "l"
92,378, // "e"
93,378, // "a"
94,378, // "n"
96,378, // "r"
97,378, // "k"
98,378, // "c"
99,378, // "s"
100,378, // "x"
101,378, // "t"
102,378, // "d"
103,378, // "f"
104,378, // "i"
105,378, // "w"
106,378, // "u"
107,378, // "p"
108,378, // "h"
109,378, // "v"
110,378, // "y"
111,378, // "m"
112,378, // "g"
113,378, // "z"
124,239, // "0"
126,170, // letter
127,492, // digit
128,8, // "_"
129,378, // {"A".."Z" "j" "q"}
130,239, // {"1".."9"}
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|535, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 419
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 420
92,76, // "e"
  }
,
{ // state 421
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 422
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 423
0x80000000|1, // match move
0x80000000|360, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 424
103,73, // "f"
  }
,
{ // state 425
94,128, // "n"
  }
,
{ // state 426
2,179, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 427
98,498, // "c"
  }
,
{ // state 428
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 429
2,510, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 430
2,339, // ws*
106,77, // "u"
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 431
0x80000000|95, // match move
0x80000000|385, // no-match move
0x80000000|31, // NT-test-match state for digit
  }
,
{ // state 432
91,403, // "l"
  }
,
{ // state 433
101,491, // "t"
105,502, // "w"
106,143, // "u"
108,142, // "h"
110,368, // "y"
  }
,
{ // state 434
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 435
2,251, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 436
94,485, // "n"
  }
,
{ // state 437
101,359, // "t"
  }
,
{ // state 438
2,274, // ws*
131,407, // ws
133,319, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|49, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 440
2,210, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 443
92,249, // "e"
  }
,
{ // state 444
2,459, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 445
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 446
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 447
2,186, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 448
90,192, // "o"
  }
,
{ // state 449
2,136, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 450
92,461, // "e"
  }
,
{ // state 451
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 453
2,526, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 454
115,373, // "="
  }
,
{ // state 455
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 456
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 457
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 458
2,331, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 459
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 460
96,82, // "r"
108,352, // "h"
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|120, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 462
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|392, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 464
99,286, // "s"
  }
,
{ // state 465
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 470
93,342, // "a"
  }
,
{ // state 471
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 472
92,245, // "e"
  }
,
{ // state 473
0x80000000|1, // match move
0x80000000|533, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 474
111,234, // "m"
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|141, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 476
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 477
2,24, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 478
92,134, // "e"
93,203, // "a"
106,180, // "u"
  }
,
{ // state 479
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 480
91,228, // "l"
  }
,
{ // state 481
2,544, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 482
101,18, // "t"
  }
,
{ // state 483
92,216, // "e"
  }
,
{ // state 484
93,320, // "a"
  }
,
{ // state 485
0x80000000|1, // match move
0x80000000|426, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 486
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 487
99,218, // "s"
  }
,
{ // state 488
90,129, // "o"
91,174, // "l"
  }
,
{ // state 489
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|399, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 491
93,380, // "a"
96,111, // "r"
  }
,
{ // state 492
167,MIN_REDUCTION+219, // $NT
  }
,
{ // state 493
98,189, // "c"
  }
,
{ // state 494
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|276, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 496
93,119, // "a"
104,348, // "i"
106,94, // "u"
110,285, // "y"
  }
,
{ // state 497
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|429, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 499
91,167, // "l"
  }
,
{ // state 500
-1, // $$start
-1, // start
451, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
162, // `boolean
531, // `class
165, // `extends
4, // `void
217, // `int
269, // `while
389, // `if
115, // `else
395, // `for
468, // `break
181, // `this
152, // `false
233, // `true
204, // `super
38, // `null
87, // `return
312, // `instanceof
469, // `new
290, // `abstract
367, // `assert
539, // `byte
401, // `case
541, // `catch
328, // `char
386, // `const
462, // `continue
442, // `default
340, // `do
145, // `double
55, // `enum
110, // `final
256, // `finally
92, // `float
157, // `goto
466, // `implements
51, // `import
242, // `interface
375, // `long
295, // `native
372, // `package
263, // `private
36, // `protected
271, // `public
516, // `short
160, // `static
324, // `strictfp
86, // `switch
332, // `synchronized
419, // `throw
53, // `throws
244, // `transient
17, // `try
212, // `volatile
307, // `!
355, // `!=
60, // `%
428, // `&&
381, // `*
465, // `(
236, // `)
304, // `{
414, // `}
336, // `-
12, // `+
176, // `=
185, // `==
151, // `[
303, // `]
314, // `||
126, // `<
112, // `<=
520, // `,
100, // `>
93, // `>=
127, // `.
159, // `;
402, // `++
206, // `--
182, // `/
255, // `:
523, // ID
354, // INTLIT
155, // STRINGLIT
393, // CHARLIT
335, // "b"
-1, // "o"
310, // "l"
333, // "e"
545, // "a"
478, // "n"
-1, // idChar
277, // "r"
-1, // "k"
177, // "c"
433, // "s"
-1, // "x"
460, // "t"
536, // "d"
258, // "f"
344, // "i"
45, // "w"
-1, // "u"
306, // "p"
-1, // "h"
107, // "v"
-1, // "y"
-1, // "m"
6, // "g"
-1, // "z"
105, // "!"
454, // "="
71, // "%"
325, // "&"
415, // "*"
117, // "("
447, // ")"
449, // "+"
329, // "-"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
407, // ws
146, // {9 " "}
319, // eol
489, // {10}
209, // {13}
122, // {130}
309, // {131}
293, // {132}
148, // {133}
124, // {134}
494, // {135}
300, // {136}
287, // {137}
452, // {138}
542, // {139}
413, // {140}
102, // {141}
365, // {142}
471, // {143}
114, // {144}
400, // {145}
227, // {146}
302, // {147}
334, // {148}
259, // {149}
346, // {150}
441, // {151}
511, // {152}
137, // {153}
235, // {154}
467, // {155}
178, // {156}
153, // {157}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 501
92,156, // "e"
  }
,
{ // state 502
104,238, // "i"
  }
,
{ // state 503
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 504
2,479, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 505
94,305, // "n"
  }
,
{ // state 506
91,201, // "l"
  }
,
{ // state 507
96,193, // "r"
  }
,
{ // state 508
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 509
101,491, // "t"
105,502, // "w"
106,143, // "u"
108,142, // "h"
110,368, // "y"
  }
,
{ // state 510
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 512
93,241, // "a"
  }
,
{ // state 513
104,250, // "i"
  }
,
{ // state 514
102,388, // "d"
  }
,
{ // state 515
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 516
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 517
2,42, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 518
2,421, // ws*
131,407, // ws
133,319, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 519
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 521
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 522
2,219, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 523
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 524
2,195, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 525
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 526
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 527
92,254, // "e"
  }
,
{ // state 528
107,488, // "p"
  }
,
{ // state 529
96,232, // "r"
  }
,
{ // state 530
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 531
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 532
92,327, // "e"
  }
,
{ // state 533
2,390, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 534
101,194, // "t"
  }
,
{ // state 535
2,16, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 536
90,39, // "o"
92,169, // "e"
  }
,
{ // state 537
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 538
0x80000000|1, // match move
0x80000000|440, // no-match move
0x80000000|417, // NT-test-match state for idChar
  }
,
{ // state 539
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 540
94,264, // "n"
  }
,
{ // state 541
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 543
98,14, // "c"
  }
,
{ // state 544
131,40, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 545
89,338, // "b"
99,487, // "s"
  }
,
{ // state 546
2,519, // ws*
131,407, // ws
132,146, // {9 " "}
133,319, // eol
134,489, // {10}
135,209, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[547][];
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
// `! ::= "!" ws*
(58<<16)+2,
// `! ::= "!"
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
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `+ ::= "+" ws*
(68<<16)+2,
// `+ ::= "+"
(68<<16)+1,
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
119, // "("
120, // ")"
118, // "*"
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
"`! ::= \"!\" ws*", // 195
"`! ::= \"!\" ws*", // 196
"`!= ::= \"!\" \"=\" ws*", // 197
"`!= ::= \"!\" \"=\" ws*", // 198
"`% ::= \"%\" ws*", // 199
"`% ::= \"%\" ws*", // 200
"`&& ::= \"&\" \"&\" ws*", // 201
"`&& ::= \"&\" \"&\" ws*", // 202
"`* ::= \"*\" ws*", // 203
"`* ::= \"*\" ws*", // 204
"`( ::= \"(\" ws*", // 205
"`( ::= \"(\" ws*", // 206
"`) ::= \")\" ws*", // 207
"`) ::= \")\" ws*", // 208
"`== ::= \"=\" \"=\" ws*", // 209
"`== ::= \"=\" \"=\" ws*", // 210
"`+ ::= \"+\" ws*", // 211
"`+ ::= \"+\" ws*", // 212
"`- ::= \"-\" ws*", // 213
"`- ::= \"-\" ws*", // 214
"INTLIT ::= # intLit2 ws*", // 215
"INTLIT ::= # intLit2 ws*", // 216
"intLit2 ::= !\"0\" digit++", // 217
"idChar ::= letter", // 218
"idChar ::= digit", // 219
"idChar ::= \"_\"", // 220
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 221
"digit ::= {\"0\"..\"9\"}", // 222
"ws ::= {9 \" \"}", // 223
"ws ::= eol", // 224
"eol ::= {10} registerNewline", // 225
"eol ::= {13} {10} registerNewline", // 226
"eol ::= {13} !10 registerNewline", // 227
"CHARLIT ::= {130}", // 228
"ID ::= {131}", // 229
"STRINGLIT ::= {132}", // 230
"`! ::= {133}", // 231
"`% ::= {134}", // 232
"`&& ::= {135}", // 233
"`( ::= {136}", // 234
"`) ::= {137}", // 235
"`+ ::= {138}", // 236
"`++ ::= {139}", // 237
"`, ::= {140}", // 238
"`- ::= {141}", // 239
"`-- ::= {142}", // 240
"`. ::= {143}", // 241
"`/ ::= {144}", // 242
"`; ::= {145}", // 243
"`< ::= {146}", // 244
"`<= ::= {147}", // 245
"`= ::= {148}", // 246
"`== ::= {149}", // 247
"`> ::= {150}", // 248
"`>= ::= {151}", // 249
"`[ ::= {152}", // 250
"`] ::= {153}", // 251
"`{ ::= {154}", // 252
"`|| ::= {155}", // 253
"`} ::= {156}", // 254
"`: ::= {157}", // 255
"token* ::= token* token", // 256
"token* ::= token* token", // 257
"digit++ ::= digit+ !digit", // 258
"ws* ::= ws* ws", // 259
"ws* ::= ws* ws", // 260
"digit+ ::= digit", // 261
"digit+ ::= digit+ digit", // 262
"", // 263
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
    { // 195: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `! ::= "!" [ws*] @void
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
    { // 203: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 210: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 211: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 216: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 217: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 218: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 220: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 222: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 223: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 225: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 227: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 229: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 230: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 231: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 257: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 258: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 259: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 260: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 261: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 262: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 263: $$0 ::= token* @pass
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
