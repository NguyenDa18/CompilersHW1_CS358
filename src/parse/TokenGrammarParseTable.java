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
public int getEofSym() { return 214; }
public int getNttSym() { return 215; }
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
"{\"A\"..\"Z\" \"g\" \"j\" \"m\" \"q\" \"z\"}",
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
public int numSymbols() { return 216;}
private static final int MIN_REDUCTION = 400;
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
0x80000000|125, // match move
0x80000000|17, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 1
  }
,
{ // state 2
2,317, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 4
101,178, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
0x80000000|156, // match move
0x80000000|204, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 7
215,MIN_REDUCTION+164, // $NT
  }
,
{ // state 8
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 10
-1, // $$start
-1, // start
316, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
107, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
305, // ws
109, // {9 " "}
245, // eol
361, // {10}
163, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
-1, // token*
6, // digit+
MIN_REDUCTION+142, // $
-1, // $NT
  }
,
{ // state 11
108,333, // "h"
  }
,
{ // state 12
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 14
108,84, // "h"
  }
,
{ // state 15
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 16
99,223, // "s"
  }
,
{ // state 17
-1, // $$start
59, // start
24, // ws*
276, // $$0
68, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
341, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
305, // ws
109, // {9 " "}
245, // eol
361, // {10}
163, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
247, // token*
6, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 18
90,170, // "o"
  }
,
{ // state 19
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 20
-1, // $$start
-1, // start
212, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
107, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
305, // ws
109, // {9 " "}
245, // eol
361, // {10}
163, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
-1, // token*
6, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 21
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 22
2,63, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 23
92,225, // "e"
  }
,
{ // state 24
0x80000000|268, // match move
0x80000000|157, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 25
121,180, // "0"
127,180, // {"1".."9"}
  }
,
{ // state 26
0x80000000|27, // match move
0x80000000|104, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 27
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 28
99,49, // "s"
101,296, // "t"
  }
,
{ // state 29
94,286, // "n"
  }
,
{ // state 30
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 33
99,376, // "s"
  }
,
{ // state 34
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 35
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 36
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 37
108,239, // "h"
  }
,
{ // state 38
101,56, // "t"
  }
,
{ // state 39
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 40
2,372, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 45
0x80000000|1, // match move
0x80000000|83, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 46
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 49
101,207, // "t"
  }
,
{ // state 50
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 51
2,52, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 52
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 53
2,141, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 54
99,171, // "s"
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 56
0x80000000|1, // match move
0x80000000|111, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 58
99,386, // "s"
101,218, // "t"
  }
,
{ // state 59
214,MIN_REDUCTION+0, // $
  }
,
{ // state 60
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 63
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|384, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 67
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 69
101,271, // "t"
  }
,
{ // state 70
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 72
92,297, // "e"
  }
,
{ // state 73
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 76
0x80000000|1, // match move
0x80000000|22, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 77
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 78
91,284, // "l"
  }
,
{ // state 79
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 82
0x80000000|294, // match move
0x80000000|304, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 83
2,262, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|51, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 85
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 89
2,123, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 90
2,166, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 94
93,216, // "a"
  }
,
{ // state 95
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 97
92,280, // "e"
  }
,
{ // state 98
93,206, // "a"
  }
,
{ // state 99
105,330, // "w"
  }
,
{ // state 100
92,277, // "e"
  }
,
{ // state 101
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 103
99,315, // "s"
  }
,
{ // state 104
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 105
99,226, // "s"
  }
,
{ // state 106
107,97, // "p"
  }
