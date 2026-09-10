package cloop;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import curiousness.sayid;
import curiousness.sensatory;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: XAesGcmProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f15674attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f15675dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f15676marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final hobby.yemenite<sensatory, hobby.seminary> f15677saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<sayid, hobby.polder> f15678wireman;

    /* JADX INFO: compiled from: XAesGcmProtoSerialization.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f15679attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f15679attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15679attabal[OutputPrefixType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ebullioscopic.attabal attabalVarImpromptu = hobby.creditor.impromptu("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f15674attabal = attabalVarImpromptu;
        f15677saneness = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: cloop.saran
            @Override // hobby.yemenite.saneness
            public final hobby.privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return hydrovane.cutely((sensatory) molybdeniteVar);
            }
        }, sensatory.class, hobby.seminary.class);
        f15675dern = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: cloop.privatdozent
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(hobby.privatdozent privatdozentVar) {
                return hydrovane.beachfront((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f15678wireman = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: cloop.creditor
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final hobby.privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return hydrovane.taiyuan((sayid) impromptuVar, rotumaVar);
            }
        }, sayid.class, hobby.polder.class);
        f15676marial = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: cloop.starveling
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(hobby.privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return hydrovane.marial((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
    }

    public static OutputPrefixType apical(sensatory.attabal attabalVar) throws GeneralSecurityException {
        if (Objects.equals(attabalVar, sensatory.attabal.f24477attabal)) {
            return OutputPrefixType.TINK;
        }
        if (Objects.equals(attabalVar, sensatory.attabal.f24478saneness)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + attabalVar);
    }

    public static sensatory beachfront(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (!seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
        }
        try {
            invest.walach walachVarSplinterproof = invest.walach.splinterproof(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (walachVarSplinterproof.peridotite() == 0) {
                return sensatory.saneness(formularize(seminaryVar.wireman().splinterproof()), walachVarSplinterproof.walach().peridotite());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    public static void competently() throws GeneralSecurityException {
        impromptu(com.google.crypto.tink.internal.saneness.dern());
    }

    public static hobby.seminary cutely(sensatory sensatoryVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.XAesGcmKey").adultoid(invest.walach.mathsort().molybdenite(invest.peridotite.mathsort().molybdenite(sensatoryVar.dern()).build()).build().toByteString()).molybdenite(apical(sensatoryVar.wireman())).build());
    }

    public static sensatory.attabal formularize(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = attabal.f15679attabal[outputPrefixType.ordinal()];
        if (i == 1) {
            return sensatory.attabal.f24477attabal;
        }
        if (i == 2) {
            return sensatory.attabal.f24478saneness;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void impromptu(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f15677saneness);
        sanenessVar.formularize(f15675dern);
        sanenessVar.apical(f15678wireman);
        sanenessVar.cutely(f15676marial);
    }

    public static sayid marial(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            invest.hydrovane hydrovaneVarClubfoot = invest.hydrovane.clubfoot(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (hydrovaneVarClubfoot.splinterproof() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (hydrovaneVarClubfoot.peridotite().size() == 32) {
                return sayid.wireman(sensatory.saneness(formularize(polderVar.marial()), hydrovaneVarClubfoot.mathsort().peridotite()), ebullioscopic.dern.attabal(hydrovaneVarClubfoot.peridotite().toByteArray(), discernable.rotuma.saneness(rotumaVar)), polderVar.dern());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static hobby.polder taiyuan(sayid sayidVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.XAesGcmKey", invest.hydrovane.overspeculate().molybdenite(ByteString.copyFrom(sayidVar.marial().wireman(discernable.rotuma.saneness(rotumaVar)))).graveside(invest.peridotite.mathsort().molybdenite(sayidVar.saneness().dern()).build()).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, apical(sayidVar.saneness().wireman()), sayidVar.attabal());
    }
}
