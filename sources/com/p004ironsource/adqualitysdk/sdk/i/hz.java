package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hz {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f2324;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hy f2325;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hq f2326;

    public static class a {

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private Object f2329;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f2335;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f2336;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Class f2337;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private List<String> f2338;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Class f2339;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private int f2334 = -1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private int f2331 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private int f2333 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private int f2330 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private int f2332 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private int f2328 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private boolean f2327 = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2335 != aVar.f2335 || this.f2334 != aVar.f2334 || this.f2331 != aVar.f2331 || this.f2333 != aVar.f2333 || this.f2330 != aVar.f2330 || this.f2332 != aVar.f2332 || this.f2328 != aVar.f2328 || this.f2327 != aVar.f2327) {
                    return false;
                }
                Class cls = this.f2336;
                if (cls == null ? aVar.f2336 != null : !cls.equals(aVar.f2336)) {
                    return false;
                }
                Class cls2 = this.f2337;
                if (cls2 == null ? aVar.f2337 != null : !cls2.equals(aVar.f2337)) {
                    return false;
                }
                Class cls3 = this.f2339;
                if (cls3 == null ? aVar.f2339 != null : !cls3.equals(aVar.f2339)) {
                    return false;
                }
                List<String> list = this.f2338;
                if (list == null ? aVar.f2338 != null : !list.equals(aVar.f2338)) {
                    return false;
                }
                Object obj2 = this.f2329;
                Object obj3 = aVar.f2329;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2336;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2337;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2339;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2338;
            int iHashCode4 = (((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2335) * 31) + this.f2334) * 31) + this.f2331) * 31) + this.f2333) * 31) + this.f2330) * 31) + this.f2332) * 31) + this.f2328) * 31) + (this.f2327 ? 1 : 0)) * 31;
            Object obj = this.f2329;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private hz f2340 = new hz(0);

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final d m2366(int i2) {
            this.f2340.f2324.f2332 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final d m2367(int i2) {
            this.f2340.f2324.f2333 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final d m2369(int i2) {
            this.f2340.f2324.f2334 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final d m2372(int i2) {
            this.f2340.f2324.f2330 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final d m2375(int i2) {
            this.f2340.f2324.f2331 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final d m2377(int i2) {
            this.f2340.f2324.f2328 = i2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final d m2368(boolean z2) {
            this.f2340.f2324.f2327 = z2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final d m2370(Object obj) {
            this.f2340.f2324.f2329 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hz m2374(hy hyVar, hq hqVar, List<String> list, int i2) {
            this.f2340.f2325 = hyVar;
            this.f2340.f2326 = hqVar;
            this.f2340.f2324.f2338 = list;
            this.f2340.f2324.f2335 = i2;
            this.f2340.f2324.f2337 = hyVar.getClass();
            this.f2340.f2324.f2339 = hqVar != null ? hqVar.getClass() : null;
            return this.f2340;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final d m2376(boolean z2) {
            this.f2340.f2324.f2331 = z2 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final hz m2379(hy hyVar, List<String> list, int i2) {
            return m2374(hyVar, null, list, i2);
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final d m2371(boolean z2) {
            this.f2340.f2324.f2332 = z2 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final d m2378(boolean z2) {
            this.f2340.f2324.f2330 = z2 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final d m2373(boolean z2) {
            this.f2340.f2324.f2328 = z2 ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    public /* synthetic */ hz(byte b2) {
        this();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2330(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2339(int i2) {
        return m2330(i2, this.f2324.f2328);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2342() {
        return this.f2324.f2338;
    }

    private hz() {
        this.f2324 = new a();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hy m2334() {
        return this.f2325;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m2335() {
        return this.f2324.f2335;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2338() {
        return this.f2324.f2327;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2343(int i2) {
        return m2330(i2, this.f2324.f2330);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2333(int i2) {
        if (m2330(i2, this.f2324.f2331)) {
            return this.f2324.f2333;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2336(int i2) {
        return m2330(i2, this.f2324.f2332);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final a m2337(Class cls) {
        this.f2324.f2336 = cls;
        return this.f2324;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final hq m2340() {
        return this.f2326;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2341(int i2) {
        return m2330(i2, this.f2324.f2334);
    }
}
