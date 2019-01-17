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
public int getEofSym() { return 213; }
public int getNttSym() { return 214; }
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
"{\"A\"..\"Z\" \"g\" \"j\" \"m\" \"q\" \"y\"..\"z\"}",
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
public int numSymbols() { return 215;}
private static final int MIN_REDUCTION = 361;
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
0x80000000|231, // match move
0x80000000|28, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 1
  }
,
{ // state 2
2,213, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 5
101,330, // "t"
  }
,
{ // state 6
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 7
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 10
91,179, // "l"
100,342, // "x"
  }
,
{ // state 11
0x80000000|284, // match move
0x80000000|14, // no-match move
0x80000000|40, // NT-test-match state for digit
  }
,
{ // state 12
214,MIN_REDUCTION+152, // $NT
  }
,
{ // state 13
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 17
99,54, // "s"
  }
,
{ // state 18
-1, // $$start
-1, // start
211, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
185, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
196, // ws
187, // {9 " "}
87, // eol
288, // {10}
300, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
-1, // token*
11, // digit+
MIN_REDUCTION+130, // $
-1, // $NT
  }
,
{ // state 19
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 21
108,142, // "h"
  }
,
{ // state 22
93,47, // "a"
  }
,
{ // state 23
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 25
96,114, // "r"
108,264, // "h"
  }
,
{ // state 26
99,55, // "s"
  }
,
{ // state 27
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 28
-1, // $$start
104, // start
39, // ws*
143, // $$0
118, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
251, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
196, // ws
187, // {9 " "}
87, // eol
288, // {10}
300, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
92, // token*
11, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 29
98,86, // "c"
  }
,
{ // state 30
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 31
92,5, // "e"
  }
,
{ // state 32
90,312, // "o"
  }
,
{ // state 33
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 34
-1, // $$start
-1, // start
30, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
185, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
196, // ws
187, // {9 " "}
87, // eol
288, // {10}
300, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
-1, // token*
11, // digit+
MIN_REDUCTION+142, // $
-1, // $NT
  }
,
{ // state 35
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 37
2,110, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 38
92,315, // "e"
  }
,
{ // state 39
0x80000000|125, // match move
0x80000000|290, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 40
120,333, // "0"
126,333, // {"1".."9"}
  }
,
{ // state 41
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 42
0x80000000|43, // match move
0x80000000|180, // no-match move
0x80000000|40, // NT-test-match state for digit
  }
,
{ // state 43
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 44
99,80, // "s"
101,177, // "t"
  }
,
{ // state 45
2,304, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 46
90,32, // "o"
96,38, // "r"
  }
,
{ // state 47
94,156, // "n"
  }
,
{ // state 48
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 51
130,298, // {10}
  }
,
{ // state 52
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 54
99,316, // "s"
  }
,
{ // state 55
92,120, // "e"
  }
,
{ // state 56
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 58
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 59
91,26, // "l"
  }
,
{ // state 60
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 63
105,303, // "w"
106,183, // "u"
  }
,
{ // state 64
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 65
2,311, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 74
102,95, // "d"
  }
,
{ // state 75
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 80
101,22, // "t"
  }
,
{ // state 81
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 84
2,7, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|347, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 87
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 89
2,90, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 90
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 91
2,261, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 92
0x80000000|139, // match move
0x80000000|195, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 93
113,301, // "&"
  }
,
{ // state 94
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 95
99,317, // "s"
  }
,
{ // state 96
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 97
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 98
2,64, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 99
2,344, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 101
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 104
213,MIN_REDUCTION+0, // $
  }
