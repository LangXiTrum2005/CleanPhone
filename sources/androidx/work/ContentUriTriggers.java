package androidx.work;

import android.net.Uri;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ContentUriTriggers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f8613a = new HashSet();

    public static final class Trigger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8615b;

        public Trigger(Uri uri, boolean z2) {
            this.f8614a = uri;
            this.f8615b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Trigger.class == obj.getClass()) {
                Trigger trigger = (Trigger) obj;
                if (this.f8615b == trigger.f8615b && this.f8614a.equals(trigger.f8614a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f8614a.hashCode() * 31) + (this.f8615b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriTriggers.class != obj.getClass()) {
            return false;
        }
        return this.f8613a.equals(((ContentUriTriggers) obj).f8613a);
    }

    public final int hashCode() {
        return this.f8613a.hashCode();
    }
}
