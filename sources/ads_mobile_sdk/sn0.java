package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends nn0 {
    public final String c;

    public /* synthetic */ sn0() {
        this(ag0.c.a());
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn0) && Intrinsics.wireman(this.c, ((sn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "NoFillError(message=" + this.c + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(String message) {
        super(k41.NO_FILL, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.c = message;
    }
}
