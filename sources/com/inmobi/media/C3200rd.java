package com.inmobi.media;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3200rd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Dd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3200rd(Dd dd, dern dernVar) {
        super(2, dernVar);
        this.b = dd;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3200rd(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3200rd(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 == r0) goto L36;
     */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r1 = r12.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            p002kotlin.dern.saneness(r13)
            goto Lb9
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            p002kotlin.dern.saneness(r13)
            goto L4d
        L23:
            p002kotlin.dern.saneness(r13)
            goto L42
        L27:
            p002kotlin.dern.saneness(r13)
            com.inmobi.media.Dd r13 = r12.b
            r12.a = r4
            r13.getClass()
            kotlinx.coroutines.technofreak r1 = kotlinx.coroutines.premeiotic.dern()
            com.inmobi.media.sd r4 = new com.inmobi.media.sd
            r4.<init>(r13, r5)
            java.lang.Object r13 = kotlinx.coroutines.impromptu.competently(r1, r4, r12)
            if (r13 != r0) goto L42
            goto Lb8
        L42:
            com.inmobi.media.pf r13 = com.inmobi.media.C3153pf.a
            r12.a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L4d
            goto Lb8
        L4d:
            com.inmobi.media.Dd r13 = r12.b
            com.inmobi.media.Ec r1 = r13.b
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r1 = r1.b
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject r1 = r1.getAssetsObject()
            if (r1 == 0) goto L5e
            com.inmobi.media.ads.network.inmobiJson.model.NativeMedia r1 = r1.getMedia()
            goto L5f
        L5e:
            r1 = r5
        L5f:
            java.lang.String r3 = "NativeLoadingState"
            if (r1 != 0) goto L71
            com.inmobi.media.m9 r13 = r13.l()
            if (r13 == 0) goto L9d
            com.inmobi.media.n9 r13 = (com.inmobi.media.C3097n9) r13
            java.lang.String r1 = "listenToVideoLoadAndErrorEvents - no media assets, skipping"
            r13.a(r3, r1)
            goto L9d
        L71:
            com.inmobi.media.m9 r1 = r13.l()
            if (r1 == 0) goto L7e
            com.inmobi.media.n9 r1 = (com.inmobi.media.C3097n9) r1
            java.lang.String r4 = "listenToVideoLoadAndErrorEvents - media assets found, setting up listener"
            r1.a(r3, r4)
        L7e:
            com.inmobi.media.Ec r1 = r13.b
            patroclinal.taiyuan r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            com.inmobi.media.lc r1 = (com.inmobi.media.C3050lc) r1
            kotlinx.coroutines.flow.apical r1 = r1.e
            com.inmobi.media.xd r3 = new com.inmobi.media.xd
            r3.<init>(r1)
            kotlinx.coroutines.saran r6 = r13.e
            com.inmobi.media.ud r9 = new com.inmobi.media.ud
            r9.<init>(r3, r5, r13)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            kotlinx.coroutines.impromptu.wireman(r6, r7, r8, r9, r10, r11)
        L9d:
            com.inmobi.media.Dd r13 = r12.b
            r12.a = r2
            r13.getClass()
            com.inmobi.media.Ad r1 = new com.inmobi.media.Ad
            r1.<init>(r13, r5)
            java.lang.Object r13 = kotlinx.coroutines.sakeen.dern(r1, r12)
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            if (r13 != r1) goto Lb4
            goto Lb6
        Lb4:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
        Lb6:
            if (r13 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            kotlin.Unit r13 = p002kotlin.Unit.f29295attabal
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3200rd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
