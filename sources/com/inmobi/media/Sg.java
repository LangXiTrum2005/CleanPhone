package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Sg {
    public final InMobiNativeViewData a;
    public final MediaView b;
    public final View c;

    public Sg(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(pubView, "pubView");
        this.a = pubView;
        this.b = mediaView;
        this.c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sg)) {
            return false;
        }
        Sg sg = (Sg) obj;
        return Intrinsics.wireman(this.a, sg.a) && Intrinsics.wireman(this.b, sg.b) && Intrinsics.wireman(this.c, sg.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MediaView mediaView = this.b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }
}
