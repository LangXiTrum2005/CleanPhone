package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum h20 implements salutatory {
    EVENT_URL(1),
    LANDING_PAGE(2),
    LANDING_REFERRER(3),
    CLIENT_REDIRECT(4),
    SERVER_REDIRECT(5),
    RECENT_NAVIGATION(6),
    REFERRER(7);

    public final int a;

    h20(int i2) {
        this.a = i2;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(h20.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
