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
public int getEofSym() { return 154; }
public int getNttSym() { return 155; }
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
"\"(\"",
"\")\"",
"\"*\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\"/\"",
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
"144",
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
public int numSymbols() { return 156;}
private static final int MIN_REDUCTION = 582;
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
0x80000000|207, // match move
0x80000000|367, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 1
  }
,
{ // state 2
2,451, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 3
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 4
101,255, // "t"
  }
,
{ // state 5
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 6
2,155, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|93, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 8
93,305, // "a"
  }
,
{ // state 9
90,344, // "o"
  }
,
{ // state 10
0x80000000|214, // match move
0x80000000|283, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 11
155,MIN_REDUCTION+254, // $NT
  }
,
{ // state 12
108,475, // "h"
  }
,
{ // state 13
92,545, // "e"
  }
,
{ // state 14
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 15
103,239, // "f"
  }
,
{ // state 16
108,118, // "h"
  }
,
{ // state 17
104,302, // "i"
  }
,
{ // state 18
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 20
0x80000000|1, // match move
0x80000000|535, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 21
99,318, // "s"
  }
,
{ // state 22
121,388, // "+"
  }
,
{ // state 23
104,537, // "i"
  }
,
{ // state 24
90,237, // "o"
  }
,
{ // state 25
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 26
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 27
2,94, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 28
107,525, // "p"
  }
,
{ // state 29
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 30
99,211, // "s"
  }
,
{ // state 31
0x80000000|147, // match move
0x80000000|329, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 32
92,320, // "e"
  }
,
{ // state 33
0x80000000|172, // match move
0x80000000|556, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 34
136,257, // "0"
142,257, // {"1".."9"}
  }
,
{ // state 35
0x80000000|37, // match move
0x80000000|151, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 36
91,286, // "l"
  }
,
{ // state 37
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 38
94,407, // "n"
  }
,
{ // state 39
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 40
99,417, // "s"
101,411, // "t"
  }
,
{ // state 41
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 42
0x80000000|291, // match move
0x80000000|459, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 43
99,546, // "s"
  }
,
{ // state 44
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 45
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 46
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 47
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 48
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 49
108,337, // "h"
  }
,
{ // state 50
101,82, // "t"
  }
,
{ // state 51
104,300, // "i"
  }
,
{ // state 52
2,540, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 53
92,119, // "e"
  }
,
{ // state 54
2,202, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 56
94,513, // "n"
  }
,
{ // state 57
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 58
2,150, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 59
93,349, // "a"
  }
,
{ // state 60
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 61
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 62
112,441, // "g"
  }
,
{ // state 63
90,571, // "o"
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 65
109,278, // "v"
  }
,
{ // state 66
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 67
101,532, // "t"
  }
,
{ // state 68
0x80000000|1, // match move
0x80000000|223, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 69
2,551, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 70
101,288, // "t"
  }
,
{ // state 71
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 72
123,490, // "-"
  }
,
{ // state 73
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 74
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 75
2,290, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 76
94,40, // "n"
  }
,
{ // state 77
2,78, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 78
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 79
2,196, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 80
99,242, // "s"
  }
,
{ // state 81
0x80000000|1, // match move
0x80000000|464, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|163, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 83
101,343, // "t"
  }
,
{ // state 84
0x80000000|1, // match move
0x80000000|2, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 85
89,384, // "b"
  }
,
{ // state 86
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
265, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
-1, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
341, // intLit2
460, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
460, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
-1, // token*
10, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 87
99,559, // "s"
101,311, // "t"
  }
,
{ // state 88
91,59, // "l"
104,442, // "i"
  }
,
{ // state 89
2,26, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 90
154,MIN_REDUCTION+0, // $
  }
,
{ // state 91
93,133, // "a"
106,105, // "u"
110,307, // "y"
  }
,
{ // state 92
102,447, // "d"
  }
,
{ // state 93
2,574, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 94
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 95
90,350, // "o"
  }
,
{ // state 96
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 97
2,191, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|554, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 100
91,152, // "l"
94,375, // "n"
96,15, // "r"
100,566, // "x"
  }
,
{ // state 101
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 102
101,391, // "t"
  }
,
{ // state 103
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 105
92,429, // "e"
  }
,
{ // state 106
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 108
90,244, // "o"
104,65, // "i"
  }
,
{ // state 109
0x80000000|1, // match move
0x80000000|27, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 110
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 111
91,405, // "l"
  }
,
{ // state 112
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 113
91,362, // "l"
  }
