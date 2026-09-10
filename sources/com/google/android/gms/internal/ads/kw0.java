package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f16544j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f16545k = new Object();
    public static final Object l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Boolean f16546m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f16548b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mh0 f16552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f16553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h40 f16554h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ow0 f16549c = rw0.A();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16550d = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16555i = false;

    public kw0(Context context, VersionInfoParcel versionInfoParcel, mh0 mh0Var, jq jqVar, h40 h40Var) {
        this.f16547a = context;
        this.f16548b = versionInfoParcel;
        this.f16552f = mh0Var;
        this.f16554h = h40Var;
        if (((Boolean) zzba.zzc().a(am.f12228ka)).booleanValue()) {
            this.f16553g = zzs.zzj();
        } else {
            aa1 aa1Var = ca1.f13122b;
            this.f16553g = ya1.f22208e;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f16544j) {
            try {
                if (f16546m == null) {
                    if (((Boolean) an.f12465b.o()).booleanValue()) {
                        f16546m = Boolean.valueOf(Math.random() < ((Double) an.f12464a.o()).doubleValue());
                    } else {
                        f16546m = Boolean.FALSE;
                    }
                }
                zBooleanValue = f16546m.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void b(hw0 hw0Var) {
        l00.f16608a.a(new gm0(13, this, hw0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = f16545k;
            synchronized (obj) {
                try {
                    if (((rw0) this.f16549c.f19193b).z() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            ow0 ow0Var = this.f16549c;
                            bArrB = ((rw0) ow0Var.e()).b();
                            ow0Var.b();
                            ((rw0) ow0Var.f19193b).C();
                        }
                        il0 il0Var = new il0((String) zzba.zzc().a(am.f12136ea), 60000, new HashMap(), bArrB, CommonGatewayClient.HEADER_PROTOBUF);
                        Context context = this.f16547a;
                        String str = this.f16548b.afmaVersion;
                        Binder.getCallingUid();
                        new vu0(context, str, (Object) null, 20).k(il0Var);
                    } catch (Exception e10) {
                        if ((e10 instanceof ck0) && ((ck0) e10).f13197a == 3) {
                            return;
                        }
                        zzt.zzh().e("CuiMonitor.sendCuiPing", e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
