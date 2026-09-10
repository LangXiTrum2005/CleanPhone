package com.bytedance.adsdk.LD.lk;

import com.bytedance.adsdk.LD.lk.LD.VVE;
import com.bytedance.component.sdk.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ZU {
    private final String JXs;
    private final char LD;
    private final List<VVE> Lxb;
    private final double ZU;
    private final String lc;
    private final double lk;

    public ZU(List<VVE> list, char c, double d, double d2, String str, String str2) {
        this.Lxb = list;
        this.LD = c;
        this.lk = d;
        this.ZU = d2;
        this.JXs = str;
        this.lc = str2;
    }

    public static int Lxb(char c, String str, String str2) {
        return str2.hashCode() + DM.d(str, c * 31, 31);
    }

    public double LD() {
        return this.ZU;
    }

    public int hashCode() {
        return Lxb(this.LD, this.lc, this.JXs);
    }

    public List<VVE> Lxb() {
        return this.Lxb;
    }
}
