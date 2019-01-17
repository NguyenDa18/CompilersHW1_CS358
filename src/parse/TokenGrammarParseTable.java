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
public int getEofSym() { return 216; }
public int getNttSym() { return 217; }
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
"{\"A\"..\"Z\" \"j\" \"q\" \"z\"}",
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
"158",
"159",
"160",
"161",
"162",
"163",
"164",
"165",
"166",
"167",
"168",
"169",
"170",
"171",
"172",
"173",
"174",
"175",
"176",
"177",
"178",
"179",
"180",
"181",
"182",
"183",
"184",
"185",
"186",
"187",
"188",
"189",
"190",
"191",
"192",
"193",
"194",
"195",
"196",
"197",
"198",
"199",
"200",
"201",
"202",
"203",
"204",
"205",
"206",
"207",
"208",
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
public int numSymbols() { return 218;}
private static final int MIN_REDUCTION = 513;
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
0x80000000|154, // match move
0x80000000|20, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 1
  }
,
{ // state 2
2,400, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 4
101,221, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
93,269, // "a"
  }
,
{ // state 7
90,302, // "o"
  }
,
{ // state 8
0x80000000|189, // match move
0x80000000|252, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 9
217,MIN_REDUCTION+198, // $NT
  }
,
{ // state 10
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 12
-1, // $$start
-1, // start
399, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
133, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+176, // $
-1, // $NT
  }
,
{ // state 13
108,420, // "h"
  }
,
{ // state 14
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 16
103,210, // "f"
  }
,
{ // state 17
108,105, // "h"
  }
,
{ // state 18
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 19
99,277, // "s"
  }
,
{ // state 20
-1, // $$start
76, // start
29, // ws*
350, // $$0
86, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
431, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
308, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 21
90,208, // "o"
  }
,
{ // state 22
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 23
-1, // $$start
-1, // start
262, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
133, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 24
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 25
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 26
2,80, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 27
99,185, // "s"
  }
,
{ // state 28
92,279, // "e"
  }
,
{ // state 29
0x80000000|339, // match move
0x80000000|190, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 30
123,223, // "0"
129,223, // {"1".."9"}
  }
,
{ // state 31
0x80000000|33, // match move
0x80000000|129, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 32
91,255, // "l"
  }
,
{ // state 33
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 34
94,360, // "n"
  }
,
{ // state 35
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 36
99,368, // "s"
101,362, // "t"
  }
,
{ // state 37
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 38
0x80000000|259, // match move
0x80000000|407, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 39
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 40
99,480, // "s"
  }
,
{ // state 41
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 42
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 43
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 44
108,297, // "h"
  }
,
{ // state 45
101,71, // "t"
  }
,
{ // state 46
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 47
2,475, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 48
92,106, // "e"
  }
,
{ // state 49
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 53
112,389, // "g"
  }
,
{ // state 54
90,503, // "o"
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|104, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 56
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 59
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 60
2,487, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 61
101,256, // "t"
  }
,
{ // state 62
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 63
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 64
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 65
94,36, // "n"
  }
,
{ // state 66
2,67, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 67
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 68
2,173, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 69
99,212, // "s"
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|138, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 72
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 73
89,341, // "b"
  }
,
{ // state 74
99,493, // "s"
101,272, // "t"
  }
,
{ // state 75
2,25, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 76
216,MIN_REDUCTION+0, // $
  }
,
{ // state 77
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 80
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|490, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 84
91,130, // "l"
94,332, // "n"
96,16, // "r"
100,499, // "x"
  }
,
{ // state 85
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 87
101,345, // "t"
  }
,
{ // state 88
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 90
92,375, // "e"
  }
,
{ // state 91
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 95
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 96
91,358, // "l"
  }
,
{ // state 97
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 98
91,321, // "l"
  }
,
{ // state 99
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 101
111,267, // "m"
  }
,
{ // state 102
94,144, // "n"
  }
,
{ // state 103
0x80000000|373, // match move
0x80000000|383, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 104
2,327, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 105
0x80000000|1, // match move
0x80000000|66, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 106
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 107
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 111
2,151, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 112
2,202, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 113
2,215, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 117
93,270, // "a"
  }
,
{ // state 118
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 120
93,98, // "a"
  }
,
{ // state 121
96,330, // "r"
  }
,
{ // state 122
92,354, // "e"
  }
,
{ // state 123
-1, // $$start
-1, // start
451, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
84, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
431, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
MIN_REDUCTION+108, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 124
93,254, // "a"
  }
,
{ // state 125
105,415, // "w"
  }