,
{ // state 114
111,303, // "m"
  }
,
{ // state 115
94,166, // "n"
  }
,
{ // state 116
2,368, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 117
90,88, // "o"
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|77, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 119
0x80000000|1, // match move
0x80000000|238, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 120
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 121
2,450, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 123
104,374, // "i"
  }
,
{ // state 124
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 125
-1, // $$start
90, // start
33, // ws*
396, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
437, // ws
-1, // {9 " "}
346, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
352, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 126
104,456, // "i"
  }
,
{ // state 127
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 128
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 129
2,175, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 130
2,230, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 131
90,398, // "o"
  }
,
{ // state 132
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
265, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
409, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
444, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
341, // intLit2
-1, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
-1, // token*
10, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 133
94,422, // "n"
  }
,
{ // state 134
2,249, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 135
108,390, // "h"
  }
,
{ // state 136
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 138
93,306, // "a"
  }
,
{ // state 139
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 141
93,113, // "a"
  }
,
{ // state 142
96,372, // "r"
  }
,
{ // state 143
92,402, // "e"
  }
,
{ // state 144
98,135, // "c"
  }
,
{ // state 145
0x80000000|471, // match move
0x80000000|287, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 146
93,284, // "a"
  }
,
{ // state 147
115,401, // "="
  }
,
{ // state 148
105,467, // "w"
  }
,
{ // state 149
92,399, // "e"
  }
,
{ // state 150
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 151
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 152
99,449, // "s"
  }
,
{ // state 153
99,321, // "s"
  }
,
{ // state 154
2,71, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 155
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 156
90,561, // "o"
  }
,
{ // state 157
107,143, // "p"
  }
,
{ // state 158
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 159
2,480, // ws*
143,437, // ws
145,346, // eol
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 161
2,73, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 162
2,46, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 163
2,258, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 166
106,500, // "u"
  }
,
{ // state 167
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 168
0x80000000|1, // match move
0x80000000|370, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 169
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 170
2,219, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 171
0x80000000|310, // match move
0x80000000|215, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 172
0x80000000|1, // match move
0x80000000|285, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 173
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 175
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 177
97,515, // "k"
  }
,
{ // state 178
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 179
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 180
0x80000000|1, // match move
0x80000000|129, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 181
2,185, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 182
103,499, // "f"
  }
,
{ // state 183
155,MIN_REDUCTION+252, // $NT
  }
,
{ // state 184
0x80000000|492, // match move
0x80000000|558, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 185
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 186
2,48, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 187
92,502, // "e"
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|267, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 189
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 190
90,76, // "o"
91,146, // "l"
93,87, // "a"
108,435, // "h"
  }
,
{ // state 191
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 192
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 193
91,530, // "l"
  }
,
{ // state 194
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 196
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 198
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 199
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 200
2,483, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 201
98,466, // "c"
  }
,
{ // state 202
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 203
92,452, // "e"
  }
,
{ // state 204
0x80000000|1, // match move
0x80000000|413, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 205
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 206
94,62, // "n"
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|325, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 208
94,99, // "n"
  }
,
{ // state 209
92,536, // "e"
  }
,
{ // state 210
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 211
0x80000000|1, // match move
0x80000000|161, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 212
0x80000000|476, // match move
0x80000000|197, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 213
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 214
136,460, // "0"
139,212, // digit
142,460, // {"1".."9"}
  }
,
{ // state 215
-1, // $$start
-1, // start
339, // ws*
-1, // $$0
MIN_REDUCTION+186, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
426, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
MIN_REDUCTION+186, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
-1, // intLit2
MIN_REDUCTION+186, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+186, // {"1".."9"}
437, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
-1, // token*
-1, // digit+
MIN_REDUCTION+186, // $
-1, // $NT
  }
,
{ // state 216
92,562, // "e"
  }
,
{ // state 217
101,544, // "t"
  }
,
{ // state 218
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 219
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 220
89,511, // "b"
  }
,
{ // state 221
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 222
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 223
2,389, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 224
2,29, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 225
0x80000000|314, // match move
0x80000000|137, // no-match move
// T-test match for 10:
146,
  }
,
{ // state 226
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 227
2,250, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 228
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 229
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 230
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 231
2,301, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 232
-1, // $$start
90, // start
33, // ws*
396, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
-1, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
341, // intLit2
460, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
460, // {"1".."9"}
437, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
352, // token*
10, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 233
93,465, // "a"
  }
,
{ // state 234
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 235
92,440, // "e"
  }
