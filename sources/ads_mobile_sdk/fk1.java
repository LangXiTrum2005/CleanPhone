package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;
import saneness.bohunk;

/* JADX INFO: loaded from: classes.dex */
public final class fk1 implements bohunk {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public fk1(NativeAd.Image image) {
        this.a = image.getDrawable();
        this.b = image.getUri();
        this.c = image.getScale();
        this.d = image.getWidth();
        this.e = image.getHeight();
    }

    @Override // saneness.bohunk
    public final double a() {
        return this.c;
    }

    @Override // saneness.bohunk
    public final int b() {
        return this.d;
    }

    @Override // saneness.bohunk
    public final int c() {
        return this.e;
    }

    @Override // saneness.bohunk
    public final Uri d() {
        return this.b;
    }

    @Override // saneness.bohunk
    public final Drawable e() {
        return this.a;
    }
}
