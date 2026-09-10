package i5;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42888d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42885a == aVar.f42885a && this.f42886b == aVar.f42886b && this.f42887c == aVar.f42887c && this.f42888d == aVar.f42888d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r0 = this.f42885a;
        int i10 = r0;
        if (this.f42886b) {
            i10 = r0 + 16;
        }
        int i11 = i10;
        if (this.f42887c) {
            i11 = i10 + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return this.f42888d ? i11 + 4096 : i11;
    }

    public final String toString() {
        return "[ Connected=" + this.f42885a + " Validated=" + this.f42886b + " Metered=" + this.f42887c + " NotRoaming=" + this.f42888d + " ]";
    }
}
