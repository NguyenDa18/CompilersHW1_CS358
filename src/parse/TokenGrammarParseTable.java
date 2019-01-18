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
public int getEofSym() { return 217; }
public int getNttSym() { return 218; }
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
public int numSymbols() { return 219;}
private static final int MIN_REDUCTION = 599;
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
0x80000000|183, // match move
0x80000000|24, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 1
  }
,
{ // state 2
2,461, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 4
101,258, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
93,309, // "a"
  }
,
{ // state 7
90,346, // "o"
  }
,
{ // state 8
0x80000000|220, // match move
0x80000000|289, // no-match move
0x80000000|36, // NT-test-match state for digit
  }
,
{ // state 9
218,MIN_REDUCTION+220, // $NT
  }
,
{ // state 10
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 12
-1, // $$start
-1, // start
460, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
160, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+198, // $
-1, // $NT
  }
,
{ // state 13
108,486, // "h"
  }
,
{ // state 14
92,561, // "e"
  }
,
{ // state 15
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 17
103,243, // "f"
  }
,
{ // state 18
108,124, // "h"
  }
,
{ // state 19
104,306, // "i"
  }
,
{ // state 20
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 23
99,320, // "s"
  }
,
{ // state 24
-1, // $$start
90, // start
35, // ws*
403, // $$0
103, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
354, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 25
104,553, // "i"
  }
,
{ // state 26
90,241, // "o"
  }
,
{ // state 27
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 28
-1, // $$start
-1, // start
299, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
160, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+210, // $
-1, // $NT
  }
,
{ // state 29
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 30
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 31
2,96, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 32
107,541, // "p"
  }
,
{ // state 33
99,216, // "s"
  }
,
{ // state 34
92,322, // "e"
  }
,
{ // state 35
0x80000000|389, // match move
0x80000000|222, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 36
124,260, // "0"
130,260, // {"1".."9"}
  }
,
{ // state 37
0x80000000|39, // match move
0x80000000|154, // no-match move
0x80000000|36, // NT-test-match state for digit
  }
,
{ // state 38
91,292, // "l"
  }
,
{ // state 39
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 40
94,414, // "n"
  }
,
{ // state 41
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 42
99,423, // "s"
101,417, // "t"
  }
,
{ // state 43
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 44
0x80000000|295, // match move
0x80000000|470, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 45
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 46
99,562, // "s"
  }
,
{ // state 47
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 48
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 49
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 50
108,339, // "h"
  }
,
{ // state 51
101,83, // "t"
  }
,
{ // state 52
104,304, // "i"
  }
,
{ // state 53
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 54
2,555, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 55
92,125, // "e"
  }
,
{ // state 56
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 57
94,528, // "n"
  }
,
{ // state 58
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 60
93,352, // "a"
  }
,
{ // state 61
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 62
112,449, // "g"
  }
,
{ // state 63
90,588, // "o"
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|122, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 65
109,283, // "v"
  }
,
{ // state 66
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 68
101,547, // "t"
  }
,
{ // state 69
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 71
2,569, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 72
101,293, // "t"
  }
,
{ // state 73
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 74
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 75
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 76
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 77
94,42, // "n"
  }
,
{ // state 78
2,79, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 79
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 80
2,203, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 81
99,245, // "s"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|476, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 83
0x80000000|1, // match move
0x80000000|165, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 84
101,344, // "t"
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 86
89,391, // "b"
  }
,
{ // state 87
91,60, // "l"
104,451, // "i"
  }
,
{ // state 88
99,575, // "s"
101,314, // "t"
  }
,
{ // state 89
2,30, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 90
217,MIN_REDUCTION+0, // $
  }
,
{ // state 91
93,135, // "a"
106,107, // "u"
110,311, // "y"
  }
,
{ // state 92
102,457, // "d"
  }
,
{ // state 93
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 96
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 97
90,353, // "o"
  }
,
{ // state 98
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|572, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 101
91,155, // "l"
94,381, // "n"
96,17, // "r"
100,583, // "x"
  }
,
{ // state 102
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 104
101,397, // "t"
  }
,
{ // state 105
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 107
92,434, // "e"
  }
