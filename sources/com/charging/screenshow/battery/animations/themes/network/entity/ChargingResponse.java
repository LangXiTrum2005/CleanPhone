package com.charging.screenshow.battery.animations.themes.network.entity;

import com.charging.screenshow.battery.animations.themes.network.base.model.ApiBaseResponse;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingResponse;", "Lcom/charging/screenshow/battery/animations/themes/network/base/model/ApiBaseResponse;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild1;", "data", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild1;", "e", "()Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild1;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingResponse extends ApiBaseResponse {

    @SerializedName("data")
    private final ChargingChild1 data;

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ChargingChild1 getData() {
        return this.data;
    }
}
