package com.bytedance.adsdk.LD.lk;

import com.bytedance.adsdk.LD.STP;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class JXs {
    private static final JXs Lxb = new JXs();
    private final STP<String, com.bytedance.adsdk.LD.ebl> LD = new STP<>(20);

    public static JXs Lxb() {
        return Lxb;
    }

    public com.bytedance.adsdk.LD.ebl Lxb(String str) {
        if (str == null) {
            return null;
        }
        return this.LD.Lxb(str);
    }

    public void Lxb(String str, com.bytedance.adsdk.LD.ebl eblVar) {
        if (str == null) {
            return;
        }
        this.LD.Lxb(str, eblVar);
    }
}
