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
public int getEofSym() { return 162; }
public int getNttSym() { return 163; }
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
"COMMENT",
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
"$$2",
"token*",
"digit+",
"idChar+",
"$$3",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 164;}
private static final int MIN_REDUCTION = 772;
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
0x80000000|149, // match move
0x80000000|247, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 1
  }
,
{ // state 2
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 4
91,612, // "o"
  }
,
{ // state 5
0x80000000|515, // match move
0x80000000|564, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 6
2,188, // ws*
149,65, // " "
151,725, // ws
152,65, // {9}
153,230, // eol
154,155, // {10}
155,596, // {13}
161,386, // $$3
  }
,
{ // state 7
110,704, // "h"
  }
,
{ // state 8
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 9
110,85, // "h"
  }
,
{ // state 10
2,MIN_REDUCTION+312, // ws*
149,MIN_REDUCTION+312, // " "
152,MIN_REDUCTION+312, // {9}
154,MIN_REDUCTION+312, // {10}
155,MIN_REDUCTION+312, // {13}
161,MIN_REDUCTION+312, // $$3
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 11
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+219, // $NT
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|749, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 14
101,222, // "s"
  }
,
{ // state 15
163,MIN_REDUCTION+146, // $NT
  }
,
{ // state 16
124,643, // "+"
  }
,
{ // state 17
106,751, // "i"
  }
,
{ // state 18
91,167, // "o"
  }
,
{ // state 19
163,MIN_REDUCTION+137, // $NT
  }
,
{ // state 20
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 21
2,438, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 22
101,152, // "s"
  }
,
{ // state 23
93,223, // "e"
  }
,
{ // state 24
0x80000000|481, // match move
0x80000000|366, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 25
138,185, // "0"
141,185, // {"1".."9"}
  }
,
{ // state 26
0x80000000|27, // match move
0x80000000|109, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 27
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 28
101,279, // "s"
103,660, // "t"
  }
,
{ // state 29
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 30
0x80000000|569, // match move
0x80000000|693, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 31
2,MIN_REDUCTION+335, // ws*
149,MIN_REDUCTION+335, // " "
152,MIN_REDUCTION+335, // {9}
154,MIN_REDUCTION+335, // {10}
155,MIN_REDUCTION+335, // {13}
161,MIN_REDUCTION+335, // $$3
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 32
162,MIN_REDUCTION+332, // $
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 33
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+156, // $NT
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 34
110,607, // "h"
  }
,
{ // state 35
106,575, // "i"
  }
,
{ // state 36
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 37
95,338, // "n"
  }
,
{ // state 38
2,108, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 39
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 41
114,293, // "g"
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|83, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 43
103,746, // "t"
  }
,
{ // state 44
0x80000000|1, // match move
0x80000000|160, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 45
2,362, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 46
103,568, // "t"
  }
,
{ // state 47
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 48
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 49
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 50
2,209, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 51
163,MIN_REDUCTION+230, // $NT
  }
,
{ // state 52
149,65, // " "
151,158, // ws
152,65, // {9}
153,230, // eol
154,155, // {10}
155,596, // {13}
161,624, // $$3
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 53
2,54, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 54
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+135, // $NT
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 55
2,497, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 56
101,171, // "s"
  }
,
{ // state 57
0x80000000|1, // match move
0x80000000|118, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 58
103,611, // "t"
  }
,
{ // state 59
163,MIN_REDUCTION+209, // $NT
  }
,
{ // state 60
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 61
90,638, // "b"
  }
,
{ // state 62
92,423, // "l"
106,684, // "i"
  }
,
{ // state 63
2,20, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 64
104,688, // "d"
  }
,
{ // state 65
0x80000000|95, // match move
0x80000000|714, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 66
4,193, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
  }
,
{ // state 67
2,260, // ws*
151,267, // ws
153,230, // eol
161,624, // $$3
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 69
2,495, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 72
92,110, // "l"
95,252, // "n"
98,398, // "r"
102,376, // "x"
  }
,
{ // state 73
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 75
93,285, // "e"
  }
,
{ // state 76
163,MIN_REDUCTION+206, // $NT
  }
,
{ // state 77
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 78
91,173, // "o"
106,426, // "i"
  }
,
{ // state 79
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 80
0x80000000|1, // match move
0x80000000|21, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 81
163,MIN_REDUCTION+224, // $NT
  }
,
{ // state 82
95,122, // "n"
  }
,
{ // state 83
2,248, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 84
2,MIN_REDUCTION+330, // ws*
149,MIN_REDUCTION+330, // " "
152,MIN_REDUCTION+330, // {9}
154,MIN_REDUCTION+330, // {10}
155,MIN_REDUCTION+330, // {13}
161,MIN_REDUCTION+330, // $$3
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 85
0x80000000|1, // match move
0x80000000|53, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 86
0x80000000|1, // match move
0x80000000|168, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 87
0x80000000|31, // match move
0x80000000|353, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 88
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 89
106,301, // "i"
  }
,
{ // state 90
149,MIN_REDUCTION+318, // " "
151,MIN_REDUCTION+318, // ws
152,MIN_REDUCTION+318, // {9}
154,MIN_REDUCTION+318, // {10}
155,MIN_REDUCTION+318, // {13}
161,MIN_REDUCTION+318, // $$3
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 91
2,532, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 92
91,265, // "o"
  }
,
{ // state 93
95,283, // "n"
  }
,
{ // state 94
0x80000000|99, // match move
0x80000000|502, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 95
149,MIN_REDUCTION+316, // " "
151,MIN_REDUCTION+316, // ws
152,MIN_REDUCTION+316, // {9}
154,MIN_REDUCTION+316, // {10}
155,MIN_REDUCTION+316, // {13}
161,MIN_REDUCTION+316, // $$3
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 96
110,646, // "h"
  }
,
{ // state 97
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 98
94,579, // "a"
  }
,
{ // state 99
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 100
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 101
94,450, // "a"
  }
,
{ // state 102
0x80000000|538, // match move
0x80000000|390, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 103
2,440, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 104
93,653, // "e"
  }
,
{ // state 105
100,96, // "c"
  }
,
{ // state 106
94,206, // "a"
  }
,
{ // state 107
93,650, // "e"
  }
,
{ // state 108
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 110
101,297, // "s"
  }
,
{ // state 111
101,589, // "s"
  }
,
{ // state 112
2,47, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 113
109,104, // "p"
  }
,
{ // state 114
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 115
163,MIN_REDUCTION+316, // $NT
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 116
2,48, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 117
-1, // $$start
435, // start
24, // ws*
264, // $$0
443, // token
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
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
364, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
271, // "b"
271, // "o"
271, // "l"
271, // "e"
271, // "a"
271, // "n"
-1, // idChar
-1, // reserved
271, // "r"
271, // "k"
271, // "c"
271, // "s"
271, // "x"
271, // "t"
271, // "d"
271, // "f"
271, // "i"
271, // "w"
271, // "u"
271, // "p"
271, // "h"
271, // "v"
271, // "y"
271, // "m"
271, // "g"
271, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
-1, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
232, // intLit2
305, // "0"
512, // digit++
26, // digit
305, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
441, // letter
-1, // "_"
271, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
618, // token*
5, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 118
2,552, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 121
90,94, // "b"
91,94, // "o"
92,94, // "l"
93,94, // "e"
94,94, // "a"
95,94, // "n"
96,289, // idChar
98,94, // "r"
99,94, // "k"
100,94, // "c"
101,94, // "s"
102,94, // "x"
103,94, // "t"
104,94, // "d"
105,94, // "f"
106,94, // "i"
107,94, // "w"
108,94, // "u"
109,94, // "p"
110,94, // "h"
111,94, // "v"
112,94, // "y"
113,94, // "m"
114,94, // "g"
115,94, // "z"
138,711, // "0"
140,186, // digit
141,711, // {"1".."9"}
146,656, // letter
147,392, // "_"
148,94, // {"A".."Z" "j" "q"}
  }
,
{ // state 122
108,329, // "u"
  }
,
{ // state 123
142,539, // "'"
  }
,
{ // state 124
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 125
2,60, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 127
0x80000000|583, // match move
0x80000000|517, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 128
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 130
99,735, // "k"
  }
