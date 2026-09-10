package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2794b9 extends ContinuationImpl {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2923g9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2794b9(C2923g9 c2923g9, dern dernVar) {
        super(dernVar);
        this.c = c2923g9;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
