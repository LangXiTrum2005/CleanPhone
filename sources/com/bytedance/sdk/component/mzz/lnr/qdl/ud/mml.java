package com.bytedance.sdk.component.mzz.lnr.qdl.ud;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes.dex */
public class mml implements yt {
    private final yt qdl;
    private final com.bytedance.sdk.component.mzz.lnr.qdl.ud ud;

    public mml(yt ytVar) {
        this(ytVar, null);
    }

    public mml(yt ytVar, com.bytedance.sdk.component.mzz.lnr.qdl.ud udVar) {
        this.qdl = ytVar;
        this.ud = udVar;
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
