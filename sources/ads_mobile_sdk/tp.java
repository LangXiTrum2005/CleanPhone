package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum tp implements salutatory {
    BLOB_TYPE_UNKNOWN(0),
    BLOB_TYPE_DEFAULT(1),
    BLOB_TYPE_JAR(2),
    BLOB_TYPE_WEB_SUGGEST(3),
    BLOB_TYPE_BRAIN_SUGGEST(4);

    public final int a;

    tp(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(tp.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
