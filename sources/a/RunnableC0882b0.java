package A;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.AbstractC3067ia;
import com.inmobi.media.N9;

/* JADX INFO: renamed from: A.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0882b0 implements Runnable {
    public final /* synthetic */ int X = 1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f3167Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    public /* synthetic */ RunnableC0882b0(Bitmap bitmap, int i2, int i3, ImageView imageView) {
        this.e0 = bitmap;
        this.f3167Y = i2;
        this.Z = i3;
        this.f0 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AbstractC3067ia.a((AdConfig.OmidConfig) this.e0, this.f3167Y, (N9) this.f0, this.Z);
                break;
            default:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap) this.e0, this.f3167Y, this.Z, (ImageView) this.f0);
                break;
        }
    }

    public /* synthetic */ RunnableC0882b0(AdConfig.OmidConfig omidConfig, int i2, N9 n9, int i3) {
        this.e0 = omidConfig;
        this.f3167Y = i2;
        this.f0 = n9;
        this.Z = i3;
    }
}
