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
public int getEofSym() { return 158; }
public int getNttSym() { return 159; }
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
"reserved",
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
"\"/\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\":\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"}\"",
"\"|\"",
"intLit2",
"\"0\"",
"digit++",
"digit",
"{\"1\"..\"9\"}",
"\"\'\"",
"printable",
"\'\"\'",
"idChar++",
"letter",
"\"_\"",
"{\"A\"..\"Z\" \"j\" \"q\"}",
"\" \"",
"{\"#\"..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"ws",
"9",
"eol",
"10",
"13",
"token*",
"digit+",
"idChar+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 160;}
private static final int MIN_REDUCTION = 688;
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
0x80000000|239, // match move
0x80000000|435, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 1
  }
,
{ // state 2
2,531, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 3
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 4
102,302, // "t"
  }
,
{ // state 5
0x80000000|152, // match move
0x80000000|330, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 6
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 7
2,172, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 8
93,363, // "a"
  }
,
{ // state 9
90,407, // "o"
  }
,
{ // state 10
0x80000000|248, // match move
0x80000000|337, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 11
159,MIN_REDUCTION+312, // $NT
  }
,
{ // state 12
159,MIN_REDUCTION+202, // $NT
  }
,
{ // state 13
109,562, // "h"
  }
,
{ // state 14
92,645, // "e"
  }
,
{ // state 15
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 16
104,279, // "f"
  }
,
{ // state 17
109,132, // "h"
  }
,
{ // state 18
105,360, // "i"
  }
,
{ // state 19
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+218, // $NT
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|633, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 22
100,375, // "s"
  }
,
{ // state 23
159,MIN_REDUCTION+145, // $NT
  }
,
{ // state 24
123,457, // "+"
  }
,
{ // state 25
105,635, // "i"
  }
,
{ // state 26
90,276, // "o"
  }
,
{ // state 27
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 28
159,MIN_REDUCTION+136, // $NT
  }
,
{ // state 29
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 30
2,105, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 31
108,622, // "p"
  }
,
{ // state 32
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 33
100,243, // "s"
  }
,
{ // state 34
0x80000000|164, // match move
0x80000000|391, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 35
92,377, // "e"
  }
,
{ // state 36
0x80000000|194, // match move
0x80000000|658, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 37
137,306, // "0"
140,306, // {"1".."9"}
  }
,
{ // state 38
0x80000000|40, // match move
0x80000000|168, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 39
91,340, // "l"
  }
,
{ // state 40
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 41
94,481, // "n"
  }
,
{ // state 42
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 43
159,MIN_REDUCTION+91, // $NT
  }
,
{ // state 44
100,493, // "s"
102,485, // "t"
  }
,
{ // state 45
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 46
0x80000000|347, // match move
0x80000000|540, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 47
100,647, // "s"
  }
,
{ // state 48
159,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 49
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 50
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 51
1,100, // start
2,36, // ws*
3,467, // $$0
4,114, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
62,483, // `*
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
121,417, // "*"
136,403, // intLit2
138,245, // digit++
139,38, // digit
145,111, // letter
150,517, // ws
152,409, // eol
155,416, // token*
156,10, // digit+
  }
,
{ // state 52
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 53
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+155, // $NT
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 54
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+101, // $NT
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 55
109,399, // "h"
  }
,
{ // state 56
102,90, // "t"
  }
,
{ // state 57
105,358, // "i"
  }
,
{ // state 58
2,639, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 59
92,133, // "e"
  }
,
{ // state 60
2,232, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 62
94,609, // "n"
  }
,
{ // state 63
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 64
2,167, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 65
93,412, // "a"
  }
,
{ // state 66
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 68
113,522, // "g"
  }
,
{ // state 69
90,677, // "o"
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|130, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 71
110,331, // "v"
  }
,
{ // state 72
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 73
102,630, // "t"
  }
,
{ // state 74
159,MIN_REDUCTION+226, // $NT
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 76
2,653, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 77
102,343, // "t"
  }
,
{ // state 78
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 79
125,582, // "-"
  }
,
{ // state 80
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+197, // $NT
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 81
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 82
2,345, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 83
159,MIN_REDUCTION+229, // $NT
  }
,
{ // state 84
94,44, // "n"
  }
,
{ // state 85
2,86, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 86
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 87
2,223, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 88
100,282, // "s"
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|181, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 91
102,406, // "t"
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 93
159,MIN_REDUCTION+208, // $NT
  }
,
{ // state 94
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 95
89,452, // "b"
  }
,
{ // state 96
0x80000000|428, // match move
0x80000000|641, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 97
91,65, // "l"
105,523, // "i"
  }
,
{ // state 98
100,662, // "s"
102,369, // "t"
  }
,
{ // state 99
2,29, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 100
158,MIN_REDUCTION+0, // $
  }
,
{ // state 101
93,147, // "a"
107,118, // "u"
111,365, // "y"
  }
,
{ // state 102
103,527, // "d"
  }
,
{ // state 103
4,315, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
  }
,
{ // state 104
159,MIN_REDUCTION+106, // $NT
  }
,
{ // state 105
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 106
90,414, // "o"
  }
,
{ // state 107
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 108
2,218, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 110
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 111
89,148, // "b"
90,148, // "o"
91,148, // "l"
92,148, // "e"
93,148, // "a"
94,148, // "n"
95,225, // idChar
97,148, // "r"
98,148, // "k"
99,148, // "c"
100,148, // "s"
101,148, // "x"
102,148, // "t"
103,148, // "d"
104,148, // "f"
105,148, // "i"
106,148, // "w"
107,148, // "u"
108,148, // "p"
109,148, // "h"
110,148, // "v"
111,148, // "y"
112,148, // "m"
113,148, // "g"
114,148, // "z"
137,571, // "0"
139,307, // digit
140,571, // {"1".."9"}
144,158, // idChar++
145,476, // letter
146,5, // "_"
147,148, // {"A".."Z" "j" "q"}
157,421, // idChar+
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|656, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 113
91,169, // "l"
94,443, // "n"
97,16, // "r"
101,670, // "x"
  }
,
{ // state 114
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 115
102,461, // "t"
  }
,
{ // state 116
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 117
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 118
92,507, // "e"
  }
,
{ // state 119
159,MIN_REDUCTION+205, // $NT
  }
,
{ // state 120
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 121
90,284, // "o"
105,71, // "i"
  }
,
{ // state 122
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 124
91,477, // "l"
  }
,
{ // state 125
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 126
91,429, // "l"
  }
,
{ // state 127
112,361, // "m"
  }
,
{ // state 128
159,MIN_REDUCTION+223, // $NT
  }
,
{ // state 129
94,186, // "n"
  }
,
{ // state 130
2,436, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 131
90,97, // "o"
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|85, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 134
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 135
2,530, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 137
105,442, // "i"
  }
,
{ // state 138
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 139
0x80000000|491, // match move
0x80000000|593, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 140
105,536, // "i"
  }
,
{ // state 141
5,43, // `boolean
6,381, // `class
7,660, // `extends
8,23, // `void
9,432, // `int
10,465, // `while
11,564, // `if
12,680, // `else
13,453, // `for
14,546, // `break
15,510, // `this
16,104, // `false
17,289, // `true
18,576, // `super
19,341, // `null
20,478, // `return
21,305, // `instanceof
22,675, // `new
23,603, // `abstract
24,585, // `assert
25,486, // `byte
26,646, // `case
27,300, // `catch
28,626, // `char
29,247, // `const
30,328, // `continue
31,380, // `default
32,503, // `do
33,253, // `double
34,385, // `enum
35,295, // `final
36,230, // `finally
37,202, // `float
38,501, // `goto
39,387, // `implements
40,12, // `import
41,119, // `interface
42,93, // `long
43,386, // `native
44,520, // `package
45,558, // `private
46,575, // `protected
47,317, // `public
48,128, // `short
49,74, // `static
50,83, // `strictfp
51,28, // `switch
52,404, // `synchronized
53,234, // `throw
54,578, // `throws
55,538, // `transient
56,549, // `try
57,556, // `volatile
89,425, // "b"
91,566, // "l"
92,426, // "e"
93,685, // "a"
94,604, // "n"
97,356, // "r"
99,217, // "c"
100,543, // "s"
102,579, // "t"
103,672, // "d"
104,329, // "f"
105,439, // "i"
106,55, // "w"
108,394, // "p"
110,131, // "v"
113,9, // "g"
  }
