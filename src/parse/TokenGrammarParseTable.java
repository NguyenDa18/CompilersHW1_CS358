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
public int getEofSym() { return 163; }
public int getNttSym() { return 164; }
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
"token*",
"digit+",
"idChar+",
"$$2",
"$$3",
"$$4",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 165;}
private static final int MIN_REDUCTION = 698;
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
0x80000000|241, // match move
0x80000000|442, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1
  }
,
{ // state 2
2,539, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 3
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 4
103,305, // "t"
  }
,
{ // state 5
0x80000000|153, // match move
0x80000000|333, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 6
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 7
2,173, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 8
94,367, // "a"
  }
,
{ // state 9
91,412, // "o"
  }
,
{ // state 10
0x80000000|250, // match move
0x80000000|340, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 11
164,MIN_REDUCTION+313, // $NT
  }
,
{ // state 12
164,MIN_REDUCTION+203, // $NT
  }
,
{ // state 13
110,570, // "h"
  }
,
{ // state 14
93,654, // "e"
  }
,
{ // state 15
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 16
105,281, // "f"
  }
,
{ // state 17
110,132, // "h"
  }
,
{ // state 18
106,364, // "i"
  }
,
{ // state 19
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+219, // $NT
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|642, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 22
101,379, // "s"
  }
,
{ // state 23
164,MIN_REDUCTION+146, // $NT
  }
,
{ // state 24
124,464, // "+"
  }
,
{ // state 25
106,644, // "i"
  }
,
{ // state 26
91,278, // "o"
  }
,
{ // state 27
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 28
164,MIN_REDUCTION+137, // $NT
  }
,
{ // state 29
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 30
2,105, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 31
109,631, // "p"
  }
,
{ // state 32
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 33
101,245, // "s"
  }
,
{ // state 34
0x80000000|165, // match move
0x80000000|395, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 35
93,381, // "e"
  }
,
{ // state 36
0x80000000|195, // match move
0x80000000|667, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 37
138,309, // "0"
141,309, // {"1".."9"}
  }
,
{ // state 38
0x80000000|40, // match move
0x80000000|169, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 39
92,343, // "l"
  }
,
{ // state 40
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 41
95,488, // "n"
  }
,
{ // state 42
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 43
164,MIN_REDUCTION+92, // $NT
  }
,
{ // state 44
101,500, // "s"
103,492, // "t"
  }
,
{ // state 45
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 46
0x80000000|351, // match move
0x80000000|548, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 47
101,656, // "s"
  }
,
{ // state 48
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 49
164,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 50
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 51
1,100, // start
2,36, // ws*
3,474, // $$0
4,114, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
62,490, // `*
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
122,424, // "*"
137,408, // intLit2
139,247, // digit++
140,38, // digit
146,111, // letter
151,525, // ws
153,415, // eol
157,423, // token*
158,10, // digit+
  }
,
{ // state 52
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 53
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+156, // $NT
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 54
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 55
110,404, // "h"
  }
,
{ // state 56
103,90, // "t"
  }
,
{ // state 57
106,362, // "i"
  }
,
{ // state 58
2,648, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 59
93,133, // "e"
  }
,
{ // state 60
2,234, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 62
95,618, // "n"
  }
,
{ // state 63
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 64
2,168, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 65
94,418, // "a"
  }
,
{ // state 66
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 68
91,687, // "o"
  }
,
{ // state 69
114,530, // "g"
  }
,
{ // state 70
0x80000000|1, // match move
0x80000000|130, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 71
111,334, // "v"
  }
,
{ // state 72
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 73
103,639, // "t"
  }
,
{ // state 74
164,MIN_REDUCTION+227, // $NT
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 76
2,662, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 77
103,346, // "t"
  }
,
{ // state 78
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 79
126,591, // "-"
  }
,
{ // state 80
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 81
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 82
2,348, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 83
164,MIN_REDUCTION+230, // $NT
  }
,
{ // state 84
95,44, // "n"
  }
,
{ // state 85
2,86, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 86
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 87
2,225, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 88
101,284, // "s"
  }
,
{ // state 89
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 90
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 91
103,411, // "t"
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 93
164,MIN_REDUCTION+209, // $NT
  }
,
{ // state 94
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 95
90,459, // "b"
  }
,
{ // state 96
0x80000000|435, // match move
0x80000000|650, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 97
92,65, // "l"
106,531, // "i"
  }
,
{ // state 98
101,671, // "s"
103,373, // "t"
  }
,
{ // state 99
2,29, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 100
163,MIN_REDUCTION+0, // $
  }
,
{ // state 101
94,148, // "a"
108,118, // "u"
112,369, // "y"
  }
,
{ // state 102
104,535, // "d"
  }
,
{ // state 103
4,318, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
  }
,
{ // state 104
164,MIN_REDUCTION+107, // $NT
  }
,
{ // state 105
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 106
91,421, // "o"
  }
,
{ // state 107
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 108
2,219, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 110
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 111
90,149, // "b"
91,149, // "o"
92,149, // "l"
93,149, // "e"
94,149, // "a"
95,149, // "n"
96,227, // idChar
98,149, // "r"
99,149, // "k"
100,149, // "c"
101,149, // "s"
102,149, // "x"
103,149, // "t"
104,149, // "d"
105,149, // "f"
106,149, // "i"
107,149, // "w"
108,149, // "u"
109,149, // "p"
110,149, // "h"
111,149, // "v"
112,149, // "y"
113,149, // "m"
114,149, // "g"
115,149, // "z"
138,579, // "0"
140,310, // digit
141,579, // {"1".."9"}
145,159, // idChar++
146,483, // letter
147,5, // "_"
148,149, // {"A".."Z" "j" "q"}
159,428, // idChar+
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|665, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 113
92,170, // "l"
95,450, // "n"
98,16, // "r"
102,680, // "x"
  }
,
{ // state 114
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 115
103,468, // "t"
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
93,514, // "e"
  }
,
{ // state 119
164,MIN_REDUCTION+206, // $NT
  }
,
{ // state 120
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 121
91,286, // "o"
106,71, // "i"
  }
,
{ // state 122
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 123
0x80000000|1, // match move
0x80000000|30, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 124
92,484, // "l"
  }
,
{ // state 125
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 126
92,436, // "l"
  }
,
{ // state 127
113,365, // "m"
  }
,
{ // state 128
164,MIN_REDUCTION+224, // $NT
  }
,
{ // state 129
95,187, // "n"
  }
,
{ // state 130
2,443, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 131
91,97, // "o"
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|85, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 133
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 134
2,538, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 135
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 138
106,449, // "i"
  }
,
{ // state 139
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 140
0x80000000|498, // match move
0x80000000|602, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 141
106,544, // "i"
  }
