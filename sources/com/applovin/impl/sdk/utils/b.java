package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f9706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f9707c;

    public /* synthetic */ b(Bitmap bitmap, ImageView imageView) {
        this.f9705a = 0;
        this.f9707c = imageView;
        this.f9706b = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9705a) {
            case 0:
                this.f9707c.setImageBitmap(this.f9706b);
                break;
            case 1:
                com.mbridge.msdk.config.dynamic.utils.image.b.b(this.f9706b, this.f9707c);
                break;
            case 2:
                com.mbridge.msdk.config.dynamic.utils.image.b.a(this.f9706b, this.f9707c);
                break;
            case 3:
                com.mbridge.msdk.config.dynamic.utils.image.b.d(this.f9706b, this.f9707c);
                break;
            default:
                com.mbridge.msdk.config.dynamic.utils.image.b.c(this.f9706b, this.f9707c);
                break;
        }
    }

    public /* synthetic */ b(Bitmap bitmap, ImageView imageView, int i10) {
        this.f9705a = i10;
        this.f9706b = bitmap;
        this.f9707c = imageView;
    }
}