,
{ // state 108
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 110
90,246, // "o"
104,65, // "i"
  }
,
{ // state 111
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|31, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 113
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 114
91,412, // "l"
  }
,
{ // state 115
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 116
91,368, // "l"
  }
,
{ // state 117
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 119
111,307, // "m"
  }
,
{ // state 120
94,171, // "n"
  }
,
{ // state 121
0x80000000|430, // match move
0x80000000|442, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 122
2,373, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 123
90,87, // "o"
  }
,
{ // state 124
0x80000000|1, // match move
0x80000000|78, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|242, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 126
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 127
104,380, // "i"
  }
,
{ // state 128
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 129
104,466, // "i"
  }
,
{ // state 130
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 132
2,180, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 133
2,235, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 134
90,404, // "o"
  }
,
{ // state 135
94,427, // "n"
  }
,
{ // state 136
2,251, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 137
108,396, // "h"
  }
,
{ // state 138
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 141
93,310, // "a"
  }
,
{ // state 142
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 144
93,116, // "a"
  }
,
{ // state 145
96,377, // "r"
  }
,
{ // state 146
92,408, // "e"
  }
,
{ // state 147
98,137, // "c"
  }
,
{ // state 148
-1, // $$start
-1, // start
521, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
101, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 149
93,291, // "a"
  }
,
{ // state 150
105,480, // "w"
  }
,
{ // state 151
92,405, // "e"
  }
,
{ // state 152
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 155
99,459, // "s"
  }
,
{ // state 156
99,323, // "s"
  }
,
{ // state 157
2,74, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 158
90,578, // "o"
  }
,
{ // state 159
107,146, // "p"
  }
,
{ // state 160
0x80000000|479, // match move
0x80000000|28, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 161
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 163
2,75, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 165
2,261, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 166
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
267, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 167
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 171
106,517, // "u"
  }
,
{ // state 172
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|375, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 174
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 177
-1, // $$start
-1, // start
341, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
432, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 178
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 180
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 182
97,530, // "k"
  }
,
{ // state 183
1,90, // start
2,35, // ws*
3,403, // $$0
4,103, // token
5,181, // `boolean
6,580, // `class
7,184, // `extends
8,5, // `void
9,238, // `int
10,294, // `while
11,425, // `if
12,131, // `else
13,431, // `for
14,514, // `break
15,201, // `this
16,169, // `false
17,254, // `true
18,224, // `super
19,43, // `null
20,99, // `return
21,340, // `instanceof
22,513, // `new
23,316, // `abstract
24,401, // `assert
25,589, // `byte
26,438, // `case
27,591, // `catch
28,358, // `char
29,422, // `const
30,506, // `continue
31,483, // `default
32,372, // `do
33,161, // `double
34,61, // `enum
35,126, // `final
36,278, // `finally
37,105, // `float
38,175, // `goto
39,511, // `implements
40,56, // `import
41,263, // `interface
42,409, // `long
43,321, // `native
44,406, // `package
45,287, // `private
46,41, // `protected
47,296, // `public
48,563, // `short
49,179, // `static
50,356, // `strictfp
51,98, // `switch
52,362, // `synchronized
53,458, // `throw
54,58, // `throws
55,265, // `transient
56,21, // `try
57,233, // `volatile
58,335, // `!
59,388, // `!=
60,67, // `%
61,467, // `&&
62,416, // `*
63,510, // `(
64,257, // `)
65,331, // `{
66,454, // `}
67,367, // `-
68,15, // `+
69,195, // `=
70,205, // `==
71,168, // `[
72,330, // `]
73,342, // `||
74,142, // `<
75,128, // `<=
76,568, // `,
77,115, // `>
78,106, // `>=
79,143, // `.
80,178, // `;
81,439, // `++
82,227, // `--
83,202, // `/
84,277, // `:
85,571, // ID
86,387, // INTLIT
87,172, // STRINGLIT
88,429, // CHARLIT
131,445, // ws
133,348, // eol
215,354, // token*
  }
,
{ // state 184
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 185
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 187
2,191, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 188
103,515, // "f"
  }
