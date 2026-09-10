package com.bytedance.sdk.openadsdk.core.co.lr;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.adsdk.ugeno.jbs.ik.ri {
    public ka(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.ik.ri
    public String aw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
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
