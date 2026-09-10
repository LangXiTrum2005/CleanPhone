package hobby;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ProtoKeySerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polder implements privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f27809attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final KeyData.KeyMaterialType f27810dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    @Nullable
    public final Integer f27811marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.attabal f27812saneness;
    private final ByteString value;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final OutputPrefixType f27813wireman;

    public polder(String str, ebullioscopic.attabal attabalVar, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, @Nullable Integer num) {
        this.f27809attabal = str;
        this.f27812saneness = attabalVar;
        this.value = byteString;
        this.f27810dern = keyMaterialType;
        this.f27813wireman = outputPrefixType;
        this.f27811marial = num;
    }

    public static polder saneness(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, @Nullable Integer num) throws GeneralSecurityException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new polder(str, creditor.saneness(str), byteString, keyMaterialType, outputPrefixType, num);
    }

    @Override // hobby.privatdozent
    public ebullioscopic.attabal attabal() {
        return this.f27812saneness;
    }

    public String beachfront() {
        return this.f27809attabal;
    }

    public ByteString competently() {
        return this.value;
    }

    @Nullable
    public Integer dern() {
        return this.f27811marial;
    }

    public OutputPrefixType marial() {
        return this.f27813wireman;
    }

    public KeyData.KeyMaterialType wireman() {
        return this.f27810dern;
    }
}
