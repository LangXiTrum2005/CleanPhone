package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum y5 implements salutatory {
    ADSHIELD_VERSION_UNSPECIFIED(0),
    ADSHIELD_VERSION_1(1),
    ADSHIELD_VERSION_2(2),
    ADSHIELD_VERSION_3(3);

    public final int a;

    y5(int i) {
        this.a = i;
    }

    public static y5 a(int i) {
        if (i == 0) {
            return ADSHIELD_VERSION_UNSPECIFIED;
        }
        if (i == 1) {
            return ADSHIELD_VERSION_1;
        }
        if (i == 2) {
            return ADSHIELD_VERSION_2;
        }
        if (i != 3) {
            return null;
        }
        return ADSHIELD_VERSION_3;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(y5.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
