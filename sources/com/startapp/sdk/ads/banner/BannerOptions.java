package com.startapp.sdk.ads.banner;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class BannerOptions implements Serializable {
    private static final long serialVersionUID = -5495602901437914475L;
    private int adsNumber;
    private boolean checkAlpha;
    private boolean checkCoverage;
    private boolean checkFocus;
    private boolean checkVisibility;
    private int delayFaceTime;

    @TypeInfo(type = Effect.class)
    private Effect effect;
    private int height;
    private float heightRatio;
    private int htmlAdsNumber;
    private float minScale;
    private int minViewabilityPercentage;
    private boolean preCheck;
    private int refreshRate;
    private int refreshRate3D;
    private boolean rotateThroughOnStart;
    private int rotateThroughSpeedMult;
    private int scalePower;
    private int stepSize;
    private int timeBetweenFrames;
    private int width;
    private float widthRatio;

    public enum Effect {
        ROTATE_3D(1),
        /* JADX INFO: Fake field, exist only in values array */
        EXCHANGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        FLY_IN(3);

        private int index;

        Effect(int i2) {
            this.index = i2;
        }

        public final int a() {
            return (int) Math.pow(2.0d, this.index - 1);
        }
    }

    public BannerOptions() {
        this.width = 300;
        this.height = 50;
        this.minViewabilityPercentage = 50;
        this.checkCoverage = true;
        this.checkVisibility = true;
        this.checkAlpha = true;
        this.timeBetweenFrames = 25;
        this.stepSize = 5;
        this.delayFaceTime = 5000;
        this.adsNumber = 4;
        this.htmlAdsNumber = 10;
        this.refreshRate3D = 60000;
        this.widthRatio = 1.0f;
        this.heightRatio = 1.0f;
        this.minScale = 0.88f;
        this.scalePower = 4;
        this.effect = Effect.ROTATE_3D;
        this.rotateThroughOnStart = true;
        this.rotateThroughSpeedMult = 2;
        this.refreshRate = 60000;
    }

    public final void a(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }

    public final int b() {
        return this.delayFaceTime;
    }

    public final Effect c() {
        return this.effect;
    }

    public final int d() {
        return this.height;
    }

    public final float e() {
        return this.heightRatio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BannerOptions bannerOptions = (BannerOptions) obj;
            if (this.width == bannerOptions.width && this.height == bannerOptions.height && this.minViewabilityPercentage == bannerOptions.minViewabilityPercentage && this.preCheck == bannerOptions.preCheck && this.checkFocus == bannerOptions.checkFocus && this.checkCoverage == bannerOptions.checkCoverage && this.checkVisibility == bannerOptions.checkVisibility && this.checkAlpha == bannerOptions.checkAlpha && this.timeBetweenFrames == bannerOptions.timeBetweenFrames && this.stepSize == bannerOptions.stepSize && this.delayFaceTime == bannerOptions.delayFaceTime && this.adsNumber == bannerOptions.adsNumber && this.htmlAdsNumber == bannerOptions.htmlAdsNumber && this.refreshRate3D == bannerOptions.refreshRate3D && Float.compare(this.widthRatio, bannerOptions.widthRatio) == 0 && Float.compare(this.heightRatio, bannerOptions.heightRatio) == 0 && Float.compare(this.minScale, bannerOptions.minScale) == 0 && this.scalePower == bannerOptions.scalePower && this.rotateThroughOnStart == bannerOptions.rotateThroughOnStart && this.rotateThroughSpeedMult == bannerOptions.rotateThroughSpeedMult && this.refreshRate == bannerOptions.refreshRate && this.effect == bannerOptions.effect) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.htmlAdsNumber;
    }

    public final float g() {
        return this.minScale;
    }

    public final int h() {
        return this.minViewabilityPercentage;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.minViewabilityPercentage), Boolean.valueOf(this.preCheck), Boolean.valueOf(this.checkFocus), Boolean.valueOf(this.checkCoverage), Boolean.valueOf(this.checkVisibility), Boolean.valueOf(this.checkAlpha), Integer.valueOf(this.timeBetweenFrames), Integer.valueOf(this.stepSize), Integer.valueOf(this.delayFaceTime), Integer.valueOf(this.adsNumber), Integer.valueOf(this.htmlAdsNumber), Integer.valueOf(this.refreshRate3D), Float.valueOf(this.widthRatio), Float.valueOf(this.heightRatio), Float.valueOf(this.minScale), Integer.valueOf(this.scalePower), this.effect, Boolean.valueOf(this.rotateThroughOnStart), Integer.valueOf(this.rotateThroughSpeedMult), Integer.valueOf(this.refreshRate)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.refreshRate;
    }

    public final int j() {
        return this.refreshRate3D;
    }

    public final int k() {
        return this.rotateThroughSpeedMult;
    }

    public final int l() {
        return this.scalePower;
    }

    public final int m() {
        return this.stepSize;
    }

    public final int n() {
        return this.timeBetweenFrames;
    }

    public final int o() {
        return this.width;
    }

    public final float p() {
        return this.widthRatio;
    }

    public final boolean q() {
        return this.checkAlpha;
    }

    public final boolean r() {
        return this.checkCoverage;
    }

    public final boolean s() {
        return this.checkFocus;
    }

    public final boolean t() {
        return this.checkVisibility;
    }

    public final boolean u() {
        return this.preCheck;
    }

    public final boolean v() {
        return this.rotateThroughOnStart;
    }

    public final int a() {
        return this.adsNumber;
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = 300;
        this.height = 50;
        this.minViewabilityPercentage = 50;
        this.checkCoverage = true;
        this.checkVisibility = true;
        this.checkAlpha = true;
        this.timeBetweenFrames = 25;
        this.stepSize = 5;
        this.delayFaceTime = 5000;
        this.adsNumber = 4;
        this.htmlAdsNumber = 10;
        this.refreshRate3D = 60000;
        this.widthRatio = 1.0f;
        this.heightRatio = 1.0f;
        this.minScale = 0.88f;
        this.scalePower = 4;
        this.effect = Effect.ROTATE_3D;
        this.rotateThroughOnStart = true;
        this.rotateThroughSpeedMult = 2;
        this.refreshRate = 60000;
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
        this.minViewabilityPercentage = bannerOptions.minViewabilityPercentage;
        this.checkFocus = bannerOptions.checkFocus;
        this.checkCoverage = bannerOptions.checkCoverage;
    }
}
