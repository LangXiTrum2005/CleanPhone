package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2936gm extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C2961hm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2936gm(C2961hm c2961hm, dern dernVar) {
        super(dernVar);
        this.c = c2961hm;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
