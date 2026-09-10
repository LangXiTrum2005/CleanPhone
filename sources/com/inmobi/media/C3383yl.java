package com.inmobi.media;

import org.xmlpull.v1.XmlPullParser;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3383yl extends ContinuationImpl {
    public Ref$BooleanRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Fl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3383yl(Fl fl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((XmlPullParser) null, this);
    }
}
