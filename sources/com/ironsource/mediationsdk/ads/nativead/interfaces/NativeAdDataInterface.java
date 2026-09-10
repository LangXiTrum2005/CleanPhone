package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdDataInterface {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f29305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f29306b;

        public Image(Drawable drawable, Uri uri) {
            this.f29305a = drawable;
            this.f29306b = uri;
        }

        public final Drawable getDrawable() {
            return this.f29305a;
        }

        public final Uri getUri() {
            return this.f29306b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}
