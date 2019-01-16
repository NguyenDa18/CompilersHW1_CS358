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
public int getEofSym() { return 192; }
public int getNttSym() { return 193; }
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
"\"*\"",
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
public int numSymbols() { return 194;}
private static final int MIN_REDUCTION = 228;
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
0x80000000|157, // match move
0x80000000|20, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 1
2,146, // ws*
106,131, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 5
106,34, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+97, // (default reduction)
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
0x80000000|187, // match move
0x80000000|11, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 9
193,MIN_REDUCTION+102, // $NT
  }
,
{ // state 10
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 11
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 14
92,35, // "s"
  }
,
{ // state 15
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 17
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 20
-1, // $$start
66, // start
24, // ws*
96, // $$0
77, // token
156, // `boolean
216, // `class
158, // `extends
6, // `void
199, // `int
18, // `while
114, // `if
103, // `else
118, // `for
180, // `break
173, // `this
134, // `false
206, // `true
192, // `super
31, // `null
74, // `return
52, // `instanceof
181, // `new
30, // `abstract
95, // `assert
221, // `byte
126, // `case
222, // `catch
61, // `char
113, // `const
171, // `continue
160, // `default
72, // `do
122, // `double
45, // `enum
98, // `final
220, // `finally
80, // `float
147, // `goto
178, // `implements
40, // `import
212, // `interface
101, // `long
36, // `native
99, // `package
7, // `private
29, // `protected
19, // `public
202, // `short
154, // `static
59, // `strictfp
73, // `switch
63, // `synchronized
142, // `throw
42, // `throws
213, // `transient
17, // `try
198, // `volatile
49, // `!
81, // `!=
48, // `%
151, // `&&
106, // `*
177, // `(
208, // `)
44, // `{
138, // `}
67, // `-
15, // `+
165, // `=
176, // `==
133, // `[
43, // `]
54, // `||
110, // `<
100, // `<=
205, // `,
89, // `>
82, // `>=
115, // `.
150, // `;
127, // `++
194, // `--
174, // `/
219, // `:
209, // ID
79, // INTLIT
140, // STRINGLIT
116, // CHARLIT
92, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
183, // "e"
22, // "!"
-1, // "="
139, // "*"
55, // intLit2
152, // "0"
186, // digit++
-1, // letter
27, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
152, // {"1".."9"}
131, // ws
123, // {9 " "}
57, // eol
188, // {10}
196, // {13}
107, // {130}
51, // {131}
33, // {132}
129, // {133}
109, // {134}
191, // {135}
37, // {136}
26, // {137}
164, // {138}
223, // {139}
137, // {140}
90, // {141}
93, // {142}
182, // {143}
102, // {144}
124, // {145}
203, // {146}
39, // {147}
64, // {148}
226, // {149}
75, // {150}
159, // {151}
200, // {152}
119, // {153}
207, // {154}
179, // {155}
169, // {156}
136, // {157}
56, // {158}
84, // {159}
218, // {160}
68, // {161}
214, // {162}
87, // {163}
71, // {164}
185, // {165}
65, // {166}
10, // {167}
47, // {168}
149, // {169}
104, // {170}
4, // {171}
16, // {172}
204, // {173}
168, // {174}
128, // {175}
76, // {176}
23, // {177}
145, // {178}
78, // {179}
58, // {180}
53, // {181}
50, // {182}
12, // {183}
172, // {184}
224, // {185}
13, // {186}
125, // {187}
38, // {188}
69, // {189}
135, // {190}
225, // {191}
132, // {192}
85, // {193}
21, // {194}
162, // {195}
91, // {196}
193, // {197}
197, // {198}
3, // {199}
41, // {200}
70, // {201}
217, // {202}
170, // {203}
166, // {204}
112, // {205}
153, // {206}
46, // {207}
148, // {208}
60, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 21
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 22
96,97, // "="
  }
,
{ // state 23
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 24
0x80000000|83, // match move
0x80000000|189, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 25
99,210, // "0"
105,210, // {"1".."9"}
  }
