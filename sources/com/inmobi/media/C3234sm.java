package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3234sm extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public C3234sm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return AbstractC3334wm.a(null, null, this);
    }
}
