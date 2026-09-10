package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3028kf {
    public static final /* synthetic */ int a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(AbstractC3028kf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th) {
            th.getStackTrace();
            return false;
        }
    }
}
