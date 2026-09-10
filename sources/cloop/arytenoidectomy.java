package cloop;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f15640attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f15641dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f15642marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<curiousness.adultoid, hobby.seminary> f15643saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<curiousness.monoploid, hobby.polder> f15644wireman;

    /* JADX INFO: compiled from: AesGcmProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15645attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15645attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15645attabal[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15645attabal[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15645attabal[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f15640attabal = attabalVarImpromptu;
        f15643saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: cloop.formularize
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return arytenoidectomy.cutely((curiousness.adultoid) molybdeniteVar);
            }
        }, curiousness.adultoid.class, hobby.seminary.class);
        f15641dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: cloop.impassible
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return arytenoidectomy.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f15644wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: cloop.triweekly
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return arytenoidectomy.taiyuan((curiousness.monoploid) impromptuVar, rotumaVar);
            }
        }, curiousness.monoploid.class, hobby.polder.class);
        f15642marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: cloop.kowloon
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return arytenoidectomy.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(curiousness.adultoid.dern dernVar) throws GeneralSecurityException {
        if (curiousness.adultoid.dern.f24291attabal.equals(dernVar)) {
            return OutputPrefixType.TINK;
        }
        if (curiousness.adultoid.dern.f24293saneness.equals(dernVar)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (curiousness.adultoid.dern.f24292dern.equals(dernVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dernVar);
    }

    public static curiousness.adultoid beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (!seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
        }
        try {
            invest.impassible impassibleVarSplinterproof = invest.impassible.splinterproof(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (impassibleVarSplinterproof.peridotite() == 0) {
                return curiousness.adultoid.saneness().dern(impassibleVarSplinterproof.walach()).saneness(12).wireman(16).marial(formularize(seminaryVar.wireman().splinterproof())).attabal();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(curiousness.adultoid adultoidVar) throws GeneralSecurityException {
        impassible(adultoidVar);
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.AesGcmKey").adultoid(invest.impassible.mathsort().molybdenite(adultoidVar.wireman()).build().toByteString()).molybdenite(apical(adultoidVar.beachfront())).build());
    }

    public static curiousness.adultoid.dern formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f15645attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return curiousness.adultoid.dern.f24291attabal;
        }
        if (i == 2 || i == 3) {
            return curiousness.adultoid.dern.f24293saneness;
        }
        if (i == 4) {
            return curiousness.adultoid.dern.f24292dern;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impassible(curiousness.adultoid adultoidVar) throws GeneralSecurityException {
        if (adultoidVar.marial() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(adultoidVar.marial())));
        }
        if (adultoidVar.dern() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(adultoidVar.dern())));
        }
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f15643saneness);
        sanenessVar.formularize(f15641dern);
        sanenessVar.apical(f15644wireman);
        sanenessVar.cutely(f15642marial);
    }

    public static curiousness.monoploid marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            invest.formularize formularizeVarSplinterproof = invest.formularize.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (formularizeVarSplinterproof.peridotite() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return curiousness.monoploid.wireman().marial(curiousness.adultoid.saneness().dern(formularizeVarSplinterproof.walach().size()).saneness(12).wireman(16).marial(formularize(polderVar.marial())).attabal()).wireman(ebullioscopic.dern.attabal(formularizeVarSplinterproof.walach().toByteArray(), discernable.rotuma.saneness(rotumaVar))).dern(polderVar.dern()).attabal();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static hobby.polder taiyuan(curiousness.monoploid monoploidVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        impassible(monoploidVar.saneness());
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.AesGcmKey", invest.formularize.mathsort().molybdenite(ByteString.copyFrom(monoploidVar.marial().wireman(discernable.rotuma.saneness(rotumaVar)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, apical(monoploidVar.saneness().beachfront()), monoploidVar.attabal());
    }
}
