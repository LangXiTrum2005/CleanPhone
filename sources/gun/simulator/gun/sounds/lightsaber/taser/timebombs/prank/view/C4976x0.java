package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4976x0 {
    private final InterfaceC5017xV adOpenCallback;
    private final WeakReference<Context> context;
    private final Intent deepLinkOverrideIntent;
    private final Intent defaultIntent;

    public C4976x0(WeakReference<Context> weakReference, Intent intent, Intent intent2, InterfaceC5017xV interfaceC5017xV) {
        AbstractC2995aW.q(weakReference, com.umeng.analytics.pro.f.X);
        this.context = weakReference;
        this.deepLinkOverrideIntent = intent;
        this.defaultIntent = intent2;
        this.adOpenCallback = interfaceC5017xV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4976x0 copy$default(C4976x0 c4976x0, WeakReference weakReference, Intent intent, Intent intent2, InterfaceC5017xV interfaceC5017xV, int i, Object obj) {
        if ((i & 1) != 0) {
            weakReference = c4976x0.context;
        }
        if ((i & 2) != 0) {
            intent = c4976x0.deepLinkOverrideIntent;
        }
        if ((i & 4) != 0) {
            intent2 = c4976x0.defaultIntent;
        }
        if ((i & 8) != 0) {
            interfaceC5017xV = c4976x0.adOpenCallback;
        }
        return c4976x0.copy(weakReference, intent, intent2, interfaceC5017xV);
    }

    public final WeakReference<Context> component1() {
        return this.context;
    }

    public final Intent component2() {
        return this.deepLinkOverrideIntent;
    }

    public final Intent component3() {
        return this.defaultIntent;
    }

    public final InterfaceC5017xV component4() {
        return this.adOpenCallback;
    }

    public final C4976x0 copy(WeakReference<Context> weakReference, Intent intent, Intent intent2, InterfaceC5017xV interfaceC5017xV) {
        AbstractC2995aW.q(weakReference, com.umeng.analytics.pro.f.X);
        return new C4976x0(weakReference, intent, intent2, interfaceC5017xV);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4976x0)) {
            return false;
        }
        C4976x0 c4976x0 = (C4976x0) obj;
        return AbstractC2995aW.i(this.context, c4976x0.context) && AbstractC2995aW.i(this.deepLinkOverrideIntent, c4976x0.deepLinkOverrideIntent) && AbstractC2995aW.i(this.defaultIntent, c4976x0.defaultIntent) && AbstractC2995aW.i(this.adOpenCallback, c4976x0.adOpenCallback);
    }

    public final InterfaceC5017xV getAdOpenCallback() {
        return this.adOpenCallback;
    }

    public final WeakReference<Context> getContext() {
        return this.context;
    }

    public final Intent getDeepLinkOverrideIntent() {
        return this.deepLinkOverrideIntent;
    }

    public final Intent getDefaultIntent() {
        return this.defaultIntent;
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        Intent intent = this.deepLinkOverrideIntent;
        int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.defaultIntent;
        int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
        InterfaceC5017xV interfaceC5017xV = this.adOpenCallback;
        return iHashCode3 + (interfaceC5017xV != null ? interfaceC5017xV.hashCode() : 0);
    }

    public String toString() {
        return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
    }
}