,
{ // state 131
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 132
2,245, // ws*
151,679, // ws
153,234, // eol
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 133
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 134
1,435, // start
2,24, // ws*
3,264, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
90,623, // "b"
92,707, // "l"
93,242, // "e"
94,769, // "a"
95,732, // "n"
98,216, // "r"
100,494, // "c"
101,695, // "s"
103,716, // "t"
104,377, // "d"
105,200, // "f"
106,630, // "i"
107,34, // "w"
109,603, // "p"
111,452, // "v"
114,4, // "g"
158,618, // token*
162,MIN_REDUCTION+1, // $
  }
,
{ // state 135
2,492, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 136
105,327, // "f"
  }
,
{ // state 137
2,417, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 138
93,728, // "e"
  }
,
{ // state 139
0x80000000|1, // match move
0x80000000|194, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 140
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 143
0x80000000|266, // match move
0x80000000|151, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 144
2,318, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 145
93,690, // "e"
  }
,
{ // state 146
163,MIN_REDUCTION+236, // $NT
  }
,
{ // state 147
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+126, // $NT
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 148
95,41, // "n"
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|592, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 150
95,71, // "n"
  }
,
{ // state 151
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 152
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 153
3,696, // $$0
4,443, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
62,659, // `*
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
122,619, // "*"
137,232, // intLit2
139,512, // digit++
140,26, // digit
146,441, // letter
151,412, // ws
153,234, // eol
158,618, // token*
159,5, // digit+
  }
,
{ // state 154
0x80000000|97, // match move
0x80000000|680, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 155
0x80000000|90, // match move
0x80000000|77, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 156
163,MIN_REDUCTION+182, // $NT
  }
,
{ // state 157
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 158
0x80000000|332, // match move
0x80000000|508, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 159
90,337, // "b"
  }
,
{ // state 160
2,645, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 161
2,405, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 162
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+195, // $NT
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 163
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 164
0x80000000|731, // match move
0x80000000|359, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 165
0x80000000|134, // match move
0x80000000|117, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 166
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 167
92,339, // "l"
  }
,
{ // state 168
2,214, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 169
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 170
0x80000000|212, // match move
0x80000000|546, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|137, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 172
2,553, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 173
103,291, // "t"
  }
,
{ // state 174
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 175
2,670, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 176
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 178
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 179
103,331, // "t"
  }
,
{ // state 180
163,MIN_REDUCTION+188, // $NT
  }
,
{ // state 181
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 182
163,MIN_REDUCTION+164, // $NT
  }
,
{ // state 183
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 184
163,MIN_REDUCTION+116, // $NT
  }
,
{ // state 185
163,MIN_REDUCTION+306, // $NT
  }
,
{ // state 186
0x80000000|530, // match move
0x80000000|562, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 187
99,80, // "k"
  }
,
{ // state 188
0x80000000|571, // match move
0x80000000|557, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 189
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 190
98,720, // "r"
  }
,
{ // state 191
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 192
0x80000000|1, // match move
0x80000000|45, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 193
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 194
2,133, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 195
111,763, // "v"
  }
,
{ // state 196
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 197
2,147, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 198
0x80000000|1, // match move
0x80000000|144, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 199
103,655, // "t"
  }
,
{ // state 200
91,275, // "o"
92,229, // "l"
94,591, // "a"
106,299, // "i"
  }
,
{ // state 201
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 202
94,43, // "a"
  }
,
{ // state 203
0x80000000|1, // match move
0x80000000|240, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 204
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 205
103,22, // "t"
  }
,
{ // state 206
101,411, // "s"
  }
,
{ // state 207
0x80000000|762, // match move
0x80000000|153, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 208
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 209
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 210
3,696, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
158,618, // token*
  }
,
{ // state 211
-1, // $$start
-1, // start
245, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
129, // `boolean
374, // `class
131, // `extends
3, // `void
166, // `int
208, // `while
664, // `if
460, // `else
284, // `for
326, // `break
141, // `this
120, // `false
547, // `true
522, // `super
29, // `null
70, // `return
608, // `instanceof
724, // `new
585, // `abstract
648, // `assert
381, // `byte
286, // `case
384, // `catch
239, // `char
278, // `const
323, // `continue
312, // `default
627, // `do
114, // `double
40, // `enum
456, // `final
560, // `finally
445, // `float
126, // `goto
723, // `implements
36, // `import
189, // `interface
268, // `long
588, // `native
651, // `package
563, // `private
409, // `protected
570, // `public
756, // `short
484, // `static
617, // `strictfp
68, // `switch
241, // `synchronized
296, // `throw
422, // `throws
191, // `transient
401, // `try
531, // `volatile
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
-1, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
623, // "b"
MIN_REDUCTION+178, // "o"
707, // "l"
242, // "e"
769, // "a"
732, // "n"
-1, // idChar
-1, // reserved
216, // "r"
MIN_REDUCTION+178, // "k"
494, // "c"
695, // "s"
MIN_REDUCTION+178, // "x"
716, // "t"
377, // "d"
200, // "f"
630, // "i"
34, // "w"
61, // "u"
603, // "p"
MIN_REDUCTION+178, // "h"
452, // "v"
MIN_REDUCTION+178, // "y"
MIN_REDUCTION+178, // "m"
4, // "g"
MIN_REDUCTION+178, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
MIN_REDUCTION+178, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
-1, // intLit2
MIN_REDUCTION+178, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+178, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+178, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 212
3,696, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
90,623, // "b"
92,707, // "l"
93,242, // "e"
94,769, // "a"
95,732, // "n"
98,216, // "r"
100,494, // "c"
101,695, // "s"
103,716, // "t"
104,377, // "d"
105,200, // "f"
106,630, // "i"
107,34, // "w"
109,603, // "p"
111,452, // "v"
114,4, // "g"
158,618, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 213
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 214
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 215
2,586, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 216
93,391, // "e"
  }
,
{ // state 217
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 218
93,357, // "e"
  }
,
{ // state 219
2,743, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 220
100,7, // "c"
  }
,
{ // state 221
154,347, // {10}
  }
,
{ // state 222
93,635, // "e"
  }
,
{ // state 223
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 224
101,46, // "s"
103,633, // "t"
  }
,
{ // state 225
163,MIN_REDUCTION+176, // $NT
  }
,
{ // state 226
103,23, // "t"
  }
,
{ // state 227
163,MIN_REDUCTION+200, // $NT
  }
,
{ // state 228
0x80000000|255, // match move
0x80000000|259, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 229
91,394, // "o"
  }
,
{ // state 230
0x80000000|388, // match move
0x80000000|343, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 231
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 232
2,204, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 233
163,MIN_REDUCTION+233, // $NT
  }
,
{ // state 234
163,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 235
2,365, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 236
103,17, // "t"
  }
,
{ // state 237
95,35, // "n"
  }
,
{ // state 238
119,528, // "&"
  }
,
{ // state 239
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 240
2,378, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 242
92,110, // "l"
95,252, // "n"
102,376, // "x"
  }
,
{ // state 243
4,193, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
90,623, // "b"
92,707, // "l"
93,242, // "e"
94,769, // "a"
95,732, // "n"
98,216, // "r"
100,494, // "c"
101,695, // "s"
103,716, // "t"
104,377, // "d"
105,200, // "f"
106,630, // "i"
107,34, // "w"
109,603, // "p"
111,452, // "v"
114,4, // "g"
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 244
0x80000000|694, // match move
0x80000000|350, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 245
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 246
163,MIN_REDUCTION+119, // $NT
  }
,
{ // state 247
0x80000000|458, // match move
0x80000000|165, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 248
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+147, // $NT
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 249
2,529, // ws*
90,94, // "b"
91,94, // "o"
92,94, // "l"
93,94, // "e"
94,94, // "a"
95,94, // "n"
96,499, // idChar
98,94, // "r"
99,94, // "k"
100,94, // "c"
101,94, // "s"
102,94, // "x"
103,94, // "t"
104,94, // "d"
105,94, // "f"
106,94, // "i"
107,94, // "w"
108,94, // "u"
109,94, // "p"
110,94, // "h"
111,94, // "v"
112,94, // "y"
113,94, // "m"
114,94, // "g"
115,94, // "z"
138,711, // "0"
140,186, // digit
141,711, // {"1".."9"}
145,295, // idChar++
146,656, // letter
147,392, // "_"
148,94, // {"A".."Z" "j" "q"}
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
156,342, // $$1
160,621, // idChar+
  }
