package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class CacheKey implements Serializable {
    private static final long serialVersionUID = -2109625189555850313L;
    private String adTag;
    private String advertiserId;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    private String country;
    private boolean forceFullpage;
    private boolean forceOfferWall2D;
    private boolean forceOfferWall3D;
    private boolean forceOverlay;
    private Double minCpm;
    private String owner;
    private AdPreferences.Placement placement;
    private String productId;
    private String template;
    private boolean testMode;
    private Ad.AdType type;
    private boolean videoMuted;

    public CacheKey(AdPreferences.Placement placement, AdPreferences adPreferences, String str) {
        this(placement, adPreferences);
        this.owner = str;
    }

    public final AdPreferences.Placement a() {
        return this.placement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CacheKey cacheKey = (CacheKey) obj;
            if (this.forceOfferWall3D == cacheKey.forceOfferWall3D && this.forceOfferWall2D == cacheKey.forceOfferWall2D && this.forceFullpage == cacheKey.forceFullpage && this.forceOverlay == cacheKey.forceOverlay && this.testMode == cacheKey.testMode && this.videoMuted == cacheKey.videoMuted && this.placement == cacheKey.placement && vi.a(this.categories, cacheKey.categories) && vi.a(this.categoriesExclude, cacheKey.categoriesExclude) && vi.a((Object) this.minCpm, (Object) cacheKey.minCpm) && vi.a((Object) this.adTag, (Object) cacheKey.adTag) && vi.a((Object) this.productId, (Object) cacheKey.productId) && vi.a((Object) this.country, (Object) cacheKey.country) && vi.a((Object) this.advertiserId, (Object) cacheKey.advertiserId) && vi.a((Object) this.template, (Object) cacheKey.template) && this.type == cacheKey.type && vi.a((Object) this.owner, (Object) cacheKey.owner)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.placement, this.categories, this.categoriesExclude, this.minCpm, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), Boolean.valueOf(this.testMode), Boolean.valueOf(this.videoMuted), this.adTag, this.productId, this.country, this.advertiserId, this.template, this.type, this.owner};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public CacheKey(AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.placement = placement;
        this.categories = adPreferences.getCategories();
        this.categoriesExclude = adPreferences.getCategoriesExclude();
        this.videoMuted = adPreferences.isVideoMuted();
        this.minCpm = adPreferences.getMinCpm();
        this.forceOfferWall3D = adPreferences.isForceOfferWall3D();
        this.forceOfferWall2D = adPreferences.isForceOfferWall2D();
        this.forceFullpage = adPreferences.isForceFullpage();
        this.forceOverlay = adPreferences.isForceOverlay();
        this.testMode = adPreferences.isTestMode();
        this.adTag = adPreferences.getAdTag();
        this.productId = adPreferences.getCustomProductId();
        this.type = adPreferences.getType();
    }
}
