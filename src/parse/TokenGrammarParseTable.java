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
public int getEofSym() { return 210; }
public int getNttSym() { return 211; }
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
"{\"A\"..\"Z\" \"g\"..\"h\" \"j\" \"m\" \"p\"..\"q\" \"v\" \"y\"..\"z\"}",
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
public int numSymbols() { return 212;}
private static final int MIN_REDUCTION = 314;
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
0x80000000|206, // match move
0x80000000|25, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 1
  }
,
{ // state 2
2,189, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 5
0x80000000|1, // match move
0x80000000|88, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 6
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 9
91,160, // "l"
100,299, // "x"
  }
,
{ // state 10
0x80000000|252, // match move
0x80000000|13, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 11
211,MIN_REDUCTION+138, // $NT
  }
,
{ // state 12
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 16
99,48, // "s"
  }
,
{ // state 17
-1, // $$start
-1, // start
187, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
163, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
174, // ws
165, // {9 " "}
77, // eol
255, // {10}
266, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
-1, // token*
10, // digit+
MIN_REDUCTION+116, // $
-1, // $NT
  }
,
{ // state 18
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 20
93,41, // "a"
  }
,
{ // state 21
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 23
99,49, // "s"
  }
,
{ // state 24
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 25
-1, // $$start
92, // start
33, // ws*
126, // $$0
104, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
224, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
174, // ws
165, // {9 " "}
77, // eol
255, // {10}
266, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
80, // token*
10, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 26
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 27
90,276, // "o"
  }
,
{ // state 28
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 29
-1, // $$start
-1, // start
26, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
163, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
174, // ws
165, // {9 " "}
77, // eol
255, // {10}
266, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
-1, // token*
10, // digit+
MIN_REDUCTION+128, // $
-1, // $NT
  }
,
{ // state 30
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 31
2,98, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 32
92,278, // "e"
  }
,
{ // state 33
0x80000000|111, // match move
0x80000000|257, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 34
117,291, // "0"
123,291, // {"1".."9"}
  }
,
{ // state 35
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 36
0x80000000|37, // match move
0x80000000|161, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 37
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 38
99,71, // "s"
101,158, // "t"
  }
,
{ // state 39
2,269, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 40
90,27, // "o"
96,32, // "r"
  }
,
{ // state 41
94,138, // "n"
  }
,
{ // state 42
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 45
127,264, // {10}
  }
,
{ // state 46
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 48
99,279, // "s"
  }
,
{ // state 49
92,106, // "e"
  }
,
{ // state 50
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 51
91,23, // "l"
  }
,
{ // state 52
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 55
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 56
2,275, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 65
102,83, // "d"
  }
,
{ // state 66
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 71
101,20, // "t"
  }
,
{ // state 72
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 75
2,6, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 79
2,234, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 80
0x80000000|123, // match move
0x80000000|173, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 81
110,267, // "&"
  }
,
{ // state 82
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 83
99,280, // "s"
  }
,
{ // state 84
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 86
2,55, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 87
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 88
2,300, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 92
210,MIN_REDUCTION+0, // $
  }
,
{ // state 93
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 98
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 106
0x80000000|1, // match move
0x80000000|39, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 107
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 111
3,202, // $$0
4,104, // token
5,204, // `boolean
6,298, // `class
7,207, // `extends
8,7, // `void
9,274, // `int
10,22, // `while
11,149, // `if
12,134, // `else
13,154, // `for
14,243, // `break
15,232, // `this
16,177, // `false
17,287, // `true
18,260, // `super
19,44, // `null
20,101, // `return
21,72, // `instanceof
22,242, // `new
23,43, // `abstract
24,125, // `assert
25,306, // `byte
26,168, // `case
27,307, // `catch
28,84, // `char
29,148, // `const
30,229, // `continue
31,212, // `default
32,99, // `do
33,164, // `double
34,63, // `enum
35,127, // `final
36,305, // `finally
37,109, // `float
38,192, // `goto
39,240, // `implements
40,58, // `import
41,294, // `interface
42,132, // `long
43,50, // `native
44,129, // `package
45,8, // `private
46,42, // `protected
47,24, // `public
48,281, // `short
49,200, // `static
50,82, // `strictfp
51,100, // `switch
52,89, // `synchronized
53,185, // `throw
54,59, // `throws
55,295, // `transient
56,21, // `try
57,270, // `volatile
58,68, // `!
59,108, // `!=
60,67, // `%
61,195, // `&&
62,140, // `*
63,238, // `(
64,289, // `)
65,62, // `{
66,182, // `}
67,93, // `-
68,18, // `+
69,220, // `=
70,237, // `==
71,176, // `[
72,61, // `]
73,74, // `||
74,145, // `<
75,130, // `<=
76,286, // `,
77,118, // `>
78,110, // `>=
79,150, // `.
80,194, // `;
81,169, // `++
82,262, // `--
83,233, // `/
84,304, // `:
85,290, // ID
86,107, // INTLIT
87,183, // STRINGLIT
88,151, // CHARLIT
124,47, // ws
126,77, // eol
208,80, // token*
  }
