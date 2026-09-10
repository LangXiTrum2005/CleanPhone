package sg.bigo.ads.ad.b;

import android.graphics.Bitmap;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<T extends Ad, U extends sg.bigo.ads.api.core.c> extends sg.bigo.ads.ad.d<T, U> {
    boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Integer f45498N;
    private boolean x;
    private Integer y;

    public e(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.x = false;
        this.M = false;
    }

    public final Integer F() {
        if (G()) {
            return null;
        }
        return this.y;
    }

    public final boolean G() {
        return !this.x;
    }

    public final void a(final Bitmap bitmap, final int i2) {
        if (G() || this.M || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.b.e.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (i2 == 1) {
                        e.this.f45498N = sg.bigo.ads.common.w.b.a(bitmap);
                    } else {
                        e.this.y = sg.bigo.ads.common.w.b.a(bitmap);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void b(boolean z2) {
        this.x = z2;
    }
}
