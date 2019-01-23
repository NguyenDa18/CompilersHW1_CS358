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
"NESTEDCOMMENT",
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
"$$1",
"idChar**",
"$$2",
"token*",
"digit+",
"idChar+",
"idChar*",
"$$3",
"$$4",
"$$5",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 168;}
private static final int MIN_REDUCTION = 711;
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
0x80000000|247, // match move
0x80000000|451, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1
  }
,
{ // state 2
2,549, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 3
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 4
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,648, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
157,310, // idChar**
162,109, // idChar*
  }
,
{ // state 5
103,314, // "t"
  }
,
{ // state 6
0x80000000|158, // match move
0x80000000|343, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 7
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 8
2,177, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 9
94,378, // "a"
  }
,
{ // state 10
91,422, // "o"
  }
,
{ // state 11
0x80000000|256, // match move
0x80000000|350, // no-match move
0x80000000|39, // NT-test-match state for digit
  }
,
{ // state 12
167,MIN_REDUCTION+313, // $NT
  }
,
{ // state 13
167,MIN_REDUCTION+203, // $NT
  }
,
{ // state 14
110,581, // "h"
  }
,
{ // state 15
93,666, // "e"
  }
,
{ // state 16
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 17
105,288, // "f"
  }
,
{ // state 18
110,137, // "h"
  }
,
{ // state 19
106,375, // "i"
  }
,
{ // state 20
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+219, // $NT
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 21
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 23
101,390, // "s"
  }
,
{ // state 24
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 25
167,MIN_REDUCTION+146, // $NT
  }
,
{ // state 26
124,474, // "+"
  }
,
{ // state 27
106,655, // "i"
  }
,
{ // state 28
91,285, // "o"
  }
,
{ // state 29
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 30
167,MIN_REDUCTION+137, // $NT
  }
,
{ // state 31
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 32
2,110, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 33
109,641, // "p"
  }
,
{ // state 34
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 35
101,251, // "s"
  }
,
{ // state 36
0x80000000|169, // match move
0x80000000|406, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 37
93,392, // "e"
  }
,
{ // state 38
0x80000000|201, // match move
0x80000000|679, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 39
138,319, // "0"
141,319, // {"1".."9"}
  }
,
{ // state 40
0x80000000|42, // match move
0x80000000|173, // no-match move
0x80000000|39, // NT-test-match state for digit
  }
,
{ // state 41
92,353, // "l"
  }
,
{ // state 42
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 43
95,498, // "n"
  }
,
{ // state 44
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 45
167,MIN_REDUCTION+92, // $NT
  }
,
{ // state 46
101,511, // "s"
103,503, // "t"
  }
,
{ // state 47
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 48
0x80000000|361, // match move
0x80000000|559, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 49
101,668, // "s"
  }
,
{ // state 50
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 51
167,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 52
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 53
1,104, // start
2,38, // ws*
3,484, // $$0
4,117, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
62,500, // `*
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
122,433, // "*"
137,418, // intLit2
139,253, // digit++
140,40, // digit
146,190, // letter
151,535, // ws
153,425, // eol
159,432, // token*
160,11, // digit+
  }
,
{ // state 54
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 55
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+156, // $NT
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 56
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 57
110,414, // "h"
  }
,
{ // state 58
103,94, // "t"
  }
,
{ // state 59
106,373, // "i"
  }
,
{ // state 60
2,659, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 61
93,138, // "e"
  }
,
{ // state 62
2,240, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 64
95,628, // "n"
  }
,
{ // state 65
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 66
2,172, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 67
94,428, // "a"
  }
,
{ // state 68
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 70
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
163,24, // $$3
  }
,
{ // state 71
91,699, // "o"
  }
,
{ // state 72
114,539, // "g"
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 74
111,344, // "v"
  }
,
{ // state 75
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 76
103,650, // "t"
  }
,
{ // state 77
167,MIN_REDUCTION+227, // $NT
  }
,
{ // state 78
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 79
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 80
2,674, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 81
103,356, // "t"
  }
,
{ // state 82
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 83
126,601, // "-"
  }
,
{ // state 84
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 85
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 86
2,358, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 87
167,MIN_REDUCTION+230, // $NT
  }
,
{ // state 88
95,46, // "n"
  }
,
{ // state 89
2,90, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 90
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 91
2,232, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 92
101,291, // "s"
  }
,
{ // state 93
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|186, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 95
103,421, // "t"
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 97
167,MIN_REDUCTION+209, // $NT
  }
,
{ // state 98
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 99
90,469, // "b"
  }
,
{ // state 100
0x80000000|444, // match move
0x80000000|661, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 101
92,67, // "l"
106,541, // "i"
  }
,
{ // state 102
101,683, // "s"
103,384, // "t"
  }
,
{ // state 103
2,31, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 104
166,MIN_REDUCTION+0, // $
  }
,
{ // state 105
94,153, // "a"
108,121, // "u"
112,380, // "y"
  }
,
{ // state 106
104,545, // "d"
  }
,
{ // state 107
4,328, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
  }
,
{ // state 108
167,MIN_REDUCTION+107, // $NT
  }
,
{ // state 109
0x80000000|363, // match move
0x80000000|78, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 110
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 111
91,430, // "o"
  }
,
{ // state 112
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 113
2,226, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 115
0x80000000|1, // match move
0x80000000|677, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 116
92,174, // "l"
95,460, // "n"
98,17, // "r"
102,692, // "x"
  }
,
{ // state 117
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 118
103,478, // "t"
  }
,
{ // state 119
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 121
93,525, // "e"
  }
,
{ // state 122
167,MIN_REDUCTION+206, // $NT
  }
,
{ // state 123
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 124
91,293, // "o"
106,74, // "i"
  }
,
{ // state 125
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 126
0x80000000|1, // match move
0x80000000|32, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 127
92,494, // "l"
  }
,
{ // state 128
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 129
92,445, // "l"
  }
,
{ // state 130
113,376, // "m"
  }
,
{ // state 131
167,MIN_REDUCTION+224, // $NT
  }
,
{ // state 132
95,192, // "n"
  }
,
{ // state 133
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 134
2,702, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
157,310, // idChar**
158,306, // $$2
162,109, // idChar*
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 135
2,452, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 136
91,101, // "o"
  }
,
{ // state 137
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 138
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 139
2,548, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 140
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 143
106,459, // "i"
  }
,
{ // state 144
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 145
0x80000000|509, // match move
0x80000000|612, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 146
106,555, // "i"
  }
,
{ // state 147
5,45, // `boolean
6,396, // `class
7,681, // `extends
8,25, // `void
9,448, // `int
10,482, // `while
11,583, // `if
12,703, // `else
13,470, // `for
14,566, // `break
15,528, // `this
16,108, // `false
17,299, // `true
18,595, // `super
19,354, // `null
20,495, // `return
21,318, // `instanceof
22,697, // `new
23,622, // `abstract
24,604, // `assert
25,504, // `byte
26,667, // `case
27,312, // `catch
28,645, // `char
29,255, // `const
30,341, // `continue
31,395, // `default
32,521, // `do
33,262, // `double
34,400, // `enum
35,305, // `final
36,238, // `finally
37,210, // `float
38,519, // `goto
39,402, // `implements
40,13, // `import
41,122, // `interface
42,97, // `long
43,401, // `native
44,538, // `package
45,577, // `private
46,594, // `protected
47,330, // `public
48,131, // `short
49,77, // `static
50,87, // `strictfp
51,30, // `switch
52,419, // `synchronized
53,242, // `throw
54,597, // `throws
55,557, // `transient
56,569, // `try
57,575, // `volatile
90,441, // "b"
92,585, // "l"
93,442, // "e"
94,708, // "a"
95,623, // "n"
98,371, // "r"
100,225, // "c"
101,563, // "s"
103,598, // "t"
104,694, // "d"
105,342, // "f"
106,455, // "i"
107,57, // "w"
109,409, // "p"
111,136, // "v"
114,10, // "g"
  }
,
{ // state 148
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 149
2,206, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 150
2,278, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 151
91,486, // "o"
  }
,
{ // state 152
0x80000000|264, // match move
0x80000000|579, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 153
95,516, // "n"
  }
,
{ // state 154
0x80000000|161, // match move
0x80000000|261, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 155
2,301, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 156
110,477, // "h"
  }
,
{ // state 157
167,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 159
94,379, // "a"
  }
,
{ // state 160
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 163
94,129, // "a"
  }
,
{ // state 164
98,456, // "r"
  }
,
{ // state 165
93,490, // "e"
  }
,
{ // state 166
100,156, // "c"
  }
,
{ // state 167
0x80000000|574, // match move
0x80000000|355, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 168
94,351, // "a"
  }
