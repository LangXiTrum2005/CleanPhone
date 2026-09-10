package com.bytedance.sdk.component.Lxb;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class OY {
    private sLN Lxb;

    private OY(sLN sln) {
        this.Lxb = sln;
    }

    public static OY Lxb(sLN sln) {
        return new OY(sln);
    }

    public <T> T Lxb(String str, Type type) throws JSONException {
        Lxb(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.Lxb.Lxb(str, type);
    }

    public <T> String Lxb(T t) {
        String string;
        if (t == null) {
            return "{}";
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            string = this.Lxb.Lxb(t);
        } else {
            string = t.toString();
        }
        Lxb(string);
        return string;
    }

    private static void Lxb(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        QAg.Lxb(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