,
{ // state 250
108,407, // "u"
  }
,
{ // state 251
100,58, // "c"
  }
,
{ // state 252
108,451, // "u"
  }
,
{ // state 253
0x80000000|1, // match move
0x80000000|363, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 254
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 255
2,MIN_REDUCTION+336, // ws*
149,MIN_REDUCTION+336, // " "
152,MIN_REDUCTION+336, // {9}
154,MIN_REDUCTION+336, // {10}
155,MIN_REDUCTION+336, // {13}
161,MIN_REDUCTION+336, // $$3
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 256
2,558, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 257
98,98, // "r"
  }
,
{ // state 258
2,33, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 260
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 261
2,479, // ws*
90,402, // "b"
91,402, // "o"
92,402, // "l"
93,402, // "e"
94,402, // "a"
95,402, // "n"
96,594, // idChar
98,402, // "r"
99,402, // "k"
100,402, // "c"
101,402, // "s"
102,402, // "x"
103,402, // "t"
104,402, // "d"
105,402, // "f"
106,402, // "i"
107,402, // "w"
108,402, // "u"
109,402, // "p"
110,402, // "h"
111,402, // "v"
112,402, // "y"
113,402, // "m"
114,402, // "g"
115,402, // "z"
138,682, // "0"
140,461, // digit
141,682, // {"1".."9"}
145,491, // idChar++
146,164, // letter
147,154, // "_"
148,402, // {"A".."Z" "j" "q"}
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
157,424, // $$2
160,102, // idChar+
  }
,
{ // state 262
163,MIN_REDUCTION+149, // $NT
  }
,
{ // state 263
95,105, // "n"
  }
,
{ // state 264
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 265
107,573, // "w"
  }
,
{ // state 266
2,MIN_REDUCTION+314, // ws*
149,MIN_REDUCTION+314, // " "
152,MIN_REDUCTION+314, // {9}
154,MIN_REDUCTION+314, // {10}
155,MIN_REDUCTION+314, // {13}
161,MIN_REDUCTION+314, // $$3
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 267
0x80000000|287, // match move
0x80000000|32, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 268
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 269
93,42, // "e"
  }
,
{ // state 270
163,MIN_REDUCTION+131, // $NT
  }
,
{ // state 271
163,MIN_REDUCTION+314, // $NT
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 272
100,107, // "c"
  }
,
{ // state 273
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 274
2,169, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 275
98,203, // "r"
  }
,
{ // state 276
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 277
1,435, // start
2,24, // ws*
3,264, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
158,618, // token*
  }
,
{ // state 278
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 279
103,554, // "t"
  }
,
{ // state 280
0x80000000|1, // match move
0x80000000|315, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 281
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 282
0x80000000|16, // match move
0x80000000|50, // no-match move
// T-test match for "+":
124,
  }
,
{ // state 283
101,400, // "s"
  }
,
{ // state 284
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|334, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 286
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 287
149,MIN_REDUCTION+332, // " "
151,MIN_REDUCTION+332, // ws
152,MIN_REDUCTION+332, // {9}
154,MIN_REDUCTION+332, // {10}
155,MIN_REDUCTION+332, // {13}
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 288
94,190, // "a"
  }
,
{ // state 289
0x80000000|174, // match move
0x80000000|489, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|256, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 291
93,504, // "e"
  }
,
{ // state 292
163,MIN_REDUCTION+215, // $NT
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 294
100,130, // "c"
  }
,
{ // state 295
2,73, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 297
93,432, // "e"
  }
,
{ // state 298
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 299
95,101, // "n"
  }
,
{ // state 300
2,140, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 301
100,349, // "c"
  }
,
{ // state 302
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 303
163,MIN_REDUCTION+242, // $NT
  }
,
{ // state 304
2,356, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 305
0x80000000|79, // match move
0x80000000|276, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 306
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 307
163,MIN_REDUCTION+95, // $NT
  }
,
{ // state 308
0x80000000|1, // match move
0x80000000|419, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 309
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 310
2,162, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 311
163,MIN_REDUCTION+248, // $NT
  }
,
{ // state 312
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 313
163,MIN_REDUCTION+218, // $NT
  }
,
{ // state 314
4,193, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
62,659, // `*
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
122,619, // "*"
137,232, // intLit2
139,512, // digit++
140,26, // digit
146,441, // letter
159,5, // digit+
  }
,
{ // state 315
2,322, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 317
0x80000000|210, // match move
0x80000000|760, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 318
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 319
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+165, // $NT
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 320
2,622, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+247, // $NT
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 321
0x80000000|465, // match move
0x80000000|157, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 322
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 324
2,768, // ws*
151,679, // ws
153,234, // eol
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 326
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 327
94,250, // "a"
  }
,
{ // state 328
1,435, // start
2,24, // ws*
3,264, // $$0
4,443, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
83,142, // `/
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
146,441, // letter
151,679, // ws
153,234, // eol
158,618, // token*
  }
,
{ // state 329
93,192, // "e"
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|375, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 331
0x80000000|1, // match move
0x80000000|112, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 332
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 334
2,403, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 335
163,MIN_REDUCTION+152, // $NT
  }
,
{ // state 336
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+240, // $NT
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 337
92,543, // "l"
  }
,
{ // state 338
103,13, // "t"
  }
,
{ // state 339
93,535, // "e"
  }
,
{ // state 340
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 341
101,536, // "s"
  }
,
{ // state 342
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 343
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 344
163,MIN_REDUCTION+312, // $NT
  }
,
{ // state 345
100,145, // "c"
  }
,
{ // state 346
0x80000000|1, // match move
0x80000000|215, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 347
163,MIN_REDUCTION+319, // $NT
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 348
163,MIN_REDUCTION+167, // $NT
  }
,
{ // state 349
0x80000000|1, // match move
0x80000000|304, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 350
0x80000000|475, // match move
0x80000000|671, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 351
2,455, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 353
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 354
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 355
103,741, // "t"
107,747, // "w"
108,113, // "u"
110,474, // "h"
112,263, // "y"
  }
,
{ // state 356
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 357
94,187, // "a"
  }
,
{ // state 358
106,195, // "i"
  }
,
{ // state 359
0x80000000|686, // match move
0x80000000|306, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 360
104,280, // "d"
  }
,
{ // state 361
163,MIN_REDUCTION+161, // $NT
  }
,
{ // state 362
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 363
2,537, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 364
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 365
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+168, // $NT
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 366
0x80000000|317, // match move
0x80000000|170, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 367
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 368
163,MIN_REDUCTION+104, // $NT
  }
,
{ // state 369
-1, // $$start
-1, // start
768, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
129, // `boolean
374, // `class
131, // `extends
3, // `void
166, // `int
208, // `while
664, // `if
460, // `else
284, // `for
326, // `break
141, // `this
120, // `false
547, // `true
522, // `super
29, // `null
70, // `return
608, // `instanceof
724, // `new
585, // `abstract
648, // `assert
381, // `byte
286, // `case
384, // `catch
239, // `char
278, // `const
323, // `continue
312, // `default
627, // `do
114, // `double
40, // `enum
456, // `final
560, // `finally
445, // `float
126, // `goto
723, // `implements
36, // `import
189, // `interface
268, // `long
588, // `native
651, // `package
563, // `private
409, // `protected
570, // `public
756, // `short
484, // `static
617, // `strictfp
68, // `switch
241, // `synchronized
296, // `throw
422, // `throws
191, // `transient
401, // `try
531, // `volatile
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
-1, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
623, // "b"
MIN_REDUCTION+238, // "o"
707, // "l"
242, // "e"
769, // "a"
732, // "n"
-1, // idChar
-1, // reserved
216, // "r"
MIN_REDUCTION+238, // "k"
494, // "c"
695, // "s"
MIN_REDUCTION+238, // "x"
632, // "t"
377, // "d"
200, // "f"
630, // "i"
541, // "w"
113, // "u"
603, // "p"
474, // "h"
452, // "v"
263, // "y"
MIN_REDUCTION+238, // "m"
4, // "g"
MIN_REDUCTION+238, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
MIN_REDUCTION+238, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
-1, // intLit2
MIN_REDUCTION+238, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+238, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+238, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 370
93,198, // "e"
  }
