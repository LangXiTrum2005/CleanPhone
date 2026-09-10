package androidx.core.util;

import android.support.v4.media.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4408b;

    public Pair(Object obj, Object obj2) {
        this.f4407a = obj;
        this.f4408b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.f4407a, this.f4407a) && Objects.equals(pair.f4408b, this.f4408b);
    }

    public final int hashCode() {
        Object obj = this.f4407a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4408b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.f4407a);
        sb.append(" ");
        return a.q(sb, this.f4408b, "}");
    }
}
