package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J3\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00100\u0017H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "prefetchOrEof", "", "position", "consumeNextToken", "", "canConsumeValue", "", "skipWhitespaces", "", "expected", "", "consumeKeyString", "consumeStringChunked", "isLenient", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "peekLeadingMatchingValue", "keyToMatch", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class StringJsonLexer extends AbstractJsonLexer {
    private final String source;

    public StringJsonLexer(String source) {
        Intrinsics.f(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return false;
        }
        String source = getSource();
        while (i2 < source.length()) {
            char cCharAt = source.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i2;
                return isValidValueStart(cCharAt);
            }
            i2++;
        }
        this.currentPosition = i2;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        consumeNextToken(AbstractJsonLexerKt.STRING);
        int i2 = this.currentPosition;
        int iU = StringsKt.u(getSource(), AbstractJsonLexerKt.STRING, i2, 4);
        if (iU == -1) {
            consumeStringLenient();
            fail$kotlinx_serialization_json((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i3 = i2; i3 < iU; i3++) {
            if (getSource().charAt(i3) == '\\') {
                return consumeString(getSource(), this.currentPosition, i3);
            }
        }
        this.currentPosition = iU + 1;
        String strSubstring = getSource().substring(i2, iU);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int i2 = this.currentPosition;
        while (i2 != -1 && i2 < source.length()) {
            int i3 = i2 + 1;
            char cCharAt = source.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i3;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i2 = i3;
        }
        this.currentPosition = source.length();
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean isLenient, Function1<? super String, Unit> consumeChunk) {
        Intrinsics.f(consumeChunk, "consumeChunk");
        String strConsumeStringLenient = isLenient ? consumeStringLenient() : consumeString();
        Intrinsics.f(strConsumeStringLenient, "<this>");
        int length = strConsumeStringLenient.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / 16384) + (length % 16384 == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + 16384;
            CharSequence it = strConsumeStringLenient.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            Intrinsics.f(it, "it");
            arrayList.add(it.toString());
            i2 = i3;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            consumeChunk.invoke(it2.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String peekLeadingMatchingValue(String keyToMatch, boolean isLenient) {
        Intrinsics.f(keyToMatch, "keyToMatch");
        int i2 = this.currentPosition;
        try {
            if (consumeNextToken() == 6 && Intrinsics.a(peekString(isLenient), keyToMatch)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    return peekString(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i2;
            discardPeeked();
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char cCharAt;
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return i2;
        }
        String source = getSource();
        while (i2 < source.length() && ((cCharAt = source.charAt(i2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i2++;
        }
        this.currentPosition = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        String source = getSource();
        int i2 = this.currentPosition;
        while (i2 < source.length()) {
            int i3 = i2 + 1;
            char cCharAt = source.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i3;
                if (cCharAt == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
            i2 = i3;
        }
        this.currentPosition = -1;
        unexpectedToken(expected);
    }
}
