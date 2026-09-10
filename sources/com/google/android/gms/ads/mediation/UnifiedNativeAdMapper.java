package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd.Image f11287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f11290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VideoController f11293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11294k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f11295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f11296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f11297o = new Bundle();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f11300r;

    @NonNull
    public View getAdChoicesContent() {
        return this.l;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.f11289f;
    }

    @NonNull
    public final String getBody() {
        return this.f11286c;
    }

    @NonNull
    public final String getCallToAction() {
        return this.f11288e;
    }

    public float getCurrentTime() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getDuration() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.f11297o;
    }

    @NonNull
    public final String getHeadline() {
        return this.f11284a;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.f11287d;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.f11285b;
    }

    public float getMediaContentAspectRatio() {
        return this.f11300r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f11299q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f11298p;
    }

    @NonNull
    public final String getPrice() {
        return this.f11292i;
    }

    @NonNull
    public final Double getStarRating() {
        return this.f11290g;
    }

    @NonNull
    public final String getStore() {
        return this.f11291h;
    }

    public boolean hasVideoContent() {
        return this.f11294k;
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.l = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.f11289f = str;
    }

    public final void setBody(@NonNull String str) {
        this.f11286c = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.f11288e = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.f11297o = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.f11294k = z10;
    }

    public final void setHeadline(@NonNull String str) {
        this.f11284a = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.f11287d = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.f11285b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f11300r = f10;
    }

    public void setMediaView(@NonNull View view) {
        this.f11295m = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.f11299q = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.f11298p = z10;
    }

    public final void setPrice(@NonNull String str) {
        this.f11292i = str;
    }

    public final void setStarRating(@NonNull Double d10) {
        this.f11290g = d10;
    }

    public final void setStore(@NonNull String str) {
        this.f11291h = str;
    }

    public final void zza(@NonNull VideoController videoController) {
        this.f11293j = videoController;
    }

    public final void zzb(@NonNull Object obj) {
        this.f11296n = obj;
    }

    @NonNull
    public final VideoController zzc() {
        return this.f11293j;
    }

    @NonNull
    public final View zzd() {
        return this.f11295m;
    }

    @NonNull
    public final Object zze() {
        return this.f11296n;
    }

    public void destroy() {
    }

    public void recordImpression() {
    }

    public void handleClick(@NonNull View view) {
    }

    public void untrackView(@NonNull View view) {
    }

    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
    }
}
