package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2859dm extends ContinuationImpl {
    public C3135om a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3135om c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2859dm(C3135om c3135om, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
