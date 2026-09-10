package com.unity3d.ads.core.domain.work;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import d5.v;
import e5.l;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "universalRequestWorkerData", "Lwj/r;", "invoke", "(Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;)V", "Ld5/v;", "workManager", "Ld5/v;", "getWorkManager", "()Ld5/v;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BackgroundWorker {
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final v workManager;

    public BackgroundWorker(Context applicationContext) {
        n.f(applicationContext, "applicationContext");
        this.workManager = l.b(applicationContext);
    }

    public final v getWorkManager() {
        return this.workManager;
    }

    public final <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        n.f(universalRequestWorkerData, "universalRequestWorkerData");
        n.k();
        throw null;
    }
}
