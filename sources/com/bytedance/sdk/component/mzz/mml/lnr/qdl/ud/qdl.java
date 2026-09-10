package com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements yt {
    private int lnr;
    private com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<String, Bitmap> mml;
    private long qdl = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
    private int ud;

    public qdl(int i2, int i3) {
        this.ud = i3;
        this.lnr = i2;
        this.mml = new com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<>(i3);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        try {
            return this.mml.qdl(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iQdl = qdl(bitmap);
                if (iQdl <= this.qdl && iQdl != 0) {
                    this.mml.qdl(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public Bitmap qdl(String str) {
        try {
            return this.mml.qdl(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int qdl(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
