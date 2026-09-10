package kotlinx.serialization.json.internal;

import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/sealless;", "Lkotlinx/serialization/json/internal/gintrap;", "<init>", "()V", "", "value", "", "writeLong", "(J)V", "", "char", "attabal", "(C)V", "", "text", "dern", "(Ljava/lang/String;)V", "saneness", "competently", "toString", "()Ljava/lang/String;", "", "firstEscapedChar", "currentSize", "string", "wireman", "(IILjava/lang/String;)V", "expected", "marial", "(I)V", "oldSize", "additional", "beachfront", "(II)I", "", "[C", "array", "I", "size", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class sealless implements gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public char[] array = apical.f32482dern.wireman();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int size;

    @Override // kotlinx.serialization.json.internal.gintrap
    public void attabal(char c) {
        marial(1);
        char[] cArr = this.array;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
    }

    public final int beachfront(int oldSize, int additional) {
        int i = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, p002kotlin.ranges.wireman.wireman(i, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }

    public void competently() {
        apical.f32482dern.dern(this.array);
    }

    @Override // kotlinx.serialization.json.internal.gintrap
    public void dern(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        marial(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    public final void marial(int expected) {
        beachfront(this.size, expected);
    }

    @Override // kotlinx.serialization.json.internal.gintrap
    public void saneness(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        marial(text.length() + 2);
        char[] cArr = this.array;
        int i = this.size;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < mathsort.attabal().length && mathsort.attabal()[c] != 0) {
                wireman(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.size = i3 + 1;
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    public final void wireman(int firstEscapedChar, int currentSize, String string) {
        byte b;
        int length = string.length();
        while (firstEscapedChar < length) {
            int iBeachfront = beachfront(currentSize, 2);
            char cCharAt = string.charAt(firstEscapedChar);
            if (cCharAt >= mathsort.attabal().length || (b = mathsort.attabal()[cCharAt]) == 0) {
                int i = iBeachfront + 1;
                this.array[iBeachfront] = cCharAt;
                currentSize = i;
            } else if (b == 1) {
                String str = mathsort.saneness()[cCharAt];
                Intrinsics.beachfront(str);
                int iBeachfront2 = beachfront(iBeachfront, str.length());
                str.getChars(0, str.length(), this.array, iBeachfront2);
                currentSize = iBeachfront2 + str.length();
                this.size = currentSize;
            } else {
                char[] cArr = this.array;
                cArr[iBeachfront] = '\\';
                cArr[iBeachfront + 1] = (char) b;
                currentSize = iBeachfront + 2;
                this.size = currentSize;
            }
            firstEscapedChar++;
        }
        int iBeachfront3 = beachfront(currentSize, 1);
        this.array[iBeachfront3] = '\"';
        this.size = iBeachfront3 + 1;
    }

    @Override // kotlinx.serialization.json.internal.gintrap
    public void writeLong(long value) {
        dern(String.valueOf(value));
    }
}
