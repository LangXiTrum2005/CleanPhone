package com.inmobi.media;

import org.xmlpull.v1.XmlPullParser;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3283ul extends ContinuationImpl {
    public XmlPullParser a;
    public String b;
    public Function1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Fl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3283ul(Fl fl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
