package com.bytedance.sdk.component.di.ri.lr.lr;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.sdk.component.di.ri.fi;
import com.bytedance.sdk.component.di.ri.ri.ka;
import com.bytedance.sdk.component.di.ri.xha;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3414a2;
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
public class ik extends HandlerThread implements Handler.Callback {
    private static int bu = 10;
    private static int tan = 200;
    private final int ac;
    private volatile Handler aw;
    private final List<com.bytedance.sdk.component.di.ri.ka.ri> bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final AtomicInteger f18046co;
    private volatile int di;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.di.ri.ka.ri> fi;
    private final int ihz;
    private final Object ik;
    private final AtomicInteger jbs;
    private com.bytedance.sdk.component.di.ri.lr.ik ka;
    private volatile boolean lr;
    private volatile long mj;
    private long nr;
    private final long qt;
    protected ka ri;
    private final long sf;
    private final AtomicInteger slm;
    private final int uq;
    private final AtomicInteger vr;
    private volatile long xha;

    public ik(PriorityBlockingQueue<com.bytedance.sdk.component.di.ri.ka.ri> priorityBlockingQueue) {
        super("csj_log");
        this.lr = true;
        this.ik = new Object();
        this.xha = 0L;
        this.mj = 0L;
        this.jbs = new AtomicInteger(0);
        this.qt = 5000L;
        this.sf = 5000000000L;
        this.f18046co = new AtomicInteger(0);
        this.bgr = new ArrayList();
        this.vr = new AtomicInteger(0);
        this.slm = new AtomicInteger(0);
        this.nr = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.ac = 1;
        this.ihz = 2;
        this.uq = 3;
        this.fi = priorityBlockingQueue;
        this.ri = new com.bytedance.sdk.component.di.ri.ri.lr();
        if (com.bytedance.sdk.component.di.ri.lr.lr()) {
            return;
        }
        long jCo = xha.di().vr().co();
        if (jCo > 0) {
            this.nr = jCo;
        }
    }

