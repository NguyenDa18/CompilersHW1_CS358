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
public int getEofSym() { return 190; }
public int getNttSym() { return 191; }
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
public int numSymbols() { return 192;}
private static final int MIN_REDUCTION = 572;
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
0x80000000|175, // match move
0x80000000|22, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 1
  }
,
{ // state 2
2,441, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 4
101,249, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
93,297, // "a"
  }
,
{ // state 7
90,332, // "o"
  }
,
{ // state 8
0x80000000|211, // match move
0x80000000|278, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 9
191,MIN_REDUCTION+220, // $NT
  }
,
{ // state 10
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 11
-1, // $$start
-1, // start
440, // ws*
-1, // $$0
MIN_REDUCTION+198, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
154, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
8, // digit+
MIN_REDUCTION+198, // $
-1, // $NT
  }
,
{ // state 12
108,464, // "h"
  }
,
{ // state 13
92,536, // "e"
  }
,
{ // state 14
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 15
103,234, // "f"
  }
,
{ // state 16
108,118, // "h"
  }
,
{ // state 17
104,294, // "i"
  }
,
{ // state 18
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 21
99,308, // "s"
  }
,
{ // state 22
-1, // $$start
87, // start
33, // ws*
386, // $$0
98, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
342, // token*
8, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 23
104,528, // "i"
  }
,
{ // state 24
90,232, // "o"
  }
,
{ // state 25
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 26
-1, // $$start
-1, // start
288, // ws*
-1, // $$0
MIN_REDUCTION+210, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
154, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
8, // digit+
MIN_REDUCTION+210, // $
-1, // $NT
  }
,
{ // state 27
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 28
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 29
2,92, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 30
107,516, // "p"
  }
,
{ // state 31
99,207, // "s"
  }
,
{ // state 32
92,310, // "e"
  }
,
{ // state 33
0x80000000|373, // match move
0x80000000|213, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 34
124,251, // "0"
130,251, // {"1".."9"}
  }
,
{ // state 35
0x80000000|37, // match move
0x80000000|148, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 36
91,281, // "l"
  }
,
{ // state 37
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 38
94,396, // "n"
  }
,
{ // state 39
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 40
99,404, // "s"
101,399, // "t"
  }
,
{ // state 41
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 42
0x80000000|284, // match move
0x80000000|449, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 43
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 44
99,537, // "s"
  }
,
{ // state 45
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 46
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 47
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 48
108,326, // "h"
  }
,
{ // state 49
101,80, // "t"
  }
,
{ // state 50
104,292, // "i"
  }
,
{ // state 51
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 52
2,530, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 53
92,119, // "e"
  }
,
{ // state 54
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 55
94,503, // "n"
  }
,
{ // state 56
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 58
93,338, // "a"
  }
,
{ // state 59
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 60
112,429, // "g"
  }
,
{ // state 61
90,561, // "o"
  }
,
{ // state 62
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 63
109,273, // "v"
  }
,
{ // state 64
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 65
101,522, // "t"
  }
,
{ // state 66
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 67
0x80000000|1, // match move
0x80000000|220, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 68
2,543, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 69
101,282, // "t"
  }
,
{ // state 70
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 71
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 72
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 73
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 74
94,40, // "n"
  }
,
{ // state 75
2,76, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 76
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 77
2,194, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 78
99,236, // "s"
  }
,
{ // state 79
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 81
101,331, // "t"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 83
89,375, // "b"
  }
,
{ // state 84
99,549, // "s"
101,302, // "t"
  }
,
{ // state 85
91,58, // "l"
104,431, // "i"
  }
,
{ // state 86
2,28, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 87
190,MIN_REDUCTION+0, // $
  }
,
{ // state 88
93,129, // "a"
106,102, // "u"
110,299, // "y"
  }
,
{ // state 89
102,437, // "d"
  }
,
{ // state 90
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 92
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 93
90,339, // "o"
  }