,
{ // state 107
0x80000000|329, // match move
0x80000000|20, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 108
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 111
2,181, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 112
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
186, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
341, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
-1, // token*
6, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 113
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 123
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 125
1,59, // start
2,24, // ws*
3,276, // $$0
4,68, // token
5,124, // `boolean
6,388, // `class
7,126, // `extends
8,5, // `void
9,168, // `int
10,208, // `while
11,292, // `if
12,88, // `else
13,295, // `for
14,352, // `break
15,139, // `this
16,115, // `false
17,175, // `true
18,158, // `super
19,31, // `null
20,65, // `return
21,240, // `instanceof
22,351, // `new
23,220, // `abstract
24,275, // `assert
25,392, // `byte
26,301, // `case
27,393, // `catch
28,250, // `char
29,291, // `const
30,345, // `continue
31,332, // `default
32,260, // `do
33,108, // `double
34,44, // `enum
35,85, // `final
36,194, // `finally
37,70, // `float
38,119, // `goto
39,349, // `implements
40,41, // `import
41,183, // `interface
42,281, // `long
43,224, // `native
44,278, // `package
45,202, // `private
46,30, // `protected
47,210, // `public
48,377, // `short
49,122, // `static
50,249, // `strictfp
51,64, // `switch
52,253, // `synchronized
53,314, // `throw
54,42, // `throws
55,184, // `transient
56,15, // `try
57,165, // `volatile
58,237, // `!
59,267, // `!=
60,47, // `%
61,320, // `&&
62,287, // `*
63,348, // `(
64,177, // `)
65,234, // `{
66,312, // `}
67,257, // `-
68,12, // `+
69,134, // `=
70,144, // `==
71,114, // `[
72,233, // `]
73,241, // `||
74,95, // `<
75,86, // `<=
76,382, // `,
77,79, // `>
78,71, // `>=
79,96, // `.
80,121, // `;
81,302, // `++
82,161, // `--
83,140, // `/
84,193, // `:
85,383, // ID
86,266, // INTLIT
87,117, // STRINGLIT
88,293, // CHARLIT
128,305, // ws
130,245, // eol
212,247, // token*
  }
,
{ // state 126
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 127
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 129
2,131, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 130
215,MIN_REDUCTION+162, // $NT
  }
,
{ // state 131
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 132
2,36, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 134
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 137
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 138
91,366, // "l"
  }
,
{ // state 139
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 141
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 143
2,354, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 145
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 146
2,343, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 147
91,98, // "l"
93,58, // "a"
  }
,
{ // state 148
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 149
94,66, // "n"
  }
,
{ // state 150
90,288, // "o"
93,227, // "a"
  }
,
{ // state 151
92,370, // "e"
  }
,
{ // state 152
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 153
0x80000000|335, // match move
0x80000000|142, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 154
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 155
0x80000000|379, // match move
0x80000000|10, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 156
121,323, // "0"
124,153, // digit
127,323, // {"1".."9"}
  }
,
{ // state 157
-1, // $$start
-1, // start
-1, // ws*
325, // $$0
68, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
341, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
32, // ws
109, // {9 " "}
245, // eol
361, // {10}
163, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
247, // token*
6, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 158
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 160
89,357, // "b"
  }
,
{ // state 161
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 162
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 163
0x80000000|221, // match move
0x80000000|92, // no-match move
// T-test match for 10:
131,
  }
,
{ // state 164
2,174, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 166
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 167
93,328, // "a"
  }
,
{ // state 168
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 169
92,307, // "e"
  }
,
{ // state 170
91,358, // "l"
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|132, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 172
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 173
104,211, // "i"
  }
,
{ // state 174
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 178
106,371, // "u"
  }
,
{ // state 179
101,395, // "t"
  }
,
{ // state 180
215,MIN_REDUCTION+166, // $NT
  }
,
{ // state 181
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 182
97,76, // "k"
  }
,
{ // state 183
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 185
104,309, // "i"
  }
,
{ // state 186
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 187
2,127, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 188
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 189
2,148, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 190
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 192
0x80000000|1, // match move
0x80000000|146, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 193
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 195
101,282, // "t"
  }
,
{ // state 196
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 197
94,28, // "n"
103,362, // "f"
  }
,
{ // state 198
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|252, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 201
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 203
91,103, // "l"
100,389, // "x"
  }
,
{ // state 204
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 206
99,33, // "s"
  }
,
{ // state 207
93,29, // "a"
  }
,
{ // state 208
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 209
96,261, // "r"
108,347, // "h"
  }
,
{ // state 210
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 211
98,244, // "c"
  }
,
{ // state 212
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 213
92,4, // "e"
  }
,
{ // state 214
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 215
92,375, // "e"
  }
,
{ // state 216
98,38, // "c"
  }
