package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Kk extends ContinuationImpl {
    public int a;
    public String b;
    public attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Mk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kk(Mk mk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = mk;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
