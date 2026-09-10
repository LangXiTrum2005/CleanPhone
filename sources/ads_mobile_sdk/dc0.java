package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum dc0 implements salutatory {
    TIER_UNKNOWN(0),
    TIER_INVALID_DATA_SOURCE(1),
    TIER_EXTREME_LOW(2),
    TIER_VERY_LOW(3),
    TIER_LOW(4),
    TIER_MID(5),
    TIER_MID_PLUS(6),
    TIER_HIGH(7),
    TIER_VERY_HIGH(8),
    TIER_EXTREME_HIGH(9),
    UNRECOGNIZED(-1);

    public final int a;

    dc0(int i) {
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
        cyclery.attabal(dc0.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
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
