package discernable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: TinkProtoKeysetFormat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord {
    public static formularize attabal(byte[] bArr, rotuma rotumaVar) throws GeneralSecurityException {
        if (rotumaVar == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            return wireman.attabal(saneness.attabal(bArr));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static byte[] saneness(formularize formularizeVar, rotuma rotumaVar) throws GeneralSecurityException {
        if (rotumaVar == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            wireman.saneness(formularizeVar, dern.saneness(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new GeneralSecurityException("Serialize keyset failed");
        }
    }
}
