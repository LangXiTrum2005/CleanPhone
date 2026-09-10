package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3132oj extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3157pj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3132oj(C3157pj c3157pj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3157pj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
