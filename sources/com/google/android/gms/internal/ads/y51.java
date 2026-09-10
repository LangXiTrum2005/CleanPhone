package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements v51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx1 f22154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c61 f22155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a71 f22156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f22157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m51 f22158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qz0 f22159g;

    public y51(Context context, dx1 dx1Var, c61 c61Var, a71 a71Var, ExecutorService executorService, m51 m51Var, qz0 qz0Var) {
        this.f22153a = context;
        this.f22154b = dx1Var;
        this.f22155c = c61Var;
        this.f22156d = a71Var;
        this.f22157e = executorService;
        this.f22158f = m51Var;
        this.f22159g = qz0Var;
    }

    public static i31 a(int i10) {
        h31 h31VarC = i31.C();
        h31VarC.b();
        ((i31) h31VarC.f19193b).H(i10);
        return (i31) h31VarC.e();
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final vd1 zza() {
        dx1 dx1Var = this.f22154b;
        Objects.requireNonNull(dx1Var);
        ns0 ns0Var = new ns0(dx1Var, 6);
        ExecutorService executorService = this.f22157e;
        vd1 vd1VarR = vd1.r(zw1.o(executorService, ns0Var));
        final int i10 = 1;
        d81 d81Var = new d81(this) { // from class: com.google.android.gms.internal.ads.x51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y51 f21748b;

            {
                this.f21748b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                boolean zA;
                switch (i10) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        y51 y51Var = this.f21748b;
                        dx1 dx1Var2 = y51Var.f22154b;
                        String strZ = l31Var.z().z();
                        String strA = l31Var.z().A();
                        a71 a71Var = y51Var.f22156d;
                        y61 y61VarA = a71Var.a(15203);
                        try {
                            y61VarA.a();
                            l01 l01VarD = dv.d(y51Var.f22153a, (hh) dx1Var2.zzb(), strZ, strA, y51Var.f22159g);
                            int i11 = l01VarD.f16618c;
                            y61VarA.c();
                            int i12 = 2;
                            if (i11 == 2) {
                                a71Var.b(15208);
                                return y51.a(4);
                            }
                            byte[] bArr = l01VarD.f16617b;
                            if (bArr == null || bArr.length == 0) {
                                a71Var.b(IronSourceConstants.errorCode_destroy);
                                return y51.a(8);
                            }
                            try {
                                jh jhVarD = jh.D(bArr, ks1.a());
                                if (jhVarD.z().z().isEmpty() || jhVarD.z().A().isEmpty() || jhVarD.B().h().length == 0) {
                                    a71Var.b(15207);
                                } else {
                                    if (l31Var.equals(l31.F()) || !TextUtils.equals(l31Var.z().z(), jhVarD.z().z()) || !TextUtils.equals(l31Var.z().A(), jhVarD.z().A())) {
                                        if (i11 == 4) {
                                            m51 m51Var = y51Var.f22158f;
                                            byte[] bArrH = jhVarD.A().h();
                                            File file = m51Var.f17277a;
                                            try {
                                                x10.p(file);
                                                x10.i(file, bArrH);
                                                m51Var.f17278b.getClass();
                                                zA = pz0.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                m51Var.f17279c.d(e10, 2027);
                                                zA = false;
                                            }
                                            try {
                                                file.delete();
                                                break;
                                            } catch (SecurityException unused) {
                                            }
                                            if (!zA) {
                                                a71Var.b(15206);
                                                return y51.a(12);
                                            }
                                            i11 = 4;
                                            break;
                                        }
                                        h31 h31VarC = i31.C();
                                        if (i11 == 2) {
                                            i12 = 4;
                                        } else if (i11 != 3) {
                                            i12 = i11 != 4 ? i11 != 6 ? 1 : 5 : 3;
                                        }
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).H(i12);
                                        k31 k31VarE = l31.E();
                                        nh nhVarZ = jhVarD.z();
                                        k31VarE.b();
                                        ((l31) k31VarE.f19193b).G(nhVarZ);
                                        hh hhVar = (hh) dx1Var2.zzb();
                                        k31VarE.b();
                                        ((l31) k31VarE.f19193b).I(hhVar);
                                        l31 l31Var2 = (l31) k31VarE.e();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).D(l31Var2);
                                        cs1 cs1VarA = jhVarD.A();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).F(cs1VarA);
                                        cs1 cs1VarB = jhVarD.B();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).E(cs1VarB);
                                        return (i31) h31VarC.e();
                                    }
                                    a71Var.b(15209);
                                }
                                return y51.a(11);
                            } catch (et1 e11) {
                                a71Var.d(e11, 15205);
                                return y51.a(9);
                            } catch (NullPointerException unused2) {
                                a71Var.b(15210);
                                return y51.a(10);
                            }
                        } catch (Throwable th2) {
                            try {
                                y61VarA.b(th2);
                                throw th2;
                            } catch (Throwable th3) {
                                y61VarA.c();
                                throw th3;
                            }
                        }
                    default:
                        hh hhVar2 = (hh) obj;
                        y51 y51Var2 = this.f21748b;
                        y51Var2.getClass();
                        if (x10.m(hhVar2)) {
                            return new Integer(0);
                        }
                        y51Var2.f22156d.c(15204, hhVar2.name());
                        throw new w51();
                }
            }
        };
        td1 td1Var = td1.f20333a;
        final int i11 = 0;
        lc1 lc1VarT = zw1.t(zw1.z(zw1.x(zw1.z(vd1VarR, d81Var, td1Var), new rr(this, 16), td1Var), new d81(this) { // from class: com.google.android.gms.internal.ads.x51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y51 f21748b;

            {
                this.f21748b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                boolean zA;
                switch (i11) {
                    case 0:
                        l31 l31Var = (l31) obj;
                        y51 y51Var = this.f21748b;
                        dx1 dx1Var2 = y51Var.f22154b;
                        String strZ = l31Var.z().z();
                        String strA = l31Var.z().A();
                        a71 a71Var = y51Var.f22156d;
                        y61 y61VarA = a71Var.a(15203);
                        try {
                            y61VarA.a();
                            l01 l01VarD = dv.d(y51Var.f22153a, (hh) dx1Var2.zzb(), strZ, strA, y51Var.f22159g);
                            int i12 = l01VarD.f16618c;
                            y61VarA.c();
                            int i13 = 2;
                            if (i12 == 2) {
                                a71Var.b(15208);
                                return y51.a(4);
                            }
                            byte[] bArr = l01VarD.f16617b;
                            if (bArr == null || bArr.length == 0) {
                                a71Var.b(IronSourceConstants.errorCode_destroy);
                                return y51.a(8);
                            }
                            try {
                                jh jhVarD = jh.D(bArr, ks1.a());
                                if (jhVarD.z().z().isEmpty() || jhVarD.z().A().isEmpty() || jhVarD.B().h().length == 0) {
                                    a71Var.b(15207);
                                } else {
                                    if (l31Var.equals(l31.F()) || !TextUtils.equals(l31Var.z().z(), jhVarD.z().z()) || !TextUtils.equals(l31Var.z().A(), jhVarD.z().A())) {
                                        if (i12 == 4) {
                                            m51 m51Var = y51Var.f22158f;
                                            byte[] bArrH = jhVarD.A().h();
                                            File file = m51Var.f17277a;
                                            try {
                                                x10.p(file);
                                                x10.i(file, bArrH);
                                                m51Var.f17278b.getClass();
                                                zA = pz0.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                m51Var.f17279c.d(e10, 2027);
                                                zA = false;
                                            }
                                            try {
                                                file.delete();
                                                break;
                                            } catch (SecurityException unused) {
                                            }
                                            if (!zA) {
                                                a71Var.b(15206);
                                                return y51.a(12);
                                            }
                                            i12 = 4;
                                            break;
                                        }
                                        h31 h31VarC = i31.C();
                                        if (i12 == 2) {
                                            i13 = 4;
                                        } else if (i12 != 3) {
                                            i13 = i12 != 4 ? i12 != 6 ? 1 : 5 : 3;
                                        }
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).H(i13);
                                        k31 k31VarE = l31.E();
                                        nh nhVarZ = jhVarD.z();
                                        k31VarE.b();
                                        ((l31) k31VarE.f19193b).G(nhVarZ);
                                        hh hhVar = (hh) dx1Var2.zzb();
                                        k31VarE.b();
                                        ((l31) k31VarE.f19193b).I(hhVar);
                                        l31 l31Var2 = (l31) k31VarE.e();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).D(l31Var2);
                                        cs1 cs1VarA = jhVarD.A();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).F(cs1VarA);
                                        cs1 cs1VarB = jhVarD.B();
                                        h31VarC.b();
                                        ((i31) h31VarC.f19193b).E(cs1VarB);
                                        return (i31) h31VarC.e();
                                    }
                                    a71Var.b(15209);
                                }
                                return y51.a(11);
                            } catch (et1 e11) {
                                a71Var.d(e11, 15205);
                                return y51.a(9);
                            } catch (NullPointerException unused2) {
                                a71Var.b(15210);
                                return y51.a(10);
                            }
                        } catch (Throwable th2) {
                            try {
                                y61VarA.b(th2);
                                throw th2;
                            } catch (Throwable th3) {
                                y61VarA.c();
                                throw th3;
                            }
                        }
                    default:
                        hh hhVar2 = (hh) obj;
                        y51 y51Var2 = this.f21748b;
                        y51Var2.getClass();
                        if (x10.m(hhVar2)) {
                            return new Integer(0);
                        }
                        y51Var2.f22156d.c(15204, hhVar2.name());
                        throw new w51();
                }
            }
        }, executorService), w51.class, t51.f20191c, td1Var);
        this.f22156d.e(15202, lc1VarT);
        return lc1VarT;
    }
}
