package com.bytedance.adsdk.ugeno.Lxb.Lxb;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb {
    private static final int ebl = Color.parseColor("#7ed321");
    private int JXs;
    private int ZU;
    private Paint lc;
    private int lk;

    public LD(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        super(lkVar, jSONObject);
        Paint paint = new Paint();
        this.lc = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void LD() {
        this.lk = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(this.Lxb.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), ebl);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(Canvas canvas) {
        try {
            if (this.LD.dR() > 0.0f) {
                this.lc.setColor(this.lk);
                this.lc.setAlpha((int) ((1.0f - this.LD.dR()) * 255.0f));
                ((ViewGroup) this.LD.QAg().getParent()).setClipChildren(true);
                int i = this.ZU;
                int i2 = this.JXs;
                canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * this.LD.dR(), this.lc);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public List<PropertyValuesHolder> lk() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ZU(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(int i, int i2) {
        this.ZU = i / 2;
        this.JXs = i2 / 2;
    }
}
