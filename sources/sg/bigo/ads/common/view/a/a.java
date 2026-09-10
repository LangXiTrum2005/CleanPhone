package sg.bigo.ads.common.view.a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends sg.bigo.ads.common.i.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f47669b;

    @Override // sg.bigo.ads.common.i.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f47310a;
        if (drawable == null) {
            return;
        }
        if ((drawable instanceof d.a) && ((d.a) drawable).f47685a.f47678e) {
            return;
        }
        if (this.f47669b == null) {
            super.draw(canvas);
            return;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        Rect rect = new Rect();
        this.f47669b.a(fArr);
        this.f47669b.a(rect);
        Rect bounds = getBounds();
        Rect rect2 = new Rect(rect.left, rect.top, bounds.width() - rect.right, bounds.height() - rect.bottom);
        path.addRoundRect(new RectF(rect2), fArr, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        Drawable drawableE = this.f47669b.e();
        if (drawableE != null) {
            drawableE.setBounds(rect2);
            drawableE.draw(canvas);
        }
    }
}
