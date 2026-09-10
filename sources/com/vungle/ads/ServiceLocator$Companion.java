package com.vungle.ads;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3756j50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class ServiceLocator$Companion {
    private ServiceLocator$Companion() {
    }

    public /* synthetic */ ServiceLocator$Companion(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    @VisibleForTesting
    public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
    }

    public final synchronized void deInit() {
        setINSTANCE$vungle_ads_release(null);
    }

    public final C3756j50 getINSTANCE$vungle_ads_release() {
        return C3756j50.INSTANCE;
    }

    public final C3756j50 getInstance(Context context) {
        AbstractC2995aW.q(context, f.X);
        C3756j50 iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
        if (iNSTANCE$vungle_ads_release == null) {
            synchronized (this) {
                ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
                C3756j50 iNSTANCE$vungle_ads_release2 = serviceLocator$Companion.getINSTANCE$vungle_ads_release();
                if (iNSTANCE$vungle_ads_release2 == null) {
                    iNSTANCE$vungle_ads_release2 = new C3756j50(context, null);
                    serviceLocator$Companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                }
                iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
            }
        }
        return iNSTANCE$vungle_ads_release;
    }

    public final <T> InterfaceC3069bH inject(Context context) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.w0();
        throw null;
    }

    public final void setINSTANCE$vungle_ads_release(C3756j50 c3756j50) {
        C3756j50.INSTANCE = c3756j50;
    }
}
