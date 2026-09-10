package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2796pF extends InterfaceC10402c {
    void A43(InterfaceC11315t interfaceC11315t);

    Map<String, List<String>> A8t();

    Uri A9P();

    long AGi(C11205i c11205i) throws IOException;

    void close() throws IOException;
}
