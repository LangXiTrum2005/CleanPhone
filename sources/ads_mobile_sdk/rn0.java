package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rn0 extends nn0 {
    public final String c;
    public final k41 d;

    public /* synthetic */ rn0(String str) {
        this(str, k41.INTERNAL_ERROR);
    }

    @Override // ads_mobile_sdk.nn0
    public final k41 a() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn0)) {
            return false;
        }
        rn0 rn0Var = (rn0) obj;
        return Intrinsics.wireman(this.c, rn0Var.c) && this.d == rn0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "MessageError(message=" + this.c + ", internalErrorCode=" + this.d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn0(String message, k41 internalErrorCode) {
        super(internalErrorCode, 0);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(internalErrorCode, "internalErrorCode");
        this.c = message;
        this.d = internalErrorCode;
    }
}