,
{ // state 105
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 110
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 114
106,127, // "u"
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|332, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 116
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 120
0x80000000|1, // match move
0x80000000|45, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 121
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 125
3,226, // $$0
4,118, // token
5,228, // `boolean
6,341, // `class
7,232, // `extends
8,8, // `void
9,310, // `int
10,24, // `while
11,167, // `if
12,152, // `else
13,173, // `for
14,271, // `break
15,259, // `this
16,200, // `false
17,326, // `true
18,293, // `super
19,50, // `null
20,113, // `return
21,81, // `instanceof
22,270, // `new
23,49, // `abstract
24,141, // `assert
25,352, // `byte
26,190, // `case
27,353, // `catch
28,96, // `char
29,166, // `const
30,256, // `continue
31,238, // `default
32,111, // `do
33,186, // `double
34,72, // `enum
35,144, // `final
36,351, // `finally
37,123, // `float
38,216, // `goto
39,268, // `implements
40,67, // `import
41,336, // `interface
42,150, // `long
43,57, // `native
44,146, // `package
45,9, // `private
46,48, // `protected
47,27, // `public
48,318, // `short
49,224, // `static
50,94, // `strictfp
51,112, // `switch
52,101, // `synchronized
53,209, // `throw
54,68, // `throws
55,337, // `transient
56,23, // `try
57,305, // `volatile
58,77, // `!
59,122, // `!=
60,76, // `%
61,219, // `&&
62,158, // `*
63,266, // `(
64,328, // `)
65,71, // `{
66,206, // `}
67,105, // `-
68,19, // `+
69,247, // `=
70,265, // `==
71,199, // `[
72,70, // `]
73,83, // `||
74,163, // `<
75,147, // `<=
76,325, // `,
77,134, // `>
78,124, // `>=
79,168, // `.
80,218, // `;
81,191, // `++
82,296, // `--
83,260, // `/
84,350, // `:
85,329, // ID
86,121, // INTLIT
87,207, // STRINGLIT
88,170, // CHARLIT
127,53, // ws
129,87, // eol
211,92, // token*
  }
,
{ // state 126
2,348, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 127
92,182, // "e"
  }
,
{ // state 128
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 131
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 132
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 133
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 137
91,172, // "l"
  }
,
{ // state 138
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 139
4,340, // token
5,228, // `boolean
6,341, // `class
7,232, // `extends
8,8, // `void
9,310, // `int
10,24, // `while
11,167, // `if
12,152, // `else
13,173, // `for
14,271, // `break
15,259, // `this
16,200, // `false
17,326, // `true
18,293, // `super
19,50, // `null
20,113, // `return
21,81, // `instanceof
22,270, // `new
23,49, // `abstract
24,141, // `assert
25,352, // `byte
26,190, // `case
27,353, // `catch
28,96, // `char
29,166, // `const
30,256, // `continue
31,238, // `default
32,111, // `do
33,186, // `double
34,72, // `enum
35,144, // `final
36,351, // `finally
37,123, // `float
38,216, // `goto
39,268, // `implements
40,67, // `import
41,336, // `interface
42,150, // `long
43,57, // `native
44,146, // `package
45,9, // `private
46,48, // `protected
47,27, // `public
48,318, // `short
49,224, // `static
50,94, // `strictfp
51,112, // `switch
52,101, // `synchronized
53,209, // `throw
54,68, // `throws
55,337, // `transient
56,23, // `try
57,305, // `volatile
58,77, // `!
59,122, // `!=
60,76, // `%
61,219, // `&&
62,158, // `*
63,266, // `(
64,328, // `)
65,71, // `{
66,206, // `}
67,105, // `-
68,19, // `+
69,247, // `=
70,265, // `==
71,199, // `[
72,70, // `]
73,83, // `||
74,163, // `<
75,147, // `<=
76,325, // `,
77,134, // `>
78,124, // `>=
79,168, // `.
80,218, // `;
81,191, // `++
82,296, // `--
83,260, // `/
84,350, // `:
85,329, // ID
86,121, // INTLIT
87,207, // STRINGLIT
88,170, // CHARLIT
  }
,
{ // state 140
0x80000000|171, // match move
0x80000000|194, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 141
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 142
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 143
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 145
90,214, // "o"
  }
,
{ // state 146
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 148
2,30, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 149
96,197, // "r"
  }
