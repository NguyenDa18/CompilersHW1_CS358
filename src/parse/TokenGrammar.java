package parse;
import java.util.List;

import errorMsg.*;

// java -cp ./WrangLR.jar main.Main myGram.java -d src/parser -o MyGramParseTable.java

public class TokenGrammar implements wrangLR.runtime.MessageObject {

	public TokenGrammar(ErrorMsg em) {
		errorMsg = em;
	}
	private ErrorMsg errorMsg;
	
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}
	
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}
	
	public void reportTok(int pos, String s) {
		System.out.println(errorMsg.lineAndChar(pos)+": "+s);
	}


//: start ::= ws* token*

 /** 
================================================================================
    THE FOLLOWING IS DETAILS ABOUT TOKENS
    tokens : indivisible building blocks of our language

    NON-TERMINALS:
    start : the start rule
    grammar-level symbols : non-termianls that consist of sequences of tokens
    whitespace token : defines what a whitespace character is in the language, ws denotes the whitespace char
    subpattern tokens : define char sequences that might appear within tokens
=================================================================================
*/
	

//: token ::= # `boolean =>
public void sawBoolean(int pos) {
       reportTok(pos, "`boolean");
}
//: token ::= # `class =>
public void sawClass(int pos) {
       reportTok(pos, "`class");
}
//: token ::= # `extends =>
public void sawExtends(int pos) {
       reportTok(pos, "`extends");
}
//: token ::= # `void =>
public void sawVoid(int pos) {
       reportTok(pos, "`void");
}
//: token ::= # `int =>
public void sawInt(int pos) {
       reportTok(pos, "`int");
}
//: token ::= # `while =>
public void sawWhile(int pos) {
       reportTok(pos, "`while");
}
//: token ::= # `if =>
public void sawIf(int pos) {
       reportTok(pos, "`if");
}
//: token ::= # `else =>
public void sawElse(int pos) {
       reportTok(pos, "`else");
}
//: token ::= # `for =>
public void sawFor(int pos) {
       reportTok(pos, "`for");
}
//: token ::= # `break =>
public void sawBreak(int pos) {
       reportTok(pos, "`break");
}
//: token ::= # `this =>
public void sawThis(int pos) {
       reportTok(pos, "`this");
}
//: token ::= # `false =>
public void sawFalse(int pos) {
       reportTok(pos, "`false");
}
//: token ::= # `true =>
public void sawTrue(int pos) {
       reportTok(pos, "`true");
}
//: token ::= # `super =>
public void sawSuper(int pos) {
       reportTok(pos, "`super");
}
//: token ::= # `null =>
public void sawNull(int pos) {
       reportTok(pos, "`null");
}
//: token ::= # `return =>
public void sawReturn(int pos) {
       reportTok(pos, "`return");
}
//: token ::= # `instanceof =>
public void sawInstanceof(int pos) {
       reportTok(pos, "`instanceof");
}
//: token ::= # `new =>
public void sawNew(int pos) {
       reportTok(pos, "`new");
}
//: token ::= # `abstract =>
public void sawAbstract(int pos) {
       reportTok(pos, "`abstract");
}
//: token ::= # `assert =>
public void sawAssert(int pos) {
       reportTok(pos, "`assert");
}
//: token ::= # `byte =>
public void sawByte(int pos) {
       reportTok(pos, "`byte");
}
//: token ::= # `case =>
public void sawCase(int pos) {
       reportTok(pos, "`case");
}
//: token ::= # `catch =>
public void sawCatch(int pos) {
       reportTok(pos, "`catch");
}
//: token ::= # `char =>
public void sawChar(int pos) {
       reportTok(pos, "`char");
}
//: token ::= # `const =>
public void sawConst(int pos) {
       reportTok(pos, "`const");
}
//: token ::= # `continue =>
public void sawContinue(int pos) {
       reportTok(pos, "`continue");
}
//: token ::= # `default =>
public void sawDefault(int pos) {
       reportTok(pos, "`default");
}
//: token ::= # `do =>
public void sawDo(int pos) {
       reportTok(pos, "`do");
}
//: token ::= # `double =>
public void sawDouble(int pos) {
       reportTok(pos, "`double");
}
//: token ::= # `enum =>
public void sawEnum(int pos) {
       reportTok(pos, "`enum");
}
//: token ::= # `final =>
public void sawFinal(int pos) {
       reportTok(pos, "`final");
}
//: token ::= # `finally =>
public void sawFinally(int pos) {
       reportTok(pos, "`finally");
}
//: token ::= # `float =>
public void sawFloat(int pos) {
       reportTok(pos, "`float");
}
//: token ::= # `goto =>
public void sawGoto(int pos) {
       reportTok(pos, "`goto");
}
//: token ::= # `implements =>
public void sawImplements(int pos) {
       reportTok(pos, "`implements");
}
//: token ::= # `import =>
public void sawImport(int pos) {
       reportTok(pos, "`import");
}
//: token ::= # `interface =>
public void sawInterface(int pos) {
       reportTok(pos, "`interface");
}
//: token ::= # `long =>
public void sawLong(int pos) {
       reportTok(pos, "`long");
}
//: token ::= # `native =>
public void sawNative(int pos) {
       reportTok(pos, "`native");
}
//: token ::= # `package =>
public void sawPackage(int pos) {
       reportTok(pos, "`package");
}
//: token ::= # `private =>
public void sawPrivate(int pos) {
       reportTok(pos, "`private");
}
//: token ::= # `protected =>
public void sawProtected(int pos) {
       reportTok(pos, "`protected");
}
//: token ::= # `public =>
public void sawPublic(int pos) {
       reportTok(pos, "`public");
}
//: token ::= # `short =>
public void sawShort(int pos) {
       reportTok(pos, "`short");
}
//: token ::= # `static =>
public void sawStatic(int pos) {
       reportTok(pos, "`static");
}
//: token ::= # `strictfp =>
public void sawStrictfp(int pos) {
       reportTok(pos, "`strictfp");
}
//: token ::= # `switch =>
public void sawSwitch(int pos) {
       reportTok(pos, "`switch");
}
//: token ::= # `synchronized =>
public void sawSynchronized(int pos) {
       reportTok(pos, "`synchronized");
}
//: token ::= # `throw =>
public void sawThrow(int pos) {
       reportTok(pos, "`throw");
}
//: token ::= # `throws =>
public void sawThrows(int pos) {
       reportTok(pos, "`throws");
}
//: token ::= # `transient =>
public void sawTransient(int pos) {
       reportTok(pos, "`transient");
}
//: token ::= # `try =>
public void sawTry(int pos) {
       reportTok(pos, "`try");
}
//: token ::= # `volatile =>
public void sawVolatile(int pos) {
       reportTok(pos, "`volatile");
}

