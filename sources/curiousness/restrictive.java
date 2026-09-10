package curiousness;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: KmsEnvelopeAead.java */
/* JADX INFO: loaded from: classes3.dex */
public final class restrictive implements discernable.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f24461attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final discernable.attabal f24462dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final discernable.molybdenite f24463saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final byte[] f24460wireman = new byte[0];

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Set<String> f24459marial = marial();

    @Deprecated
    public restrictive(invest.stratoscope stratoscopeVar, discernable.attabal attabalVar) throws GeneralSecurityException {
        if (wireman(stratoscopeVar.overspeculate())) {
            this.f24461attabal = stratoscopeVar.overspeculate();
            this.f24463saneness = dern(stratoscopeVar);
            this.f24462dern = attabalVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + stratoscopeVar.overspeculate() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static Set<String> marial() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    public static discernable.attabal saneness(dern dernVar, discernable.attabal attabalVar) throws GeneralSecurityException {
        try {
            return new restrictive(invest.stratoscope.cultivated(discernable.cuirassed.saneness(dernVar), com.google.crypto.tink.shaded.protobuf.kowloon.saneness()), attabalVar);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static boolean wireman(String str) {
        return f24459marial.contains(str);
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((discernable.attabal) hobby.cord.saneness().attabal(com.google.crypto.tink.internal.saneness.dern().beachfront(hobby.polder.saneness(this.f24461attabal, ByteString.copyFrom(this.f24462dern.attabal(bArr3, f24460wireman)), KeyData.KeyMaterialType.SYMMETRIC, OutputPrefixType.RAW, null), discernable.beachfront.attabal()), discernable.attabal.class)).attabal(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final discernable.molybdenite dern(invest.stratoscope stratoscopeVar) throws GeneralSecurityException {
        return discernable.cuirassed.attabal(invest.stratoscope.permissivist(stratoscopeVar).molybdenite(OutputPrefixType.RAW).build().competently());
    }
}
