package com.bytedance.sdk.openadsdk.qt;

import com.bytedance.sdk.component.fi.jbs;
import com.bytedance.sdk.component.fi.tan;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements tan {
    private static int ri;
    private final String fi;
    private long ik;
    private boolean ka;
    private long lr = 0;

    public fi() {
        ri++;
        this.fi = "image_request_" + ri;
    }

    @Override // com.bytedance.sdk.component.fi.tan
    public void lr(String str, jbs jbsVar) {
        this.ik += System.currentTimeMillis() - this.lr;
        ik(str, jbsVar);
    }

    @Override // com.bytedance.sdk.component.fi.tan
    public void ri(String str, jbs jbsVar) {
        if (!this.ka) {
            jbsVar.ri();
            jbsVar.lr();
            jbsVar.ik();
            this.ka = true;
        }
        this.lr = System.currentTimeMillis();
        ik(str, jbsVar);
    }

    private String ik(String str, jbs jbsVar) {
        return str;
    }
}
