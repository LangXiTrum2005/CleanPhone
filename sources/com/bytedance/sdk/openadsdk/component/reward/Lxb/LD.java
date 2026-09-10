package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.aH;
import com.bytedance.sdk.openadsdk.core.model.DY;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static final SparseArray<WeakReference<com.bytedance.sdk.openadsdk.core.model.tD>> Lxb = new SparseArray<>();

    public static void Lxb(Lxb lxb, Intent intent, Bundle bundle) {
        Lxb(intent, lxb);
        Lxb(bundle, lxb);
    }

    public static com.bytedance.sdk.openadsdk.core.model.tD Lxb(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        com.bytedance.sdk.openadsdk.core.model.tD dy = null;
        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            com.bytedance.sdk.openadsdk.core.model.Lxb lxbEbl = aH.Lxb().ebl();
            dy = lxbEbl != null ? new DY(lxbEbl) : null;
            if (ld != null) {
                ld.Lxb(bundle);
            }
            aH.Lxb().lc();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    dy = new DY(com.bytedance.sdk.openadsdk.core.model.Lxb.lk(new JSONObject(stringExtra)));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFDM", "", e);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<com.bytedance.sdk.openadsdk.core.model.tD> weakReference = Lxb.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    dy = weakReference.get();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFDM", "", th);
            }
        }
        if (dy != null) {
            dy.Lxb(dy.brP(), 7);
        }
        return dy;
    }

    public static void Lxb(Intent intent, Lxb lxb) {
        if (intent == null) {
            return;
        }
        lxb.eK.lk(intent.getBooleanExtra("video_is_cached", false));
        lxb.sRq = intent.getStringExtra("multi_process_listener_key");
        lxb.SS = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void Lxb(Bundle bundle, Lxb lxb) {
        if (bundle == null) {
            return;
        }
        lxb.sRq = bundle.getString("multi_process_listener_key");
        lxb.eK.lk(bundle.getBoolean("video_is_cached", false));
        lxb.Of = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            lxb.eK.Lxb(bundle.getLong("video_current", 0L));
        }
        lxb.Lxb(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void Lxb(Lxb lxb, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.LD;
            Lxb.append(tDVar.hashCode(), new WeakReference<>(tDVar));
            bundle.putInt("meta_tmp", tDVar.hashCode());
            bundle.putString("multi_process_listener_key", lxb.sRq);
            bundle.putBoolean("video_is_cached", lxb.eK.aH());
            bundle.putLong("video_current", lxb.eK.ebl());
            bundle.putBoolean("is_mute", lxb.Of);
            bundle.putBoolean("has_show_skip_btn", lxb.LXE);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    public static void Lxb(Intent intent, Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.Lxb lxb, String str) {
        int rotation;
        JSONObject jSONObjectNXR;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFDM", "", e);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                jSONObjectNXR = lxb.NXR();
                if (jSONObjectNXR == null) {
                    com.bytedance.sdk.component.utils.sLN.LD("toJsonObj return null");
                    return;
                } else {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectNXR.toString());
                    intent.putExtra("multi_process_listener_key", str);
                    return;
                }
            }
            aH.Lxb().lc();
            aH.Lxb().Lxb(lxb);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            jSONObjectNXR = lxb.NXR();
            if (jSONObjectNXR == null) {
                com.bytedance.sdk.component.utils.sLN.LD("toJsonObj return null");
                return;
            } else {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectNXR.toString());
                intent.putExtra("multi_process_listener_key", str);
                return;
            }
        }
        aH.Lxb().lc();
        aH.Lxb().Lxb(lxb);
    }
}
