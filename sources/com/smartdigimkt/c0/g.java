package com.smartdigimkt.c0;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class g extends a<String, Bitmap> {
    @Override // com.smartdigimkt.c0.a
    public Reference<Bitmap> a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
