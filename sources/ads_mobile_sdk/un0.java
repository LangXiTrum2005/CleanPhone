package ads_mobile_sdk;

import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class un0 extends nn0 {
    public final String c;
    public final Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(String message, Throwable th) {
        super(k41.TIMEOUT, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.c = message;
        this.d = th;
    }

    @Override // ads_mobile_sdk.nn0
    public final Throwable b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un0)) {
            return false;
        }
        un0 un0Var = (un0) obj;
        return Intrinsics.wireman(this.c, un0Var.c) && Intrinsics.wireman(this.d, un0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Throwable th = this.d;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "TimeoutError(message=" + this.c + ", exception=" + this.d + ")";
    }

    public /* synthetic */ un0(TimeoutCancellationException timeoutCancellationException, int i) {
        this(ag0.d.a(), (i & 2) != 0 ? null : timeoutCancellationException);
    }
}
