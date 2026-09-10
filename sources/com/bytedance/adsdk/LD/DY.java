package com.bytedance.adsdk.LD;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DY {
    private boolean LD;
    private final Map<String, String> Lxb;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String LD(String str, String str2) {
        if (this.LD && this.Lxb.containsKey(str2)) {
            return this.Lxb.get(str2);
        }
        String strLxb = Lxb(str, str2);
        if (this.LD) {
            this.Lxb.put(str2, strLxb);
        }
        return strLxb;
    }

    public String Lxb(String str) {
        return str;
    }

    public String Lxb(String str, String str2) {
        return Lxb(str2);
    }
}
