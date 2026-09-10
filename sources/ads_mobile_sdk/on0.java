package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class on0 extends nn0 {
    public final Throwable c;
    public final k41 d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on0(Throwable exception, k41 internalErrorCode, String str) {
        super(internalErrorCode, 0);
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(internalErrorCode, "internalErrorCode");
        this.c = exception;
        this.d = internalErrorCode;
        this.e = str;
    }

    @Override // ads_mobile_sdk.nn0
    public final k41 a() {
        return this.d;
    }

    @Override // ads_mobile_sdk.nn0
    public final Throwable b() {
        return this.c;
    }

    public final Throwable c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on0)) {
            return false;
        }
        on0 on0Var = (on0) obj;
        return Intrinsics.wireman(this.c, on0Var.c) && this.d == on0Var.d && Intrinsics.wireman(this.e, on0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExceptionError(exception=" + this.c + ", internalErrorCode=" + this.d + ", message=" + this.e + ")";
    }

    public /* synthetic */ on0(Throwable th, k41 k41Var, String str, int i) {
        this(th, (i & 2) != 0 ? k41.INTERNAL_ERROR : k41Var, (i & 4) != 0 ? null : str);
    }
}
