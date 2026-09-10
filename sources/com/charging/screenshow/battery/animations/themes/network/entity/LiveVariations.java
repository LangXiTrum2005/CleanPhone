package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveVariations;", "Ljava/io/Serializable;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveContent;", "adapted", "Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveContent;", "getAdapted", "()Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveContent;", "previewSmall", "d", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LiveVariations implements Serializable {

    @SerializedName("adapted")
    private final LiveContent adapted;

    @SerializedName("preview_small")
    private final LiveContent previewSmall;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LiveContent getPreviewSmall() {
        return this.previewSmall;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVariations)) {
            return false;
        }
        LiveVariations liveVariations = (LiveVariations) obj;
        return Intrinsics.a(this.adapted, liveVariations.adapted) && Intrinsics.a(this.previewSmall, liveVariations.previewSmall);
    }

    public final int hashCode() {
        return this.previewSmall.hashCode() + (this.adapted.hashCode() * 31);
    }

    public final String toString() {
        return "LiveVariations(adapted=" + this.adapted + ", previewSmall=" + this.previewSmall + ')';
    }
}
