package com.inmobi.media;

import org.json.JSONException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3173qa extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3297va a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3173qa(C3297va c3297va, dern dernVar) {
        super(2, dernVar);
        this.a = c3297va;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3173qa(this.a, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3173qa(this.a, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        InterfaceC3072m9 interfaceC3072m9 = this.a.c;
        if (interfaceC3072m9 != null) {
            String str = AbstractC3322wa.a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3097n9) interfaceC3072m9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a.a;
        gestureDetectorOnGestureListenerC2829ci.a1 = null;
        C3295v8 c3295v8 = gestureDetectorOnGestureListenerC2829ci.Y0;
        if (c3295v8 != null) {
            c3295v8.a();
        }
        return Unit.f29295attabal;
    }
}
