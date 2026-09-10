package idolatry;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* JADX INFO: compiled from: InMobiNativeMappedImage.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal extends NativeAd.Image {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Drawable f28361attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final double f28362dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Uri f28363saneness;

    public attabal(Drawable drawable, Uri uri, double d) {
        this.f28361attabal = drawable;
        this.f28363saneness = uri;
        this.f28362dern = d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Drawable getDrawable() {
        return this.f28361attabal;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public double getScale() {
        return this.f28362dern;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public Uri getUri() {
        return this.f28363saneness;
    }
}
