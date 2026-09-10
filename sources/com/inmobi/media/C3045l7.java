package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3045l7 extends ContinuationImpl {
    public attabal a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3070m7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3045l7(C3070m7 c3070m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3070m7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
