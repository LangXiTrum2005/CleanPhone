package com.inmobi.media;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3358xl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ Fl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3358xl(Fl fl, dern dernVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, dernVar);
        this.b = xmlPullParser;
        this.c = ref$BooleanRef;
        this.d = fl;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        XmlPullParser xmlPullParser = this.b;
        return new C3358xl(this.d, dernVar, this.c, xmlPullParser);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3358xl) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, C3258tl, IOException {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            String name = this.b.getName();
            if (Intrinsics.wireman(name, "InLine")) {
                Ref$BooleanRef ref$BooleanRef = this.c;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    this.d.g(this.b);
                }
            } else if (Intrinsics.wireman(name, "Wrapper")) {
                Ref$BooleanRef ref$BooleanRef2 = this.c;
                if (!ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = true;
                    Fl fl = this.d;
                    XmlPullParser xmlPullParser = this.b;
                    this.a = 1;
                    if (Fl.c(fl, xmlPullParser, this) == objBeachfront) {
                        return objBeachfront;
                    }
                }
            } else {
                Fl fl2 = this.d;
                XmlPullParser xmlPullParser2 = this.b;
                fl2.getClass();
                Fl.w(xmlPullParser2);
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
