package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild2;", "Ljava/io/Serializable;", "", "updateDate", "Ljava/lang/String;", "getUpdateDate", "()Ljava/lang/String;", "", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingVideo;", "videoList", "Ljava/util/List;", "d", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChargingChild2 implements Serializable {

    @SerializedName("last_update")
    private final String updateDate;

    @SerializedName("data")
    private final List<ChargingVideo> videoList;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getVideoList() {
        return this.videoList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargingChild2)) {
            return false;
        }
        ChargingChild2 chargingChild2 = (ChargingChild2) obj;
        return Intrinsics.a(this.updateDate, chargingChild2.updateDate) && Intrinsics.a(this.videoList, chargingChild2.videoList);
    }

    public final int hashCode() {
        return this.videoList.hashCode() + (this.updateDate.hashCode() * 31);
    }

    public final String toString() {
        return "ChargingChild2(updateDate=" + this.updateDate + ", videoList=" + this.videoList + ')';
    }
}