,
{ // state 169
117,489, // "="
  }
,
{ // state 170
107,570, // "w"
  }
,
{ // state 171
93,487, // "e"
  }
,
{ // state 172
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 173
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 174
101,547, // "s"
  }
,
{ // state 175
101,393, // "s"
  }
,
{ // state 176
2,82, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 177
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 178
91,685, // "o"
  }
,
{ // state 179
109,165, // "p"
  }
,
{ // state 180
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 181
2,587, // ws*
151,535, // ws
153,425, // eol
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 182
167,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 183
2,84, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 184
-1, // $$start
104, // start
38, // ws*
484, // $$0
117, // token
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
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
676, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
154, // "b"
154, // "o"
154, // "l"
154, // "e"
154, // "a"
154, // "n"
-1, // idChar
-1, // reserved
154, // "r"
154, // "k"
154, // "c"
154, // "s"
154, // "x"
154, // "t"
154, // "d"
154, // "f"
154, // "i"
154, // "w"
154, // "u"
154, // "p"
154, // "h"
154, // "v"
154, // "y"
154, // "m"
154, // "g"
154, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
-1, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
418, // intLit2
560, // "0"
253, // digit++
40, // digit
560, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
190, // letter
-1, // "_"
154, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
432, // token*
11, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 185
2,52, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 186
2,321, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 188
2,411, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 190
0x80000000|4, // match move
0x80000000|134, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 191
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,533, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
  }
,
{ // state 192
108,614, // "u"
  }
,
{ // state 193
142,287, // "'"
  }
,
{ // state 194
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 195
0x80000000|317, // match move
0x80000000|133, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 196
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 197
2,98, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 199
2,266, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 200
0x80000000|383, // match move
0x80000000|258, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|352, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 202
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 206
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 208
99,630, // "k"
  }
,
{ // state 209
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 210
167,MIN_REDUCTION+194, // $NT
  }
,
{ // state 211
2,447, // ws*
151,535, // ws
153,425, // eol
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 212
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 213
1,104, // start
2,38, // ws*
3,484, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
90,441, // "b"
92,585, // "l"
93,442, // "e"
94,708, // "a"
95,623, // "n"
98,371, // "r"
100,225, // "c"
101,563, // "s"
103,598, // "t"
104,694, // "d"
105,342, // "f"
106,455, // "i"
107,57, // "w"
109,409, // "p"
111,136, // "v"
114,10, // "g"
159,432, // token*
166,MIN_REDUCTION+1, // $
  }
,
{ // state 214
0x80000000|1, // match move
0x80000000|149, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 215
2,220, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 216
105,611, // "f"
  }
,
{ // state 217
167,MIN_REDUCTION+311, // $NT
  }
,
{ // state 218
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 219
0x80000000|603, // match move
0x80000000|682, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 220
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 221
2,56, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 222
0x80000000|1, // match move
0x80000000|331, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 223
93,616, // "e"
  }
,
{ // state 224
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 225
91,88, // "o"
92,168, // "l"
94,102, // "a"
110,532, // "h"
  }
,
{ // state 226
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 227
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,234, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
145,554, // idChar++
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
156,141, // $$1
161,437, // idChar+
  }
,
{ // state 228
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 229
92,647, // "l"
  }
,
{ // state 230
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 232
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 234
0x80000000|698, // match move
0x80000000|315, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 235
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 236
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 237
2,591, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 238
167,MIN_REDUCTION+191, // $NT
  }
,
{ // state 239
100,568, // "c"
  }
,
{ // state 240
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 241
93,550, // "e"
  }
,
{ // state 242
167,MIN_REDUCTION+236, // $NT
  }
,
{ // state 243
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 244
144,197, // '"'
  }
,
{ // state 245
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 246
95,72, // "n"
  }
,
{ // state 247
0x80000000|1, // match move
0x80000000|399, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 248
95,115, // "n"
  }
,
{ // state 249
93,654, // "e"
  }
,
{ // state 250
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 251
0x80000000|1, // match move
0x80000000|183, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 252
0x80000000|582, // match move
0x80000000|233, // no-match move
0x80000000|39, // NT-test-match state for digit
  }
,
{ // state 253
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 254
3,564, // $$0
4,117, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
62,500, // `*
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
122,433, // "*"
137,418, // intLit2
139,253, // digit++
140,40, // digit
146,190, // letter
151,51, // ws
153,425, // eol
159,432, // token*
160,11, // digit+
  }
,
{ // state 255
167,MIN_REDUCTION+170, // $NT
  }
,
{ // state 256
138,560, // "0"
140,252, // digit
141,560, // {"1".."9"}
  }
,
{ // state 257
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 258
-1, // $$start
-1, // start
416, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
207, // `boolean
688, // `class
209, // `extends
7, // `void
282, // `int
357, // `while
513, // `if
148, // `else
520, // `for
608, // `break
230, // `this
189, // `false
308, // `true
265, // `super
47, // `null
114, // `return
415, // `instanceof
609, // `new
386, // `abstract
481, // `assert
700, // `byte
529, // `case
704, // `catch
436, // `char
510, // `const
600, // `continue
576, // `default
449, // `do
180, // `double
69, // `enum
142, // `final
339, // `finally
119, // `float
198, // `goto
607, // `implements
63, // `import
323, // `interface
491, // `long
391, // `native
488, // `package
348, // `private
44, // `protected
362, // `public
669, // `short
205, // `static
431, // `strictfp
112, // `switch
440, // `synchronized
546, // `throw
65, // `throws
325, // `transient
21, // `try
276, // `volatile
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
-1, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
441, // "b"
MIN_REDUCTION+235, // "o"
585, // "l"
442, // "e"
708, // "a"
623, // "n"
-1, // idChar
-1, // reserved
371, // "r"
MIN_REDUCTION+235, // "k"
225, // "c"
522, // "s"
MIN_REDUCTION+235, // "x"
598, // "t"
694, // "d"
342, // "f"
455, // "i"
57, // "w"
MIN_REDUCTION+235, // "u"
409, // "p"
MIN_REDUCTION+235, // "h"
136, // "v"
MIN_REDUCTION+235, // "y"
MIN_REDUCTION+235, // "m"
10, // "g"
MIN_REDUCTION+235, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
MIN_REDUCTION+235, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
-1, // intLit2
MIN_REDUCTION+235, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+235, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+235, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 259
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 260
93,687, // "e"
  }
,
{ // state 261
147,MIN_REDUCTION+314, // "_"
157,MIN_REDUCTION+314, // idChar**
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 262
167,MIN_REDUCTION+182, // $NT
  }
,
{ // state 263
103,665, // "t"
  }
,
{ // state 264
4,328, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
  }
,
{ // state 265
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 266
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 267
90,626, // "b"
  }
,
{ // state 268
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 269
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 270
2,476, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 271
2,34, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 272
0x80000000|387, // match move
0x80000000|157, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 273
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+195, // $NT
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 274
2,303, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 276
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 277
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 278
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 279
2,374, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 280
0x80000000|213, // match move
0x80000000|184, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 281
94,567, // "a"
  }
,
{ // state 282
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 283
93,540, // "e"
  }
,
{ // state 284
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 285
92,629, // "l"
  }
,
{ // state 286
2,369, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 287
2,311, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 288
94,640, // "a"
  }
,
{ // state 289
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 290
0x80000000|367, // match move
0x80000000|307, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 291
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 292
2,326, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 293
103,537, // "t"
  }
,
{ // state 294
122,424, // "*"
  }
,
{ // state 295
106,316, // "i"
110,414, // "h"
  }
,
{ // state 296
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 297
106,365, // "i"
  }
,
{ // state 298
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 299
167,MIN_REDUCTION+143, // $NT
  }
,
{ // state 300
2,523, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 301
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 302
1,104, // start
2,38, // ws*
3,484, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
159,432, // token*
  }
,
{ // state 303
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 304
103,618, // "t"
  }
,
{ // state 305
167,MIN_REDUCTION+188, // $NT
  }
,
{ // state 306
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 307
-1, // $$start
-1, // start
-1, // ws*
564, // $$0
117, // token
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
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
676, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
154, // "b"
154, // "o"
154, // "l"
154, // "e"
154, // "a"
154, // "n"
-1, // idChar
-1, // reserved
154, // "r"
154, // "k"
154, // "c"
154, // "s"
154, // "x"
154, // "t"
154, // "d"
154, // "f"
154, // "i"
154, // "w"
154, // "u"
154, // "p"
154, // "h"
154, // "v"
154, // "y"
154, // "m"
154, // "g"
154, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
-1, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
418, // intLit2
560, // "0"
253, // digit++
40, // digit
560, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
190, // letter
-1, // "_"
154, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
51, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
432, // token*
11, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 308
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 309
93,701, // "e"
  }
