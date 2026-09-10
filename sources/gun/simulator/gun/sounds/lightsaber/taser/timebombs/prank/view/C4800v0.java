package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4800v0 {
    private C4800v0() {
    }

    public /* synthetic */ C4800v0(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    private final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, InterfaceC5017xV interfaceC5017xV) {
        if (intent == null && intent2 == null) {
            return false;
        }
        try {
            if (intent != null) {
                context.startActivity(intent);
                if (interfaceC5017xV != null) {
                    interfaceC5017xV.onDeeplinkClick(true);
                }
            } else {
                context.startActivity(intent2);
            }
        } catch (Exception e) {
            C4917wJ.Companion.e("ActivityManager", "Cannot launch/find activity to handle the Implicit intent: " + e);
            if (intent != null && interfaceC5017xV != null) {
                try {
                    interfaceC5017xV.onDeeplinkClick(false);
                    if (intent != null) {
                        context.startActivity(intent2);
                    }
                } catch (Exception unused) {
                    return false;
                }
            } else if (intent != null && intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        return true;
    }

    public final void addLifecycleListener(C4888w0 c4888w0) {
        AbstractC2995aW.q(c4888w0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getInstance$vungle_ads_release().addListener(c4888w0);
    }

    public final void deInit(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        getInstance$vungle_ads_release().deInit$vungle_ads_release(context);
    }

    public final C5064y0 getInstance$vungle_ads_release() {
        return C5064y0.instance;
    }

    public final void init(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        getInstance$vungle_ads_release().init(context);
    }

    public final boolean isForeground() {
        return getInstance$vungle_ads_release().isAppInForeground();
    }

    public final boolean startWhenForeground(Context context, Intent intent, Intent intent2, InterfaceC5017xV interfaceC5017xV) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        if (isForeground()) {
            return startActivityHandleException(context, intent, intent2, interfaceC5017xV);
        }
        getInstance$vungle_ads_release().targetActivityInfo = new C4976x0(new WeakReference(context), intent, intent2, interfaceC5017xV);
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
    }
}
