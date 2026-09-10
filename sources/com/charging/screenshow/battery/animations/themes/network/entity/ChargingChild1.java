package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild1;", "Ljava/io/Serializable;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild2;", "data", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild2;", "d", "()Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingChild2;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChargingChild1 implements Serializable {

    @SerializedName("data")
    private final ChargingChild2 data;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChargingChild2 getData() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargingChild1) && Intrinsics.a(this.data, ((ChargingChild1) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return "ChargingChild1(data=" + this.data + ')';
    }
}
