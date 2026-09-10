package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3124ob extends ContinuationImpl {
    public String a;
    public attabal b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3149pb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3124ob(C3149pb c3149pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3149pb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
