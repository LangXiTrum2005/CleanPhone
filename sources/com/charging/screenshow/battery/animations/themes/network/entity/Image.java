package com.charging.screenshow.battery.animations.themes.network.entity;

import com.google.gson.annotations.SerializedName;
import com.smartdigimkt.y4.g;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007R\u001a\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/Image;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/BaseImage;", "Ljava/io/Serializable;", "", "id", "I", "getId", "()I", "", "categoryId", "J", "getCategoryId", "()J", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "tags", "Ljava/util/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "downloads", "getDownloads", "dailyRating", "getDailyRating", "favorites", "getFavorites", "rating", "getRating", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageVariations;", "variations", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageVariations;", g.f40227p, "()Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageVariations;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Image extends BaseImage implements Serializable {

    @SerializedName("category_id")
    private final long categoryId;

    @SerializedName("daily_rating")
    private final long dailyRating;

    @SerializedName("downloads")
    private final int downloads;

    @SerializedName("favorites")
    private final int favorites;

    @SerializedName("id")
    private final int id;

    @SerializedName("rating")
    private final int rating;

    @SerializedName("tags")
    private final ArrayList<String> tags;

    @SerializedName("variations")
    private final ImageVariations variations;

    public final String d() {
        return String.valueOf(this.id);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ImageVariations getVariations() {
        return this.variations;
    }
}