,
{ // state 126
92,351, // "e"
  }
,
{ // state 127
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 130
99,398, // "s"
  }
,
{ // state 131
99,280, // "s"
  }
,
{ // state 132
107,122, // "p"
  }
,
{ // state 133
0x80000000|414, // match move
0x80000000|23, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 134
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 136
2,63, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 138
2,224, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 139
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
231, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
431, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 140
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 144
106,448, // "u"
  }
,
{ // state 145
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 151
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 153
97,457, // "k"
  }
,
{ // state 154
1,76, // start
2,29, // ws*
3,350, // $$0
4,86, // token
5,152, // `boolean
6,496, // `class
7,155, // `extends
8,5, // `void
9,205, // `int
10,257, // `while
11,369, // `if
12,110, // `else
13,374, // `for
14,445, // `break
15,171, // `this
16,142, // `false
17,217, // `true
18,192, // `super
19,37, // `null
20,82, // `return
21,298, // `instanceof
22,444, // `new
23,274, // `abstract
24,349, // `assert
25,504, // `byte
26,379, // `case
27,506, // `catch
28,312, // `char
29,367, // `const
30,437, // `continue
31,418, // `default
32,325, // `do
33,134, // `double
34,52, // `enum
35,107, // `final
36,242, // `finally
37,88, // `float
38,147, // `goto
39,442, // `implements
40,49, // `import
41,226, // `interface
42,355, // `long
43,278, // `native
44,352, // `package
45,250, // `private
46,35, // `protected
47,260, // `public
48,481, // `short
49,150, // `static
50,310, // `strictfp
51,81, // `switch
52,315, // `synchronized
53,397, // `throw
54,50, // `throws
55,228, // `transient
56,18, // `try
57,201, // `volatile
58,293, // `!
59,338, // `!=
60,57, // `%
61,405, // `&&
62,361, // `*
63,441, // `(
64,220, // `)
65,290, // `{
66,394, // `}
67,320, // `-
68,14, // `+
69,165, // `=
70,175, // `==
71,141, // `[
72,288, // `]
73,299, // `||
74,118, // `<
75,108, // `<=
76,486, // `,
77,97, // `>
78,89, // `>=
79,119, // `.
80,149, // `;
81,380, // `++
82,195, // `--
83,172, // `/
84,241, // `:
85,489, // ID
86,337, // INTLIT
87,145, // STRINGLIT
88,372, // CHARLIT
130,386, // ws
132,304, // eol
214,308, // token*
  }
,
{ // state 155
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 156
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 157
0x80000000|1, // match move
0x80000000|111, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 158
2,161, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 159
103,446, // "f"
  }
,
{ // state 160
217,MIN_REDUCTION+196, // $NT
  }
,
{ // state 161
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 162
2,43, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 163
92,450, // "e"
  }
,
{ // state 164
0x80000000|1, // match move
0x80000000|233, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 165
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 166
90,65, // "o"
91,124, // "l"
93,74, // "a"
108,384, // "h"
  }
,
{ // state 167
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 169
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 170
91,468, // "l"
  }
,
{ // state 171
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 173
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 176
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 177
2,433, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 178
92,401, // "e"
  }
,
{ // state 179
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 180
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 181
94,53, // "n"
  }
,
{ // state 182
94,83, // "n"
  }
,
{ // state 183
92,473, // "e"
  }
,
{ // state 184
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 185
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 186
0x80000000|422, // match move
0x80000000|174, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 187
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 188
0x80000000|483, // match move
0x80000000|12, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 189
123,408, // "0"
126,186, // digit
129,408, // {"1".."9"}
  }
,
{ // state 190
-1, // $$start
-1, // start
-1, // ws*
411, // $$0
86, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
431, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
39, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
308, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 191
101,479, // "t"
  }
,
{ // state 192
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 194
89,455, // "b"
  }
,
{ // state 195
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 196
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 197
2,344, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 198
0x80000000|275, // match move
0x80000000|115, // no-match move
// T-test match for 10:
133,
  }
,
{ // state 199
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 200
2,216, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 202
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 203
2,266, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 204
93,413, // "a"
  }
,
{ // state 205
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 206
92,388, // "e"
  }
,
{ // state 207
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 208
91,456, // "l"
  }
,
{ // state 209
2,263, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 210
93,465, // "a"
  }
,
{ // state 211
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 213
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 214
104,261, // "i"
  }
,
{ // state 215
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 216
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 218
92,505, // "e"
  }
,
{ // state 219
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 221
106,474, // "u"
  }
,
{ // state 222
101,508, // "t"
  }
