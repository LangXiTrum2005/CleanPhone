package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3208rl extends ContinuationImpl {
    public int a;
    public Je b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3233sl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3208rl(C3233sl c3233sl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3233sl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
