package i6;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f42902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.e f42903b = new b7.e();

    public g(MessageDigest messageDigest) {
        this.f42902a = messageDigest;
    }

    @Override // b7.b
    public final b7.e a() {
        return this.f42903b;
    }
}
