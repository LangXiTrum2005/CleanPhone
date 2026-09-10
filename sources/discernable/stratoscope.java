package discernable;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import invest.oilcan;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f25321attabal = Charset.forName(C.UTF8_NAME);

    public static oilcan.dern attabal(com.google.crypto.tink.proto.attabal.dern dernVar) {
        return oilcan.dern.splinterproof().dovishness(dernVar.splinterproof().overspeculate()).adultoid(dernVar.dent()).graveside(dernVar.clubfoot()).molybdenite(dernVar.overspeculate()).build();
    }

    public static byte[] dern(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void marial(com.google.crypto.tink.proto.attabal attabalVar) throws GeneralSecurityException {
        int iDent = attabalVar.dent();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (com.google.crypto.tink.proto.attabal.dern dernVar : attabalVar.clubfoot()) {
            if (dernVar.dent() == KeyStatusType.ENABLED) {
                wireman(dernVar);
                if (dernVar.overspeculate() == iDent) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (dernVar.splinterproof().splinterproof() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    public static oilcan saneness(com.google.crypto.tink.proto.attabal attabalVar) {
        oilcan.saneness sanenessVarGraveside = oilcan.splinterproof().graveside(attabalVar.dent());
        Iterator<com.google.crypto.tink.proto.attabal.dern> it = attabalVar.clubfoot().iterator();
        while (it.hasNext()) {
            sanenessVarGraveside.molybdenite(attabal(it.next()));
        }
        return sanenessVarGraveside.build();
    }

    public static void wireman(com.google.crypto.tink.proto.attabal.dern dernVar) throws GeneralSecurityException {
        if (!dernVar.permissivist()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(dernVar.overspeculate())));
        }
        if (dernVar.clubfoot() == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(dernVar.overspeculate())));
        }
        if (dernVar.dent() == KeyStatusType.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(dernVar.overspeculate())));
        }
    }
}
