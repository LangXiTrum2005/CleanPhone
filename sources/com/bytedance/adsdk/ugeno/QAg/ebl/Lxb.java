package com.bytedance.adsdk.ugeno.QAg.ebl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb extends com.bytedance.adsdk.ugeno.LD.Lxb<com.bytedance.adsdk.ugeno.QAg.LD.Lxb> {
    public Lxb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                LD(str, str2);
                break;
        }
    }
}
