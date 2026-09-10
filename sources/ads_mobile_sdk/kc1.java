package ads_mobile_sdk;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.immediately;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import saneness.euthanasia;
import saneness.ganefo;
import saneness.industrialist;
import saneness.neurotropism;
import saneness.skyjacking;
import saneness.tower;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements neurotropism, ventriculoatrial, euthanasia {
    public static final kq t = (kq) kq.o().attabal(iq.ADSHIELD).a();
    public final Context a;
    public final skyjacking b;
    public final ExecutorService c;
    public final industrialist d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final long k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object m = new Object();
    public final Object n = new Object();
    public final Object o = new Object();
    public final tower p = o5.o();
    public final ArrayList q = new ArrayList();
    public boolean r = false;
    public final HashMap s = new HashMap();

    public kc1(Context context, skyjacking skyjackingVar, ExecutorService executorService, industrialist industrialistVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.a = context;
        this.b = skyjackingVar;
        this.c = executorService;
        this.d = industrialistVar;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.k = j3;
        this.e = random.nextDouble() < d;
    }

    public final long a(int i) {
        long jLongValue;
        synchronized (this.o) {
            try {
                Long l = (Long) this.s.get(Integer.valueOf(i));
                if (l == null) {
                    l = 0L;
                }
                jLongValue = l.longValue() + 1;
                this.s.put(Integer.valueOf(i), Long.valueOf(jLongValue));
            } catch (Throwable th) {
                throw th;
            }
        }
        return jLongValue;
    }

    public final void b() {
        vc0 vc0Var;
        if (!this.e || this.l.getAndSet(true)) {
            return;
        }
        Context context = this.a;
        String str = this.j;
        double d = this.i;
        long j = this.k;
        Locale locale = Locale.getDefault();
        tower towerVarTaiyuan = o5.o().attabal(Build.VERSION.SDK_INT).monoploid(Build.MODEL).kowloon(locale.getLanguage()).apical(locale.getCountry()).formularize(str).competently(context.getPackageName()).taiyuan(j);
        if (d > 0.0d) {
            towerVarTaiyuan.triweekly((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            towerVarTaiyuan.impromptu(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                vc0Var = vc0.DEVICE_TYPE_AUTO;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                vc0Var = vc0.DEVICE_TYPE_WATCH;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                vc0Var = vc0.DEVICE_TYPE_PC;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                vc0Var = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? vc0.DEVICE_TYPE_PHONE : vc0.DEVICE_TYPE_TV;
            }
            towerVarTaiyuan.dern(vc0Var);
        } catch (RuntimeException unused2) {
        }
        o5 o5Var = (o5) towerVarTaiyuan.a();
        synchronized (this.m) {
            tower towerVar = this.p;
            if (!towerVar.a.equals(o5Var)) {
                towerVar.b();
                vm0.a(towerVar.b, o5Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        xm0 xm0Var;
        tower towerVar;
        ImmutableList immutableListCopyOf;
        String string;
        synchronized (this.m) {
            try {
                tower towerVar2 = this.p;
                vm0 vm0Var = (vm0) towerVar2.a.a(5, (xm0) null);
                if (towerVar2.b.j()) {
                    towerVar2.b.k();
                    xm0Var = towerVar2.b;
                } else {
                    xm0Var = towerVar2.b;
                }
                vm0Var.b = xm0Var;
                towerVar = (tower) vm0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            immutableListCopyOf = ImmutableList.copyOf((Collection) this.q);
            this.q.clear();
            this.r = false;
        }
        immediately it = immutableListCopyOf.iterator();
        int i = 0;
        while (it.hasNext()) {
            jc1 jc1Var = (jc1) it.next();
            if (i >= this.g) {
                a((o5) towerVar.a());
                towerVar.impassible();
                i = 0;
            }
            ganefo ganefoVarAttabal = zb1.o().marial(jc1Var.a).competently(jc1Var.b).attabal(jc1Var.e);
            String str = jc1Var.d;
            if (str != null) {
                ganefoVarAttabal.wireman(str);
            }
            Throwable th2 = jc1Var.c;
            ganefoVarAttabal.dern(th2 == null ? nv2.STATUS_SUCCESS : nv2.STATUS_FAIL);
            if (th2 != null) {
                ganefo ganefoVarBeachfront = ganefoVarAttabal.beachfront(th2.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th2.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                            ganefoVarBeachfront.impromptu(string);
                        } catch (Throwable th3) {
                            try {
                                printWriter.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (IOException unused) {
                    string = "";
                }
            }
            towerVar.wireman((zb1) ganefoVarAttabal.a());
            i++;
        }
        if (i > 0) {
            a((o5) towerVar.a());
            towerVar.impassible();
        }
    }

    @Override // saneness.ventriculoatrial
    public final adultoid a() {
        return arytenoidectomy.cutely(new Runnable() { // from class: saneness.rollout
            @Override // java.lang.Runnable
            public final void run() {
                this.f37297kowloon.b();
            }
        }, this.c);
    }

    public final void a(int i, long j, Throwable th, String str) {
        if (this.e) {
            synchronized (this.n) {
                try {
                    this.q.add(new jc1(i, j, th, str, a(i)));
                    if (!this.r) {
                        this.r = true;
                        this.b.a(new Runnable() { // from class: saneness.chinaman
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f37093kowloon.c();
                            }
                        }, this.h);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(o5 o5Var) {
        try {
            w5 w5Var = (w5) w5.o().attabal(t).dern((u5) u5.o().attabal(o5Var).a()).a();
            ((kt0) this.d).a(this.f, true, w5Var.a(), CommonGatewayClient.HEADER_PROTOBUF);
        } catch (RuntimeException unused) {
        }
    }
}
