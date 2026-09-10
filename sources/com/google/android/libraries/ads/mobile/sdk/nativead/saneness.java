package com.google.android.libraries.ads.mobile.sdk.nativead;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.ironsource.X3;
import complexometry.competently;
import complexometry.cutely;
import complexometry.dovishness;
import java.util.List;
import java.util.Map;
import java.util.Set;
import liquory.beachfront;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010\u0013R\u001c\u00105\u001a\u0004\u0018\u0001008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00108\u001a\b\u0012\u0004\u0012\u0002000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\u0007\u001a\u0004\b7\u0010\tR\u001a\u0010;\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\u0011\u001a\u0004\b:\u0010\u0013¨\u0006<"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;", "Lcomplexometry/competently;", "Lliquory/beachfront;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/dern;", "", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeAdType;", "impassible", "Ljava/util/List;", "wireman", "()Ljava/util/List;", "nativeAdTypes", "", "triweekly", "attabal", "customFormatIds", "", "kowloon", "Z", "taiyuan", "()Z", "isImageLoadingDisabled", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;", "arytenoidectomy", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;", "cutely", "()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;", "mediaAspectRatio", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;", "monoploid", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;", "marial", "()Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;", "adChoicesPlacement", "Lcomplexometry/dovishness;", "polloi", "Lcomplexometry/dovishness;", "dern", "()Lcomplexometry/dovishness;", "videoOptions", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$SwipeGestureDirection;", "molybdenite", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$SwipeGestureDirection;", "saneness", "()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$SwipeGestureDirection;", "customClickGestureDirection", "graveside", "beachfront", "customClickGestureAllowTaps", "Lliquory/attabal;", "dovishness", "Lliquory/attabal;", "getAdSize", "()Lliquory/attabal;", X3.i.O, "gintrap", "impromptu", "adSizes", "rotuma", "competently", "manualImpressionRequested", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class saneness extends competently implements beachfront, dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final boolean f19448adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final NativeAd.NativeMediaAspectRatio mediaAspectRatio;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final liquory.attabal adSize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final List adSizes;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final boolean customClickGestureAllowTaps;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final List nativeAdTypes;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean isImageLoadingDisabled;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final NativeAd.SwipeGestureDirection customClickGestureDirection;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final AdChoicesPlacement adChoicesPlacement;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final dovishness videoOptions;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final boolean manualImpressionRequested;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public final List customFormatIds;

    public /* synthetic */ saneness(String str, Set set, String str2, Map map, Bundle bundle, Set set2, Set set3, Map map2, String str3, String str4, long j, List list, List list2, boolean z, NativeAd.NativeMediaAspectRatio nativeMediaAspectRatio, AdChoicesPlacement adChoicesPlacement, dovishness dovishnessVar, NativeAd.SwipeGestureDirection swipeGestureDirection, boolean z2, boolean z3, liquory.attabal attabalVar, List list3, boolean z4, int i) {
        this(str, set, str2, map, bundle, set2, set3, map2, str3, str4, j, list, list2, z, nativeMediaAspectRatio, adChoicesPlacement, dovishnessVar, swipeGestureDirection, z2, z3, attabalVar, list3, z4);
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: apical, reason: from getter */
    public final boolean getF19448adultoid() {
        return this.f19448adultoid;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    public List<String> attabal() {
        return this.customFormatIds;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public boolean getCustomClickGestureAllowTaps() {
        return this.customClickGestureAllowTaps;
    }

    @Override // liquory.beachfront
    /* JADX INFO: renamed from: competently, reason: from getter */
    public boolean getManualImpressionRequested() {
        return this.manualImpressionRequested;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: cutely, reason: from getter */
    public NativeAd.NativeMediaAspectRatio getMediaAspectRatio() {
        return this.mediaAspectRatio;
    }

    @Override // liquory.beachfront
    /* JADX INFO: renamed from: dern, reason: from getter */
    public dovishness getVideoOptions() {
        return this.videoOptions;
    }

    @Override // liquory.beachfront
    public liquory.attabal getAdSize() {
        return this.adSize;
    }

    @Override // liquory.beachfront
    public List<liquory.attabal> impromptu() {
        return this.adSizes;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: marial, reason: from getter */
    public AdChoicesPlacement getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public NativeAd.SwipeGestureDirection getCustomClickGestureDirection() {
        return this.customClickGestureDirection;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public boolean getIsImageLoadingDisabled() {
        return this.isImageLoadingDisabled;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.dern
    public List<NativeAd.NativeAdType> wireman() {
        return this.nativeAdTypes;
    }

    public saneness(String str, Set set, String str2, Map map, Bundle bundle, Set set2, Set set3, Map map2, String str3, String str4, long j, List list, List list2, boolean z, NativeAd.NativeMediaAspectRatio nativeMediaAspectRatio, AdChoicesPlacement adChoicesPlacement, dovishness dovishnessVar, NativeAd.SwipeGestureDirection swipeGestureDirection, boolean z2, boolean z3, liquory.attabal attabalVar, List list3, boolean z4) {
        super(str, set, str2, map, bundle, set2, set3, map2, str3, str4, j);
        this.nativeAdTypes = list;
        this.customFormatIds = list2;
        this.isImageLoadingDisabled = z;
        this.mediaAspectRatio = nativeMediaAspectRatio;
        this.adChoicesPlacement = adChoicesPlacement;
        this.videoOptions = dovishnessVar;
        this.customClickGestureDirection = swipeGestureDirection;
        this.customClickGestureAllowTaps = z2;
        this.f19448adultoid = z3;
        this.adSize = attabalVar;
        this.adSizes = list3;
        this.manualImpressionRequested = z4;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "Lcomplexometry/cutely;", "", "", "adUnitId", "", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeAdType;", "nativeAdTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gintrap", "()Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "customFormatIds", "preprohormone", "(Ljava/util/List;)Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "dovishness", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;", "mediaAspectRatio", "cord", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd$NativeMediaAspectRatio;)Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;", "adChoicesPlacement", "rotuma", "(Lcom/google/android/libraries/ads/mobile/sdk/common/AdChoicesPlacement;)Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "Lcomplexometry/dovishness;", "videoOptions", "cuirassed", "(Lcomplexometry/dovishness;)Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness$attabal;", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;", "adultoid", "()Lcom/google/android/libraries/ads/mobile/sdk/nativead/saneness;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class attabal extends cutely<attabal> {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public liquory.attabal f19460adultoid;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public AdChoicesPlacement f19461arytenoidectomy;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public List f19462dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public final List f19463formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public boolean f19464gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public boolean f19465graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public List f19466impassible;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public NativeAd.NativeMediaAspectRatio f19467kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public boolean f19468molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public dovishness f19469monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public NativeAd.SwipeGestureDirection f19470polloi;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public boolean f19471triweekly;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(String adUnitId, List<? extends NativeAd.NativeAdType> nativeAdTypes) {
            super(adUnitId);
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(nativeAdTypes, "nativeAdTypes");
            this.f19463formularize = nativeAdTypes;
            this.f19466impassible = adultoid.formularize();
            this.f19467kowloon = NativeAd.NativeMediaAspectRatio.UNKNOWN;
            this.f19461arytenoidectomy = AdChoicesPlacement.TOP_RIGHT;
            this.f19462dovishness = adultoid.formularize();
        }

        public final saneness adultoid() {
            String f24011attabal = getF24011attabal();
            if (f24011attabal != null) {
                return new saneness(f24011attabal, getF24018saneness(), getF24015dern(), getF24020wireman(), getF24017marial(), getF24012beachfront(), getF24013competently(), getF24016impromptu(), getF24019taiyuan(), getF24014cutely(), getF24010apical(), CollectionsKt.molet(this.f19463formularize), this.f19466impassible, this.f19471triweekly, this.f19467kowloon, this.f19461arytenoidectomy, this.f19469monoploid, this.f19470polloi, this.f19468molybdenite, this.f19465graveside, this.f19460adultoid, this.f19462dovishness, this.f19464gintrap, 0);
            }
            throw new IllegalArgumentException("Ad unit ID cannot be null.");
        }

        public attabal cord(NativeAd.NativeMediaAspectRatio mediaAspectRatio) {
            Intrinsics.checkNotNullParameter(mediaAspectRatio, "mediaAspectRatio");
            this.f19467kowloon = mediaAspectRatio;
            return kowloon();
        }

        public attabal cuirassed(dovishness videoOptions) {
            Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
            this.f19469monoploid = videoOptions;
            return kowloon();
        }

        public attabal dovishness() {
            this.f19471triweekly = true;
            return kowloon();
        }

        public final void graveside(boolean z) {
            this.f19465graveside = z;
            kowloon();
        }

        public attabal preprohormone(List<String> customFormatIds) {
            Intrinsics.checkNotNullParameter(customFormatIds, "customFormatIds");
            this.f19466impassible = CollectionsKt.molet(customFormatIds);
            return kowloon();
        }

        public attabal rotuma(AdChoicesPlacement adChoicesPlacement) {
            Intrinsics.checkNotNullParameter(adChoicesPlacement, "adChoicesPlacement");
            this.f19461arytenoidectomy = adChoicesPlacement;
            return kowloon();
        }

        @Override // complexometry.impassible
        /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
        public attabal kowloon() {
            return this;
        }
    }
}