,
{ // state 189
218,MIN_REDUCTION+218, // $NT
  }
,
{ // state 190
-1, // $$start
-1, // start
594, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
379, // "t"
585, // "d"
280, // "f"
376, // "i"
247, // "w"
159, // "u"
334, // "p"
158, // "h"
123, // "v"
402, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 191
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 192
2,49, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 193
92,519, // "e"
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 195
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 196
90,77, // "o"
91,149, // "l"
93,88, // "a"
108,443, // "h"
  }
,
{ // state 197
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 199
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 200
91,545, // "l"
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
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 206
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 207
2,499, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 208
98,478, // "c"
  }
,
{ // state 209
92,462, // "e"
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|418, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 211
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 212
94,62, // "n"
  }
,
{ // state 213
94,100, // "n"
  }
,
{ // state 214
92,552, // "e"
  }
,
{ // state 215
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 216
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 217
0x80000000|488, // match move
0x80000000|204, // no-match move
0x80000000|36, // NT-test-match state for digit
  }
,
{ // state 218
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 219
0x80000000|565, // match move
0x80000000|12, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 220
124,471, // "0"
127,217, // digit
130,471, // {"1".."9"}
  }
,
{ // state 221
92,579, // "e"
  }
,
{ // state 222
-1, // $$start
-1, // start
-1, // ws*
475, // $$0
103, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
45, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
354, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 223
101,560, // "t"
  }
,
{ // state 224
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 226
89,526, // "b"
  }
,
{ // state 227
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 228
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 229
2,395, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 230
0x80000000|317, // match move
0x80000000|139, // no-match move
// T-test match for 10:
134,
  }
,
{ // state 231
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 232
2,252, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 234
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 235
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 236
2,305, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 237
93,477, // "a"
  }
,
{ // state 238
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 239
92,448, // "e"
  }
,
{ // state 240
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 241
91,529, // "l"
  }
,
{ // state 242
2,300, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 243
93,539, // "a"
  }
,
{ // state 244
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|192, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 246
101,447, // "t"
  }
,
{ // state 247
104,259, // "i"
108,339, // "h"
  }
,
{ // state 248
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 249
104,297, // "i"
  }
,
{ // state 250
2,433, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 251
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 252
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 253
101,520, // "t"
  }
,
{ // state 254
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 255
92,590, // "e"
  }
,
{ // state 256
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 258
106,554, // "u"
  }
,
{ // state 259
101,593, // "t"
  }
,
{ // state 260
218,MIN_REDUCTION+222, // $NT
  }
,
{ // state 261
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 262
97,112, // "k"
  }
,
{ // state 263
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 264
96,508, // "r"
  }
,
{ // state 265
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 267
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 268
0x80000000|1, // match move
0x80000000|351, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 269
2,185, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 270
96,17, // "r"
  }
,
{ // state 271
109,581, // "v"
  }
,
{ // state 272
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 273
2,211, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 274
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 276
0x80000000|1, // match move
0x80000000|207, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 277
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 279
101,410, // "t"
  }
,
{ // state 280
90,419, // "o"
91,336, // "l"
93,325, // "a"
104,464, // "i"
  }
,
{ // state 281
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 283
93,68, // "a"
  }
,
{ // state 284
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|360, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 286
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 288
101,33, // "t"
  }
,
{ // state 289
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 291
99,46, // "s"
  }
,
{ // state 292
101,382, // "t"
  }
,
{ // state 293
93,40, // "a"
  }
,
{ // state 294
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 295
106,86, // "u"
  }
,
{ // state 296
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 297
98,347, // "c"
  }
,
{ // state 298
0x80000000|509, // match move
0x80000000|177, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 299
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 300
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 301
2,318, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 302
92,4, // "e"
  }
,
{ // state 303
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 304
113,14, // "z"
  }
,
{ // state 305
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 306
92,57, // "e"
  }
,
{ // state 307
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 308
92,559, // "e"
  }
,
{ // state 309
101,70, // "t"
  }
,
{ // state 310
98,51, // "c"
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|250, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 312
0x80000000|1, // match move
0x80000000|527, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 313
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 314
98,13, // "c"
  }
