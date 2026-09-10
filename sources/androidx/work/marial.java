package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: ForegroundInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14194attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Notification f14195dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f14196saneness;

    public marial(int i, Notification notification, int i2) {
        this.f14194attabal = i;
        this.f14195dern = notification;
        this.f14196saneness = i2;
    }

    public int attabal() {
        return this.f14196saneness;
    }

    public int dern() {
        return this.f14194attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || marial.class != obj.getClass()) {
            return false;
        }
        marial marialVar = (marial) obj;
        if (this.f14194attabal == marialVar.f14194attabal && this.f14196saneness == marialVar.f14196saneness) {
            return this.f14195dern.equals(marialVar.f14195dern);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14194attabal * 31) + this.f14196saneness) * 31) + this.f14195dern.hashCode();
    }

    public Notification saneness() {
        return this.f14195dern;
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14194attabal + ", mForegroundServiceType=" + this.f14196saneness + ", mNotification=" + this.f14195dern + '}';
    }
}