,
{ // state 217
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 218
98,11, // "c"
  }
,
{ // state 219
2,369, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 221
131,365, // {10}
  }
,
{ // state 222
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 223
92,265, // "e"
  }
,
{ // state 224
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 225
0x80000000|1, // match move
0x80000000|272, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|378, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 227
91,16, // "l"
  }
,
{ // state 228
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 230
101,23, // "t"
  }
,
{ // state 231
105,368, // "w"
106,106, // "u"
  }
,
{ // state 232
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 236
102,54, // "d"
  }
,
{ // state 237
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 239
104,78, // "i"
  }
,
{ // state 240
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 242
2,201, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 244
0x80000000|1, // match move
0x80000000|189, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 245
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 247
0x80000000|274, // match move
0x80000000|112, // no-match move
// T-test match for "0":
121,
  }
,
{ // state 248
114,164, // "&"
  }
,
{ // state 249
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 251
2,39, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 252
2,390, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 255
90,18, // "o"
96,215, // "r"
110,230, // "y"
  }
,
{ // state 256
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 257
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 258
99,69, // "s"
  }
,
{ // state 259
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 261
106,72, // "u"
  }
,
{ // state 262
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 263
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 265
0x80000000|1, // match move
0x80000000|219, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 266
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 268
3,325, // $$0
4,68, // token
5,124, // `boolean
6,388, // `class
7,126, // `extends
8,5, // `void
9,168, // `int
10,208, // `while
11,292, // `if
12,88, // `else
13,295, // `for
14,352, // `break
15,139, // `this
16,115, // `false
17,175, // `true
18,158, // `super
19,31, // `null
20,65, // `return
21,240, // `instanceof
22,351, // `new
23,220, // `abstract
24,275, // `assert
25,392, // `byte
26,301, // `case
27,393, // `catch
28,250, // `char
29,291, // `const
30,345, // `continue
31,332, // `default
32,260, // `do
33,108, // `double
34,44, // `enum
35,85, // `final
36,194, // `finally
37,70, // `float
38,119, // `goto
39,349, // `implements
40,41, // `import
41,183, // `interface
42,281, // `long
43,224, // `native
44,278, // `package
45,202, // `private
46,30, // `protected
47,210, // `public
48,377, // `short
49,122, // `static
50,249, // `strictfp
51,64, // `switch
52,253, // `synchronized
53,314, // `throw
54,42, // `throws
55,184, // `transient
56,15, // `try
57,165, // `volatile
58,237, // `!
59,267, // `!=
60,47, // `%
61,320, // `&&
62,287, // `*
63,348, // `(
64,177, // `)
65,234, // `{
66,312, // `}
67,257, // `-
68,12, // `+
69,134, // `=
70,144, // `==
71,114, // `[
72,233, // `]
73,241, // `||
74,95, // `<
75,86, // `<=
76,382, // `,
77,79, // `>
78,71, // `>=
79,96, // `.
80,121, // `;
81,302, // `++
82,161, // `--
83,140, // `/
84,193, // `:
85,383, // ID
86,266, // INTLIT
87,117, // STRINGLIT
88,293, // CHARLIT
128,32, // ws
130,245, // eol
212,247, // token*
  }
,
{ // state 269
2,190, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 271
96,94, // "r"
  }
