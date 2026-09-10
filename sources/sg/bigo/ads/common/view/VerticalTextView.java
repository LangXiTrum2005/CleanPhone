package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class VerticalTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47617a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47617a = true;
        int gravity = getGravity();
        if (!Gravity.isVertical(gravity) || (gravity & 112) != 80) {
            this.f47617a = true;
        } else {
            setGravity((gravity & 7) | 48);
            this.f47617a = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f47617a) {
            canvas.translate(getWidth(), 0.0f);
            f = 90.0f;
        } else {
            canvas.translate(0.0f, getHeight());
            f = -90.0f;
        }
        canvas.rotate(f);
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i3, i2);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
