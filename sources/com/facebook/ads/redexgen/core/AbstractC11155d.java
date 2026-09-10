package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC11155d {
    public static void A00(InterfaceC2796pF interfaceC2796pF) {
        if (interfaceC2796pF != null) {
            try {
                interfaceC2796pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