,
{ // state 112
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|31, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 116
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 117
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 121
91,153, // "l"
  }
,
{ // state 122
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 123
4,297, // token
5,204, // `boolean
6,298, // `class
7,207, // `extends
8,7, // `void
9,274, // `int
10,22, // `while
11,149, // `if
12,134, // `else
13,154, // `for
14,243, // `break
15,232, // `this
16,177, // `false
17,287, // `true
18,260, // `super
19,44, // `null
20,101, // `return
21,72, // `instanceof
22,242, // `new
23,43, // `abstract
24,125, // `assert
25,306, // `byte
26,168, // `case
27,307, // `catch
28,84, // `char
29,148, // `const
30,229, // `continue
31,212, // `default
32,99, // `do
33,164, // `double
34,63, // `enum
35,127, // `final
36,305, // `finally
37,109, // `float
38,192, // `goto
39,240, // `implements
40,58, // `import
41,294, // `interface
42,132, // `long
43,50, // `native
44,129, // `package
45,8, // `private
46,42, // `protected
47,24, // `public
48,281, // `short
49,200, // `static
50,82, // `strictfp
51,100, // `switch
52,89, // `synchronized
53,185, // `throw
54,59, // `throws
55,295, // `transient
56,21, // `try
57,270, // `volatile
58,68, // `!
59,108, // `!=
60,67, // `%
61,195, // `&&
62,140, // `*
63,238, // `(
64,289, // `)
65,62, // `{
66,182, // `}
67,93, // `-
68,18, // `+
69,220, // `=
70,237, // `==
71,176, // `[
72,61, // `]
73,74, // `||
74,145, // `<
75,130, // `<=
76,286, // `,
77,118, // `>
78,110, // `>=
79,150, // `.
80,194, // `;
81,169, // `++
82,262, // `--
83,233, // `/
84,304, // `:
85,290, // ID
86,107, // INTLIT
87,183, // STRINGLIT
88,151, // CHARLIT
  }
,
{ // state 124
0x80000000|152, // match move
0x80000000|172, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 125
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 128
90,190, // "o"
  }
,
{ // state 129
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 131
2,26, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 136
2,201, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 137
211,MIN_REDUCTION+139, // $NT
  }
,
{ // state 138
98,156, // "c"
  }
,
{ // state 139
2,272, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 144
96,5, // "r"
  }
,
{ // state 145
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 152
2,226, // ws*
124,174, // ws
126,77, // eol
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 153
93,16, // "a"
  }
,
{ // state 154
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 155
105,209, // "w"
  }
,
{ // state 156
92,128, // "e"
  }
,
{ // state 157
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 158
0x80000000|1, // match move
0x80000000|236, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 159
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 160
99,186, // "s"
  }
,
{ // state 161
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 162
2,263, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 163
0x80000000|208, // match move
0x80000000|29, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 164
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 172
-1, // $$start
-1, // start
226, // ws*
-1, // $$0
MIN_REDUCTION+114, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
251, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
174, // ws
165, // {9 " "}
77, // eol
255, // {10}
266, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
-1, // token*
10, // digit+
MIN_REDUCTION+114, // $
-1, // $NT
  }
,
{ // state 173
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
297, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
224, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
-1, // token*
10, // digit+
MIN_REDUCTION+232, // $
-1, // $NT
  }
