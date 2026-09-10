package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3029kg extends ContinuationImpl {
    public Rf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3129og c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3029kg(C3129og c3129og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3129og;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
