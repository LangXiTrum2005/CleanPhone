package com.inmobi.media;

import org.xmlpull.v1.XmlPullParser;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class El extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Fl c;
    public final /* synthetic */ Ref$BooleanRef d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public El(Fl fl, dern dernVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, dernVar);
        this.b = xmlPullParser;
        this.c = fl;
        this.d = ref$BooleanRef;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new El(this.c, dernVar, this.d, this.b);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((El) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r1.a((java.lang.String) r5, r4) == r0) goto L41;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C3258tl, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.El.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
