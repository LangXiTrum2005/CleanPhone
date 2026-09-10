package com.smartdigimkt.i7;

import android.text.TextUtils;
import com.smartdigimkt.w6.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35856e = "b";
    private static volatile b f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35857a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35858b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f35859c = new ConcurrentHashMap();
    private final Map<String, k> d = new ConcurrentHashMap();

    private b() {
    }

    public static b b() {
        if (f == null) {
            synchronized (b.class) {
                try {
                    if (f == null) {
                        f = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    private boolean c(com.smartdigimkt.a7.a aVar) {
        return aVar.W() == 66;
    }

    private boolean d(com.smartdigimkt.a7.a aVar) {
        return aVar == null || TextUtils.isEmpty(aVar.Y()) || TextUtils.isEmpty(aVar.a0());
    }

    private boolean e(com.smartdigimkt.a7.a aVar) {
        try {
            String strI = aVar.I();
            return !TextUtils.isEmpty(strI) && strI.equals("0");
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void a(int i2, com.smartdigimkt.a7.a aVar) {
        if (d(aVar)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 != 4) {
            if (i2 != 6) {
                return;
            }
            aVar.a(jCurrentTimeMillis);
        } else {
            if (!e(aVar)) {
                this.f35857a = jCurrentTimeMillis;
            }
            aVar.g(jCurrentTimeMillis);
        }
    }

    public void f(String str, long j) {
        a(str).f39565b = j;
    }

    public void g(String str, long j) {
        a(str).f39564a = j;
    }

    public void c(String str, long j) {
        a(str).d = j;
    }

    public void d(String str, long j) {
        a(str).g = j;
    }

    public void e(String str, long j) {
        a(str).f = j;
    }

    public void a(com.smartdigimkt.a7.c cVar, com.smartdigimkt.a7.a aVar) {
        if (cVar == null || d(aVar)) {
            return;
        }
        String str = cVar.f33765a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!str.equals("1004634") || e(aVar)) {
            return;
        }
        this.f35858b = jCurrentTimeMillis;
        this.f35859c.put(aVar.Y(), Long.valueOf(jCurrentTimeMillis));
    }

    public long b(com.smartdigimkt.a7.a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.Y())) {
            long jB = aVar.B();
            Long l2 = this.f35859c.get(aVar.Y());
            if (l2 != null && l2.longValue() != 0 && jB != 0) {
                return jB - l2.longValue();
            }
        }
        return 0L;
    }

    public void b(String str, long j) {
        a(str).f39567e = j;
    }

    public long a() {
        long j = this.f35858b;
        if (j != 0) {
            long j2 = this.f35857a;
            if (j2 != 0) {
                return j2 - j;
            }
        }
        return 0L;
    }

    public void b(String str) {
        this.d.remove(str);
    }

    public long a(com.smartdigimkt.a7.a aVar) {
        if (aVar == null) {
            return 0L;
        }
        return aVar.p() - aVar.B();
    }

    public String a(com.smartdigimkt.v6.a aVar) {
        return aVar.f + "_ " + aVar.f39166e;
    }

    public k a(String str) {
        k kVar = this.d.get(str);
        if (kVar != null) {
            return kVar;
        }
        synchronized (this.d) {
            if (kVar == null) {
                try {
                    kVar = new k();
                    this.d.put(str, kVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kVar;
    }

    public void a(String str, long j) {
        a(str).f39566c = j;
    }
}
