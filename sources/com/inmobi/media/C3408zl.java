package com.inmobi.media;

import org.xmlpull.v1.XmlPullParser;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408zl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ Fl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3408zl(Fl fl, dern dernVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, dernVar);
        this.b = xmlPullParser;
        this.c = ref$BooleanRef;
        this.d = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        XmlPullParser xmlPullParser = this.b;
        return new C3408zl(this.d, dernVar, this.c, xmlPullParser);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3408zl) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            if (Intrinsics.wireman(this.b.getName(), "VAST")) {
                this.c.element = true;
                Fl fl = this.d;
                XmlPullParser xmlPullParser = this.b;
                this.a = 1;
                if (Fl.b(fl, xmlPullParser, this) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
