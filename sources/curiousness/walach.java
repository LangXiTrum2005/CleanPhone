package curiousness;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyKmsAeadProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class walach {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f24486attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f24487dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f24488marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<saran, hobby.seminary> f24489saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<grimness, hobby.polder> f24490wireman;

    /* JADX INFO: compiled from: LegacyKmsAeadProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f24491attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f24491attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24491attabal[OutputPrefixType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f24486attabal = attabalVarImpromptu;
        f24489saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: curiousness.privatdozent
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return walach.cutely((saran) molybdeniteVar);
            }
        }, saran.class, hobby.seminary.class);
        f24487dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: curiousness.creditor
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return walach.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f24490wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: curiousness.starveling
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return walach.taiyuan((grimness) impromptuVar, rotumaVar);
            }
        }, grimness.class, hobby.polder.class);
        f24488marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: curiousness.hydrovane
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return walach.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(saran.attabal attabalVar) throws GeneralSecurityException {
        if (saran.attabal.f24466attabal.equals(attabalVar)) {
            return OutputPrefixType.TINK;
        }
        if (saran.attabal.f24467saneness.equals(attabalVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + attabalVar);
    }

    public static saran beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return saran.saneness(invest.sealless.splinterproof(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness()).peridotite(), formularize(seminaryVar.wireman().splinterproof()));
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(saran saranVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.KmsAeadKey").adultoid(invest.sealless.mathsort().molybdenite(saranVar.dern()).build().toByteString()).molybdenite(apical(saranVar.wireman())).build());
    }

    public static saran.attabal formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f24491attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return saran.attabal.f24466attabal;
        }
        if (i == 2) {
            return saran.attabal.f24467saneness;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f24489saneness);
        sanenessVar.formularize(f24487dern);
        sanenessVar.apical(f24490wireman);
        sanenessVar.cutely(f24488marial);
    }

    public static grimness marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            invest.yemenite yemeniteVarSplinterproof = invest.yemenite.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (yemeniteVarSplinterproof.peridotite() == 0) {
                return grimness.wireman(saran.saneness(yemeniteVarSplinterproof.walach().peridotite(), formularize(polderVar.marial())), polderVar.dern());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + yemeniteVarSplinterproof);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    public static hobby.polder taiyuan(grimness grimnessVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.KmsAeadKey", invest.yemenite.mathsort().molybdenite(invest.sealless.mathsort().molybdenite(grimnessVar.saneness().dern()).build()).build().toByteString(), KeyData.KeyMaterialType.REMOTE, apical(grimnessVar.saneness().wireman()), grimnessVar.attabal());
    }
}