,
{ // state 142
5,43, // `boolean
6,385, // `class
7,669, // `extends
8,23, // `void
9,439, // `int
10,472, // `while
11,572, // `if
12,690, // `else
13,460, // `for
14,555, // `break
15,517, // `this
16,104, // `false
17,292, // `true
18,584, // `super
19,344, // `null
20,485, // `return
21,308, // `instanceof
22,685, // `new
23,612, // `abstract
24,594, // `assert
25,493, // `byte
26,655, // `case
27,303, // `catch
28,635, // `char
29,249, // `const
30,331, // `continue
31,384, // `default
32,510, // `do
33,255, // `double
34,389, // `enum
35,298, // `final
36,232, // `finally
37,203, // `float
38,508, // `goto
39,391, // `implements
40,12, // `import
41,119, // `interface
42,93, // `long
43,390, // `native
44,528, // `package
45,566, // `private
46,583, // `protected
47,320, // `public
48,128, // `short
49,74, // `static
50,83, // `strictfp
51,28, // `switch
52,409, // `synchronized
53,236, // `throw
54,586, // `throws
55,546, // `transient
56,558, // `try
57,564, // `volatile
90,432, // "b"
92,574, // "l"
93,433, // "e"
94,695, // "a"
95,613, // "n"
98,360, // "r"
100,218, // "c"
101,552, // "s"
103,588, // "t"
104,682, // "d"
105,332, // "f"
106,446, // "i"
107,55, // "w"
109,399, // "p"
111,131, // "v"
114,9, // "g"
  }
,
{ // state 143
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 144
2,199, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 145
2,271, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 146
91,476, // "o"
  }
,
{ // state 147
0x80000000|257, // match move
0x80000000|568, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 148
95,505, // "n"
  }
,
{ // state 149
0x80000000|156, // match move
0x80000000|230, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 150
2,294, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 151
110,467, // "h"
  }
,
{ // state 152
164,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 154
94,368, // "a"
  }
,
{ // state 155
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 158
94,126, // "a"
  }
,
{ // state 159
2,110, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 160
98,447, // "r"
  }
,
{ // state 161
93,480, // "e"
  }
,
{ // state 162
100,151, // "c"
  }
,
{ // state 163
0x80000000|563, // match move
0x80000000|345, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 164
94,341, // "a"
  }
,
{ // state 165
117,479, // "="
  }
,
{ // state 166
107,559, // "w"
  }
,
{ // state 167
93,477, // "e"
  }
,
{ // state 168
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 170
101,537, // "s"
  }
,
{ // state 171
101,382, // "s"
  }
,
{ // state 172
2,78, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 173
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 174
91,673, // "o"
  }
,
{ // state 175
109,161, // "p"
  }
,
{ // state 176
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 177
2,576, // ws*
151,525, // ws
153,415, // eol
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 178
164,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 179
2,80, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 180
-1, // $$start
100, // start
36, // ws*
474, // $$0
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
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
664, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
486, // "b"
486, // "o"
486, // "l"
486, // "e"
486, // "a"
486, // "n"
-1, // idChar
-1, // reserved
486, // "r"
486, // "k"
486, // "c"
486, // "s"
486, // "x"
486, // "t"
486, // "d"
486, // "f"
486, // "i"
486, // "w"
486, // "u"
486, // "p"
486, // "h"
486, // "v"
486, // "y"
486, // "m"
486, // "g"
486, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
-1, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
408, // intLit2
549, // "0"
247, // digit++
38, // digit
549, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
111, // letter
-1, // "_"
486, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
423, // token*
10, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 181
2,50, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 182
2,311, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 183
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 184
2,401, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 185
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 186
90,149, // "b"
91,149, // "o"
92,149, // "l"
93,149, // "e"
94,149, // "a"
95,149, // "n"
96,523, // idChar
98,149, // "r"
99,149, // "k"
100,149, // "c"
101,149, // "s"
102,149, // "x"
103,149, // "t"
104,149, // "d"
105,149, // "f"
106,149, // "i"
107,149, // "w"
108,149, // "u"
109,149, // "p"
110,149, // "h"
111,149, // "v"
112,149, // "y"
113,149, // "m"
114,149, // "g"
115,149, // "z"
138,579, // "0"
140,310, // digit
141,579, // {"1".."9"}
146,483, // letter
147,5, // "_"
148,149, // {"A".."Z" "j" "q"}
  }
,
{ // state 187
108,604, // "u"
  }
,
{ // state 188
142,280, // "'"
  }
,
{ // state 189
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|445, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 191
2,94, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 193
2,259, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 194
0x80000000|372, // match move
0x80000000|252, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 195
0x80000000|1, // match move
0x80000000|342, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 196
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 199
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 200
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 201
99,620, // "k"
  }
,
{ // state 202
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 203
164,MIN_REDUCTION+194, // $NT
  }
,
{ // state 204
2,438, // ws*
151,525, // ws
153,415, // eol
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 205
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 206
1,100, // start
2,36, // ws*
3,474, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
90,432, // "b"
92,574, // "l"
93,433, // "e"
94,695, // "a"
95,613, // "n"
98,360, // "r"
100,218, // "c"
101,552, // "s"
103,588, // "t"
104,682, // "d"
105,332, // "f"
106,446, // "i"
107,55, // "w"
109,399, // "p"
111,131, // "v"
114,9, // "g"
157,423, // token*
163,MIN_REDUCTION+1, // $
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|144, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 208
2,213, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 209
105,601, // "f"
  }
,
{ // state 210
164,MIN_REDUCTION+311, // $NT
  }
,
{ // state 211
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 212
0x80000000|593, // match move
0x80000000|670, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 213
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 214
2,54, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 215
93,606, // "e"
  }
,
{ // state 216
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 217
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 218
91,84, // "o"
92,164, // "l"
94,98, // "a"
110,522, // "h"
  }
,
{ // state 219
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 220
90,149, // "b"
91,149, // "o"
92,149, // "l"
93,149, // "e"
94,149, // "a"
95,149, // "n"
96,227, // idChar
98,149, // "r"
99,149, // "k"
100,149, // "c"
101,149, // "s"
102,149, // "x"
103,149, // "t"
104,149, // "d"
105,149, // "f"
106,149, // "i"
107,149, // "w"
108,149, // "u"
109,149, // "p"
110,149, // "h"
111,149, // "v"
112,149, // "y"
113,149, // "m"
114,149, // "g"
115,149, // "z"
138,579, // "0"
140,310, // digit
141,579, // {"1".."9"}
145,419, // idChar++
146,483, // letter
147,5, // "_"
148,149, // {"A".."Z" "j" "q"}
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
156,136, // $$1
159,428, // idChar+
  }
