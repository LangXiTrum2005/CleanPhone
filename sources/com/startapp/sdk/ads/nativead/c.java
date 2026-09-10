package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f40506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f40507c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.f40507c = nativeAdDetails;
        this.f40506b = runnable;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i2) {
        if (i2 == 0) {
            this.f40507c.setImageBitmap(bitmap);
        } else {
            this.f40507c.setSecondaryImageBitmap(bitmap);
        }
        int i3 = this.f40505a + 1;
        this.f40505a = i3;
        if (i3 == 2) {
            this.f40506b.run();
        }
    }
}
