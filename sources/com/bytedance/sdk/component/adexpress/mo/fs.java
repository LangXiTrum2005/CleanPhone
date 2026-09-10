package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fs extends View {
    private final List<qdl> bjy;
    private PorterDuff.Mode exu;
    private Xfermode fs;
    private int jpc;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    Rect qdl;
    private LinearGradient rdp;
    private Paint rq;
    private Bitmap to;
    private int[] tvp;
    Rect ud;
    private int wd;

    public static class qdl {
        private final int qdl;
        private int ud = 0;

        public qdl(int i2) {
            this.qdl = i2;
        }

        public void qdl() {
            this.ud += this.qdl;
        }
    }

    public fs(Context context) {
        super(context);
        this.exu = PorterDuff.Mode.DST_IN;
        this.bjy = new ArrayList();
        qdl();
    }

    private void qdl() {
        this.lnr = com.bytedance.sdk.component.utils.ljh.mml(getContext(), "tt_splash_unlock_image_arrow");
        this.mml = Color.parseColor("#00ffffff");
        this.mzz = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.mo = color;
        this.wd = 10;
        this.jpc = 40;
        this.tvp = new int[]{this.mml, this.mzz, color};
        setLayerType(1, null);
        this.rq = new Paint(1);
        this.to = BitmapFactory.decodeResource(getResources(), this.lnr);
        this.fs = new PorterDuffXfermode(this.exu);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.to, this.qdl, this.ud, this.rq);
        canvas.save();
        Iterator<qdl> it = this.bjy.iterator();
        while (it.hasNext()) {
            qdl next = it.next();
            this.rdp = new LinearGradient(next.ud, 0.0f, next.ud + this.jpc, this.wd, this.tvp, (float[]) null, Shader.TileMode.CLAMP);
            this.rq.setColor(-1);
            this.rq.setShader(this.rdp);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.rq);
            this.rq.setShader(null);
            next.qdl();
            if (next.ud > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.rq.setXfermode(this.fs);
        canvas3.drawBitmap(this.to, this.qdl, this.ud, this.rq);
        this.rq.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.to == null) {
            return;
        }
        this.qdl = new Rect(0, 0, this.to.getWidth(), this.to.getHeight());
        this.ud = new Rect(0, 0, getWidth(), getHeight());
    }

    public void qdl(int i2) {
        this.bjy.add(new qdl(i2));
        postInvalidate();
    }
}
