package qa;

import com.ironsource.B5;
import go.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new a(str, charArray), Character.valueOf(B5.U));
        k.i(charArray.length == 64);
    }

    @Override // qa.e
    public final int a(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        a aVar = this.f48911a;
        if (!aVar.f48906h[length % aVar.f48903e]) {
            throw new d("Invalid input length " + charSequenceE.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceE.length()) {
            int i12 = i10 + 2;
            int iA = (aVar.a(charSequenceE.charAt(i10 + 1)) << 12) | (aVar.a(charSequenceE.charAt(i10)) << 18);
            int i13 = i11 + 1;
            bArr[i11] = (byte) (iA >>> 16);
            if (i12 < charSequenceE.length()) {
                int i14 = i10 + 3;
                int iA2 = iA | (aVar.a(charSequenceE.charAt(i12)) << 6);
                int i15 = i11 + 2;
                bArr[i13] = (byte) ((iA2 >>> 8) & 255);
                if (i14 < charSequenceE.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iA2 | aVar.a(charSequenceE.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i11 = i13;
                i10 = i12;
            }
        }
        return i11;
    }

    @Override // qa.e
    public final void d(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        k.r(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            a aVar = this.f48911a;
            char[] cArr = aVar.f48900b;
            char[] cArr2 = aVar.f48900b;
            sb2.append(cArr[i15 >>> 18]);
            sb2.append(cArr2[(i15 >>> 12) & 63]);
            sb2.append(cArr2[(i15 >>> 6) & 63]);
            sb2.append(cArr2[i15 & 63]);
        }
        if (i11 < i10) {
            c(i11, i10 - i11, sb2, bArr);
        }
    }
}