,
{ // state 150
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 154
2,225, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 155
214,MIN_REDUCTION+153, // $NT
  }
,
{ // state 156
98,175, // "c"
  }
,
{ // state 157
2,307, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 162
96,6, // "r"
  }
,
{ // state 163
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 169
92,149, // "e"
  }
,
{ // state 170
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 171
2,253, // ws*
127,196, // ws
129,87, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 172
93,17, // "a"
  }
,
{ // state 173
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 174
105,234, // "w"
  }
,
{ // state 175
92,145, // "e"
  }
,
{ // state 176
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 177
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 178
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 179
99,210, // "s"
  }
,
{ // state 180
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 181
99,58, // "s"
  }
,
{ // state 182
0x80000000|1, // match move
0x80000000|282, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 183
107,169, // "p"
  }
,
{ // state 184
2,297, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 185
0x80000000|233, // match move
0x80000000|34, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 186
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 194
-1, // $$start
-1, // start
253, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
283, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
196, // ws
187, // {9 " "}
87, // eol
288, // {10}
300, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
-1, // token*
11, // digit+
MIN_REDUCTION+128, // $
-1, // $NT
  }
,
{ // state 195
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
340, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
251, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
-1, // token*
11, // digit+
MIN_REDUCTION+246, // $
-1, // $NT
  }
,
{ // state 196
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 197
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 198
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 203
102,245, // "d"
  }
,
{ // state 204
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 205
2,133, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 208
89,155, // "b"
90,155, // "o"
91,155, // "l"
92,155, // "e"
93,155, // "a"
94,155, // "n"
96,155, // "r"
97,155, // "k"
98,155, // "c"
99,155, // "s"
100,155, // "x"
101,155, // "t"
102,155, // "d"
103,155, // "f"
104,155, // "i"
105,155, // "w"
106,155, // "u"
107,155, // "p"
108,155, // "h"
109,155, // "v"
120,333, // "0"
122,239, // letter
123,291, // digit
124,12, // "_"
125,155, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
126,333, // {"1".."9"}
  }
,
{ // state 209
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 210
92,100, // "e"
  }
,
{ // state 211
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 213
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 214
103,97, // "f"
  }
,
{ // state 215
2,255, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 221
92,174, // "e"
106,257, // "u"
  }
,
{ // state 222
0x80000000|130, // match move
0x80000000|164, // no-match move
0x80000000|40, // NT-test-match state for digit
  }
,
{ // state 223
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 225
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 227
2,345, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 229
106,295, // "u"
  }
,
{ // state 230
94,287, // "n"
  }
,
{ // state 231
1,104, // start
2,39, // ws*
3,143, // $$0
4,118, // token
5,228, // `boolean
6,341, // `class
7,232, // `extends
8,8, // `void
9,310, // `int
10,24, // `while
11,167, // `if
12,152, // `else
13,173, // `for
14,271, // `break
15,259, // `this
16,200, // `false
17,326, // `true
18,293, // `super
19,50, // `null
20,113, // `return
21,81, // `instanceof
22,270, // `new
23,49, // `abstract
24,141, // `assert
25,352, // `byte
26,190, // `case
27,353, // `catch
28,96, // `char
29,166, // `const
30,256, // `continue
31,238, // `default
32,111, // `do
33,186, // `double
34,72, // `enum
35,144, // `final
36,351, // `finally
37,123, // `float
38,216, // `goto
39,268, // `implements
40,67, // `import
41,336, // `interface
42,150, // `long
43,57, // `native
44,146, // `package
45,9, // `private
46,48, // `protected
47,27, // `public
48,318, // `short
49,224, // `static
50,94, // `strictfp
51,112, // `switch
52,101, // `synchronized
53,209, // `throw
54,68, // `throws
55,337, // `transient
56,23, // `try
57,305, // `volatile
58,77, // `!
59,122, // `!=
60,76, // `%
61,219, // `&&
62,158, // `*
63,266, // `(
64,328, // `)
65,71, // `{
66,206, // `}
67,105, // `-
68,19, // `+
69,247, // `=
70,265, // `==
71,199, // `[
72,70, // `]
73,83, // `||
74,163, // `<
75,147, // `<=
76,325, // `,
77,134, // `>
78,124, // `>=
79,168, // `.
80,218, // `;
81,191, // `++
82,296, // `--
83,260, // `/
84,350, // `:
85,329, // ID
86,121, // INTLIT
87,207, // STRINGLIT
88,170, // CHARLIT
127,196, // ws
129,87, // eol
211,92, // token*
  }
