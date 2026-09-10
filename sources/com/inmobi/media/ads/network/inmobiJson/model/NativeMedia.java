package com.inmobi.media.ads.network.inmobiJson.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/NativeMedia;", "", "<init>", "()V", "value", "", "type", "getType$annotations", "getType", "()Ljava/lang/String;", "image", "Lcom/inmobi/media/ads/network/inmobiJson/model/NativeImage;", "getImage", "()Lcom/inmobi/media/ads/network/inmobiJson/model/NativeImage;", "video", "Lcom/inmobi/media/ads/network/inmobiJson/model/NativeVideo;", "getVideo", "()Lcom/inmobi/media/ads/network/inmobiJson/model/NativeVideo;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeMedia {
    private final NativeImage image;
    private String type = "";
    private final NativeVideo video;

    public final NativeImage getImage() {
        return this.image;
    }

    public final String getType() {
        return this.type;
    }

    public final NativeVideo getVideo() {
        return this.video;
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
