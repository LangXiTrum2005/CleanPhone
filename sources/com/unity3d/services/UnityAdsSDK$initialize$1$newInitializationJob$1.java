package com.unity3d.services;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import jk.c;
import kotlin.Metadata;
import wj.d;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {133, 139}, m = "invokeSuspend")
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends i implements c {
    final /* synthetic */ d $alternativeFlowReader$delegate;
    final /* synthetic */ String $gameId;
    final /* synthetic */ a0 $initScope;
    final /* synthetic */ d $initializeBoldSDK$delegate;
    final /* synthetic */ d $initializeSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, String str2, a0 a0Var, d dVar, d dVar2, d dVar3, f fVar) {
        super(2, fVar);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = a0Var;
        this.$alternativeFlowReader$delegate = dVar;
        this.$initializeBoldSDK$delegate = dVar2;
        this.$initializeSDK$delegate = dVar3;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r7.mo3239invokegIAlus(r2, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        return r0;
     */
    @Override // ck.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L14
            t9.e.z(r7)
            wj.h r7 = (wj.h) r7
            r7.getClass()
            goto L97
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1c:
            t9.e.z(r7)
            goto L97
        L21:
            t9.e.z(r7)
            wj.d r7 = r6.$alternativeFlowReader$delegate
            com.unity3d.ads.core.configuration.AlternativeFlowReader r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$7(r7)
            boolean r7 = r7.invoke()
            bk.a r0 = bk.a.f5708a
            if (r7 == 0) goto L43
            wj.d r7 = r6.$initializeBoldSDK$delegate
            com.unity3d.ads.core.domain.InitializeBoldSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$9(r7)
            java.lang.String r1 = r6.$source
            r6.label = r2
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L97
            goto L96
        L43:
            boolean r7 = com.unity3d.services.core.properties.SdkProperties.isTestMode()
            if (r7 == 0) goto L4c
            java.lang.String r7 = "test mode"
            goto L4e
        L4c:
            java.lang.String r7 = "production mode"
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Initializing Unity Services "
            r2.<init>(r3)
            java.lang.String r3 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            int r3 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            r2.append(r3)
            java.lang.String r3 = ") with game id "
            r2.append(r3)
            java.lang.String r3 = r6.$gameId
            java.lang.String r4 = " in "
            java.lang.String r5 = ", session "
            d5.u.r(r2, r3, r4, r7, r5)
            com.unity3d.services.core.properties.Session$Default r7 = com.unity3d.services.core.properties.Session.INSTANCE
            java.lang.String r7 = r7.getId()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.unity3d.services.core.log.DeviceLog.info(r7)
            wj.d r7 = r6.$initializeSDK$delegate
            com.unity3d.services.core.domain.task.InitializeSDK r7 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$10$lambda$8(r7)
            com.unity3d.services.core.domain.task.EmptyParams r2 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
            r6.label = r1
            java.lang.Object r7 = r7.mo3239invokegIAlus(r2, r6)
            if (r7 != r0) goto L97
        L96:
            return r0
        L97:
            cn.a0 r6 = r6.$initScope
            cn.d0.j(r6)
            wj.r r6 = wj.r.f53297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
