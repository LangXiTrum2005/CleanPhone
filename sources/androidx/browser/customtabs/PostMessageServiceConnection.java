package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.IPostMessageService;

/* JADX INFO: loaded from: classes.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    public IPostMessageService X;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.X = IPostMessageService.Stub.b0(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.X = null;
    }
}
