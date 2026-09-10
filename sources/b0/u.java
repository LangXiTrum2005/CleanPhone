package b0;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5208e;

    public /* synthetic */ u(int i10) {
        this.f5208e = i10;
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        switch (this.f5208e) {
            case 0:
                ((Notification.Builder) kVar.f42287b).setStyle(t.a());
                break;
            default:
                ((Notification.Builder) kVar.f42287b).setStyle(new Notification.MediaStyle());
                break;
        }
    }

    @Override // b0.g0
    public String d() {
        switch (this.f5208e) {
            case 0:
                return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
            default:
                return super.d();
        }
    }
}
