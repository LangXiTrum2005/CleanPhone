package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final String l = "e";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f33923m = "roas";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile e f33924n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f33925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BatchReportDao f33926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33927c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f33928d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33929e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f33930f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33931g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f33932h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f33933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Stack<Long> f33934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f33935k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Bundle data = message.getData();
                if (e.this.f33933i == null || e.this.f33926b == null || data == null) {
                    return;
                }
                e.this.f33933i.removeMessages(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<BatchReportMessage> batchReportMessages = e.this.f33926b.getBatchReportMessages(jCurrentTimeMillis, 2);
                e.this.b(batchReportMessages, jCurrentTimeMillis);
                e.this.f33925a.set(0);
                String str = e.l;
                StringBuilder sb2 = new StringBuilder("超时上报触发了，需要上报的数据： ");
                sb2.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                q0.a(str, sb2.toString());
                return;
            }
            if (i10 == 2) {
                Bundle data2 = message.getData();
                if (e.this.f33933i == null || e.this.f33926b == null || data2 == null) {
                    return;
                }
                e.this.f33933i.removeMessages(1);
                long j10 = data2.getLong("last_report_time");
                ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f33926b.getBatchReportMessages(j10, 2);
                e.this.b(batchReportMessages2, j10);
                String str2 = e.l;
                StringBuilder sb3 = new StringBuilder("队列上报触发了，需要上报的数据： ");
                sb3.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                q0.a(str2, sb3.toString());
                return;
            }
            if (i10 == 3) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    e.this.a((ArrayList<BatchReportMessage>) data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            Bundle data4 = message.getData();
            if (e.this.f33933i == null || e.this.f33926b == null || data4 == null || !e.this.f33931g) {
                return;
            }
            e.this.f33933i.removeMessages(4);
            ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f33926b.getBatchReportMessages(System.currentTimeMillis(), 2);
            if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                for (int i11 = 0; i11 < batchReportMessages3.size(); i11++) {
                    BatchReportMessage batchReportMessage = batchReportMessages3.get(i11);
                    e.this.a(batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                }
            }
            String str3 = e.l;
            StringBuilder sb4 = new StringBuilder("切换上报lib，需要上报的数据： ");
            sb4.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
            q0.a(str3, sb4.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.foundation.same.report.net.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f33937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f33938c;

        public b(long j10, ArrayList arrayList) {
            this.f33937b = j10;
            this.f33938c = arrayList;
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void a(String str) {
            Stack stack;
            f2.z("批量上报失败： ", str, e.l);
            e.this.a(2, str);
            synchronized (e.this.f33934j) {
                try {
                    e.this.f33934j.add(Long.valueOf(this.f33937b));
                    if (e.this.f33926b != null) {
                        e.this.f33926b.updateMessagesReportState(this.f33938c);
                    }
                    if (e.this.f33934j.size() >= 5) {
                        q0.a(e.l, "批量上报失败，上报失败的数据超过阈值");
                        try {
                            try {
                                e.this.f33934j.pop();
                                long jLongValue = ((Long) e.this.f33934j.pop()).longValue();
                                e.this.f33934j.clear();
                                if (e.this.f33926b != null) {
                                    e.this.f33926b.deleteBatchReportMessagesByTimestamp(jLongValue);
                                }
                                stack = e.this.f33934j;
                            } catch (Exception e10) {
                                q0.b(e.l, e10.getMessage());
                                stack = e.this.f33934j;
                            }
                            stack.clear();
                        } catch (Throwable th2) {
                            e.this.f33934j.clear();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void b(String str) {
            q0.a(e.l, "批量上报成功");
            e.this.a(1, "");
            try {
                if (e.this.f33926b != null) {
                    e.this.f33926b.deleteBatchReportMessagesByTimestamp(this.f33937b);
                }
            } catch (Exception e10) {
                q0.b(e.l, e10.getMessage());
            }
            synchronized (e.this.f33934j) {
                e.this.f33934j.clear();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33940a;

        public c(String str) {
            this.f33940a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f33926b == null) {
                return;
            }
            q0.a(e.l, "接收到上报数据： " + this.f33940a);
            if (!e.this.f33931g) {
                if (e.this.f33930f != 1) {
                    e.this.c(this.f33940a);
                }
            } else {
                e.this.a(this.f33940a, 0L);
                if (((Integer) y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 0)).intValue() == 0) {
                    y0.b(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 1);
                    e.this.f33933i.sendEmptyMessage(4);
                }
            }
        }
    }

    private e() {
        d();
    }

    public static synchronized e c() {
        try {
            if (f33924n == null) {
                f33924n = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33924n;
    }

    private void d() {
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.setting.g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
        if (gVarI != null && (aVarJ = gVarI.j()) != null) {
            this.f33927c = aVarJ.a();
            this.f33928d = ((long) aVarJ.c()) * 1000;
            this.f33929e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;
            this.f33930f = aVarJ.b();
            boolean z10 = aVarJ.d() == 1;
            this.f33931g = z10;
            if (z10 && this.f33930f != 1) {
                int iB = s0.a().b("bcp", "type", s0.a().b("t_r_t", 1));
                if (iB != 0 && iB != 1) {
                    iB = 0;
                }
                this.f33935k = com.mbridge.msdk.tracker.m.a(f33923m, com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a());
                JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
                try {
                    jSONObjectB.put("device_type", m0.F(com.mbridge.msdk.foundation.controller.c.n().d()) ? "pad" : "phone");
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectB.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f33885j, m0.w());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f33935k.a(jSONObjectB);
                this.f33935k.h();
            }
        }
        q0.a(l, "初始化批量上报： " + this.f33929e + " " + this.f33927c + " " + this.f33928d + " " + this.f33930f);
        this.f33925a = new AtomicInteger(0);
        this.f33934j = new Stack<>();
        this.f33926b = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.n().d());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f33933i = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j10);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        this.f33933i.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f33926b.addReportMessage(str, 2);
        Handler handler = this.f33933i;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.f33933i.sendMessageDelayed(messageObtain, this.f33928d);
        }
        if (this.f33925a.incrementAndGet() < this.f33927c || this.f33933i == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        this.f33933i.sendMessage(messageObtain2);
        this.f33925a.set(0);
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().l, com.mbridge.msdk.foundation.same.net.utils.d.h().f33865p);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.utils.d.h().O, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList != null && arrayList.size() > 0) {
            q0.a(l, "需要上报的数据条数： " + arrayList.size());
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = j.a(contextD);
            eVarA.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
            eVarA.a("m_sdk", "msdk");
            eVarA.a("lqswt", String.valueOf(1));
            eVarA.a("device_type", m0.F(contextD) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVarA.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33885j, m0.w());
            }
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    BatchReportMessage batchReportMessage = arrayList.get(i10);
                    if (batchReportMessage != null) {
                        sb2.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i10 >= 0 && i10 < size - 1) {
                            sb2.append("\n");
                        }
                    }
                } catch (Throwable th2) {
                    q0.b(l, th2.getMessage());
                }
            }
            try {
                String strEncode = URLEncoder.encode(sb2.toString(), B5.O);
                eVarA.a("data", strEncode);
                q0.a(l, "需要批量上报的数据： " + strEncode);
                com.mbridge.msdk.foundation.same.report.net.a aVar = new com.mbridge.msdk.foundation.same.report.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
                a(0, "");
                aVar.post(0, this.f33929e, eVarA, new b(j10, arrayList), "roas", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Exception e10) {
                q0.b(l, e10.getMessage());
                return;
            }
        }
        q0.a(l, "需要上报的数据条数： 0");
    }

    public void b() {
        Handler handler = this.f33933i;
        if (handler == null || handler.hasMessages(1) || this.f33930f == 1 || this.f33931g) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f33933i.sendMessageDelayed(messageObtain, 5000L);
    }

    public synchronized void b(String str) {
        Executor executor;
        try {
            if (this.f33930f == 1) {
                return;
            }
            c cVar = new c(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e() && (executor = this.f33932h) != null) {
                executor.execute(cVar);
            } else {
                cVar.run();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10) {
        if (this.f33935k != null) {
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("roas");
            eVar.a(true);
            if (j10 != 0) {
                eVar.c(j10);
            }
            eVar.a(1);
            try {
                eVar.a(a(str));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f33935k.d(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("state", Integer.valueOf(i10));
        if (i10 == 2) {
            eVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a("m_ad_rev_s_s", eVar);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_ad_rev_s_s", cVar);
    }

    private JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(X3.j.f27832c)) {
                    String[] strArrSplit = str2.split(X3.j.f27830b);
                    if (strArrSplit.length == 2) {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
