package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2989j1;
import com.inmobi.media.W;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2989j1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ AbstractC3039l1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2989j1(byte[] bArr, AbstractC3039l1 abstractC3039l1, dern dernVar) {
        super(2, dernVar);
        this.b = bArr;
        this.c = abstractC3039l1;
    }

    public static final Unit a(AbstractC3039l1 abstractC3039l1, W w) {
        AbstractC3039l1.a(abstractC3039l1, w);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2989j1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2989j1(this.b, this.c, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                byte[] bArr = this.b;
                AbstractC3039l1 abstractC3039l1 = this.c;
                C2758a c2758a = new C2758a(bArr, abstractC3039l1.l.a, abstractC3039l1.i);
                final AbstractC3039l1 abstractC3039l2 = this.c;
                Function1 function1 = new Function1() { // from class: adsuki.logician
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2989j1.a(abstractC3039l2, (W) obj2);
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
            AbstractC3039l1 abstractC3039l3 = this.c;
            C3097n9 c3097n9 = abstractC3039l3.i;
            if (c3097n9 != null) {
                C3287v0 c3287v0 = abstractC3039l3.l;
                AbstractC2837d0.a(c3287v0.e, c3287v0.f, adResponse, c3097n9);
            }
            this.c.a(adResponse);
        } catch (Y e) {
            AbstractC3039l1 abstractC3039l4 = this.c;
            V v = e.b;
            if (v instanceof Ni) {
                abstractC3039l4.b(((Ni) v).a);
            }
            abstractC3039l4.b(e.a, true, (short) 0);
        } catch (Throwable th) {
            C3097n9 c3097n10 = this.c.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3097n10.a("l1", "doAdLoadWork: " + th);
            }
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(th));
            AbstractC3039l1 abstractC3039l5 = this.c;
            abstractC3039l5.getClass();
            abstractC3039l5.b(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3039l5.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        return Unit.f29295attabal;
    }
}