,
{ // state 221
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 222
92,637, // "l"
  }
,
{ // state 223
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 225
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 227
0x80000000|686, // match move
0x80000000|306, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 228
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 229
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 231
2,580, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 232
164,MIN_REDUCTION+191, // $NT
  }
,
{ // state 233
100,557, // "c"
  }
,
{ // state 234
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 235
93,540, // "e"
  }
,
{ // state 236
164,MIN_REDUCTION+236, // $NT
  }
,
{ // state 237
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 238
144,191, // '"'
  }
,
{ // state 239
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 240
95,69, // "n"
  }
,
{ // state 241
0x80000000|1, // match move
0x80000000|388, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 242
95,112, // "n"
  }
,
{ // state 243
93,643, // "e"
  }
,
{ // state 244
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 245
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 246
0x80000000|571, // match move
0x80000000|226, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 247
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 248
3,553, // $$0
4,114, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
62,490, // `*
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
122,424, // "*"
137,408, // intLit2
139,247, // digit++
140,38, // digit
146,111, // letter
151,49, // ws
153,415, // eol
157,423, // token*
158,10, // digit+
  }
,
{ // state 249
164,MIN_REDUCTION+170, // $NT
  }
,
{ // state 250
138,549, // "0"
140,246, // digit
141,549, // {"1".."9"}
  }
,
{ // state 251
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 252
-1, // $$start
-1, // start
406, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
200, // `boolean
676, // `class
202, // `extends
6, // `void
275, // `int
347, // `while
502, // `if
143, // `else
509, // `for
598, // `break
223, // `this
185, // `false
300, // `true
258, // `super
45, // `null
109, // `return
405, // `instanceof
599, // `new
375, // `abstract
471, // `assert
688, // `byte
519, // `case
691, // `catch
427, // `char
499, // `const
590, // `continue
565, // `default
440, // `do
176, // `double
67, // `enum
137, // `final
329, // `finally
116, // `float
192, // `goto
597, // `implements
61, // `import
313, // `interface
481, // `long
380, // `native
478, // `package
338, // `private
42, // `protected
352, // `public
657, // `short
198, // `static
422, // `strictfp
107, // `switch
431, // `synchronized
536, // `throw
63, // `throws
315, // `transient
20, // `try
269, // `volatile
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
-1, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
432, // "b"
MIN_REDUCTION+235, // "o"
574, // "l"
433, // "e"
695, // "a"
613, // "n"
-1, // idChar
-1, // reserved
360, // "r"
MIN_REDUCTION+235, // "k"
218, // "c"
511, // "s"
MIN_REDUCTION+235, // "x"
588, // "t"
682, // "d"
332, // "f"
446, // "i"
55, // "w"
MIN_REDUCTION+235, // "u"
399, // "p"
MIN_REDUCTION+235, // "h"
131, // "v"
MIN_REDUCTION+235, // "y"
MIN_REDUCTION+235, // "m"
9, // "g"
MIN_REDUCTION+235, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
MIN_REDUCTION+235, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
-1, // intLit2
MIN_REDUCTION+235, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+235, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+235, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 253
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 254
93,675, // "e"
  }
,
{ // state 255
164,MIN_REDUCTION+182, // $NT
  }
,
{ // state 256
103,653, // "t"
  }
,
{ // state 257
4,318, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
  }
,
{ // state 258
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 259
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 260
90,616, // "b"
  }
,
{ // state 261
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 262
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 263
2,466, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 264
2,32, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 265
0x80000000|376, // match move
0x80000000|152, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 266
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+195, // $NT
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 267
2,296, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 270
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 271
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 272
2,363, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 273
0x80000000|206, // match move
0x80000000|180, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 274
94,556, // "a"
  }
,
{ // state 275
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 276
93,529, // "e"
  }
,
{ // state 277
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 278
92,619, // "l"
  }
,
{ // state 279
2,358, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 280
2,302, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 281
94,630, // "a"
  }
,
{ // state 282
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 283
0x80000000|356, // match move
0x80000000|299, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|214, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 285
2,316, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 286
103,527, // "t"
  }
,
{ // state 287
122,414, // "*"
  }
,
{ // state 288
106,307, // "i"
110,404, // "h"
  }
,
{ // state 289
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 290
106,354, // "i"
  }
,
{ // state 291
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 292
164,MIN_REDUCTION+143, // $NT
  }
,
{ // state 293
2,512, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 294
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 295
1,100, // start
2,36, // ws*
3,474, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
157,423, // token*
  }
,
{ // state 296
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 297
103,608, // "t"
  }
,
{ // state 298
164,MIN_REDUCTION+188, // $NT
  }
,
{ // state 299
-1, // $$start
-1, // start
-1, // ws*
553, // $$0
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
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
664, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
486, // "b"
486, // "o"
486, // "l"
486, // "e"
486, // "a"
486, // "n"
-1, // idChar
-1, // reserved
486, // "r"
486, // "k"
486, // "c"
486, // "s"
486, // "x"
486, // "t"
486, // "d"
486, // "f"
486, // "i"
486, // "w"
486, // "u"
486, // "p"
486, // "h"
486, // "v"
486, // "y"
486, // "m"
486, // "g"
486, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
-1, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
408, // intLit2
549, // "0"
247, // digit++
38, // digit
549, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
111, // letter
-1, // "_"
486, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
49, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
423, // token*
10, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 300
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 301
93,689, // "e"
  }
,
{ // state 302
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 303
164,MIN_REDUCTION+164, // $NT
  }
,
{ // state 304
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 305
108,647, // "u"
  }
,
{ // state 306
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 307
103,693, // "t"
  }
,
{ // state 308
164,MIN_REDUCTION+116, // $NT
  }
,
{ // state 309
164,MIN_REDUCTION+306, // $NT
  }
,
{ // state 310
0x80000000|268, // match move
0x80000000|335, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 311
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 312
99,123, // "k"
  }
,
{ // state 313
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 314
98,592, // "r"
  }
,
{ // state 315
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 316
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 317
0x80000000|1, // match move
0x80000000|76, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 318
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 319
0x80000000|1, // match move
0x80000000|417, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 320
164,MIN_REDUCTION+128, // $NT
  }
,
{ // state 321
2,205, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 322
98,16, // "r"
  }
,
{ // state 323
111,678, // "v"
  }
,
{ // state 324
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 325
2,239, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 326
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 327
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 328
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 329
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 330
103,482, // "t"
  }
,
{ // state 331
164,MIN_REDUCTION+173, // $NT
  }
,
{ // state 332
91,496, // "o"
92,402, // "l"
94,386, // "a"
106,542, // "i"
  }
