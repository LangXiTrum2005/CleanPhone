package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hb1 {
    public Object a;

    public final Object a() {
        return a("The backing field has not yet been initialized.");
    }

    public final boolean b() {
        return this.a != null;
    }

    public final Object a(String uninitializedMessage) {
        Object obj;
        Intrinsics.checkNotNullParameter(uninitializedMessage, "uninitializedMessage");
        synchronized (this) {
            obj = this.a;
            if (obj == null) {
                throw new IllegalStateException(uninitializedMessage.toString());
            }
        }
        return obj;
    }

    public final void a(Object t) {
        Intrinsics.checkNotNullParameter(t, "t");
        synchronized (this) {
            this.a = t;
            Unit unit = Unit.f29295attabal;
        }
    }
}
