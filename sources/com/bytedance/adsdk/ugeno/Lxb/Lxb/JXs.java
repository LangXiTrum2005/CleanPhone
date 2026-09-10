package com.bytedance.adsdk.ugeno.Lxb.Lxb;

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
public class JXs extends Lxb {
    private Path JVA;
    private Paint JXs;
    private PorterDuffXfermode NXR;
    private boolean OY;
    private boolean QAg;
    private float ZU;
    private String ebl;
    private float lc;
    private float lk;
    private Path nBu;
    private Path sLN;

    public JXs(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        super(lkVar, jSONObject);
        this.OY = true;
        this.QAg = true;
        Paint paint = new Paint();
        this.JXs = paint;
        paint.setAntiAlias(true);
        this.LD.QAg().setLayerType(2, null);
        this.NXR = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.nBu = new Path();
        this.JVA = new Path();
        this.sLN = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void LD() {
        this.lc = (float) this.Lxb.optDouble("start", 0.0d);
        this.ebl = this.Lxb.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(Canvas canvas) {
        if (this.LD.JJ() > 0.0f) {
            int iJJ = (int) (this.LD.JJ() * this.lk);
            int iJJ2 = (int) (this.LD.JJ() * this.ZU);
            this.JXs.setXfermode(this.NXR);
            String str = this.ebl;
            str.getClass();
            switch (str) {
                case "bottom":
                    canvas.drawRect(0.0f, iJJ2, this.lk, this.ZU, this.JXs);
                    break;
                case "center":
                    this.nBu.reset();
                    this.JVA.reset();
                    this.sLN.reset();
                    Path.Direction direction = Path.Direction.CW;
                    this.nBu.addCircle(this.lk / 2.0f, this.ZU / 2.0f, iJJ, direction);
                    Path path = this.JVA;
                    float f = this.lk;
                    path.addRect(f / 2.0f, 0.0f, f, this.ZU, direction);
                    Path path2 = this.JVA;
                    Path path3 = this.nBu;
                    Path.Op op = Path.Op.DIFFERENCE;
                    path2.op(path3, op);
                    this.sLN.addRect(0.0f, 0.0f, this.lk / 2.0f, this.ZU, direction);
                    this.sLN.op(this.nBu, op);
                    canvas.drawPath(this.JVA, this.JXs);
                    canvas.drawPath(this.sLN, this.JXs);
                    break;
                case "top":
                    canvas.drawRect(0.0f, 0.0f, this.lk, this.ZU - iJJ2, this.JXs);
                    break;
                case "left":
                    canvas.drawRect(0.0f, 0.0f, this.lk - iJJ, this.ZU, this.JXs);
                    break;
                case "right":
                    canvas.drawRect(iJJ, 0.0f, this.lk, this.ZU, this.JXs);
                    break;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public List<PropertyValuesHolder> lk() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ZU(), this.lc, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(int i, int i2) {
        if (i > 0 && this.OY) {
            this.lk = i;
            this.OY = false;
        }
        if (i2 <= 0 || !this.QAg) {
            return;
        }
        this.ZU = i2;
        this.QAg = false;
    }
}
