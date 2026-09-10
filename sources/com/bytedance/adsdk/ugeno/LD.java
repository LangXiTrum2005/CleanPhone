package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.QAg;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.umeng.analytics.pro.cw;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LD extends com.bytedance.adsdk.ugeno.LD.Lxb<com.bytedance.adsdk.ugeno.lc.LD> {
    private float Bj;
    private float FtP;
    private int Iyd;
    private String LD;
    private float Rt;
    private int SlV;
    private JSONArray TA;
    private boolean ZU;
    private boolean chu;
    private com.bytedance.adsdk.ugeno.LD.lk ek;
    private float goy;
    private boolean lk;
    private String mb;
    private float owi;
    private float pyu;

    public LD(Context context) {
        super(context);
        this.lk = true;
        this.ZU = true;
        this.Rt = 0.0f;
        this.pyu = 2000.0f;
        this.mb = "normal";
        this.chu = true;
        this.SlV = Color.parseColor("#666666");
        this.Iyd = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        JSONArray jSONArray = this.TA;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lc.LD) this.OY).ZU((int) this.Bj).JXs((int) this.FtP).lc((int) this.goy).LD(this.chu).LD(this.Iyd).lk(this.SlV).Lxb(this.mb).lk(this.lk).Lxb(this.owi).Lxb(this.ZU).Lxb((int) this.pyu).LD(this.chu);
        for (int i = 0; i < this.TA.length(); i++) {
            QAg qAg = new QAg(this.JXs);
            qAg.Lxb(this.FV);
            com.bytedance.adsdk.ugeno.LD.lk<View> lkVarLD = qAg.LD(this.ek.foI(), null);
            qAg.LD(this.TA.optJSONObject(i));
            ((com.bytedance.adsdk.ugeno.lc.LD) this.OY).Lxb(lkVarLD);
        }
        if (this.ZU) {
            ((com.bytedance.adsdk.ugeno.lc.LD) this.OY).Lxb();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public View ZU() {
        com.bytedance.adsdk.ugeno.lc.LD ld = new com.bytedance.adsdk.ugeno.lc.LD(this.JXs);
        this.OY = ld;
        ld.Lxb((lk) this);
        return this.OY;
    }

    public void Lxb(com.bytedance.adsdk.ugeno.lc.lk lkVar) {
        T t = this.OY;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.lc.LD) t).setOnPageChangeListener(lkVar);
        }
    }

    public void Lxb(int i) {
        T t = this.OY;
        if (t != 0) {
            ((com.bytedance.adsdk.ugeno.lc.LD) t).QAg(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        this.ek = lkVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1657957217:
                if (str.equals("delayStart")) {
                    b = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b = 1;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b = 2;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b = 3;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b = 4;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b = 5;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b = 6;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b = 7;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b = 8;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b = 9;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b = 10;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b = 11;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b = 12;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b = cw.k;
                }
                break;
        }
        switch (b) {
            case 0:
                this.Rt = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f);
                break;
            case 1:
                this.SlV = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case 2:
                this.goy = OY.Lxb(this.JXs, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f));
                break;
            case 3:
                this.mb = str2;
                break;
            case 4:
                this.LD = str2;
                break;
            case 5:
                this.chu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, true);
                break;
            case 6:
                this.FtP = OY.Lxb(this.JXs, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f));
                break;
            case 7:
                this.lk = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, true);
                break;
            case 8:
                this.pyu = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 500.0f);
                break;
            case 9:
                this.owi = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 1.0f);
                break;
            case 10:
                this.Bj = OY.Lxb(this.JXs, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, 0.0f));
                break;
            case 11:
                this.Iyd = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str2);
                break;
            case 12:
                this.ZU = com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str2, true);
                break;
            case 13:
                this.TA = com.bytedance.adsdk.ugeno.ebl.LD.Lxb(str2, (JSONArray) null);
                break;
        }
    }
}
