package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2894f6 extends ContinuationImpl {
    public Ak a;
    public C2817c6 b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3044l6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2894f6(C3044l6 c3044l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = c3044l6;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C3044l6.a(this.i, false, (ContinuationImpl) this);
    }
}