,
{ // state 333
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 334
94,73, // "a"
  }
,
{ // state 335
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 336
0x80000000|1, // match move
0x80000000|429, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 337
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 339
103,33, // "t"
  }
,
{ // state 340
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 341
101,47, // "s"
  }
,
{ // state 342
0x80000000|674, // match move
0x80000000|248, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 343
103,451, // "t"
  }
,
{ // state 344
164,MIN_REDUCTION+125, // $NT
  }
,
{ // state 345
-1, // $$start
-1, // start
609, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
200, // `boolean
676, // `class
202, // `extends
6, // `void
275, // `int
347, // `while
502, // `if
143, // `else
509, // `for
598, // `break
223, // `this
185, // `false
300, // `true
258, // `super
45, // `null
109, // `return
405, // `instanceof
599, // `new
375, // `abstract
471, // `assert
688, // `byte
519, // `case
691, // `catch
427, // `char
499, // `const
590, // `continue
565, // `default
440, // `do
176, // `double
67, // `enum
137, // `final
329, // `finally
116, // `float
192, // `goto
597, // `implements
61, // `import
313, // `interface
481, // `long
380, // `native
478, // `package
338, // `private
42, // `protected
352, // `public
657, // `short
198, // `static
422, // `strictfp
107, // `switch
431, // `synchronized
536, // `throw
63, // `throws
315, // `transient
20, // `try
269, // `volatile
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
-1, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
432, // "b"
MIN_REDUCTION+118, // "o"
574, // "l"
113, // "e"
695, // "a"
613, // "n"
-1, // idChar
-1, // reserved
360, // "r"
MIN_REDUCTION+118, // "k"
218, // "c"
552, // "s"
MIN_REDUCTION+118, // "x"
588, // "t"
682, // "d"
332, // "f"
446, // "i"
55, // "w"
MIN_REDUCTION+118, // "u"
399, // "p"
MIN_REDUCTION+118, // "h"
131, // "v"
MIN_REDUCTION+118, // "y"
MIN_REDUCTION+118, // "m"
9, // "g"
MIN_REDUCTION+118, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
MIN_REDUCTION+118, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
-1, // intLit2
MIN_REDUCTION+118, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+118, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+118, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 346
94,41, // "a"
  }
,
{ // state 347
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 348
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 349
3,553, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
157,423, // token*
  }
,
{ // state 350
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 351
108,95, // "u"
  }
,
{ // state 352
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 353
-1, // $$start
-1, // start
438, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
200, // `boolean
676, // `class
202, // `extends
6, // `void
275, // `int
347, // `while
502, // `if
143, // `else
509, // `for
598, // `break
223, // `this
185, // `false
300, // `true
258, // `super
45, // `null
109, // `return
405, // `instanceof
599, // `new
375, // `abstract
471, // `assert
688, // `byte
519, // `case
691, // `catch
427, // `char
499, // `const
590, // `continue
565, // `default
440, // `do
176, // `double
67, // `enum
137, // `final
329, // `finally
116, // `float
192, // `goto
597, // `implements
61, // `import
313, // `interface
481, // `long
380, // `native
478, // `package
338, // `private
42, // `protected
352, // `public
657, // `short
198, // `static
422, // `strictfp
107, // `switch
431, // `synchronized
536, // `throw
63, // `throws
315, // `transient
20, // `try
269, // `volatile
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
-1, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
432, // "b"
MIN_REDUCTION+178, // "o"
574, // "l"
433, // "e"
695, // "a"
613, // "n"
-1, // idChar
-1, // reserved
360, // "r"
MIN_REDUCTION+178, // "k"
218, // "c"
552, // "s"
MIN_REDUCTION+178, // "x"
588, // "t"
682, // "d"
332, // "f"
446, // "i"
55, // "w"
95, // "u"
399, // "p"
MIN_REDUCTION+178, // "h"
131, // "v"
MIN_REDUCTION+178, // "y"
MIN_REDUCTION+178, // "m"
9, // "g"
MIN_REDUCTION+178, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
MIN_REDUCTION+178, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
-1, // intLit2
MIN_REDUCTION+178, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+178, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+178, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 354
100,413, // "c"
  }
,
{ // state 355
0x80000000|595, // match move
0x80000000|194, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 356
3,553, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
90,432, // "b"
92,574, // "l"
93,433, // "e"
94,695, // "a"
95,613, // "n"
98,360, // "r"
100,218, // "c"
101,552, // "s"
103,588, // "t"
104,682, // "d"
105,332, // "f"
106,446, // "i"
107,55, // "w"
109,399, // "p"
111,131, // "v"
114,9, // "g"
157,423, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 357
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 358
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 359
2,377, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 360
93,4, // "e"
  }
,
{ // state 361
0x80000000|600, // match move
0x80000000|398, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 362
115,14, // "z"
  }
,
{ // state 363
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 364
93,62, // "e"
  }
,
{ // state 365
0x80000000|1, // match move
0x80000000|272, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 366
93,652, // "e"
  }
,
{ // state 367
103,75, // "t"
  }
,
{ // state 368
100,56, // "c"
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|293, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 370
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 371
2,634, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 372
2,406, // ws*
151,525, // ws
153,415, // eol
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 373
100,13, // "c"
  }
,
{ // state 374
2,641, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 375
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 376
154,633, // {10}
  }
,
{ // state 377
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 378
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 379
93,454, // "e"
  }
,
{ // state 380
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|469, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 382
0x80000000|1, // match move
0x80000000|658, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 383
101,77, // "s"
103,452, // "t"
  }
,
{ // state 384
164,MIN_REDUCTION+176, // $NT
  }
,
{ // state 385
164,MIN_REDUCTION+98, // $NT
  }
,
{ // state 386
92,22, // "l"
  }
,
{ // state 387
103,35, // "t"
  }
,
{ // state 388
0x80000000|295, // match move
0x80000000|51, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 389
164,MIN_REDUCTION+185, // $NT
  }
,
{ // state 390
164,MIN_REDUCTION+212, // $NT
  }
,
{ // state 391
164,MIN_REDUCTION+200, // $NT
  }
,
{ // state 392
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 393
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 394
0x80000000|561, // match move
0x80000000|683, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 395
2,560, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 396
104,88, // "d"
  }
,
{ // state 397
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 398
2,470, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 399
94,533, // "a"
98,121, // "r"
108,260, // "u"
  }
,
{ // state 400
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 401
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 402
91,8, // "o"
  }
,
{ // state 403
91,240, // "o"
112,237, // "y"
  }
,
{ // state 404
106,124, // "i"
  }
