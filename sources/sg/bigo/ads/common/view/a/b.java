package sg.bigo.ads.common.view.a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class b {
    protected final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final float f47670e;
    protected final float f;
    protected final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Rect f47671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f47672i;
    protected final int j;
    protected final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final float f47673l;
    protected final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Drawable f47674n;

    public b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 1291845632, 0, 0.0f);
    }

    public final void a(Rect rect) {
        Rect rect2 = this.f47671h;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect.left = rect2.left;
        rect.top = rect2.top;
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
    }

    public final int b() {
        return this.f47672i;
    }

    public final float c() {
        return this.f47673l;
    }

    public final float d() {
        return this.m;
    }

    public final Drawable e() {
        return this.f47674n;
    }

    public b(float f, float f2, float f3, float f4, int i2, int i3, float f5) {
        this(f, f2, f3, f4, null, i2, i3, f5, null);
    }

    public final void a(float[] fArr) {
        float f = this.d;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = this.f47670e;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = this.f;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = this.g;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    public b(float f, float f2, float f3, float f4, Rect rect, int i2, int i3, float f5, boolean[] zArr) {
        this.d = f;
        this.f47670e = f2;
        this.f = f3;
        this.g = f4;
        this.f47671h = rect;
        this.f47672i = i2;
        this.j = i3;
        this.k = f5;
        this.f47673l = Math.max(0.0f, Math.min(25.0f, 23.0f));
        this.m = 4.0f;
        this.f47674n = (i3 == 0 || f5 <= 0.0f) ? null : sg.bigo.ads.common.utils.d.a(f, f2, f3, f4, i3, f5, zArr);
    }
}
