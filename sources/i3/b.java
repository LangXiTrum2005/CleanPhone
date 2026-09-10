package i3;

import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.s2;
import eb.d0;
import i1.c0;
import i1.o;
import i1.p;
import java.util.Arrays;
import l1.q;
import m5.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s2 f42843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c7 f42844o;

    @Override // com.google.android.gms.internal.ads.k7
    public final long b(q qVar) {
        byte[] bArr = qVar.f44813a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            qVar.N(4);
            qVar.H();
        }
        int iX = n2.b.x(i10, qVar);
        qVar.M(0);
        return iX;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean c(q qVar, long j10, d0 d0Var) {
        byte[] bArr = qVar.f44813a;
        s2 s2Var = this.f42843n;
        if (s2Var == null) {
            s2 s2Var2 = new s2(bArr, 17, 1);
            this.f42843n = s2Var2;
            o oVarA = s2Var2.c(Arrays.copyOfRange(bArr, 9, qVar.f44815c), null).a();
            oVarA.l = i1.d0.n("audio/ogg");
            d0Var.f39976b = new p(oVarA);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            c7 c7Var = this.f42844o;
            if (c7Var != null) {
                c7Var.f13070a = j10;
                d0Var.f39977c = c7Var;
            }
            ((p) d0Var.f39976b).getClass();
            return false;
        }
        k kVarY = n2.b.y(qVar);
        s2 s2Var3 = new s2(s2Var.f19768a, s2Var.f19769b, s2Var.f19770c, s2Var.f19771d, s2Var.f19772e, s2Var.f19774g, s2Var.f19775h, s2Var.f19777j, kVarY, (c0) s2Var.l);
        this.f42843n = s2Var3;
        c7 c7Var2 = new c7();
        c7Var2.f13072c = s2Var3;
        c7Var2.f13073d = kVarY;
        c7Var2.f13070a = -1L;
        c7Var2.f13071b = -1L;
        this.f42844o = c7Var2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f42843n = null;
            this.f42844o = null;
        }
    }
}
