package com.inmobi.media;

import java.util.Iterator;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2853dg extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2878eg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2853dg(C2878eg c2878eg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c2878eg;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