,
{ // state 142
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 143
2,198, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 144
2,269, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 145
90,469, // "o"
  }
,
{ // state 146
0x80000000|255, // match move
0x80000000|560, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 147
94,498, // "n"
  }
,
{ // state 148
0x80000000|155, // match move
0x80000000|228, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 149
2,291, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 150
109,460, // "h"
  }
,
{ // state 151
159,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 152
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 153
93,364, // "a"
  }
,
{ // state 154
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 157
93,126, // "a"
  }
,
{ // state 158
2,110, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 159
97,440, // "r"
  }
,
{ // state 160
92,473, // "e"
  }
,
{ // state 161
99,150, // "c"
  }
,
{ // state 162
0x80000000|555, // match move
0x80000000|342, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 163
93,338, // "a"
  }
,
{ // state 164
116,472, // "="
  }
,
{ // state 165
106,550, // "w"
  }
,
{ // state 166
92,470, // "e"
  }
,
{ // state 167
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 169
100,529, // "s"
  }
,
{ // state 170
100,378, // "s"
  }
,
{ // state 171
2,78, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 172
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 173
90,664, // "o"
  }
,
{ // state 174
108,160, // "p"
  }
,
{ // state 175
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 176
2,568, // ws*
150,517, // ws
152,409, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 177
159,MIN_REDUCTION+315, // $NT
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 178
2,80, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 179
-1, // $$start
100, // start
36, // ws*
467, // $$0
114, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
655, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
479, // "b"
479, // "o"
479, // "l"
479, // "e"
479, // "a"
479, // "n"
-1, // idChar
-1, // reserved
479, // "r"
479, // "k"
479, // "c"
479, // "s"
479, // "x"
479, // "t"
479, // "d"
479, // "f"
479, // "i"
479, // "w"
479, // "u"
479, // "p"
479, // "h"
479, // "v"
479, // "y"
479, // "m"
479, // "g"
479, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
-1, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
403, // intLit2
541, // "0"
245, // digit++
38, // digit
541, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
111, // letter
-1, // "_"
479, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
416, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 180
2,50, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 181
2,308, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 182
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 183
2,396, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 185
89,148, // "b"
90,148, // "o"
91,148, // "l"
92,148, // "e"
93,148, // "a"
94,148, // "n"
95,515, // idChar
97,148, // "r"
98,148, // "k"
99,148, // "c"
100,148, // "s"
101,148, // "x"
102,148, // "t"
103,148, // "d"
104,148, // "f"
105,148, // "i"
106,148, // "w"
107,148, // "u"
108,148, // "p"
109,148, // "h"
110,148, // "v"
111,148, // "y"
112,148, // "m"
113,148, // "g"
114,148, // "z"
137,571, // "0"
139,307, // digit
140,571, // {"1".."9"}
145,476, // letter
146,5, // "_"
147,148, // {"A".."Z" "j" "q"}
  }
,
{ // state 186
107,595, // "u"
  }
,
{ // state 187
141,278, // "'"
  }
,
{ // state 188
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 189
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 190
2,94, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 192
2,257, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 193
0x80000000|368, // match move
0x80000000|250, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|339, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 195
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 198
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 200
98,611, // "k"
  }
,
{ // state 201
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 202
159,MIN_REDUCTION+193, // $NT
  }
,
{ // state 203
2,431, // ws*
150,517, // ws
152,409, // eol
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 204
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 205
1,100, // start
2,36, // ws*
3,467, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
89,425, // "b"
91,566, // "l"
92,426, // "e"
93,685, // "a"
94,604, // "n"
97,356, // "r"
99,217, // "c"
100,543, // "s"
102,579, // "t"
103,672, // "d"
104,329, // "f"
105,439, // "i"
106,55, // "w"
108,394, // "p"
110,131, // "v"
113,9, // "g"
155,416, // token*
158,MIN_REDUCTION+1, // $
  }
,
{ // state 206
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 207
2,212, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 208
104,592, // "f"
  }
,
{ // state 209
159,MIN_REDUCTION+310, // $NT
  }
,
{ // state 210
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 211
0x80000000|584, // match move
0x80000000|661, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 212
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+152, // $NT
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 213
2,54, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 214
92,597, // "e"
  }
,
{ // state 215
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 216
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 217
90,84, // "o"
91,163, // "l"
93,98, // "a"
109,514, // "h"
  }
,
{ // state 218
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 219
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 220
91,628, // "l"
  }
,
{ // state 221
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 223
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 225
0x80000000|676, // match move
0x80000000|303, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 226
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 227
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 229
2,572, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 230
159,MIN_REDUCTION+190, // $NT
  }
,
{ // state 231
99,548, // "c"
  }
,
{ // state 232
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 233
92,532, // "e"
  }
,
{ // state 234
159,MIN_REDUCTION+235, // $NT
  }
,
{ // state 235
0x80000000|1, // match move
0x80000000|488, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 236
143,190, // '"'
  }
,
{ // state 237
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+125, // $NT
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 238
94,68, // "n"
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|384, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 240
94,112, // "n"
  }
,
{ // state 241
92,634, // "e"
  }
,
{ // state 242
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 243
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 244
0x80000000|563, // match move
0x80000000|224, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 245
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 246
3,544, // $$0
4,114, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
62,483, // `*
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
121,417, // "*"
136,403, // intLit2
138,245, // digit++
139,38, // digit
145,111, // letter
150,48, // ws
152,409, // eol
155,416, // token*
156,10, // digit+
  }
,
{ // state 247
159,MIN_REDUCTION+169, // $NT
  }
,
{ // state 248
137,541, // "0"
139,244, // digit
140,541, // {"1".."9"}
  }
,
{ // state 249
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 250
-1, // $$start
-1, // start
401, // ws*
-1, // $$0
MIN_REDUCTION+234, // token
199, // `boolean
667, // `class
201, // `extends
6, // `void
273, // `int
344, // `while
495, // `if
142, // `else
502, // `for
589, // `break
221, // `this
184, // `false
297, // `true
256, // `super
45, // `null
109, // `return
400, // `instanceof
590, // `new
371, // `abstract
464, // `assert
678, // `byte
511, // `case
681, // `catch
420, // `char
492, // `const
581, // `continue
557, // `default
433, // `do
175, // `double
67, // `enum
136, // `final
326, // `finally
116, // `float
191, // `goto
588, // `implements
61, // `import
310, // `interface
474, // `long
376, // `native
471, // `package
335, // `private
42, // `protected
348, // `public
648, // `short
197, // `static
415, // `strictfp
107, // `switch
424, // `synchronized
528, // `throw
63, // `throws
312, // `transient
20, // `try
267, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
-1, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
425, // "b"
MIN_REDUCTION+234, // "o"
566, // "l"
426, // "e"
685, // "a"
604, // "n"
-1, // idChar
-1, // reserved
356, // "r"
MIN_REDUCTION+234, // "k"
217, // "c"
504, // "s"
MIN_REDUCTION+234, // "x"
579, // "t"
672, // "d"
329, // "f"
439, // "i"
55, // "w"
MIN_REDUCTION+234, // "u"
394, // "p"
MIN_REDUCTION+234, // "h"
131, // "v"
MIN_REDUCTION+234, // "y"
MIN_REDUCTION+234, // "m"
9, // "g"
MIN_REDUCTION+234, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
MIN_REDUCTION+234, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
-1, // intLit2
MIN_REDUCTION+234, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+234, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+234, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+234, // $
MIN_REDUCTION+234, // $NT
  }
,
{ // state 251
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 252
92,666, // "e"
  }
,
{ // state 253
159,MIN_REDUCTION+181, // $NT
  }
,
{ // state 254
102,644, // "t"
  }
,
{ // state 255
4,315, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
  }
