package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import cn.a0;
import cn.d0;
import cn.d2;
import cn.e1;
import cn.f1;
import cn.h0;
import cn.z;
import cn.z1;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheAssets;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "Lcn/a0;", "scope", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcn/a0;Lcom/unity3d/ads/core/domain/CacheFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "assets", "Lcom/unity3d/ads/core/domain/CacheAssetsEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/util/List;Lak/f;)Ljava/lang/Object;", "Lcn/a0;", "Lcom/unity3d/ads/core/domain/CacheFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidCacheAssets implements CacheAssets {
    private final CacheFile cacheFile;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidCacheAssets", f = "AndroidCacheAssets.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheAssets.this.invoke(null, null, this);
        }
    }

    public AndroidCacheAssets(a0 scope, CacheFile cacheFile, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(scope, "scope");
        n.f(cacheFile, "cacheFile");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.cacheFile = cacheFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.CacheAssets
    public Object invoke(AdObject adObject, List<CampaignMetadataOuterClass.CampaignAsset> list, f fVar) {
        AnonymousClass1 anonymousClass1;
        CacheAssetsEvent.Failure failure;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                ArrayList arrayList = new ArrayList();
                d dVarB = d0.b(anonymousClass1.getContext().plus(new z("AssetDownloading")).plus(new z1((f1) this.scope.getCoroutineContext().get(e1.f6705a))));
                for (CampaignMetadataOuterClass.CampaignAsset campaignAsset : list) {
                    h0 h0VarG = d0.g(dVarB, new AndroidCacheAssets$invoke$2$downloadJob$1(this, campaignAsset, adObject, null), 3);
                    if (campaignAsset.getRequired()) {
                        arrayList.add(h0VarG);
                    }
                }
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                Object objH = d0.h(arrayList, anonymousClass1);
                bk.a aVar = bk.a.f5708a;
                if (objH == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return CacheAssetsEvent.Success.INSTANCE;
        } catch (d2 e10) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_timeout", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
            String message = e10.getMessage();
            failure = new CacheAssetsEvent.Failure(message != null ? message : "");
            return failure;
        } catch (RuntimeException e11) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_fail", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
            String message2 = e11.getMessage();
            failure = new CacheAssetsEvent.Failure(message2 != null ? message2 : "");
            return failure;
        }
    }
}
