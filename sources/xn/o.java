package xn;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f53998c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f53999d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f54001b;

    public o(String str, String[] strArr) {
        this.f54000a = str;
        this.f54001b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.n.a(((o) obj).f54000a, this.f54000a);
    }

    public final int hashCode() {
        return this.f54000a.hashCode();
    }

    public final String toString() {
        return this.f54000a;
    }
}
