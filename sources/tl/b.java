package tl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends zl.i implements zl.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f51107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f51109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f51110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f51114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51115k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51116m;

    public static b f() {
        b bVar = new b();
        bVar.f51107c = c.BYTE;
        bVar.f51114j = g.f51228g;
        bVar.f51115k = Collections.EMPTY_LIST;
        return bVar;
    }

    @Override // zl.i
    public final zl.a a() {
        d dVarE = e();
        if (dVarE.isInitialized()) {
            return dVarE;
        }
        throw new aa.b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        d dVar = null;
        try {
            try {
                d.f51164q.getClass();
                g(new d(eVar, gVar));
                return this;
            } catch (zl.q e10) {
                d dVar2 = (d) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    dVar = dVar2;
                    if (dVar != null) {
                        g(dVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (dVar != null) {
                g(dVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(zl.n nVar) {
        g((d) nVar);
        return this;
    }

    public final Object clone() {
        b bVarF = f();
        bVarF.g(e());
        return bVarF;
    }

    public final d e() {
        d dVar = new d(this);
        int i10 = this.f51106b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        dVar.f51167c = this.f51107c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        dVar.f51168d = this.f51108d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        dVar.f51169e = this.f51109e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        dVar.f51170f = this.f51110f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        dVar.f51171g = this.f51111g;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        dVar.f51172h = this.f51112h;
        if ((i10 & 64) == 64) {
            i11 |= 64;
        }
        dVar.f51173i = this.f51113i;
        if ((i10 & 128) == 128) {
            i11 |= 128;
        }
        dVar.f51174j = this.f51114j;
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.f51115k = Collections.unmodifiableList(this.f51115k);
            this.f51106b &= -257;
        }
        dVar.f51175k = this.f51115k;
        if ((i10 & 512) == 512) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        dVar.l = this.l;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        dVar.f51176m = this.f51116m;
        dVar.f51166b = i11;
        return dVar;
    }

    public final void g(d dVar) {
        g gVar;
        if (dVar == d.f51163p) {
            return;
        }
        if ((dVar.f51166b & 1) == 1) {
            c cVar = dVar.f51167c;
            cVar.getClass();
            this.f51106b = 1 | this.f51106b;
            this.f51107c = cVar;
        }
        int i10 = dVar.f51166b;
        if ((i10 & 2) == 2) {
            long j10 = dVar.f51168d;
            this.f51106b |= 2;
            this.f51108d = j10;
        }
        if ((i10 & 4) == 4) {
            float f10 = dVar.f51169e;
            this.f51106b = 4 | this.f51106b;
            this.f51109e = f10;
        }
        if ((i10 & 8) == 8) {
            double d10 = dVar.f51170f;
            this.f51106b |= 8;
            this.f51110f = d10;
        }
        if ((i10 & 16) == 16) {
            int i11 = dVar.f51171g;
            this.f51106b = 16 | this.f51106b;
            this.f51111g = i11;
        }
        if ((i10 & 32) == 32) {
            int i12 = dVar.f51172h;
            this.f51106b = 32 | this.f51106b;
            this.f51112h = i12;
        }
        if ((i10 & 64) == 64) {
            int i13 = dVar.f51173i;
            this.f51106b = 64 | this.f51106b;
            this.f51113i = i13;
        }
        if ((i10 & 128) == 128) {
            g gVar2 = dVar.f51174j;
            if ((this.f51106b & 128) != 128 || (gVar = this.f51114j) == g.f51228g) {
                this.f51114j = gVar2;
            } else {
                f fVar = new f(0);
                fVar.f51212d = Collections.EMPTY_LIST;
                fVar.k(gVar);
                fVar.k(gVar2);
                this.f51114j = fVar.f();
            }
            this.f51106b |= 128;
        }
        if (!dVar.f51175k.isEmpty()) {
            if (this.f51115k.isEmpty()) {
                this.f51115k = dVar.f51175k;
                this.f51106b &= -257;
            } else {
                if ((this.f51106b & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                    this.f51115k = new ArrayList(this.f51115k);
                    this.f51106b |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                this.f51115k.addAll(dVar.f51175k);
            }
        }
        int i14 = dVar.f51166b;
        if ((i14 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            int i15 = dVar.l;
            this.f51106b |= 512;
            this.l = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = dVar.f51176m;
            this.f51106b |= 1024;
            this.f51116m = i16;
        }
        this.f55044a = this.f55044a.h(dVar.f51165a);
    }
}
