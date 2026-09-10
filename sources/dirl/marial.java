package dirl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class marial implements ServiceConnection {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final /* synthetic */ beachfront f25272dern;

    public /* synthetic */ marial(beachfront beachfrontVar, wireman wiremanVar) {
        this.f25272dern = beachfrontVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f25272dern.f25260saneness.dern("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f25272dern.dern().post(new saneness(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f25272dern.f25260saneness.dern("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f25272dern.dern().post(new dern(this));
    }
}
