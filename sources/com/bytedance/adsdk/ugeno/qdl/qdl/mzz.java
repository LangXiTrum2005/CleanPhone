package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends qdl {
    private PorterDuffXfermode exu;
    private Path fs;
    private boolean jpc;
    private float lnr;
    private float mml;
    private float mo;
    private Paint mzz;
    private Path rq;
    private Path to;
    private boolean tvp;
    private String wd;

    public mzz(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        this.jpc = true;
        this.tvp = true;
        Paint paint = new Paint();
        this.mzz = paint;
        paint.setAntiAlias(true);
        this.ud.rq().setLayerType(2, null);
        this.exu = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.to = new Path();
        this.rq = new Path();
        this.fs = new Path();
        this.mzz.setXfermode(this.exu);
    }

    private void lnr(Canvas canvas) {
        if (this.ud.gt() <= 0.0f) {
            this.mzz.setXfermode(this.exu);
            canvas.drawRect(0.0f, 0.0f, this.lnr, this.mml, this.mzz);
            return;
        }
        int iGt = (int) (this.ud.gt() * this.lnr);
        int iGt2 = (int) (this.ud.gt() * this.mml);
        this.mzz.setXfermode(this.exu);
        String str = this.wd;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iGt2, this.lnr, this.mml, this.mzz);
                break;
            case "center":
                this.to.reset();
                this.rq.reset();
                this.fs.reset();
                Path.Direction direction = Path.Direction.CW;
                this.to.addCircle(this.lnr / 2.0f, this.mml / 2.0f, iGt, direction);
                Path path = this.rq;
                float f = this.lnr;
                path.addRect(f / 2.0f, 0.0f, f, this.mml, direction);
                Path path2 = this.rq;
                Path path3 = this.to;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.fs.addRect(0.0f, 0.0f, this.lnr / 2.0f, this.mml, direction);
                this.fs.op(this.to, op);
                canvas.drawPath(this.rq, this.mzz);
                canvas.drawPath(this.fs, this.mzz);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.lnr, this.mml - iGt2, this.mzz);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.lnr - iGt, this.mml, this.mzz);
                break;
            case "right":
                canvas.drawRect(iGt, 0.0f, this.lnr, this.mml, this.mzz);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.mo = (float) this.qdl.optDouble("start", 0.0d);
        this.wd = this.qdl.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i2, int i3) {
        if (i2 > 0 && this.jpc) {
            this.lnr = i2;
            this.jpc = false;
        }
        if (i3 <= 0 || !this.tvp) {
            return;
        }
        this.mml = i3;
        this.tvp = false;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public List<PropertyValuesHolder> lnr() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(mml(), this.mo, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
