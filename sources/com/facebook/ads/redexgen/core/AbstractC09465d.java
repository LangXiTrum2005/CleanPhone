package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC09465d {
    public static void A00(InterfaceC2627pF interfaceC2627pF) {
        if (interfaceC2627pF != null) {
            try {
                interfaceC2627pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
