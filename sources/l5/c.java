package l5;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import u.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45047a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f45050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45051e;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f45051e = systemForegroundService;
        this.f45048b = i10;
        this.f45050d = notification;
        this.f45049c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45047a) {
            case 0:
                ((SystemForegroundService) this.f45051e).startForeground(this.f45048b, (Notification) this.f45050d, this.f45049c);
                break;
            default:
                ((f) this.f45051e).f51629b.onActivityResized(this.f45048b, this.f45049c, (Bundle) this.f45050d);
                break;
        }
    }

    public c(f fVar, int i10, int i11, Bundle bundle) {
        this.f45051e = fVar;
        this.f45048b = i10;
        this.f45049c = i11;
        this.f45050d = bundle;
    }
}
