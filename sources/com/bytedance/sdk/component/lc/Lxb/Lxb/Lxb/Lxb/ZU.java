package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb;

import android.content.Context;
import com.bytedance.sdk.component.lc.Lxb.OY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends Lxb {
    public ZU(Context context, com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        super(context, lxb);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb, com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lk
    public String LD() {
        com.bytedance.sdk.component.lc.Lxb.Lxb.JXs jXsZU = OY.ebl().ZU();
        if (jXsZU != null) {
            return jXsZU.Lxb();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb
    public byte ZU() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.Lxb
    public byte lk() {
        return (byte) 1;
    }

    public static String lk(String str) {
        return DM.B("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