,
{ // state 310
2,702, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
158,664, // $$2
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 311
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 312
167,MIN_REDUCTION+164, // $NT
  }
,
{ // state 313
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 314
108,658, // "u"
  }
,
{ // state 315
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 316
103,706, // "t"
  }
,
{ // state 317
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 318
167,MIN_REDUCTION+116, // $NT
  }
,
{ // state 319
167,MIN_REDUCTION+306, // $NT
  }
,
{ // state 320
0x80000000|275, // match move
0x80000000|345, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 321
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 322
99,126, // "k"
  }
,
{ // state 323
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 324
98,602, // "r"
  }
,
{ // state 325
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 326
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|80, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 328
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 329
0x80000000|1, // match move
0x80000000|427, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 330
167,MIN_REDUCTION+128, // $NT
  }
,
{ // state 331
2,212, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 332
98,17, // "r"
  }
,
{ // state 333
111,690, // "v"
  }
,
{ // state 334
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 335
2,245, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 336
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 337
0x80000000|1, // match move
0x80000000|237, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 338
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 340
103,492, // "t"
  }
,
{ // state 341
167,MIN_REDUCTION+173, // $NT
  }
,
{ // state 342
91,507, // "o"
92,412, // "l"
94,397, // "a"
106,552, // "i"
  }
,
{ // state 343
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 344
94,76, // "a"
  }
,
{ // state 345
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 346
0x80000000|1, // match move
0x80000000|438, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 347
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 349
103,35, // "t"
  }
,
{ // state 350
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 351
101,49, // "s"
  }
,
{ // state 352
0x80000000|686, // match move
0x80000000|254, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 353
103,461, // "t"
  }
,
{ // state 354
167,MIN_REDUCTION+125, // $NT
  }
,
{ // state 355
-1, // $$start
-1, // start
619, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
207, // `boolean
688, // `class
209, // `extends
7, // `void
282, // `int
357, // `while
513, // `if
148, // `else
520, // `for
608, // `break
230, // `this
189, // `false
308, // `true
265, // `super
47, // `null
114, // `return
415, // `instanceof
609, // `new
386, // `abstract
481, // `assert
700, // `byte
529, // `case
704, // `catch
436, // `char
510, // `const
600, // `continue
576, // `default
449, // `do
180, // `double
69, // `enum
142, // `final
339, // `finally
119, // `float
198, // `goto
607, // `implements
63, // `import
323, // `interface
491, // `long
391, // `native
488, // `package
348, // `private
44, // `protected
362, // `public
669, // `short
205, // `static
431, // `strictfp
112, // `switch
440, // `synchronized
546, // `throw
65, // `throws
325, // `transient
21, // `try
276, // `volatile
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
-1, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
441, // "b"
MIN_REDUCTION+118, // "o"
585, // "l"
116, // "e"
708, // "a"
623, // "n"
-1, // idChar
-1, // reserved
371, // "r"
MIN_REDUCTION+118, // "k"
225, // "c"
563, // "s"
MIN_REDUCTION+118, // "x"
598, // "t"
694, // "d"
342, // "f"
455, // "i"
57, // "w"
MIN_REDUCTION+118, // "u"
409, // "p"
MIN_REDUCTION+118, // "h"
136, // "v"
MIN_REDUCTION+118, // "y"
MIN_REDUCTION+118, // "m"
10, // "g"
MIN_REDUCTION+118, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
MIN_REDUCTION+118, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
-1, // intLit2
MIN_REDUCTION+118, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+118, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+118, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 356
94,43, // "a"
  }
,
{ // state 357
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 358
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 359
3,564, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
159,432, // token*
  }
,
{ // state 360
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 361
108,99, // "u"
  }
,
{ // state 362
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 363
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,195, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
  }
,
{ // state 364
-1, // $$start
-1, // start
447, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
207, // `boolean
688, // `class
209, // `extends
7, // `void
282, // `int
357, // `while
513, // `if
148, // `else
520, // `for
608, // `break
230, // `this
189, // `false
308, // `true
265, // `super
47, // `null
114, // `return
415, // `instanceof
609, // `new
386, // `abstract
481, // `assert
700, // `byte
529, // `case
704, // `catch
436, // `char
510, // `const
600, // `continue
576, // `default
449, // `do
180, // `double
69, // `enum
142, // `final
339, // `finally
119, // `float
198, // `goto
607, // `implements
63, // `import
323, // `interface
491, // `long
391, // `native
488, // `package
348, // `private
44, // `protected
362, // `public
669, // `short
205, // `static
431, // `strictfp
112, // `switch
440, // `synchronized
546, // `throw
65, // `throws
325, // `transient
21, // `try
276, // `volatile
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
-1, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
441, // "b"
MIN_REDUCTION+178, // "o"
585, // "l"
442, // "e"
708, // "a"
623, // "n"
-1, // idChar
-1, // reserved
371, // "r"
MIN_REDUCTION+178, // "k"
225, // "c"
563, // "s"
MIN_REDUCTION+178, // "x"
598, // "t"
694, // "d"
342, // "f"
455, // "i"
57, // "w"
99, // "u"
409, // "p"
MIN_REDUCTION+178, // "h"
136, // "v"
MIN_REDUCTION+178, // "y"
MIN_REDUCTION+178, // "m"
10, // "g"
MIN_REDUCTION+178, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
MIN_REDUCTION+178, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
-1, // intLit2
MIN_REDUCTION+178, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+178, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+178, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 365
100,423, // "c"
  }
,
{ // state 366
0x80000000|605, // match move
0x80000000|200, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 367
3,564, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
90,441, // "b"
92,585, // "l"
93,442, // "e"
94,708, // "a"
95,623, // "n"
98,371, // "r"
100,225, // "c"
101,563, // "s"
103,598, // "t"
104,694, // "d"
105,342, // "f"
106,455, // "i"
107,57, // "w"
109,409, // "p"
111,136, // "v"
114,10, // "g"
159,432, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 368
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 369
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 370
2,388, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 371
93,5, // "e"
  }
,
{ // state 372
0x80000000|610, // match move
0x80000000|408, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 373
115,15, // "z"
  }
,
{ // state 374
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 375
93,64, // "e"
  }
,
{ // state 376
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 377
93,663, // "e"
  }
,
{ // state 378
103,79, // "t"
  }
,
{ // state 379
100,58, // "c"
  }
,
{ // state 380
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|627, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 382
2,644, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 383
2,416, // ws*
151,535, // ws
153,425, // eol
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 384
100,14, // "c"
  }
,
{ // state 385
2,652, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 386
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 387
154,643, // {10}
  }
,
{ // state 388
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 389
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 390
93,464, // "e"
  }
,
{ // state 391
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 392
0x80000000|1, // match move
0x80000000|479, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|670, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 394
101,81, // "s"
103,462, // "t"
  }
,
{ // state 395
167,MIN_REDUCTION+176, // $NT
  }
,
{ // state 396
167,MIN_REDUCTION+98, // $NT
  }
,
{ // state 397
92,23, // "l"
  }
,
{ // state 398
103,37, // "t"
  }
,
{ // state 399
0x80000000|302, // match move
0x80000000|53, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 400
167,MIN_REDUCTION+185, // $NT
  }
,
{ // state 401
167,MIN_REDUCTION+212, // $NT
  }
,
{ // state 402
167,MIN_REDUCTION+200, // $NT
  }
,
{ // state 403
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 404
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 405
0x80000000|572, // match move
0x80000000|695, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 406
2,571, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 407
104,92, // "d"
  }
,
{ // state 408
2,480, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 409
94,543, // "a"
98,124, // "r"
108,267, // "u"
  }
,
{ // state 410
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 411
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 412
91,9, // "o"
  }
,
{ // state 413
91,246, // "o"
112,243, // "y"
  }
,
{ // state 414
106,127, // "i"
  }
,
{ // state 415
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 416
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 417
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 418
2,347, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 419
167,MIN_REDUCTION+233, // $NT
  }
,
{ // state 420
117,66, // "="
  }
,
{ // state 421
105,33, // "f"
  }
,
{ // state 422
103,71, // "t"
  }
,
{ // state 423
0x80000000|1, // match move
0x80000000|335, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 424
2,227, // ws*
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,234, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
145,554, // idChar++
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
156,360, // $$1
161,437, // idChar+
  }
,
{ // state 425
167,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 426
114,61, // "g"
  }
,
{ // state 427
2,678, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 428
103,27, // "t"
  }
