package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum v11 implements salutatory {
    UNKNOWN(0),
    OK(1),
    SERVICE_UNAVAILABLE(2),
    FEATURE_NOT_SUPPORTED(3),
    DEVELOPER_ERROR(4),
    PERMISSION_ERROR(5),
    SERVICE_DISCONNECTED(6),
    UNRECOGNIZED(-1);

    public final int a;

    v11(int i) {
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
        cyclery.attabal(v11.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
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
