package com.vungle.ads.internal.util;

import com.ironsource.X3;
import cutwater.trm;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/util/triweekly;", "", "<init>", "()V", "Lcutwater/trm;", "json", "", X3.i.W, "getContentStringValue", "(Lcutwater/trm;Ljava/lang/String;)Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class triweekly {
    public static final triweekly INSTANCE = new triweekly();

    private triweekly() {
    }

    public final String getContentStringValue(trm json, String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return cutwater.cutely.apical((cutwater.impromptu) seminary.cutely(json, key)).getContent();
        } catch (Exception unused) {
            return null;
        }
    }
}
