package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.InterfaceC1470e7;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1467e4<T extends InterfaceC1470e7> {
    void ADq(T t, long j, long j2, boolean z);

    void ADs(T t, long j, long j2);

    C1468e5 ADt(T t, long j, long j2, IOException iOException, int i);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void ADw(T t, long j, long j2, int i);
}
