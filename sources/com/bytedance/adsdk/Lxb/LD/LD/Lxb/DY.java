package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DY implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private final String Lxb;

    public DY(String str) {
        this.Lxb = str;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        return DM.m(new StringBuilder("'"), this.Lxb, "'");
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        return this.Lxb;
    }

    public String toString() {
        return LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.lc.STRING;
    }
}