,
{ // state 236
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 237
91,514, // "l"
  }
,
{ // state 238
2,296, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 239
93,524, // "a"
  }
,
{ // state 240
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // start
-1, // ws*
463, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
-1, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
341, // intLit2
460, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
460, // {"1".."9"}
44, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
352, // token*
10, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 242
0x80000000|1, // match move
0x80000000|186, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 243
2,263, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 244
101,439, // "t"
  }
,
{ // state 245
104,256, // "i"
108,337, // "h"
  }
,
{ // state 246
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 247
104,293, // "i"
  }
,
{ // state 248
2,427, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 249
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 250
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 251
101,504, // "t"
  }
,
{ // state 252
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 253
92,573, // "e"
  }
,
{ // state 254
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 255
106,539, // "u"
  }
,
{ // state 256
101,577, // "t"
  }
,
{ // state 257
155,MIN_REDUCTION+256, // $NT
  }
,
{ // state 258
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 259
97,109, // "k"
  }
,
{ // state 260
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 261
96,491, // "r"
  }
,
{ // state 262
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 263
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 264
0x80000000|1, // match move
0x80000000|69, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 265
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 266
0x80000000|1, // match move
0x80000000|348, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 267
2,179, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 268
96,15, // "r"
  }
,
{ // state 269
109,564, // "v"
  }
,
{ // state 270
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 271
2,205, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 272
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 273
0x80000000|1, // match move
0x80000000|200, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 274
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 276
101,404, // "t"
  }
,
{ // state 277
90,414, // "o"
91,334, // "l"
93,323, // "a"
104,454, // "i"
  }
,
{ // state 278
93,67, // "a"
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|356, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 280
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 282
101,30, // "t"
  }
,
{ // state 283
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 284
99,43, // "s"
  }
,
{ // state 285
-1, // $$start
-1, // start
-1, // ws*
463, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
409, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
444, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
341, // intLit2
-1, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
44, // ws
-1, // {9 " "}
346, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
352, // token*
10, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 286
101,376, // "t"
  }
,
{ // state 287
-1, // $$start
-1, // start
505, // ws*
-1, // $$0
MIN_REDUCTION+108, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
100, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
MIN_REDUCTION+108, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
-1, // intLit2
MIN_REDUCTION+108, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+108, // {"1".."9"}
437, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 288
93,38, // "a"
  }
,
{ // state 289
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 290
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 291
106,85, // "u"
  }
,
{ // state 292
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 293
98,345, // "c"
  }
,
{ // state 294
0x80000000|493, // match move
0x80000000|171, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 295
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 296
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 297
2,315, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 298
0x80000000|498, // match move
0x80000000|331, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 299
92,4, // "e"
  }
,
{ // state 300
113,13, // "z"
  }
,
{ // state 301
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 302
92,56, // "e"
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|231, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 304
92,543, // "e"
  }
,
{ // state 305
101,68, // "t"
  }
,
{ // state 306
98,50, // "c"
  }
,
{ // state 307
0x80000000|1, // match move
0x80000000|248, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 308
0x80000000|1, // match move
0x80000000|512, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 309
2,528, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 310
2,339, // ws*
143,437, // ws
145,346, // eol
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 311
98,12, // "c"
  }
,
{ // state 312
2,534, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 313
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 314
146,527, // {10}
  }
,
{ // state 315
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 317
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 318
92,379, // "e"
  }
,
{ // state 319
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 320
0x80000000|1, // match move
0x80000000|392, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 321
0x80000000|1, // match move
0x80000000|548, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 322
99,70, // "s"
101,377, // "t"
  }
,
{ // state 323
91,21, // "l"
  }
,
{ // state 324
101,32, // "t"
  }
,
{ // state 325
-1, // $$start
90, // start
33, // ws*
396, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
409, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
444, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
341, // intLit2
-1, // "0"
213, // digit++
-1, // letter
35, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
437, // ws
-1, // {9 " "}
346, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
352, // token*
10, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 326
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 328
0x80000000|469, // match move
0x80000000|569, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 329
2,468, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 330
102,80, // "d"
  }
,
{ // state 331
2,393, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 332
93,445, // "a"
96,108, // "r"
106,220, // "u"
  }
,
{ // state 333
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 334
90,8, // "o"
  }
,
{ // state 335
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 336
90,206, // "o"
110,204, // "y"
  }
,
{ // state 337
104,111, // "i"
  }
,
{ // state 338
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 339
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 340
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 341
2,280, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 342
115,58, // "="
  }
