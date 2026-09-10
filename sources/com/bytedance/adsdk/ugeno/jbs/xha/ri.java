package com.bytedance.adsdk.ugeno.jbs.xha;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri extends com.bytedance.adsdk.ugeno.lr.ri<com.bytedance.adsdk.ugeno.jbs.lr.ri> {
    public ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                lr(str, str2);
                break;
        }
    }
}
