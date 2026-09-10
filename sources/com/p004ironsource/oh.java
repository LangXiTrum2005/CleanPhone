package com.p004ironsource;

import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f26372a = new HashMap<>();

    public oh a(String str, Object obj) {
        if (obj != null) {
            this.f26372a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public HashMap<String, Object> a() {
        return this.f26372a;
    }
}
