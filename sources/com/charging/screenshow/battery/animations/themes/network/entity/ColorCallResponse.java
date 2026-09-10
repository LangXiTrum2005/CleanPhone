package com.charging.screenshow.battery.animations.themes.network.entity;

import androidx.media3.extractor.text.ttml.a;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ColorCallResponse;", "Ljava/io/Serializable;", "", "filename", "I", "d", "()I", "reward_ads", "getReward_ads", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "download_time", "getDownload_time", "like_time", "getLike_time", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ColorCallResponse implements Serializable {

    @SerializedName("download_time")
    private final int download_time;

    @SerializedName("filename")
    private final int filename;

    @SerializedName("like_time")
    private final int like_time;

    @SerializedName("reward_ads")
    private final int reward_ads;

    @SerializedName("tag")
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFilename() {
        return this.filename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorCallResponse)) {
            return false;
        }
        ColorCallResponse colorCallResponse = (ColorCallResponse) obj;
        return this.filename == colorCallResponse.filename && this.reward_ads == colorCallResponse.reward_ads && Intrinsics.a(this.tag, colorCallResponse.tag) && this.download_time == colorCallResponse.download_time && this.like_time == colorCallResponse.like_time;
    }

    public final int hashCode() {
        return Integer.hashCode(this.like_time) + a.a(this.download_time, androidx.datastore.preferences.protobuf.a.b(this.tag, a.a(this.reward_ads, Integer.hashCode(this.filename) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorCallResponse(filename=");
        sb.append(this.filename);
        sb.append(", reward_ads=");
        sb.append(this.reward_ads);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", download_time=");
        sb.append(this.download_time);
        sb.append(", like_time=");
        return android.support.v4.media.a.p(sb, this.like_time, ')');
    }
}
