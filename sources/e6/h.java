package e6;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rc.d f39143e = new rc.d(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f39145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f39147d;

    public h(String str, Object obj, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f39146c = str;
        this.f39144a = obj;
        this.f39145b = gVar;
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, f39143e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f39146c.equals(((h) obj).f39146c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39146c.hashCode();
    }

    public final String toString() {
        return defpackage.e.q(this.f39146c, "'}", new StringBuilder("Option{key='"));
    }
}
