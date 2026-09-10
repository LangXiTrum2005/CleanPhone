package com.smartdigimkt.x2;

/* JADX INFO: loaded from: classes6.dex */
public interface j {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f39886I = 1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f39887J = 2;
    public static final int K = 3;
    public static final int L = 4;
    public static final int M = 5;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f39888N = 6;
    public static final int O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f39889P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f39890Q = 1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f39891R = 2;
    public static final int S = 1;
    public static final int T = 2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f39892U = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f39893V = 1;
    public static final int W = 2;
    public static final int a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f39894b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f39895c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f39896d0 = 1;

    void alertWebViewShowed();

    void closeVideoOperate(int i2, int i3);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i2);

    boolean isH5Canvas();

    void notifyCloseBtn(int i2);

    void progressBarOperate(int i2);

    void progressOperate(int i2, int i3);

    void setCover(boolean z2);

    void setInstallDialogState(boolean z2);

    void setMiniEndCardState(boolean z2);

    void setScaleFitXY(int i2);

    void setVisible(int i2);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    void soundOperate(int i2, int i3);

    void soundOperate(int i2, int i3, String str);

    void videoOperate(int i2);
}
