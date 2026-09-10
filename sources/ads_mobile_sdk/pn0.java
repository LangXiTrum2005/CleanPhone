package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 extends nn0 {
    public final zt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn0(zt0 response) {
        super(k41.NETWORK_ERROR, 0);
        Intrinsics.checkNotNullParameter(response, "response");
        this.c = response;
    }

    public final zt0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pn0) && Intrinsics.wireman(this.c, ((pn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "HttpError(response=" + this.c + ")";
    }
}
