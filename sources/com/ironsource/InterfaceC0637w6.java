package com.ironsource;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0637w6 {

    /* JADX INFO: renamed from: com.ironsource.w6$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f30923a;

        public a(c strategyType) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            this.f30923a = strategyType;
        }

        public final c a() {
            return this.f30923a;
        }

        public final c b() {
            return this.f30923a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f30923a == ((a) obj).f30923a;
        }

        public int hashCode() {
            return this.f30923a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f30923a + ")";
        }

        public final a a(c strategyType) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f30923a;
            }
            return aVar.a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w6$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.w6$b$a */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30924a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f30924a = iArr;
            }
        }

        public final InterfaceC0637w6 a(C0506p0 adTools, a config, InterfaceC0565s6 fullscreenAdUnitFactory, InterfaceC0601u6 fullscreenAdUnitListener, InterfaceC0619v6 listener) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            kotlin.jvm.internal.n.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            kotlin.jvm.internal.n.f(listener, "listener");
            int i10 = a.f30924a[config.b().ordinal()];
            if (i10 == 1) {
                return new K6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 2) {
                return new D6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 3) {
                return new C0655x6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new aa.b((byte) 0, 20);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w6$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30929a;

        c(String str) {
            this.f30929a = str;
        }

        public final String b() {
            return this.f30929a;
        }
    }

    void a(Activity activity);

    void loadAd();
}