,
{ // state 343
103,28, // "f"
  }
,
{ // state 344
101,63, // "t"
  }
,
{ // state 345
0x80000000|1, // match move
0x80000000|271, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 346
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 347
112,53, // "g"
  }
,
{ // state 348
2,555, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 349
101,23, // "t"
  }
,
{ // state 350
94,51, // "n"
  }
,
{ // state 351
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 352
0x80000000|503, // match move
0x80000000|509, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 353
117,227, // "&"
  }
,
{ // state 354
0x80000000|1, // match move
0x80000000|436, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 355
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 356
2,570, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 357
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 359
91,152, // "l"
94,375, // "n"
100,566, // "x"
  }
,
{ // state 360
90,24, // "o"
96,304, // "r"
110,324, // "y"
  }
,
{ // state 361
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 362
0x80000000|461, // match move
0x80000000|531, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 363
99,102, // "s"
  }
,
{ // state 364
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 366
0x80000000|342, // match move
0x80000000|309, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 367
0x80000000|125, // match move
0x80000000|232, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 368
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 369
106,36, // "u"
  }
,
{ // state 370
2,229, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 371
94,322, // "n"
103,521, // "f"
111,560, // "m"
  }
,
{ // state 372
101,501, // "t"
  }
,
{ // state 373
93,408, // "a"
96,526, // "r"
108,378, // "h"
  }
,
{ // state 374
98,83, // "c"
  }
,
{ // state 375
106,114, // "u"
  }
,
{ // state 376
0x80000000|1, // match move
0x80000000|552, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 377
0x80000000|473, // match move
0x80000000|145, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 378
96,131, // "r"
104,153, // "i"
  }
,
{ // state 379
0x80000000|1, // match move
0x80000000|312, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 380
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 381
2,106, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 383
2,272, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 384
91,479, // "l"
  }
,
{ // state 385
0x80000000|72, // match move
0x80000000|162, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 386
92,92, // "e"
  }
,
{ // state 387
2,517, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 388
2,246, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 389
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 390
96,95, // "r"
  }
,
{ // state 391
96,138, // "r"
  }
,
{ // state 392
2,47, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 393
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 394
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 395
94,144, // "n"
  }
,
{ // state 396
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 397
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
265, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
-1, // ws
-1, // {9 " "}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
-1, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 398
105,294, // "w"
  }
,
{ // state 399
90,453, // "o"
  }
,
{ // state 400
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 401
2,295, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 402
96,438, // "r"
  }
,
{ // state 403
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 404
0x80000000|1, // match move
0x80000000|181, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 405
92,64, // "e"
  }
,
{ // state 406
155,MIN_REDUCTION+255, // $NT
  }
,
{ // state 407
98,149, // "c"
  }
,
{ // state 408
101,126, // "t"
  }
,
{ // state 409
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 410
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 411
104,115, // "i"
  }
,
{ // state 412
2,60, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 413
2,240, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 414
96,279, // "r"
  }
,
{ // state 415
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 417
101,266, // "t"
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|474, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 419
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 420
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 421
0x80000000|22, // match move
0x80000000|75, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 422
99,17, // "s"
  }
,
{ // state 423
2,484, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 426
0x80000000|541, // match move
0x80000000|184, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 427
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 428
-1, // $$start
-1, // start
480, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
336, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
487, // "t"
568, // "d"
277, // "f"
371, // "i"
49, // "w"
-1, // "u"
332, // "p"
-1, // "h"
117, // "v"
-1, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
MIN_REDUCTION+154, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
-1, // intLit2
MIN_REDUCTION+154, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+154, // {"1".."9"}
437, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
-1, // token*
-1, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 429
0x80000000|1, // match move
0x80000000|507, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 430
2,222, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 431
134,538, // "|"
  }
,
{ // state 432
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 433
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 434
110,204, // "y"
  }
,
{ // state 435
93,261, // "a"
  }
,
{ // state 436
2,74, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 438
0x80000000|1, // match move
0x80000000|383, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 439
92,201, // "e"
  }
,
{ // state 440
96,276, // "r"
  }
,
{ // state 441
0x80000000|1, // match move
0x80000000|89, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 442
102,188, // "d"
  }
,
{ // state 443
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 444
2,110, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 445
98,177, // "c"
  }
