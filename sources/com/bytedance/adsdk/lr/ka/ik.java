package com.bytedance.adsdk.lr.ka;

/* JADX INFO: loaded from: classes2.dex */
public enum ik {
    JSON(".json"),
    ZIP(".zip");

    public final String ik;

    ik(String str) {
        this.ik = str;
    }

    public String ri() {
        return ".temp" + this.ik;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.ik;
    }
}
