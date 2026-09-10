package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3856z6 {
    void a(Activity activity);

    void a(C3669o6 c3669o6);

    void a(C3669o6 c3669o6, IronSourceError ironSourceError);

    void a(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C3669o6 c3669o6, IronSourceError ironSourceError);

    void b(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
