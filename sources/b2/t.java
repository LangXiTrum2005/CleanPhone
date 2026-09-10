package b2;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.a1;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements j2.h, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5398b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f5397a = i10;
        this.f5398b = obj;
    }

    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        switch (this.f5397a) {
            case 0:
                break;
            case 1:
                break;
            default:
                ((s1.f) this.f5398b).z((j2.q) jVar, j10, j11);
                break;
        }
    }

    public void c(z zVar) {
        x xVar = (x) this.f5398b;
        if (!(zVar instanceof a0) || xVar.f5432v) {
            xVar.l = zVar;
        } else {
            x.h(xVar);
        }
    }

    @Override // j2.h
    public final com.google.android.gms.internal.ads.a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        switch (this.f5397a) {
            case 0:
                f fVar = (f) jVar;
                x xVar = (x) this.f5398b;
                if (!xVar.f5429s) {
                    xVar.f5422k = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i11 = xVar.f5431u;
                    xVar.f5431u = i11 + 1;
                    if (i11 < 3) {
                        return j2.m.f43671d;
                    }
                } else {
                    xVar.l = new z(fVar.f5253b.f5243b.toString(), iOException);
                }
                return j2.m.f43672e;
            case 1:
                ((s1.f) ((rb.c) this.f5398b).f49529b).A(iOException);
                return j2.m.f43672e;
            default:
                j2.q qVar = (j2.q) jVar;
                s1.f fVar2 = (s1.f) this.f5398b;
                f2.i0 i0Var = fVar2.f50021q;
                long j12 = qVar.f43678a;
                n1.k kVar = qVar.f43679b;
                n1.y yVar = qVar.f43681d;
                i0Var.g(new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b), qVar.f43680c, iOException, true);
                fVar2.f50017m.getClass();
                fVar2.A(iOException);
                return j2.m.f43672e;
        }
    }

    public void e(long j10, oa.j0 j0Var) {
        f fVar;
        ArrayList arrayList = new ArrayList(j0Var.size());
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            String path = ((m0) j0Var.get(i10)).f5332c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i11 = 0; i11 < ((x) this.f5398b).f5417f.size(); i11++) {
            if (!arrayList.contains(((u) ((x) this.f5398b).f5417f.get(i11)).f5400b.f5253b.f5243b.getPath())) {
                b0 b0Var = (b0) ((x) this.f5398b).f5418g.f3698b;
                b0Var.f5228m = false;
                b0Var.x();
                if (((x) this.f5398b).i()) {
                    x xVar = (x) this.f5398b;
                    xVar.f5427q = true;
                    xVar.f5424n = C.TIME_UNSET;
                    xVar.f5423m = C.TIME_UNSET;
                    xVar.f5425o = C.TIME_UNSET;
                }
            }
        }
        for (int i12 = 0; i12 < j0Var.size(); i12++) {
            m0 m0Var = (m0) j0Var.get(i12);
            x xVar2 = (x) this.f5398b;
            Uri uri = m0Var.f5332c;
            ArrayList arrayList2 = xVar2.f5416e;
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    fVar = null;
                    break;
                }
                if (!((v) arrayList2.get(i13)).f5406d) {
                    u uVar = ((v) arrayList2.get(i13)).f5403a;
                    if (uVar.f5400b.f5253b.f5243b.equals(uri)) {
                        fVar = uVar.f5400b;
                        break;
                    }
                }
                i13++;
            }
            if (fVar != null) {
                long j11 = m0Var.f5330a;
                if (j11 != C.TIME_UNSET) {
                    g gVar = fVar.f5259h;
                    gVar.getClass();
                    if (!gVar.f5273h) {
                        fVar.f5259h.f5274i = j11;
                    }
                }
                int i14 = m0Var.f5331b;
                g gVar2 = fVar.f5259h;
                gVar2.getClass();
                if (!gVar2.f5273h) {
                    fVar.f5259h.f5275j = i14;
                }
                if (((x) this.f5398b).i()) {
                    x xVar3 = (x) this.f5398b;
                    if (xVar3.f5424n == xVar3.f5423m) {
                        long j12 = m0Var.f5330a;
                        fVar.f5262k = j10;
                        fVar.l = j12;
                    }
                }
            }
        }
        if (!((x) this.f5398b).i()) {
            x xVar4 = (x) this.f5398b;
            long j13 = xVar4.f5425o;
            if (j13 == C.TIME_UNSET || !xVar4.f5432v) {
                return;
            }
            xVar4.seekToUs(j13);
            ((x) this.f5398b).f5425o = C.TIME_UNSET;
            return;
        }
        x xVar5 = (x) this.f5398b;
        long j14 = xVar5.f5424n;
        long j15 = xVar5.f5423m;
        if (j14 == j15) {
            xVar5.f5424n = C.TIME_UNSET;
            xVar5.f5423m = C.TIME_UNSET;
        } else {
            xVar5.f5424n = C.TIME_UNSET;
            xVar5.seekToUs(j15);
        }
    }

    public void f(String str, IOException iOException) {
        ((x) this.f5398b).f5422k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // f2.a1
    public void h() {
        x xVar = (x) this.f5398b;
        xVar.f5413b.post(new s(xVar, 1));
    }

    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        boolean z10;
        switch (this.f5397a) {
            case 0:
                f fVar = (f) jVar;
                x xVar = (x) this.f5398b;
                long bufferedPositionUs = xVar.getBufferedPositionUs();
                ArrayList arrayList = xVar.f5416e;
                if (bufferedPositionUs == 0) {
                    if (xVar.f5432v) {
                        return;
                    }
                    x.h(xVar);
                    return;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v vVar = (v) arrayList.get(i10);
                    if (vVar.f5403a.f5400b == fVar) {
                        vVar.a();
                        xVar.f5415d.f5383o = 1;
                        return;
                    }
                }
                xVar.f5415d.f5383o = 1;
                return;
            case 1:
                rb.c cVar = (rb.c) this.f5398b;
                synchronized (k2.b.f44265b) {
                    z10 = k2.b.f44266c;
                    break;
                }
                if (z10) {
                    cVar.q();
                    return;
                } else {
                    ((s1.f) cVar.f49529b).A(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                j2.q qVar = (j2.q) jVar;
                s1.f fVar2 = (s1.f) this.f5398b;
                long j12 = qVar.f43678a;
                n1.k kVar = qVar.f43679b;
                n1.y yVar = qVar.f43681d;
                f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
                fVar2.f50017m.getClass();
                fVar2.f50021q.d(uVar, qVar.f43680c);
                fVar2.K = ((Long) qVar.f43683f).longValue() - j10;
                fVar2.B(true);
                return;
        }
    }

    private final void a(j2.j jVar, long j10, long j11, boolean z10) {
    }
}
