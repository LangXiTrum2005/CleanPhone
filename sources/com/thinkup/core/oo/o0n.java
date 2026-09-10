package com.thinkup.core.oo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0n {
    private static final String o = "PrePlacementStrategy";
    private String m;

    private String n(String str) {
        int i2;
        int i3;
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        if (contextOn != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.m)) {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextOn.getResources().getAssets().open(this.m + File.separator + str + ".json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    JSONObject jSONObject = new JSONObject(com.thinkup.core.common.ooo.mm.m(sb.toString()));
                    int iOptInt = jSONObject.optInt("cs_cl", 0);
                    if (300000001 != iOptInt) {
                        com.thinkup.core.common.oo0.oo.m("pre_s_cus_code_error", "sdk_cus_code = 300000001 strategy_cus_code = ".concat(String.valueOf(iOptInt)), com.thinkup.core.common.n.o0n.m().o0m());
                        return "";
                    }
                    if (!jSONObject.isNull("sdk_ver")) {
                        String string = jSONObject.getString("sdk_ver");
                        if (!TextUtils.isEmpty(string) && (i3 = Integer.parseInt(com.thinkup.core.common.ooo.nn.o().replace("UA_", "").replace(com.thinkup.core.common.n.mo.ono, ""))) < (i2 = Integer.parseInt(string.replace(com.thinkup.core.common.n.mo.ono, "")))) {
                            Log.e(o, "The sdk version(" + i3 + ") must be greater than or equal to the version(" + i2 + ") in the placement strategy.");
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_id")) {
                        String string2 = jSONObject.getString("pl_id");
                        if (!TextUtils.isEmpty(string2) && !str.equals(string2)) {
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_data")) {
                        return jSONObject.getJSONObject("pl_data").toString();
                    }
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                Log.e(o, "Get pre placement strategy failed: " + th.getMessage());
            }
        }
        return "";
    }

    public final n0 m(String str) {
        String strN = n(str);
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        try {
            n0 n0VarO = n0.o(str, new JSONObject(strN));
            n0VarO.o(1);
            return n0VarO;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void o(String str) {
        this.m = str;
    }
}
