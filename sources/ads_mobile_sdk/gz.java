package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum gz implements salutatory {
    SAFE(0),
    DANGEROUS(1),
    UNCOMMON(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4),
    UNKNOWN(5),
    PLAY_POLICY_VIOLATION_SEVERE(6),
    PLAY_POLICY_VIOLATION_OTHER(7),
    DANGEROUS_ACCOUNT_COMPROMISE(8),
    PENDING(9),
    PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE(10),
    HIGH_RISK_BLOCK(11),
    HIGH_RISK_WARN(12),
    PROBABLY_BAD(13),
    VERIFIER_APP_VERIFICATION_FAILED(16),
    VERIFIER_APP_VERIFICATION_INCONCLUSIVE_SYSTEM_ERROR(18),
    VERIFIER_APP_VERIFICATION_INCONCLUSIVE_NETWORK_ERROR(19),
    VERDICT_UNSPECIFIED(15);

    public final int a;

    gz(int i) {
        this.a = i;
    }

    public static gz a(int i) {
        switch (i) {
            case 0:
                return SAFE;
            case 1:
                return DANGEROUS;
            case 2:
                return UNCOMMON;
            case 3:
                return POTENTIALLY_UNWANTED;
            case 4:
                return DANGEROUS_HOST;
            case 5:
                return UNKNOWN;
            case 6:
                return PLAY_POLICY_VIOLATION_SEVERE;
            case 7:
                return PLAY_POLICY_VIOLATION_OTHER;
            case 8:
                return DANGEROUS_ACCOUNT_COMPROMISE;
            case 9:
                return PENDING;
            case 10:
                return PLAY_POLICY_VIOLATION_TREATMENT_ON_DEVICE;
            case 11:
                return HIGH_RISK_BLOCK;
            case 12:
                return HIGH_RISK_WARN;
            case 13:
                return PROBABLY_BAD;
            case 14:
            case 17:
            default:
                return null;
            case 15:
                return VERDICT_UNSPECIFIED;
            case 16:
                return VERIFIER_APP_VERIFICATION_FAILED;
            case 18:
                return VERIFIER_APP_VERIFICATION_INCONCLUSIVE_SYSTEM_ERROR;
            case 19:
                return VERIFIER_APP_VERIFICATION_INCONCLUSIVE_NETWORK_ERROR;
        }
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(gz.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
