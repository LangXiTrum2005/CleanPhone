package com.p004ironsource;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class vh extends File {
    public vh(String str) {
        super(str);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public vh(String str, String str2) {
        super(str, str2);
    }
}
