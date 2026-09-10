package com.bytedance.sdk.openadsdk.QAg;

import com.bytedance.sdk.component.JXs.DY;
import com.bytedance.sdk.component.JXs.QAg;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements DY {
    private static int Lxb;
    private final String JXs;
    private long LD = 0;
    private boolean ZU;
    private long lk;

    public JXs() {
        Lxb++;
        this.JXs = "image_request_" + Lxb;
    }

    private String lk(String str, QAg qAg) {
        com.bytedance.sdk.component.JXs.lk.Lxb lxbBrP;
        if (str != null) {
            switch (str) {
                case "success":
                    return "success";
                case "raw_cache":
                    return "raw cache";
                case "image_type":
                    return "image type：";
                case "disk_cache":
                    return "disk cache";
                case "decode":
                    return "decode";
                case "failed":
                    if (!(qAg instanceof com.bytedance.sdk.component.JXs.lk.lk) || (lxbBrP = ((com.bytedance.sdk.component.JXs.lk.lk) qAg).brP()) == null) {
                        return "fail";
                    }
                    Throwable thLk = lxbBrP.lk();
                    StringBuilder sb = new StringBuilder("fail：code:");
                    sb.append(lxbBrP.Lxb());
                    sb.append(", msg:");
                    sb.append(lxbBrP.LD());
                    sb.append(", exception:");
                    sb.append(thLk != null ? thLk.getMessage() : "null \r\n");
                    return sb.toString();
                case "check_duplicate":
                    return "duplicate request";
                case "memory_cache":
                    return "memory cache";
                case "net_request":
                    return "net request";
                case "generate_key":
                    return "generate key:" + qAg.JXs();
                case "cache_policy":
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.JXs.DY
    public void LD(String str, QAg qAg) {
        this.lk += System.currentTimeMillis() - this.LD;
        lk(str, qAg);
    }

    @Override // com.bytedance.sdk.component.JXs.DY
    public void Lxb(String str, QAg qAg) {
        if (!this.ZU) {
            qAg.Lxb();
            qAg.LD();
            qAg.lk();
            this.ZU = true;
        }
        this.LD = System.currentTimeMillis();
        lk(str, qAg);
    }
}