,
{ // state 446
89,406, // "b"
90,406, // "o"
91,406, // "l"
92,406, // "e"
93,406, // "a"
94,406, // "n"
96,406, // "r"
97,406, // "k"
98,406, // "c"
99,406, // "s"
100,406, // "x"
101,406, // "t"
102,406, // "d"
103,406, // "f"
104,406, // "i"
105,406, // "w"
106,406, // "u"
107,406, // "p"
108,406, // "h"
109,406, // "v"
110,406, // "y"
111,406, // "m"
112,406, // "g"
113,406, // "z"
136,257, // "0"
138,183, // letter
139,523, // digit
140,11, // "_"
141,406, // {"A".."Z" "j" "q"}
142,257, // {"1".."9"}
  }
,
{ // state 447
0x80000000|1, // match move
0x80000000|567, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 448
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 449
92,84, // "e"
  }
,
{ // state 450
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 451
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 452
0x80000000|1, // match move
0x80000000|387, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 453
103,81, // "f"
  }
,
{ // state 454
94,141, // "n"
  }
,
{ // state 455
2,192, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 456
98,529, // "c"
  }
,
{ // state 457
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 458
2,542, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 459
2,364, // ws*
106,85, // "u"
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 460
0x80000000|107, // match move
0x80000000|415, // no-match move
0x80000000|34, // NT-test-match state for digit
  }
,
{ // state 461
91,434, // "l"
  }
,
{ // state 462
101,522, // "t"
105,533, // "w"
106,157, // "u"
108,156, // "h"
110,395, // "y"
  }
,
{ // state 463
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 464
2,270, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 465
94,516, // "n"
  }
,
{ // state 466
101,386, // "t"
  }
,
{ // state 467
0x80000000|1, // match move
0x80000000|52, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 468
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 469
115,170, // "="
  }
,
{ // state 470
2,226, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 471
2,505, // ws*
143,437, // ws
145,346, // eol
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 473
92,268, // "e"
  }
,
{ // state 474
2,486, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|580, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 476
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 477
2,199, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 478
90,206, // "o"
  }
,
{ // state 479
92,488, // "e"
  }
,
{ // state 480
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 481
-1, // $$start
-1, // start
-1, // ws*
463, // $$0
101, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
-1, // "b"
-1, // "o"
-1, // "l"
-1, // "e"
-1, // "a"
-1, // "n"
-1, // idChar
-1, // "r"
-1, // "k"
-1, // "c"
-1, // "s"
-1, // "x"
-1, // "t"
-1, // "d"
-1, // "f"
-1, // "i"
-1, // "w"
-1, // "u"
-1, // "p"
-1, // "h"
-1, // "v"
-1, // "y"
-1, // "m"
-1, // "g"
-1, // "z"
-1, // "!"
-1, // "="
-1, // "%"
-1, // "&"
-1, // "("
-1, // ")"
-1, // "*"
-1, // "+"
-1, // ","
-1, // "-"
-1, // "."
-1, // "/"
-1, // ":"
-1, // ";"
-1, // "<"
-1, // ">"
-1, // "["
-1, // "]"
-1, // "{"
-1, // "}"
-1, // "|"
-1, // intLit2
-1, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
-1, // {"1".."9"}
44, // ws
-1, // {9 " "}
346, // eol
-1, // {10}
-1, // {13}
-1, // {130}
-1, // {131}
-1, // {132}
-1, // {144}
352, // token*
-1, // digit+
-1, // $
-1, // $NT
  }
,
{ // state 482
2,557, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 483
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 484
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 485
2,357, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 486
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 487
96,91, // "r"
108,378, // "h"
  }
,
{ // state 488
0x80000000|1, // match move
0x80000000|134, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 489
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 490
2,410, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 491
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 492
2,578, // ws*
143,437, // ws
145,346, // eol
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 493
99,308, // "s"
  }
,
{ // state 494
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 495
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 496
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 498
115,121, // "="
  }
,
{ // state 499
93,369, // "a"
  }
,
{ // state 500
92,264, // "e"
  }
,
{ // state 501
0x80000000|1, // match move
0x80000000|565, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 502
111,253, // "m"
  }
,
{ // state 503
0x80000000|1, // match move
0x80000000|132, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 504
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 505
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|7, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 507
2,25, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 508
92,148, // "e"
93,217, // "a"
106,193, // "u"
  }
,
{ // state 509
0x80000000|397, // match move
0x80000000|86, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 510
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 511
91,247, // "l"
  }
,
{ // state 512
2,578, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 513
101,20, // "t"
  }
,
{ // state 514
92,233, // "e"
  }
,
{ // state 515
93,347, // "a"
  }