,
{ // state 315
2,550, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 317
134,543, // {10}
  }
,
{ // state 318
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 320
92,386, // "e"
  }
,
{ // state 321
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 322
0x80000000|1, // match move
0x80000000|398, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 323
0x80000000|1, // match move
0x80000000|564, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 324
99,72, // "s"
101,384, // "t"
  }
,
{ // state 325
91,23, // "l"
  }
,
{ // state 326
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 328
101,34, // "t"
  }
,
{ // state 329
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 333
102,81, // "d"
  }
,
{ // state 334
93,455, // "a"
96,110, // "r"
106,226, // "u"
  }
,
{ // state 335
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 336
90,6, // "o"
  }
,
{ // state 337
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 338
90,212, // "o"
110,210, // "y"
  }
,
{ // state 339
104,114, // "i"
  }
,
{ // state 340
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 341
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 343
2,286, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 344
103,32, // "f"
  }
,
{ // state 345
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 346
101,63, // "t"
  }
,
{ // state 347
0x80000000|1, // match move
0x80000000|273, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 348
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 350
112,55, // "g"
  }
,
{ // state 351
2,573, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 352
101,25, // "t"
  }
,
{ // state 353
94,52, // "n"
  }
,
{ // state 354
0x80000000|400, // match move
0x80000000|166, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 355
117,232, // "&"
  }
,
{ // state 356
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 357
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 358
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 359
2,53, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 360
2,586, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 361
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 363
91,155, // "l"
94,381, // "n"
100,583, // "x"
  }
,
{ // state 364
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 365
90,26, // "o"
96,308, // "r"
110,328, // "y"
  }
,
{ // state 366
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 368
0x80000000|473, // match move
0x80000000|546, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 369
99,104, // "s"
  }
,
{ // state 370
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 372
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 373
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 374
106,38, // "u"
  }
,
{ // state 375
2,234, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 376
94,324, // "n"
103,536, // "f"
111,577, // "m"
  }
,
{ // state 377
101,518, // "t"
  }
,
{ // state 378
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 379
93,415, // "a"
96,542, // "r"
108,385, // "h"
  }
,
{ // state 380
98,84, // "c"
  }
,
{ // state 381
106,119, // "u"
  }
,
{ // state 382
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 383
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 384
0x80000000|484, // match move
0x80000000|148, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 385
96,134, // "r"
104,156, // "i"
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|315, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 387
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 389
3,475, // $$0
4,103, // token
5,181, // `boolean
6,580, // `class
7,184, // `extends
8,5, // `void
9,238, // `int
10,294, // `while
11,425, // `if
12,131, // `else
13,431, // `for
14,514, // `break
15,201, // `this
16,169, // `false
17,254, // `true
18,224, // `super
19,43, // `null
20,99, // `return
21,340, // `instanceof
22,513, // `new
23,316, // `abstract
24,401, // `assert
25,589, // `byte
26,438, // `case
27,591, // `catch
28,358, // `char
29,422, // `const
30,506, // `continue
31,483, // `default
32,372, // `do
33,161, // `double
34,61, // `enum
35,126, // `final
36,278, // `finally
37,105, // `float
38,175, // `goto
39,511, // `implements
40,56, // `import
41,263, // `interface
42,409, // `long
43,321, // `native
44,406, // `package
45,287, // `private
46,41, // `protected
47,296, // `public
48,563, // `short
49,179, // `static
50,356, // `strictfp
51,98, // `switch
52,362, // `synchronized
53,458, // `throw
54,58, // `throws
55,265, // `transient
56,21, // `try
57,233, // `volatile
58,335, // `!
59,388, // `!=
60,67, // `%
61,467, // `&&
62,416, // `*
63,510, // `(
64,257, // `)
65,331, // `{
66,454, // `}
67,367, // `-
68,15, // `+
69,195, // `=
70,205, // `==
71,168, // `[
72,330, // `]
73,342, // `||
74,142, // `<
75,128, // `<=
76,568, // `,
77,115, // `>
78,106, // `>=
79,143, // `.
80,178, // `;
81,439, // `++
82,227, // `--
83,202, // `/
84,277, // `:
85,571, // ID
86,387, // INTLIT
87,172, // STRINGLIT
88,429, // CHARLIT
131,45, // ws
133,348, // eol
215,354, // token*
  }
