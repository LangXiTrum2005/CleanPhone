package com.facebook.internal;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageResponse;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageRequest f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f16344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16345c;
    public final Bitmap d;

    public ImageResponse(ImageRequest request, Exception exc, boolean z2, Bitmap bitmap) {
        Intrinsics.f(request, "request");
        this.f16343a = request;
        this.f16344b = exc;
        this.f16345c = z2;
        this.d = bitmap;
    }
}
