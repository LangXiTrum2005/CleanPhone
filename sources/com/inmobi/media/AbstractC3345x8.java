package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3345x8 {
    public static String a;

    static {
        String TAG = AbstractC3345x8.class.getSimpleName();
        a(AbstractC3296v9.a());
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        AbstractC3296v9.a();
    }

    public static String a() {
        boolean zBooleanValue;
        Boolean bool = Tg.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                Tg.b = Boolean.valueOf(eaA.a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            Intrinsics.checkNotNullExpressionValue("x8", "TAG");
            return null;
        }
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C2968i4 c2968i5 = Y3.a;
        if (CollectionsKt.permissivist(((RootConfig) c2968i5.a(RootConfig.class)).getIPAddrTPSupport(), Ki.b)) {
            Intrinsics.checkNotNullExpressionValue("x8", "TAG");
            return a;
        }
        Intrinsics.checkNotNullExpressionValue("x8", "TAG");
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c2968i5.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        boolean zBooleanValue;
        Boolean bool = Tg.b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                Tg.b = Boolean.valueOf(eaA.a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!zBooleanValue) {
            a = str;
            AbstractC3296v9.a(str);
        } else {
            a = null;
            AbstractC3296v9.a(null);
        }
    }
}
