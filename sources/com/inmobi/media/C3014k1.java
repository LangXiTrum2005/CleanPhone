package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3014k1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AbstractC3039l1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3014k1(AbstractC3039l1 abstractC3039l1, String str, String str2, dern dernVar) {
        super(2, dernVar);
        this.a = abstractC3039l1;
        this.b = str;
        this.c = str2;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3014k1(this.a, this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3014k1) create((saran) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        com.inmobi.media.ads.network.common.model.Ad adB = this.a.b(0);
        if (adB == null || !Intrinsics.wireman(adB.getImpressionId(), this.b)) {
            C3097n9 c3097n9 = this.a.i;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3097n9.b("l1", "Impression ID is null for saveBlob");
            }
        } else {
            this.a.a(adB, this.c);
            C3097n9 c3097n10 = this.a.i;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("l1", "<get-TAG>(...)");
                c3097n10.c("l1", "Updated blob " + this.c);
            }
        }
        return Unit.f29295attabal;
    }
}
