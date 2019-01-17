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
public int getEofSym() { return 198; }
public int getNttSym() { return 199; }
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
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"\"e\"",
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
"{\"A\"..\"Z\" \"b\" \"d\" \"f\"..\"k\" \"m\"..\"r\" \"t\"..\"z\"}",
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
public int numSymbols() { return 200;}
private static final int MIN_REDUCTION = 252;
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
0x80000000|169, // match move
0x80000000|21, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 1
2,158, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 5
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 8
0x80000000|207, // match move
0x80000000|11, // no-match move
0x80000000|27, // NT-test-match state for digit
  }
,
{ // state 9
199,MIN_REDUCTION+118, // $NT
  }
,
{ // state 10
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 14
92,37, // "s"
  }
,
{ // state 15
-1, // $$start
-1, // start
156, // ws*
-1, // $$0
MIN_REDUCTION+96, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
132, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
143, // ws
134, // {9 " "}
60, // eol
208, // {10}
216, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+96, // $
-1, // $NT
  }
,
{ // state 16
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 21
-1, // $$start
72, // start
26, // ws*
103, // $$0
83, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
184, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
143, // ws
134, // {9 " "}
60, // eol
208, // {10}
216, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
65, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 22
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 23
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 24
-1, // $$start
-1, // start
22, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
132, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
143, // ws
134, // {9 " "}
60, // eol
208, // {10}
216, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 25
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 26
0x80000000|89, // match move
0x80000000|209, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 27
105,234, // "0"
111,234, // {"1".."9"}
  }
,
{ // state 28
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 29
0x80000000|30, // match move
0x80000000|130, // no-match move
0x80000000|27, // NT-test-match state for digit
  }
,
{ // state 30
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 34
115,215, // {10}
  }
,
{ // state 35
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 37
92,223, // "s"
  }
,
{ // state 38
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 41
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 58
2,5, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 62
2,192, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 64
98,217, // "&"
  }
,
{ // state 65
0x80000000|100, // match move
0x80000000|142, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 66
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 67
2,41, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 68
0x80000000|2, // match move
0x80000000|1, // no-match move
0x80000000|153, // NT-test-match state for idChar
  }
,
{ // state 69
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 72
198,MIN_REDUCTION+0, // $
  }
,
{ // state 73
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 89
3,167, // $$0
4,83, // token
5,168, // `boolean
6,240, // `class
7,170, // `extends
8,6, // `void
9,221, // `int
10,19, // `while
11,122, // `if
12,110, // `else
13,127, // `for
14,199, // `break
15,190, // `this
16,146, // `false
17,230, // `true
18,212, // `super
19,33, // `null
20,80, // `return
21,55, // `instanceof
22,200, // `new
23,32, // `abstract
24,102, // `assert
25,245, // `byte
26,137, // `case
27,246, // `catch
28,66, // `char
29,121, // `const
30,188, // `continue
31,173, // `default
32,78, // `do
33,133, // `double
34,48, // `enum
35,104, // `final
36,244, // `finally
37,86, // `float
38,159, // `goto
39,197, // `implements
40,43, // `import
41,236, // `interface
42,108, // `long
43,38, // `native
44,105, // `package
45,7, // `private
46,31, // `protected
47,20, // `public
48,224, // `short
49,166, // `static
50,63, // `strictfp
51,79, // `switch
52,69, // `synchronized
53,154, // `throw
54,45, // `throws
55,237, // `transient
56,18, // `try
57,219, // `volatile
58,52, // `!
59,87, // `!=
60,51, // `%
61,163, // `&&
62,114, // `*
63,195, // `(
64,232, // `)
65,47, // `{
66,150, // `}
67,73, // `-
68,16, // `+
69,180, // `=
70,194, // `==
71,145, // `[
72,46, // `]
73,57, // `||
74,118, // `<
75,106, // `<=
76,229, // `,
77,95, // `>
78,88, // `>=
79,123, // `.
80,162, // `;
81,138, // `++
82,214, // `--
83,191, // `/
84,243, // `:
85,233, // ID
86,85, // INTLIT
87,152, // STRINGLIT
88,124, // CHARLIT
112,36, // ws
114,60, // eol
196,65, // token*
  }
,
{ // state 90
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 94
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 97
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 98
90,126, // "l"
  }
