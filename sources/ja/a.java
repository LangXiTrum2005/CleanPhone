package ja;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k9.c0;
import p9.d;
import p9.e;
import r9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f43756n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f43757o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f43758p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f43760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f43762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f43764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public aa.a f43766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p9.b f43767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f43768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f43769k;
    public final AtomicInteger l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f43770m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f43759a = new Object();
        this.f43761c = 0;
        this.f43764f = new HashSet();
        this.f43765g = true;
        this.f43767i = p9.b.f48278a;
        this.f43769k = new HashMap();
        this.l = new AtomicInteger(0);
        c0.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f43766h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f43768j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f43768j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new aa.b(sb2.toString(), 0);
        }
        this.f43760b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = e.f48289a;
        synchronized (e.class) {
            Boolean bool = e.f48291c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = b0.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                e.f48291c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            packageName = d.a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoD = c.a(context).d(0, packageName);
                    if (applicationInfoD == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = applicationInfoD.uid;
                        workSource = new WorkSource();
                        Method method2 = e.f48290b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e10) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                            }
                        } else {
                            Method method3 = e.f48289a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e11) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f43760b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                    Log.wtf("WakeLock", e12.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f43757o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f43758p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f43757o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f43757o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f43770m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j10) {
        this.l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f43756n), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f43759a) {
            try {
                if (!b()) {
                    this.f43766h = aa.a.f3447a;
                    this.f43760b.acquire();
                    this.f43767i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f43761c++;
                if (this.f43765g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f43769k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f43769k.put(null, bVar);
                }
                bVar.f43771a++;
                this.f43767i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j11 > this.f43763e) {
                    this.f43763e = j11;
                    ScheduledFuture scheduledFuture = this.f43762d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f43762d = this.f43770m.schedule(new a0(this, 25), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f43759a) {
            z10 = this.f43761c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f43768j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f43759a) {
            try {
                if (this.f43765g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f43769k.containsKey(null)) {
                    b bVar = (b) this.f43769k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f43771a - 1;
                        bVar.f43771a = i10;
                        if (i10 == 0) {
                            this.f43769k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f43768j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f43764f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f43759a) {
            try {
                if (b()) {
                    if (this.f43765g) {
                        int i10 = this.f43761c - 1;
                        this.f43761c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f43761c = 0;
                    }
                    d();
                    Iterator it = this.f43769k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f43771a = 0;
                    }
                    this.f43769k.clear();
                    ScheduledFuture scheduledFuture = this.f43762d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f43762d = null;
                        this.f43763e = 0L;
                    }
                    if (this.f43760b.isHeld()) {
                        try {
                            try {
                                this.f43760b.release();
                                if (this.f43766h != null) {
                                    this.f43766h = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f43768j).concat(" failed to release!"), e10);
                                if (this.f43766h != null) {
                                    this.f43766h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f43766h != null) {
                                this.f43766h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f43768j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