,
{ // state 94
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 97
91,149, // "l"
94,365, // "n"
96,15, // "r"
100,556, // "x"
  }
,
{ // state 98
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 99
101,380, // "t"
  }
,
{ // state 100
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 102
92,415, // "e"
  }
,
{ // state 103
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 105
90,237, // "o"
104,63, // "i"
  }
,
{ // state 106
0x80000000|1, // match move
0x80000000|29, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 107
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 108
91,394, // "l"
  }
,
{ // state 109
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 110
91,353, // "l"
  }
,
{ // state 111
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 113
111,295, // "m"
  }
,
{ // state 114
94,165, // "n"
  }
,
{ // state 115
0x80000000|411, // match move
0x80000000|423, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 116
2,357, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 117
90,85, // "o"
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|75, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|233, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 120
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 121
104,364, // "i"
  }
,
{ // state 122
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 123
104,446, // "i"
  }
,
{ // state 124
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 126
2,172, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 127
2,226, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 128
90,387, // "o"
  }
,
{ // state 129
94,408, // "n"
  }
,
{ // state 130
2,242, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 131
108,379, // "h"
  }
,
{ // state 132
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 135
93,298, // "a"
  }
,
{ // state 136
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 138
93,110, // "a"
  }
,
{ // state 139
96,361, // "r"
  }
,
{ // state 140
92,391, // "e"
  }
,
{ // state 141
98,131, // "c"
  }
,
{ // state 142
-1, // $$start
-1, // start
497, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
97, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 143
93,280, // "a"
  }
,
{ // state 144
105,458, // "w"
  }
,
{ // state 145
92,388, // "e"
  }
,
{ // state 146
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 149
99,439, // "s"
  }
,
{ // state 150
99,311, // "s"
  }
,
{ // state 151
2,71, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 152
90,551, // "o"
  }
,
{ // state 153
107,140, // "p"
  }
,
{ // state 154
0x80000000|457, // match move
0x80000000|26, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 155
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 157
2,72, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 159
2,252, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 160
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
258, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
8, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 161
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 165
106,493, // "u"
  }
,
{ // state 166
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 167
0x80000000|1, // match move
0x80000000|359, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 168
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 169
-1, // $$start
-1, // start
328, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
413, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 170
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 171
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 172
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 174
97,505, // "k"
  }
,
{ // state 175
1,87, // start
2,33, // ws*
3,386, // $$0
4,98, // token
5,173, // `boolean
6,553, // `class
7,176, // `extends
8,5, // `void
9,229, // `int
10,283, // `while
11,406, // `if
12,125, // `else
13,412, // `for
14,489, // `break
15,192, // `this
16,163, // `false
17,245, // `true
18,215, // `super
19,41, // `null
20,95, // `return
21,327, // `instanceof
22,490, // `new
23,304, // `abstract
24,384, // `assert
25,562, // `byte
26,419, // `case
27,564, // `catch
28,344, // `char
29,403, // `const
30,482, // `continue
31,461, // `default
32,356, // `do
33,155, // `double
34,59, // `enum
35,120, // `final
36,268, // `finally
37,100, // `float
38,168, // `goto
39,487, // `implements
40,54, // `import
41,254, // `interface
42,392, // `long
43,309, // `native
44,389, // `package
45,276, // `private
46,39, // `protected
47,285, // `public
48,538, // `short
49,171, // `static
50,340, // `strictfp
51,94, // `switch
52,348, // `synchronized
53,438, // `throw
54,57, // `throws
55,256, // `transient
56,19, // `try
57,224, // `volatile
58,322, // `!
59,372, // `!=
60,64, // `%
61,447, // `&&
62,398, // `*
63,486, // `(
64,248, // `)
65,319, // `{
66,433, // `}
67,352, // `-
68,14, // `+
69,187, // `=
70,196, // `==
71,162, // `[
72,318, // `]
73,329, // `||
74,136, // `<
75,122, // `<=
76,542, // `,
77,109, // `>
78,101, // `>=
79,137, // `.
80,170, // `;
81,420, // `++
82,218, // `--
83,193, // `/
84,267, // `:
85,545, // ID
86,371, // INTLIT
87,166, // STRINGLIT
88,410, // CHARLIT
131,425, // ws
133,334, // eol
188,342, // token*
  }