//: token ::= # `! =>
public void sawNot(int pos) {
     reportTok(pos, "`!");
}
//: token ::= # `!= =>
public void sawNotEqual(int pos) {
     reportTok(pos, "`!=");
}
//: token ::= # `% =>
public void sawRemainder(int pos) {
     reportTok(pos, "`%");
}
//: token ::= # `&& =>
public void sawAnd(int pos) {
     reportTok(pos, "`&&");
}
//: token ::= # `* =>
public void sawTimes(int pos) {
     reportTok(pos, "`*");
}
//: token ::= # `( =>
public void sawLpar(int pos) {
     reportTok(pos, "`(");
}
//: token ::= # `) =>
public void sawRpar(int pos) {
     reportTok(pos, "`)");
}
//: token ::= # `{ =>
public void sawLbrace(int pos) {
     reportTok(pos, "`{");
}
//: token ::= # `} =>
public void sawRbrace(int pos) {
     reportTok(pos, "`}");
}
//: token ::= # `- =>
public void sawMinus(int pos) {
     reportTok(pos, "`-");
}
//: token ::= # `+ =>
public void sawPlus(int pos) {
     reportTok(pos, "`+");
}
//: token ::= # `= =>
public void sawAssign(int pos) {
     reportTok(pos, "`=");
}
//: token ::= # `== =>
public void sawEqual(int pos) {
     reportTok(pos, "`==");
}
//: token ::= # `[ =>
public void sawLbrack(int pos) {
     reportTok(pos, "`[");
}
//: token ::= # `] =>
public void sawRbrack(int pos) {
     reportTok(pos, "`]");
}
//: token ::= # `|| =>
public void sawOr(int pos) {
     reportTok(pos, "`||");
}
//: token ::= # `< =>
public void sawLess(int pos) {
     reportTok(pos, "`<");
}
//: token ::= # `<= =>
public void sawLessEq(int pos) {
     reportTok(pos, "`<=");
}
//: token ::= # `, =>
public void sawComma(int pos) {
     reportTok(pos, "`,");
}
//: token ::= # `> =>
public void sawGreater(int pos) {
     reportTok(pos, "`>");
}
//: token ::= # `>= =>
public void sawGreaterEq(int pos) {
     reportTok(pos, "`>=");
}
//: token ::= # `. =>
public void sawDot(int pos) {
     reportTok(pos, "`.");
}
//: token ::= # `; =>
public void sawSemi(int pos) {
     reportTok(pos, "`;");
}
//: token ::= # `++ =>
public void sawPlusPlus(int pos) {
     reportTok(pos, "`++");
}
//: token ::= # `-- =>
public void sawMinusMinus(int pos) {
     reportTok(pos, "`--");
}
//: token ::= # `/ =>
public void sawSlash(int pos) {
     reportTok(pos, "`/");
}
//: token ::= # `: =>
public void sawColon(int pos) {
     reportTok(pos, "`:");
}
	
