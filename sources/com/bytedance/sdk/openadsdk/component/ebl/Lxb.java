package com.bytedance.sdk.openadsdk.component.ebl;

import android.content.Context;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.lc;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.multipro.LD;
import com.bytedance.sdk.openadsdk.utils.JVA;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static File LD(String str) {
        return Lxb(kqm.Lxb(), lc.Lxb(kqm.Lxb()).LD(), str);
    }

    public static File Lxb(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(((OK) CacheDirFactory.getICacheDir(0)).a());
        return new File(DM.m(sb, File.separator, str));
    }

    public static String LD() {
        return com.bytedance.sdk.component.utils.lc.Lxb(kqm.Lxb(), LD.lk(), lc.Lxb(kqm.Lxb()).LD()).getAbsolutePath();
    }

    public static String Lxb() {
        return JVA.Lxb();
    }

    public static File Lxb(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.lc.Lxb(context, LD.lk(), str, str2);
    }

    public static void Lxb(File file) {
        if (file == null) {
            return;
        }
        try {
            com.bytedance.sdk.component.utils.lc.LD(file);
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(Context context) {
        try {
            lc.Lxb(context).Lxb();
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(JSONObject jSONObject, int i, boolean z) {
        try {
            String strLc = QAg.LD().lc();
            int iEbl = QAg.LD().ebl();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strLc);
            if (!z) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iEbl)));
            } else if (QAg.LD().ebl() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", kqm.ZU().eK(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            sLN.Lxb("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int Lxb(tD tDVar, int i) {
        return i - tDVar.nH();
    }
}
