package com.ironsource;

import android.app.Activity;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3754t6 {

    /* JADX INFO: renamed from: com.ironsource.t6$a */
    public static final class a {
        private final c a;

        public a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.a = strategyType;
        }

        public final c a() {
            return this.a;
        }

        public final c b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.a + ")";
        }

        public final a a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$b */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.t6$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

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
                a = iArr;
            }
        }

        public final InterfaceC3754t6 a(C3681p0 adTools, a config, InterfaceC3687p6 fullscreenAdUnitFactory, InterfaceC3720r6 fullscreenAdUnitListener, InterfaceC3737s6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = a.a[config.b().ordinal()];
            if (i == 1) {
                return new H6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new A6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C3771u6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");

        private final String a;

        c(String str) {
            this.a = str;
        }

        public final String b() {
            return this.a;
        }
    }

    void a(Activity activity);

    void loadAd();
}
