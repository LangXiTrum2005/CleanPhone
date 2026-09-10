package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g53 implements Map.Entry, unready.attabal {
    public final /* synthetic */ Map.Entry a;

    public g53(Map.Entry delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