,
{ // state 272
2,35, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 274
4,186, // token
5,124, // `boolean
6,388, // `class
7,126, // `extends
8,5, // `void
9,168, // `int
10,208, // `while
11,292, // `if
12,88, // `else
13,295, // `for
14,352, // `break
15,139, // `this
16,115, // `false
17,175, // `true
18,158, // `super
19,31, // `null
20,65, // `return
21,240, // `instanceof
22,351, // `new
23,220, // `abstract
24,275, // `assert
25,392, // `byte
26,301, // `case
27,393, // `catch
28,250, // `char
29,291, // `const
30,345, // `continue
31,332, // `default
32,260, // `do
33,108, // `double
34,44, // `enum
35,85, // `final
36,194, // `finally
37,70, // `float
38,119, // `goto
39,349, // `implements
40,41, // `import
41,183, // `interface
42,281, // `long
43,224, // `native
44,278, // `package
45,202, // `private
46,30, // `protected
47,210, // `public
48,377, // `short
49,122, // `static
50,249, // `strictfp
51,64, // `switch
52,253, // `synchronized
53,314, // `throw
54,42, // `throws
55,184, // `transient
56,15, // `try
57,165, // `volatile
58,237, // `!
59,267, // `!=
60,47, // `%
61,320, // `&&
62,287, // `*
63,348, // `(
64,177, // `)
65,234, // `{
66,312, // `}
67,257, // `-
68,12, // `+
69,134, // `=
70,144, // `==
71,114, // `[
72,233, // `]
73,241, // `||
74,95, // `<
75,86, // `<=
76,382, // `,
77,79, // `>
78,71, // `>=
79,96, // `.
80,121, // `;
81,302, // `++
82,161, // `--
83,140, // `/
84,193, // `:
85,383, // ID
86,266, // INTLIT
87,117, // STRINGLIT
88,293, // CHARLIT
  }
,
{ // state 275
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 277
90,318, // "o"
  }
,
{ // state 278
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 279
2,212, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 280
96,306, // "r"
  }
,
{ // state 281
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|129, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 283
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 284
92,45, // "e"
  }
,
{ // state 285
215,MIN_REDUCTION+165, // $NT
  }
,
{ // state 286
98,100, // "c"
  }
,
{ // state 287
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 288
96,200, // "r"
  }
,
{ // state 289
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 294
2,342, // ws*
128,305, // ws
130,245, // eol
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 297
0x80000000|1, // match move
0x80000000|356, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 298
2,162, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 304
-1, // $$start
-1, // start
342, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
124, // `boolean
388, // `class
126, // `extends
5, // `void
168, // `int
208, // `while
292, // `if
88, // `else
295, // `for
352, // `break
139, // `this
115, // `false
175, // `true
158, // `super
31, // `null
65, // `return
240, // `instanceof
351, // `new
220, // `abstract
275, // `assert
392, // `byte
301, // `case
393, // `catch
250, // `char
291, // `const
345, // `continue
332, // `default
260, // `do
108, // `double
44, // `enum
85, // `final
194, // `finally
70, // `float
119, // `goto
349, // `implements
41, // `import
183, // `interface
281, // `long
224, // `native
278, // `package
202, // `private
30, // `protected
210, // `public
377, // `short
122, // `static
249, // `strictfp
64, // `switch
253, // `synchronized
314, // `throw
42, // `throws
184, // `transient
15, // `try
165, // `volatile
237, // `!
267, // `!=
47, // `%
320, // `&&
287, // `*
348, // `(
177, // `)
234, // `{
312, // `}
257, // `-
12, // `+
134, // `=
144, // `==
114, // `[
233, // `]
241, // `||
95, // `<
86, // `<=
382, // `,
79, // `>
71, // `>=
96, // `.
121, // `;
302, // `++
161, // `--
140, // `/
193, // `:
383, // ID
266, // INTLIT
117, // STRINGLIT
293, // CHARLIT
255, // "b"
-1, // "o"
-1, // "l"
203, // "e"
397, // "a"
322, // "n"
-1, // idChar
213, // "r"
-1, // "k"
147, // "c"
231, // "s"
-1, // "x"
209, // "t"
-1, // "d"
150, // "f"
197, // "i"
37, // "w"
-1, // "u"
327, // "p"
-1, // "h"
374, // "v"
-1, // "y"
82, // "!"
155, // "="
53, // "%"
248, // "&"
311, // "*"
90, // "("
336, // ")"
337, // "+"
251, // "-"
242, // intLit2
323, // "0"
154, // digit++
-1, // letter
26, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "z"}
323, // {"1".."9"}
305, // ws
109, // {9 " "}
245, // eol
361, // {10}
163, // {13}
91, // {130}
238, // {131}
222, // {132}
110, // {133}
93, // {134}
364, // {135}
229, // {136}
217, // {137}
338, // {138}
394, // {139}
310, // {140}
80, // {141}
273, // {142}
353, // {143}
87, // {144}
299, // {145}
172, // {146}
232, // {147}
254, // {148}
198, // {149}
263, // {150}
331, // {151}
373, // {152}
102, // {153}
176, // {154}
350, // {155}
136, // {156}
116, // {157}
243, // {158}
73, // {159}
191, // {160}
60, // {161}
387, // {162}
270, // {163}
259, // {164}
355, // {165}
256, // {166}
8, // {167}
46, // {168}
321, // {169}
283, // {170}
199, // {171}
13, // {172}
380, // {173}
135, // {174}
303, // {175}
67, // {176}
214, // {177}
118, // {178}
264, // {179}
246, // {180}
50, // {181}
48, // {182}
205, // {183}
346, // {184}
196, // {185}
9, // {186}
300, // {187}
228, // {188}
61, // {189}
308, // {190}
396, // {191}
113, // {192}
74, // {193}
19, // {194}
334, // {195}
81, // {196}
159, // {197}
367, // {198}
3, // {199}
43, // {200}
62, // {201}
391, // {202}
344, // {203}
339, // {204}
290, // {205}
324, // {206}
235, // {207}
120, // {208}
-1, // token*
6, // digit+
MIN_REDUCTION+140, // $
-1, // $NT
  }
