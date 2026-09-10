package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f22966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f22967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f22968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f22970f = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f22971g = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f22972h = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f22973i = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f22974j = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f22975k = new AtomicReference(new ArrayDeque());
    public final AtomicReference l = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f22965a = new AtomicReference(null);

    public c0(Application application, Executor executor, b0 b0Var, boolean z10) {
        this.f22969e = z10;
        this.f22966b = application;
        this.f22967c = b0Var;
        this.f22968d = executor;
    }

    public final void a(Queue queue, int i10, int i11, String str) {
        Bundle bundle;
        Long l = (Long) queue.poll();
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i10 = i11;
            }
            AtomicReference atomicReference = this.f22975k;
            Queue queue2 = (Queue) atomicReference.get();
            b0 b0Var = this.f22967c;
            Application application = b0Var.f22939a;
            t2 t2VarM = u2.m();
            y1 y1VarM = g2.m();
            b2 b2VarM = c2.m();
            b2VarM.c();
            c2.p((c2) b2VarM.f23223b, i10);
            if (str != null) {
                b2VarM.c();
                c2.n((c2) b2VarM.f23223b, str);
            }
            if (jCurrentTimeMillis > 0) {
                b2VarM.c();
                c2.o((c2) b2VarM.f23223b, jCurrentTimeMillis);
            }
            c2 c2Var = (c2) b2VarM.a();
            y1VarM.c();
            g2.r((g2) y1VarM.f23223b, c2Var);
            String str2 = b0Var.f22943e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    b0Var.f22943e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(b0Var.f22943e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = b0Var.f22943e;
            }
            if (str2 != null) {
                y1VarM.c();
                g2.o((g2) y1VarM.f23223b, str2);
            }
            f2 f2Var = b0Var.f22940b;
            if (f2Var == null) {
                d2 d2VarM = f2.m();
                d2VarM.c();
                f2.n((f2) d2VarM.f23223b);
                f2Var = (f2) d2VarM.a();
                b0Var.f22940b = f2Var;
            }
            y1VarM.c();
            g2.s((g2) y1VarM.f23223b, f2Var);
            a2 a2Var = b0Var.f22942d;
            if (a2Var == null) {
                z1 z1VarM = a2.m();
                int i12 = Build.VERSION.SDK_INT;
                z1VarM.c();
                a2.n((a2) z1VarM.f23223b, i12);
                String str3 = Build.MODEL;
                z1VarM.c();
                a2.o((a2) z1VarM.f23223b);
                z1VarM.c();
                a2.q((a2) z1VarM.f23223b);
                String str4 = Build.VERSION.RELEASE;
                z1VarM.c();
                a2.p((a2) z1VarM.f23223b);
                a2Var = (a2) z1VarM.a();
                b0Var.f22942d = a2Var;
            }
            y1VarM.c();
            g2.q((g2) y1VarM.f23223b, a2Var);
            x1 x1Var = b0Var.f22941c;
            if (x1Var == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    w1 w1VarM = x1.m();
                    String string = Long.toString(packageInfo.getLongVersionCode());
                    w1VarM.c();
                    x1.o((x1) w1VarM.f23223b, string);
                    w1VarM.c();
                    x1.n((x1) w1VarM.f23223b, packageName);
                    b0Var.f22941c = (x1) w1VarM.a();
                }
                x1Var = b0Var.f22941c;
            }
            if (x1Var != null) {
                y1VarM.c();
                g2.p((g2) y1VarM.f23223b, x1Var);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                k0 k0Var = new k0(string2);
                while (k0Var.hasNext()) {
                    String str5 = (String) k0Var.next();
                    y1VarM.c();
                    g2.n((g2) y1VarM.f23223b, str5);
                }
            }
            g2 g2Var = (g2) y1VarM.a();
            t2VarM.c();
            u2.n((u2) t2VarM.f23223b, g2Var);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            t2VarM.c();
            u2.o((u2) t2VarM.f23223b, jCurrentTimeMillis2);
            queue2.add((u2) t2VarM.a());
            if (this.f22969e) {
                ((ArrayDeque) this.l.get()).addAll((Collection) atomicReference.get());
            }
            this.f22968d.execute(new j(this, 2));
        }
    }
}
