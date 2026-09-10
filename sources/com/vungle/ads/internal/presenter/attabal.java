package com.vungle.ads.internal.presenter;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.util.arytenoidectomy;
import monacal.Placement;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdEventListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/presenter/attabal;", "", "Lcom/vungle/ads/internal/presenter/saneness;", "playAdCallback", "Lmonacal/impromptu;", "placement", "<init>", "(Lcom/vungle/ads/internal/presenter/saneness;Lmonacal/impromptu;)V", "", "s", "value", "id", "", "onNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/vungle/ads/VungleError;", "error", "placementId", "onError", "(Lcom/vungle/ads/VungleError;Ljava/lang/String;)V", "Lcom/vungle/ads/internal/presenter/saneness;", "Lmonacal/impromptu;", "", "adRewarded", "Z", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class attabal {
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final saneness playAdCallback;

    public attabal(saneness sanenessVar, Placement placement) {
        this.playAdCallback = sanenessVar;
        this.placement = placement;
    }

    public final void onError(VungleError error, String placementId) {
        Intrinsics.checkNotNullParameter(error, "error");
        saneness sanenessVar = this.playAdCallback;
        if (sanenessVar != null) {
            sanenessVar.onFailure(error);
            arytenoidectomy.INSTANCE.e(TAG, "AdEventListener#PlayAdCallback " + placementId, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s, String value, String id) {
        Placement placement;
        saneness sanenessVar;
        saneness sanenessVar2;
        saneness sanenessVar3;
        saneness sanenessVar4;
        Intrinsics.checkNotNullParameter(s, "s");
        arytenoidectomy.INSTANCE.d(TAG, "s=" + s + ", value=" + value + ", id=" + id);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals(MRAIDPresenter.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    saneness sanenessVar5 = this.playAdCallback;
                    if (sanenessVar5 != null) {
                        sanenessVar5.onAdRewarded(id);
                    }
                }
                break;
            case -1627831289:
                if (s.equals("adViewed") && (sanenessVar = this.playAdCallback) != null) {
                    sanenessVar.onAdImpression(id);
                }
                break;
            case 100571:
                if (s.equals(TtmlNode.END) && (sanenessVar2 = this.playAdCallback) != null) {
                    sanenessVar2.onAdEnd(id);
                }
                break;
            case 3417674:
                if (s.equals(MRAIDPresenter.OPEN)) {
                    if (Intrinsics.wireman(value, "adClick")) {
                        saneness sanenessVar6 = this.playAdCallback;
                        if (sanenessVar6 != null) {
                            sanenessVar6.onAdClick(id);
                        }
                        break;
                    } else if (Intrinsics.wireman(value, "adLeftApplication") && (sanenessVar3 = this.playAdCallback) != null) {
                        sanenessVar3.onAdLeftApplication(id);
                        break;
                    }
                }
                break;
            case 109757538:
                if (s.equals("start") && (sanenessVar4 = this.playAdCallback) != null) {
                    sanenessVar4.onAdStart(id);
                }
                break;
        }
    }
}
