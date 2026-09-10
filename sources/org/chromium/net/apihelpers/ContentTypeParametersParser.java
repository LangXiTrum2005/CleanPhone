package org.chromium.net.apihelpers;

import com.ironsource.X3;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class ContentTypeParametersParser {
    private static final String TOKEN_ALLOWED_SPECIAL_CHARS = "!#$%&'*+-.^_`|~";
    private int mCurrentPosition;
    private final String mHeaderValue;

    public static class ContentTypeParametersParserException extends ParseException {
        public ContentTypeParametersParserException(String str, int i) {
            super(str, i);
        }
    }

    public ContentTypeParametersParser(String str) {
        this.mHeaderValue = str;
        int iIndexOf = str.indexOf(59);
        this.mCurrentPosition = iIndexOf != -1 ? iIndexOf + 1 : str.length();
    }

    private void advance() throws ContentTypeParametersParserException {
        if (!hasMore()) {
            throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
        }
        this.mCurrentPosition++;
    }

    private char currentChar() throws ContentTypeParametersParserException {
        if (hasMore()) {
            return this.mHeaderValue.charAt(this.mCurrentPosition);
        }
        throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
    }

    private String getNextQuotedString() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        if (currentChar() != '\"') {
            throw new ContentTypeParametersParserException("Not a quoted string: expected \" at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
        }
        advance();
        StringBuilder sb = new StringBuilder();
        while (true) {
            boolean z = false;
            while (true) {
                if (!hasMore()) {
                    throw new ContentTypeParametersParserException("Unterminated quoted string at " + i + ": [" + this.mHeaderValue + X3.j.e, i);
                }
                if (z) {
                    break;
                }
                if (currentChar() == '\"') {
                    advance();
                    return sb.toString();
                }
                if (currentChar() == '\\') {
                    advance();
                    z = true;
                } else {
                    if (!isQdtextChar(currentChar())) {
                        throw new ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
                    }
                    sb.append(currentChar());
                    advance();
                }
            }
            if (!isQuotedPairChar(currentChar())) {
                throw new ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
            }
            sb.append(currentChar());
            advance();
        }
    }

    private String getNextToken() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        while (hasMore() && isTokenCharacter(currentChar())) {
            advance();
        }
        int i2 = this.mCurrentPosition;
        if (i != i2) {
            return this.mHeaderValue.substring(i, i2);
        }
        throw new ContentTypeParametersParserException("Token not found at position " + i + ": [" + this.mHeaderValue + X3.j.e, i);
    }

    private static boolean isAscii(char c) {
        return c >= 0 && c <= 127;
    }

    private static boolean isQdtextChar(char c) {
        return (c == '\\' || c == '\"' || !isQuotedPairChar(c)) ? false : true;
    }

    private static boolean isQuotedPairChar(char c) {
        if (isWhitespace(c)) {
            return true;
        }
        return '!' <= c && c <= 255 && c != 127;
    }

    private static boolean isTokenCharacter(char c) {
        if (isAscii(c)) {
            return Character.isLetterOrDigit(c) || TOKEN_ALLOWED_SPECIAL_CHARS.indexOf(c) != -1;
        }
        return false;
    }

    private static boolean isWhitespace(char c) {
        return c == '\t' || c == ' ';
    }

    private void optionallySkipWhitespace() throws ContentTypeParametersParserException {
        while (hasMore() && isWhitespace(currentChar())) {
            advance();
        }
    }

    public Map.Entry<String, String> getNextParameter() throws ContentTypeParametersParserException {
        optionallySkipWhitespace();
        String nextToken = getNextToken();
        if (currentChar() != '=') {
            throw new ContentTypeParametersParserException("Invalid parameter format: expected = at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
        }
        advance();
        String nextQuotedString = currentChar() == '\"' ? getNextQuotedString() : getNextToken();
        optionallySkipWhitespace();
        if (hasMore()) {
            if (currentChar() != ';') {
                throw new ContentTypeParametersParserException("Invalid parameter format: expected ; at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
            }
            advance();
        }
        return new AbstractMap.SimpleEntry(nextToken, nextQuotedString);
    }

    public boolean hasMore() {
        return this.mCurrentPosition < this.mHeaderValue.length();
    }
}
