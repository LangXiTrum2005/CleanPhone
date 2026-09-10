package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3053lf extends ContinuationImpl {
    public AdConfig.OmidConfig a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3153pf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3053lf(C3153pf c3153pf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3153pf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
