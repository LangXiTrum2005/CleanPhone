package arytenoidectomy;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;

/* JADX INFO: compiled from: EngagementSignalsCallbackRemote.java */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final IEngagementSignalsCallback f14395attabal;

    public triweekly(IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.f14395attabal = iEngagementSignalsCallback;
    }

    public static triweekly attabal(IBinder iBinder) {
        return new triweekly(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }

    @Override // arytenoidectomy.impassible
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.f14395attabal.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // arytenoidectomy.impassible
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.f14395attabal.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // arytenoidectomy.impassible
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.f14395attabal.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
        }
    }
}
