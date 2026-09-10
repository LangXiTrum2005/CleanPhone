package hobby;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Objects;

/* JADX INFO: compiled from: LegacyProtoParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends discernable.molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final seminary f27804attabal;

    /* JADX INFO: compiled from: LegacyProtoParameters.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f27805attabal;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f27805attabal = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27805attabal[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27805attabal[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27805attabal[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public monoploid(seminary seminaryVar) {
        this.f27804attabal = seminaryVar;
    }

    private static String dern(OutputPrefixType outputPrefixType) {
        int i = attabal.f27805attabal[outputPrefixType.ordinal()];
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
        return this.f27804attabal.wireman().splinterproof() != OutputPrefixType.RAW;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof monoploid)) {
            return false;
        }
        seminary seminaryVar = ((monoploid) obj).f27804attabal;
        return this.f27804attabal.wireman().splinterproof().equals(seminaryVar.wireman().splinterproof()) && this.f27804attabal.wireman().overspeculate().equals(seminaryVar.wireman().overspeculate()) && this.f27804attabal.wireman().clubfoot().equals(seminaryVar.wireman().clubfoot());
    }

    public int hashCode() {
        return Objects.hash(this.f27804attabal.wireman(), this.f27804attabal.attabal());
    }

    public seminary saneness() {
        return this.f27804attabal;
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f27804attabal.wireman().overspeculate(), dern(this.f27804attabal.wireman().splinterproof()));
    }
}
