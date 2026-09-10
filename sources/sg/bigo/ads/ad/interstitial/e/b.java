package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends sg.bigo.ads.common.view.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f46188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f46189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Drawable f46190c;

    public b(float f, float f2, float f3, float f4, Rect rect, float f5, boolean[] zArr, sg.bigo.ads.ad.interstitial.e.a.b.a aVar) {
        super(f, f2, f3, f4, rect, aVar.f46181b, aVar.f46182c, f5, zArr);
        int i2 = aVar.f46181b;
        this.f46188a = i2;
        boolean z2 = aVar.f46180a;
        this.f46189b = z2;
        if (z2) {
            this.f46190c = null;
        } else {
            Drawable drawableA = sg.bigo.ads.common.utils.d.a(f, f2, f3, f4, rect, i2);
            this.f46190c = this.f47674n != null ? new LayerDrawable(new Drawable[]{drawableA, this.f47674n}) : drawableA;
        }
    }

    public final Drawable a() {
        return this.f46190c;
    }

    public b(float f, float f2, sg.bigo.ads.ad.interstitial.e.a.b.a aVar) {
        this(f, f, f, f, null, f2, null, aVar);
    }
}
