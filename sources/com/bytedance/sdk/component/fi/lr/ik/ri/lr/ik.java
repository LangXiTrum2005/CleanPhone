package com.bytedance.sdk.component.fi.lr.ik.ri.lr;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fi.bu;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements bu {
    private final com.bytedance.sdk.component.fi.lr.ik.ri.ri lr;
    private final bu ri;

    public ik(bu buVar) {
        this(buVar, null);
    }

    public ik(bu buVar, com.bytedance.sdk.component.fi.lr.ik.ri.ri riVar) {
        this.ri = buVar;
        this.lr = riVar;
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public boolean lr(String str) {
        return this.ri.lr(str);
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public boolean ri(String str, Bitmap bitmap) {
        return this.ri.ri(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public Bitmap ri(String str) {
        return this.ri.ri(str);
    }
}
