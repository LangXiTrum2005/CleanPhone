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

/* JADX INFO: loaded from: classes3.dex */
public final class Bl extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Fl c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ Ref$BooleanRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bl(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, dern dernVar) {
        super(1, dernVar);
        this.b = xmlPullParser;
        this.c = fl;
        this.d = ref$BooleanRef;
        this.e = ref$BooleanRef2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Bl(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Bl) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        boolean z;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            String name = this.b.getName();
            if (Intrinsics.wireman(name, "Error")) {
                C3301ve c3301veA = this.c.a("error", this.b);
                if (c3301veA != null) {
                    this.c.h.add(c3301veA);
                }
            } else if (Intrinsics.wireman(name, "Ad")) {
                Fl fl = this.c;
                XmlPullParser xmlPullParser = this.b;
                fl.getClass();
                try {
                    z = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    this.d.element = true;
                    Fl fl2 = this.c;
                    XmlPullParser xmlPullParser2 = this.b;
                    fl2.getClass();
                    Fl.w(xmlPullParser2);
                    return Unit.f29295attabal;
                }
                Ref$BooleanRef ref$BooleanRef = this.e;
                if (ref$BooleanRef.element) {
                    Fl fl3 = this.c;
                    XmlPullParser xmlPullParser3 = this.b;
                    fl3.getClass();
                    Fl.w(xmlPullParser3);
                    return Unit.f29295attabal;
                }
                ref$BooleanRef.element = true;
                Fl fl4 = this.c;
                XmlPullParser xmlPullParser4 = this.b;
                this.a = 1;
                if (Fl.a(fl4, xmlPullParser4, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                Fl fl5 = this.c;
                XmlPullParser xmlPullParser5 = this.b;
                fl5.getClass();
                Fl.w(xmlPullParser5);
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