,
{ // state 174
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 181
2,117, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 184
89,137, // "b"
90,137, // "o"
91,137, // "l"
92,137, // "e"
93,137, // "a"
94,137, // "n"
96,137, // "r"
97,137, // "k"
98,137, // "c"
99,137, // "s"
100,137, // "x"
101,137, // "t"
102,137, // "d"
103,137, // "f"
104,137, // "i"
105,137, // "w"
106,137, // "u"
117,291, // "0"
119,213, // letter
120,258, // digit
121,11, // "_"
122,137, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
123,291, // {"1".."9"}
  }
,
{ // state 185
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 186
92,87, // "e"
  }
,
{ // state 187
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 189
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 190
103,85, // "f"
  }
,
{ // state 191
2,228, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 197
92,155, // "e"
106,230, // "u"
  }
,
{ // state 198
0x80000000|114, // match move
0x80000000|146, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 199
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 201
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 202
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 203
2,301, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 205
94,254, // "n"
  }
,
{ // state 206
1,92, // start
2,33, // ws*
3,126, // $$0
4,104, // token
5,204, // `boolean
6,298, // `class
7,207, // `extends
8,7, // `void
9,274, // `int
10,22, // `while
11,149, // `if
12,134, // `else
13,154, // `for
14,243, // `break
15,232, // `this
16,177, // `false
17,287, // `true
18,260, // `super
19,44, // `null
20,101, // `return
21,72, // `instanceof
22,242, // `new
23,43, // `abstract
24,125, // `assert
25,306, // `byte
26,168, // `case
27,307, // `catch
28,84, // `char
29,148, // `const
30,229, // `continue
31,212, // `default
32,99, // `do
33,164, // `double
34,63, // `enum
35,127, // `final
36,305, // `finally
37,109, // `float
38,192, // `goto
39,240, // `implements
40,58, // `import
41,294, // `interface
42,132, // `long
43,50, // `native
44,129, // `package
45,8, // `private
46,42, // `protected
47,24, // `public
48,281, // `short
49,200, // `static
50,82, // `strictfp
51,100, // `switch
52,89, // `synchronized
53,185, // `throw
54,59, // `throws
55,295, // `transient
56,21, // `try
57,270, // `volatile
58,68, // `!
59,108, // `!=
60,67, // `%
61,195, // `&&
62,140, // `*
63,238, // `(
64,289, // `)
65,62, // `{
66,182, // `}
67,93, // `-
68,18, // `+
69,220, // `=
70,237, // `==
71,176, // `[
72,61, // `]
73,74, // `||
74,145, // `<
75,130, // `<=
76,286, // `,
77,118, // `>
78,110, // `>=
79,150, // `.
80,194, // `;
81,169, // `++
82,262, // `--
83,233, // `/
84,304, // `:
85,290, // ID
86,107, // INTLIT
87,183, // STRINGLIT
88,151, // CHARLIT
124,174, // ws
126,77, // eol
208,80, // token*
  }
,
{ // state 207
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 208
2,26, // ws*
124,174, // ws
126,77, // eol
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 209
0x80000000|1, // match move
0x80000000|56, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|136, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 211
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 213
211,MIN_REDUCTION+136, // $NT
  }
,
{ // state 214
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 216
2,239, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 217
2,52, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 218
2,157, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 222
2,292, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 224
108,131, // "="
  }
,
{ // state 225
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 226
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 228
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 230
91,265, // "l"
  }
,
{ // state 231
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 234
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 236
2,247, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 239
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 245
90,144, // "o"
93,51, // "a"
  }
,
{ // state 246
92,271, // "e"
  }
,
{ // state 247
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 248
0x80000000|215, // match move
0x80000000|235, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 249
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 251
0x80000000|284, // match move
0x80000000|17, // no-match move
// T-test match for "0":
117,
  }
,
{ // state 252
117,198, // "0"
120,248, // digit
123,198, // {"1".."9"}
  }
,
{ // state 253
92,273, // "e"
  }
