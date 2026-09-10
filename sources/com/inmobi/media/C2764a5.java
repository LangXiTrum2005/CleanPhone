package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2764a5 {
    public static volatile Network a = null;
    public static volatile boolean b = true;
    public static long c;
    public static long d;
    public static final AtomicBoolean e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.a.a(AdConfig.class)).getCustomNwValidation();
    }
}
