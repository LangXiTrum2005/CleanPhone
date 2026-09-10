package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2881ej extends ContinuationImpl {
    public InterfaceC2830cj a;
    public InterfaceC2830cj b;
    public attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC2907fj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881ej(AbstractC2907fj abstractC2907fj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = abstractC2907fj;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