,
{ // state 256
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 257
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 258
89,607, // "b"
  }
,
{ // state 259
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 260
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 261
2,459, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 262
2,32, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 263
0x80000000|372, // match move
0x80000000|151, // no-match move
// T-test match for 10:
153,
  }
,
{ // state 264
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 265
2,293, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 268
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 269
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 270
2,359, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 271
0x80000000|205, // match move
0x80000000|179, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 272
93,547, // "a"
  }
,
{ // state 273
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 274
92,521, // "e"
  }
,
{ // state 275
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+173, // $NT
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 276
91,610, // "l"
  }
,
{ // state 277
2,354, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 278
2,299, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 279
93,621, // "a"
  }
,
{ // state 280
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 281
0x80000000|352, // match move
0x80000000|296, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 282
0x80000000|1, // match move
0x80000000|213, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 283
2,313, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 284
102,519, // "t"
  }
,
{ // state 285
105,304, // "i"
109,399, // "h"
  }
,
{ // state 286
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 287
105,350, // "i"
  }
,
{ // state 288
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 289
159,MIN_REDUCTION+142, // $NT
  }
,
{ // state 290
2,505, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 291
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 292
1,100, // start
2,36, // ws*
3,467, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
155,416, // token*
  }
,
{ // state 293
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 294
102,599, // "t"
  }
,
{ // state 295
159,MIN_REDUCTION+187, // $NT
  }
,
{ // state 296
-1, // $$start
-1, // start
-1, // ws*
544, // $$0
114, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
655, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
479, // "b"
479, // "o"
479, // "l"
479, // "e"
479, // "a"
479, // "n"
-1, // idChar
-1, // reserved
479, // "r"
479, // "k"
479, // "c"
479, // "s"
479, // "x"
479, // "t"
479, // "d"
479, // "f"
479, // "i"
479, // "w"
479, // "u"
479, // "p"
479, // "h"
479, // "v"
479, // "y"
479, // "m"
479, // "g"
479, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
-1, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
403, // intLit2
541, // "0"
245, // digit++
38, // digit
541, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
111, // letter
-1, // "_"
479, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
48, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
416, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 297
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 298
92,679, // "e"
  }
,
{ // state 299
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 300
159,MIN_REDUCTION+163, // $NT
  }
,
{ // state 301
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 302
107,638, // "u"
  }
,
{ // state 303
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 304
102,683, // "t"
  }
,
{ // state 305
159,MIN_REDUCTION+115, // $NT
  }
,
{ // state 306
159,MIN_REDUCTION+305, // $NT
  }
,
{ // state 307
0x80000000|266, // match move
0x80000000|332, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 308
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+149, // $NT
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 309
98,123, // "k"
  }
,
{ // state 310
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 311
97,583, // "r"
  }
,
{ // state 312
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 313
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|76, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 315
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 316
0x80000000|1, // match move
0x80000000|411, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 317
159,MIN_REDUCTION+127, // $NT
  }
,
{ // state 318
2,204, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 319
97,16, // "r"
  }
,
{ // state 320
110,668, // "v"
  }
,
{ // state 321
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 322
2,237, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 323
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 324
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 325
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 327
102,475, // "t"
  }
,
{ // state 328
159,MIN_REDUCTION+172, // $NT
  }
,
{ // state 329
90,489, // "o"
91,397, // "l"
93,382, // "a"
105,534, // "i"
  }
,
{ // state 330
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 331
93,73, // "a"
  }
,
{ // state 332
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 333
0x80000000|1, // match move
0x80000000|422, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 334
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 336
102,33, // "t"
  }
,
{ // state 337
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 338
100,47, // "s"
  }
,
{ // state 339
0x80000000|665, // match move
0x80000000|246, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 340
102,444, // "t"
  }
,
{ // state 341
159,MIN_REDUCTION+124, // $NT
  }
,
{ // state 342
-1, // $$start
-1, // start
600, // ws*
-1, // $$0
MIN_REDUCTION+117, // token
199, // `boolean
667, // `class
201, // `extends
6, // `void
273, // `int
344, // `while
495, // `if
142, // `else
502, // `for
589, // `break
221, // `this
184, // `false
297, // `true
256, // `super
45, // `null
109, // `return
400, // `instanceof
590, // `new
371, // `abstract
464, // `assert
678, // `byte
511, // `case
681, // `catch
420, // `char
492, // `const
581, // `continue
557, // `default
433, // `do
175, // `double
67, // `enum
136, // `final
326, // `finally
116, // `float
191, // `goto
588, // `implements
61, // `import
310, // `interface
474, // `long
376, // `native
471, // `package
335, // `private
42, // `protected
348, // `public
648, // `short
197, // `static
415, // `strictfp
107, // `switch
424, // `synchronized
528, // `throw
63, // `throws
312, // `transient
20, // `try
267, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
-1, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
425, // "b"
MIN_REDUCTION+117, // "o"
566, // "l"
113, // "e"
685, // "a"
604, // "n"
-1, // idChar
-1, // reserved
356, // "r"
MIN_REDUCTION+117, // "k"
217, // "c"
543, // "s"
MIN_REDUCTION+117, // "x"
579, // "t"
672, // "d"
329, // "f"
439, // "i"
55, // "w"
MIN_REDUCTION+117, // "u"
394, // "p"
MIN_REDUCTION+117, // "h"
131, // "v"
MIN_REDUCTION+117, // "y"
MIN_REDUCTION+117, // "m"
9, // "g"
MIN_REDUCTION+117, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
MIN_REDUCTION+117, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
-1, // intLit2
MIN_REDUCTION+117, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+117, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+117, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+117, // $
MIN_REDUCTION+117, // $NT
  }
,
{ // state 343
93,41, // "a"
  }
,
{ // state 344
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 345
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 346
3,544, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
155,416, // token*
  }
,
{ // state 347
107,95, // "u"
  }
,
{ // state 348
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 349
-1, // $$start
-1, // start
431, // ws*
-1, // $$0
MIN_REDUCTION+177, // token
199, // `boolean
667, // `class
201, // `extends
6, // `void
273, // `int
344, // `while
495, // `if
142, // `else
502, // `for
589, // `break
221, // `this
184, // `false
297, // `true
256, // `super
45, // `null
109, // `return
400, // `instanceof
590, // `new
371, // `abstract
464, // `assert
678, // `byte
511, // `case
681, // `catch
420, // `char
492, // `const
581, // `continue
557, // `default
433, // `do
175, // `double
67, // `enum
136, // `final
326, // `finally
116, // `float
191, // `goto
588, // `implements
61, // `import
310, // `interface
474, // `long
376, // `native
471, // `package
335, // `private
42, // `protected
348, // `public
648, // `short
197, // `static
415, // `strictfp
107, // `switch
424, // `synchronized
528, // `throw
63, // `throws
312, // `transient
20, // `try
267, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
-1, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
425, // "b"
MIN_REDUCTION+177, // "o"
566, // "l"
426, // "e"
685, // "a"
604, // "n"
-1, // idChar
-1, // reserved
356, // "r"
MIN_REDUCTION+177, // "k"
217, // "c"
543, // "s"
MIN_REDUCTION+177, // "x"
579, // "t"
672, // "d"
329, // "f"
439, // "i"
55, // "w"
95, // "u"
394, // "p"
MIN_REDUCTION+177, // "h"
131, // "v"
MIN_REDUCTION+177, // "y"
MIN_REDUCTION+177, // "m"
9, // "g"
MIN_REDUCTION+177, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
MIN_REDUCTION+177, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
-1, // intLit2
MIN_REDUCTION+177, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+177, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+177, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+177, // $
MIN_REDUCTION+177, // $NT
  }
,
{ // state 350
99,408, // "c"
  }
,
{ // state 351
0x80000000|586, // match move
0x80000000|193, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 352
3,544, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
89,425, // "b"
91,566, // "l"
92,426, // "e"
93,685, // "a"
94,604, // "n"
97,356, // "r"
99,217, // "c"
100,543, // "s"
102,579, // "t"
103,672, // "d"
104,329, // "f"
105,439, // "i"
106,55, // "w"
108,394, // "p"
110,131, // "v"
113,9, // "g"
155,416, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 353
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 354
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 355
2,373, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 356
92,4, // "e"
  }
