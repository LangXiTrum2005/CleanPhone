package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.common.base.Supplier;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2923c implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        return new DefaultLoadControl(new DefaultAllocator(), 50000, 50000, 2500, 5000);
    }
}
