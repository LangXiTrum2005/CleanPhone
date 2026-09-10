package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2717nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC10653d A01;
    public final C11205i A02;
    public final C8B A03;
    public final C1537Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC11104y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 68);
            i5++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
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
        boolean z2 = false;
        while (!z2) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2718ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z2 = true;
                } catch (ExecutionException e2) {
                    Throwable th = (Throwable) AbstractC10843y.A01(e2.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        C5C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC11104y) AbstractC10843y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC11104y) AbstractC10843y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2717nx(C2849q7 c2849q7, C2516kT c2516kT, Executor executor) {
        this.A05 = (Executor) AbstractC10843y.A01(executor);
        AbstractC10843y.A01(c2849q7.A03);
        this.A02 = new C11175f().A06(c2849q7.A03.A00).A08(c2849q7.A03.A04).A02(4).A09();
        this.A03 = c2516kT.A07();
        this.A04 = new C1537Me(this.A03, this.A02, null, new InterfaceC1536Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.facebook.ads.redexgen.core.InterfaceC1536Md
            public final void AFX(long j, long j2, long j3) {
                this.A00.A03(j, j2, j3);
            }
        });
        this.A01 = c2516kT.A02();
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
        AbstractRunnableFutureC11104y<Void, IOException> abstractRunnableFutureC11104y = this.A06;
        if (abstractRunnableFutureC11104y != null) {
            abstractRunnableFutureC11104y.cancel(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
