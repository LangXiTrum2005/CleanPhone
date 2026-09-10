package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes7.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Rect f48704a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Rect f48705b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f48706c = new Rect();
    final Rect d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f48707e = new Rect();
    final Rect f = new Rect();
    final Rect g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f48708h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f48709i;
    private final float j;

    public j(Context context, float f) {
        this.f48709i = context.getApplicationContext();
        this.j = f;
    }

    public final void a(Rect rect, Rect rect2) {
        rect2.set(sg.bigo.ads.common.utils.e.a(this.f48709i, rect.left), sg.bigo.ads.common.utils.e.a(this.f48709i, rect.top), sg.bigo.ads.common.utils.e.a(this.f48709i, rect.right), sg.bigo.ads.common.utils.e.a(this.f48709i, rect.bottom));
    }
}
