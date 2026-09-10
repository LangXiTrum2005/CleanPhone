package qd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements pd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49015b;

    public o(String str, int i10) {
        this.f49014a = str;
        this.f49015b = i10;
    }

    public final boolean a() {
        if (this.f49015b == 0) {
            return false;
        }
        String strTrim = d().trim();
        if (h.f48973e.matcher(strTrim).matches()) {
            return true;
        }
        if (h.f48974f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(defpackage.e.o("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.f49015b == 0) {
            return 0.0d;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(defpackage.e.o("[Value: ", strTrim, "] cannot be converted to a double."), e10);
        }
    }

    public final long c() {
        if (this.f49015b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(defpackage.e.o("[Value: ", strTrim, "] cannot be converted to a long."), e10);
        }
    }

    public final String d() {
        return this.f49015b == 0 ? "" : this.f49014a;
    }
}
