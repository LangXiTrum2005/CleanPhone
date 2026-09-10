package com.inmobi.media;

import com.inmobi.media.C2950hb;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlinx.coroutines.cutely;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import patroclinal.formularize;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2950hb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C2758a b;
    public final /* synthetic */ AbstractC2975ib c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950hb(C2758a c2758a, AbstractC2975ib abstractC2975ib, dern dernVar) {
        super(2, dernVar);
        this.b = c2758a;
        this.c = abstractC2975ib;
    }

    public static final Unit a(AbstractC2975ib abstractC2975ib, W w) {
        abstractC2975ib.m.a(w);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2950hb(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2950hb(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                C2758a c2758a = this.b;
                final AbstractC2975ib abstractC2975ib = this.c;
                Function1 function1 = new Function1() { // from class: adsuki.curium
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2950hb.a(abstractC2975ib, (W) obj2);
                    }
                };
                this.a = 1;
                obj = c2758a.a(function1, this);
                if (obj == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            AdResponse adResponse = (AdResponse) obj;
            this.c.a.getClass();
            AbstractC2975ib abstractC2975ib2 = this.c;
            AbstractC2837d0.a("native", abstractC2975ib2.d.g, adResponse, abstractC2975ib2.e);
            C3097n9 c3097n9 = this.c.e;
            if (c3097n9 != null) {
                c3097n9.a("AUM-LoadResponseState", "AdResponse Parse Success");
            }
            this.c.a(adResponse);
        } catch (Y e) {
            C3097n9 c3097n10 = this.c.e;
            if (c3097n10 != null) {
                c3097n10.b("AUM-LoadResponseState", "AdResponse Parse Failure " + e);
            }
            AbstractC2975ib abstractC2975ib3 = this.c;
            abstractC2975ib3.getClass();
            V v = e.b;
            if (v instanceof Pi) {
                C3063m0 c3063m0 = abstractC2975ib3.g;
                cutely.wireman(c3063m0.a, null, null, new C3038l0(c3063m0, null), 3, null);
                abstractC2975ib3.a(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0)), e.a);
            } else if (v instanceof J6) {
                abstractC2975ib3.a(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((J6) v).a))), e.a);
            } else if (v instanceof K6) {
                abstractC2975ib3.a(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf((short) ((K6) v).a))), e.a);
            } else {
                if (!(v instanceof Ni)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC2975ib3.a(((Ni) v).a, e.a);
            }
        }
        return Unit.f29295attabal;
    }
}
