package g2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import i1.p;
import n1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f41410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f41411k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f41412m;

    public l(n1.h hVar, n1.k kVar, p pVar, int i10, Object obj, e eVar) {
        super(hVar, kVar, 2, pVar, i10, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f41410j = eVar;
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.f41412m = true;
    }

    @Override // j2.j
    public final void load() {
        if (this.l == 0) {
            this.f41410j.b(this.f41411k, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            n1.k kVarA = this.f41367b.a(this.l);
            y yVar = this.f41374i;
            n2.h hVar = new n2.h(yVar, kVarA.f46373e, yVar.C(kVarA));
            while (!this.f41412m) {
                try {
                    int iB = this.f41410j.f41356a.b(hVar, e.f41355k);
                    boolean z10 = false;
                    go.k.t(iB != 1);
                    if (iB == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.l = hVar.f46466d - this.f41367b.f46373e;
                    this.f41410j.a();
                    throw th2;
                }
            }
            this.l = hVar.f46466d - this.f41367b.f46373e;
            this.f41410j.a();
            com.google.android.gms.internal.auth.i.e(this.f41374i);
        } catch (Throwable th3) {
            com.google.android.gms.internal.auth.i.e(this.f41374i);
            throw th3;
        }
    }
}
