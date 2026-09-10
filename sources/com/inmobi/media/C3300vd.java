package com.inmobi.media;

import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3300vd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3325wd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3300vd(C3325wd c3325wd, dern dernVar) {
        super(dernVar);
        this.c = c3325wd;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
