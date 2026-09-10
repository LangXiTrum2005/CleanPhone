package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.repository.CacheRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.GetCachedAsset$getLegacyCachedAsset$result$1", f = "GetCachedAsset.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE}, m = "invokeSuspend")
public final class GetCachedAsset$getLegacyCachedAsset$result$1 extends i implements c {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getLegacyCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, f fVar) {
        super(2, fVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new GetCachedAsset$getLegacyCachedAsset$result$1(this.this$0, this.$fileName, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((GetCachedAsset$getLegacyCachedAsset$result$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
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
        CacheRepository cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object objRetrieveFile = cacheRepository.retrieveFile(str, this);
        bk.a aVar = bk.a.f5708a;
        return objRetrieveFile == aVar ? aVar : objRetrieveFile;
    }
}
