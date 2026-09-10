package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum fa implements salutatory {
    NETWORK_INTERFACE_UNSPECIFIED(0),
    NETWORK_INTERFACE_NOT_SET(1),
    NETWORK_INTERFACE_ERROR(2),
    NETWORK_INTERFACE_WIFI(3),
    NETWORK_INTERFACE_CELLULAR(4),
    NETWORK_INTERFACE_ETHERNET(5),
    NETWORK_INTERFACE_LOOPBACK(6),
    NETWORK_INTERFACE_OTHER(7),
    NETWORK_INTERFACE_NO_CONNECTION(8);

    public final int a;

    fa(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(fa.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
