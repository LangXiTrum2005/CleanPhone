package com.inmobi.media;

import java.util.List;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2792b7 extends ContinuationImpl {
    public int a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3070m7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2792b7(C3070m7 c3070m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3070m7;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
