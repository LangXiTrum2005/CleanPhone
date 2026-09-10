package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class zzidz extends zzidw implements Set, KMappedMarker {
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzidz(Set delegate) {
        super(delegate);
        Intrinsics.f(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzidw, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzidw, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zzidy(this.zza.iterator());
    }
}
