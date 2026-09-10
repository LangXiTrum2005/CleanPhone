package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f31 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g31 f14200b;

    public /* synthetic */ f31(g31 g31Var, int i10) {
        this.f14199a = i10;
        this.f14200b = g31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ld ldVar;
        ca1 ca1VarY;
        int i12;
        String string;
        switch (this.f14199a) {
            case 0:
                g31 g31Var = this.f14200b;
                if (!g31Var.f14724e || g31Var.l.getAndSet(true)) {
                    return;
                }
                Context context = g31Var.f14720a;
                String str = g31Var.f14729j;
                int i13 = g31Var.f14738t;
                double d10 = g31Var.f14728i;
                long j10 = g31Var.f14730k;
                Locale locale = Locale.getDefault();
                if (i13 == 1) {
                    bt1.a();
                    throw null;
                }
                int i14 = i13 - 2;
                if (i14 == 0) {
                    i10 = 2;
                } else if (i14 != 1) {
                    i10 = i14 != 2 ? 5 : 4;
                } else {
                    i10 = 3;
                }
                ld ldVarZ = md.z();
                long j11 = Build.VERSION.SDK_INT;
                ldVarZ.b();
                ((md) ldVarZ.f19193b).C(j11);
                String str2 = Build.MODEL;
                ldVarZ.b();
                ((md) ldVarZ.f19193b).D(str2);
                String language = locale.getLanguage();
                ldVarZ.b();
                ((md) ldVarZ.f19193b).E(language);
                String country = locale.getCountry();
                ldVarZ.b();
                ((md) ldVarZ.f19193b).F(country);
                ldVarZ.b();
                ((md) ldVarZ.f19193b).I(str);
                ldVarZ.b();
                ((md) ldVarZ.f19193b).O(i10);
                ldVarZ.b();
                ((md) ldVarZ.f19193b).P(3);
                String packageName = context.getPackageName();
                ldVarZ.b();
                ((md) ldVarZ.f19193b).G(packageName);
                ldVarZ.b();
                ((md) ldVarZ.f19193b).L(j10);
                if (d10 > 0.0d) {
                    ldVarZ.b();
                    ((md) ldVarZ.f19193b).K((int) (1.0d / d10));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j12 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    ldVarZ.b();
                    ((md) ldVarZ.f19193b).H(j12);
                    break;
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i11 = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i11 = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i11 = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        i11 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                    }
                    ldVarZ.b();
                    ((md) ldVarZ.f19193b).N(i11);
                    break;
                } catch (RuntimeException unused2) {
                }
                md mdVar = (md) ldVarZ.e();
                synchronized (g31Var.f14731m) {
                    g31Var.f14734p.f(mdVar);
                    break;
                }
                return;
            default:
                g31 g31Var2 = this.f14200b;
                synchronized (g31Var2.f14731m) {
                    ld ldVar2 = g31Var2.f14734p;
                    qs1 qs1Var = (qs1) ldVar2.f19192a.v(5, null);
                    qs1Var.f19193b = ldVar2.c();
                    ldVar = (ld) qs1Var;
                    break;
                }
                synchronized (g31Var2.f14732n) {
                    ArrayList arrayList = g31Var2.f14735q;
                    ca1VarY = ca1.y(arrayList);
                    arrayList.clear();
                    g31Var2.f14736r = false;
                    break;
                }
                int size = ca1VarY.size();
                int i15 = 0;
                int i16 = 0;
                while (i16 < size) {
                    e31 e31Var = (e31) ca1VarY.get(i16);
                    if (i15 >= g31Var2.f14726g) {
                        g31Var2.b((md) ldVar.e());
                        ldVar.b();
                        ((md) ldVar.f19193b).B();
                        i12 = 0;
                    } else {
                        i12 = i15;
                    }
                    ud udVarZ = vd.z();
                    long j13 = e31Var.f13820a;
                    udVarZ.b();
                    ((vd) udVarZ.f19193b).A(j13);
                    long j14 = e31Var.f13821b;
                    udVarZ.b();
                    ((vd) udVarZ.f19193b).B(j14);
                    long j15 = e31Var.f13824e;
                    udVarZ.b();
                    ((vd) udVarZ.f19193b).E(j15);
                    String str3 = e31Var.f13823d;
                    if (str3 != null) {
                        udVarZ.b();
                        ((vd) udVarZ.f19193b).F(str3);
                    }
                    Throwable th2 = e31Var.f13822c;
                    int i17 = th2 == null ? 2 : 3;
                    udVarZ.b();
                    ((vd) udVarZ.f19193b).G(i17);
                    if (th2 != null) {
                        String name = th2.getClass().getName();
                        udVarZ.b();
                        ((vd) udVarZ.f19193b).C(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th2.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                } catch (Throwable th3) {
                                    try {
                                        printWriter.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                try {
                                    stringWriter.close();
                                    break;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (IOException unused3) {
                            string = "";
                        }
                        udVarZ.b();
                        ((vd) udVarZ.f19193b).D(string);
                    }
                    vd vdVar = (vd) udVarZ.e();
                    ldVar.b();
                    ((md) ldVar.f19193b).A(vdVar);
                    i16++;
                    i15 = i12 + 1;
                }
                if (i15 > 0) {
                    g31Var2.b((md) ldVar.e());
                    ldVar.b();
                    ((md) ldVar.f19193b).B();
                    return;
                }
                return;
        }
    }
}
