package com.charging.screenshow.battery.animations.themes.network.entity;

import androidx.media3.extractor.text.ttml.a;
import com.google.gson.annotations.SerializedName;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u001a\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/entity/Live;", "Ljava/io/Serializable;", "", "id", "I", "d", "()I", "", "cost", "J", "getCost", "()J", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "tags", "Ljava/util/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "md5File", "Ljava/lang/String;", "getMd5File", "()Ljava/lang/String;", "downloads", "getDownloads", "dailyRating", "getDailyRating", "favorites", "getFavorites", "rating", "getRating", "isTrend", "Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveVariations;", "imageVariations", "Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveVariations;", g.f40227p, "()Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveVariations;", "videoVariations", h.f36614b, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Live implements Serializable {

    @SerializedName("cost")
    private final long cost;

    @SerializedName("daily_rating")
    private final long dailyRating;

    @SerializedName("downloads")
    private final int downloads;

    @SerializedName("favorites")
    private final int favorites;

    @SerializedName("id")
    private final int id;

    @SerializedName("image_variations")
    private final LiveVariations imageVariations;

    @SerializedName("is_trend")
    private final int isTrend;

    @SerializedName("md5_file")
    private final String md5File;

    @SerializedName("rating")
    private final int rating;

    @SerializedName("tags")
    private final ArrayList<String> tags;

    @SerializedName("video_variations")
    private final LiveVariations videoVariations;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Live)) {
            return false;
        }
        Live live = (Live) obj;
        return this.id == live.id && this.cost == live.cost && Intrinsics.a(this.tags, live.tags) && Intrinsics.a(this.md5File, live.md5File) && this.downloads == live.downloads && this.dailyRating == live.dailyRating && this.favorites == live.favorites && this.rating == live.rating && this.isTrend == live.isTrend && Intrinsics.a(this.imageVariations, live.imageVariations) && Intrinsics.a(this.videoVariations, live.videoVariations);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LiveVariations getImageVariations() {
        return this.imageVariations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LiveVariations getVideoVariations() {
        return this.videoVariations;
    }

    public final int hashCode() {
        return this.videoVariations.hashCode() + ((this.imageVariations.hashCode() + a.a(this.isTrend, a.a(this.rating, a.a(this.favorites, a.b(a.a(this.downloads, androidx.datastore.preferences.protobuf.a.b(this.md5File, (this.tags.hashCode() + a.b(Integer.hashCode(this.id) * 31, 31, this.cost)) * 31, 31), 31), 31, this.dailyRating), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "Live(id=" + this.id + ", cost=" + this.cost + ", tags=" + this.tags + ", md5File=" + this.md5File + ", downloads=" + this.downloads + ", dailyRating=" + this.dailyRating + ", favorites=" + this.favorites + ", rating=" + this.rating + ", isTrend=" + this.isTrend + ", imageVariations=" + this.imageVariations + ", videoVariations=" + this.videoVariations + ')';
    }
}
