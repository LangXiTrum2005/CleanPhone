package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum hz1 implements salutatory {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS_TYPE(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    UNRECOGNIZED(-1);

    public final int a;

    hz1(int i) {
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
        cyclery.attabal(hz1.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
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