,
{ // state 232
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 233
2,30, // ws*
127,196, // ws
129,87, // eol
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 234
0x80000000|1, // match move
0x80000000|65, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 235
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 237
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 239
214,MIN_REDUCTION+150, // $NT
  }
,
{ // state 240
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 242
2,267, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 243
2,60, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 244
2,176, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 246
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 249
2,334, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 251
111,148, // "="
  }
,
{ // state 252
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 253
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 255
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 257
91,299, // "l"
  }
,
{ // state 258
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 261
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 263
2,277, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 264
104,181, // "i"
  }
,
{ // state 265
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 267
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 273
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 274
94,115, // "n"
  }
,
{ // state 275
90,162, // "o"
93,59, // "a"
  }
,
{ // state 276
92,306, // "e"
  }
,
{ // state 277
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 278
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 279
0x80000000|241, // match move
0x80000000|262, // no-match move
0x80000000|40, // NT-test-match state for digit
  }
,
{ // state 280
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 282
2,35, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 283
0x80000000|323, // match move
0x80000000|18, // no-match move
// T-test match for "0":
120,
  }
,
{ // state 284
120,222, // "0"
123,279, // digit
126,222, // {"1".."9"}
  }
,
{ // state 285
91,320, // "l"
  }
,
{ // state 286
92,309, // "e"
  }
,
{ // state 287
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 288
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 289
0x80000000|1, // match move
0x80000000|184, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 290
-1, // $$start
-1, // start
-1, // ws*
226, // $$0
118, // token
228, // `boolean
341, // `class
232, // `extends
8, // `void
310, // `int
24, // `while
167, // `if
152, // `else
173, // `for
271, // `break
259, // `this
200, // `false
326, // `true
293, // `super
50, // `null
113, // `return
81, // `instanceof
270, // `new
49, // `abstract
141, // `assert
352, // `byte
190, // `case
353, // `catch
96, // `char
166, // `const
256, // `continue
238, // `default
111, // `do
186, // `double
72, // `enum
144, // `final
351, // `finally
123, // `float
216, // `goto
268, // `implements
67, // `import
336, // `interface
150, // `long
57, // `native
146, // `package
9, // `private
48, // `protected
27, // `public
318, // `short
224, // `static
94, // `strictfp
112, // `switch
101, // `synchronized
209, // `throw
68, // `throws
337, // `transient
23, // `try
305, // `volatile
77, // `!
122, // `!=
76, // `%
219, // `&&
158, // `*
266, // `(
328, // `)
71, // `{
206, // `}
105, // `-
19, // `+
247, // `=
265, // `==
199, // `[
70, // `]
83, // `||
163, // `<
147, // `<=
325, // `,
134, // `>
124, // `>=
168, // `.
218, // `;
191, // `++
296, // `--
260, // `/
350, // `:
329, // ID
121, // INTLIT
207, // STRINGLIT
170, // CHARLIT
46, // "b"
-1, // "o"
-1, // "l"
10, // "e"
-1, // "a"
221, // "n"
-1, // idChar
31, // "r"
-1, // "k"
137, // "c"
63, // "s"
-1, // "x"
25, // "t"
-1, // "d"
275, // "f"
358, // "i"
-1, // "w"
-1, // "u"
229, // "p"
-1, // "h"
314, // "v"
140, // "!"
251, // "="
91, // "%"
93, // "&"
205, // "*"
157, // "("
242, // ")"
244, // "+"
98, // "-"
84, // intLit2
222, // "0"
281, // digit++
-1, // letter
42, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
222, // {"1".."9"}
53, // ws
187, // {9 " "}
87, // eol
288, // {10}
300, // {13}
159, // {130}
79, // {131}
52, // {132}
193, // {133}
161, // {134}
292, // {135}
62, // {136}
41, // {137}
246, // {138}
354, // {139}
204, // {140}
135, // {141}
138, // {142}
272, // {143}
151, // {144}
188, // {145}
319, // {146}
66, // {147}
102, // {148}
359, // {149}
116, // {150}
237, // {151}
313, // {152}
178, // {153}
327, // {154}
269, // {155}
252, // {156}
202, // {157}
85, // {158}
128, // {159}
349, // {160}
106, // {161}
339, // {162}
132, // {163}
109, // {164}
280, // {165}
103, // {166}
13, // {167}
75, // {168}
220, // {169}
153, // {170}
4, // {171}
20, // {172}
324, // {173}
250, // {174}
192, // {175}
117, // {176}
36, // {177}
212, // {178}
119, // {179}
88, // {180}
82, // {181}
78, // {182}
16, // {183}
258, // {184}
357, // {185}
15, // {186}
189, // {187}
61, // {188}
107, // {189}
201, // {190}
356, // {191}
198, // {192}
129, // {193}
33, // {194}
240, // {195}
136, // {196}
294, // {197}
302, // {198}
3, // {199}
69, // {200}
108, // {201}
346, // {202}
254, // {203}
248, // {204}
165, // {205}
223, // {206}
73, // {207}
217, // {208}
92, // token*
11, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 291
214,MIN_REDUCTION+151, // $NT
  }
