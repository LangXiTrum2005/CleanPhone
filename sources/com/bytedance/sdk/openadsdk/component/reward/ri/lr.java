package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static void ri(ri riVar, Intent intent, Bundle bundle) {
        ri(intent, riVar);
        ri(bundle, riVar);
    }

    public static wjv ri(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        com.bytedance.sdk.openadsdk.core.model.ri riVarLr = dw.ri().lr(dw.ri(intent));
        wjv wjvVarJbs = riVarLr != null ? riVarLr.jbs() : null;
        if (lrVar != null) {
            lrVar.ri(bundle);
        }
        dw.ri().fi();
        if (bundle != null) {
            try {
                wjvVarJbs = dw.ri().ri(bundle.getInt("meta_index", -1));
                Objects.toString(wjvVarJbs);
            } catch (Throwable th) {
                ac.ri("TTAD.RFDM", "", th);
            }
        }
        if (wjvVarJbs != null) {
            wjvVarJbs.ri(wjvVarJbs.zb(), 7);
        }
        return wjvVarJbs;
    }

    public static void ri(Intent intent, ri riVar) {
        if (intent == null) {
            return;
        }
        riVar.ihz.ik(intent.getBooleanExtra("video_is_cached", false));
        riVar.feb = intent.getStringExtra("multi_process_listener_key");
        riVar.rzk = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void ri(Bundle bundle, ri riVar) {
        if (bundle == null) {
            return;
        }
        riVar.feb = bundle.getString("multi_process_listener_key");
        riVar.ihz.ik(bundle.getBoolean("video_is_cached", false));
        riVar.zyn = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            riVar.ihz.lr(bundle.getLong("video_current", 0L));
        }
        riVar.ri(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void ri(ri riVar, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            bundle.putString("multi_process_listener_key", riVar.feb);
            bundle.putBoolean("video_is_cached", riVar.ihz.xd());
            bundle.putLong("video_current", riVar.ihz.aw());
            bundle.putBoolean("is_mute", riVar.zyn);
            bundle.putBoolean("has_show_skip_btn", riVar.qh);
        } catch (Throwable th) {
            ac.ri("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void ri(wjv wjvVar, Intent intent, Bundle bundle, int i) {
        if (bundle == null || wjvVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            ac.ri("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void ri(Intent intent, Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.ri riVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                ac.ri("TTAD.RFDM", "", e);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            dw.ri().fi();
            intent.putExtra("meta_index", dw.ri().ri(riVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        dw.ri().fi();
        intent.putExtra("meta_index", dw.ri().ri(riVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