,
{ // state 99
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 100
4,239, // token
5,168, // `boolean
6,240, // `class
7,170, // `extends
8,6, // `void
9,221, // `int
10,19, // `while
11,122, // `if
12,110, // `else
13,127, // `for
14,199, // `break
15,190, // `this
16,146, // `false
17,230, // `true
18,212, // `super
19,33, // `null
20,80, // `return
21,55, // `instanceof
22,200, // `new
23,32, // `abstract
24,102, // `assert
25,245, // `byte
26,137, // `case
27,246, // `catch
28,66, // `char
29,121, // `const
30,188, // `continue
31,173, // `default
32,78, // `do
33,133, // `double
34,48, // `enum
35,104, // `final
36,244, // `finally
37,86, // `float
38,159, // `goto
39,197, // `implements
40,43, // `import
41,236, // `interface
42,108, // `long
43,38, // `native
44,105, // `package
45,7, // `private
46,31, // `protected
47,20, // `public
48,224, // `short
49,166, // `static
50,63, // `strictfp
51,79, // `switch
52,69, // `synchronized
53,154, // `throw
54,45, // `throws
55,237, // `transient
56,18, // `try
57,219, // `volatile
58,52, // `!
59,87, // `!=
60,51, // `%
61,163, // `&&
62,114, // `*
63,195, // `(
64,232, // `)
65,47, // `{
66,150, // `}
67,73, // `-
68,16, // `+
69,180, // `=
70,194, // `==
71,145, // `[
72,46, // `]
73,57, // `||
74,118, // `<
75,106, // `<=
76,229, // `,
77,95, // `>
78,88, // `>=
79,123, // `.
80,162, // `;
81,138, // `++
82,214, // `--
83,191, // `/
84,243, // `:
85,233, // ID
86,85, // INTLIT
87,152, // STRINGLIT
88,124, // CHARLIT
  }
,
{ // state 101
0x80000000|125, // match move
0x80000000|141, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 102
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 107
2,22, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 112
199,MIN_REDUCTION+119, // $NT
  }
,
{ // state 113
2,220, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 125
2,186, // ws*
112,143, // ws
114,60, // eol
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 126
91,14, // "a"
  }
,
{ // state 127
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 128
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 130
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 131
92,155, // "s"
  }
,
{ // state 132
0x80000000|171, // match move
0x80000000|24, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 133
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 141
-1, // $$start
-1, // start
186, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
206, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
143, // ws
134, // {9 " "}
60, // eol
208, // {10}
216, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+94, // $
-1, // $NT
  }
,
{ // state 142
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
239, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
184, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+212, // $
-1, // $NT
  }
,
{ // state 143
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 151
2,94, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 153
89,112, // "c"
90,112, // "l"
91,112, // "a"
92,112, // "s"
94,112, // "e"
105,234, // "0"
107,174, // letter
108,210, // digit
109,9, // "_"
110,112, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
111,234, // {"1".."9"}
  }
,
{ // state 154
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 155
94,68, // "e"
  }
,
{ // state 156
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 158
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 164
0x80000000|92, // match move
0x80000000|119, // no-match move
0x80000000|27, // NT-test-match state for digit
  }
,
{ // state 165
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 169
1,72, // start
2,26, // ws*
3,103, // $$0
4,83, // token
5,168, // `boolean
6,240, // `class
7,170, // `extends
8,6, // `void
9,221, // `int
10,19, // `while
11,122, // `if
12,110, // `else
13,127, // `for
14,199, // `break
15,190, // `this
16,146, // `false
17,230, // `true
18,212, // `super
19,33, // `null
20,80, // `return
21,55, // `instanceof
22,200, // `new
23,32, // `abstract
24,102, // `assert
25,245, // `byte
26,137, // `case
27,246, // `catch
28,66, // `char
29,121, // `const
30,188, // `continue
31,173, // `default
32,78, // `do
33,133, // `double
34,48, // `enum
35,104, // `final
36,244, // `finally
37,86, // `float
38,159, // `goto
39,197, // `implements
40,43, // `import
41,236, // `interface
42,108, // `long
43,38, // `native
44,105, // `package
45,7, // `private
46,31, // `protected
47,20, // `public
48,224, // `short
49,166, // `static
50,63, // `strictfp
51,79, // `switch
52,69, // `synchronized
53,154, // `throw
54,45, // `throws
55,237, // `transient
56,18, // `try
57,219, // `volatile
58,52, // `!
59,87, // `!=
60,51, // `%
61,163, // `&&
62,114, // `*
63,195, // `(
64,232, // `)
65,47, // `{
66,150, // `}
67,73, // `-
68,16, // `+
69,180, // `=
70,194, // `==
71,145, // `[
72,46, // `]
73,57, // `||
74,118, // `<
75,106, // `<=
76,229, // `,
77,95, // `>
78,88, // `>=
79,123, // `.
80,162, // `;
81,138, // `++
82,214, // `--
83,191, // `/
84,243, // `:
85,233, // ID
86,85, // INTLIT
87,152, // STRINGLIT
88,124, // CHARLIT
112,143, // ws
114,60, // eol
196,65, // token*
  }
