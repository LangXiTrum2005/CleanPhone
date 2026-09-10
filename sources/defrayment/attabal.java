package defrayment;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.sdk.controller.f;
import com.yoadx.ad.lib.bean.AdUnitConfig;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdmobAdReq.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Ldefrayment/attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "adUnitConfig", "", "adReqScenes", "Lartsy/attabal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;Ljava/lang/String;Lartsy/attabal;)V", "attabal", "Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "dern", "()Lcom/yoadx/ad/lib/bean/AdUnitConfig;", "setAdUnitConfig", "(Lcom/yoadx/ad/lib/bean/AdUnitConfig;)V", "saneness", "Ljava/lang/String;", "()Ljava/lang/String;", "setAdReqScenes", "(Ljava/lang/String;)V", "beachfront", f.b.c, "", "wireman", "J", "marial", "()J", "competently", "(J)V", "startRequestTime", "loadListener", "Lartsy/attabal;", "()Lartsy/attabal;", "setLoadListener", "(Lartsy/attabal;)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public AdUnitConfig adUnitConfig;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public String adId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public String adReqScenes;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public long startRequestTime;

    public attabal(AdUnitConfig adUnitConfig, String adReqScenes, artsy.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(adUnitConfig, "adUnitConfig");
        Intrinsics.checkNotNullParameter(adReqScenes, "adReqScenes");
        this.adId = "";
        this.adUnitConfig = adUnitConfig;
        this.adReqScenes = adReqScenes;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    public final void beachfront(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adId = str;
    }

    public final void competently(long j) {
        this.startRequestTime = j;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final AdUnitConfig getAdUnitConfig() {
        return this.adUnitConfig;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final long getStartRequestTime() {
        return this.startRequestTime;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getAdReqScenes() {
        return this.adReqScenes;
    }

    public final artsy.attabal wireman() {
        return null;
    }
}
