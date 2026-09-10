package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17938b;

    public /* synthetic */ ns0(be1 be1Var) {
        this.f17937a = 0;
        be1 be1Var2 = be1.f12743b;
        this.f17938b = be1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws PackageManager.NameNotFoundException {
        Object objZzc;
        Object objC;
        boolean z10 = true;
        switch (this.f17937a) {
            case 0:
                String str = (String) ((be1) this.f17938b).f12745a;
                be1 be1Var = be1.f12743b;
                return new ar0(1, str, null);
            case 1:
                return new mr0((List) ((jq0) this.f17938b).f16150c, 3);
            case 2:
                ((tv0) this.f17938b).mo165zza();
                return null;
            case 3:
                Context context = (Context) ((hz) this.f17938b).f15433b;
                return ps1.q(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 4:
                z21 z21Var = (z21) this.f17938b;
                synchronized (z21Var) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(z21Var.f22476a);
                            try {
                                objC = z21Var.f22478c.c(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (x21 e10) {
                            objZzc = z21Var.f22479d.apply(e10);
                            return objZzc;
                        } catch (FileNotFoundException unused) {
                            objZzc = z21Var.f22478c.zzc();
                            return objZzc;
                        }
                    } catch (IOException e11) {
                        objZzc = z21Var.f22479d.apply(new x21(e11));
                        return objZzc;
                    }
                }
                return objC;
            case 5:
                r31 r31Var = (r31) this.f17938b;
                ((y31) r31Var.f19354c.zzb()).a();
                ((h41) r31Var.f19353b.zzb()).a();
                return null;
            case 6:
                return ((dx1) this.f17938b).zzb();
            case 7:
                f61 f61Var = (f61) this.f17938b;
                a71 a71Var = f61Var.f14271i;
                z21 z21Var2 = f61Var.f14264b;
                z21 z21Var3 = f61Var.f14266d;
                dx1 dx1Var = f61Var.f14268f;
                try {
                    File file = z21Var2.f22476a;
                    File file2 = z21Var2.f22476a;
                    if (file.exists()) {
                        File file3 = ((z21) dx1Var.zzb()).f22476a;
                        File file4 = ((z21) f61Var.f14267e.zzb()).f22476a;
                        try {
                            if (file3.exists()) {
                                File parentFile = file4.getParentFile();
                                if (parentFile != null) {
                                    rb0.G(parentFile);
                                }
                                x10.p(file4);
                                x10.q(file3, file4);
                            }
                            File file5 = z21Var3.f22476a;
                            File file6 = f61Var.f14265c.f22476a;
                            try {
                                if (file5.exists()) {
                                    x10.p(file6);
                                    x10.q(file5, file6);
                                }
                                File file7 = f61Var.f14263a.f22476a;
                                try {
                                    if (file.exists()) {
                                        x10.p(file7);
                                        x10.q(file, file7);
                                    }
                                    file2.delete();
                                    ((z21) dx1Var.zzb()).f22476a.delete();
                                    z21Var3.f22476a.delete();
                                } catch (IOException | SecurityException e12) {
                                    a71Var.d(e12, 15313);
                                    z21Var2.f22476a.delete();
                                    ((z21) dx1Var.zzb()).f22476a.delete();
                                    z21Var3.f22476a.delete();
                                    z10 = false;
                                }
                            } catch (IOException | SecurityException e13) {
                                a71Var.d(e13, 15312);
                            }
                            break;
                        } catch (IOException | SecurityException e14) {
                            a71Var.d(e14, 15311);
                        }
                        return new Boolean(z10);
                    }
                    file2.delete();
                    ((z21) dx1Var.zzb()).f22476a.delete();
                    z21Var3.f22476a.delete();
                    z10 = false;
                    return new Boolean(z10);
                } catch (Throwable th4) {
                    z21Var2.f22476a.delete();
                    ((z21) dx1Var.zzb()).f22476a.delete();
                    z21Var3.f22476a.delete();
                    throw th4;
                }
            case 8:
                q61 q61Var = (q61) this.f17938b;
                lx lxVar = new lx(q61Var, 13);
                synchronized (q61Var) {
                    a71 a71Var2 = q61Var.f18951b;
                    gd1 gd1VarZ = zw1.z(android.support.v4.media.session.a.p(new iw0(5, q61Var.f18950a, q61Var.f18952c)), lxVar, q61Var.f18953d);
                    a71Var2.e(52, gd1VarZ);
                    q61Var.f18955f = gd1VarZ;
                    break;
                }
                return "";
            case 9:
                Context context2 = ((r61) this.f17938b).f19436a;
                try {
                    return ps1.q(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                w61 w61Var = (w61) this.f17938b;
                w61Var.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                w61Var.f21431a.registerReceiver(w61Var, intentFilter);
                return null;
        }
    }

    public /* synthetic */ ns0(Object obj, int i10) {
        this.f17937a = i10;
        this.f17938b = obj;
    }
}
