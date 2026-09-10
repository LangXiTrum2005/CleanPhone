package com.inmobi.media;

import android.widget.FrameLayout;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3182qj extends SuspendLambda implements Function2 {
    public final /* synthetic */ C3331wj a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182qj(C3331wj c3331wj, FrameLayout frameLayout, dern dernVar) {
        super(2, dernVar);
        this.a = c3331wj;
        this.b = frameLayout;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3182qj(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3182qj(this.a, this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        C3097n9 c3097n9 = this.a.e;
        if (c3097n9 != null) {
            c3097n9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        AbstractC3310vn.a(this.a.g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.b.addView(this.a.g, layoutParams);
        return Unit.f29295attabal;
    }
}
