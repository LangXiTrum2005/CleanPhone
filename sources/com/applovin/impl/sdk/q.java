package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f9679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9680b = new HashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9681c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9682d = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9683e = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9686c;

        public a(String str, String str2, String str3) {
            this.f9684a = str;
            this.f9685b = str2;
            this.f9686c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f9684a;
        }

        public String c() {
            return this.f9686c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int i10 = (iHashCode + 59) * 59;
            int iHashCode2 = strA == null ? 43 : strA.hashCode();
            String strC = c();
            return ((i10 + iHashCode2) * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f9685b;
        }
    }

    public q(l lVar) {
        this.f9679a = lVar.Q();
    }

    public String a(String str) {
        return (String) this.f9683e.get(str);
    }

    public void b(a3 a3Var) {
        this.f9682d.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void c(a3 a3Var) {
        synchronized (this.f9681c) {
            try {
                if (p.a()) {
                    this.f9679a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + a3Var);
                }
                this.f9680b.put(a3Var.getAdUnitId(), new a(a3Var.C(), a3Var.c(), a3Var.getNetworkName()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9683e.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void a(a3 a3Var) {
        synchronized (this.f9681c) {
            try {
                String adUnitId = a3Var.getAdUnitId();
                a aVar = (a) this.f9680b.get(adUnitId);
                if (aVar == null) {
                    if (p.a()) {
                        this.f9679a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (a3Var.C().equals(aVar.b())) {
                    if (p.a()) {
                        this.f9679a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f9680b.remove(adUnitId);
                } else if (p.a()) {
                    this.f9679a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + a3Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String b(String str) {
        return (String) this.f9682d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f9681c) {
            aVar = (a) this.f9680b.get(str);
        }
        return aVar;
    }
}
