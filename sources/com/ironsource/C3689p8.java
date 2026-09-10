package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3689p8 {
    private HashMap<String, Object> a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.a;
    }

    public C3689p8 a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
