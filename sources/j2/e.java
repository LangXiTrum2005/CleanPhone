package j2;

import com.google.android.gms.internal.ads.c7;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43636d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43633a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43634b = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43637e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a[] f43638f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.f43636d + 1;
            this.f43636d = i10;
            int i11 = this.f43637e;
            if (i11 > 0) {
                a[] aVarArr = this.f43638f;
                int i12 = i11 - 1;
                this.f43637e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f43638f[this.f43637e] = null;
            } else {
                a aVar2 = new a(new byte[this.f43634b], 0);
                a[] aVarArr2 = this.f43638f;
                if (i10 > aVarArr2.length) {
                    this.f43638f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(c7 c7Var) {
        while (c7Var != null) {
            try {
                a[] aVarArr = this.f43638f;
                int i10 = this.f43637e;
                this.f43637e = i10 + 1;
                a aVar = (a) c7Var.f13072c;
                aVar.getClass();
                aVarArr[i10] = aVar;
                this.f43636d--;
                c7Var = (c7) c7Var.f13073d;
                if (c7Var == null || ((a) c7Var.f13072c) == null) {
                    c7Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i10) {
        boolean z10 = i10 < this.f43635c;
        this.f43635c = i10;
        if (z10) {
            d();
        }
    }

    public final synchronized void d() {
        int iMax = Math.max(0, y.g(this.f43635c, this.f43634b) - this.f43636d);
        int i10 = this.f43637e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f43638f, iMax, i10, (Object) null);
        this.f43637e = iMax;
    }
}