,
{ // state 254
0x80000000|1, // match move
0x80000000|191, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 255
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 257
-1, // $$start
-1, // start
-1, // ws*
202, // $$0
104, // token
204, // `boolean
298, // `class
207, // `extends
7, // `void
274, // `int
22, // `while
149, // `if
134, // `else
154, // `for
243, // `break
232, // `this
177, // `false
287, // `true
260, // `super
44, // `null
101, // `return
72, // `instanceof
242, // `new
43, // `abstract
125, // `assert
306, // `byte
168, // `case
307, // `catch
84, // `char
148, // `const
229, // `continue
212, // `default
99, // `do
164, // `double
63, // `enum
127, // `final
305, // `finally
109, // `float
192, // `goto
240, // `implements
58, // `import
294, // `interface
132, // `long
50, // `native
129, // `package
8, // `private
42, // `protected
24, // `public
281, // `short
200, // `static
82, // `strictfp
100, // `switch
89, // `synchronized
185, // `throw
59, // `throws
295, // `transient
21, // `try
270, // `volatile
68, // `!
108, // `!=
67, // `%
195, // `&&
140, // `*
238, // `(
289, // `)
62, // `{
182, // `}
93, // `-
18, // `+
220, // `=
237, // `==
176, // `[
61, // `]
74, // `||
145, // `<
130, // `<=
286, // `,
118, // `>
110, // `>=
150, // `.
194, // `;
169, // `++
262, // `--
233, // `/
304, // `:
290, // ID
107, // INTLIT
183, // STRINGLIT
151, // CHARLIT
40, // "b"
-1, // "o"
-1, // "l"
9, // "e"
-1, // "a"
197, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
121, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
245, // "f"
311, // "i"
-1, // "w"
-1, // "u"
124, // "!"
224, // "="
79, // "%"
81, // "&"
181, // "*"
139, // "("
216, // ")"
218, // "+"
86, // "-"
75, // intLit2
198, // "0"
250, // digit++
-1, // letter
36, // digit
-1, // "_"
-1, // {"A".."Z" "g".."h" "j" "m" "p".."q" "v" "y".."z"}
198, // {"1".."9"}
47, // ws
165, // {9 " "}
77, // eol
255, // {10}
266, // {13}
141, // {130}
70, // {131}
46, // {132}
171, // {133}
143, // {134}
259, // {135}
54, // {136}
35, // {137}
219, // {138}
308, // {139}
180, // {140}
119, // {141}
122, // {142}
244, // {143}
133, // {144}
166, // {145}
282, // {146}
57, // {147}
90, // {148}
312, // {149}
102, // {150}
211, // {151}
277, // {152}
159, // {153}
288, // {154}
241, // {155}
225, // {156}
179, // {157}
76, // {158}
112, // {159}
303, // {160}
94, // {161}
296, // {162}
116, // {163}
97, // {164}
249, // {165}
91, // {166}
12, // {167}
66, // {168}
196, // {169}
135, // {170}
4, // {171}
19, // {172}
285, // {173}
223, // {174}
170, // {175}
103, // {176}
30, // {177}
188, // {178}
105, // {179}
78, // {180}
73, // {181}
69, // {182}
15, // {183}
231, // {184}
310, // {185}
14, // {186}
167, // {187}
53, // {188}
95, // {189}
178, // {190}
309, // {191}
175, // {192}
113, // {193}
28, // {194}
214, // {195}
120, // {196}
261, // {197}
268, // {198}
3, // {199}
60, // {200}
96, // {201}
302, // {202}
227, // {203}
221, // {204}
147, // {205}
199, // {206}
64, // {207}
193, // {208}
80, // token*
10, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 258
211,MIN_REDUCTION+137, // $NT
  }
,
{ // state 259
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 261
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 262
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 263
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 265
91,210, // "l"
  }
,
{ // state 266
0x80000000|45, // match move
0x80000000|142, // no-match move
// T-test match for 10:
127,
  }
,
{ // state 267
2,283, // ws*
124,174, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 269
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 270
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 271
94,65, // "n"
  }
,
{ // state 272
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 273
93,205, // "a"
  }
,
{ // state 274
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 275
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 276
91,253, // "l"
  }
,
{ // state 277
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 278
93,293, // "a"
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 280
0x80000000|1, // match move
0x80000000|217, // no-match move
0x80000000|184, // NT-test-match state for idChar
  }
,
{ // state 281
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 283
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 284
2,187, // ws*
124,174, // ws
126,77, // eol
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 285
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 291
211,MIN_REDUCTION+140, // $NT
  }
,
{ // state 292
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 293
97,115, // "k"
  }
,
{ // state 294
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 299
101,246, // "t"
  }
