package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum pz implements salutatory {
    ACTION_UNSPECIFIED(0),
    PROCEED(1),
    DISCARD(2),
    KEEP(3),
    CLOSE(4),
    CANCEL(5),
    DISMISS(6),
    BACK(7),
    OPEN_SUBPAGE(8),
    PROCEED_DEEP_SCAN(9),
    OPEN_LEARN_MORE_LINK(10);

    public final int a;

    pz(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(pz.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
