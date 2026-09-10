package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2800bf extends ContinuationImpl {
    public attabal a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2826cf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2800bf(C2826cf c2826cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2826cf;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