,
{ // state 300
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 301
124,47, // ws
125,165, // {9 " "}
126,77, // eol
127,255, // {10}
128,266, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 311
94,38, // "n"
103,256, // "f"
  }
,
{ // state 312
MIN_REDUCTION+165, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[313][];
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
(116<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(119<<16)+1,
// digit ::= {"0".."9"}
(120<<16)+1,
// ws ::= {9 " "}
(124<<16)+1,
// ws ::= eol
(124<<16)+1,
// eol ::= {10}
(126<<16)+1,
// eol ::= {13} {10}
(126<<16)+2,
// eol ::= {13} !10
(126<<16)+1,
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
(208<<16)+2,
// token* ::= token
(208<<16)+1,
// digit++ ::= digit+ !digit
(118<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(209<<16)+1,
// digit+ ::= digit+ digit
(209<<16)+2,
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
125, // 9
127, // 10
-1, // 11
-1, // 12
128, // 13
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
125, // " "
107, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
109, // "%"
110, // "&"
-1, // "'"
112, // "("
113, // ")"
111, // "*"
114, // "+"
-1, // ","
115, // "-"
-1, // "."
-1, // "/"
117, // "0"
123, // "1"
123, // "2"
123, // "3"
123, // "4"
123, // "5"
123, // "6"
123, // "7"
123, // "8"
123, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
108, // "="
-1, // ">"
-1, // "?"
-1, // "@"
122, // "A"
122, // "B"
122, // "C"
122, // "D"
122, // "E"
122, // "F"
122, // "G"
122, // "H"
122, // "I"
122, // "J"
122, // "K"
122, // "L"
122, // "M"
122, // "N"
122, // "O"
122, // "P"
122, // "Q"
122, // "R"
122, // "S"
122, // "T"
122, // "U"
122, // "V"
122, // "W"
122, // "X"
122, // "Y"
122, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
121, // "_"
-1, // "`"
93, // "a"
89, // "b"
98, // "c"
102, // "d"
92, // "e"
103, // "f"
122, // "g"
122, // "h"
104, // "i"
122, // "j"
97, // "k"
91, // "l"
122, // "m"
94, // "n"
90, // "o"
122, // "p"
122, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
122, // "v"
105, // "w"
100, // "x"
122, // "y"
122, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
129, // 130
130, // 131
131, // 132
132, // 133
133, // 134
134, // 135
135, // 136
136, // 137
137, // 138
138, // 139
139, // 140
140, // 141
141, // 142
142, // 143
143, // 144
144, // 145
145, // 146
146, // 147
147, // 148
148, // 149
149, // 150
150, // 151
151, // 152
152, // 153
153, // 154
154, // 155
155, // 156
156, // 157
157, // 158
158, // 159
159, // 160
160, // 161
161, // 162
162, // 163
163, // 164
164, // 165
165, // 166
166, // 167
167, // 168
168, // 169
169, // 170
170, // 171
171, // 172
172, // 173
173, // 174
174, // 175
175, // 176
176, // 177
177, // 178
178, // 179
179, // 180
180, // 181
181, // 182
182, // 183
183, // 184
184, // 185
185, // 186
186, // 187
187, // 188
188, // 189
189, // 190
190, // 191
191, // 192
192, // 193
193, // 194
194, // 195
195, // 196
196, // 197
197, // 198
198, // 199
199, // 200
200, // 201
201, // 202
202, // 203
203, // 204
204, // 205
205, // 206
206, // 207
207, // 208
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
"`! ::= \"!\" ws*", // 113
"`! ::= \"!\" ws*", // 114
"`!= ::= \"!\" \"=\" ws*", // 115
"`!= ::= \"!\" \"=\" ws*", // 116
"`% ::= \"%\" ws*", // 117
"`% ::= \"%\" ws*", // 118
"`&& ::= \"&\" \"&\" ws*", // 119
"`&& ::= \"&\" \"&\" ws*", // 120
"`* ::= \"*\" ws*", // 121
"`* ::= \"*\" ws*", // 122
"`( ::= \"(\" ws*", // 123
"`( ::= \"(\" ws*", // 124
"`) ::= \")\" ws*", // 125
"`) ::= \")\" ws*", // 126
"`== ::= \"=\" \"=\" ws*", // 127
"`== ::= \"=\" \"=\" ws*", // 128
"`+ ::= \"+\" ws*", // 129
"`+ ::= \"+\" ws*", // 130
"`- ::= \"-\" ws*", // 131
"`- ::= \"-\" ws*", // 132
"INTLIT ::= # intLit2 ws*", // 133
"INTLIT ::= # intLit2 ws*", // 134
"intLit2 ::= !\"0\" digit++", // 135
"idChar ::= letter", // 136
"idChar ::= digit", // 137
"idChar ::= \"_\"", // 138
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 139
"digit ::= {\"0\"..\"9\"}", // 140
"ws ::= {9 \" \"}", // 141
"ws ::= eol", // 142
"eol ::= {10} registerNewline", // 143
"eol ::= {13} {10} registerNewline", // 144
"eol ::= {13} !10 registerNewline", // 145
"CHARLIT ::= {130}", // 146
"ID ::= {131}", // 147
"STRINGLIT ::= {132}", // 148
"`! ::= {133}", // 149
"`% ::= {134}", // 150
"`&& ::= {135}", // 151
"`( ::= {136}", // 152
"`) ::= {137}", // 153
"`+ ::= {138}", // 154
"`++ ::= {139}", // 155
"`, ::= {140}", // 156
"`- ::= {141}", // 157
"`-- ::= {142}", // 158
"`. ::= {143}", // 159
"`/ ::= {144}", // 160
"`; ::= {145}", // 161
"`< ::= {146}", // 162
"`<= ::= {147}", // 163
"`= ::= {148}", // 164
"`== ::= {149}", // 165
"`> ::= {150}", // 166
"`>= ::= {151}", // 167
"`[ ::= {152}", // 168
"`] ::= {153}", // 169
"`{ ::= {154}", // 170
"`|| ::= {155}", // 171
"`} ::= {156}", // 172
"`: ::= {157}", // 173
"`abstract ::= {158}", // 174
"`assert ::= {159}", // 175
"`boolean ::= {160}", // 176
"`break ::= {161}", // 177
"`byte ::= {162}", // 178
"`case ::= {163}", // 179
"`catch ::= {164}", // 180
"`char ::= {165}", // 181
"`const ::= {166}", // 182
"`continue ::= {167}", // 183
"`default ::= {168}", // 184
"`do ::= {169}", // 185
"`double ::= {170}", // 186
"`enum ::= {171}", // 187
"`extends ::= {172}", // 188
"`false ::= {173}", // 189
"`final ::= {174}", // 190
"`finally ::= {175}", // 191
"`float ::= {176}", // 192
"`for ::= {177}", // 193
"`goto ::= {178}", // 194
"`if ::= {179}", // 195
"`implements ::= {180}", // 196
"`import ::= {181}", // 197
"`instanceof ::= {182}", // 198
"`int ::= {183}", // 199
"`interface ::= {184}", // 200
"`long ::= {185}", // 201
"`native ::= {186}", // 202
"`new ::= {187}", // 203
"`null ::= {188}", // 204
"`package ::= {189}", // 205
"`private ::= {190}", // 206
"`protected ::= {191}", // 207
"`public ::= {192}", // 208
"`return ::= {193}", // 209
"`short ::= {194}", // 210
"`static ::= {195}", // 211
"`strictfp ::= {196}", // 212
"`super ::= {197}", // 213
"`switch ::= {198}", // 214
"`synchronized ::= {199}", // 215
"`this ::= {200}", // 216
"`throw ::= {201}", // 217
"`throws ::= {202}", // 218
"`transient ::= {203}", // 219
"`true ::= {204}", // 220
"`try ::= {205}", // 221
"`void ::= {206}", // 222
"`volatile ::= {207}", // 223
"`while ::= {208}", // 224
"token* ::= token* token", // 225
"token* ::= token* token", // 226
"digit++ ::= digit+ !digit", // 227
"ws* ::= ws* ws", // 228
"ws* ::= ws* ws", // 229
"digit+ ::= digit", // 230
"digit+ ::= digit+ digit", // 231
"", // 232
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
    { // 113: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `! ::= "!" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 116: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 117: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 121: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 128: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 129: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 134: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 135: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 136: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 138: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 139: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 140: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 143: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 147: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 148: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 149: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 227: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 230: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 231: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 232: $$0 ::= token* @pass
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
