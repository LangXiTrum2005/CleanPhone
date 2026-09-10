package d5;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f38696c;

    public h(int i10, Notification notification, int i11) {
        this.f38694a = i10;
        this.f38696c = notification;
        this.f38695b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f38694a == hVar.f38694a && this.f38695b == hVar.f38695b) {
            return this.f38696c.equals(hVar.f38696c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38696c.hashCode() + (((this.f38694a * 31) + this.f38695b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f38694a + ", mForegroundServiceType=" + this.f38695b + ", mNotification=" + this.f38696c + '}';
    }
}
