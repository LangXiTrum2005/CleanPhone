package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.ads.at1;
import com.google.android.gms.internal.ads.ay0;
import com.google.android.gms.internal.ads.bu1;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.cs1;
import com.google.android.gms.internal.ads.dt1;
import com.google.android.gms.internal.ads.et1;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.jt1;
import com.google.android.gms.internal.ads.ks1;
import com.google.android.gms.internal.ads.lt1;
import com.google.android.gms.internal.ads.qu1;
import com.google.android.gms.internal.ads.ss1;
import com.google.android.gms.internal.ads.ts1;
import com.google.android.gms.internal.ads.uu0;
import com.google.android.gms.internal.ads.vt1;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.o2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.google.android.gms.internal.ads.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4137e;

    public n() {
        this.f4133a = 1;
        this.f4136d = 0;
        this.f4137e = new com.google.android.gms.internal.ads.t[100];
    }

    public static final void N0(int i10) throws et1 {
        if ((i10 & 3) != 0) {
            throw new et1("Failed to parse the message.");
        }
    }

    public static final void O0(int i10) throws com.google.android.gms.internal.measurement.u1 {
        if ((i10 & 3) != 0) {
            throw new com.google.android.gms.internal.measurement.u1("Failed to parse the message.");
        }
    }

    public static final void P0(int i10) throws et1 {
        if ((i10 & 7) != 0) {
            throw new et1("Failed to parse the message.");
        }
    }

    public static final void Q0(int i10) throws com.google.android.gms.internal.measurement.u1 {
        if ((i10 & 7) != 0) {
            throw new com.google.android.gms.internal.measurement.u1("Failed to parse the message.");
        }
    }

    public static void V(int i10) throws g0 {
        if ((i10 & 3) != 0) {
            throw new g0("Failed to parse the message.");
        }
    }

    public static void W(int i10) throws com.google.crypto.tink.shaded.protobuf.d0 {
        if ((i10 & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.d0.k();
        }
    }

    public static void X(int i10) throws g0 {
        if ((i10 & 7) != 0) {
            throw new g0("Failed to parse the message.");
        }
    }

    public static void Y(int i10) throws com.google.crypto.tink.shaded.protobuf.d0 {
        if ((i10 & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.d0.k();
        }
    }

    public void A(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Integer.valueOf(mVar.q()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Integer.valueOf(mVar.q()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void A0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    j1Var.n(fs1Var.X());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                j1Var.n(fs1Var.X());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Integer.valueOf(fs1Var.X()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.X()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void B(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Integer.valueOf(mVar.q()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Integer.valueOf(mVar.q()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(mVar.q());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            yVar.addInt(mVar.q());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void B0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof jt1) {
            jt1 jt1Var = (jt1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    jt1Var.m(fs1Var.Y());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                jt1Var.m(fs1Var.Y());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Long.valueOf(fs1Var.Y()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Long.valueOf(fs1Var.Y()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void C(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Long.valueOf(mVar.r()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Long.valueOf(mVar.r()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void C0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.y1) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    y1Var.n(fs1Var.Z());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                y1Var.n(fs1Var.Z());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Long.valueOf(fs1Var.Z()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Long.valueOf(fs1Var.Z()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void D(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.i0)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Long.valueOf(mVar.r()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Long.valueOf(mVar.r()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = (com.google.crypto.tink.shaded.protobuf.i0) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(mVar.r());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            i0Var.addLong(mVar.r());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void D0(lt1 lt1Var, ay0 ay0Var, ks1 ks1Var) {
        int i10;
        int i11;
        F0(2);
        fs1 fs1Var = (fs1) this.f4137e;
        int iH = fs1Var.h(fs1Var.P());
        Object obj = ay0Var.f12539d;
        Object objK0 = "";
        Object objK1 = obj;
        while (true) {
            try {
                int iR0 = R0();
                if (iR0 == Integer.MAX_VALUE || fs1Var.k()) {
                    break;
                }
                boolean zC = false;
                if (iR0 == 1) {
                    objK0 = K0((qu1) ay0Var.f12537b, null, null);
                } else if (iR0 != 2) {
                    try {
                        if (!((fs1Var.k() || (i11 = this.f4134b) == this.f4135c) ? false : fs1Var.C(i11))) {
                            throw new et1("Unable to parse map entry.");
                        }
                    } catch (dt1 e10) {
                        if (!fs1Var.k() && (i10 = this.f4134b) != this.f4135c) {
                            zC = fs1Var.C(i10);
                        }
                        if (!zC) {
                            throw new et1("Unable to parse map entry.", e10);
                        }
                    }
                } else {
                    objK1 = K0((qu1) ay0Var.f12538c, obj.getClass(), ks1Var);
                }
            } catch (Throwable th2) {
                fs1Var.i(iH);
                throw th2;
            }
        }
        lt1Var.put(objK0, objK1);
        fs1Var.i(iH);
    }

    public void E(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 2) {
            int iZ = mVar.z();
            V(iZ);
            int iD = mVar.d() + iZ;
            do {
                d0Var.add(Integer.valueOf(mVar.s()));
            } while (mVar.d() < iD);
            return;
        }
        if (i10 != 5) {
            throw g0.g();
        }
        do {
            d0Var.add(Integer.valueOf(mVar.s()));
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void E0(a2 a2Var, g9.k kVar, com.google.android.gms.internal.measurement.z0 z0Var) {
        int i10;
        int i11;
        F0(2);
        fs1 fs1Var = (fs1) this.f4137e;
        int iJ = fs1Var.j(fs1Var.R());
        Object obj = kVar.f41772d;
        Object objL0 = "";
        Object objL1 = obj;
        while (true) {
            try {
                int iR0 = R0();
                if (iR0 == Integer.MAX_VALUE || fs1Var.o()) {
                    break;
                }
                boolean zC = false;
                if (iR0 == 1) {
                    objL0 = L0((c3) kVar.f41770b, null, null);
                } else if (iR0 != 2) {
                    try {
                        if (!((fs1Var.o() || (i11 = this.f4134b) == this.f4135c) ? false : fs1Var.C(i11))) {
                            throw new com.google.android.gms.internal.measurement.u1("Unable to parse map entry.");
                        }
                    } catch (com.google.android.gms.internal.measurement.t1 e10) {
                        if (!fs1Var.o() && (i10 = this.f4134b) != this.f4135c) {
                            zC = fs1Var.C(i10);
                        }
                        if (!zC) {
                            throw new com.google.android.gms.internal.measurement.u1("Unable to parse map entry.", e10);
                        }
                    }
                } else {
                    objL1 = L0((c3) kVar.f41771c, obj.getClass(), z0Var);
                }
            } catch (Throwable th2) {
                fs1Var.m(iJ);
                throw th2;
            }
        }
        a2Var.put(objL0, objL1);
        fs1Var.m(iJ);
    }

    public void F(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iZ = mVar.z();
                W(iZ);
                int iD = mVar.d() + iZ;
                do {
                    a0Var.add(Integer.valueOf(mVar.s()));
                } while (mVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            do {
                a0Var.add(Integer.valueOf(mVar.s()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 2) {
            int iZ2 = mVar.z();
            W(iZ2);
            int iD2 = mVar.d() + iZ2;
            do {
                yVar.addInt(mVar.s());
            } while (mVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        do {
            yVar.addInt(mVar.s());
            if (mVar.e()) {
                return;
            } else {
                iY2 = mVar.y();
            }
        } while (iY2 == this.f4134b);
        this.f4136d = iY2;
    }

    public void F0(int i10) {
        switch (this.f4133a) {
            case 2:
                if ((this.f4134b & 7) != i10) {
                    throw new dt1();
                }
                return;
            default:
                if ((this.f4134b & 7) != i10) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                return;
        }
    }

    public void G(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 1) {
            do {
                d0Var.add(Long.valueOf(mVar.t()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iZ = mVar.z();
        X(iZ);
        int iD = mVar.d() + iZ;
        do {
            d0Var.add(Long.valueOf(mVar.t()));
        } while (mVar.d() < iD);
    }

    public void G0(Object obj, bu1 bu1Var, ks1 ks1Var) throws et1 {
        fs1 fs1Var = (fs1) this.f4137e;
        int iP = fs1Var.P();
        if (fs1Var.f14523a + fs1Var.f14524b >= 100) {
            throw new et1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = fs1Var.h(iP);
        fs1Var.f14523a++;
        bu1Var.d(obj, this, ks1Var);
        fs1Var.B(0);
        fs1Var.f14523a--;
        fs1Var.i(iH);
    }

    public void H(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.i0)) {
            int i10 = this.f4134b & 7;
            if (i10 == 1) {
                do {
                    a0Var.add(Long.valueOf(mVar.t()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iZ = mVar.z();
            Y(iZ);
            int iD = mVar.d() + iZ;
            do {
                a0Var.add(Long.valueOf(mVar.t()));
            } while (mVar.d() < iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = (com.google.crypto.tink.shaded.protobuf.i0) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(mVar.t());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iZ2 = mVar.z();
        Y(iZ2);
        int iD2 = mVar.d() + iZ2;
        do {
            i0Var.addLong(mVar.t());
        } while (mVar.d() < iD2);
    }

    public void H0(Object obj, o2 o2Var, com.google.android.gms.internal.measurement.z0 z0Var) throws com.google.android.gms.internal.measurement.u1 {
        fs1 fs1Var = (fs1) this.f4137e;
        int iR = fs1Var.R();
        if (fs1Var.f14523a + fs1Var.f14524b >= 100) {
            throw new com.google.android.gms.internal.measurement.u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = fs1Var.j(iR);
        fs1Var.f14523a++;
        o2Var.e(obj, this, z0Var);
        fs1Var.B(0);
        fs1Var.f14523a--;
        fs1Var.m(iJ);
    }

    public void I(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Integer.valueOf(mVar.u()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Integer.valueOf(mVar.u()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void I0(Object obj, bu1 bu1Var, ks1 ks1Var) {
        int i10 = this.f4135c;
        this.f4135c = ((this.f4134b >>> 3) << 3) | 4;
        try {
            bu1Var.d(obj, this, ks1Var);
            if (this.f4134b != this.f4135c) {
                throw new et1("Failed to parse the message.");
            }
            this.f4135c = i10;
        } catch (Throwable th2) {
            this.f4135c = i10;
            throw th2;
        }
    }

    public void J(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Integer.valueOf(mVar.u()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Integer.valueOf(mVar.u()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(mVar.u());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            yVar.addInt(mVar.u());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void J0(Object obj, o2 o2Var, com.google.android.gms.internal.measurement.z0 z0Var) {
        int i10 = this.f4135c;
        this.f4135c = ((this.f4134b >>> 3) << 3) | 4;
        try {
            o2Var.e(obj, this, z0Var);
            if (this.f4134b != this.f4135c) {
                throw new com.google.android.gms.internal.measurement.u1("Failed to parse the message.");
            }
            this.f4135c = i10;
        } catch (Throwable th2) {
            this.f4135c = i10;
            throw th2;
        }
    }

    public void K(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Long.valueOf(mVar.v()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Long.valueOf(mVar.v()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public Object K0(qu1 qu1Var, Class cls, ks1 ks1Var) throws et1 {
        fs1 fs1Var = (fs1) this.f4137e;
        qu1 qu1Var2 = qu1.f19208c;
        switch (qu1Var.ordinal()) {
            case 0:
                F0(1);
                return Double.valueOf(fs1Var.D());
            case 1:
                F0(5);
                return Float.valueOf(fs1Var.E());
            case 2:
                F0(0);
                return Long.valueOf(fs1Var.G());
            case 3:
                F0(0);
                return Long.valueOf(fs1Var.F());
            case 4:
                F0(0);
                return Integer.valueOf(fs1Var.H());
            case 5:
                F0(1);
                return Long.valueOf(fs1Var.I());
            case 6:
                F0(5);
                return Integer.valueOf(fs1Var.J());
            case 7:
                F0(0);
                return Boolean.valueOf(fs1Var.K());
            case 8:
                F0(2);
                return fs1Var.M();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                F0(2);
                bu1 bu1VarA = vt1.f21267c.a(cls);
                ss1 ss1VarZza = bu1VarA.zza();
                G0(ss1VarZza, bu1VarA, ks1Var);
                bu1VarA.a(ss1VarZza);
                return ss1VarZza;
            case 11:
                return T0();
            case 12:
                F0(0);
                return Integer.valueOf(fs1Var.P());
            case 13:
                F0(0);
                return Integer.valueOf(fs1Var.R());
            case 14:
                F0(5);
                return Integer.valueOf(fs1Var.S());
            case 15:
                F0(1);
                return Long.valueOf(fs1Var.U());
            case 16:
                F0(0);
                return Integer.valueOf(fs1Var.V());
            case 17:
                F0(0);
                return Long.valueOf(fs1Var.Y());
        }
    }

    public void L(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.i0)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Long.valueOf(mVar.v()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Long.valueOf(mVar.v()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = (com.google.crypto.tink.shaded.protobuf.i0) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(mVar.v());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            i0Var.addLong(mVar.v());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public Object L0(c3 c3Var, Class cls, com.google.android.gms.internal.measurement.z0 z0Var) throws com.google.android.gms.internal.measurement.u1 {
        fs1 fs1Var = (fs1) this.f4137e;
        c3 c3Var2 = c3.f23342c;
        switch (c3Var.ordinal()) {
            case 0:
                F0(1);
                return Double.valueOf(fs1Var.D());
            case 1:
                F0(5);
                return Float.valueOf(fs1Var.E());
            case 2:
                F0(0);
                return Long.valueOf(fs1Var.G());
            case 3:
                F0(0);
                return Long.valueOf(fs1Var.F());
            case 4:
                F0(0);
                return Integer.valueOf(fs1Var.H());
            case 5:
                F0(1);
                return Long.valueOf(fs1Var.I());
            case 6:
                F0(5);
                return Integer.valueOf(fs1Var.J());
            case 7:
                F0(0);
                return Boolean.valueOf(fs1Var.K());
            case 8:
                F0(2);
                return fs1Var.M();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                F0(2);
                o2 o2VarA = l2.f23690c.a(cls);
                com.google.android.gms.internal.measurement.i1 i1VarZza = o2VarA.zza();
                H0(i1VarZza, o2VarA, z0Var);
                o2VarA.a(i1VarZza);
                return i1VarZza;
            case 11:
                return U0();
            case 12:
                F0(0);
                return Integer.valueOf(fs1Var.R());
            case 13:
                F0(0);
                return Integer.valueOf(fs1Var.S());
            case 14:
                F0(5);
                return Integer.valueOf(fs1Var.T());
            case 15:
                F0(1);
                return Long.valueOf(fs1Var.W());
            case 16:
                F0(0);
                return Integer.valueOf(fs1Var.X());
            case 17:
                F0(0);
                return Long.valueOf(fs1Var.Z());
        }
    }

    public void M(d0 d0Var, boolean z10) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        String strW;
        int iY;
        m mVar = (m) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw g0.g();
        }
        do {
            if (z10) {
                T(2);
                strW = mVar.x();
            } else {
                T(2);
                strW = mVar.w();
            }
            d0Var.add(strW);
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void M0(int i10) throws et1, com.google.android.gms.internal.measurement.u1 {
        switch (this.f4133a) {
            case 2:
                if (((fs1) this.f4137e).l() != i10) {
                    throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                return;
            default:
                if (((fs1) this.f4137e).p() != i10) {
                    throw new com.google.android.gms.internal.measurement.u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                return;
        }
    }

    public void N(com.google.crypto.tink.shaded.protobuf.a0 a0Var, boolean z10) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        String strW;
        int iY;
        m mVar = (m) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        do {
            if (z10) {
                T(2);
                strW = mVar.x();
            } else {
                T(2);
                strW = mVar.w();
            }
            a0Var.add(strW);
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void O(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Integer.valueOf(mVar.z()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Integer.valueOf(mVar.z()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void P(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Integer.valueOf(mVar.z()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Integer.valueOf(mVar.z()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(mVar.z());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            yVar.addInt(mVar.z());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void Q(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Long.valueOf(mVar.A()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Long.valueOf(mVar.A()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void R(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.i0)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Long.valueOf(mVar.A()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Long.valueOf(mVar.A()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = (com.google.crypto.tink.shaded.protobuf.i0) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(mVar.A());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            i0Var.addLong(mVar.A());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public int R0() {
        switch (this.f4133a) {
            case 2:
                int iA = this.f4136d;
                if (iA != 0) {
                    this.f4134b = iA;
                    this.f4136d = 0;
                } else {
                    iA = ((fs1) this.f4137e).A();
                    this.f4134b = iA;
                }
                if (iA == 0 || iA == this.f4135c) {
                    return Integer.MAX_VALUE;
                }
                return iA >>> 3;
            default:
                int iA2 = this.f4136d;
                if (iA2 != 0) {
                    this.f4134b = iA2;
                    this.f4136d = 0;
                } else {
                    iA2 = ((fs1) this.f4137e).A();
                    this.f4134b = iA2;
                }
                if (iA2 == 0 || iA2 == this.f4135c) {
                    return Integer.MAX_VALUE;
                }
                return iA2 >>> 3;
        }
    }

    public void S(int i10) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        switch (this.f4133a) {
            case 0:
                if (((m) this.f4137e).d() != i10) {
                    throw g0.j();
                }
                return;
            default:
                if (((m) this.f4137e).d() != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.d0.l();
                }
                return;
        }
    }

    public synchronized void S0(int i10) {
        int i11 = this.f4134b;
        this.f4134b = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public void T(int i10) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        switch (this.f4133a) {
            case 0:
                if ((this.f4134b & 7) != i10) {
                    throw g0.g();
                }
                return;
            default:
                if ((this.f4134b & 7) != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.d0.h();
                }
                return;
        }
    }

    public cs1 T0() {
        F0(2);
        return ((fs1) this.f4137e).N();
    }

    public boolean U() {
        int i10;
        m mVar = (m) this.f4137e;
        if (mVar.e() || (i10 = this.f4134b) == this.f4135c) {
            return false;
        }
        return mVar.B(i10);
    }

    public com.google.android.gms.internal.measurement.s0 U0() {
        F0(2);
        return ((fs1) this.f4137e).O();
    }

    public void V0(at1 at1Var) throws et1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 1) {
            do {
                at1Var.add(Double.valueOf(fs1Var.D()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            this.f4136d = iA;
            return;
        }
        if (i10 != 2) {
            throw new dt1();
        }
        int iP = fs1Var.P();
        P0(iP);
        int iL = fs1Var.l() + iP;
        do {
            at1Var.add(Double.valueOf(fs1Var.D()));
        } while (fs1Var.l() < iL);
    }

    public void W0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 1) {
            do {
                s1Var.add(Double.valueOf(fs1Var.D()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            this.f4136d = iA;
            return;
        }
        if (i10 != 2) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        int iR = fs1Var.R();
        Q0(iR);
        int iP = fs1Var.p() + iR;
        do {
            s1Var.add(Double.valueOf(fs1Var.D()));
        } while (fs1Var.p() < iP);
    }

    public void X0(at1 at1Var) throws et1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 2) {
            int iP = fs1Var.P();
            N0(iP);
            int iL = fs1Var.l() + iP;
            do {
                at1Var.add(Float.valueOf(fs1Var.E()));
            } while (fs1Var.l() < iL);
            return;
        }
        if (i10 != 5) {
            throw new dt1();
        }
        do {
            at1Var.add(Float.valueOf(fs1Var.E()));
            if (fs1Var.k()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public void Y0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 2) {
            int iR = fs1Var.R();
            O0(iR);
            int iP = fs1Var.p() + iR;
            do {
                s1Var.add(Float.valueOf(fs1Var.E()));
            } while (fs1Var.p() < iP);
            return;
        }
        if (i10 != 5) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        do {
            s1Var.add(Float.valueOf(fs1Var.E()));
            if (fs1Var.o()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public void Z(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof jt1) {
            jt1 jt1Var = (jt1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    jt1Var.m(fs1Var.G());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                jt1Var.m(fs1Var.G());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Long.valueOf(fs1Var.G()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Long.valueOf(fs1Var.G()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void Z0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof jt1) {
            jt1 jt1Var = (jt1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    jt1Var.m(fs1Var.F());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                jt1Var.m(fs1Var.F());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Long.valueOf(fs1Var.F()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Long.valueOf(fs1Var.F()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void a(com.google.android.gms.internal.ads.t tVar) {
        com.google.android.gms.internal.ads.t[] tVarArr = (com.google.android.gms.internal.ads.t[]) this.f4137e;
        int i10 = this.f4136d;
        this.f4136d = i10 + 1;
        tVarArr[i10] = tVar;
        this.f4135c--;
    }

    public void a0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.y1) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    y1Var.n(fs1Var.G());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                y1Var.n(fs1Var.G());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Long.valueOf(fs1Var.G()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Long.valueOf(fs1Var.G()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void a1(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.y1) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    y1Var.n(fs1Var.F());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                y1Var.n(fs1Var.F());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Long.valueOf(fs1Var.F()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Long.valueOf(fs1Var.F()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void b(c7 c7Var) {
        while (c7Var != null) {
            com.google.android.gms.internal.ads.t[] tVarArr = (com.google.android.gms.internal.ads.t[]) this.f4137e;
            int i10 = this.f4136d;
            this.f4136d = i10 + 1;
            com.google.android.gms.internal.ads.t tVar = (com.google.android.gms.internal.ads.t) c7Var.f13072c;
            tVar.getClass();
            tVarArr[i10] = tVar;
            this.f4135c--;
            c7Var = (c7) c7Var.f13073d;
            if (c7Var == null || ((com.google.android.gms.internal.ads.t) c7Var.f13072c) == null) {
                c7Var = null;
            }
        }
    }

    public void b0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    ts1Var.n(fs1Var.H());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                ts1Var.n(fs1Var.H());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Integer.valueOf(fs1Var.H()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.H()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public bc.n c() {
        return ((bc.n[]) this.f4137e)[this.f4134b];
    }

    public void c0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    j1Var.n(fs1Var.H());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                j1Var.n(fs1Var.H());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Integer.valueOf(fs1Var.H()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.H()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public int d() {
        switch (this.f4133a) {
            case 0:
                int i10 = this.f4136d;
                if (i10 != 0) {
                    this.f4134b = i10;
                    this.f4136d = 0;
                } else {
                    this.f4134b = ((m) this.f4137e).y();
                }
                int i11 = this.f4134b;
                if (i11 == 0 || i11 == this.f4135c) {
                    return Integer.MAX_VALUE;
                }
                return i11 >>> 3;
            default:
                int i12 = this.f4136d;
                if (i12 != 0) {
                    this.f4134b = i12;
                    this.f4136d = 0;
                } else {
                    this.f4134b = ((m) this.f4137e).y();
                }
                int i13 = this.f4134b;
                if (i13 == 0 || i13 == this.f4135c) {
                    return Integer.MAX_VALUE;
                }
                return i13 >>> 3;
        }
    }

    public void d0(at1 at1Var) throws et1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof jt1) {
            jt1 jt1Var = (jt1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iP = fs1Var.P();
                P0(iP);
                int iL = fs1Var.l() + iP;
                do {
                    jt1Var.m(fs1Var.I());
                } while (fs1Var.l() < iL);
                return;
            }
            do {
                jt1Var.m(fs1Var.I());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iP2 = fs1Var.P();
                P0(iP2);
                int iL2 = fs1Var.l() + iP2;
                do {
                    at1Var.add(Long.valueOf(fs1Var.I()));
                } while (fs1Var.l() < iL2);
                return;
            }
            do {
                at1Var.add(Long.valueOf(fs1Var.I()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public byte[][] e(int i10, int i11) {
        int i12 = this.f4135c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12 * i11, this.f4136d * i10);
        int i13 = i12 * i11;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i13 - i14) - 1;
            byte[] bArr2 = ((bc.n[]) this.f4137e)[i14 / i11].f5567a;
            int length = bArr2.length * i10;
            byte[] bArr3 = new byte[length];
            for (int i16 = 0; i16 < length; i16++) {
                bArr3[i16] = bArr2[i16 / i10];
            }
            bArr[i15] = bArr3;
        }
        return bArr;
    }

    public void e0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.y1) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iR = fs1Var.R();
                Q0(iR);
                int iP = fs1Var.p() + iR;
                do {
                    y1Var.n(fs1Var.I());
                } while (fs1Var.p() < iP);
                return;
            }
            do {
                y1Var.n(fs1Var.I());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iR2 = fs1Var.R();
                Q0(iR2);
                int iP2 = fs1Var.p() + iR2;
                do {
                    s1Var.add(Long.valueOf(fs1Var.I()));
                } while (fs1Var.p() < iP2);
                return;
            }
            do {
                s1Var.add(Long.valueOf(fs1Var.I()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void f(Object obj, d1 d1Var, s sVar) {
        int i10 = this.f4135c;
        this.f4135c = ((this.f4134b >>> 3) << 3) | 4;
        try {
            d1Var.f(obj, this, sVar);
            if (this.f4134b != this.f4135c) {
                throw new g0("Failed to parse the message.");
            }
            this.f4135c = i10;
        } catch (Throwable th2) {
            this.f4135c = i10;
            throw th2;
        }
    }

    public void f0(at1 at1Var) throws et1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iP = fs1Var.P();
                N0(iP);
                int iL = fs1Var.l() + iP;
                do {
                    ts1Var.n(fs1Var.J());
                } while (fs1Var.l() < iL);
                return;
            }
            if (i10 != 5) {
                throw new dt1();
            }
            do {
                ts1Var.n(fs1Var.J());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 == 2) {
                int iP2 = fs1Var.P();
                N0(iP2);
                int iL2 = fs1Var.l() + iP2;
                do {
                    at1Var.add(Integer.valueOf(fs1Var.J()));
                } while (fs1Var.l() < iL2);
                return;
            }
            if (i11 != 5) {
                throw new dt1();
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.J()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void g(Object obj, com.google.crypto.tink.shaded.protobuf.z0 z0Var, com.google.crypto.tink.shaded.protobuf.p pVar) {
        int i10 = this.f4135c;
        this.f4135c = ((this.f4134b >>> 3) << 3) | 4;
        try {
            z0Var.j(obj, this, pVar);
            if (this.f4134b != this.f4135c) {
                throw com.google.crypto.tink.shaded.protobuf.d0.k();
            }
            this.f4135c = i10;
        } catch (Throwable th2) {
            this.f4135c = i10;
            throw th2;
        }
    }

    public void g0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iR = fs1Var.R();
                O0(iR);
                int iP = fs1Var.p() + iR;
                do {
                    j1Var.n(fs1Var.J());
                } while (fs1Var.p() < iP);
                return;
            }
            if (i10 != 5) {
                throw new com.google.android.gms.internal.measurement.t1();
            }
            do {
                j1Var.n(fs1Var.J());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 == 2) {
                int iR2 = fs1Var.R();
                O0(iR2);
                int iP2 = fs1Var.p() + iR2;
                do {
                    s1Var.add(Integer.valueOf(fs1Var.J()));
                } while (fs1Var.p() < iP2);
                return;
            }
            if (i11 != 5) {
                throw new com.google.android.gms.internal.measurement.t1();
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.J()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void h(Object obj, d1 d1Var, s sVar) throws g0 {
        m mVar = (m) this.f4137e;
        int iZ = mVar.z();
        if (mVar.f4130a >= 100) {
            throw new g0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = mVar.h(iZ);
        mVar.f4130a++;
        d1Var.f(obj, this, sVar);
        mVar.a(0);
        mVar.f4130a--;
        mVar.g(iH);
    }

    public void h0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                at1Var.add(Boolean.valueOf(fs1Var.K()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            this.f4136d = iA;
            return;
        }
        if (i10 != 2) {
            throw new dt1();
        }
        int iL = fs1Var.l() + fs1Var.P();
        do {
            at1Var.add(Boolean.valueOf(fs1Var.K()));
        } while (fs1Var.l() < iL);
        M0(iL);
    }

    public void i(Object obj, com.google.crypto.tink.shaded.protobuf.z0 z0Var, com.google.crypto.tink.shaded.protobuf.p pVar) throws com.google.crypto.tink.shaded.protobuf.d0 {
        m mVar = (m) this.f4137e;
        int iZ = mVar.z();
        if (mVar.f4130a + 0 >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.d0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = mVar.h(iZ);
        mVar.f4130a++;
        z0Var.j(obj, this, pVar);
        mVar.a(0);
        mVar.f4130a--;
        mVar.g(iH);
    }

    public void i0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                s1Var.add(Boolean.valueOf(fs1Var.K()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            this.f4136d = iA;
            return;
        }
        if (i10 != 2) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        int iP = fs1Var.p() + fs1Var.R();
        do {
            s1Var.add(Boolean.valueOf(fs1Var.K()));
        } while (fs1Var.p() < iP);
        M0(iP);
    }

    public void j(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Boolean.valueOf(mVar.i()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Boolean.valueOf(mVar.i()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void j0(at1 at1Var, boolean z10) throws dt1 {
        String strL;
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw new dt1();
        }
        do {
            if (z10) {
                F0(2);
                strL = fs1Var.M();
            } else {
                F0(2);
                strL = fs1Var.L();
            }
            at1Var.add(strL);
            if (fs1Var.k()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public void k(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.d)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Boolean.valueOf(mVar.i()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Boolean.valueOf(mVar.i()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.d dVar = (com.google.crypto.tink.shaded.protobuf.d) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                dVar.addBoolean(mVar.i());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            dVar.addBoolean(mVar.i());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void k0(com.google.android.gms.internal.measurement.s1 s1Var, boolean z10) throws com.google.android.gms.internal.measurement.t1 {
        String strL;
        int iA;
        fs1 fs1Var = (fs1) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        do {
            if (z10) {
                F0(2);
                strL = fs1Var.M();
            } else {
                F0(2);
                strL = fs1Var.L();
            }
            s1Var.add(strL);
            if (fs1Var.o()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public j l() throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        T(2);
        return ((m) this.f4137e).j();
    }

    public void l0(at1 at1Var, bu1 bu1Var, ks1 ks1Var) throws et1 {
        int iA;
        int i10 = this.f4134b;
        if ((i10 & 7) != 2) {
            throw new dt1();
        }
        do {
            ss1 ss1VarZza = bu1Var.zza();
            G0(ss1VarZza, bu1Var, ks1Var);
            bu1Var.a(ss1VarZza);
            at1Var.add(ss1VarZza);
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.k() || this.f4136d != 0) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == i10);
        this.f4136d = iA;
    }

    public com.google.crypto.tink.shaded.protobuf.i m() throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        T(2);
        return ((m) this.f4137e).k();
    }

    public void m0(com.google.android.gms.internal.measurement.s1 s1Var, o2 o2Var, com.google.android.gms.internal.measurement.z0 z0Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        int i10 = this.f4134b;
        if ((i10 & 7) != 2) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarZza = o2Var.zza();
            H0(i1VarZza, o2Var, z0Var);
            o2Var.a(i1VarZza);
            s1Var.add(i1VarZza);
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.o() || this.f4136d != 0) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == i10);
        this.f4136d = iA;
    }

    public void n(d0 d0Var) throws f0 {
        int iY;
        m mVar = (m) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw g0.g();
        }
        do {
            d0Var.add(l());
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void n0(at1 at1Var, bu1 bu1Var, ks1 ks1Var) throws dt1 {
        int iA;
        int i10 = this.f4134b;
        if ((i10 & 7) != 3) {
            throw new dt1();
        }
        do {
            ss1 ss1VarZza = bu1Var.zza();
            I0(ss1VarZza, bu1Var, ks1Var);
            bu1Var.a(ss1VarZza);
            at1Var.add(ss1VarZza);
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.k() || this.f4136d != 0) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == i10);
        this.f4136d = iA;
    }

    public void o(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.c0 {
        int iY;
        m mVar = (m) this.f4137e;
        if ((this.f4134b & 7) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        do {
            a0Var.add(m());
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void o0(com.google.android.gms.internal.measurement.s1 s1Var, o2 o2Var, com.google.android.gms.internal.measurement.z0 z0Var) throws com.google.android.gms.internal.measurement.t1 {
        int iA;
        int i10 = this.f4134b;
        if ((i10 & 7) != 3) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarZza = o2Var.zza();
            J0(i1VarZza, o2Var, z0Var);
            o2Var.a(i1VarZza);
            s1Var.add(i1VarZza);
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.o() || this.f4136d != 0) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == i10);
        this.f4136d = iA;
    }

    public void p(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 1) {
            do {
                d0Var.add(Double.valueOf(mVar.l()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iZ = mVar.z();
        X(iZ);
        int iD = mVar.d() + iZ;
        do {
            d0Var.add(Double.valueOf(mVar.l()));
        } while (mVar.d() < iD);
    }

    public void p0(at1 at1Var) throws dt1 {
        int iA;
        if ((this.f4134b & 7) != 2) {
            throw new dt1();
        }
        do {
            at1Var.add(T0());
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.k()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public void q(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.n)) {
            int i10 = this.f4134b & 7;
            if (i10 == 1) {
                do {
                    a0Var.add(Double.valueOf(mVar.l()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iZ = mVar.z();
            Y(iZ);
            int iD = mVar.d() + iZ;
            do {
                a0Var.add(Double.valueOf(mVar.l()));
            } while (mVar.d() < iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.n nVar = (com.google.crypto.tink.shaded.protobuf.n) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 1) {
            do {
                nVar.addDouble(mVar.l());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iZ2 = mVar.z();
        Y(iZ2);
        int iD2 = mVar.d() + iZ2;
        do {
            nVar.addDouble(mVar.l());
        } while (mVar.d() < iD2);
    }

    public void q0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.t1 {
        int iA;
        if ((this.f4134b & 7) != 2) {
            throw new com.google.android.gms.internal.measurement.t1();
        }
        do {
            s1Var.add(U0());
            fs1 fs1Var = (fs1) this.f4137e;
            if (fs1Var.o()) {
                return;
            } else {
                iA = fs1Var.A();
            }
        } while (iA == this.f4134b);
        this.f4136d = iA;
    }

    public void r(d0 d0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 0) {
            do {
                d0Var.add(Integer.valueOf(mVar.m()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iD = mVar.d() + mVar.z();
        do {
            d0Var.add(Integer.valueOf(mVar.m()));
        } while (mVar.d() < iD);
        S(iD);
    }

    public void r0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    ts1Var.n(fs1Var.P());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                ts1Var.n(fs1Var.P());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Integer.valueOf(fs1Var.P()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.P()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void s(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0, g0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 0) {
                do {
                    a0Var.add(Integer.valueOf(mVar.m()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iD = mVar.d() + mVar.z();
            do {
                a0Var.add(Integer.valueOf(mVar.m()));
            } while (mVar.d() < iD);
            S(iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(mVar.m());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iD2 = mVar.d() + mVar.z();
        do {
            yVar.addInt(mVar.m());
        } while (mVar.d() < iD2);
        S(iD2);
    }

    public void s0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    j1Var.n(fs1Var.R());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                j1Var.n(fs1Var.R());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Integer.valueOf(fs1Var.R()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.R()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public Object t(y1 y1Var, Class cls, s sVar) throws com.google.crypto.tink.shaded.protobuf.c0, g0 {
        m mVar = (m) this.f4137e;
        switch (y1Var.ordinal()) {
            case 0:
                T(1);
                return Double.valueOf(mVar.l());
            case 1:
                T(5);
                return Float.valueOf(mVar.p());
            case 2:
                T(0);
                return Long.valueOf(mVar.r());
            case 3:
                T(0);
                return Long.valueOf(mVar.A());
            case 4:
                T(0);
                return Integer.valueOf(mVar.q());
            case 5:
                T(1);
                return Long.valueOf(mVar.o());
            case 6:
                T(5);
                return Integer.valueOf(mVar.n());
            case 7:
                T(0);
                return Boolean.valueOf(mVar.i());
            case 8:
                T(2);
                return mVar.x();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                T(2);
                d1 d1VarA = a1.f4050c.a(cls);
                b0 b0VarD = d1VarA.d();
                h(b0VarD, d1VarA, sVar);
                d1VarA.b(b0VarD);
                return b0VarD;
            case 11:
                return l();
            case 12:
                T(0);
                return Integer.valueOf(mVar.z());
            case 13:
                T(0);
                return Integer.valueOf(mVar.m());
            case 14:
                T(5);
                return Integer.valueOf(mVar.s());
            case 15:
                T(1);
                return Long.valueOf(mVar.t());
            case 16:
                T(0);
                return Integer.valueOf(mVar.u());
            case 17:
                T(0);
                return Long.valueOf(mVar.v());
        }
    }

    public void t0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    ts1Var.n(fs1Var.R());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                ts1Var.n(fs1Var.R());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Integer.valueOf(fs1Var.R()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.R()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void u(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 2) {
            int iZ = mVar.z();
            V(iZ);
            int iD = mVar.d() + iZ;
            do {
                d0Var.add(Integer.valueOf(mVar.n()));
            } while (mVar.d() < iD);
            return;
        }
        if (i10 != 5) {
            throw g0.g();
        }
        do {
            d0Var.add(Integer.valueOf(mVar.n()));
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void u0(com.google.android.gms.internal.measurement.s1 s1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP = fs1Var.p() + fs1Var.R();
                do {
                    j1Var.n(fs1Var.S());
                } while (fs1Var.p() < iP);
                M0(iP);
                return;
            }
            do {
                j1Var.n(fs1Var.S());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iP2 = fs1Var.p() + fs1Var.R();
                do {
                    s1Var.add(Integer.valueOf(fs1Var.S()));
                } while (fs1Var.p() < iP2);
                M0(iP2);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.S()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void v(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.y)) {
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iZ = mVar.z();
                W(iZ);
                int iD = mVar.d() + iZ;
                do {
                    a0Var.add(Integer.valueOf(mVar.n()));
                } while (mVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            do {
                a0Var.add(Integer.valueOf(mVar.n()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.y yVar = (com.google.crypto.tink.shaded.protobuf.y) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 2) {
            int iZ2 = mVar.z();
            W(iZ2);
            int iD2 = mVar.d() + iZ2;
            do {
                yVar.addInt(mVar.n());
            } while (mVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        do {
            yVar.addInt(mVar.n());
            if (mVar.e()) {
                return;
            } else {
                iY2 = mVar.y();
            }
        } while (iY2 == this.f4134b);
        this.f4136d = iY2;
    }

    public void v0(at1 at1Var) throws et1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iP = fs1Var.P();
                N0(iP);
                int iL = fs1Var.l() + iP;
                do {
                    ts1Var.n(fs1Var.S());
                } while (fs1Var.l() < iL);
                return;
            }
            if (i10 != 5) {
                throw new dt1();
            }
            do {
                ts1Var.n(fs1Var.S());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 == 2) {
                int iP2 = fs1Var.P();
                N0(iP2);
                int iL2 = fs1Var.l() + iP2;
                do {
                    at1Var.add(Integer.valueOf(fs1Var.S()));
                } while (fs1Var.l() < iL2);
                return;
            }
            if (i11 != 5) {
                throw new dt1();
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.S()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void w(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 1) {
            do {
                d0Var.add(Long.valueOf(mVar.o()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        if (i10 != 2) {
            throw g0.g();
        }
        int iZ = mVar.z();
        X(iZ);
        int iD = mVar.d() + iZ;
        do {
            d0Var.add(Long.valueOf(mVar.o()));
        } while (mVar.d() < iD);
    }

    public void w0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iR = fs1Var.R();
                O0(iR);
                int iP = fs1Var.p() + iR;
                do {
                    j1Var.n(fs1Var.T());
                } while (fs1Var.p() < iP);
                return;
            }
            if (i10 != 5) {
                throw new com.google.android.gms.internal.measurement.t1();
            }
            do {
                j1Var.n(fs1Var.T());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 == 2) {
                int iR2 = fs1Var.R();
                O0(iR2);
                int iP2 = fs1Var.p() + iR2;
                do {
                    s1Var.add(Integer.valueOf(fs1Var.T()));
                } while (fs1Var.p() < iP2);
                return;
            }
            if (i11 != 5) {
                throw new com.google.android.gms.internal.measurement.t1();
            }
            do {
                s1Var.add(Integer.valueOf(fs1Var.T()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void x(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.i0)) {
            int i10 = this.f4134b & 7;
            if (i10 == 1) {
                do {
                    a0Var.add(Long.valueOf(mVar.o()));
                    if (mVar.e()) {
                        return;
                    } else {
                        iY = mVar.y();
                    }
                } while (iY == this.f4134b);
                this.f4136d = iY;
                return;
            }
            if (i10 != 2) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            int iZ = mVar.z();
            Y(iZ);
            int iD = mVar.d() + iZ;
            do {
                a0Var.add(Long.valueOf(mVar.o()));
            } while (mVar.d() < iD);
            return;
        }
        com.google.crypto.tink.shaded.protobuf.i0 i0Var = (com.google.crypto.tink.shaded.protobuf.i0) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(mVar.o());
                if (mVar.e()) {
                    return;
                } else {
                    iY2 = mVar.y();
                }
            } while (iY2 == this.f4134b);
            this.f4136d = iY2;
            return;
        }
        if (i11 != 2) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        int iZ2 = mVar.z();
        Y(iZ2);
        int iD2 = mVar.d() + iZ2;
        do {
            i0Var.addLong(mVar.o());
        } while (mVar.d() < iD2);
    }

    public void x0(at1 at1Var) throws et1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof jt1) {
            jt1 jt1Var = (jt1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iP = fs1Var.P();
                P0(iP);
                int iL = fs1Var.l() + iP;
                do {
                    jt1Var.m(fs1Var.U());
                } while (fs1Var.l() < iL);
                return;
            }
            do {
                jt1Var.m(fs1Var.U());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iP2 = fs1Var.P();
                P0(iP2);
                int iL2 = fs1Var.l() + iP2;
                do {
                    at1Var.add(Long.valueOf(fs1Var.U()));
                } while (fs1Var.l() < iL2);
                return;
            }
            do {
                at1Var.add(Long.valueOf(fs1Var.U()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void y(d0 d0Var) throws g0 {
        int iY;
        m mVar = (m) this.f4137e;
        int i10 = this.f4134b & 7;
        if (i10 == 2) {
            int iZ = mVar.z();
            V(iZ);
            int iD = mVar.d() + iZ;
            do {
                d0Var.add(Float.valueOf(mVar.p()));
            } while (mVar.d() < iD);
            return;
        }
        if (i10 != 5) {
            throw g0.g();
        }
        do {
            d0Var.add(Float.valueOf(mVar.p()));
            if (mVar.e()) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == this.f4134b);
        this.f4136d = iY;
    }

    public void y0(com.google.android.gms.internal.measurement.s1 s1Var) throws com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (s1Var instanceof com.google.android.gms.internal.measurement.y1) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) s1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iR = fs1Var.R();
                Q0(iR);
                int iP = fs1Var.p() + iR;
                do {
                    y1Var.n(fs1Var.W());
                } while (fs1Var.p() < iP);
                return;
            }
            do {
                y1Var.n(fs1Var.W());
                if (fs1Var.o()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.measurement.t1();
                }
                int iR2 = fs1Var.R();
                Q0(iR2);
                int iP2 = fs1Var.p() + iR2;
                do {
                    s1Var.add(Long.valueOf(fs1Var.W()));
                } while (fs1Var.p() < iP2);
                return;
            }
            do {
                s1Var.add(Long.valueOf(fs1Var.W()));
                if (fs1Var.o()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    public void z(com.google.crypto.tink.shaded.protobuf.a0 a0Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iY;
        int iY2;
        m mVar = (m) this.f4137e;
        if (!(a0Var instanceof com.google.crypto.tink.shaded.protobuf.t)) {
            int i10 = this.f4134b & 7;
            if (i10 == 2) {
                int iZ = mVar.z();
                W(iZ);
                int iD = mVar.d() + iZ;
                do {
                    a0Var.add(Float.valueOf(mVar.p()));
                } while (mVar.d() < iD);
                return;
            }
            if (i10 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.d0.h();
            }
            do {
                a0Var.add(Float.valueOf(mVar.p()));
                if (mVar.e()) {
                    return;
                } else {
                    iY = mVar.y();
                }
            } while (iY == this.f4134b);
            this.f4136d = iY;
            return;
        }
        com.google.crypto.tink.shaded.protobuf.t tVar = (com.google.crypto.tink.shaded.protobuf.t) a0Var;
        int i11 = this.f4134b & 7;
        if (i11 == 2) {
            int iZ2 = mVar.z();
            W(iZ2);
            int iD2 = mVar.d() + iZ2;
            do {
                tVar.addFloat(mVar.p());
            } while (mVar.d() < iD2);
            return;
        }
        if (i11 != 5) {
            throw com.google.crypto.tink.shaded.protobuf.d0.h();
        }
        do {
            tVar.addFloat(mVar.p());
            if (mVar.e()) {
                return;
            } else {
                iY2 = mVar.y();
            }
        } while (iY2 == this.f4134b);
        this.f4136d = iY2;
    }

    public void z0(at1 at1Var) throws et1, com.google.android.gms.internal.measurement.u1 {
        int iA;
        int iA2;
        fs1 fs1Var = (fs1) this.f4137e;
        if (at1Var instanceof ts1) {
            ts1 ts1Var = (ts1) at1Var;
            int i10 = this.f4134b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new dt1();
                }
                int iL = fs1Var.l() + fs1Var.P();
                do {
                    ts1Var.n(fs1Var.V());
                } while (fs1Var.l() < iL);
                M0(iL);
                return;
            }
            do {
                ts1Var.n(fs1Var.V());
                if (fs1Var.k()) {
                    return;
                } else {
                    iA2 = fs1Var.A();
                }
            } while (iA2 == this.f4134b);
        } else {
            int i11 = this.f4134b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new dt1();
                }
                int iL2 = fs1Var.l() + fs1Var.P();
                do {
                    at1Var.add(Integer.valueOf(fs1Var.V()));
                } while (fs1Var.l() < iL2);
                M0(iL2);
                return;
            }
            do {
                at1Var.add(Integer.valueOf(fs1Var.V()));
                if (fs1Var.k()) {
                    return;
                } else {
                    iA = fs1Var.A();
                }
            } while (iA == this.f4134b);
            iA2 = iA;
        }
        this.f4136d = iA2;
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized com.google.android.gms.internal.ads.t zza() {
        com.google.android.gms.internal.ads.t tVar;
        try {
            int i10 = this.f4135c + 1;
            this.f4135c = i10;
            int i11 = this.f4136d;
            if (i11 > 0) {
                com.google.android.gms.internal.ads.t[] tVarArr = (com.google.android.gms.internal.ads.t[]) this.f4137e;
                int i12 = i11 - 1;
                this.f4136d = i12;
                tVar = tVarArr[i12];
                if (tVar == null) {
                    throw null;
                }
                tVarArr[i12] = null;
            } else {
                tVar = new com.google.android.gms.internal.ads.t(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE]);
                com.google.android.gms.internal.ads.t[] tVarArr2 = (com.google.android.gms.internal.ads.t[]) this.f4137e;
                int length = tVarArr2.length;
                if (i10 > length) {
                    this.f4137e = (com.google.android.gms.internal.ads.t[]) Arrays.copyOf(tVarArr2, length + length);
                    return tVar;
                }
            }
            return tVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.u
    public synchronized void zzd() {
        int i10 = this.f4134b;
        String str = uu0.f20901a;
        int iMax = Math.max(0, ((i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f4135c);
        int i11 = this.f4136d;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill((com.google.android.gms.internal.ads.t[]) this.f4137e, iMax, i11, (Object) null);
        this.f4136d = iMax;
    }

    public n(fs1 fs1Var) {
        this.f4133a = 2;
        this.f4136d = 0;
        fs1Var.getClass();
        this.f4137e = fs1Var;
        fs1Var.f14525c = this;
    }

    public n(fs1 fs1Var, byte b10) {
        this.f4133a = 3;
        this.f4136d = 0;
        this.f4137e = fs1Var;
        fs1Var.f14525c = this;
    }

    public n(int i10, int i11) {
        this.f4133a = 5;
        this.f4137e = new bc.n[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            ((bc.n[]) this.f4137e)[i12] = new bc.n(((i11 + 4) * 17) + 1);
        }
        this.f4136d = i11 * 17;
        this.f4135c = i10;
        this.f4134b = -1;
    }

    public n(m mVar) {
        this.f4133a = 0;
        this.f4136d = 0;
        Charset charset = e0.f4067a;
        this.f4137e = mVar;
        mVar.f4131b = this;
    }

    public n(m mVar, byte b10) {
        this.f4133a = 4;
        this.f4136d = 0;
        com.google.crypto.tink.shaded.protobuf.b0.a(mVar, "input");
        this.f4137e = mVar;
        mVar.f4131b = this;
    }
}
