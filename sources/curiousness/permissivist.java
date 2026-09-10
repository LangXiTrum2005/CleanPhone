package curiousness;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyKmsEnvelopeAeadProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f24449attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f24450dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f24451marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<mathsort, hobby.seminary> f24452saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<peridotite, hobby.polder> f24453wireman;

    /* JADX INFO: compiled from: LegacyKmsEnvelopeAeadProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f24454attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f24454attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24454attabal[OutputPrefixType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f24449attabal = attabalVarImpromptu;
        f24452saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: curiousness.splinterproof
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return permissivist.apical((mathsort) molybdeniteVar);
            }
        }, mathsort.class, hobby.seminary.class);
        f24450dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: curiousness.overspeculate
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return permissivist.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f24453wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: curiousness.clubfoot
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return permissivist.cutely((peridotite) impromptuVar, rotumaVar);
            }
        }, peridotite.class, hobby.polder.class);
        f24451marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: curiousness.dent
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return permissivist.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static hobby.seminary apical(mathsort mathsortVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").adultoid(formularize(mathsortVar).toByteString()).molybdenite(impassible(mathsortVar.marial())).build());
    }

    public static mathsort beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return competently(invest.supplicat.clubfoot(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness()), seminaryVar.wireman().splinterproof());
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
    }

    public static mathsort competently(invest.supplicat supplicatVar, OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        mathsort.dern dernVar;
        discernable.molybdenite molybdeniteVarAttabal = discernable.cuirassed.attabal(invest.stratoscope.dent().graveside(supplicatVar.mathsort().overspeculate()).adultoid(supplicatVar.mathsort().clubfoot()).molybdenite(OutputPrefixType.RAW).build().competently());
        if (molybdeniteVarAttabal instanceof adultoid) {
            dernVar = mathsort.dern.f24424attabal;
        } else if (molybdeniteVarAttabal instanceof yemenite) {
            dernVar = mathsort.dern.f24426dern;
        } else if (molybdeniteVarAttabal instanceof gusty) {
            dernVar = mathsort.dern.f24428saneness;
        } else if (molybdeniteVarAttabal instanceof apical) {
            dernVar = mathsort.dern.f24429wireman;
        } else if (molybdeniteVarAttabal instanceof arytenoidectomy) {
            dernVar = mathsort.dern.f24427marial;
        } else {
            if (!(molybdeniteVarAttabal instanceof cord)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + molybdeniteVarAttabal);
            }
            dernVar = mathsort.dern.f24425beachfront;
        }
        return mathsort.saneness().beachfront(triweekly(outputPrefixType)).marial(supplicatVar.splinterproof()).dern((dern) molybdeniteVarAttabal).wireman(dernVar).attabal();
    }

    public static hobby.polder cutely(peridotite peridotiteVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", invest.kattegat.mathsort().molybdenite(formularize(peridotiteVar.saneness())).build().toByteString(), KeyData.KeyMaterialType.REMOTE, impassible(peridotiteVar.saneness().marial()), peridotiteVar.attabal());
    }

    public static invest.supplicat formularize(mathsort mathsortVar) throws GeneralSecurityException {
        try {
            return invest.supplicat.overspeculate().graveside(mathsortVar.wireman()).molybdenite(invest.stratoscope.cultivated(discernable.cuirassed.saneness(mathsortVar.dern()), com.google.crypto.tink.shaded.protobuf.kowloon.saneness())).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static OutputPrefixType impassible(mathsort.wireman wiremanVar) throws GeneralSecurityException {
        if (mathsort.wireman.f24434attabal.equals(wiremanVar)) {
            return OutputPrefixType.TINK;
        }
        if (mathsort.wireman.f24435saneness.equals(wiremanVar)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + wiremanVar);
    }

    public static void impromptu() throws GeneralSecurityException {
        taiyuan(com.google.crypto.tink.internal.saneness.dern());
    }

    public static peridotite marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            invest.kattegat kattegatVarSplinterproof = invest.kattegat.splinterproof(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (kattegatVarSplinterproof.peridotite() == 0) {
                return peridotite.wireman(competently(kattegatVarSplinterproof.walach(), polderVar.marial()), polderVar.dern());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + kattegatVarSplinterproof);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static void taiyuan(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f24452saneness);
        sanenessVar.formularize(f24450dern);
        sanenessVar.apical(f24453wireman);
        sanenessVar.cutely(f24451marial);
    }

    public static mathsort.wireman triweekly(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f24454attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return mathsort.wireman.f24434attabal;
        }
        if (i == 2) {
            return mathsort.wireman.f24435saneness;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
