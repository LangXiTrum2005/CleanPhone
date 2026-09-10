package com.inmobi.media.ads.network.inmobiJson.model;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/NativeImage;", "", "<init>", "()V", "required", "", "getRequired", "()Z", "assets", "", "Lcom/inmobi/media/ads/network/inmobiJson/model/Image;", "getAssets", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeImage {
    private final List<Image> assets = new ArrayList();
    private final boolean required;

    public final List<Image> getAssets() {
        return this.assets;
    }

    public final boolean getRequired() {
        return this.required;
    }
}