,
{ // state 176
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 177
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 178
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 179
2,183, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 180
103,491, // "f"
  }
,
{ // state 181
191,MIN_REDUCTION+218, // $NT
  }
,
{ // state 182
-1, // $$start
-1, // start
567, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
363, // "t"
558, // "d"
270, // "f"
360, // "i"
238, // "w"
153, // "u"
321, // "p"
152, // "h"
117, // "v"
385, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 183
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 184
2,47, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 185
92,495, // "e"
  }
,
{ // state 186
0x80000000|1, // match move
0x80000000|260, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 187
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 188
90,74, // "o"
91,143, // "l"
93,84, // "a"
108,422, // "h"
  }
,
{ // state 189
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 190
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 191
91,520, // "l"
  }
,
{ // state 192
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 194
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 197
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 198
2,476, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 199
98,456, // "c"
  }
,
{ // state 200
92,442, // "e"
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|400, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 202
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 203
94,60, // "n"
  }
,
{ // state 204
94,96, // "n"
  }
,
{ // state 205
92,527, // "e"
  }
,
{ // state 206
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|157, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 208
0x80000000|466, // match move
0x80000000|195, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 209
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 210
0x80000000|540, // match move
0x80000000|11, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 211
124,450, // "0"
127,208, // digit
130,450, // {"1".."9"}
  }
,
{ // state 212
92,552, // "e"
  }
,
{ // state 213
-1, // $$start
-1, // start
-1, // ws*
453, // $$0
98, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
43, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
342, // token*
8, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 214
101,535, // "t"
  }
,
{ // state 215
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 217
89,501, // "b"
  }
,
{ // state 218
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 219
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 220
2,378, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 221
0x80000000|305, // match move
0x80000000|133, // no-match move
// T-test match for 10:
134,
  }
,
{ // state 222
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 223
2,243, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 225
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 226
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 227
2,293, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 228
93,455, // "a"
  }
,
{ // state 229
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 230
92,428, // "e"
  }
,
{ // state 231
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 232
91,504, // "l"
  }
,
{ // state 233
2,289, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 234
93,514, // "a"
  }
,
{ // state 235
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|184, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 237
101,427, // "t"
  }
,
{ // state 238
104,250, // "i"
108,326, // "h"
  }
,
{ // state 239
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 240
104,286, // "i"
  }
,
{ // state 241
2,414, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 242
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 243
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 244
101,496, // "t"
  }
,
{ // state 245
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 246
92,563, // "e"
  }
,
{ // state 247
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 248
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 249
106,529, // "u"
  }
,
{ // state 250
101,566, // "t"
  }
,
{ // state 251
191,MIN_REDUCTION+222, // $NT
  }
,
{ // state 252
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 253
97,106, // "k"
  }
,
{ // state 254
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 255
96,484, // "r"
  }
,
{ // state 256
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 257
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 258
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|337, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 260
2,177, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 261
96,15, // "r"
  }
,
{ // state 262
109,554, // "v"
  }
,
{ // state 263
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 264
2,202, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 265
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|198, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 267
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 269
101,393, // "t"
  }
,
{ // state 270
90,401, // "o"
91,323, // "l"
93,313, // "a"
104,444, // "i"
  }
,
{ // state 271
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 273
93,65, // "a"
  }
,
{ // state 274
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 275
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 277
101,31, // "t"
  }
,
{ // state 278
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 280
99,44, // "s"
  }
,
{ // state 281
101,366, // "t"
  }
,
{ // state 282
93,38, // "a"
  }
,
{ // state 283
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 284
106,83, // "u"
  }
,
{ // state 285
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 286
98,333, // "c"
  }
