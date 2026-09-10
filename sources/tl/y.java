package tl;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.k3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends zl.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f51548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f51549v = new a(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zl.d f51550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f51555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f51557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q0 f51558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51559k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f51560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f51562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w0 f51563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f51564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f51565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f51566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f51567t;

    static {
        y yVar = new y();
        f51548u = yVar;
        yVar.s();
    }

    public y(x xVar) {
        super(xVar);
        this.f51561n = -1;
        this.f51566s = (byte) -1;
        this.f51567t = -1;
        this.f51550b = xVar.f55044a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51567t;
        if (i10 != -1) {
            return i10;
        }
        int iC = (this.f51551c & 2) == 2 ? k3.c(1, this.f51553e) : 0;
        if ((this.f51551c & 4) == 4) {
            iC += k3.c(2, this.f51554f);
        }
        if ((this.f51551c & 8) == 8) {
            iC += k3.e(3, this.f51555g);
        }
        for (int i11 = 0; i11 < this.f51557i.size(); i11++) {
            iC += k3.e(4, (zl.a) this.f51557i.get(i11));
        }
        if ((this.f51551c & 32) == 32) {
            iC += k3.e(5, this.f51558j);
        }
        for (int i12 = 0; i12 < this.f51562o.size(); i12++) {
            iC += k3.e(6, (zl.a) this.f51562o.get(i12));
        }
        if ((this.f51551c & 16) == 16) {
            iC += k3.c(7, this.f51556h);
        }
        if ((this.f51551c & 64) == 64) {
            iC += k3.c(8, this.f51559k);
        }
        if ((this.f51551c & 1) == 1) {
            iC += k3.c(9, this.f51552d);
        }
        for (int i13 = 0; i13 < this.l.size(); i13++) {
            iC += k3.e(10, (zl.a) this.l.get(i13));
        }
        int iD = 0;
        for (int i14 = 0; i14 < this.f51560m.size(); i14++) {
            iD += k3.d(((Integer) this.f51560m.get(i14)).intValue());
        }
        int iE = iC + iD;
        if (!this.f51560m.isEmpty()) {
            iE = iE + 1 + k3.d(iD);
        }
        this.f51561n = iD;
        if ((this.f51551c & 128) == 128) {
            iE += k3.e(30, this.f51563p);
        }
        int iD2 = 0;
        for (int i15 = 0; i15 < this.f51564q.size(); i15++) {
            iD2 += k3.d(((Integer) this.f51564q.get(i15)).intValue());
        }
        int size = (this.f51564q.size() * 2) + iE + iD2;
        if ((this.f51551c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            size += k3.e(32, this.f51565r);
        }
        int size2 = this.f51550b.size() + m() + size;
        this.f51567t = size2;
        return size2;
    }

    @Override // zl.a
    public final zl.i g() {
        return x.f();
    }

    @Override // zl.u
    public final zl.a getDefaultInstanceForType() {
        return f51548u;
    }

    @Override // zl.a
    public final zl.i h() {
        x xVarF = x.f();
        xVarF.g(this);
        return xVarF;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        v6.c cVar = new v6.c(this);
        if ((this.f51551c & 2) == 2) {
            k3Var.q(1, this.f51553e);
        }
        if ((this.f51551c & 4) == 4) {
            k3Var.q(2, this.f51554f);
        }
        if ((this.f51551c & 8) == 8) {
            k3Var.s(3, this.f51555g);
        }
        for (int i10 = 0; i10 < this.f51557i.size(); i10++) {
            k3Var.s(4, (zl.a) this.f51557i.get(i10));
        }
        if ((this.f51551c & 32) == 32) {
            k3Var.s(5, this.f51558j);
        }
        for (int i11 = 0; i11 < this.f51562o.size(); i11++) {
            k3Var.s(6, (zl.a) this.f51562o.get(i11));
        }
        if ((this.f51551c & 16) == 16) {
            k3Var.q(7, this.f51556h);
        }
        if ((this.f51551c & 64) == 64) {
            k3Var.q(8, this.f51559k);
        }
        if ((this.f51551c & 1) == 1) {
            k3Var.q(9, this.f51552d);
        }
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            k3Var.s(10, (zl.a) this.l.get(i12));
        }
        if (this.f51560m.size() > 0) {
            k3Var.z(90);
            k3Var.z(this.f51561n);
        }
        for (int i13 = 0; i13 < this.f51560m.size(); i13++) {
            k3Var.r(((Integer) this.f51560m.get(i13)).intValue());
        }
        if ((this.f51551c & 128) == 128) {
            k3Var.s(30, this.f51563p);
        }
        for (int i14 = 0; i14 < this.f51564q.size(); i14++) {
            k3Var.q(31, ((Integer) this.f51564q.get(i14)).intValue());
        }
        if ((this.f51551c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            k3Var.s(32, this.f51565r);
        }
        cVar.s(19000, k3Var);
        k3Var.v(this.f51550b);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        byte b10 = this.f51566s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f51551c;
        if ((i10 & 4) != 4) {
            this.f51566s = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8 && !this.f51555g.isInitialized()) {
            this.f51566s = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f51557i.size(); i11++) {
            if (!((v0) this.f51557i.get(i11)).isInitialized()) {
                this.f51566s = (byte) 0;
                return false;
            }
        }
        if ((this.f51551c & 32) == 32 && !this.f51558j.isInitialized()) {
            this.f51566s = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            if (!((q0) this.l.get(i12)).isInitialized()) {
                this.f51566s = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f51562o.size(); i13++) {
            if (!((y0) this.f51562o.get(i13)).isInitialized()) {
                this.f51566s = (byte) 0;
                return false;
            }
        }
        if ((this.f51551c & 128) == 128 && !this.f51563p.isInitialized()) {
            this.f51566s = (byte) 0;
            return false;
        }
        if ((this.f51551c & NotificationCompat.FLAG_LOCAL_ONLY) == 256 && !this.f51565r.isInitialized()) {
            this.f51566s = (byte) 0;
            return false;
        }
        if (l()) {
            this.f51566s = (byte) 1;
            return true;
        }
        this.f51566s = (byte) 0;
        return false;
    }

    public final void s() {
        this.f51552d = 6;
        this.f51553e = 6;
        this.f51554f = 0;
        q0 q0Var = q0.f51409t;
        this.f51555g = q0Var;
        this.f51556h = 0;
        List list = Collections.EMPTY_LIST;
        this.f51557i = list;
        this.f51558j = q0Var;
        this.f51559k = 0;
        this.l = list;
        this.f51560m = list;
        this.f51562o = list;
        this.f51563p = w0.f51519g;
        this.f51564q = list;
        this.f51565r = n.f51359e;
    }

    public y() {
        this.f51561n = -1;
        this.f51566s = (byte) -1;
        this.f51567t = -1;
        this.f51550b = zl.d.f55026a;
    }

    public y(zl.e eVar, zl.g gVar) {
        this.f51561n = -1;
        this.f51566s = (byte) -1;
        this.f51567t = -1;
        s();
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    p0 p0VarU = null;
                    m mVar = null;
                    f fVarL = null;
                    p0 p0VarU2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f51551c |= 2;
                            this.f51553e = eVar.k();
                            continue;
                        case 16:
                            this.f51551c |= 4;
                            this.f51554f = eVar.k();
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                            if ((this.f51551c & 8) == 8) {
                                q0 q0Var = this.f51555g;
                                q0Var.getClass();
                                p0VarU = q0.u(q0Var);
                            }
                            q0 q0Var2 = (q0) eVar.g(q0.f51410u, gVar);
                            this.f51555g = q0Var2;
                            if (p0VarU != null) {
                                p0VarU.g(q0Var2);
                                this.f51555g = p0VarU.e();
                            }
                            this.f51551c |= 8;
                            continue;
                        case 34:
                            int i11 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i11 != 32) {
                                this.f51557i = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.f51557i.add(eVar.g(v0.f51496n, gVar));
                            continue;
                        case 42:
                            if ((this.f51551c & 32) == 32) {
                                q0 q0Var3 = this.f51558j;
                                q0Var3.getClass();
                                p0VarU2 = q0.u(q0Var3);
                            }
                            q0 q0Var4 = (q0) eVar.g(q0.f51410u, gVar);
                            this.f51558j = q0Var4;
                            if (p0VarU2 != null) {
                                p0VarU2.g(q0Var4);
                                this.f51558j = p0VarU2.e();
                            }
                            this.f51551c |= 32;
                            continue;
                        case 50:
                            int i12 = (i10 == true ? 1 : 0) & 1024;
                            i10 = i10;
                            if (i12 != 1024) {
                                this.f51562o = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1024;
                            }
                            this.f51562o.add(eVar.g(y0.f51568m, gVar));
                            continue;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                            this.f51551c |= 16;
                            this.f51556h = eVar.k();
                            continue;
                        case 64:
                            this.f51551c |= 64;
                            this.f51559k = eVar.k();
                            continue;
                        case 72:
                            this.f51551c |= 1;
                            this.f51552d = eVar.k();
                            continue;
                        case 82:
                            int i13 = (i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY;
                            i10 = i10;
                            if (i13 != 256) {
                                this.l = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            this.l.add(eVar.g(q0.f51410u, gVar));
                            continue;
                        case 88:
                            int i14 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i14 != 512) {
                                this.f51560m = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            this.f51560m.add(Integer.valueOf(eVar.k()));
                            continue;
                        case 90:
                            int iD = eVar.d(eVar.k());
                            int i15 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i15 != 512 && eVar.b() > 0) {
                                i10 = i10;
                                this.f51560m = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            i10 = i10;
                            while (eVar.b() > 0) {
                                this.f51560m.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                            continue;
                        case 242:
                            if ((this.f51551c & 128) == 128) {
                                w0 w0Var = this.f51563p;
                                w0Var.getClass();
                                fVarL = w0.l(w0Var);
                            }
                            w0 w0Var2 = (w0) eVar.g(w0.f51520h, gVar);
                            this.f51563p = w0Var2;
                            if (fVarL != null) {
                                fVarL.l(w0Var2);
                                this.f51563p = fVarL.g();
                            }
                            this.f51551c |= 128;
                            continue;
                        case 248:
                            int i16 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i16 != 4096) {
                                this.f51564q = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            this.f51564q.add(Integer.valueOf(eVar.k()));
                            continue;
                        case 250:
                            int iD2 = eVar.d(eVar.k());
                            int i17 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i17 != 4096 && eVar.b() > 0) {
                                i10 = i10;
                                this.f51564q = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            i10 = i10;
                            while (eVar.b() > 0) {
                                this.f51564q.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                            continue;
                        case 258:
                            if ((this.f51551c & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                                n nVar = this.f51565r;
                                nVar.getClass();
                                mVar = new m(0);
                                mVar.f51354d = Collections.EMPTY_LIST;
                                mVar.j(nVar);
                            }
                            n nVar2 = (n) eVar.g(n.f51360f, gVar);
                            this.f51565r = nVar2;
                            if (mVar != null) {
                                mVar.j(nVar2);
                                this.f51565r = mVar.e();
                            }
                            this.f51551c |= NotificationCompat.FLAG_LOCAL_ONLY;
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
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f51557i = Collections.unmodifiableList(this.f51557i);
                }
                if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f51562o = Collections.unmodifiableList(this.f51562o);
                }
                if (((i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f51560m = Collections.unmodifiableList(this.f51560m);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f51564q = Collections.unmodifiableList(this.f51564q);
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51550b = cVar.h();
                }
                p();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 32) == 32) {
            this.f51557i = Collections.unmodifiableList(this.f51557i);
        }
        if (((i10 == true ? 1 : 0) & 1024) == 1024) {
            this.f51562o = Collections.unmodifiableList(this.f51562o);
        }
        if (((i10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) == 256) {
            this.l = Collections.unmodifiableList(this.l);
        }
        if (((i10 == true ? 1 : 0) & 512) == 512) {
            this.f51560m = Collections.unmodifiableList(this.f51560m);
        }
        if (((i10 == true ? 1 : 0) & 4096) == 4096) {
            this.f51564q = Collections.unmodifiableList(this.f51564q);
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51550b = cVar.h();
        }
        p();
    }
}
