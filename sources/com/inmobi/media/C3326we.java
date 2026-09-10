package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3326we extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3376ye b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3326we(C3376ye c3376ye, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3376ye;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
