package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2953he extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3251te b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953he(C3251te c3251te, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3251te;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
