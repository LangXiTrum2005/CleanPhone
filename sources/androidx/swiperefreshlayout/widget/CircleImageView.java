package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
class CircleImageView extends ImageView {

    public class OvalShadow extends OvalShape {
        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public final void draw(Canvas canvas, Paint paint) {
            throw null;
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            throw null;
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        throw null;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }
}
