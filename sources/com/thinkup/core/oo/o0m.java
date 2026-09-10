package com.thinkup.core.oo;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0m {
    private static final String o = "o0m";
    private String m;

    private String n(String str) {
        try {
            Context contextOn = com.thinkup.core.common.n.o0n.m().on();
            if (contextOn != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.m)) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextOn.getResources().getAssets().open(this.m + File.separator + str + ".json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return com.thinkup.core.common.ooo.mm.m(sb.toString());
                        }
                        sb.append(line);
                    }
                } catch (IOException unused) {
                }
            }
            return "";
        } catch (Exception e2) {
            Log.e(o, "getPreAppStrategyStr() >>> error: " + e2.getMessage());
            return "";
        }
    }

    public final m m(String str) {
        com.thinkup.core.common.o0o.on onVarO;
        Looper.myLooper();
        Looper.getMainLooper();
        try {
            String strN = n(str);
            if (!TextUtils.isEmpty(strN) && (onVarO = com.thinkup.core.common.o0o.on.o(new JSONObject(strN).optJSONObject(m.o.mn))) != null) {
                onVarO.n0();
                m mVar = new m();
                mVar.o(onVarO);
                return mVar;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return null;
    }

    public final void o(String str) {
        this.m = str;
    }
}
