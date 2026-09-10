package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3864ze implements I8 {
    @Override // com.ironsource.I8
    public void a(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, i);
    }

    @Override // com.ironsource.I8
    public int b(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, i);
    }

    @Override // com.ironsource.I8
    public void a(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.b(context, key, j);
    }

    @Override // com.ironsource.I8
    public long b(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.a(context, key, j);
    }
}
