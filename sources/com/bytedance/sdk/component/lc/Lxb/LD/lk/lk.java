package com.bytedance.sdk.component.lc.Lxb.LD.lk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.lc.Lxb.JXs;
import com.bytedance.sdk.component.lc.Lxb.Lxb.ZU;
import com.bytedance.sdk.component.lc.Lxb.OY;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends HandlerThread implements Handler.Callback {
    private static int kqm = 10;
    private static int tD = 200;
    private final int DY;
    private final int HD;
    private final AtomicInteger IeN;
    private final long JVA;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> JXs;
    private volatile boolean LD;
    protected ZU Lxb;
    private volatile Handler NXR;
    private volatile long OY;
    private final AtomicInteger QAg;
    private final List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> STP;
    private final int Sfi;
    private final AtomicInteger VVE;
    private com.bytedance.sdk.component.lc.Lxb.LD.lk ZU;
    private long brP;
    private volatile long ebl;
    private volatile int lc;
    private final Object lk;
    private final long nBu;
    private final AtomicInteger sLN;

    public lk(PriorityBlockingQueue<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> priorityBlockingQueue) {
        super("csj_log");
        this.LD = true;
        this.lk = new Object();
        this.ebl = 0L;
        this.OY = 0L;
        this.QAg = new AtomicInteger(0);
        this.nBu = 5000L;
        this.JVA = 5000000000L;
        this.sLN = new AtomicInteger(0);
        this.STP = new ArrayList();
        this.IeN = new AtomicInteger(0);
        this.VVE = new AtomicInteger(0);
        this.brP = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.DY = 1;
        this.Sfi = 2;
        this.HD = 3;
        this.JXs = priorityBlockingQueue;
        this.Lxb = new com.bytedance.sdk.component.lc.Lxb.Lxb.LD();
        if (com.bytedance.sdk.component.lc.Lxb.LD.LD()) {
            return;
        }
        long jIeN = OY.ebl().VVE().IeN();
        if (jIeN > 0) {
            this.brP = jIeN;
        }
    }

    private void JXs() {
        while (Lxb()) {
            try {
                com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb = com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU;
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.OY(), 1);
                com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxbPoll = this.JXs.poll(this.brP, TimeUnit.MILLISECONDS);
                int size = this.JXs.size();
                if (lxbPoll instanceof com.bytedance.sdk.component.lc.Lxb.ZU.LD) {
                    Lxb(lxbPoll, size);
                } else if (lxbPoll == null) {
                    int iIncrementAndGet = this.QAg.incrementAndGet();
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.JJ(), 1);
                    if (ZU(iIncrementAndGet)) {
                        lc();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.lc = 1;
                        LD((com.bytedance.sdk.component.lc.Lxb.ZU.Lxb) null);
                    }
                } else {
                    Lxb(lxbPoll);
                    LD(lxbPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.rW(), 1);
            }
        }
    }

    private boolean OY() {
        if (com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.LD) {
            return this.lc == 4 || this.lc == 7 || this.lc == 6 || this.lc == 5 || this.lc == 2;
        }
        return false;
    }

    private void QAg() {
        try {
            if (this.JXs.size() == 0 && this.NXR.hasMessages(11) && Lxb()) {
                Lxb(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void ZU() {
        if (!isAlive()) {
            com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.ZU();
        } else {
            if (Lxb()) {
                return;
            }
            lk(6);
        }
    }

    private void ebl() {
        if (this.JXs.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxbPoll = this.JXs.poll();
                if (!(lxbPoll instanceof com.bytedance.sdk.component.lc.Lxb.ZU.LD) && lxbPoll != null) {
                    Lxb(lxbPoll);
                }
            }
        }
    }

    private void lc() {
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.HD(), 1);
        Lxb(false);
        com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.lk();
    }

    private void lk() {
        ZU();
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.le(), 1);
        lk(1);
    }

    private void nBu() {
        if (this.NXR.hasMessages(11)) {
            QAg();
        } else {
            JXs(1);
        }
        com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb = com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU;
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.LD(), 1);
        if (this.lc != 2) {
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.ebl(), 1);
        synchronized (this.lk) {
            try {
                try {
                    long jNanoTime = System.nanoTime();
                    this.lk.wait(5000L);
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    com.bytedance.sdk.component.lc.Lxb.LD.ZU zu = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                    if (!zu.LD) {
                        boolean z = zu.lk;
                    }
                    if (jNanoTime2 < 5000000000L && 5000000000L - jNanoTime2 >= 50000000) {
                        if (!zu.LD && !zu.lk) {
                            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.BcA(), 1);
                            lk(2);
                            return;
                        }
                        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.JVA(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.nBu(), 1);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.QAg(), 1);
                LD();
                Lxb(true);
                JXs();
            } else {
                if (i != 2 && i != 3) {
                    if (i == 11) {
                        ArrayList arrayList = new ArrayList(this.STP);
                        this.STP.clear();
                        Lxb((List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>) arrayList, false, "timeout_dispatch");
                        nBu();
                    }
                    return true;
                }
                lk();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.NXR = new Handler(getLooper(), this);
        com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.Lxb(this.NXR);
        this.NXR.sendEmptyMessage(1);
    }

    public static void LD(int i) {
        tD = i;
    }

    private void LD() {
        long jKqm = OY.ebl().kqm();
        if (jKqm <= 0) {
            return;
        }
        this.Lxb.Lxb(Integer.MAX_VALUE, jKqm);
    }

    public static void Lxb(int i) {
        kqm = i;
    }

    public void lk(int i) {
        try {
            boolean zLxb = Lxb(i, com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.LD);
            if (i == 6 || zLxb) {
                com.bytedance.sdk.component.lc.Lxb.ZU.LD ld = new com.bytedance.sdk.component.lc.Lxb.ZU.LD();
                ld.LD(i);
                this.JXs.add(ld);
                JXs(3);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void LD(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> listLxb;
        if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.LD() && OY.ebl().Lxb()) {
            return;
        }
        int i = 0;
        if (OY()) {
            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(this.lc);
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.sLN(), 1);
            if (this.JXs.size() != 0) {
                return;
            }
            if (!this.NXR.hasMessages(2)) {
                com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.LD = false;
                this.OY = 0L;
                this.ebl = 0L;
                this.IeN.set(0);
                this.VVE.set(0);
            } else {
                Lxb(false);
                return;
            }
        }
        do {
            boolean zLxb = Lxb(this.lc, com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb.LD);
            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(zLxb, this.lc, lxb);
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.NXR(), 1);
            if (zLxb && (listLxb = this.Lxb.Lxb(this.lc, -1, null)) != null) {
                listLxb.size();
                Lxb(listLxb);
            } else {
                QAg();
            }
            i++;
            if (!zLxb) {
                return;
            }
        } while (i <= 6);
    }

    private boolean ZU(int i) {
        if (i < 4 || this.sLN.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.lc.Lxb.LD.ZU zu = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
        return (zu.LD || zu.lk) ? false : true;
    }

    public void Lxb(boolean z) {
        this.LD = z;
    }

    public boolean Lxb() {
        return this.LD;
    }

    public boolean Lxb(int i, boolean z) {
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || !jXsVVE.Lxb(OY.ebl().lc())) {
            return false;
        }
        return this.Lxb.Lxb(i, z);
    }

    public void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, boolean z) {
        if (lxb == null) {
            return;
        }
        lxb.ZU();
        if (z) {
            if (this.NXR != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(lxb);
                Lxb((List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.JXs.add(lxb);
        JXs(2);
    }

    private void JXs(int i) {
        if (!Lxb()) {
            if (this.NXR == null) {
                return;
            }
            com.bytedance.sdk.component.lc.Lxb.LD.Lxb.Lxb lxb = com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU;
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.lk(), 1);
            if (this.NXR.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.lc(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.ZU(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(lxb.JXs(), 1);
            }
            this.NXR.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Lxb(), 1);
    }

    private void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb, int i) {
        this.QAg.set(0);
        if (i == 0) {
            this.lc = ((com.bytedance.sdk.component.lc.Lxb.ZU.LD) lxb).JVA();
            if (this.lc != 6) {
                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.NDz(), 1);
                LD(lxb);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.lc.Lxb.ZU.LD ld = (com.bytedance.sdk.component.lc.Lxb.ZU.LD) lxb;
        if (ld.JVA() == 1) {
            this.lc = 1;
            LD(lxb);
        } else if (ld.JVA() == 2) {
            ebl();
            this.lc = 2;
            LD(lxb);
        }
    }

    private void LD(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        this.STP.addAll(list);
        this.STP.size();
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE != null && jXsVVE.sLN() != null) {
            kqm = jXsVVE.sLN().LD();
        }
        if (this.STP.size() >= kqm) {
            if (this.NXR.hasMessages(11)) {
                this.NXR.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.STP);
            this.STP.clear();
            Lxb((List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>) arrayList, false, "max_size_dispatch");
            nBu();
            return;
        }
        if (this.JXs.size() == 0) {
            Lxb(false);
            if (this.NXR.hasMessages(11)) {
                this.NXR.removeMessages(11);
            }
            if (this.NXR.hasMessages(1)) {
                this.NXR.removeMessages(1);
            }
            long jLxb = tD;
            if (jXsVVE != null && jXsVVE.sLN() != null) {
                jLxb = jXsVVE.sLN().Lxb();
            }
            this.NXR.sendEmptyMessageDelayed(11, jLxb);
            return;
        }
        this.STP.size();
    }

    private void Lxb(com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb) {
        this.QAg.set(0);
        com.bytedance.sdk.component.lc.Lxb.LD.ZU zu = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
        if (zu.LD) {
            this.lc = 5;
        } else if (zu.lk) {
            this.lc = 7;
        } else {
            this.lc = 4;
        }
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Lpq(), 1);
        this.Lxb.Lxb(lxb, this.lc);
        com.bytedance.sdk.component.lc.Lxb.lk.Lxb.ebl(lxb);
    }

    private void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, String str) {
        Lxb(str);
        Lxb(list, false, str);
        nBu();
    }

    private void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(list, this.JXs.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.lc.Lxb.lk.Lxb.lk()) {
                com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(0);
                if (lxb != null) {
                    if (lxb.JXs() == 1) {
                        Lxb(list, "highPriority");
                        return;
                    }
                    if (lxb.ZU() == 0 && lxb.JXs() == 2) {
                        if (lxb.LD() == 3) {
                            Lxb(list, "version_v3");
                            return;
                        } else {
                            LD(list);
                            return;
                        }
                    }
                    if (lxb.ZU() == 1) {
                        Lxb(list, "stats");
                        return;
                    } else if (lxb.ZU() == 3) {
                        Lxb(list, "adType_v3");
                        return;
                    } else {
                        if (lxb.ZU() == 2) {
                            Lxb(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            Lxb(list, "batchRead");
            return;
        }
        QAg();
    }

    private void LD(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, final boolean z, final long j) {
        this.sLN.incrementAndGet();
        com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.ae(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.lc.Lxb.ZU.Lxb next = it.next();
                int iNBu = next == null ? 0 : next.nBu();
                if (map.get(Integer.valueOf(iNBu)) == null) {
                    map.put(Integer.valueOf(iNBu), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iNBu))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && OY.ebl().lk() != null && OY.ebl().lk().get(num) != null) {
                    OY.ebl().lk().get(num).Lxb(list, new com.bytedance.sdk.component.lc.Lxb.LD.LD() { // from class: com.bytedance.sdk.component.lc.Lxb.LD.lk.lk.3
                        @Override // com.bytedance.sdk.component.lc.Lxb.LD.LD
                        public void Lxb(List<Lxb> list2) {
                            try {
                                lk.this.sLN.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    Lxb lxb = list2.get(i);
                                    if (lxb != null) {
                                        lk.this.Lxb(z, lxb.Lxb(), lxb.LD(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.ZU.Lxb(list, new com.bytedance.sdk.component.lc.Lxb.LD.LD() { // from class: com.bytedance.sdk.component.lc.Lxb.LD.lk.lk.2
                        @Override // com.bytedance.sdk.component.lc.Lxb.LD.LD
                        public void Lxb(List<Lxb> list2) {
                            try {
                                lk.this.sLN.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    Lxb lxb = list2.get(i);
                                    if (lxb != null) {
                                        lk.this.Lxb(z, lxb.Lxb(), lxb.LD(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.getMessage();
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.rW(), 1);
            this.sLN.decrementAndGet();
        }
    }

    private void Lxb(String str) {
        if (this.NXR.hasMessages(11)) {
            this.NXR.removeMessages(11);
        }
        if (this.STP.size() != 0) {
            ArrayList arrayList = new ArrayList(this.STP);
            this.STP.clear();
            Lxb((List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>) arrayList, false, "before_".concat(String.valueOf(str)));
            nBu();
            arrayList.size();
        }
    }

    private void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(list, this.lc, str);
        com.bytedance.sdk.component.lc.Lxb.LD.lk lkVarOY = OY.ebl().OY();
        this.ZU = lkVarOY;
        if (lkVarOY != null) {
            LD(list, z, jCurrentTimeMillis);
        } else {
            Lxb(list, z, jCurrentTimeMillis);
        }
    }

    private void Lxb(final List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, final boolean z, final long j) {
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE != null) {
            Executor executorJXs = jXsVVE.JXs();
            if (list.get(0).JXs() == 1) {
                executorJXs = jXsVVE.ZU();
            }
            if (executorJXs == null) {
                return;
            }
            this.sLN.incrementAndGet();
            executorJXs.execute(new com.bytedance.sdk.component.lc.Lxb.JXs.JXs("csj_log_upload") { // from class: com.bytedance.sdk.component.lc.Lxb.LD.lk.lk.1
                @Override // java.lang.Runnable
                public void run() {
                    lk lkVar = lk.this;
                    lkVar.Lxb((List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb>) list, z, j, lkVar.lc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, boolean z, long j, int i) {
        LD ldLxb;
        try {
            com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb = list.get(0);
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.ae(), 1);
            if (lxb.ZU() == 0) {
                ldLxb = OY.JXs().Lxb(list);
                Lxb(ldLxb, list);
                if (ldLxb != null) {
                    com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(list, ldLxb.ZU);
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> it = list.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().ebl());
                    }
                    jSONObject.put("stats_list", jSONArray);
                } catch (Exception e) {
                    e.getMessage();
                }
                ldLxb = OY.JXs().Lxb(jSONObject);
            }
            LD ld = ldLxb;
            this.sLN.decrementAndGet();
            Lxb(z, ld, list, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.rW(), 1);
            this.sLN.decrementAndGet();
        }
    }

    private void Lxb(LD ld, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list) {
        if (ld == null || !ld.Lxb) {
            return;
        }
        List<Object> listLxb = com.bytedance.sdk.component.lc.Lxb.LD.Lxb();
        if (list == null || listLxb == null || listLxb.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.lc.Lxb.ZU.Lxb lxb : list) {
            if (lxb.JXs() == 1) {
                com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(lxb);
                com.bytedance.sdk.component.lc.Lxb.lk.Lxb.JXs(lxb);
                Iterator<Object> it = listLxb.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z, LD ld, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, long j) {
        if (z || ld == null) {
            return;
        }
        int i = ld.LD;
        int i2 = -2;
        if (ld.JXs) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (ld.Lxb || ((i < 500 || i >= 509) && i <= 513)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.sLN.get();
        }
        Lxb(i2, list, j);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: all -> 0x0040, DONT_GENERATE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0040, DONT_GENERATE, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    private void Lxb(int i, List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> list, long j) {
        com.bytedance.sdk.component.lc.Lxb.LD.ZU zu;
        synchronized (this.lk) {
            if (list != null) {
                try {
                    if (this.NXR != null) {
                        com.bytedance.sdk.component.lc.Lxb.lk.Lxb.Lxb(i, list, j);
                        this.Lxb.Lxb(i, list);
                        OY.ebl().VVE();
                        if (i == -2) {
                            com.bytedance.sdk.component.lc.Lxb.LD.ZU zu2 = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                            zu2.LD = false;
                            zu2.lk = true;
                            if (this.NXR.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.OY < MBInterstitialActivity.WEB_LOAD_TIME) {
                                return;
                            }
                            this.OY = System.currentTimeMillis();
                            if (this.NXR.hasMessages(2)) {
                                this.NXR.removeMessages(2);
                            }
                            Lxb(3, MBInterstitialActivity.WEB_LOAD_TIME);
                        } else if (i == -1) {
                            zu = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                            if (!zu.LD || zu.lk) {
                                zu.LD = false;
                                zu.lk = false;
                                if (this.NXR.hasMessages(2)) {
                                    this.NXR.removeMessages(2);
                                }
                                if (this.NXR.hasMessages(3)) {
                                    this.NXR.removeMessages(3);
                                }
                                this.OY = 0L;
                                this.ebl = 0L;
                                this.IeN.set(0);
                                this.VVE.set(0);
                                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Pw(), 1);
                                lk(2);
                            }
                        } else if (i == 0) {
                            com.bytedance.sdk.component.lc.Lxb.LD.ZU zu3 = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                            zu3.LD = false;
                            zu3.lk = true;
                            if (this.NXR.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.OY < MBInterstitialActivity.WEB_LOAD_TIME) {
                                return;
                            }
                            this.OY = System.currentTimeMillis();
                            if (this.NXR.hasMessages(2)) {
                                this.NXR.removeMessages(2);
                            }
                            Lxb(3, MBInterstitialActivity.WEB_LOAD_TIME);
                        } else if (i == 200) {
                            zu = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                            if (!zu.LD) {
                                zu.LD = false;
                                zu.lk = false;
                                if (this.NXR.hasMessages(2)) {
                                    this.NXR.removeMessages(2);
                                }
                                if (this.NXR.hasMessages(3)) {
                                    this.NXR.removeMessages(3);
                                }
                                this.OY = 0L;
                                this.ebl = 0L;
                                this.IeN.set(0);
                                this.VVE.set(0);
                                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Pw(), 1);
                                lk(2);
                            } else {
                                zu.LD = false;
                                zu.lk = false;
                                if (this.NXR.hasMessages(2)) {
                                    this.NXR.removeMessages(2);
                                }
                                if (this.NXR.hasMessages(3)) {
                                    this.NXR.removeMessages(3);
                                }
                                this.OY = 0L;
                                this.ebl = 0L;
                                this.IeN.set(0);
                                this.VVE.set(0);
                                com.bytedance.sdk.component.lc.Lxb.lk.LD.Lxb(com.bytedance.sdk.component.lc.Lxb.LD.ZU.ZU.Pw(), 1);
                                lk(2);
                            }
                        } else if (i == 509) {
                            com.bytedance.sdk.component.lc.Lxb.LD.ZU zu4 = com.bytedance.sdk.component.lc.Lxb.LD.ZU.Lxb;
                            zu4.LD = true;
                            zu4.lk = false;
                            if (this.NXR.hasMessages(2)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.ebl < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                return;
                            }
                            this.ebl = System.currentTimeMillis();
                            if (this.NXR.hasMessages(3)) {
                                this.NXR.removeMessages(3);
                            }
                            Lxb(2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                        }
                        if (this.lc == 2) {
                            this.lk.notify();
                        }
                        this.JXs.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void Lxb(int i, long j) {
        if (this.NXR == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.NXR.sendMessageDelayed(messageObtain, ((long) (((this.IeN.incrementAndGet() - 1) % 4) + 1)) * j);
        } else if (i == 3) {
            this.NXR.sendMessageDelayed(messageObtain, ((long) (((this.VVE.incrementAndGet() - 1) % 4) + 1)) * j);
        }
    }
}
