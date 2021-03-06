/* Generated By:JavaCC: Do not edit this line. DTDParserConstants.java */
package core.exolab.cst.xml.dtd.parser;

public interface DTDParserConstants {

  int EOF = 0;
  int LETTER = 1;
  int DIGIT = 2;
  int COMBINING_CHAR = 3;
  int EXTENDER = 4;
  int NAMECHAR = 5;
  int S = 6;
  int LEFT_PAREN = 7;
  int RIGHT_PAREN = 8;
  int OR = 9;
  int AND = 10;
  int STAR = 11;
  int QUESTION = 12;
  int PLUS = 13;
  int ANY = 14;
  int EMPTY = 15;
  int BEGIN_ELEMENT_DECL = 16;
  int END_ELEMENT_DECL = 17;
  int PCDATA = 18;
  int BEGIN_ATTR_DECL = 19;
  int BEGIN_COMMENT = 20;
  int BEGIN_GE_DECL = 21;
  int BEGIN_NOTATION_DECL = 22;
  int NAME = 23;
  int COMMENT_CHAR = 24;
  int DASH = 25;
  int END_COMMENT = 26;
  int S_ATTR = 27;
  int LEFT_PAREN_ATTR = 28;
  int RIGHT_PAREN_ATTR = 29;
  int OR_ATTR = 30;
  int CDATA = 31;
  int ID = 32;
  int IDREF = 33;
  int IDREFS = 34;
  int ENTITY = 35;
  int ENTITIES = 36;
  int NMTOKEN = 37;
  int NMTOKENS = 38;
  int NOTATION = 39;
  int REQUIRED = 40;
  int IMPLIED = 41;
  int FIXED = 42;
  int START_DQ_ATTR = 43;
  int START_SQ_ATTR = 44;
  int END_ATTR_DECL = 45;
  int NAME_ATTR = 46;
  int NMTOKEN_ATTR = 47;
  int ATTR_VALUE_CHAR_DQ = 48;
  int END_DQ_ATTR = 49;
  int ATTR_VALUE_CHAR_SQ = 50;
  int END_SQ_ATTR = 51;
  int S_GE = 52;
  int END_GE_DECL = 53;
  int START_DQ_GE = 54;
  int START_SQ_GE = 55;
  int PUBLIC_GE = 56;
  int SYSTEM_GE = 57;
  int NDATA = 58;
  int NAME_GE = 59;
  int SYSLITER_GE = 60;
  int PUBIDCHAR_GE = 61;
  int PUBLITER_GE = 62;
  int S_GE_PUB = 63;
  int GE_VAlUE_CHAR_DQ = 64;
  int END_DQ_GE = 65;
  int GE_VAlUE_CHAR_SQ = 66;
  int END_SQ_GE = 67;
  int S_NOT = 68;
  int PUBLIC_NOT = 69;
  int SYSTEM_NOT = 70;
  int NAME_NOT = 71;
  int SYSLITER_NOT = 72;
  int S_NOT_SYS = 73;
  int END_NOTATION_DECL = 74;
  int PUBIDCHAR_NOT = 75;
  int PUBLITER_NOT = 76;

  int DEFAULT = 0;
  int WithinComment = 1;
  int WithinAttrDecl = 2;
  int WithinAttrValueDQ = 3;
  int WithinAttrValueSQ = 4;
  int WithinGEDecl = 5;
  int System_GE = 6;
  int Public_GE = 7;
  int WithinGEValueDQ = 8;
  int WithinGEValueSQ = 9;
  int WithinNotationDecl = 10;
  int System_NOT = 11;
  int Public_NOT = 12;

  String[] tokenImage = {
    "<EOF>",
    "<LETTER>",
    "<DIGIT>",
    "<COMBINING_CHAR>",
    "<EXTENDER>",
    "<NAMECHAR>",
    "<S>",
    "\"(\"",
    "\")\"",
    "\"|\"",
    "\",\"",
    "\"*\"",
    "\"?\"",
    "\"+\"",
    "\"ANY\"",
    "\"EMPTY\"",
    "\"<!ELEMENT\"",
    "\">\"",
    "\"#PCDATA\"",
    "\"<!ATTLIST\"",
    "\"<!--\"",
    "\"<!ENTITY\"",
    "\"<!NOTATION\"",
    "<NAME>",
    "<COMMENT_CHAR>",
    "\"-\"",
    "\"-->\"",
    "<S_ATTR>",
    "\"(\"",
    "\")\"",
    "\"|\"",
    "\"CDATA\"",
    "\"ID\"",
    "\"IDREF\"",
    "\"IDREFS\"",
    "\"ENTITY\"",
    "\"ENTITIES\"",
    "\"NMTOKEN\"",
    "\"NMTOKENS\"",
    "\"NOTATION\"",
    "\"#REQUIRED\"",
    "\"#IMPLIED\"",
    "\"#FIXED\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "\">\"",
    "<NAME_ATTR>",
    "<NMTOKEN_ATTR>",
    "<ATTR_VALUE_CHAR_DQ>",
    "\"\\\"\"",
    "<ATTR_VALUE_CHAR_SQ>",
    "\"\\\'\"",
    "<S_GE>",
    "\">\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "<PUBLIC_GE>",
    "<SYSTEM_GE>",
    "\"NDATA\"",
    "<NAME_GE>",
    "<SYSLITER_GE>",
    "<PUBIDCHAR_GE>",
    "<PUBLITER_GE>",
    "<S_GE_PUB>",
    "<GE_VAlUE_CHAR_DQ>",
    "\"\\\"\"",
    "<GE_VAlUE_CHAR_SQ>",
    "\"\\\'\"",
    "<S_NOT>",
    "<PUBLIC_NOT>",
    "<SYSTEM_NOT>",
    "<NAME_NOT>",
    "<SYSLITER_NOT>",
    "<S_NOT_SYS>",
    "\">\"",
    "<PUBIDCHAR_NOT>",
    "<PUBLITER_NOT>",
  };

}
