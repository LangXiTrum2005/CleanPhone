package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements spartacist {
    public final Object b;

    public tn0(Object obj) {
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn0) && Intrinsics.wireman(this.b, ((tn0) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.b + ")";
    }
}
