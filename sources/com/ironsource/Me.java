package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Me implements K8 {
    @Override // com.ironsource.K8
    public void a(Context context, String key, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        IronSourceUtils.b(context, key, i10);
    }

    @Override // com.ironsource.K8
    public int b(Context context, String key, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        return IronSourceUtils.a(context, key, i10);
    }

    @Override // com.ironsource.K8
    public void a(Context context, String key, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        IronSourceUtils.b(context, key, j10);
    }

    @Override // com.ironsource.K8
    public long b(Context context, String key, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        return IronSourceUtils.a(context, key, j10);
    }
}
