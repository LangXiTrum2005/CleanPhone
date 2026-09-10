package com.inmobi.media;

import com.inmobi.media.C3304vh;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3304vh {
    public final C2763a4 a;
    public final taiyuan b;

    public C3304vh(C2763a4 configDao) {
        Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.a = configDao;
        this.b = saneness.saneness(new Function0() { // from class: adsuki.collectively
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3304vh.a();
            }
        });
    }

    public static final Bh a() {
        return new Bh((C3271u9) He.b.getValue());
    }

    public static final ArrayList a(C3304vh c3304vh) {
        C3067m4 c3067m4;
        C3067m4 c3067m5;
        C3067m4 c3067m6;
        C3067m4 c3067m7;
        C3067m4 c3067m8;
        ArrayList arrayList = new ArrayList();
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C2968i4 c2968i5 = Y3.a;
        RootConfig rootConfig = (RootConfig) c2968i5.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c2968i5.a(RootConfig.class);
            if (Intrinsics.wireman(RootConfig.class, RootConfig.class)) {
                c3067m8 = new C3067m4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
                Config configA = c2968i5.a(RootConfig.class);
                c3067m8 = new C3067m4(rootConfig2.getUrlForType(configA.getType()), configA);
            }
            arrayList.add(c3067m8);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c2968i5.a(RootConfig.class);
            if (Intrinsics.wireman(AdConfig.class, RootConfig.class)) {
                c3067m7 = new C3067m4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
                Config configA2 = c2968i5.a(AdConfig.class);
                c3067m7 = new C3067m4(rootConfig3.getUrlForType(configA2.getType()), configA2);
            }
            arrayList.add(c3067m7);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c2968i5.a(RootConfig.class);
            if (Intrinsics.wireman(TelemetryConfig.class, RootConfig.class)) {
                c3067m6 = new C3067m4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                Config configA3 = c2968i5.a(TelemetryConfig.class);
                c3067m6 = new C3067m4(rootConfig4.getUrlForType(configA3.getType()), configA3);
            }
            arrayList.add(c3067m6);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c2968i5.a(RootConfig.class);
            if (Intrinsics.wireman(SignalsConfig.class, RootConfig.class)) {
                c3067m5 = new C3067m4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                Config configA4 = c2968i5.a(SignalsConfig.class);
                c3067m5 = new C3067m4(rootConfig5.getUrlForType(configA4.getType()), configA4);
            }
            arrayList.add(c3067m5);
        }
        if (a(rootConfig, CrashConfig.class)) {
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c2968i5.a(RootConfig.class);
            if (Intrinsics.wireman(CrashConfig.class, RootConfig.class)) {
                c3067m4 = new C3067m4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
                Config configA5 = c2968i5.a(CrashConfig.class);
                c3067m4 = new C3067m4(rootConfig6.getUrlForType(configA5.getType()), configA5);
            }
            arrayList.add(c3067m4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class clazz) {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Config configA = Y3.a.a(clazz);
        return configA == null || System.currentTimeMillis() - configA.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(AbstractC3241t4.a(clazz));
    }
}
