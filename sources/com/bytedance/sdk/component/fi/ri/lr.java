package com.bytedance.sdk.component.fi.ri;

import com.bytedance.sdk.component.fi.bgr;
import com.bytedance.sdk.component.fi.fi;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements fi {
    private boolean ik;
    private bgr ka;
    private boolean lr;
    private String ri;

    public lr(String str, boolean z, boolean z2, bgr bgrVar) {
        this.ri = str;
        this.lr = z;
        this.ik = z2;
        this.ka = bgrVar;
    }

    @Override // com.bytedance.sdk.component.fi.fi
    public boolean ik() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.fi.fi
    public boolean lr() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.fi.fi
    public String ri() {
        return this.ri;
    }
}
