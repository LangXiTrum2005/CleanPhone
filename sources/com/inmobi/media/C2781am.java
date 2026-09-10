package com.inmobi.media;

import android.widget.FrameLayout;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2781am extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3135om a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2781am(C3135om c3135om, FrameLayout frameLayout, dern dernVar) {
        super(2, dernVar);
        this.a = c3135om;
        this.b = frameLayout;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2781am(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2781am(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3097n9 c3097n9 = this.a.e;
        if (c3097n9 != null) {
            c3097n9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        AbstractC3310vn.a(this.a.j);
        this.b.addView(this.a.j);
        return Unit.f29295attabal;
    }
}
