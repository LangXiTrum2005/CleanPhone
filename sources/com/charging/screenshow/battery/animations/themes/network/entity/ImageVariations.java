package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import com.smartdigimkt.y4.g;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageVariations;", "Ljava/io/Serializable;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageContent;", "adapted", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageContent;", "d", "()Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageContent;", "previewSmall", g.f40227p, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageVariations implements Serializable {

    @SerializedName("adapted")
    private final ImageContent adapted;

    @SerializedName("preview_small")
    private final ImageContent previewSmall;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ImageContent getAdapted() {
        return this.adapted;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ImageContent getPreviewSmall() {
        return this.previewSmall;
    }
}