,
{ // state 292
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 295
89,285, // "b"
  }
,
{ // state 296
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 297
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 299
91,236, // "l"
  }
,
{ // state 300
0x80000000|51, // match move
0x80000000|160, // no-match move
// T-test match for 10:
130,
  }
,
{ // state 301
2,322, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 303
104,331, // "i"
  }
,
{ // state 304
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 306
94,74, // "n"
  }
,
{ // state 307
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 308
96,274, // "r"
  }
,
{ // state 309
93,230, // "a"
  }
,
{ // state 310
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 311
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 312
91,286, // "l"
  }
,
{ // state 313
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 314
90,338, // "o"
  }
,
{ // state 315
93,335, // "a"
  }
,
{ // state 316
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 317
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|208, // NT-test-match state for idChar
  }
,
{ // state 318
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 320
104,29, // "i"
  }
,
{ // state 321
2,56, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 322
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 323
2,211, // ws*
127,196, // ws
129,87, // eol
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 328
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 330
106,308, // "u"
  }
,
{ // state 331
101,355, // "t"
  }
,
{ // state 332
2,278, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 333
214,MIN_REDUCTION+154, // $NT
  }
,
{ // state 334
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 335
97,131, // "k"
  }
,
{ // state 336
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 338
104,203, // "i"
  }
,
{ // state 339
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 342
101,276, // "t"
  }
,
{ // state 343
2,235, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 344
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 345
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 347
2,273, // ws*
127,196, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 348
127,53, // ws
128,187, // {9 " "}
129,87, // eol
130,288, // {10}
131,300, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 349
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 355
98,21, // "c"
  }
,
{ // state 356
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 358
94,44, // "n"
103,289, // "f"
  }