,
{ // state 429
4,328, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
83,231, // `/
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
146,190, // letter
  }
,
{ // state 430
95,59, // "n"
  }
,
{ // state 431
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 432
0x80000000|617, // match move
0x80000000|624, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|188, // no-match move
// T-test match for "/":
123,
  }
,
{ // state 434
119,274, // "&"
  }
,
{ // state 435
0x80000000|1, // match move
0x80000000|534, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 436
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 437
0x80000000|191, // match move
0x80000000|203, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 438
2,696, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 439
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+246, // $NT
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 440
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 441
91,28, // "o"
98,377, // "r"
112,398, // "y"
  }
,
{ // state 442
92,174, // "l"
95,460, // "n"
102,692, // "x"
  }
,
{ // state 443
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 444
4,328, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
90,441, // "b"
92,585, // "l"
93,442, // "e"
94,708, // "a"
95,623, // "n"
98,371, // "r"
100,225, // "c"
101,563, // "s"
103,598, // "t"
104,694, // "d"
105,342, // "f"
106,455, // "i"
107,57, // "w"
109,409, // "p"
111,136, // "v"
114,10, // "g"
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 445
0x80000000|561, // match move
0x80000000|649, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 446
101,118, // "s"
  }
,
{ // state 447
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 448
167,MIN_REDUCTION+119, // $NT
  }
,
{ // state 449
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 450
0x80000000|420, // match move
0x80000000|382, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 451
0x80000000|145, // match move
0x80000000|280, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 452
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 453
108,41, // "u"
  }
,
{ // state 454
2,277, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 455
95,394, // "n"
105,636, // "f"
113,684, // "m"
  }
,
{ // state 456
103,615, // "t"
  }
,
{ // state 457
94,499, // "a"
98,642, // "r"
110,463, // "h"
  }
,
{ // state 458
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 459
100,95, // "c"
  }
,
{ // state 460
108,130, // "u"
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|675, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 462
0x80000000|578, // match move
0x80000000|167, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 463
98,151, // "r"
106,175, // "i"
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|385, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 465
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 466
2,123, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 468
2,336, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 469
92,586, // "l"
  }
,
{ // state 470
167,MIN_REDUCTION+110, // $NT
  }
,
{ // state 471
0x80000000|83, // match move
0x80000000|185, // no-match move
// T-test match for "-":
126,
  }
,
{ // state 472
93,106, // "e"
  }
,
{ // state 473
2,632, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 474
2,296, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 475
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 476
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 477
98,111, // "r"
  }
,
{ // state 478
98,159, // "r"
  }
,
{ // state 479
2,55, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 480
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 481
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 482
167,MIN_REDUCTION+149, // $NT
  }
,
{ // state 483
95,166, // "n"
  }
,
{ // state 484
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 485
0x80000000|107, // match move
0x80000000|429, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 486
107,366, // "w"
  }
,
{ // state 487
91,551, // "o"
  }
,
{ // state 488
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 489
2,368, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 490
98,536, // "r"
  }
,
{ // state 491
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 492
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 493
0x80000000|620, // match move
0x80000000|475, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 494
93,73, // "e"
  }
,
{ // state 495
167,MIN_REDUCTION+131, // $NT
  }
,
{ // state 496
167,MIN_REDUCTION+314, // $NT
  }
,
{ // state 497
2,259, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 498
100,171, // "c"
  }
,
{ // state 499
103,146, // "t"
  }
