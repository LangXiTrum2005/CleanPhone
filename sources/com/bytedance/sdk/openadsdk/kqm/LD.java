package com.bytedance.sdk.openadsdk.kqm;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements com.bytedance.sdk.component.ebl.lk.LD {
    public static String Lxb = "sp_multi_ttadnet_config";
    private final Context LD;

    public LD(Context context) {
        this.LD = context;
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public String JXs() {
        return sLN.Lxb(this.LD);
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public String LD() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public Address Lxb(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public int ZU() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public String[] lc() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String strRW = kqm.ZU().rW();
        if (!TextUtils.isEmpty(strRW)) {
            return ("SG".equals(strRW) || "CN".equals(strRW)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int iVVE = nJ.VVE();
        return (iVVE == 2 || iVVE == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public String lk() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public int Lxb() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public String Lxb(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD(Lxb, str, str2);
    }

    @Override // com.bytedance.sdk.component.ebl.lk.LD
    public void Lxb(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb(Lxb, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb(Lxb, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb(Lxb, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb(Lxb, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb(Lxb, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
