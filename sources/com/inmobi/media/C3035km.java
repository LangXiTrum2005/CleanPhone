package com.inmobi.media;

import java.util.Map;
import kotlinx.coroutines.impromptu;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3035km extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3135om c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3035km(C3135om c3135om, dern dernVar) {
        super(2, dernVar);
        this.c = c3135om;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C3035km c3035km = new C3035km(this.c, dernVar);
        c3035km.b = obj;
        return c3035km;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3035km c3035km = new C3035km(this.c, (dern) obj2);
        c3035km.b = (Rl) obj;
        return c3035km.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objCompetently;
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            Rl rl = (Rl) this.b;
            C3135om c3135om = this.c;
            this.a = 1;
            if (c3135om.c.b.isEmpty()) {
                C3097n9 c3097n9 = c3135om.e;
                if (c3097n9 != null) {
                    c3097n9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                objCompetently = Unit.f29295attabal;
            } else {
                if (c3135om.i == null) {
                    c3135om.i = new K3(c3135om.a, c3135om.b, c3135om.c.h, c3135om.e);
                }
                K3 k3 = c3135om.i;
                if ((k3 == null || !Intrinsics.wireman(k3.i, M3.a)) ? false : rl instanceof C2986in) {
                    K3 k4 = c3135om.i;
                    if (k4 != null) {
                        k4.a(c3135om.c.b);
                    }
                } else if (rl instanceof Pl) {
                    K3 k5 = c3135om.i;
                    if (k5 == null) {
                        objCompetently = Unit.f29295attabal;
                    } else if (Intrinsics.wireman(k5.i, L3.a)) {
                        objCompetently = impromptu.competently(premeiotic.dern(), new C3085mm(c3135om, k5, null), this);
                        if (objCompetently != attabal.beachfront()) {
                            objCompetently = Unit.f29295attabal;
                        }
                    } else {
                        C3097n9 c3097n10 = c3135om.e;
                        if (c3097n10 != null) {
                            c3097n10.a("VideoExperienceManager", "Companion Ad is not Available");
                        }
                        Map mapA = AbstractC2983ik.a(c3135om.c.h.a);
                        Wj wj = Wj.a;
                        Wj.b("CompanionAdDropped", mapA, EnumC2779ak.SDK);
                        objCompetently = impromptu.competently(premeiotic.dern(), new C3060lm(k5, null), this);
                        if (objCompetently != attabal.beachfront()) {
                            objCompetently = Unit.f29295attabal;
                        }
                    }
                    if (objCompetently != attabal.beachfront()) {
                        objCompetently = Unit.f29295attabal;
                    }
                }
                objCompetently = Unit.f29295attabal;
            }
            if (objCompetently == objBeachfront) {
                return objBeachfront;
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
