package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageContent;", "Ljava/io/Serializable;", "", "size", "J", "getSize", "()J", "", "url", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageContent implements Serializable {

    @SerializedName("size")
    private final long size;

    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
