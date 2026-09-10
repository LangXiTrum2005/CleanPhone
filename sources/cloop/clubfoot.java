package cloop;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import curiousness.gusty;
import curiousness.underbelly;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: XChaCha20Poly1305ProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class clubfoot {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f15646attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f15647dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f15648marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<gusty, hobby.seminary> f15649saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<underbelly, hobby.polder> f15650wireman;

    /* JADX INFO: compiled from: XChaCha20Poly1305ProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15651attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15651attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15651attabal[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15651attabal[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15651attabal[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f15646attabal = attabalVarImpromptu;
        f15649saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: cloop.peridotite
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return clubfoot.cutely((gusty) molybdeniteVar);
            }
        }, gusty.class, hobby.seminary.class);
        f15647dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: cloop.mathsort
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return clubfoot.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f15650wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: cloop.splinterproof
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return clubfoot.taiyuan((underbelly) impromptuVar, rotumaVar);
            }
        }, underbelly.class, hobby.polder.class);
        f15648marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: cloop.overspeculate
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return clubfoot.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(gusty.attabal attabalVar) throws GeneralSecurityException {
        if (gusty.attabal.f24390attabal.equals(attabalVar)) {
            return OutputPrefixType.TINK;
        }
        if (gusty.attabal.f24392saneness.equals(attabalVar)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (gusty.attabal.f24391dern.equals(attabalVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + attabalVar);
    }

    public static gusty beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (!seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
        }
        try {
            if (invest.splinterproof.peridotite(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness()).walach() == 0) {
                return gusty.saneness(formularize(seminaryVar.wireman().splinterproof()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(gusty gustyVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").adultoid(invest.splinterproof.hydrovane().toByteString()).molybdenite(apical(gustyVar.dern())).build());
    }

    public static gusty.attabal formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f15651attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return gusty.attabal.f24390attabal;
        }
        if (i == 2 || i == 3) {
            return gusty.attabal.f24392saneness;
        }
        if (i == 4) {
            return gusty.attabal.f24391dern;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f15649saneness);
        sanenessVar.formularize(f15647dern);
        sanenessVar.apical(f15650wireman);
        sanenessVar.cutely(f15648marial);
    }

    public static underbelly marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            invest.mathsort mathsortVarSplinterproof = invest.mathsort.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (mathsortVarSplinterproof.peridotite() == 0) {
                return underbelly.wireman(formularize(polderVar.marial()), ebullioscopic.dern.attabal(mathsortVarSplinterproof.walach().toByteArray(), discernable.rotuma.saneness(rotumaVar)), polderVar.dern());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static hobby.polder taiyuan(underbelly underbellyVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", invest.mathsort.mathsort().molybdenite(ByteString.copyFrom(underbellyVar.marial().wireman(discernable.rotuma.saneness(rotumaVar)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, apical(underbellyVar.saneness().dern()), underbellyVar.attabal());
    }
}
