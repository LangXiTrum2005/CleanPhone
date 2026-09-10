package com.charging.screenshow.battery.animations.themes.network.entity;

import androidx.datastore.preferences.protobuf.a;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.google.gson.annotations.SerializedName;
import com.p004ironsource.dc;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingVideo;", "Lcom/charging/screenshow/battery/animations/themes/entity/BaseMedia;", "", "textColor", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "type", "getType", "tag", "getTag", "alpha", g.f40227p, "x", "getX", "y", "l", "previewPath", "getPreviewPath", "m", "(Ljava/lang/String;)V", "videoPath", "getVideoPath", dc.q, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChargingVideo extends BaseMedia {

    @SerializedName("alpha")
    private final String alpha;
    private String previewPath;

    @SerializedName("tag")
    private final String tag;

    @SerializedName("text_color")
    private final String textColor;

    @SerializedName("type")
    private final String type;
    private String videoPath;

    @SerializedName("x")
    private final String x;

    @SerializedName("y")
    private final String y;

    public ChargingVideo(String tag) {
        Intrinsics.f(tag, "tag");
        this.textColor = "#20FFB6";
        this.type = "1";
        this.tag = tag;
        this.alpha = "0.9";
        this.x = "0";
        this.y = "0.8";
        this.previewPath = "";
        this.videoPath = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargingVideo)) {
            return false;
        }
        ChargingVideo chargingVideo = (ChargingVideo) obj;
        return Intrinsics.a(this.textColor, chargingVideo.textColor) && Intrinsics.a(this.type, chargingVideo.type) && Intrinsics.a(this.tag, chargingVideo.tag) && Intrinsics.a(this.alpha, chargingVideo.alpha) && Intrinsics.a(this.x, chargingVideo.x) && Intrinsics.a(this.y, chargingVideo.y);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAlpha() {
        return this.alpha;
    }

    public final String h() {
        String str = this.tag;
        if (str != null && str.length() != 0) {
            return this.tag;
        }
        return "charging_" + getName();
    }

    public final int hashCode() {
        return this.y.hashCode() + a.b(this.x, a.b(this.alpha, a.b(this.tag, a.b(this.type, this.textColor.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        String str = this.previewPath;
        if (str != null && str.length() != 0) {
            return this.previewPath;
        }
        return "https://apps.ezlifetech.com/Battery_Animation/" + getName() + ".webp";
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final String k() {
        String str = this.videoPath;
        if (str != null && str.length() != 0) {
            return this.videoPath;
        }
        return "https://apps.ezlifetech.com/Battery_Animation/" + getName() + ".mp4";
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getY() {
        return this.y;
    }

    public final void m(String str) {
        Intrinsics.f(str, "<set-?>");
        this.previewPath = str;
    }

    public final void n(String str) {
        Intrinsics.f(str, "<set-?>");
        this.videoPath = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargingVideo(textColor=");
        sb.append(this.textColor);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.y, ')');
    }
}
