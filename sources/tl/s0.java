package tl;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends zl.k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s0 f51449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f51450p = new a(18);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f51455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f51456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q0 f51458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f51460k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f51461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51462n;

    static {
        s0 s0Var = new s0();
        f51449o = s0Var;
        s0Var.f51453d = 6;
        s0Var.f51454e = 0;
        List list = Collections.EMPTY_LIST;
        s0Var.f51455f = list;
        q0 q0Var = q0.f51409t;
        s0Var.f51456g = q0Var;
        s0Var.f51457h = 0;
        s0Var.f51458i = q0Var;
        s0Var.f51459j = 0;
        s0Var.f51460k = list;
        s0Var.l = list;
    }

    public s0(r0 r0Var) {
        super(r0Var);
        this.f51461m = (byte) -1;
        this.f51462n = -1;
        this.f51451b = r0Var.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51462n;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51452c & 1) == 1 ? k3.c(1, this.f51453d) : 0;
        if ((this.f51452c & 2) == 2) {
            iC += k3.c(2, this.f51454e);
        }
        for (int i11 = 0; i11 < this.f51455f.size(); i11++) {
            iC += k3.e(3, (zl.a) this.f51455f.get(i11));
        }
        if ((this.f51452c & 4) == 4) {
            iC += k3.e(4, this.f51456g);
        }
        if ((this.f51452c & 8) == 8) {
            iC += k3.c(5, this.f51457h);
        }
        if ((this.f51452c & 16) == 16) {
            iC += k3.e(6, this.f51458i);
        }
        if ((this.f51452c & 32) == 32) {
            iC += k3.c(7, this.f51459j);
        }
        for (int i12 = 0; i12 < this.f51460k.size(); i12++) {
            iC += k3.e(8, (zl.a) this.f51460k.get(i12));
        }
        int iD = 0;
        for (int i13 = 0; i13 < this.l.size(); i13++) {
            iD += k3.d(((Integer) this.l.get(i13)).intValue());
        }
        int size = this.f51451b.size() + m() + (this.l.size() * 2) + iC + iD;
        this.f51462n = size;
        return size;
    }

    @Override // zl.a
    public final zl.i g() {
        return r0.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51449o;
    }

    @Override // zl.a
    public final zl.i h() {
        r0 r0VarF = r0.f();
        r0VarF.g(this);
        return r0VarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51452c & 1) == 1) {
            k3Var.q(1, this.f51453d);
        }
        if ((this.f51452c & 2) == 2) {
            k3Var.q(2, this.f51454e);
        }
        for (int i10 = 0; i10 < this.f51455f.size(); i10++) {
            k3Var.s(3, (zl.a) this.f51455f.get(i10));
        }
        if ((this.f51452c & 4) == 4) {
            k3Var.s(4, this.f51456g);
        }
        if ((this.f51452c & 8) == 8) {
            k3Var.q(5, this.f51457h);
        }
        if ((this.f51452c & 16) == 16) {
            k3Var.s(6, this.f51458i);
        }
        if ((this.f51452c & 32) == 32) {
            k3Var.q(7, this.f51459j);
        }
        for (int i11 = 0; i11 < this.f51460k.size(); i11++) {
            k3Var.s(8, (zl.a) this.f51460k.get(i11));
        }
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            k3Var.q(31, ((Integer) this.l.get(i12)).intValue());
        }
        cVar.s(200, k3Var);
        k3Var.v(this.f51451b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51461m;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f51452c & 2) != 2) {
            this.f51461m = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f51455f.size(); i10++) {
            if (!((v0) this.f51455f.get(i10)).isInitialized()) {
                this.f51461m = (byte) 0;
                return false;
            }
        }
        if ((this.f51452c & 4) == 4 && !this.f51456g.isInitialized()) {
            this.f51461m = (byte) 0;
            return false;
        }
        if ((this.f51452c & 16) == 16 && !this.f51458i.isInitialized()) {
            this.f51461m = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f51460k.size(); i11++) {
            if (!((g) this.f51460k.get(i11)).isInitialized()) {
                this.f51461m = (byte) 0;
                return false;
            }
        }
        if (l()) {
            this.f51461m = (byte) 1;
            return true;
        }
        this.f51461m = (byte) 0;
        return false;
    }

    public s0() {
        this.f51461m = (byte) -1;
        this.f51462n = -1;
        this.f51451b = zl.d.f55026a;
    }

    public s0(zl.e eVar, zl.g gVar) {
        this.f51461m = (byte) -1;
        this.f51462n = -1;
        this.f51453d = 6;
        boolean z10 = false;
        this.f51454e = 0;
        List list = Collections.EMPTY_LIST;
        this.f51455f = list;
        q0 q0Var = q0.f51409t;
        this.f51456g = q0Var;
        this.f51457h = 0;
        this.f51458i = q0Var;
        this.f51459j = 0;
        this.f51460k = list;
        this.l = list;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        p0 p0VarU = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.f51452c |= 1;
                                this.f51453d = eVar.k();
                                continue;
                            case 16:
                                this.f51452c |= 2;
                                this.f51454e = eVar.k();
                                continue;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                if ((i10 & 4) != 4) {
                                    this.f51455f = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f51455f.add(eVar.g(v0.f51496n, gVar));
                                continue;
                            case 34:
                                if ((this.f51452c & 4) == 4) {
                                    q0 q0Var2 = this.f51456g;
                                    q0Var2.getClass();
                                    p0VarU = q0.u(q0Var2);
                                }
                                q0 q0Var3 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51456g = q0Var3;
                                if (p0VarU != null) {
                                    p0VarU.g(q0Var3);
                                    this.f51456g = p0VarU.e();
                                }
                                this.f51452c |= 4;
                                continue;
                            case 40:
                                this.f51452c |= 8;
                                this.f51457h = eVar.k();
                                continue;
                            case 50:
                                if ((this.f51452c & 16) == 16) {
                                    q0 q0Var4 = this.f51458i;
                                    q0Var4.getClass();
                                    p0VarU = q0.u(q0Var4);
                                }
                                q0 q0Var5 = (q0) eVar.g(q0.f51410u, gVar);
                                this.f51458i = q0Var5;
                                if (p0VarU != null) {
                                    p0VarU.g(q0Var5);
                                    this.f51458i = p0VarU.e();
                                }
                                this.f51452c |= 16;
                                continue;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                this.f51452c |= 32;
                                this.f51459j = eVar.k();
                                continue;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f51460k = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f51460k.add(eVar.g(g.f51229h, gVar));
                                continue;
                            case 248:
                                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 256) {
                                    this.l = new ArrayList();
                                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                this.l.add(Integer.valueOf(eVar.k()));
                                continue;
                            case 250:
                                int iD = eVar.d(eVar.k());
                                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 256 && eVar.b() > 0) {
                                    this.l = new ArrayList();
                                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                while (eVar.b() > 0) {
                                    this.l.add(Integer.valueOf(eVar.k()));
                                }
                                eVar.c(iD);
                                continue;
                            default:
                                if (!q(eVar, k3VarL, gVar, iN)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (zl.q e10) {
                        e10.f55076a = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if ((i10 & 4) == 4) {
                    this.f51455f = Collections.unmodifiableList(this.f51455f);
                }
                if ((i10 & 128) == 128) {
                    this.f51460k = Collections.unmodifiableList(this.f51460k);
                }
                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51451b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if ((i10 & 4) == 4) {
            this.f51455f = Collections.unmodifiableList(this.f51455f);
        }
        if ((i10 & 128) == 128) {
            this.f51460k = Collections.unmodifiableList(this.f51460k);
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.l = Collections.unmodifiableList(this.l);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51451b = cVar.h();
        }
        p();
    }
}
