package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nc implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RuntimeException f23779f;

    public nc(long j10, String str, int i10, long j11, Object obj) {
        go.k.i(((j10 > 0L ? 1 : (j10 == 0L ? 0 : -1)) == 0) == (str != null));
        this.f23774a = j10;
        this.f23775b = str;
        this.f23776c = i10;
        this.f23777d = j11;
        this.f23778e = obj;
        if (i10 != 5) {
            this.f23779f = null;
            return;
        }
        if (obj == null) {
            this.f23779f = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof s0)) {
            this.f23779f = null;
        } else {
            this.f23779f = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i10 = this.f23776c;
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        long j10 = this.f23777d;
        if (i10 == 2) {
            return Long.valueOf(j10);
        }
        if (i10 == 3) {
            return Double.valueOf(Double.longBitsToDouble(j10));
        }
        Object obj = this.f23778e;
        if (i10 == 4) {
            obj.getClass();
            return obj;
        }
        if (i10 != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((s0) obj).u();
        } catch (Throwable th2) {
            RuntimeException runtimeException = this.f23779f;
            if (runtimeException != null) {
                th2.addSuppressed(runtimeException);
            }
            throw th2;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nc ncVar = (nc) obj;
        long j10 = ncVar.f23774a;
        long j11 = this.f23774a;
        int iCompare = Long.compare(j11, j10);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j11 != 0) {
            return 0;
        }
        String str = this.f23775b;
        str.getClass();
        String str2 = ncVar.f23775b;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc)) {
            return false;
        }
        nc ncVar = (nc) obj;
        return this.f23774a == ncVar.f23774a && Objects.equals(this.f23775b, ncVar.f23775b);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f23774a), this.f23775b);
    }

    public final String toString() {
        String string = this.f23775b;
        if (string == null) {
            string = Long.toString(this.f23774a);
        }
        String strValueOf = String.valueOf(a());
        return q4.a.j(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
