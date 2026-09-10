package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.VVE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class OY extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        if (!com.bytedance.adsdk.Lxb.LD.JXs.Lxb.ZU(Lxb(i, str))) {
            return lxb.Lxb(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{Lxb(i, str), Lxb(i2, str)});
        if (com.bytedance.adsdk.Lxb.LD.ZU.lk.Lxb(str2) != null) {
            deque.push(new VVE(com.bytedance.adsdk.Lxb.LD.ZU.lk.Lxb(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(Lxb(i, str));
        if (com.bytedance.adsdk.Lxb.LD.ZU.lk.Lxb(strValueOf) != null) {
            deque.push(new VVE(com.bytedance.adsdk.Lxb.LD.ZU.lk.Lxb(strValueOf)));
            return i2;
        }
        StringBuilder sbU = AbstractC3950lJ.u("Unrecognized:", strValueOf, "examine:");
        sbU.append(str.substring(0, i));
        throw new IllegalArgumentException(sbU.toString());
    }
}
