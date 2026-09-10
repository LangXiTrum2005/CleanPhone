package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1442de {
    public static void A00(Q7 q7) {
        if (q7 != null) {
            try {
                q7.close();
            } catch (IOException unused) {
            }
        }
    }
}
