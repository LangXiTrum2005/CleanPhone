package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3117o4 {
    public final String a = C3117o4.class.getSimpleName();

    public final C3009jl a(C2916g2 configResponseObj, C3067m4 configRequestContext) {
        Integer num;
        Intrinsics.checkNotNullParameter(configResponseObj, "configResponseObj");
        Intrinsics.checkNotNullParameter(configRequestContext, "configRequestContext");
        int iB = configResponseObj.b();
        Config config = configRequestContext.b;
        if (iB == 200) {
            try {
                Config configA = configResponseObj.a();
                if (configA == null) {
                    String tag = this.a;
                    Intrinsics.checkNotNullExpressionValue(tag, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.a;
                    Intrinsics.checkNotNullExpressionValue(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            String tag3 = this.a;
            Intrinsics.checkNotNullExpressionValue(tag3, "tag");
            iB += 1000;
        } else {
            String tag4 = this.a;
            Intrinsics.checkNotNullExpressionValue(tag4, "tag");
            configRequestContext.b.getType();
        }
        return new C3009jl(iB, config);
    }
}
