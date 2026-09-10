package discernable;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BinaryKeysetWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern implements kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final OutputStream f25293attabal;

    public dern(OutputStream outputStream) {
        this.f25293attabal = outputStream;
    }

    public static kowloon saneness(OutputStream outputStream) {
        return new dern(outputStream);
    }

    @Override // discernable.kowloon
    public void attabal(com.google.crypto.tink.proto.attabal attabalVar) throws IOException {
        try {
            attabalVar.impromptu(this.f25293attabal);
        } finally {
            this.f25293attabal.close();
        }
    }
}
