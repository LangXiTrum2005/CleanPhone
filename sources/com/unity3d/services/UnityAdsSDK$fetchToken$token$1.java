package com.unity3d.services;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import jk.c;
import kotlin.Metadata;
import wj.d;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {225}, m = "invokeSuspend")
public final class UnityAdsSDK$fetchToken$token$1 extends i implements c {
    final /* synthetic */ d $getHeaderBiddingToken$delegate;
    final /* synthetic */ d $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(d dVar, d dVar2, f fVar) {
        super(2, fVar);
        this.$getHeaderBiddingToken$delegate = dVar;
        this.$tokenNumberProvider$delegate = dVar2;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        GetHeaderBiddingToken getHeaderBiddingTokenFetchToken$lambda$17 = UnityAdsSDK.fetchToken$lambda$17(this.$getHeaderBiddingToken$delegate);
        int iInvoke = UnityAdsSDK.fetchToken$lambda$16(this.$tokenNumberProvider$delegate).invoke();
        this.label = 1;
        Object objInvoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(getHeaderBiddingTokenFetchToken$lambda$17, iInvoke, null, this, 2, null);
        a aVar = a.f5708a;
        return objInvoke$default == aVar ? aVar : objInvoke$default;
    }
}
