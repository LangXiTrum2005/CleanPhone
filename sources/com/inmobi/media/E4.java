package com.inmobi.media;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class E4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2927a2 f22795a;

    public E4(String b64feature) {
        Intrinsics.f(b64feature, "b64feature");
        C2927a2 c2927a2 = new C2927a2();
        this.f22795a = c2927a2;
        c2927a2.a(b64feature);
    }

    public final boolean a(boolean z2) {
        BitSet bitSet = this.f22795a.f23424a;
        return bitSet != null ? bitSet.get(0) : z2;
    }
}
