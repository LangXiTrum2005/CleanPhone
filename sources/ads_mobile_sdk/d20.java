package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum d20 implements salutatory {
    UNDEFINED(0),
    BROWSER_INITIATED(1),
    RENDERER_INITIATED_WITHOUT_USER_GESTURE(2),
    RENDERER_INITIATED_WITH_USER_GESTURE(3),
    COPY_PASTE_USER_INITIATED(4),
    NOTIFICATION_INITIATED(5);

    public final int a;

    d20(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(d20.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