,
{ // state 357
0x80000000|591, // match move
0x80000000|393, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 358
114,14, // "z"
  }
,
{ // state 359
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 360
92,62, // "e"
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 362
92,643, // "e"
  }
,
{ // state 363
102,75, // "t"
  }
,
{ // state 364
99,56, // "c"
  }
,
{ // state 365
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 366
0x80000000|1, // match move
0x80000000|608, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 367
2,625, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 368
2,401, // ws*
150,517, // ws
152,409, // eol
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 369
99,13, // "c"
  }
,
{ // state 370
2,632, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 371
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 372
153,624, // {10}
  }
,
{ // state 373
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 374
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 375
92,447, // "e"
  }
,
{ // state 376
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 377
0x80000000|1, // match move
0x80000000|462, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 378
0x80000000|1, // match move
0x80000000|649, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 379
100,77, // "s"
102,445, // "t"
  }
,
{ // state 380
159,MIN_REDUCTION+175, // $NT
  }
,
{ // state 381
159,MIN_REDUCTION+97, // $NT
  }
,
{ // state 382
91,22, // "l"
  }
,
{ // state 383
102,35, // "t"
  }
,
{ // state 384
0x80000000|292, // match move
0x80000000|51, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 385
159,MIN_REDUCTION+184, // $NT
  }
,
{ // state 386
159,MIN_REDUCTION+211, // $NT
  }
,
{ // state 387
159,MIN_REDUCTION+199, // $NT
  }
,
{ // state 388
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 389
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 390
0x80000000|552, // match move
0x80000000|673, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 391
2,551, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 392
103,88, // "d"
  }
,
{ // state 393
2,463, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 394
93,525, // "a"
97,121, // "r"
107,258, // "u"
  }
,
{ // state 395
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 396
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 397
90,8, // "o"
  }
,
{ // state 398
90,238, // "o"
111,235, // "y"
  }
,
{ // state 399
105,124, // "i"
  }
,
{ // state 400
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 401
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 403
2,334, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 404
159,MIN_REDUCTION+232, // $NT
  }
,
{ // state 405
116,64, // "="
  }
,
{ // state 406
104,31, // "f"
  }
,
{ // state 407
102,69, // "t"
  }
,
{ // state 408
0x80000000|1, // match move
0x80000000|322, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 409
159,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 410
113,59, // "g"
  }
,
{ // state 411
2,657, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 412
102,25, // "t"
  }
,
{ // state 413
4,315, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
83,222, // `/
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
145,111, // letter
  }
,
{ // state 414
94,57, // "n"
  }
,
{ // state 415
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 416
0x80000000|598, // match move
0x80000000|605, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|183, // no-match move
// T-test match for "/":
122,
  }
,
{ // state 418
118,265, // "&"
  }
,
{ // state 419
0x80000000|1, // match move
0x80000000|516, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 420
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 421
0x80000000|185, // match move
0x80000000|196, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 422
2,674, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 423
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+245, // $NT
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 425
90,26, // "o"
97,362, // "r"
111,383, // "y"
  }
,
{ // state 426
91,169, // "l"
94,443, // "n"
101,670, // "x"
  }
,
{ // state 427
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 428
4,315, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
89,425, // "b"
91,566, // "l"
92,426, // "e"
93,685, // "a"
94,604, // "n"
97,356, // "r"
99,217, // "c"
100,543, // "s"
102,579, // "t"
103,672, // "d"
104,329, // "f"
105,439, // "i"
106,55, // "w"
108,394, // "p"
110,131, // "v"
113,9, // "g"
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 429
0x80000000|542, // match move
0x80000000|629, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 430
100,115, // "s"
  }
,
{ // state 431
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 432
159,MIN_REDUCTION+118, // $NT
  }
,
{ // state 433
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 434
0x80000000|405, // match move
0x80000000|367, // no-match move
// T-test match for "=":
116,
  }
,
{ // state 435
0x80000000|139, // match move
0x80000000|271, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 436
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+146, // $NT
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 437
107,39, // "u"
  }
,
{ // state 438
2,268, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 439
94,379, // "n"
104,617, // "f"
112,663, // "m"
  }
,
{ // state 440
102,596, // "t"
  }
,
{ // state 441
93,482, // "a"
97,623, // "r"
109,446, // "h"
  }
,
{ // state 442
99,91, // "c"
  }
,
{ // state 443
107,127, // "u"
  }
,
{ // state 444
0x80000000|1, // match move
0x80000000|654, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 445
0x80000000|559, // match move
0x80000000|162, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 446
97,145, // "r"
105,170, // "i"
  }
,
{ // state 447
0x80000000|1, // match move
0x80000000|370, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 448
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 449
2,120, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 450
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 451
2,323, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 452
91,567, // "l"
  }
,
{ // state 453
159,MIN_REDUCTION+109, // $NT
  }
,
{ // state 454
0x80000000|79, // match move
0x80000000|180, // no-match move
// T-test match for "-":
125,
  }
,
{ // state 455
92,102, // "e"
  }
,
{ // state 456
2,613, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 457
2,286, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 458
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 459
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 460
97,106, // "r"
  }
,
{ // state 461
97,153, // "r"
  }
,
{ // state 462
2,53, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+156, // $NT
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 463
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 464
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 465
159,MIN_REDUCTION+148, // $NT
  }
,
{ // state 466
94,161, // "n"
  }
,
{ // state 467
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 468
0x80000000|103, // match move
0x80000000|413, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 469
106,351, // "w"
  }
,
{ // state 470
90,533, // "o"
  }
,
{ // state 471
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 472
2,353, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 473
97,518, // "r"
  }
,
{ // state 474
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|207, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 476
0x80000000|601, // match move
0x80000000|458, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 477
92,70, // "e"
  }
,
{ // state 478
159,MIN_REDUCTION+130, // $NT
  }
,
{ // state 479
159,MIN_REDUCTION+313, // $NT
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 480
2,251, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 481
99,166, // "c"
  }
,
{ // state 482
102,140, // "t"
  }
,
{ // state 483
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 484
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 485
105,129, // "i"
  }
,
{ // state 486
159,MIN_REDUCTION+157, // $NT
  }
,
{ // state 487
2,66, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 488
2,280, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 489
97,333, // "r"
  }
,
{ // state 490
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 491
1,100, // start
2,36, // ws*
3,467, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
155,416, // token*
  }
,
{ // state 492
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 493
102,316, // "t"
  }
,
{ // state 494
0x80000000|1, // match move
0x80000000|561, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 495
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 496
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 497
0x80000000|24, // match move
0x80000000|82, // no-match move
// T-test match for "+":
123,
  }
,
{ // state 498
100,18, // "s"
  }
,
{ // state 499
2,573, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+165, // $NT
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 500
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 501
159,MIN_REDUCTION+196, // $NT
  }
,
{ // state 502
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 503
159,MIN_REDUCTION+178, // $NT
  }
