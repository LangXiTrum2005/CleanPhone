package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3209rm extends ContinuationImpl {
    public AdConfig.VastVideoConfig a;
    public /* synthetic */ Object b;
    public int c;

    public C3209rm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return AbstractC3334wm.a(null, 0.0d, null, this);
    }
}
