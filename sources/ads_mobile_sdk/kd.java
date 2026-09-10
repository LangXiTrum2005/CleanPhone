package ads_mobile_sdk;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends ld {
    public final byte[] b;

    public kd(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.b;
    }
}