//: token ::= # ID =>
public void identifier(int pos, String s) {
	reportTok(pos, "identifier: "+s);
}
	
//: token ::= # INTLIT =>
public void intLit(int pos, int n) {
	reportTok(pos, "integer literal: "+n);
}
	
//: token ::= # STRINGLIT =>
public void stringLit(int pos, String s) {
	reportTok(pos, "string literal: "+s);
}
	
//: token ::= # CHARLIT =>
public void charLit(int pos, int n) {
	reportTok(pos, "character literal with ASCII value: "+n);
}


/////////////////////////////////////////////////////////////////
//////////   Your modifications should start here   /////////////
/////////////////////////////////////////////////////////////////

//================================================================
// the actual tokens
//================================================================

// reserved words
//: `boolean ::= "boolean" !idChar ws*
//: reserved ::= `boolean

//: `break ::= "break" !idChar ws*
//: reserved ::= `break

//: `class ::= "class" !idChar ws*
//: reserved ::= `class

//: `else ::= "else" !idChar ws*
//: reserved ::= `else

//: `extends ::= "extends" !idChar ws*
//: reserved ::= `extends

//: `false ::= "false" !idChar ws*
//: reserved ::= `false

//: `for ::= "for" !idChar ws*
//: reserved ::= `for

//: `if ::= "if" !idChar ws*
//: reserved ::= `if

//: `instanceof ::= "instanceof" !idChar ws*
//: reserved ::= `instanceof

//: `int ::= "int" !idChar ws*
//: reserved ::= `int

//: `new ::= "new" !idChar ws*
//: reserved ::= `new

//: `null ::= "null" !idChar ws*
//: reserved ::= `null

//: `public ::= "public" !idChar ws*
//: reserved ::= `public

//: `return ::= "return" !idChar ws*
//: reserved ::= `return

//: `super ::= "super" !idChar ws*
//: reserved ::= `super

//: `switch ::= "switch" !idChar ws*
//: reserved ::= `switch

//: `this ::= "this" !idChar ws*
//: reserved ::= `this

