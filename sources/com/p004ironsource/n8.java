package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/n8;", "", "", "e", "toString", "", "a", "Lcom/ironsource/p8;", "b", "isCapped", "type", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Z", "d", "()Z", "Lcom/ironsource/p8;", "c", "()Lcom/ironsource/p8;", "<init>", "(ZLcom/ironsource/p8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isCapped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p8 type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26243a;

        static {
            int[] iArr = new int[p8.values().length];
            try {
                iArr[p8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26243a = iArr;
        }
    }

    public n8(boolean z2, p8 p8Var) {
        this.isCapped = z2;
        this.type = p8Var;
    }

    public static /* synthetic */ n8 a(n8 n8Var, boolean z2, p8 p8Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = n8Var.isCapped;
        }
        if ((i2 & 2) != 0) {
            p8Var = n8Var.type;
        }
        return n8Var.a(z2, p8Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p8 getType() {
        return this.type;
    }

    public final p8 c() {
        return this.type;
    }

    public final boolean d() {
        return this.isCapped;
    }

    public final String e() {
        p8 p8Var = this.type;
        int i2 = p8Var == null ? -1 : a.f26243a[p8Var.ordinal()];
        if (i2 == 1) {
            return "Placement delivery is false";
        }
        if (i2 == 2) {
            return "In pacing mode";
        }
        if (i2 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) other;
        return this.isCapped == n8Var.isCapped && this.type == n8Var.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z2 = this.isCapped;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        p8 p8Var = this.type;
        return i2 + (p8Var == null ? 0 : p8Var.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.isCapped + " reason=" + this.type + ')';
    }

    public /* synthetic */ n8(boolean z2, p8 p8Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, (i2 & 2) != 0 ? null : p8Var);
    }

    public final n8 a(boolean isCapped, p8 type) {
        return new n8(isCapped, type);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsCapped() {
        return this.isCapped;
    }
}
