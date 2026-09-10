package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3166q3 extends ContinuationImpl {
    public S2 a;
    public C2759a0 b;
    public InterfaceC3072m9 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3315w3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3166q3(C3315w3 c3315w3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3315w3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, null, this);
    }
}
