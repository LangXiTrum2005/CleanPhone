package com.inmobi.media.ads.network.inmobiJson.model;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/JsonAssetObject;", "", "<init>", "()V", "title", "Lcom/inmobi/media/ads/network/inmobiJson/model/Title;", "getTitle", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Title;", InMobiNetworkValues.DESCRIPTION, "Lcom/inmobi/media/ads/network/inmobiJson/model/Description;", "getDescription", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Description;", "icon", "Lcom/inmobi/media/ads/network/inmobiJson/model/Icon;", "getIcon", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Icon;", "cta", "Lcom/inmobi/media/ads/network/inmobiJson/model/CTA;", "getCta", "()Lcom/inmobi/media/ads/network/inmobiJson/model/CTA;", "adChoice", "Lcom/inmobi/media/ads/network/inmobiJson/model/Image;", "getAdChoice", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Image;", X3.i.I0, "Lcom/inmobi/media/ads/network/inmobiJson/model/NativeMedia;", "getMedia", "()Lcom/inmobi/media/ads/network/inmobiJson/model/NativeMedia;", "appMetrics", "Lcom/inmobi/media/ads/network/inmobiJson/model/AppMetrics;", "getAppMetrics", "()Lcom/inmobi/media/ads/network/inmobiJson/model/AppMetrics;", "sponsored", "Lcom/inmobi/media/ads/network/inmobiJson/model/Sponsored;", "getSponsored", "()Lcom/inmobi/media/ads/network/inmobiJson/model/Sponsored;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonAssetObject {
    private final Image adChoice;
    private final AppMetrics appMetrics;
    private final CTA cta;
    private final Description description;
    private final Icon icon;
    private final NativeMedia media;
    private final Sponsored sponsored;
    private final Title title;

    public final Image getAdChoice() {
        return this.adChoice;
    }

    public final AppMetrics getAppMetrics() {
        return this.appMetrics;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final Description getDescription() {
        return this.description;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final NativeMedia getMedia() {
        return this.media;
    }

    public final Sponsored getSponsored() {
        return this.sponsored;
    }

    public final Title getTitle() {
        return this.title;
    }
}
