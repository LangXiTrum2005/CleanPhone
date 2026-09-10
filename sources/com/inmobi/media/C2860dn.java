package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2860dn extends ContinuationImpl {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C2911fn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2860dn(C2911fn c2911fn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2911fn;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C2911fn.a(this.d, this);
    }
}
