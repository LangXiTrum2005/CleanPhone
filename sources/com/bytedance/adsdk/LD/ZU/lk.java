package com.bytedance.adsdk.LD.ZU;

import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public enum lk {
    JSON(".json"),
    ZIP(".zip");

    public final String lk;

    lk(String str) {
        this.lk = str;
    }

    public String Lxb() {
        return ".temp" + this.lk;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.lk;
    }
}
