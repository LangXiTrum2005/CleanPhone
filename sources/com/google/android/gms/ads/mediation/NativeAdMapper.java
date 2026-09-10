package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAd;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd.Image f11272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Double f11275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f11279k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f11280m = new Bundle();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f11283p;

    @NonNull
    public View getAdChoicesContent() {
        return this.f11279k;
    }

    @NonNull
    public final String getAdvertiser() {
        return this.f11274f;
    }

    @NonNull
    public final String getBody() {
        return this.f11271c;
    }

    @NonNull
    public final String getCallToAction() {
        return this.f11273e;
    }

    public float getCurrentTime() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float getDuration() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @NonNull
    public final Bundle getExtras() {
        return this.f11280m;
    }

    @NonNull
    public final String getHeadline() {
        return this.f11269a;
    }

    @NonNull
    public final NativeAd.Image getIcon() {
        return this.f11272d;
    }

    @NonNull
    public final List<NativeAd.Image> getImages() {
        return this.f11270b;
    }

    public float getMediaContentAspectRatio() {
        return this.f11283p;
    }

    public final boolean getOverrideClickHandling() {
        return this.f11282o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f11281n;
    }

    @NonNull
    public final String getPrice() {
        return this.f11277i;
    }

    @NonNull
    public final Double getStarRating() {
        return this.f11275g;
    }

    @NonNull
    public final String getStore() {
        return this.f11276h;
    }

    public boolean hasVideoContent() {
        return this.f11278j;
    }

    public void setAdChoicesContent(@NonNull View view) {
        this.f11279k = view;
    }

    public final void setAdvertiser(@NonNull String str) {
        this.f11274f = str;
    }

    public final void setBody(@NonNull String str) {
        this.f11271c = str;
    }

    public final void setCallToAction(@NonNull String str) {
        this.f11273e = str;
    }

    public final void setExtras(@NonNull Bundle bundle) {
        this.f11280m = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.f11278j = z10;
    }

    public final void setHeadline(@NonNull String str) {
        this.f11269a = str;
    }

    public final void setIcon(@NonNull NativeAd.Image image) {
        this.f11272d = image;
    }

    public final void setImages(@NonNull List<NativeAd.Image> list) {
        this.f11270b = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.f11283p = f10;
    }

    public void setMediaView(@NonNull View view) {
        this.l = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.f11282o = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.f11281n = z10;
    }

    public final void setPrice(@NonNull String str) {
        this.f11277i = str;
    }

    public final void setStarRating(@NonNull Double d10) {
        this.f11275g = d10;
    }

    public final void setStore(@NonNull String str) {
        this.f11276h = str;
    }

    @NonNull
    public final View zza() {
        return this.l;
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
