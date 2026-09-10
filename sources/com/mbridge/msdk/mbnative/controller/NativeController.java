package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.f2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.fid.Constants;
import d5.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f34613c0 = "NativeController";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static Map<String, Long> f34614d0 = new HashMap();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static boolean f34615e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<com.mbridge.msdk.mbnative.controller.c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, AdSession> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.m Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private AdSession f34616a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<Integer> f34617b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private AdEvents f34618b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Integer> f34619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Map<String, Object> f34620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.setting.k f34621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f34622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f34623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f34624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f34626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Queue<Integer> f34627k;
    private Queue<Long> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f34628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f34629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f34630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.click.a f34631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f34632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f34633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f34634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f34635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f34636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f34637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f34638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f34639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f34640y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34641z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativeListener.NativeAdListener f34643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34644c;

        public a(List list, NativeListener.NativeAdListener nativeAdListener, int i10) {
            this.f34642a = list;
            this.f34643b = nativeAdListener;
            this.f34644c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f34642a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f34642a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.f34642a;
            }
            NativeController.this.f34637v = true;
            this.f34643b.onAdLoaded(this.f34642a, this.f34644c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.f34624h, (List<Campaign>) this.f34642a, NativeController.this.f34625i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f34646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34648c;

        public b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.f34646a = aVar;
            this.f34647b = campaignEx;
            this.f34648c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34646a.a(this.f34647b, this.f34648c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f34651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f34652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f34653c;

        public d(long j10, o oVar, List list) {
            this.f34651a = j10;
            this.f34652b = oVar;
            this.f34653c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z10;
            if (System.currentTimeMillis() - this.f34651a >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                this.f34652b.a();
                NativeController.this.c();
                return;
            }
            int iS = m0.s(NativeController.this.f34624h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.f34652b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.f34652b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z10 = false;
                for (Campaign campaign : this.f34653c) {
                    String id2 = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sbI = u.i(id2);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sbI.append(campaignEx.getVideoUrlEncode());
                        sbI.append(campaignEx.getBidToken());
                        id2 = sbI.toString();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f34625i, id2);
                    if (aVarA != null && com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        z10 = true;
                    }
                }
                break loop0;
            }
            if (z10) {
                this.f34652b.a();
                NativeController.this.c();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f34655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34656b;

        public e(ImageView imageView, View view) {
            this.f34655a = imageView;
            this.f34656b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f34655a != null) {
                this.f34655a.setLayoutParams(new FrameLayout.LayoutParams(this.f34656b.getWidth(), this.f34656b.getHeight()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34658b;

        public f(CampaignEx campaignEx) {
            this.f34658b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f34658b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34660b;

        public g(CampaignEx campaignEx) {
            this.f34660b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f34660b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class i extends com.mbridge.msdk.widget.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34664b;

        public i(CampaignEx campaignEx) {
            this.f34664b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f34664b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class j implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0129a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f34666a;

        public j(s sVar) {
            this.f34666a = sVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0129a
        public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
            if (bVar != com.mbridge.msdk.foundation.same.task.a.b.FINISH || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.f34666a)) {
                return;
            }
            NativeController.this.F.remove(this.f34666a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class k implements com.mbridge.msdk.mbnative.controller.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34668a;

        public k(CampaignEx campaignEx) {
            this.f34668a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.c.d
        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.f34668a, NativeController.this.f34624h, NativeController.this.f34625i, NativeController.this.f34622f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f34672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f34673d;

        public l(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.f34670a = list;
            this.f34671b = i10;
            this.f34672c = aVar;
            this.f34673d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f34670a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f34672c, "has no ads", (CampaignEx) this.f34673d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f34671b, this.f34672c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f34677c;

        public m(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.f34675a = list;
            this.f34676b = i10;
            this.f34677c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f34675a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f34677c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f34676b, this.f34677c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f34680d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f34679c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f34681e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f34682f = null;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f34684a;

            public a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f34684a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f34684a, NativeController.this.f34624h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public n() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f34679c = z10;
        }

        public void b(boolean z10) {
            this.f34681e = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z10 = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f34624h));
            jVarA.d();
            Runnable runnable = this.f34680d;
            if (runnable != null) {
                NativeController.this.f34705a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f34634s, this.unitId);
                NativeController.this.f34635t = 0;
                return;
            }
            NativeController.this.f34630o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 2;
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.f34633r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(b())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b(), eVar, campaignUnit.getAds().get(0), this.unitId);
            int i11 = 0;
            while (i11 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                campaignEx.setLocalRequestId(cVarA.t());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z10);
                }
                if (NativeController.f34615e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zC = v0.c(NativeController.this.f34624h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.f34624h, campaignEx);
                if (i11 < NativeController.this.f34633r && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : i10);
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.f34624h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        v0.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f33737x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i11 < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || v0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.f34624h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i11++;
                z10 = true;
                i10 = 2;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a(this.unitId, arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f34634s, this.unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.unitId) || (num = com.mbridge.msdk.mbnative.controller.d.d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i12 = NativeController.this.f34635t + NativeController.this.f34633r;
            NativeController.this.f34635t = i12 <= iIntValue ? i12 : 0;
        }

        public void b(List<String> list) {
            this.f34682f = list;
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f34624h, cVar, new a(campaignEx, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            NativeController.this.U = true;
            if (this.f34679c) {
                if (NativeController.this.f34637v || !this.f34681e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i10 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f34634s, this.unitId);
                NativeController.this.f34635t = 0;
            }
            Runnable runnable = this.f34680d;
            if (runnable != null) {
                NativeController.this.f34705a.removeCallbacks(runnable);
            }
            if (NativeController.this.f34637v) {
                return;
            }
            if (a() == 1 || this.f34681e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.f34680d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.f34679c) {
                return;
            }
            Runnable runnable = this.f34680d;
            if (runnable != null) {
                NativeController.this.f34705a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f34622f != null) {
                    NativeController.this.f34637v = true;
                    NativeController.this.f34622f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f34622f != null) {
                        NativeController.this.f34637v = true;
                        NativeController.this.f34622f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f34615e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f34622f != null) {
                NativeController.this.f34622f.onAdFramesLoaded(list);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface o {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f34686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f34687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f34689d;

        public p(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str) {
            this.f34686a = i10;
            this.f34687b = dVar;
            this.f34688c = i11;
            this.f34689d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34687b.a(true);
            int i10 = this.f34686a;
            if (i10 == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.f34688c, this.f34689d, (CampaignEx) null);
            } else {
                if (i10 != 2) {
                    return;
                }
                if (!NativeController.this.f34637v || this.f34688c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.f34688c, this.f34689d, (CampaignEx) null);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f34691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CampaignEx f34692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f34693c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f34694d;

        public q(String str, CampaignEx campaignEx, boolean z10) {
            this.f34694d = true;
            this.f34691a = str;
            this.f34692b = campaignEx;
            this.f34694d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f34694d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f34693c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str, this.f34692b.getId(), this.f34691a, str2, "2");
                    nVar.n(this.f34692b.getRequestId());
                    nVar.k(this.f34692b.getCurrentLocalRid());
                    nVar.o(this.f34692b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f34692b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f34692b.getId());
                    }
                    CampaignEx campaignEx2 = this.f34692b;
                    if (campaignEx2 != null) {
                        nVar.a(campaignEx2.getAdSpaceT());
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f34691a, this.f34692b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f34694d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f34693c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f34692b.getId(), this.f34691a, "", "2");
                    CampaignEx campaignEx = this.f34692b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f34692b.getId());
                    }
                    CampaignEx campaignEx2 = this.f34692b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.o(this.f34692b.getRequestIdNotice());
                        nVar.k(this.f34692b.getCurrentLocalRid());
                        nVar.a(this.f34692b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f34691a, this.f34692b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class r extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f34695a;

        public r(NativeController nativeController) {
            this.f34695a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f34695a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f34629n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.f34695a;
                    NativeController nativeController2 = (weakReference2 == null || weakReference2.get() == null) ? null : this.f34695a.get();
                    if (nativeController2 != null) {
                        nativeController2.f34638w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.f34625i, nativeController2.f34633r, nativeController2.N);
                        if (nativeController2.f34637v) {
                            return;
                        }
                        nativeController2.c(listA);
                    }
                }
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class t implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f34701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CampaignEx f34702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f34703c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f34704d;

        public t(String str, CampaignEx campaignEx, boolean z10) {
            this.f34704d = true;
            this.f34701a = str;
            this.f34702b = campaignEx;
            this.f34704d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f34704d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f34703c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str2, this.f34702b.getId(), this.f34701a, str, "1");
                    CampaignEx campaignEx = this.f34702b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f34702b.getId());
                    }
                    CampaignEx campaignEx2 = this.f34702b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f34702b.getCurrentLocalRid());
                        nVar.o(this.f34702b.getRequestIdNotice());
                        nVar.a(this.f34702b.getAdSpaceT());
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f34701a, this.f34702b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f34704d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f34703c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f34702b.getId(), this.f34701a, "", "1");
                    CampaignEx campaignEx = this.f34702b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f34702b.getId());
                    }
                    CampaignEx campaignEx2 = this.f34702b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f34702b.getCurrentLocalRid());
                        nVar.o(this.f34702b.getRequestIdNotice());
                        nVar.a(this.f34702b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f34701a, this.f34702b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f34632q = 1;
        this.f34633r = 1;
        this.f34634s = -1;
        this.f34635t = 0;
        this.f34637v = false;
        this.f34638w = false;
        this.f34639x = false;
        this.f34640y = 0;
        this.f34641z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
        this.f34624h = context;
        this.f34620d = map;
        this.f34621e = new com.mbridge.msdk.setting.k();
        this.f34622f = aVar;
        this.f34623g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f34625i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f34626j = "";
        } else {
            this.f34626j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f34615e0 = ((Boolean) obj).booleanValue();
        }
        this.f34627k = new LinkedList();
        this.l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.f34624h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f34705a = new r(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f34636u = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f34625i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f34625i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (zEquals) {
                if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.f34625i)) {
                    Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f34625i);
                    if (num != null) {
                        this.f34633r = num.intValue();
                    }
                    if (map.containsKey("ad_num") && obj2 != null) {
                        int iIntValue2 = ((Integer) obj2).intValue();
                        this.f34640y = iIntValue2;
                        this.f34632q = iIntValue2;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                        int iIntValue3 = ((Integer) obj3).intValue();
                        this.f34641z = iIntValue3;
                        this.A = iIntValue3;
                    }
                }
            } else if (map.containsKey("ad_num") && obj2 != null) {
                try {
                    iIntValue = ((Integer) obj2).intValue();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(f34613c0, e10.getMessage());
                    }
                    iIntValue = 1;
                }
                iIntValue = iIntValue < 1 ? 1 : iIntValue;
                iIntValue = iIntValue > 10 ? 10 : iIntValue;
                this.f34633r = iIntValue;
                this.f34632q = iIntValue;
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.A = ((Integer) obj3).intValue();
                }
            } else if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                try {
                    this.A = ((Integer) obj3).intValue();
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(f34613c0, e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e12));
        }
        this.f34629n = new com.mbridge.msdk.foundation.same.report.h(this.f34624h);
        this.f34631p = new com.mbridge.msdk.click.a(this.f34624h, this.f34625i);
        try {
            int i10 = MBMediaView.f35024p0;
            this.L = true;
            Map<String, Object> map2 = this.f34620d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f34620d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f34624h, this.f34625i);
            o0.a();
            if (TextUtils.isEmpty(this.f34625i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f34624h)).d();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listA = a(this.f34625i, iA <= 0 ? this.f34632q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) listA.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.f34625i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f34625i);
                }
            }
        } catch (Throwable unused) {
            q0.b(f34613c0, "please import the nativex aar");
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.f34625i, campaignRemove, this.N);
                    q0.a(f34613c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() {
        try {
            if (this.f34628m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f34628m);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.f34628m = jSONArray.toString();
        } catch (JSONException e10) {
            q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.m h() {
        com.mbridge.msdk.setting.m mVarE = com.mbridge.msdk.setting.i.b().e("", this.f34625i);
        this.Q = mVarE;
        if (mVarE == null) {
            this.Q = com.mbridge.msdk.setting.m.i(this.f34625i);
        }
        return this.Q;
    }

    public String g() {
        return this.O;
    }

    public void i() {
        com.mbridge.msdk.foundation.same.task.a next;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, AdSession> hashtable = this.G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.G.clear();
        }
        Handler handler = this.f34705a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f34623g = null;
        this.f34631p.c();
        try {
            Context context = this.f34624h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<com.mbridge.msdk.mbnative.controller.c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (com.mbridge.msdk.mbnative.controller.c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f34705a.removeCallbacks(next);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.f34617b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f34627k;
            if (queue != null && queue.size() > 0) {
                this.f34627k.clear();
            }
            for (Integer num : this.f34617b) {
                Queue<Integer> queue2 = this.f34627k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f34619c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.l;
        if (queue3 != null && queue3.size() > 0) {
            this.l.clear();
        }
        for (Integer num2 : this.f34619c) {
            Queue<Long> queue4 = this.l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f35024p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.f34624h, this.f34625i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f34625i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(next.getImageUrl(), new c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.f34625i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.f34625i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        q0.b(f34613c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f34622f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionA = a(campaignEx);
            this.f34616a0 = adSessionA;
            if (adSessionA != null) {
                adSessionA.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f34616a0);
                this.f34618b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f34624h));
        jVarA.d();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (this.L && this.K) {
            if (h().m() == 3) {
                List<Campaign> listE = e(list);
                if (list.size() > 0) {
                    a(list, new l(listE, template, aVar, list));
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listB = b(list);
            if (listB != null && listB.size() > 0) {
                a(listB, new m(list, template, aVar));
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            return map.containsKey(MBridgeConstans.APP_ID) && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD) && map.get(MBridgeConstans.KEY_WORD) != null;
        } catch (Exception e10) {
            q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            return false;
        }
    }

    public void b(int i10, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.f34627k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.f34627k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.l.poll()) != null) {
                this.R = lPoll.longValue();
            }
            b(iIntValue, this.R, i10, str);
            return;
        }
        if (this.f34637v || (aVar = this.f34622f) == null) {
            return;
        }
        this.f34637v = true;
        aVar.onAdLoadError("no ad source");
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e10;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(TtmlNode.TAG_P);
                        if (TextUtils.isEmpty(strOptString)) {
                            continue;
                        } else {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    arrayList = arrayList2;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e10 = e12;
        }
        q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        return arrayList;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h implements com.mbridge.msdk.widget.dialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f34662a;

        public h(CampaignEx campaignEx) {
            this.f34662a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            NativeController.this.f34631p.a(this.f34662a, NativeController.this.f34622f);
            NativeController.this.b(this.f34662a);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class s extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CampaignEx f34696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<View> f34697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f34698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f34699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private WeakReference<AdSession> f34700e;

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f34696a = campaignEx;
            this.f34697b = new WeakReference<>(view);
            this.f34698c = new WeakReference<>(list);
            this.f34699d = new WeakReference<>(nativeController);
            this.f34700e = new WeakReference<>(adSession);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f34699d == null || (weakReference = this.f34697b) == null || this.f34698c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f34698c.get();
                NativeController nativeController = this.f34699d.get();
                WeakReference<AdSession> weakReference2 = this.f34700e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.f34696a, view, list, adSession);
            } catch (Exception e10) {
                q0.b(NativeController.f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }
    }

    public void b(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i11 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f34633r = this.H;
            } else {
                this.f34633r = this.f34632q;
            }
            if (c(a(i10, a(bVarA.a(this.f34625i, this.f34633r))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j10, i11, true, this.f34625i, str);
        } else if (i10 != 2) {
            a(i10, j10, i11, str);
        } else {
            a(2, j10, i11, str);
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        com.mbridge.msdk.setting.m mVarE = com.mbridge.msdk.setting.i.b().e("", str);
        this.Q = mVarE;
        if (mVarE == null) {
            this.Q = com.mbridge.msdk.setting.m.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.f34617b = listB;
        if (listB == null || listB.size() <= 0 || !this.f34617b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        NativeController nativeController;
        CampaignEx campaignEx2;
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        nativeController = this;
                        campaignEx2 = campaignEx;
                        try {
                            if (nativeController.a(this.f34631p, context, campaignEx2, this.f34625i, hVar)) {
                                return;
                            }
                            nativeController.b(campaignEx2);
                            nativeController.f34622f.onAdClick(campaignEx2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            q0.a(f34613c0, th.getMessage());
                            nativeController.f34631p.a(campaignEx2, nativeController.f34622f);
                            nativeController.b(campaignEx2);
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                nativeController = this;
                campaignEx2 = campaignEx;
            }
        }
        nativeController = this;
        campaignEx2 = campaignEx;
        nativeController.f34631p.a(campaignEx2, nativeController.f34622f);
        nativeController.b(campaignEx2);
    }

    private int a(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                        if (2 == jSONObject.optInt("id", 0)) {
                            return jSONObject.optInt("ad_num");
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
                return 0;
            }
        }
        return 0;
    }

    public void d() {
        o0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f34624h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public void a(String str, String str2) {
        this.f34621e.a(this.f34624h, str, str2, this.f34625i);
    }

    public void a(int i10, String str) {
        boolean zEquals = false;
        this.f34637v = false;
        this.f34638w = false;
        this.f34639x = false;
        this.U = false;
        this.N = str;
        this.f34622f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = f34614d0;
        if (map != null && map.size() > 0) {
            f34614d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f34625i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f34625i));
        }
        a(zEquals, i10);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    public void b(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i10 = MBMediaView.f35024p0;
                } catch (Throwable unused) {
                    cls = null;
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    private void a(boolean z10, int i10) {
        boolean zB;
        NativeController nativeController;
        int i11;
        if (z10 && i10 == 1 && a(i10)) {
            return;
        }
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String strC = com.mbridge.msdk.foundation.controller.c.n().c();
        if (this.f34620d.containsKey(MBridgeConstans.APP_ID) && this.f34620d.containsKey(MBridgeConstans.APP_KEY) && this.f34620d.containsKey(MBridgeConstans.KEY_WORD)) {
            strB = (String) this.f34620d.get(MBridgeConstans.APP_ID);
            strC = (String) this.f34620d.get(MBridgeConstans.APP_KEY);
        }
        a(strB, strC);
        com.mbridge.msdk.setting.m mVarE = com.mbridge.msdk.setting.i.b().e(strB, this.f34625i);
        this.Q = mVarE;
        if (mVarE == null) {
            this.Q = com.mbridge.msdk.setting.m.i(this.f34625i);
        }
        com.mbridge.msdk.mbnative.controller.d.d().put(this.f34625i, Integer.valueOf(this.Q.y() * this.f34633r));
        this.f34617b = this.Q.b();
        this.f34619c = this.Q.c();
        this.T = this.Q.f();
        this.S = this.Q.e();
        this.f34633r = this.f34632q;
        List<Integer> list = this.f34617b;
        if (list != null && list.size() != 0) {
            try {
                zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception unused) {
                zB = false;
            }
            if (!zB) {
                com.mbridge.msdk.mbnative.listener.a aVar = this.f34622f;
                if (aVar != null) {
                    aVar.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f34628m == null) {
                this.f34628m = (String) this.f34620d.get(MBridgeConstans.NATIVE_INFO);
                f();
            }
            if ((!this.f34617b.contains(1) || this.f34617b.get(0).intValue() == 1) && i10 == 0 && c(a(this.f34625i, this.f34633r, this.N))) {
                return;
            }
            this.X = true;
            if (this.f34617b.contains(1) && i10 == 0 && this.f34617b.get(0).intValue() != 1) {
                int iIntValue = this.f34617b.get(0).intValue();
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
                if (iIntValue == 2 && this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f34633r = this.H;
                } else {
                    this.f34633r = this.f34632q;
                }
                if (bVarA != null && c(a(iIntValue, a(bVarA.a(this.f34625i, this.f34633r))))) {
                    return;
                }
                this.X = false;
                try {
                    nativeController = this;
                    i11 = i10;
                    try {
                        nativeController.a(this.f34619c.get(this.f34617b.indexOf(1)).intValue() * 1000, i11, false, this.f34625i, this.N);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    nativeController = this;
                    i11 = i10;
                }
            } else {
                nativeController = this;
                i11 = i10;
            }
            nativeController.f34705a.sendEmptyMessageDelayed(1, nativeController.Q.K() * 1000);
            nativeController.j();
            nativeController.b(i11, nativeController.N);
            return;
        }
        com.mbridge.msdk.mbnative.listener.a aVar2 = this.f34622f;
        if (aVar2 != null) {
            this.f34637v = true;
            aVar2.onAdLoadError("do not have sorceList");
        }
    }

    public NativeController() {
        this.f34632q = 1;
        this.f34633r = 1;
        this.f34634s = -1;
        this.f34635t = 0;
        this.f34637v = false;
        this.f34638w = false;
        this.f34639x = false;
        this.f34640y = 0;
        this.f34641z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
    }

    public boolean a(int i10) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i11 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f34625i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f34625i))) {
            Map<String, Map<Long, Object>> mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map<Long, Object> map = mapF.get(i10 + "_" + this.f34625i);
            Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f34625i);
            com.mbridge.msdk.setting.g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
            if (num != null) {
                this.f34633r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarI == null) {
                    gVarI = com.mbridge.msdk.setting.i.b().a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarI.c0() * 1000) {
                    mapF.remove(i10 + "_" + this.f34625i);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f34622f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i10 + "_" + this.f34625i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f34641z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i11 >= this.A) {
                                arrayList.add(frame);
                            }
                            i11++;
                        }
                        map.put(next, arrayList);
                        mapF.put(i10 + "_" + this.f34625i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f34628m)) {
                                iMin = Math.min(this.f34640y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f34628m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i12);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    q0.b(f34613c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i11 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i11++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f34640y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i11 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i11++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f34627k;
        if ((queue != null && queue.size() <= 0) || this.f34627k == null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f34622f;
            if (aVar == null || this.f34637v) {
                return;
            }
            this.f34637v = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i10, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public synchronized void a(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            try {
                if (this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f34633r = Math.max(this.V, this.W);
                }
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (bVarA != null && c(a(1, a(bVarA.a(this.f34625i, this.f34633r))))) {
                        return;
                    }
                    n nVar = this.J;
                    if (nVar != null && !this.U) {
                        nVar.b(true);
                    }
                    if (this.U && !this.f34637v) {
                        a("mb load failed", i11, str, (CampaignEx) null);
                    }
                    if (!this.X) {
                        return;
                    }
                }
                int i12 = this.f34634s;
                if (i12 == -1) {
                    this.f34634s = i10;
                } else if (i12 != i10) {
                    this.f34635t = 0;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f34624h)).d();
                com.mbridge.msdk.mbnative.service.net.a aVar = new com.mbridge.msdk.mbnative.service.net.a(this.f34624h);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                Map<String, Object> map = this.f34620d;
                if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f34620d.containsKey(MBridgeConstans.APP_KEY) && this.f34620d.containsKey(MBridgeConstans.KEY_WORD) && this.f34620d.get(MBridgeConstans.KEY_WORD) != null) {
                    if (this.f34620d.get(MBridgeConstans.APP_ID) instanceof String) {
                        strB = (String) this.f34620d.get(MBridgeConstans.APP_ID);
                    }
                    if (this.f34620d.get(MBridgeConstans.APP_KEY) instanceof String) {
                        strC = (String) this.f34620d.get(MBridgeConstans.APP_KEY);
                    }
                    String str2 = this.f34620d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f34620d.get(MBridgeConstans.KEY_WORD) : null;
                    if (!TextUtils.isEmpty(str2)) {
                        eVar.a("smart", k0.b(str2));
                    }
                }
                eVar.a(MBridgeConstans.APP_ID, strB);
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f34625i);
                if (!TextUtils.isEmpty(this.f34626j)) {
                    eVar.a(MBridgeConstans.PLACEMENT_ID, this.f34626j);
                }
                eVar.a("req_type", "2");
                if (!TextUtils.isEmpty(this.f34636u)) {
                    eVar.a("category", this.f34636u);
                }
                eVar.a("sign", SameMD5.getMD5(strB + strC));
                if (this.T > 0 && i11 == 0) {
                    eVar.a("ad_num", this.T + "");
                } else {
                    eVar.a("ad_num", this.f34632q + "");
                }
                String strD = v0.d(this.f34625i);
                if (!TextUtils.isEmpty(strD)) {
                    eVar.a("j", strD);
                }
                eVar.a("only_impression", "1");
                eVar.a("ping_mode", "1");
                if (this.A != 0) {
                    eVar.a("frame_num", this.A + "");
                }
                if (!TextUtils.isEmpty(this.f34628m)) {
                    eVar.a(MBridgeConstans.NATIVE_INFO, this.f34628m);
                    if (i10 == 1) {
                        eVar.a("tnum", this.H + "");
                    }
                } else if (i10 == 1) {
                    eVar.a("tnum", this.f34632q + "");
                }
                a(eVar, i10);
                String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f34625i, IronSourceConstants.EVENTS_NATIVE);
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
                }
                if (this.f34620d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                    eVar.a("video_width", ((Integer) this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f34620d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                    eVar.a("video_height", ((Integer) this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                if (this.f34620d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                    ((Boolean) this.f34620d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).getClass();
                }
                eVar.a("video_version", "2.0");
                if (com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    com.mbridge.msdk.setting.i.b().a();
                }
                if (!b(this.f34620d)) {
                    JSONArray jSONArrayB = v0.b(this.f34624h, this.f34625i);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h, v0.a(jSONArrayB));
                    }
                }
                if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f34625i) && com.mbridge.msdk.mbnative.controller.d.g().get(this.f34625i).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.f34625i) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.e().get(this.f34625i)) != null) {
                    if (i10 == 1) {
                        this.f34635t = kVar.a();
                    } else if (i10 == 2) {
                        this.f34635t = kVar.b();
                    }
                }
                eVar.a("offset", this.f34635t + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                if (!TextUtils.isEmpty(this.f34630o)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f33884i, this.f34630o);
                }
                n nVar2 = new n();
                nVar2.b(a(this.f34620d));
                nVar2.setUnitId(this.f34625i);
                nVar2.setPlacementId(this.f34626j);
                nVar2.setAdType(42);
                nVar2.b(true);
                p pVar = new p(1, nVar2, i11, str);
                nVar2.a(pVar);
                nVar2.a(i11);
                nVar2.a(str);
                if (i11 == 0) {
                    if (!TextUtils.isEmpty(str)) {
                        eVar.a("token", str);
                    }
                    aVar.choiceV3OrV5BySetting(1, eVar, nVar2, str, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
                }
                if (i11 == 1) {
                    aVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f33848b0, eVar, nVar2, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
                }
                this.f34705a.postDelayed(pVar, j10);
            } catch (Exception e10) {
                String str3 = f34613c0;
                q0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e10));
                q0.b(str3, e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f34625i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                imageView.setTag("mb_wm");
                v0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.f34616a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f34623g;
            if (nativeTrackingListener != null) {
                this.f34631p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f34625i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i10 = MBMediaView.f35024p0;
            } catch (Throwable unused) {
                cls = null;
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f34625i, campaignEx, IronSourceConstants.EVENTS_NATIVE);
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    b1.a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f34613c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f34613c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f34623g;
            if (nativeTrackingListener != null) {
                this.f34631p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f34625i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f34625i, campaignEx, IronSourceConstants.EVENTS_NATIVE);
            b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            View.OnClickListener iVar = new i(campaignEx);
            try {
                int i10 = MBMediaView.f35024p0;
                a(campaignEx, view, iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(campaignEx, view, iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            q0.c(f34613c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f34613c0, "registerview exception!");
        }
    }

    private AdSession a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.G.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.omsdk.b.a(this.f34624h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f34625i, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.G.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSessionA;
        try {
            if (this.f34624h == null || campaignEx == null) {
                adSessionA = null;
            } else {
                adSessionA = a(campaignEx);
                if (adSessionA != null) {
                    adSessionA.registerAdView(view);
                    adSessionA.start();
                }
            }
            AdSession adSession = adSessionA;
            com.mbridge.msdk.setting.m mVar = this.Q;
            int iS = mVar != null ? mVar.s() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                iS = 0;
            }
            s sVar = new s(campaignEx, view, list, this, adSession);
            if (this.F == null) {
                this.F = new CopyOnWriteArrayList<>();
            }
            this.F.add(sVar);
            sVar.setOnStateChangeListener(new j(sVar));
            Handler handler = this.f34705a;
            if (handler != null) {
                handler.postDelayed(sVar, iS * 1000);
            }
        } catch (Exception e10) {
            q0.b(f34613c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    private void a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(campaignEx, viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<com.mbridge.msdk.mbnative.controller.c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            AdEvents adEvents = this.f34618b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    public List<Campaign> a(String str, int i10, String str2) {
        int i11;
        int i12;
        List<Campaign> listA = null;
        if (this.f34617b != null) {
            ArrayList arrayList = new ArrayList(this.f34617b);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i13)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i12 = this.H;
                    } else {
                        i12 = this.f34632q;
                    }
                    listA = a(((Integer) arrayList.get(i13)).intValue(), bVarA.a(str, i12));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA2 = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i14)).intValue());
                    if ((((Integer) arrayList.get(i14)).intValue() == 1 || ((Integer) arrayList.get(i14)).intValue() == 2) && this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.H;
                    } else {
                        i11 = this.f34632q;
                    }
                    listA = a(((Integer) arrayList.get(i14)).intValue(), bVarA2.b(str, i11));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i10, NativeListener.NativeAdListener nativeAdListener) {
        this.f34705a.post(new a(list, nativeAdListener, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        this.f34705a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 == 1 && this.f34620d.containsKey(MBridgeConstans.NATIVE_INFO) && list != null && list.size() > 0) {
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            int template = campaignEx != null ? campaignEx.getTemplate() : 1;
            if (template == 2) {
                int size = list.size();
                int i11 = this.V;
                if (size >= i11) {
                    return list.subList(0, i11);
                }
            } else if (template == 3) {
                int size2 = list.size();
                int i12 = this.W;
                if (size2 >= i12) {
                    return list.subList(0, i12);
                }
            }
        }
        return list;
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z10) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id2 = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder sbI = u.i(id2);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sbI.append(campaignEx.getVideoUrlEncode());
                    sbI.append(campaignEx.getBidToken());
                    id2 = sbI.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f34625i, id2);
                if (z10) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f34625i, list.remove(size), this.N);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f34625i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx.getBidToken(), this.N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }
}