,
{ // state 26
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 27
0x80000000|28, // match move
0x80000000|120, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 28
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 29
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 32
109,195, // {10}
  }
,
{ // state 33
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 35
92,201, // "s"
  }
,
{ // state 36
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 39
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 55
2,5, // ws*
106,131, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 59
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 60
0x80000000|94, // match move
0x80000000|130, // no-match move
// T-test match for "0":
99,
  }
,
{ // state 61
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 62
0x80000000|2, // match move
0x80000000|1, // no-match move
0x80000000|141, // NT-test-match state for idChar
  }
,
{ // state 63
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 66
192,MIN_REDUCTION+0, // $
  }
,
{ // state 67
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 83
3,155, // $$0
4,77, // token
5,156, // `boolean
6,216, // `class
7,158, // `extends
8,6, // `void
9,199, // `int
10,18, // `while
11,114, // `if
12,103, // `else
13,118, // `for
14,180, // `break
15,173, // `this
16,134, // `false
17,206, // `true
18,192, // `super
19,31, // `null
20,74, // `return
21,52, // `instanceof
22,181, // `new
23,30, // `abstract
24,95, // `assert
25,221, // `byte
26,126, // `case
27,222, // `catch
28,61, // `char
29,113, // `const
30,171, // `continue
31,160, // `default
32,72, // `do
33,122, // `double
34,45, // `enum
35,98, // `final
36,220, // `finally
37,80, // `float
38,147, // `goto
39,178, // `implements
40,40, // `import
41,212, // `interface
42,101, // `long
43,36, // `native
44,99, // `package
45,7, // `private
46,29, // `protected
47,19, // `public
48,202, // `short
49,154, // `static
50,59, // `strictfp
51,73, // `switch
52,63, // `synchronized
53,142, // `throw
54,42, // `throws
55,213, // `transient
56,17, // `try
57,198, // `volatile
58,49, // `!
59,81, // `!=
60,48, // `%
61,151, // `&&
62,106, // `*
63,177, // `(
64,208, // `)
65,44, // `{
66,138, // `}
67,67, // `-
68,15, // `+
69,165, // `=
70,176, // `==
71,133, // `[
72,43, // `]
73,54, // `||
74,110, // `<
75,100, // `<=
76,205, // `,
77,89, // `>
78,82, // `>=
79,115, // `.
80,150, // `;
81,127, // `++
82,194, // `--
83,174, // `/
84,219, // `:
85,209, // ID
86,79, // INTLIT
87,140, // STRINGLIT
88,116, // CHARLIT
106,34, // ws
108,57, // eol
190,60, // token*
  }
,
{ // state 84
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 88
106,34, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 90
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 92
90,117, // "l"
  }
,
{ // state 93
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 94
4,215, // token
5,156, // `boolean
6,216, // `class
7,158, // `extends
8,6, // `void
9,199, // `int
10,18, // `while
11,114, // `if
12,103, // `else
13,118, // `for
14,180, // `break
15,173, // `this
16,134, // `false
17,206, // `true
18,192, // `super
19,31, // `null
20,74, // `return
21,52, // `instanceof
22,181, // `new
23,30, // `abstract
24,95, // `assert
25,221, // `byte
26,126, // `case
27,222, // `catch
28,61, // `char
29,113, // `const
30,171, // `continue
31,160, // `default
32,72, // `do
33,122, // `double
34,45, // `enum
35,98, // `final
36,220, // `finally
37,80, // `float
38,147, // `goto
39,178, // `implements
40,40, // `import
41,212, // `interface
42,101, // `long
43,36, // `native
44,99, // `package
45,7, // `private
46,29, // `protected
47,19, // `public
48,202, // `short
49,154, // `static
50,59, // `strictfp
51,73, // `switch
52,63, // `synchronized
53,142, // `throw
54,42, // `throws
55,213, // `transient
56,17, // `try
57,198, // `volatile
58,49, // `!
59,81, // `!=
60,48, // `%
61,151, // `&&
62,106, // `*
63,177, // `(
64,208, // `)
65,44, // `{
66,138, // `}
67,67, // `-
68,15, // `+
69,165, // `=
70,176, // `==
71,133, // `[
72,43, // `]
73,54, // `||
74,110, // `<
75,100, // `<=
76,205, // `,
77,89, // `>
78,82, // `>=
79,115, // `.
80,150, // `;
81,127, // `++
82,194, // `--
83,174, // `/
84,219, // `:
85,209, // ID
86,79, // INTLIT
87,140, // STRINGLIT
88,116, // CHARLIT
  }
