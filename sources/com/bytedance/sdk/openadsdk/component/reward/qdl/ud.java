package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static void qdl(qdl qdlVar, Intent intent, Bundle bundle) {
        qdl(intent, qdlVar);
        qdl(bundle, qdlVar);
    }

    public static ljh qdl(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        ljh ljhVarRq = null;
        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            com.bytedance.sdk.openadsdk.core.model.qdl qdlVarUd = koa.qdl().ud(koa.qdl(intent));
            ljhVarRq = qdlVarUd != null ? qdlVarUd.rq() : null;
            if (udVar != null) {
                udVar.qdl(bundle);
            }
            koa.qdl().mzz();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    ljhVarRq = com.bytedance.sdk.openadsdk.core.model.qdl.ud(new JSONObject(stringExtra)).rq();
                }
            } catch (Exception e2) {
                aaj.qdl("TTAD.RFDM", "", e2);
            }
        }
        if (bundle != null) {
            try {
                ljhVarRq = koa.qdl().qdl(bundle.getInt("meta_index", -1));
                Objects.toString(ljhVarRq);
            } catch (Throwable th) {
                aaj.qdl("TTAD.RFDM", "", th);
            }
        }
        if (ljhVarRq != null) {
            ljhVarRq.qdl(ljhVarRq.tid(), 7);
        }
        return ljhVarRq;
    }

    public static void qdl(Intent intent, qdl qdlVar) {
        if (intent == null) {
            return;
        }
        qdlVar.bch.lnr(intent.getBooleanExtra("video_is_cached", false));
        qdlVar.wak = intent.getStringExtra("multi_process_listener_key");
        qdlVar.car = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void qdl(Bundle bundle, qdl qdlVar) {
        if (bundle == null) {
            return;
        }
        qdlVar.wak = bundle.getString("multi_process_listener_key");
        qdlVar.bch.lnr(bundle.getBoolean("video_is_cached", false));
        qdlVar.gt = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            qdlVar.bch.ud(bundle.getLong("video_current", 0L));
        }
        qdlVar.qdl(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void qdl(qdl qdlVar, Bundle bundle, int i2) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i2);
            bundle.putString("multi_process_listener_key", qdlVar.wak);
            bundle.putBoolean("video_is_cached", qdlVar.bch.kdv());
            bundle.putLong("video_current", qdlVar.bch.fs());
            bundle.putBoolean("is_mute", qdlVar.gt);
            bundle.putBoolean("has_show_skip_btn", qdlVar.mlb);
        } catch (Throwable th) {
            aaj.qdl("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void qdl(ljh ljhVar, Intent intent, Bundle bundle, int i2) {
        if (bundle == null || ljhVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i2);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            aaj.qdl("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    public static void qdl(Intent intent, Activity activity, boolean z2, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, String str) {
        int rotation;
        JSONObject jSONObjectExu;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e2) {
                aaj.qdl("TTAD.RFDM", "", e2);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z2);
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                jSONObjectExu = qdlVar.exu();
                if (jSONObjectExu == null) {
                    return;
                }
                intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectExu.toString());
                intent.putExtra("multi_process_listener_key", str);
                return;
            }
            koa.qdl().mzz();
            intent.putExtra("meta_index", koa.qdl().qdl(qdlVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z2);
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            jSONObjectExu = qdlVar.exu();
            if (jSONObjectExu == null) {
                return;
            }
            intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectExu.toString());
            intent.putExtra("multi_process_listener_key", str);
            return;
        }
        koa.qdl().mzz();
        intent.putExtra("meta_index", koa.qdl().qdl(qdlVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