,
{ // state 405
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 406
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 407
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 408
2,337, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 409
164,MIN_REDUCTION+233, // $NT
  }
,
{ // state 410
117,64, // "="
  }
,
{ // state 411
105,31, // "f"
  }
,
{ // state 412
103,68, // "t"
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|325, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 414
2,220, // ws*
90,149, // "b"
91,149, // "o"
92,149, // "l"
93,149, // "e"
94,149, // "a"
95,149, // "n"
96,227, // idChar
98,149, // "r"
99,149, // "k"
100,149, // "c"
101,149, // "s"
102,149, // "x"
103,149, // "t"
104,149, // "d"
105,149, // "f"
106,149, // "i"
107,149, // "w"
108,149, // "u"
109,149, // "p"
110,149, // "h"
111,149, // "v"
112,149, // "y"
113,149, // "m"
114,149, // "g"
115,149, // "z"
138,579, // "0"
140,310, // digit
141,579, // {"1".."9"}
145,419, // idChar++
146,483, // letter
147,5, // "_"
148,149, // {"A".."Z" "j" "q"}
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
156,350, // $$1
159,428, // idChar+
  }
,
{ // state 415
164,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 416
114,59, // "g"
  }
,
{ // state 417
2,666, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 418
103,25, // "t"
  }
,
{ // state 419
2,518, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
160,397, // $$2
  }
,
{ // state 420
4,318, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
83,224, // `/
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
146,111, // letter
  }
,
{ // state 421
95,57, // "n"
  }
,
{ // state 422
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 423
0x80000000|607, // match move
0x80000000|614, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 424
0x80000000|1, // match move
0x80000000|184, // no-match move
// T-test match for "/":
123,
  }
,
{ // state 425
119,267, // "&"
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|524, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 427
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 428
0x80000000|186, // match move
0x80000000|197, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 429
2,684, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 430
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+246, // $NT
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 431
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 432
91,26, // "o"
98,366, // "r"
112,387, // "y"
  }
,
{ // state 433
92,170, // "l"
95,450, // "n"
102,680, // "x"
  }
,
{ // state 434
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 435
4,318, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
90,432, // "b"
92,574, // "l"
93,433, // "e"
94,695, // "a"
95,613, // "n"
98,360, // "r"
100,218, // "c"
101,552, // "s"
103,588, // "t"
104,682, // "d"
105,332, // "f"
106,446, // "i"
107,55, // "w"
109,399, // "p"
111,131, // "v"
114,9, // "g"
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 436
0x80000000|550, // match move
0x80000000|638, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 437
101,115, // "s"
  }
,
{ // state 438
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 439
164,MIN_REDUCTION+119, // $NT
  }
,
{ // state 440
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 441
0x80000000|410, // match move
0x80000000|371, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 442
0x80000000|140, // match move
0x80000000|273, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 443
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 444
108,39, // "u"
  }
,
{ // state 445
2,270, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 446
95,383, // "n"
105,626, // "f"
113,672, // "m"
  }
,
{ // state 447
103,605, // "t"
  }
,
{ // state 448
94,489, // "a"
98,632, // "r"
110,453, // "h"
  }
,
{ // state 449
100,91, // "c"
  }
,
{ // state 450
108,127, // "u"
  }
,
{ // state 451
0x80000000|1, // match move
0x80000000|663, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 452
0x80000000|567, // match move
0x80000000|163, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 453
98,146, // "r"
106,171, // "i"
  }
,
{ // state 454
0x80000000|1, // match move
0x80000000|374, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 455
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 456
2,120, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 458
2,326, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 459
92,575, // "l"
  }
,
{ // state 460
164,MIN_REDUCTION+110, // $NT
  }
,
{ // state 461
0x80000000|79, // match move
0x80000000|181, // no-match move
// T-test match for "-":
126,
  }
,
{ // state 462
93,102, // "e"
  }
,
{ // state 463
2,622, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 464
2,289, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 466
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 467
98,106, // "r"
  }
,
{ // state 468
98,154, // "r"
  }
,
{ // state 469
2,53, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 470
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 471
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 472
164,MIN_REDUCTION+149, // $NT
  }
,
{ // state 473
95,162, // "n"
  }
,
{ // state 474
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 475
0x80000000|103, // match move
0x80000000|420, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 476
107,355, // "w"
  }
,
{ // state 477
91,541, // "o"
  }
,
{ // state 478
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 479
2,357, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 480
98,526, // "r"
  }
,
{ // state 481
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 482
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 483
0x80000000|610, // match move
0x80000000|465, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 484
93,70, // "e"
  }
,
{ // state 485
164,MIN_REDUCTION+131, // $NT
  }
,
{ // state 486
164,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 487
2,253, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 488
100,167, // "c"
  }
,
{ // state 489
103,141, // "t"
  }
,
{ // state 490
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 491
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 492
106,129, // "i"
  }
,
{ // state 493
164,MIN_REDUCTION+158, // $NT
  }
,
{ // state 494
2,66, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 495
2,282, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 496
98,336, // "r"
  }
