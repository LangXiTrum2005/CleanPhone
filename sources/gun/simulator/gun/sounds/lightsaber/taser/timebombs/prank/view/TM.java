package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class TM extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3769a;
    public WeakReference b;

    public TM(InterfaceC3428fN interfaceC3428fN) {
        this.f3769a = new WeakReference(interfaceC3428fN);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f3769a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        AbstractC4922wO.a(data);
        InterfaceC3428fN interfaceC3428fN = (InterfaceC3428fN) weakReference2.get();
        Messenger messenger = (Messenger) this.b.get();
        try {
            int i = message.what;
            if (i == 1) {
                AbstractC4922wO.a(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                interfaceC3428fN.getClass();
            } else if (i == 2) {
                interfaceC3428fN.getClass();
            } else if (i != 3) {
                message.toString();
            } else {
                AbstractC4922wO.a(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
                AbstractC4922wO.a(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
                String string = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST);
                ((ZM) interfaceC3428fN).a(messenger, string);
            }
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC3428fN.getClass();
            }
        }
    }
}
