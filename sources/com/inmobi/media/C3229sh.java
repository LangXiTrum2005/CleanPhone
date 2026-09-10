package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3229sh extends ContinuationImpl {
    public AbstractC3142p4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3254th c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3229sh(C3254th c3254th, dern dernVar) {
        super(dernVar);
        this.c = c3254th;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
