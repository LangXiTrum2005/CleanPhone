package com.bytedance.sdk.component.adexpress.di;

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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class co extends View {
    private PorterDuff.Mode aw;
    private LinearGradient bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Xfermode f18031co;
    private int di;
    private int fi;
    private int ik;
    private int[] jbs;
    private int ka;
    Rect lr;
    private int mj;
    private Bitmap qt;
    Rect ri;
    private Paint sf;
    private final List<ri> vr;
    private int xha;

    public static class ri {
        private int lr = 0;
        private final int ri;

        public ri(int i) {
            this.ri = i;
        }

        public void ri() {
            this.lr += this.ri;
        }
    }

    public co(Context context) {
        super(context);
        this.aw = PorterDuff.Mode.DST_IN;
        this.vr = new ArrayList();
        ri();
    }

    private void ri() {
        this.ik = com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_splash_unlock_image_arrow");
        this.ka = Color.parseColor("#00ffffff");
        this.fi = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.di = color;
        this.xha = 10;
        this.mj = 40;
        this.jbs = new int[]{this.ka, this.fi, color};
        setLayerType(1, null);
        this.sf = new Paint(1);
        this.qt = BitmapFactory.decodeResource(getResources(), this.ik);
        this.f18031co = new PorterDuffXfermode(this.aw);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.qt, this.ri, this.lr, this.sf);
        canvas.save();
        Iterator<ri> it = this.vr.iterator();
        while (it.hasNext()) {
            ri next = it.next();
            this.bgr = new LinearGradient(next.lr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, next.lr + this.mj, this.xha, this.jbs, (float[]) null, Shader.TileMode.CLAMP);
            this.sf.setColor(-1);
            this.sf.setShader(this.bgr);
            Canvas canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.sf);
            this.sf.setShader(null);
            next.ri();
            if (next.lr > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.sf.setXfermode(this.f18031co);
        canvas3.drawBitmap(this.qt, this.ri, this.lr, this.sf);
        this.sf.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.qt == null) {
            return;
        }
        this.ri = new Rect(0, 0, this.qt.getWidth(), this.qt.getHeight());
        this.lr = new Rect(0, 0, getWidth(), getHeight());
    }

    public void ri(int i) {
        this.vr.add(new ri(i));
        postInvalidate();
    }
}
