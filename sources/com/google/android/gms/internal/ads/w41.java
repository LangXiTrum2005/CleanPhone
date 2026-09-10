package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a71 f21409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y31 f21410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21412e;

    public w41(Context context, a71 a71Var, y31 y31Var, h21 h21Var) {
        this.f21408a = context;
        this.f21409b = a71Var;
        this.f21410c = y31Var;
        this.f21411d = h21Var.Q();
        this.f21412e = h21Var.i0();
    }

    public final String a(long j10) {
        boolean z10;
        String strEncodeToString = "E";
        Context context = this.f21408a;
        y61 y61VarA = this.f21409b.a(55);
        try {
            y61VarA.a();
            qe qeVarZ = re.z();
            String str = this.f21411d;
            qeVarZ.b();
            ((re) qeVarZ.f19193b).B(str);
            qeVarZ.b();
            ((re) qeVarZ.f19193b).A("0.893135394");
            String packageName = context.getPackageName();
            qeVarZ.b();
            ((re) qeVarZ.f19193b).D(packageName);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            qeVarZ.b();
            ((re) qeVarZ.f19193b).C(jCurrentTimeMillis);
            long jCurrentTimeMillis2 = (System.currentTimeMillis() - j10) / 1000;
            qeVarZ.b();
            ((re) qeVarZ.f19193b).F(jCurrentTimeMillis2);
            if (this.f21412e) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(signatureArr[0].toByteArray());
                        StringBuilder sb2 = new StringBuilder();
                        for (byte b10 : bArrDigest) {
                            String hexString = Integer.toHexString(b10 & 255);
                            if (hexString.length() == 1) {
                                sb2.append('0');
                            }
                            sb2.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                qeVarZ.b();
                ((re) qeVarZ.f19193b).G(strEncodeToString);
            }
            try {
                long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                qeVarZ.b();
                ((re) qeVarZ.f19193b).E(j11);
            } catch (PackageManager.NameNotFoundException unused2) {
                qeVarZ.b();
                ((re) qeVarZ.f19193b).E(-1L);
            }
            y31 y31Var = this.f21410c;
            synchronized (y31Var) {
                z10 = y31Var.f22096d;
            }
            if (!z10) {
                y31Var.a();
            }
            ue ueVarD = y31Var.d(null, ((re) qeVarZ.e()).b());
            ueVarD.b();
            ((ve) ueVarD.f19193b).C(5);
            ueVarD.b();
            ((ve) ueVarD.f19193b).D(2);
            byte[] bArrB = ((ve) ueVarD.e()).b();
            pb1 pb1Var = rb1.f19514e;
            if (pb1Var.f19517b != null) {
                pb1Var = new pb1(pb1Var.f19516a, (Character) null);
            }
            String strG = pb1Var.g(bArrB.length, bArrB);
            y61VarA.c();
            return strG;
        } catch (Throwable th2) {
            try {
                y61VarA.b(th2);
                throw th2;
            } catch (Throwable th3) {
                y61VarA.c();
                throw th3;
            }
        }
    }
}
