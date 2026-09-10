package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2548nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC08963d A01;
    public final C09515i A02;
    public final C8B A03;
    public final C1368Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC09414y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
            i4++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, 12, -1, 7, 9, ExecutionDataWriter.BLOCK_SESSIONINFO, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void A63(CG cg) throws InterruptedException, IOException {
        this.A00 = cg;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 122));
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2549ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable th = (Throwable) AbstractC09153y.A01(e.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        C5C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC09414y) AbstractC09153y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC09414y) AbstractC09153y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2548nx(C2680q7 c2680q7, C2347kT c2347kT, Executor executor) {
        this.A05 = (Executor) AbstractC09153y.A01(executor);
        AbstractC09153y.A01(c2680q7.A03);
        this.A02 = new C09485f().A06(c2680q7.A03.A00).A08(c2680q7.A03.A04).A02(4).A09();
        this.A03 = c2347kT.A07();
        this.A04 = new C1368Me(this.A03, this.A02, null, new InterfaceC1367Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.facebook.ads.redexgen.core.InterfaceC1367Md
            public final void AFX(long j, long j2, long j3) {
                this.A00.A03(j, j2, j3);
            }
        });
        this.A01 = c2347kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j, long j2, long j3) {
        float f;
        if (this.A00 == null) {
            return;
        }
        if (j == -1 || j == 0) {
            f = -1.0f;
        } else {
            f = (j2 * 100.0f) / j;
        }
        this.A00.AFW(j, j2, f);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.facebook.ads.redexgen.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC09414y<Void, IOException> abstractRunnableFutureC09414y = this.A06;
        if (abstractRunnableFutureC09414y != null) {
            abstractRunnableFutureC09414y.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
