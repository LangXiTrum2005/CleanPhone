package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2627pF extends InterfaceC08712c {
    void A43(InterfaceC09625t interfaceC09625t);

    Map<String, List<String>> A8t();

    Uri A9P();

    long AGi(C09515i c09515i) throws IOException;

    void close() throws IOException;
}
