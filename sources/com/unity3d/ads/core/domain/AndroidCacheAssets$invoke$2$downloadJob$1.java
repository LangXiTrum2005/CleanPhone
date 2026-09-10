package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$2$downloadJob$1", f = "AndroidCacheAssets.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE}, m = "invokeSuspend")
public final class AndroidCacheAssets$invoke$2$downloadJob$1 extends i implements c {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset $asset;
    int label;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheAssets$invoke$2$downloadJob$1(AndroidCacheAssets androidCacheAssets, CampaignMetadataOuterClass.CampaignAsset campaignAsset, AdObject adObject, f fVar) {
        super(2, fVar);
        this.this$0 = androidCacheAssets;
        this.$asset = campaignAsset;
        this.$adObject = adObject;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new AndroidCacheAssets$invoke$2$downloadJob$1(this.this$0, this.$asset, this.$adObject, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((AndroidCacheAssets$invoke$2$downloadJob$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        AndroidCacheAssets$invoke$2$downloadJob$1 androidCacheAssets$invoke$2$downloadJob$1;
        int i10 = this.label;
        if (i10 == 0) {
            t9.e.z(obj);
            CacheFile cacheFile = this.this$0.cacheFile;
            String url = this.$asset.getUrl();
            n.e(url, "asset.url");
            AdObject adObject = this.$adObject;
            int priority = this.$asset.getPriority();
            this.label = 1;
            androidCacheAssets$invoke$2$downloadJob$1 = this;
            obj = CacheFile.DefaultImpls.invoke$default(cacheFile, url, adObject, null, priority, 0, null, androidCacheAssets$invoke$2$downloadJob$1, 48, null);
            bk.a aVar = bk.a.f5708a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            androidCacheAssets$invoke$2$downloadJob$1 = this;
        }
        if (!(((CacheResult) obj) instanceof CacheResult.Failure)) {
            return r.f53297a;
        }
        throw new RuntimeException("Failed To Load Asset: " + androidCacheAssets$invoke$2$downloadJob$1.$asset.getUrl());
    }
}
