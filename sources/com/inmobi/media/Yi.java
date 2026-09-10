package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Yi {
    public static final C3180qh a = new C3180qh();
    public static final String b = Yi.class.getSimpleName();

    public static SignalsConfig.IceConfig a() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getIce();
    }
}
