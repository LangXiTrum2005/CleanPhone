package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2940h1;
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

/* JADX INFO: renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2940h1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC3039l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940h1(AbstractC3039l1 abstractC3039l1, dern dernVar) {
        super(2, dernVar);
        this.b = abstractC3039l1;
    }

    public static final Unit a(AbstractC3039l1 abstractC3039l1, W w) {
        AbstractC3039l1.a(abstractC3039l1, w);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2940h1(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2940h1(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p002kotlin.dern.saneness(obj);
                } catch (Throwable th) {
                    this.b.b((byte) 0);
                    throw th;
                }
            } else {
                p002kotlin.dern.saneness(obj);
                Yn yn = new Yn(this.b.G(), this.b.i);
                final AbstractC3039l1 abstractC3039l1 = this.b;
                Function1 function1 = new Function1() { // from class: adsuki.naming
                    @Override // p002kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2940h1.a(abstractC3039l1, (W) obj2);
                    }
                };
                this.a = 1;
                obj = yn.a(function1, this);
                if (obj == objBeachfront) {
                    return objBeachfront;
                }
            }
            AdResponse adResponse = (AdResponse) obj;
            AbstractC3039l1 abstractC3039l2 = this.b;
            C3097n9 c3097n9 = abstractC3039l2.i;
            if (c3097n9 != null) {
                C3287v0 c3287v0 = abstractC3039l2.l;
                AbstractC2837d0.a(c3287v0.e, c3287v0.f, adResponse, c3097n9);
            }
            this.b.a(adResponse);
        } catch (Y e) {
            AbstractC3039l1.a(this.b, e);
        } catch (Throwable th2) {
            C3097n9 c3097n10 = this.b.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3097n10.a("l1", "doAdLoadWork: " + th2);
            }
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(th2));
            AbstractC3039l1 abstractC3039l3 = this.b;
            abstractC3039l3.getClass();
            abstractC3039l3.b(seminary.kowloon(formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2363)));
            abstractC3039l3.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        }
        this.b.b((byte) 0);
        return Unit.f29295attabal;
    }
}