,
{ // state 500
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 501
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+271, // (default reduction)
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
{ // state 502
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 503
106,132, // "i"
  }
,
{ // state 504
167,MIN_REDUCTION+158, // $NT
  }
,
{ // state 505
2,68, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 506
2,289, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 507
98,346, // "r"
  }
,
{ // state 508
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 509
1,104, // start
2,38, // ws*
3,484, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
159,432, // token*
  }
,
{ // state 510
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 511
103,329, // "t"
  }
,
{ // state 512
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 513
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 514
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 515
0x80000000|26, // match move
0x80000000|86, // no-match move
// T-test match for "+":
124,
  }
,
{ // state 516
101,19, // "s"
  }
,
{ // state 517
2,592, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 519
167,MIN_REDUCTION+197, // $NT
  }
,
{ // state 520
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 521
167,MIN_REDUCTION+179, // $NT
  }
,
{ // state 522
0x80000000|660, // match move
0x80000000|219, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 523
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 524
-1, // $$start
-1, // start
587, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
207, // `boolean
688, // `class
209, // `extends
7, // `void
282, // `int
357, // `while
513, // `if
148, // `else
520, // `for
608, // `break
230, // `this
189, // `false
308, // `true
265, // `super
47, // `null
114, // `return
415, // `instanceof
609, // `new
386, // `abstract
481, // `assert
700, // `byte
529, // `case
704, // `catch
436, // `char
510, // `const
600, // `continue
576, // `default
449, // `do
180, // `double
69, // `enum
142, // `final
339, // `finally
119, // `float
198, // `goto
607, // `implements
63, // `import
323, // `interface
491, // `long
391, // `native
488, // `package
348, // `private
44, // `protected
362, // `public
669, // `short
205, // `static
431, // `strictfp
112, // `switch
440, // `synchronized
546, // `throw
65, // `throws
325, // `transient
21, // `try
276, // `volatile
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
-1, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
441, // "b"
MIN_REDUCTION+187, // "o"
413, // "l"
442, // "e"
708, // "a"
623, // "n"
-1, // idChar
-1, // reserved
371, // "r"
MIN_REDUCTION+187, // "k"
225, // "c"
563, // "s"
MIN_REDUCTION+187, // "x"
598, // "t"
694, // "d"
342, // "f"
455, // "i"
57, // "w"
MIN_REDUCTION+187, // "u"
409, // "p"
MIN_REDUCTION+187, // "h"
136, // "v"
MIN_REDUCTION+187, // "y"
MIN_REDUCTION+187, // "m"
10, // "g"
MIN_REDUCTION+187, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
MIN_REDUCTION+187, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
-1, // intLit2
MIN_REDUCTION+187, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+187, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+187, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 525
0x80000000|1, // match move
0x80000000|621, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 526
2,269, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 527
136,656, // "|"
  }
,
{ // state 528
167,MIN_REDUCTION+140, // $NT
  }
,
{ // state 529
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 531
112,243, // "y"
  }
,
{ // state 532
94,324, // "a"
  }
,
{ // state 533
0x80000000|298, // match move
0x80000000|218, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 534
2,85, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 535
167,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 536
0x80000000|1, // match move
0x80000000|468, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 537
93,239, // "e"
  }
,
{ // state 538
167,MIN_REDUCTION+215, // $NT
  }
,
{ // state 539
0x80000000|1, // match move
0x80000000|103, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 540
98,340, // "r"
  }
,
{ // state 541
104,222, // "d"
  }
,
{ // state 542
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 543
100,208, // "c"
  }
,
{ // state 544
90,496, // "b"
91,496, // "o"
92,496, // "l"
93,496, // "e"
94,496, // "a"
95,496, // "n"
98,496, // "r"
99,496, // "k"
100,496, // "c"
101,496, // "s"
102,496, // "x"
103,496, // "t"
104,496, // "d"
105,496, // "f"
106,496, // "i"
107,496, // "w"
108,496, // "u"
109,496, // "p"
110,496, // "h"
111,496, // "v"
112,496, // "y"
113,496, // "m"
114,496, // "g"
115,496, // "z"
138,319, // "0"
140,639, // digit
141,319, // {"1".."9"}
146,217, // letter
147,12, // "_"
148,496, // {"A".."Z" "j" "q"}
  }
,
{ // state 545
0x80000000|1, // match move
0x80000000|693, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 546
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 547
93,96, // "e"
  }
,
{ // state 548
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 549
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 550
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 551
105,93, // "f"
  }
,
{ // state 552
95,163, // "n"
  }
,
{ // state 553
2,228, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 554
2,70, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
163,502, // $$3
  }
,
{ // state 555
100,646, // "c"
  }
,
{ // state 556
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 557
167,MIN_REDUCTION+242, // $NT
  }
,
{ // state 558
2,662, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 559
0x80000000|211, // match move
0x80000000|364, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 560
0x80000000|125, // match move
0x80000000|508, // no-match move
0x80000000|39, // NT-test-match state for digit
  }
,
{ // state 561
92,531, // "l"
  }
,
{ // state 562
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 563
103,638, // "t"
107,651, // "w"
108,179, // "u"
110,178, // "h"
112,483, // "y"
  }
,
{ // state 564
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 565
2,334, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 566
167,MIN_REDUCTION+95, // $NT
  }
,
{ // state 567
95,631, // "n"
  }
,
{ // state 568
103,472, // "t"
  }
,
{ // state 569
167,MIN_REDUCTION+245, // $NT
  }
,
{ // state 570
0x80000000|1, // match move
0x80000000|60, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 571
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 572
117,199, // "="
  }
,
{ // state 573
2,273, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 574
2,619, // ws*
151,535, // ws
153,425, // eol
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 575
167,MIN_REDUCTION+248, // $NT
  }
,
{ // state 576
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 577
167,MIN_REDUCTION+218, // $NT
  }
,
{ // state 578
93,332, // "e"
  }
,
{ // state 579
4,328, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
62,500, // `*
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
122,433, // "*"
137,418, // intLit2
139,253, // digit++
140,40, // digit
146,190, // letter
160,11, // digit+
  }
,
{ // state 580
2,596, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 581
0x80000000|1, // match move
0x80000000|709, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 582
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 583
167,MIN_REDUCTION+113, // $NT
  }
,
{ // state 584
2,236, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 585
91,246, // "o"
  }
,
{ // state 586
93,599, // "e"
  }
,
{ // state 587
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 588
0x80000000|359, // match move
0x80000000|673, // no-match move
0x80000000|147, // NT-test-match state for reserved
  }
,
{ // state 589
2,680, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 590
0x80000000|657, // match move
0x80000000|54, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 591
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 592
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+165, // $NT
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 593
2,439, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+247, // $NT
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 594
167,MIN_REDUCTION+221, // $NT
  }
,
{ // state 595
167,MIN_REDUCTION+134, // $NT
  }
,
{ // state 596
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 597
167,MIN_REDUCTION+239, // $NT
  }
,
{ // state 598
98,105, // "r"
110,463, // "h"
  }
,
{ // state 599
0x80000000|1, // match move
0x80000000|155, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 600
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 601
2,501, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 602
0x80000000|1, // match move
0x80000000|517, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 603
2,707, // ws*
151,535, // ws
153,425, // eol
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 604
167,MIN_REDUCTION+155, // $NT
  }
,
{ // state 605
101,381, // "s"
  }
,
{ // state 606
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 607
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 610
117,139, // "="
  }
,
{ // state 611
94,453, // "a"
  }
,
{ // state 612
1,104, // start
2,38, // ws*
3,484, // $$0
4,117, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
83,231, // `/
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
146,190, // letter
151,535, // ws
153,425, // eol
159,432, // token*
  }
,
{ // state 613
90,257, // "b"
91,257, // "o"
92,257, // "l"
93,257, // "e"
94,257, // "a"
95,257, // "n"
98,257, // "r"
99,257, // "k"
100,257, // "c"
101,257, // "s"
102,257, // "x"
103,257, // "t"
104,257, // "d"
105,257, // "f"
106,257, // "i"
107,257, // "w"
108,257, // "u"
109,257, // "p"
110,257, // "h"
111,257, // "v"
112,257, // "y"
113,257, // "m"
114,257, // "g"
115,257, // "z"
116,257, // "!"
117,257, // "="
118,257, // "%"
119,257, // "&"
120,257, // "("
121,257, // ")"
122,257, // "*"
123,257, // "/"
124,257, // "+"
125,257, // ","
126,257, // "-"
127,257, // "."
128,257, // ":"
129,257, // ";"
130,257, // "<"
131,257, // ">"
132,257, // "["
133,257, // "]"
134,257, // "{"
135,257, // "}"
136,257, // "|"
138,257, // "0"
141,257, // {"1".."9"}
142,257, // "'"
143,193, // printable
144,257, // '"'
147,257, // "_"
148,257, // {"A".."Z" "j" "q"}
149,257, // " "
150,257, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 614
93,327, // "e"
  }
,
{ // state 615
0x80000000|1, // match move
0x80000000|691, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 616
113,309, // "m"
  }
,
{ // state 617
0x80000000|1, // match move
0x80000000|152, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 618
0x80000000|1, // match move
0x80000000|176, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 619
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 621
2,29, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 622
167,MIN_REDUCTION+152, // $NT
  }
,
{ // state 623
93,170, // "e"
94,263, // "a"
108,229, // "u"
  }
,
{ // state 624
0x80000000|485, // match move
0x80000000|100, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 625
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+240, // $NT
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 626
92,297, // "l"
  }
,
{ // state 627
2,707, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 628
103,22, // "t"
  }
,
{ // state 629
93,281, // "e"
  }
,
{ // state 630
94,426, // "a"
  }
,
{ // state 631
0x80000000|1, // match move
0x80000000|553, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 632
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 633
101,283, // "s"
  }
,
{ // state 634
91,164, // "o"
92,223, // "l"
  }
,
{ // state 635
167,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 637
90,154, // "b"
91,154, // "o"
92,154, // "l"
93,154, // "e"
94,154, // "a"
95,154, // "n"
96,234, // idChar
98,154, // "r"
99,154, // "k"
100,154, // "c"
101,154, // "s"
102,154, // "x"
103,154, // "t"
104,154, // "d"
105,154, // "f"
106,154, // "i"
107,154, // "w"
108,154, // "u"
109,154, // "p"
110,154, // "h"
111,154, // "v"
112,154, // "y"
113,154, // "m"
114,154, // "g"
115,154, // "z"
138,590, // "0"
140,320, // digit
141,590, // {"1".."9"}
145,244, // idChar++
146,493, // letter
147,6, // "_"
148,154, // {"A".."Z" "j" "q"}
161,437, // idChar+
  }
,
{ // state 638
94,499, // "a"
98,143, // "r"
  }
,
{ // state 639
167,MIN_REDUCTION+312, // $NT
  }
,
{ // state 640
100,241, // "c"
  }
,
{ // state 641
0x80000000|1, // match move
0x80000000|370, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 642
94,153, // "a"
106,459, // "i"
108,121, // "u"
112,380, // "y"
  }
,
{ // state 643
167,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 644
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 645
167,MIN_REDUCTION+167, // $NT
  }
,
{ // state 646
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 647
92,214, // "l"
  }
,
{ // state 648
0x80000000|458, // match move
0x80000000|204, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 649
0x80000000|181, // match move
0x80000000|524, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 650
93,196, // "e"
  }
,
{ // state 651
106,316, // "i"
  }
,
{ // state 652
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 653
2,625, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 654
95,407, // "n"
  }
,
{ // state 655
92,260, // "l"
  }
,
{ // state 656
2,140, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 658
98,248, // "r"
  }
,
{ // state 659
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 660
103,638, // "t"
107,651, // "w"
108,179, // "u"
110,178, // "h"
112,483, // "y"
  }
,
{ // state 661
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
328, // token
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
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
676, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
154, // "b"
154, // "o"
154, // "l"
154, // "e"
154, // "a"
154, // "n"
-1, // idChar
-1, // reserved
154, // "r"
154, // "k"
154, // "c"
154, // "s"
154, // "x"
154, // "t"
154, // "d"
154, // "f"
154, // "i"
154, // "w"
154, // "u"
154, // "p"
154, // "h"
154, // "v"
154, // "y"
154, // "m"
154, // "g"
154, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
-1, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
418, // intLit2
560, // "0"
253, // digit++
40, // digit
560, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
190, // letter
-1, // "_"
154, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
11, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+340, // $
-1, // $NT
  }
,
{ // state 662
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 663
94,322, // "a"
  }
,
{ // state 664
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 665
106,333, // "i"
  }
,
{ // state 666
104,512, // "d"
  }
,
{ // state 667
167,MIN_REDUCTION+161, // $NT
  }
,
{ // state 668
0x80000000|1, // match move
0x80000000|589, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 669
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 670
2,50, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 671
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 672
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 673
3,564, // $$0
4,117, // token
58,410, // `!
59,467, // `!=
60,75, // `%
61,556, // `&&
63,606, // `(
64,313, // `)
65,404, // `{
66,542, // `}
67,443, // `-
68,16, // `+
69,224, // `=
70,235, // `==
71,187, // `[
72,403, // `]
73,417, // `||
74,160, // `<
75,144, // `<=
76,672, // `,
77,128, // `>
78,120, // `>=
79,162, // `.
80,202, // `;
81,530, // `++
82,268, // `--
83,231, // `/
84,338, // `:
85,676, // ID
86,465, // INTLIT
87,194, // STRINGLIT
88,518, // CHARLIT
89,562, // NESTEDCOMMENT
146,190, // letter
151,51, // ws
153,425, // eol
159,432, // token*
  }
,
{ // state 674
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 675
2,284, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 677
2,250, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 678
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 679
0x80000000|588, // match move
0x80000000|290, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 680
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 681
167,MIN_REDUCTION+104, // $NT
  }
,
{ // state 682
-1, // $$start
-1, // start
707, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
207, // `boolean
688, // `class
209, // `extends
7, // `void
282, // `int
357, // `while
513, // `if
148, // `else
520, // `for
608, // `break
230, // `this
189, // `false
308, // `true
265, // `super
47, // `null
114, // `return
415, // `instanceof
609, // `new
386, // `abstract
481, // `assert
700, // `byte
529, // `case
704, // `catch
436, // `char
510, // `const
600, // `continue
576, // `default
449, // `do
180, // `double
69, // `enum
142, // `final
339, // `finally
119, // `float
198, // `goto
607, // `implements
63, // `import
323, // `interface
491, // `long
391, // `native
488, // `package
348, // `private
44, // `protected
362, // `public
669, // `short
205, // `static
431, // `strictfp
112, // `switch
440, // `synchronized
546, // `throw
65, // `throws
325, // `transient
21, // `try
276, // `volatile
410, // `!
467, // `!=
75, // `%
556, // `&&
-1, // `*
606, // `(
313, // `)
404, // `{
542, // `}
443, // `-
16, // `+
224, // `=
235, // `==
187, // `[
403, // `]
417, // `||
160, // `<
144, // `<=
672, // `,
128, // `>
120, // `>=
162, // `.
202, // `;
530, // `++
268, // `--
231, // `/
338, // `:
-1, // ID
465, // INTLIT
194, // STRINGLIT
518, // CHARLIT
562, // NESTEDCOMMENT
441, // "b"
MIN_REDUCTION+238, // "o"
585, // "l"
442, // "e"
708, // "a"
623, // "n"
-1, // idChar
-1, // reserved
371, // "r"
MIN_REDUCTION+238, // "k"
225, // "c"
563, // "s"
MIN_REDUCTION+238, // "x"
457, // "t"
694, // "d"
342, // "f"
455, // "i"
295, // "w"
179, // "u"
409, // "p"
178, // "h"
136, // "v"
483, // "y"
MIN_REDUCTION+238, // "m"
10, // "g"
MIN_REDUCTION+238, // "z"
372, // "!"
36, // "="
91, // "%"
434, // "&"
150, // "("
584, // ")"
MIN_REDUCTION+238, // "*"
689, // "/"
515, // "+"
466, // ","
471, // "-"
271, // "."
62, // ":"
8, // ";"
450, // "<"
405, // ">"
505, // "["
705, // "]"
292, // "{"
113, // "}"
527, // "|"
-1, // intLit2
MIN_REDUCTION+238, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+238, // {"1".."9"}
613, // "'"
-1, // printable
637, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+238, // {"A".."Z" "j" "q"}
182, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
535, // ws
182, // {9}
425, // eol
635, // {10}
272, // {13}
-1, // $$1
-1, // idChar**
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // idChar*
-1, // $$3
-1, // $$4
-1, // $$5
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 683
93,337, // "e"
  }
,
{ // state 684
109,634, // "p"
  }
,
{ // state 685
98,304, // "r"
  }
,
{ // state 686
3,564, // $$0
4,117, // token
5,207, // `boolean
6,688, // `class
7,209, // `extends
8,7, // `void
9,282, // `int
10,357, // `while
11,513, // `if
12,148, // `else
13,520, // `for
14,608, // `break
15,230, // `this
16,189, // `false
17,308, // `true
18,265, // `super
19,47, // `null
20,114, // `return
21,415, // `instanceof
22,609, // `new
23,386, // `abstract
24,481, // `assert
25,700, // `byte
26,529, // `case
27,704, // `catch
28,436, // `char
29,510, // `const
30,600, // `continue
31,576, // `default
32,449, // `do
33,180, // `double
34,69, // `enum
35,142, // `final
36,339, // `finally
37,119, // `float
38,198, // `goto
39,607, // `implements
40,63, // `import
41,323, // `interface
42,491, // `long
43,391, // `native
44,488, // `package
45,348, // `private
46,44, // `protected
47,362, // `public
48,669, // `short
49,205, // `static
50,431, // `strictfp
51,112, // `switch
52,440, // `synchronized
53,546, // `throw
54,65, // `throws
55,325, // `transient
56,21, // `try
57,276, // `volatile
159,432, // token*
  }
,
{ // state 687
0x80000000|1, // match move
0x80000000|593, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 688
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 689
0x80000000|294, // match move
0x80000000|497, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 690
93,435, // "e"
  }
,
{ // state 691
2,514, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 692
103,249, // "t"
  }
,
{ // state 693
2,20, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 694
91,48, // "o"
93,216, // "e"
  }
,
{ // state 695
2,389, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 696
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 697
167,MIN_REDUCTION+122, // $NT
  }
,
{ // state 698
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 699
0x80000000|1, // match move
0x80000000|573, // no-match move
0x80000000|544, // NT-test-match state for idChar
  }
,
{ // state 700
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 701
95,349, // "n"
  }
,
{ // state 702
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 703
167,MIN_REDUCTION+101, // $NT
  }
,
{ // state 704
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 705
2,3, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 706
100,18, // "c"
  }
,
{ // state 707
149,182, // " "
151,51, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+237, // $NT
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 708
90,446, // "b"
101,633, // "s"
  }
,
{ // state 709
2,671, // ws*
149,182, // " "
151,535, // ws
152,182, // {9}
153,425, // eol
154,635, // {10}
155,272, // {13}
167,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[710][];
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
// token ::= NESTEDCOMMENT
(4<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(97<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(97<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(97<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(97<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(97<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(97<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(97<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(97<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(97<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(97<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(97<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(97<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(97<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(97<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(97<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(97<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(97<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(97<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(97<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(97<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(97<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(97<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(97<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(97<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(97<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(97<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(97<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(97<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(97<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(97<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(97<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(97<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(97<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(97<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(97<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(97<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(97<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(97<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(97<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(97<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(97<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(97<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(97<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(97<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(97<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(97<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(97<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(97<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(97<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(97<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(97<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(97<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(97<<16)+1,
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
(137<<16)+1,
// digit ::= {"0".."9"}
(140<<16)+1,
// CHARLIT ::= "'" printable "'" ws*
(88<<16)+4,
// CHARLIT ::= "'" printable "'"
(88<<16)+3,
// STRINGLIT ::= '"' idChar++ '"' ws*
(87<<16)+4,
// STRINGLIT ::= '"' idChar++ '"'
(87<<16)+3,
// idChar ::= letter
(96<<16)+1,
// idChar ::= digit
(96<<16)+1,
// idChar ::= "_"
(96<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(146<<16)+1,
// printable ::= {" ".."~"}
(143<<16)+1,
// ws ::= {9 " "}
(151<<16)+1,
// ws ::= eol
(151<<16)+1,
// eol ::= {10}
(153<<16)+1,
// eol ::= {13} {10}
(153<<16)+2,
// eol ::= {13} !10
(153<<16)+1,
// NESTEDCOMMENT ::= "/" "*" ws* $$1
(89<<16)+4,
// NESTEDCOMMENT ::= "/" "*" $$1
(89<<16)+3,
// ID ::= !reserved letter idChar** $$2
(85<<16)+3,
// ID ::= !reserved letter idChar**
(85<<16)+2,
// ID ::= !reserved letter !idChar $$2
(85<<16)+2,
// ID ::= !reserved letter !idChar
(85<<16)+1,
// token* ::= token* token
(159<<16)+2,
// token* ::= token
(159<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// idChar++ ::= idChar+ !idChar
(145<<16)+1,
// idChar** ::= idChar* !idChar
(157<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(160<<16)+1,
// digit+ ::= digit+ digit
(160<<16)+2,
// idChar+ ::= idChar
(161<<16)+1,
// idChar+ ::= idChar+ idChar
(161<<16)+2,
// idChar* ::= idChar* idChar
(162<<16)+2,
// idChar* ::= idChar
(162<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= idChar++ ws* $$3
(156<<16)+3,
// $$1 ::= idChar++ $$3
(156<<16)+2,
// $$2 ::= ws*
(158<<16)+1,
// $$3 ::= !{"*" "/"} !!{"*" "/"} ws* $$4
(163<<16)+2,
// $$3 ::= !{"*" "/"} !!{"*" "/"} $$4
(163<<16)+1,
// $$4 ::= idChar++ !!{"*" "/"} ws* $$5
(164<<16)+3,
// $$4 ::= idChar++ !!{"*" "/"} $$5
(164<<16)+2,
// $$5 ::= idChar++ ws* !!{"*" "/"}
(165<<16)+2,
// $$5 ::= idChar++ !!{"*" "/"}
(165<<16)+1,
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
152, // 9
154, // 10
-1, // 11
-1, // 12
155, // 13
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
149, // " "
116, // "!"
144, // '"'
150, // "#"
150, // "$"
118, // "%"
119, // "&"
142, // "'"
120, // "("
121, // ")"
122, // "*"
124, // "+"
125, // ","
126, // "-"
127, // "."
123, // "/"
138, // "0"
141, // "1"
141, // "2"
141, // "3"
141, // "4"
141, // "5"
141, // "6"
141, // "7"
141, // "8"
141, // "9"
128, // ":"
129, // ";"
130, // "<"
117, // "="
131, // ">"
150, // "?"
150, // "@"
148, // "A"
148, // "B"
148, // "C"
148, // "D"
148, // "E"
148, // "F"
148, // "G"
148, // "H"
148, // "I"
148, // "J"
148, // "K"
148, // "L"
148, // "M"
148, // "N"
148, // "O"
148, // "P"
148, // "Q"
148, // "R"
148, // "S"
148, // "T"
148, // "U"
148, // "V"
148, // "W"
148, // "X"
148, // "Y"
148, // "Z"
132, // "["
150, // "\"
133, // "]"
150, // "^"
147, // "_"
150, // "`"
94, // "a"
90, // "b"
100, // "c"
104, // "d"
93, // "e"
105, // "f"
114, // "g"
110, // "h"
106, // "i"
148, // "j"
99, // "k"
92, // "l"
113, // "m"
95, // "n"
91, // "o"
109, // "p"
148, // "q"
98, // "r"
101, // "s"
103, // "t"
108, // "u"
111, // "v"
107, // "w"
102, // "x"
112, // "y"
115, // "z"
134, // "{"
136, // "|"
135, // "}"
150, // "~"
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
"token ::= # NESTEDCOMMENT", // 89
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 90
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 91
"reserved ::= `boolean", // 92
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 93
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 94
"reserved ::= `break", // 95
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 96
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 97
"reserved ::= `class", // 98
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 99
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 100
"reserved ::= `else", // 101
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 102
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 103
"reserved ::= `extends", // 104
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 105
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 106
"reserved ::= `false", // 107
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 108
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 109
"reserved ::= `for", // 110
"`if ::= \"i\" \"f\" !idChar ws*", // 111
"`if ::= \"i\" \"f\" !idChar ws*", // 112
"reserved ::= `if", // 113
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 114
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 115
"reserved ::= `instanceof", // 116
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 117
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 118
"reserved ::= `int", // 119
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 120
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 121
"reserved ::= `new", // 122
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 123
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 124
"reserved ::= `null", // 125
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 126
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 127
"reserved ::= `public", // 128
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 129
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 130
"reserved ::= `return", // 131
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 132
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 133
"reserved ::= `super", // 134
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 135
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 136
"reserved ::= `switch", // 137
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 138
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 139
"reserved ::= `this", // 140
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 141
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 142
"reserved ::= `true", // 143
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 144
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 145
"reserved ::= `void", // 146
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 147
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 148
"reserved ::= `while", // 149
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 150
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 151
"reserved ::= `abstract", // 152
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 153
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 154
"reserved ::= `assert", // 155
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 156
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 157
"reserved ::= `byte", // 158
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 159
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 160
"reserved ::= `case", // 161
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 162
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 163
"reserved ::= `catch", // 164
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 165
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 166
"reserved ::= `char", // 167
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 168
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 169
"reserved ::= `const", // 170
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 171
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 172
"reserved ::= `continue", // 173
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 174
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 175
"reserved ::= `default", // 176
"`do ::= \"d\" \"o\" !idChar ws*", // 177
"`do ::= \"d\" \"o\" !idChar ws*", // 178
"reserved ::= `do", // 179
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 180
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 181
"reserved ::= `double", // 182
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 183
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 184
"reserved ::= `enum", // 185
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 186
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 187
"reserved ::= `final", // 188
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 189
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 190
"reserved ::= `finally", // 191
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 192
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 193
"reserved ::= `float", // 194
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 195
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 196
"reserved ::= `goto", // 197
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 198
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 199
"reserved ::= `implements", // 200
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 201
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 202
"reserved ::= `import", // 203
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 204
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 205
"reserved ::= `interface", // 206
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 207
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 208
"reserved ::= `long", // 209
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 210
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 211
"reserved ::= `native", // 212
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 213
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 214
"reserved ::= `package", // 215
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 216
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 217
"reserved ::= `private", // 218
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 219
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 220
"reserved ::= `protected", // 221
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 222
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 223
"reserved ::= `short", // 224
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 225
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 226
"reserved ::= `static", // 227
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 228
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 229
"reserved ::= `strictfp", // 230
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 231
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 232
"reserved ::= `synchronized", // 233
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 234
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 235
"reserved ::= `throw", // 236
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 237
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 238
"reserved ::= `throws", // 239
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 240
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 241
"reserved ::= `transient", // 242
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 243
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 244
"reserved ::= `try", // 245
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 246
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 247
"reserved ::= `volatile", // 248
"`! ::= \"!\" !\"=\" ws*", // 249
"`! ::= \"!\" !\"=\" ws*", // 250
"`!= ::= \"!\" \"=\" ws*", // 251
"`!= ::= \"!\" \"=\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`% ::= \"%\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`&& ::= \"&\" \"&\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`( ::= \"(\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`) ::= \")\" ws*", // 260
"`* ::= \"*\" !\"/\" ws*", // 261
"`* ::= \"*\" !\"/\" ws*", // 262
"`+ ::= \"+\" !\"+\" ws*", // 263
"`+ ::= \"+\" !\"+\" ws*", // 264
"`++ ::= \"+\" \"+\" ws*", // 265
"`++ ::= \"+\" \"+\" ws*", // 266
"`, ::= \",\" ws*", // 267
"`, ::= \",\" ws*", // 268
"`- ::= \"-\" !\"-\" ws*", // 269
"`- ::= \"-\" !\"-\" ws*", // 270
"`-- ::= \"-\" \"-\" ws*", // 271
"`-- ::= \"-\" \"-\" ws*", // 272
"`. ::= \".\" ws*", // 273
"`. ::= \".\" ws*", // 274
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 275
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 276
"`: ::= \":\" ws*", // 277
"`: ::= \":\" ws*", // 278
"`; ::= \";\" ws*", // 279
"`; ::= \";\" ws*", // 280
"`< ::= \"<\" !\"=\" ws*", // 281
"`< ::= \"<\" !\"=\" ws*", // 282
"`<= ::= \"<\" \"=\" ws*", // 283
"`<= ::= \"<\" \"=\" ws*", // 284
"`= ::= \"=\" !\"=\" ws*", // 285
"`= ::= \"=\" !\"=\" ws*", // 286
"`== ::= \"=\" \"=\" ws*", // 287
"`== ::= \"=\" \"=\" ws*", // 288
"`> ::= \">\" !\"=\" ws*", // 289
"`> ::= \">\" !\"=\" ws*", // 290
"`>= ::= \">\" \"=\" ws*", // 291
"`>= ::= \">\" \"=\" ws*", // 292
"`[ ::= \"[\" ws*", // 293
"`[ ::= \"[\" ws*", // 294
"`] ::= \"]\" ws*", // 295
"`] ::= \"]\" ws*", // 296
"`{ ::= \"{\" ws*", // 297
"`{ ::= \"{\" ws*", // 298
"`} ::= \"}\" ws*", // 299
"`} ::= \"}\" ws*", // 300
"`|| ::= \"|\" \"|\" ws*", // 301
"`|| ::= \"|\" \"|\" ws*", // 302
"INTLIT ::= # intLit2 ws*", // 303
"INTLIT ::= # intLit2 ws*", // 304
"intLit2 ::= !\"0\" digit++", // 305
"digit ::= {\"0\"..\"9\"}", // 306
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 307
"CHARLIT ::= # \"\'\" printable \"\'\" ws*", // 308
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 309
"STRINGLIT ::= # \'\"\' idChar++ \'\"\' ws*", // 310
"idChar ::= letter", // 311
"idChar ::= digit", // 312
"idChar ::= \"_\"", // 313
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 314
"printable ::= {\" \"..\"~\"}", // 315
"ws ::= {9 \" \"}", // 316
"ws ::= eol", // 317
"eol ::= {10} registerNewline", // 318
"eol ::= {13} {10} registerNewline", // 319
"eol ::= {13} !10 registerNewline", // 320
"NESTEDCOMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !{\"*\" \"/\"} !!{\"*\" \"/\"} ws* idChar++ !!{\"*\" \"/\"} ws* idChar++ ws* !!{\"*\" \"/\"}", // 321
"NESTEDCOMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !{\"*\" \"/\"} !!{\"*\" \"/\"} ws* idChar++ !!{\"*\" \"/\"} ws* idChar++ ws* !!{\"*\" \"/\"}", // 322
"ID ::= !reserved letter idChar** ws*", // 323
"ID ::= !reserved letter idChar** ws*", // 324
"ID ::= !reserved letter idChar** ws*", // 325
"ID ::= !reserved letter idChar** ws*", // 326
"token* ::= token* token", // 327
"token* ::= token* token", // 328
"digit++ ::= digit+ !digit", // 329
"idChar++ ::= idChar+ !idChar", // 330
"idChar** ::= idChar* !idChar", // 331
"ws* ::= ws* ws", // 332
"ws* ::= ws* ws", // 333
"digit+ ::= digit", // 334
"digit+ ::= digit+ digit", // 335
"idChar+ ::= idChar", // 336
"idChar+ ::= idChar+ idChar", // 337
"idChar* ::= idChar* idChar", // 338
"idChar* ::= idChar* idChar", // 339
"", // 340
"", // 341
"", // 342
"", // 343
"", // 344
"", // 345
"", // 346
"", // 347
"", // 348
"", // 349
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: token ::= [#] NESTEDCOMMENT @sawNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 90: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
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
    { // 91: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
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
    { // 92: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 93: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
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
    { // 94: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
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
    { // 95: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 96: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
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
    { // 97: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
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
    { // 98: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 99: `else ::= "e" "l" "s" "e" !idChar ws* @void
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
    { // 100: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
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
    { // 101: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 102: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
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
    { // 103: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
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
    { // 104: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 105: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
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
    { // 106: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
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
    { // 107: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 108: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 111: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 112: `if ::= "i" "f" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 113: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 114: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
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
    { // 115: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
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
    { // 116: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 117: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 120: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 123: `null ::= "n" "u" "l" "l" !idChar ws* @void
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
    { // 124: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
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
    { // 125: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 126: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
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
    { // 127: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
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
    { // 128: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 129: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
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
    { // 130: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
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
    { // 131: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 132: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
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
    { // 133: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
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
    { // 134: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 135: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
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
    { // 136: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
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
    { // 137: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 138: `this ::= "t" "h" "i" "s" !idChar ws* @void
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
    { // 139: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
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
    { // 140: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 141: `true ::= "t" "r" "u" "e" !idChar ws* @void
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
    { // 142: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
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
    { // 143: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 144: `void ::= "v" "o" "i" "d" !idChar ws* @void
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
    { // 145: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
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
    { // 146: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 147: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
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
    { // 148: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
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
    { // 149: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 150: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
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
    { // 151: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
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
    { // 152: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 153: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
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
    { // 154: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
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
    { // 155: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 156: `byte ::= "b" "y" "t" "e" !idChar ws* @void
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
    { // 157: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
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
    { // 158: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 159: `case ::= "c" "a" "s" "e" !idChar ws* @void
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
    { // 160: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
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
    { // 161: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 162: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
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
    { // 163: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
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
    { // 164: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 165: `char ::= "c" "h" "a" "r" !idChar ws* @void
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
    { // 166: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
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
    { // 167: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 168: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
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
    { // 169: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
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
    { // 170: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 171: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
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
    { // 172: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
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
    { // 173: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 174: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
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
    { // 175: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
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
    { // 176: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 177: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `do ::= "d" "o" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 180: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
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
    { // 181: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
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
    { // 182: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 183: `enum ::= "e" "n" "u" "m" !idChar ws* @void
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
    { // 184: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
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
    { // 185: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 186: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
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
    { // 187: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
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
    { // 188: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 189: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
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
    { // 190: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
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
    { // 191: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 192: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
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
    { // 193: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
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
    { // 194: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 195: `goto ::= "g" "o" "t" "o" !idChar ws* @void
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
    { // 196: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
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
    { // 197: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 198: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
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
    { // 199: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
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
    { // 200: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 201: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
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
    { // 202: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
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
    { // 203: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 204: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
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
    { // 205: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
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
    { // 206: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 207: `long ::= "l" "o" "n" "g" !idChar ws* @void
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
    { // 208: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
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
    { // 209: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 210: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
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
    { // 211: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
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
    { // 212: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 213: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
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
    { // 214: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
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
    { // 215: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 216: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
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
    { // 217: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
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
    { // 218: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 219: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
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
    { // 220: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
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
    { // 221: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 222: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
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
    { // 223: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
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
    { // 224: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 225: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
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
    { // 226: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
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
    { // 227: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 228: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
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
    { // 229: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
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
    { // 230: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 231: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
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
    { // 232: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
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
    { // 233: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 234: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
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
    { // 235: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
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
    { // 236: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 237: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
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
    { // 238: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
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
    { // 239: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 240: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
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
    { // 241: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
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
    { // 242: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 243: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 244: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 245: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 246: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
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
    { // 247: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
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
    { // 248: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 249: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 250: `! ::= "!" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 251: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 252: `!= ::= "!" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 253: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `% ::= "%" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `&& ::= "&" "&" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 257: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `* ::= "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `* ::= "*" !"/" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 264: `+ ::= "+" !"+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 265: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 266: `++ ::= "+" "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 267: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `, ::= "," [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 270: `- ::= "-" !"-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 271: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 272: `-- ::= "-" "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 273: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `. ::= "." [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `: ::= ":" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 280: `; ::= ";" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 281: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `< ::= "<" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `<= ::= "<" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `= ::= "=" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `> ::= ">" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 292: `>= ::= ">" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 293: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `[ ::= "[" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 296: `] ::= "]" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 297: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `{ ::= "{" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 300: `} ::= "}" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 301: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 302: `|| ::= "|" "|" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 303: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 304: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 306: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 307: CHARLIT ::= [#] "'" printable "'" ws* @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: CHARLIT ::= [#] "'" printable "'" [ws*] @printableToAscii(int,char,char,char)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 309: STRINGLIT ::= [#] '"' idChar++ '"' ws* @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: STRINGLIT ::= [#] '"' idChar++ '"' [ws*] @charsToStringLiteral(int,char,List<Character>,char)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 311: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 312: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 313: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 314: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 315: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 316: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 317: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 318: eol ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 319: eol ::= {13} {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 320: eol ::= {13} !10 [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 321: NESTEDCOMMENT ::= [#] "/" "*" ws* $$1 @reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 322: NESTEDCOMMENT ::= [#] "/" "*" [ws*] $$1 @reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 323: ID ::= !reserved letter idChar** $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 324: ID ::= !reserved letter idChar** [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 325: ID ::= !reserved letter !idChar [idChar**] $$2 @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 326: ID ::= !reserved letter !idChar [idChar**] [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 327: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 328: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 329: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 330: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 333: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 334: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 335: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 336: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 337: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 338: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 339: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 340: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 341: $$1 ::= idChar++ ws* $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: $$1 ::= idChar++ [ws*] $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: $$2 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 344: $$3 ::= !{"*" "/"} !!{"*" "/"} ws* $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 345: $$3 ::= !{"*" "/"} !!{"*" "/"} [ws*] $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 346: $$4 ::= idChar++ !!{"*" "/"} ws* $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 347: $$4 ::= idChar++ !!{"*" "/"} [ws*] $$5 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 348: $$5 ::= idChar++ ws* !!{"*" "/"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 349: $$5 ::= idChar++ !!{"*" "/"} [ws*] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "idChar** ::= idChar* !idChar", // idChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // ws*
    },
    { // idChar**
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((90<<5)|0x5)/*methodCall:90*/,
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
      actionObject.sawNestedComment(parm0);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      char parm2 = (Character)si.popPb();
      char parm3 = (Character)si.popPb();
      int result = actionObject.printableToAscii(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      char parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      char parm3 = (Character)si.popPb();
      String result = actionObject.charsToStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      List<Character> parm3 = (List<Character>)si.popPb();
      List<Character> parm4 = (List<Character>)si.popPb();
      List<Character> parm5 = (List<Character>)si.popPb();
      actionObject.reportNestedComment(parm0,parm1,parm2,parm3,parm4,parm5);
    }
    break;
    case 89: {
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 90: {
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
"void sawNestedComment(int)",
"int convertToInt(int,String)",
"int printableToAscii(int,char,char,char)",
"String charsToStringLiteral(int,char,List<Character>,char)",
"void reportNestedComment(int,Character,Character,List<Character>,List<Character>,List<Character>)",
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
1,0,
2,1,
4,1,
4,1,
6,0,
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
    0,
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
    3,
    1,
    0,
    0,
    1,
    1,
    1,
    2,
    2,
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
