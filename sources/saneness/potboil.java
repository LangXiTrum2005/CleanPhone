package saneness;

import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class potboil {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ int[] f37260attabal;

    static {
        int[] iArr = new int[NativeAd.NativeAdType.values().length];
        try {
            iArr[NativeAd.NativeAdType.CUSTOM_NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeAd.NativeAdType.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f37260attabal = iArr;
    }
}
