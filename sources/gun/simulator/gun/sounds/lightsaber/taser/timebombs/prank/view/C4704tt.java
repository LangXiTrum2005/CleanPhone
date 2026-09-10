package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4704tt extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f5055a;
    public final Uri b;

    public C4704tt(Uri uri) {
        this.b = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f5055a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.b;
    }
}
