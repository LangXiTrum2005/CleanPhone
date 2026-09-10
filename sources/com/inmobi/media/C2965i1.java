package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2965i1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3039l1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ F2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2965i1(AbstractC3039l1 abstractC3039l1, String str, F2 f2, String str2, String str3, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3039l1;
        this.b = str;
        this.c = f2;
        this.d = str2;
        this.e = str3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C2965i1(this.a, this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2965i1) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad adB = this.a.b(0);
            if (adB == null || !Intrinsics.wireman(adB.getImpressionId(), this.b)) {
                C3097n9 c3097n9 = this.a.i;
                if (c3097n9 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3097n9.c("l1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC2829ci) this.c).c(this.d, this.e, "");
            } else {
                String webVast = adB.getWebVast();
                ((GestureDetectorOnGestureListenerC2829ci) this.c).c(this.d, this.e, webVast);
                C3097n9 c3097n10 = this.a.i;
                if (c3097n10 != null) {
                    Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                    c3097n10.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e) {
            C3097n9 c3097n11 = this.a.i;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3097n11.a("l1", "Exception while getBlob", e);
            }
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
        return Unit.f29295attabal;
    }
}