,
{ // state 287
0x80000000|485, // match move
0x80000000|169, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 288
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 289
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 290
2,306, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 291
92,4, // "e"
  }
,
{ // state 292
113,13, // "z"
  }
,
{ // state 293
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 294
92,55, // "e"
  }
,
{ // state 295
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 296
92,534, // "e"
  }
,
{ // state 297
101,67, // "t"
  }
,
{ // state 298
98,49, // "c"
  }
,
{ // state 299
0x80000000|1, // match move
0x80000000|241, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 301
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 302
98,12, // "c"
  }
,
{ // state 303
2,525, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 305
134,518, // {10}
  }
,
{ // state 306
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 308
92,370, // "e"
  }
,
{ // state 309
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|381, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 312
99,69, // "s"
101,368, // "t"
  }
,
{ // state 313
91,21, // "l"
  }
,
{ // state 314
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 316
101,32, // "t"
  }
,
{ // state 317
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 320
102,78, // "d"
  }
,
{ // state 321
93,435, // "a"
96,105, // "r"
106,217, // "u"
  }
,
{ // state 322
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 323
90,6, // "o"
  }
,
{ // state 324
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 325
90,203, // "o"
110,201, // "y"
  }
,
{ // state 326
104,108, // "i"
  }
,
{ // state 327
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 328
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 330
2,275, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 331
103,30, // "f"
  }
,
{ // state 332
101,61, // "t"
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|264, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 334
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 336
112,53, // "g"
  }
,
{ // state 337
2,547, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 338
101,23, // "t"
  }
,
{ // state 339
94,50, // "n"
  }
,
{ // state 340
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 341
117,223, // "&"
  }
,
{ // state 342
0x80000000|383, // match move
0x80000000|160, // no-match move
// T-test match for "0":
124,
  }
,
{ // state 343
0x80000000|1, // match move
0x80000000|424, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 344
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 345
2,51, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 346
2,559, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 347
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 349
91,149, // "l"
94,365, // "n"
100,556, // "x"
  }
,
{ // state 350
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 351
90,24, // "o"
96,296, // "r"
110,316, // "y"
  }
,
{ // state 352
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 353
0x80000000|451, // match move
0x80000000|521, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 354
99,99, // "s"
  }
,
{ // state 355
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 357
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 358
106,36, // "u"
  }
,
{ // state 359
2,225, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 360
94,312, // "n"
103,511, // "f"
111,550, // "m"
  }
,
{ // state 361
101,494, // "t"
  }
,
{ // state 362
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 363
93,397, // "a"
96,517, // "r"
108,369, // "h"
  }
,
{ // state 364
98,81, // "c"
  }
,
{ // state 365
106,113, // "u"
  }
,
{ // state 366
0x80000000|1, // match move
0x80000000|544, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 367
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 368
0x80000000|462, // match move
0x80000000|142, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 369
96,128, // "r"
104,150, // "i"
  }
,
{ // state 370
0x80000000|1, // match move
0x80000000|303, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 371
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 372
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 373
3,453, // $$0
4,98, // token
5,173, // `boolean
6,553, // `class
7,176, // `extends
8,5, // `void
9,229, // `int
10,283, // `while
11,406, // `if
12,125, // `else
13,412, // `for
14,489, // `break
15,192, // `this
16,163, // `false
17,245, // `true
18,215, // `super
19,41, // `null
20,95, // `return
21,327, // `instanceof
22,490, // `new
23,304, // `abstract
24,384, // `assert
25,562, // `byte
26,419, // `case
27,564, // `catch
28,344, // `char
29,403, // `const
30,482, // `continue
31,461, // `default
32,356, // `do
33,155, // `double
34,59, // `enum
35,120, // `final
36,268, // `finally
37,100, // `float
38,168, // `goto
39,487, // `implements
40,54, // `import
41,254, // `interface
42,392, // `long
43,309, // `native
44,389, // `package
45,276, // `private
46,39, // `protected
47,285, // `public
48,538, // `short
49,171, // `static
50,340, // `strictfp
51,94, // `switch
52,348, // `synchronized
53,438, // `throw
54,57, // `throws
55,256, // `transient
56,19, // `try
57,224, // `volatile
58,322, // `!
59,372, // `!=
60,64, // `%
61,447, // `&&
62,398, // `*
63,486, // `(
64,248, // `)
65,319, // `{
66,433, // `}
67,352, // `-
68,14, // `+
69,187, // `=
70,196, // `==
71,162, // `[
72,318, // `]
73,329, // `||
74,136, // `<
75,122, // `<=
76,542, // `,
77,109, // `>
78,101, // `>=
79,137, // `.
80,170, // `;
81,420, // `++
82,218, // `--
83,193, // `/
84,267, // `:
85,545, // ID
86,371, // INTLIT
87,166, // STRINGLIT
88,410, // CHARLIT
131,43, // ws
133,334, // eol
188,342, // token*
  }
