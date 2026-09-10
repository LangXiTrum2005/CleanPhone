package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1227a5 {
    public static byte[] A0G;
    public static String[] A0H = {"EHyNV0VopsOtwSporiXH3IbUCIQKjXRj", "Q", "", "XmTJCs8qPSdQcdHdn61LRPPQ3smSG97I", "wDplLygIoXk8XNkot1UfjryK9SCAgYHB", "ECol1X044kK0FUMIHw", "4i0Hj8v1liMILlsDukoyXpRoFV", "Uw0qpJPhvEn15ioY0LVsH0H2Mn"};
    public static final Requirements A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1253aY A05;
    public List<C1207Zk> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final HandlerC1224a2 A0C;
    public final RD A0D;
    public final InterfaceC1249aU A0E;
    public final CopyOnWriteArraySet<InterfaceC1226a4> A0F;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0G = new byte[]{73, 116, 99, 92, 96, 109, 117, 105, 126, 54, 72, 99, 123, 98, 96, 99, 109, 104, 65, 109, 98, 109, 107, 105, 126};
        if (A0H[3].charAt(2) != 'T') {
            throw new RuntimeException();
        }
        String[] strArr = A0H;
        strArr[2] = "";
        strArr[1] = bc.aJ;
    }

    static {
        A03();
        A0I = new Requirements(1);
    }

    public C1227a5(Context context, RD rd, InterfaceC1240aJ interfaceC1240aJ) {
        this.A0A = context.getApplicationContext();
        this.A0D = rd;
        this.A01 = 3;
        this.A02 = 5;
        this.A07 = true;
        this.A06 = Collections.emptyList();
        this.A0F = new CopyOnWriteArraySet<>();
        Handler handlerA0b = AbstractC1600gE.A0b(new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.Zy
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.A00.A0B(message);
            }
        });
        this.A0B = handlerA0b;
        HandlerThread handlerThread = new HandlerThread(A01(0, 25, 122));
        handlerThread.start();
        this.A0C = new HandlerC1224a2(handlerThread, rd, interfaceC1240aJ, handlerA0b, this.A01, this.A02, this.A07);
        InterfaceC1249aU requirementsListener = new InterfaceC1249aU() { // from class: com.facebook.ads.redexgen.X.RI
            @Override // com.facebook.ads.redexgen.core.InterfaceC1249aU
            public final void AEr(C1253aY c1253aY, int i) {
                this.A00.A07(c1253aY, i);
            }
        };
        this.A0E = requirementsListener;
        this.A05 = new C1253aY(context, requirementsListener, A0I);
        this.A03 = this.A05.A09();
        this.A04 = 1;
        this.A0C.obtainMessage(0, this.A03, 0).sendToTarget();
    }

    public C1227a5(Context context, InterfaceC1027Sb interfaceC1027Sb, InterfaceC1490eR interfaceC1490eR, InterfaceC1437dZ interfaceC1437dZ, Executor executor) {
        this(context, new C05548n(interfaceC1027Sb), new RL(new PX().A06(interfaceC1490eR).A05(interfaceC1437dZ), executor));
    }

    public static C1207Zk A00(C1207Zk c1207Zk, DownloadRequest downloadRequest, int i, long j) {
        int i2;
        int i3 = c1207Zk.A02;
        long j2 = (i3 == 5 || c1207Zk.A02()) ? j : c1207Zk.A05;
        if (i3 == 5 || i3 == 7) {
            i2 = 7;
        } else if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return new C1207Zk(c1207Zk.A07.A02(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    private void A02() {
        Iterator<InterfaceC1226a4> it = this.A0F.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0H[5].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "oYuwoExxSCJatCdoNpFVjUf8qQzmlhRf";
            strArr[0] = "XrlHvPXFODayNWGoxH1spJ6N8DDPEnzj";
            if (zHasNext) {
                InterfaceC1226a4 listener = it.next();
                listener.AFn(this, this.A09);
            } else {
                return;
            }
        }
    }

    private void A04(int i, int i2) {
        this.A04 -= i;
        this.A00 = i2;
        if (A0I()) {
            Iterator<InterfaceC1226a4> it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next().ADL(this);
            }
        }
    }

    private void A05(C1222a0 c1222a0) {
        this.A06 = Collections.unmodifiableList(c1222a0.A02);
        C1207Zk c1207Zk = c1222a0.A00;
        boolean zA0A = A0A();
        if (c1222a0.A03) {
            CopyOnWriteArraySet<InterfaceC1226a4> copyOnWriteArraySet = this.A0F;
            String[] strArr = A0H;
            if (strArr[6].length() == strArr[7].length()) {
                String[] strArr2 = A0H;
                strArr2[2] = "";
                strArr2[1] = "M";
                Iterator<InterfaceC1226a4> it = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    if (A0H[5].length() == 18) {
                        A0H[5] = "Q0W7n66yvRpCOJYiKm";
                        if (!zHasNext) {
                            break;
                        } else {
                            it.next().ACx(this, c1207Zk);
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        Iterator<InterfaceC1226a4> it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            it2.next().ACw(this, c1207Zk, c1222a0.A01);
        }
        if (zA0A) {
            A02();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C1253aY c1253aY, int i) {
        Requirements requirementsA0A = c1253aY.A0A();
        if (this.A03 != i) {
            this.A03 = i;
            this.A04++;
            this.A0C.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean zA0A = A0A();
        Iterator<InterfaceC1226a4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next().AEq(this, requirementsA0A, i);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A08(List<C1207Zk> list) {
        this.A08 = true;
        this.A06 = Collections.unmodifiableList(list);
        boolean zA0A = A0A();
        Iterator<InterfaceC1226a4> it = this.A0F.iterator();
        while (waitingForRequirementsChanged) {
            it.next().ADQ(this);
        }
        if (zA0A) {
            A02();
        }
    }

    private void A09(boolean z) {
        if (this.A07 == z) {
            return;
        }
        this.A07 = z;
        this.A04++;
        this.A0C.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean zA0A = A0A();
        if (A0H[5].length() != 18) {
            throw new RuntimeException();
        }
        A0H[5] = "E4f6B9BERK22LeseT5";
        Iterator<InterfaceC1226a4> it = this.A0F.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (zA0A) {
            A02();
        }
    }

    private boolean A0A() {
        boolean z = false;
        boolean waitingForRequirements = this.A07;
        if (!waitingForRequirements && this.A03 != 0) {
            for (int i = 0; i < this.A06.size(); i++) {
                if (this.A06.get(i).A02 == 0) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = this.A09;
        String[] strArr = A0H;
        if (strArr[2].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[4] = "QnTKkBInmSLAELxodsvJ0gnTh61QJ8rh";
        strArr2[0] = "e4U9zwIscy6duOvoDJhCr2uw4gou80MH";
        boolean waitingForRequirements2 = z2 != z;
        this.A09 = z;
        return waitingForRequirements2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B(Message message) {
        switch (message.what) {
            case 0:
                A08((List) message.obj);
                return true;
            case 1:
                int activeTaskCount = message.arg1;
                int processedMessageCount = message.arg2;
                A04(activeTaskCount, processedMessageCount);
                return true;
            case 2:
                C1222a0 update = (C1222a0) message.obj;
                A05(update);
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final List<C1207Zk> A0D() {
        return this.A06;
    }

    public final void A0E() {
        A09(false);
    }

    public final void A0F(InterfaceC1226a4 interfaceC1226a4) {
        AbstractC1517es.A01(interfaceC1226a4);
        this.A0F.add(interfaceC1226a4);
    }

    public final void A0G(DownloadRequest downloadRequest) {
        A0H(downloadRequest, 0);
    }

    public final void A0H(DownloadRequest downloadRequest, int i) {
        this.A04++;
        this.A0C.obtainMessage(6, i, 0, downloadRequest).sendToTarget();
    }

    public final boolean A0I() {
        return this.A00 == 0 && this.A04 == 0;
    }
}
