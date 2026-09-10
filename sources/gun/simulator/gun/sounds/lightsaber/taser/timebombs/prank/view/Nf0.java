package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class Nf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3467a;

    static {
        int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
        f3467a = iArr;
        try {
            iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3467a[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3467a[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3467a[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3467a[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