//: `true ::= "true" !idChar ws*
//: reserved ::= `true

//: `void ::= "void" !idChar ws*
//: reserved ::= `void

//: `while ::= "while" !idChar ws*
//: reserved ::= `while

/**
    Java reserved words not used in MiniJava
 */

//: `abstract ::= "abstract" !idChar ws*
//: reserved ::= `abstract

//: `assert ::= "assert" !idChar ws*
//: reserved ::= `assert

//: `byte ::= "byte" !idChar ws*
//: reserved ::= `byte

//: `case ::= "case" !idChar ws*
//: reserved ::= `case

//: `catch ::= "catch" !idChar ws*
//: reserved ::= `catch

//: `char ::= "char" !idChar ws*
//: reserved ::= `char

//: `const ::= "const" !idChar ws*
//: reserved ::= `const

//: `continue ::= "continue" !idChar ws*
//: reserved ::= `continue

//: `default ::= "default" !idChar ws*
//: reserved ::= `default

//: `do ::= "do" !idChar ws*
//: reserved ::= `do

//: `double ::= "double" !idChar ws*
//: reserved ::= `double

//: `enum ::= "enum" !idChar ws*
//: reserved ::= `enum

//: `final ::= "final" !idChar ws*
//: reserved ::= `final

//: `finally ::= "finally" !idChar ws*
//: reserved ::= `finally

//: `float ::= "float" !idChar ws*
//: reserved ::= `float

//: `goto ::= "goto" !idChar ws*
//: reserved ::= `goto

//: `implements ::= "implements" !idChar ws*
//: reserved ::= `implements

//: `import ::= "import" !idChar ws*
//: reserved ::= `import

//: `interface ::= "interface" !idChar ws*
//: reserved ::= `interface

//: `long ::= "long" !idChar ws*
//: reserved ::= `long

//: `native ::= "native" !idChar ws*
//: reserved ::= `native

//: `package ::= "package" !idChar ws*
//: reserved ::= `package

//: `private ::= "private" !idChar ws*
//: reserved ::= `private

//: `protected ::= "protected" !idChar ws*
//: reserved ::= `protected

//: `short ::= "short" !idChar ws*
//: reserved ::= `short

//: `static ::= "static" !idChar ws*
//: reserved ::= `static

//: `strictfp ::= "strictfp" !idChar ws*
//: reserved ::= `strictfp

//: `synchronized ::= "synchronized" !idChar ws*
//: reserved ::= `synchronized

//: `throw ::= "throw" !idChar ws*
//: reserved ::= `throw

//: `throws ::= "throws" !idChar ws*
//: reserved ::= `throws

//: `transient ::= "transient" !idChar ws*
//: reserved ::= `transient

//: `try ::= "try" !idChar ws*
//: reserved ::= `try

//: `volatile ::= "volatile" !idChar ws*
//: reserved ::= `volatile



//================================================================
// SPECIAL-TOKEN CHARACTERS
//================================================================
//: `! ::= "!" !"=" ws*
//: `!= ::= "!=" ws*
//: `% ::= "%" ws*
//: `&& ::= "&&" ws*
//: `( ::= "(" ws*
//: `) ::= ")" ws*

//: `* ::= "*" !"/" ws*

//: `+ ::= "+" !"+" ws*
//: `++ ::= "++" ws*
//: `, ::= "," ws*
//: `- ::= "-" !"-" ws*
//: `-- ::= "--" ws*
//: `. ::= "." ws*
//: `/ ::= !"*" "/" !{"*" "/"} ws*
//: `: ::= ":" ws*
//: `; ::= ";" ws*
//: `< ::= "<" !"=" ws*
//: `<= ::= "<=" ws*
//: `= ::= "=" !"=" ws*
//: `== ::= "==" ws*
//: `> ::= ">" !"=" ws*
//: `>= ::= ">=" ws*
//: `[ ::= "[" ws*
//: `] ::= "]" ws*
//: `{ ::= "{" ws*
//: `} ::= "}" ws*
//: `|| ::= "||" ws*



