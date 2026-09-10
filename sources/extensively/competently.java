package extensively;

import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import hobby.creditor;
import hobby.privatdozent;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: EcdsaProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f26142attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f26143beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<astronautic.saneness, hobby.polder> f26144competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.yemenite<astronautic.attabal, hobby.seminary> f26145dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f26146impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<astronautic.dern, hobby.polder> f26147marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ebullioscopic.attabal f26148saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f26149wireman;

    /* JADX INFO: compiled from: EcdsaProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f26150attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f26151dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f26152saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final /* synthetic */ int[] f26153wireman;

        static {
            int[] iArr = new int[EcdsaSignatureEncoding.values().length];
            f26153wireman = iArr;
            try {
                iArr[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26153wireman[EcdsaSignatureEncoding.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            f26151dern = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26151dern[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26151dern[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[OutputPrefixType.values().length];
            f26152saneness = iArr3;
            try {
                iArr3[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26152saneness[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26152saneness[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26152saneness[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[HashType.values().length];
            f26150attabal = iArr4;
            try {
                iArr4[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26150attabal[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26150attabal[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = creditor.impromptu("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f26142attabal = attabalVarImpromptu;
        ebullioscopic.attabal attabalVarImpromptu2 = creditor.impromptu("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f26148saneness = attabalVarImpromptu2;
        f26145dern = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: extensively.attabal
            @Override // hobby.yemenite.saneness
            public final privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return competently.kowloon((astronautic.attabal) molybdeniteVar);
            }
        }, astronautic.attabal.class, hobby.seminary.class);
        f26149wireman = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: extensively.saneness
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(privatdozent privatdozentVar) {
                return competently.cutely((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f26147marial = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: extensively.dern
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return competently.monoploid((astronautic.dern) impromptuVar, rotumaVar);
            }
        }, astronautic.dern.class, hobby.polder.class);
        f26143beachfront = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: extensively.wireman
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return competently.formularize((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu2, hobby.polder.class);
        f26144competently = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: extensively.marial
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return competently.arytenoidectomy((astronautic.saneness) impromptuVar, rotumaVar);
            }
        }, astronautic.saneness.class, hobby.polder.class);
        f26146impromptu = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: extensively.beachfront
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return competently.apical((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static HashType adultoid(astronautic.attabal.wireman wiremanVar) throws GeneralSecurityException {
        if (astronautic.attabal.wireman.f14560attabal.equals(wiremanVar)) {
            return HashType.SHA256;
        }
        if (astronautic.attabal.wireman.f14562saneness.equals(wiremanVar)) {
            return HashType.SHA384;
        }
        if (astronautic.attabal.wireman.f14561dern.equals(wiremanVar)) {
            return HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + wiremanVar);
    }

    public static astronautic.saneness apical(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + polderVar.beachfront());
        }
        try {
            invest.graveside gravesideVarClubfoot = invest.graveside.clubfoot(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (gravesideVarClubfoot.splinterproof() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            invest.adultoid adultoidVarMathsort = gravesideVarClubfoot.mathsort();
            if (adultoidVarMathsort.overspeculate() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return astronautic.saneness.marial().dern(astronautic.dern.wireman().wireman(astronautic.attabal.saneness().dern(molybdenite(adultoidVarMathsort.splinterproof().clubfoot())).wireman(rotuma(adultoidVarMathsort.splinterproof().overspeculate())).saneness(polloi(adultoidVarMathsort.splinterproof().mathsort())).marial(preprohormone(polderVar.marial())).attabal()).marial(new ECPoint(hobby.attabal.attabal(adultoidVarMathsort.clubfoot().toByteArray()), hobby.attabal.attabal(adultoidVarMathsort.dent().toByteArray()))).dern(polderVar.dern()).attabal()).saneness(ebullioscopic.saneness.attabal(hobby.attabal.attabal(gravesideVarClubfoot.peridotite().toByteArray()), discernable.rotuma.saneness(rotumaVar))).attabal();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static hobby.polder arytenoidectomy(astronautic.saneness sanenessVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", invest.graveside.overspeculate().graveside(taiyuan(sanenessVar.wireman())).molybdenite(ByteString.copyFrom(hobby.attabal.dern(sanenessVar.competently().saneness(discernable.rotuma.saneness(rotumaVar)), competently(sanenessVar.saneness().dern())))).build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, dovishness(sanenessVar.saneness().beachfront()), sanenessVar.attabal());
    }

    public static int competently(astronautic.attabal.dern dernVar) throws GeneralSecurityException {
        if (astronautic.attabal.dern.f14551saneness.equals(dernVar)) {
            return 33;
        }
        if (astronautic.attabal.dern.f14550dern.equals(dernVar)) {
            return 49;
        }
        if (astronautic.attabal.dern.f14552wireman.equals(dernVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + dernVar);
    }

    public static astronautic.attabal cutely(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                invest.polloi polloiVarMathsort = invest.polloi.mathsort(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
                return astronautic.attabal.saneness().dern(molybdenite(polloiVarMathsort.walach().clubfoot())).wireman(rotuma(polloiVarMathsort.walach().overspeculate())).saneness(polloi(polloiVarMathsort.walach().mathsort())).marial(preprohormone(seminaryVar.wireman().splinterproof())).attabal();
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
    }

    public static OutputPrefixType dovishness(astronautic.attabal.beachfront beachfrontVar) throws GeneralSecurityException {
        if (astronautic.attabal.beachfront.f14546attabal.equals(beachfrontVar)) {
            return OutputPrefixType.TINK;
        }
        if (astronautic.attabal.beachfront.f14548saneness.equals(beachfrontVar)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (astronautic.attabal.beachfront.f14549wireman.equals(beachfrontVar)) {
            return OutputPrefixType.RAW;
        }
        if (astronautic.attabal.beachfront.f14547dern.equals(beachfrontVar)) {
            return OutputPrefixType.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + beachfrontVar);
    }

    public static astronautic.dern formularize(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + polderVar.beachfront());
        }
        try {
            invest.adultoid adultoidVarCultivated = invest.adultoid.cultivated(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (adultoidVarCultivated.overspeculate() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return astronautic.dern.wireman().wireman(astronautic.attabal.saneness().dern(molybdenite(adultoidVarCultivated.splinterproof().clubfoot())).wireman(rotuma(adultoidVarCultivated.splinterproof().overspeculate())).saneness(polloi(adultoidVarCultivated.splinterproof().mathsort())).marial(preprohormone(polderVar.marial())).attabal()).marial(new ECPoint(hobby.attabal.attabal(adultoidVarCultivated.clubfoot().toByteArray()), hobby.attabal.attabal(adultoidVarCultivated.dent().toByteArray()))).dern(polderVar.dern()).attabal();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static EcdsaSignatureEncoding gintrap(astronautic.attabal.marial marialVar) throws GeneralSecurityException {
        if (astronautic.attabal.marial.f14554attabal.equals(marialVar)) {
            return EcdsaSignatureEncoding.IEEE_P1363;
        }
        if (astronautic.attabal.marial.f14555saneness.equals(marialVar)) {
            return EcdsaSignatureEncoding.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + marialVar);
    }

    public static EllipticCurveType graveside(astronautic.attabal.dern dernVar) throws GeneralSecurityException {
        if (astronautic.attabal.dern.f14551saneness.equals(dernVar)) {
            return EllipticCurveType.NIST_P256;
        }
        if (astronautic.attabal.dern.f14550dern.equals(dernVar)) {
            return EllipticCurveType.NIST_P384;
        }
        if (astronautic.attabal.dern.f14552wireman.equals(dernVar)) {
            return EllipticCurveType.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + dernVar);
    }

    public static void impassible() throws GeneralSecurityException {
        triweekly(com.google.crypto.tink.internal.saneness.dern());
    }

    public static invest.molybdenite impromptu(astronautic.attabal attabalVar) throws GeneralSecurityException {
        return invest.molybdenite.dent().adultoid(adultoid(attabalVar.wireman())).molybdenite(graveside(attabalVar.dern())).graveside(gintrap(attabalVar.marial())).build();
    }

    public static hobby.seminary kowloon(astronautic.attabal attabalVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").adultoid(invest.polloi.peridotite().molybdenite(impromptu(attabalVar)).build().toByteString()).molybdenite(dovishness(attabalVar.beachfront())).build());
    }

    public static astronautic.attabal.wireman molybdenite(HashType hashType) throws GeneralSecurityException {
        int i = attabal.f26150attabal[hashType.ordinal()];
        if (i == 1) {
            return astronautic.attabal.wireman.f14560attabal;
        }
        if (i == 2) {
            return astronautic.attabal.wireman.f14562saneness;
        }
        if (i == 3) {
            return astronautic.attabal.wireman.f14561dern;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    public static hobby.polder monoploid(astronautic.dern dernVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", taiyuan(dernVar).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, dovishness(dernVar.saneness().beachfront()), dernVar.attabal());
    }

    public static astronautic.attabal.dern polloi(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int i = attabal.f26151dern[ellipticCurveType.ordinal()];
        if (i == 1) {
            return astronautic.attabal.dern.f14551saneness;
        }
        if (i == 2) {
            return astronautic.attabal.dern.f14550dern;
        }
        if (i == 3) {
            return astronautic.attabal.dern.f14552wireman;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + ellipticCurveType.getNumber());
    }

    public static astronautic.attabal.beachfront preprohormone(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f26152saneness[outputPrefixType.ordinal()];
        if (i == 1) {
            return astronautic.attabal.beachfront.f14546attabal;
        }
        if (i == 2) {
            return astronautic.attabal.beachfront.f14548saneness;
        }
        if (i == 3) {
            return astronautic.attabal.beachfront.f14547dern;
        }
        if (i == 4) {
            return astronautic.attabal.beachfront.f14549wireman;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static astronautic.attabal.marial rotuma(EcdsaSignatureEncoding ecdsaSignatureEncoding) throws GeneralSecurityException {
        int i = attabal.f26153wireman[ecdsaSignatureEncoding.ordinal()];
        if (i == 1) {
            return astronautic.attabal.marial.f14554attabal;
        }
        if (i == 2) {
            return astronautic.attabal.marial.f14555saneness;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + ecdsaSignatureEncoding.getNumber());
    }

    public static invest.adultoid taiyuan(astronautic.dern dernVar) throws GeneralSecurityException {
        int iCompetently = competently(dernVar.saneness().dern());
        ECPoint eCPointBeachfront = dernVar.beachfront();
        return invest.adultoid.permissivist().molybdenite(impromptu(dernVar.saneness())).graveside(ByteString.copyFrom(hobby.attabal.dern(eCPointBeachfront.getAffineX(), iCompetently))).adultoid(ByteString.copyFrom(hobby.attabal.dern(eCPointBeachfront.getAffineY(), iCompetently))).build();
    }

    public static void triweekly(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f26145dern);
        sanenessVar.formularize(f26149wireman);
        sanenessVar.apical(f26147marial);
        sanenessVar.cutely(f26143beachfront);
        sanenessVar.apical(f26144competently);
        sanenessVar.cutely(f26146impromptu);
    }
}
