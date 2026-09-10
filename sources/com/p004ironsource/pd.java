package com.p004ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/ironsource/pd;", "", "", "loadAd", "Lcom/ironsource/h1;", "d", "Landroid/app/Activity;", "activity", "", "placementName", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "adInfo", sv.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", sv.f27214b, "onAdInfoChanged", "b", sv.f, sv.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface pd {
    void a();

    void a(Activity activity, String placementName);

    void a(LevelPlayAdError error);

    void b();

    /* JADX INFO: renamed from: c */
    LevelPlayAdInfo getAdInfo();

    h1 d();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(LevelPlayAdInfo adInfo);

    void onAdLoadFailed(LevelPlayAdError error);

    void onAdLoaded(LevelPlayAdInfo adInfo);
}
