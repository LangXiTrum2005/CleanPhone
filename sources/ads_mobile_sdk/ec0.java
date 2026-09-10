package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum ec0 implements salutatory {
    PROCESSOR_TIER_UNKNOWN(0),
    PROCESSOR_TIER_INVALID_DATA_SOURCE(1),
    PROCESSOR_TIER_EXTREME_LOW(2),
    PROCESSOR_TIER_LOW(3),
    PROCESSOR_TIER_MID(4),
    PROCESSOR_TIER_MID_PLUS(5),
    PROCESSOR_TIER_HIGH(6),
    PROCESSOR_TIER_EXTREME_HIGH(7),
    UNRECOGNIZED(-1);

    public final int a;

    ec0(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(ec0.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
