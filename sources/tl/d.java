package tl;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.k3;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends zl.n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f51163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f51164q = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f51167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f51168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f51169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f51170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f51174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51175k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f51177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51178o;

    static {
        d dVar = new d();
        f51163p = dVar;
        dVar.l();
    }

    public d() {
        this.f51177n = (byte) -1;
        this.f51178o = -1;
        this.f51165a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51178o;
        if (i10 != -1) {
            return i10;
        }
        int iB = (this.f51166b & 1) == 1 ? k3.b(1, this.f51167c.f51141a) : 0;
        if ((this.f51166b & 2) == 2) {
            long j10 = this.f51168d;
            iB += k3.h((j10 >> 63) ^ (j10 << 1)) + k3.i(2);
        }
        if ((this.f51166b & 4) == 4) {
            iB += k3.i(3) + 4;
        }
        if ((this.f51166b & 8) == 8) {
            iB += k3.i(4) + 8;
        }
        if ((this.f51166b & 16) == 16) {
            iB += k3.c(5, this.f51171g);
        }
        if ((this.f51166b & 32) == 32) {
            iB += k3.c(6, this.f51172h);
        }
        if ((this.f51166b & 64) == 64) {
            iB += k3.c(7, this.f51173i);
        }
        if ((this.f51166b & 128) == 128) {
            iB += k3.e(8, this.f51174j);
        }
        for (int i11 = 0; i11 < this.f51175k.size(); i11++) {
            iB += k3.e(9, (zl.a) this.f51175k.get(i11));
        }
        if ((this.f51166b & 512) == 512) {
            iB += k3.c(10, this.f51176m);
        }
        if ((this.f51166b & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            iB += k3.c(11, this.l);
        }
        int size = this.f51165a.size() + iB;
        this.f51178o = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return b.f();
    }

    @Override // zl.a
    public final zl.i h() {
        b bVarF = b.f();
        bVarF.g(this);
        return bVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        if ((this.f51166b & 1) == 1) {
            k3Var.p(1, this.f51167c.f51141a);
        }
        if ((this.f51166b & 2) == 2) {
            long j10 = this.f51168d;
            k3Var.B(2, 0);
            k3Var.A((j10 >> 63) ^ (j10 << 1));
        }
        if ((this.f51166b & 4) == 4) {
            float f10 = this.f51169e;
            k3Var.B(3, 5);
            k3Var.x(Float.floatToRawIntBits(f10));
        }
        if ((this.f51166b & 8) == 8) {
            double d10 = this.f51170f;
            k3Var.B(4, 1);
            k3Var.y(Double.doubleToRawLongBits(d10));
        }
        if ((this.f51166b & 16) == 16) {
            k3Var.q(5, this.f51171g);
        }
        if ((this.f51166b & 32) == 32) {
            k3Var.q(6, this.f51172h);
        }
        if ((this.f51166b & 64) == 64) {
            k3Var.q(7, this.f51173i);
        }
        if ((this.f51166b & 128) == 128) {
            k3Var.s(8, this.f51174j);
        }
        for (int i10 = 0; i10 < this.f51175k.size(); i10++) {
            k3Var.s(9, (zl.a) this.f51175k.get(i10));
        }
        if ((this.f51166b & 512) == 512) {
            k3Var.q(10, this.f51176m);
        }
        if ((this.f51166b & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            k3Var.q(11, this.l);
        }
        k3Var.v(this.f51165a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51177n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51166b & 128) == 128 && !this.f51174j.isInitialized()) {
            this.f51177n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51175k.size(); i10++) {
            if (!((d) this.f51175k.get(i10)).isInitialized()) {
                this.f51177n = (byte) 0;
                return false;
            }
        }
        this.f51177n = (byte) 1;
        return true;
    }

    public final void l() {
        this.f51167c = c.BYTE;
        this.f51168d = 0L;
        this.f51169e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f51170f = 0.0d;
        this.f51171g = 0;
        this.f51172h = 0;
        this.f51173i = 0;
        this.f51174j = g.f51228g;
        this.f51175k = Collections.EMPTY_LIST;
        this.l = 0;
        this.f51176m = 0;
    }

    public d(b bVar) {
        this.f51177n = (byte) -1;
        this.f51178o = -1;
        this.f51165a = bVar.f55044a;
    }

    public d(zl.e eVar, zl.g gVar) {
        f fVar;
        this.f51177n = (byte) -1;
        this.f51178o = -1;
        l();
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = eVar.k();
                            c cVarA = c.a(iK);
                            if (cVarA == null) {
                                k3VarL.z(iN);
                                k3VarL.z(iK);
                            } else {
                                this.f51166b |= 1;
                                this.f51167c = cVarA;
                                continue;
                            }
                            break;
                        case 16:
                            this.f51166b |= 2;
                            long jL = eVar.l();
                            this.f51168d = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                            this.f51166b |= 4;
                            this.f51169e = Float.intBitsToFloat(eVar.i());
                            continue;
                        case 33:
                            this.f51166b |= 8;
                            this.f51170f = Double.longBitsToDouble(eVar.j());
                            continue;
                        case 40:
                            this.f51166b |= 16;
                            this.f51171g = eVar.k();
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                            this.f51166b |= 32;
                            this.f51172h = eVar.k();
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                            this.f51166b |= 64;
                            this.f51173i = eVar.k();
                            continue;
                        case 66:
                            if ((this.f51166b & 128) == 128) {
                                g gVar2 = this.f51174j;
                                gVar2.getClass();
                                fVar = new f(0);
                                fVar.f51212d = Collections.EMPTY_LIST;
                                fVar.k(gVar2);
                            } else {
                                fVar = null;
                            }
                            g gVar3 = (g) eVar.g(g.f51229h, gVar);
                            this.f51174j = gVar3;
                            if (fVar != null) {
                                fVar.k(gVar3);
                                this.f51174j = fVar.f();
                            }
                            this.f51166b |= 128;
                            continue;
                        case 74:
                            if ((c4 & 256) != 256) {
                                this.f51175k = new ArrayList();
                                c4 = 256;
                            }
                            this.f51175k.add(eVar.g(f51164q, gVar));
                            continue;
                        case 80:
                            this.f51166b |= 512;
                            this.f51176m = eVar.k();
                            continue;
                        case 88:
                            this.f51166b |= NotificationCompat.FLAG_LOCAL_ONLY;
                            this.l = eVar.k();
                            continue;
                        default:
                            if (!eVar.q(iN, k3VarL)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (zl.q e10) {
                    e10.f55076a = this;
                    throw e10;
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if ((c4 & 256) == 256) {
                    this.f51175k = Collections.unmodifiableList(this.f51175k);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51165a = cVar.h();
                }
                throw th2;
            }
        }
        if ((c4 & 256) == 256) {
            this.f51175k = Collections.unmodifiableList(this.f51175k);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51165a = cVar.h();
        }
    }
}
