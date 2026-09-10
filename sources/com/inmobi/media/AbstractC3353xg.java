package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.WeakHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3353xg extends Sn {
    public final AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3353xg(AdConfig.ViewabilityConfig viewabilityConfig, byte b, InterfaceC3072m9 interfaceC3072m9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b, interfaceC3072m9);
        C3095n7 visibilityChecker = C3170q7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.l = viewabilityConfig;
    }
}
