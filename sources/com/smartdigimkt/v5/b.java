package com.smartdigimkt.v5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.v5.a
    public Path a(int i2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f = i2;
        path.rLineTo(f, 0.0f);
        path.rLineTo(0.0f, f);
        float f2 = -i2;
        path.rLineTo(f2, 0.0f);
        path.rLineTo(0.0f, f2);
        path.close();
        return path;
    }

    @Override // com.smartdigimkt.v5.a
    public com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a b(int i2, int i3, int i4) {
        return new com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a((int) (((double) i2) * 0.15d), (int) ((((double) i3) / 2.0d) - (((double) i4) * 1.5d)));
    }

    @Override // com.smartdigimkt.v5.a
    public Paint b() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
        paint.setAlpha(127);
        return paint;
    }

    @Override // com.smartdigimkt.v5.a
    public com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a a(int i2, int i3, int i4) {
        return new com.smartdigimkt.sdk.basead.ui.guidetoclickv2.picverify.a((i2 - i4) - ((int) (((double) i2) * 0.15d)), (int) ((((double) i3) / 2.0d) - (((double) i4) * 1.5d)));
    }

    @Override // com.smartdigimkt.v5.a
    public Paint a() {
        return new Paint();
    }

    @Override // com.smartdigimkt.v5.a
    public void a(Context context, Canvas canvas, Path path) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(h.a(context, 2.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 20.0f}, 10.0f));
        canvas.drawPath(new Path(path), paint);
    }
}