,
{ // state 305
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 306
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 307
96,195, // "r"
  }
,
{ // state 308
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 309
102,133, // "d"
  }
,
{ // state 310
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 311
2,77, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 313
89,285, // "b"
90,285, // "o"
91,285, // "l"
92,285, // "e"
93,285, // "a"
94,285, // "n"
96,285, // "r"
97,285, // "k"
98,285, // "c"
99,285, // "s"
100,285, // "x"
101,285, // "t"
102,285, // "d"
103,285, // "f"
104,285, // "i"
105,285, // "w"
106,285, // "u"
107,285, // "p"
108,285, // "h"
109,285, // "v"
110,285, // "y"
121,180, // "0"
123,130, // letter
124,363, // digit
125,7, // "_"
126,285, // {"A".."Z" "g" "j" "m" "q" "z"}
127,180, // {"1".."9"}
  }
,
{ // state 314
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 315
92,57, // "e"
  }
,
{ // state 316
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 317
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 318
103,55, // "f"
  }
,
{ // state 319
2,137, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 321
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 322
92,99, // "e"
106,138, // "u"
  }
,
{ // state 323
0x80000000|75, // match move
0x80000000|289, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 324
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 326
2,188, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 327
106,160, // "u"
  }
,
{ // state 328
94,359, // "n"
  }
,
{ // state 329
2,212, // ws*
128,305, // ws
130,245, // eol
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|40, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 331
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|398, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 334
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 336
2,145, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 337
2,101, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 340
2,385, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 341
112,279, // "="
  }
,
{ // state 342
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 343
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 345
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 347
104,105, // "i"
  }
,
{ // state 348
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 354
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 356
2,21, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 357
91,173, // "l"
  }
,
{ // state 358
92,167, // "e"
  }
,
{ // state 359
0x80000000|1, // match move
0x80000000|319, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 360
99,169, // "s"
  }
,
{ // state 361
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 362
0x80000000|1, // match move
0x80000000|298, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 363
215,MIN_REDUCTION+163, // $NT
  }
,
{ // state 364
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 366
91,128, // "l"
  }
,
{ // state 367
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 368
104,179, // "i"
  }
,
{ // state 369
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 370
94,236, // "n"
  }
,
{ // state 371
96,149, // "r"
  }
,
{ // state 372
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 373
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 374
90,185, // "o"
  }
,
{ // state 375
93,182, // "a"
  }
,
{ // state 376
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|313, // NT-test-match state for idChar
  }
,
{ // state 377
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 378
2,34, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 379
2,316, // ws*
128,305, // ws
130,245, // eol
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 381
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 383
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 384
2,152, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 385
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 386
92,192, // "e"
  }
,
{ // state 387
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 389
101,151, // "t"
  }
,
{ // state 390
128,32, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 392
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 395
98,14, // "c"
  }
,
{ // state 396
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 397
89,258, // "b"
99,360, // "s"
  }
