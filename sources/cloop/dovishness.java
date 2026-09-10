package cloop;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmSivProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f15658attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f15659dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f15660marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<curiousness.cord, hobby.seminary> f15661saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<curiousness.dovishness, hobby.polder> f15662wireman;

    /* JADX INFO: compiled from: AesGcmSivProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15663attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15663attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15663attabal[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15663attabal[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15663attabal[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f15658attabal = attabalVarImpromptu;
        f15661saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: cloop.polloi
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return dovishness.cutely((curiousness.cord) molybdeniteVar);
            }
        }, curiousness.cord.class, hobby.seminary.class);
        f15659dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: cloop.molybdenite
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return dovishness.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f15662wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: cloop.graveside
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return dovishness.taiyuan((curiousness.dovishness) impromptuVar, rotumaVar);
            }
        }, curiousness.dovishness.class, hobby.polder.class);
        f15660marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: cloop.adultoid
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return dovishness.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(curiousness.cord.dern dernVar) throws GeneralSecurityException {
        if (curiousness.cord.dern.f24351attabal.equals(dernVar)) {
            return OutputPrefixType.TINK;
        }
        if (curiousness.cord.dern.f24353saneness.equals(dernVar)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (curiousness.cord.dern.f24352dern.equals(dernVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dernVar);
    }

    public static curiousness.cord beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (!seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
        }
        try {
            invest.kowloon kowloonVarSplinterproof = invest.kowloon.splinterproof(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (kowloonVarSplinterproof.peridotite() == 0) {
                return curiousness.cord.saneness().saneness(kowloonVarSplinterproof.walach()).dern(formularize(seminaryVar.wireman().splinterproof())).attabal();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(curiousness.cord cordVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.AesGcmSivKey").adultoid(invest.kowloon.mathsort().molybdenite(cordVar.dern()).build().toByteString()).molybdenite(apical(cordVar.wireman())).build());
    }

    public static curiousness.cord.dern formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f15663attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return curiousness.cord.dern.f24351attabal;
        }
        if (i == 2 || i == 3) {
            return curiousness.cord.dern.f24353saneness;
        }
        if (i == 4) {
            return curiousness.cord.dern.f24352dern;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f15661saneness);
        sanenessVar.formularize(f15659dern);
        sanenessVar.apical(f15662wireman);
        sanenessVar.cutely(f15660marial);
    }

    public static curiousness.dovishness marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            invest.triweekly triweeklyVarSplinterproof = invest.triweekly.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (triweeklyVarSplinterproof.peridotite() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return curiousness.dovishness.wireman().marial(curiousness.cord.saneness().saneness(triweeklyVarSplinterproof.walach().size()).dern(formularize(polderVar.marial())).attabal()).wireman(ebullioscopic.dern.attabal(triweeklyVarSplinterproof.walach().toByteArray(), discernable.rotuma.saneness(rotumaVar))).dern(polderVar.dern()).attabal();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static hobby.polder taiyuan(curiousness.dovishness dovishnessVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.AesGcmSivKey", invest.triweekly.mathsort().molybdenite(ByteString.copyFrom(dovishnessVar.marial().wireman(discernable.rotuma.saneness(rotumaVar)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, apical(dovishnessVar.saneness().wireman()), dovishnessVar.attabal());
    }
}
