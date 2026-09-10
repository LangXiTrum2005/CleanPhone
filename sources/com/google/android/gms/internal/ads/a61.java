package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a61 implements v51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f11910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s21 f11911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a71 f11914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b61 f11915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11916h;

    public a61(Context context, ExecutorService executorService, h21 h21Var, s21 s21Var, a71 a71Var, b61 b61Var) {
        this.f11909a = context;
        this.f11910b = executorService;
        this.f11911c = s21Var;
        this.f11914f = a71Var;
        this.f11915g = b61Var;
        this.f11912d = h21Var.Q();
        int iK = h21Var.K();
        if (iK == 1) {
            bt1.a();
            throw null;
        }
        int i10 = iK - 2;
        this.f11916h = i10 != 0 ? i10 != 1 ? i10 != 2 ? 5 : 4 : 3 : 2;
        this.f11913e = h21Var.W().B();
    }

    public static i31 a(int i10) {
        h31 h31VarC = i31.C();
        h31VarC.b();
        ((i31) h31VarC.f19193b).H(i10);
        return (i31) h31VarC.e();
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final vd1 zza() {
        int i10;
        ah ahVarZ = bh.z();
        byte[] bArrM = rb0.m();
        as1 as1Var = cs1.f13248b;
        as1 as1VarD = cs1.D(bArrM, 0, bArrM.length);
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).A(as1VarD);
        long j10 = Build.VERSION.SDK_INT;
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).B(j10);
        String str = Build.MODEL;
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).C(str);
        Context context = this.f11909a;
        String packageName = context.getPackageName();
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).D(packageName);
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = -1;
        }
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).E(i10);
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).F(this.f11912d);
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).G(3);
        ahVarZ.b();
        ((bh) ahVarZ.f19193b).H(this.f11916h);
        byte[] bArrB = ((bh) ahVarZ.e()).b();
        pb1 pb1Var = rb1.f19514e;
        if (pb1Var.f19517b != null) {
            pb1Var = new pb1(pb1Var.f19516a, (Character) null);
        }
        String strG = pb1Var.g(bArrB.length, bArrB);
        s21 s21Var = this.f11911c;
        s21Var.getClass();
        final int i11 = 2;
        gd1 gd1VarZ = zw1.z(vd1.r(android.support.v4.media.session.a.p(new m01(s21Var, Uri.parse(this.f11913e).buildUpon().appendQueryParameter("aspq", strG).build().toString(), false, (String) null, new byte[0]))), new d81(this) { // from class: com.google.android.gms.internal.ads.z51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a61 f22509b;

            {
                this.f22509b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                i31 i31VarA;
                switch (i11) {
                    case 0:
                        this.f22509b.f11914f.b(20007);
                        return a61.a(13);
                    case 1:
                        this.f22509b.f11914f.b(20008);
                        return a61.a(13);
                    default:
                        r21 r21Var = (r21) obj;
                        a61 a61Var = this.f22509b;
                        a71 a71Var = a61Var.f11914f;
                        if (r21Var.f19302a != 200) {
                            a71Var.c(20003, new String(rb0.m(), StandardCharsets.UTF_8));
                            return a61.a(7);
                        }
                        try {
                            String str2 = new String(r21Var.f19303b);
                            if (TextUtils.isEmpty(str2)) {
                                a71Var.b(20004);
                                i31VarA = a61.a(8);
                            } else {
                                ch chVarB = ch.B(ps1.F(str2, true), ks1.a());
                                if (!chVarB.z().B() || !chVarB.z().z()) {
                                    a71Var.b(20004);
                                    i31VarA = a61.a(8);
                                } else if (a61Var.f11915g.a(chVarB)) {
                                    h31 h31VarC = i31.C();
                                    k31 k31VarE = l31.E();
                                    lh lhVarA = chVarB.z().A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).H(lhVarA);
                                    List listA = chVarB.A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).J((ws1) listA);
                                    l31 l31Var = (l31) k31VarE.e();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).D(l31Var);
                                    cs1 cs1VarC = chVarB.z().C();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).E(cs1VarC);
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).H(2);
                                    i31VarA = (i31) h31VarC.e();
                                } else {
                                    a71Var.b(20006);
                                    i31VarA = a61.a(12);
                                }
                            }
                            return i31VarA;
                        } catch (Throwable th2) {
                            a71Var.d(th2, 20005);
                            return a61.a(6);
                        }
                }
            }
        }, this.f11910b);
        final int i12 = 0;
        d81 d81Var = new d81(this) { // from class: com.google.android.gms.internal.ads.z51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a61 f22509b;

            {
                this.f22509b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                i31 i31VarA;
                switch (i12) {
                    case 0:
                        this.f22509b.f11914f.b(20007);
                        return a61.a(13);
                    case 1:
                        this.f22509b.f11914f.b(20008);
                        return a61.a(13);
                    default:
                        r21 r21Var = (r21) obj;
                        a61 a61Var = this.f22509b;
                        a71 a71Var = a61Var.f11914f;
                        if (r21Var.f19302a != 200) {
                            a71Var.c(20003, new String(rb0.m(), StandardCharsets.UTF_8));
                            return a61.a(7);
                        }
                        try {
                            String str2 = new String(r21Var.f19303b);
                            if (TextUtils.isEmpty(str2)) {
                                a71Var.b(20004);
                                i31VarA = a61.a(8);
                            } else {
                                ch chVarB = ch.B(ps1.F(str2, true), ks1.a());
                                if (!chVarB.z().B() || !chVarB.z().z()) {
                                    a71Var.b(20004);
                                    i31VarA = a61.a(8);
                                } else if (a61Var.f11915g.a(chVarB)) {
                                    h31 h31VarC = i31.C();
                                    k31 k31VarE = l31.E();
                                    lh lhVarA = chVarB.z().A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).H(lhVarA);
                                    List listA = chVarB.A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).J((ws1) listA);
                                    l31 l31Var = (l31) k31VarE.e();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).D(l31Var);
                                    cs1 cs1VarC = chVarB.z().C();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).E(cs1VarC);
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).H(2);
                                    i31VarA = (i31) h31VarC.e();
                                } else {
                                    a71Var.b(20006);
                                    i31VarA = a61.a(12);
                                }
                            }
                            return i31VarA;
                        } catch (Throwable th2) {
                            a71Var.d(th2, 20005);
                            return a61.a(6);
                        }
                }
            }
        };
        td1 td1Var = td1.f20333a;
        final int i13 = 1;
        lc1 lc1VarT = zw1.t(zw1.t(gd1VarZ, UnknownHostException.class, d81Var, td1Var), SocketException.class, new d81(this) { // from class: com.google.android.gms.internal.ads.z51

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a61 f22509b;

            {
                this.f22509b = this;
            }

            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                i31 i31VarA;
                switch (i13) {
                    case 0:
                        this.f22509b.f11914f.b(20007);
                        return a61.a(13);
                    case 1:
                        this.f22509b.f11914f.b(20008);
                        return a61.a(13);
                    default:
                        r21 r21Var = (r21) obj;
                        a61 a61Var = this.f22509b;
                        a71 a71Var = a61Var.f11914f;
                        if (r21Var.f19302a != 200) {
                            a71Var.c(20003, new String(rb0.m(), StandardCharsets.UTF_8));
                            return a61.a(7);
                        }
                        try {
                            String str2 = new String(r21Var.f19303b);
                            if (TextUtils.isEmpty(str2)) {
                                a71Var.b(20004);
                                i31VarA = a61.a(8);
                            } else {
                                ch chVarB = ch.B(ps1.F(str2, true), ks1.a());
                                if (!chVarB.z().B() || !chVarB.z().z()) {
                                    a71Var.b(20004);
                                    i31VarA = a61.a(8);
                                } else if (a61Var.f11915g.a(chVarB)) {
                                    h31 h31VarC = i31.C();
                                    k31 k31VarE = l31.E();
                                    lh lhVarA = chVarB.z().A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).H(lhVarA);
                                    List listA = chVarB.A();
                                    k31VarE.b();
                                    ((l31) k31VarE.f19193b).J((ws1) listA);
                                    l31 l31Var = (l31) k31VarE.e();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).D(l31Var);
                                    cs1 cs1VarC = chVarB.z().C();
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).E(cs1VarC);
                                    h31VarC.b();
                                    ((i31) h31VarC.f19193b).H(2);
                                    i31VarA = (i31) h31VarC.e();
                                } else {
                                    a71Var.b(20006);
                                    i31VarA = a61.a(12);
                                }
                            }
                            return i31VarA;
                        } catch (Throwable th2) {
                            a71Var.d(th2, 20005);
                            return a61.a(6);
                        }
                }
            }
        }, td1Var);
        this.f11914f.e(20002, lc1VarT);
        return lc1VarT;
    }
}
