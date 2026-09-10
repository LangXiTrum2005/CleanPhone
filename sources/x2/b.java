package x2;

import com.google.android.gms.internal.ads.xd1;
import i1.c0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends no.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53571b;

    public static y2.a M(q qVar) {
        String strU = qVar.u();
        strU.getClass();
        String strU2 = qVar.u();
        strU2.getClass();
        return new y2.a(strU, strU2, qVar.t(), qVar.t(), Arrays.copyOfRange(qVar.f44813a, qVar.f44814b, qVar.f44815c));
    }

    @Override // no.b
    public final c0 o(w2.a aVar, ByteBuffer byteBuffer) {
        switch (this.f53571b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                xd1 xd1Var = new xd1(byteBuffer.array(), byteBuffer.limit());
                xd1Var.t(12);
                int iF = (xd1Var.f() + xd1Var.i(12)) - 4;
                xd1Var.t(44);
                xd1Var.u(xd1Var.i(12));
                xd1Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (xd1Var.f() < iF) {
                    xd1Var.t(48);
                    int i10 = xd1Var.i(8);
                    xd1Var.t(4);
                    int iF2 = xd1Var.f() + xd1Var.i(12);
                    String str = null;
                    String str2 = null;
                    while (xd1Var.f() < iF2) {
                        int i11 = xd1Var.i(8);
                        int i12 = xd1Var.i(8);
                        int iF3 = xd1Var.f() + i12;
                        if (i11 == 2) {
                            int i13 = xd1Var.i(16);
                            xd1Var.t(8);
                            if (i13 == 3) {
                                while (xd1Var.f() < iF3) {
                                    int i14 = xd1Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    xd1Var.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = xd1Var.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        xd1Var.u(xd1Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            xd1Var.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        xd1Var.q(iF3 * 8);
                    }
                    xd1Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c0(arrayList);
            default:
                return new c0(M(new q(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
