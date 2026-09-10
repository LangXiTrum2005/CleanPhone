package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum zy implements salutatory {
    UNKNOWN(0),
    UNAVAILABLE(1),
    NOT_MANAGED(2),
    ENTERPRISE_MANAGED(3);

    public final int a;

    zy(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(zy.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
