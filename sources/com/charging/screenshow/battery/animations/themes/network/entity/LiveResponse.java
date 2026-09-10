package com.charging.screenshow.battery.animations.themes.network.entity;

import com.charging.screenshow.battery.animations.themes.network.base.model.ApiBaseResponse;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveResponse;", "Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiBaseResponse;", "", "count", "I", "getCount", "()I", "", "Lcom/charging/screenshow/battery/animations/themes/network/entity/Live;", "images", "Ljava/util/List;", "e", "()Ljava/util/List;", "offset", "getOffset", "setOffset", "(I)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveResponse extends ApiBaseResponse {

    @SerializedName("count")
    private final int count;

    @SerializedName("items")
    private final List<Live> images;

    @SerializedName("offset")
    private int offset;

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getImages() {
        return this.images;
    }
}