,
{ // state 504
0x80000000|640, // match move
0x80000000|211, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 505
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 506
-1, // $$start
-1, // start
568, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
199, // `boolean
667, // `class
201, // `extends
6, // `void
273, // `int
344, // `while
495, // `if
142, // `else
502, // `for
589, // `break
221, // `this
184, // `false
297, // `true
256, // `super
45, // `null
109, // `return
400, // `instanceof
590, // `new
371, // `abstract
464, // `assert
678, // `byte
511, // `case
681, // `catch
420, // `char
492, // `const
581, // `continue
557, // `default
433, // `do
175, // `double
67, // `enum
136, // `final
326, // `finally
116, // `float
191, // `goto
588, // `implements
61, // `import
310, // `interface
474, // `long
376, // `native
471, // `package
335, // `private
42, // `protected
348, // `public
648, // `short
197, // `static
415, // `strictfp
107, // `switch
424, // `synchronized
528, // `throw
63, // `throws
312, // `transient
20, // `try
267, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
-1, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
425, // "b"
MIN_REDUCTION+186, // "o"
398, // "l"
426, // "e"
685, // "a"
604, // "n"
-1, // idChar
-1, // reserved
356, // "r"
MIN_REDUCTION+186, // "k"
217, // "c"
543, // "s"
MIN_REDUCTION+186, // "x"
579, // "t"
672, // "d"
329, // "f"
439, // "i"
55, // "w"
MIN_REDUCTION+186, // "u"
394, // "p"
MIN_REDUCTION+186, // "h"
131, // "v"
MIN_REDUCTION+186, // "y"
MIN_REDUCTION+186, // "m"
9, // "g"
MIN_REDUCTION+186, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
MIN_REDUCTION+186, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+186, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+186, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+186, // $
MIN_REDUCTION+186, // $NT
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
{ // state 507
0x80000000|1, // match move
0x80000000|602, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 508
2,260, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 509
135,636, // "|"
  }
,
{ // state 510
159,MIN_REDUCTION+139, // $NT
  }
,
{ // state 511
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 513
111,235, // "y"
  }
,
{ // state 514
93,311, // "a"
  }
,
{ // state 515
0x80000000|288, // match move
0x80000000|210, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 516
2,81, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 517
159,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 518
0x80000000|1, // match move
0x80000000|451, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 519
92,231, // "e"
  }
,
{ // state 520
159,MIN_REDUCTION+214, // $NT
  }
,
{ // state 521
97,327, // "r"
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 523
103,215, // "d"
  }
,
{ // state 524
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 525
99,200, // "c"
  }
,
{ // state 526
89,479, // "b"
90,479, // "o"
91,479, // "l"
92,479, // "e"
93,479, // "a"
94,479, // "n"
97,479, // "r"
98,479, // "k"
99,479, // "c"
100,479, // "s"
101,479, // "x"
102,479, // "t"
103,479, // "d"
104,479, // "f"
105,479, // "i"
106,479, // "w"
107,479, // "u"
108,479, // "p"
109,479, // "h"
110,479, // "v"
111,479, // "y"
112,479, // "m"
113,479, // "g"
114,479, // "z"
137,306, // "0"
139,620, // digit
140,306, // {"1".."9"}
145,209, // letter
146,11, // "_"
147,479, // {"A".."Z" "j" "q"}
  }
,
{ // state 527
0x80000000|1, // match move
0x80000000|671, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 528
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 529
92,92, // "e"
  }
,
{ // state 530
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 531
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 532
0x80000000|1, // match move
0x80000000|456, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 533
104,89, // "f"
  }
,
{ // state 534
94,157, // "n"
  }
,
{ // state 535
2,219, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 536
99,627, // "c"
  }
,
{ // state 537
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 538
159,MIN_REDUCTION+241, // $NT
  }
,
{ // state 539
2,642, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 540
0x80000000|203, // match move
0x80000000|349, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 541
0x80000000|122, // match move
0x80000000|490, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 542
91,513, // "l"
  }
,
{ // state 543
102,619, // "t"
106,631, // "w"
107,174, // "u"
109,173, // "h"
111,466, // "y"
  }
,
{ // state 544
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 545
2,321, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 546
159,MIN_REDUCTION+94, // $NT
  }
,
{ // state 547
94,612, // "n"
  }
,
{ // state 548
102,455, // "t"
  }
,
{ // state 549
159,MIN_REDUCTION+244, // $NT
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|58, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 551
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 552
116,192, // "="
  }
,
{ // state 553
0x80000000|1, // match move
0x80000000|480, // no-match move
// T-test match for {"*" "/"}:
121,
122,
  }
,
{ // state 554
2,264, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+195, // $NT
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 555
2,600, // ws*
150,517, // ws
152,409, // eol
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 556
159,MIN_REDUCTION+247, // $NT
  }
,
{ // state 557
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 558
159,MIN_REDUCTION+217, // $NT
  }
,
{ // state 559
92,319, // "e"
  }
,
{ // state 560
4,315, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
62,483, // `*
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
121,417, // "*"
136,403, // intLit2
138,245, // digit++
139,38, // digit
145,111, // letter
156,10, // digit+
  }
,
{ // state 561
2,577, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 562
0x80000000|1, // match move
0x80000000|686, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 563
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 564
159,MIN_REDUCTION+112, // $NT
  }
,
{ // state 565
2,227, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 566
90,238, // "o"
  }
,
{ // state 567
92,580, // "e"
  }
,
{ // state 568
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 569
0x80000000|346, // match move
0x80000000|652, // no-match move
0x80000000|141, // NT-test-match state for reserved
  }
,
{ // state 570
2,659, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 571
0x80000000|637, // match move
0x80000000|52, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 572
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 573
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+164, // $NT
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 574
2,423, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+246, // $NT
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 575
159,MIN_REDUCTION+220, // $NT
  }
,
{ // state 576
159,MIN_REDUCTION+133, // $NT
  }
,
{ // state 577
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 578
159,MIN_REDUCTION+238, // $NT
  }
,
{ // state 579
97,101, // "r"
109,446, // "h"
  }
,
{ // state 580
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 581
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 582
2,484, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 583
0x80000000|1, // match move
0x80000000|499, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 584
2,684, // ws*
150,517, // ws
152,409, // eol
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 585
159,MIN_REDUCTION+154, // $NT
  }
,
{ // state 586
100,366, // "s"
  }
,
{ // state 587
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 589
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 590
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 591
116,135, // "="
  }
,
{ // state 592
93,437, // "a"
  }
,
{ // state 593
1,100, // start
2,36, // ws*
3,467, // $$0
4,114, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
83,222, // `/
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
145,111, // letter
150,517, // ws
152,409, // eol
155,416, // token*
  }
,
{ // state 594
89,249, // "b"
90,249, // "o"
91,249, // "l"
92,249, // "e"
93,249, // "a"
94,249, // "n"
97,249, // "r"
98,249, // "k"
99,249, // "c"
100,249, // "s"
101,249, // "x"
102,249, // "t"
103,249, // "d"
104,249, // "f"
105,249, // "i"
106,249, // "w"
107,249, // "u"
108,249, // "p"
109,249, // "h"
110,249, // "v"
111,249, // "y"
112,249, // "m"
113,249, // "g"
114,249, // "z"
115,249, // "!"
116,249, // "="
117,249, // "%"
118,249, // "&"
119,249, // "("
120,249, // ")"
121,249, // "*"
122,249, // "/"
123,249, // "+"
124,249, // ","
125,249, // "-"
126,249, // "."
127,249, // ":"
128,249, // ";"
129,249, // "<"
130,249, // ">"
131,249, // "["
132,249, // "]"
133,249, // "{"
134,249, // "}"
135,249, // "|"
137,249, // "0"
140,249, // {"1".."9"}
141,249, // "'"
142,187, // printable
143,249, // '"'
146,249, // "_"
147,249, // {"A".."Z" "j" "q"}
148,249, // " "
149,249, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 595
92,314, // "e"
  }
,
{ // state 596
0x80000000|1, // match move
0x80000000|669, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 597
112,298, // "m"
  }
,
{ // state 598
0x80000000|1, // match move
0x80000000|146, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 599
0x80000000|1, // match move
0x80000000|171, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 600
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 602
2,27, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 603
159,MIN_REDUCTION+151, // $NT
  }
,
{ // state 604
92,165, // "e"
93,254, // "a"
107,220, // "u"
  }
,
{ // state 605
0x80000000|468, // match move
0x80000000|96, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 606
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+239, // $NT
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 607
91,287, // "l"
  }
,
{ // state 608
2,684, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+237, // $NT
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 609
102,21, // "t"
  }
,
{ // state 610
92,272, // "e"
  }
,
{ // state 611
93,410, // "a"
  }
,
{ // state 612
0x80000000|1, // match move
0x80000000|535, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 613
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 614
100,274, // "s"
  }
,
{ // state 615
90,159, // "o"
91,214, // "l"
  }
,
{ // state 616
159,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 617
0x80000000|1, // match move
0x80000000|508, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 618
89,148, // "b"
90,148, // "o"
91,148, // "l"
92,148, // "e"
93,148, // "a"
94,148, // "n"
95,225, // idChar
97,148, // "r"
98,148, // "k"
99,148, // "c"
100,148, // "s"
101,148, // "x"
102,148, // "t"
103,148, // "d"
104,148, // "f"
105,148, // "i"
106,148, // "w"
107,148, // "u"
108,148, // "p"
109,148, // "h"
110,148, // "v"
111,148, // "y"
112,148, // "m"
113,148, // "g"
114,148, // "z"
137,571, // "0"
139,307, // digit
140,571, // {"1".."9"}
144,236, // idChar++
145,476, // letter
146,5, // "_"
147,148, // {"A".."Z" "j" "q"}
157,421, // idChar+
  }
,
{ // state 619
93,482, // "a"
97,137, // "r"
  }
,
{ // state 620
159,MIN_REDUCTION+311, // $NT
  }
,
{ // state 621
99,233, // "c"
  }
,
{ // state 622
0x80000000|1, // match move
0x80000000|355, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 623
93,147, // "a"
105,442, // "i"
107,118, // "u"
111,365, // "y"
  }
,
{ // state 624
159,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 625
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 626
159,MIN_REDUCTION+166, // $NT
  }
,
{ // state 627
0x80000000|1, // match move
0x80000000|539, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 628
91,206, // "l"
  }
,
{ // state 629
0x80000000|176, // match move
0x80000000|506, // no-match move
// T-test match for "*":
121,
  }
,
{ // state 630
92,189, // "e"
  }
,
{ // state 631
105,304, // "i"
  }
,
{ // state 632
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 633
2,606, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+240, // $NT
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 634
94,392, // "n"
  }
,
{ // state 635
91,252, // "l"
  }
,
{ // state 636
2,134, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 638
97,240, // "r"
  }
,
{ // state 639
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 640
102,619, // "t"
106,631, // "w"
107,174, // "u"
109,173, // "h"
111,466, // "y"
  }
,
{ // state 641
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
315, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
655, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
479, // "b"
479, // "o"
479, // "l"
479, // "e"
479, // "a"
479, // "n"
-1, // idChar
-1, // reserved
479, // "r"
479, // "k"
479, // "c"
479, // "s"
479, // "x"
479, // "t"
479, // "d"
479, // "f"
479, // "i"
479, // "w"
479, // "u"
479, // "p"
479, // "h"
479, // "v"
479, // "y"
479, // "m"
479, // "g"
479, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
-1, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
403, // intLit2
541, // "0"
245, // digit++
38, // digit
541, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
111, // letter
-1, // "_"
479, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // token*
10, // digit+
-1, // idChar+
MIN_REDUCTION+332, // $
-1, // $NT
  }
,
{ // state 642
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 643
93,309, // "a"
  }
,
{ // state 644
105,320, // "i"
  }
,
{ // state 645
103,494, // "d"
  }
,
{ // state 646
159,MIN_REDUCTION+160, // $NT
  }
,
{ // state 647
0x80000000|1, // match move
0x80000000|570, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 648
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 649
2,49, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 650
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 652
3,544, // $$0
4,114, // token
58,395, // `!
59,450, // `!=
60,72, // `%
61,537, // `&&
63,587, // `(
64,301, // `)
65,389, // `{
66,524, // `}
67,427, // `-
68,15, // `+
69,216, // `=
70,226, // `==
71,182, // `[
72,388, // `]
73,402, // `||
74,154, // `<
75,138, // `<=
76,651, // `,
77,125, // `>
78,117, // `>=
79,156, // `.
80,195, // `;
81,512, // `++
82,259, // `--
83,222, // `/
84,325, // `:
85,655, // ID
86,448, // INTLIT
87,188, // STRINGLIT
88,500, // CHARLIT
145,111, // letter
150,48, // ws
152,409, // eol
155,416, // token*
  }
,
{ // state 653
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+170, // $NT
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 654
2,275, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 655
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 656
2,242, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 657
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+167, // $NT
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 658
0x80000000|569, // match move
0x80000000|281, // no-match move
// T-test match for "0":
137,
  }
,
{ // state 659
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 660
159,MIN_REDUCTION+103, // $NT
  }
,
{ // state 661
-1, // $$start
-1, // start
684, // ws*
-1, // $$0
MIN_REDUCTION+237, // token
199, // `boolean
667, // `class
201, // `extends
6, // `void
273, // `int
344, // `while
495, // `if
142, // `else
502, // `for
589, // `break
221, // `this
184, // `false
297, // `true
256, // `super
45, // `null
109, // `return
400, // `instanceof
590, // `new
371, // `abstract
464, // `assert
678, // `byte
511, // `case
681, // `catch
420, // `char
492, // `const
581, // `continue
557, // `default
433, // `do
175, // `double
67, // `enum
136, // `final
326, // `finally
116, // `float
191, // `goto
588, // `implements
61, // `import
310, // `interface
474, // `long
376, // `native
471, // `package
335, // `private
42, // `protected
348, // `public
648, // `short
197, // `static
415, // `strictfp
107, // `switch
424, // `synchronized
528, // `throw
63, // `throws
312, // `transient
20, // `try
267, // `volatile
395, // `!
450, // `!=
72, // `%
537, // `&&
-1, // `*
587, // `(
301, // `)
389, // `{
524, // `}
427, // `-
15, // `+
216, // `=
226, // `==
182, // `[
388, // `]
402, // `||
154, // `<
138, // `<=
651, // `,
125, // `>
117, // `>=
156, // `.
195, // `;
512, // `++
259, // `--
222, // `/
325, // `:
-1, // ID
448, // INTLIT
188, // STRINGLIT
500, // CHARLIT
425, // "b"
MIN_REDUCTION+237, // "o"
566, // "l"
426, // "e"
685, // "a"
604, // "n"
-1, // idChar
-1, // reserved
356, // "r"
MIN_REDUCTION+237, // "k"
217, // "c"
543, // "s"
MIN_REDUCTION+237, // "x"
441, // "t"
672, // "d"
329, // "f"
439, // "i"
285, // "w"
174, // "u"
394, // "p"
173, // "h"
131, // "v"
466, // "y"
MIN_REDUCTION+237, // "m"
9, // "g"
MIN_REDUCTION+237, // "z"
357, // "!"
34, // "="
87, // "%"
418, // "&"
144, // "("
565, // ")"
MIN_REDUCTION+237, // "*"
553, // "/"
497, // "+"
449, // ","
454, // "-"
262, // "."
60, // ":"
7, // ";"
434, // "<"
390, // ">"
487, // "["
682, // "]"
283, // "{"
108, // "}"
509, // "|"
-1, // intLit2
MIN_REDUCTION+237, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+237, // {"1".."9"}
594, // "'"
-1, // printable
618, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+237, // {"A".."Z" "j" "q"}
177, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
517, // ws
177, // {9}
409, // eol
616, // {10}
263, // {13}
-1, // token*
-1, // digit+
-1, // idChar+
MIN_REDUCTION+237, // $
MIN_REDUCTION+237, // $NT
  }
,
{ // state 662
92,324, // "e"
  }
,
{ // state 663
108,615, // "p"
  }
,
{ // state 664
97,294, // "r"
  }
,
{ // state 665
3,544, // $$0
4,114, // token
5,199, // `boolean
6,667, // `class
7,201, // `extends
8,6, // `void
9,273, // `int
10,344, // `while
11,495, // `if
12,142, // `else
13,502, // `for
14,589, // `break
15,221, // `this
16,184, // `false
17,297, // `true
18,256, // `super
19,45, // `null
20,109, // `return
21,400, // `instanceof
22,590, // `new
23,371, // `abstract
24,464, // `assert
25,678, // `byte
26,511, // `case
27,681, // `catch
28,420, // `char
29,492, // `const
30,581, // `continue
31,557, // `default
32,433, // `do
33,175, // `double
34,67, // `enum
35,136, // `final
36,326, // `finally
37,116, // `float
38,191, // `goto
39,588, // `implements
40,61, // `import
41,310, // `interface
42,474, // `long
43,376, // `native
44,471, // `package
45,335, // `private
46,42, // `protected
47,348, // `public
48,648, // `short
49,197, // `static
50,415, // `strictfp
51,107, // `switch
52,424, // `synchronized
53,528, // `throw
54,63, // `throws
55,312, // `transient
56,20, // `try
57,267, // `volatile
155,416, // token*
  }
,
{ // state 666
0x80000000|1, // match move
0x80000000|574, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 667
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 668
92,419, // "e"
  }
,
{ // state 669
2,496, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 670
102,241, // "t"
  }
,
{ // state 671
2,19, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+219, // $NT
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 672
90,46, // "o"
92,208, // "e"
  }
,
{ // state 673
2,374, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 674
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 675
159,MIN_REDUCTION+121, // $NT
  }
,
{ // state 676
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 677
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|526, // NT-test-match state for idChar
  }
,
{ // state 678
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 679
94,336, // "n"
  }
,
{ // state 680
159,MIN_REDUCTION+100, // $NT
  }
,
{ // state 681
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 682
2,3, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 683
99,17, // "c"
  }
,
{ // state 684
148,177, // " "
150,48, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+236, // $NT
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 685
89,430, // "b"
100,614, // "s"
  }
,
{ // state 686
2,650, // ws*
148,177, // " "
150,517, // ws
151,177, // {9}
152,409, // eol
153,616, // {10}
154,263, // {13}
159,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[687][];
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
// reserved ::= `boolean
(96<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(96<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(96<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(96<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(96<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(96<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(96<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(96<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(96<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(96<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(96<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(96<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(96<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(96<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(96<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(96<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(96<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(96<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(96<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(96<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(96<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(96<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(96<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(96<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(96<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(96<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(96<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(96<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(96<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(96<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(96<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(96<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(96<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(96<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(96<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(96<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(96<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(96<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(96<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(96<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(96<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(96<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(96<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(96<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(96<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(96<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(96<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(96<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(96<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(96<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(96<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(96<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(96<<16)+1,
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
// `* ::= "*" !"/" ws*
(62<<16)+2,
// `* ::= "*" !"/"
(62<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
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
// `/ ::= !"*" "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= !"*" "/" !{"*" "/"}
(83<<16)+1,
// `: ::= ":" ws*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// INTLIT ::= intLit2 ws*
(86<<16)+2,
// INTLIT ::= intLit2
(86<<16)+1,
// intLit2 ::= !"0" digit++
(136<<16)+1,
// digit ::= {"0".."9"}
(139<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' idChar++ '"' ws*
(87<<16)+4,
// STRINGLIT ::= '"' idChar++ '"'
(87<<16)+3,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(145<<16)+1,
// printable ::= {" ".."~"}
(142<<16)+1,
// ws ::= {9 " "}
(150<<16)+1,
// ws ::= eol
(150<<16)+1,
// eol ::= {10}
(152<<16)+1,
// eol ::= {13} {10}
(152<<16)+2,
// eol ::= {13} !10
(152<<16)+1,
// ID ::= !reserved letter idChar++ ws*
(85<<16)+3,
// ID ::= !reserved letter idChar++
(85<<16)+2,
// token* ::= token* token
(155<<16)+2,
// token* ::= token
(155<<16)+1,
// digit++ ::= digit+ !digit
(138<<16)+1,
// idChar++ ::= idChar+ !idChar
(144<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(156<<16)+1,
// digit+ ::= digit+ digit
(156<<16)+2,
// idChar+ ::= idChar
(157<<16)+1,
// idChar+ ::= idChar+ idChar
(157<<16)+2,
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
151, // 9
153, // 10
-1, // 11
-1, // 12
154, // 13
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
148, // " "
115, // "!"
143, // '"'
149, // "#"
149, // "$"
117, // "%"
118, // "&"
141, // "'"
119, // "("
120, // ")"
121, // "*"
123, // "+"
124, // ","
125, // "-"
126, // "."
122, // "/"
137, // "0"
140, // "1"
140, // "2"
140, // "3"
140, // "4"
140, // "5"
140, // "6"
140, // "7"
140, // "8"
140, // "9"
127, // ":"
128, // ";"
129, // "<"
116, // "="
130, // ">"
149, // "?"
149, // "@"
147, // "A"
147, // "B"
147, // "C"
147, // "D"
147, // "E"
147, // "F"
147, // "G"
147, // "H"
147, // "I"
147, // "J"
147, // "K"
147, // "L"
147, // "M"
147, // "N"
147, // "O"
147, // "P"
147, // "Q"
147, // "R"
147, // "S"
147, // "T"
147, // "U"
147, // "V"
147, // "W"
147, // "X"
147, // "Y"
147, // "Z"
131, // "["
149, // "\"
132, // "]"
149, // "^"
146, // "_"
149, // "`"
93, // "a"
89, // "b"
99, // "c"
103, // "d"
92, // "e"
104, // "f"
113, // "g"
109, // "h"
105, // "i"
147, // "j"
98, // "k"
91, // "l"
112, // "m"
94, // "n"
90, // "o"
108, // "p"
147, // "q"
97, // "r"
100, // "s"
102, // "t"
107, // "u"
110, // "v"
106, // "w"
101, // "x"
111, // "y"
114, // "z"
133, // "{"
135, // "|"
134, // "}"
149, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
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
"reserved ::= `boolean", // 91
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 92
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 93
"reserved ::= `break", // 94
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 95
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 96
"reserved ::= `class", // 97
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 98
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 99
"reserved ::= `else", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 102
"reserved ::= `extends", // 103
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 104
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 105
"reserved ::= `false", // 106
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 107
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 108
"reserved ::= `for", // 109
"`if ::= \"i\" \"f\" !idChar ws*", // 110
"`if ::= \"i\" \"f\" !idChar ws*", // 111
"reserved ::= `if", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 114
"reserved ::= `instanceof", // 115
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 116
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 117
"reserved ::= `int", // 118
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 119
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 120
"reserved ::= `new", // 121
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 122
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 123
"reserved ::= `null", // 124
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 125
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 126
"reserved ::= `public", // 127
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 128
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 129
"reserved ::= `return", // 130
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 131
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 132
"reserved ::= `super", // 133
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 134
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 135
"reserved ::= `switch", // 136
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 137
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 138
"reserved ::= `this", // 139
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 140
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 141
"reserved ::= `true", // 142
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 143
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 144
"reserved ::= `void", // 145
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 146
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 147
"reserved ::= `while", // 148
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 149
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 150
"reserved ::= `abstract", // 151
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 152
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 153
"reserved ::= `assert", // 154
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 155
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 156
"reserved ::= `byte", // 157
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 158
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 159
"reserved ::= `case", // 160
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 161
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 162
"reserved ::= `catch", // 163
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 164
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 165
"reserved ::= `char", // 166
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 167
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 168
"reserved ::= `const", // 169
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 170
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 171
"reserved ::= `continue", // 172
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 173
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 174
"reserved ::= `default", // 175
"`do ::= \"d\" \"o\" !idChar ws*", // 176
"`do ::= \"d\" \"o\" !idChar ws*", // 177
"reserved ::= `do", // 178
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 179
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 180
"reserved ::= `double", // 181
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 182
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 183
"reserved ::= `enum", // 184
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 185
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 186
"reserved ::= `final", // 187
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 188
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 189
"reserved ::= `finally", // 190
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 191
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 192
"reserved ::= `float", // 193
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 194
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 195
"reserved ::= `goto", // 196
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 197
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 198
"reserved ::= `implements", // 199
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 200
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 201
"reserved ::= `import", // 202
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 203
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 204
"reserved ::= `interface", // 205
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 206
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 207
"reserved ::= `long", // 208
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 209
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 210
"reserved ::= `native", // 211
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 212
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 213
"reserved ::= `package", // 214
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 215
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 216
"reserved ::= `private", // 217
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 218
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 219
"reserved ::= `protected", // 220
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 221
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 222
"reserved ::= `short", // 223
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 224
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 225
"reserved ::= `static", // 226
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 227
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 228
"reserved ::= `strictfp", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 231
"reserved ::= `synchronized", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 234
"reserved ::= `throw", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 237
"reserved ::= `throws", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 240
"reserved ::= `transient", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 243
"reserved ::= `try", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 246
"reserved ::= `volatile", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`! ::= \"!\" !\"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`!= ::= \"!\" \"=\" ws*", // 251
"`% ::= \"%\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`&& ::= \"&\" \"&\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`( ::= \"(\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`) ::= \")\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`* ::= \"*\" !\"/\" ws*", // 260
"`* ::= \"*\" !\"/\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`+ ::= \"+\" !\"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`++ ::= \"+\" \"+\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`, ::= \",\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`- ::= \"-\" !\"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`-- ::= \"-\" \"-\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`. ::= \".\" ws*", // 273
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 274
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 275
"`: ::= \":\" ws*", // 276
"`: ::= \":\" ws*", // 277
"`; ::= \";\" ws*", // 278
"`; ::= \";\" ws*", // 279
"`< ::= \"<\" !\"=\" ws*", // 280
"`< ::= \"<\" !\"=\" ws*", // 281
"`<= ::= \"<\" \"=\" ws*", // 282
"`<= ::= \"<\" \"=\" ws*", // 283
"`= ::= \"=\" !\"=\" ws*", // 284
"`= ::= \"=\" !\"=\" ws*", // 285
"`== ::= \"=\" \"=\" ws*", // 286
"`== ::= \"=\" \"=\" ws*", // 287
"`> ::= \">\" !\"=\" ws*", // 288
"`> ::= \">\" !\"=\" ws*", // 289
"`>= ::= \">\" \"=\" ws*", // 290
"`>= ::= \">\" \"=\" ws*", // 291
"`[ ::= \"[\" ws*", // 292
"`[ ::= \"[\" ws*", // 293
"`] ::= \"]\" ws*", // 294
"`] ::= \"]\" ws*", // 295
"`{ ::= \"{\" ws*", // 296
"`{ ::= \"{\" ws*", // 297
"`} ::= \"}\" ws*", // 298
"`} ::= \"}\" ws*", // 299
"`|| ::= \"|\" \"|\" ws*", // 300
"`|| ::= \"|\" \"|\" ws*", // 301
"INTLIT ::= # intLit2 ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"intLit2 ::= !\"0\" digit++", // 304
"digit ::= {\"0\"..\"9\"}", // 305
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 306
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 307
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 308
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 309
"idChar ::= letter", // 310
"idChar ::= digit", // 311
"idChar ::= \"_\"", // 312
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 313
"printable ::= {\" \"..\"~\"}", // 314
"ws ::= {9 \" \"}", // 315
"ws ::= eol", // 316
"eol ::= {10} registerNewline", // 317
"eol ::= {13} {10} registerNewline", // 318
"eol ::= {13} !10 registerNewline", // 319
"ID ::= !reserved letter idChar++ ws*", // 320
"ID ::= !reserved letter idChar++ ws*", // 321
"token* ::= token* token", // 322
"token* ::= token* token", // 323
"digit++ ::= digit+ !digit", // 324
"idChar++ ::= idChar+ !idChar", // 325
"ws* ::= ws* ws", // 326
"ws* ::= ws* ws", // 327
"digit+ ::= digit", // 328
"digit+ ::= digit+ digit", // 329
"idChar+ ::= idChar", // 330
"idChar+ ::= idChar+ idChar", // 331
"", // 332
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
    { // 91: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 92: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
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
    { // 93: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
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
    { // 94: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
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
    { // 96: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
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
    { // 97: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 98: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 99: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
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
    { // 100: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
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
    { // 102: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
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
    { // 103: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 104: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
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
    { // 105: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
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
    { // 106: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 110: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: `if ::= "i" "f" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
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
    { // 114: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
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
    { // 115: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 116: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 119: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 122: `null ::= "n" "u" "l" "l" !idChar ws* @void
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
    { // 123: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
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
    { // 124: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 125: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
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
    { // 126: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
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
    { // 127: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 128: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
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
    { // 129: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
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
    { // 130: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 131: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
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
    { // 132: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
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
    { // 133: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 134: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
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
    { // 135: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
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
    { // 136: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 137: `this ::= "t" "h" "i" "s" !idChar ws* @void
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
    { // 138: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
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
    { // 139: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 140: `true ::= "t" "r" "u" "e" !idChar ws* @void
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
    { // 141: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
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
    { // 142: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 143: `void ::= "v" "o" "i" "d" !idChar ws* @void
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
    { // 144: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
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
    { // 145: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 146: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
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
    { // 147: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
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
    { // 148: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 149: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
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
    { // 150: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
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
    { // 151: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 152: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
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
    { // 153: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
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
    { // 154: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 155: `byte ::= "b" "y" "t" "e" !idChar ws* @void
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
    { // 156: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
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
    { // 157: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 158: `case ::= "c" "a" "s" "e" !idChar ws* @void
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
    { // 159: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
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
    { // 160: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 161: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
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
    { // 162: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
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
    { // 163: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 164: `char ::= "c" "h" "a" "r" !idChar ws* @void
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
    { // 165: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
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
    { // 166: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 167: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
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
    { // 168: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
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
    { // 169: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 170: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
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
    { // 171: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
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
    { // 172: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 173: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
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
    { // 174: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
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
    { // 175: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 176: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `do ::= "d" "o" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 179: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
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
    { // 180: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
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
    { // 181: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 182: `enum ::= "e" "n" "u" "m" !idChar ws* @void
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
    { // 183: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
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
    { // 184: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 185: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
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
    { // 186: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
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
    { // 187: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 188: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
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
    { // 189: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
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
    { // 190: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 191: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
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
    { // 192: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
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
    { // 193: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 194: `goto ::= "g" "o" "t" "o" !idChar ws* @void
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
    { // 195: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
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
    { // 196: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 197: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
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
    { // 198: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
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
    { // 199: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
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
    { // 201: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
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
    { // 202: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
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
    { // 204: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
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
    { // 205: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 206: `long ::= "l" "o" "n" "g" !idChar ws* @void
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
    { // 207: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
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
    { // 208: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 209: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
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
    { // 210: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
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
    { // 211: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
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
    { // 213: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
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
    { // 214: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 215: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
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
    { // 216: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
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
    { // 217: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 218: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
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
    { // 219: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
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
    { // 220: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 221: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
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
    { // 222: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
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
    { // 223: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
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
    { // 225: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
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
    { // 226: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
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
    { // 228: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
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
    { // 229: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
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
    { // 231: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
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
    { // 232: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
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
    { // 234: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
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
    { // 235: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
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
    { // 237: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
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
    { // 238: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
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
    { // 240: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
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
    { // 241: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 244: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
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
    { // 246: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
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
    { // 247: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `! ::= "!" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 252: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `* ::= "*" !"/" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `+ ::= "+" !"+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `++ ::= "+" "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 266: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `, ::= "," [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `-- ::= "-" "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `. ::= "." [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `: ::= ":" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `; ::= ";" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `< ::= "<" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 283: `<= ::= "<" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 285: `= ::= "=" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 287: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 289: `> ::= ">" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 291: `>= ::= ">" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 292: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `[ ::= "[" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `] ::= "]" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `{ ::= "{" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `} ::= "}" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 301: `|| ::= "|" "|" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 302: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 305: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 306: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 308: STRINGLIT ::= [#] '"' idChar++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 310: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 316: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 317: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 318: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 319: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 320: ID ::= !reserved letter idChar++ ws* @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 321: ID ::= !reserved letter idChar++ [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 322: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 323: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 324: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 326: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 328: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 329: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 330: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 331: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 332: $$0 ::= token* @pass
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
      ((88<<5)|0x5)/*methodCall:88*/,
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
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 88: {
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
"int printableToAscii(int,char,char,char)",
"String charsToStringLiteral(int,char,List<Character>,char)",
"String sequenceToIdentifier(Character,List<Character>)",
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
4,1,
4,1,
2,1,
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
    1,
    -1,
    1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    0,
    -1,
    0,
    -1,
    -1,
    0,
    1,
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
