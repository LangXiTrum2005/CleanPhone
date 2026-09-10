package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.umeng.analytics.pro.cw;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1558fY<T> {
    public static byte[] A09;
    public static String[] A0A = {"UuLgjUOIdyGS", "ee6yES2M3", "DH1W5VPkD68OHV5TXQZBMwP", "XgArYMb", "rlcAueV0YRu7ViMRxjPXXB7wxVHCqlgX", "giRCnbhmv8XTp9tbMUeioURlJgICIUe1", "BYkF1ZhmMA6H", "oMzlOxjvbUq0Bzk1AXuAobFM66"};
    public boolean A00;
    public boolean A01;
    public final InterfaceC1524ez A02;
    public final InterfaceC1552fS A03;
    public final InterfaceC1556fW<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<C1557fX<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1558fY(CopyOnWriteArraySet<C1557fX<T>> copyOnWriteArraySet, Looper looper, InterfaceC1524ez interfaceC1524ez, InterfaceC1556fW<T> interfaceC1556fW) {
        this.A02 = interfaceC1524ez;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC1556fW;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = interfaceC1524ez.A5F(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.fU
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A05(message);
            }
        });
        this.A01 = true;
        this.A00 = MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A0E);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{123, 124, 100, 125, 121, 119, 18, cw.m, 30, 9, 26, cw.m, 18, 20, 21, 61, 18, 21, 18, 8, 19, 30, 31};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fW != com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public C1558fY(Looper looper, InterfaceC1524ez interfaceC1524ez, InterfaceC1556fW<T> interfaceC1556fW) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1524ez, interfaceC1556fW);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fW != com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    private final C1558fY<T> A00(Looper looper, InterfaceC1524ez interfaceC1524ez, InterfaceC1556fW<T> interfaceC1556fW) {
        return new C1558fY<>(this.A08, looper, interfaceC1524ez, interfaceC1556fW);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        AbstractC1517es.A08(Thread.currentThread() == this.A03.A8H().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fX != com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC1555fV interfaceC1555fV) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 110));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fX != com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<C1557fX<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 7));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fW != com.google.android.exoplayer2.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public final C1558fY<T> A07(Looper looper, InterfaceC1556fW<T> interfaceC1556fW) {
        return A00(looper, this.A02, interfaceC1556fW);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9d(0)) {
            this.A03.AIJ(this.A03.AC1(0));
        }
        boolean z = !this.A06.isEmpty();
        ArrayDeque<Runnable> arrayDeque = this.A06;
        ArrayDeque<Runnable> arrayDeque2 = this.A07;
        String[] strArr = A0A;
        if (strArr[1].length() != strArr[6].length()) {
            String[] strArr2 = A0A;
            strArr2[2] = "UNsujj5bBKI2lC9QEO6YJnt";
            strArr2[0] = "dXWZh9dgGEaI";
            arrayDeque.addAll(arrayDeque2);
            this.A07.clear();
            if (z) {
                return;
            }
            while (!recursiveFlushInProgress) {
                Runnable runnablePeekFirst = this.A06.peekFirst();
                String[] strArr3 = A0A;
                if (strArr3[4].charAt(27) == strArr3[5].charAt(27)) {
                    String[] strArr4 = A0A;
                    strArr4[1] = "JjeenRb0h";
                    strArr4[6] = "RHSD9U62NwjI";
                    runnablePeekFirst.run();
                    this.A06.removeFirst();
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fV != com.google.android.exoplayer2.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fX != com.google.android.exoplayer2.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public final void A09(final int i, final InterfaceC1555fV<T> interfaceC1555fV) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 110));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.fT
            @Override // java.lang.Runnable
            public final void run() {
                C1558fY.A04(copyOnWriteArraySet, i, interfaceC1555fV);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fV != com.google.android.exoplayer2.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fY != com.google.android.exoplayer2.util.ListenerSet<T> */
    public final void A0A(int i, InterfaceC1555fV<T> interfaceC1555fV) {
        A09(i, interfaceC1555fV);
        A08();
    }
}