,
{ // state 95
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 97
2,144, // ws*
106,131, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 105
193,MIN_REDUCTION+103, // $NT
  }
,
{ // state 106
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 117
91,14, // "a"
  }
,
{ // state 118
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 121
92,143, // "s"
  }
,
{ // state 122
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 130
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
215, // token
156, // `boolean
216, // `class
158, // `extends
6, // `void
199, // `int
18, // `while
114, // `if
103, // `else
118, // `for
180, // `break
173, // `this
134, // `false
206, // `true
192, // `super
31, // `null
74, // `return
52, // `instanceof
181, // `new
30, // `abstract
95, // `assert
221, // `byte
126, // `case
222, // `catch
61, // `char
113, // `const
171, // `continue
160, // `default
72, // `do
122, // `double
45, // `enum
98, // `final
220, // `finally
80, // `float
147, // `goto
178, // `implements
40, // `import
212, // `interface
101, // `long
36, // `native
99, // `package
7, // `private
29, // `protected
19, // `public
202, // `short
154, // `static
59, // `strictfp
73, // `switch
63, // `synchronized
142, // `throw
42, // `throws
213, // `transient
17, // `try
198, // `volatile
49, // `!
81, // `!=
48, // `%
151, // `&&
106, // `*
177, // `(
208, // `)
44, // `{
138, // `}
67, // `-
15, // `+
165, // `=
176, // `==
133, // `[
43, // `]
54, // `||
110, // `<
100, // `<=
205, // `,
89, // `>
82, // `>=
115, // `.
150, // `;
127, // `++
194, // `--
174, // `/
219, // `:
209, // ID
79, // INTLIT
140, // STRINGLIT
116, // CHARLIT
92, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
183, // "e"
22, // "!"
-1, // "="
139, // "*"
55, // intLit2
152, // "0"
186, // digit++
-1, // letter
27, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
152, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
107, // {130}
51, // {131}
33, // {132}
129, // {133}
109, // {134}
191, // {135}
37, // {136}
26, // {137}
164, // {138}
223, // {139}
137, // {140}
90, // {141}
93, // {142}
182, // {143}
102, // {144}
124, // {145}
203, // {146}
39, // {147}
64, // {148}
226, // {149}
75, // {150}
159, // {151}
200, // {152}
119, // {153}
207, // {154}
179, // {155}
169, // {156}
136, // {157}
56, // {158}
84, // {159}
218, // {160}
68, // {161}
214, // {162}
87, // {163}
71, // {164}
185, // {165}
65, // {166}
10, // {167}
47, // {168}
149, // {169}
104, // {170}
4, // {171}
16, // {172}
204, // {173}
168, // {174}
128, // {175}
76, // {176}
23, // {177}
145, // {178}
78, // {179}
58, // {180}
53, // {181}
50, // {182}
12, // {183}
172, // {184}
224, // {185}
13, // {186}
125, // {187}
38, // {188}
69, // {189}
135, // {190}
225, // {191}
132, // {192}
85, // {193}
21, // {194}
162, // {195}
91, // {196}
193, // {197}
197, // {198}
3, // {199}
41, // {200}
70, // {201}
217, // {202}
170, // {203}
166, // {204}
112, // {205}
153, // {206}
46, // {207}
148, // {208}
-1, // token*
8, // digit+
MIN_REDUCTION+196, // $
-1, // $NT
  }
