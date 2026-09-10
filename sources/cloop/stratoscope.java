package cloop;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ChaCha20Poly1305ProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f15702attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f15703dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f15704marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<curiousness.yemenite, hobby.seminary> f15705saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<curiousness.cuirassed, hobby.polder> f15706wireman;

    /* JADX INFO: compiled from: ChaCha20Poly1305ProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15707attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15707attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15707attabal[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15707attabal[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15707attabal[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f15702attabal = attabalVarImpromptu;
        f15705saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: cloop.rotuma
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return stratoscope.cutely((curiousness.yemenite) molybdeniteVar);
            }
        }, curiousness.yemenite.class, hobby.seminary.class);
        f15703dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: cloop.preprohormone
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return stratoscope.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f15706wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: cloop.cord
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return stratoscope.taiyuan((curiousness.cuirassed) impromptuVar, rotumaVar);
            }
        }, curiousness.cuirassed.class, hobby.polder.class);
        f15704marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: cloop.cuirassed
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return stratoscope.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(curiousness.yemenite.attabal attabalVar) throws GeneralSecurityException {
        if (curiousness.yemenite.attabal.f24493attabal.equals(attabalVar)) {
            return OutputPrefixType.TINK;
        }
        if (curiousness.yemenite.attabal.f24495saneness.equals(attabalVar)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (curiousness.yemenite.attabal.f24494dern.equals(attabalVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + attabalVar);
    }

    public static curiousness.yemenite beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                invest.monoploid.walach(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
                return curiousness.yemenite.saneness(formularize(seminaryVar.wireman().splinterproof()));
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(curiousness.yemenite yemeniteVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").adultoid(invest.monoploid.hydrovane().toByteString()).molybdenite(apical(yemeniteVar.dern())).build());
    }

    public static curiousness.yemenite.attabal formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f15707attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return curiousness.yemenite.attabal.f24493attabal;
        }
        if (i == 2 || i == 3) {
            return curiousness.yemenite.attabal.f24495saneness;
        }
        if (i == 4) {
            return curiousness.yemenite.attabal.f24494dern;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f15705saneness);
        sanenessVar.formularize(f15703dern);
        sanenessVar.apical(f15706wireman);
        sanenessVar.cutely(f15704marial);
    }

    public static curiousness.cuirassed marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            invest.arytenoidectomy arytenoidectomyVarSplinterproof = invest.arytenoidectomy.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (arytenoidectomyVarSplinterproof.peridotite() == 0) {
                return curiousness.cuirassed.wireman(formularize(polderVar.marial()), ebullioscopic.dern.attabal(arytenoidectomyVarSplinterproof.walach().toByteArray(), discernable.rotuma.saneness(rotumaVar)), polderVar.dern());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static hobby.polder taiyuan(curiousness.cuirassed cuirassedVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", invest.arytenoidectomy.mathsort().molybdenite(ByteString.copyFrom(cuirassedVar.marial().wireman(discernable.rotuma.saneness(rotumaVar)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, apical(cuirassedVar.saneness().dern()), cuirassedVar.attabal());
    }
}
