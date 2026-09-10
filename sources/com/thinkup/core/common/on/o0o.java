package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0o {
    private List<o> o;

    public static class o {
        private String o;

        public final String o() {
            return this.o;
        }

        private void o(String str) {
            this.o = str;
        }
    }

    private o0o() {
    }

    private static o m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        o oVar = new o();
        oVar.o = strOptString;
        return oVar;
    }

    public static o0o o(JSONObject jSONObject) {
        o oVar;
        o0o o0oVar = new o0o();
        try {
            o0oVar.o = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(itKeys.next());
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (TextUtils.isEmpty(strOptString)) {
                        oVar = null;
                    } else {
                        oVar = new o();
                        oVar.o = strOptString;
                    }
                    if (oVar != null) {
                        o0oVar.o.add(oVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return o0oVar;
    }

    public final List<o> o() {
        return this.o;
    }
}
