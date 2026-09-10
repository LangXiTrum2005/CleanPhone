package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends View {
    private static final int[] ri = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final Paint di;
    private final Paint fi;
    private final RectF ik;
    private int jbs;
    private final ArrayList<ri> ka;
    private final RectF lr;
    private int mj;
    private int xha;

    public static final class ri {
        float ik;
        float ka;
        public float lr;
        public Paint ri;

        public ri(Paint paint, float f, float f2, float f3) {
            this.ri = paint;
            this.lr = f;
            this.ik = f2;
            this.ka = f3;
        }
    }

    public mj(Context context) {
        super(context);
        this.lr = new RectF();
        this.ik = new RectF();
        this.ka = new ArrayList<>();
        this.di = new Paint();
        Paint paint = new Paint();
        this.fi = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void ri() {
        if (this.xha <= 0) {
            return;
        }
        this.ik.right = Math.max(this.jbs, (int) (((this.mj * 1.0f) / 100.0f) * getWidth()));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.lr;
        int i = this.xha;
        canvas.drawRoundRect(rectF, i, i, this.fi);
        RectF rectF2 = this.ik;
        int i2 = this.xha;
        canvas.drawRoundRect(rectF2, i2, i2, this.di);
        int iSave = canvas.save();
        canvas.translate(this.ik.right - this.jbs, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (ri riVar : this.ka) {
            canvas.drawCircle(riVar.ik, riVar.ka, riVar.lr, riVar.ri);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 / 2;
        this.xha = i5;
        this.jbs = i5 * 5;
        float f = i;
        float f2 = i2;
        this.lr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        this.ik.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        this.di.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.ka.clear();
        float f3 = this.xha / 4.0f;
        for (int i6 : ri) {
            Paint paint = new Paint();
            paint.setColor(i6);
            this.ka.add(new ri(paint, this.xha / 2.0f, f3, f2 / 2.0f));
            f3 += (this.xha / 2.0f) * 3.0f;
        }
        ri();
    }

    public void setProgress(int i) {
        int i2 = this.mj;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        if (i2 == i) {
            return;
        }
        this.mj = i;
        ri();
    }
}
