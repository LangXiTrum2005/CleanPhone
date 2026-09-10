package hobby;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyProtoKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy extends discernable.impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final polder f27734attabal;

    /* JADX INFO: compiled from: LegacyProtoKey.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f27735attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f27736saneness;

        static {
            int[] iArr = new int[KeyData.KeyMaterialType.values().length];
            f27736saneness = iArr;
            try {
                iArr[KeyData.KeyMaterialType.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27736saneness[KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            f27735attabal = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27735attabal[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27735attabal[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27735attabal[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: LegacyProtoKey.java */
    public static class saneness extends discernable.molybdenite {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f27737attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final OutputPrefixType f27738saneness;

        public /* synthetic */ saneness(String str, OutputPrefixType outputPrefixType, attabal attabalVar) {
            this(str, outputPrefixType);
        }

        public static String saneness(OutputPrefixType outputPrefixType) {
            int i = attabal.f27735attabal[outputPrefixType.ordinal()];
            if (i == 1) {
                return "TINK";
            }
            if (i == 2) {
                return "LEGACY";
            }
            if (i != 3) {
                return i != 4 ? "UNKNOWN" : "CRUNCHY";
            }
            return "RAW";
        }

        @Override // discernable.molybdenite
        public boolean attabal() {
            return this.f27738saneness != OutputPrefixType.RAW;
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f27737attabal, saneness(this.f27738saneness));
        }

        public saneness(String str, OutputPrefixType outputPrefixType) {
            this.f27737attabal = str;
            this.f27738saneness = outputPrefixType;
        }
    }

    public arytenoidectomy(polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        beachfront(polderVar, rotumaVar);
        this.f27734attabal = polderVar;
    }

    public static void beachfront(polder polderVar, @Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        int i = attabal.f27736saneness[polderVar.wireman().ordinal()];
        if (i == 1 || i == 2) {
            discernable.rotuma.saneness(rotumaVar);
        }
    }

    public static ebullioscopic.attabal dern(polder polderVar) throws GeneralSecurityException {
        if (polderVar.marial().equals(OutputPrefixType.RAW)) {
            return ebullioscopic.attabal.attabal(new byte[0]);
        }
        if (polderVar.marial().equals(OutputPrefixType.TINK)) {
            return trm.saneness(polderVar.dern().intValue());
        }
        if (polderVar.marial().equals(OutputPrefixType.LEGACY) || polderVar.marial().equals(OutputPrefixType.CRUNCHY)) {
            return trm.attabal(polderVar.dern().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f27734attabal.dern();
    }

    public polder marial(@Nullable discernable.rotuma rotumaVar) throws GeneralSecurityException {
        beachfront(this.f27734attabal, rotumaVar);
        return this.f27734attabal;
    }

    @Override // discernable.impromptu
    public discernable.molybdenite saneness() {
        return new saneness(this.f27734attabal.beachfront(), this.f27734attabal.marial(), null);
    }

    public ebullioscopic.attabal wireman() throws GeneralSecurityException {
        return dern(this.f27734attabal);
    }
}