,
{ // state 131
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 138
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 139
2,88, // ws*
106,131, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 141
89,105, // "c"
90,105, // "l"
91,105, // "a"
92,105, // "s"
94,105, // "e"
99,210, // "0"
101,161, // letter
102,190, // digit
103,9, // "_"
104,105, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
105,210, // {"1".."9"}
  }
,
{ // state 142
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 143
94,62, // "e"
  }
,
{ // state 144
106,34, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 146
106,34, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 152
0x80000000|86, // match move
0x80000000|111, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 153
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 157
1,66, // start
2,24, // ws*
3,96, // $$0
4,77, // token
5,156, // `boolean
6,216, // `class
7,158, // `extends
8,6, // `void
9,199, // `int
10,18, // `while
11,114, // `if
12,103, // `else
13,118, // `for
14,180, // `break
15,173, // `this
16,134, // `false
17,206, // `true
18,192, // `super
19,31, // `null
20,74, // `return
21,52, // `instanceof
22,181, // `new
23,30, // `abstract
24,95, // `assert
25,221, // `byte
26,126, // `case
27,222, // `catch
28,61, // `char
29,113, // `const
30,171, // `continue
31,160, // `default
32,72, // `do
33,122, // `double
34,45, // `enum
35,98, // `final
36,220, // `finally
37,80, // `float
38,147, // `goto
39,178, // `implements
40,40, // `import
41,212, // `interface
42,101, // `long
43,36, // `native
44,99, // `package
45,7, // `private
46,29, // `protected
47,19, // `public
48,202, // `short
49,154, // `static
50,59, // `strictfp
51,73, // `switch
52,63, // `synchronized
53,142, // `throw
54,42, // `throws
55,213, // `transient
56,17, // `try
57,198, // `volatile
58,49, // `!
59,81, // `!=
60,48, // `%
61,151, // `&&
62,106, // `*
63,177, // `(
64,208, // `)
65,44, // `{
66,138, // `}
67,67, // `-
68,15, // `+
69,165, // `=
70,176, // `==
71,133, // `[
72,43, // `]
73,54, // `||
74,110, // `<
75,100, // `<=
76,205, // `,
77,89, // `>
78,82, // `>=
79,115, // `.
80,150, // `;
81,127, // `++
82,194, // `--
83,174, // `/
84,219, // `:
85,209, // ID
86,79, // INTLIT
87,140, // STRINGLIT
88,116, // CHARLIT
106,131, // ws
108,57, // eol
190,60, // token*
  }
,
{ // state 158
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 161
193,MIN_REDUCTION+100, // $NT
  }
,
{ // state 162
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 167
2,211, // ws*
106,131, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 183
90,121, // "l"
  }
,
{ // state 184
0x80000000|163, // match move
0x80000000|175, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 185
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 187
99,152, // "0"
102,184, // digit
105,152, // {"1".."9"}
  }
