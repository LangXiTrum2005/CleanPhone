package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0263b8 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSourceError f28276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0263b8(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.n.f(error, "error");
        this.f28276a = error;
    }

    public final IronSourceError a() {
        return this.f28276a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0263b8.class.equals(obj.getClass())) {
            return false;
        }
        C0263b8 c0263b8 = (C0263b8) obj;
        if (this.f28276a.getErrorCode() != c0263b8.f28276a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.n.a(this.f28276a.getErrorMessage(), c0263b8.f28276a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28276a.getErrorCode()), this.f28276a.getErrorMessage());
    }
}