,
{ // state 390
2,274, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 391
91,492, // "l"
  }
,
{ // state 392
92,92, // "e"
  }
,
{ // state 393
2,532, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 395
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 396
96,97, // "r"
  }
,
{ // state 397
96,141, // "r"
  }
,
{ // state 398
2,48, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 399
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 400
4,267, // token
5,181, // `boolean
6,580, // `class
7,184, // `extends
8,5, // `void
9,238, // `int
10,294, // `while
11,425, // `if
12,131, // `else
13,431, // `for
14,514, // `break
15,201, // `this
16,169, // `false
17,254, // `true
18,224, // `super
19,43, // `null
20,99, // `return
21,340, // `instanceof
22,513, // `new
23,316, // `abstract
24,401, // `assert
25,589, // `byte
26,438, // `case
27,591, // `catch
28,358, // `char
29,422, // `const
30,506, // `continue
31,483, // `default
32,372, // `do
33,161, // `double
34,61, // `enum
35,126, // `final
36,278, // `finally
37,105, // `float
38,175, // `goto
39,511, // `implements
40,56, // `import
41,263, // `interface
42,409, // `long
43,321, // `native
44,406, // `package
45,287, // `private
46,41, // `protected
47,296, // `public
48,563, // `short
49,179, // `static
50,356, // `strictfp
51,98, // `switch
52,362, // `synchronized
53,458, // `throw
54,58, // `throws
55,265, // `transient
56,21, // `try
57,233, // `volatile
58,335, // `!
59,388, // `!=
60,67, // `%
61,467, // `&&
62,416, // `*
63,510, // `(
64,257, // `)
65,331, // `{
66,454, // `}
67,367, // `-
68,15, // `+
69,195, // `=
70,205, // `==
71,168, // `[
72,330, // `]
73,342, // `||
74,142, // `<
75,128, // `<=
76,568, // `,
77,115, // `>
78,106, // `>=
79,143, // `.
80,178, // `;
81,439, // `++
82,227, // `--
83,202, // `/
84,277, // `:
85,571, // ID
86,387, // INTLIT
87,172, // STRINGLIT
88,429, // CHARLIT
  }
,
{ // state 401
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 402
94,147, // "n"
  }
,
{ // state 403
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 404
105,298, // "w"
  }
,
{ // state 405
90,463, // "o"
  }
,
{ // state 406
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 407
2,299, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 408
96,446, // "r"
  }
,
{ // state 409
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 410
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 411
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 412
92,64, // "e"
  }
,
{ // state 413
218,MIN_REDUCTION+221, // $NT
  }
,
{ // state 414
98,151, // "c"
  }
,
{ // state 415
101,129, // "t"
  }
,
{ // state 416
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 417
104,120, // "i"
  }
,
{ // state 418
2,244, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 419
96,285, // "r"
  }
,
{ // state 420
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 421
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 423
101,268, // "t"
  }
,
{ // state 424
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 425
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 426
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 427
99,19, // "s"
  }
,
{ // state 428
2,500, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 429
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 430
2,498, // ws*
131,445, // ws
133,348, // eol
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 432
0x80000000|556, // match move
0x80000000|190, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 433
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 434
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 435
2,228, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 436
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 438
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 439
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 441
110,210, // "y"
  }
,
{ // state 442
-1, // $$start
-1, // start
498, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
490, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
219, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
343, // intLit2
471, // "0"
218, // digit++
-1, // letter
37, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
471, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+196, // $
-1, // $NT
  }
,
{ // state 443
93,264, // "a"
  }
,
{ // state 444
2,76, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 446
0x80000000|1, // match move
0x80000000|390, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 447
92,208, // "e"
  }
,
{ // state 448
96,279, // "r"
  }
,
{ // state 449
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 450
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 451
102,194, // "d"
  }
,
{ // state 452
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 453
2,113, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 455
98,182, // "c"
  }
