package com.bytedance.sdk.component.JXs.Lxb;

import com.bytedance.sdk.component.JXs.QAg;
import com.bytedance.sdk.component.JXs.sLN;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static sLN Lxb() {
        return new sLN() { // from class: com.bytedance.sdk.component.JXs.Lxb.LD.1
            private WeakHashMap<String, String> Lxb = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.JXs.sLN
            public String LD(QAg qAg) {
                return Lxb(qAg.Lxb());
            }

            @Override // com.bytedance.sdk.component.JXs.sLN
            public String Lxb(QAg qAg) {
                return Lxb(qAg.Lxb() + "#width=" + qAg.LD() + "#height=" + qAg.lk() + "#scaletype=" + qAg.ZU() + "#bitmapConfig=" + qAg.lc());
            }

            private String Lxb(String str) {
                String str2 = this.Lxb.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strLxb = com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(str);
                this.Lxb.put(str, strLxb);
                return strLxb;
            }
        };
    }
}
