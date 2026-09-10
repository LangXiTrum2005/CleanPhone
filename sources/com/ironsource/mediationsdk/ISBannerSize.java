package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.U7;
import com.unity3d.mediation.LevelPlayAdSize;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    U7 f29275e;
    public static final ISBannerSize BANNER = j.a(j.f29553a, 320, 50);
    public static final ISBannerSize LARGE = j.a(j.f29554b, 320, 90);
    public static final ISBannerSize RECTANGLE = j.a(j.f29555c, 300, 250);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final ISBannerSize f29270f = j.a();
    public static final ISBannerSize SMART = j.a(j.f29557e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this(j.f29558f, i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return j.b(i10);
    }

    public void a(U7 u10) {
        if (j.a(u10, this.f29271a, this.f29272b)) {
            this.f29275e = u10;
        }
    }

    public String getDescription() {
        return this.f29273c;
    }

    public int getHeight() {
        return this.f29272b;
    }

    public int getWidth() {
        return this.f29271a;
    }

    public boolean isAdaptive() {
        return this.f29274d;
    }

    public boolean isSmart() {
        return this.f29273c.equals(j.f29557e);
    }

    public void setAdaptive(boolean z10) {
        this.f29274d = z10;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f29275e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f29271a, this.f29272b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f29273c = str;
        this.f29271a = i10;
        this.f29272b = i11;
        this.f29275e = new U7(i10, i11);
    }
}
