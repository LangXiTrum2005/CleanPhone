package qa;

import androidx.core.app.NotificationCompat;
import go.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char[] f48908g;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f48908g = new char[512];
        char[] cArr = aVar.f48900b;
        k.i(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f48908g;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | NotificationCompat.FLAG_LOCAL_ONLY] = cArr[i10 & 15];
        }
    }

    @Override // qa.e
    public final int a(byte[] bArr, CharSequence charSequence) throws d {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            a aVar = this.f48911a;
            bArr[i11] = (byte) ((aVar.a(cCharAt) << 4) | aVar.a(charSequence.charAt(i10 + 1)));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // qa.e
    public final void d(StringBuilder sb2, byte[] bArr, int i10) {
        k.r(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f48908g;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }
}