,
{ // state 497
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 498
1,100, // start
2,36, // ws*
3,474, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
157,423, // token*
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
{ // state 499
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 500
103,319, // "t"
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|569, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 502
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 503
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 504
0x80000000|24, // match move
0x80000000|82, // no-match move
// T-test match for "+":
124,
  }
,
{ // state 505
101,18, // "s"
  }
,
{ // state 506
2,581, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 507
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 508
164,MIN_REDUCTION+197, // $NT
  }
,
{ // state 509
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 510
164,MIN_REDUCTION+179, // $NT
  }
,
{ // state 511
0x80000000|649, // match move
0x80000000|212, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 512
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 513
-1, // $$start
-1, // start
576, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
200, // `boolean
676, // `class
202, // `extends
6, // `void
275, // `int
347, // `while
502, // `if
143, // `else
509, // `for
598, // `break
223, // `this
185, // `false
300, // `true
258, // `super
45, // `null
109, // `return
405, // `instanceof
599, // `new
375, // `abstract
471, // `assert
688, // `byte
519, // `case
691, // `catch
427, // `char
499, // `const
590, // `continue
565, // `default
440, // `do
176, // `double
67, // `enum
137, // `final
329, // `finally
116, // `float
192, // `goto
597, // `implements
61, // `import
313, // `interface
481, // `long
380, // `native
478, // `package
338, // `private
42, // `protected
352, // `public
657, // `short
198, // `static
422, // `strictfp
107, // `switch
431, // `synchronized
536, // `throw
63, // `throws
315, // `transient
20, // `try
269, // `volatile
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
-1, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
432, // "b"
MIN_REDUCTION+187, // "o"
403, // "l"
433, // "e"
695, // "a"
613, // "n"
-1, // idChar
-1, // reserved
360, // "r"
MIN_REDUCTION+187, // "k"
218, // "c"
552, // "s"
MIN_REDUCTION+187, // "x"
588, // "t"
682, // "d"
332, // "f"
446, // "i"
55, // "w"
MIN_REDUCTION+187, // "u"
399, // "p"
MIN_REDUCTION+187, // "h"
131, // "v"
MIN_REDUCTION+187, // "y"
MIN_REDUCTION+187, // "m"
9, // "g"
MIN_REDUCTION+187, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
MIN_REDUCTION+187, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
-1, // intLit2
MIN_REDUCTION+187, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+187, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+187, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 514
0x80000000|1, // match move
0x80000000|611, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 515
2,262, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 516
136,645, // "|"
  }
,
{ // state 517
164,MIN_REDUCTION+140, // $NT
  }
,
{ // state 518
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
160,587, // $$2
  }
,
{ // state 519
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 520
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 521
112,237, // "y"
  }
,
{ // state 522
94,314, // "a"
  }
,
{ // state 523
0x80000000|291, // match move
0x80000000|211, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 524
2,81, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 525
164,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 526
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 527
93,233, // "e"
  }
,
{ // state 528
164,MIN_REDUCTION+215, // $NT
  }
,
{ // state 529
98,330, // "r"
  }
,
{ // state 530
0x80000000|1, // match move
0x80000000|99, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 531
104,216, // "d"
  }
,
{ // state 532
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 533
100,201, // "c"
  }
,
{ // state 534
90,486, // "b"
91,486, // "o"
92,486, // "l"
93,486, // "e"
94,486, // "a"
95,486, // "n"
98,486, // "r"
99,486, // "k"
100,486, // "c"
101,486, // "s"
102,486, // "x"
103,486, // "t"
104,486, // "d"
105,486, // "f"
106,486, // "i"
107,486, // "w"
108,486, // "u"
109,486, // "p"
110,486, // "h"
111,486, // "v"
112,486, // "y"
113,486, // "m"
114,486, // "g"
115,486, // "z"
138,309, // "0"
140,629, // digit
141,309, // {"1".."9"}
146,210, // letter
147,11, // "_"
148,486, // {"A".."Z" "j" "q"}
  }
,
{ // state 535
0x80000000|1, // match move
0x80000000|681, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 536
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 537
93,92, // "e"
  }
,
{ // state 538
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 539
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 540
0x80000000|1, // match move
0x80000000|463, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 541
105,89, // "f"
  }
,
{ // state 542
95,158, // "n"
  }
,
{ // state 543
2,221, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 544
100,636, // "c"
  }
,
{ // state 545
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 546
164,MIN_REDUCTION+242, // $NT
  }
,
{ // state 547
2,651, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 548
0x80000000|204, // match move
0x80000000|353, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 549
0x80000000|122, // match move
0x80000000|497, // no-match move
0x80000000|37, // NT-test-match state for digit
  }
,
{ // state 550
92,521, // "l"
  }
,
{ // state 551
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 552
103,628, // "t"
107,640, // "w"
108,175, // "u"
110,174, // "h"
112,473, // "y"
  }
,
{ // state 553
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 554
2,324, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 555
164,MIN_REDUCTION+95, // $NT
  }
,
{ // state 556
95,621, // "n"
  }
,
{ // state 557
103,462, // "t"
  }
,
{ // state 558
164,MIN_REDUCTION+245, // $NT
  }
,
{ // state 559
0x80000000|1, // match move
0x80000000|58, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 560
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 561
117,193, // "="
  }
,
{ // state 562
2,266, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 563
2,609, // ws*
151,525, // ws
153,415, // eol
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 564
164,MIN_REDUCTION+248, // $NT
  }
,
{ // state 565
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 566
164,MIN_REDUCTION+218, // $NT
  }
,
{ // state 567
93,322, // "e"
  }
,
{ // state 568
4,318, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
62,490, // `*
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
122,424, // "*"
137,408, // intLit2
139,247, // digit++
140,38, // digit
146,111, // letter
158,10, // digit+
  }
,
{ // state 569
2,585, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 570
0x80000000|1, // match move
0x80000000|696, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 571
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 572
164,MIN_REDUCTION+113, // $NT
  }
,
{ // state 573
2,229, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 574
91,240, // "o"
  }
,
{ // state 575
93,589, // "e"
  }
,
{ // state 576
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 577
0x80000000|349, // match move
0x80000000|661, // no-match move
0x80000000|142, // NT-test-match state for reserved
  }
,
{ // state 578
2,668, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 579
0x80000000|646, // match move
0x80000000|52, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 580
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 581
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+165, // $NT
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 582
2,430, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+247, // $NT
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 583
164,MIN_REDUCTION+221, // $NT
  }
,
{ // state 584
164,MIN_REDUCTION+134, // $NT
  }
,
{ // state 585
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 586
164,MIN_REDUCTION+239, // $NT
  }
,
{ // state 587
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 588
98,101, // "r"
110,453, // "h"
  }
,
{ // state 589
0x80000000|1, // match move
0x80000000|150, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 590
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 591
2,491, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 592
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 593
2,694, // ws*
151,525, // ws
153,415, // eol
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 594
164,MIN_REDUCTION+155, // $NT
  }
,
{ // state 595
101,370, // "s"
  }
,
{ // state 596
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 599
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 600
117,134, // "="
  }
,
{ // state 601
94,444, // "a"
  }
,
{ // state 602
1,100, // start
2,36, // ws*
3,474, // $$0
4,114, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
83,224, // `/
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
146,111, // letter
151,525, // ws
153,415, // eol
157,423, // token*
  }
,
{ // state 603
90,251, // "b"
91,251, // "o"
92,251, // "l"
93,251, // "e"
94,251, // "a"
95,251, // "n"
98,251, // "r"
99,251, // "k"
100,251, // "c"
101,251, // "s"
102,251, // "x"
103,251, // "t"
104,251, // "d"
105,251, // "f"
106,251, // "i"
107,251, // "w"
108,251, // "u"
109,251, // "p"
110,251, // "h"
111,251, // "v"
112,251, // "y"
113,251, // "m"
114,251, // "g"
115,251, // "z"
116,251, // "!"
117,251, // "="
118,251, // "%"
119,251, // "&"
120,251, // "("
121,251, // ")"
122,251, // "*"
123,251, // "/"
124,251, // "+"
125,251, // ","
126,251, // "-"
127,251, // "."
128,251, // ":"
129,251, // ";"
130,251, // "<"
131,251, // ">"
132,251, // "["
133,251, // "]"
134,251, // "{"
135,251, // "}"
136,251, // "|"
138,251, // "0"
141,251, // {"1".."9"}
142,251, // "'"
143,188, // printable
144,251, // '"'
147,251, // "_"
148,251, // {"A".."Z" "j" "q"}
149,251, // " "
150,251, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 604
93,317, // "e"
  }
,
{ // state 605
0x80000000|1, // match move
0x80000000|679, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 606
113,301, // "m"
  }
,
{ // state 607
0x80000000|1, // match move
0x80000000|147, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 608
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 609
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 611
2,27, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 612
164,MIN_REDUCTION+152, // $NT
  }
,
{ // state 613
93,166, // "e"
94,256, // "a"
108,222, // "u"
  }
,
{ // state 614
0x80000000|475, // match move
0x80000000|96, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 615
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+240, // $NT
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 616
92,290, // "l"
  }
,
{ // state 617
2,694, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 618
103,21, // "t"
  }
,
{ // state 619
93,274, // "e"
  }
,
{ // state 620
94,416, // "a"
  }
,
{ // state 621
0x80000000|1, // match move
0x80000000|543, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 622
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 623
101,276, // "s"
  }
,
{ // state 624
91,160, // "o"
92,215, // "l"
  }
,
{ // state 625
164,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 626
0x80000000|1, // match move
0x80000000|515, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 627
90,149, // "b"
91,149, // "o"
92,149, // "l"
93,149, // "e"
94,149, // "a"
95,149, // "n"
96,227, // idChar
98,149, // "r"
99,149, // "k"
100,149, // "c"
101,149, // "s"
102,149, // "x"
103,149, // "t"
104,149, // "d"
105,149, // "f"
106,149, // "i"
107,149, // "w"
108,149, // "u"
109,149, // "p"
110,149, // "h"
111,149, // "v"
112,149, // "y"
113,149, // "m"
114,149, // "g"
115,149, // "z"
138,579, // "0"
140,310, // digit
141,579, // {"1".."9"}
145,238, // idChar++
146,483, // letter
147,5, // "_"
148,149, // {"A".."Z" "j" "q"}
159,428, // idChar+
  }
,
{ // state 628
94,489, // "a"
98,138, // "r"
  }
,
{ // state 629
164,MIN_REDUCTION+312, // $NT
  }
,
{ // state 630
100,235, // "c"
  }
,
{ // state 631
0x80000000|1, // match move
0x80000000|359, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 632
94,148, // "a"
106,449, // "i"
108,118, // "u"
112,369, // "y"
  }
,
{ // state 633
164,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 634
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 635
164,MIN_REDUCTION+167, // $NT
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 637
92,207, // "l"
  }
,
{ // state 638
0x80000000|177, // match move
0x80000000|513, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 639
93,190, // "e"
  }
,
{ // state 640
106,307, // "i"
  }
,
{ // state 641
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 642
2,615, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 643
95,396, // "n"
  }
,
{ // state 644
92,254, // "l"
  }
,
{ // state 645
2,135, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 647
98,242, // "r"
  }
,
{ // state 648
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 649
103,628, // "t"
107,640, // "w"
108,175, // "u"
110,174, // "h"
112,473, // "y"
  }
,
{ // state 650
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
318, // token
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
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
664, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
486, // "b"
486, // "o"
486, // "l"
486, // "e"
486, // "a"
486, // "n"
-1, // idChar
-1, // reserved
486, // "r"
486, // "k"
486, // "c"
486, // "s"
486, // "x"
486, // "t"
486, // "d"
486, // "f"
486, // "i"
486, // "w"
486, // "u"
486, // "p"
486, // "h"
486, // "v"
486, // "y"
486, // "m"
486, // "g"
486, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
-1, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
408, // intLit2
549, // "0"
247, // digit++
38, // digit
549, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
111, // letter
-1, // "_"
486, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // $$1
-1, // token*
10, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+335, // $
-1, // $NT
  }
,
{ // state 651
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 652
94,312, // "a"
  }
,
{ // state 653
106,323, // "i"
  }
,
{ // state 654
104,501, // "d"
  }
,
{ // state 655
164,MIN_REDUCTION+161, // $NT
  }
,
{ // state 656
0x80000000|1, // match move
0x80000000|578, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 657
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 658
2,48, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 659
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 660
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 661
3,553, // $$0
4,114, // token
58,400, // `!
59,457, // `!=
60,72, // `%
61,545, // `&&
63,596, // `(
64,304, // `)
65,393, // `{
66,532, // `}
67,434, // `-
68,15, // `+
69,217, // `=
70,228, // `==
71,183, // `[
72,392, // `]
73,407, // `||
74,155, // `<
75,139, // `<=
76,660, // `,
77,125, // `>
78,117, // `>=
79,157, // `.
80,196, // `;
81,520, // `++
82,261, // `--
83,224, // `/
84,328, // `:
85,664, // ID
86,455, // INTLIT
87,189, // STRINGLIT
88,507, // CHARLIT
89,551, // NESTEDCOMMENT
146,111, // letter
151,49, // ws
153,415, // eol
157,423, // token*
  }
,
{ // state 662
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 663
2,277, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 664
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 665
2,244, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 666
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 667
0x80000000|577, // match move
0x80000000|283, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 668
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 669
164,MIN_REDUCTION+104, // $NT
  }
,
{ // state 670
-1, // $$start
-1, // start
694, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
200, // `boolean
676, // `class
202, // `extends
6, // `void
275, // `int
347, // `while
502, // `if
143, // `else
509, // `for
598, // `break
223, // `this
185, // `false
300, // `true
258, // `super
45, // `null
109, // `return
405, // `instanceof
599, // `new
375, // `abstract
471, // `assert
688, // `byte
519, // `case
691, // `catch
427, // `char
499, // `const
590, // `continue
565, // `default
440, // `do
176, // `double
67, // `enum
137, // `final
329, // `finally
116, // `float
192, // `goto
597, // `implements
61, // `import
313, // `interface
481, // `long
380, // `native
478, // `package
338, // `private
42, // `protected
352, // `public
657, // `short
198, // `static
422, // `strictfp
107, // `switch
431, // `synchronized
536, // `throw
63, // `throws
315, // `transient
20, // `try
269, // `volatile
400, // `!
457, // `!=
72, // `%
545, // `&&
-1, // `*
596, // `(
304, // `)
393, // `{
532, // `}
434, // `-
15, // `+
217, // `=
228, // `==
183, // `[
392, // `]
407, // `||
155, // `<
139, // `<=
660, // `,
125, // `>
117, // `>=
157, // `.
196, // `;
520, // `++
261, // `--
224, // `/
328, // `:
-1, // ID
455, // INTLIT
189, // STRINGLIT
507, // CHARLIT
551, // NESTEDCOMMENT
432, // "b"
MIN_REDUCTION+238, // "o"
574, // "l"
433, // "e"
695, // "a"
613, // "n"
-1, // idChar
-1, // reserved
360, // "r"
MIN_REDUCTION+238, // "k"
218, // "c"
552, // "s"
MIN_REDUCTION+238, // "x"
448, // "t"
682, // "d"
332, // "f"
446, // "i"
288, // "w"
175, // "u"
399, // "p"
174, // "h"
131, // "v"
473, // "y"
MIN_REDUCTION+238, // "m"
9, // "g"
MIN_REDUCTION+238, // "z"
361, // "!"
34, // "="
87, // "%"
425, // "&"
145, // "("
573, // ")"
MIN_REDUCTION+238, // "*"
677, // "/"
504, // "+"
456, // ","
461, // "-"
264, // "."
60, // ":"
7, // ";"
441, // "<"
394, // ">"
494, // "["
692, // "]"
285, // "{"
108, // "}"
516, // "|"
-1, // intLit2
MIN_REDUCTION+238, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+238, // {"1".."9"}
603, // "'"
-1, // printable
627, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+238, // {"A".."Z" "j" "q"}
178, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
525, // ws
178, // {9}
415, // eol
625, // {10}
265, // {13}
-1, // $$1
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$2
-1, // $$3
-1, // $$4
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 671
93,327, // "e"
  }
,
{ // state 672
109,624, // "p"
  }
,
{ // state 673
98,297, // "r"
  }
,
{ // state 674
3,553, // $$0
4,114, // token
5,200, // `boolean
6,676, // `class
7,202, // `extends
8,6, // `void
9,275, // `int
10,347, // `while
11,502, // `if
12,143, // `else
13,509, // `for
14,598, // `break
15,223, // `this
16,185, // `false
17,300, // `true
18,258, // `super
19,45, // `null
20,109, // `return
21,405, // `instanceof
22,599, // `new
23,375, // `abstract
24,471, // `assert
25,688, // `byte
26,519, // `case
27,691, // `catch
28,427, // `char
29,499, // `const
30,590, // `continue
31,565, // `default
32,440, // `do
33,176, // `double
34,67, // `enum
35,137, // `final
36,329, // `finally
37,116, // `float
38,192, // `goto
39,597, // `implements
40,61, // `import
41,313, // `interface
42,481, // `long
43,380, // `native
44,478, // `package
45,338, // `private
46,42, // `protected
47,352, // `public
48,657, // `short
49,198, // `static
50,422, // `strictfp
51,107, // `switch
52,431, // `synchronized
53,536, // `throw
54,63, // `throws
55,315, // `transient
56,20, // `try
57,269, // `volatile
157,423, // token*
  }
,
{ // state 675
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 676
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 677
0x80000000|287, // match move
0x80000000|487, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 678
93,426, // "e"
  }
,
{ // state 679
2,503, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 680
103,243, // "t"
  }
,
{ // state 681
2,19, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 682
91,46, // "o"
93,209, // "e"
  }
,
{ // state 683
2,378, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 684
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 685
164,MIN_REDUCTION+122, // $NT
  }
,
{ // state 686
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 687
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|534, // NT-test-match state for idChar
  }
,
{ // state 688
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 689
95,339, // "n"
  }
,
{ // state 690
164,MIN_REDUCTION+101, // $NT
  }
,
{ // state 691
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 692
2,3, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 693
100,17, // "c"
  }
,
{ // state 694
149,178, // " "
151,49, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+237, // $NT
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 695
90,437, // "b"
101,623, // "s"
  }
,
{ // state 696
2,659, // ws*
149,178, // " "
151,525, // ws
152,178, // {9}
153,415, // eol
154,625, // {10}
155,265, // {13}
164,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[697][];
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
// ID ::= !reserved letter idChar++ ws*
(85<<16)+3,
// ID ::= !reserved letter idChar++
(85<<16)+2,
// token* ::= token* token
(157<<16)+2,
// token* ::= token
(157<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// idChar++ ::= idChar+ !idChar
(145<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(158<<16)+1,
// digit+ ::= digit+ digit
(158<<16)+2,
// idChar+ ::= idChar
(159<<16)+1,
// idChar+ ::= idChar+ idChar
(159<<16)+2,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= idChar++ ws* $$2
(156<<16)+3,
// $$1 ::= idChar++ $$2
(156<<16)+2,
// $$2 ::= !{"*" "/"} !!{"*" "/"} ws* $$3
(160<<16)+2,
// $$2 ::= !{"*" "/"} !!{"*" "/"} $$3
(160<<16)+1,
// $$3 ::= idChar++ !!{"*" "/"} ws* $$4
(161<<16)+3,
// $$3 ::= idChar++ !!{"*" "/"} $$4
(161<<16)+2,
// $$4 ::= idChar++ ws* !!{"*" "/"}
(162<<16)+2,
// $$4 ::= idChar++ !!{"*" "/"}
(162<<16)+1,
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
"ID ::= !reserved letter idChar++ ws*", // 323
"ID ::= !reserved letter idChar++ ws*", // 324
"token* ::= token* token", // 325
"token* ::= token* token", // 326
"digit++ ::= digit+ !digit", // 327
"idChar++ ::= idChar+ !idChar", // 328
"ws* ::= ws* ws", // 329
"ws* ::= ws* ws", // 330
"digit+ ::= digit", // 331
"digit+ ::= digit+ digit", // 332
"idChar+ ::= idChar", // 333
"idChar+ ::= idChar+ idChar", // 334
"", // 335
"", // 336
"", // 337
"", // 338
"", // 339
"", // 340
"", // 341
"", // 342
"", // 343
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
    { // 89: token ::= [#] NESTEDCOMMENT @sawNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 304: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 319: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 320: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 323: ID ::= !reserved letter idChar++ ws* @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 324: ID ::= !reserved letter idChar++ [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 325: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 326: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 327: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 328: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 329: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 330: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 331: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 332: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 333: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 334: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 335: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 336: $$1 ::= idChar++ ws* $$2 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 337: $$1 ::= idChar++ [ws*] $$2 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 338: $$2 ::= !{"*" "/"} !!{"*" "/"} ws* $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: $$2 ::= !{"*" "/"} !!{"*" "/"} [ws*] $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 340: $$3 ::= idChar++ !!{"*" "/"} ws* $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: $$3 ::= idChar++ !!{"*" "/"} [ws*] $$4 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: $$4 ::= idChar++ ws* !!{"*" "/"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: $$4 ::= idChar++ !!{"*" "/"} [ws*] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
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
    0,
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
