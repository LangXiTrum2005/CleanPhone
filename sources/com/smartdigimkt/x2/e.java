package com.smartdigimkt.x2;

/* JADX INFO: loaded from: classes6.dex */
public interface e extends f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f39874A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f39875B = 2;
    public static final int C = 1;
    public static final int D = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f39876E = 3;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f39877F = 4;
    public static final int G = 5;
    public static final int H = 100;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f39878z = -1;

    void configurationChanged(int i2, int i3, int i4);

    boolean endCardShowing();

    void handlerPlayableException(String str);

    void hideAlertWebview();

    void ivRewardAdsWithoutVideo(String str);

    boolean miniCardLoaded();

    boolean miniCardShowing();

    void readyStatus(int i2);

    void resizeMiniCard(int i2, int i3, int i4);

    boolean showAlertWebView();

    void showEndcard(int i2);

    void showMiniCard(int i2, int i3, int i4, int i5, int i6);

    void showPlayableView();

    void showVideoClickView(int i2);

    void showVideoEndCover();
}
