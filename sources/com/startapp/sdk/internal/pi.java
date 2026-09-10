package com.startapp.sdk.internal;

import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pi<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "pi";
    private final Class<T> itemClass;

    public pi(Class cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.json.TypeParser
    public List<T> parse(Class<List<T>> cls, Object obj) {
        int length;
        i7 oiVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            length = jSONArray.length();
            oiVar = new ni(jSONArray);
        } else {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            length = jSONObject.length();
            oiVar = new oi(jSONObject);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            try {
                arrayList.add(JsonParser.fromJsonObject((JSONObject) oiVar.a(Integer.valueOf(i2)), this.itemClass));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
