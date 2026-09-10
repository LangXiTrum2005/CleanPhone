package collectively;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi implements ServiceConnection {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final /* synthetic */ graveside f15833dern;

    public /* synthetic */ polloi(graveside gravesideVar, molybdenite molybdeniteVar) {
        this.f15833dern = gravesideVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15833dern.f15826saneness.dern("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f15833dern.dern().post(new arytenoidectomy(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15833dern.f15826saneness.dern("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f15833dern.dern().post(new monoploid(this));
    }
}
