package hobby;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.overspeculate;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: LegacyKeyManagerImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon<P> implements discernable.taiyuan<P> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f27786attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final KeyData.KeyMaterialType f27787dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<P> f27788saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final overspeculate<? extends com.google.crypto.tink.shaded.protobuf.privatdozent> f27789wireman;

    /* JADX INFO: compiled from: LegacyKeyManagerImpl.java */
    public static class attabal<P> extends kowloon<P> implements discernable.graveside<P> {
        public attabal(String str, Class<P> cls, overspeculate<? extends com.google.crypto.tink.shaded.protobuf.privatdozent> overspeculateVar) {
            super(str, cls, KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, overspeculateVar);
        }
    }

    public kowloon(String str, Class<P> cls, KeyData.KeyMaterialType keyMaterialType, overspeculate<? extends com.google.crypto.tink.shaded.protobuf.privatdozent> overspeculateVar) {
        this.f27789wireman = overspeculateVar;
        this.f27786attabal = str;
        this.f27788saneness = cls;
        this.f27787dern = keyMaterialType;
    }

    public static <P> discernable.graveside<P> beachfront(String str, Class<P> cls, overspeculate<? extends com.google.crypto.tink.shaded.protobuf.privatdozent> overspeculateVar) {
        return new attabal(str, cls, overspeculateVar);
    }

    public static <P> discernable.taiyuan<P> marial(String str, Class<P> cls, KeyData.KeyMaterialType keyMaterialType, overspeculate<? extends com.google.crypto.tink.shaded.protobuf.privatdozent> overspeculateVar) {
        return new kowloon(str, cls, keyMaterialType, overspeculateVar);
    }

    @Override // discernable.taiyuan
    public final Class<P> attabal() {
        return this.f27788saneness;
    }

    @Override // discernable.taiyuan
    public final String dern() {
        return this.f27786attabal;
    }

    @Override // discernable.taiyuan
    public final KeyData saneness(ByteString byteString) throws GeneralSecurityException {
        polder polderVar = (polder) com.google.crypto.tink.internal.saneness.dern().triweekly(dovishness.beachfront().dern(com.google.crypto.tink.internal.saneness.dern().impromptu(seminary.saneness(invest.stratoscope.dent().graveside(this.f27786attabal).adultoid(byteString).molybdenite(OutputPrefixType.RAW).build())), null), polder.class, discernable.beachfront.attabal());
        return KeyData.dent().graveside(polderVar.beachfront()).adultoid(polderVar.competently()).molybdenite(polderVar.wireman()).build();
    }

    @Override // discernable.taiyuan
    public P wireman(ByteString byteString) throws GeneralSecurityException {
        return (P) cord.saneness().attabal(com.google.crypto.tink.internal.saneness.dern().beachfront(polder.saneness(this.f27786attabal, byteString, this.f27787dern, OutputPrefixType.RAW, null), discernable.beachfront.attabal()), this.f27788saneness);
    }
}
