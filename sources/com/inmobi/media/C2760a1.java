package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2760a1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ae a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2760a1(Ae ae, View view, dern dernVar) {
        super(2, dernVar);
        this.a = ae;
        this.b = view;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2760a1(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2760a1(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            AdSession adSession = this.a.c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.b);
            }
        } catch (IllegalArgumentException e) {
            String str = AbstractC2863e1.f;
            Log.getStackTraceString(e);
        }
        return Unit.f29295attabal;
    }
}