,
{ // state 456
89,413, // "b"
90,413, // "o"
91,413, // "l"
92,413, // "e"
93,413, // "a"
94,413, // "n"
96,413, // "r"
97,413, // "k"
98,413, // "c"
99,413, // "s"
100,413, // "x"
101,413, // "t"
102,413, // "d"
103,413, // "f"
104,413, // "i"
105,413, // "w"
106,413, // "u"
107,413, // "p"
108,413, // "h"
109,413, // "v"
110,413, // "y"
111,413, // "m"
112,413, // "g"
113,413, // "z"
124,260, // "0"
126,189, // letter
127,538, // digit
128,9, // "_"
129,413, // {"A".."Z" "j" "q"}
130,260, // {"1".."9"}
  }
,
{ // state 457
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 458
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 459
92,85, // "e"
  }
,
{ // state 460
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 461
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 462
0x80000000|1, // match move
0x80000000|393, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 463
103,82, // "f"
  }
,
{ // state 464
94,144, // "n"
  }
,
{ // state 465
2,199, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 466
98,544, // "c"
  }
,
{ // state 467
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 469
2,557, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 470
2,370, // ws*
106,86, // "u"
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 471
0x80000000|111, // match move
0x80000000|420, // no-match move
0x80000000|36, // NT-test-match state for digit
  }
,
{ // state 472
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 473
91,441, // "l"
  }
,
{ // state 474
101,537, // "t"
105,549, // "w"
106,159, // "u"
108,158, // "h"
110,402, // "y"
  }
,
{ // state 475
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 476
2,272, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 477
94,531, // "n"
  }
,
{ // state 478
101,392, // "t"
  }
,
{ // state 479
2,299, // ws*
131,445, // ws
133,348, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 480
0x80000000|1, // match move
0x80000000|54, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 481
2,231, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 484
92,270, // "e"
  }
,
{ // state 485
2,502, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 486
0x80000000|1, // match move
0x80000000|597, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 487
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 489
2,206, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 490
90,212, // "o"
  }
,
{ // state 491
2,152, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 492
92,505, // "e"
  }
,
{ // state 493
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 495
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 496
2,574, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 497
115,407, // "="
  }
,
{ // state 498
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 499
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 500
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 501
2,361, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 502
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 503
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 504
96,91, // "r"
108,385, // "h"
  }
,
{ // state 505
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 506
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 507
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 508
0x80000000|1, // match move
0x80000000|428, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 509
99,312, // "s"
  }
,
{ // state 510
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 513
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 514
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 515
93,374, // "a"
  }
,
{ // state 516
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 517
92,266, // "e"
  }
,
{ // state 518
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 519
111,255, // "m"
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|157, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 521
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 523
2,29, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 524
92,150, // "e"
93,223, // "a"
106,200, // "u"
  }
,
{ // state 525
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 526
91,249, // "l"
  }
,
{ // state 527
2,594, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 528
101,22, // "t"
  }
,
{ // state 529
92,237, // "e"
  }
,
{ // state 530
93,350, // "a"
  }
,
{ // state 531
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 532
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 533
99,239, // "s"
  }
,
{ // state 534
90,145, // "o"
91,193, // "l"
  }
,
{ // state 535
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 537
93,415, // "a"
96,127, // "r"
  }
,
{ // state 538
218,MIN_REDUCTION+219, // $NT
  }
,
{ // state 539
98,209, // "c"
  }
,
{ // state 540
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|301, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 542
93,135, // "a"
104,380, // "i"
106,107, // "u"
110,311, // "y"
  }
,
{ // state 543
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 544
0x80000000|1, // match move
0x80000000|469, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 545
91,186, // "l"
  }
