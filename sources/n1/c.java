package n1;

import android.os.SystemClock;
import java.util.ArrayList;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f46349b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f46351d;

    public c(boolean z10) {
        this.f46348a = z10;
    }

    public final void b(int i10) {
        k kVar = this.f46351d;
        String str = l1.y.f44830a;
        for (int i11 = 0; i11 < this.f46350c; i11++) {
            z zVar = (z) this.f46349b.get(i11);
            boolean z10 = this.f46348a;
            j2.g gVar = (j2.g) zVar;
            synchronized (gVar) {
                n1 n1Var = j2.g.f43640p;
                if (z10 && (kVar.f46376h & 8) != 8) {
                    gVar.f43655i += (long) i10;
                }
            }
        }
    }

    @Override // n1.h
    public final void c(z zVar) {
        zVar.getClass();
        ArrayList arrayList = this.f46349b;
        if (arrayList.contains(zVar)) {
            return;
        }
        arrayList.add(zVar);
        this.f46350c++;
    }

    public final void d() {
        k kVar = this.f46351d;
        String str = l1.y.f44830a;
        for (int i10 = 0; i10 < this.f46350c; i10++) {
            z zVar = (z) this.f46349b.get(i10);
            boolean z10 = this.f46348a;
            j2.g gVar = (j2.g) zVar;
            synchronized (gVar) {
                try {
                    n1 n1Var = j2.g.f43640p;
                    if (z10 && (kVar.f46376h & 8) != 8) {
                        go.k.t(gVar.f43653g > 0);
                        gVar.f43650d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (jElapsedRealtime - gVar.f43654h);
                        gVar.f43656j += (long) i11;
                        long j10 = gVar.f43657k;
                        long j11 = gVar.f43655i;
                        gVar.f43657k = j10 + j11;
                        if (i11 > 0) {
                            gVar.f43652f.a((int) Math.sqrt(j11), (j11 * 8000.0f) / i11);
                            if (gVar.f43656j >= 2000 || gVar.f43657k >= 524288) {
                                gVar.l = (long) gVar.f43652f.b();
                            }
                            gVar.b(i11, gVar.f43655i, gVar.l);
                            gVar.f43654h = jElapsedRealtime;
                            gVar.f43655i = 0L;
                        }
                        gVar.f43653g--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f46351d = null;
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f46350c; i10++) {
            ((z) this.f46349b.get(i10)).getClass();
        }
    }

    public final void g(k kVar) {
        this.f46351d = kVar;
        for (int i10 = 0; i10 < this.f46350c; i10++) {
            z zVar = (z) this.f46349b.get(i10);
            boolean z10 = this.f46348a;
            j2.g gVar = (j2.g) zVar;
            synchronized (gVar) {
                try {
                    n1 n1Var = j2.g.f43640p;
                    if (z10 && (kVar.f46376h & 8) != 8) {
                        if (gVar.f43653g == 0) {
                            gVar.f43650d.getClass();
                            gVar.f43654h = SystemClock.elapsedRealtime();
                        }
                        gVar.f43653g++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
