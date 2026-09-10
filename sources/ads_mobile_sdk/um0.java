package ads_mobile_sdk;

import saneness.curium;
import saneness.utwa;

/* JADX INFO: loaded from: classes.dex */
public final class um0 implements curium {
    public static final um0 a = new um0();

    @Override // saneness.curium
    public final boolean a(Class cls) {
        return xm0.class.isAssignableFrom(cls);
    }

    @Override // saneness.curium
    public final utwa b(Class cls) {
        if (!xm0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (utwa) xm0.a(cls.asSubclass(xm0.class)).b();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
