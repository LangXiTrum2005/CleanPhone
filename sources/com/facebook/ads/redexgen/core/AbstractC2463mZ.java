package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2463mZ implements InterfaceC1257Hw {
    public static String[] A00 = {"S2ZlE7yw63A48uwr9dQcAEYhUnBJ4Yn0", "jzjCSZ", "gN1GhDNq1ONaTY", "QUbV6eP7CXYOE5n4wRXfJJIvrecH4qk8", "luywBeNRakBazgpsmb", "EdZTTUAmlRsHtXkkAmykmZcXBm9Gnzxa", "aBS20hcvH8Cg0VDZoQaxMtYiCLoGsxgc", "2I8VYTEH9eD6qwDjwvQqiLyn0yln2Tpt"};

    public abstract Metadata A0R(C10459e c10459e, ByteBuffer byteBuffer);

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1257Hw
    public final Metadata A5o(C10459e c10459e) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC09153y.A01(c10459e.A02);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            String[] strArr = A00;
            if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A00[1] = "EqsX6PhC";
            if (iArrayOffset == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC09153y.A07(z);
        if (c10459e.A04()) {
            return null;
        }
        return A0R(c10459e, byteBuffer);
    }
}
