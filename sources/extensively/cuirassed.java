package extensively;

import astronautic.grimness;
import astronautic.saran;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import hobby.creditor;
import hobby.privatdozent;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1ProtoSerialization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ebullioscopic.attabal f26154attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f26155beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<grimness, hobby.polder> f26156competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final hobby.impromptu<HashType, astronautic.seminary.dern> f26157cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final hobby.yemenite<astronautic.seminary, hobby.seminary> f26158dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final hobby.impassible<hobby.polder> f26159impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.attabal<saran, hobby.polder> f26160marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ebullioscopic.attabal f26161saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final hobby.impromptu<OutputPrefixType, astronautic.seminary.wireman> f26162taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hobby.oilcan<hobby.seminary> f26163wireman;

    static {
        ebullioscopic.attabal attabalVarImpromptu = creditor.impromptu("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f26154attabal = attabalVarImpromptu;
        ebullioscopic.attabal attabalVarImpromptu2 = creditor.impromptu("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f26161saneness = attabalVarImpromptu2;
        f26158dern = hobby.yemenite.attabal(new hobby.yemenite.saneness() { // from class: extensively.adultoid
            @Override // hobby.yemenite.saneness
            public final privatdozent attabal(discernable.molybdenite molybdeniteVar) {
                return cuirassed.polloi((astronautic.seminary) molybdeniteVar);
            }
        }, astronautic.seminary.class, hobby.seminary.class);
        f26163wireman = hobby.oilcan.attabal(new hobby.oilcan.saneness() { // from class: extensively.dovishness
            @Override // hobby.oilcan.saneness
            public final discernable.molybdenite attabal(privatdozent privatdozentVar) {
                return cuirassed.impassible((hobby.seminary) privatdozentVar);
            }
        }, attabalVarImpromptu, hobby.seminary.class);
        f26160marial = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: extensively.gintrap
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return cuirassed.graveside((saran) impromptuVar, rotumaVar);
            }
        }, saran.class, hobby.polder.class);
        f26155beachfront = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: extensively.rotuma
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return cuirassed.kowloon((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu2, hobby.polder.class);
        f26156competently = com.google.crypto.tink.internal.attabal.attabal(new com.google.crypto.tink.internal.attabal.saneness() { // from class: extensively.preprohormone
            @Override // com.google.crypto.tink.internal.attabal.saneness
            public final privatdozent attabal(discernable.impromptu impromptuVar, discernable.rotuma rotumaVar) {
                return cuirassed.molybdenite((grimness) impromptuVar, rotumaVar);
            }
        }, grimness.class, hobby.polder.class);
        f26159impromptu = hobby.impassible.attabal(new hobby.impassible.saneness() { // from class: extensively.cord
            @Override // hobby.impassible.saneness
            public final discernable.impromptu attabal(privatdozent privatdozentVar, discernable.rotuma rotumaVar) {
                return cuirassed.triweekly((hobby.polder) privatdozentVar, rotumaVar);
            }
        }, attabalVarImpromptu, hobby.polder.class);
        f26162taiyuan = hobby.impromptu.attabal().attabal(OutputPrefixType.RAW, astronautic.seminary.wireman.f14716wireman).attabal(OutputPrefixType.TINK, astronautic.seminary.wireman.f14713attabal).attabal(OutputPrefixType.CRUNCHY, astronautic.seminary.wireman.f14715saneness).attabal(OutputPrefixType.LEGACY, astronautic.seminary.wireman.f14714dern).saneness();
        f26157cutely = hobby.impromptu.attabal().attabal(HashType.SHA256, astronautic.seminary.dern.f14704attabal).attabal(HashType.SHA384, astronautic.seminary.dern.f14706saneness).attabal(HashType.SHA512, astronautic.seminary.dern.f14705dern).saneness();
    }

    public static invest.polder apical(astronautic.seminary seminaryVar) throws GeneralSecurityException {
        return invest.polder.mathsort().molybdenite((HashType) f26157cutely.dern(seminaryVar.dern())).build();
    }

    public static void arytenoidectomy() throws GeneralSecurityException {
        monoploid(com.google.crypto.tink.internal.saneness.dern());
    }

    public static BigInteger competently(ByteString byteString) {
        return hobby.attabal.attabal(byteString.toByteArray());
    }

    public static ByteString cutely(ebullioscopic.saneness sanenessVar, discernable.rotuma rotumaVar) {
        return taiyuan(sanenessVar.saneness(rotumaVar));
    }

    public static invest.grimness formularize(saran saranVar) throws GeneralSecurityException {
        return invest.grimness.permissivist().adultoid(apical(saranVar.saneness())).graveside(taiyuan(saranVar.marial())).molybdenite(taiyuan(saranVar.saneness().marial())).build();
    }

    public static hobby.polder graveside(saran saranVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", formularize(saranVar).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, (OutputPrefixType) f26162taiyuan.dern(saranVar.saneness().beachfront()), saranVar.attabal());
    }

    public static astronautic.seminary impassible(hobby.seminary seminaryVar) throws GeneralSecurityException {
        if (seminaryVar.wireman().overspeculate().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                invest.merc mercVarDent = invest.merc.dent(seminaryVar.wireman().clubfoot(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
                return astronautic.seminary.saneness().saneness(f26157cutely.saneness(mercVarDent.splinterproof().peridotite())).wireman(competently(mercVarDent.overspeculate())).dern(mercVarDent.mathsort()).marial(f26162taiyuan.saneness(seminaryVar.wireman().splinterproof())).attabal();
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + seminaryVar.wireman().overspeculate());
    }

    public static ebullioscopic.saneness impromptu(ByteString byteString, discernable.rotuma rotumaVar) {
        return ebullioscopic.saneness.attabal(hobby.attabal.attabal(byteString.toByteArray()), rotumaVar);
    }

    public static saran kowloon(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + polderVar.beachfront());
        }
        try {
            invest.grimness grimnessVarCultivated = invest.grimness.cultivated(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (grimnessVarCultivated.dent() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerCompetently = competently(grimnessVarCultivated.overspeculate());
            return saran.wireman().marial(astronautic.seminary.saneness().saneness(f26157cutely.saneness(grimnessVarCultivated.clubfoot().peridotite())).wireman(competently(grimnessVarCultivated.splinterproof())).dern(bigIntegerCompetently.bitLength()).marial(f26162taiyuan.saneness(polderVar.marial())).attabal()).wireman(bigIntegerCompetently).dern(polderVar.dern()).attabal();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static hobby.polder molybdenite(grimness grimnessVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        discernable.rotuma rotumaVarSaneness = discernable.rotuma.saneness(rotumaVar);
        return hobby.polder.saneness("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", invest.seminary.nosophobia().cord(0).rotuma(formularize(grimnessVar.wireman())).graveside(cutely(grimnessVar.formularize(), rotumaVarSaneness)).gintrap(cutely(grimnessVar.cutely(), rotumaVarSaneness)).preprohormone(cutely(grimnessVar.apical(), rotumaVarSaneness)).adultoid(cutely(grimnessVar.impromptu(), rotumaVarSaneness)).dovishness(cutely(grimnessVar.taiyuan(), rotumaVarSaneness)).molybdenite(cutely(grimnessVar.beachfront(), rotumaVarSaneness)).build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, (OutputPrefixType) f26162taiyuan.dern(grimnessVar.saneness().beachfront()), grimnessVar.attabal());
    }

    public static void monoploid(com.google.crypto.tink.internal.saneness sanenessVar) throws GeneralSecurityException {
        sanenessVar.impassible(f26158dern);
        sanenessVar.formularize(f26163wireman);
        sanenessVar.apical(f26160marial);
        sanenessVar.cutely(f26155beachfront);
        sanenessVar.apical(f26156competently);
        sanenessVar.cutely(f26159impromptu);
    }

    public static hobby.seminary polloi(astronautic.seminary seminaryVar) throws GeneralSecurityException {
        return hobby.seminary.dern(invest.stratoscope.dent().graveside("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").adultoid(invest.merc.clubfoot().graveside(apical(seminaryVar)).molybdenite(seminaryVar.wireman()).adultoid(taiyuan(seminaryVar.marial())).build().toByteString()).molybdenite((OutputPrefixType) f26162taiyuan.dern(seminaryVar.beachfront())).build());
    }

    public static ByteString taiyuan(BigInteger bigInteger) {
        return ByteString.copyFrom(hobby.attabal.saneness(bigInteger));
    }

    public static grimness triweekly(hobby.polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        if (!polderVar.beachfront().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + polderVar.beachfront());
        }
        try {
            invest.seminary seminaryVarLotta = invest.seminary.lotta(polderVar.competently(), com.google.crypto.tink.shaded.protobuf.kowloon.saneness());
            if (seminaryVarLotta.coffeecake() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            invest.grimness grimnessVarTreadless = seminaryVarLotta.treadless();
            if (grimnessVarTreadless.dent() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerCompetently = competently(grimnessVarTreadless.overspeculate());
            saran saranVarAttabal = saran.wireman().marial(astronautic.seminary.saneness().saneness(f26157cutely.saneness(grimnessVarTreadless.clubfoot().peridotite())).wireman(competently(grimnessVarTreadless.splinterproof())).dern(bigIntegerCompetently.bitLength()).marial(f26162taiyuan.saneness(polderVar.marial())).attabal()).wireman(bigIntegerCompetently).dern(polderVar.dern()).attabal();
            discernable.rotuma rotumaVarSaneness = discernable.rotuma.saneness(rotumaVar);
            return grimness.marial().beachfront(saranVarAttabal).wireman(impromptu(seminaryVarLotta.milliradian(), rotumaVarSaneness), impromptu(seminaryVarLotta.itchy(), rotumaVarSaneness)).marial(impromptu(seminaryVarLotta.cultivated(), rotumaVarSaneness)).dern(impromptu(seminaryVarLotta.premeiotic(), rotumaVarSaneness), impromptu(seminaryVarLotta.timberyard(), rotumaVarSaneness)).saneness(impromptu(seminaryVarLotta.permissivist(), rotumaVarSaneness)).attabal();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }
}
