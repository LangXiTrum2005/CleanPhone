package com.inmobi.media.ads.network.inmobiJson.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/AppMetrics;", "", "<init>", "()V", "rating", "", "getRating", "()Ljava/lang/Float;", "Ljava/lang/Float;", "downloads", "", "getDownloads", "()Ljava/lang/Long;", "Ljava/lang/Long;", "likes", "getLikes", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppMetrics {
    private final Long downloads;
    private final Long likes;
    private final Float rating;

    public final Long getDownloads() {
        return this.downloads;
    }

    public final Long getLikes() {
        return this.likes;
    }

    public final Float getRating() {
        return this.rating;
    }
}
