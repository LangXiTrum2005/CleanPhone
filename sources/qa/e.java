package qa;

import cc.a2;
import com.ironsource.B5;
import go.k;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f48909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f48910f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f48912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f48913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f48914d;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        f48909e = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f48910f = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public e(a aVar, Character ch2) {
        boolean z10;
        this.f48911a = aVar;
        if (ch2 != null) {
            char cCharValue = ch2.charValue();
            byte[] bArr = aVar.f48905g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        k.k(z10, "Padding character %s was already in alphabet", ch2);
        this.f48912b = ch2;
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        a aVar = this.f48911a;
        boolean[] zArr = aVar.f48906h;
        int i10 = aVar.f48902d;
        int i11 = aVar.f48903e;
        if (!zArr[length % i11]) {
            throw new d("Invalid input length " + charSequenceE.length());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < charSequenceE.length(); i13 += i11) {
            long jA = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                jA <<= i10;
                if (i13 + i15 < charSequenceE.length()) {
                    jA |= (long) aVar.a(charSequenceE.charAt(i14 + i13));
                    i14++;
                }
            }
            int i16 = aVar.f48904f;
            int i17 = (i16 * 8) - (i14 * i10);
            int i18 = (i16 - 1) * 8;
            while (i18 >= i17) {
                bArr[i12] = (byte) ((jA >>> i18) & 255);
                i18 -= 8;
                i12++;
            }
        }
        return i12;
    }

    public final String b(byte[] bArr) {
        int length = bArr.length;
        k.r(0, length, bArr.length);
        a aVar = this.f48911a;
        int i10 = aVar.f48903e;
        int i11 = aVar.f48904f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(a2.k(length, i11) * i10);
        try {
            d(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c(int i10, int i11, StringBuilder sb2, byte[] bArr) {
        k.r(i10, i10 + i11, bArr.length);
        a aVar = this.f48911a;
        int i12 = aVar.f48904f;
        int i13 = aVar.f48902d;
        int i14 = 0;
        k.i(i11 <= i12);
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | ((long) (bArr[i10 + i15] & 255))) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            sb2.append(aVar.f48900b[((int) (j10 >>> (i16 - i14))) & aVar.f48901c]);
            i14 += i13;
        }
        Character ch2 = this.f48912b;
        if (ch2 != null) {
            while (i14 < aVar.f48904f * 8) {
                sb2.append(ch2.charValue());
                i14 += i13;
            }
        }
    }

    public void d(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        k.r(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f48911a;
            c(i11, Math.min(aVar.f48904f, i10 - i11), sb2, bArr);
            i11 += aVar.f48904f;
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.f48912b;
        if (ch2 == null) {
            return charSequence;
        }
        char cCharValue = ch2.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f48911a.equals(eVar.f48911a) && Objects.equals(this.f48912b, eVar.f48912b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48912b) ^ this.f48911a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f48911a;
        sb2.append(aVar);
        if (8 % aVar.f48902d != 0) {
            Character ch2 = this.f48912b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public e(String str, String str2) {
        this(new a(str, str2.toCharArray()), Character.valueOf(B5.U));
    }
}