,
{ // state 516
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 517
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 518
99,235, // "s"
  }
,
{ // state 519
90,142, // "o"
91,187, // "l"
  }
,
{ // state 520
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 521
0x80000000|1, // match move
0x80000000|430, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 522
93,408, // "a"
96,123, // "r"
  }
,
{ // state 523
155,MIN_REDUCTION+253, // $NT
  }
,
{ // state 524
98,203, // "c"
  }
,
{ // state 525
0x80000000|1, // match move
0x80000000|297, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 526
93,133, // "a"
104,374, // "i"
106,105, // "u"
110,307, // "y"
  }
,
{ // state 527
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 528
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|458, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 530
91,180, // "l"
  }
,
{ // state 531
0x80000000|159, // match move
0x80000000|428, // no-match move
// T-test match for "*":
120,
  }
,
{ // state 532
92,168, // "e"
  }
,
{ // state 533
104,256, // "i"
  }
,
{ // state 534
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 535
2,510, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 536
94,330, // "n"
  }
,
{ // state 537
91,216, // "l"
  }
,
{ // state 538
2,120, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 539
96,208, // "r"
  }
,
{ // state 540
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 541
101,522, // "t"
105,533, // "w"
106,157, // "u"
108,156, // "h"
110,395, // "y"
  }
,
{ // state 542
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 543
93,259, // "a"
  }
,
{ // state 544
104,269, // "i"
  }
,
{ // state 545
102,418, // "d"
  }
,
{ // state 546
0x80000000|1, // match move
0x80000000|482, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 547
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 548
2,45, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 549
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 550
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 551
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 552
2,236, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 554
2,210, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 555
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 556
0x80000000|481, // match move
0x80000000|241, // no-match move
// T-test match for "0":
136,
  }
,
{ // state 557
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 558
-1, // $$start
-1, // start
578, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
176, // `boolean
563, // `class
178, // `extends
5, // `void
234, // `int
289, // `while
419, // `if
128, // `else
425, // `for
496, // `break
194, // `this
165, // `false
252, // `true
218, // `super
41, // `null
98, // `return
338, // `instanceof
497, // `new
313, // `abstract
394, // `assert
572, // `byte
432, // `case
575, // `catch
355, // `char
416, // `const
489, // `continue
472, // `default
365, // `do
158, // `double
61, // `enum
122, // `final
275, // `finally
103, // `float
169, // `goto
495, // `implements
55, // `import
260, // `interface
403, // `long
319, // `native
400, // `package
281, // `private
39, // `protected
292, // `public
547, // `short
174, // `static
351, // `strictfp
96, // `switch
358, // `synchronized
448, // `throw
57, // `throws
262, // `transient
19, // `try
228, // `volatile
333, // `!
382, // `!=
66, // `%
457, // `&&
-1, // `*
494, // `(
254, // `)
327, // `{
443, // `}
361, // `-
14, // `+
189, // `=
198, // `==
164, // `[
326, // `]
340, // `||
139, // `<
124, // `<=
550, // `,
112, // `>
104, // `>=
140, // `.
173, // `;
433, // `++
221, // `--
195, // `/
274, // `:
553, // ID
380, // INTLIT
167, // STRINGLIT
424, // CHARLIT
360, // "b"
-1, // "o"
478, // "l"
359, // "e"
579, // "a"
508, // "n"
-1, // idChar
299, // "r"
-1, // "k"
190, // "c"
462, // "s"
-1, // "x"
373, // "t"
568, // "d"
277, // "f"
371, // "i"
245, // "w"
157, // "u"
332, // "p"
156, // "h"
117, // "v"
395, // "y"
-1, // "m"
9, // "g"
-1, // "z"
298, // "!"
31, // "="
79, // "%"
353, // "&"
130, // "("
477, // ")"
MIN_REDUCTION+188, // "*"
421, // "+"
381, // ","
385, // "-"
224, // "."
506, // "/"
54, // ":"
6, // ";"
366, // "<"
328, // ">"
412, // "["
576, // "]"
243, // "{"
97, // "}"
431, // "|"
-1, // intLit2
MIN_REDUCTION+188, // "0"
-1, // digit++
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "j" "q"}
MIN_REDUCTION+188, // {"1".."9"}
437, // ws
160, // {9 " "}
346, // eol
520, // {10}
225, // {13}
136, // {130}
335, // {131}
316, // {132}
127, // {144}
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 559
92,273, // "e"
  }
