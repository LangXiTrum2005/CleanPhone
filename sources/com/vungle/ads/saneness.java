package com.vungle.ads;

import com.google.ads.mediation.vungle.VungleConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\f\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0017\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/saneness;", "", "<init>", "()V", "", "isBackButtonImmediatelyEnabled", "", "setBackButtonImmediatelyEnabled", "(Z)V", "", "getSettings", "()I", "", MBridgeConstans.EXTRA_KEY_WM, "setWatermark", "(Ljava/lang/String;)V", "getWatermark$vungle_ads_release", "()Ljava/lang/String;", "getWatermark", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Ljava/util/Map;", "settings", "I", VungleConstants.KEY_ORIENTATION, "getAdOrientation", "setAdOrientation", "(I)V", "getAdOrientation$annotations", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class saneness {
    public static final int AUTO_ROTATE = 2;
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean isBackButtonImmediatelyEnabled) {
        this.settings = isBackButtonImmediatelyEnabled ? this.settings | 2 : this.settings & (-3);
    }

    public final void setWatermark(String watermark) {
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.extras.put(WATERMARK, watermark);
    }

    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
