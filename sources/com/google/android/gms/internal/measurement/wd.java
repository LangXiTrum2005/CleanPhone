package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24118a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24120c;

    public /* synthetic */ wd() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24118a) {
            case 0:
                Context context = ((pb) this.f24119b).f23846b;
                oa.s1 s1Var = xd.f24146d;
                if (s1Var == null) {
                    synchronized (xd.f24145c) {
                        s1Var = xd.f24146d;
                        if (s1Var == null) {
                            b2.p pVarD = oa.o0.d();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream inputStreamOpen = assets.open(sb2.toString());
                                                try {
                                                    z0 z0Var = z0.f24189a;
                                                    int i10 = n0.f23760a;
                                                    xd xdVar = new xd(context, yd.w(inputStreamOpen, z0.f24190b));
                                                    pVarD.l(xdVar.f24148b, xdVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        break;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (u1 e10) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e10);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e11) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e11);
                            }
                            oa.s1 s1VarC = pVarD.c(true);
                            xd.f24146d = s1VarC;
                            s1Var = s1VarC;
                        }
                        break;
                    }
                }
                String str2 = (String) this.f24120c;
                if (s1Var.containsKey(str2)) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(str2.length() + 173);
                sb4.append("Config package ");
                sb4.append(str2);
                sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb4.toString());
                return;
            default:
                this.f24119b = null;
                this.f24120c = null;
                return;
        }
    }

    public /* synthetic */ wd(pb pbVar, String str) {
        this.f24119b = pbVar;
        this.f24120c = str;
    }
}
