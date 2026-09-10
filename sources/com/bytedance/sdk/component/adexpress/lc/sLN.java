package com.bytedance.sdk.component.adexpress.lc;

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

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends View {
    private final List<Lxb> IeN;
    private Paint JVA;
    private int JXs;
    Rect LD;
    Rect Lxb;
    private PorterDuff.Mode NXR;
    private int OY;
    private int[] QAg;
    private LinearGradient STP;
    private int ZU;
    private int ebl;
    private int lc;
    private int lk;
    private Bitmap nBu;
    private Xfermode sLN;

    public static class Lxb {
        private int LD = 0;
        private final int Lxb;

        public Lxb(int i) {
            this.Lxb = i;
        }

        public void Lxb() {
            this.LD += this.Lxb;
        }
    }

    public sLN(Context context) {
        super(context);
        this.NXR = PorterDuff.Mode.DST_IN;
        this.IeN = new ArrayList();
        Lxb();
    }

    private void Lxb() {
        this.lk = com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_splash_unlock_image_arrow");
        this.ZU = Color.parseColor("#00ffffff");
        this.JXs = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.lc = color;
        this.ebl = 10;
        this.OY = 40;
        this.QAg = new int[]{this.ZU, this.JXs, color};
        setLayerType(1, null);
        this.JVA = new Paint(1);
        this.nBu = BitmapFactory.decodeResource(getResources(), this.lk);
        this.sLN = new PorterDuffXfermode(this.NXR);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.nBu, this.Lxb, this.LD, this.JVA);
        canvas.save();
        Iterator<Lxb> it = this.IeN.iterator();
        while (it.hasNext()) {
            Lxb next = it.next();
            this.STP = new LinearGradient(next.LD, 0.0f, next.LD + this.OY, this.ebl, this.QAg, (float[]) null, Shader.TileMode.CLAMP);
            this.JVA.setColor(-1);
            this.JVA.setShader(this.STP);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.JVA);
            this.JVA.setShader(null);
            next.Lxb();
            if (next.LD > getWidth()) {
                it.remove();
            }
        }
        this.JVA.setXfermode(this.sLN);
        canvas.drawBitmap(this.nBu, this.Lxb, this.LD, this.JVA);
        this.JVA.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.nBu == null) {
            return;
        }
        this.Lxb = new Rect(0, 0, this.nBu.getWidth(), this.nBu.getHeight());
        this.LD = new Rect(0, 0, getWidth(), getHeight());
    }

    public void Lxb(int i) {
        this.IeN.add(new Lxb(i));
        postInvalidate();
    }
}
