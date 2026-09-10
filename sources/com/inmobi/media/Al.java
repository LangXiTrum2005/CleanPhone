package com.inmobi.media;

import org.xmlpull.v1.XmlPullParser;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class Al extends ContinuationImpl {
    public Ref$BooleanRef a;
    public Ref$BooleanRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Fl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Al(Fl fl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Fl.b(this.d, (XmlPullParser) null, this);
    }
}
