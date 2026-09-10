package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f9703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f9704c;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f9702a = 1;
        this.f9703b = uri;
        this.f9704c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9702a) {
            case 0:
                ImageViewUtils.b(this.f9704c, this.f9703b);
                break;
            case 1:
                ImageViewUtils.a(this.f9703b, this.f9704c);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(this.f9704c, this.f9703b);
                break;
        }
    }

    public /* synthetic */ a(ImageView imageView, Uri uri, int i10) {
        this.f9702a = i10;
        this.f9704c = imageView;
        this.f9703b = uri;
    }
}
