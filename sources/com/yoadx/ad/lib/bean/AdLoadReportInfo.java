package com.yoadx.ad.lib.bean;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AdLoadReportInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yoadx/ad/lib/bean/AdLoadReportInfo;", "Ljava/io/Serializable;", "adResponseTimeMS", "", "adError", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "<init>", "(JLcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "getAdResponseTimeMS", "()J", "setAdResponseTimeMS", "(J)V", "getAdError", "()Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "setAdError", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdLoadReportInfo implements Serializable {
    private LoadAdError adError;
    private long adResponseTimeMS;

    public AdLoadReportInfo() {
        this(0L, null, 3, null);
    }

    public final LoadAdError getAdError() {
        return this.adError;
    }

    public final long getAdResponseTimeMS() {
        return this.adResponseTimeMS;
    }

    public final void setAdError(LoadAdError loadAdError) {
        this.adError = loadAdError;
    }

    public final void setAdResponseTimeMS(long j) {
        this.adResponseTimeMS = j;
    }

    public AdLoadReportInfo(long j, LoadAdError loadAdError) {
        this.adResponseTimeMS = j;
        this.adError = loadAdError;
    }

    public /* synthetic */ AdLoadReportInfo(long j, LoadAdError loadAdError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : loadAdError);
    }
}