,
{ // state 546
-1, // $$start
-1, // start
493, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
181, // `boolean
580, // `class
184, // `extends
5, // `void
238, // `int
294, // `while
425, // `if
131, // `else
431, // `for
514, // `break
201, // `this
169, // `false
254, // `true
224, // `super
43, // `null
99, // `return
340, // `instanceof
513, // `new
316, // `abstract
401, // `assert
589, // `byte
438, // `case
591, // `catch
358, // `char
422, // `const
506, // `continue
483, // `default
372, // `do
161, // `double
61, // `enum
126, // `final
278, // `finally
105, // `float
175, // `goto
511, // `implements
56, // `import
263, // `interface
409, // `long
321, // `native
406, // `package
287, // `private
41, // `protected
296, // `public
563, // `short
179, // `static
356, // `strictfp
98, // `switch
362, // `synchronized
458, // `throw
58, // `throws
265, // `transient
21, // `try
233, // `volatile
335, // `!
388, // `!=
67, // `%
467, // `&&
416, // `*
510, // `(
257, // `)
331, // `{
454, // `}
367, // `-
15, // `+
195, // `=
205, // `==
168, // `[
330, // `]
342, // `||
142, // `<
128, // `<=
568, // `,
115, // `>
106, // `>=
143, // `.
178, // `;
439, // `++
227, // `--
202, // `/
277, // `:
571, // ID
387, // INTLIT
172, // STRINGLIT
429, // CHARLIT
365, // "b"
-1, // "o"
338, // "l"
363, // "e"
596, // "a"
524, // "n"
-1, // idChar
302, // "r"
-1, // "k"
196, // "c"
474, // "s"
-1, // "x"
504, // "t"
585, // "d"
280, // "f"
376, // "i"
50, // "w"
-1, // "u"
334, // "p"
-1, // "h"
123, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
121, // "!"
497, // "="
80, // "%"
355, // "&"
453, // "*"
133, // "("
489, // ")"
491, // "+"
359, // "-"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
445, // ws
162, // {9 " "}
348, // eol
535, // {10}
230, // {13}
138, // {130}
337, // {131}
319, // {132}
164, // {133}
140, // {134}
540, // {135}
327, // {136}
313, // {137}
494, // {138}
592, // {139}
452, // {140}
117, // {141}
399, // {142}
516, // {143}
130, // {144}
436, // {145}
248, // {146}
329, // {147}
364, // {148}
282, // {149}
378, // {150}
482, // {151}
558, // {152}
153, // {153}
256, // {154}
512, // {155}
198, // {156}
170, // {157}
345, // {158}
108, // {159}
275, // {160}
93, // {161}
576, // {162}
394, // {163}
371, // {164}
522, // {165}
366, // {166}
10, // {167}
66, // {168}
468, // {169}
411, // {170}
284, // {171}
16, // {172}
566, // {173}
197, // {174}
440, // {175}
102, // {176}
303, // {177}
174, // {178}
383, // {179}
349, // {180}
73, // {181}
69, // {182}
290, // {183}
507, // {184}
281, // {185}
11, // {186}
437, // {187}
326, // {188}
94, // {189}
450, // {190}
595, // {191}
167, // {192}
109, // {193}
27, // {194}
487, // {195}
118, // {196}
225, // {197}
548, // {198}
3, // {199}
59, // {200}
95, // {201}
587, // {202}
503, // {203}
495, // {204}
421, // {205}
472, // {206}
332, // {207}
176, // {208}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 547
92,173, // "e"
  }
,
{ // state 548
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 549
104,259, // "i"
  }
,
{ // state 550
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 551
2,525, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 552
94,333, // "n"
  }
,
{ // state 553
91,221, // "l"
  }
,
{ // state 554
96,213, // "r"
  }
,
{ // state 555
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 556
101,537, // "t"
105,549, // "w"
106,159, // "u"
108,158, // "h"
110,402, // "y"
  }
,
{ // state 557
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 558
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 559
93,262, // "a"
  }
,
{ // state 560
104,271, // "i"
  }
,
{ // state 561
102,424, // "d"
  }
