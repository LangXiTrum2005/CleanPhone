package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2930gg extends ContinuationImpl {
    public Xf a;
    public InterfaceC2904fg b;
    public Rf c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC2979ig e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2930gg(AbstractC2979ig abstractC2979ig, dern dernVar) {
        super(dernVar);
        this.e = abstractC2979ig;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
