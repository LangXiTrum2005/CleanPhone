package com.unity3d.ads.core.domain.offerwall;

import ak.f;
import bk.a;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "<init>", "(Lcom/unity3d/ads/core/data/manager/OfferwallManager;)V", "", "placementName", "Lwj/r;", "invoke", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        n.f(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, f fVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, fVar);
        return objLoadAd == a.f5708a ? objLoadAd : r.f53297a;
    }
}