,
{ // state 371
109,737, // "p"
  }
,
{ // state 372
98,179, // "r"
  }
,
{ // state 373
0x80000000|1, // match move
0x80000000|320, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 374
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 375
2,281, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 376
103,509, // "t"
  }
,
{ // state 377
91,30, // "o"
93,136, // "e"
  }
,
{ // state 378
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 379
163,MIN_REDUCTION+122, // $NT
  }
,
{ // state 380
0x80000000|1, // match move
0x80000000|310, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 381
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 382
95,205, // "n"
  }
,
{ // state 383
163,MIN_REDUCTION+101, // $NT
  }
,
{ // state 384
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 385
100,9, // "c"
  }
,
{ // state 386
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 387
0x80000000|10, // match move
0x80000000|683, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 388
149,MIN_REDUCTION+317, // " "
151,MIN_REDUCTION+317, // ws
152,MIN_REDUCTION+317, // {9}
154,MIN_REDUCTION+317, // {10}
155,MIN_REDUCTION+317, // {13}
161,MIN_REDUCTION+317, // $$3
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 389
2,689, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 390
0x80000000|84, // match move
0x80000000|12, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 391
103,550, // "t"
  }
,
{ // state 392
0x80000000|97, // match move
0x80000000|201, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 393
2,473, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 394
94,578, // "a"
  }
,
{ // state 395
163,MIN_REDUCTION+313, // $NT
  }
,
{ // state 396
163,MIN_REDUCTION+203, // $NT
  }
,
{ // state 397
93,360, // "e"
  }
,
{ // state 398
105,540, // "f"
  }
,
{ // state 399
0x80000000|483, // match move
0x80000000|464, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 400
106,576, // "i"
  }
,
{ // state 401
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 402
0x80000000|99, // match move
0x80000000|143, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 403
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 404
109,346, // "p"
  }
,
{ // state 405
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 406
0x80000000|471, // match move
0x80000000|600, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 407
92,565, // "l"
  }
,
{ // state 408
95,272, // "n"
  }
,
{ // state 409
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 410
163,MIN_REDUCTION+92, // $NT
  }
,
{ // state 411
101,755, // "s"
  }
,
{ // state 412
163,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 413
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 414
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 415
1,435, // start
2,24, // ws*
3,264, // $$0
4,443, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
62,659, // `*
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
122,619, // "*"
137,232, // intLit2
139,512, // digit++
140,26, // digit
146,441, // letter
151,679, // ws
153,234, // eol
158,618, // token*
159,5, // digit+
  }
,
{ // state 416
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 417
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 418
103,57, // "t"
  }
,
{ // state 419
2,354, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 420
93,86, // "e"
  }
,
{ // state 421
2,505, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 423
94,236, // "a"
  }
,
{ // state 424
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 425
91,380, // "o"
  }
,
{ // state 426
111,202, // "v"
  }
,
{ // state 427
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 428
163,MIN_REDUCTION+227, // $NT
  }
,
{ // state 429
126,719, // "-"
  }
,
{ // state 430
95,28, // "n"
  }
,
{ // state 431
0x80000000|1, // match move
0x80000000|697, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 432
0x80000000|1, // match move
0x80000000|389, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 433
0x80000000|243, // match move
0x80000000|753, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 434
101,370, // "s"
103,220, // "t"
  }
,
{ // state 435
162,MIN_REDUCTION+0, // $
  }
,
{ // state 436
94,93, // "a"
108,75, // "u"
112,580, // "y"
  }
,
{ // state 437
163,MIN_REDUCTION+107, // $NT
  }
,
{ // state 438
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 439
91,237, // "o"
  }
,
{ // state 440
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 441
90,94, // "b"
91,94, // "o"
92,94, // "l"
93,94, // "e"
94,94, // "a"
95,94, // "n"
96,499, // idChar
98,94, // "r"
99,94, // "k"
100,94, // "c"
101,94, // "s"
102,94, // "x"
103,94, // "t"
104,94, // "d"
105,94, // "f"
106,94, // "i"
107,94, // "w"
108,94, // "u"
109,94, // "p"
110,94, // "h"
111,94, // "v"
112,94, // "y"
113,94, // "m"
114,94, // "g"
115,94, // "z"
138,711, // "0"
140,186, // digit
141,711, // {"1".."9"}
145,103, // idChar++
146,656, // letter
147,392, // "_"
148,94, // {"A".."Z" "j" "q"}
160,621, // idChar+
  }
,
{ // state 442
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 444
103,257, // "t"
  }
,
{ // state 445
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 446
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 447
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 448
92,269, // "l"
  }
,
{ // state 449
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 450
92,244, // "l"
  }
,
{ // state 451
113,577, // "m"
  }
,
{ // state 452
91,62, // "o"
  }
,
{ // state 453
2,614, // ws*
151,725, // ws
153,230, // eol
161,386, // $$3
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 454
2,298, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 455
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 456
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 457
106,251, // "i"
  }
,
{ // state 458
0x80000000|277, // match move
0x80000000|328, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 459
5,410, // `boolean
6,590, // `class
7,368, // `extends
8,15, // `void
9,246, // `int
10,262, // `while
11,705, // `if
12,383, // `else
13,639, // `for
14,307, // `break
15,674, // `this
16,437, // `false
17,544, // `true
18,713, // `super
19,566, // `null
20,270, // `return
21,184, // `instanceof
22,379, // `new
23,335, // `abstract
24,721, // `assert
25,661, // `byte
26,361, // `case
27,182, // `catch
28,348, // `char
29,513, // `const
30,561, // `continue
31,225, // `default
32,668, // `do
33,156, // `double
34,593, // `enum
35,180, // `final
36,503, // `finally
37,486, // `float
38,667, // `goto
39,227, // `implements
40,396, // `import
41,76, // `interface
42,59, // `long
43,595, // `native
44,292, // `package
45,313, // `private
46,712, // `protected
47,555, // `public
48,81, // `short
49,428, // `static
50,51, // `strictfp
51,19, // `switch
52,233, // `synchronized
53,146, // `throw
54,715, // `throws
55,303, // `transient
56,700, // `try
57,311, // `volatile
90,623, // "b"
92,707, // "l"
93,242, // "e"
94,769, // "a"
95,732, // "n"
98,216, // "r"
100,494, // "c"
101,695, // "s"
103,716, // "t"
104,377, // "d"
105,200, // "f"
106,630, // "i"
107,34, // "w"
109,603, // "p"
111,452, // "v"
114,4, // "g"
  }
,
{ // state 460
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 461
0x80000000|530, // match move
0x80000000|387, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 462
2,485, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 463
0x80000000|521, // match move
0x80000000|314, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 464
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 465
154,663, // {10}
  }
,
{ // state 466
2,176, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 467
163,MIN_REDUCTION+320, // $NT
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 468
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 469
98,631, // "r"
  }
,
{ // state 470
0x80000000|702, // match move
0x80000000|567, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 471
117,652, // "="
  }
,
{ // state 472
107,308, // "w"
  }
,
{ // state 473
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 474
91,372, // "o"
  }
,
{ // state 475
2,709, // ws*
151,679, // ws
153,234, // eol
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 476
2,414, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 477
2,605, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 478
0x80000000|1, // match move
0x80000000|629, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 479
90,402, // "b"
91,402, // "o"
92,402, // "l"
93,402, // "e"
94,402, // "a"
95,402, // "n"
96,594, // idChar
98,402, // "r"
99,402, // "k"
100,402, // "c"
101,402, // "s"
102,402, // "x"
103,402, // "t"
104,402, // "d"
105,402, // "f"
106,402, // "i"
107,402, // "w"
108,402, // "u"
109,402, // "p"
110,402, // "h"
111,402, // "v"
112,402, // "y"
113,402, // "m"
114,402, // "g"
115,402, // "z"
138,682, // "0"
140,461, // digit
141,682, // {"1".."9"}
145,491, // idChar++
146,164, // letter
147,154, // "_"
148,402, // {"A".."Z" "j" "q"}
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
157,677, // $$2
160,102, // idChar+
  }