,
{ // state 560
107,519, // "p"
  }
,
{ // state 561
96,251, // "r"
  }
,
{ // state 562
0x80000000|1, // match move
0x80000000|485, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 563
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 564
92,354, // "e"
  }
,
{ // state 565
2,420, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 566
101,209, // "t"
  }
,
{ // state 567
2,18, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 568
90,42, // "o"
92,182, // "e"
  }
,
{ // state 569
2,317, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 570
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 571
0x80000000|1, // match move
0x80000000|470, // no-match move
0x80000000|446, // NT-test-match state for idChar
  }
,
{ // state 572
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 573
94,282, // "n"
  }
,
{ // state 574
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 576
2,3, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 577
98,16, // "c"
  }
,
{ // state 578
143,44, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 579
89,363, // "b"
99,518, // "s"
  }
,
{ // state 580
2,549, // ws*
143,437, // ws
144,160, // {9 " "}
145,346, // eol
146,520, // {10}
147,225, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[581][];
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
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
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
// `/ ::= !"*" "/" !"*" !"/" ws*
(83<<16)+2,
// `/ ::= !"*" "/" !"*" !"/"
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
(135<<16)+1,
// idChar ::= letter
(95<<16)+1,
// idChar ::= digit
(95<<16)+1,
// idChar ::= "_"
(95<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(138<<16)+1,
// digit ::= {"0".."9"}
(139<<16)+1,
// ws ::= {9 " "}
(143<<16)+1,
// ws ::= eol
(143<<16)+1,
// eol ::= {10}
(145<<16)+1,
// eol ::= {13} {10}
(145<<16)+2,
// eol ::= {13} !10
(145<<16)+1,
// CHARLIT ::= {130}
(88<<16)+1,
// ID ::= {131}
(85<<16)+1,
// STRINGLIT ::= {132}
(87<<16)+1,
// `/ ::= {144}
(83<<16)+1,
// token* ::= token* token
(152<<16)+2,
// token* ::= token
(152<<16)+1,
// digit++ ::= digit+ !digit
(137<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(153<<16)+1,
// digit+ ::= digit+ digit
(153<<16)+2,
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
144, // 9
146, // 10
-1, // 11
-1, // 12
147, // 13
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
144, // " "
114, // "!"
-1, // '"'
-1, // "#"
-1, // "$"
116, // "%"
117, // "&"
-1, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
136, // "0"
142, // "1"
142, // "2"
142, // "3"
142, // "4"
142, // "5"
142, // "6"
142, // "7"
142, // "8"
142, // "9"
126, // ":"
127, // ";"
128, // "<"
115, // "="
129, // ">"
-1, // "?"
-1, // "@"
141, // "A"
141, // "B"
141, // "C"
141, // "D"
141, // "E"
141, // "F"
141, // "G"
141, // "H"
141, // "I"
141, // "J"
141, // "K"
141, // "L"
141, // "M"
141, // "N"
141, // "O"
141, // "P"
141, // "Q"
141, // "R"
141, // "S"
141, // "T"
141, // "U"
141, // "V"
141, // "W"
141, // "X"
141, // "Y"
141, // "Z"
130, // "["
-1, // "\"
131, // "]"
-1, // "^"
140, // "_"
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
141, // "j"
97, // "k"
91, // "l"
111, // "m"
94, // "n"
90, // "o"
107, // "p"
141, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
132, // "{"
134, // "|"
133, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
148, // 130
149, // 131
150, // 132
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
151, // 144
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
"`! ::= \"!\" !\"=\" ws*", // 195
"`! ::= \"!\" !\"=\" ws*", // 196
"`!= ::= \"!\" \"=\" ws*", // 197
"`!= ::= \"!\" \"=\" ws*", // 198
"`% ::= \"%\" ws*", // 199
"`% ::= \"%\" ws*", // 200
"`&& ::= \"&\" \"&\" ws*", // 201
"`&& ::= \"&\" \"&\" ws*", // 202
"`( ::= \"(\" ws*", // 203
"`( ::= \"(\" ws*", // 204
"`) ::= \")\" ws*", // 205
"`) ::= \")\" ws*", // 206
"`* ::= \"*\" ws*", // 207
"`* ::= \"*\" ws*", // 208
"`+ ::= \"+\" !\"+\" ws*", // 209
"`+ ::= \"+\" !\"+\" ws*", // 210
"`++ ::= \"+\" \"+\" ws*", // 211
"`++ ::= \"+\" \"+\" ws*", // 212
"`, ::= \",\" ws*", // 213
"`, ::= \",\" ws*", // 214
"`- ::= \"-\" !\"-\" ws*", // 215
"`- ::= \"-\" !\"-\" ws*", // 216
"`-- ::= \"-\" \"-\" ws*", // 217
"`-- ::= \"-\" \"-\" ws*", // 218
"`. ::= \".\" ws*", // 219
"`. ::= \".\" ws*", // 220
"`/ ::= !\"*\" \"/\" !\"*\" !\"/\" ws*", // 221
"`/ ::= !\"*\" \"/\" !\"*\" !\"/\" ws*", // 222
"`: ::= \":\" ws*", // 223
"`: ::= \":\" ws*", // 224
"`; ::= \";\" ws*", // 225
"`; ::= \";\" ws*", // 226
"`< ::= \"<\" !\"=\" ws*", // 227
"`< ::= \"<\" !\"=\" ws*", // 228
"`<= ::= \"<\" \"=\" ws*", // 229
"`<= ::= \"<\" \"=\" ws*", // 230
"`= ::= \"=\" !\"=\" ws*", // 231
"`= ::= \"=\" !\"=\" ws*", // 232
"`== ::= \"=\" \"=\" ws*", // 233
"`== ::= \"=\" \"=\" ws*", // 234
"`> ::= \">\" !\"=\" ws*", // 235
"`> ::= \">\" !\"=\" ws*", // 236
"`>= ::= \">\" \"=\" ws*", // 237
"`>= ::= \">\" \"=\" ws*", // 238
"`[ ::= \"[\" ws*", // 239
"`[ ::= \"[\" ws*", // 240
"`] ::= \"]\" ws*", // 241
"`] ::= \"]\" ws*", // 242
"`{ ::= \"{\" ws*", // 243
"`{ ::= \"{\" ws*", // 244
"`} ::= \"}\" ws*", // 245
"`} ::= \"}\" ws*", // 246
"`|| ::= \"|\" \"|\" ws*", // 247
"`|| ::= \"|\" \"|\" ws*", // 248
"INTLIT ::= # intLit2 ws*", // 249
"INTLIT ::= # intLit2 ws*", // 250
"intLit2 ::= !\"0\" digit++", // 251
"idChar ::= letter", // 252
"idChar ::= digit", // 253
"idChar ::= \"_\"", // 254
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 255
"digit ::= {\"0\"..\"9\"}", // 256
"ws ::= {9 \" \"}", // 257
"ws ::= eol", // 258
"eol ::= {10} registerNewline", // 259
"eol ::= {13} {10} registerNewline", // 260
"eol ::= {13} !10 registerNewline", // 261
"CHARLIT ::= {130}", // 262
"ID ::= {131}", // 263
"STRINGLIT ::= {132}", // 264
"`/ ::= {144}", // 265
"token* ::= token* token", // 266
"token* ::= token* token", // 267
"digit++ ::= digit+ !digit", // 268
"ws* ::= ws* ws", // 269
"ws* ::= ws* ws", // 270
"digit+ ::= digit", // 271
"digit+ ::= digit+ digit", // 272
"", // 273
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
    { // 195: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `! ::= "!" !"=" [ws*] @void
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
    { // 203: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `( ::= "(" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `) ::= ")" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `* ::= "*" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `+ ::= "+" !"+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 212: `++ ::= "+" "+" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 213: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `, ::= "," [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `- ::= "-" !"-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 218: `-- ::= "-" "-" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 219: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `. ::= "." [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `/ ::= !"*" "/" !"*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `/ ::= !"*" "/" !"*" !"/" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `: ::= ":" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `: ::= ":" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `; ::= ";" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `< ::= "<" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 230: `<= ::= "<" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 231: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `= ::= "=" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 234: `== ::= "=" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 235: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `> ::= ">" !"=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 238: `>= ::= ">" "=" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 239: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: `[ ::= "[" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 241: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 242: `] ::= "]" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 243: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 244: `{ ::= "{" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 245: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 246: `} ::= "}" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 247: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 248: `|| ::= "|" "|" [ws*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 249: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 250: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 251: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 252: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 253: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 254: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 255: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 256: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 257: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 259: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 261: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: CHARLIT ::= {130} @zero(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 263: ID ::= {131} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 264: STRINGLIT ::= {132} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 265: `/ ::= {144} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 267: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 268: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 269: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 270: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 271: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 272: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 273: $$0 ::= token* @pass
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
    -1,
    -1,
    -1,
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
