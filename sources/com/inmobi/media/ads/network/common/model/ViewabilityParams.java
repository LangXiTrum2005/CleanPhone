package com.inmobi.media.ads.network.common.model;

import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/ViewabilityParams;", "", "<init>", "()V", "type", "", "getType$annotations", "getType", "()B", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "getView", "()Ljava/lang/String;", "time", "getTime", "pixel", "getPixel", "frame", "", "getFrame", "()[I", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewabilityParams {
    private final byte type;
    private final String view = "";
    private final String time = "";
    private final String pixel = "";
    private final int[] frame = {0, 0, 0, 0};

    public final int[] getFrame() {
        return this.frame;
    }

    public final String getPixel() {
        return this.pixel;
    }

    public final String getTime() {
        return this.time;
    }

    public final byte getType() {
        return this.type;
    }

    public final String getView() {
        return this.view;
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
