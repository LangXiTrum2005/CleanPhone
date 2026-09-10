package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37789d;

    public j(ImageView imageView, int i10) {
        super(imageView);
        this.f37789d = i10;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap bitmapA;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f37782a == null || bitmap.isRecycled() || (bitmapA = p0.a(bitmap, 1, this.f37789d)) == null) {
                return;
            }
            this.f37782a.setImageBitmap(bitmapA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }
}