,
{ // state 223
217,MIN_REDUCTION+200, // $NT
  }
,
{ // state 224
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 225
97,94, // "k"
  }
,
{ // state 226
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 227
96,439, // "r"
  }
,
{ // state 228
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 229
104,391, // "i"
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|60, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 231
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 232
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 233
2,156, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 234
96,16, // "r"
  }
,
{ // state 235
109,497, // "v"
  }
,
{ // state 236
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 237
2,180, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 238
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 240
0x80000000|1, // match move
0x80000000|177, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 241
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 243
101,356, // "t"
  }
,
{ // state 244
90,364, // "o"
91,294, // "l"
93,282, // "a"
104,403, // "i"
  }
,
{ // state 245
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 248
0x80000000|1, // match move
0x80000000|314, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 249
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 251
101,27, // "t"
  }
,
{ // state 252
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 254
99,40, // "s"
  }
,
{ // state 255
101,333, // "t"
  }
,
{ // state 256
93,34, // "a"
  }
,
{ // state 257
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 258
96,326, // "r"
108,440, // "h"
  }
,
{ // state 259
106,73, // "u"
  }
,
{ // state 260
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 261
98,303, // "c"
  }
,
{ // state 262
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 263
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 264
92,4, // "e"
  }
,
{ // state 265
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 266
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 268
92,478, // "e"
  }
,
{ // state 269
101,59, // "t"
  }
,
{ // state 270
98,45, // "c"
  }
,
{ // state 271
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 272
98,13, // "c"
  }
,
{ // state 273
2,472, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 275
133,467, // {10}
  }
,
{ // state 276
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 277
92,336, // "e"
  }
,
{ // state 278
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 280
0x80000000|1, // match move
0x80000000|482, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 281
99,61, // "s"
101,335, // "t"
  }
,
{ // state 282
91,19, // "l"
  }
,
{ // state 283
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 284
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 285
101,28, // "t"
  }
,
{ // state 286
105,471, // "w"
106,132, // "u"
  }
,
{ // state 287
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 289
93,395, // "a"
106,194, // "u"
  }
,
{ // state 290
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 292
102,69, // "d"
  }
,
{ // state 293
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 294
90,6, // "o"
  }
,
{ // state 295
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 296
90,181, // "o"
110,179, // "y"
  }
,
{ // state 297
104,96, // "i"
  }
,
{ // state 298
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 300
2,249, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 302
101,54, // "t"
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|237, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 304
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 306
112,48, // "g"
  }
,
{ // state 307
2,491, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 308
0x80000000|348, // match move
0x80000000|139, // no-match move
// T-test match for "0":
123,
  }
,
{ // state 309
116,200, // "&"
  }
,
{ // state 310
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|385, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 312
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 313
2,46, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 314
2,501, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 316
91,130, // "l"
94,332, // "n"
100,499, // "x"
  }
,
{ // state 317
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 318
90,21, // "o"
96,268, // "r"
110,285, // "y"
  }
,
{ // state 319
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 321
0x80000000|410, // match move
0x80000000|469, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 322
99,87, // "s"
  }
,
{ // state 323
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 326
106,90, // "u"
  }
,
{ // state 327
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 328
106,32, // "u"
  }
,
{ // state 329
94,281, // "n"
103,463, // "f"
111,495, // "m"
  }
,
{ // state 330
101,449, // "t"
  }
,
{ // state 331
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 332
106,101, // "u"
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|488, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 334
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 335
0x80000000|419, // match move
0x80000000|123, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 336
0x80000000|1, // match move
0x80000000|273, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 337
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 339
3,411, // $$0
4,86, // token
5,152, // `boolean
6,496, // `class
7,155, // `extends
8,5, // `void
9,205, // `int
10,257, // `while
11,369, // `if
12,110, // `else
13,374, // `for
14,445, // `break
15,171, // `this
16,142, // `false
17,217, // `true
18,192, // `super
19,37, // `null
20,82, // `return
21,298, // `instanceof
22,444, // `new
23,274, // `abstract
24,349, // `assert
25,504, // `byte
26,379, // `case
27,506, // `catch
28,312, // `char
29,367, // `const
30,437, // `continue
31,418, // `default
32,325, // `do
33,134, // `double
34,52, // `enum
35,107, // `final
36,242, // `finally
37,88, // `float
38,147, // `goto
39,442, // `implements
40,49, // `import
41,226, // `interface
42,355, // `long
43,278, // `native
44,352, // `package
45,250, // `private
46,35, // `protected
47,260, // `public
48,481, // `short
49,150, // `static
50,310, // `strictfp
51,81, // `switch
52,315, // `synchronized
53,397, // `throw
54,50, // `throws
55,228, // `transient
56,18, // `try
57,201, // `volatile
58,293, // `!
59,338, // `!=
60,57, // `%
61,405, // `&&
62,361, // `*
63,441, // `(
64,220, // `)
65,290, // `{
66,394, // `}
67,320, // `-
68,14, // `+
69,165, // `=
70,175, // `==
71,141, // `[
72,288, // `]
73,299, // `||
74,118, // `<
75,108, // `<=
76,486, // `,
77,97, // `>
78,89, // `>=
79,119, // `.
80,149, // `;
81,380, // `++
82,195, // `--
83,172, // `/
84,241, // `:
85,489, // ID
86,337, // INTLIT
87,145, // STRINGLIT
88,372, // CHARLIT
130,39, // ws
132,304, // eol
214,308, // token*
  }