,
{ // state 359
MIN_REDUCTION+179, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[360][];
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
(119<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(122<<16)+1,
// digit ::= {"0".."9"}
(123<<16)+1,
// ws ::= {9 " "}
(127<<16)+1,
// ws ::= eol
(127<<16)+1,
// eol ::= {10}
(129<<16)+1,
// eol ::= {13} {10}
(129<<16)+2,
// eol ::= {13} !10
(129<<16)+1,
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
(211<<16)+2,
// token* ::= token
(211<<16)+1,
// digit++ ::= digit+ !digit
(121<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(212<<16)+1,
// digit+ ::= digit+ digit
(212<<16)+2,
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
128, // 9
130, // 10
-1, // 11
-1, // 12
131, // 13
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
128, // " "
110, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
112, // "%"
113, // "&"
-1, // "'"
115, // "("
116, // ")"
114, // "*"
117, // "+"
-1, // ","
118, // "-"
-1, // "."
-1, // "/"
120, // "0"
126, // "1"
126, // "2"
126, // "3"
126, // "4"
126, // "5"
126, // "6"
126, // "7"
126, // "8"
126, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
111, // "="
-1, // ">"
-1, // "?"
-1, // "@"
125, // "A"
125, // "B"
125, // "C"
125, // "D"
125, // "E"
125, // "F"
125, // "G"
125, // "H"
125, // "I"
125, // "J"
125, // "K"
125, // "L"
125, // "M"
125, // "N"
125, // "O"
125, // "P"
125, // "Q"
125, // "R"
125, // "S"
125, // "T"
125, // "U"
125, // "V"
125, // "W"
125, // "X"
125, // "Y"
125, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
124, // "_"
-1, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
125, // "g"
108, // "h"
104, // "i"
125, // "j"
97, // "k"
91, // "l"
125, // "m"
94, // "n"
90, // "o"
107, // "p"
125, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
125, // "y"
125, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
132, // 130
133, // 131
134, // 132
135, // 133
136, // 134
137, // 135
138, // 136
139, // 137
140, // 138
141, // 139
142, // 140
143, // 141
144, // 142
145, // 143
146, // 144
147, // 145
148, // 146
149, // 147
150, // 148
151, // 149
152, // 150
153, // 151
154, // 152
155, // 153
156, // 154
157, // 155
158, // 156
159, // 157
160, // 158
161, // 159
162, // 160
163, // 161
164, // 162
165, // 163
166, // 164
167, // 165
168, // 166
169, // 167
170, // 168
171, // 169
172, // 170
173, // 171
174, // 172
175, // 173
176, // 174
177, // 175
178, // 176
179, // 177
180, // 178
181, // 179
182, // 180
183, // 181
184, // 182
185, // 183
186, // 184
187, // 185
188, // 186
189, // 187
190, // 188
191, // 189
192, // 190
193, // 191
194, // 192
195, // 193
196, // 194
197, // 195
198, // 196
199, // 197
200, // 198
201, // 199
202, // 200
203, // 201
204, // 202
205, // 203
206, // 204
207, // 205
208, // 206
209, // 207
210, // 208
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
"`! ::= \"!\" ws*", // 127
"`! ::= \"!\" ws*", // 128
"`!= ::= \"!\" \"=\" ws*", // 129
"`!= ::= \"!\" \"=\" ws*", // 130
"`% ::= \"%\" ws*", // 131
"`% ::= \"%\" ws*", // 132
"`&& ::= \"&\" \"&\" ws*", // 133
"`&& ::= \"&\" \"&\" ws*", // 134
"`* ::= \"*\" ws*", // 135
"`* ::= \"*\" ws*", // 136
"`( ::= \"(\" ws*", // 137
"`( ::= \"(\" ws*", // 138
"`) ::= \")\" ws*", // 139
"`) ::= \")\" ws*", // 140
"`== ::= \"=\" \"=\" ws*", // 141
"`== ::= \"=\" \"=\" ws*", // 142
"`+ ::= \"+\" ws*", // 143
"`+ ::= \"+\" ws*", // 144
"`- ::= \"-\" ws*", // 145
"`- ::= \"-\" ws*", // 146
"INTLIT ::= # intLit2 ws*", // 147
"INTLIT ::= # intLit2 ws*", // 148
"intLit2 ::= !\"0\" digit++", // 149
"idChar ::= letter", // 150
"idChar ::= digit", // 151
"idChar ::= \"_\"", // 152
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 153
"digit ::= {\"0\"..\"9\"}", // 154
"ws ::= {9 \" \"}", // 155
"ws ::= eol", // 156
"eol ::= {10} registerNewline", // 157
"eol ::= {13} {10} registerNewline", // 158
"eol ::= {13} !10 registerNewline", // 159
"CHARLIT ::= {130}", // 160
"ID ::= {131}", // 161
"STRINGLIT ::= {132}", // 162
"`! ::= {133}", // 163
"`% ::= {134}", // 164
"`&& ::= {135}", // 165
"`( ::= {136}", // 166
"`) ::= {137}", // 167
"`+ ::= {138}", // 168
"`++ ::= {139}", // 169
"`, ::= {140}", // 170
"`- ::= {141}", // 171
"`-- ::= {142}", // 172
"`. ::= {143}", // 173
"`/ ::= {144}", // 174
"`; ::= {145}", // 175
"`< ::= {146}", // 176
"`<= ::= {147}", // 177
"`= ::= {148}", // 178
"`== ::= {149}", // 179
"`> ::= {150}", // 180
"`>= ::= {151}", // 181
"`[ ::= {152}", // 182
"`] ::= {153}", // 183
"`{ ::= {154}", // 184
"`|| ::= {155}", // 185
"`} ::= {156}", // 186
"`: ::= {157}", // 187
"`abstract ::= {158}", // 188
"`assert ::= {159}", // 189
"`boolean ::= {160}", // 190
"`break ::= {161}", // 191
"`byte ::= {162}", // 192
"`case ::= {163}", // 193
"`catch ::= {164}", // 194
"`char ::= {165}", // 195
"`const ::= {166}", // 196
"`continue ::= {167}", // 197
"`default ::= {168}", // 198
"`do ::= {169}", // 199
"`double ::= {170}", // 200
"`enum ::= {171}", // 201
"`extends ::= {172}", // 202
"`false ::= {173}", // 203
"`final ::= {174}", // 204
"`finally ::= {175}", // 205
"`float ::= {176}", // 206
"`for ::= {177}", // 207
"`goto ::= {178}", // 208
"`if ::= {179}", // 209
"`implements ::= {180}", // 210
"`import ::= {181}", // 211
"`instanceof ::= {182}", // 212
"`int ::= {183}", // 213
"`interface ::= {184}", // 214
"`long ::= {185}", // 215
"`native ::= {186}", // 216
"`new ::= {187}", // 217
"`null ::= {188}", // 218
"`package ::= {189}", // 219
"`private ::= {190}", // 220
"`protected ::= {191}", // 221
"`public ::= {192}", // 222
"`return ::= {193}", // 223
"`short ::= {194}", // 224
"`static ::= {195}", // 225
"`strictfp ::= {196}", // 226
"`super ::= {197}", // 227
"`switch ::= {198}", // 228
"`synchronized ::= {199}", // 229
"`this ::= {200}", // 230
"`throw ::= {201}", // 231
"`throws ::= {202}", // 232
"`transient ::= {203}", // 233
"`true ::= {204}", // 234
"`try ::= {205}", // 235
"`void ::= {206}", // 236
"`volatile ::= {207}", // 237
"`while ::= {208}", // 238
"token* ::= token* token", // 239
"token* ::= token* token", // 240
"digit++ ::= digit+ !digit", // 241
"ws* ::= ws* ws", // 242
"ws* ::= ws* ws", // 243
"digit+ ::= digit", // 244
"digit+ ::= digit+ digit", // 245
"", // 246
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
    { // 127: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `! ::= "!" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 130: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 131: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 143: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 148: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 149: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 150: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 151: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 152: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 153: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 154: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 155: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 157: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 161: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 162: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 163: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 231: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 240: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 241: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 242: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 243: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 244: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 245: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 246: $$0 ::= token* @pass
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