,
{ // state 374
2,265, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 375
91,470, // "l"
  }
,
{ // state 376
92,89, // "e"
  }
,
{ // state 377
2,507, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 378
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 379
96,93, // "r"
  }
,
{ // state 380
96,135, // "r"
  }
,
{ // state 381
2,46, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 383
4,258, // token
5,173, // `boolean
6,553, // `class
7,176, // `extends
8,5, // `void
9,229, // `int
10,283, // `while
11,406, // `if
12,125, // `else
13,412, // `for
14,489, // `break
15,192, // `this
16,163, // `false
17,245, // `true
18,215, // `super
19,41, // `null
20,95, // `return
21,327, // `instanceof
22,490, // `new
23,304, // `abstract
24,384, // `assert
25,562, // `byte
26,419, // `case
27,564, // `catch
28,344, // `char
29,403, // `const
30,482, // `continue
31,461, // `default
32,356, // `do
33,155, // `double
34,59, // `enum
35,120, // `final
36,268, // `finally
37,100, // `float
38,168, // `goto
39,487, // `implements
40,54, // `import
41,254, // `interface
42,392, // `long
43,309, // `native
44,389, // `package
45,276, // `private
46,39, // `protected
47,285, // `public
48,538, // `short
49,171, // `static
50,340, // `strictfp
51,94, // `switch
52,348, // `synchronized
53,438, // `throw
54,57, // `throws
55,256, // `transient
56,19, // `try
57,224, // `volatile
58,322, // `!
59,372, // `!=
60,64, // `%
61,447, // `&&
62,398, // `*
63,486, // `(
64,248, // `)
65,319, // `{
66,433, // `}
67,352, // `-
68,14, // `+
69,187, // `=
70,196, // `==
71,162, // `[
72,318, // `]
73,329, // `||
74,136, // `<
75,122, // `<=
76,542, // `,
77,109, // `>
78,101, // `>=
79,137, // `.
80,170, // `;
81,420, // `++
82,218, // `--
83,193, // `/
84,267, // `:
85,545, // ID
86,371, // INTLIT
87,166, // STRINGLIT
88,410, // CHARLIT
  }
,
{ // state 384
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 385
94,141, // "n"
  }
,
{ // state 386
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 387
105,287, // "w"
  }
,
{ // state 388
90,443, // "o"
  }
,
{ // state 389
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 390
2,288, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 391
96,426, // "r"
  }
,
{ // state 392
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 394
92,62, // "e"
  }
,
{ // state 395
191,MIN_REDUCTION+221, // $NT
  }
,
{ // state 396
98,145, // "c"
  }
,
{ // state 397
101,123, // "t"
  }
,
{ // state 398
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 399
104,114, // "i"
  }
,
{ // state 400
2,235, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 401
96,274, // "r"
  }
,
{ // state 402
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 403
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 404
101,259, // "t"
  }
,
{ // state 405
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 406
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 407
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 408
99,17, // "s"
  }
