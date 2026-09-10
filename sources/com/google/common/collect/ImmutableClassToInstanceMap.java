package com.google.common.collect;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ImmutableClassToInstanceMap f19825Y = new ImmutableClassToInstanceMap();
    public final ImmutableMap X = RegularImmutableMap.h0;

    public static final class Builder<B> {
    }

    public Object readResolve() {
        return isEmpty() ? f19825Y : this;
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public final Object x() {
        return RegularImmutableMap.h0;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* JADX INFO: renamed from: x */
    public final Map w() {
        return this.X;
    }
}
