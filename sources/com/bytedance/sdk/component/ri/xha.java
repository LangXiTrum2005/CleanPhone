package com.bytedance.sdk.component.ri;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class xha {
    private qt ri;

    private xha(qt qtVar) {
        this.ri = qtVar;
    }

    public static xha ri(qt qtVar) {
        return new xha(qtVar);
    }

    public <T> T ri(String str, Type type) throws JSONException {
        ri(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.ri.ri(str, type);
    }

    public <T> String ri(T t) {
        String string;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            string = this.ri.ri(t);
        } else {
            string = t.toString();
        }
        ri(string);
        return string;
    }

    private static void ri(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        mj.ri(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
