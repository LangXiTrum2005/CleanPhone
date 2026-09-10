package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum ps0 implements salutatory {
    UNKNOWN_HOST_TYPE(0),
    GMA(1),
    YOUTUBE(2),
    GPAY(3),
    UNRECOGNIZED(-1);

    public final int a;

    ps0(int i) {
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
        cyclery.attabal(ps0.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
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