,
{ // state 188
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 189
-1, // $$start
-1, // start
-1, // ws*
155, // $$0
77, // token
156, // `boolean
216, // `class
158, // `extends
6, // `void
199, // `int
18, // `while
114, // `if
103, // `else
118, // `for
180, // `break
173, // `this
134, // `false
206, // `true
192, // `super
31, // `null
74, // `return
52, // `instanceof
181, // `new
30, // `abstract
95, // `assert
221, // `byte
126, // `case
222, // `catch
61, // `char
113, // `const
171, // `continue
160, // `default
72, // `do
122, // `double
45, // `enum
98, // `final
220, // `finally
80, // `float
147, // `goto
178, // `implements
40, // `import
212, // `interface
101, // `long
36, // `native
99, // `package
7, // `private
29, // `protected
19, // `public
202, // `short
154, // `static
59, // `strictfp
73, // `switch
63, // `synchronized
142, // `throw
42, // `throws
213, // `transient
17, // `try
198, // `volatile
49, // `!
81, // `!=
48, // `%
151, // `&&
106, // `*
177, // `(
208, // `)
44, // `{
138, // `}
67, // `-
15, // `+
165, // `=
176, // `==
133, // `[
43, // `]
54, // `||
110, // `<
100, // `<=
205, // `,
89, // `>
82, // `>=
115, // `.
150, // `;
127, // `++
194, // `--
174, // `/
219, // `:
209, // ID
79, // INTLIT
140, // STRINGLIT
116, // CHARLIT
92, // "c"
-1, // "l"
-1, // "a"
-1, // "s"
-1, // idChar
183, // "e"
22, // "!"
-1, // "="
139, // "*"
55, // intLit2
152, // "0"
186, // digit++
-1, // letter
27, // digit
-1, // "_"
-1, // {"A".."Z" "b" "d" "f".."k" "m".."r" "t".."z"}
152, // {"1".."9"}
34, // ws
123, // {9 " "}
57, // eol
188, // {10}
196, // {13}
107, // {130}
51, // {131}
33, // {132}
129, // {133}
109, // {134}
191, // {135}
37, // {136}
26, // {137}
164, // {138}
223, // {139}
137, // {140}
90, // {141}
93, // {142}
182, // {143}
102, // {144}
124, // {145}
203, // {146}
39, // {147}
64, // {148}
226, // {149}
75, // {150}
159, // {151}
200, // {152}
119, // {153}
207, // {154}
179, // {155}
169, // {156}
136, // {157}
56, // {158}
84, // {159}
218, // {160}
68, // {161}
214, // {162}
87, // {163}
71, // {164}
185, // {165}
65, // {166}
10, // {167}
47, // {168}
149, // {169}
104, // {170}
4, // {171}
16, // {172}
204, // {173}
168, // {174}
128, // {175}
76, // {176}
23, // {177}
145, // {178}
78, // {179}
58, // {180}
53, // {181}
50, // {182}
12, // {183}
172, // {184}
224, // {185}
13, // {186}
125, // {187}
38, // {188}
69, // {189}
135, // {190}
225, // {191}
132, // {192}
85, // {193}
21, // {194}
162, // {195}
91, // {196}
193, // {197}
197, // {198}
3, // {199}
41, // {200}
70, // {201}
217, // {202}
170, // {203}
166, // {204}
112, // {205}
153, // {206}
46, // {207}
148, // {208}
60, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 190
193,MIN_REDUCTION+101, // $NT
  }
,
{ // state 191
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 194
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 196
0x80000000|32, // match move
0x80000000|108, // no-match move
// T-test match for 10:
109,
  }
,
{ // state 197
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 201
0x80000000|2, // match move
0x80000000|167, // no-match move
0x80000000|141, // NT-test-match state for idChar
  }
,
{ // state 202
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 210
193,MIN_REDUCTION+104, // $NT
  }
