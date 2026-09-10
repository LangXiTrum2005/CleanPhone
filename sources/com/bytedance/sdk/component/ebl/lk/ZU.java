package com.bytedance.sdk.component.ebl.lk;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public boolean Lxb = false;
    public boolean LD = true;
    public Map<String, Integer> lk = null;
    public Map<String, String> ZU = null;
    public int JXs = 10;
    public int lc = 1;
    public int ebl = 1;
    public int OY = 10;
    public int QAg = 1;
    public int nBu = 1;
    public int JVA = TypedValues.Custom.TYPE_INT;
    public int sLN = 120;
    public String NXR = null;
    public int STP = 0;
    public long IeN = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder(" localEnable: ");
        sb.append(this.Lxb);
        sb.append(" probeEnable: ");
        sb.append(this.LD);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.lk;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.ZU;
        sb.append(map2 != null ? map2.size() : 0);
        sb.append(" reqTo: ");
        sb.append(this.JXs);
        sb.append("#");
        sb.append(this.lc);
        sb.append("#");
        sb.append(this.ebl);
        sb.append(" reqErr: ");
        sb.append(this.OY);
        sb.append("#");
        sb.append(this.QAg);
        sb.append("#");
        sb.append(this.nBu);
        sb.append(" updateInterval: ");
        sb.append(this.JVA);
        sb.append(" updateRandom: ");
        sb.append(this.sLN);
        sb.append(" httpBlack: ");
        sb.append(this.NXR);
        return sb.toString();
    }
}
