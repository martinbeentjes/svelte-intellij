/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package dev.blachut.svelte.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.util.Stack;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.blachut.svelte.lang.psi.SvelteTypes.*;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Svelte.flex</tt>
 */
public class _SvelteLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int SVELTE_TAG_START = 2;
  public static final int SVELTE_TAG = 4;
  public static final int SVELTE_TAG_PARAMETER = 6;
  public static final int SVELTE_INTERPOLATION_START = 8;
  public static final int SVELTE_INTERPOLATION = 10;
  public static final int VERBATIM_COMMENT = 12;
  public static final int VERBATIM_HTML = 14;
  public static final int HTML_TAG = 16;
  public static final int ONLY_WHITESPACE = 18;
  public static final int SINGLE_QUOTE = 20;
  public static final int DOUBLE_QUOTE = 22;
  public static final int TICKED_QUOTE = 24;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12
  };

  /**
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\5\1\22\0\1\1\1\7\1\4\1\23\1\2\2\0\1\3\1\33\1\34\2\0\1\35\1\10\1\0\1"+
    "\25\12\2\1\24\1\0\1\6\1\0\1\47\1\0\1\41\32\2\1\36\1\50\1\37\1\0\1\2\1\5\1"+
    "\27\1\44\1\12\1\43\1\21\1\26\1\46\1\30\1\14\2\2\1\20\1\42\1\32\1\2\1\15\1"+
    "\2\1\13\1\11\1\16\1\45\1\2\1\31\1\2\1\17\1\2\1\22\1\0\1\40\7\0\1\1\32\0\1"+
    "\1\337\0\1\1\177\0\13\1\35\0\2\1\5\0\1\1\57\0\1\1\40\0");

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\15\0\1\1\1\2\1\3\1\4\6\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\2\10\1\14\1\10\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\25"+
    "\1\26\1\7\1\27\2\1\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\35\3\0\1\37\1\40\1\41"+
    "\1\5\1\42\4\5\1\43\1\44\1\10\1\45\1\0"+
    "\1\46\3\26\5\0\5\5\1\10\2\26\1\0\1\47"+
    "\2\0\1\5\1\50\1\51\1\52\1\5\1\53\2\26"+
    "\4\0\1\54\1\55\1\56\1\26\3\0\1\57\1\60"+
    "\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386\0\u0215"+
    "\0\u03af\0\u03d8\0\u0215\0\u0215\0\u0215\0\u0401\0\u042a\0\u0215"+
    "\0\u0453\0\u0215\0\u0215\0\u0215\0\u0215\0\u0215\0\u0215\0\u0215"+
    "\0\u0215\0\u0215\0\u047c\0\u04a5\0\u0215\0\u0215\0\u04ce\0\u04f7"+
    "\0\u0215\0\u0215\0\u0215\0\u0215\0\u0520\0\u0215\0\u0215\0\u0549"+
    "\0\u0572\0\u059b\0\u0267\0\u0215\0\u0215\0\u0215\0\u05c4\0\u02b9"+
    "\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0215\0\u03d8\0\u0691\0\u03d8"+
    "\0\u047c\0\u0215\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u0787"+
    "\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf"+
    "\0\u08f8\0\u0921\0\u094a\0\u0215\0\u0973\0\u099c\0\u09c5\0\u02b9"+
    "\0\u02b9\0\u02b9\0\u09ee\0\u03d8\0\u0a17\0\u0a40\0\u0a69\0\u0a92"+
    "\0\u0abb\0\u0ae4\0\u02b9\0\u02b9\0\u06ba\0\u0b0d\0\u0b36\0\u0b5f"+
    "\0\u0b88\0\u0215\0\u06ba\0\u0bb1\0\u0bda\0\u0c03";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\6\16\1\17\13\16\1\20\27\16\1\21\1\22\6\16"+
    "\1\22\1\23\1\22\1\24\1\22\1\25\2\22\1\26"+
    "\4\16\1\22\1\27\3\22\7\16\5\22\2\16\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\3\30\3\32\1\36"+
    "\1\32\1\37\3\32\1\40\3\30\1\32\1\41\3\32"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\30\5\32"+
    "\3\30\1\31\1\32\1\33\1\34\1\35\3\30\11\32"+
    "\1\40\3\30\5\32\1\50\1\51\1\44\1\45\1\46"+
    "\1\47\1\30\5\32\2\30\1\52\1\53\37\52\1\54"+
    "\7\52\22\55\1\56\15\55\1\47\10\55\10\16\1\57"+
    "\46\16\1\60\45\16\1\61\1\62\42\16\1\63\1\16"+
    "\1\64\1\65\47\64\3\66\1\67\44\66\1\70\4\66"+
    "\1\67\43\66\1\70\5\66\1\67\42\66\1\70\60\0"+
    "\1\71\1\0\1\72\40\0\1\73\21\0\1\74\1\75"+
    "\1\76\24\0\1\21\51\0\1\22\6\0\11\22\4\0"+
    "\5\22\7\0\5\22\4\0\1\22\6\0\11\22\4\0"+
    "\1\22\1\77\3\22\7\0\5\22\4\0\1\22\6\0"+
    "\11\22\4\0\1\100\4\22\7\0\5\22\4\0\1\22"+
    "\6\0\11\22\4\0\2\22\1\101\2\22\7\0\5\22"+
    "\4\0\1\22\6\0\7\22\1\102\1\22\4\0\1\22"+
    "\1\103\3\22\7\0\5\22\4\0\1\22\6\0\11\22"+
    "\4\0\3\22\1\104\1\22\7\0\5\22\3\0\1\31"+
    "\36\0\1\105\12\0\1\32\6\0\11\32\4\0\5\32"+
    "\7\0\5\32\4\0\1\32\6\0\11\32\4\0\1\106"+
    "\4\32\7\0\5\32\4\0\1\32\6\0\11\32\4\0"+
    "\2\32\1\107\2\32\7\0\5\32\4\0\1\32\6\0"+
    "\1\110\10\32\4\0\5\32\7\0\5\32\3\0\1\111"+
    "\37\0\1\112\11\0\1\113\6\0\11\113\4\0\2\113"+
    "\1\114\2\113\7\0\1\113\1\115\3\113\12\0\1\116"+
    "\65\0\1\117\24\0\1\65\47\0\51\66\10\0\1\120"+
    "\52\0\1\121\3\0\1\122\34\0\1\22\6\0\5\22"+
    "\1\123\3\22\4\0\5\22\7\0\5\22\4\0\1\22"+
    "\6\0\10\22\1\124\4\0\5\22\7\0\5\22\4\0"+
    "\1\22\6\0\1\125\10\22\4\0\5\22\7\0\5\22"+
    "\4\0\1\22\6\0\1\22\1\126\7\22\4\0\5\22"+
    "\7\0\5\22\4\0\1\22\6\0\11\22\4\0\1\22"+
    "\1\127\3\22\7\0\5\22\4\0\1\32\6\0\10\32"+
    "\1\130\4\0\5\32\7\0\5\32\4\0\1\113\6\0"+
    "\11\113\4\0\5\113\7\0\5\113\4\0\1\113\6\0"+
    "\5\113\1\131\3\113\4\0\5\113\7\0\5\113\4\0"+
    "\1\113\6\0\10\113\1\132\4\0\5\113\7\0\5\113"+
    "\51\0\1\63\12\0\1\133\47\0\1\134\53\0\1\135"+
    "\54\0\1\136\33\0\1\22\6\0\1\22\1\137\7\22"+
    "\4\0\5\22\7\0\5\22\4\0\1\22\6\0\11\22"+
    "\4\0\4\22\1\140\7\0\5\22\4\0\1\22\6\0"+
    "\10\22\1\141\4\0\5\22\7\0\5\22\4\0\1\22"+
    "\6\0\11\22\4\0\2\22\1\142\2\22\7\0\5\22"+
    "\4\0\1\22\6\0\3\22\1\143\5\22\4\0\5\22"+
    "\7\0\5\22\4\0\1\32\6\0\11\32\4\0\4\32"+
    "\1\144\7\0\5\32\4\0\1\113\6\0\11\113\4\0"+
    "\5\113\7\0\1\145\4\113\4\0\1\113\6\0\11\113"+
    "\4\0\5\113\7\0\2\113\1\146\2\113\14\0\1\147"+
    "\3\0\1\150\46\0\1\151\54\0\1\152\32\0\1\22"+
    "\6\0\11\22\4\0\2\22\1\153\2\22\7\0\5\22"+
    "\4\0\1\22\6\0\5\22\1\154\3\22\4\0\5\22"+
    "\7\0\5\22\4\0\1\113\6\0\7\113\1\155\1\113"+
    "\4\0\5\113\7\0\5\113\4\0\1\113\6\0\11\113"+
    "\4\0\5\113\7\0\3\113\1\156\1\113\15\0\1\157"+
    "\54\0\1\160\46\0\1\161\54\0\1\162\31\0\1\113"+
    "\6\0\11\113\4\0\5\113\7\0\4\113\1\163\16\0"+
    "\1\164\54\0\1\165\46\0\1\162\47\0\1\166\54\0"+
    "\1\116\45\0\1\116\32\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3116];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\15\0\1\11\11\1\1\11\2\1\3\11\2\1\1\11"+
    "\1\1\11\11\2\1\2\11\2\1\4\11\1\1\2\11"+
    "\1\1\3\0\3\11\6\1\1\11\3\1\1\0\1\11"+
    "\3\1\5\0\10\1\1\0\1\11\2\0\10\1\4\0"+
    "\4\1\3\0\1\11\1\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int braces = 0;
  private int parens = 0;
  private int brackets = 0;
  // as and then can work as Svelte keywords or JS identifiers depending on context
  private boolean rootKeywordsEnabled = false;

  private IElementType quotedToken;

  private Stack<Integer> stack = new Stack<>();

  private void pushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  private void popState() {
    yybegin(stack.pop());
  }

  private void eatWsThenBegin(int nextState) {
      yybegin(nextState);
      pushState(ONLY_WHITESPACE);
  }

  private IElementType beginQuote(int quoteState, IElementType token) {
      quotedToken = token;
      pushState(quoteState);
      return quotedToken;
  }

  private void enableRootKeywords() {
      if (notNestedCode()) rootKeywordsEnabled = true;
  }

  private boolean notNestedCode() {
      return (braces + parens + brackets) == 0;
  }

  private void resetCounters() {
      rootKeywordsEnabled = false;
      braces = 0;
      parens = 0;
      brackets = 0;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _SvelteLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      resetCounters();

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return HTML_FRAGMENT;
            }
            // fall through
          case 49: break;
          case 2:
            { yybegin(HTML_TAG); return HTML_FRAGMENT;
            }
            // fall through
          case 50: break;
          case 3:
            { yybegin(SVELTE_INTERPOLATION_START); return START_MUSTACHE;
            }
            // fall through
          case 51: break;
          case 4:
            { return BAD_CHARACTER;
            }
            // fall through
          case 52: break;
          case 5:
            { yybegin(SVELTE_TAG); return BAD_CHARACTER;
            }
            // fall through
          case 53: break;
          case 6:
            { if (notNestedCode()) rootKeywordsEnabled = false; return CODE_FRAGMENT;
            }
            // fall through
          case 54: break;
          case 7:
            { return CODE_FRAGMENT;
            }
            // fall through
          case 55: break;
          case 8:
            { enableRootKeywords(); return CODE_FRAGMENT;
            }
            // fall through
          case 56: break;
          case 9:
            { enableRootKeywords(); return beginQuote(SINGLE_QUOTE, CODE_FRAGMENT);
            }
            // fall through
          case 57: break;
          case 10:
            { enableRootKeywords(); return beginQuote(DOUBLE_QUOTE, CODE_FRAGMENT);
            }
            // fall through
          case 58: break;
          case 11:
            { enableRootKeywords(); return beginQuote(TICKED_QUOTE, CODE_FRAGMENT);
            }
            // fall through
          case 59: break;
          case 12:
            { enableRootKeywords(); braces++; return CODE_FRAGMENT;
            }
            // fall through
          case 60: break;
          case 13:
            { enableRootKeywords(); parens++; return CODE_FRAGMENT;
            }
            // fall through
          case 61: break;
          case 14:
            { parens--; return CODE_FRAGMENT;
            }
            // fall through
          case 62: break;
          case 15:
            { if (notNestedCode()) { return COMMA; } else { return CODE_FRAGMENT; }
            }
            // fall through
          case 63: break;
          case 16:
            { enableRootKeywords(); brackets++; return CODE_FRAGMENT;
            }
            // fall through
          case 64: break;
          case 17:
            { brackets--; return CODE_FRAGMENT;
            }
            // fall through
          case 65: break;
          case 18:
            { if (braces == 0) { eatWsThenBegin(YYINITIAL); return END_MUSTACHE; } else { braces--; return CODE_FRAGMENT; }
            }
            // fall through
          case 66: break;
          case 19:
            { parens++; if (parens == 1) { return START_PAREN; } else { return CODE_FRAGMENT; }
            }
            // fall through
          case 67: break;
          case 20:
            { parens--; if (parens == 0) { return END_PAREN; } else { return CODE_FRAGMENT; }
            }
            // fall through
          case 68: break;
          case 21:
            { yybegin(SVELTE_INTERPOLATION); yypushback(yylength());
            }
            // fall through
          case 69: break;
          case 22:
            { yybegin(SVELTE_INTERPOLATION); return BAD_CHARACTER;
            }
            // fall through
          case 70: break;
          case 23:
            { braces++; return CODE_FRAGMENT;
            }
            // fall through
          case 71: break;
          case 24:
            { return beginQuote(SINGLE_QUOTE, HTML_FRAGMENT);
            }
            // fall through
          case 72: break;
          case 25:
            { return beginQuote(DOUBLE_QUOTE, HTML_FRAGMENT);
            }
            // fall through
          case 73: break;
          case 26:
            { yybegin(YYINITIAL); return HTML_FRAGMENT;
            }
            // fall through
          case 74: break;
          case 27:
            { popState(); yypushback(1);
            }
            // fall through
          case 75: break;
          case 28:
            { return WHITE_SPACE;
            }
            // fall through
          case 76: break;
          case 29:
            { return quotedToken;
            }
            // fall through
          case 77: break;
          case 30:
            { popState(); return quotedToken;
            }
            // fall through
          case 78: break;
          case 31:
            { resetCounters(); yybegin(SVELTE_TAG_START); return START_OPENING_MUSTACHE;
            }
            // fall through
          case 79: break;
          case 32:
            { resetCounters(); yybegin(SVELTE_TAG_START); return START_INNER_MUSTACHE;
            }
            // fall through
          case 80: break;
          case 33:
            { resetCounters(); yybegin(SVELTE_TAG_START); return START_CLOSING_MUSTACHE;
            }
            // fall through
          case 81: break;
          case 34:
            { yybegin(SVELTE_TAG); return IF;
            }
            // fall through
          case 82: break;
          case 35:
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { if (braces == 0) { return WHITE_SPACE; } else { return CODE_FRAGMENT; }
            }
            // fall through
          case 83: break;
          case 36:
            { if (notNestedCode()) { return IF; } else { return CODE_FRAGMENT; }
            }
            // fall through
          case 84: break;
          case 37:
            { if (notNestedCode() && rootKeywordsEnabled) { yybegin(SVELTE_TAG_PARAMETER); return AS; } else { enableRootKeywords(); return CODE_FRAGMENT; }
            }
            // fall through
          case 85: break;
          case 38:
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return WHITE_SPACE;
            }
            // fall through
          case 86: break;
          case 39:
            { yybegin(VERBATIM_COMMENT); return HTML_FRAGMENT;
            }
            // fall through
          case 87: break;
          case 40:
            { yybegin(SVELTE_TAG_PARAMETER); return THEN;
            }
            // fall through
          case 88: break;
          case 41:
            { eatWsThenBegin(SVELTE_TAG); return ELSE;
            }
            // fall through
          case 89: break;
          case 42:
            { yybegin(SVELTE_TAG); return EACH;
            }
            // fall through
          case 90: break;
          case 43:
            { if (notNestedCode() && rootKeywordsEnabled) { yybegin(SVELTE_TAG_PARAMETER); return THEN; } else { enableRootKeywords(); return CODE_FRAGMENT; }
            }
            // fall through
          case 91: break;
          case 44:
            { yybegin(SVELTE_TAG_PARAMETER); return CATCH;
            }
            // fall through
          case 92: break;
          case 45:
            { yybegin(SVELTE_TAG); return AWAIT;
            }
            // fall through
          case 93: break;
          case 46:
            { yybegin(SVELTE_INTERPOLATION); return HTML_PREFIX;
            }
            // fall through
          case 94: break;
          case 47:
            { yybegin(VERBATIM_HTML); return HTML_FRAGMENT;
            }
            // fall through
          case 95: break;
          case 48:
            { yybegin(SVELTE_INTERPOLATION); return DEBUG_PREFIX;
            }
            // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
