package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.badlogic.gdx.Input;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HandlerC1224a2 extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"swfC0ibcmhP3x", "", "k5axwtra5rVBXrxN3oOIFzux7ifCzNXy", "DAMM4", "yyRLod3JIhrL30dabLfmNrZ0B112ujjP", "oQYtaz4vuwyMSJpHXF0VT70PFLFDuJr", "VfARV", "rZqZbPAoR0p6fWqNbno2UZy1XGgudDbH"};
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final InterfaceC1240aJ A09;
    public final RD A0A;
    public final ArrayList<C1207Zk> A0B;
    public final HashMap<String, RH> A0C;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0E[1] = "";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
            i4++;
        }
    }

    public static void A0D() {
        A0D = new byte[]{81, 93, 29, 54, 46, 55, 53, 54, 56, 61, 20, 56, 55, 56, 62, 60, 43, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 33, 34, 44, 41, 109, 41, 34, 58, 35, 33, 34, 44, 41, 119, 109, 94, 121, 113, 116, 125, 124, 56, 108, 119, 56, 116, 119, 121, 124, 56, 124, 119, 111, 118, 116, 119, 121, 124, 107, 54, 0, 39, 47, 42, 35, 34, 102, 50, 41, 102, 42, 41, 39, 34, 102, 47, 40, 34, 35, 62, 104, 120, 95, 87, 82, 91, 90, 30, 74, 81, 30, 76, 91, 83, 81, 72, 91, 30, 88, 76, 81, 83, 30, 90, 95, 74, 95, 92, 95, 77, 91, 38, 1, 9, 12, 5, 4, 64, 20, cw.m, 64, 18, 5, cw.k, cw.m, 22, 5, 64, cw.l, cw.m, cw.l, 5, 24, 9, 19, 20, 5, cw.l, 20, 64, 4, cw.m, 23, cw.l, 12, cw.m, 1, 4, 90, 64, 24, 63, 55, 50, 59, 58, 126, 42, 49, 126, 45, 59, 42, 126, 51, 63, 48, 43, 63, 50, 126, 45, 42, 49, 46, 126, 44, 59, 63, 45, 49, 48, 83, 116, 124, 121, 112, 113, 53, 97, 122, 53, 102, 112, 97, 53, 120, 116, 123, 96, 116, 121, 53, 102, 97, 122, 101, 53, 103, 112, 116, 102, 122, 123, 47, 53, 81, 118, 126, 123, 114, 115, 55, 99, 120, 55, 98, 103, 115, 118, 99, 114, 55, 126, 121, 115, 114, 111, 57, 67, 118, 100, 124, 55, 113, 118, 126, 123, 114, 115, 45, 55};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0Q(DownloadRequest downloadRequest, int i) {
        C1207Zk c1207ZkA06 = A06(downloadRequest.A02, true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1207ZkA06 != null) {
            A03(C1227a5.A00(c1207ZkA06, downloadRequest, i, jCurrentTimeMillis));
        } else {
            A03(new C1207Zk(downloadRequest, i != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i, 0));
        }
        A0B();
    }

    static {
        A0D();
    }

    public HandlerC1224a2(HandlerThread handlerThread, RD rd, InterfaceC1240aJ interfaceC1240aJ, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.A08 = handlerThread;
        this.A0A = rd;
        this.A09 = interfaceC1240aJ;
        this.A07 = handler;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = z;
        this.A0B = new ArrayList<>();
        this.A0C = new HashMap<>();
    }

    public static int A00(C1207Zk c1207Zk, C1207Zk c1207Zk2) {
        return AbstractC1600gE.A08(c1207Zk.A05, c1207Zk2.A05);
    }

    private int A02(String str) {
        for (int i = 0; i < i; i++) {
            if (this.A0B.get(i).A07.A02.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private C1207Zk A03(C1207Zk c1207Zk) {
        AbstractC1517es.A08((c1207Zk.A02 == 3 || c1207Zk.A02 == 4) ? false : true);
        int iA02 = A02(c1207Zk.A07.A02);
        if (iA02 == -1) {
            this.A0B.add(c1207Zk);
            Collections.sort(this.A0B, new C1223a1());
        } else {
            boolean z = c1207Zk.A05 != this.A0B.get(iA02).A05;
            this.A0B.set(iA02, c1207Zk);
            if (z) {
                Collections.sort(this.A0B, new C1223a1());
            }
        }
        try {
            this.A0A.AGN(c1207Zk);
        } catch (IOException e) {
            AbstractC1561fb.A08(A08(2, 15, 64), A08(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 23, 14), e);
        }
        this.A07.obtainMessage(2, new C1222a0(c1207Zk, false, new ArrayList(this.A0B), null)).sendToTarget();
        return c1207Zk;
    }

    private C1207Zk A04(C1207Zk c1207Zk, int i, int i2) {
        AbstractC1517es.A08((i == 3 || i == 4) ? false : true);
        return A03(A05(c1207Zk, i, i2));
    }

    public static C1207Zk A05(C1207Zk c1207Zk, int i, int i2) {
        return new C1207Zk(c1207Zk.A07, i, c1207Zk.A05, System.currentTimeMillis(), c1207Zk.A04, i2, 0, c1207Zk.A00);
    }

    private C1207Zk A06(String str, boolean z) {
        int iA02 = A02(str);
        if (iA02 != -1) {
            return this.A0B.get(iA02);
        }
        if (z) {
            try {
                return this.A0A.A7g(str);
            } catch (IOException e) {
                AbstractC1561fb.A08(A08(2, 15, 64), A08(17, 25, 84) + str, e);
                return null;
            }
        }
        return null;
    }

    private RH A07(RH rh, C1207Zk c1207Zk) {
        if (rh != null) {
            AbstractC1517es.A08(!rh.A06);
            rh.A05(false);
            if (A0E[0].length() == 13) {
                A0E[1] = "";
                return rh;
            }
        } else {
            if (!A0U()) {
                return null;
            }
            int i = this.A01;
            String[] strArr = A0E;
            if (strArr[3].length() == strArr[6].length()) {
                String[] strArr2 = A0E;
                strArr2[7] = "clCTtan1hGsiTpzOnYvuaYS7HeVgH65T";
                strArr2[2] = "s0FRQ6WZgjKqiR2A5bQGQkiYgEO3ktzW";
                if (i < this.A02) {
                    C1207Zk c1207ZkA04 = A04(c1207Zk, 2, 0);
                    RH rh2 = new RH(c1207ZkA04.A07, this.A09.A5C(c1207ZkA04.A07), c1207ZkA04.A00, false, this.A03, this);
                    this.A0C.put(c1207ZkA04.A07.A02, rh2);
                    int i2 = this.A01;
                    this.A01 = i2 + 1;
                    if (i2 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    rh2.start();
                    return rh2;
                }
                return null;
            }
        }
        throw new RuntimeException();
    }

    private void A09() {
        Iterator<RH> it = this.A0C.values().iterator();
        while (it.hasNext()) {
            it.next().A05(true);
        }
        try {
            this.A0A.AIU();
        } catch (IOException e) {
            AbstractC1561fb.A08(A08(2, 15, 64), A08(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 23, 14), e);
        }
        this.A0B.clear();
        this.A08.quit();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }

    private void A0A() {
        String strA08 = A08(2, 15, 64);
        ArrayList arrayList = new ArrayList();
        try {
            RO roA7h = this.A0A.A7h(3, 4);
            while (roA7h.A01()) {
                try {
                    arrayList.add(roA7h.A00());
                } catch (Throwable th) {
                    if (roA7h != null) {
                        try {
                            roA7h.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (roA7h != null) {
                roA7h.close();
            }
        } catch (IOException unused) {
            AbstractC1561fb.A05(strA08, A08(42, 25, 1));
        }
        for (int i = 0; i < this.A0B.size(); i++) {
            this.A0B.set(i, A05(this.A0B.get(i), 5, 0));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.A0B.add(A05((C1207Zk) arrayList.get(i2), 5, 0));
        }
        List<Download> terminalDownloads = this.A0B;
        Collections.sort(terminalDownloads, new C1223a1());
        try {
            this.A0A.AIv();
        } catch (IOException e) {
            AbstractC1561fb.A08(strA08, A08(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 23, 14), e);
        }
        ArrayList arrayList2 = new ArrayList(this.A0B);
        for (int i3 = 0; i3 < this.A0B.size(); i3++) {
            this.A07.obtainMessage(2, new C1222a0(this.A0B.get(i3), false, arrayList2, null)).sendToTarget();
        }
        A0B();
    }

    private void A0B() {
        int i = 0;
        for (int i2 = 0; i2 < accumulatingDownloadTaskCount; i2++) {
            C1207Zk download = this.A0B.get(i2);
            RH rhA07 = this.A0C.get(download.A07.A02);
            int accumulatingDownloadTaskCount = download.A02;
            switch (accumulatingDownloadTaskCount) {
                case 0:
                    rhA07 = A07(rhA07, download);
                    break;
                case 1:
                    A0M(rhA07);
                    break;
                case 2:
                    AbstractC1517es.A01(rhA07);
                    A0P(rhA07, download, i);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new IllegalStateException();
                case 5:
                case 7:
                    A0O(rhA07, download);
                    break;
            }
            if (rhA07 != null && !rhA07.A06) {
                i++;
            }
        }
    }

    private void A0C() {
        for (int i = 0; i < i; i++) {
            C1207Zk c1207Zk = this.A0B.get(i);
            if (c1207Zk.A02 == 2) {
                try {
                    this.A0A.AGN(c1207Zk);
                } catch (IOException e) {
                    AbstractC1561fb.A08(A08(2, 15, 64), A08(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 23, 14), e);
                }
            }
        }
        sendEmptyMessageDelayed(11, 5000L);
    }

    private void A0E(int i) {
        this.A04 = i;
        RO roA7h = null;
        try {
            try {
                this.A0A.AIU();
                roA7h = this.A0A.A7h(0, 1, 2, 5, 7);
                while (roA7h.A01()) {
                    this.A0B.add(roA7h.A00());
                }
            } catch (IOException e) {
                AbstractC1561fb.A08(A08(2, 15, 64), A08(67, 21, 95), e);
                this.A0B.clear();
            }
            AbstractC1600gE.A10(roA7h);
            this.A07.obtainMessage(0, new ArrayList(this.A0B)).sendToTarget();
            A0B();
        } catch (Throwable th) {
            AbstractC1600gE.A10(roA7h);
            throw th;
        }
    }

    private void A0F(int i) {
        this.A02 = i;
        A0B();
    }

    private void A0G(int i) {
        this.A03 = i;
    }

    private void A0H(int i) {
        this.A04 = i;
        A0B();
    }

    private void A0I(C1207Zk c1207Zk) {
        if (c1207Zk.A02 == 7) {
            int i = c1207Zk.A03 == 0 ? 0 : 1;
            int state = c1207Zk.A03;
            A04(c1207Zk, i, state);
            A0B();
            return;
        }
        this.A0B.remove(A02(c1207Zk.A07.A02));
        try {
            this.A0A.AHX(c1207Zk.A07.A02);
        } catch (IOException unused) {
            AbstractC1561fb.A05(A08(2, 15, 64), A08(88, 30, 39));
        }
        this.A07.obtainMessage(2, new C1222a0(c1207Zk, true, new ArrayList(this.A0B), null)).sendToTarget();
    }

    private void A0J(C1207Zk c1207Zk, int i) {
        if (i == 0) {
            if (c1207Zk.A02 == 1) {
                String[] strArr = A0E;
                if (strArr[7].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0E[1] = "";
                A04(c1207Zk, 0, 0);
                return;
            }
            return;
        }
        int i2 = c1207Zk.A03;
        if (A0E[0].length() != 13) {
            A0E[5] = "gmNkl1fxoG4c55uAK63V6czVgHJPrQL";
            if (i == i2) {
                return;
            }
        } else {
            A0E[1] = "";
            if (i == i2) {
                return;
            }
        }
        int i3 = c1207Zk.A02;
        if (i3 == 0 || i3 == 2) {
            i3 = 1;
        }
        A03(new C1207Zk(c1207Zk.A07, i3, c1207Zk.A05, System.currentTimeMillis(), c1207Zk.A04, i, 0, c1207Zk.A00));
    }

    private void A0K(C1207Zk c1207Zk, Exception exc) {
        C1207Zk c1207Zk2 = new C1207Zk(c1207Zk.A07, exc == null ? 3 : 4, c1207Zk.A05, System.currentTimeMillis(), c1207Zk.A04, c1207Zk.A03, exc == null ? 0 : 1, c1207Zk.A00);
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A0E[0] = "r5gLw2w7Harrz";
        this.A0B.remove(A02(c1207Zk2.A07.A02));
        try {
            this.A0A.AGN(c1207Zk2);
        } catch (IOException e) {
            AbstractC1561fb.A08(A08(2, 15, 64), A08(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 23, 14), e);
        }
        this.A07.obtainMessage(2, new C1222a0(c1207Zk2, false, new ArrayList(this.A0B), exc)).sendToTarget();
    }

    private void A0L(RH rh) {
        String str = rh.A04.A02;
        this.A0C.remove(str);
        boolean z = rh.A06;
        if (z) {
            this.A06 = false;
        } else {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                removeMessages(11);
            }
        }
        if (!rh.A08) {
            Exception exc = rh.A01;
            if (exc != null) {
                StringBuilder sb = new StringBuilder();
                String downloadId = A08(246, 13, 14);
                StringBuilder sbAppend = sb.append(downloadId).append(rh.A04);
                String downloadId2 = A08(0, 2, 100);
                String string = sbAppend.append(downloadId2).append(z).toString();
                String downloadId3 = A08(2, 15, 64);
                AbstractC1561fb.A08(downloadId3, string, exc);
            }
            C1207Zk c1207Zk = (C1207Zk) AbstractC1517es.A01(A06(str, false));
            switch (c1207Zk.A02) {
                case 2:
                    AbstractC1517es.A08(!z);
                    A0K(c1207Zk, exc);
                    break;
                case 3:
                case 4:
                case 6:
                default:
                    throw new IllegalStateException();
                case 5:
                case 7:
                    AbstractC1517es.A08(z);
                    A0I(c1207Zk);
                    break;
            }
            A0B();
            return;
        }
        A0B();
    }

    private void A0M(RH rh) {
        if (rh != null) {
            AbstractC1517es.A08(!rh.A06);
            rh.A05(false);
        }
    }

    private void A0N(RH rh, long j) {
        C1207Zk c1207Zk = (C1207Zk) AbstractC1517es.A01(A06(rh.A04.A02, false));
        if (j == c1207Zk.A04 || j == -1) {
            return;
        }
        A03(new C1207Zk(c1207Zk.A07, c1207Zk.A02, c1207Zk.A05, System.currentTimeMillis(), j, c1207Zk.A03, c1207Zk.A01, c1207Zk.A00));
    }

    private void A0O(RH rh, C1207Zk c1207Zk) {
        if (rh != null) {
            if (rh.A06) {
                return;
            }
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "cabchplwOtJyL";
            rh.A05(false);
            return;
        }
        if (this.A06) {
            return;
        }
        RH rh2 = new RH(c1207Zk.A07, this.A09.A5C(c1207Zk.A07), c1207Zk.A00, true, this.A03, this);
        this.A0C.put(c1207Zk.A07.A02, rh2);
        this.A06 = true;
        rh2.start();
    }

    private void A0P(RH rh, C1207Zk c1207Zk, int i) {
        AbstractC1517es.A08(!rh.A06);
        if (!A0U() || i >= this.A02) {
            A04(c1207Zk, 0, 0);
            rh.A05(false);
        }
    }

    private void A0R(String str) {
        C1207Zk c1207ZkA06 = A06(str, true);
        if (c1207ZkA06 == null) {
            AbstractC1561fb.A05(A08(2, 15, 64), A08(EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 39, 121) + str);
        } else {
            A04(c1207ZkA06, 5, 0);
            A0B();
        }
    }

    private void A0S(String str, int i) {
        String strA08 = A08(2, 15, 64);
        if (str == null) {
            for (int i2 = 0; i2 < this.A0B.size(); i2++) {
                A0J(this.A0B.get(i2), i);
            }
            try {
                this.A0A.AIw(i);
            } catch (IOException e) {
                AbstractC1561fb.A08(strA08, A08(Input.Keys.NUMPAD_ADD, 32, 71), e);
            }
        } else {
            C1207Zk c1207ZkA06 = A06(str, false);
            if (c1207ZkA06 != null) {
                A0J(c1207ZkA06, i);
            } else {
                try {
                    this.A0A.AIx(str, i);
                } catch (IOException e2) {
                    AbstractC1561fb.A08(strA08, A08(189, 34, 12) + str, e2);
                }
            }
        }
        A0B();
    }

    private void A0T(boolean z) {
        this.A05 = z;
        A0B();
    }

    private boolean A0U() {
        return !this.A05 && this.A04 == 0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        boolean z = true;
        try {
            switch (message.what) {
                case 0:
                    A0E(message.arg1);
                    break;
                case 1:
                    A0T(message.arg1 != 0);
                    break;
                case 2:
                    A0H(message.arg1);
                    break;
                case 3:
                    A0S((String) message.obj, message.arg1);
                    break;
                case 4:
                    A0F(message.arg1);
                    break;
                case 5:
                    A0G(message.arg1);
                    break;
                case 6:
                    A0Q((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    A0R((String) message.obj);
                    break;
                case 8:
                    A0A();
                    break;
                case 9:
                    A0L((RH) message.obj);
                    z = false;
                    break;
                case 10:
                    A0N((RH) message.obj, AbstractC1600gE.A0N(message.arg1, message.arg2));
                    return;
                case 11:
                    A0C();
                    return;
                case 12:
                    A09();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.A07.obtainMessage(1, z ? 1 : 0, this.A0C.size()).sendToTarget();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