,
{ // state 409
2,477, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 410
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 411
2,475, // ws*
131,425, // ws
133,334, // eol
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 413
0x80000000|531, // match move
0x80000000|182, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 414
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 415
0x80000000|1, // match move
0x80000000|498, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 416
2,219, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 418
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 419
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 420
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 421
110,201, // "y"
  }
,
{ // state 422
93,255, // "a"
  }
,
{ // state 423
-1, // $$start
-1, // start
475, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
468, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
210, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
330, // intLit2
450, // "0"
209, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
450, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
8, // digit+
MIN_REDUCTION+196, // $
-1, // $NT
  }
,
{ // state 424
2,73, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|374, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 427
92,199, // "e"
  }
,
{ // state 428
96,269, // "r"
  }
,
{ // state 429
0x80000000|1, // match move
0x80000000|86, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 430
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 431
102,186, // "d"
  }
,
{ // state 432
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 434
2,107, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 435
98,174, // "c"
  }
,
{ // state 436
89,395, // "b"
90,395, // "o"
91,395, // "l"
92,395, // "e"
93,395, // "a"
94,395, // "n"
96,395, // "r"
97,395, // "k"
98,395, // "c"
99,395, // "s"
100,395, // "x"
101,395, // "t"
102,395, // "d"
103,395, // "f"
104,395, // "i"
105,395, // "w"
106,395, // "u"
107,395, // "p"
108,395, // "h"
109,395, // "v"
110,395, // "y"
111,395, // "m"
112,395, // "g"
113,395, // "z"
124,251, // "0"
126,181, // letter
127,513, // digit
128,9, // "_"
129,395, // {"A".."Z" "j" "q"}
130,251, // {"1".."9"}
  }
,
{ // state 437
0x80000000|1, // match move
0x80000000|557, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 438
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 439
92,82, // "e"
  }
,
{ // state 440
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 441
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 442
0x80000000|1, // match move
0x80000000|377, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 443
103,79, // "f"
  }
,
{ // state 444
94,138, // "n"
  }
,
{ // state 445
2,190, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 446
98,519, // "c"
  }
,
{ // state 447
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 448
2,532, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 449
2,355, // ws*
106,83, // "u"
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 450
0x80000000|104, // match move
0x80000000|402, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 451
91,421, // "l"
  }
,
{ // state 452
101,512, // "t"
105,524, // "w"
106,153, // "u"
108,152, // "h"
110,385, // "y"
  }
,
{ // state 453
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 454
2,263, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 455
94,506, // "n"
  }
,
{ // state 456
101,376, // "t"
  }
,
{ // state 457
2,288, // ws*
131,425, // ws
133,334, // eol
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|52, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 459
2,222, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 460
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 461
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 462
92,261, // "e"
  }
,
{ // state 463
2,479, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 465
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 466
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 467
2,197, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 468
90,203, // "o"
  }
,
{ // state 469
2,146, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 470
92,481, // "e"
  }
,
{ // state 471
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 473
2,548, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 474
115,390, // "="
  }
,
{ // state 475
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 476
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 477
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 478
2,347, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 479
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 480
96,88, // "r"
108,369, // "h"
  }
,
{ // state 481
0x80000000|1, // match move
0x80000000|130, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 482
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 483
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 484
0x80000000|1, // match move
0x80000000|409, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 485
99,300, // "s"
  }
,
{ // state 486
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 487
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 489
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 491
93,358, // "a"
  }
,
{ // state 492
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 493
92,257, // "e"
  }
,
{ // state 494
0x80000000|1, // match move
0x80000000|555, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 495
111,246, // "m"
  }
,
{ // state 496
0x80000000|1, // match move
0x80000000|151, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 497
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 498
2,27, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 499
92,144, // "e"
93,214, // "a"
106,191, // "u"
  }
,
{ // state 500
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 501
91,240, // "l"
  }
,
{ // state 502
2,567, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 503
101,20, // "t"
  }
,
{ // state 504
92,228, // "e"
  }
,
{ // state 505
93,336, // "a"
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|445, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 507
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 508
99,230, // "s"
  }