//: `# ::= "#" ws*

//================================================================
// NUMBER RELATED TOKENS
//================================================================

//: INTLIT ::= # "0" !{"0".."9" "x" "X"} ws* =>
public int zero(int pos, char c) { return 0;}

// a numeric literal
//: INTLIT ::= # intLit2 ws* =>
public int convertToInt(int pos, String s) {
	try {
		return new Integer(s).intValue();
	}
	catch (NumberFormatException nfx) {
		error(pos, "Integer literal value "+s+" is out of range.");
		return 0;
	}
}

// Extension 3 : Extend INTLIT so Java's octal and hexadecimal literals interpreted, resource used: https://www.tutorialspoint.com/java/lang/integer_decode.htm 

//: `x ::= {"x" "X"}
//: INTLIT ::= # "0" `x digit++ ws* =>
public int convertHexToInt(int pos, Character zero, List<Character> hexLit) {
    Integer hexInt = new Integer(10);
    String hexStr = String.valueOf(hexLit);
    return Integer.decode("0x" + hexStr);
}

// pattern that represents an integer literal (without trailing whitespace)
//: intLit2 ::= !"0" digit++ => text

// a digit
//: digit ::= {"0".."9"} => pass

//================================================================
// LETTERS AND CHAR TOKENS
// character patterns -- "helper symbols"
//================================================================

//: CHARLIT ::= # "'" printable "'" ws* =>
public int printableToAscii(int pos, char leftQuote, char printable, char rightQuote) {
    return (int)printable;
}

//: STRINGLIT ::= # '"' printable++ '"' ws* =>
public String charsToStringLiteral(int pos, char leftQuote, List<Character> stringLit, char rightQuote) {
    return String.valueOf(stringLit);
}

// Escape sequences
////: STRINGLIT ::= # '"' '\' !{'\', ''','n','t','f','r'} =>


// a character that can be a non-first character in an identifier
//: idChar ::= letter => pass
//: idChar ::= digit => pass
//: idChar ::= "_" => pass

// a letter
//: letter ::= {"a".."z" "A".."Z"} => pass

// printable ASCII chars
//: printable ::= {" ".."~"} => pass

//================================================================
// WHITESPACE
//================================================================
//: ws ::= {" " 9} // space or tab
//: ws ::= eol

// Comments
// Single line comment starting with //

//: ws ::= "//" printable** eol
//: ws ::= "/*" commentContent* "*/"


//: commentContent ::= "*" !"/"
//: commentContent ::= !"*" printable
//: commentContent ::= eol
    
// to handle the common end-of-line sequences on different types
// of systems, we treat the sequence CR+LF as an end of line.
// Otherwise, we treat CR or LF appearing separately each as an
// end of line.
//: eol ::= {10} registerNewline
//: eol ::= {13} {10} registerNewline
//: eol ::= {13} !{10} registerNewline // CR alone only if not followed by LF

// empty symbol which registers a new line at the position reduced
//: registerNewline ::= # =>
public void registerNewline(int pos) {
	errorMsg.newline(pos-1);
}

//================================================================
// COMMENTS
//================================================================
public void reportNestedComment(int pos, Character left, Character leftInner, List<Character> leftOuterComment, 
    List<Character> nestedComment, List<Character> rightOuterComment) {
    warning(pos, "Nested comment detected at " + pos);
}


/**
    IDENTIFIERS : Enforce the longest match rule, MiniJava identifiers
    - starts with letter
    - may optionally be followed by sequence of one or more letters, digits, underscores
    - Reserved words should NOT be recognized as identifiers
 */
 //: ID ::= !reserved letter idChar** ws* =>
 public String sequenceToIdentifier(Character startLetter, List<Character> sequence) {
     return String.valueOf(startLetter) + "" + sequence;
 }


}