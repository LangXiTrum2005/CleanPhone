package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1759ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ M6 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, ExecutionDataWriter.BLOCK_SESSIONINFO, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, ExecutionDataWriter.BLOCK_SESSIONINFO, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 12).equals(this.A00.A07)) {
                Intent intent = new Intent(A00(22, 26, 51), XB.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A09.A0F().A9y();
                try {
                    C1635Wu.A0D(this.A00.A09, intent);
                    this.A00.A06.AF0();
                } catch (C1633Ws e) {
                    Throwable cause = e.getCause();
                    C1633Ws cause2 = e;
                    if (cause != null) {
                        cause2 = e.getCause();
                    }
                    this.A00.A09.A08().ABC(A00(11, 11, 3), AbstractC1543Td.A00, new C1544Te(cause2));
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC1759ag(M6 m6) {
        this.A00 = m6;
    }
}
