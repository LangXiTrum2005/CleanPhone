package com.bytedance.sdk.openadsdk.core.JVA.LD;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends com.bytedance.adsdk.ugeno.QAg.lk.Lxb {
    public ZU(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.QAg.lk.Lxb
    public String ebl(String str) {
        str.getClass();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "right_arrow":
                return "tt_skip_btn";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}
