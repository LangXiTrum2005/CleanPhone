package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0549r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f30151a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f30151a;
    }

    public C0549r8 a(String str, Object obj) {
        if (obj != null) {
            this.f30151a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
