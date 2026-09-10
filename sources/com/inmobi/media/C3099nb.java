package com.inmobi.media;

import formularization.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3099nb extends ContinuationImpl {
    public String a;
    public Object b;
    public attabal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3149pb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3099nb(C3149pb c3149pb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3149pb;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
