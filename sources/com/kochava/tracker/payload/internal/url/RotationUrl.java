package com.kochava.tracker.payload.internal.url;

/* JADX INFO: loaded from: classes5.dex */
public final class RotationUrl implements RotationUrlApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RotationUrlVariationApi[] f28267a;

    public RotationUrl() {
        this.f28267a = new RotationUrlVariationApi[0];
    }

    @Override // com.kochava.tracker.payload.internal.url.RotationUrlApi
    public final RotationUrlVariationApi a(int i2) {
        RotationUrlVariationApi[] rotationUrlVariationApiArr = this.f28267a;
        for (int length = rotationUrlVariationApiArr.length - 1; length >= 0; length--) {
            RotationUrlVariationApi rotationUrlVariationApi = rotationUrlVariationApiArr[length];
            if (i2 >= rotationUrlVariationApi.a()) {
                return rotationUrlVariationApi;
            }
        }
        return null;
    }

    public RotationUrl(RotationUrlVariationApi[] rotationUrlVariationApiArr) {
        this.f28267a = rotationUrlVariationApiArr;
    }
}