,
{ // state 170
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 171
2,22, // ws*
112,143, // ws
114,60, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 174
199,MIN_REDUCTION+116, // $NT
  }
,
{ // state 175
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 177
2,196, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 178
2,128, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 182
2,235, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 184
96,107, // "="
  }
,
{ // state 185
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 186
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 192
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 196
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 202
90,131, // "l"
  }
,
{ // state 203
0x80000000|176, // match move
0x80000000|193, // no-match move
0x80000000|27, // NT-test-match state for digit
  }
,
{ // state 204
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 206
0x80000000|227, // match move
0x80000000|15, // no-match move
// T-test match for "0":
105,
  }
,
{ // state 207
105,164, // "0"
108,203, // digit
111,164, // {"1".."9"}
  }
,
{ // state 208
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 209
-1, // $$start
-1, // start
-1, // ws*
167, // $$0
83, // token
168, // `boolean
240, // `class
170, // `extends
6, // `void
221, // `int
19, // `while
122, // `if
110, // `else
127, // `for
199, // `break
190, // `this
146, // `false
230, // `true
212, // `super
33, // `null
80, // `return
55, // `instanceof
200, // `new
32, // `abstract
102, // `assert
245, // `byte
137, // `case
246, // `catch
66, // `char
121, // `const
188, // `continue
173, // `default
78, // `do
133, // `double
48, // `enum
104, // `final
244, // `finally
86, // `float
159, // `goto
197, // `implements
43, // `import
236, // `interface
108, // `long
38, // `native
105, // `package
7, // `private
31, // `protected
20, // `public
224, // `short
166, // `static
63, // `strictfp
79, // `switch
69, // `synchronized
154, // `throw
45, // `throws
237, // `transient
18, // `try
219, // `volatile
52, // `!
87, // `!=
51, // `%
163, // `&&
114, // `*
195, // `(
232, // `)
47, // `{
150, // `}
73, // `-
16, // `+
180, // `=
194, // `==
145, // `[
46, // `]
57, // `||
118, // `<
106, // `<=
229, // `,
95, // `>
88, // `>=
123, // `.
162, // `;
138, // `++
214, // `--
191, // `/
243, // `:
233, // ID
85, // INTLIT
152, // STRINGLIT
124, // CHARLIT
98, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
202, // "e"
101, // "!"
184, // "="
62, // "%"
64, // "&"
151, // "*"
113, // "("
177, // ")"
178, // "+"
67, // "-"
58, // intLit2
164, // "0"
205, // digit++
-1, // letter
29, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
164, // {"1".."9"}
36, // ws
134, // {9 " "}
60, // eol
208, // {10}
216, // {13}
115, // {130}
54, // {131}
35, // {132}
140, // {133}
117, // {134}
211, // {135}
39, // {136}
28, // {137}
179, // {138}
247, // {139}
149, // {140}
96, // {141}
99, // {142}
201, // {143}
109, // {144}
135, // {145}
225, // {146}
42, // {147}
70, // {148}
250, // {149}
81, // {150}
172, // {151}
222, // {152}
129, // {153}
231, // {154}
198, // {155}
185, // {156}
148, // {157}
59, // {158}
90, // {159}
242, // {160}
74, // {161}
238, // {162}
93, // {163}
77, // {164}
204, // {165}
71, // {166}
10, // {167}
50, // {168}
161, // {169}
111, // {170}
4, // {171}
17, // {172}
228, // {173}
183, // {174}
139, // {175}
82, // {176}
25, // {177}
157, // {178}
84, // {179}
61, // {180}
56, // {181}
53, // {182}
12, // {183}
189, // {184}
248, // {185}
13, // {186}
136, // {187}
40, // {188}
75, // {189}
147, // {190}
249, // {191}
144, // {192}
91, // {193}
23, // {194}
175, // {195}
97, // {196}
213, // {197}
218, // {198}
3, // {199}
44, // {200}
76, // {201}
241, // {202}
187, // {203}
181, // {204}
120, // {205}
165, // {206}
49, // {207}
160, // {208}
65, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 210
199,MIN_REDUCTION+117, // $NT
  }
,
{ // state 211
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 216
0x80000000|34, // match move
0x80000000|116, // no-match move
// T-test match for 10:
115,
  }
