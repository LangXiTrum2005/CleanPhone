package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3278ug extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3328wg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3278ug(C3328wg c3328wg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3328wg;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C3328wg.a(this.b, this);
    }
}