,
{ // state 211
106,34, // ws
107,123, // {9 " "}
108,57, // eol
109,188, // {10}
110,196, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 212
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+129, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[227][];
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
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(98<<16)+1,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(101<<16)+1,
// digit ::= {"0".."9"}
(102<<16)+1,
// ws ::= {9 " "}
(106<<16)+1,
// ws ::= eol
(106<<16)+1,
// eol ::= {10}
(108<<16)+1,
// eol ::= {13} {10}
(108<<16)+2,
// eol ::= {13} !10
(108<<16)+1,
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
(190<<16)+2,
// token* ::= token
(190<<16)+1,
// digit++ ::= digit+ !digit
(100<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(191<<16)+1,
// digit+ ::= digit+ digit
(191<<16)+2,
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
107, // 9
109, // 10
-1, // 11
-1, // 12
110, // 13
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
107, // " "
95, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
-1, // "("
-1, // ")"
97, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
99, // "0"
105, // "1"
105, // "2"
105, // "3"
105, // "4"
105, // "5"
105, // "6"
105, // "7"
105, // "8"
105, // "9"
-1, // ":"
-1, // ";"
-1, // "<"
96, // "="
-1, // ">"
-1, // "?"
-1, // "@"
104, // "A"
104, // "B"
104, // "C"
104, // "D"
104, // "E"
104, // "F"
104, // "G"
104, // "H"
104, // "I"
104, // "J"
104, // "K"
104, // "L"
104, // "M"
104, // "N"
104, // "O"
104, // "P"
104, // "Q"
104, // "R"
104, // "S"
104, // "T"
104, // "U"
104, // "V"
104, // "W"
104, // "X"
104, // "Y"
104, // "Z"
-1, // "["
-1, // "\"
-1, // "]"
-1, // "^"
103, // "_"
-1, // "`"
91, // "a"
104, // "b"
89, // "c"
104, // "d"
94, // "e"
104, // "f"
104, // "g"
104, // "h"
104, // "i"
104, // "j"
104, // "k"
90, // "l"
104, // "m"
104, // "n"
104, // "o"
104, // "p"
104, // "q"
104, // "r"
92, // "s"
104, // "t"
104, // "u"
104, // "v"
104, // "w"
104, // "x"
104, // "y"
104, // "z"
-1, // "{"
-1, // "|"
-1, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
111, // 130
112, // 131
113, // 132
114, // 133
115, // 134
116, // 135
117, // 136
118, // 137
119, // 138
120, // 139
121, // 140
122, // 141
123, // 142
124, // 143
125, // 144
126, // 145
127, // 146
128, // 147
129, // 148
130, // 149
131, // 150
132, // 151
133, // 152
134, // 153
135, // 154
136, // 155
137, // 156
138, // 157
139, // 158
140, // 159
141, // 160
142, // 161
143, // 162
144, // 163
145, // 164
146, // 165
147, // 166
148, // 167
149, // 168
150, // 169
151, // 170
152, // 171
153, // 172
154, // 173
155, // 174
156, // 175
157, // 176
158, // 177
159, // 178
160, // 179
161, // 180
162, // 181
163, // 182
164, // 183
165, // 184
166, // 185
167, // 186
168, // 187
169, // 188
170, // 189
171, // 190
172, // 191
173, // 192
174, // 193
175, // 194
176, // 195
177, // 196
178, // 197
179, // 198
180, // 199
181, // 200
182, // 201
183, // 202
184, // 203
185, // 204
186, // 205
187, // 206
188, // 207
189, // 208
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
"`!= ::= \"!\" \"=\" ws*", // 93
"`!= ::= \"!\" \"=\" ws*", // 94
"`* ::= \"*\" ws*", // 95
"`* ::= \"*\" ws*", // 96
"INTLIT ::= # intLit2 ws*", // 97
"INTLIT ::= # intLit2 ws*", // 98
"intLit2 ::= !\"0\" digit++", // 99
"idChar ::= letter", // 100
"idChar ::= digit", // 101
"idChar ::= \"_\"", // 102
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 103
"digit ::= {\"0\"..\"9\"}", // 104
"ws ::= {9 \" \"}", // 105
"ws ::= eol", // 106
"eol ::= {10} registerNewline", // 107
"eol ::= {13} {10} registerNewline", // 108
"eol ::= {13} !10 registerNewline", // 109
"CHARLIT ::= {130}", // 110
"ID ::= {131}", // 111
"STRINGLIT ::= {132}", // 112
"`! ::= {133}", // 113
"`% ::= {134}", // 114
"`&& ::= {135}", // 115
"`( ::= {136}", // 116
"`) ::= {137}", // 117
"`+ ::= {138}", // 118
"`++ ::= {139}", // 119
"`, ::= {140}", // 120
"`- ::= {141}", // 121
"`-- ::= {142}", // 122
"`. ::= {143}", // 123
"`/ ::= {144}", // 124
"`; ::= {145}", // 125
"`< ::= {146}", // 126
"`<= ::= {147}", // 127
"`= ::= {148}", // 128
"`== ::= {149}", // 129
"`> ::= {150}", // 130
"`>= ::= {151}", // 131
"`[ ::= {152}", // 132
"`] ::= {153}", // 133
"`{ ::= {154}", // 134
"`|| ::= {155}", // 135
"`} ::= {156}", // 136
"`: ::= {157}", // 137
"`abstract ::= {158}", // 138
"`assert ::= {159}", // 139
"`boolean ::= {160}", // 140
"`break ::= {161}", // 141
"`byte ::= {162}", // 142
"`case ::= {163}", // 143
"`catch ::= {164}", // 144
"`char ::= {165}", // 145
"`const ::= {166}", // 146
"`continue ::= {167}", // 147
"`default ::= {168}", // 148
"`do ::= {169}", // 149
"`double ::= {170}", // 150
"`enum ::= {171}", // 151
"`extends ::= {172}", // 152
"`false ::= {173}", // 153
"`final ::= {174}", // 154
"`finally ::= {175}", // 155
"`float ::= {176}", // 156
"`for ::= {177}", // 157
"`goto ::= {178}", // 158
"`if ::= {179}", // 159
"`implements ::= {180}", // 160
"`import ::= {181}", // 161
"`instanceof ::= {182}", // 162
"`int ::= {183}", // 163
"`interface ::= {184}", // 164
"`long ::= {185}", // 165
"`native ::= {186}", // 166
"`new ::= {187}", // 167
"`null ::= {188}", // 168
"`package ::= {189}", // 169
"`private ::= {190}", // 170
"`protected ::= {191}", // 171
"`public ::= {192}", // 172
"`return ::= {193}", // 173
"`short ::= {194}", // 174
"`static ::= {195}", // 175
"`strictfp ::= {196}", // 176
"`super ::= {197}", // 177
"`switch ::= {198}", // 178
"`synchronized ::= {199}", // 179
"`this ::= {200}", // 180
"`throw ::= {201}", // 181
"`throws ::= {202}", // 182
"`transient ::= {203}", // 183
"`true ::= {204}", // 184
"`try ::= {205}", // 185
"`void ::= {206}", // 186
"`volatile ::= {207}", // 187
"`while ::= {208}", // 188
"token* ::= token* token", // 189
"token* ::= token* token", // 190
"digit++ ::= digit+ !digit", // 191
"ws* ::= ws* ws", // 192
"ws* ::= ws* ws", // 193
"digit+ ::= digit", // 194
"digit+ ::= digit+ digit", // 195
"", // 196
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
    { // 93: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 94: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 95: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 98: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 99: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 100: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 101: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 103: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 109: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 111: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 112: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 113: `! ::= {133} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `% ::= {134} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `&& ::= {135} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `( ::= {136} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `) ::= {137} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `+ ::= {138} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `++ ::= {139} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `, ::= {140} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `- ::= {141} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `-- ::= {142} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `. ::= {143} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `; ::= {145} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `< ::= {146} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `<= ::= {147} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `= ::= {148} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `== ::= {149} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `> ::= {150} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `>= ::= {151} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `[ ::= {152} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `] ::= {153} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `{ ::= {154} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `|| ::= {155} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `} ::= {156} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `: ::= {157} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `abstract ::= {158} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `assert ::= {159} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `boolean ::= {160} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `break ::= {161} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `byte ::= {162} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `case ::= {163} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `catch ::= {164} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `char ::= {165} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `const ::= {166} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `continue ::= {167} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `default ::= {168} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `do ::= {169} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `double ::= {170} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `enum ::= {171} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `extends ::= {172} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `false ::= {173} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `final ::= {174} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `finally ::= {175} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `float ::= {176} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `for ::= {177} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `goto ::= {178} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `transient ::= {203} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 184: `true ::= {204} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 185: `try ::= {205} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `void ::= {206} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `volatile ::= {207} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `while ::= {208} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 191: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 192: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 194: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 195: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: $$0 ::= token* @pass
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
