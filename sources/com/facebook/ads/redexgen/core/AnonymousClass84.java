package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.bc;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.84, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass84 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", bc.aM, "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C1827k0> A01 = new AtomicReference<>();

    public static C1827k0 A00() {
        AtomicReference<C1827k0> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = bc.aO;
        return atomicReference.get();
    }

    public static void A01(C1827k0 c1827k0) {
        if (c1827k0 == null) {
            return;
        }
        AnonymousClass83.A00(A01, null, c1827k0);
    }
}
