package com.inmobi.media;

import java.util.Map;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class go extends ContinuationImpl {
    public String a;
    public InterfaceC3072m9 b;
    public Map c;
    public String d;
    public Ne e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jo h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(jo joVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = joVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