,
{ // state 509
90,139, // "o"
91,185, // "l"
  }
,
{ // state 510
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 511
0x80000000|1, // match move
0x80000000|416, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 512
93,397, // "a"
96,121, // "r"
  }
,
{ // state 513
191,MIN_REDUCTION+219, // $NT
  }
,
{ // state 514
98,200, // "c"
  }
,
{ // state 515
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 516
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 517
93,129, // "a"
104,364, // "i"
106,102, // "u"
110,299, // "y"
  }
,
{ // state 518
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 519
0x80000000|1, // match move
0x80000000|448, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 520
91,178, // "l"
  }
,
{ // state 521
-1, // $$start
-1, // start
471, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
173, // `boolean
553, // `class
176, // `extends
5, // `void
229, // `int
283, // `while
406, // `if
125, // `else
412, // `for
489, // `break
192, // `this
163, // `false
245, // `true
215, // `super
41, // `null
95, // `return
327, // `instanceof
490, // `new
304, // `abstract
384, // `assert
562, // `byte
419, // `case
564, // `catch
344, // `char
403, // `const
482, // `continue
461, // `default
356, // `do
155, // `double
59, // `enum
120, // `final
268, // `finally
100, // `float
168, // `goto
487, // `implements
54, // `import
254, // `interface
392, // `long
309, // `native
389, // `package
276, // `private
39, // `protected
285, // `public
538, // `short
171, // `static
340, // `strictfp
94, // `switch
348, // `synchronized
438, // `throw
57, // `throws
256, // `transient
19, // `try
224, // `volatile
322, // `!
372, // `!=
64, // `%
447, // `&&
398, // `*
486, // `(
248, // `)
319, // `{
433, // `}
352, // `-
14, // `+
187, // `=
196, // `==
162, // `[
318, // `]
329, // `||
136, // `<
122, // `<=
542, // `,
109, // `>
101, // `>=
137, // `.
170, // `;
420, // `++
218, // `--
193, // `/
267, // `:
545, // ID
371, // INTLIT
166, // STRINGLIT
410, // CHARLIT
351, // "b"
-1, // "o"
325, // "l"
349, // "e"
569, // "a"
499, // "n"
-1, // idChar
291, // "r"
-1, // "k"
188, // "c"
452, // "s"
-1, // "x"
480, // "t"
558, // "d"
270, // "f"
360, // "i"
48, // "w"
-1, // "u"
321, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
7, // "g"
-1, // "z"
115, // "!"
474, // "="
77, // "%"
341, // "&"
434, // "*"
127, // "("
467, // ")"
469, // "+"
345, // "-"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
425, // ws
156, // {9 " "}
334, // eol
510, // {10}
221, // {13}
132, // {130}
324, // {131}
307, // {132}
158, // {133}
134, // {134}
515, // {135}
314, // {136}
301, // {137}
472, // {138}
565, // {139}
432, // {140}
111, // {141}
382, // {142}
492, // {143}
124, // {144}
417, // {145}
239, // {146}
317, // {147}
350, // {148}
272, // {149}
362, // {150}
460, // {151}
533, // {152}
147, // {153}
247, // {154}
488, // {155}
189, // {156}
164, // {157}
367, // {179}
335, // {180}
70, // {181}
66, // {182}
279, // {183}
483, // {184}
271, // {185}
10, // {186}
418, // {187}
315, // {188}
90, // {189}
430, // {190}
568, // {191}
161, // {192}
103, // {193}
25, // {194}
465, // {195}
112, // {196}
216, // {197}
523, // {198}
3, // {199}
56, // {200}
91, // {201}
560, // {202}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 522
92,167, // "e"
  }
,
{ // state 523
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 524
104,250, // "i"
  }
,
{ // state 525
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 526
2,500, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 527
94,320, // "n"
  }
,
{ // state 528
91,212, // "l"
  }
,
{ // state 529
96,204, // "r"
  }
