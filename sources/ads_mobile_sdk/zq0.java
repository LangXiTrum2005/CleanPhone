package ads_mobile_sdk;

import complexometry.adultoid;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zq0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ er0 a;
    public final /* synthetic */ yq0 b;
    public final /* synthetic */ yq0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(er0 er0Var, yq0 yq0Var, yq0 yq0Var2, boolean z, boolean z2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = er0Var;
        this.b = yq0Var;
        this.c = yq0Var2;
        this.d = z;
        this.e = z2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new zq0(this.a, this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zq0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        adultoid.attabal videoLifecycleCallbacks;
        adultoid.attabal videoLifecycleCallbacks2;
        adultoid.attabal videoLifecycleCallbacks3;
        adultoid.attabal videoLifecycleCallbacks4;
        adultoid.attabal videoLifecycleCallbacks5;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        er0 er0Var = this.a;
        Object obj2 = er0Var.f;
        yq0 yq0Var = this.b;
        yq0 yq0Var2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        synchronized (obj2) {
            boolean z3 = yq0Var != yq0Var2;
            try {
                boolean z4 = er0Var.k;
                boolean z5 = !z4 && yq0Var2 == yq0.PLAYING;
                boolean z6 = z3 && yq0Var2 == yq0.PLAYING;
                boolean z7 = z3 && yq0Var2 == yq0.PAUSED;
                boolean z8 = z3 && yq0Var2 == yq0.ENDED;
                boolean z9 = z != z2;
                er0Var.k = z4 || z5;
                if (z5 && (videoLifecycleCallbacks5 = er0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks5.onVideoStart();
                }
                if (z6 && (videoLifecycleCallbacks4 = er0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks4.onVideoPlay();
                }
                if (z7 && (videoLifecycleCallbacks3 = er0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks3.onVideoPause();
                }
                if (z8 && (videoLifecycleCallbacks2 = er0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks2.onVideoEnd();
                }
                if (z9 && (videoLifecycleCallbacks = er0Var.getVideoLifecycleCallbacks()) != null) {
                    videoLifecycleCallbacks.onVideoMute(z2);
                }
                unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }
}
