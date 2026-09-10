package com.bytedance.adsdk.ugeno.tvp.wd;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.tvp.ud.qdl> {
    public qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        str.getClass();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                ud(str, str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
    }
}