,
{ // state 562
0x80000000|1, // match move
0x80000000|496, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 563
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 564
2,47, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 565
2,460, // ws*
131,445, // ws
133,348, // eol
MIN_REDUCTION+198, // (default reduction)
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
{ // state 566
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 567
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 569
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 570
2,240, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 572
2,215, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 573
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 574
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 575
92,276, // "e"
  }
,
{ // state 576
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 577
107,534, // "p"
  }
,
{ // state 578
96,253, // "r"
  }
,
{ // state 579
0x80000000|1, // match move
0x80000000|501, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 580
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 581
92,357, // "e"
  }
,
{ // state 582
2,426, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 583
101,214, // "t"
  }
,
{ // state 584
2,20, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 585
90,44, // "o"
92,188, // "e"
  }
,
{ // state 586
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 588
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|456, // NT-test-match state for idChar
  }
,
{ // state 589
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 590
94,288, // "n"
  }
,
{ // state 591
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 592
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 593
98,18, // "c"
  }
,
{ // state 594
131,45, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 596
89,369, // "b"
99,533, // "s"
  }
,
{ // state 597
2,567, // ws*
131,445, // ws
132,162, // {9 " "}
133,348, // eol
134,535, // {10}
135,230, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[598][];
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
(215<<16)+2,
// token* ::= token
(215<<16)+1,
// digit++ ::= digit+ !digit
(125<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(216<<16)+1,
// digit+ ::= digit+ digit
(216<<16)+2,
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
164, // 158
165, // 159
166, // 160
167, // 161
168, // 162
169, // 163
170, // 164
171, // 165
172, // 166
173, // 167
174, // 168
175, // 169
176, // 170
177, // 171
178, // 172
179, // 173
180, // 174
181, // 175
182, // 176
183, // 177
184, // 178
185, // 179
186, // 180
187, // 181
188, // 182
189, // 183
190, // 184
191, // 185
192, // 186
193, // 187
194, // 188
195, // 189
196, // 190
197, // 191
198, // 192
199, // 193
200, // 194
201, // 195
202, // 196
203, // 197
204, // 198
205, // 199
206, // 200
207, // 201
208, // 202
209, // 203
210, // 204
211, // 205
212, // 206
213, // 207
214, // 208
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
"`abstract ::= {158}", // 256
"`assert ::= {159}", // 257
"`boolean ::= {160}", // 258
"`break ::= {161}", // 259
"`byte ::= {162}", // 260
"`case ::= {163}", // 261
"`catch ::= {164}", // 262
"`char ::= {165}", // 263
"`const ::= {166}", // 264
"`continue ::= {167}", // 265
"`default ::= {168}", // 266
"`do ::= {169}", // 267
"`double ::= {170}", // 268
"`enum ::= {171}", // 269
"`extends ::= {172}", // 270
"`false ::= {173}", // 271
"`final ::= {174}", // 272
"`finally ::= {175}", // 273
"`float ::= {176}", // 274
"`for ::= {177}", // 275
"`goto ::= {178}", // 276
"`if ::= {179}", // 277
"`implements ::= {180}", // 278
"`import ::= {181}", // 279
"`instanceof ::= {182}", // 280
"`int ::= {183}", // 281
"`interface ::= {184}", // 282
"`long ::= {185}", // 283
"`native ::= {186}", // 284
"`new ::= {187}", // 285
"`null ::= {188}", // 286
"`package ::= {189}", // 287
"`private ::= {190}", // 288
"`protected ::= {191}", // 289
"`public ::= {192}", // 290
"`return ::= {193}", // 291
"`short ::= {194}", // 292
"`static ::= {195}", // 293
"`strictfp ::= {196}", // 294
"`super ::= {197}", // 295
"`switch ::= {198}", // 296
"`synchronized ::= {199}", // 297
"`this ::= {200}", // 298
"`throw ::= {201}", // 299
"`throws ::= {202}", // 300
"`transient ::= {203}", // 301
"`true ::= {204}", // 302
"`try ::= {205}", // 303
"`void ::= {206}", // 304
"`volatile ::= {207}", // 305
"`while ::= {208}", // 306
"token* ::= token* token", // 307
"token* ::= token* token", // 308
"digit++ ::= digit+ !digit", // 309
"ws* ::= ws* ws", // 310
"ws* ::= ws* ws", // 311
"digit+ ::= digit", // 312
"digit+ ::= digit+ digit", // 313
"", // 314
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
    { // 256: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 284: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 288: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 302: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 303: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 304: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 305: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 306: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 307: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 308: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 309: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 310: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 311: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 312: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 313: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 314: $$0 ::= token* @pass
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
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
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