,
{ // state 340
2,238, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 341
91,426, // "l"
  }
,
{ // state 342
2,459, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 344
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 345
96,117, // "r"
  }
,
{ // state 346
2,42, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 348
4,231, // token
5,152, // `boolean
6,496, // `class
7,155, // `extends
8,5, // `void
9,205, // `int
10,257, // `while
11,369, // `if
12,110, // `else
13,374, // `for
14,445, // `break
15,171, // `this
16,142, // `false
17,217, // `true
18,192, // `super
19,37, // `null
20,82, // `return
21,298, // `instanceof
22,444, // `new
23,274, // `abstract
24,349, // `assert
25,504, // `byte
26,379, // `case
27,506, // `catch
28,312, // `char
29,367, // `const
30,437, // `continue
31,418, // `default
32,325, // `do
33,134, // `double
34,52, // `enum
35,107, // `final
36,242, // `finally
37,88, // `float
38,147, // `goto
39,442, // `implements
40,49, // `import
41,226, // `interface
42,355, // `long
43,278, // `native
44,352, // `package
45,250, // `private
46,35, // `protected
47,260, // `public
48,481, // `short
49,150, // `static
50,310, // `strictfp
51,81, // `switch
52,315, // `synchronized
53,397, // `throw
54,50, // `throws
55,228, // `transient
56,18, // `try
57,201, // `volatile
58,293, // `!
59,338, // `!=
60,57, // `%
61,405, // `&&
62,361, // `*
63,441, // `(
64,220, // `)
65,290, // `{
66,394, // `}
67,320, // `-
68,14, // `+
69,165, // `=
70,175, // `==
71,141, // `[
72,288, // `]
73,299, // `||
74,118, // `<
75,108, // `<=
76,486, // `,
77,97, // `>
78,89, // `>=
79,119, // `.
80,149, // `;
81,380, // `++
82,195, // `--
83,172, // `/
84,241, // `:
85,489, // ID
86,337, // INTLIT
87,145, // STRINGLIT
88,372, // CHARLIT
  }
,
{ // state 349
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 351
90,402, // "o"
  }
,
{ // state 352
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 353
2,262, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 354
96,387, // "r"
  }
,
{ // state 355
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 356
0x80000000|1, // match move
0x80000000|158, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 357
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 358
92,55, // "e"
  }
,
{ // state 359
217,MIN_REDUCTION+199, // $NT
  }
,
{ // state 360
98,126, // "c"
  }
,
{ // state 361
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 362
104,102, // "i"
  }
,
{ // state 363
2,211, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 364
96,248, // "r"
  }
,
{ // state 365
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 368
101,232, // "t"
  }
,
{ // state 369
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 370
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 371
2,434, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 372
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 373
2,432, // ws*
130,386, // ws
132,304, // eol
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 374
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 375
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 376
2,196, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 381
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 382
110,179, // "y"
  }
,
{ // state 383
-1, // $$start
-1, // start
432, // ws*
-1, // $$0
MIN_REDUCTION+174, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
424, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
188, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
300, // intLit2
408, // "0"
187, // digit++
-1, // letter
31, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
408, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+174, // $
-1, // $NT
  }
,
{ // state 384
93,227, // "a"
  }
,
{ // state 385
2,64, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 387
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 388
96,243, // "r"
  }
,
{ // state 389
0x80000000|1, // match move
0x80000000|75, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 390
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 391
102,164, // "d"
  }
,
{ // state 392
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 393
2,95, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 395
98,153, // "c"
  }
