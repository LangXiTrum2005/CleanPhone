package kotlin.uuid;

import kotlin.Metadata;
import kotlin.text.HexExtensionsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidJVMKt {
    public static final void a(long j, byte[] bArr, int i2, int i3, int i4) {
        int i5 = 7 - i3;
        int i6 = 8 - i4;
        if (i6 > i5) {
            return;
        }
        while (true) {
            int i7 = HexExtensionsKt.f44698a[(int) ((j >> (i5 << 3)) & 255)];
            int i8 = i2 + 1;
            bArr[i2] = (byte) (i7 >> 8);
            i2 += 2;
            bArr[i8] = (byte) i7;
            if (i5 == i6) {
                return;
            } else {
                i5--;
            }
        }
    }
}
