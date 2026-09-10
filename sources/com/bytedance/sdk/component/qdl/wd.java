package com.bytedance.sdk.component.qdl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class wd {
    private to qdl;

    private wd(to toVar) {
        this.qdl = toVar;
    }

    public static wd qdl(to toVar) {
        return new wd(toVar);
    }

    public <T> T qdl(String str, Type type) throws JSONException {
        qdl(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.qdl.qdl(str, type);
    }

    public <T> String qdl(T t) {
        String string;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            string = this.qdl.qdl(t);
        } else {
            string = t.toString();
        }
        qdl(string);
        return string;
    }

    private static void qdl(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        jpc.qdl(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
