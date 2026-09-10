package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;

/* JADX INFO: loaded from: classes.dex */
public class ZM implements InterfaceC3428fN, VM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4067a;
    public final MediaBrowser b;
    public final Bundle c;
    public final TM d = new TM(this);
    public final ArrayMap e = new ArrayMap();
    public C3692iN f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public ZM(Context context, ComponentName componentName, WM wm) {
        this.f4067a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        wm.setInternalConnectionCallback(this);
        this.b = new MediaBrowser(context, componentName, wm.mConnectionCallbackFwk, bundle);
    }

    public final void a(Messenger messenger, String str) {
        if (this.g != messenger) {
            return;
        }
        AbstractC3950lJ.z(this.e.get(str));
        boolean z = C3778jN.b;
    }
}
