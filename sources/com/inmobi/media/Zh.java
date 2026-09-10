package com.inmobi.media;

import formularization.attabal;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Zh extends SuspendLambda implements Function2 {
    public attabal a;
    public GestureDetectorOnGestureListenerC2829ci b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, dern dernVar) {
        super(2, dernVar);
        this.e = gestureDetectorOnGestureListenerC2829ci;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        Zh zh = new Zh(this.e, dernVar);
        zh.d = obj;
        return zh;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Zh zh = new Zh(this.e, (dern) obj2);
        zh.d = (saran) obj;
        return zh.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        saran saranVar;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci;
        attabal attabalVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            saran saranVar2 = (saran) this.d;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = this.e;
            attabal attabalVar2 = gestureDetectorOnGestureListenerC2829ci2.y;
            this.d = saranVar2;
            this.a = attabalVar2;
            this.b = gestureDetectorOnGestureListenerC2829ci2;
            this.c = 1;
            if (attabalVar2.attabal(null, this) == objBeachfront) {
                return objBeachfront;
            }
            saranVar = saranVar2;
            gestureDetectorOnGestureListenerC2829ci = gestureDetectorOnGestureListenerC2829ci2;
            attabalVar = attabalVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC2829ci = this.b;
            attabalVar = this.a;
            saranVar = (saran) this.d;
            p002kotlin.dern.saneness(obj);
        }
        try {
            if (Intrinsics.wireman("Loading", gestureDetectorOnGestureListenerC2829ci.z)) {
                InterfaceC3072m9 interfaceC3072m9 = gestureDetectorOnGestureListenerC2829ci.i;
                if (interfaceC3072m9 != null) {
                    String str = GestureDetectorOnGestureListenerC2829ci.g1;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                    ((C3097n9) interfaceC3072m9).a(str, "updateWebViewLoaded " + saranVar);
                }
                gestureDetectorOnGestureListenerC2829ci.getListener().g(gestureDetectorOnGestureListenerC2829ci);
                gestureDetectorOnGestureListenerC2829ci.setAndUpdateViewState("Default");
                InterfaceC3072m9 interfaceC3072m10 = gestureDetectorOnGestureListenerC2829ci.i;
                if (interfaceC3072m10 != null) {
                    String str2 = GestureDetectorOnGestureListenerC2829ci.g1;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                    ((C3097n9) interfaceC3072m10).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC2829ci.getViewState());
                }
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
