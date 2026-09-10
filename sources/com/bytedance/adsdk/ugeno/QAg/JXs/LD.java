package com.bytedance.adsdk.ugeno.QAg.JXs;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.LD.lk;

/* JADX INFO: loaded from: classes.dex */
public class LD extends lk<Lxb> {
    private int LD;
    private int Lxb;
    private float Rt;
    private float ZU;
    private float lk;
    private static final int pyu = Color.parseColor("#FFC642");
    private static final int mb = Color.parseColor("#e3e3e4");

    public LD(Context context) {
        super(context);
        this.Lxb = pyu;
        this.LD = mb;
        this.lk = 4.0f;
        this.ZU = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        if (KPU()) {
            ((Lxb) this.OY).Lxb(this.lk, this.Lxb, this.LD, this.ZU, (int) this.Rt);
        } else {
            ((Lxb) this.OY).Lxb(this.lk, this.Lxb, this.LD, this.ZU, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Lxb ZU() {
        Lxb lxb = new Lxb(this.JXs);
        lxb.Lxb(this);
        return lxb;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.Lxb = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.LD = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2, mb);
                break;
            case "gap":
                this.Rt = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case "size":
                this.ZU = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 20.0f);
                break;
            case "score":
                this.lk = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 4.0f);
                break;
        }
    }
}
