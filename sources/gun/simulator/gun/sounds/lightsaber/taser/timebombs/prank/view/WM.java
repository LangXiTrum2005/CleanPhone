package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.browse.MediaBrowser;

/* JADX INFO: loaded from: classes.dex */
public abstract class WM {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new UM(this);
    VM mConnectionCallbackInternal;

    public abstract void onConnected();

    public abstract void onConnectionFailed();

    public abstract void onConnectionSuspended();

    public void setInternalConnectionCallback(VM vm) {
        this.mConnectionCallbackInternal = vm;
    }
}
