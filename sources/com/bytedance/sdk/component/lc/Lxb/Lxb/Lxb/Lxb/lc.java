package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb;

import android.content.Context;
import com.bytedance.sdk.component.lc.Lxb.OY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends ebl {
    public lc(Context context, com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb) {
        super(context, lxb);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ebl, com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.lk
    public String LD() {
        return OY.ebl().ZU().JXs();
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ebl
    public byte Lxb() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.Lxb.ebl
    public byte lk() {
        return (byte) 3;
    }

    public static String Lxb(String str) {
        return DM.B("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