,
{ // state 217
2,226, // ws*
112,143, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 220
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 223
0x80000000|2, // match move
0x80000000|182, // no-match move
0x80000000|153, // NT-test-match state for idChar
  }
,
{ // state 224
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 226
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 227
2,156, // ws*
112,143, // ws
114,60, // eol
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 232
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 234
199,MIN_REDUCTION+120, // $NT
  }
,
{ // state 235
112,36, // ws
113,134, // {9 " "}
114,60, // eol
115,208, // {10}
116,216, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 236
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 240
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 243
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+145, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[251][];
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
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
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
(104<<16)+1,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(107<<16)+1,
// digit ::= {"0".."9"}
(108<<16)+1,
// ws ::= {9 " "}
(112<<16)+1,
// ws ::= eol
(112<<16)+1,
// eol ::= {10}
(114<<16)+1,
// eol ::= {13} {10}
(114<<16)+2,
// eol ::= {13} !10
(114<<16)+1,
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
(196<<16)+2,
// token* ::= token
(196<<16)+1,
// digit++ ::= digit+ !digit
(106<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(197<<16)+1,
// digit+ ::= digit+ digit
(197<<16)+2,
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
113, // 9
115, // 10
-1, // 11
-1, // 12
116, // 13
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
113, // " "
95, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
97, // "%"
98, // "&"
-1, // "'"
100, // "("
101, // ")"
99, // "*"
102, // "+"
-1, // ","
103, // "-"
-1, // "."
-1, // "/"
105, // "0"
111, // "1"
111, // "2"
111, // "3"
111, // "4"
111, // "5"
111, // "6"
111, // "7"
111, // "8"
111, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
96, // "="
-1, // ">"
-1, // "?"
-1, // "@"
110, // "A"
110, // "B"
110, // "C"
110, // "D"
110, // "E"
110, // "F"
110, // "G"
110, // "H"
110, // "I"
110, // "J"
110, // "K"
110, // "L"
110, // "M"
110, // "N"
110, // "O"
110, // "P"
110, // "Q"
110, // "R"
110, // "S"
110, // "T"
110, // "U"
110, // "V"
110, // "W"
110, // "X"
110, // "Y"
110, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
109, // "_"
-1, // "`"
91, // "a"
110, // "b"
89, // "c"
110, // "d"
94, // "e"
110, // "f"
110, // "g"
110, // "h"
110, // "i"
110, // "j"
110, // "k"
90, // "l"
110, // "m"
110, // "n"
110, // "o"
110, // "p"
110, // "q"
110, // "r"
92, // "s"
110, // "t"
110, // "u"
110, // "v"
110, // "w"
110, // "x"
110, // "y"
110, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
117, // 130
118, // 131
119, // 132
120, // 133
121, // 134
122, // 135
123, // 136
124, // 137
125, // 138
126, // 139
127, // 140
128, // 141
129, // 142
130, // 143
131, // 144
132, // 145
133, // 146
134, // 147
135, // 148
136, // 149
137, // 150
138, // 151
139, // 152
140, // 153
141, // 154
142, // 155
143, // 156
144, // 157
145, // 158
146, // 159
147, // 160
148, // 161
149, // 162
150, // 163
151, // 164
152, // 165
153, // 166
154, // 167
155, // 168
156, // 169
157, // 170
158, // 171
159, // 172
160, // 173
161, // 174
162, // 175
163, // 176
164, // 177
165, // 178
166, // 179
167, // 180
168, // 181
169, // 182
170, // 183
171, // 184
172, // 185
173, // 186
174, // 187
175, // 188
176, // 189
177, // 190
178, // 191
179, // 192
180, // 193
181, // 194
182, // 195
183, // 196
184, // 197
185, // 198
186, // 199
187, // 200
188, // 201
189, // 202
190, // 203
191, // 204
192, // 205
193, // 206
194, // 207
195, // 208
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
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 89
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 90
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 91
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 92
"`! ::= \"!\" ws*", // 93
"`! ::= \"!\" ws*", // 94
"`!= ::= \"!\" \"=\" ws*", // 95
"`!= ::= \"!\" \"=\" ws*", // 96
"`% ::= \"%\" ws*", // 97
"`% ::= \"%\" ws*", // 98
"`&& ::= \"&\" \"&\" ws*", // 99
"`&& ::= \"&\" \"&\" ws*", // 100
"`* ::= \"*\" ws*", // 101
"`* ::= \"*\" ws*", // 102
"`( ::= \"(\" ws*", // 103
"`( ::= \"(\" ws*", // 104
"`) ::= \")\" ws*", // 105
"`) ::= \")\" ws*", // 106
"`== ::= \"=\" \"=\" ws*", // 107
"`== ::= \"=\" \"=\" ws*", // 108
"`+ ::= \"+\" ws*", // 109
"`+ ::= \"+\" ws*", // 110
"`- ::= \"-\" ws*", // 111
"`- ::= \"-\" ws*", // 112
"INTLIT ::= # intLit2 ws*", // 113
"INTLIT ::= # intLit2 ws*", // 114
"intLit2 ::= !\"0\" digit++", // 115
"idChar ::= letter", // 116
"idChar ::= digit", // 117
"idChar ::= \"_\"", // 118
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 119
"digit ::= {\"0\"..\"9\"}", // 120
"ws ::= {9 \" \"}", // 121
"ws ::= eol", // 122
"eol ::= {10} registerNewline", // 123
"eol ::= {13} {10} registerNewline", // 124
"eol ::= {13} !10 registerNewline", // 125
"CHARLIT ::= {130}", // 126
"ID ::= {131}", // 127
"STRINGLIT ::= {132}", // 128
"`! ::= {133}", // 129
"`% ::= {134}", // 130
"`&& ::= {135}", // 131
"`( ::= {136}", // 132
"`) ::= {137}", // 133
"`+ ::= {138}", // 134
"`++ ::= {139}", // 135
"`, ::= {140}", // 136
"`- ::= {141}", // 137
"`-- ::= {142}", // 138
"`. ::= {143}", // 139
"`/ ::= {144}", // 140
"`; ::= {145}", // 141
"`< ::= {146}", // 142
"`<= ::= {147}", // 143
"`= ::= {148}", // 144
"`== ::= {149}", // 145
"`> ::= {150}", // 146
"`>= ::= {151}", // 147
"`[ ::= {152}", // 148
"`] ::= {153}", // 149
"`{ ::= {154}", // 150
"`|| ::= {155}", // 151
"`} ::= {156}", // 152
"`: ::= {157}", // 153
"`abstract ::= {158}", // 154
"`assert ::= {159}", // 155
"`boolean ::= {160}", // 156
"`break ::= {161}", // 157
"`byte ::= {162}", // 158
"`case ::= {163}", // 159
"`catch ::= {164}", // 160
"`char ::= {165}", // 161
"`const ::= {166}", // 162
"`continue ::= {167}", // 163
"`default ::= {168}", // 164
"`do ::= {169}", // 165
"`double ::= {170}", // 166
"`enum ::= {171}", // 167
"`extends ::= {172}", // 168
"`false ::= {173}", // 169
"`final ::= {174}", // 170
"`finally ::= {175}", // 171
"`float ::= {176}", // 172
"`for ::= {177}", // 173
"`goto ::= {178}", // 174
"`if ::= {179}", // 175
"`implements ::= {180}", // 176
"`import ::= {181}", // 177
"`instanceof ::= {182}", // 178
"`int ::= {183}", // 179
"`interface ::= {184}", // 180
"`long ::= {185}", // 181
"`native ::= {186}", // 182
"`new ::= {187}", // 183
"`null ::= {188}", // 184
"`package ::= {189}", // 185
"`private ::= {190}", // 186
"`protected ::= {191}", // 187
"`public ::= {192}", // 188
"`return ::= {193}", // 189
"`short ::= {194}", // 190
"`static ::= {195}", // 191
"`strictfp ::= {196}", // 192
"`super ::= {197}", // 193
"`switch ::= {198}", // 194
"`synchronized ::= {199}", // 195
"`this ::= {200}", // 196
"`throw ::= {201}", // 197
"`throws ::= {202}", // 198
"`transient ::= {203}", // 199
"`true ::= {204}", // 200
"`try ::= {205}", // 201
"`void ::= {206}", // 202
"`volatile ::= {207}", // 203
"`while ::= {208}", // 204
"token* ::= token* token", // 205
"token* ::= token* token", // 206
"digit++ ::= digit+ !digit", // 207
"ws* ::= ws* ws", // 208
"ws* ::= ws* ws", // 209
"digit+ ::= digit", // 210
"digit+ ::= digit+ digit", // 211
"", // 212
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
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 90: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
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
    { // 91: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 92: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
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
    { // 93: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `! ::= "!" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 97: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 100: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 101: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 108: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 109: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `+ ::= "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `- ::= "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 114: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 115: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 116: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 121: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 123: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 127: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 128: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 129: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 207: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 208: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 210: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 211: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 212: $$0 ::= token* @pass
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