,
{ // state 396
89,359, // "b"
90,359, // "o"
91,359, // "l"
92,359, // "e"
93,359, // "a"
94,359, // "n"
96,359, // "r"
97,359, // "k"
98,359, // "c"
99,359, // "s"
100,359, // "x"
101,359, // "t"
102,359, // "d"
103,359, // "f"
104,359, // "i"
105,359, // "w"
106,359, // "u"
107,359, // "p"
108,359, // "h"
109,359, // "v"
110,359, // "y"
111,359, // "m"
112,359, // "g"
123,223, // "0"
125,160, // letter
126,464, // digit
127,9, // "_"
128,359, // {"A".."Z" "j" "q" "z"}
129,223, // {"1".."9"}
  }
,
{ // state 397
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 398
92,72, // "e"
  }
,
{ // state 399
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 400
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 401
0x80000000|1, // match move
0x80000000|342, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 402
103,70, // "f"
  }
,
{ // state 403
94,120, // "n"
  }
,
{ // state 404
2,169, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 407
2,323, // ws*
106,73, // "u"
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 408
0x80000000|93, // match move
0x80000000|365, // no-match move
0x80000000|30, // NT-test-match state for digit
  }
,
{ // state 409
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 410
91,382, // "l"
  }
,
{ // state 411
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 412
2,236, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 413
94,458, // "n"
  }
,
{ // state 414
2,262, // ws*
130,386, // ws
132,304, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 415
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 416
2,199, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 419
92,234, // "e"
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|511, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 421
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 423
2,176, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 424
90,181, // "o"
  }
,
{ // state 425
2,127, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 426
92,436, // "e"
  }
,
{ // state 427
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 429
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 430
2,492, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 431
114,353, // "="
  }
,
{ // state 432
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 433
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 434
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 435
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 436
0x80000000|1, // match move
0x80000000|113, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 437
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 440
104,131, // "i"
  }
,
{ // state 441
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 444
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 446
93,328, // "a"
  }
,
{ // state 447
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 448
92,230, // "e"
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|498, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 450
111,218, // "m"
  }
,
{ // state 451
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 452
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 453
2,24, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 454
92,125, // "e"
93,191, // "a"
106,170, // "u"
  }
,
{ // state 455
91,214, // "l"
  }
,
{ // state 456
92,204, // "e"
  }
,
{ // state 457
93,306, // "a"
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|404, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 459
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 460
99,206, // "s"
  }
,
{ // state 461
90,121, // "o"
91,163, // "l"
  }
,
{ // state 462
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|376, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 464
217,MIN_REDUCTION+197, // $NT
  }
,
{ // state 465
98,178, // "c"
  }
,
{ // state 466
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 468
91,157, // "l"
  }
,
{ // state 469
-1, // $$start
-1, // start
427, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
152, // `boolean
496, // `class
155, // `extends
5, // `void
205, // `int
257, // `while
369, // `if
110, // `else
374, // `for
445, // `break
171, // `this
142, // `false
217, // `true
192, // `super
37, // `null
82, // `return
298, // `instanceof
444, // `new
274, // `abstract
349, // `assert
504, // `byte
379, // `case
506, // `catch
312, // `char
367, // `const
437, // `continue
418, // `default
325, // `do
134, // `double
52, // `enum
107, // `final
242, // `finally
88, // `float
147, // `goto
442, // `implements
49, // `import
226, // `interface
355, // `long
278, // `native
352, // `package
250, // `private
35, // `protected
260, // `public
481, // `short
150, // `static
310, // `strictfp
81, // `switch
315, // `synchronized
397, // `throw
50, // `throws
228, // `transient
18, // `try
201, // `volatile
293, // `!
338, // `!=
57, // `%
405, // `&&
361, // `*
441, // `(
220, // `)
290, // `{
394, // `}
320, // `-
14, // `+
165, // `=
175, // `==
141, // `[
288, // `]
299, // `||
118, // `<
108, // `<=
486, // `,
97, // `>
89, // `>=
119, // `.
149, // `;
380, // `++
195, // `--
172, // `/
241, // `:
489, // ID
337, // INTLIT
145, // STRINGLIT
372, // CHARLIT
318, // "b"
-1, // "o"
296, // "l"
316, // "e"
510, // "a"
454, // "n"
-1, // idChar
264, // "r"
-1, // "k"
166, // "c"
286, // "s"
-1, // "x"
258, // "t"
500, // "d"
244, // "f"
329, // "i"
44, // "w"
-1, // "u"
289, // "p"
-1, // "h"
477, // "v"
-1, // "y"
-1, // "m"
7, // "g"
103, // "!"
431, // "="
68, // "%"
309, // "&"
393, // "*"
112, // "("
423, // ")"
425, // "+"
313, // "-"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q" "z"}
MIN_REDUCTION+154, // {"1".."9"}
386, // ws
135, // {9 " "}
304, // eol
462, // {10}
198, // {13}
114, // {130}
295, // {131}
276, // {132}
137, // {133}
116, // {134}
466, // {135}
284, // {136}
271, // {137}
428, // {138}
507, // {139}
392, // {140}
99, // {141}
347, // {142}
447, // {143}
109, // {144}
377, // {145}
213, // {146}
287, // {147}
317, // {148}
246, // {149}
331, // {150}
417, // {151}
476, // {152}
128, // {153}
219, // {154}
443, // {155}
168, // {156}
143, // {157}
301, // {158}
91, // {159}
239, // {160}
77, // {161}
494, // {162}
343, // {163}
324, // {164}
452, // {165}
319, // {166}
10, // {167}
56, // {168}
406, // {169}
357, // {170}
247, // {171}
15, // {172}
484, // {173}
167, // {174}
381, // {175}
85, // {176}
265, // {177}
146, // {178}
334, // {179}
305, // {180}
62, // {181}
58, // {182}
253, // {183}
438, // {184}
245, // {185}
11, // {186}
378, // {187}
283, // {188}
78, // {189}
390, // {190}
509, // {191}
140, // {192}
92, // {193}
22, // {194}
421, // {195}
100, // {196}
193, // {197}
470, // {198}
3, // {199}
51, // {200}
79, // {201}
502, // {202}
435, // {203}
429, // {204}
366, // {205}
409, // {206}
291, // {207}
148, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 470
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 471
104,222, // "i"
  }
