package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3308vl extends ContinuationImpl {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Fl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3308vl(Fl fl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, (ArrayList) null, this);
    }
}
