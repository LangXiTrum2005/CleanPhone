package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class zzieb extends zzidw implements Set, KMappedMarker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzieb(Collection delegate) {
        super(delegate);
        Intrinsics.f(delegate, "delegate");
    }
}
