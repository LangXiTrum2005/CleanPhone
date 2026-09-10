package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum wy implements salutatory {
    SOURCE_UNSPECIFIED(0),
    CLIENT_GENERATION(1);

    public final int a;

    wy(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(wy.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