    private void di() {
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.uq(), 1);
        ri(false);
        com.bytedance.sdk.component.di.ri.lr.ka.ri.ik();
    }

    private void fi() {
        while (ri()) {
            try {
                com.bytedance.sdk.component.di.ri.lr.ri.ri riVar = com.bytedance.sdk.component.di.ri.lr.ka.ka;
                com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.mj(), 1);
                com.bytedance.sdk.component.di.ri.ka.ri riVarPoll = this.fi.poll(this.nr, TimeUnit.MILLISECONDS);
                int size = this.fi.size();
                if (riVarPoll instanceof com.bytedance.sdk.component.di.ri.ka.lr) {
                    ri(riVarPoll, size);
                } else if (riVarPoll == null) {
                    int iIncrementAndGet = this.jbs.incrementAndGet();
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.feb(), 1);
                    if (ka(iIncrementAndGet)) {
                        di();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.di = 1;
                        lr((com.bytedance.sdk.component.di.ri.ka.ri) null);
                    }
                } else {
                    ri(riVarPoll);
                    lr(riVarPoll);
                }
            } catch (Throwable th) {
                th.getMessage();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.qd(), 1);
            }
        }
    }

    private void ik() {
        ka();
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.pv(), 1);
        ik(1);
    }

    private void jbs() {
        try {
            if (this.fi.size() == 0 && this.aw.hasMessages(11) && ri()) {
                ri(false);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void ka() {
        if (!isAlive()) {
            com.bytedance.sdk.component.di.ri.lr.ka.ri.ka();
        } else {
            if (ri()) {
                return;
            }
            ik(6);
        }
    }

    private boolean mj() {
        if (com.bytedance.sdk.component.di.ri.lr.ka.ri.lr) {
            return this.di == 4 || this.di == 7 || this.di == 6 || this.di == 5 || this.di == 2;
        }
        return false;
    }

    private void qt() {
        if (this.aw.hasMessages(11)) {
            jbs();
        } else {
            fi(1);
        }
        com.bytedance.sdk.component.di.ri.lr.ri.ri riVar = com.bytedance.sdk.component.di.ri.lr.ka.ka;
        com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.lr(), 1);
        if (this.di != 2) {
            return;
        }
        com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.xha(), 1);
        synchronized (this.ik) {
            try {
                try {
                    long jNanoTime = System.nanoTime();
                    this.ik.wait(5000L);
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    com.bytedance.sdk.component.di.ri.lr.ka kaVar = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                    if (!kaVar.lr) {
                        boolean z = kaVar.ik;
                    }
                    if (jNanoTime2 < 5000000000L && 5000000000L - jNanoTime2 >= 50000000) {
                        if (!kaVar.lr && !kaVar.ik) {
                            com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.ig(), 1);
                            ik(2);
                            return;
                        }
                        com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.sf(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.qt(), 1);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void xha() {
        if (this.fi.size() >= 100) {
            for (int i = 0; i < 100; i++) {
                com.bytedance.sdk.component.di.ri.ka.ri riVarPoll = this.fi.poll();
                if (!(riVarPoll instanceof com.bytedance.sdk.component.di.ri.ka.lr) && riVarPoll != null) {
                    ri(riVarPoll);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.jbs(), 1);
                lr();
                ri(true);
                fi();
            } else {
                if (i != 2 && i != 3) {
                    if (i == 11) {
                        ArrayList arrayList = new ArrayList(this.bgr);
                        this.bgr.clear();
                        ri((List<com.bytedance.sdk.component.di.ri.ka.ri>) arrayList, false, "timeout_dispatch");
                        qt();
                    }
                    return true;
                }
                ik();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.aw = new Handler(getLooper(), this);
        com.bytedance.sdk.component.di.ri.lr.ka.ri.ri(this.aw);
        this.aw.sendEmptyMessage(1);
    }

    public static void lr(int i) {
        tan = i;
    }

    private void lr() {
        long jSlm = xha.di().slm();
        if (jSlm <= 0) {
            return;
        }
        this.ri.ri(Integer.MAX_VALUE, jSlm);
    }

    public static void ri(int i) {
        bu = i;
    }

    public void ik(int i) {
        try {
            boolean zRi = ri(i, com.bytedance.sdk.component.di.ri.lr.ka.ri.lr);
            if (i != 6 && !zRi) {
                return;
            }
            com.bytedance.sdk.component.di.ri.ka.lr lrVar = new com.bytedance.sdk.component.di.ri.ka.lr();
            lrVar.ri(i);
            this.fi.add(lrVar);
            fi(3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean ka(int i) {
        if (i < 4 || this.f18046co.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.di.ri.lr.ka kaVar = com.bytedance.sdk.component.di.ri.lr.ka.ri;
        return (kaVar.lr || kaVar.ik) ? false : true;
    }

    private void lr(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        List<com.bytedance.sdk.component.di.ri.ka.ri> listRi;
        if (com.bytedance.sdk.component.di.ri.ik.ri.lr() && xha.di().ri()) {
            return;
        }
        int i = 0;
        if (mj()) {
            com.bytedance.sdk.component.di.ri.ik.ri.ri(this.di);
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.co(), 1);
            if (this.fi.size() != 0) {
                return;
            }
            if (!this.aw.hasMessages(2)) {
                com.bytedance.sdk.component.di.ri.lr.ka.ri.lr = false;
                this.mj = 0L;
                this.xha = 0L;
                this.vr.set(0);
                this.slm.set(0);
            } else {
                ri(false);
                return;
            }
        }
        do {
            boolean zRi = ri(this.di, com.bytedance.sdk.component.di.ri.lr.ka.ri.lr);
            com.bytedance.sdk.component.di.ri.ik.ri.ri(zRi, this.di, riVar);
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.aw(), 1);
            if (zRi && (listRi = this.ri.ri(this.di, -1, null)) != null) {
                listRi.size();
                ri(listRi);
            } else {
                jbs();
            }
            i++;
            if (!zRi) {
                return;
            }
        } while (i <= 6);
    }

    public void ri(boolean z) {
        this.lr = z;
    }

    public boolean ri() {
        return this.lr;
    }

    public boolean ri(int i, boolean z) {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || !fiVarVr.ri(xha.di().fi())) {
            return false;
        }
        return this.ri.ri(i, z);
    }

    public void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, boolean z) {
        if (riVar == null) {
            return;
        }
        riVar.ka();
        if (z) {
            if (this.aw != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(riVar);
                ri((List<com.bytedance.sdk.component.di.ri.ka.ri>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.fi.add(riVar);
        fi(2);
    }

    private void fi(int i) {
        if (!ri()) {
            if (this.aw == null) {
                return;
            }
            com.bytedance.sdk.component.di.ri.lr.ri.ri riVar = com.bytedance.sdk.component.di.ri.lr.ka.ka;
            com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.ik(), 1);
            if (this.aw.hasMessages(1)) {
                return;
            }
            if (i == 1) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.di(), 1);
            } else if (i == 2) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.ka(), 1);
            } else if (i == 3) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(riVar.fi(), 1);
            }
            this.aw.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.ri(), 1);
    }

    private void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar, int i) {
        this.jbs.set(0);
        if (i == 0) {
            this.di = ((com.bytedance.sdk.component.di.ri.ka.lr) riVar).qt();
            if (this.di != 6) {
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.kt(), 1);
                lr(riVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.di.ri.ka.lr lrVar = (com.bytedance.sdk.component.di.ri.ka.lr) riVar;
        if (lrVar.qt() == 1) {
            this.di = 1;
            lr(riVar);
        } else if (lrVar.qt() == 2) {
            xha();
            this.di = 2;
            lr(riVar);
        }
    }

    private void lr(List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        this.bgr.addAll(list);
        this.bgr.size();
        fi fiVarVr = xha.di().vr();
        if (fiVarVr != null && fiVarVr.sf() != null) {
            bu = fiVarVr.sf().lr();
        }
        if (this.bgr.size() >= bu) {
            if (this.aw.hasMessages(11)) {
                this.aw.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.bgr);
            this.bgr.clear();
            ri((List<com.bytedance.sdk.component.di.ri.ka.ri>) arrayList, false, "max_size_dispatch");
            qt();
            return;
        }
        if (this.fi.size() == 0) {
            ri(false);
            if (this.aw.hasMessages(11)) {
                this.aw.removeMessages(11);
            }
            if (this.aw.hasMessages(1)) {
                this.aw.removeMessages(1);
            }
            long jRi = tan;
            if (fiVarVr != null && fiVarVr.sf() != null) {
                jRi = fiVarVr.sf().ri();
            }
            this.aw.sendEmptyMessageDelayed(11, jRi);
            return;
        }
        this.bgr.size();
    }

    private void ri(com.bytedance.sdk.component.di.ri.ka.ri riVar) {
        this.jbs.set(0);
        com.bytedance.sdk.component.di.ri.lr.ka kaVar = com.bytedance.sdk.component.di.ri.lr.ka.ri;
        if (kaVar.lr) {
            this.di = 5;
        } else if (kaVar.ik) {
            this.di = 7;
        } else {
            this.di = 4;
        }
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.siy(), 1);
        this.ri.ri(riVar, this.di);
        com.bytedance.sdk.component.di.ri.ik.ri.xha(riVar);
    }

    private void ri(List<com.bytedance.sdk.component.di.ri.ka.ri> list, String str) {
        ri(str);
        ri(list, false, str);
        qt();
    }

    private void ri(List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.di.ri.ik.ri.ri(list, this.fi.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.di.ri.ik.ri.ik()) {
                com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(0);
                if (riVar != null) {
                    if (riVar.fi() == 1) {
                        ri(list, "highPriority");
                        return;
                    }
                    if (riVar.ka() == 0 && riVar.fi() == 2) {
                        if (riVar.lr() == 3) {
                            ri(list, "version_v3");
                            return;
                        } else {
                            lr(list);
                            return;
                        }
                    }
                    if (riVar.ka() == 1) {
                        ri(list, "stats");
                        return;
                    } else if (riVar.ka() == 3) {
                        ri(list, "adType_v3");
                        return;
                    } else {
                        if (riVar.ka() == 2) {
                            ri(list, C3414a2.d);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            ri(list, "batchRead");
            return;
        }
        jbs();
    }

    private void lr(List<com.bytedance.sdk.component.di.ri.ka.ri> list, final boolean z, final long j) {
        this.f18046co.incrementAndGet();
        com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.aac(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.di.ri.ka.ri> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.di.ri.ka.ri next = it.next();
                int iJbs = next == null ? 0 : next.jbs();
                if (map.get(Integer.valueOf(iJbs)) == null) {
                    map.put(Integer.valueOf(iJbs), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(iJbs))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && xha.di().lr() != null && xha.di().lr().get(num) != null) {
                    xha.di().lr().get(num).ri(list, new com.bytedance.sdk.component.di.ri.lr.lr() { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.3
                        @Override // com.bytedance.sdk.component.di.ri.lr.lr
                        public void ri(List<ri> list2) {
                            try {
                                ik.this.f18046co.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    ri riVar = list2.get(i);
                                    if (riVar != null) {
                                        ik.this.ri(z, riVar.ri(), riVar.lr(), j);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.ka.ri(list, new com.bytedance.sdk.component.di.ri.lr.lr() { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.2
                        @Override // com.bytedance.sdk.component.di.ri.lr.lr
                        public void ri(List<ri> list2) {
                            try {
                                ik.this.f18046co.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    ri riVar = list2.get(i);
                                    if (riVar != null) {
                                        ik.this.ri(z, riVar.ri(), riVar.lr(), j);
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
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.qd(), 1);
            this.f18046co.decrementAndGet();
        }
    }

    private void ri(String str) {
        if (this.aw.hasMessages(11)) {
            this.aw.removeMessages(11);
        }
        if (this.bgr.size() != 0) {
            ArrayList arrayList = new ArrayList(this.bgr);
            this.bgr.clear();
            ri((List<com.bytedance.sdk.component.di.ri.ka.ri>) arrayList, false, "before_".concat(String.valueOf(str)));
            qt();
            arrayList.size();
        }
    }

    private void ri(List<com.bytedance.sdk.component.di.ri.ka.ri> list, boolean z, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.di.ri.ik.ri.ri(list, this.di, str);
        com.bytedance.sdk.component.di.ri.lr.ik ikVarXha = xha.di().xha();
        this.ka = ikVarXha;
        if (ikVarXha != null) {
            lr(list, z, jCurrentTimeMillis);
        } else {
            ri(list, z, jCurrentTimeMillis);
        }
    }

    private void ri(final List<com.bytedance.sdk.component.di.ri.ka.ri> list, final boolean z, final long j) {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr != null) {
            Executor executorFi = fiVarVr.fi();
            if (list.get(0).fi() == 1) {
                executorFi = fiVarVr.ka();
            }
            if (executorFi == null) {
                return;
            }
            this.f18046co.incrementAndGet();
            executorFi.execute(new com.bytedance.sdk.component.di.ri.fi.fi("csj_log_upload") { // from class: com.bytedance.sdk.component.di.ri.lr.lr.ik.1
                @Override // java.lang.Runnable
                public void run() {
                    ik ikVar = ik.this;
                    ikVar.ri((List<com.bytedance.sdk.component.di.ri.ka.ri>) list, z, j, ikVar.di);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(List<com.bytedance.sdk.component.di.ri.ka.ri> list, boolean z, long j, int i) {
        ik ikVar;
        Throwable th;
        lr lrVarRi;
        try {
            com.bytedance.sdk.component.di.ri.ka.ri riVar = list.get(0);
            com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.aac(), 1);
            try {
                if (riVar.ka() == 0) {
                    lrVarRi = xha.ka().ri(list);
                    ri(lrVarRi, list);
                    if (lrVarRi != null) {
                        com.bytedance.sdk.component.di.ri.ik.ri.ri(list, lrVarRi.ka);
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<com.bytedance.sdk.component.di.ri.ka.ri> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next().di());
                        }
                        jSONObject.put("stats_list", jSONArray);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    lrVarRi = xha.ka().ri(jSONObject);
                }
                lr lrVar = lrVarRi;
                this.f18046co.decrementAndGet();
                ikVar = this;
                try {
                    ikVar.ri(z, lrVar, list, j);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    th.getMessage();
                    com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.qd(), 1);
                    ikVar.f18046co.decrementAndGet();
                }
            } catch (Throwable th3) {
                th = th3;
                ikVar = this;
                th.getMessage();
                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.qd(), 1);
                ikVar.f18046co.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            ikVar = this;
        }
    }

    private void ri(lr lrVar, List<com.bytedance.sdk.component.di.ri.ka.ri> list) {
        if (lrVar == null || !lrVar.ri) {
            return;
        }
        List<Object> listRi = com.bytedance.sdk.component.di.ri.lr.ri();
        if (list == null || listRi == null || listRi.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.di.ri.ka.ri riVar : list) {
            if (riVar.fi() == 1) {
                com.bytedance.sdk.component.di.ri.ik.ri.ri(riVar);
                com.bytedance.sdk.component.di.ri.ik.ri.fi(riVar);
                Iterator<Object> it = listRi.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z, lr lrVar, List<com.bytedance.sdk.component.di.ri.ka.ri> list, long j) {
        if (z || lrVar == null) {
            return;
        }
        int i = lrVar.lr;
        int i2 = -2;
        if (lrVar.fi) {
            i = -1;
        } else if (i < 0) {
            i = -2;
        }
        if (i == 510 || i == 511) {
            i = -2;
        }
        if (lrVar.ri || ((i < 500 || i >= 509) && i <= 513 && i != 404)) {
            i2 = i;
        }
        if (list != null) {
            list.size();
            this.f18046co.get();
        }
        ri(i2, list, j);
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
    private void ri(int i, List<com.bytedance.sdk.component.di.ri.ka.ri> list, long j) {
        com.bytedance.sdk.component.di.ri.lr.ka kaVar;
        synchronized (this.ik) {
            if (list != null) {
                try {
                    if (this.aw != null) {
                        com.bytedance.sdk.component.di.ri.ik.ri.ri(i, list, j);
                        this.ri.ri(i, list);
                        xha.di().vr();
                        if (i == -2) {
                            com.bytedance.sdk.component.di.ri.lr.ka kaVar2 = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                            kaVar2.lr = false;
                            kaVar2.ik = true;
                            if (this.aw.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.mj < 15000) {
                                return;
                            }
                            this.mj = System.currentTimeMillis();
                            if (this.aw.hasMessages(2)) {
                                this.aw.removeMessages(2);
                            }
                            ri(3, 15000L);
                        } else if (i == -1) {
                            kaVar = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                            if (!kaVar.lr || kaVar.ik) {
                                kaVar.lr = false;
                                kaVar.ik = false;
                                if (this.aw.hasMessages(2)) {
                                    this.aw.removeMessages(2);
                                }
                                if (this.aw.hasMessages(3)) {
                                    this.aw.removeMessages(3);
                                }
                                this.mj = 0L;
                                this.xha = 0L;
                                this.vr.set(0);
                                this.slm.set(0);
                                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.srn(), 1);
                                ik(2);
                            }
                        } else if (i == 0) {
                            com.bytedance.sdk.component.di.ri.lr.ka kaVar3 = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                            kaVar3.lr = false;
                            kaVar3.ik = true;
                            if (this.aw.hasMessages(3)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.mj < 15000) {
                                return;
                            }
                            this.mj = System.currentTimeMillis();
                            if (this.aw.hasMessages(2)) {
                                this.aw.removeMessages(2);
                            }
                            ri(3, 15000L);
                        } else if (i == 200) {
                            kaVar = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                            if (!kaVar.lr) {
                                kaVar.lr = false;
                                kaVar.ik = false;
                                if (this.aw.hasMessages(2)) {
                                    this.aw.removeMessages(2);
                                }
                                if (this.aw.hasMessages(3)) {
                                    this.aw.removeMessages(3);
                                }
                                this.mj = 0L;
                                this.xha = 0L;
                                this.vr.set(0);
                                this.slm.set(0);
                                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.srn(), 1);
                                ik(2);
                            } else {
                                kaVar.lr = false;
                                kaVar.ik = false;
                                if (this.aw.hasMessages(2)) {
                                    this.aw.removeMessages(2);
                                }
                                if (this.aw.hasMessages(3)) {
                                    this.aw.removeMessages(3);
                                }
                                this.mj = 0L;
                                this.xha = 0L;
                                this.vr.set(0);
                                this.slm.set(0);
                                com.bytedance.sdk.component.di.ri.ik.lr.ri(com.bytedance.sdk.component.di.ri.lr.ka.ka.srn(), 1);
                                ik(2);
                            }
                        } else if (i == 509) {
                            com.bytedance.sdk.component.di.ri.lr.ka kaVar4 = com.bytedance.sdk.component.di.ri.lr.ka.ri;
                            kaVar4.lr = true;
                            kaVar4.ik = false;
                            if (this.aw.hasMessages(2)) {
                                return;
                            }
                            if (System.currentTimeMillis() - this.xha < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                                return;
                            }
                            this.xha = System.currentTimeMillis();
                            if (this.aw.hasMessages(3)) {
                                this.aw.removeMessages(3);
                            }
                            ri(2, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                        }
                        if (this.di == 2) {
                            this.ik.notify();
                        }
                        this.fi.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void ri(int i, long j) {
        if (this.aw == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        if (i == 2) {
            this.aw.sendMessageDelayed(messageObtain, ((long) (((this.vr.incrementAndGet() - 1) % 4) + 1)) * j);
        } else if (i == 3) {
            this.aw.sendMessageDelayed(messageObtain, ((long) (((this.slm.incrementAndGet() - 1) % 4) + 1)) * j);
        }
    }
}