,
{ // state 530
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 531
101,512, // "t"
105,524, // "w"
106,153, // "u"
108,152, // "h"
110,385, // "y"
  }
,
{ // state 532
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 533
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 534
93,253, // "a"
  }
,
{ // state 535
104,262, // "i"
  }
,
{ // state 536
102,405, // "d"
  }
,
{ // state 537
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 538
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 539
2,45, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 540
2,440, // ws*
131,425, // ws
133,334, // eol
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 541
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 543
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 544
2,231, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 546
2,206, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 547
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 548
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 549
92,266, // "e"
  }
,
{ // state 550
107,509, // "p"
  }
,
{ // state 551
96,244, // "r"
  }
,
{ // state 552
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 553
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 554
92,343, // "e"
  }
,
{ // state 555
2,407, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 556
101,205, // "t"
  }
,
{ // state 557
2,18, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 558
90,42, // "o"
92,180, // "e"
  }
,
{ // state 559
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 561
0x80000000|1, // match move
0x80000000|459, // no-match move
0x80000000|436, // NT-test-match state for idChar
  }
,
{ // state 562
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 563
94,277, // "n"
  }
,
{ // state 564
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 566
98,16, // "c"
  }
,
{ // state 567
131,43, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 568
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 569
89,354, // "b"
99,508, // "s"
  }
,
{ // state 570
2,541, // ws*
131,425, // ws
132,156, // {9 " "}
133,334, // eol
134,510, // {10}
135,221, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[571][];
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
// token* ::= token* token
(188<<16)+2,
// token* ::= token
(188<<16)+1,
// digit++ ::= digit+ !digit
(125<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(189<<16)+1,
// digit+ ::= digit+ digit
(189<<16)+2,
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
164, // 179
165, // 180
166, // 181
167, // 182
168, // 183
169, // 184
170, // 185
171, // 186
172, // 187
173, // 188
174, // 189
175, // 190
176, // 191
177, // 192
178, // 193
179, // 194
180, // 195
181, // 196
182, // 197
183, // 198
184, // 199
185, // 200
186, // 201
187, // 202
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
"`if ::= {179}", // 256
"`implements ::= {180}", // 257
"`import ::= {181}", // 258
"`instanceof ::= {182}", // 259
"`int ::= {183}", // 260
"`interface ::= {184}", // 261
"`long ::= {185}", // 262
"`native ::= {186}", // 263
"`new ::= {187}", // 264
"`null ::= {188}", // 265
"`package ::= {189}", // 266
"`private ::= {190}", // 267
"`protected ::= {191}", // 268
"`public ::= {192}", // 269
"`return ::= {193}", // 270
"`short ::= {194}", // 271
"`static ::= {195}", // 272
"`strictfp ::= {196}", // 273
"`super ::= {197}", // 274
"`switch ::= {198}", // 275
"`synchronized ::= {199}", // 276
"`this ::= {200}", // 277
"`throw ::= {201}", // 278
"`throws ::= {202}", // 279
"token* ::= token* token", // 280
"token* ::= token* token", // 281
"digit++ ::= digit+ !digit", // 282
"ws* ::= ws* ws", // 283
"ws* ::= ws* ws", // 284
"digit+ ::= digit", // 285
"digit+ ::= digit+ digit", // 286
"", // 287
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
    { // 256: `if ::= {179} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `implements ::= {180} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `import ::= {181} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `instanceof ::= {182} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `int ::= {183} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `interface ::= {184} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `long ::= {185} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `native ::= {186} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `new ::= {187} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `null ::= {188} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `package ::= {189} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `private ::= {190} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `protected ::= {191} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `public ::= {192} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `return ::= {193} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `short ::= {194} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `static ::= {195} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `strictfp ::= {196} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `super ::= {197} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `switch ::= {198} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `synchronized ::= {199} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `this ::= {200} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `throw ::= {201} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `throws ::= {202} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 281: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 282: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 283: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 284: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 285: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 286: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 287: $$0 ::= token* @pass
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
