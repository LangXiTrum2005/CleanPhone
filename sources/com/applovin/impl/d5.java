package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7735b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7736c = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7737a;

        static {
            int[] iArr = new int[b.values().length];
            f7737a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7737a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7737a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e5 f7742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f7744c;

        public /* synthetic */ c(e5 e5Var, long j10, a aVar) {
            this(e5Var, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f7744c > this.f7743b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public e5 c() {
            return this.f7742a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            e5 e5VarC = c();
            e5 e5VarC2 = cVar.c();
            return e5VarC != null ? e5VarC.equals(e5VarC2) : e5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            e5 e5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (e5VarC == null ? 43 : e5VarC.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb2.append(c());
            sb2.append(", expirationTimeMillis=");
            sb2.append(b());
            sb2.append(", cacheTimestampMillis=");
            return defpackage.e.r(sb2, a(), ")");
        }

        private c(e5 e5Var, long j10) {
            this.f7742a = e5Var;
            this.f7743b = j10;
            this.f7744c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f7743b;
        }

        public long a() {
            return this.f7744c;
        }
    }

    public d5(com.applovin.impl.sdk.l lVar) {
        this.f7734a = lVar;
    }

    public void a(e5 e5Var, f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        if (e5Var == null) {
            return;
        }
        long jV = f5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f7734a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7734a.Q().a("SignalCacheManager", "Caching signal for: " + f5Var);
        }
        String strA = a(f5Var, str, maxAdFormat);
        c cVar = new c(e5Var, jV, null);
        synchronized (this.f7736c) {
            this.f7735b.put(strA, cVar);
        }
    }

    public e5 b(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(f5Var, str, maxAdFormat);
        synchronized (this.f7736c) {
            try {
                c cVar = (c) this.f7735b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f7735b.remove(strA);
                    return null;
                }
                this.f7734a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7734a.Q().a("SignalCacheManager", "Returning cached signal for: " + f5Var);
                }
                return cVar.f7742a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = f5Var.c();
        int i10 = a.f7737a[f5Var.t().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? strC : wi.d.i(strC, "_", str);
        }
        StringBuilder sbJ = d5.u.j(strC, "_");
        sbJ.append(maxAdFormat.getLabel());
        return sbJ.toString();
    }
}
