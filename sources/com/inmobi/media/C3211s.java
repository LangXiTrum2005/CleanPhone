package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3211s extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3311w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3211s(C3311w c3311w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c3311w;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return C3311w.a(this.b, null, null, 0, this);
    }
}
