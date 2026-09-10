package discernable;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: BinaryKeysetReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InputStream f25320attabal;

    public saneness(InputStream inputStream) {
        this.f25320attabal = inputStream;
    }

    public static triweekly attabal(byte[] bArr) {
        return new saneness(new ByteArrayInputStream(bArr));
    }

    @Override // discernable.triweekly
    public com.google.crypto.tink.proto.attabal read() throws IOException {
        try {
            return com.google.crypto.tink.proto.attabal.cultivated(this.f25320attabal, com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
        } finally {
            this.f25320attabal.close();
        }
    }
}
