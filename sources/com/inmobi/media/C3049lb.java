package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3049lb extends ContinuationImpl {
    public attabal a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3074mb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3049lb(C3074mb c3074mb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3074mb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
