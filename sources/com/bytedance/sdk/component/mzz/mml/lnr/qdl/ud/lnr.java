package com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements yt {
    private final yt qdl;
    private final com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl ud;

    public lnr(yt ytVar) {
        this(ytVar, null);
    }

    public lnr(yt ytVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl qdlVar) {
        this.qdl = ytVar;
        this.ud = qdlVar;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.qdl.ud(str);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, Bitmap bitmap) {
        return this.qdl.qdl(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public Bitmap qdl(String str) {
        return this.qdl.qdl(str);
    }
}