,
{ // state 480
2,523, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 481
0x80000000|1, // match move
0x80000000|207, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 482
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 483
2,MIN_REDUCTION+306, // ws*
149,MIN_REDUCTION+306, // " "
152,MIN_REDUCTION+306, // {9}
154,MIN_REDUCTION+306, // {10}
155,MIN_REDUCTION+306, // {13}
161,MIN_REDUCTION+306, // $$3
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 485
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 486
163,MIN_REDUCTION+194, // $NT
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|462, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 488
163,MIN_REDUCTION+311, // $NT
  }
,
{ // state 489
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 490
0x80000000|324, // match move
0x80000000|369, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 491
0x80000000|453, // match move
0x80000000|6, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 492
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+153, // $NT
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 493
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 494
91,430, // "o"
92,106, // "l"
94,434, // "a"
110,288, // "h"
  }
,
{ // state 495
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 496
92,745, // "l"
  }
,
{ // state 497
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 499
0x80000000|766, // match move
0x80000000|183, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 500
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 501
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 503
163,MIN_REDUCTION+191, // $NT
  }
,
{ // state 504
100,699, // "c"
  }
,
{ // state 505
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 506
0x80000000|1, // match move
0x80000000|274, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 507
144,125, // '"'
  }
,
{ // state 508
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 509
93,750, // "e"
  }
,
{ // state 510
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 511
0x80000000|316, // match move
0x80000000|498, // no-match move
0x80000000|25, // NT-test-match state for digit
  }
,
{ // state 512
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 513
163,MIN_REDUCTION+170, // $NT
  }
,
{ // state 514
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 515
138,305, // "0"
140,511, // digit
141,305, // {"1".."9"}
  }
