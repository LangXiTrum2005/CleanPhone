package ads_mobile_sdk;

import android.location.Location;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.Date;
import java.util.Set;
import p002kotlin.NotImplementedError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jp1 implements NativeMediationAdRequest {
    public final Set a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final Location f;
    public final NativeAdOptions g;

    public jp1(Set set, boolean z, int i, int i2, String str, Location location, NativeAdOptions nativeAdOptions) {
        Intrinsics.checkNotNullParameter(nativeAdOptions, "nativeAdOptions");
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = location;
        this.g = nativeAdOptions;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        throw new NotImplementedError("An operation is not implemented: b/304323160 Not yet implemented");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return 0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final String getMaxAdContentRating() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions() {
        com.google.android.gms.ads.formats.NativeAdOptions.Builder mediaAspectRatio = new com.google.android.gms.ads.formats.NativeAdOptions.Builder().setAdChoicesPlacement(this.g.getAdChoicesPlacement()).setMediaAspectRatio(this.g.getMediaAspectRatio());
        int mediaAspectRatio2 = this.g.getMediaAspectRatio();
        int i = 2;
        if (mediaAspectRatio2 != 2) {
            i = mediaAspectRatio2 != 3 ? 0 : 1;
        }
        return mediaAspectRatio.setImageOrientation(i).setVideoOptions(this.g.getVideoOptions()).setReturnUrlsForImageAssets(this.g.shouldReturnUrlsForImageAssets()).setRequestMultipleImages(this.g.shouldRequestMultipleImages()).build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdRequestOptions() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        throw new NotImplementedError("An operation is not implemented: b/304323160 Not yet implemented");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return true;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForUnderAgeTreatment() {
        return this.d;
    }

    public /* synthetic */ jp1(Set set, boolean z, int i, int i2, String str, NativeAdOptions nativeAdOptions) {
        this(set, z, i, i2, str, null, nativeAdOptions);
    }
}
