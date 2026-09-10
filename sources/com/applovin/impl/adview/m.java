package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f7515c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f7516d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Paint f7517e = new Paint(1);

    public m(Context context) {
        super(context);
        f7515c.setColor(-1);
        f7516d.setColor(-16777216);
        Paint paint = f7517e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f7488a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f7488a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f7488a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f7515c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f7516d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f7517e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
