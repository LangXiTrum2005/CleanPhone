package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    public static final class Builder<B> {
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public final /* bridge */ /* synthetic */ Object x() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: x */
    public final Map w() {
        return null;
    }
}
