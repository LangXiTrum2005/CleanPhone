package com.mbridge.msdk.out;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface OnImageLoadListener {
    void loadError(String str);

    void loadSuccess(Drawable drawable, int i10);
}
