package dd;

import cc.a2;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fd.a f38804d = fd.a.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f38805e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f38806a = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public md.c f38807b = new md.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f38808c = w.b();

    public static synchronized a e() {
        try {
            if (f38805e == null) {
                f38805e = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38805e;
    }

    public static boolean l(long j10) {
        return j10 >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.6")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j10) {
        return j10 >= 0;
    }

    public static boolean p(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final md.d a(a2 a2Var) {
        w wVar = this.f38808c;
        String strR = a2Var.r();
        if (strR == null) {
            wVar.getClass();
            w.f38830c.a("Key is null when getting boolean value on device cache.");
            return new md.d();
        }
        if (wVar.f38832a == null) {
            wVar.c(w.a());
            if (wVar.f38832a == null) {
                return new md.d();
            }
        }
        if (!wVar.f38832a.contains(strR)) {
            return new md.d();
        }
        try {
            return new md.d(Boolean.valueOf(wVar.f38832a.getBoolean(strR, false)));
        } catch (ClassCastException e10) {
            w.f38830c.b("Key %s from sharedPreferences has type other than long: %s", strR, e10.getMessage());
            return new md.d();
        }
    }

    public final md.d b(a2 a2Var) {
        w wVar = this.f38808c;
        String strR = a2Var.r();
        if (strR == null) {
            wVar.getClass();
            w.f38830c.a("Key is null when getting double value on device cache.");
            return new md.d();
        }
        if (wVar.f38832a == null) {
            wVar.c(w.a());
            if (wVar.f38832a == null) {
                return new md.d();
            }
        }
        if (!wVar.f38832a.contains(strR)) {
            return new md.d();
        }
        try {
            try {
                return new md.d(Double.valueOf(Double.longBitsToDouble(wVar.f38832a.getLong(strR, 0L))));
            } catch (ClassCastException unused) {
                return new md.d(Double.valueOf(Float.valueOf(wVar.f38832a.getFloat(strR, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).doubleValue()));
            }
        } catch (ClassCastException e10) {
            w.f38830c.b("Key %s from sharedPreferences has type other than double: %s", strR, e10.getMessage());
            return new md.d();
        }
    }

    public final md.d c(a2 a2Var) {
        w wVar = this.f38808c;
        String strR = a2Var.r();
        if (strR == null) {
            wVar.getClass();
            w.f38830c.a("Key is null when getting long value on device cache.");
            return new md.d();
        }
        if (wVar.f38832a == null) {
            wVar.c(w.a());
            if (wVar.f38832a == null) {
                return new md.d();
            }
        }
        if (!wVar.f38832a.contains(strR)) {
            return new md.d();
        }
        try {
            return new md.d(Long.valueOf(wVar.f38832a.getLong(strR, 0L)));
        } catch (ClassCastException e10) {
            w.f38830c.b("Key %s from sharedPreferences has type other than long: %s", strR, e10.getMessage());
            return new md.d();
        }
    }

    public final md.d d(a2 a2Var) {
        w wVar = this.f38808c;
        String strR = a2Var.r();
        if (strR == null) {
            wVar.getClass();
            w.f38830c.a("Key is null when getting String value on device cache.");
            return new md.d();
        }
        if (wVar.f38832a == null) {
            wVar.c(w.a());
            if (wVar.f38832a == null) {
                return new md.d();
            }
        }
        if (!wVar.f38832a.contains(strR)) {
            return new md.d();
        }
        try {
            return new md.d(wVar.f38832a.getString(strR, ""));
        } catch (ClassCastException e10) {
            w.f38830c.b("Key %s from sharedPreferences has type other than String: %s", strR, e10.getMessage());
            return new md.d();
        }
    }

    public final Boolean f() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f38809a == null) {
                    b.f38809a = new b();
                }
                bVar = b.f38809a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        md.d dVarH = h(bVar);
        return dVarH.b() ? (Boolean) dVarH.a() : Boolean.FALSE;
    }

    public final Boolean g() {
        if (f().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarV = c.V();
        md.d dVarA = a(cVarV);
        if (dVarA.b()) {
            return (Boolean) dVarA.a();
        }
        md.d dVarH = h(cVarV);
        if (dVarH.b()) {
            return (Boolean) dVarH.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: ClassCastException -> 0x0034, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: ClassCastException -> 0x0034, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0034, blocks: (B:12:0x001e, B:14:0x0028, B:16:0x002e), top: B:21:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final md.d h(a2 a2Var) {
        boolean z10;
        md.c cVar = this.f38807b;
        String strU = a2Var.u();
        if (strU != null) {
            z10 = cVar.f45959a.containsKey(strU);
            if (!z10) {
                return new md.d();
            }
            try {
                Boolean bool = (Boolean) cVar.f45959a.get(strU);
                return bool == null ? new md.d() : new md.d(bool);
            } catch (ClassCastException e10) {
                md.c.f45958b.b("Metadata key %s contains type other than boolean: %s", strU, e10.getMessage());
                return new md.d();
            }
        }
        cVar.getClass();
        if (!z10) {
            return new md.d();
        }
        Boolean bool2 = (Boolean) cVar.f45959a.get(strU);
        if (bool2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final md.d i(a2 a2Var) {
        boolean z10;
        Object obj;
        md.c cVar = this.f38807b;
        String strU = a2Var.u();
        if (strU != null) {
            z10 = cVar.f45959a.containsKey(strU);
            if (!z10) {
                return new md.d();
            }
            obj = cVar.f45959a.get(strU);
            if (obj == null) {
                return new md.d();
            }
            if (obj instanceof Float) {
                return new md.d(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new md.d((Double) obj);
            }
            md.c.f45958b.b("Metadata key %s contains type other than double: %s", strU);
            return new md.d();
        }
        cVar.getClass();
        if (!z10) {
            return new md.d();
        }
        obj = cVar.f45959a.get(strU);
        if (obj == null) {
            return new md.d();
        }
        if (obj instanceof Float) {
            return new md.d(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new md.d((Double) obj);
        }
        md.c.f45958b.b("Metadata key %s contains type other than double: %s", strU);
        return new md.d();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0035, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e A[Catch: ClassCastException -> 0x0035, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0035, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002e), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final md.d j(a2 a2Var) {
        boolean z10;
        md.d dVar;
        Integer num;
        md.c cVar = this.f38807b;
        String strU = a2Var.u();
        if (strU != null) {
            z10 = cVar.f45959a.containsKey(strU);
            if (z10) {
                try {
                    num = (Integer) cVar.f45959a.get(strU);
                    if (num == null) {
                        dVar = new md.d();
                    } else {
                        dVar = new md.d(num);
                    }
                } catch (ClassCastException e10) {
                    md.c.f45958b.b("Metadata key %s contains type other than int: %s", strU, e10.getMessage());
                    dVar = new md.d();
                }
            } else {
                dVar = new md.d();
            }
            return dVar.b() ? new md.d(Long.valueOf(((Integer) dVar.a()).intValue())) : new md.d();
        }
        cVar.getClass();
        if (z10) {
            dVar = new md.d();
        } else {
            num = (Integer) cVar.f45959a.get(strU);
            if (num == null) {
                dVar = new md.d();
            } else {
                dVar = new md.d(num);
            }
        }
        if (dVar.b()) {
        }
    }

    public final long k() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.f38818a == null) {
                    k.f38818a = new k();
                }
                kVar = k.f38818a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f38806a;
        kVar.getClass();
        md.d dVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (dVar.b() && ((Long) dVar.a()).longValue() > 0) {
            this.f38808c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) dVar.a()).longValue();
        }
        md.d dVarC = c(kVar);
        if (!dVarC.b() || ((Long) dVarC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) dVarC.a()).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    public final boolean o() {
        m mVar;
        boolean zBooleanValue;
        boolean z10;
        l lVar;
        boolean zM;
        Boolean boolG = g();
        if (boolG == null || boolG.booleanValue()) {
            synchronized (m.class) {
                try {
                    if (m.f38820a == null) {
                        m.f38820a = new m();
                    }
                    mVar = m.f38820a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            md.d dVarA = a(mVar);
            md.d dVar = this.f38806a.getBoolean("fpr_enabled");
            if (!dVar.b()) {
                zBooleanValue = dVarA.b() ? ((Boolean) dVarA.a()).booleanValue() : true;
            } else if (this.f38806a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean bool = (Boolean) dVar.a();
                if (!dVarA.b() || dVarA.a() != bool) {
                    this.f38808c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                synchronized (l.class) {
                    try {
                        if (l.f38819a == null) {
                            l.f38819a = new l();
                        }
                        lVar = l.f38819a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                md.d dVarD = d(lVar);
                md.d string = this.f38806a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String str = (String) string.a();
                    if (!dVarD.b() || !((String) dVarD.a()).equals(str)) {
                        this.f38808c.f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    zM = m(str);
                } else {
                    zM = dVarD.b() ? m((String) dVarD.a()) : m("");
                }
                if (zM) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
