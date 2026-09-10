package kotlinx.serialization.json.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\f\u001a\u00020\r*\u00020\u000eH\u0084\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\rH&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0006\u0010\u0017\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000eH\u0004J\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000eH&J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000eH\u0004J\u001f\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00162\b\b\u0002\u0010)\u001a\u00020\rH\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\r2\b\b\u0002\u0010-\u001a\u00020\rJ\b\u0010.\u001a\u00020\tH&J\u001a\u0010/\u001a\u0004\u0018\u00010\u001c2\u0006\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\rH&J\u0010\u00102\u001a\u0004\u0018\u00010\u001c2\u0006\u00101\u001a\u00020\rJ\u0006\u00103\u001a\u00020\u0010J\u0018\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\tH\u0016J\u0018\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0016J\b\u00109\u001a\u00020\u001cH&J\u0018\u0010:\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00105\u001a\u00020\u000eH\u0002J3\u0010;\u001a\u00020\u00102\u0006\u00101\u001a\u00020\r2!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00100=H\u0016JC\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\r2!\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00100=H\u0002J\u0006\u0010E\u001a\u00020\u001cJ \u0010E\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0005J\u0018\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0002J\u0018\u0010J\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010K\u001a\u00020\u001cH\u0002J\u0006\u0010L\u001a\u00020\u001cJ\b\u0010M\u001a\u00020\rH\u0002J\u0006\u0010N\u001a\u00020\u001cJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0014J\u0010\u0010P\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0002J\u0018\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00106\u001a\u00020\tH\u0002J1\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\t2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001c0UH\u0080\bø\u0001\u0000¢\u0006\u0002\bVJ\u0018\u0010W\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010X\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\rJ\b\u0010Z\u001a\u00020\u001cH\u0016J\u000e\u0010[\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u001cJ\"\u0010&\u001a\u00020'2\u0006\u0010T\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010]\u001a\u00020\u001cJ\u0006\u0010^\u001a\u00020_J\u0006\u0010`\u001a\u00020\rJ\u0006\u0010a\u001a\u00020\rJ\u0010\u0010`\u001a\u00020\r2\u0006\u0010b\u001a\u00020\tH\u0003J\u0018\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\tH\u0002J\"\u0010e\u001a\u0002Hf\"\u0004\b\u0000\u0010f2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002Hf0UH\u0082\b¢\u0006\u0002\u0010hR\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006i"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "source", "", "getSource", "()Ljava/lang/CharSequence;", "currentPosition", "", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "isWs", "", "", "ensureHaveChars", "", "isNotEof", "prefetchOrEof", "position", "canConsumeValue", "consumeNextToken", "", "tryConsumeComma", "isValidValueStart", "c", "expectEof", "peekedString", "", "escapedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "expected", "unexpectedToken", "fail", "", "expectedToken", "wasConsumed", "fail$kotlinx_serialization_json", "peekNextToken", "tryConsumeNull", "doConsume", "skipWhitespaces", "peekLeadingMatchingValue", "keyToMatch", "isLenient", "peekString", "discardPeeked", "indexOf", "char", "startPos", "substring", "endPos", "consumeKeyString", "insideString", "consumeStringChunked", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "writeRange", "fromIndex", "toIndex", "currentChunkHasEscape", "consumeString", "startPosition", "current", "appendEscape", "lastPosition", "decodedString", "takePeeked", "consumeStringLenientNotNull", "wasUnquotedString", "consumeStringLenient", "appendRange", "appendEsc", "appendHex", "require", "condition", PglCryptUtils.KEY_MESSAGE, "Lkotlin/Function0;", "require$kotlinx_serialization_json", "fromHexChar", "skipElement", "allowLenientStrings", "toString", "failOnUnknownKey", "key", "hint", "consumeNumericLiteral", "", "consumeBoolean", "consumeBooleanLenient", "start", "consumeBooleanLiteral", "literalSuffix", "withPositionRollback", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "action", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractJsonLexer {
    public int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int startPosition) {
        int iPrefetchOrEof = prefetchOrEof(startPosition);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i2);
        }
        char cEscapeToChar = AbstractJsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i2;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final int appendHex(CharSequence source, int startPos) {
        int i2 = startPos + 4;
        if (i2 < source.length()) {
            this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
            return i2;
        }
        this.currentPosition = startPos;
        ensureHaveChars();
        if (this.currentPosition + 4 < source.length()) {
            return appendHex(source, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current < literalSuffix.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (literalSuffix.charAt(i2) != (getSource().charAt(current + i2) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = literalSuffix.length() + current;
    }

    private static final double consumeNumericLiteral$calculateExponent(long j, boolean z2) {
        if (!z2) {
            return Math.pow(10.0d, -j);
        }
        if (z2) {
            return Math.pow(10.0d, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        Intrinsics.e(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i2, String str2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i3 & 2) != 0) {
            i2 = abstractJsonLexer.currentPosition;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i2, str2);
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return abstractJsonLexer.fail$kotlinx_serialization_json(b2, z2);
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean insideString(boolean isLenient, char c2) {
        if (isLenient) {
            return AbstractJsonLexerKt.charToTokenClass(c2) == 0;
        }
        return c2 != '\"';
    }

    public static void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z2, int i2, Function0 message, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i3 & 2) != 0) {
            i2 = abstractJsonLexer.currentPosition;
        }
        int i4 = i2;
        Intrinsics.f(message, "message");
        if (z2) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i4, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.c(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return abstractJsonLexer.tryConsumeNull(z2);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    private final <T> T withPositionRollback(Function0<? extends T> action) {
        int i2 = this.currentPosition;
        try {
            return (T) action.invoke();
        } finally {
            this.currentPosition = i2;
        }
    }

    private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1<? super String, Unit> consumeChunk) {
        if (currentChunkHasEscape) {
            consumeChunk.invoke(decodedString(fromIndex, toIndex));
        } else {
            consumeChunk.invoke(substring(fromIndex, toIndex));
        }
    }

    public void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z2;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (!z2) {
            return zConsumeBoolean;
        }
        if (this.currentPosition == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(this.currentPosition) == '\"') {
            this.currentPosition++;
            return zConsumeBoolean;
        }
        fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte expected) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == expected) {
            return bConsumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public abstract void consumeNextToken(char expected);

    public final long consumeNumericLiteral() {
        boolean z2;
        boolean z3;
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iPrefetchOrEof) == '\"') {
            iPrefetchOrEof++;
            if (iPrefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = iPrefetchOrEof;
        boolean z4 = false;
        boolean z5 = false;
        long j = 0;
        long j2 = 0;
        loop0: while (true) {
            z3 = false;
            while (true) {
                if (i2 == getSource().length()) {
                    break loop0;
                }
                char cCharAt = getSource().charAt(i2);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z4) {
                    if (i2 == iPrefetchOrEof) {
                        fail$default(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i2++;
                    z4 = true;
                } else if (cCharAt != '-' || !z4) {
                    if (cCharAt != '+' || !z4) {
                        if (cCharAt != '-') {
                            if (AbstractJsonLexerKt.charToTokenClass(cCharAt) != 0) {
                                break loop0;
                            }
                            i2++;
                            int i3 = cCharAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                fail$default(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z4) {
                                j2 = (j2 * ((long) 10)) + ((long) i3);
                            } else {
                                j = (j * ((long) 10)) - ((long) i3);
                                if (j > 0) {
                                    fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i2 != iPrefetchOrEof) {
                                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i2++;
                            z5 = true;
                        }
                    } else {
                        if (i2 == iPrefetchOrEof) {
                            fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i2++;
                    }
                }
                z3 = true;
            }
            if (i2 == iPrefetchOrEof) {
                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i2++;
        }
        boolean z6 = i2 != iPrefetchOrEof;
        if (iPrefetchOrEof == i2 || (z5 && iPrefetchOrEof == i2 - 1)) {
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z2) {
            if (!z6) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(i2) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i2++;
        }
        this.currentPosition = i2;
        if (z4) {
            double dConsumeNumericLiteral$calculateExponent = j * consumeNumericLiteral$calculateExponent(j2, z3);
            if (dConsumeNumericLiteral$calculateExponent > 9.223372036854776E18d || dConsumeNumericLiteral$calculateExponent < -9.223372036854776E18d) {
                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dConsumeNumericLiteral$calculateExponent) != dConsumeNumericLiteral$calculateExponent) {
                fail$default(this, "Can't convert " + dConsumeNumericLiteral$calculateExponent + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j = (long) dConsumeNumericLiteral$calculateExponent;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        fail$default(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String consumeString() {
        return this.peekedString != null ? takePeeked() : consumeKeyString();
    }

    public void consumeStringChunked(boolean isLenient, Function1<? super String, Unit> consumeChunk) {
        int i2;
        int iPrefetchOrEof;
        Intrinsics.f(consumeChunk, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!isLenient || bPeekNextToken == 0) {
            if (!isLenient) {
                consumeNextToken(AbstractJsonLexerKt.STRING);
            }
            int i3 = this.currentPosition;
            char cCharAt = getSource().charAt(i3);
            boolean z2 = false;
            int i4 = i3;
            while (insideString(isLenient, cCharAt)) {
                if (isLenient || cCharAt != '\\') {
                    int i5 = i4 + 1;
                    i2 = i3;
                    iPrefetchOrEof = i5;
                } else {
                    iPrefetchOrEof = prefetchOrEof(appendEscape(i3, i4));
                    z2 = true;
                    i2 = iPrefetchOrEof;
                }
                if (iPrefetchOrEof >= getSource().length()) {
                    writeRange(i2, iPrefetchOrEof, z2, consumeChunk);
                    int iPrefetchOrEof2 = prefetchOrEof(iPrefetchOrEof);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    z2 = false;
                    i3 = iPrefetchOrEof2;
                    i4 = i3;
                } else {
                    int i6 = i2;
                    i4 = iPrefetchOrEof;
                    i3 = i6;
                }
                cCharAt = getSource().charAt(i4);
            }
            writeRange(i3, i4, z2, consumeChunk);
            this.currentPosition = i4;
            if (isLenient) {
                return;
            }
            consumeNextToken(AbstractJsonLexerKt.STRING);
        }
    }

    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z2 = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.currentPosition = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z2 = true;
            }
        }
        String strSubstring = !z2 ? substring(this.currentPosition, iSkipWhitespaces) : decodedString(this.currentPosition, iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces;
        return strSubstring;
    }

    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!Intrinsics.a(strConsumeStringLenient, AbstractJsonLexerKt.NULL) || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void fail(String message, int position, String hint) {
        Intrinsics.f(message, "message");
        Intrinsics.f(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : IOUtils.LINE_SEPARATOR_UNIX.concat(hint);
        StringBuilder sbX = android.support.v4.media.a.x(message, " at path: ");
        sbX.append(this.path.getPath());
        sbX.append(strConcat);
        throw JsonExceptionsKt.JsonDecodingException(position, sbX.toString(), getSource());
    }

    public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed) {
        String str = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int i2 = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, androidx.datastore.preferences.protobuf.a.n("Expected ", str, ", but had '", (this.currentPosition == getSource().length() || i2 < 0) ? "EOF" : String.valueOf(getSource().charAt(i2)), "' instead"), i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void failOnUnknownKey(String key) {
        Intrinsics.f(key, "key");
        fail(androidx.media3.extractor.text.ttml.a.i('\'', "Encountered an unknown key '", key), StringsKt.y(6, key, substring(0, this.currentPosition)), AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    public final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    public abstract CharSequence getSource();

    public int indexOf(char c2, int startPos) {
        return StringsKt.u(getSource(), c2, startPos, 4);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean isValidValueStart(char c2) {
        return (c2 == ',' || c2 == ':' || c2 == ']' || c2 == '}') ? false : true;
    }

    public final boolean isWs(char c2) {
        return c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t';
    }

    public abstract String peekLeadingMatchingValue(String keyToMatch, boolean isLenient);

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i2 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i2);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.currentPosition = iPrefetchOrEof;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i2 = iPrefetchOrEof + 1;
        }
    }

    public final String peekString(boolean isLenient) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (isLenient) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int position);

    public final void require$kotlinx_serialization_json(boolean condition, int position, Function0<String> message) {
        Intrinsics.f(message, "message");
        if (condition) {
            return;
        }
        fail$default(this, (String) message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void setEscapedString(StringBuilder sb) {
        Intrinsics.f(sb, "<set-?>");
        this.escapedString = sb;
    }

    public final void skipElement(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) CollectionsKt.F(arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    CollectionsKt.T(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) CollectionsKt.F(arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    CollectionsKt.T(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public abstract int skipWhitespaces();

    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) getSource());
        sb.append("', currentPosition=");
        return android.support.v4.media.a.p(sb, this.currentPosition, ')');
    }

    public final boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1 || source.charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean tryConsumeNull(boolean doConsume) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length < 4 || iPrefetchOrEof == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (AbstractJsonLexerKt.NULL.charAt(i2) != getSource().charAt(iPrefetchOrEof + i2)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = iPrefetchOrEof + 4;
        return true;
    }

    public final void unexpectedToken(char expected) {
        int i2 = this.currentPosition;
        if (i2 > 0 && expected == '\"') {
            try {
                this.currentPosition = i2 - 1;
                String strConsumeStringLenient = consumeStringLenient();
                this.currentPosition = i2;
                if (Intrinsics.a(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.currentPosition = i2;
                throw th;
            }
        }
        fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    private final boolean consumeBoolean(int start) {
        int iPrefetchOrEof = prefetchOrEof(start);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i2 = iPrefetchOrEof + 1;
        int iCharAt = getSource().charAt(iPrefetchOrEof) | ' ';
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i2);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i2);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String consumeString(CharSequence source, int startPosition, int current) {
        String strDecodedString;
        Intrinsics.f(source, "source");
        char cCharAt = source.charAt(current);
        boolean z2 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iPrefetchOrEof = prefetchOrEof(appendEscape(startPosition, current));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z2 = true;
                startPosition = iPrefetchOrEof;
                current = startPosition;
            } else {
                current++;
                if (current >= source.length()) {
                    appendRange(startPosition, current);
                    int iPrefetchOrEof2 = prefetchOrEof(current);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "Unexpected EOF", iPrefetchOrEof2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    startPosition = iPrefetchOrEof2;
                    current = startPosition;
                    z2 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(current);
        }
        if (!z2) {
            strDecodedString = substring(startPosition, current);
        } else {
            strDecodedString = decodedString(startPosition, current);
        }
        this.currentPosition = current + 1;
        return strDecodedString;
    }
}
