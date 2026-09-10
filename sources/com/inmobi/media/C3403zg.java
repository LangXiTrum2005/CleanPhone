package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3403zg {
    public final Ea a;

    public C3403zg(Context context, String sharePrefFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.b;
        this.a = Da.a(context, sharePrefFile);
    }

    public final String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Ea ea = this.a;
        ea.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return ea.a.getString(key, null);
    }
}
