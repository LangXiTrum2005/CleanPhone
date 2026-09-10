package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlinx.coroutines.flow.apical;
import p002kotlin.Unit;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3010jm extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3135om c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3010jm(C3135om c3135om, dern dernVar) {
        super(2, dernVar);
        this.c = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3010jm c3010jm = new C3010jm(this.c, dernVar);
        c3010jm.b = obj;
        return c3010jm;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3010jm c3010jm = new C3010jm(this.c, (dern) obj2);
        c3010jm.b = (Rl) obj;
        return c3010jm.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Rl mediaEvent;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            Rl rl = (Rl) this.b;
            apical apicalVar = this.c.d;
            this.b = rl;
            this.a = 1;
            if (apicalVar.emit(rl, this) == objBeachfront) {
                return objBeachfront;
            }
            mediaEvent = rl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (Rl) this.b;
            p002kotlin.dern.saneness(obj);
        }
        C3186qn c3186qn = this.c.c.g;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Bm) {
            Map mapA = AbstractC2983ik.a(c3186qn.a);
            Wj wj = Wj.a;
            Wj.b("VideoLoadStarted", mapA, EnumC2779ak.SDK);
        } else if (mediaEvent instanceof Em) {
            Map mapA2 = AbstractC2983ik.a(c3186qn.a);
            Wj wj2 = Wj.a;
            Wj.b("VideoLoadSuccess", mapA2, EnumC2779ak.SDK);
        } else if (mediaEvent instanceof C3036kn) {
            boolean[] zArr = c3186qn.b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map mapA3 = AbstractC2983ik.a(c3186qn.a);
                Wj wj3 = Wj.a;
                Wj.b("VideoStart", mapA3, EnumC2779ak.SDK);
            }
        } else if (mediaEvent instanceof C3359xm) {
            boolean[] zArr2 = c3186qn.b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map mapA4 = AbstractC2983ik.a(c3186qn.a);
                Wj wj4 = Wj.a;
                Wj.b("VideoFirstQuartile", mapA4, EnumC2779ak.SDK);
            }
        } else if (mediaEvent instanceof C2986in) {
            boolean[] zArr3 = c3186qn.b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map mapA5 = AbstractC2983ik.a(c3186qn.a);
                Wj wj5 = Wj.a;
                Wj.b("VideoSecondQuartile", mapA5, EnumC2779ak.SDK);
            }
        } else if (mediaEvent instanceof C3210rn) {
            boolean[] zArr4 = c3186qn.b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map mapA6 = AbstractC2983ik.a(c3186qn.a);
                Wj wj6 = Wj.a;
                Wj.b("VideoThirdQuartile", mapA6, EnumC2779ak.SDK);
            }
        } else if (mediaEvent instanceof Pl) {
            boolean[] zArr5 = c3186qn.b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map mapA7 = AbstractC2983ik.a(c3186qn.a);
                Wj wj7 = Wj.a;
                Wj.b("VideoComplete", mapA7, EnumC2779ak.SDK);
            }
        } else if (mediaEvent instanceof Ql) {
            Map mapStratoscope = seminary.stratoscope(AbstractC2983ik.a(c3186qn.a));
            mapStratoscope.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            Wj wj8 = Wj.a;
            Wj.b("VideoLoadFailure", mapStratoscope, EnumC2779ak.SDK);
        }
        Ml ml = this.c.c.f;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Em) {
            ml.a.d = AbstractC2960hl.a(((Em) mediaEvent).a);
            ml.b.f.a(Te.a);
        } else if (mediaEvent instanceof Ql) {
            ml.b.l.a(new Fo(polder.beachfront(formularize.attabal("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (mediaEvent instanceof C3036kn) {
            ml.b.g.a(Te.a);
        } else if (mediaEvent instanceof C2962hn) {
            ml.b.k.a(Te.a);
        } else if (mediaEvent instanceof Om) {
            ml.b.j.a(Te.a);
        } else if (mediaEvent instanceof C3359xm) {
            ml.b.b.a(Te.a);
        } else if (mediaEvent instanceof C2986in) {
            ml.b.c.a(Te.a);
        } else if (mediaEvent instanceof C3210rn) {
            ml.b.d.a(Te.a);
        } else if (mediaEvent instanceof Pl) {
            ml.b.e.a(Te.a);
        } else if (mediaEvent instanceof Xm) {
            ml.a.e = ((Xm) mediaEvent).a;
            ml.b.m.a(Te.a);
        } else if (mediaEvent instanceof S1) {
            if (((S1) mediaEvent).a) {
                ml.b.h.a(Te.a);
            } else {
                ml.b.i.a(Te.a);
            }
        }
        return Unit.f29295attabal;
    }
}