,
{ // state 472
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 473
94,292, // "n"
  }
,
{ // state 474
96,182, // "r"
  }
,
{ // state 475
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 476
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 477
90,229, // "o"
  }
,
{ // state 478
93,225, // "a"
  }
,
{ // state 479
104,235, // "i"
  }
,
{ // state 480
0x80000000|1, // match move
0x80000000|430, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 481
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 482
2,41, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 483
2,399, // ws*
130,386, // ws
132,304, // eol
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 485
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 486
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 487
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 488
2,207, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 489
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 490
2,184, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 491
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 492
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 493
92,240, // "e"
  }
,
{ // state 494
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 495
107,461, // "p"
  }
,
{ // state 496
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 497
92,311, // "e"
  }
,
{ // state 498
2,370, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 499
101,183, // "t"
  }
,
{ // state 500
90,38, // "o"
92,159, // "e"
  }
,
{ // state 501
130,39, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 503
0x80000000|1, // match move
0x80000000|416, // no-match move
0x80000000|396, // NT-test-match state for idChar
  }
,
{ // state 504
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 505
94,251, // "n"
  }
,
{ // state 506
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 507
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 508
98,17, // "c"
  }
,
{ // state 509
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 510
89,322, // "b"
99,460, // "s"
  }
,
{ // state 511
2,485, // ws*
130,386, // ws
131,135, // {9 " "}
132,304, // eol
133,462, // {10}
134,198, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[512][];
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
(122<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(125<<16)+1,
// digit ::= {"0".."9"}
(126<<16)+1,
// ws ::= {9 " "}
(130<<16)+1,
// ws ::= eol
(130<<16)+1,
// eol ::= {10}
(132<<16)+1,
// eol ::= {13} {10}
(132<<16)+2,
// eol ::= {13} !10
(132<<16)+1,
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
// `abstract ::= {158}
(23<<16)+1,
// `assert ::= {159}
(24<<16)+1,
// `boolean ::= {160}
(5<<16)+1,
// `break ::= {161}
(14<<16)+1,
// `byte ::= {162}
(25<<16)+1,
// `case ::= {163}
(26<<16)+1,
// `catch ::= {164}
(27<<16)+1,
// `char ::= {165}
(28<<16)+1,
// `const ::= {166}
(29<<16)+1,
// `continue ::= {167}
(30<<16)+1,
// `default ::= {168}
(31<<16)+1,
// `do ::= {169}
(32<<16)+1,
// `double ::= {170}
(33<<16)+1,
// `enum ::= {171}
(34<<16)+1,
// `extends ::= {172}
(7<<16)+1,
// `false ::= {173}
(16<<16)+1,
// `final ::= {174}
(35<<16)+1,
// `finally ::= {175}
(36<<16)+1,
// `float ::= {176}
(37<<16)+1,
// `for ::= {177}
(13<<16)+1,
// `goto ::= {178}
(38<<16)+1,
// `if ::= {179}
(11<<16)+1,
// `implements ::= {180}
(39<<16)+1,
// `import ::= {181}
(40<<16)+1,
// `instanceof ::= {182}
(21<<16)+1,
// `int ::= {183}
(9<<16)+1,
// `interface ::= {184}
(41<<16)+1,
// `long ::= {185}
(42<<16)+1,
// `native ::= {186}
(43<<16)+1,
// `new ::= {187}
(22<<16)+1,
// `null ::= {188}
(19<<16)+1,
// `package ::= {189}
(44<<16)+1,
// `private ::= {190}
(45<<16)+1,
// `protected ::= {191}
(46<<16)+1,
// `public ::= {192}
(47<<16)+1,
// `return ::= {193}
(20<<16)+1,
// `short ::= {194}
(48<<16)+1,
// `static ::= {195}
(49<<16)+1,
// `strictfp ::= {196}
(50<<16)+1,
// `super ::= {197}
(18<<16)+1,
// `switch ::= {198}
(51<<16)+1,
// `synchronized ::= {199}
(52<<16)+1,
// `this ::= {200}
(15<<16)+1,
// `throw ::= {201}
(53<<16)+1,
// `throws ::= {202}
(54<<16)+1,
// `transient ::= {203}
(55<<16)+1,
// `true ::= {204}
(17<<16)+1,
// `try ::= {205}
(56<<16)+1,
// `void ::= {206}
(8<<16)+1,
// `volatile ::= {207}
(57<<16)+1,
// `while ::= {208}
(10<<16)+1,
// token* ::= token* token
(214<<16)+2,
// token* ::= token
(214<<16)+1,
// digit++ ::= digit+ !digit
(124<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(215<<16)+1,
// digit+ ::= digit+ digit
(215<<16)+2,
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
131, // 9
133, // 10
-1, // 11
-1, // 12
134, // 13
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
131, // " "
113, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
115, // "%"
116, // "&"
-1, // "'"
118, // "("
119, // ")"
117, // "*"
120, // "+"
-1, // ","
121, // "-"
-1, // "."
-1, // "/"
123, // "0"
129, // "1"
129, // "2"
129, // "3"
129, // "4"
129, // "5"
129, // "6"
129, // "7"
129, // "8"
129, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
114, // "="
-1, // ">"
-1, // "?"
-1, // "@"
128, // "A"
128, // "B"
128, // "C"
128, // "D"
128, // "E"
128, // "F"
128, // "G"
128, // "H"
128, // "I"
128, // "J"
128, // "K"
128, // "L"
128, // "M"
128, // "N"
128, // "O"
128, // "P"
128, // "Q"
128, // "R"
128, // "S"
128, // "T"
128, // "U"
128, // "V"
128, // "W"
128, // "X"
128, // "Y"
128, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
127, // "_"
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
128, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
128, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
128, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
135, // 130
136, // 131
137, // 132
138, // 133
139, // 134
140, // 135
141, // 136
142, // 137
143, // 138
144, // 139
145, // 140
146, // 141
147, // 142
148, // 143
149, // 144
150, // 145
151, // 146
152, // 147
153, // 148
154, // 149
155, // 150
156, // 151
157, // 152
158, // 153
159, // 154
160, // 155
161, // 156
162, // 157
163, // 158
164, // 159
165, // 160
166, // 161
167, // 162
168, // 163
169, // 164
170, // 165
171, // 166
172, // 167
173, // 168
174, // 169
175, // 170
176, // 171
177, // 172
178, // 173
179, // 174
180, // 175
181, // 176
182, // 177
183, // 178
184, // 179
185, // 180
186, // 181
187, // 182
188, // 183
189, // 184
190, // 185
191, // 186
192, // 187
193, // 188
194, // 189
195, // 190
196, // 191
197, // 192
198, // 193
199, // 194
200, // 195
201, // 196
202, // 197
203, // 198
204, // 199
205, // 200
206, // 201
207, // 202
208, // 203
209, // 204
210, // 205
211, // 206
212, // 207
213, // 208
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
"`! ::= \"!\" ws*", // 173
"`! ::= \"!\" ws*", // 174
"`!= ::= \"!\" \"=\" ws*", // 175
"`!= ::= \"!\" \"=\" ws*", // 176
"`% ::= \"%\" ws*", // 177
"`% ::= \"%\" ws*", // 178
"`&& ::= \"&\" \"&\" ws*", // 179
"`&& ::= \"&\" \"&\" ws*", // 180
"`* ::= \"*\" ws*", // 181
"`* ::= \"*\" ws*", // 182
"`( ::= \"(\" ws*", // 183
"`( ::= \"(\" ws*", // 184
"`) ::= \")\" ws*", // 185
"`) ::= \")\" ws*", // 186
"`== ::= \"=\" \"=\" ws*", // 187
"`== ::= \"=\" \"=\" ws*", // 188
"`+ ::= \"+\" ws*", // 189
"`+ ::= \"+\" ws*", // 190
"`- ::= \"-\" ws*", // 191
"`- ::= \"-\" ws*", // 192
"INTLIT ::= # intLit2 ws*", // 193
"INTLIT ::= # intLit2 ws*", // 194
"intLit2 ::= !\"0\" digit++", // 195
"idChar ::= letter", // 196
"idChar ::= digit", // 197
"idChar ::= \"_\"", // 198
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 199
"digit ::= {\"0\"..\"9\"}", // 200
"ws ::= {9 \" \"}", // 201
"ws ::= eol", // 202
"eol ::= {10} registerNewline", // 203
"eol ::= {13} {10} registerNewline", // 204
"eol ::= {13} !10 registerNewline", // 205
"CHARLIT ::= {130}", // 206
"ID ::= {131}", // 207
"STRINGLIT ::= {132}", // 208
"`! ::= {133}", // 209
"`% ::= {134}", // 210
"`&& ::= {135}", // 211
"`( ::= {136}", // 212
"`) ::= {137}", // 213
"`+ ::= {138}", // 214
"`++ ::= {139}", // 215
"`, ::= {140}", // 216
"`- ::= {141}", // 217
"`-- ::= {142}", // 218
"`. ::= {143}", // 219
"`/ ::= {144}", // 220
"`; ::= {145}", // 221
"`< ::= {146}", // 222
"`<= ::= {147}", // 223
"`= ::= {148}", // 224
"`== ::= {149}", // 225
"`> ::= {150}", // 226
"`>= ::= {151}", // 227
"`[ ::= {152}", // 228
"`] ::= {153}", // 229
"`{ ::= {154}", // 230
"`|| ::= {155}", // 231
"`} ::= {156}", // 232
"`: ::= {157}", // 233
"`abstract ::= {158}", // 234
"`assert ::= {159}", // 235
"`boolean ::= {160}", // 236
"`break ::= {161}", // 237
"`byte ::= {162}", // 238
"`case ::= {163}", // 239
"`catch ::= {164}", // 240
"`char ::= {165}", // 241
"`const ::= {166}", // 242
"`continue ::= {167}", // 243
"`default ::= {168}", // 244
"`do ::= {169}", // 245
"`double ::= {170}", // 246
"`enum ::= {171}", // 247
"`extends ::= {172}", // 248
"`false ::= {173}", // 249
"`final ::= {174}", // 250
"`finally ::= {175}", // 251
"`float ::= {176}", // 252
"`for ::= {177}", // 253
"`goto ::= {178}", // 254
"`if ::= {179}", // 255
"`implements ::= {180}", // 256
"`import ::= {181}", // 257
"`instanceof ::= {182}", // 258
"`int ::= {183}", // 259
"`interface ::= {184}", // 260
"`long ::= {185}", // 261
"`native ::= {186}", // 262
"`new ::= {187}", // 263
"`null ::= {188}", // 264
"`package ::= {189}", // 265
"`private ::= {190}", // 266
"`protected ::= {191}", // 267
"`public ::= {192}", // 268
"`return ::= {193}", // 269
"`short ::= {194}", // 270
"`static ::= {195}", // 271
"`strictfp ::= {196}", // 272
"`super ::= {197}", // 273
"`switch ::= {198}", // 274
"`synchronized ::= {199}", // 275
"`this ::= {200}", // 276
"`throw ::= {201}", // 277
"`throws ::= {202}", // 278
"`transient ::= {203}", // 279
"`true ::= {204}", // 280
"`try ::= {205}", // 281
"`void ::= {206}", // 282
"`volatile ::= {207}", // 283
"`while ::= {208}", // 284
"token* ::= token* token", // 285
"token* ::= token* token", // 286
"digit++ ::= digit+ !digit", // 287
"ws* ::= ws* ws", // 288
"ws* ::= ws* ws", // 289
"digit+ ::= digit", // 290
"digit+ ::= digit+ digit", // 291
"", // 292
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
    { // 173: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `! ::= "!" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 180: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 181: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 188: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 189: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 194: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 195: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 196: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 199: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 200: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 201: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 205: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 207: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 208: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 209: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 231: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 284: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 286: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 287: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 288: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 289: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 290: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 291: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 292: $$0 ::= token* @pass
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
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
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
