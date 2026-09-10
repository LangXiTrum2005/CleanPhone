package androidx.work;

import android.app.Notification;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class ForegroundInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f8625c;

    public ForegroundInfo(int i2, int i3, Notification notification) {
        this.f8623a = i2;
        this.f8625c = notification;
        this.f8624b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f8623a == foregroundInfo.f8623a && this.f8624b == foregroundInfo.f8624b) {
            return this.f8625c.equals(foregroundInfo.f8625c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8625c.hashCode() + (((this.f8623a * 31) + this.f8624b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f8623a + ", mForegroundServiceType=" + this.f8624b + ", mNotification=" + this.f8625c + AbstractJsonLexerKt.END_OBJ;
    }
}