,
{ // state 398
2,381, // ws*
128,305, // ws
129,109, // {9 " "}
130,245, // eol
131,361, // {10}
132,163, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[399][];
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
(120<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(123<<16)+1,
// digit ::= {"0".."9"}
(124<<16)+1,
// ws ::= {9 " "}
(128<<16)+1,
// ws ::= eol
(128<<16)+1,
// eol ::= {10}
(130<<16)+1,
// eol ::= {13} {10}
(130<<16)+2,
// eol ::= {13} !10
(130<<16)+1,
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
(212<<16)+2,
// token* ::= token
(212<<16)+1,
// digit++ ::= digit+ !digit
(122<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(213<<16)+1,
// digit+ ::= digit+ digit
(213<<16)+2,
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
129, // 9
131, // 10
-1, // 11
-1, // 12
132, // 13
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
129, // " "
111, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
113, // "%"
114, // "&"
-1, // "'"
116, // "("
117, // ")"
115, // "*"
118, // "+"
-1, // ","
119, // "-"
-1, // "."
-1, // "/"
121, // "0"
127, // "1"
127, // "2"
127, // "3"
127, // "4"
127, // "5"
127, // "6"
127, // "7"
127, // "8"
127, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
112, // "="
-1, // ">"
-1, // "?"
-1, // "@"
126, // "A"
126, // "B"
126, // "C"
126, // "D"
126, // "E"
126, // "F"
126, // "G"
126, // "H"
126, // "I"
126, // "J"
126, // "K"
126, // "L"
126, // "M"
126, // "N"
126, // "O"
126, // "P"
126, // "Q"
126, // "R"
126, // "S"
126, // "T"
126, // "U"
126, // "V"
126, // "W"
126, // "X"
126, // "Y"
126, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
125, // "_"
-1, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
126, // "g"
108, // "h"
104, // "i"
126, // "j"
97, // "k"
91, // "l"
126, // "m"
94, // "n"
90, // "o"
107, // "p"
126, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
126, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
133, // 130
134, // 131
135, // 132
136, // 133
137, // 134
138, // 135
139, // 136
140, // 137
141, // 138
142, // 139
143, // 140
144, // 141
145, // 142
146, // 143
147, // 144
148, // 145
149, // 146
150, // 147
151, // 148
152, // 149
153, // 150
154, // 151
155, // 152
156, // 153
157, // 154
158, // 155
159, // 156
160, // 157
161, // 158
162, // 159
163, // 160
164, // 161
165, // 162
166, // 163
167, // 164
168, // 165
169, // 166
170, // 167
171, // 168
172, // 169
173, // 170
174, // 171
175, // 172
176, // 173
177, // 174
178, // 175
179, // 176
180, // 177
181, // 178
182, // 179
183, // 180
184, // 181
185, // 182
186, // 183
187, // 184
188, // 185
189, // 186
190, // 187
191, // 188
192, // 189
193, // 190
194, // 191
195, // 192
196, // 193
197, // 194
198, // 195
199, // 196
200, // 197
201, // 198
202, // 199
203, // 200
204, // 201
205, // 202
206, // 203
207, // 204
208, // 205
209, // 206
210, // 207
211, // 208
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
"`! ::= \"!\" ws*", // 139
"`! ::= \"!\" ws*", // 140
"`!= ::= \"!\" \"=\" ws*", // 141
"`!= ::= \"!\" \"=\" ws*", // 142
"`% ::= \"%\" ws*", // 143
"`% ::= \"%\" ws*", // 144
"`&& ::= \"&\" \"&\" ws*", // 145
"`&& ::= \"&\" \"&\" ws*", // 146
"`* ::= \"*\" ws*", // 147
"`* ::= \"*\" ws*", // 148
"`( ::= \"(\" ws*", // 149
"`( ::= \"(\" ws*", // 150
"`) ::= \")\" ws*", // 151
"`) ::= \")\" ws*", // 152
"`== ::= \"=\" \"=\" ws*", // 153
"`== ::= \"=\" \"=\" ws*", // 154
"`+ ::= \"+\" ws*", // 155
"`+ ::= \"+\" ws*", // 156
"`- ::= \"-\" ws*", // 157
"`- ::= \"-\" ws*", // 158
"INTLIT ::= # intLit2 ws*", // 159
"INTLIT ::= # intLit2 ws*", // 160
"intLit2 ::= !\"0\" digit++", // 161
"idChar ::= letter", // 162
"idChar ::= digit", // 163
"idChar ::= \"_\"", // 164
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 165
"digit ::= {\"0\"..\"9\"}", // 166
"ws ::= {9 \" \"}", // 167
"ws ::= eol", // 168
"eol ::= {10} registerNewline", // 169
"eol ::= {13} {10} registerNewline", // 170
"eol ::= {13} !10 registerNewline", // 171
"CHARLIT ::= {130}", // 172
"ID ::= {131}", // 173
"STRINGLIT ::= {132}", // 174
"`! ::= {133}", // 175
"`% ::= {134}", // 176
"`&& ::= {135}", // 177
"`( ::= {136}", // 178
"`) ::= {137}", // 179
"`+ ::= {138}", // 180
"`++ ::= {139}", // 181
"`, ::= {140}", // 182
"`- ::= {141}", // 183
"`-- ::= {142}", // 184
"`. ::= {143}", // 185
"`/ ::= {144}", // 186
"`; ::= {145}", // 187
"`< ::= {146}", // 188
"`<= ::= {147}", // 189
"`= ::= {148}", // 190
"`== ::= {149}", // 191
"`> ::= {150}", // 192
"`>= ::= {151}", // 193
"`[ ::= {152}", // 194
"`] ::= {153}", // 195
"`{ ::= {154}", // 196
"`|| ::= {155}", // 197
"`} ::= {156}", // 198
"`: ::= {157}", // 199
"`abstract ::= {158}", // 200
"`assert ::= {159}", // 201
"`boolean ::= {160}", // 202
"`break ::= {161}", // 203
"`byte ::= {162}", // 204
"`case ::= {163}", // 205
"`catch ::= {164}", // 206
"`char ::= {165}", // 207
"`const ::= {166}", // 208
"`continue ::= {167}", // 209
"`default ::= {168}", // 210
"`do ::= {169}", // 211
"`double ::= {170}", // 212
"`enum ::= {171}", // 213
"`extends ::= {172}", // 214
"`false ::= {173}", // 215
"`final ::= {174}", // 216
"`finally ::= {175}", // 217
"`float ::= {176}", // 218
"`for ::= {177}", // 219
"`goto ::= {178}", // 220
"`if ::= {179}", // 221
"`implements ::= {180}", // 222
"`import ::= {181}", // 223
"`instanceof ::= {182}", // 224
"`int ::= {183}", // 225
"`interface ::= {184}", // 226
"`long ::= {185}", // 227
"`native ::= {186}", // 228
"`new ::= {187}", // 229
"`null ::= {188}", // 230
"`package ::= {189}", // 231
"`private ::= {190}", // 232
"`protected ::= {191}", // 233
"`public ::= {192}", // 234
"`return ::= {193}", // 235
"`short ::= {194}", // 236
"`static ::= {195}", // 237
"`strictfp ::= {196}", // 238
"`super ::= {197}", // 239
"`switch ::= {198}", // 240
"`synchronized ::= {199}", // 241
"`this ::= {200}", // 242
"`throw ::= {201}", // 243
"`throws ::= {202}", // 244
"`transient ::= {203}", // 245
"`true ::= {204}", // 246
"`try ::= {205}", // 247
"`void ::= {206}", // 248
"`volatile ::= {207}", // 249
"`while ::= {208}", // 250
"token* ::= token* token", // 251
"token* ::= token* token", // 252
"digit++ ::= digit+ !digit", // 253
"ws* ::= ws* ws", // 254
"ws* ::= ws* ws", // 255
"digit+ ::= digit", // 256
"digit+ ::= digit+ digit", // 257
"", // 258
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
    { // 139: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `! ::= "!" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 146: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 147: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 154: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 160: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 161: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 162: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 163: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 164: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 165: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 166: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 167: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 171: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 173: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 174: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 175: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 231: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 252: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 253: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 254: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 255: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 256: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 257: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 258: $$0 ::= token* @pass
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
