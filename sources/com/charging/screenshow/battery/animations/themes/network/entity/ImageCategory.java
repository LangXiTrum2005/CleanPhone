package com.charging.screenshow.battery.animations.themes.network.entity;

import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.p004ironsource.m5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageCategory;", "", "", "id", "I", "a", "()I", "", "title", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "dailyRating", "J", "getDailyRating", "()J", "updatedTime", "getUpdatedTime", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "getActive", m5.f25676u, "getOrder", "setCount", "getSetCount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ImageCategory {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final int active;

    @SerializedName("daily_rating")
    private final long dailyRating;

    @SerializedName("id")
    private final int id;

    @SerializedName(m5.f25676u)
    private final int order;

    @SerializedName("set_count")
    private final long setCount;

    @SerializedName("title")
    private final String title;

    @SerializedName("updated_at")
    private final String updatedTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCategory)) {
            return false;
        }
        ImageCategory imageCategory = (ImageCategory) obj;
        return this.id == imageCategory.id && Intrinsics.a(this.title, imageCategory.title) && this.dailyRating == imageCategory.dailyRating && Intrinsics.a(this.updatedTime, imageCategory.updatedTime) && this.active == imageCategory.active && this.order == imageCategory.order && this.setCount == imageCategory.setCount;
    }

    public final int hashCode() {
        return Long.hashCode(this.setCount) + a.a(this.order, a.a(this.active, androidx.datastore.preferences.protobuf.a.b(this.updatedTime, a.b(androidx.datastore.preferences.protobuf.a.b(this.title, Integer.hashCode(this.id) * 31, 31), 31, this.dailyRating), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageCategory(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", dailyRating=");
        sb.append(this.dailyRating);
        sb.append(", updatedTime=");
        sb.append(this.updatedTime);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", setCount=");
        return a.o(sb, this.setCount, ')');
    }
}
