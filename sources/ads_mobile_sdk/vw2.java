package ads_mobile_sdk;

import kurbash.formularize;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vw2 implements bren.wireman {
    public final Function1 a;
    public Object b;

    public /* synthetic */ vw2(Object obj) {
        this(null, obj);
    }

    @Override // bren.wireman, bren.dern
    public final Object getValue(Object thisRef, formularize property) {
        Object obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        synchronized (this) {
            obj = this.b;
        }
        return obj;
    }

    @Override // bren.wireman
    public final void setValue(Object thisRef, formularize property, Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        synchronized (this) {
            this.b = obj;
            Function1 function1 = this.a;
            if (function1 != null) {
                function1.invoke(obj);
                Unit unit = Unit.f29295attabal;
            }
        }
    }

    public vw2(Function1 function1, Object obj) {
        this.a = function1;
        this.b = obj;
    }
}