,
{ // state 516
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 517
-1, // $$start
-1, // start
231, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
129, // `boolean
374, // `class
131, // `extends
3, // `void
166, // `int
208, // `while
664, // `if
460, // `else
284, // `for
326, // `break
141, // `this
120, // `false
547, // `true
522, // `super
29, // `null
70, // `return
608, // `instanceof
724, // `new
585, // `abstract
648, // `assert
381, // `byte
286, // `case
384, // `catch
239, // `char
278, // `const
323, // `continue
312, // `default
627, // `do
114, // `double
40, // `enum
456, // `final
560, // `finally
445, // `float
126, // `goto
723, // `implements
36, // `import
189, // `interface
268, // `long
588, // `native
651, // `package
563, // `private
409, // `protected
570, // `public
756, // `short
484, // `static
617, // `strictfp
68, // `switch
241, // `synchronized
296, // `throw
422, // `throws
191, // `transient
401, // `try
531, // `volatile
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
-1, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
623, // "b"
MIN_REDUCTION+235, // "o"
707, // "l"
242, // "e"
769, // "a"
732, // "n"
-1, // idChar
-1, // reserved
216, // "r"
MIN_REDUCTION+235, // "k"
494, // "c"
669, // "s"
MIN_REDUCTION+235, // "x"
716, // "t"
377, // "d"
200, // "f"
630, // "i"
34, // "w"
MIN_REDUCTION+235, // "u"
603, // "p"
MIN_REDUCTION+235, // "h"
452, // "v"
MIN_REDUCTION+235, // "y"
MIN_REDUCTION+235, // "m"
4, // "g"
MIN_REDUCTION+235, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
MIN_REDUCTION+235, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
-1, // intLit2
MIN_REDUCTION+235, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+235, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+235, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
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
{ // state 518
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 519
93,373, // "e"
  }
,
{ // state 520
103,358, // "t"
  }
,
{ // state 521
4,193, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
  }
,
{ // state 522
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 523
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 525
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+111, // $NT
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 526
122,261, // "*"
123,249, // "/"
  }
,
{ // state 527
0x80000000|221, // match move
0x80000000|467, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 528
2,178, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 529
90,94, // "b"
91,94, // "o"
92,94, // "l"
93,94, // "e"
94,94, // "a"
95,94, // "n"
96,499, // idChar
98,94, // "r"
99,94, // "k"
100,94, // "c"
101,94, // "s"
102,94, // "x"
103,94, // "t"
104,94, // "d"
105,94, // "f"
106,94, // "i"
107,94, // "w"
108,94, // "u"
109,94, // "p"
110,94, // "h"
111,94, // "v"
112,94, // "y"
113,94, // "m"
114,94, // "g"
115,94, // "z"
138,711, // "0"
140,186, // digit
141,711, // {"1".."9"}
145,295, // idChar++
146,656, // letter
147,392, // "_"
148,94, // {"A".."Z" "j" "q"}
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
156,446, // $$1
160,621, // idChar+
  }
,
{ // state 530
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 532
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 533
0x80000000|1, // match move
0x80000000|654, // no-match move
// T-test match for 10:
154,
  }
,
{ // state 534
2,217, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 535
94,698, // "a"
  }
,
{ // state 536
93,681, // "e"
  }
,
{ // state 537
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+174, // $NT
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 538
90,402, // "b"
91,402, // "o"
92,402, // "l"
93,402, // "e"
94,402, // "a"
95,402, // "n"
96,582, // idChar
98,402, // "r"
99,402, // "k"
100,402, // "c"
101,402, // "s"
102,402, // "x"
103,402, // "t"
104,402, // "d"
105,402, // "f"
106,402, // "i"
107,402, // "w"
108,402, // "u"
109,402, // "p"
110,402, // "h"
111,402, // "v"
112,402, // "y"
113,402, // "m"
114,402, // "g"
115,402, // "z"
138,682, // "0"
140,461, // digit
141,682, // {"1".."9"}
146,164, // letter
147,154, // "_"
148,402, // {"A".."Z" "j" "q"}
  }
,
{ // state 539
2,181, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 540
94,345, // "a"
  }
,
{ // state 541
106,551, // "i"
110,607, // "h"
  }
,
{ // state 542
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 543
106,572, // "i"
  }
,
{ // state 544
163,MIN_REDUCTION+143, // $NT
  }
,
{ // state 545
1,435, // start
2,24, // ws*
3,264, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
158,618, // token*
  }
,
{ // state 546
-1, // $$start
-1, // start
-1, // ws*
696, // $$0
443, // token
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
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
364, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
271, // "b"
271, // "o"
271, // "l"
271, // "e"
271, // "a"
271, // "n"
-1, // idChar
-1, // reserved
271, // "r"
271, // "k"
271, // "c"
271, // "s"
271, // "x"
271, // "t"
271, // "d"
271, // "f"
271, // "i"
271, // "w"
271, // "u"
271, // "p"
271, // "h"
271, // "v"
271, // "y"
271, // "m"
271, // "g"
271, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
-1, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
232, // intLit2
305, // "0"
512, // digit++
26, // digit
305, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
441, // letter
-1, // "_"
271, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
412, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
618, // token*
5, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 547
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 548
93,382, // "e"
  }
,
{ // state 549
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 550
108,752, // "u"
  }
,
{ // state 551
103,385, // "t"
  }
,
{ // state 552
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+150, // $NT
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 553
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 554
0x80000000|1, // match move
0x80000000|235, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 555
163,MIN_REDUCTION+128, // $NT
  }
,
{ // state 556
98,398, // "r"
  }
,
{ // state 557
149,65, // " "
151,158, // ws
152,65, // {9}
153,230, // eol
154,155, // {10}
155,596, // {13}
161,624, // $$3
  }
,
{ // state 558
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 560
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 561
163,MIN_REDUCTION+173, // $NT
  }
,
{ // state 562
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 563
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 564
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 565
103,253, // "t"
  }
,
{ // state 566
163,MIN_REDUCTION+125, // $NT
  }
,
{ // state 567
-1, // $$start
-1, // start
730, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
129, // `boolean
374, // `class
131, // `extends
3, // `void
166, // `int
208, // `while
664, // `if
460, // `else
284, // `for
326, // `break
141, // `this
120, // `false
547, // `true
522, // `super
29, // `null
70, // `return
608, // `instanceof
724, // `new
585, // `abstract
648, // `assert
381, // `byte
286, // `case
384, // `catch
239, // `char
278, // `const
323, // `continue
312, // `default
627, // `do
114, // `double
40, // `enum
456, // `final
560, // `finally
445, // `float
126, // `goto
723, // `implements
36, // `import
189, // `interface
268, // `long
588, // `native
651, // `package
563, // `private
409, // `protected
570, // `public
756, // `short
484, // `static
617, // `strictfp
68, // `switch
241, // `synchronized
296, // `throw
422, // `throws
191, // `transient
401, // `try
531, // `volatile
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
-1, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
623, // "b"
MIN_REDUCTION+118, // "o"
707, // "l"
72, // "e"
769, // "a"
732, // "n"
-1, // idChar
-1, // reserved
216, // "r"
MIN_REDUCTION+118, // "k"
494, // "c"
695, // "s"
MIN_REDUCTION+118, // "x"
716, // "t"
377, // "d"
200, // "f"
630, // "i"
34, // "w"
MIN_REDUCTION+118, // "u"
603, // "p"
MIN_REDUCTION+118, // "h"
452, // "v"
MIN_REDUCTION+118, // "y"
MIN_REDUCTION+118, // "m"
4, // "g"
MIN_REDUCTION+118, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
MIN_REDUCTION+118, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
-1, // intLit2
MIN_REDUCTION+118, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+118, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+118, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 568
94,408, // "a"
  }
,
{ // state 569
108,61, // "u"
  }
,
{ // state 570
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 571
2,260, // ws*
151,267, // ws
153,230, // eol
161,624, // $$3
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 572
100,613, // "c"
  }
,
{ // state 573
0x80000000|722, // match move
0x80000000|127, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 574
0x80000000|726, // match move
0x80000000|602, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 575
115,397, // "z"
  }
,
{ // state 576
93,37, // "e"
  }
,
{ // state 577
0x80000000|1, // match move
0x80000000|534, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 578
103,44, // "t"
  }
,
{ // state 579
100,418, // "c"
  }
,
{ // state 580
0x80000000|1, // match move
0x80000000|175, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 581
0x80000000|1, // match move
0x80000000|734, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 582
0x80000000|174, // match move
0x80000000|228, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 583
2,231, // ws*
151,679, // ws
153,234, // eol
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 584
2,748, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 585
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 586
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 587
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 588
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 589
0x80000000|1, // match move
0x80000000|757, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 590
163,MIN_REDUCTION+98, // $NT
  }
,
{ // state 591
92,14, // "l"
  }
,
{ // state 592
0x80000000|545, // match move
0x80000000|415, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 593
163,MIN_REDUCTION+185, // $NT
  }
,
{ // state 594
0x80000000|766, // match move
0x80000000|87, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 595
163,MIN_REDUCTION+212, // $NT
  }
,
{ // state 596
0x80000000|533, // match move
0x80000000|321, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 597
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 599
0x80000000|701, // match move
0x80000000|765, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 600
2,309, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 601
104,56, // "d"
  }
,
{ // state 602
2,647, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 603
94,294, // "a"
98,78, // "r"
108,159, // "u"
  }
,
{ // state 604
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 605
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 606
91,148, // "o"
112,506, // "y"
  }
,
{ // state 607
106,448, // "i"
  }
,
{ // state 608
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 610
117,38, // "="
  }
,
{ // state 611
105,404, // "f"
  }
,
{ // state 612
103,425, // "t"
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 614
0x80000000|67, // match move
0x80000000|52, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 615
114,420, // "g"
  }
,
{ // state 616
4,193, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
83,142, // `/
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
146,441, // letter
  }
,
{ // state 617
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 618
0x80000000|729, // match move
0x80000000|733, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 619
0x80000000|1, // match move
0x80000000|477, // no-match move
// T-test match for "/":
123,
  }
,
{ // state 620
0x80000000|1, // match move
0x80000000|678, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 621
0x80000000|121, // match move
0x80000000|482, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 622
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+246, // $NT
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 623
91,18, // "o"
98,218, // "r"
112,226, // "y"
  }
,
{ // state 624
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 626
101,444, // "s"
  }
,
{ // state 627
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 628
0x80000000|610, // match move
0x80000000|219, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 629
2,163, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 630
95,224, // "n"
105,739, // "f"
113,371, // "m"
  }
,
{ // state 631
103,330, // "t"
  }
,
{ // state 632
94,658, // "a"
98,742, // "r"
110,634, // "h"
  }
,
{ // state 633
0x80000000|703, // match move
0x80000000|470, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 634
98,92, // "r"
106,111, // "i"
  }
,
{ // state 635
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 636
2,447, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 638
92,708, // "l"
  }
,
{ // state 639
163,MIN_REDUCTION+110, // $NT
  }
,
{ // state 640
0x80000000|429, // match move
0x80000000|476, // no-match move
// T-test match for "-":
126,
  }
,
{ // state 641
93,64, // "e"
  }
,
{ // state 642
2,736, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 643
2,542, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 645
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 646
98,439, // "r"
  }
,
{ // state 647
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 648
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 649
0x80000000|66, // match move
0x80000000|616, // no-match move
0x80000000|459, // NT-test-match state for reserved
  }
,
{ // state 650
91,691, // "o"
  }
,
{ // state 651
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 652
2,213, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 653
98,290, // "r"
  }
,
{ // state 654
149,MIN_REDUCTION+320, // " "
151,MIN_REDUCTION+320, // ws
152,MIN_REDUCTION+320, // {9}
154,MIN_REDUCTION+320, // {10}
155,MIN_REDUCTION+320, // {13}
161,MIN_REDUCTION+320, // $$3
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 655
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 656
0x80000000|731, // match move
0x80000000|644, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 657
2,518, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 658
103,89, // "t"
  }
,
{ // state 659
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 660
106,82, // "i"
  }
,
{ // state 661
163,MIN_REDUCTION+158, // $NT
  }
,
{ // state 662
2,39, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 663
0x80000000|692, // match move
0x80000000|333, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 664
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 665
2,319, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 666
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 667
163,MIN_REDUCTION+197, // $NT
  }
,
{ // state 668
163,MIN_REDUCTION+179, // $NT
  }
,
{ // state 669
0x80000000|355, // match move
0x80000000|490, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 670
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 671
-1, // $$start
-1, // start
709, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
129, // `boolean
374, // `class
131, // `extends
3, // `void
166, // `int
208, // `while
664, // `if
460, // `else
284, // `for
326, // `break
141, // `this
120, // `false
547, // `true
522, // `super
29, // `null
70, // `return
608, // `instanceof
724, // `new
585, // `abstract
648, // `assert
381, // `byte
286, // `case
384, // `catch
239, // `char
278, // `const
323, // `continue
312, // `default
627, // `do
114, // `double
40, // `enum
456, // `final
560, // `finally
445, // `float
126, // `goto
723, // `implements
36, // `import
189, // `interface
268, // `long
588, // `native
651, // `package
563, // `private
409, // `protected
570, // `public
756, // `short
484, // `static
617, // `strictfp
68, // `switch
241, // `synchronized
296, // `throw
422, // `throws
191, // `transient
401, // `try
531, // `volatile
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
-1, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
623, // "b"
MIN_REDUCTION+187, // "o"
606, // "l"
242, // "e"
769, // "a"
732, // "n"
-1, // idChar
-1, // reserved
216, // "r"
MIN_REDUCTION+187, // "k"
494, // "c"
695, // "s"
MIN_REDUCTION+187, // "x"
716, // "t"
377, // "d"
200, // "f"
630, // "i"
34, // "w"
MIN_REDUCTION+187, // "u"
603, // "p"
MIN_REDUCTION+187, // "h"
452, // "v"
MIN_REDUCTION+187, // "y"
MIN_REDUCTION+187, // "m"
4, // "g"
MIN_REDUCTION+187, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
MIN_REDUCTION+187, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
-1, // intLit2
MIN_REDUCTION+187, // "0"
-1, // digit++
-1, // digit
MIN_REDUCTION+187, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
-1, // letter
-1, // "_"
MIN_REDUCTION+187, // {"A".."Z" "j" "q"}
115, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
679, // ws
115, // {9}
234, // eol
738, // {10}
527, // {13}
-1, // $$1
-1, // $$2
-1, // token*
-1, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 672
2,525, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 673
136,351, // "|"
  }
,
{ // state 674
163,MIN_REDUCTION+140, // $NT
  }
,
{ // state 675
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 676
112,506, // "y"
  }
,
{ // state 677
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 678
2,49, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 679
163,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 680
0x80000000|754, // match move
0x80000000|442, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 681
98,199, // "r"
  }
,
{ // state 682
0x80000000|352, // match move
0x80000000|399, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 683
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 684
104,139, // "d"
  }
,
{ // state 685
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 686
2,MIN_REDUCTION+311, // ws*
149,MIN_REDUCTION+311, // " "
152,MIN_REDUCTION+311, // {9}
154,MIN_REDUCTION+311, // {10}
155,MIN_REDUCTION+311, // {13}
161,MIN_REDUCTION+311, // $$3
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 687
90,271, // "b"
91,271, // "o"
92,271, // "l"
93,271, // "e"
94,271, // "a"
95,271, // "n"
98,271, // "r"
99,271, // "k"
100,271, // "c"
101,271, // "s"
102,271, // "x"
103,271, // "t"
104,271, // "d"
105,271, // "f"
106,271, // "i"
107,271, // "w"
108,271, // "u"
109,271, // "p"
110,271, // "h"
111,271, // "v"
112,271, // "y"
113,271, // "m"
114,271, // "g"
115,271, // "z"
138,185, // "0"
140,344, // digit
141,185, // {"1".."9"}
146,488, // letter
147,395, // "_"
148,271, // {"A".."Z" "j" "q"}
  }
,
{ // state 688
0x80000000|1, // match move
0x80000000|764, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 689
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 690
0x80000000|1, // match move
0x80000000|642, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 691
105,431, // "f"
  }
,
{ // state 692
149,MIN_REDUCTION+319, // " "
151,MIN_REDUCTION+319, // ws
152,MIN_REDUCTION+319, // {9}
154,MIN_REDUCTION+319, // {10}
155,MIN_REDUCTION+319, // {13}
161,MIN_REDUCTION+319, // $$3
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 693
0x80000000|132, // match move
0x80000000|211, // no-match move
// T-test match for "*":
122,
  }
,
{ // state 694
92,676, // "l"
  }
,
{ // state 695
103,741, // "t"
107,747, // "w"
108,113, // "u"
110,474, // "h"
112,263, // "y"
  }
,
{ // state 696
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 697
2,196, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 698
95,340, // "n"
  }
,
{ // state 699
103,641, // "t"
  }
,
{ // state 700
163,MIN_REDUCTION+245, // $NT
  }
,
{ // state 701
117,480, // "="
  }
,
{ // state 702
2,730, // ws*
151,679, // ws
153,234, // eol
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 703
93,556, // "e"
  }
,
{ // state 704
0x80000000|1, // match move
0x80000000|770, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 705
163,MIN_REDUCTION+113, // $NT
  }
,
{ // state 706
2,501, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 707
91,148, // "o"
  }
,
{ // state 708
93,717, // "e"
  }
,
{ // state 709
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 710
2,367, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 711
0x80000000|352, // match move
0x80000000|416, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 712
163,MIN_REDUCTION+221, // $NT
  }
,
{ // state 713
163,MIN_REDUCTION+134, // $NT
  }
,
{ // state 714
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 715
163,MIN_REDUCTION+239, // $NT
  }
,
{ // state 716
98,436, // "r"
110,634, // "h"
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 718
0x80000000|526, // match move
0x80000000|657, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 719
2,273, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 720
0x80000000|1, // match move
0x80000000|665, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 721
163,MIN_REDUCTION+155, // $NT
  }
,
{ // state 722
101,581, // "s"
  }
,
{ // state 723
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 724
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 725
0x80000000|744, // match move
0x80000000|514, // no-match move
// T-test match for {"*" "/"}:
122,
123,
  }
,
{ // state 726
117,454, // "="
  }
,
{ // state 727
90,516, // "b"
91,516, // "o"
92,516, // "l"
93,516, // "e"
94,516, // "a"
95,516, // "n"
98,516, // "r"
99,516, // "k"
100,516, // "c"
101,516, // "s"
102,516, // "x"
103,516, // "t"
104,516, // "d"
105,516, // "f"
106,516, // "i"
107,516, // "w"
108,516, // "u"
109,516, // "p"
110,516, // "h"
111,516, // "v"
112,516, // "y"
113,516, // "m"
114,516, // "g"
115,516, // "z"
116,516, // "!"
117,516, // "="
118,516, // "%"
119,516, // "&"
120,516, // "("
121,516, // ")"
122,516, // "*"
123,516, // "/"
124,516, // "+"
125,516, // ","
126,516, // "-"
127,516, // "."
128,516, // ":"
129,516, // ";"
130,516, // "<"
131,516, // ">"
132,516, // "["
133,516, // "]"
134,516, // "{"
135,516, // "}"
136,516, // "|"
138,516, // "0"
141,516, // {"1".."9"}
142,516, // "'"
143,123, // printable
144,516, // '"'
147,516, // "_"
148,516, // {"A".."Z" "j" "q"}
149,516, // " "
150,516, // {"#".."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 728
113,548, // "m"
  }
,
{ // state 729
0x80000000|1, // match move
0x80000000|463, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 730
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 731
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 732
93,472, // "e"
94,520, // "a"
108,496, // "u"
  }
,
{ // state 733
0x80000000|649, // match move
0x80000000|433, // no-match move
// T-test match for "0":
138,
  }
,
{ // state 734
2,768, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 735
94,615, // "a"
  }
,
{ // state 736
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 737
91,469, // "o"
92,138, // "l"
  }
,
{ // state 738
163,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 739
0x80000000|1, // match move
0x80000000|672, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 740
90,94, // "b"
91,94, // "o"
92,94, // "l"
93,94, // "e"
94,94, // "a"
95,94, // "n"
96,499, // idChar
98,94, // "r"
99,94, // "k"
100,94, // "c"
101,94, // "s"
102,94, // "x"
103,94, // "t"
104,94, // "d"
105,94, // "f"
106,94, // "i"
107,94, // "w"
108,94, // "u"
109,94, // "p"
110,94, // "h"
111,94, // "v"
112,94, // "y"
113,94, // "m"
114,94, // "g"
115,94, // "z"
138,711, // "0"
140,186, // digit
141,711, // {"1".."9"}
145,507, // idChar++
146,656, // letter
147,392, // "_"
148,94, // {"A".."Z" "j" "q"}
160,621, // idChar+
  }
,
{ // state 741
94,658, // "a"
98,457, // "r"
  }
,
{ // state 742
94,93, // "a"
106,251, // "i"
108,75, // "u"
112,580, // "y"
  }
,
{ // state 743
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 744
149,MIN_REDUCTION+332, // " "
151,MIN_REDUCTION+332, // ws
152,MIN_REDUCTION+332, // {9}
154,MIN_REDUCTION+332, // {10}
155,MIN_REDUCTION+332, // {13}
161,MIN_REDUCTION+332, // $$3
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 745
92,487, // "l"
  }
,
{ // state 746
93,478, // "e"
  }
,
{ // state 747
106,551, // "i"
  }
,
{ // state 748
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 749
2,336, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 750
95,601, // "n"
  }
,
{ // state 751
92,519, // "l"
  }
,
{ // state 752
98,150, // "r"
  }
,
{ // state 753
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
193, // token
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
604, // `!
637, // `!=
427, // `%
302, // `&&
-1, // `*
325, // `(
549, // `)
598, // `{
685, // `}
625, // `-
8, // `+
493, // `=
500, // `==
119, // `[
597, // `]
609, // `||
468, // `<
88, // `<=
759, // `,
449, // `>
74, // `>=
100, // `.
128, // `;
675, // `++
524, // `--
142, // `/
559, // `:
364, // ID
254, // INTLIT
124, // STRINGLIT
666, // CHARLIT
177, // COMMENT
271, // "b"
271, // "o"
271, // "l"
271, // "e"
271, // "a"
271, // "n"
-1, // idChar
-1, // reserved
271, // "r"
271, // "k"
271, // "c"
271, // "s"
271, // "x"
271, // "t"
271, // "d"
271, // "f"
271, // "i"
271, // "w"
271, // "u"
271, // "p"
271, // "h"
271, // "v"
271, // "y"
271, // "m"
271, // "g"
271, // "z"
574, // "!"
406, // "="
55, // "%"
238, // "&"
91, // "("
706, // ")"
-1, // "*"
718, // "/"
282, // "+"
636, // ","
640, // "-"
161, // "."
421, // ":"
393, // ";"
628, // "<"
599, // ">"
662, // "["
767, // "]"
172, // "{"
69, // "}"
673, // "|"
232, // intLit2
305, // "0"
512, // digit++
26, // digit
305, // {"1".."9"}
727, // "'"
-1, // printable
740, // '"'
-1, // idChar++
441, // letter
-1, // "_"
271, // {"A".."Z" "j" "q"}
-1, // " "
-1, // {"#".."$" "?".."@" "\" "^" "`" "~"}
-1, // ws
-1, // {9}
-1, // eol
-1, // {10}
-1, // {13}
-1, // $$1
-1, // $$2
-1, // token*
5, // digit+
-1, // idChar+
-1, // $$3
MIN_REDUCTION+337, // $
-1, // $NT
  }
,
{ // state 754
2,MIN_REDUCTION+313, // ws*
149,MIN_REDUCTION+313, // " "
152,MIN_REDUCTION+313, // {9}
154,MIN_REDUCTION+313, // {10}
155,MIN_REDUCTION+313, // {13}
161,MIN_REDUCTION+313, // $$3
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 755
0x80000000|1, // match move
0x80000000|710, // no-match move
0x80000000|687, // NT-test-match state for idChar
  }
,
{ // state 756
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 757
2,413, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 758
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 759
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 760
3,696, // $$0
4,443, // token
58,604, // `!
59,637, // `!=
60,427, // `%
61,302, // `&&
63,325, // `(
64,549, // `)
65,598, // `{
66,685, // `}
67,625, // `-
68,8, // `+
69,493, // `=
70,500, // `==
71,119, // `[
72,597, // `]
73,609, // `||
74,468, // `<
75,88, // `<=
76,759, // `,
77,449, // `>
78,74, // `>=
79,100, // `.
80,128, // `;
81,675, // `++
82,524, // `--
83,142, // `/
84,559, // `:
85,364, // ID
86,254, // INTLIT
87,124, // STRINGLIT
88,666, // CHARLIT
89,177, // COMMENT
146,441, // letter
151,412, // ws
153,234, // eol
158,618, // token*
  }
,
{ // state 761
2,510, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 762
3,696, // $$0
4,443, // token
5,129, // `boolean
6,374, // `class
7,131, // `extends
8,3, // `void
9,166, // `int
10,208, // `while
11,664, // `if
12,460, // `else
13,284, // `for
14,326, // `break
15,141, // `this
16,120, // `false
17,547, // `true
18,522, // `super
19,29, // `null
20,70, // `return
21,608, // `instanceof
22,724, // `new
23,585, // `abstract
24,648, // `assert
25,381, // `byte
26,286, // `case
27,384, // `catch
28,239, // `char
29,278, // `const
30,323, // `continue
31,312, // `default
32,627, // `do
33,114, // `double
34,40, // `enum
35,456, // `final
36,560, // `finally
37,445, // `float
38,126, // `goto
39,723, // `implements
40,36, // `import
41,189, // `interface
42,268, // `long
43,588, // `native
44,651, // `package
45,563, // `private
46,409, // `protected
47,570, // `public
48,756, // `short
49,484, // `static
50,617, // `strictfp
51,68, // `switch
52,241, // `synchronized
53,296, // `throw
54,422, // `throws
55,191, // `transient
56,401, // `try
57,531, // `volatile
158,618, // token*
  }
,
{ // state 763
93,620, // "e"
  }
,
{ // state 764
2,11, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 765
2,587, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 766
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 767
2,2, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 768
149,115, // " "
151,412, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+237, // $NT
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 769
90,626, // "b"
101,341, // "s"
  }
,
{ // state 770
2,758, // ws*
149,115, // " "
151,679, // ws
152,115, // {9}
153,234, // eol
154,738, // {10}
155,527, // {13}
163,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[771][];
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
// token ::= COMMENT
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
// COMMENT ::= "/" "/" ws* $$1
(89<<16)+4,
// COMMENT ::= "/" "/" $$1
(89<<16)+3,
// COMMENT ::= "/" "*" ws* $$2
(89<<16)+4,
// COMMENT ::= "/" "*" $$2
(89<<16)+3,
// ID ::= !reserved letter idChar++ ws*
(85<<16)+3,
// ID ::= !reserved letter idChar++
(85<<16)+2,
// token* ::= token* token
(158<<16)+2,
// token* ::= token
(158<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// idChar++ ::= idChar+ !idChar
(145<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit+ ::= digit
(159<<16)+1,
// digit+ ::= digit+ digit
(159<<16)+2,
// idChar+ ::= idChar
(160<<16)+1,
// idChar+ ::= idChar+ idChar
(160<<16)+2,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= idChar++ ws*
(156<<16)+2,
// $$1 ::= idChar++
(156<<16)+1,
// $$2 ::= idChar++ ws* $$3
(157<<16)+3,
// $$2 ::= idChar++ ws* !!{"*" "/"}
(157<<16)+2,
// $$2 ::= idChar++ $$3
(157<<16)+2,
// $$2 ::= idChar++ !!{"*" "/"}
(157<<16)+1,
// $$3 ::= !!{"*" "/"} ws*
(161<<16)+1,
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
"token ::= # COMMENT", // 89
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
"COMMENT ::= # \"/\" \"/\" ws* idChar++ ws*", // 321
"COMMENT ::= # \"/\" \"/\" ws* idChar++ ws*", // 322
"COMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !!{\"*\" \"/\"} ws*", // 323
"COMMENT ::= # \"/\" \"*\" ws* idChar++ ws* !!{\"*\" \"/\"} ws*", // 324
"ID ::= !reserved letter idChar++ ws*", // 325
"ID ::= !reserved letter idChar++ ws*", // 326
"token* ::= token* token", // 327
"token* ::= token* token", // 328
"digit++ ::= digit+ !digit", // 329
"idChar++ ::= idChar+ !idChar", // 330
"ws* ::= ws* ws", // 331
"ws* ::= ws* ws", // 332
"digit+ ::= digit", // 333
"digit+ ::= digit+ digit", // 334
"idChar+ ::= idChar", // 335
"idChar+ ::= idChar+ idChar", // 336
"", // 337
"", // 338
"", // 339
"", // 340
"", // 341
"", // 342
"", // 343
"", // 344
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
    { // 89: token ::= [#] COMMENT @sawComment(int)=>
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
    { // 321: COMMENT ::= [#] "/" "/" ws* $$1 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 322: COMMENT ::= [#] "/" "/" [ws*] $$1 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 323: COMMENT ::= [#] "/" "*" ws* $$2 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 324: COMMENT ::= [#] "/" "*" [ws*] $$2 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 325: ID ::= !reserved letter idChar++ ws* @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 326: ID ::= !reserved letter idChar++ [ws*] @sequenceToIdentifier(Character,List<Character>)=>String
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 327: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 328: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 329: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 330: idChar++ ::= idChar+ !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 332: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 333: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 334: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 335: idChar+ ::= idChar @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 336: idChar+ ::= idChar+ idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 337: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 338: $$1 ::= idChar++ ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 339: $$1 ::= idChar++ [ws*] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 340: $$2 ::= idChar++ ws* $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: $$2 ::= idChar++ ws* !!{"*" "/"} [ws*] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: $$2 ::= idChar++ [ws*] $$3 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 343: $$2 ::= idChar++ !!{"*" "/"} [ws*] [ws*] @pass
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 344: $$3 ::= !!{"*" "/"} ws* @pass
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
      ((89<<5)|0x5)/*methodCall:89*/,
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
      actionObject.sawComment(parm0);
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
      Character parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      String result = actionObject.sequenceToIdentifier(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 89: {
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
"void sawComment(int)",
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
1,0,
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
    1,
    1,
    0,
    1,
    1,
    0,
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
