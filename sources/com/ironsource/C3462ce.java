package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3462ce {
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;
    private final int a;
    private final String b;

    /* JADX INFO: renamed from: com.ironsource.ce$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3462ce(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3462ce)) {
            return false;
        }
        C3462ce c3462ce = (C3462ce) obj;
        return this.a == c3462ce.a && Intrinsics.wireman(this.b, c3462ce.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3462ce(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public final C3462ce a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C3462ce(i, errorMessage);
    }

    public static /* synthetic */ C3462ce a(C3462ce c3462ce, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c3462ce.a;
        }
        if ((i2 & 2) != 0) {
            str = c3462ce.b;
        }
        return c3462ce.a(i, str);
    }
}
