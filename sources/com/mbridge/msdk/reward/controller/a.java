package com.mbridge.msdk.reward.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String f35412b0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String f35413c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f35414d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f35415e0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f35416f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f35419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f35420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f35421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f35422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h f35423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f35425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f35426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f35427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f35428k;
    private volatile String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35429m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35435s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f35440x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35430n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35432p = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f35436t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f35437u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35438v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f35439w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f35441y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f35442z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    int F = 25;
    int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    volatile boolean U = false;
    volatile boolean V = false;
    volatile boolean W = false;
    volatile boolean X = false;
    volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f35418a0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f35431o = new com.mbridge.msdk.reward.controller.b(this);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35467e;

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f35464b = campaignEx;
            this.f35465c = copyOnWriteArrayList;
            this.f35466d = z10;
            this.f35467e = i10;
            this.f35463a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.j().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f35463a == null) {
                this.f35463a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f35463a.b(this.f35465c);
            this.f35463a.a(bVar);
            if (!this.f35466d && a.this.f35423f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f35423f.b(bVar, this.f35463a);
                return;
            }
            if (this.f35467e != 1 || a.this.X || a.this.f35423f == null) {
                return;
            }
            a.this.X = true;
            a.this.f35423f.b(bVar, this.f35463a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f35425h);
                }
            } catch (Throwable unused) {
                q0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f35482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f35485d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f35487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f35488g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f35482a = cVar;
            this.f35483b = i10;
            this.f35484c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f35487f = str;
            this.f35488g = cVar2;
        }

        public void a() {
            this.f35485d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35485d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f35482a;
            if (cVar != null) {
                cVar.c(true);
            }
            q0.b("RewardVideoController", "adSource=" + this.f35483b + " CommonCancelTimeTask mIsDevCall：" + this.f35484c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f35488g);
        }

        public void a(int i10) {
            this.f35486e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f35490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f35492c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f35490a = cVar;
            this.f35491b = z10;
        }

        public void a(f fVar) {
            this.f35492c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f35492c;
            if (fVar != null) {
                fVar.a();
                a.this.f35431o.removeCallbacks(this.f35492c);
            }
            if (a.this.f35423f != null) {
                a.this.f35423f.a(a.this.l, a.this.f35425h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f35492c;
            if (fVar != null) {
                fVar.a();
                a.this.f35431o.removeCallbacks(this.f35492c);
            }
            a.this.a(list);
            if (a.this.f35423f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f35417a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f35418a0 <= 1) {
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                            if (cVar != null) {
                                cVar.a(bVarA);
                                cVar.b(true);
                            }
                            a.this.f35423f.a(bVarA, cVar);
                            return;
                        }
                        a.m(a.this);
                        return;
                    }
                }
                a.this.f35423f.c(a.this.l, a.this.f35425h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f35492c;
            if (fVar != null) {
                fVar.a();
                a.this.f35431o.removeCallbacks(this.f35492c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f35490a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f35490a = null;
            }
            a.this.a(list);
            if (a.this.f35423f != null) {
                a.this.f35423f.a(bVar, cVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f35494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f35495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f35496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f35498e;

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0164a c0164a) {
            this(interVideoOutListener, handler, str);
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f35496c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f35495b.get() == 2 || this.f35496c == null) {
                return;
            }
            a.m(a.this);
            this.f35495b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f35496c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f35496c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f35495b.get() == 2 || this.f35496c == null) {
                return;
            }
            if (this.f35495b.get() == 1) {
                this.f35495b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f35496c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f35495b.set(2);
            }
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f35494a = new WeakReference<>(interVideoOutListener);
            this.f35495b = new AtomicInteger(0);
            this.f35496c = handler;
            this.f35497d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f35496c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f35496c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f35495b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f35495b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f35495b.get() != 1 && this.f35495b.get() != 3) || this.f35496c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f35496c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f35496c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.t());
                    messageObtain.setData(bundle);
                }
                this.f35496c.sendMessage(messageObtain);
            }
        }

        public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strL;
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2;
            CampaignEx campaignEx;
            if (bVar != null && cVar != null) {
                strL = bVar.l();
                cVar.a(bVar);
            } else {
                strL = "";
            }
            if (a.this.f35419b == null || a.this.f35418a0 != 1) {
                cVar2 = cVar;
            } else {
                a.this.f35419b.a(a.this.f35427j);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListF = a.this.f35419b.f();
                CampaignEx campaignEx2 = (a.this.H == null || a.this.H.size() == 0) ? null : (CampaignEx) a.this.H.get(0);
                if (campaignEx2 != null) {
                    campaignEx = campaignEx2;
                } else if (copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0) {
                    campaignEx = null;
                } else {
                    campaignEx2 = copyOnWriteArrayListF.get(0);
                    campaignEx = campaignEx2;
                }
                if (a.this.f35437u && ((campaignEx == null || TextUtils.isEmpty(campaignEx.getNLRid())) && (copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0))) {
                    cVar2 = cVar;
                    if (a.this.f35419b.a(campaignEx, true, bVar, 2, cVar2)) {
                        return;
                    }
                } else {
                    cVar2 = cVar;
                }
                a.this.f35419b.a((com.mbridge.msdk.reward.adapter.a) null);
            }
            Handler handler = this.f35496c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f35495b.get() == 2 || this.f35496c == null) {
                return;
            }
            a.this.P = true;
            if (!a.this.R || strL.contains("resource load timeout")) {
                a.this.Q = true;
            }
            if (a.this.O) {
                this.f35495b.set(2);
            }
            if (a.this.P && a.this.Q && !a.this.O) {
                if (a.this.f35418a0 > 1) {
                    a.m(a.this);
                    a.this.f35419b.a(a.this.f35427j);
                    return;
                }
                this.f35495b.set(2);
                a.this.a("2000047", cVar2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar2.t());
                        messageObtain.setData(bundle);
                    }
                    this.f35496c.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strL;
            WeakReference<InterVideoOutListener> weakReference = this.f35494a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f35495b.get() == 2 || this.f35496c == null) {
                return;
            }
            a.this.Q = true;
            if (bVar != null) {
                strL = bVar.l();
            } else {
                strL = "";
            }
            if (strL.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f35495b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f35496c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f35495b.set(2);
            b(str, cVar);
        }

        public void a(boolean z10) {
            this.f35498e = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f35500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f35501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35502e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0171a implements Runnable {
            public RunnableC0171a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f35500c != null) {
                    i.this.f35500c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f35436t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f35425h, true, 1));
                }
            }
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0164a c0164a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f35500c;
                if (aVar == null || aVar.f35422e == null) {
                    return;
                }
                try {
                    this.f35500c.f35422e.onVideoComplete(a.this.f35426i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f35502e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f35500c = null;
        }

        private i(a aVar, Handler handler) {
            this.f35502e = 0;
            this.f35500c = aVar;
            this.f35501d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a aVar = a.this;
            aVar.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar2 = new com.mbridge.msdk.reward.candidate.a(aVar.f35425h, a.this.f35436t);
                a aVar3 = this.f35500c;
                aVar2.a(cVar.t(), (aVar3 == null || aVar3.f35419b == null) ? "" : this.f35500c.f35419b.H, 3, a.f35412b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar4 = this.f35500c;
                if (aVar4 != null) {
                    aVar4.C = true;
                    if (this.f35500c.f35419b != null) {
                        this.f35500c.f35419b.H = "";
                    }
                    this.f35500c.q();
                    if (a.this.f35437u) {
                        a.this.a();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", cVar, aVar5.f35422e, "");
                    b();
                    if (this.f35500c.f35422e != null) {
                        this.f35500c.f35422e.onAdShow(a.this.f35426i);
                        this.f35502e = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f35500c;
                if (aVar != null && aVar.f35422e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f35500c.f35429m);
                    }
                    if (a.this.f35437u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f35425h, a.this.m());
                    }
                    this.f35500c.f35422e.onAdClose(a.this.f35426i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f35502e = 7;
                    this.f35500c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f35500c != null) {
                    if (aVar.f35437u) {
                        a.this.a();
                    }
                    this.f35500c.C = false;
                    a.this.a("2000131", cVar, this.f35500c.f35422e, str);
                    a();
                    if (this.f35500c.f35422e != null) {
                        try {
                            this.f35500c.f35422e.onShowFail(cVar, a.this.f35426i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f35502e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f35502e = 0;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f35500c;
                if (aVar == null || aVar.f35422e == null) {
                    return;
                }
                if (a.this.f35437u) {
                    a.this.a();
                }
                this.f35500c.C = false;
                try {
                    this.f35500c.f35422e.onVideoAdClicked(z10, a.this.f35426i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f35500c;
                if (aVar == null || aVar.f35422e == null) {
                    return;
                }
                try {
                    this.f35500c.f35422e.onAdCloseWithIVReward(a.this.f35426i, new RewardInfo(z10, i10));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f35500c;
                if (aVar == null || aVar.f35422e == null) {
                    return;
                }
                try {
                    this.f35500c.f35422e.onEndcardShow(a.this.f35426i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f35502e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f35502e = i10;
            a aVar = this.f35500c;
            if (aVar == null || aVar.f35437u || this.f35500c.f35436t || this.f35500c.f35420c == null || !this.f35500c.f35420c.a(this.f35502e) || this.f35500c.f35423f == null || this.f35500c.f35423f.a() == 1 || this.f35500c.f35423f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f35502e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f35502e));
            int iF = this.f35500c.f35420c.f() * 1000;
            if (this.f35502e == 4) {
                iF = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            }
            Handler handler = this.f35501d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f35501d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0171a(), iF);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f35418a0++;
            a aVar = a.this;
            aVar.b(aVar.f35440x, str, cVar);
        }
    }

    public static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f35418a0;
        aVar.f35418a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f35417a)).b(this.f35425h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f35417a)).c(this.f35425h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f35425h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        com.mbridge.msdk.videocommon.a.e(this.f35425h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void f(boolean z10) {
        this.f35441y = z10;
    }

    public MBridgeIds g() {
        return this.f35426i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f35419b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f35423f;
    }

    public String l() {
        return this.l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f35419b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f35419b;
    }

    public InterVideoOutListener o() {
        return this.f35422e;
    }

    public String p() {
        return this.f35425h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f35437u;
    }

    public boolean s() {
        return this.f35440x;
    }

    public boolean t() {
        return this.f35436t;
    }

    public boolean u() {
        return (this.f35422e == null || this.f35423f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f35415e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f35415e0.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(v0.d());
            } else {
                strA = a(str);
            }
            this.A = strA;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(strA);
            cVar2.n(this.f35425h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (z10) {
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            }
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th2) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f35417a, this.l, this.f35425h);
        this.f35419b = cVar;
        cVar.d(this.f35436t);
        this.f35419b.e(this.f35437u);
        if (this.f35436t) {
            this.f35419b.a(this.f35433q, this.f35434r, this.f35435s);
        }
        this.f35419b.a(this.f35420c);
    }

    public void d(boolean z10) {
        this.f35436t = z10;
        if (z10) {
            this.f35432p = com.mbridge.msdk.foundation.same.a.f33715a0;
        } else {
            this.f35432p = com.mbridge.msdk.foundation.same.a.Z;
        }
    }

    public void e(boolean z10) {
        this.f35437u = z10;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f35471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f35472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f35473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35474f;

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f35470b = campaignEx;
            this.f35471c = copyOnWriteArrayList;
            this.f35472d = cVar;
            this.f35473e = z10;
            this.f35474f = i10;
            this.f35469a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f35431o == null) {
                return;
            }
            a.this.W = true;
            a.this.f35431o.post(new RunnableC0169a(str3, str, str2));
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.j().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f35469a == null) {
                this.f35469a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f35469a.a(bVar);
            this.f35469a.b(this.f35471c);
            a.this.V = false;
            if (a.this.f35423f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f35423f.b(bVar, this.f35469a);
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0169a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35478c;

            public RunnableC0169a(String str, String str2, String str3) {
                this.f35476a = str;
                this.f35477b = str2;
                this.f35478c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f35441y;
                Handler handler = a.this.f35431o;
                boolean z11 = a.this.f35436t;
                boolean z12 = a.this.f35437u;
                String str = this.f35476a;
                String requestIdNotice = d.this.f35470b.getRequestIdNotice();
                String str2 = this.f35477b;
                String str3 = this.f35478c;
                String cMPTEntryUrl = d.this.f35470b.getCMPTEntryUrl();
                int i10 = a.this.f35432p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f35470b, dVar.f35471c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f35470b.getCMPTEntryUrl()), this.f35478c, a.this.f35420c, new C0170a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C0170a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0170a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f35472d;
                    if (cVar != null && cVar.a(dVar.f35471c, dVar.f35473e, dVar.f35474f)) {
                        if (a.this.f35423f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f35471c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f35469a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f35471c);
                        }
                        a.this.f35423f.d(str2, str3, d.this.f35469a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f35469a == null) {
                        dVar4.f35469a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f35469a.b(dVar5.f35471c);
                    d.this.f35469a.a(bVarA);
                    a.this.f35423f.b(bVarA, d.this.f35469a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0169a runnableC0169a = RunnableC0169a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0169a.f35478c, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f35469a == null) {
                        dVar.f35469a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f35469a.b(dVar2.f35471c);
                    d.this.f35469a.a(bVar);
                    a.this.f35423f.b(bVar, d.this.f35469a);
                }
            }
        }
    }

    public void e() {
        o0.b();
    }

    private boolean d() {
        if (this.f35419b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f35419b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f35417a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.f35425h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.l = str;
            this.f35426i = new MBridgeIds(this.l, this.f35425h);
            this.f35421d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f35417a, this.f35425h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            q0.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public void a(int i10) {
        this.f35432p = i10;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f35425h);
            cVar.a(this.f35436t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            y0.b(this.f35417a, "MBridge_ConfirmTitle" + this.f35425h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            y0.b(this.f35417a, "MBridge_ConfirmContent" + this.f35425h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            y0.b(this.f35417a, "MBridge_CancelText" + this.f35425h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        y0.b(this.f35417a, "MBridge_ConfirmText" + this.f35425h, str3.trim());
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f35444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f35445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f35447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35448e;

        public b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f35445b = campaignEx;
            this.f35446c = z10;
            this.f35447d = cVar;
            this.f35448e = i10;
            this.f35444a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f35446c) {
                if (!a.this.V || a.this.W || a.this.f35431o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f35431o.post(new RunnableC0167b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f35431o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f35447d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f35446c, this.f35448e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f35423f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f35444a == null) {
                                this.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f35444a.b(a.this.S);
                            this.f35444a.a(bVarA);
                            a.this.f35423f.b(bVarA, this.f35444a);
                        }
                    } else if (a.this.f35423f != null && !a.this.Y) {
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f35444a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f35423f.d(str, str2, this.f35444a);
                    }
                } else {
                    a.this.f35431o.post(new RunnableC0165a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0165a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f35450a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f35451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35452c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f35453d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f35454e;

            public RunnableC0165a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f35450a = campaignEx;
                this.f35451b = copyOnWriteArrayList;
                this.f35452c = str;
                this.f35453d = str2;
                this.f35454e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f35441y, a.this.f35431o, a.this.f35436t, a.this.f35437u, null, this.f35450a.getRewardTemplateMode().j(), a.this.f35432p, b.this.f35445b, this.f35451b, H5DownLoadManager.getInstance().getH5ResAddress(this.f35450a.getRewardTemplateMode().j()), this.f35452c, this.f35453d, this.f35454e, this.f35450a.getRequestIdNotice(), a.this.f35420c, new C0166a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C0166a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0166a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    RunnableC0165a runnableC0165a = RunnableC0165a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f35447d;
                    if (cVar != null && cVar.a(runnableC0165a.f35451b, bVar.f35446c, bVar.f35448e)) {
                        if (a.this.f35423f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0165a runnableC0165a2 = RunnableC0165a.this;
                        a.this.a(runnableC0165a2.f35451b);
                        a.this.f35423f.d(str2, str3, b.this.f35444a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f35444a == null) {
                        bVar2.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0165a runnableC0165a3 = RunnableC0165a.this;
                    b.this.f35444a.b(runnableC0165a3.f35451b);
                    b.this.f35444a.a(bVarA);
                    a.this.f35423f.b(bVarA, b.this.f35444a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0165a runnableC0165a = RunnableC0165a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0165a.f35453d, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f35444a == null) {
                        bVar2.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f35444a.b(a.this.S);
                    b.this.f35444a.a(bVar);
                    a.this.f35423f.b(bVar, b.this.f35444a);
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0167b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f35457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f35458b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f35459c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f35460d;

            public RunnableC0167b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f35457a = str;
                this.f35458b = str2;
                this.f35459c = str3;
                this.f35460d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f35441y, a.this.f35431o, a.this.f35436t, a.this.f35437u, this.f35457a, b.this.f35445b.getRequestIdNotice(), this.f35458b, this.f35459c, b.this.f35445b.getCMPTEntryUrl(), a.this.f35432p, b.this.f35445b, this.f35460d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f35445b.getCMPTEntryUrl()), this.f35459c, a.this.f35420c, new C0168a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            public class C0168a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0168a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0209a c0209a) {
                    RunnableC0167b runnableC0167b = RunnableC0167b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f35447d;
                    if (cVar != null && cVar.a(runnableC0167b.f35460d, bVar.f35446c, bVar.f35448e)) {
                        if (a.this.f35423f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0167b runnableC0167b2 = RunnableC0167b.this;
                        a.this.a(runnableC0167b2.f35460d);
                        RunnableC0167b runnableC0167b3 = RunnableC0167b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f35444a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0167b3.f35460d);
                        }
                        a.this.f35423f.d(str2, str3, b.this.f35444a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f35444a == null) {
                        bVar2.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f35444a.a(bVarA);
                    RunnableC0167b runnableC0167b4 = RunnableC0167b.this;
                    b.this.f35444a.b(runnableC0167b4.f35460d);
                    a.this.f35423f.b(bVarA, b.this.f35444a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0209a c0209a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0167b runnableC0167b = RunnableC0167b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0167b.f35459c, (List<CampaignEx>) aVar.T);
                    if (a.this.f35423f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f35444a == null) {
                        bVar2.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0167b runnableC0167b2 = RunnableC0167b.this;
                    b.this.f35444a.b(runnableC0167b2.f35460d);
                    b.this.f35444a.a(bVar);
                    a.this.f35423f.b(bVar, b.this.f35444a);
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f35425h, (List<CampaignEx>) a.this.T);
            if (a.this.f35423f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f35444a == null) {
                this.f35444a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f35444a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f35444a.a(bVar);
            a.this.f35423f.b(bVar, this.f35444a);
        }
    }

    public boolean c(boolean z10) {
        try {
            if (c()) {
                if (z10) {
                    d("is_ready_start", "over cap check error");
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 10);
                    cVar.a("m_offer_ready", eVar);
                    a(false, cVar, (List<CampaignEx>) this.f35419b.h());
                }
            } else if (this.f35437u) {
                try {
                    return a(z10);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } else {
                return d();
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
        return false;
    }

    public void a(int i10, int i11, int i12) {
        this.f35433q = i10;
        this.f35434r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f35435s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f35435s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.i.b().i(this.f35425h, jSONObject.toString());
        } catch (Exception unused) {
            q0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f35423f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f35423f.a(strB, cVar);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class C0164a implements com.mbridge.msdk.videocommon.net.c {
        public C0164a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f35420c == null) {
                this.f35420c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f35425h, this.f35436t);
            }
            return hVarA != null && hVarA.a(this.f35425h, this.f35420c.k());
        } catch (Throwable unused) {
            q0.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f35414d0 == null || !a1.b(str)) {
                return;
            }
            f35414d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f35425h, str, vcn);
                        return copyOnWriteArrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f35415e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f35415e0.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f35426i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f35415e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f35415e0.get(strM))) {
                    str = f35415e0.get(strM);
                }
                this.f35426i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f35422e = interVideoOutListener;
        this.f35423f = new h(this, interVideoOutListener, this.f35431o, this.f35425h, null);
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a aVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f35442z = str;
        if (this.f35423f == null) {
            aVar = this;
            aVar.f35423f = new h(aVar, null, this.f35431o, this.f35425h, null);
        } else {
            aVar = this;
        }
        if (aVar.f35423f != null && aVar.f35423f.a() == 1) {
            aVar.a(z10, cVarB);
            return;
        }
        aVar.f35418a0 = 1;
        if (aVar.f35423f != null && aVar.f35423f.a() == 3) {
            aVar.L = false;
        } else {
            aVar.L = true;
            if (aVar.f35423f != null) {
                aVar.f35423f.a(1);
            }
        }
        aVar.f35440x = z10;
        aVar.f35431o.removeMessages(1001001);
        aVar.O = false;
        aVar.N = false;
        aVar.P = false;
        aVar.Q = false;
        aVar.x();
        aVar.w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (aVar.f35436t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(aVar.l, aVar.f35425h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(aVar.l, aVar.f35425h);
                }
            }
            if (aVar.f35437u && TextUtils.isEmpty(str)) {
                aVar.a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                aVar.b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f35425h);
            aVar.f35420c = cVarC;
            if (cVarC == null) {
                aVar.J = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(aVar.J, com.mbridge.msdk.foundation.controller.c.n().c(), aVar.f35425h, aVar.new C0164a());
                aVar.f35420c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f35425h, aVar.f35436t);
            }
            if (!TextUtils.isEmpty(aVar.l)) {
                aVar.f35420c.f(aVar.l);
            }
            int iN = aVar.f35420c.n() * 1000;
            if (aVar.f35431o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.t());
                    messageObtain.setData(bundle);
                }
                aVar.f35431o.sendMessageDelayed(messageObtain, iN);
            }
            aVar.I = aVar.f35420c.z();
            try {
                aVar.a(z10, str, cVarB);
            } catch (Exception e10) {
                if (aVar.f35423f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    aVar.f35423f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (aVar.f35423f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                aVar.f35423f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f35419b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f35417a, this.l, str);
                this.f35419b = cVar2;
                cVar2.d(this.f35436t);
                this.f35419b.e(this.f35437u);
            }
            this.f35419b.a(this.f35432p);
            this.f35419b.a(this.f35420c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f35437u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f35437u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                this.S = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.S.add(campaignEx);
            }
            a(this.S);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    public void b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(cVar);
        String str2 = cVarA.t() + "label_second";
        cVarA.i(str2);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str2, cVarA);
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f35419b;
            if (cVar2 == null || !this.f35425h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f35417a, this.l, this.f35425h);
                this.f35419b = cVar3;
                cVar3.d(this.f35436t);
                this.f35419b.e(this.f35437u);
            }
            if (this.f35436t) {
                this.f35419b.a(this.f35433q, this.f35434r, this.f35435s);
            }
            if (cVarA.o() != null && !cVarA.o().isEmpty()) {
                this.Z.put(cVarA.o().get(0).getId());
            }
            this.f35419b.a(this.f35432p);
            this.f35419b.a(this.f35420c);
            try {
                f fVar = new f(this.f35419b, this.G, z10, str, cVarA);
                this = this;
                fVar.a(this.F);
                this.f35427j.a(fVar);
                this.f35419b.a(this.f35427j);
                this.f35419b.a(1, this.Z.toString());
                this.f35419b.a(this.G, this.F, z10, str, this.f35441y, cVarA);
                this.f35431o.postDelayed(fVar, this.F * 1000);
            } catch (Exception e10) {
                e = e10;
                this = this;
                Exception exc = e;
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, exc.getMessage());
                cVarA.a(bVarA);
                cVarA.b(true);
                this.a(bVarA, cVarA);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", exc.getMessage());
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f35423f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f35423f.a("bidToken is empty", cVar);
        }
    }

    private boolean b() {
        if (this.f35419b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f35425h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f35419b.c(cVar.a());
                this.f35419b.b(cVar.d());
                if (this.f35419b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f35425h, cVar.a());
            }
        }
        return false;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f35440x) {
            if (z10) {
                this.f35440x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f35423f.b(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f35417a));
                if (eVarA != null && (listE = eVarA.e(this.f35425h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = cVar;
        if (this.f35423f != null) {
            if (!this.f35437u) {
                this.R = b(this.f35425h, cVar2.t());
                if (this.R) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("cache", 1);
                            cVar2.a("2000127", eVar);
                            cVar2.a("2000048", eVar);
                            cVar2.a(copyOnWriteArrayList);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f35423f.b(this.l, this.f35425h, cVar2);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f35423f.a(this.f35437u);
                        com.mbridge.msdk.reward.adapter.c cVar3 = this.f35419b;
                        if (cVar3 != null && cVar3.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f35423f.d(this.l, this.f35425h, cVar2);
                        } else {
                            a(copyOnWriteArrayList, this.f35419b);
                        }
                        if (this.L) {
                            com.mbridge.msdk.reward.adapter.c cVar4 = this.f35419b;
                            if (cVar4 != null) {
                                cVar4.c(this.S);
                            }
                            a(this.I, z10, str2, cVar2);
                            return;
                        }
                        return;
                    }
                    q0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f35425h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar5 = this.f35419b;
                    if (cVar5 != null) {
                        cVar5.c(this.S);
                    }
                    if (z10) {
                        if (this.f35423f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar2.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar2.b(true);
                            this.f35423f.a(strB, cVar2);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.f35423f.a(this.f35437u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                if (!c()) {
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar6 = this.f35419b;
                    if (cVar6 != null) {
                        cVar6.c(this.S);
                    }
                    this.f35423f.a(this.f35437u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                if (z10) {
                    if (this.f35423f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar2.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar2.b(true);
                        this.f35423f.a(strB2, cVar2);
                        return;
                    }
                    return;
                }
                this.R = false;
                com.mbridge.msdk.reward.adapter.c cVar7 = this.f35419b;
                if (cVar7 != null) {
                    cVar7.c(this.S);
                }
                this.f35423f.a(this.f35437u);
                a(this.I, z10, str2, cVar2);
                return;
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f35425h, 1, this.f35437u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = null;
            if (listB != null && listB.size() > 0) {
                if (!c()) {
                    if (this.f35419b == null) {
                        f();
                    }
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str2, listB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str2, cVar2);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f35425h, this.f35436t);
                        com.mbridge.msdk.foundation.cache.c cVar8 = new com.mbridge.msdk.foundation.cache.c();
                        try {
                            if (aVar.a(str2)) {
                                cVar8 = aVar.a(str2, cVar2, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f35419b);
                                if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.cache.c.l && cVar8.c() != null && cVar8.c().size() > 0 && this.f35419b != null) {
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar8.c();
                                    ArrayList arrayList = new ArrayList();
                                    for (CampaignEx campaignEx2 : listB) {
                                        if (campaignEx2 != null) {
                                            String requestId = campaignEx2.getRequestId();
                                            if (!TextUtils.isEmpty(requestId)) {
                                                for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                                    CampaignEx campaignEx3 = copyOnWriteArrayListC.get(i10);
                                                    if (campaignEx3 != null) {
                                                        if (requestId.equals(campaignEx3.getRequestId())) {
                                                            break;
                                                        } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                            arrayList.add(campaignEx2);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC.size() != 0) {
                                                    break;
                                                }
                                                arrayList.add(campaignEx2);
                                                break;
                                            }
                                        }
                                    }
                                    this.f35419b.c(arrayList);
                                    this.f35419b.a(cVar8.c(), false, true, true);
                                    copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar8.c());
                                }
                            } else {
                                copyOnWriteArrayListB = b(str2, listB);
                                if (copyOnWriteArrayListB.size() > 0) {
                                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                                }
                                cVar8.d("cb is closed");
                                cVar8.a(com.mbridge.msdk.foundation.cache.c.f33375k);
                            }
                            try {
                                aVar.a(cVar, str2, cVar8, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                                cVar2 = cVar;
                                str2 = str2;
                                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                                    a(copyOnWriteArrayListB, str2, cVar2);
                                    if (this.f35419b != null && !aVar.a(str2)) {
                                        this.f35419b.c(copyOnWriteArrayListB);
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                cVar2 = cVar;
                                str2 = str2;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("RewardVideoController", e.getMessage());
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            cVar2 = cVar;
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                    this.R = false;
                    this.f35423f.a(this.f35437u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f35425h, str2);
                if (!z10 || this.f35423f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar2 != null) {
                    cVar2.a(bVarA);
                    cVar2.b(true);
                }
                this.f35423f.a(strB3, cVar2);
                return;
            }
            if (!c()) {
                try {
                    com.mbridge.msdk.reward.candidate.a aVar2 = new com.mbridge.msdk.reward.candidate.a(this.f35425h, this.f35436t);
                    com.mbridge.msdk.foundation.cache.c cVar9 = new com.mbridge.msdk.foundation.cache.c();
                    try {
                        if (aVar2.a(str2)) {
                            if (this.f35419b == null) {
                                com.mbridge.msdk.reward.adapter.c cVar10 = new com.mbridge.msdk.reward.adapter.c(this.f35417a, this.l, this.f35425h);
                                this.f35419b = cVar10;
                                cVar10.d(this.f35436t);
                                this.f35419b.e(this.f35437u);
                                if (this.f35436t) {
                                    this.f35419b.a(this.f35433q, this.f35434r, this.f35435s);
                                }
                                this.f35419b.a(this.f35432p);
                                this.f35419b.a(this.f35420c);
                            }
                            cVar9 = aVar2.a(str2, cVar2, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f35419b);
                            if (cVar9 != null && cVar9.g() == com.mbridge.msdk.foundation.cache.c.l && cVar9.c() != null && cVar9.c().size() > 0 && this.f35419b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar9.c();
                                if (listB != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (CampaignEx campaignEx4 : listB) {
                                        if (campaignEx4 != null) {
                                            String requestId2 = campaignEx4.getRequestId();
                                            if (!TextUtils.isEmpty(requestId2)) {
                                                for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                                    CampaignEx campaignEx5 = copyOnWriteArrayListC2.get(i11);
                                                    if (campaignEx5 != null) {
                                                        if (requestId2.equals(campaignEx5.getRequestId())) {
                                                            break;
                                                        } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                            arrayList2.add(campaignEx4);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC2.size() != 0) {
                                                    break;
                                                }
                                                arrayList2.add(campaignEx4);
                                                break;
                                            }
                                        }
                                    }
                                    this.f35419b.c(arrayList2);
                                }
                                this.f35419b.a(cVar9.c(), false, true, true);
                                copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar9.c());
                            }
                        } else {
                            copyOnWriteArrayListB = b(str2, listB);
                            if (copyOnWriteArrayListB.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                            }
                            cVar9.d("cb is closed 2");
                            cVar9.a(com.mbridge.msdk.foundation.cache.c.f33375k);
                        }
                        try {
                            aVar2.a(cVar, str2, cVar9, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                            cVar2 = cVar;
                            str2 = str2;
                            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                                a(copyOnWriteArrayListB, str2, cVar2);
                                if (this.f35419b != null && !aVar2.a(str2)) {
                                    this.f35419b.c(copyOnWriteArrayListB);
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            cVar2 = cVar;
                            str2 = str2;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e.getMessage());
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        cVar2 = cVar;
                    }
                } catch (Exception e16) {
                    e = e16;
                }
                this.R = false;
                this.f35423f.a(this.f35437u);
                a(this.I, z10, str2, cVar2);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().b(this.f35425h, str2);
            if (!z10 || this.f35423f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar2 != null) {
                cVar2.a(bVarA2);
                cVar2.b(true);
            }
            this.f35423f.a(strB4, cVar2);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            q0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f35423f.a(this.f35437u);
        this.f35423f.b(this.l, this.f35425h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f35419b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f35423f.d(this.l, this.f35425h, cVar);
        } else {
            a(copyOnWriteArrayList, this.f35419b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f35417a, z10, nscpt, this.f35437u, this.f35436t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.l, this.f35425h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f35417a, campaignEx, this.l, this.f35425h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    private void a(Queue<Integer> queue, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a aVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2;
        Exception exc;
        com.mbridge.msdk.foundation.error.b bVarA;
        Integer numPoll;
        try {
            this.F = 25;
            this.G = 1;
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (numPoll = queue.poll()) != null) {
                        this.F = numPoll.intValue();
                    }
                } catch (Exception e10) {
                    exc = e10;
                    aVar = this;
                    cVar2 = cVar;
                    bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + exc.getMessage());
                    if (cVar2 != null) {
                        cVar2.a(bVarA);
                        cVar2.b(true);
                    }
                    aVar.a(bVarA, cVar2);
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", exc.getMessage());
                    }
                }
            }
            try {
                aVar = this;
                cVar2 = cVar;
                try {
                    aVar.a(this.G, this.F, z10, str, cVar2);
                } catch (Exception e11) {
                    e = e11;
                    Exception exc2 = e;
                    try {
                        com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + exc2.getMessage());
                        if (cVar2 != null) {
                            cVar2.a(bVarA2);
                            cVar2.b(true);
                        }
                        aVar.a(bVarA2, cVar2);
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", exc2.getMessage());
                        }
                    } catch (Exception e12) {
                        e = e12;
                        exc = e;
                        bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + exc.getMessage());
                        if (cVar2 != null) {
                            cVar2.a(bVarA);
                            cVar2.b(true);
                        }
                        aVar.a(bVarA, cVar2);
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", exc.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                e = e13;
                aVar = this;
                cVar2 = cVar;
            }
        } catch (Exception e14) {
            e = e14;
            aVar = this;
            cVar2 = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f35423f != null) {
            this.Q = true;
            this.f35423f.a(bVar, cVar);
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f35419b;
            if (cVar2 == null || !this.f35425h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f35417a, this.l, this.f35425h);
                this.f35419b = cVar3;
                cVar3.d(this.f35436t);
                this.f35419b.e(this.f35437u);
            }
            if (this.f35436t) {
                this.f35419b.a(this.f35433q, this.f35434r, this.f35435s);
            }
            this.H = new ArrayList();
            this.f35419b.a(this.f35432p);
            this.f35419b.a(this.f35420c);
            f fVar = new f(this.f35419b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f35419b, z10);
            this.f35427j = gVar;
            gVar.a(fVar);
            this.f35419b.a(this.f35427j);
            this.f35419b.a(0, "");
            this.f35419b.a(new j());
            this.f35419b.a(i10, i11, z10, str, this.f35441y, cVar);
            this.f35431o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.f35419b == null) {
                f();
            }
            if (this.f35419b != null) {
                q0.b("RewardVideoController", "controller 819");
                if (this.f35437u) {
                    zL = a(false);
                } else {
                    zL = this.f35419b.l();
                }
                C0164a c0164a = null;
                if (zL) {
                    q0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f35431o, c0164a);
                    f35416f0.put(this.f35425h, iVar);
                    this.f35419b.a(iVar, str, this.f35424g, this.f35432p, this.f35428k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f35437u) {
                    zM = b();
                } else {
                    zM = this.f35419b.m();
                }
                if (zM) {
                    q0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f35431o, c0164a);
                    f35416f0.put(this.f35425h, iVar2);
                    this.f35419b.a(iVar2, str, this.f35424g, this.f35432p, this.f35428k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f35422e, "can't show because load is failed");
            if (this.f35422e != null) {
                try {
                    this.f35422e.onShowFail(cVar, this.f35426i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f35436t || this.f35437u || (cVar3 = this.f35420c) == null || !cVar3.a(4) || this.f35423f == null || this.f35423f.a() == 1 || this.f35423f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f35422e, "show exception");
            if (this.f35422e != null) {
                try {
                    this.f35422e.onShowFail(cVar, this.f35426i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f35436t || this.f35437u || (cVar2 = this.f35420c) == null || !cVar2.a(4) || this.f35423f == null || this.f35423f.a() == 1 || this.f35423f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
        }
    }

    private boolean a(boolean z10) {
        if (this.f35419b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f35425h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (z10) {
                d("is_ready_ctir_false", "no effective campaign list");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.i(str);
                cVar.g(this.f35442z);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 8);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f35419b.h());
            }
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f35425h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d("is_ready_ctir_" + zA, "");
        }
        if (!zA) {
            for (com.mbridge.msdk.foundation.entity.c cVar2 : listA) {
                if (cVar2 != null) {
                    this.f35419b.c(cVar2.a());
                    this.f35419b.b(cVar2.d());
                    if (this.f35419b.b(z10)) {
                        cVar2.d();
                        return true;
                    }
                }
            }
        } else if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar3.i(str);
            a(zA, cVar3, this.f35419b.h());
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f35419b.c(cVar.a());
                this.f35419b.b(cVar.d());
                if (this.f35419b.l()) {
                    if (!z10) {
                        return true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    cVar2.i(cVar.d());
                    a(false, cVar2, (List<CampaignEx>) this.f35419b.h());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:160:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(String str, String str2, String str3, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.videocommon.setting.c cVar;
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        com.mbridge.msdk.videocommon.setting.c cVar4;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(eVar);
        try {
            this.f35429m = str;
            this.f35424g = str2;
            this.f35428k = str3;
            synchronized (this.D) {
                if (this.E) {
                    a("2000131", cVarA, this.f35422e, "campaing is show progressing ");
                    if (this.f35422e != null) {
                        try {
                            this.f35422e.onShowFail(cVarA, this.f35426i, "campaing is show progressing ");
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                    }
                    return;
                }
                this.E = true;
                Context context = this.f35417a;
                if (context == null) {
                    a("2000131", cVarA, this.f35422e, "context is null");
                    if (this.f35422e != null) {
                        try {
                            this.f35422e.onShowFail(cVarA, this.f35426i, "context is null");
                        } catch (Exception e11) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e11.getMessage());
                            }
                        }
                    }
                    if (!this.f35436t && !this.f35437u && (cVar4 = this.f35420c) != null && cVar4.a(4) && this.f35423f != null && this.f35423f.a() != 1 && this.f35423f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (this.f35436t && !v0.l(context) && s0.a().a("s_a_w_n_c", true)) {
                    a("2000131", cVarA, this.f35422e, "network exception");
                    if (this.f35422e != null) {
                        try {
                            this.f35422e.onShowFail(cVarA, this.f35426i, "network exception");
                        } catch (Exception e12) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e12.getMessage());
                            }
                        }
                    }
                    if (!this.f35436t && !this.f35437u && (cVar3 = this.f35420c) != null && cVar3.a(4) && this.f35423f != null && this.f35423f.a() != 1 && this.f35423f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (c()) {
                    a("2000131", cVarA, this.f35422e, "Play more than limit");
                    if (this.f35422e != null) {
                        try {
                            this.f35422e.onShowFail(cVarA, this.f35426i, "Play more than limit");
                        } catch (Exception e13) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e13.getMessage());
                            }
                        }
                    }
                    if (!this.f35436t && !this.f35437u && (cVar2 = this.f35420c) != null && cVar2.a(4) && this.f35423f != null && this.f35423f.a() != 1 && this.f35423f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
                    }
                    this.E = false;
                    return;
                }
                if (TextUtils.isEmpty(this.f35424g)) {
                    this.f35424g = com.mbridge.msdk.foundation.tools.g.d();
                }
                try {
                    String str4 = new SimpleDateFormat("dd").format(new Date());
                    String str5 = (String) y0.a(this.f35417a, "reward_date", "0");
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !str5.equals(str4)) {
                        y0.b(this.f35417a, "reward_date", str4);
                    }
                } catch (Exception e14) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e14.getMessage());
                    }
                }
                a(str, cVarA);
                return;
                this.E = false;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e.getLocalizedMessage());
                }
                a("2000131", cVarA, this.f35422e, "show exception");
                if (this.f35422e != null) {
                    try {
                        this.f35422e.onShowFail(cVarA, this.f35426i, "show exception");
                    } catch (Exception unused) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e.getMessage());
                        }
                    }
                }
                if (!this.f35436t || this.f35437u || (cVar = this.f35420c) == null || !cVar.a(4) || this.f35423f == null || this.f35423f.a() == 1 || this.f35423f.a() == 3) {
                    return;
                }
                a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f35425h, true, 1));
            }
        } catch (Exception e15) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e15.getLocalizedMessage());
            }
            a("2000131", cVarA, this.f35422e, "show exception");
            if (this.f35422e != null) {
                this.f35422e.onShowFail(cVarA, this.f35426i, "show exception");
            }
            if (this.f35436t) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CampaignEx campaignEx;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = null;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f35425h);
            String currentLocalRid = "";
            int i10 = 0;
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
            try {
                if (s0.a().a("a_u_a_c_f_s", false)) {
                    String simpleName = "null";
                    if (com.mbridge.msdk.foundation.controller.c.n() != null) {
                        Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
                        if (contextF instanceof Activity) {
                            Activity activity = (Activity) contextF;
                            simpleName = activity.getClass().getSimpleName();
                            if (activity.isFinishing()) {
                                i10 = 2;
                            } else {
                                i10 = activity.isDestroyed() ? 3 : 1;
                            }
                        }
                    }
                    eVar.a("context_status", Integer.valueOf(i10));
                    eVar.a("activity_name", simpleName);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            if (cVar2 != null) {
                cVar2.b(copyOnWriteArrayListB);
                cVar2.a("2000128", eVar);
                cVar2.i(currentLocalRid);
                cVar2.n(this.f35425h);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
                return cVar2;
            }
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            try {
                cVar.n(this.f35425h);
                eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                cVar.a("2000128", eVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    cVar.i(SameMD5.getMD5(v0.d()));
                } else {
                    cVar.i(currentLocalRid);
                    cVar.b(copyOnWriteArrayListB);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
                }
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
            } catch (Exception e11) {
                e = e11;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e.getMessage());
                }
            }
            return cVar;
        } catch (Exception e12) {
            e = e12;
            cVar = cVar2;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e.getMessage());
            }
            return cVar;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            this.H = list;
        } else {
            this.H = new ArrayList();
        }
    }

    private String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(v0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(v0.d()) : md5;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid"));
                } else {
                    cVarB = null;
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        } else {
            cVarB = null;
        }
        return cVarB == null ? new com.mbridge.msdk.foundation.same.report.metrics.c() : cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f35440x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:4:0x000e, B:6:0x0014, B:8:0x001b, B:12:0x0033, B:14:0x003d, B:17:0x0044, B:21:0x0070, B:23:0x0083, B:25:0x0091), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String nLRid;
        String str;
        int i10;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list == null) {
            str = "";
            if (TextUtils.isEmpty(localRequestId)) {
                return cVar;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
            eVar.a("auto_load", 2);
            cVar2.a("2000127", eVar);
            cVar2.a("2000048", eVar);
            if (this.f35436t) {
                i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            } else {
                i10 = 94;
            }
            cVar2.a(i10);
            cVar2.h("1");
            cVar2.f("2");
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
                return cVar2;
            }
        } else {
            try {
                if (list.size() <= 0) {
                    str = "";
                } else {
                    if (list.get(0) == null) {
                        nLRid = "";
                    } else {
                        localRequestId = list.get(0).getLocalRequestId();
                        nLRid = list.get(0).getNLRid();
                    }
                    cVar2.i(localRequestId);
                    cVar2.b(list);
                    str = localRequestId;
                    localRequestId = nLRid;
                }
                if (TextUtils.isEmpty(localRequestId)) {
                    return cVar;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("cache", 1);
                eVar2.a(CampaignEx.JSON_KEY_HB, 1);
                eVar2.a("auto_load", 2);
                cVar2.a("2000127", eVar2);
                cVar2.a("2000048", eVar2);
                if (this.f35436t) {
                    i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
                } else {
                    i10 = 94;
                }
                cVar2.a(i10);
                cVar2.h("1");
                cVar2.f("2");
                if (!TextUtils.isEmpty(str) && !com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(str)) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
                    return cVar2;
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
        return cVar2;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f35425h);
        cVar.a(this.f35436t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f35437u ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
