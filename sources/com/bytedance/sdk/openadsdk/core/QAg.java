package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg {
    public static final Set<String> LD = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.QAg.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static NXR Lxb = null;
    private static boolean brP = false;
    private boolean DY;
    private com.bytedance.sdk.openadsdk.core.NXR.lk.lk HD;
    private Integer IeN;
    private int JVA;
    private String JXs;
    private boolean NXR;
    private boolean OY;

    @Nullable
    private String QAg;
    private Bitmap STP;
    private String Sfi;
    private Integer VVE;

    @NonNull
    private String ZU;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb> eK;
    private int ebl;
    private Integer kqm;

    @NonNull
    private String lc;
    private boolean lk;

    @Nullable
    private String nBu;
    private boolean sLN;
    private int tD;

    public static class Lxb {
        private static final QAg Lxb = new QAg();
    }

    public static boolean HD() {
        return brP;
    }

    public static void eK() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            brP = true;
        }
    }

    public int DY() {
        Integer num = this.kqm;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_ccpa", -1);
    }

    public boolean IeN() {
        return true;
    }

    public boolean JVA() {
        return com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "is_paid", false) : this.OY;
    }

    public String JXs() {
        String str = this.JXs;
        if (str != null) {
            return str;
        }
        String strLxb = Lxb("mediation_info", Long.MAX_VALUE);
        this.JXs = strLxb;
        if (strLxb == null) {
            this.JXs = "";
        }
        return this.JXs;
    }

    @Nullable
    public String NXR() {
        return com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("sp_global_file", "extra_data", null) : this.nBu;
    }

    public int OY() {
        Integer num = this.IeN;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "sdk_coppa", -1);
    }

    public int QAg() {
        Integer num = this.VVE;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "tt_gdpr", -1);
    }

    public com.bytedance.sdk.openadsdk.core.NXR.lk.lk STP() {
        if (this.HD == null) {
            this.HD = new com.bytedance.sdk.openadsdk.core.NXR.lk.lk(10, 8);
        }
        return this.HD;
    }

    public void Sfi() {
        try {
            if (this.eK == null || this.eK.size() != 0) {
                return;
            }
            this.eK = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public Bitmap VVE() {
        return com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.component.utils.ZU.Lxb(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("sp_global_file", "pause_icon", null)) : this.STP;
    }

    @Nullable
    public String ZU() {
        if (TextUtils.isEmpty(this.ZU)) {
            String strLxb = Lxb("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strLxb)) {
                this.ZU = strLxb;
            }
        }
        return this.ZU;
    }

    public boolean brP() {
        return "com.union_test.internationad".equals(nJ.JXs());
    }

    public int ebl() {
        return com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_icon_id", "icon_id", 0) : this.ebl;
    }

    public boolean kqm() {
        return LD.contains(this.ZU);
    }

    @NonNull
    public String lc() {
        if (TextUtils.isEmpty(this.lc)) {
            this.lc = Lxb(kqm.Lxb());
        }
        return this.lc;
    }

    public int nBu() {
        int iLxb = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_coppa", -99);
        this.tD = iLxb;
        if (iLxb == -99) {
            this.tD = OY();
        }
        return this.tD;
    }

    @Nullable
    public String sLN() {
        return com.bytedance.sdk.openadsdk.multipro.LD.lk() ? com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("sp_global_file", "keywords", null) : this.QAg;
    }

    public String tD() {
        if (!TextUtils.isEmpty(this.Sfi)) {
            return this.Sfi;
        }
        String strLxb = com.bytedance.sdk.openadsdk.utils.nBu.Lxb();
        this.Sfi = strLxb;
        if (!TextUtils.isEmpty(strLxb)) {
            return this.Sfi;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.nBu.Lxb(strValueOf);
        this.Sfi = strValueOf;
        return strValueOf;
    }

    private QAg() {
        this.lk = false;
        this.JVA = 0;
        this.sLN = true;
        this.NXR = false;
        this.STP = null;
        this.IeN = null;
        this.VVE = null;
        this.kqm = null;
        this.tD = 0;
        this.eK = null;
        try {
            Context contextLxb = kqm.Lxb();
            contextLxb.getClass();
            AbstractC2871Wx.f3947a = contextLxb;
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public static QAg LD() {
        return Lxb.Lxb;
    }

    public static void Lxb(NXR nxr) {
        Lxb = nxr;
    }

    public boolean lk() {
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "sdk_activate_init", true);
    }

    public void LD(boolean z) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public boolean Lxb() {
        return this.DY;
    }

    public void lk(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.VVE;
            if (num == null || num.intValue() != i) {
                this.VVE = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.hg.JXs()) {
                    LD(num, i);
                } else {
                    STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QAg.3
                        @Override // java.lang.Runnable
                        public void run() {
                            QAg.this.LD(num, i);
                        }
                    });
                }
            }
        }
    }

    private static void OY(String str) {
        NXR nxr;
        if (TextUtils.isEmpty(str) && (nxr = Lxb) != null) {
            nxr.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void QAg(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        NXR nxr = Lxb;
        if (nxr != null) {
            nxr.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public static boolean ebl(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.aH.Lxb || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    private static JSONObject nBu(String str) {
        String strLD = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("sp_global_file", str, null);
        if (TextUtils.isEmpty(strLD)) {
            return null;
        }
        try {
            return new JSONObject(strLD);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public void LD(String str) {
        this.JXs = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Lxb("mediation_info", str);
    }

    public void Lxb(boolean z) {
        this.DY = z;
    }

    public void lc(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.kqm;
            if (num == null || num.intValue() != i) {
                this.kqm = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.hg.JXs()) {
                    lk(num, i);
                } else {
                    STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QAg.5
                        @Override // java.lang.Runnable
                        public void run() {
                            QAg.this.lk(num, i);
                        }
                    });
                }
            }
        }
    }

    public void JXs(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.JVA = i;
    }

    public void Lxb(@NonNull String str) {
        OY(str);
        this.ZU = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Lxb("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.VVE.TA().ZU(7);
    }

    public void ZU(int i) {
        if (i != 0 && i != 1) {
            i = -99;
        }
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_coppa", Integer.valueOf(i));
        this.tD = i;
    }

    public void LD(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.IeN;
            if (num == null || num.intValue() != i) {
                this.IeN = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.hg.JXs()) {
                    Lxb(num, i);
                } else {
                    STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QAg.2
                        @Override // java.lang.Runnable
                        public void run() {
                            QAg.this.Lxb(num, i);
                        }
                    });
                }
            }
        }
    }

    public static Pair<String, Long> ZU(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectNBu = nBu(str);
            if (jSONObjectNBu == null) {
                return null;
            }
            return new Pair<>(jSONObjectNBu.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE), Long.valueOf(jSONObjectNBu.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb JXs(String str) {
        try {
            if (this.eK == null || str == null) {
                return null;
            }
            return this.eK.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void lk(@Nullable final String str) {
        QAg(str);
        if (com.bytedance.sdk.openadsdk.utils.hg.JXs()) {
            STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QAg.4
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", "extra_data", str);
        }
        this.nBu = str;
    }

    private String Lxb(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public void lc(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                com.bytedance.sdk.openadsdk.lk.nBu.Lxb(6, str);
            } else if (this.eK != null) {
                this.eK.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(Integer num, int i) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "tt_gdpr", -1) != i) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(4, true);
        }
    }

    public void Lxb(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.ebl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(Integer num, int i) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(5, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_ccpa", -1) != i) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(5, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(Integer num, int i) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(3, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "sdk_coppa", -1) != i) {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.VVE.TA().Lxb(3, true);
        }
    }

    public void lk(boolean z) {
        this.lk = z;
    }

    public static void Lxb(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String Lxb(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectNBu = nBu(str);
            if (jSONObjectNBu == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectNBu.getLong("time") <= j) {
                return jSONObjectNBu.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.GlobalInfo", e.getMessage());
        }
        return null;
    }

    public void Lxb(String str, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb) {
        try {
            if (TextUtils.isEmpty(str) || lxb == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                com.bytedance.sdk.openadsdk.lk.nBu.Lxb(6, str, lxb);
                return;
            }
            if (this.eK == null) {
                synchronized (QAg.class) {
                    try {
                        if (this.eK == null) {
                            this.eK = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.eK != null) {
                this.eK.put(str, lxb);
            }
        } catch (Throwable unused) {
        }
    }
}
