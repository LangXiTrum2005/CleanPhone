package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f53 extends b53 implements Set {
    public final Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f53(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.b = delegate;
    }

    @Override // ads_mobile_sdk.b53, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains((Map.Entry) obj);
    }

    @Override // ads_mobile_sdk.b53, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e53(this.b.iterator());
    }
}
