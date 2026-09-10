package zl;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f55076a;

    public q(String str) {
        super(str);
        this.f55076a = null;
    }

    public static q d() {
        return new q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
